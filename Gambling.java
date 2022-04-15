package com.bridgelabz;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Gambling {
    static Logger logger = Logger.getLogger(Gambling.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        logger.info("welcome to Gambler Stimulator");
        logger.info("gambler has the total money of around $100 ");
        int total_money=100;
        int bet = 1;
        //gambler bet results either win or loose
        int z = (int)((Math.random()*10)%2);
        logger.info(z);
    }
}
