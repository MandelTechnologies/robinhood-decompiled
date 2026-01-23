package com.robinhood.android.transfers.p271ui.max.i18n.creation;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferCurrencyUtils;
import com.robinhood.android.transfers.p271ui.max.i18n.creation.InternationalCreateTransferRequestFactory;
import com.robinhood.android.transfers.util.GetRate;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.ApiTransferAccountsResponse;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2Request;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2RequestDetails;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentsV22;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentProviderType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.transfers.api.Currency;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UkTransferRequestCreator.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J,\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/creation/UkTransferRequestCreator;", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/TransferRequestCreator;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;)V", "transferType", "Lcom/robinhood/transfers/api/TransferType;", "getTransferType", "()Lcom/robinhood/transfers/api/TransferType;", "getCurrency", "Lcom/robinhood/transfers/api/Currency;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "createSourceAndSinkAccount", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "externalAccountId", "", "(Lcom/robinhood/models/db/TransferDirection;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAdditionalData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData;", "transferData", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory$TransferData;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class UkTransferRequestCreator implements TransferRequestCreator {
    public static final int $stable = 8;
    private final PaymentInstrumentBonfireApi paymentInstrumentBonfireApi;
    private final TransferType transferType;
    private final TransfersBonfireApi transfersBonfireApi;

    /* compiled from: UkTransferRequestCreator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: UkTransferRequestCreator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.creation.UkTransferRequestCreator", m3645f = "UkTransferRequestCreator.kt", m3646l = {46, 66}, m3647m = "createSourceAndSinkAccount")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.creation.UkTransferRequestCreator$createSourceAndSinkAccount$1 */
    static final class C307721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C307721(Continuation<? super C307721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UkTransferRequestCreator.this.createSourceAndSinkAccount(null, null, this);
        }
    }

    public UkTransferRequestCreator(TransfersBonfireApi transfersBonfireApi, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi) {
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
        this.transfersBonfireApi = transfersBonfireApi;
        this.paymentInstrumentBonfireApi = paymentInstrumentBonfireApi;
    }

    @Override // com.robinhood.android.transfers.p271ui.max.i18n.creation.TransferRequestCreator
    public TransferType getTransferType() {
        return this.transferType;
    }

    @Override // com.robinhood.android.transfers.p271ui.max.i18n.creation.TransferRequestCreator
    public Currency getCurrency(TransferDirection transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        int i = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
        if (i == 1) {
            return Currency.GBP;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Currency.USD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r1 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9 A[Catch: NoSuchElementException -> 0x0142, TryCatch #0 {NoSuchElementException -> 0x0142, blocks: (B:14:0x0036, B:39:0x00c7, B:40:0x00d3, B:42:0x00d9, B:44:0x00e8, B:54:0x013a, B:55:0x0141, B:35:0x00b0), top: B:58:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.robinhood.android.transfers.p271ui.max.i18n.creation.TransferRequestCreator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSourceAndSinkAccount(TransferDirection transferDirection, String str, Continuation<? super Tuples2<ApiCreateTransferRequest.ApiTransferAccount, ApiCreateTransferRequest.ApiTransferAccount>> continuation) throws InternationalCreateTransferRequestFactory.MissingBrokerageAccountException {
        C307721 c307721;
        TransferDirection transferDirection2;
        String string2;
        TransferDirection transferDirection3;
        String str2;
        Object transferAccounts$default;
        TransferDirection transferDirection4;
        String str3;
        if (continuation instanceof C307721) {
            c307721 = (C307721) continuation;
            int i = c307721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c307721.label = i - Integer.MIN_VALUE;
            } else {
                c307721 = new C307721(continuation);
            }
        }
        C307721 c3077212 = c307721;
        Object objLinkPaymentInstrument = c3077212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3077212.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objLinkPaymentInstrument);
                int i3 = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (str == null) {
                        throw new IllegalStateException("External account id must be non-null for withdrawals!");
                    }
                    transferDirection3 = transferDirection;
                    str2 = str;
                    TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
                    c3077212.L$0 = transferDirection3;
                    c3077212.L$1 = str2;
                    c3077212.label = 2;
                    transferAccounts$default = TransfersBonfireApi.DefaultImpls.getTransferAccounts$default(transfersBonfireApi, false, null, null, c3077212, 7, null);
                    if (transferAccounts$default != coroutine_suspended) {
                        transferDirection4 = transferDirection3;
                        objLinkPaymentInstrument = transferAccounts$default;
                        str3 = str2;
                        while (r1.hasNext()) {
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    return coroutine_suspended;
                }
                if (str == null) {
                    PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.paymentInstrumentBonfireApi;
                    ApiPaymentInstrumentV2Request apiPaymentInstrumentV2Request = new ApiPaymentInstrumentV2Request(PaymentInstrumentType.UK_BANK_ACCOUNT, PaymentProviderType.TRUELAYER, new ApiPaymentInstrumentV2RequestDetails.UkBankAccount(), null, 8, null);
                    transferDirection2 = transferDirection;
                    c3077212.L$0 = transferDirection2;
                    c3077212.label = 1;
                    objLinkPaymentInstrument = paymentInstrumentBonfireApi.linkPaymentInstrument(apiPaymentInstrumentV2Request, c3077212);
                } else {
                    transferDirection2 = transferDirection;
                    string2 = str;
                    Unit unit = Unit.INSTANCE;
                    str2 = string2;
                    transferDirection3 = transferDirection2;
                    TransfersBonfireApi transfersBonfireApi2 = this.transfersBonfireApi;
                    c3077212.L$0 = transferDirection3;
                    c3077212.L$1 = str2;
                    c3077212.label = 2;
                    transferAccounts$default = TransfersBonfireApi.DefaultImpls.getTransferAccounts$default(transfersBonfireApi2, false, null, null, c3077212, 7, null);
                    if (transferAccounts$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str4 = (String) c3077212.L$1;
                    TransferDirection transferDirection5 = (TransferDirection) c3077212.L$0;
                    ResultKt.throwOnFailure(objLinkPaymentInstrument);
                    str3 = str4;
                    transferDirection4 = transferDirection5;
                    for (Object obj : ((ApiTransferAccountsResponse) objLinkPaymentInstrument).getResults()) {
                        ApiTransferAccount.TransferAccountType type2 = ((ApiTransferAccount) obj).getType();
                        ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHS;
                        if (type2 == transferAccountType) {
                            String account_id = ((ApiTransferAccount) obj).getAccount_id();
                            int i4 = WhenMappings.$EnumSwitchMapping$0[transferDirection4.ordinal()];
                            if (i4 == 1) {
                                return Tuples4.m3642to(new ApiCreateTransferRequest.ApiTransferAccount(str3, ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT, null, null, 12, null), new ApiCreateTransferRequest.ApiTransferAccount(account_id, transferAccountType, null, null, 12, null));
                            }
                            if (i4 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Tuples4.m3642to(new ApiCreateTransferRequest.ApiTransferAccount(account_id, transferAccountType, null, null, 12, null), new ApiCreateTransferRequest.ApiTransferAccount(str3, ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT, null, null, 12, null));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                transferDirection2 = (TransferDirection) c3077212.L$0;
                ResultKt.throwOnFailure(objLinkPaymentInstrument);
            }
            string2 = ((ApiPaymentInstrumentsV22) objLinkPaymentInstrument).getPaymentInstrument().getInstrumentId().toString();
            Unit unit2 = Unit.INSTANCE;
            str2 = string2;
            transferDirection3 = transferDirection2;
            TransfersBonfireApi transfersBonfireApi22 = this.transfersBonfireApi;
            c3077212.L$0 = transferDirection3;
            c3077212.L$1 = str2;
            c3077212.label = 2;
            transferAccounts$default = TransfersBonfireApi.DefaultImpls.getTransferAccounts$default(transfersBonfireApi22, false, null, null, c3077212, 7, null);
            if (transferAccounts$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (NoSuchElementException unused) {
            throw new InternationalCreateTransferRequestFactory.MissingBrokerageAccountException();
        }
    }

    @Override // com.robinhood.android.transfers.p271ui.max.i18n.creation.TransferRequestCreator
    public ApiCreateTransferRequest.ApiTransferAdditionalData createAdditionalData(InternationalCreateTransferRequestFactory.TransferData transferData) {
        java.util.Currency currency;
        Currency currency2;
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        MAXTransferContext.EntryPoint entryPoint = MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        Boolean bool = Boolean.FALSE;
        java.util.Currency currency3 = Currencies.GBP;
        TransferDirection transferDirection = transferData.getTransferDirection();
        Money amount = transferData.getAmount();
        ApiFxQuote fxQuote = transferData.getFxQuote();
        TransferDirection transferDirection2 = transferData.getTransferDirection();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[transferDirection2.ordinal()];
        if (i == 1) {
            currency = Currencies.USD;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            currency = currency3;
        }
        BigDecimal decimalValue = InternationalTransferCurrencyUtils.toTargetCurrency(currency3, transferDirection, amount, fxQuote, currency).getDecimalValue();
        int i2 = iArr[transferData.getTransferDirection().ordinal()];
        if (i2 == 1) {
            currency2 = Currency.USD;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            currency2 = Currency.GBP;
        }
        Currency currency4 = currency2;
        long rateSetId = transferData.getFxQuote().getRateSetId();
        BigDecimal scale = GetRate.getRate(transferData.getFxQuote(), transferData.getTransferDirection()).setScale(4, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return new ApiCreateTransferRequest.ApiTransferAdditionalData(null, null, null, null, entryPoint, null, bool, bool, new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiTransferUkBankTransferData(new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiTransferCurrencyConversionData(decimalValue, currency4, rateSetId, scale)), null, null, null, null, false, null, null, 65056, null);
    }
}
