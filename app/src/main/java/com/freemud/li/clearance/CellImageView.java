package com.freemud.li.clearance;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;

import java.util.Random;

@SuppressLint("ClickableViewAccessibility")
public class CellImageView extends ImageView {
	private int row;
	private int column;
	private int color;

	public CellImageView(Context context) {
		super(context);
	}

	@SuppressWarnings("static-access")
	public CellImageView(Context context, int row, int column) {
		super(context);
		this.setRow(row);
		this.setColumn(column);
		this.setBackgroundColor(context.getResources().getColor(R.color.BLUE));
		this.setPadding(Utils.dip2px(context, (float) 0.5),
				Utils.dip2px(context, (float) 0.5),
				Utils.dip2px(context, (float) 0.5),
				Utils.dip2px(context, (float) 0.5));
//		Random random = new Random();
//		int count = random.nextInt(2);
//		if(count==0){
//			color = R.drawable.bg_green;
//		}else if(count ==1){
//			color = R.drawable.bg_red;
//		}
//		else if(count ==2){
//			color = R.drawable.bg_white;
//		}else if(count ==3){
//			color = R.drawable.bg_blue;
//		}
		color = R.drawable.bg_green;
		this.setImageDrawable(context.getResources().getDrawable(
				color));
		this.setScaleType(getScaleType().FIT_XY);
		this.setMinimumWidth(Utils.dip2px(context, 30));
		this.setMinimumHeight(Utils.dip2px(context, 30));
		this.setMaxHeight(Utils.dip2px(context, 30));
		this.setMaxWidth(Utils.dip2px(context, 30));
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setImageDrawable(int drawableId) {
		super.setImageDrawable(MainActivity.drawables[drawableId]);
	}
}
