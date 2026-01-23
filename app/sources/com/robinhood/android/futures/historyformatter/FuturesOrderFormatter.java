package com.robinhood.android.futures.historyformatter;

import android.content.res.Resources;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.p189db.FuturesOrder;
import com.robinhood.common.strings.C32428R;
import com.robinhood.common.strings.OrderStates;
import com.robinhood.shared.models.history.FuturesOrderTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.OrderState;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesOrderFormatter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0002¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/futures/historyformatter/FuturesOrderFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/FuturesOrderTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "hasCompletedExceptionally", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getPrimaryText", "", "getLineItems", "", "getAmountText", "getMetadataSecondaryText", "getQuantityAndPriceText", "lib-futures-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesOrderFormatter extends AbstractMinervaTransactionFormatter<FuturesOrderTransaction> {

    /* compiled from: FuturesOrderFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesTimeInForce.values().length];
            try {
                iArr[FuturesTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesTimeInForce.IOC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FuturesTimeInForce.GTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FuturesTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((FuturesOrderTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOrderFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(FuturesOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getOrder().getOrderState().toCommonState().isSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(FuturesOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        FuturesOrder order = transaction.getEvent().getOrder();
        Boolean boolIsSuccessful = order.getOrderState().toCommonState().isSuccessful();
        if (Intrinsics.areEqual(boolIsSuccessful, Boolean.TRUE)) {
            return null;
        }
        if (boolIsSuccessful == null) {
            return new TransactionSummary.Badge(OrderStates.getOrderStateString(order.getOrderState().toCommonState(), getResources()), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        if (!Intrinsics.areEqual(boolIsSuccessful, Boolean.FALSE)) {
            throw new NoWhenBranchMatchedException();
        }
        return new TransactionSummary.Badge(OrderStates.getOrderStateString(order.getOrderState().toCommonState(), getResources()), TransactionSummary.Tint.NEGATIVE, false, 4, null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(FuturesOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return FuturesOrderFormatter2.getOrderDisplayStringWithSymbol(transaction.getEvent(), transaction.getContract().getContract().getDisplaySymbol()).getText(getResources());
    }

    public Void getLineItems(FuturesOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("FuturesOrders currently have their own history detail");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(FuturesOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        OrderState commonState = transaction.getEvent().getOrder().getOrderState().toCommonState();
        if (Intrinsics.areEqual(commonState.isSuccessful(), Boolean.TRUE)) {
            return super.getAmountText((FuturesOrderFormatter) transaction);
        }
        if (commonState.isPending()) {
            return getQuantityAndPriceText(transaction);
        }
        return "";
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(FuturesOrderTransaction transaction) {
        int i;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        OrderState commonState = transaction.getEvent().getOrder().getOrderState().toCommonState();
        if (Intrinsics.areEqual(commonState.isSuccessful(), Boolean.TRUE)) {
            return getQuantityAndPriceText(transaction);
        }
        if (!commonState.isPending()) {
            return null;
        }
        Resources resources = getResources();
        int i2 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getOrder().getTimeInForce().ordinal()];
        if (i2 == 1) {
            i = C32428R.string.order_time_in_force_gfd;
        } else if (i2 == 2) {
            i = C32428R.string.order_time_in_force_gtc_no_limit;
        } else if (i2 == 3) {
            i = C32428R.string.order_time_in_force_ioc;
        } else if (i2 == 4) {
            i = C32428R.string.order_time_in_force_gtd;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = C32428R.string.order_time_in_force_fok;
        }
        return resources.getString(i);
    }

    private final CharSequence getQuantityAndPriceText(FuturesOrderTransaction transaction) throws Resources.NotFoundException {
        String string2;
        BigDecimal bigDecimalM822m;
        FuturesOrder order = transaction.getEvent().getOrder();
        BigDecimal averageFilledPrice = order.getAverageFilledPrice();
        if (averageFilledPrice == null && (averageFilledPrice = order.getLimitPrice()) == null) {
            averageFilledPrice = order.getStopPrice();
        }
        if (averageFilledPrice == null || (bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(averageFilledPrice)) == null || (string2 = FuturesProduct5.format$default(transaction.getContract().getProduct(), bigDecimalM822m, null, 2, null)) == null) {
            string2 = getResources().getString(C32428R.string.order_market_label);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        String string3 = getResources().getString(C17283R.string.futures_filled_description, Formats.getIntegerDeltaFormat().format(transaction.getEvent().getSignedQuantityForHistory()), string2);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }
}
