# ZIO Failing JUnit test repo

The goal of this repo is to show a small example of how a failing ZIO test is considered as ignored while integrated in a gradle project with `junit-vintage` engine.

This repo also contains a plain Junit 4 failing test to highlight the difference and clearly show that the issue is in the ZIO integration 

To reproduce it, just run `./gradlew clean test --info`