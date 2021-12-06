## KREAM 리셀 사이트 클론코딩 / Spring-Boot, Oracle
 * 개발 기간 : 2021.07.30 ~ 2021.10.31
 * 주제 : 한정판 리셀(KREAM)
 * 개발 : IntelliJ, Oracle , Visual Studio code
 * 사용 언어 : Java(JDK), Oracle SQL, HTML5, CSS3, Javascript(ES6)
 * 사용 기술 : JDBC,Thymeleaf,jQuery,Ajax,Spring-Boot(2.5),Mail API,JPA/Hiberrate, Restful API, QueryDSL

### 프로젝트 상세내용 ###
> 사이트 선택 이유 <br>
##### 다른 중고 사이트들과 달리 입찰 시스템이 탑재되어 있어 선택하게 되었습니다.

### 구현목표 ###
> 사용자 페이지
1. 입찰 시스템 구현(구매입찰/판매입찰)
2. 상품별 최근/평균 가격 구현
3. SNS와 같은 게시물 등록/수정 기능 구현
4. 해당 게시물과 댓글에 좋아요/댓글/팔로우 기능 구현
5. 세분화된 필터(다중필터)

>관리자 페이지
1. 회원관리(전체회원/탈퇴회원/블랙리스트)
2. 배송현황 관리
3. 문의 및 공지사항 관리
4. 상품관리(상품 등록/수정 및 게시상태)

### 구동 화면 ###
> 사용자 페이지
* 메인(/)
![main1](/capture_image/main1.png)
![main2](/capture_image/main2.png)
* 로그인(/login)
![login](/capture_image/login.png)
* 상품(/search)
![SHOP](/capture_image/shop.png)
* 입찰 시스템(/product/상품번호, /kream/buying/상품번호/사이즈)
![SHOP_info1](/capture_image/shop1.png)
![SHOP_info2](/capture_image/shop2.png)
* 스타일(/social/trending)
![STYLE](/capture_image/style.png) 
* 스타일 게시물 클릭시 보여지는 페이지(/social/popular)
![STYLE_info2](/capture_image/style_info2.png) 
![STYLE_info2](/capture_image/style_info1.png) 

> 관리자 페이지
* 대시보드(/pages)
![Admin](/capture_image/admin.png) 
* 주문(/pages/order/search)
![Admin_order](/capture_image/admin_order.png) 
* 상품등록(/pages/product/check)
![Admin_product](/capture_image/admin_product.png)
* 공지사항(/pages/content/manage)
![Admin_notice](/capture_image/admin_notice.png)
* 회원관리(/pages/member/all)
![Admin_member](/capture_image/admin_member.png)


