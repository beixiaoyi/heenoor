package com.hshc.ldg.heenoor.demo.design.d11_state.blog;

public class ColRed extends Color {

	ColRed(String msg) {
		super(msg);
	}

	@Override
	public Context push(Context con) {
		System.out.println(" --> black ");
		con.setColor(new ColBlack("黑色"));
		return con;
	}

	@Override
	public Context pull(Context con) {
		System.out.println(" --> green ");
		con.setColor(new ColGreen("绿色"));
		return con;
	}

}
