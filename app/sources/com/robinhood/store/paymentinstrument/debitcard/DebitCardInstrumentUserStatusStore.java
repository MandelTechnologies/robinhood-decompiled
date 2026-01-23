package com.robinhood.store.paymentinstrument.debitcard;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentUserStatus;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: DebitCardInstrumentUserStatusStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentUserStatusStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "debitCardUserStatusChannel", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentUserStatus;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "query", "Lcom/robinhood/android/moria/db/Query;", "", "poll", "Lio/reactivex/Observable;", "forceFetchThenPoll", "lib-store-payment-instrument_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardInstrumentUserStatusStore extends Store {
    private final PaymentInstrumentBonfireApi bonfireApi;
    private final SharedFlow2<ApiPaymentInstrumentUserStatus> debitCardUserStatusChannel;
    private final Endpoint<Unit, ApiPaymentInstrumentUserStatus> endpoint;
    private final Query<Object, ApiPaymentInstrumentUserStatus> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebitCardInstrumentUserStatusStore(PaymentInstrumentBonfireApi bonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
        SharedFlow2<ApiPaymentInstrumentUserStatus> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.debitCardUserStatusChannel = sharedFlow2MutableSharedFlow$default;
        this.endpoint = Endpoint.INSTANCE.create(new DebitCardInstrumentUserStatusStore2(this, null), getLogoutKillswitch(), new DebitCardInstrumentUserStatusStore3(sharedFlow2MutableSharedFlow$default), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getFIVE_SECONDS(), storeBundle.getClock()));
        this.query = Store.create$default(this, Query.INSTANCE, "debitCardUserStatusQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardInstrumentUserStatusStore.query$lambda$0(this.f$0, obj);
            }
        })), new Function1() { // from class: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardInstrumentUserStatusStore.query$lambda$2(this.f$0, obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$tryEmit(SharedFlow2 sharedFlow2, ApiPaymentInstrumentUserStatus apiPaymentInstrumentUserStatus, Continuation continuation) {
        sharedFlow2.tryEmit(apiPaymentInstrumentUserStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(DebitCardInstrumentUserStatusStore debitCardInstrumentUserStatusStore, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint8.poll$default(debitCardInstrumentUserStatusStore.endpoint, null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$2(DebitCardInstrumentUserStatusStore debitCardInstrumentUserStatusStore, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.distinctUntilChanged(debitCardInstrumentUserStatusStore.debitCardUserStatusChannel, new Function2() { // from class: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(DebitCardInstrumentUserStatusStore.query$lambda$2$lambda$1((ApiPaymentInstrumentUserStatus) obj, (ApiPaymentInstrumentUserStatus) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean query$lambda$2$lambda$1(ApiPaymentInstrumentUserStatus old, ApiPaymentInstrumentUserStatus apiPaymentInstrumentUserStatus) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(apiPaymentInstrumentUserStatus, "new");
        return old.getUser_status_with_external_provider() == apiPaymentInstrumentUserStatus.getUser_status_with_external_provider();
    }

    public final Observable<ApiPaymentInstrumentUserStatus> poll() {
        return this.query.asObservable(Unit.INSTANCE);
    }

    /* compiled from: DebitCardInstrumentUserStatusStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentUserStatus;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore$forceFetchThenPoll$1", m3645f = "DebitCardInstrumentUserStatusStore.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore$forceFetchThenPoll$1 */
    static final class C415381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiPaymentInstrumentUserStatus>, Object> {
        int label;

        C415381(Continuation<? super C415381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DebitCardInstrumentUserStatusStore.this.new C415381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiPaymentInstrumentUserStatus> continuation) {
            return ((C415381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = DebitCardInstrumentUserStatusStore.this.endpoint;
            this.label = 1;
            Object objForceFetch$default = Endpoint8.forceFetch$default(endpoint, null, this, 1, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Observable<ApiPaymentInstrumentUserStatus> forceFetchThenPoll() {
        Observable<ApiPaymentInstrumentUserStatus> observableFlatMapObservable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C415381(null), 1, null).flatMapObservable(new Function() { // from class: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore.forceFetchThenPoll.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiPaymentInstrumentUserStatus> apply(ApiPaymentInstrumentUserStatus it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return DebitCardInstrumentUserStatusStore.this.query.asObservable(Unit.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        return observableFlatMapObservable;
    }
}
