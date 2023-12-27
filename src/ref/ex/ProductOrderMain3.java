package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요");
        int n = scanner.nextInt();
        scanner.nextLine(); // 엔터도 읽기 위해

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); //입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, quantity);
        }

        // PrintOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);
        // getTotalAmount()를 사용해서 총 결제 금액 계산
        System.out.println("총 결제 금액: "+ getTotalAmount(orders));
    }
    // 상품 주문 정보들을 생성하고 배열에 저장
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }
    // PrintOrders()를 사용해서 상품 주문 정보 출력
        static void printOrders(ProductOrder[] orders) {
            for (ProductOrder order : orders) {
                System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            }
        }
    // getTotalAmount()를 사용해서 총 결제 금액 계산
        static int getTotalAmount(ProductOrder[] orders) {
            int total = 0; //지역 변수, 수동 초기화
            for (ProductOrder order : orders) {
               total += order.price * order.quantity;
            }
            return total;
        }
    }

