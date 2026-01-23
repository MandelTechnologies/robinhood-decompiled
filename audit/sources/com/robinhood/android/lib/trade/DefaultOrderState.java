package com.robinhood.android.lib.trade;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DefaultOrderState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fj\u0002\b\bj\u0002\b\t¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/DefaultOrderState;", "Lcom/robinhood/android/lib/trade/OrderState;", "", "isReviewingState", "", "<init>", "(Ljava/lang/String;IZ)V", "()Z", "EDITING", "REVIEWING", "nextState", "getNextState", "()Lcom/robinhood/android/lib/trade/DefaultOrderState;", "previousState", "getPreviousState", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DefaultOrderState implements OrderState<DefaultOrderState> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DefaultOrderState[] $VALUES;
    public static final DefaultOrderState EDITING = new DefaultOrderState("EDITING", 0, false);
    public static final DefaultOrderState REVIEWING = new DefaultOrderState("REVIEWING", 1, true);
    private final boolean isReviewingState;

    /* compiled from: DefaultOrderState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DefaultOrderState.values().length];
            try {
                iArr[DefaultOrderState.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DefaultOrderState.REVIEWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ DefaultOrderState[] $values() {
        return new DefaultOrderState[]{EDITING, REVIEWING};
    }

    public static EnumEntries<DefaultOrderState> getEntries() {
        return $ENTRIES;
    }

    private DefaultOrderState(String str, int i, boolean z) {
        this.isReviewingState = z;
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    /* renamed from: isReviewingState, reason: from getter */
    public boolean getIsReviewingState() {
        return this.isReviewingState;
    }

    static {
        DefaultOrderState[] defaultOrderStateArr$values = $values();
        $VALUES = defaultOrderStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(defaultOrderStateArr$values);
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    public DefaultOrderState getNextState() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return REVIEWING;
        }
        if (i == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    public DefaultOrderState getPreviousState() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return EDITING;
    }

    public static DefaultOrderState valueOf(String str) {
        return (DefaultOrderState) Enum.valueOf(DefaultOrderState.class, str);
    }

    public static DefaultOrderState[] values() {
        return (DefaultOrderState[]) $VALUES.clone();
    }
}
