package com.robinhood.android.matcha.p177ui.search;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsCheckBox;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaSearchCheckBox.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchCheckBox;", "Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsCheckBox;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_TOGGLE, "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaSearchCheckBox extends NewRdsCheckBox {
    public static final int $stable = 8;

    @Override // com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView, android.widget.Checkable
    public void toggle() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaSearchCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
