package com.nighthawksurvival.lib.id;

import java.util.Random;

/**
 * NoneVale
 * 8/10/2015
 * NSLib
 */
public class NSID {


    private static String nsid;
    private static String name;
    private static NSID getid;
    private IDType type;

    public NSID(IDType type) {
        this.type = type;
    }


    public void creation() {
        String p1 = "";

        switch (type) {
            case BOT:
                p1 = "bot";
                break;
            case RACE:
                p1 = "race";
                break;
            case PLAYER:
                p1 = "player";
                break;
            case GUILD:
                p1 = "guild";
                break;
        }

        Random random = new Random();
        int i1 = random.nextInt(8) + 1;
        int i2 = random.nextInt(8) + 1;
        int i3 = random.nextInt(8) + 1;
        int i4 = random.nextInt(8) + 1;
        int i5 = random.nextInt(8) + 1;
        int i6 = random.nextInt(8) + 1;
        int i7 = random.nextInt(8) + 1;
        int i8 = random.nextInt(8) + 1;
        int i9 = random.nextInt(8) + 1;
        int i10 = random.nextInt(8) + 1;
        int i11 = random.nextInt(8) + 1;
        int i12 = random.nextInt(8) + 1;
        int i13 = random.nextInt(8) + 1;
        int i14 = random.nextInt(8) + 1;
        String let;
        Random letter = new Random();
        int amount = letter.nextInt(7);
        switch (amount) {

            case 0:
                let = "a";
                break;
            case 1:
                let = "b";
                break;
            case 2:
                let = "c";
                break;
            case 3:
                let = "d";
                break;
            case 4:
                let = "e";
                break;
            case 5:
                let = "f";
                break;
            default:
                let = "ns";
                break;
        }
        String p2 = String.valueOf(i1) + String.valueOf(i2) + String.valueOf(i3) + String.valueOf(i4);
        String p3 = String.valueOf(i5) + String.valueOf(i6) + String.valueOf(i7) + String.valueOf(i8) + String.valueOf(i9)
                + String.valueOf(i10) + String.valueOf(i11);
        String p4 = String.valueOf(i12) + String.valueOf(i13) + String.valueOf(i14) + let;
        String id = p1 + "-" + p2 + "-" + p3 + "-" + p4;
        nsid = id;
    }

    public String getID() {
        return nsid;
    }
}
