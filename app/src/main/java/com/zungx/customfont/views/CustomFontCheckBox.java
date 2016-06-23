package com.zungx.customfont.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CheckBox;

import com.zungx.customfont.utils.CustomFontUtils;

/**
 * Created by vandung on 6/23/16.
 */
public class CustomFontCheckBox extends CheckBox {
    /**
     * Default View Constructor.
     *
     * @param context application context.
     */
    public CustomFontCheckBox(final Context context) {
        super(context);
    }

    /**
     * Default View Constructor. Sets custom font with no style.
     *
     * @param context application context.
     * @param attrs   View attributes.
     */
    public CustomFontCheckBox(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    /**
     * Default View Constructor. Sets custom font with style.
     *
     * @param context  application context.
     * @param attrs    View attributes.
     * @param defStyle View Style.
     */
    public CustomFontCheckBox(final Context context, final AttributeSet attrs,
                              final int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    /**
     * Initialize custom font attribute.
     *
     * @param attrs attributes.
     */
    private void init(final AttributeSet attrs) {
        Typeface typeface;
        if (!isInEditMode() && (typeface = CustomFontUtils.getTypeFace(this, attrs)) != null) {
            super.setTypeface(typeface, typeface.getStyle());
        }
    }
}
