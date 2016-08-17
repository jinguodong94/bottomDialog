package com.jgd.bottom_dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

/**
 * 创建者     金国栋
 * 创建时间   2016/6/17 15:37
 * 描述	      ${TODO}
 * <p/>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
public class MyDialog extends Dialog {
    public MyDialog(Context context, int themeResId) {
        super(context, themeResId);
        Window window = getWindow();
        int screenWidth = context.getResources().getDisplayMetrics().widthPixels;
        window.setLayout(screenWidth, WindowManager.LayoutParams.WRAP_CONTENT);
        window.setGravity(Gravity.BOTTOM);
    }

    public MyDialog(Context context) {
        this(context, R.style.LocationDialogStyle);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.dialog);
    }
}
