package com.robinhood.android.common.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.robinhood.android.font.CustomTypefaceSpan2;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhTextInputLayout.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/view/RhTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onFinishInflate", "", "setError", "error", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RhTextInputLayout extends TextInputLayout {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhTextInputLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        EditText editText = getEditText();
        if (editText != null) {
            setTypeface(editText.getTypeface());
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setError(CharSequence error) {
        EditText editText = getEditText();
        if (editText != null && error != null) {
            Typeface typeface = editText.getTypeface();
            Intrinsics.checkNotNullExpressionValue(typeface, "getTypeface(...)");
            error = CustomTypefaceSpan2.withTypeface(error, typeface);
        }
        super.setError(error);
    }
}
