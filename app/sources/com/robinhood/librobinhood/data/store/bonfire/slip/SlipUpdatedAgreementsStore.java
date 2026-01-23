package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.p355ui.UiUpdatedAgreementsResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SlipUpdatedAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0011J\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \f*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "Lcom/robinhood/store/Store;", "slipApi", "Lcom/robinhood/api/retrofit/SlipApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/SlipApi;Lcom/robinhood/store/StoreBundle;)V", "updatedAgreementsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiUpdatedAgreementsResponse;", "kotlin.jvm.PlatformType", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "forceFetchUpdatedAgreementsIfNotCached", "Lio/reactivex/Single;", "bustAgreementCache", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SlipUpdatedAgreementsStore extends Store {
    private final Endpoint<Unit, UiUpdatedAgreementsResponse> endpoint;
    private final SlipApi slipApi;
    private final BehaviorRelay<Optional<UiUpdatedAgreementsResponse>> updatedAgreementsRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipUpdatedAgreementsStore(SlipApi slipApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(slipApi, "slipApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.slipApi = slipApi;
        BehaviorRelay<Optional<UiUpdatedAgreementsResponse>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.updatedAgreementsRelay = behaviorRelayCreate;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SlipUpdatedAgreementsStore2(this, null), getLogoutKillswitch(), new SlipUpdatedAgreementsStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: SlipUpdatedAgreementsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiUpdatedAgreementsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore$forceFetchUpdatedAgreementsIfNotCached$1", m3645f = "SlipUpdatedAgreementsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore$forceFetchUpdatedAgreementsIfNotCached$1 */
    static final class C347781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends UiUpdatedAgreementsResponse>>, Object> {
        int label;

        C347781(Continuation<? super C347781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipUpdatedAgreementsStore.this.new C347781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends UiUpdatedAgreementsResponse>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<UiUpdatedAgreementsResponse>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<UiUpdatedAgreementsResponse>> continuation) {
            return ((C347781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Optional optional = (Optional) SlipUpdatedAgreementsStore.this.updatedAgreementsRelay.getValue();
            return optional == null ? Optional2.INSTANCE : optional;
        }
    }

    public final Single<Optional<UiUpdatedAgreementsResponse>> forceFetchUpdatedAgreementsIfNotCached() {
        Single<Optional<UiUpdatedAgreementsResponse>> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C347781(null), 1, null).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore.forceFetchUpdatedAgreementsIfNotCached.2

            /* compiled from: SlipUpdatedAgreementsStore.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiUpdatedAgreementsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore$forceFetchUpdatedAgreementsIfNotCached$2$1", m3645f = "SlipUpdatedAgreementsStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore$forceFetchUpdatedAgreementsIfNotCached$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends UiUpdatedAgreementsResponse>>, Object> {
                int label;
                final /* synthetic */ SlipUpdatedAgreementsStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SlipUpdatedAgreementsStore slipUpdatedAgreementsStore, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = slipUpdatedAgreementsStore;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends UiUpdatedAgreementsResponse>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super Optional<UiUpdatedAgreementsResponse>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<UiUpdatedAgreementsResponse>> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Endpoint endpoint = this.this$0.endpoint;
                        Unit unit = Unit.INSTANCE;
                        this.label = 1;
                        obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Optional3.asOptional(obj);
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<UiUpdatedAgreementsResponse>> apply(Optional<UiUpdatedAgreementsResponse> updatedAgreementsOptional) {
                Intrinsics.checkNotNullParameter(updatedAgreementsOptional, "updatedAgreementsOptional");
                if (updatedAgreementsOptional.getOrNull() == null) {
                    SlipUpdatedAgreementsStore slipUpdatedAgreementsStore = SlipUpdatedAgreementsStore.this;
                    return RxFactory.DefaultImpls.rxSingle$default(slipUpdatedAgreementsStore, null, new AnonymousClass1(slipUpdatedAgreementsStore, null), 1, null);
                }
                Single singleJust = Single.just(updatedAgreementsOptional);
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final void bustAgreementCache() {
        this.updatedAgreementsRelay.accept(Optional2.INSTANCE);
    }
}
