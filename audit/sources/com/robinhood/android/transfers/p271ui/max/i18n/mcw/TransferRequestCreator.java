package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.banking.util.RefIdFactory;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2Request;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2RequestDetails;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentsV22;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentProviderType;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.api.Currency;
import com.robinhood.transfers.api.TransferType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: TransferRequestCreator.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator;", "", "refIdFactory", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferData;", "paymentInstrumentApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "<init>", "(Lcom/robinhood/android/banking/util/RefIdFactory;Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;)V", "createTransfer", "Lkotlin/Result;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "transferData", "createTransfer-gIAlu-s$feature_transfers_externalRelease", "(Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSourceAndSinkForRequest", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferRequestCreator {
    public static final int $stable = 8;
    private final PaymentInstrumentBonfireApi paymentInstrumentApi;
    private final RefIdFactory<TransferData> refIdFactory;
    private final TransfersBonfireApi transfersBonfireApi;

    /* compiled from: TransferRequestCreator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.TransferRequestCreator", m3645f = "TransferRequestCreator.kt", m3646l = {59}, m3647m = "createSourceAndSinkForRequest")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.TransferRequestCreator$createSourceAndSinkForRequest$1 */
    static final class C308181 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C308181(Continuation<? super C308181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferRequestCreator.this.createSourceAndSinkForRequest(null, this);
        }
    }

    public TransferRequestCreator(RefIdFactory<TransferData> refIdFactory, PaymentInstrumentBonfireApi paymentInstrumentApi, TransfersBonfireApi transfersBonfireApi) {
        Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
        Intrinsics.checkNotNullParameter(paymentInstrumentApi, "paymentInstrumentApi");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        this.refIdFactory = refIdFactory;
        this.paymentInstrumentApi = paymentInstrumentApi;
        this.transfersBonfireApi = transfersBonfireApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if (r2 == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: createTransfer-gIAlu-s$feature_transfers_externalRelease, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m19870createTransfergIAlus$feature_transfers_externalRelease(TransferData transferData, Continuation<? super Result<ApiCreateTransferResponse>> continuation) {
        TransferRequestCreator2 transferRequestCreator2;
        Money amount;
        Object objCreateSourceAndSinkForRequest;
        TransferData transferData2 = transferData;
        if (continuation instanceof TransferRequestCreator2) {
            transferRequestCreator2 = (TransferRequestCreator2) continuation;
            int i = transferRequestCreator2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transferRequestCreator2.label = i - Integer.MIN_VALUE;
            } else {
                transferRequestCreator2 = new TransferRequestCreator2(this, continuation);
            }
        }
        Object objCreateTransfer = transferRequestCreator2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = transferRequestCreator2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateTransfer);
            amount = transferData2.getAmount();
            transferRequestCreator2.L$0 = transferData2;
            transferRequestCreator2.L$1 = amount;
            transferRequestCreator2.label = 1;
            objCreateSourceAndSinkForRequest = createSourceAndSinkForRequest(transferData2, transferRequestCreator2);
            if (objCreateSourceAndSinkForRequest != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateTransfer);
            Response response = (Response) objCreateTransfer;
            ApiCreateTransferResponse apiCreateTransferResponse = (ApiCreateTransferResponse) response.body();
            if (response.isSuccessful() && apiCreateTransferResponse != null) {
                return Result.m28550constructorimpl(apiCreateTransferResponse);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new HttpException(response)));
        }
        Money money = (Money) transferRequestCreator2.L$1;
        TransferData transferData3 = (TransferData) transferRequestCreator2.L$0;
        ResultKt.throwOnFailure(objCreateTransfer);
        amount = money;
        transferData2 = transferData3;
        objCreateSourceAndSinkForRequest = objCreateTransfer;
        Tuples2 tuples2 = (Tuples2) objCreateSourceAndSinkForRequest;
        ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount = (ApiCreateTransferRequest.ApiTransferAccount) tuples2.component1();
        ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount2 = (ApiCreateTransferRequest.ApiTransferAccount) tuples2.component2();
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
        Currency.Companion companion2 = Currency.INSTANCE;
        String currencyCode = amount.getCurrency().getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
        String lowerCase = currencyCode.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Currency currencyFromServerValue = companion2.fromServerValue(lowerCase);
        ApiCreateTransferRequest apiCreateTransferRequest = new ApiCreateTransferRequest(this.refIdFactory.generateRefId(transferData2), amount.getDecimalValue(), apiTransferAccount, apiTransferAccount2, ApiCreateTransferRequest2.ONCE, boxing.boxBoolean(false), null, null, null, currencyFromServerValue, TransferType.UK_OPEN_BANKING_TRANSFER, false, null, 6528, null);
        transferRequestCreator2.L$0 = null;
        transferRequestCreator2.L$1 = null;
        transferRequestCreator2.label = 2;
        objCreateTransfer = transfersBonfireApi.createTransfer(apiCreateTransferRequest, transferRequestCreator2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSourceAndSinkForRequest(TransferData transferData, Continuation<? super Tuples2<ApiCreateTransferRequest.ApiTransferAccount, ApiCreateTransferRequest.ApiTransferAccount>> continuation) {
        C308181 c308181;
        ApiCreateTransferRequest.ApiTransferAccount sourceAccount;
        ApiCreateTransferRequest.ApiTransferAccount sinkAccount;
        if (continuation instanceof C308181) {
            c308181 = (C308181) continuation;
            int i = c308181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c308181.label = i - Integer.MIN_VALUE;
            } else {
                c308181 = new C308181(continuation);
            }
        }
        Object objLinkPaymentInstrument = c308181.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c308181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLinkPaymentInstrument);
            if (transferData.getTransferDirection() == TransferDirectionV2.DEPOSIT && transferData.getSourceAccount() == null) {
                PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.paymentInstrumentApi;
                ApiPaymentInstrumentV2Request apiPaymentInstrumentV2Request = new ApiPaymentInstrumentV2Request(PaymentInstrumentType.UK_BANK_ACCOUNT, PaymentProviderType.TRUELAYER, new ApiPaymentInstrumentV2RequestDetails.UkBankAccount(), null, 8, null);
                c308181.L$0 = transferData;
                c308181.label = 1;
                objLinkPaymentInstrument = paymentInstrumentBonfireApi.linkPaymentInstrument(apiPaymentInstrumentV2Request, c308181);
                if (objLinkPaymentInstrument == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                sourceAccount = transferData.getSourceAccount();
                if (sourceAccount == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                sinkAccount = transferData.getSinkAccount();
                if (sinkAccount != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                return Tuples4.m3642to(sourceAccount, sinkAccount);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transferData = (TransferData) c308181.L$0;
            ResultKt.throwOnFailure(objLinkPaymentInstrument);
        }
        String string2 = ((ApiPaymentInstrumentsV22) objLinkPaymentInstrument).getPaymentInstrument().getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sourceAccount = new ApiCreateTransferRequest.ApiTransferAccount(string2, ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT, null, null, 12, null);
        sinkAccount = transferData.getSinkAccount();
        if (sinkAccount != null) {
        }
    }
}
