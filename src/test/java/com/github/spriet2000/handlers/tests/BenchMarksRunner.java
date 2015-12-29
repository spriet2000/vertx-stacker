package com.github.spriet2000.handlers.tests;

import org.openjdk.jmh.profile.StackProfiler;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;

public class BenchMarksRunner {

    public static void main(String... args) throws IOException, RunnerException {
        Options opt = new OptionsBuilder()
                .include(".*" + BenchMark1.class.getSimpleName() + ".*")
                .addProfiler(StackProfiler.class)
                .forks(1)
                .build();
        new Runner(opt).run();
    }
}