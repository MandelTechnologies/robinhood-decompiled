package com.robinhood.android.equitydetail.p123ui.tradebar;

import android.content.res.Resources;
import com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.common.strings.C32428R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionItem.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/ActionItem;", "", "titleResId", "", "<init>", "(Ljava/lang/String;II)V", "getTitleResId", "()I", "OPTIONS", "LADDER", "SELL", "BUY_TO_OPEN", "BUY_TO_CLOSE", "SELL_SHORT", "toExpandAction", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction$LegacyExpandAction;", "res", "Landroid/content/res/Resources;", "isEnabled", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ActionItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActionItem[] $VALUES;
    private final int titleResId;
    public static final ActionItem OPTIONS = new ActionItem("OPTIONS", 0, C15314R.string.option_trade_label);
    public static final ActionItem LADDER = new ActionItem("LADDER", 1, C15314R.string.ladder_trade_label);
    public static final ActionItem SELL = new ActionItem("SELL", 2, C32428R.string.general_label_sell);
    public static final ActionItem BUY_TO_OPEN = new ActionItem("BUY_TO_OPEN", 3, C32428R.string.general_label_buy);
    public static final ActionItem BUY_TO_CLOSE = new ActionItem("BUY_TO_CLOSE", 4, C15314R.string.buy_to_close);
    public static final ActionItem SELL_SHORT = new ActionItem("SELL_SHORT", 5, C15314R.string.short_string);

    private static final /* synthetic */ ActionItem[] $values() {
        return new ActionItem[]{OPTIONS, LADDER, SELL, BUY_TO_OPEN, BUY_TO_CLOSE, SELL_SHORT};
    }

    public static EnumEntries<ActionItem> getEntries() {
        return $ENTRIES;
    }

    private ActionItem(String str, int i, int i2) {
        this.titleResId = i2;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    static {
        ActionItem[] actionItemArr$values = $values();
        $VALUES = actionItemArr$values;
        $ENTRIES = EnumEntries2.enumEntries(actionItemArr$values);
    }

    public final AbstractTradeBarOverlayView.ExpandAction.LegacyExpandAction toExpandAction(Resources res, boolean isEnabled) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        int iOrdinal = ordinal();
        String string2 = res.getString(this.titleResId);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new AbstractTradeBarOverlayView.ExpandAction.LegacyExpandAction(iOrdinal, string2, isEnabled);
    }

    public static ActionItem valueOf(String str) {
        return (ActionItem) Enum.valueOf(ActionItem.class, str);
    }

    public static ActionItem[] values() {
        return (ActionItem[]) $VALUES.clone();
    }
}
