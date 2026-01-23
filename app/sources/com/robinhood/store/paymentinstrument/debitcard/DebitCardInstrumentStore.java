package com.robinhood.store.paymentinstrument.debitcard;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiUpdateDebitCardRequest;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentStatus;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p479j$.time.Clock;
import retrofit2.Response;

/* compiled from: DebitCardInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0#J\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0#J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0#2\u0006\u0010&\u001a\u00020\u0016J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0016J*\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d0+2\u0006\u0010,\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \f*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u000b0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "debitCardInstrumentsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;", "kotlin.jvm.PlatformType", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "defaultUpdateSaveAction", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/jvm/functions/Function2;", "singleEndpoint", "Ljava/util/UUID;", "updateEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiUpdateDebitCardRequest;", "verifyEndpoint", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore$VerifyEndpointData;", "Lretrofit2/Response;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "getAllDebitCardInstruments", "Lio/reactivex/Observable;", "getActiveDebitCardInstruments", "getDebitCardInstrument", "id", "unlinkDebitCardInstrument", "Lio/reactivex/Completable;", "debitCardInstrumentId", "verifyDebitCard", "Lio/reactivex/Single;", "verifyOnly", "verificationCode", "", "VerifyEndpointData", "lib-store-payment-instrument_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardInstrumentStore extends Store {
    private final PaymentInstrumentBonfireApi bonfireApi;
    private final BehaviorRelay<List<ApiPaymentInstrument>> debitCardInstrumentsRelay;
    private final Function2<ApiPaymentInstrument, Continuation<? super Unit>, Object> defaultUpdateSaveAction;
    private final Endpoint<Unit, List<ApiPaymentInstrument>> endpoint;
    private final Endpoint<UUID, ApiPaymentInstrument> singleEndpoint;
    private final PostEndpoint<Tuples2<UUID, ApiUpdateDebitCardRequest>, ApiPaymentInstrument> updateEndpoint;
    private final PostEndpoint<VerifyEndpointData, Response<ApiPaymentInstrument>> verifyEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebitCardInstrumentStore(PaymentInstrumentBonfireApi bonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
        BehaviorRelay<List<ApiPaymentInstrument>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.debitCardInstrumentsRelay = behaviorRelayCreate;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        DebitCardInstrumentStore3 debitCardInstrumentStore3 = new DebitCardInstrumentStore3(behaviorRelayCreate);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Durations durations = Durations.INSTANCE;
        this.endpoint = companion.create(new DebitCardInstrumentStore4(this, null), logoutKillswitch, debitCardInstrumentStore3, clock, new DefaultStaleDecider(durations.getONE_MINUTE(), storeBundle.getClock()));
        DebitCardInstrumentStore2 debitCardInstrumentStore2 = new DebitCardInstrumentStore2(this, null);
        this.defaultUpdateSaveAction = debitCardInstrumentStore2;
        this.singleEndpoint = companion.create(new DebitCardInstrumentStore5(this, null), getLogoutKillswitch(), debitCardInstrumentStore2, storeBundle.getClock(), new DefaultStaleDecider(durations.getONE_MINUTE(), storeBundle.getClock()));
        PostEndpoint.Companion companion2 = PostEndpoint.INSTANCE;
        this.updateEndpoint = companion2.create(new DebitCardInstrumentStore6(this, null), debitCardInstrumentStore2);
        this.verifyEndpoint = companion2.create(new DebitCardInstrumentStore7(this, null), new DebitCardInstrumentStore8(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$accept(BehaviorRelay behaviorRelay, List list, Continuation continuation) {
        behaviorRelay.accept(list);
        return Unit.INSTANCE;
    }

    /* compiled from: DebitCardInstrumentStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore$VerifyEndpointData;", "", "instrumentId", "Ljava/util/UUID;", "verificationCode", "", "verifyOnly", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Z)V", "getInstrumentId", "()Ljava/util/UUID;", "getVerificationCode", "()Ljava/lang/String;", "getVerifyOnly", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-payment-instrument_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerifyEndpointData {
        private final UUID instrumentId;
        private final String verificationCode;
        private final boolean verifyOnly;

        public static /* synthetic */ VerifyEndpointData copy$default(VerifyEndpointData verifyEndpointData, UUID uuid, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = verifyEndpointData.instrumentId;
            }
            if ((i & 2) != 0) {
                str = verifyEndpointData.verificationCode;
            }
            if ((i & 4) != 0) {
                z = verifyEndpointData.verifyOnly;
            }
            return verifyEndpointData.copy(uuid, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVerificationCode() {
            return this.verificationCode;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getVerifyOnly() {
            return this.verifyOnly;
        }

        public final VerifyEndpointData copy(UUID instrumentId, String verificationCode, boolean verifyOnly) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(verificationCode, "verificationCode");
            return new VerifyEndpointData(instrumentId, verificationCode, verifyOnly);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerifyEndpointData)) {
                return false;
            }
            VerifyEndpointData verifyEndpointData = (VerifyEndpointData) other;
            return Intrinsics.areEqual(this.instrumentId, verifyEndpointData.instrumentId) && Intrinsics.areEqual(this.verificationCode, verifyEndpointData.verificationCode) && this.verifyOnly == verifyEndpointData.verifyOnly;
        }

        public int hashCode() {
            return (((this.instrumentId.hashCode() * 31) + this.verificationCode.hashCode()) * 31) + Boolean.hashCode(this.verifyOnly);
        }

        public String toString() {
            return "VerifyEndpointData(instrumentId=" + this.instrumentId + ", verificationCode=" + this.verificationCode + ", verifyOnly=" + this.verifyOnly + ")";
        }

        public VerifyEndpointData(UUID instrumentId, String verificationCode, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(verificationCode, "verificationCode");
            this.instrumentId = instrumentId;
            this.verificationCode = verificationCode;
            this.verifyOnly = z;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getVerificationCode() {
            return this.verificationCode;
        }

        public final boolean getVerifyOnly() {
            return this.verifyOnly;
        }
    }

    public static /* synthetic */ Job refresh$default(DebitCardInstrumentStore debitCardInstrumentStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return debitCardInstrumentStore.refresh(z);
    }

    public final Job refresh(boolean force) {
        return Endpoint8.refresh$default(this.endpoint, force, null, 2, null);
    }

    public final Observable<List<ApiPaymentInstrument>> getAllDebitCardInstruments() {
        Endpoint8.refresh$default(this.endpoint, false, null, 2, null);
        return this.debitCardInstrumentsRelay;
    }

    public final Observable<List<ApiPaymentInstrument>> getActiveDebitCardInstruments() {
        Observable map = getAllDebitCardInstruments().map(new Function() { // from class: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore.getActiveDebitCardInstruments.1
            @Override // io.reactivex.functions.Function
            public final List<ApiPaymentInstrument> apply(List<ApiPaymentInstrument> debitCardInstruments) {
                Intrinsics.checkNotNullParameter(debitCardInstruments, "debitCardInstruments");
                ArrayList arrayList = new ArrayList();
                for (T t : debitCardInstruments) {
                    ApiPaymentInstrument apiPaymentInstrument = (ApiPaymentInstrument) t;
                    if (apiPaymentInstrument.getPayment_instrument_status() != PaymentInstrumentStatus.DELETED && apiPaymentInstrument.getPayment_instrument_status() != PaymentInstrumentStatus.DISABLED && apiPaymentInstrument.getPayment_instrument_status() != PaymentInstrumentStatus.DISABLED_ACCOUNT && apiPaymentInstrument.getPayment_instrument_status() != PaymentInstrumentStatus.FAILED && apiPaymentInstrument.getPayment_instrument_status() != PaymentInstrumentStatus.PENDING_DELETION && apiPaymentInstrument.getPayment_instrument_status() != PaymentInstrumentStatus.PENDING_ACTIVATION) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<ApiPaymentInstrument> getDebitCardInstrument(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return asObservable(Endpoint.DefaultImpls.poll$default(this.singleEndpoint, id, null, null, 6, null));
    }

    /* compiled from: DebitCardInstrumentStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$unlinkDebitCardInstrument$1", m3645f = "DebitCardInstrumentStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$unlinkDebitCardInstrument$1 */
    static final class C415361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $debitCardInstrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C415361(UUID uuid, Continuation<? super C415361> continuation) {
            super(2, continuation);
            this.$debitCardInstrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DebitCardInstrumentStore.this.new C415361(this.$debitCardInstrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C415361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = DebitCardInstrumentStore.this.updateEndpoint;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$debitCardInstrumentId, new ApiUpdateDebitCardRequest(true, null));
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Completable unlinkDebitCardInstrument(UUID debitCardInstrumentId) {
        Intrinsics.checkNotNullParameter(debitCardInstrumentId, "debitCardInstrumentId");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C415361(debitCardInstrumentId, null), 1, null);
    }

    /* compiled from: DebitCardInstrumentStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$verifyDebitCard$1", m3645f = "DebitCardInstrumentStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$verifyDebitCard$1 */
    static final class C415371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<ApiPaymentInstrument>>, Object> {
        final /* synthetic */ UUID $debitCardInstrumentId;
        final /* synthetic */ String $verificationCode;
        final /* synthetic */ boolean $verifyOnly;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C415371(UUID uuid, String str, boolean z, Continuation<? super C415371> continuation) {
            super(2, continuation);
            this.$debitCardInstrumentId = uuid;
            this.$verificationCode = str;
            this.$verifyOnly = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DebitCardInstrumentStore.this.new C415371(this.$debitCardInstrumentId, this.$verificationCode, this.$verifyOnly, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<ApiPaymentInstrument>> continuation) {
            return ((C415371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = DebitCardInstrumentStore.this.verifyEndpoint;
            VerifyEndpointData verifyEndpointData = new VerifyEndpointData(this.$debitCardInstrumentId, this.$verificationCode, this.$verifyOnly);
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, verifyEndpointData, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<Response<ApiPaymentInstrument>> verifyDebitCard(boolean verifyOnly, UUID debitCardInstrumentId, String verificationCode) {
        Intrinsics.checkNotNullParameter(debitCardInstrumentId, "debitCardInstrumentId");
        Intrinsics.checkNotNullParameter(verificationCode, "verificationCode");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C415371(debitCardInstrumentId, verificationCode, verifyOnly, null), 1, null);
    }
}
