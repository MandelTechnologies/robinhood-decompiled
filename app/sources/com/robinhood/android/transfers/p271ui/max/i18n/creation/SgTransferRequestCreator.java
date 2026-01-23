package com.robinhood.android.transfers.p271ui.max.i18n.creation;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferCurrencyUtils;
import com.robinhood.android.transfers.p271ui.max.i18n.creation.InternationalCreateTransferRequestFactory;
import com.robinhood.android.transfers.util.GetRate;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.ApiTransferAccountsResponse;
import com.robinhood.models.api.bonfire.FxTransferDetails;
import com.robinhood.models.p320db.TransferDirection;
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
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SgTransferRequestCreator.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/creation/SgTransferRequestCreator;", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/TransferRequestCreator;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;)V", "transferType", "Lcom/robinhood/transfers/api/TransferType;", "getTransferType", "()Lcom/robinhood/transfers/api/TransferType;", "getCurrency", "Lcom/robinhood/transfers/api/Currency;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "createSourceAndSinkAccount", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "externalAccountId", "", "(Lcom/robinhood/models/db/TransferDirection;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAdditionalData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData;", "transferData", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory$TransferData;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SgTransferRequestCreator implements TransferRequestCreator {
    public static final int $stable = 8;
    private final TransferType transferType;
    private final TransfersBonfireApi transfersBonfireApi;

    /* compiled from: SgTransferRequestCreator.kt */
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

    /* compiled from: SgTransferRequestCreator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.creation.SgTransferRequestCreator", m3645f = "SgTransferRequestCreator.kt", m3646l = {42}, m3647m = "createSourceAndSinkAccount")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.creation.SgTransferRequestCreator$createSourceAndSinkAccount$1 */
    static final class C307711 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C307711(Continuation<? super C307711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SgTransferRequestCreator.this.createSourceAndSinkAccount(null, null, this);
        }
    }

    public SgTransferRequestCreator(TransfersBonfireApi transfersBonfireApi) {
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        this.transfersBonfireApi = transfersBonfireApi;
        this.transferType = TransferType.SG_BANK_WITHDRAWAL;
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
            throw new IllegalStateException("Singapore deposits are non-originated");
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Currency.USD;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.android.transfers.p271ui.max.i18n.creation.TransferRequestCreator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSourceAndSinkAccount(TransferDirection transferDirection, String str, Continuation<? super Tuples2<ApiCreateTransferRequest.ApiTransferAccount, ApiCreateTransferRequest.ApiTransferAccount>> continuation) throws InternationalCreateTransferRequestFactory.MissingBrokerageAccountException {
        C307711 c307711;
        if (continuation instanceof C307711) {
            c307711 = (C307711) continuation;
            int i = c307711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c307711.label = i - Integer.MIN_VALUE;
            } else {
                c307711 = new C307711(continuation);
            }
        }
        C307711 c3077112 = c307711;
        Object transferAccounts$default = c3077112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3077112.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(transferAccounts$default);
                TransferDirection.Companion companion = TransferDirection.INSTANCE;
                TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
                c3077112.L$0 = str;
                c3077112.label = 1;
                transferAccounts$default = TransfersBonfireApi.DefaultImpls.getTransferAccounts$default(transfersBonfireApi, false, null, null, c3077112, 7, null);
                if (transferAccounts$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c3077112.L$0;
                ResultKt.throwOnFailure(transferAccounts$default);
            }
            String str2 = str;
            for (Object obj : ((ApiTransferAccountsResponse) transferAccounts$default).getResults()) {
                ApiTransferAccount.TransferAccountType type2 = ((ApiTransferAccount) obj).getType();
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHS;
                if (type2 == transferAccountType) {
                    ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount = new ApiCreateTransferRequest.ApiTransferAccount(((ApiTransferAccount) obj).getAccount_id(), transferAccountType, null, null, 12, null);
                    if (str2 != null) {
                        return Tuples4.m3642to(apiTransferAccount, new ApiCreateTransferRequest.ApiTransferAccount(str2, ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT, null, null, 12, null));
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            throw new InternationalCreateTransferRequestFactory.MissingBrokerageAccountException();
        }
    }

    @Override // com.robinhood.android.transfers.p271ui.max.i18n.creation.TransferRequestCreator
    public ApiCreateTransferRequest.ApiTransferAdditionalData createAdditionalData(InternationalCreateTransferRequestFactory.TransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        transferData.getTransferDirection();
        TransferDirection.Companion companion = TransferDirection.INSTANCE;
        MAXTransferContext.EntryPoint entryPoint = MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        Boolean bool = Boolean.FALSE;
        java.util.Currency currency = Currencies.SGD;
        BigDecimal decimalValue = InternationalTransferCurrencyUtils.toTargetCurrency(currency, transferData.getTransferDirection(), transferData.getAmount(), transferData.getFxQuote(), currency).getDecimalValue();
        Currency currency2 = Currency.SGD;
        String strValueOf = String.valueOf(transferData.getFxQuote().getRateSetId());
        String plainString = GetRate.getRate(transferData.getFxQuote(), transferData.getTransferDirection()).setScale(4, RoundingMode.HALF_EVEN).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return new ApiCreateTransferRequest.ApiTransferAdditionalData(null, null, null, null, entryPoint, null, bool, bool, null, null, new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiI18nTransferData(new FxTransferDetails(decimalValue, currency2, strValueOf, plainString)), null, null, false, null, null, 64288, null);
    }
}
