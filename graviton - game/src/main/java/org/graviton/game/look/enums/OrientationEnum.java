package org.graviton.game.look.enums;

/**
 * Created by Botan on 19/11/2016 : 11:06
 */
public enum OrientationEnum {
    EAST,
    SOUTH_EAST,
    SOUTH,
    SOUTH_WEST,
    WEST,
    NORTH_WEST,
    NORTH,
    NORTH_EAST;

    public static final OrientationEnum[] ADJACENT = new OrientationEnum[]{
            SOUTH_EAST,
            SOUTH_WEST,
            NORTH_WEST,
            NORTH_EAST
    };

    public static final OrientationEnum[] BASIC = new OrientationEnum[]{
            EAST,
            SOUTH,
            NORTH,
            WEST
    };

    public static OrientationEnum valueOf(byte ordinal) {
        return values()[ordinal];
    }

    public static OrientationEnum random() {
        return values()[(int) (System.currentTimeMillis() % (OrientationEnum.values().length - 1))];
    }

    public OrientationEnum next() {
        return valueOf((byte) (ordinal() + 1));
    }

    public OrientationEnum previous() {
        return valueOf((byte) (ordinal() - 1));
    }
}