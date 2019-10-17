package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RPSLSpockTest {

    @Test
    public void isValidPick() {
        RPSLSpock rpslspock = new RPSLSpock();

        Assert.assertTrue(rpslspock.isValidPick("rOck"));
        Assert.assertTrue(rpslspock.isValidPick("SpOcK"));
        Assert.assertTrue(rpslspock.isValidPick("Lizard"));
        Assert.assertTrue(rpslspock.isValidPick("Scissors"));
        Assert.assertTrue(rpslspock.isValidPick("Paper"));
        Assert.assertFalse(rpslspock.isValidPick(null));
        Assert.assertFalse(rpslspock.isValidPick("Pape"));
    }

    @Test
    public void generatePick() {
        RPSLSpock rpslspock = new RPSLSpock();

        for (int i = 0; i<1000000; i++) {
            Assert.assertTrue(rpslspock.isValidPick(rpslspock.generatePick()));
        }
    }

    @Test
    public void isComputerWin() {
        RPSLSpock rpslspock = new RPSLSpock();

        Assert.assertTrue(rpslspock.isComputerWin("rock","sciSsors"));
        Assert.assertTrue(rpslspock.isComputerWin("rock","lizard"));
        Assert.assertTrue(rpslspock.isComputerWin("paper","Rock"));
        Assert.assertTrue(rpslspock.isComputerWin("paper","spock"));
        Assert.assertTrue(rpslspock.isComputerWin("scissors","paper"));
        Assert.assertTrue(rpslspock.isComputerWin("scissors","lizard"));
        Assert.assertTrue(rpslspock.isComputerWin("lizard","paper"));
        Assert.assertTrue(rpslspock.isComputerWin("lizard","spock"));
        Assert.assertTrue(rpslspock.isComputerWin("spock","rock"));
        Assert.assertTrue(rpslspock.isComputerWin("spock","scissors"));
        Assert.assertFalse(rpslspock.isComputerWin("paper","scissors"));
    }
}