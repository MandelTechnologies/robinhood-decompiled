package com.robinhood.android.investFlow;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestFlowConstants.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/investFlow/InvestFlowConstants;", "", "<init>", "()V", "MAX_CART_ITEMS", "", "MAX_RECURRING_AMOUNT", "MAX_ONE_TIME_AMOUNT", "BOTTOM_PADDING_FOR_CART", "Landroidx/compose/ui/unit/Dp;", "getBOTTOM_PADDING_FOR_CART-D9Ej5fM$feature_invest_flow_externalDebug", "()F", "F", "Logging", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowConstants {
    public static final int $stable = 0;
    public static final int MAX_CART_ITEMS = 10;
    public static final int MAX_ONE_TIME_AMOUNT = 1000000;
    public static final int MAX_RECURRING_AMOUNT = 10000;
    public static final InvestFlowConstants INSTANCE = new InvestFlowConstants();
    private static final float BOTTOM_PADDING_FOR_CART = C2002Dp.m7995constructorimpl(72);

    private InvestFlowConstants() {
    }

    /* renamed from: getBOTTOM_PADDING_FOR_CART-D9Ej5fM$feature_invest_flow_externalDebug */
    public final float m2112xf5ebf6ab() {
        return BOTTOM_PADDING_FOR_CART;
    }

    /* compiled from: InvestFlowConstants.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/investFlow/InvestFlowConstants$Logging;", "", "<init>", "()V", "STOCKS_AND_ETFS", "", Logging.CRYPTOS, Logging.OVER_MAX_AMOUNT, Logging.ONE_DOLLAR_MIN, Logging.ORDER_TOTAL_MISMATCH, Logging.MARGIN_REMINDER, Logging.WITHDRAW_LIMIT, "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Logging {
        public static final int $stable = 0;
        public static final String CRYPTOS = "CRYPTOS";
        public static final Logging INSTANCE = new Logging();
        public static final String MARGIN_REMINDER = "MARGIN_REMINDER";
        public static final String ONE_DOLLAR_MIN = "ONE_DOLLAR_MIN";
        public static final String ORDER_TOTAL_MISMATCH = "ORDER_TOTAL_MISMATCH";
        public static final String OVER_MAX_AMOUNT = "OVER_MAX_AMOUNT";
        public static final String STOCKS_AND_ETFS = "STOCKS_N_ETFS";
        public static final String WITHDRAW_LIMIT = "WITHDRAW_LIMIT";

        private Logging() {
        }
    }
}
