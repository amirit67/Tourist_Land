package ir.touristland.Moudle;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class CustomRadioButton extends android.support.v7.widget.AppCompatRadioButton {
    public static Typeface FONT_NAME;


    public CustomRadioButton(Context context) {
        super(context);
        if (FONT_NAME == null)
            FONT_NAME = Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansMedium.ttf");
        this.setTypeface(FONT_NAME);
    }

    public CustomRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (FONT_NAME == null)
            FONT_NAME = Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansMedium.ttf");
        this.setTypeface(FONT_NAME);
    }

    public CustomRadioButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (FONT_NAME == null)
            FONT_NAME = Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansMedium.ttf");
        this.setTypeface(FONT_NAME);
    }
}