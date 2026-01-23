package com.robinhood.android.transfers.history;

import android.content.res.Resources;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.C31333R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.history.PaymentIntentHistoryDetailViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.bff.PaymentIntent;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.format.InstantFormatter;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: PaymentIntentHistoryDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDataState;", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState;", "res", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "createDataRows", "", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState$DataRow;", "paymentIntent", "Lcom/robinhood/models/db/bff/PaymentIntent;", "bankAccountDisplayName", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PaymentIntentHistoryDetailStateProvider implements StateProvider<PaymentIntentHistoryDetailDataState, PaymentIntentHistoryDetailViewState> {
    public static final int $stable = 8;
    private final Resources res;

    /* compiled from: PaymentIntentHistoryDetailStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentIntent.Direction.values().length];
            try {
                iArr[PaymentIntent.Direction.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentIntent.Direction.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentIntentHistoryDetailStateProvider(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        this.res = res;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public PaymentIntentHistoryDetailViewState reduce(PaymentIntentHistoryDetailDataState dataState) throws Resources.NotFoundException {
        String string2;
        int i;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        PaymentIntent paymentIntent = dataState.getPaymentIntent();
        if (paymentIntent == null) {
            return PaymentIntentHistoryDetailViewState.Loading.INSTANCE;
        }
        PaymentInstrumentV2 paymentInstrument = dataState.getPaymentInstrument();
        PaymentInstrumentDetailsV2 details = paymentInstrument != null ? paymentInstrument.getDetails() : null;
        PaymentInstrumentDetailsV2.I18nBankAccount i18nBankAccount = details instanceof PaymentInstrumentDetailsV2.I18nBankAccount ? (PaymentInstrumentDetailsV2.I18nBankAccount) details : null;
        if (i18nBankAccount != null) {
            string2 = this.res.getString(C30065R.string.sg_bank_transfer_bank_name_last_four, i18nBankAccount.getBankName(), i18nBankAccount.getLastFour());
        } else {
            string2 = this.res.getString(C30065R.string.sg_bank_transfer_bank_account);
        }
        Intrinsics.checkNotNull(string2);
        String str = Money.Adjustment.format$default(paymentIntent.getAdjustment(), false, null, 3, null);
        Resources resources = this.res;
        int i2 = WhenMappings.$EnumSwitchMapping$0[paymentIntent.getDirection().ordinal()];
        if (i2 == 1) {
            i = C30065R.string.payment_intent_deposit_subtitle;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C30065R.string.payment_intent_withdraw_subtitle;
        }
        String string3 = resources.getString(i, this.res.getString(PaymentIntentHistoryDetailStateProvider2.getPurposeResId(paymentIntent.getPurpose())), string2);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new PaymentIntentHistoryDetailViewState.Content(str, string3, createDataRows(paymentIntent, string2));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<PaymentIntentHistoryDetailViewState.DataRow> createDataRows(PaymentIntent paymentIntent, String bankAccountDisplayName) throws Resources.NotFoundException {
        String str;
        String string2;
        PaymentIntentHistoryDetailViewState.DataRow dataRow;
        PaymentIntentHistoryDetailViewState.DataRow dataRow2;
        PaymentIntentHistoryDetailViewState.DataRow dataRow3;
        PaymentIntentHistoryDetailViewState.DataRow dataRow4;
        String string3 = this.res.getString(C11048R.string.general_label_status);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = this.res.getString(PaymentIntentHistoryDetailStateProvider2.getResId(paymentIntent.getState()));
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        PaymentIntentHistoryDetailViewState.DataRow dataRow5 = new PaymentIntentHistoryDetailViewState.DataRow(string3, string4, false, 4, null);
        String string5 = this.res.getString(C11048R.string.general_label_from);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        PaymentIntent.Direction direction = paymentIntent.getDirection();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[direction.ordinal()];
        if (i == 1) {
            str = bankAccountDisplayName;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String string6 = this.res.getString(C8179R.string.account_individual_title);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            str = string6;
        }
        PaymentIntentHistoryDetailViewState.DataRow dataRow6 = new PaymentIntentHistoryDetailViewState.DataRow(string5, str, false, 4, null);
        String string7 = this.res.getString(C11048R.string.general_label_to);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        int i2 = iArr[paymentIntent.getDirection().ordinal()];
        if (i2 == 1) {
            string2 = this.res.getString(C8179R.string.account_individual_title);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = bankAccountDisplayName;
        }
        Intrinsics.checkNotNull(string2);
        PaymentIntentHistoryDetailViewState.DataRow dataRow7 = new PaymentIntentHistoryDetailViewState.DataRow(string7, string2, false, 4, null);
        PaymentIntentHistoryDetailViewState.DataRow dataRow8 = null;
        if (paymentIntent.getFxTransferDetails() != null) {
            String string8 = this.res.getString(C30065R.string.payment_intent_original_amount_label);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            dataRow = new PaymentIntentHistoryDetailViewState.DataRow(string8, Money.format$default(paymentIntent.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), false, 4, null);
        } else {
            dataRow = null;
        }
        Money serviceFee = paymentIntent.getServiceFee();
        if (serviceFee == null) {
            dataRow2 = null;
        } else {
            Money money = paymentIntent.getPurpose() == PaymentIntent.Purpose.I18N_WIRE_TRANSFER ? serviceFee : null;
            if (money != null) {
                String string9 = this.res.getString(C30065R.string.payment_intent_service_fee_label);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                dataRow2 = new PaymentIntentHistoryDetailViewState.DataRow(string9, Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null), false, 4, null);
            }
        }
        Money taxAmount = paymentIntent.getTaxAmount();
        if (taxAmount == null) {
            dataRow3 = null;
        } else {
            Money money2 = paymentIntent.getPurpose() == PaymentIntent.Purpose.I18N_WIRE_TRANSFER ? taxAmount : null;
            if (money2 != null) {
                String string10 = this.res.getString(C30065R.string.payment_intent_tax_amount_label);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                dataRow3 = new PaymentIntentHistoryDetailViewState.DataRow(string10, Money.format$default(money2, null, false, null, false, 0, null, false, null, false, false, 1023, null), false, 4, null);
            }
        }
        PaymentIntent.FxTransferDetails fxTransferDetails = paymentIntent.getFxTransferDetails();
        if (fxTransferDetails == null) {
            dataRow4 = null;
        } else {
            if (paymentIntent.getPurpose() != PaymentIntent.Purpose.I18N_WIRE_TRANSFER) {
                fxTransferDetails = null;
            }
            if (fxTransferDetails != null) {
                String string11 = this.res.getString(C30065R.string.payment_intent_transfer_amount_label);
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                dataRow4 = new PaymentIntentHistoryDetailViewState.DataRow(string11, Money.format$default(paymentIntent.getReceivedAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), false, 4, null);
            }
        }
        PaymentIntent.FxTransferDetails fxTransferDetails2 = paymentIntent.getFxTransferDetails();
        if (fxTransferDetails2 != null) {
            String string12 = this.res.getString(C30065R.string.payment_intent_fx_rate_label);
            Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
            Resources resources = this.res;
            int i3 = C30065R.string.payment_intent_fx_rate_value;
            String baseCurrency = fxTransferDetails2.getBaseCurrency();
            BigDecimal actualTargetFxRate = fxTransferDetails2.getActualTargetFxRate();
            if (actualTargetFxRate == null) {
                actualTargetFxRate = fxTransferDetails2.getTargetFxRate();
            }
            String string13 = resources.getString(i3, baseCurrency, actualTargetFxRate, fxTransferDetails2.getTargetCurrency());
            Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
            dataRow8 = new PaymentIntentHistoryDetailViewState.DataRow(string12, string13, true);
        }
        String string14 = this.res.getString(C30065R.string.payment_intent_created_at_label);
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        Instant createdAt = paymentIntent.getCreatedAt();
        InstantFormatter instantFormatter = InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE;
        PaymentIntentHistoryDetailViewState.DataRow dataRow9 = new PaymentIntentHistoryDetailViewState.DataRow(string14, instantFormatter.format((InstantFormatter) createdAt), false, 4, null);
        String string15 = this.res.getString(C31333R.string.last_updated_label);
        Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
        return CollectionsKt.listOfNotNull((Object[]) new PaymentIntentHistoryDetailViewState.DataRow[]{dataRow5, dataRow6, dataRow7, dataRow, dataRow2, dataRow3, dataRow4, dataRow8, dataRow9, new PaymentIntentHistoryDetailViewState.DataRow(string15, instantFormatter.format((InstantFormatter) paymentIntent.getUpdatedAt()), false, 4, null)});
    }
}
