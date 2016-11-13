package org.graviton.network.game.protocol;

/**
 * Created by Botan on 05/11/2016 : 00:48
 */
public class GameProtocol {

    public static String helloGameMessage() {
        return "HG";
    }

    public static String accountTicketSuccessMessage(String key) {
        return "ATK".concat(key);
    }

    public static String accountTicketErrorMessage() {
        return "ATE";
    }

    public static String requestRegionalVersionMessage() {
        return "AVO";
    }

    public static String getQueuePositionMessage() {
        return "Af1|1|1|1|1";
    }

    public static String playerNameSuggestionSuccessMessage(String name) {
        return "APK" + name;
    }

    public static String playerDeleteFailedMessage() {
        return "ADE";
    }

    public static String gameCreationSuccessMessage() {
        return "GCK|1|";
    }

    public static String mapDataMessage(int id, String date, String key) {
        return "GDM|" + id + "|" + date + "|" + key;
    }

    public static String creatureChangeMapMessage(int id) {
        return "GA;2;" + id + ";";
    }

    public static String mapLoadedSuccessfullyMessage() {
        return "GDK";
    }

    public static String addCreatureOnMapMessage(String gm) {
        return "GM|+".concat(gm);
    }
}
