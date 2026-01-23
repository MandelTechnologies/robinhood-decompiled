package com.robinhood.android.options.statistics;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.utils.extensions.ViewGroups;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionUnderlyingStockView.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002R4\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionUnderlyingStockView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "Lcom/robinhood/models/ui/UiOptionUnderlier;", "uiOptionUnderliers", "getUiOptionUnderliers", "()Ljava/util/List;", "setUiOptionUnderliers", "(Ljava/util/List;)V", "refreshUi", "", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionUnderlyingStockView extends LinearLayout {
    public static final int $stable = 8;
    private List<UiOptionUnderlier> uiOptionUnderliers;

    public /* synthetic */ OptionUnderlyingStockView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionUnderlyingStockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
    }

    public final List<UiOptionUnderlier> getUiOptionUnderliers() {
        return this.uiOptionUnderliers;
    }

    public final void setUiOptionUnderliers(List<UiOptionUnderlier> list) {
        this.uiOptionUnderliers = list;
        refreshUi();
    }

    private final void refreshUi() {
        removeAllViews();
        List<UiOptionUnderlier> list = this.uiOptionUnderliers;
        if (list == null) {
            return;
        }
        ViewGroups.inflate(this, C23799R.layout.option_statview_divider, true);
        for (UiOptionUnderlier uiOptionUnderlier : list) {
            View viewInflate = ViewGroups.inflate(this, C23799R.layout.option_statview_row, false);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.options.statistics.OptionStatView");
            OptionStatView optionStatView = (OptionStatView) viewInflate;
            optionStatView.setLabelText(uiOptionUnderlier.getInstrument().getSymbol());
            optionStatView.setValueText(getResources().getQuantityString(C11048R.plurals.general_number_of_shares, uiOptionUnderlier.getUnderlier().getQuantity(), Formats.getShareQuantityFormat().format(Integer.valueOf(uiOptionUnderlier.getUnderlier().getQuantity()))));
            addView(optionStatView);
            ViewGroups.inflate(this, C23799R.layout.option_statview_divider, true);
        }
    }
}
