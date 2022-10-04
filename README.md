# ◼️ Spring 입문 주차
Week 1 개인과제
2022.09.30 - 2022.10.04

## ◼️ 기술스택 🔨
JAVA 100%

## ◼️ Use Case
![유스케이스](https://user-images.githubusercontent.com/99253403/193749896-ca8f7c78-3434-4283-8e93-2cd1b9d7d907.JPG)

## ◼️ API Table ✏️
Method | URL | Request | response | 
--- | --- | --- | --- |
GET | /api/blogs | - |{createdAt: "2022-10-04T02:51:52.702872", modifiedAt: "2022-10-04T02:51:52.702872", id: 3, username: "username", title: "title", contents: "contents"} |
GET | /api/blogs/{id} | - | {createdAt: "2022-10-04T02:51:52.702872", modifiedAt: "2022-10-04T02:51:52.702872", id: 3, username: "username", title: "title", contents: "contents"} |
POST | /api/blogs | {"username" : "username", "title" : "title", "contents" : "contents", "password" : "password"}| {createdAt: "2022-10-04T02:51:52.702872", modifiedAt: "2022-10-04T02:51:52.702872", id: 3, username: "username", title: "title", contents: "contents"} |
POST | /api/blogs/{id} | {"password":"password"} | {"success":true, "fail":false} |
PUT | /api/blogs/{id} | {"username" : "username2", "title" : "title2", "contents" : "contents2", "password" : "password2"}| {createdAt: "2022-10-04T02:51:52.702872", modifiedAt: "2022-10-05T02:51:52.702872", id: 3, username: "username2", title: "title2", contents: "contents2"} |
DELETE | /api/post/{id} | - | {"success":"true"} |

### ◼️ 수정, 삭제 API의 request를 어떤 방식으로 사용했나? (param, query, body)


### ◼️ 어떤 상황에 어떤 방식의 request를 써야 하나요?


### ◼️ RESRful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?


### ◼️ 작성한 코드에서 빈(Bean)을 모두 찾아보세요!


### ◼️ API 명세서 작성 가이드라인을 검색하여 직접 작성한 명세서와 비교해보세요.


