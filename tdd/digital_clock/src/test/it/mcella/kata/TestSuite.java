package it.mcella.kata;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    MainIT.class,
    MainTest.class,
    DigitsReaderTest.class,
    DigitsParserTest.class
})

public class TestSuite {   
}
