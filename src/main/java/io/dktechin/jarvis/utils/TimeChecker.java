package io.dktechin.jarvis.utils;

/**
 * AOP로 만들기.
 * List로 만들기.
 *
 * 구간 반복?
 */


import java.time.LocalTime;

/**
 * Refactoring interface
 */
public class TimeChecker {

    private static int ONE_SECOND = 1000;

    private long start;

    private long end;

    public long checkedStart() {
        return start = System.currentTimeMillis();
    }

    public long check() {
        return end = System.currentTimeMillis();
    }

    public long executionTimeMillis() {
        return end - start;
    }

    public long secutionTimeSecond() {
        return executionTimeMillis() / ONE_SECOND;
    }

    public LocalTime executionTime() {
        return LocalTime.ofNanoOfDay(executionTimeMillis());
    }
}
