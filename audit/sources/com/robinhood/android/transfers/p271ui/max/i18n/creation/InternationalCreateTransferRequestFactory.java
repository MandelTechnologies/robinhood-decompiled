package com.robinhood.android.transfers.p271ui.max.i18n.creation;

import com.robinhood.android.banking.util.RefIdFactory;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.transfers.api.Currency;
import com.robinhood.transfers.api.TransferType;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: InternationalCreateTransferRequestFactory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;", "", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "refIdFactory", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory$TransferData;", "ukTransferRequestCreator", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/UkTransferRequestCreator;", "sgTransferRequestCreator", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/SgTransferRequestCreator;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/banking/util/RefIdFactory;Lcom/robinhood/android/transfers/ui/max/i18n/creation/UkTransferRequestCreator;Lcom/robinhood/android/transfers/ui/max/i18n/creation/SgTransferRequestCreator;)V", "createTransferRequest", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "transferData", "(Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory$TransferData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCreatorForLocality", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/TransferRequestCreator;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "TransferData", "MissingBrokerageAccountException", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InternationalCreateTransferRequestFactory {
    public static final int $stable = 8;
    private final RefIdFactory<TransferData> refIdFactory;
    private final SgTransferRequestCreator sgTransferRequestCreator;
    private final UkTransferRequestCreator ukTransferRequestCreator;
    private final UserStore userStore;

    /* compiled from: InternationalCreateTransferRequestFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory$MissingBrokerageAccountException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MissingBrokerageAccountException extends Exception {
        public static final int $stable = 8;
    }

    /* compiled from: InternationalCreateTransferRequestFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.creation.InternationalCreateTransferRequestFactory", m3645f = "InternationalCreateTransferRequestFactory.kt", m3646l = {63, 38}, m3647m = "createTransferRequest")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.creation.InternationalCreateTransferRequestFactory$createTransferRequest$1 */
    static final class C307701 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C307701(Continuation<? super C307701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternationalCreateTransferRequestFactory.this.createTransferRequest(null, this);
        }
    }

    public InternationalCreateTransferRequestFactory(UserStore userStore, RefIdFactory<TransferData> refIdFactory, UkTransferRequestCreator ukTransferRequestCreator, SgTransferRequestCreator sgTransferRequestCreator) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
        Intrinsics.checkNotNullParameter(ukTransferRequestCreator, "ukTransferRequestCreator");
        Intrinsics.checkNotNullParameter(sgTransferRequestCreator, "sgTransferRequestCreator");
        this.userStore = userStore;
        this.refIdFactory = refIdFactory;
        this.ukTransferRequestCreator = ukTransferRequestCreator;
        this.sgTransferRequestCreator = sgTransferRequestCreator;
    }

    /* compiled from: InternationalCreateTransferRequestFactory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory$TransferData;", "", "amount", "Lcom/robinhood/models/util/Money;", "externalAccountId", "", "fxQuote", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/models/fx/api/ApiFxQuote;Lcom/robinhood/models/db/TransferDirection;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getExternalAccountId", "()Ljava/lang/String;", "getFxQuote", "()Lcom/robinhood/models/fx/api/ApiFxQuote;", "getTransferDirection", "()Lcom/robinhood/models/db/TransferDirection;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransferData {
        public static final int $stable = 8;
        private final Money amount;
        private final String externalAccountId;
        private final ApiFxQuote fxQuote;
        private final TransferDirection transferDirection;

        public static /* synthetic */ TransferData copy$default(TransferData transferData, Money money, String str, ApiFxQuote apiFxQuote, TransferDirection transferDirection, int i, Object obj) {
            if ((i & 1) != 0) {
                money = transferData.amount;
            }
            if ((i & 2) != 0) {
                str = transferData.externalAccountId;
            }
            if ((i & 4) != 0) {
                apiFxQuote = transferData.fxQuote;
            }
            if ((i & 8) != 0) {
                transferDirection = transferData.transferDirection;
            }
            return transferData.copy(money, str, apiFxQuote, transferDirection);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getExternalAccountId() {
            return this.externalAccountId;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiFxQuote getFxQuote() {
            return this.fxQuote;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferDirection getTransferDirection() {
            return this.transferDirection;
        }

        public final TransferData copy(Money amount, String externalAccountId, ApiFxQuote fxQuote, TransferDirection transferDirection) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(fxQuote, "fxQuote");
            Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
            return new TransferData(amount, externalAccountId, fxQuote, transferDirection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransferData)) {
                return false;
            }
            TransferData transferData = (TransferData) other;
            return Intrinsics.areEqual(this.amount, transferData.amount) && Intrinsics.areEqual(this.externalAccountId, transferData.externalAccountId) && Intrinsics.areEqual(this.fxQuote, transferData.fxQuote) && this.transferDirection == transferData.transferDirection;
        }

        public int hashCode() {
            int iHashCode = this.amount.hashCode() * 31;
            String str = this.externalAccountId;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.fxQuote.hashCode()) * 31) + this.transferDirection.hashCode();
        }

        public String toString() {
            return "TransferData(amount=" + this.amount + ", externalAccountId=" + this.externalAccountId + ", fxQuote=" + this.fxQuote + ", transferDirection=" + this.transferDirection + ")";
        }

        public TransferData(Money amount, String str, ApiFxQuote fxQuote, TransferDirection transferDirection) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(fxQuote, "fxQuote");
            Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
            this.amount = amount;
            this.externalAccountId = str;
            this.fxQuote = fxQuote;
            this.transferDirection = transferDirection;
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final String getExternalAccountId() {
            return this.externalAccountId;
        }

        public final ApiFxQuote getFxQuote() {
            return this.fxQuote;
        }

        public final TransferDirection getTransferDirection() {
            return this.transferDirection;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTransferRequest(TransferData transferData, Continuation<? super ApiCreateTransferRequest> continuation) {
        C307701 c307701;
        TransferData transferData2;
        TransferRequestCreator transferRequestCreator;
        TransferData transferData3;
        if (continuation instanceof C307701) {
            c307701 = (C307701) continuation;
            int i = c307701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c307701.label = i - Integer.MIN_VALUE;
            } else {
                c307701 = new C307701(continuation);
            }
        }
        Object objAwaitFirst = c307701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c307701.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Observable<User> user = this.userStore.getUser();
            transferData2 = transferData;
            c307701.L$0 = transferData2;
            c307701.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(user, c307701);
            if (objAwaitFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transferRequestCreator = (TransferRequestCreator) c307701.L$2;
            transferData2 = (TransferData) c307701.L$1;
            transferData3 = (TransferData) c307701.L$0;
            ResultKt.throwOnFailure(objAwaitFirst);
            Tuples2 tuples2 = (Tuples2) objAwaitFirst;
            ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount = (ApiCreateTransferRequest.ApiTransferAccount) tuples2.component1();
            ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount2 = (ApiCreateTransferRequest.ApiTransferAccount) tuples2.component2();
            Currency currency = transferRequestCreator.getCurrency(transferData2.getTransferDirection());
            UUID uuidGenerateRefId = this.refIdFactory.generateRefId(transferData3);
            BigDecimal decimalValue = transferData2.getAmount().getDecimalValue();
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = ApiCreateTransferRequest2.ONCE;
            TransferType transferType = transferRequestCreator.getTransferType();
            return new ApiCreateTransferRequest(uuidGenerateRefId, decimalValue, apiTransferAccount, apiTransferAccount2, apiCreateTransferRequest2, boxing.boxBoolean(false), transferRequestCreator.createAdditionalData(transferData3), null, null, currency, transferType, false, null, 6528, null);
        }
        transferData2 = (TransferData) c307701.L$0;
        ResultKt.throwOnFailure(objAwaitFirst);
        TransferRequestCreator transferRequestCreatorRequestCreatorForLocality = requestCreatorForLocality(((User) objAwaitFirst).getOrigin().getLocality());
        TransferDirection transferDirection = transferData2.getTransferDirection();
        String externalAccountId = transferData2.getExternalAccountId();
        c307701.L$0 = transferData2;
        c307701.L$1 = transferData2;
        c307701.L$2 = transferRequestCreatorRequestCreatorForLocality;
        c307701.label = 2;
        Object objCreateSourceAndSinkAccount = transferRequestCreatorRequestCreatorForLocality.createSourceAndSinkAccount(transferDirection, externalAccountId, c307701);
        if (objCreateSourceAndSinkAccount != coroutine_suspended) {
            transferRequestCreator = transferRequestCreatorRequestCreatorForLocality;
            objAwaitFirst = objCreateSourceAndSinkAccount;
            transferData3 = transferData2;
            Tuples2 tuples22 = (Tuples2) objAwaitFirst;
            ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount3 = (ApiCreateTransferRequest.ApiTransferAccount) tuples22.component1();
            ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount22 = (ApiCreateTransferRequest.ApiTransferAccount) tuples22.component2();
            Currency currency2 = transferRequestCreator.getCurrency(transferData2.getTransferDirection());
            UUID uuidGenerateRefId2 = this.refIdFactory.generateRefId(transferData3);
            BigDecimal decimalValue2 = transferData2.getAmount().getDecimalValue();
            ApiCreateTransferRequest2 apiCreateTransferRequest22 = ApiCreateTransferRequest2.ONCE;
            TransferType transferType2 = transferRequestCreator.getTransferType();
            return new ApiCreateTransferRequest(uuidGenerateRefId2, decimalValue2, apiTransferAccount3, apiTransferAccount22, apiCreateTransferRequest22, boxing.boxBoolean(false), transferRequestCreator.createAdditionalData(transferData3), null, null, currency2, transferType2, false, null, 6528, null);
        }
        return coroutine_suspended;
    }

    private final TransferRequestCreator requestCreatorForLocality(CountryCode.Supported locality) {
        if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return this.ukTransferRequestCreator;
        }
        if (Intrinsics.areEqual(locality, CountryCode.Supported.Singapore.INSTANCE)) {
            return this.sgTransferRequestCreator;
        }
        throw new IllegalStateException(("Unsupported locality: " + locality).toString());
    }
}
