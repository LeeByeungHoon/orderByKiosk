1. 도메인 주제 : 음식점 키오스크 주문
1-1. 시나리오
   - 사용자가 키오스크를 통해 주문을 한다
   - 주문을 받아 요리를 시작하면 테이블이 비활성화가 된다
   - 요리가 완료 되면 주문 상태를 변경한다
   - 사용자가 주문을 취소한다
   - 주문 취소 요청을 받은 요리사가 요리를 취소한다
   - 취소가 되면 주문 상태를 변경하고 테이블을 활성화 한다
   - 테이블이 활성화 되면 기다리고 있는 사용자에게 알림을 보낸

2. 이벤트스토밍 모델
![5](https://github.com/LeeByeungHoon/orderByKiosk/assets/103758785/c8455d19-0515-4a70-8d14-3cfb140f47eb)

3. Domain Event Pub/Sub
![스크린샷 2023-11-10 121418](https://github.com/LeeByeungHoon/orderByKiosk/assets/103758785/0a0b0e9e-b94c-4375-83d6-f63c51c478b3)
![스크린샷 2023-11-10 112946](https://github.com/LeeByeungHoon/orderByKiosk/assets/103758785/e6dff1d9-fea4-46f8-b681-85a8e9ba26ff)
![스크린샷 2023-11-10 121459](https://github.com/LeeByeungHoon/orderByKiosk/assets/103758785/9aa7a83c-2b4e-4ce6-b3a9-b2b0b44d18af)
![스크린샷 2023-11-10 121242](https://github.com/LeeByeungHoon/orderByKiosk/assets/103758785/5b3c2036-5704-4b30-a16d-986a1147f259)

CQRS
![cqrs](https://github.com/LeeByeungHoon/orderByKiosk/assets/103758785/1314dd55-c158-4092-bd2c-d4e202e4a137)
![cqrschange](https://github.com/LeeByeungHoon/orderByKiosk/assets/103758785/11ec2175-689c-45b3-9d0b-6d850f97cec5)
