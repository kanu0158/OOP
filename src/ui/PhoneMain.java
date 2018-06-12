package ui;

import javax.swing.JOptionPane;
import domain.Phone;

/**
 * 0.통화종료 1.집전화기
 */
enum PhoneButt {
	EXIT, TELEPHONE, CELLPHONE,SMARTPHONE;
}
public class PhoneMain {
	public static void main(String[] args) {
		PhoneButt[] buttons = {PhoneButt.EXIT,PhoneButt.TELEPHONE,PhoneButt.CELLPHONE,PhoneButt.SMARTPHONE};
		//Phone[] phone = new Phone[4];
		Phone phone = new Phone();
		//int phoneCount = 0;
		while (true) {
			switch ((PhoneButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU", JOptionPane.QUESTION_MESSAGE,
					null, buttons, null)) {
			case EXIT:return;
			case TELEPHONE:
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setBrand();
				phone.setKind(JOptionPane.showInputDialog("종류"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case CELLPHONE:
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setBrand();
				phone.setKind(JOptionPane.showInputDialog("종류"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case SMARTPHONE:
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setBrand();
				phone.setKind(JOptionPane.showInputDialog("종류"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			default:
				break;
			}
		}
	}

}
