package com.robinhood.android.designsystem.button;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import com.robinhood.android.designsystem.text.RdsUnderlineSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsTextButton.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/designsystem/button/RdsTextButton;", "Lcom/google/android/material/textview/MaterialTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "underlineSpan", "Lcom/robinhood/android/designsystem/text/RdsUnderlineSpan;", "setText", "", "text", "", "type", "Landroid/widget/TextView$BufferType;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public class RdsTextButton extends MaterialTextView {
    private final RdsUnderlineSpan underlineSpan;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsTextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.underlineSpan = new RdsUnderlineSpan(resources, false);
        setText(getText());
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type2) {
        SpannableString spannableString = new SpannableString(String.valueOf(text));
        spannableString.setSpan(this.underlineSpan, 0, spannableString.length(), 0);
        super.setText(spannableString, type2);
    }
}
