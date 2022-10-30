package com.juaracoding.rizkimaulana.utils;

public enum TestScenarios {

        T1("User valid login"),
        T2("User invalid login"),
        T3("Add Cart function"),
        T4("Checkout product function");

        private String testName;

        TestScenarios(String value) {
            testName = value;
        }

        public String getTestName() {
            return testName;
        }

    }
