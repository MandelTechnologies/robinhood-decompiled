package com.robinhood.android.equity;

import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.rosetta.eventlogging.EquityOrderMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderSourceLogging.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toMetaSource", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "lib-equity-validation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.EquityOrderSourceLoggingKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityOrderSourceLogging {

    /* compiled from: EquityOrderSourceLogging.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equity.EquityOrderSourceLoggingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderFlowSource.values().length];
            try {
                iArr[EquityOrderFlowSource.SDP_TRADE_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderFlowSource.INSTRUMENT_ROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderFlowSource.ORDER_DETAIL_EXTEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EquityOrderFlowSource.ORDER_DETAIL_IPO_EDIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final EquityOrderMeta.Source toMetaSource(EquityOrderFlowSource equityOrderFlowSource) {
        Intrinsics.checkNotNullParameter(equityOrderFlowSource, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[equityOrderFlowSource.ordinal()];
        if (i == 1) {
            return EquityOrderMeta.Source.SOURCE_STOCK_DETAIL;
        }
        if (i == 2) {
            return EquityOrderMeta.Source.SOURCE_INSTRUMENT_ROW;
        }
        if (i == 3) {
            return EquityOrderMeta.Source.SOURCE_ORDER_DETAIL;
        }
        if (i == 4) {
            return EquityOrderMeta.Source.SOURCE_ORDER_DETAIL;
        }
        return EquityOrderMeta.Source.SOURCE_UNSPECIFIED;
    }
}
