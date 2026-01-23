package com.robinhood.android.options.statistics;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionStatView.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStatView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "valueTxt", "Landroid/widget/TextView;", "labelTxt", "value", "", "valueText", "getValueText", "()Ljava/lang/CharSequence;", "setValueText", "(Ljava/lang/CharSequence;)V", "labelText", "getLabelText", "setLabelText", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStatView extends LinearLayout {
    public static final int $stable = 8;
    private final TextView labelTxt;
    private final TextView valueTxt;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OptionStatView(Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OptionStatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OptionStatView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OptionStatView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OptionStatView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C23799R.layout.merge_option_stat_view, this);
        View viewFindViewById = findViewById(C23799R.id.stat_value_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.valueTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C23799R.id.stat_label_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.labelTxt = (TextView) viewFindViewById2;
        int[] OptionStatView = C23799R.styleable.OptionStatView;
        Intrinsics.checkNotNullExpressionValue(OptionStatView, "OptionStatView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OptionStatView, i, i2);
        String string2 = typedArrayObtainStyledAttributes.getString(C23799R.styleable.OptionStatView_valueText);
        setValueText(string2 == null ? "" : string2);
        String string3 = typedArrayObtainStyledAttributes.getString(C23799R.styleable.OptionStatView_labelText);
        setLabelText(string3 != null ? string3 : "");
        typedArrayObtainStyledAttributes.recycle();
    }

    public final CharSequence getValueText() {
        return this.valueTxt.getText();
    }

    public final void setValueText(CharSequence charSequence) {
        this.valueTxt.setText(charSequence);
    }

    public final CharSequence getLabelText() {
        CharSequence text = this.labelTxt.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    public final void setLabelText(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.labelTxt.setText(value);
    }
}
