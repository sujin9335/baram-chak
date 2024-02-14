package com.baram.etc;

import com.baram.dao.ChakDAO;
import com.baram.dto.ChakDTO;

import java.util.*;

public class Etc {
    public static void main(String[] args) {

        /*Scanner sc=new Scanner(System.in);
        String h;*/

            //System.out.println("입력: ");
            //String input=sc.nextLine();
        /*for(int i=1; i<10; i++) {

            if(i<4) {
                h="ChakDTO "+ input + i +" = new ChakDTO();\r\n" +
                        input + i +".setName(\"보조2\");\r\n" +
                        input + i +".setValue(10);\r\n" +
                        input + i +".setpPent(15);\r\n" +
                        "list.add("+ input + i +");\r\n";
                        System.out.println(h);

            }else {
                h="ChakDTO "+ input + i +" = new ChakDTO();\r\n" +
                        input + i +".setName(\"보조2\");\r\n" +
                        input + i +".setValue(10);\r\n" +
                        input + i +".setpResis(15);\r\n" +
                        "list.add("+ input + i +");\r\n";
                        System.out.println(h);
            }


        }*/

        /*ChakDAO.load();
        System.out.println(ChakDAO.list.toString());*/



        //강화 수치 추가
        int h=20;
        int w=20;
        int a=20;
        int c=16;
        int s=20;
        int n=20;
        int r1=18;
        int r2=16;
        int b1=20;
        int b2=20;

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



        //데이터 비교
        /*int bead=35000;
        int saveBead=30;


        int printCount=1;
        int temp=0;
        for(int i=0; i<rPentList.size(); i++) {
            int jCount=0;
            jCount=jCount+temp;
            while(jCount < rResisList.size()) {
                if(rPentList.get(i).getpPent() < rResisList.get(jCount).getpResis()){
                    System.out.println(printCount);
                    System.out.println(rResisList.get(jCount).getName()+"장비 "+ rResisList.get(jCount).getValue()+"강 피저 "+
                            rResisList.get(jCount).getpResis()+"만큼 올리세요.");
                    temp++;
                    printCount++;

                }

                jCount++;

            }
            System.out.println(printCount);
            System.out.println(rPentList.get(i).getName()+"장비 "+ rPentList.get(i).getValue()+"강 피저관 "+
                    rPentList.get(i).getpPent()+"만큼 올리세요.");
            printCount++;


        }*/






        //호박 갯수 추가
        int ho=14107;
        int bead=33547;

        int ho2=ho;
        int bead2=bead;

        ArrayList<ChakDTO> check=new ArrayList<>();

        ArrayList<ChakDTO> list=new ArrayList<>();

        //총 피저 피저관 수
        int totalpPent=0;
        int totalpResis=0;

        int printCount=1;//구분선 출력
        int temp=0;
        for(int i=0; i<rPentList.size(); i++) {
            
            int jCount=0;
            jCount=jCount+temp;//출력한 인덱스(temp) 추가하여 출력한것 이후 시작

            if((ho >= 500 && bead < 400) || (ho < 500 && bead < 500)) {
                break;
            }
            
            //피저 먼저 돌려서 피저 높은것 먼저 출력(temp++ 해서 이전 index무시)
            while(jCount < rResisList.size()) {
                if(rPentList.get(i).getpPent() < rResisList.get(jCount).getpResis()){
                    //호박구슬 카운트

                    if (bead < 1500) {//구슬 1500 미만
                        if(ho >= 500) {//단추 500개이상
                            if (bead >= 900) { //900<= 구슬 < 1500

                                bead=bead-900;
                                ho=ho-500;

                                int rr=rResisList.get(jCount).getpResis()/3*2;//재수정된 피저2/3
                                rResisList.get(jCount).setpResis(rr);

                                check.add(rResisList.get(jCount));

                                rResisList.get(jCount).setType(1);//황단 사용
                                rResisList.get(jCount).setBeadNum(2);//-900

                                list.add( rResisList.get(jCount));

                                temp++;

                            }else if(400 <= bead){ //400 <= 구슬 < 900

                                bead=bead-400;

                                int rr=rResisList.get(jCount).getpResis()/3;//재수정된 피저1/3
                                rResisList.get(jCount).setpResis(rr);

                                check.add(rResisList.get(jCount));

                                rResisList.get(jCount).setType(1);//황단 사용
                                rResisList.get(jCount).setBeadNum(3);//-400

                                list.add( rResisList.get(jCount));

                                temp++;

                            }

                        }else {//단추 500개 미만
                            if(ch(rResisList.get(jCount),check)){ // 단추 안쓸때는 해당 부위 올릭적있는지 확인
                                if (bead >= 1000) { //구슬 1000개 이상

                                    bead=bead-1000;

                                    int rr=rResisList.get(jCount).getpResis()/3*2;//재수정된 피저2/3
                                    rResisList.get(jCount).setpResis(rr);

                                    check.add(rResisList.get(jCount));

                                    rResisList.get(jCount).setType(2);//황단 사용
                                    rResisList.get(jCount).setBeadNum(2);//-1000

                                    list.add( rResisList.get(jCount));

                                    temp++;

                                }else if(500 <= bead){

                                    bead=bead-500;

                                    int rr=rResisList.get(jCount).getpResis()/3;//재수정된 피저1/3
                                    rResisList.get(jCount).setpResis(rr);

                                    check.add(rResisList.get(jCount));

                                    rResisList.get(jCount).setType(2);//황단 사용
                                    rResisList.get(jCount).setBeadNum(3);//-500

                                    list.add( rResisList.get(jCount));

                                    temp++;

                                }
                            }
                        }

                    }else {//구슬 1500이상
                        if(ho >= 500) { //단추 500개 이상

                            bead=bead-1400;
                            ho=ho-500;

                            check.add(rResisList.get(jCount));

                            rResisList.get(jCount).setType(1);//황단 사용
                            rResisList.get(jCount).setBeadNum(1);//-1400

                            list.add( rResisList.get(jCount));

                            temp++;

                        }else {//단추 500개 미만

                            if(ch(rResisList.get(jCount),check)){ // 단추 안쓸때는 해당 부위 올릭적있는지 확인

                                bead=bead-1500;

                                check.add(rResisList.get(jCount));

                                rResisList.get(jCount).setType(2);//황단 미사용
                                rResisList.get(jCount).setBeadNum(1);//-1500

                                list.add( rResisList.get(jCount));

                                temp++;

                            }
                        }
                    }
                }

                jCount++;

            }//피저 while

            if((ho >= 500 && bead < 400) || (ho < 500 && bead < 500)) {
                break;
            }

            //피저관 처리
            if (bead < 1500) { //구슬 1500 미만
                if (ho >= 500) { //단추 500개이상
                    if (bead >= 900) { //900 <= 구슬 < 1500

                        bead=bead-900;
                        ho=ho-500;

                        int rr=rPentList.get(i).getpPent()/3*2; //재수정된 피저관2/3
                        rPentList.get(i).setpPent(rr);

                        check.add(rPentList.get(i));

                        rPentList.get(i).setType(1);//황단 사용
                        rPentList.get(i).setBeadNum(2);//-900

                        list.add(rPentList.get(i));

                    }else if(400 <= bead){ //구슬 <= 400


                        bead=bead-400;
                        ho=ho-500;

                        int rr=rPentList.get(i).getpPent()/3; //재수정된 피저관1/3
                        rPentList.get(i).setpPent(rr);

                        check.add(rPentList.get(i));

                        rPentList.get(i).setType(1);//황단 사용
                        rPentList.get(i).setBeadNum(3);//-400

                        list.add(rPentList.get(i));

                    }

                }else{//단추 500개 미만
                    if (bead >= 1000) { //구슬 >= 1000개


                        bead=bead-1000;

                        int rr=rPentList.get(i).getpPent()/3*2; //재수정된 피저관2/3
                        rPentList.get(i).setpPent(rr);

                        check.add(rPentList.get(i));

                        rPentList.get(i).setType(2);//황단 미사용
                        rPentList.get(i).setBeadNum(2);//-1000

                        list.add(rPentList.get(i));

                    }else if(500 <= bead){


                        bead=bead-500;

                        int rr=rPentList.get(i).getpPent()/3; //재수정된 피저관1/3
                        rPentList.get(i).setpPent(rr);

                        check.add(rPentList.get(i));

                        rPentList.get(i).setType(2);//황단 사용
                        rPentList.get(i).setBeadNum(3);//-500

                        list.add(rPentList.get(i));

                    }
                }

            }else { //구슬 1500개 이상
                if(ho >= 500) {

                    bead=bead-1400;
                    ho=ho-500;

                    check.add(rPentList.get(i));

                    rPentList.get(i).setType(1);//황단 사용
                    rPentList.get(i).setBeadNum(1);//-1400

                    list.add(rPentList.get(i));

                }else {
                    if(ch(rPentList.get(i),check)){

                        bead=bead-1500;

                        check.add(rPentList.get(i));

                        rPentList.get(i).setType(2);//황단 미사용
                        rPentList.get(i).setBeadNum(1);//-1500

                        list.add(rPentList.get(i));


                    }
                }
            }


        }

        Collections.sort(list, Comparator.comparingInt(ChakDTO::getValue).reversed());

       /* System.out.println(ChakDAO.list.toString());
        System.out.println();
        System.out.println(rPentList.toString());
        System.out.println();
        System.out.println(rResisList.toString());*/

        //출력 순서
        String[] nameSort={"투구", "무기", "갑옷", "망토", "신발", "목걸이", "반지1", "반지2", "보조1", "보조2"};

        for(int i=0; i<nameSort.length; i++) {
            for(ChakDTO dto : list) {
                if(dto.getName().equals(nameSort[i])) {
                    totalpPent+=dto.getpPent();
                    totalpResis+=dto.getpResis();
                    if(dto.getType() == 1){
                        if(dto.getBeadNum() == 1) {
                            bead2=bead2-1400;
                            ho2=ho2-500;
                        }else if(dto.getBeadNum() == 2) {
                            bead2=bead2-900;
                            ho2=ho2-500;
                        }else if(dto.getBeadNum() == 3) {
                            bead2=bead2-400;
                            ho2=ho2-500;
                        }
                    }else if(dto.getType() == 2){
                        if(dto.getBeadNum() == 1) {
                            bead2=bead2-1500;
                        }else if(dto.getBeadNum() == 2) {
                            bead2=bead2-1000;
                        }else if(dto.getBeadNum() == 3) {
                            bead2=bead2-500;
                        }
                    }
                    String result=printDto(dto, totalpPent, totalpResis, printCount, bead2, ho2);
                    printCount++;
                    System.out.println(result);
                }
            }
        }







    }

    private static String printDto(ChakDTO dto, int totalpPent, int totalpResis, int printCount, int bead2, int ho2) {
        String result="";


        result+=printCount+"\r\n";
        if(dto.getType() == 1) {
            result+="황금단추 500개로 먼저 활성화 후 오색구슬 400개로 시작 하세요\r\n";
        }
        result+=dto.getName()+"장비 "+dto.getValue()+"강 ";
        if(dto.getpPent() == 0){
            result+="피저 "+dto.getpResis()+"만큼 올리세요.\r\n";
        }else {
            result+="피저관 "+dto.getpPent()+"만큼 올리세요.\r\n";
        }

        result+="총 피저: "+totalpResis+"\r\n";
        result+="총 피저관: "+totalpPent+"\r\n";
        result+="남은 오색구슬: "+bead2+"\r\n";
        result+="남은 황금단추: "+ho2;


        return result;

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
