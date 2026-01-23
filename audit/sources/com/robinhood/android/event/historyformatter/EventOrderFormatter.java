package com.robinhood.android.event.historyformatter;

import android.content.res.Resources;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.futures.historyformatter.C17283R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.event.p186db.order.EventOrder;
import com.robinhood.android.models.event.p186db.order.EventOrder4;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.common.strings.OrderStates;
import com.robinhood.shared.models.history.EventOrderTransaction;
import com.robinhood.shared.models.history.shared.OrderState;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventOrderFormatter.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/event/historyformatter/EventOrderFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/EventOrderTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getSecondaryText", "getYesOrNoWithContractName", "", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getAmountText", "getMetadataSecondaryText", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "hasCompletedExceptionally", "", "lib-futures-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventOrderFormatter extends AbstractMinervaTransactionFormatter<EventOrderTransaction> {

    /* compiled from: EventOrderFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EventOrder4.values().length];
            try {
                iArr[EventOrder4.OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventOrder4.POSITION_EFFECT_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventOrder4.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventOrderSide.values().length];
            try {
                iArr2[EventOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EventOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventOrderFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(EventOrderTransaction transaction) throws Resources.NotFoundException {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        EventOrder order = transaction.getEvent().getOrder();
        if (transaction.isInLimitOrderNotionalExperiment()) {
            String yesOrNoWithContractName = getYesOrNoWithContractName(transaction);
            int i3 = WhenMappings.$EnumSwitchMapping$0[order.getPositionEffect().ordinal()];
            if (i3 == 1 || i3 == 2) {
                i2 = C17283R.string.order_description_limit_buy_with_symbol;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C17283R.string.order_description_limit_sell_with_symbol;
            }
            String string2 = getResources().getString(i2, yesOrNoWithContractName);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[order.getPositionEffect().ordinal()];
        if (i4 == 1 || i4 == 2) {
            int i5 = WhenMappings.$EnumSwitchMapping$1[transaction.getEvent().getSide().ordinal()];
            if (i5 == 1) {
                i = C17283R.string.event_buy_yes;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C17283R.string.event_buy_no;
            }
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = WhenMappings.$EnumSwitchMapping$1[transaction.getEvent().getSide().ordinal()];
            if (i6 == 1) {
                i = C17283R.string.event_sell_no;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C17283R.string.event_sell_yes;
            }
        }
        String string3 = getResources().getString(i, transaction.getContract().getDisplayShortName());
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getSecondaryText(EventOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        CharSequence secondaryText = getSecondaryText(transaction.getEvent());
        ContractDisplayDetails displayDetails = transaction.getDisplayDetails();
        String historyOrderRowYesNoAndContractSecondaryText = displayDetails != null ? displayDetails.getHistoryOrderRowYesNoAndContractSecondaryText() : null;
        if (historyOrderRowYesNoAndContractSecondaryText == null) {
            return secondaryText;
        }
        return historyOrderRowYesNoAndContractSecondaryText + " · " + ((Object) secondaryText);
    }

    private final String getYesOrNoWithContractName(EventOrderTransaction transaction) throws Resources.NotFoundException {
        int i;
        ContractDisplayDetails displayDetails = transaction.getDisplayDetails();
        if (displayDetails != null) {
            return displayDetails.getContractTitleName();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getOrder().getPositionEffect().ordinal()];
        if (i2 == 1 || i2 == 2) {
            int i3 = WhenMappings.$EnumSwitchMapping$1[transaction.getEvent().getSide().ordinal()];
            if (i3 == 1) {
                i = C17283R.string.event_yes;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C17283R.string.event_no;
            }
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = WhenMappings.$EnumSwitchMapping$1[transaction.getEvent().getSide().ordinal()];
            if (i4 == 1) {
                i = C17283R.string.event_no;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C17283R.string.event_yes;
            }
        }
        String string2 = getResources().getString(i, transaction.getContract().getDisplayShortName());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(EventOrderTransaction transaction) throws Resources.NotFoundException {
        TransactionSummary.Tint tint;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        OrderState commonState = transaction.getEvent().getOrder().getOrderState().toCommonState();
        String orderStateString = OrderStates.getOrderStateString(commonState, getResources());
        if (Intrinsics.areEqual(commonState.isSuccessful(), Boolean.FALSE)) {
            tint = TransactionSummary.Tint.NEGATIVE;
        } else {
            tint = TransactionSummary.Tint.FOREGROUND_2;
        }
        return new TransactionSummary.Badge(orderStateString, tint, false, 4, null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(EventOrderTransaction transaction) {
        String str;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        BigDecimal bigDecimalSignedAdjustmentAmount = transaction.getEvent().signedAdjustmentAmount();
        return (bigDecimalSignedAdjustmentAmount == null || (str = Formats.getCurrencyDeltaFormat().format(bigDecimalSignedAdjustmentAmount)) == null) ? "" : str;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(EventOrderTransaction transaction) {
        BigDecimal bigDecimalDisplayPrice;
        BigDecimal bigDecimalM822m;
        String str;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        UiEventOrder event = transaction.getEvent();
        if (!event.getOrder().getOrderState().toCommonState().hasExecutions() || (bigDecimalDisplayPrice = event.displayPrice()) == null || (bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalDisplayPrice)) == null || (str = Formats.getPriceFormat().format(bigDecimalM822m)) == null) {
            return null;
        }
        return getResources().getQuantityString(C17283R.plurals.event_filled_description, event.getOrder().getFilledQuantity().intValue(), Formats.getIntegerFormat().format(event.getOrder().getFilledQuantity()), str);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(EventOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Provided by EventOrderHistoryDetailResolver");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(EventOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getOrder().getOrderState().isSuccessful(), Boolean.FALSE);
    }
}
