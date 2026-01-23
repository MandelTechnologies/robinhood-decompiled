package com.robinhood.android.settings.p254ui.recurring;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentScheduleDataView.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/InvestmentScheduleDataView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "valueText", "getValueText", "()Ljava/lang/CharSequence;", "setValueText", "(Ljava/lang/CharSequence;)V", "labelText", "getLabelText", "setLabelText", "valueTextView", "Landroid/widget/TextView;", "labelTextView", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class InvestmentScheduleDataView extends LinearLayout {
    public static final int $stable = 8;
    private final TextView labelTextView;
    private final TextView valueTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentScheduleDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C28446R.layout.merge_investment_schedule_data_view, this);
        setOrientation(1);
        View viewFindViewById = findViewById(C28446R.id.row_value_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.valueTextView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C28446R.id.row_label_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.labelTextView = (TextView) viewFindViewById2;
        int[] InvestmentScheduleDataView = C28446R.styleable.InvestmentScheduleDataView;
        Intrinsics.checkNotNullExpressionValue(InvestmentScheduleDataView, "InvestmentScheduleDataView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, InvestmentScheduleDataView, 0, 0);
        setValueText(typedArrayObtainStyledAttributes.getText(C28446R.styleable.InvestmentScheduleDataView_valueText));
        setLabelText(typedArrayObtainStyledAttributes.getText(C28446R.styleable.InvestmentScheduleDataView_labelText));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final CharSequence getValueText() {
        CharSequence text = this.valueTextView.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final void setValueText(CharSequence charSequence) {
        this.valueTextView.setText(charSequence);
    }

    public final CharSequence getLabelText() {
        CharSequence text = this.labelTextView.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final void setLabelText(CharSequence charSequence) {
        this.labelTextView.setText(charSequence);
    }
}
