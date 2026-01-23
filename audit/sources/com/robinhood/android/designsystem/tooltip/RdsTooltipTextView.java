package com.robinhood.android.designsystem.tooltip;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import com.robinhood.android.designsystem.text.RhTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsTooltipTextView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/tooltip/RdsTooltipTextView;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "getMaxLineWidth", "", "currentLayout", "Landroid/text/Layout;", "determineBreakStrategy", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RdsTooltipTextView extends RhTextView {
    public /* synthetic */ RdsTooltipTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsTooltipTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Layout layout = getLayout();
        if (layout != null) {
            if (getLayoutParams().width == -2) {
                setMeasuredDimension(((int) Math.ceil(getMaxLineWidth(layout))) + getCompoundPaddingLeft() + getCompoundPaddingRight(), getMeasuredHeight());
            }
            determineBreakStrategy(layout);
        }
    }

    private final float getMaxLineWidth(Layout currentLayout) {
        int lineCount = currentLayout.getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            float lineWidth = currentLayout.getLineWidth(i);
            if (lineWidth > f) {
                f = lineWidth;
            }
        }
        return f;
    }

    private final void determineBreakStrategy(Layout currentLayout) {
        if (currentLayout.getLineCount() == 0) {
            return;
        }
        setBreakStrategy((currentLayout.getEllipsisCount(currentLayout.getLineCount() + (-1)) <= 0 && getLayoutParams().width != -1) ? 2 : 0);
    }
}
