package com.robinhood.shared.portfolio.listsswipenux;

import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwipeContext.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"getHistoryTransactionTypes", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeContext;", "lib-lists-swipe-nux_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.listsswipenux.SwipeContextKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SwipeContext2 {

    /* compiled from: SwipeContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.listsswipenux.SwipeContextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SwipeContext.values().length];
            try {
                iArr[SwipeContext.EQUITY_WATCHLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeContext.FUTURES_POSITIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Set<HistoryTransactionType> getHistoryTransactionTypes(SwipeContext swipeContext) {
        Intrinsics.checkNotNullParameter(swipeContext, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[swipeContext.ordinal()];
        if (i == 1) {
            return SetsKt.setOf(HistoryTransactionType.EQUITY_ORDER);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return SetsKt.setOf(HistoryTransactionType.FUTURES_ORDER);
    }
}
