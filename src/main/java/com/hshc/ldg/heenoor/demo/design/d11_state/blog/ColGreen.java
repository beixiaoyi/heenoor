package com.hshc.ldg.heenoor.demo.design.d11_state.blog;

public class ColGreen extends Color {

	ColGreen(String msg) {
		super(msg);
	}

	@Override
	public Context push(Context con) {
		System.out.println(" --> red ");
		con.setColor(new ColRed("红色"));
		return con;
	}

	@Override
	public Context pull(Context con) {
		System.out.println(" --> white");
		con.setColor(new ColWhite("白色"));
		return con;
	}

}
