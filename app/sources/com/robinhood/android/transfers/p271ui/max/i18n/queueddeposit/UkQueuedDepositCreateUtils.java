package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferCurrencyUtils;
import com.robinhood.android.transfers.util.GetRate;
import com.robinhood.models.api.bonfire.ApiCreateQueuedDepositRequest;
import com.robinhood.models.api.bonfire.ApiCreateQueuedDepositResponse;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.cashier.RhAccountType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: UkQueuedDepositCreateUtils.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0080@¢\u0006\u0002\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\r*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u000e"}, m3636d2 = {"createQueuedDeposit", "Lkotlin/Result;", "Lcom/robinhood/models/api/bonfire/ApiPostTransferPage$UkQueuedDeposit;", "amount", "Lcom/robinhood/models/util/Money;", "fxQuote", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "instrumentId", "Ljava/util/UUID;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/fx/api/ApiFxQuote;Ljava/util/UUID;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toQueuedDepositRequestDetails", "Lcom/robinhood/models/api/bonfire/ApiCreateQueuedDepositRequest$Details;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositCreateUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UkQueuedDepositCreateUtils {

    /* compiled from: UkQueuedDepositCreateUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositCreateUtilsKt", m3645f = "UkQueuedDepositCreateUtils.kt", m3646l = {26}, m3647m = "createQueuedDeposit")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositCreateUtilsKt$createQueuedDeposit$1 */
    static final class C308311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C308311(Continuation<? super C308311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objCreateQueuedDeposit = UkQueuedDepositCreateUtils.createQueuedDeposit(null, null, null, null, this);
            return objCreateQueuedDeposit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCreateQueuedDeposit : Result.m28549boximpl(objCreateQueuedDeposit);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createQueuedDeposit(Money money, ApiFxQuote apiFxQuote, UUID uuid, TransfersBonfireApi transfersBonfireApi, Continuation<? super Result<ApiPostTransferPage.UkQueuedDeposit>> continuation) {
        C308311 c308311;
        List<ApiPostTransferPage> postTransferPages;
        if (continuation instanceof C308311) {
            c308311 = (C308311) continuation;
            int i = c308311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c308311.label = i - Integer.MIN_VALUE;
            } else {
                c308311 = new C308311(continuation);
            }
        }
        Object objCreateQueuedDeposit = c308311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c308311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateQueuedDeposit);
            if (!Intrinsics.areEqual(money.getCurrency(), Currencies.GBP)) {
                throw new IllegalStateException("Base currency must be GBP");
            }
            String serverValue = RhAccountType.RHS_ACCOUNT.getServerValue();
            BigDecimal decimalValue = money.getDecimalValue();
            String currencyCode = money.getCurrency().getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
            PaymentInstrumentType paymentInstrumentType = PaymentInstrumentType.UK_BANK_ACCOUNT;
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            ApiCreateQueuedDepositRequest apiCreateQueuedDepositRequest = new ApiCreateQueuedDepositRequest(serverValue, decimalValue, currencyCode, string2, paymentInstrumentType, apiFxQuote != null ? toQueuedDepositRequestDetails(apiFxQuote, money) : null, null);
            c308311.label = 1;
            objCreateQueuedDeposit = transfersBonfireApi.createQueuedDeposit(apiCreateQueuedDepositRequest, c308311);
            if (objCreateQueuedDeposit == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateQueuedDeposit);
        }
        Response response = (Response) objCreateQueuedDeposit;
        if (response.isSuccessful()) {
            ApiCreateQueuedDepositResponse apiCreateQueuedDepositResponse = (ApiCreateQueuedDepositResponse) response.body();
            Object obj = (apiCreateQueuedDepositResponse == null || (postTransferPages = apiCreateQueuedDepositResponse.getPostTransferPages()) == null) ? null : (ApiPostTransferPage) CollectionsKt.firstOrNull((List) postTransferPages);
            ApiPostTransferPage.UkQueuedDeposit ukQueuedDeposit = obj instanceof ApiPostTransferPage.UkQueuedDeposit ? (ApiPostTransferPage.UkQueuedDeposit) obj : null;
            if (ukQueuedDeposit == null) {
                throw new UkQueuedDepositCreateUtils2();
            }
            return Result.m28550constructorimpl(ukQueuedDeposit);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m28550constructorimpl(ResultKt.createFailure(new HttpException(response)));
    }

    private static final ApiCreateQueuedDepositRequest.Details toQueuedDepositRequestDetails(ApiFxQuote apiFxQuote, Money money) {
        Currency currency = Currencies.GBP;
        TransferDirection transferDirection = TransferDirection.DEPOSIT;
        Currency currency2 = Currencies.USD;
        BigDecimal decimalValue = InternationalTransferCurrencyUtils.toTargetCurrency(currency, transferDirection, money, apiFxQuote, currency2).getDecimalValue();
        String currencyCode = currency2.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
        BigDecimal scale = GetRate.getRate(apiFxQuote, transferDirection).setScale(4, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return new ApiCreateQueuedDepositRequest.Details(decimalValue, currencyCode, scale, apiFxQuote.getRateSetId());
    }
}
