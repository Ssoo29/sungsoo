package bank.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;
import bank.mvc.controller.BankController;
import bank.mvc.model.vo.Bank;

public class BankMenu {
	// DI
	private Scanner sc = new Scanner(System.in);
	private BankController bController = new BankController();

	public BankMenu() {
	}

	public void displayMenu() {
		do {
			System.out.println("*** 계좌 관리 프로그램 ***");
			System.out.print("\n1. 관리자메뉴" + "\n2. 사용자메뉴" + "\n3. 프로그램 종료" + "\n메뉴 선택 :");
			switch (sc.nextInt()) {
			case 1:
				adminMenu();
				break;
			case 2:
				userMenu();
				break;
			case 3:
				System.out.print("종료(y), 취소(n) :");
				if (sc.next().toLowerCase().charAt(0) == 'y') {
					return;
				} else {
					break;
				}
			default:
				System.out.println("없는 번호 입니다.");
				System.out.println("확인 후 다시 입력하세요.\n");
				break;
			}
		} while (true);
	}

	public void adminMenu() {
		do {
			System.out.println("*** 계좌 관리 프로그램 ***");
			System.out.print("\n\r1. 통장개설" + "\n2. 통장전체조회" + "\n3. 계좌번호으로 조회" + "\n4. 이름으로 조회" + "\n5. 통장삭제"
					+ "\n6. 이전으로 돌아가기" + "\n메뉴 선택 :");
			switch (sc.nextInt()) {
			case 1:
				bController.bankInsert(bankInsert());
				break;
			case 2:
				printAll(bController.printAll(inputAccountNo()));
				break;
			case 3:
				printOne(bController.printAccountNo(inputAccountNo()));
				break;
			case 4:
				printOne(bController.printName(inputUserName()));
				break;
			case 5:
				deleteAccount(bController.deleteAccount(inputAccountNo()));
				break;
			case 6:
				System.out.print("이전 메뉴로 돌아가시겠습니까(y,n) ? :");
				if (sc.next().toLowerCase().charAt(0) == 'y') {
					return;
				} else {
					break;
				}
			default:
				System.out.println("없는 번호 입니다.");
				System.out.println("확인 후 다시 입력하세요.\n");
				break;
			}
		} while (true);
	}

	public void userMenu() {
		do {
			System.out.println("*** 계좌 관리 프로그램 ***");
			System.out.print("\n\r1. 입금" + "\n2. 출금" + "\n3. 계좌이체" + "\n4. 계좌조회" + "\n5. 이전으로 돌아가기" + "\n메뉴 선택 :");
			switch (sc.nextInt()) {
			case 1:
				bController.BankDeposit(inputDeposit());
				break;
			case 2:
				bController.BankWithdraw(inputWithdraw());
				break;
			case 3:
				printOne(bController.BankTransferMoney(inputAccountNo()));
				break;
			case 4:
				bController.BankAccount();
			case 5:
				System.out.print("이전 메뉴로 돌아가시겠습니까(y,n) ? :");
				if (sc.next().toLowerCase().charAt(0) == 'y') {
					return;
				} else {
					break;
				}
			default:
				System.out.println("없는 번호 입니다.");
				System.out.println("확인 후 다시 입력하세요.\n");
				break;
			}
		} while (true);
	}

	public Bank bankInsert() {
		
		
		return null;
	}

	public void printAll(ArrayList<Bank> bankList) {
		for (Bank bank : bankList) {
			System.out.println(bank);
		}
	}

	public String inputAccountNo() {
		System.out.print("계좌번호 :");
		return sc.next();
	}

	public String inputUserName() {
		System.out.print("이름 :");
		return sc.next();
	}

	public void printOne(Bank bank) {
		System.out.println(bank);
	}

	public int inputDeposit() {
		System.out.print("입금액 :");
		return sc.nextInt();
	}

	public int inputWithdraw() {
		System.out.print("출금액 :");
		return sc.nextInt();
	}

	public void deleteAccount(Bank bank) {

	}

}