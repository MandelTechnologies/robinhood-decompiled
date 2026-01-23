package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.acats.api.AcatsApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.bonfire.ApiAcatsBonusModalContentResponse;
import com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
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

/* compiled from: AcatsBonusStore.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;", "Lcom/robinhood/store/Store;", "acatsApi", "Lcom/robinhood/android/acats/api/AcatsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/acats/api/AcatsApi;Lcom/robinhood/store/StoreBundle;)V", "bonusInfoEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;", "bonusModalEndpoint", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusModalContentResponse;", "getBonusInfo", "Lio/reactivex/Single;", "getBonusModal", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AcatsBonusStore extends Store {
    private final AcatsApi acatsApi;
    private final Endpoint<Unit, ApiAcatsBonusPromoInfo> bonusInfoEndpoint;
    private final Endpoint<Unit, ApiAcatsBonusModalContentResponse> bonusModalEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsBonusStore(AcatsApi acatsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(acatsApi, "acatsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.acatsApi = acatsApi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.bonusInfoEndpoint = Endpoint.Companion.create$default(companion, new AcatsBonusStore2(this, null), getLogoutKillswitch(), new AcatsBonusStore3(null), storeBundle.getClock(), null, 16, null);
        this.bonusModalEndpoint = Endpoint.Companion.create$default(companion, new AcatsBonusStore4(this, null), getLogoutKillswitch(), new AcatsBonusStore5(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: AcatsBonusStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsBonusStore$getBonusInfo$1", m3645f = "AcatsBonusStore.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsBonusStore$getBonusInfo$1 */
    static final class C344571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiAcatsBonusPromoInfo>, Object> {
        int label;

        C344571(Continuation<? super C344571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsBonusStore.this.new C344571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiAcatsBonusPromoInfo> continuation) {
            return ((C344571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = AcatsBonusStore.this.bonusInfoEndpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiAcatsBonusPromoInfo> getBonusInfo() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344571(null), 1, null);
    }

    /* compiled from: AcatsBonusStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusModalContentResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsBonusStore$getBonusModal$1", m3645f = "AcatsBonusStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsBonusStore$getBonusModal$1 */
    static final class C344581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiAcatsBonusModalContentResponse>, Object> {
        int label;

        C344581(Continuation<? super C344581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsBonusStore.this.new C344581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiAcatsBonusModalContentResponse> continuation) {
            return ((C344581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = AcatsBonusStore.this.bonusModalEndpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiAcatsBonusModalContentResponse> getBonusModal() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344581(null), 1, null);
    }
}
