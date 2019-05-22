package com.example.fontutil;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Switch;

public class SwitchCustomFont extends Switch {

    public SwitchCustomFont(Context context) {
        super(context);
    }

    public SwitchCustomFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyNewCustomTypeface(context, attrs);
    }

    public SwitchCustomFont(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyNewCustomTypeface(context, attrs);
    }

    private void applyNewCustomTypeface(Context context, AttributeSet attributeSet) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.ButtonCustomFont);
        String customFont = typedArray.getString(R.styleable.ButtonCustomFont_font_name);
        applyNewCustomTypeface(context, customFont);
        typedArray.recycle();
    }

    public boolean applyNewCustomTypeface(Context context, String asset) {
        setTypeface(FontUtilCache.getTypefaceFont(context, asset));
        return true;
    }
}

