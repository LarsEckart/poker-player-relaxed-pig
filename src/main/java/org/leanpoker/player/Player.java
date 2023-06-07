package org.leanpoker.player;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class Player {

    private static final Logger log = getLogger(Player.class);

    static final String VERSION = "log current buy in and in action and bet";

    public static int betRequest(JsonNode request) {
        int currentBuyIn = request.get("current_buy_in").asInt();
        log.info("current_buy_in: " + currentBuyIn);
        int inAction = request.get("in_action").asInt();
        log.info("in_action: " + inAction);
        int currentBet = request.get("players").get(inAction).get("bet").asInt();
        log.info("current_bet: " + currentBet);
        return 0;
    }

    public static void showdown(JsonNode game) {
    }
}
