package com.robinhood.utils.extensions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextViews.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b\u001a2\u0010\u0015\u001a\u00020\t*\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u000b2\b\b\u0003\u0010\u0017\u001a\u00020\u000b2\b\b\u0003\u0010\u0018\u001a\u00020\u000b2\b\b\u0003\u0010\u0019\u001a\u00020\u000b\u001a<\u0010\u001a\u001a\u00020\t*\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u000b2\b\b\u0003\u0010\u0017\u001a\u00020\u000b2\b\b\u0003\u0010\u0018\u001a\u00020\u000b2\b\b\u0003\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u001aD\u0010\u001a\u001a\u00020\t*\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u001a\n\u0010\u001d\u001a\u00020\t*\u00020\u0003\u001a\u0014\u0010\u001e\u001a\u00020\t*\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010!\u001a\u00020\t*\u00020\u00032\b\b\u0001\u0010\"\u001a\u00020\u000b\u001a\u001b\u0010#\u001a\u00020\t*\u00020\u00032\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010$\u001a\u0014\u0010%\u001a\u00020\t*\u00020\u00032\b\b\u0001\u0010&\u001a\u00020\u000b\",\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\",\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\",\u0010\u0012\u001a\u0004\u0018\u00010\f*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006'"}, m3636d2 = {"value", "", "visibilityText", "Landroid/widget/TextView;", "getVisibilityText", "(Landroid/widget/TextView;)Ljava/lang/CharSequence;", "setVisibilityText", "(Landroid/widget/TextView;Ljava/lang/CharSequence;)V", "tintDrawables", "", ResourceTypes.COLOR, "", "Landroid/graphics/drawable/Drawable;", "drawableStart", "getDrawableStart", "(Landroid/widget/TextView;)Landroid/graphics/drawable/Drawable;", "setDrawableStart", "(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V", "drawableEnd", "getDrawableEnd", "setDrawableEnd", "setCompoundDrawablesRelative", "start", "top", "end", "bottom", "setDrawables", "useIntrinsicBounds", "", "clearDrawables", "setTextAndUpdateCursor", "Landroid/widget/EditText;", "text", "setTextAppearanceCompat", "resId", "setText", "(Landroid/widget/TextView;Ljava/lang/Integer;)V", "setTextAppearanceAttr", "attrRes", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TextViewsKt {
    public static final CharSequence getVisibilityText(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (textView.getVisibility() == 0) {
            return textView.getText();
        }
        return null;
    }

    public static final void setVisibilityText(TextView textView, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (charSequence == null || charSequence.length() == 0) {
            textView.setText("");
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }

    public static final void tintDrawables(TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        for (Drawable drawable : textView.getCompoundDrawablesRelative()) {
            if (drawable != null) {
                drawable.setTint(i);
            }
        }
    }

    public static final Drawable getDrawableStart(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getCompoundDrawables()[textView.getLayoutDirection() == 1 ? (char) 2 : (char) 0];
    }

    public static final void setDrawableStart(TextView textView, Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        setDrawables$default(textView, drawable, (Drawable) null, (Drawable) null, (Drawable) null, true, 14, (Object) null);
    }

    public static final Drawable getDrawableEnd(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getCompoundDrawables()[textView.getLayoutDirection() == 1 ? (char) 0 : (char) 2];
    }

    public static final void setDrawableEnd(TextView textView, Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        setDrawables$default(textView, (Drawable) null, (Drawable) null, drawable, (Drawable) null, true, 11, (Object) null);
    }

    public static /* synthetic */ void setCompoundDrawablesRelative$default(TextView textView, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        setCompoundDrawablesRelative(textView, i, i2, i3, i4);
    }

    public static final void setCompoundDrawablesRelative(TextView textView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelative(i != 0 ? textView.getContext().getDrawable(i) : null, i2 != 0 ? textView.getContext().getDrawable(i2) : null, i3 != 0 ? textView.getContext().getDrawable(i3) : null, i4 != 0 ? textView.getContext().getDrawable(i4) : null);
    }

    public static /* synthetic */ void setDrawables$default(TextView textView, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        if ((i5 & 16) != 0) {
            z = false;
        }
        setDrawables(textView, i, i2, i3, i4, z);
    }

    public static final void setDrawables(TextView textView, int i, int i2, int i3, int i4, boolean z) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (z) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            setCompoundDrawablesRelative(textView, i, i2, i3, i4);
        }
    }

    public static /* synthetic */ void setDrawables$default(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = null;
        }
        if ((i & 2) != 0) {
            drawable2 = null;
        }
        if ((i & 4) != 0) {
            drawable3 = null;
        }
        if ((i & 8) != 0) {
            drawable4 = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        setDrawables(textView, drawable, drawable2, drawable3, drawable4, z);
    }

    public static final void setDrawables(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (z) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static final void clearDrawables(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawables(null, null, null, null);
    }

    public static final void setTextAndUpdateCursor(EditText editText, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setText(charSequence);
        editText.setSelection(editText.getText().length());
    }

    public static final void setTextAppearanceCompat(TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        TextViewCompat.setTextAppearance(textView, i);
    }

    public static final void setText(TextView textView, Integer num) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (num != null) {
            textView.setText(num.intValue());
        } else {
            textView.setText((CharSequence) null);
        }
    }

    public static final void setTextAppearanceAttr(TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextAppearance(ContextsUiExtensions.requireThemeAttribute(context, i));
    }
}
