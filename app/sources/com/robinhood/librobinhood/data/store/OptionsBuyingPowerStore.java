package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiOptionsBuyingPower;
import com.robinhood.models.api.ApiOptionsDisplayedBuyingPower;
import com.robinhood.models.api.ApiOptionsDisplayedBuyingPowerRequest;
import com.robinhood.models.dao.OptionsBuyingPowerDao;
import com.robinhood.models.p320db.OptionsBuyingPower;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionsBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010\u001e\u001a\u00020\u000eJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0 2\u0006\u0010\u001e\u001a\u00020\u000eJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001d2\u0006\u0010#\u001a\u00020$J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'J\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0)2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionsBuyingPowerStore;", "Lcom/robinhood/store/Store;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "bonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "dao", "Lcom/robinhood/models/dao/OptionsBuyingPowerDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;Lcom/robinhood/models/dao/OptionsBuyingPowerDao;Lcom/robinhood/store/StoreBundle;)V", "optionsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/ApiOptionsBuyingPower;", "displayedBuyingPowerEndpoint", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPowerRequest$BuyingPower;", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPower$BuyingPower;", "availableSharesEndpoint", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPowerRequest$NumOfShares;", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPower$NumOfShares;", "availableContractsEndpoint", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPowerRequest$NumOfContracts;", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPower$NumOfContracts;", "streamBuyingPowerForOptions", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/OptionsBuyingPower;", "streamOptionsBuyingPower", "Lio/reactivex/Observable;", "accountNumber", "forceFetchOptionsBuyingPower", "Lio/reactivex/Single;", "pollOptionsDisplayedBuyingPower", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPower;", "request", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPowerRequest;", "pollOptionsBuyingPowerAsIfPreviousOrderCanceled", "orderToReplaceId", "Ljava/util/UUID;", "getBuyingPowerForOptionsFunction", "Lkotlinx/coroutines/flow/Flow;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionsBuyingPowerStore extends Store {
    private final Endpoint<ApiOptionsDisplayedBuyingPowerRequest.NumOfContracts, ApiOptionsDisplayedBuyingPower.NumOfContracts> availableContractsEndpoint;
    private final Endpoint<ApiOptionsDisplayedBuyingPowerRequest.NumOfShares, ApiOptionsDisplayedBuyingPower.NumOfShares> availableSharesEndpoint;
    private final OptionsBonfireApi bonfireApi;
    private final OptionsBuyingPowerDao dao;
    private final Endpoint<ApiOptionsDisplayedBuyingPowerRequest.BuyingPower, ApiOptionsDisplayedBuyingPower.BuyingPower> displayedBuyingPowerEndpoint;
    private final OptionsApi optionsApi;
    private final Endpoint<String, ApiOptionsBuyingPower> optionsEndpoint;
    private final Query<String, OptionsBuyingPower> streamBuyingPowerForOptions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsBuyingPowerStore(OptionsApi optionsApi, OptionsBonfireApi bonfireApi, OptionsBuyingPowerDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.optionsApi = optionsApi;
        this.bonfireApi = bonfireApi;
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.optionsEndpoint = companion.create(new OptionsBuyingPowerStore$optionsEndpoint$1(this, null), getLogoutKillswitch(), new OptionsBuyingPowerStore$optionsEndpoint$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(OptionsBuyingPower.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.displayedBuyingPowerEndpoint = Endpoint.Companion.create$default(companion, new OptionsBuyingPowerStore$displayedBuyingPowerEndpoint$1(this, null), getLogoutKillswitch(), new OptionsBuyingPowerStore$displayedBuyingPowerEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.availableSharesEndpoint = Endpoint.Companion.create$default(companion, new OptionsBuyingPowerStore$availableSharesEndpoint$1(this, null), getLogoutKillswitch(), new OptionsBuyingPowerStore$availableSharesEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.availableContractsEndpoint = Endpoint.Companion.create$default(companion, new OptionsBuyingPowerStore$availableContractsEndpoint$1(this, null), getLogoutKillswitch(), new OptionsBuyingPowerStore$availableContractsEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.streamBuyingPowerForOptions = Store.create$default(this, Query.INSTANCE, CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsBuyingPowerStore.streamBuyingPowerForOptions$lambda$0(this.f$0, (String) obj);
            }
        })), new OptionsBuyingPowerStore$streamBuyingPowerForOptions$2(this), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamBuyingPowerForOptions$lambda$0(OptionsBuyingPowerStore optionsBuyingPowerStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.poll$default(optionsBuyingPowerStore.optionsEndpoint, accountNumber, null, null, 6, null);
    }

    public final Observable<OptionsBuyingPower> streamOptionsBuyingPower(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.streamBuyingPowerForOptions.asObservable(accountNumber);
    }

    /* compiled from: OptionsBuyingPowerStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionsBuyingPower;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore$forceFetchOptionsBuyingPower$1", m3645f = "OptionsBuyingPowerStore.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore$forceFetchOptionsBuyingPower$1 */
    static final class C341661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiOptionsBuyingPower>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341661(String str, Continuation<? super C341661> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsBuyingPowerStore.this.new C341661(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiOptionsBuyingPower> continuation) {
            return ((C341661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = OptionsBuyingPowerStore.this.optionsEndpoint;
            String str = this.$accountNumber;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiOptionsBuyingPower> forceFetchOptionsBuyingPower(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C341661(accountNumber, null), 1, null);
    }

    public final Observable<ApiOptionsDisplayedBuyingPower> pollOptionsDisplayedBuyingPower(ApiOptionsDisplayedBuyingPowerRequest request) {
        Flow flowPoll$default;
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof ApiOptionsDisplayedBuyingPowerRequest.BuyingPower) {
            flowPoll$default = Endpoint.DefaultImpls.poll$default(this.displayedBuyingPowerEndpoint, request, null, null, 6, null);
        } else if (request instanceof ApiOptionsDisplayedBuyingPowerRequest.NumOfContracts) {
            flowPoll$default = Endpoint.DefaultImpls.poll$default(this.availableContractsEndpoint, request, null, null, 6, null);
        } else {
            if (!(request instanceof ApiOptionsDisplayedBuyingPowerRequest.NumOfShares)) {
                throw new NoWhenBranchMatchedException();
            }
            flowPoll$default = Endpoint.DefaultImpls.poll$default(this.availableSharesEndpoint, request, null, null, 6, null);
        }
        return asObservable(flowPoll$default);
    }

    public final Observable<OptionsBuyingPower> pollOptionsBuyingPowerAsIfPreviousOrderCanceled(String accountNumber, UUID orderToReplaceId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderToReplaceId, "orderToReplaceId");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(this.displayedBuyingPowerEndpoint, new ApiOptionsDisplayedBuyingPowerRequest.BuyingPower(accountNumber, orderToReplaceId), null, null, 6, null);
        return asObservable(new Flow<OptionsBuyingPower>() { // from class: com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore$pollOptionsBuyingPowerAsIfPreviousOrderCanceled$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OptionsBuyingPower> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore$pollOptionsBuyingPowerAsIfPreviousOrderCanceled$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore$pollOptionsBuyingPowerAsIfPreviousOrderCanceled$$inlined$map$1$2", m3645f = "OptionsBuyingPowerStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore$pollOptionsBuyingPowerAsIfPreviousOrderCanceled$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        ApiOptionsDisplayedBuyingPower.BuyingPower buyingPower = (ApiOptionsDisplayedBuyingPower.BuyingPower) obj;
                        OptionsBuyingPower optionsBuyingPower = new OptionsBuyingPower(buyingPower.getAccount_number(), buyingPower.getBuying_power());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionsBuyingPower, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<OptionsBuyingPower> getBuyingPowerForOptionsFunction(String accountNumber) {
        return this.dao.getOptionsBuyingPower(accountNumber);
    }
}
