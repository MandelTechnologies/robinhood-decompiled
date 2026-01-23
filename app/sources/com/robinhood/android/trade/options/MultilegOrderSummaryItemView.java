package com.robinhood.android.trade.options;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultilegOrderSummaryItemView.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/trade/options/MultilegOrderSummaryItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "leftTxt", "Landroid/widget/TextView;", "rightTxt", "setText", "", "left", "", "right", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class MultilegOrderSummaryItemView extends ConstraintLayout {
    public static final int $stable = 8;
    private final TextView leftTxt;
    private final TextView rightTxt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultilegOrderSummaryItemView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C29757R.layout.merge_option_multileg_order_summary_item, this);
        View viewFindViewById = findViewById(C29757R.id.option_order_multileg_left_summary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.leftTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C29757R.id.option_order_multileg_right_summary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.rightTxt = (TextView) viewFindViewById2;
    }

    public final void setText(CharSequence left, CharSequence right) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        this.leftTxt.setText(left);
        this.rightTxt.setText(right);
    }
}
