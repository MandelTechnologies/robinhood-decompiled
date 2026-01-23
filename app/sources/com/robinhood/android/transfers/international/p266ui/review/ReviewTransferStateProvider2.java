package com.robinhood.android.transfers.international.p266ui.review;

import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.international.C30310R;
import com.robinhood.android.transfers.international.p266ui.model.FxData;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.international.p266ui.review.ReviewTransferViewState;
import com.robinhood.android.transfers.international.p266ui.util.AnnotatedString3;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.android.transfers.international.p266ui.util.McwFxRateExtensions;
import com.robinhood.android.transfers.international.p266ui.util.MoneyDtos;
import com.robinhood.android.transfers.international.p266ui.util.PaymentInstrument2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: ReviewTransferStateProvider.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\u0007*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\"\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\t\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"amountViewState", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDataState;", "getAmountViewState", "(Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDataState;)Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState;", "dataRows", "", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$DataRow;", "getDataRows", "(Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDataState;)Ljava/util/List;", "wireTransferDataRows", "getWireTransferDataRows", "createDataRowIfPositive", "Lcom/robinhood/rosetta/common/MoneyDto;", "labelResId", "", "exchangeRateDataRows", "getExchangeRateDataRows", "NumberFormat", "Ljava/text/NumberFormat;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ReviewTransferStateProvider2 {
    private static final NumberFormat NumberFormat;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewTransferViewState.AmountViewState getAmountViewState(ReviewTransferDataState reviewTransferDataState) {
        if (reviewTransferDataState.getFxData() != null) {
            return new ReviewTransferViewState.AmountViewState.WithFx(Money.format$default(reviewTransferDataState.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), Money.format$default(reviewTransferDataState.getFxData().getTargetAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        String str = NumberFormat.format(reviewTransferDataState.getAmount().getDecimalValue());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new ReviewTransferViewState.AmountViewState.WithoutFx(AnnotatedString3.annotatedStringWithSuperscriptPrefix(str, Currency2.getSymbolPrefix(reviewTransferDataState.getAmount().getCurrency())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ReviewTransferViewState.DataRow> getDataRows(ReviewTransferDataState reviewTransferDataState) {
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C30310R.string.transfer_to_label, new Object[0]);
        MultiCurrencyAccount sinkAccount = reviewTransferDataState.getSinkAccount();
        if (sinkAccount instanceof MultiCurrencyAccount.External) {
            PaymentInstrumentDetailsV2 details = ((MultiCurrencyAccount.External) sinkAccount).getInstrument().getDetails();
            Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.models.paymentinstrument.db.PaymentInstrumentDetailsV2.I18nBankAccount");
            List<ReviewTransferViewState.DataRow> listMutableListOf = CollectionsKt.mutableListOf(new ReviewTransferViewState.DataRow(stringResourceInvoke, companion.invoke(PaymentInstrument2.getAccountNameAndNumber((PaymentInstrumentDetailsV2.I18nBankAccount) details)), null, null, 12, null));
            if (reviewTransferDataState.getTransferType() == TransferType.WIRE) {
                listMutableListOf.addAll(getWireTransferDataRows(reviewTransferDataState));
            }
            if (reviewTransferDataState.isFxEnabled()) {
                listMutableListOf.addAll(getExchangeRateDataRows(reviewTransferDataState));
            }
            return listMutableListOf;
        }
        if (!(sinkAccount instanceof MultiCurrencyAccount.Internal)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Sink account must be external");
    }

    private static final List<ReviewTransferViewState.DataRow> getWireTransferDataRows(ReviewTransferDataState reviewTransferDataState) {
        MoneyDto tax_amount;
        MoneyDto received;
        MoneyDto transfer_fee;
        GetServiceFeeResponseDto serviceFeeResponse = reviewTransferDataState.getServiceFeeResponse();
        ReviewTransferViewState.DataRow dataRow = null;
        ReviewTransferViewState.DataRow dataRowCreateDataRowIfPositive = (serviceFeeResponse == null || (transfer_fee = serviceFeeResponse.getTransfer_fee()) == null) ? null : createDataRowIfPositive(transfer_fee, C30310R.string.wire_fee_label);
        GetServiceFeeResponseDto serviceFeeResponse2 = reviewTransferDataState.getServiceFeeResponse();
        ReviewTransferViewState.DataRow dataRowCreateDataRowIfPositive2 = (serviceFeeResponse2 == null || (received = serviceFeeResponse2.getReceived()) == null) ? null : createDataRowIfPositive(received, C30310R.string.received_amount_label);
        GetServiceFeeResponseDto serviceFeeResponse3 = reviewTransferDataState.getServiceFeeResponse();
        ReviewTransferViewState.DataRow dataRowCreateDataRowIfPositive3 = (serviceFeeResponse3 == null || (tax_amount = serviceFeeResponse3.getTax_amount()) == null) ? null : createDataRowIfPositive(tax_amount, C30310R.string.gst_label);
        String memo = reviewTransferDataState.getMemo();
        if (memo != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            dataRow = new ReviewTransferViewState.DataRow(companion.invoke(C30310R.string.memo_label, new Object[0]), companion.invoke(memo), null, null, 12, null);
        }
        return CollectionsKt.listOfNotNull((Object[]) new ReviewTransferViewState.DataRow[]{dataRowCreateDataRowIfPositive, dataRowCreateDataRowIfPositive2, dataRowCreateDataRowIfPositive3, dataRow});
    }

    private static final ReviewTransferViewState.DataRow createDataRowIfPositive(MoneyDto moneyDto, int i) {
        BigDecimal bigDecimalOrNull = moneyDto.getAmount().toBigDecimalOrNull();
        if (bigDecimalOrNull == null || !BigDecimals7.isPositive(bigDecimalOrNull)) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return new ReviewTransferViewState.DataRow(companion.invoke(i, new Object[0]), companion.invoke(MoneyDtos.format(moneyDto)), null, null, 12, null);
    }

    private static final List<ReviewTransferViewState.DataRow> getExchangeRateDataRows(ReviewTransferDataState reviewTransferDataState) {
        McwFxRate fxRate;
        Instant lastUpdated;
        String str;
        McwFxRate fxRate2;
        String exchangeRateText;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C30310R.string.fx_rate_label, new Object[0]);
        FxData fxData = reviewTransferDataState.getFxData();
        StringResource stringResourceInvoke2 = null;
        ReviewTransferViewState.DataRow dataRow = new ReviewTransferViewState.DataRow(stringResourceInvoke, (fxData == null || (fxRate2 = fxData.getFxRate()) == null || (exchangeRateText = McwFxRateExtensions.getExchangeRateText(fxRate2, reviewTransferDataState.getSourceAccount().getCurrency(), reviewTransferDataState.getSinkAccount().getCurrency())) == null) ? null : companion.invoke(exchangeRateText), new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), ReviewTransferViewState.DataRow.IconAction.SHOW_EXCHANGE_RATE_INFO_SHEET);
        StringResource stringResourceInvoke3 = companion.invoke(C30310R.string.fx_rate_last_updated_label, new Object[0]);
        FxData fxData2 = reviewTransferDataState.getFxData();
        if (fxData2 != null && (fxRate = fxData2.getFxRate()) != null && (lastUpdated = fxRate.getLastUpdated()) != null && (str = InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) lastUpdated)) != null) {
            stringResourceInvoke2 = companion.invoke(str);
        }
        return CollectionsKt.listOf((Object[]) new ReviewTransferViewState.DataRow[]{dataRow, new ReviewTransferViewState.DataRow(stringResourceInvoke3, stringResourceInvoke2, null, null, 12, null)});
    }

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setRoundingMode(RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(numberInstance, "apply(...)");
        NumberFormat = numberInstance;
    }
}
