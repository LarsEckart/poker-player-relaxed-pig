package org.leanpoker.player;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class Player {

    private static final Logger log = getLogger(Player.class);

    static final String VERSION = "log everything to know what to raise";

    public static int betRequest(JsonNode request) {
        int currentBuyIn = request.get("current_buy_in").asInt();
        log.info("current_buy_in: " + currentBuyIn);
        int inAction = request.get("in_action").asInt();
        log.info("in_action: " + inAction);
        int currentBet = request.get("players").get(inAction).get("bet").asInt();
        log.info("current_bet: " + currentBet);
        int minimumRaise = request.get("minimum_raise").asInt();
        log.info("minimum_raise: " + minimumRaise);

        log.info("to raise we have to bet " + (currentBuyIn - currentBet + minimumRaise));
        return 0;
    }

    public static void showdown(JsonNode game) {
    }
}
