# 자바 스프링 프레임워크와 자바 서버 페이지를 활용한 밀킷 웹 프로젝트
(Mealkit Web Project using Java Spring Framework and Java Server Pages)
## ![image](https://user-images.githubusercontent.com/84374354/150449668-d6229a27-96a4-4046-8d56-bc1a0b8c3981.png)
## ■ OUTLINE(개요)

- 판매자가 등록한 밀키트 상품을 회원들이 자유롭게 상품주문/구매하는 사이트입니다.
- 게시판 항목으로는 공지사항/이벤트/1:1문의가 있습니다.
- 지도 항목은 Daum주소 Open API 를 활용하여 판매자의 주소/위치를 눈으로 UI로 확인할 수 있으며 해당 판매자 정보/상품을 확인할 수 있습니다. 
- 결제는 카카오페이 API 를 활용하여 결제할 수 있습니다.
- 관리자는 기간별 상품판매 통계를 확인할 수 있습니다.
```sh
(This is a site where members can freely order meal kits posted by sellers.)
(There is a bulletin board for notices/events/one-to-one inquiries.)
(For map items, you can check the seller's location using the following address api, and click the seller to view the seller's products.)
(Payment can be made using the Kakao Pay api.)
(Administrators can check product sales statistics by period.)
```
## ■ Features of this project(이 프로젝트에 활용한 기술)

- Web Front  :  HTML5 , Bootstrap/CSS, JavaScript, Jquery
- Web Server : Tomcat
- DBMS : Oracle DB
- Development Environment(개발환경) : Eclipse, Spring framework, Java

#### Check the deployment by going to the server address in that browser.
```sh
127.0.0.1:8000
```


## ■ User Case(사용사례)
![image](https://user-images.githubusercontent.com/84374354/150446522-18e79d38-d4ce-4706-a2d5-0424ef70caa5.png)

## ■ Flow Chart(순서도)
![image](https://user-images.githubusercontent.com/84374354/150446514-106fd55f-bb0b-4e13-a272-7b98e6b06469.png)

## ■ Function(기능)
프로젝트의 기능들 입니다.
- 로그인/회원가입
- 게시판 CRUD
- 장바구니/결제
- 마이페이지/배송시작/구매확정/반품
- 구매 상품 리뷰 및 평점 주기
- 기간별 통계 차트
```sh
1. Login and Register
2. bulletin board CRUD
3. Shopping Cart/Payment
4. My Page/Start Delivery/Confirm Purchase/Return
5. Product review and rating cycle
6. Statistical chart by period
```
## ■ Database ER Diagram(DB모델/관계도)
![image](https://user-images.githubusercontent.com/84374354/150446540-da94adf4-8e32-4941-91f7-4fcc16be20c8.png)

## ■ SiteMap(사이트맵)
![image](https://user-images.githubusercontent.com/84374354/150446585-54c7a877-f987-44cb-9cbe-fe904caf7db2.png)

## ■ implemented function(구현한 기능)
제가 구현한 기능입니다.

- 회원가입 - SMS 인증 (SENS API)
- 회원가입 - 도로명 주소 API (Daum API)
- 회원가입 - Ajax를 이용한 아이디 중복 검사 및 그 외 유효성 검사
- 상품 리스트 - 분류/조리시간과 전체/상품명/상호명에 따른 검색 기능
- 상품 리스트 - 페이징 처리
- 장바구니 - Ajax를 이용한 상품 담기,주문,변경
- 사업자페이지 - 판매자 정보, 판매상품 리스트
- 관리자페이지 - Zingchart를 활용한 기간별 상품 판매량을 그래프로 표시

## ■ Post execution video(시연영상)
https://www.youtube.com/watch?v=31RXKdMCnCI
