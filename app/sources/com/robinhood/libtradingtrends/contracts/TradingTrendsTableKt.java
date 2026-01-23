package com.robinhood.libtradingtrends.contracts;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import microgram.p507ui.sdui.SduiIcon;

/* compiled from: TradingTrendsTable.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"icon", "Lmicrogram/ui/sdui/SduiIcon;", "Lcom/robinhood/libtradingtrends/contracts/SortDirection;", "getIcon", "(Lcom/robinhood/libtradingtrends/contracts/SortDirection;)Lmicrogram/ui/sdui/SduiIcon;", "contracts"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TradingTrendsTableKt {

    /* compiled from: TradingTrendsTable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SortDirection.values().length];
            try {
                iArr[SortDirection.ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortDirection.DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SduiIcon getIcon(SortDirection sortDirection) {
        Intrinsics.checkNotNullParameter(sortDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[sortDirection.ordinal()];
        if (i == 1) {
            return SduiIcon.ARROW_UP_12;
        }
        if (i == 2) {
            return SduiIcon.ARROW_DOWN_12;
        }
        throw new NoWhenBranchMatchedException();
    }
}
