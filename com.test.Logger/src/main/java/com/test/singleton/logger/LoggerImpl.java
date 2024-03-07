package com.test.singleton.logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.springframework.boot.logging.LogLevel;

public class LoggerImpl implements Logger {

	private static LoggerImpl LOGGER = null;
	private static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	private static Lock readLock = readWriteLock.readLock();
	private String filePath;

	private PrintWriter out = null;

	private LoggerImpl() {

	}

	@Override
	public void log(LogLevel level, String message) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ssZ");
		if (Objects.nonNull(out)) {
			out.println(new StringBuilder(format.format(date)).append(" ").append(level.name().toString()).append(" ")
					.append(message).toString());
		} else {
			throw new IllegalStateException();
		}
	}

	@Override
	public synchronized void setLogFile(String filePath) {
		this.filePath = filePath;
		File file = new File(filePath);
		if (!file.exists()) {
			file.mkdirs();
		}
		if (file.exists()) {
			try {
				out = new PrintWriter(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getLogFile() {
		return filePath;

	}

	@Override
	public void flush() {
		if (Objects.nonNull(out)) {
			out.flush();
		}
	}

	@Override
	public void close() {
		if (Objects.nonNull(out)) {
			out.close();
			out = null;
		}
		else {
			throw new IllegalStateException();
		}
	}

	public static Logger getInstance() {
		if (Objects.isNull(LOGGER)) {
			readLock.lock();
			if (Objects.isNull(LOGGER)) {
				LOGGER = new LoggerImpl();
			}
			readLock.unlock();
		}
		return LOGGER;
	}

	public static void resetInstance() {
		LOGGER = null;

	}
}