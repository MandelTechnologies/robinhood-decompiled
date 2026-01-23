package com.robinhood.android.trade.recommendations.p262ui.order;

import com.robinhood.android.lib.trade.OrderState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecommendationsOrderState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rj\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderState;", "Lcom/robinhood/android/lib/trade/OrderState;", "", "isReviewingState", "", "<init>", "(Ljava/lang/String;IZ)V", "()Z", "INPUT", "BREAKDOWN_REVIEW", "SWIPE_UP", "nextState", "getNextState", "()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderState;", "previousState", "getPreviousState", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecommendationsOrderState implements OrderState<RecommendationsOrderState> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecommendationsOrderState[] $VALUES;
    private final boolean isReviewingState;
    public static final RecommendationsOrderState INPUT = new RecommendationsOrderState("INPUT", 0, false);
    public static final RecommendationsOrderState BREAKDOWN_REVIEW = new RecommendationsOrderState("BREAKDOWN_REVIEW", 1, false);
    public static final RecommendationsOrderState SWIPE_UP = new RecommendationsOrderState("SWIPE_UP", 2, true);

    /* compiled from: RecommendationsOrderState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecommendationsOrderState.values().length];
            try {
                iArr[RecommendationsOrderState.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendationsOrderState.BREAKDOWN_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecommendationsOrderState.SWIPE_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ RecommendationsOrderState[] $values() {
        return new RecommendationsOrderState[]{INPUT, BREAKDOWN_REVIEW, SWIPE_UP};
    }

    public static EnumEntries<RecommendationsOrderState> getEntries() {
        return $ENTRIES;
    }

    private RecommendationsOrderState(String str, int i, boolean z) {
        this.isReviewingState = z;
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    /* renamed from: isReviewingState, reason: from getter */
    public boolean getIsReviewingState() {
        return this.isReviewingState;
    }

    static {
        RecommendationsOrderState[] recommendationsOrderStateArr$values = $values();
        $VALUES = recommendationsOrderStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(recommendationsOrderStateArr$values);
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    public RecommendationsOrderState getNextState() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return BREAKDOWN_REVIEW;
        }
        if (i != 2) {
            return null;
        }
        return SWIPE_UP;
    }

    @Override // com.robinhood.android.lib.trade.OrderState
    public RecommendationsOrderState getPreviousState() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 2) {
            return INPUT;
        }
        if (i != 3) {
            return null;
        }
        return BREAKDOWN_REVIEW;
    }

    public static RecommendationsOrderState valueOf(String str) {
        return (RecommendationsOrderState) Enum.valueOf(RecommendationsOrderState.class, str);
    }

    public static RecommendationsOrderState[] values() {
        return (RecommendationsOrderState[]) $VALUES.clone();
    }
}
