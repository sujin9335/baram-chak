package com.baram.view;

import com.baram.dao.ChakDAO;
import com.baram.dto.ChakDTO;

import java.util.*;

public class View {

    public static void view() {

        Scanner sc=new Scanner(System.in);

        System.out.print("호박단추 수: ");
        int ho=sc.nextInt();

        System.out.print("오색구슬 수: ");
        int bead=sc.nextInt();

        System.out.print("투구: ");
        int h=sc.nextInt();

        System.out.print("무기: ");
        int w=sc.nextInt();

        System.out.print("갑옷: ");
        int a=sc.nextInt();

        System.out.print("망토: ");
        int c=sc.nextInt();

        System.out.print("신발: ");
        int s=sc.nextInt();

        System.out.print("목걸이: ");
        int n=sc.nextInt();

        System.out.print("반지1: ");
        int r1=sc.nextInt();

        System.out.print("반지2: ");
        int r2=sc.nextInt();

        System.out.print("보조1: ");
        int b1=sc.nextInt();

        System.out.print("보조2: ");
        int b2=sc.nextInt();


        //데이터 로드
        ChakDAO.load();


        Iterator<ChakDTO> it=ChakDAO.list.iterator();
        while(it.hasNext()){
            ChakDTO temp=it.next();
            if(temp.getName().equals("투구") && temp.getValue() > h){
                it.remove();
            }
            if(temp.getName().equals("무기") && temp.getValue() > w){
                it.remove();
            }
            if(temp.getName().equals("갑옷") && temp.getValue() > a){
                it.remove();
            }
            if(temp.getName().equals("망토") && temp.getValue() > c){
                it.remove();
            }
            if(temp.getName().equals("신발") && temp.getValue() > s){
                it.remove();
            }
            if(temp.getName().equals("목걸이") && temp.getValue() > n){
                it.remove();
            }
            if(temp.getName().equals("반지1") && temp.getValue() > r1){
                it.remove();
            }
            if(temp.getName().equals("반지2") && temp.getValue() > r2){
                it.remove();
            }
            if(temp.getName().equals("보조1") && temp.getValue() > b1){
                it.remove();
            }
            if(temp.getName().equals("보조2") && temp.getValue() > b2){
                it.remove();
            }
        }


        //데이터 피저, 피저관 나우고 깊은 복사
        ArrayList<ChakDTO> rPentList=new ArrayList<ChakDTO>();
        rPentList.addAll(ChakDAO.list);
        ArrayList<ChakDTO> rResisList=new ArrayList<ChakDTO>();
        rResisList.addAll(ChakDAO.list);

        //데이터 내림차순 정리
        Collections.sort(rPentList, Comparator.comparingInt(ChakDTO::getpPent).reversed());
        Collections.sort(rResisList, Comparator.comparingInt(ChakDTO::getpResis).reversed());

        //불필요 데이터 삭제
        it=rPentList.iterator();
        while(it.hasNext()){
            if(it.next().getpPent() == 0){
                it.remove();
            }
        }

        it=rResisList.iterator();
        while(it.hasNext()){
            if(it.next().getpResis() == 0){
                it.remove();
            }
        }

        ArrayList<ChakDTO> check=new ArrayList<>();

        //총 피저 피저관 수
        int totalpPent=0;
        int totalpResis=0;

        int printCount=1;//구분선 출력
        int temp=0;
        for(int i=0; i<rPentList.size(); i++) {

            int jCount=0;
            jCount=jCount+temp;//출력한 인덱스(temp) 추가하여 출력한것 이후 시작

            if((ho >= 500 && bead < 400) || (ho < 500 && bead < 500)) {
                System.out.println("종료");
                return;
            }

            //피저 먼저 돌려서 피저 높은것 먼저 출력(temp++ 해서 이전 index무시)
            while(jCount < rResisList.size()) {
                if(rPentList.get(i).getpPent() < rResisList.get(jCount).getpResis()){
                    //호박구슬 카운트

                    if (bead < 1500) {
                        if(ho >= 500) {
                            if (bead >= 900) {
                                bead=bead-900;
                                ho=ho-500;
                                System.out.println(printCount);
                                System.out.println("황금단추 500개로 먼저 활성화 후 오색구슬 400개로 시작 하세요");

                                int rr=rResisList.get(jCount).getpResis()/3*2;

                                System.out.println(rResisList.get(jCount).getName()+"장비 "+ rResisList.get(jCount).getValue()+"강 피저 "+
                                        rr+"만큼 올리세요.");
                                check.add(rResisList.get(jCount));
                                totalpResis+=rr;
                                System.out.println("총 피저: "+totalpResis);
                                System.out.println("총 피저관: "+totalpPent);
                                System.out.println("남은 오색구슬: "+bead);
                                System.out.println("남은 황금단추: "+ho);
                                printCount++;
                                temp++;

                            }else if(400 <= bead){
                                bead=bead-400;
                                System.out.println(printCount);
                                System.out.println("황금단추 500개로 먼저 활성화 후 오색구슬 400개로 시작 하세요");

                                int rr=rResisList.get(jCount).getpResis()/3;

                                System.out.println(rResisList.get(jCount).getName()+"장비 "+ rResisList.get(jCount).getValue()+"강 피저 "+
                                        rr+"만큼 올리세요.");
                                check.add(rResisList.get(jCount));
                                totalpResis+=rr;
                                System.out.println("총 피저: "+totalpResis);
                                System.out.println("총 피저관: "+totalpPent);
                                System.out.println("남은 오색구슬: "+bead);
                                System.out.println("남은 황금단추: "+ho);
                                printCount++;
                                temp++;

                            }

                        }else {
                            if(ch(rResisList.get(jCount),check)){
                                if (bead >= 1000) {
                                    bead=bead-1000;
                                    System.out.println(printCount);

                                    int rr=rResisList.get(jCount).getpResis()/3*2;

                                    System.out.println(rResisList.get(jCount).getName()+"장비 "+ rResisList.get(jCount).getValue()+"강 피저 "+
                                            rr+"만큼 올리세요.");
                                    check.add(rResisList.get(jCount));
                                    totalpResis+=rr;
                                    System.out.println("총 피저: "+totalpResis);
                                    System.out.println("총 피저관: "+totalpPent);
                                    System.out.println("남은 오색구슬: "+bead);
                                    System.out.println("남은 황금단추: "+ho);
                                    printCount++;
                                    temp++;

                                }else if(500 <= bead){
                                    bead=bead-500;
                                    System.out.println(printCount);

                                    int rr=rResisList.get(jCount).getpResis()/3;

                                    System.out.println(rResisList.get(jCount).getName()+"장비 "+ rResisList.get(jCount).getValue()+"강 피저 "+
                                            rr+"만큼 올리세요.");
                                    check.add(rResisList.get(jCount));
                                    totalpResis+=rr;
                                    System.out.println("총 피저: "+totalpResis);
                                    System.out.println("총 피저관: "+totalpPent);
                                    System.out.println("남은 오색구슬: "+bead);
                                    System.out.println("남은 황금단추: "+ho);
                                    printCount++;
                                    temp++;

                                }
                            }
                        }


                    }else {
                        if(ho >= 500) {
                            bead=bead-1400;
                            ho=ho-500;
                            System.out.println(printCount);
                            System.out.println("황금단추 500개로 먼저 활성화 후 오색구슬 400개로 시작 하세요");
                            System.out.println(rResisList.get(jCount).getName()+"장비 "+ rResisList.get(jCount).getValue()+"강 피저 "+
                                    rResisList.get(jCount).getpResis()+"만큼 올리세요.");
                            check.add(rResisList.get(jCount));
                            totalpResis+=rResisList.get(jCount).getpResis();
                            System.out.println("총 피저: "+totalpResis);
                            System.out.println("총 피저관: "+totalpPent);
                            System.out.println("남은 오색구슬: "+bead);
                            System.out.println("남은 황금단추: "+ho);
                            printCount++;
                            temp++;

                        }else {

                            if(ch(rResisList.get(jCount),check)){
                                bead=bead-1500;
                                System.out.println(printCount);
                                System.out.println(rResisList.get(jCount).getName()+"장비 "+ rResisList.get(jCount).getValue()+"강 피저 "+
                                        rResisList.get(jCount).getpResis()+"만큼 올리세요.");
                                check.add(rResisList.get(jCount));
                                totalpResis+=rResisList.get(jCount).getpResis();
                                System.out.println("총 피저: "+totalpResis);
                                System.out.println("총 피저관: "+totalpPent);
                                System.out.println("남은 오색구슬: "+bead);
                                System.out.println("남은 황금단추: "+ho);
                                printCount++;
                                temp++;

                            }
                        }
                    }
                }

                jCount++;

            }

            if((ho >= 500 && bead < 400) || (ho < 500 && bead < 500)) {
                System.out.println("종료");
                return;
            }


            if (bead < 1500) {
                if (ho >= 500) {
                    if (bead >= 900) {
                        bead=bead-900;
                        ho=ho-500;
                        System.out.println(printCount);

                        int rr=rPentList.get(i).getpPent()/3*2;

                        System.out.println("황금단추 500개로 먼저 활성화 후 오색구슬 400개로 시작 하세요");
                        System.out.println(rPentList.get(i).getName()+"장비 "+ rPentList.get(i).getValue()+"강 피저관 "+
                                rr+"만큼 올리세요.");
                        check.add(rPentList.get(i));
                        totalpPent+=rr;
                        System.out.println("총 피저: "+totalpResis);
                        System.out.println("총 피저관: "+totalpPent);
                        System.out.println("남은 오색구슬: "+bead);
                        System.out.println("남은 황금단추: "+ho);
                        printCount++;

                    }else if(400 <= bead){
                        bead=bead-400;
                        ho=ho-500;
                        System.out.println(printCount);

                        int rr=rPentList.get(i).getpPent()/3;

                        System.out.println("황금단추 500개로 먼저 활성화 후 오색구슬 400개로 시작 하세요");
                        System.out.println(rPentList.get(i).getName()+"장비 "+ rPentList.get(i).getValue()+"강 피저관 "+
                                rr+"만큼 올리세요.");
                        check.add(rPentList.get(i));
                        totalpPent+=rr;
                        System.out.println("총 피저: "+totalpResis);
                        System.out.println("총 피저관: "+totalpPent);
                        System.out.println("남은 오색구슬: "+bead);
                        System.out.println("남은 황금단추: "+ho);
                        printCount++;

                    }

                }else{
                    if (bead >= 1000) {
                        bead=bead-1000;
                        System.out.println(printCount);

                        int rr=rPentList.get(i).getpPent()/3*2;

                        System.out.println(rPentList.get(i).getName()+"장비 "+ rPentList.get(i).getValue()+"강 피저관 "+
                                rr+"만큼 올리세요.");
                        check.add(rPentList.get(i));
                        totalpPent+=rr;
                        System.out.println("총 피저: "+totalpResis);
                        System.out.println("총 피저관: "+totalpPent);
                        System.out.println("남은 오색구슬: "+bead);
                        System.out.println("남은 황금단추: "+ho);
                        printCount++;

                    }else if(500 <= bead){
                        bead=bead-500;
                        System.out.println(printCount);

                        int rr=rPentList.get(i).getpPent()/3;

                        System.out.println(rPentList.get(i).getName()+"장비 "+ rPentList.get(i).getValue()+"강 피저관 "+
                                rr+"만큼 올리세요.");
                        check.add(rPentList.get(i));
                        totalpPent+=rr;
                        System.out.println("총 피저: "+totalpResis);
                        System.out.println("총 피저관: "+totalpPent);
                        System.out.println("남은 오색구슬: "+bead);
                        System.out.println("남은 황금단추: "+ho);
                        printCount++;

                    }


                }


            }else {
                if(ho >= 500) {
                    bead=bead-1400;
                    ho=ho-500;
                    System.out.println(printCount);
                    System.out.println("황금단추 500개로 먼저 활성화 후 오색구슬 400개로 시작 하세요");
                    System.out.println(rPentList.get(i).getName()+"장비 "+ rPentList.get(i).getValue()+"강 피저관 "+
                            rPentList.get(i).getpPent()+"만큼 올리세요.");
                    check.add(rPentList.get(i));
                    totalpPent+=rPentList.get(i).getpPent();
                    System.out.println("총 피저: "+totalpResis);
                    System.out.println("총 피저관: "+totalpPent);
                    System.out.println("남은 오색구슬: "+bead);
                    System.out.println("남은 황금단추: "+ho);
                    printCount++;

                }else {
                    if(ch(rPentList.get(i),check)){
                        bead=bead-1500;
                        System.out.println(printCount);
                        System.out.println(rPentList.get(i).getName()+"장비 "+ rPentList.get(i).getValue()+"강 피저관 "+
                                rPentList.get(i).getpPent()+"만큼 올리세요.");
                        check.add(rPentList.get(i));
                        totalpPent+=rPentList.get(i).getpPent();
                        System.out.println("총 피저: "+totalpResis);
                        System.out.println("총 피저관: "+totalpPent);
                        System.out.println("남은 오색구슬: "+bead);
                        System.out.println("남은 황금단추: "+ho);
                        printCount++;


                    }
                }
            }


        }






    }

    private static boolean ch(ChakDTO chakDTO, ArrayList<ChakDTO> check) {

        for(ChakDTO c : check){
            if(c.getName().equals(chakDTO.getName()) && c.getValue() == chakDTO.getValue()){
                return false;
            }
        }
        return true;
    }

}
