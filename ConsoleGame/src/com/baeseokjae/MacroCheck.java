package com.baeseokjae;

import javax.swing.JOptionPane;
import java.util.Random;

public class MacroCheck extends Thread {

	public static void main(String[] args) {

		Random rnd = new Random();

		StringBuffer buf = new StringBuffer();

		for (int i = 0; i < 10; i++) {

			// rnd.nextBoolean() 는 랜덤으로 true, false 를 리턴. true일 시 랜덤 한 소문자를, false 일 시 랜덤 한
			// 숫자를 StringBuffer 에 append.

			if (rnd.nextBoolean()) {

				buf.append((char) ((int) (rnd.nextInt(26)) + 97));

			} else {

				buf.append((rnd.nextInt(10)));

			}
		}
	}

	@Override
	public void run() {

		Random rnd = new Random();

		StringBuffer buf = new StringBuffer();

		for (int i = 0; i < 10; i++) {

			// rnd.nextBoolean() 는 랜덤으로 true, false 를 리턴. true일 시 랜덤 한 소문자를, false 일 시 랜덤 한
			// 숫자를 StringBuffer 에 append.

			if (rnd.nextBoolean()) {

				buf.append((char) ((int) (rnd.nextInt(26)) + 97));

			} else {

				buf.append((rnd.nextInt(10)));

			}
		}
		while (!Thread.currentThread().isInterrupted()) {
			try {
				String input = JOptionPane.showInputDialog(buf.toString());
				if (input.equals(buf.toString())) {
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 확인되었습니다.");
					System.out.println(" ----------------------------------------------------------------------");
					Thread.sleep(60000);
				} else {
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 틀렸습니다. 다시 입력해주세요.");
					System.out.println(" ----------------------------------------------------------------------");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
	}
}