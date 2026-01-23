package com.robinhood.store.achrelationship;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.data.store.logging.utils.EventLoggers;
import com.robinhood.android.iav.p154ui.PlaidExchangeTokenFragment;
import com.robinhood.android.transfers.lib.lastused.PaymentMethodLastUsagesPref;
import com.robinhood.android.transfers.lib.lastused.UpdatePaymentMethodLastUsed;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.api.cashier.ApiCreateIavRelationshipRequest;
import com.robinhood.models.api.cashier.ApiCreateQueuedAchDepositRequest;
import com.robinhood.models.api.cashier.RhAccountType;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.AchRelationship2;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: IavStore.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0018\u0010\u001c\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dJb\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120#0\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0018\u0010$\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/store/achrelationship/IavStore;", "Lcom/robinhood/store/Store;", "paymentMethodLastUsagesPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/android/api/cashier/Cashier;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/store/StoreBundle;)V", "createAchRelationship", "Lio/reactivex/Single;", "Lcom/robinhood/models/db/AchRelationship;", "accessToken", "", PlaidExchangeTokenFragment.ARG_IAV_ACCOUNT_ID, "amount", "Ljava/math/BigDecimal;", "rhAccountType", "Lcom/robinhood/models/api/cashier/RhAccountType;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "successEventSupplier", "Lkotlin/Function1;", "Lretrofit2/Response;", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "errorEventSupplier", "", "submitQueuedDeposit", "Lcom/robinhood/utils/Optional;", "queuedDepositSuccessEventSupplier", "queuedDepositErrorEventSupplier", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class IavStore extends Store {
    private final AchRelationshipStore achRelationshipStore;
    private final AnalyticsLogger analytics;
    private final Cashier cashier;
    private final EventLogger eventLogger;
    private final StringToLongMapPreference paymentMethodLastUsagesPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IavStore(@PaymentMethodLastUsagesPref StringToLongMapPreference paymentMethodLastUsagesPref, Cashier cashier, AchRelationshipStore achRelationshipStore, AnalyticsLogger analytics, EventLogger eventLogger, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.paymentMethodLastUsagesPref = paymentMethodLastUsagesPref;
        this.cashier = cashier;
        this.achRelationshipStore = achRelationshipStore;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
    }

    /* compiled from: IavStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiAchRelationship;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.achrelationship.IavStore$createAchRelationship$1", m3645f = "IavStore.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.achrelationship.IavStore$createAchRelationship$1 */
    /* loaded from: classes12.dex */
    static final class C412851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<ApiAchRelationship>>, Object> {
        final /* synthetic */ String $accessToken;
        final /* synthetic */ BigDecimal $amount;
        final /* synthetic */ String $iavAccountId;
        final /* synthetic */ RhAccountType $rhAccountType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C412851(String str, String str2, BigDecimal bigDecimal, RhAccountType rhAccountType, Continuation<? super C412851> continuation) {
            super(2, continuation);
            this.$accessToken = str;
            this.$iavAccountId = str2;
            this.$amount = bigDecimal;
            this.$rhAccountType = rhAccountType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IavStore.this.new C412851(this.$accessToken, this.$iavAccountId, this.$amount, this.$rhAccountType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<ApiAchRelationship>> continuation) {
            return ((C412851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Cashier cashier = IavStore.this.cashier;
            ApiCreateIavRelationshipRequest apiCreateIavRelationshipRequest = new ApiCreateIavRelationshipRequest(this.$accessToken, this.$iavAccountId, this.$amount, this.$rhAccountType);
            this.label = 1;
            Object objCreateIavRelationship = cashier.createIavRelationship(apiCreateIavRelationshipRequest, this);
            return objCreateIavRelationship == coroutine_suspended ? coroutine_suspended : objCreateIavRelationship;
        }
    }

    public final Single<AchRelationship> createAchRelationship(String accessToken, String iavAccountId, BigDecimal amount, RhAccountType rhAccountType, final PlaidIavMetadata plaidIavMetadata, Function1<? super Response<?>, UserInteractionEventData> successEventSupplier, Function1<? super Throwable, UserInteractionEventData> errorEventSupplier) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(iavAccountId, "iavAccountId");
        Intrinsics.checkNotNullParameter(rhAccountType, "rhAccountType");
        Intrinsics.checkNotNullParameter(plaidIavMetadata, "plaidIavMetadata");
        Single singleDoOnError = EventLoggers.logResponseMetadataAndUnwrap(this.eventLogger, RxFactory.DefaultImpls.rxSingle$default(this, null, new C412851(accessToken, iavAccountId, amount, rhAccountType, null), 1, null), successEventSupplier, errorEventSupplier).doOnSuccess(new Consumer() { // from class: com.robinhood.store.achrelationship.IavStore.createAchRelationship.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiAchRelationship apiAchRelationship) {
                StringToLongMapPreference stringToLongMapPreference = IavStore.this.paymentMethodLastUsagesPref;
                String string2 = apiAchRelationship.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                UpdatePaymentMethodLastUsed.updatePaymentMethodLastUsed(stringToLongMapPreference, string2);
                AnalyticsLogger.DefaultImpls.logPlaidIavEventPostSdk$default(IavStore.this.analytics, "CreateRelationshipSuccess", null, plaidIavMetadata.getLinkSessionId(), plaidIavMetadata.getInstitutionId(), plaidIavMetadata.getInstitutionName(), plaidIavMetadata.getSourceTag(), 2, null);
            }
        }).doOnError(new Consumer() { // from class: com.robinhood.store.achrelationship.IavStore.createAchRelationship.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                IavStore.this.analytics.logPlaidIavEventPostSdk("CreateRelationshipFailure", th, plaidIavMetadata.getLinkSessionId(), plaidIavMetadata.getInstitutionId(), plaidIavMetadata.getInstitutionName(), plaidIavMetadata.getSourceTag());
            }
        });
        final AchRelationshipStore achRelationshipStore = this.achRelationshipStore;
        Single<AchRelationship> map = singleDoOnError.doOnSuccess(new Consumer() { // from class: com.robinhood.store.achrelationship.IavStore.createAchRelationship.4
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiAchRelationship p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                achRelationshipStore.saveAchRelationship(p0);
            }
        }).map(new Function() { // from class: com.robinhood.store.achrelationship.IavStore.createAchRelationship.5
            @Override // io.reactivex.functions.Function
            public final AchRelationship apply(ApiAchRelationship p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return AchRelationship2.toDbModel(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Single<Optional<AchRelationship>> submitQueuedDeposit(String accessToken, String iavAccountId, BigDecimal amount, RhAccountType rhAccountType, Function1<? super Response<?>, UserInteractionEventData> queuedDepositSuccessEventSupplier, Function1<? super Throwable, UserInteractionEventData> queuedDepositErrorEventSupplier) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(iavAccountId, "iavAccountId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(rhAccountType, "rhAccountType");
        Single<Optional<AchRelationship>> singleDefault = EventLoggers.logResponseMetadataAndUnwrap(this.eventLogger, RxFactory.DefaultImpls.rxSingle$default(this, null, new C412901(accessToken, iavAccountId, amount, rhAccountType, null), 1, null), queuedDepositSuccessEventSupplier, queuedDepositErrorEventSupplier).ignoreElement().toSingleDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(singleDefault, "toSingleDefault(...)");
        return singleDefault;
    }

    /* compiled from: IavStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.achrelationship.IavStore$submitQueuedDeposit$1", m3645f = "IavStore.kt", m3646l = {101}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.achrelationship.IavStore$submitQueuedDeposit$1 */
    /* loaded from: classes12.dex */
    static final class C412901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<Unit>>, Object> {
        final /* synthetic */ String $accessToken;
        final /* synthetic */ BigDecimal $amount;
        final /* synthetic */ String $iavAccountId;
        final /* synthetic */ RhAccountType $rhAccountType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C412901(String str, String str2, BigDecimal bigDecimal, RhAccountType rhAccountType, Continuation<? super C412901> continuation) {
            super(2, continuation);
            this.$accessToken = str;
            this.$iavAccountId = str2;
            this.$amount = bigDecimal;
            this.$rhAccountType = rhAccountType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IavStore.this.new C412901(this.$accessToken, this.$iavAccountId, this.$amount, this.$rhAccountType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<Unit>> continuation) {
            return ((C412901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Cashier cashier = IavStore.this.cashier;
            ApiCreateQueuedAchDepositRequest apiCreateQueuedAchDepositRequest = new ApiCreateQueuedAchDepositRequest(this.$accessToken, this.$iavAccountId, this.$amount, this.$rhAccountType);
            this.label = 1;
            Object objCreateQueuedDeposit = cashier.createQueuedDeposit(apiCreateQueuedAchDepositRequest, this);
            return objCreateQueuedDeposit == coroutine_suspended ? coroutine_suspended : objCreateQueuedDeposit;
        }
    }
}
