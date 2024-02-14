package com.baram.dao;

import com.baram.dto.ChakDTO;

import java.util.ArrayList;

public class ChakDAO {

    public static ArrayList<ChakDTO> list;

    static {
        list=new ArrayList<ChakDTO>();
    }

    public static void load() {

        ChakDTO h1 = new ChakDTO();
        h1.setName("투구");
        h1.setValue(10);
        h1.setpPent(15);
        list.add(h1);

        ChakDTO h2 = new ChakDTO();
        h2.setName("투구");
        h2.setValue(14);
        h2.setpPent(15);
        list.add(h2);

        ChakDTO h3 = new ChakDTO();
        h3.setName("투구");
        h3.setValue(14);
        h3.setpPent(15);
        list.add(h3);

        ChakDTO h4 = new ChakDTO();
        h4.setName("투구");
        h4.setValue(16);
        h4.setpPent(15);
        list.add(h4);

        ChakDTO h5 = new ChakDTO();
        h5.setName("투구");
        h5.setValue(14);
        h5.setpResis(15);
        list.add(h5);

        ChakDTO h6 = new ChakDTO();
        h6.setName("투구");
        h6.setValue(16);
        h6.setpResis(18);
        list.add(h6);

        ChakDTO h7 = new ChakDTO();
        h7.setName("투구");
        h7.setValue(19);
        h7.setpResis(30);
        list.add(h7);

        ChakDTO h8 = new ChakDTO();
        h8.setName("투구");
        h8.setValue(17);
        h8.setFatalPer(6);
        list.add(h8);

        ChakDTO h9 = new ChakDTO();
        h9.setName("투구");
        h9.setValue(18);
        h9.setPersonalDamagePer(3);
        list.add(h9);

        ChakDTO h10 = new ChakDTO();
        h10.setName("투구");
        h10.setValue(20);
        h10.setPersonalDefensePer(3);
        list.add(h10);

        ChakDTO w1 = new ChakDTO();
        w1.setName("무기");
        w1.setValue(10);
        w1.setpPent(15);
        list.add(w1);

        ChakDTO w2 = new ChakDTO();
        w2.setName("무기");
        w2.setValue(12);
        w2.setpPent(15);
        list.add(w2);

        ChakDTO w3 = new ChakDTO();
        w3.setName("무기");
        w3.setValue(14);
        w3.setpPent(15);
        list.add(w3);

        ChakDTO w4 = new ChakDTO();
        w4.setName("무기");
        w4.setValue(19);
        w4.setpPent(21);
        list.add(w4);

        ChakDTO w5 = new ChakDTO();
        w5.setName("무기");
        w5.setValue(12);
        w5.setpResis(15);
        list.add(w5);

        ChakDTO w6 = new ChakDTO();
        w6.setName("무기");
        w6.setValue(19);
        w6.setpResis(21);
        list.add(w6);

        ChakDTO w7 = new ChakDTO();
        w7.setName("무기");
        w7.setValue(19);
        w7.setpResis(30);
        list.add(w7);

        ChakDTO w8 = new ChakDTO();
        w8.setName("무기");
        w8.setValue(17);
        w8.setFatalPer(6);
        list.add(w8);

        ChakDTO w9 = new ChakDTO();
        w9.setName("무기");
        w9.setValue(18);
        w9.setPersonalDamagePer(3);
        list.add(w9);

        ChakDTO w10 = new ChakDTO();
        w10.setName("무기");
        w10.setValue(20);
        w10.setPersonalDefensePer(3);
        list.add(w10);

        ChakDTO a1 = new ChakDTO();
        a1.setName("갑옷");
        a1.setValue(9);
        a1.setpPent(9);
        list.add(a1);

        ChakDTO a2 = new ChakDTO();
        a2.setName("갑옷");
        a2.setValue(10);
        a2.setpPent(15);
        list.add(a2);

        ChakDTO a3 = new ChakDTO();
        a3.setName("갑옷");
        a3.setValue(14);
        a3.setpPent(15);
        list.add(a3);

        ChakDTO a4 = new ChakDTO();
        a4.setName("갑옷");
        a4.setValue(16);
        a4.setpPent(18);
        list.add(a4);

        ChakDTO a5 = new ChakDTO();
        a5.setName("갑옷");
        a5.setValue(9);
        a5.setpResis(9);
        list.add(a5);

        ChakDTO a6 = new ChakDTO();
        a6.setName("갑옷");
        a6.setValue(16);
        a6.setpResis(18);
        list.add(a6);

        ChakDTO a7 = new ChakDTO();
        a7.setName("갑옷");
        a7.setValue(19);
        a7.setpResis(30);
        list.add(a7);

        ChakDTO a8 = new ChakDTO();
        a8.setName("갑옷");
        a8.setValue(17);
        a8.setFatalPer(6);
        list.add(a8);

        ChakDTO a9 = new ChakDTO();
        a9.setName("갑옷");
        a9.setValue(18);
        a9.setPersonalDamagePer(3);
        list.add(a9);

        ChakDTO a10 = new ChakDTO();
        a10.setName("갑옷");
        a10.setValue(20);
        a10.setPersonalDefensePer(3);
        list.add(a10);

        ChakDTO s1 = new ChakDTO();
        s1.setName("신발");
        s1.setValue(10);
        s1.setpPent(15);
        list.add(s1);

        ChakDTO s2 = new ChakDTO();
        s2.setName("신발");
        s2.setValue(13);
        s2.setpPent(15);
        list.add(s2);

        ChakDTO s3 = new ChakDTO();
        s3.setName("신발");
        s3.setValue(14);
        s3.setpPent(15);
        list.add(s3);

        ChakDTO s4 = new ChakDTO();
        s4.setName("신발");
        s4.setValue(20);
        s4.setpPent(24);
        list.add(s4);

        ChakDTO s5 = new ChakDTO();
        s5.setName("신발");
        s5.setValue(13);
        s5.setpResis(15);
        list.add(s5);

        ChakDTO s6 = new ChakDTO();
        s6.setName("신발");
        s6.setValue(19);
        s6.setpResis(30);
        list.add(s6);

        ChakDTO s7 = new ChakDTO();
        s7.setName("신발");
        s7.setValue(20);
        s7.setpResis(24);
        list.add(s7);

        ChakDTO s8 = new ChakDTO();
        s8.setName("신발");
        s8.setValue(17);
        s8.setFatalPer(6);
        list.add(s8);

        ChakDTO s9 = new ChakDTO();
        s9.setName("신발");
        s9.setValue(18);
        s9.setPersonalDamagePer(3);
        list.add(s9);

        ChakDTO s10 = new ChakDTO();
        s10.setName("신발");
        s10.setValue(20);
        s10.setPersonalDefensePer(3);
        list.add(s10);

        ChakDTO c1 = new ChakDTO();
        c1.setName("망토");
        c1.setValue(10);
        c1.setpPent(15);
        list.add(c1);

        ChakDTO c2 = new ChakDTO();
        c2.setName("망토");
        c2.setValue(12);
        c2.setpPent(15);
        list.add(c2);

        ChakDTO c3 = new ChakDTO();
        c3.setName("망토");
        c3.setValue(14);
        c3.setpPent(15);
        list.add(c3);

        ChakDTO c4 = new ChakDTO();
        c4.setName("망토");
        c4.setValue(16);
        c4.setpPent(18);
        list.add(c4);

        ChakDTO c5 = new ChakDTO();
        c5.setName("망토");
        c5.setValue(12);
        c5.setpResis(15);
        list.add(c5);

        ChakDTO c6 = new ChakDTO();
        c6.setName("망토");
        c6.setValue(16);
        c6.setpResis(18);
        list.add(c6);

        ChakDTO c7 = new ChakDTO();
        c7.setName("망토");
        c7.setValue(19);
        c7.setpResis(30);
        list.add(c7);

        ChakDTO c8 = new ChakDTO();
        c8.setName("망토");
        c8.setValue(17);
        c8.setFatalPer(6);
        list.add(c8);

        ChakDTO c9 = new ChakDTO();
        c9.setName("망토");
        c9.setValue(18);
        c9.setPersonalDamagePer(3);
        list.add(c9);

        ChakDTO c10 = new ChakDTO();
        c10.setName("망토");
        c10.setValue(20);
        c10.setPersonalDefensePer(3);
        list.add(c10);

        ChakDTO n1 = new ChakDTO();
        n1.setName("목걸이");
        n1.setValue(10);
        n1.setpPent(15);
        list.add(n1);

        ChakDTO n2 = new ChakDTO();
        n2.setName("목걸이");
        n2.setValue(14);
        n2.setpPent(15);
        list.add(n2);

        ChakDTO n3 = new ChakDTO();
        n3.setName("목걸이");
        n3.setValue(14);
        n3.setpPent(15);
        list.add(n3);

        ChakDTO n4 = new ChakDTO();
        n4.setName("목걸이");
        n4.setValue(18);
        n4.setpPent(21);
        list.add(n4);

        ChakDTO n5 = new ChakDTO();
        n5.setName("목걸이");
        n5.setValue(14);
        n5.setpResis(15);
        list.add(n5);

        ChakDTO n6 = new ChakDTO();
        n6.setName("목걸이");
        n6.setValue(18);
        n6.setpResis(21);
        list.add(n6);

        ChakDTO n7 = new ChakDTO();
        n7.setName("목걸이");
        n7.setValue(19);
        n7.setpResis(30);
        list.add(n7);

        ChakDTO n8 = new ChakDTO();
        n8.setName("목걸이");
        n8.setValue(17);
        n8.setFatalPer(6);
        list.add(n8);

        ChakDTO n9 = new ChakDTO();
        n9.setName("목걸이");
        n9.setValue(18);
        n9.setPersonalDamagePer(3);
        list.add(n9);

        ChakDTO n10 = new ChakDTO();
        n10.setName("목걸이");
        n10.setValue(20);
        n10.setPersonalDefensePer(3);
        list.add(n10);

        ChakDTO r1_1 = new ChakDTO();
        r1_1.setName("반지1");
        r1_1.setValue(10);
        r1_1.setpPent(15);
        list.add(r1_1);

        ChakDTO r1_2 = new ChakDTO();
        r1_2.setName("반지1");
        r1_2.setValue(14);
        r1_2.setpPent(15);
        list.add(r1_2);

        ChakDTO r1_3 = new ChakDTO();
        r1_3.setName("반지1");
        r1_3.setValue(17);
        r1_3.setpPent(18);
        list.add(r1_3);

        ChakDTO r1_4 = new ChakDTO();
        r1_4.setName("반지1");
        r1_4.setValue(19);
        r1_4.setpPent(21);
        list.add(r1_4);

        ChakDTO r1_5 = new ChakDTO();
        r1_5.setName("반지1");
        r1_5.setValue(17);
        r1_5.setpResis(18);
        list.add(r1_5);

        ChakDTO r1_6 = new ChakDTO();
        r1_6.setName("반지1");
        r1_6.setValue(19);
        r1_6.setpResis(21);
        list.add(r1_6);

        ChakDTO r1_7 = new ChakDTO();
        r1_7.setName("반지1");
        r1_7.setValue(19);
        r1_7.setpResis(30);
        list.add(r1_7);

        ChakDTO r1_8 = new ChakDTO();
        r1_8.setName("반지");
        r1_8.setValue(17);
        r1_8.setFatalPer(6);
        list.add(r1_8);

        ChakDTO r1_9 = new ChakDTO();
        r1_9.setName("반지");
        r1_9.setValue(18);
        r1_9.setPersonalDamagePer(3);
        list.add(r1_9);

        ChakDTO r1_10 = new ChakDTO();
        r1_10.setName("반지");
        r1_10.setValue(20);
        r1_10.setPersonalDefensePer(3);
        list.add(r1_10);

        ChakDTO r2_1 = new ChakDTO();
        r2_1.setName("반지2");
        r2_1.setValue(10);
        r2_1.setpPent(15);
        list.add(r2_1);

        ChakDTO r2_2 = new ChakDTO();
        r2_2.setName("반지2");
        r2_2.setValue(14);
        r2_2.setpPent(15);
        list.add(r2_2);

        ChakDTO r2_3 = new ChakDTO();
        r2_3.setName("반지2");
        r2_3.setValue(17);
        r2_3.setpPent(18);
        list.add(r2_3);

        ChakDTO r2_4 = new ChakDTO();
        r2_4.setName("반지2");
        r2_4.setValue(19);
        r2_4.setpPent(21);
        list.add(r2_4);

        ChakDTO r2_5 = new ChakDTO();
        r2_5.setName("반지2");
        r2_5.setValue(17);
        r2_5.setpResis(18);
        list.add(r2_5);

        ChakDTO r2_6 = new ChakDTO();
        r2_6.setName("반지2");
        r2_6.setValue(19);
        r2_6.setpResis(21);
        list.add(r2_6);

        ChakDTO r2_7 = new ChakDTO();
        r2_7.setName("반지2");
        r2_7.setValue(19);
        r2_7.setpResis(30);
        list.add(r2_7);

        ChakDTO r2_8 = new ChakDTO();
        r2_8.setName("반지");
        r2_8.setValue(17);
        r2_8.setFatalPer(6);
        list.add(r2_8);

        ChakDTO r2_9 = new ChakDTO();
        r2_9.setName("반지");
        r2_9.setValue(18);
        r2_9.setPersonalDamagePer(3);
        list.add(r2_9);

        ChakDTO r2_10 = new ChakDTO();
        r2_10.setName("반지");
        r2_10.setValue(20);
        r2_10.setPersonalDefensePer(3);
        list.add(r2_10);

        ChakDTO b1_1 = new ChakDTO();
        b1_1.setName("보조1");
        b1_1.setValue(10);
        b1_1.setpPent(15);
        list.add(b1_1);

        ChakDTO b1_2 = new ChakDTO();
        b1_2.setName("보조1");
        b1_2.setValue(14);
        b1_2.setpPent(15);
        list.add(b1_2);

        ChakDTO b1_3 = new ChakDTO();
        b1_3.setName("보조1");
        b1_3.setValue(19);
        b1_3.setpPent(21);
        list.add(b1_3);

        ChakDTO b1_4 = new ChakDTO();
        b1_4.setName("보조1");
        b1_4.setValue(19);
        b1_4.setpResis(21);
        list.add(b1_4);

        ChakDTO b1_5 = new ChakDTO();
        b1_5.setName("보조1");
        b1_5.setValue(19);
        b1_5.setpResis(30);
        list.add(b1_5);

        ChakDTO b1_8 = new ChakDTO();
        b1_8.setName("보조");
        b1_8.setValue(17);
        b1_8.setFatalPer(6);
        list.add(b1_8);

        ChakDTO b1_9 = new ChakDTO();
        b1_9.setName("보조");
        b1_9.setValue(18);
        b1_9.setPersonalDamagePer(3);
        list.add(b1_9);

        ChakDTO b1_10 = new ChakDTO();
        b1_10.setName("보조");
        b1_10.setValue(20);
        b1_10.setPersonalDefensePer(3);
        list.add(b1_10);

        ChakDTO b2_1 = new ChakDTO();
        b2_1.setName("보조2");
        b2_1.setValue(10);
        b2_1.setpPent(15);
        list.add(b2_1);

        ChakDTO b2_2 = new ChakDTO();
        b2_2.setName("보조2");
        b2_2.setValue(14);
        b2_2.setpPent(15);
        list.add(b2_2);

        ChakDTO b2_3 = new ChakDTO();
        b2_3.setName("보조2");
        b2_3.setValue(19);
        b2_3.setpPent(21);
        list.add(b2_3);

        ChakDTO b2_4 = new ChakDTO();
        b2_4.setName("보조2");
        b2_4.setValue(19);
        b2_4.setpResis(21);
        list.add(b2_4);

        ChakDTO b2_5 = new ChakDTO();
        b2_5.setName("보조2");
        b2_5.setValue(19);
        b2_5.setpResis(30);
        list.add(b2_5);

        ChakDTO b2_8 = new ChakDTO();
        b2_8.setName("보조");
        b2_8.setValue(17);
        b2_8.setFatalPer(6);
        list.add(b2_8);

        ChakDTO b2_9 = new ChakDTO();
        b2_9.setName("보조");
        b2_9.setValue(18);
        b2_9.setPersonalDamagePer(3);
        list.add(b2_9);

        ChakDTO b2_10 = new ChakDTO();
        b2_10.setName("보조");
        b2_10.setValue(20);
        b2_10.setPersonalDefensePer(3);
        list.add(b2_10);



    }
}
