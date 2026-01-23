package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.odyssey.RegionApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.I18nRegionOverrideExperiment;
import com.robinhood.models.api.UserRegion;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UserRegionStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "Lcom/robinhood/store/Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionApi", "Lcom/robinhood/api/odyssey/RegionApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/api/odyssey/RegionApi;Lcom/robinhood/store/StoreBundle;)V", "defaultRegion", "Lcom/robinhood/models/api/UserRegion;", "getRegionEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "coGetCurrentRegion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentRegion", "Lio/reactivex/Single;", "regionEndpoint", "getRegion", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class UserRegionStore extends Store {
    private final UserRegion defaultRegion;
    private final ExperimentsStore experimentsStore;
    private final Endpoint<Unit, UserRegion> getRegionEndpoint;
    private final RegionApi regionApi;
    private final Endpoint<Unit, UserRegion> regionEndpoint;

    /* compiled from: UserRegionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.UserRegionStore", m3645f = "UserRegionStore.kt", m3646l = {37, 42}, m3647m = "coGetCurrentRegion")
    /* renamed from: com.robinhood.librobinhood.data.store.UserRegionStore$coGetCurrentRegion$1 */
    /* loaded from: classes13.dex */
    static final class C344321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C344321(Continuation<? super C344321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRegionStore.this.coGetCurrentRegion(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRegionStore(ExperimentsStore experimentsStore, RegionApi regionApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionApi, "regionApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.experimentsStore = experimentsStore;
        this.regionApi = regionApi;
        this.defaultRegion = new UserRegion(CountryCode.COUNTRY_CODE_US);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getRegionEndpoint = Endpoint.Companion.create$default(companion, new UserRegionStore2(this, null), getLogoutKillswitch(), new UserRegionStore3(null), storeBundle.getClock(), null, 16, null);
        this.regionEndpoint = Endpoint.Companion.create$default(companion, new UserRegionStore4(this, null), getLogoutKillswitch(), new UserRegionStore5(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r10 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object coGetCurrentRegion(Continuation<? super UserRegion> continuation) {
        C344321 c344321;
        C344321 c3443212;
        if (continuation instanceof C344321) {
            c344321 = (C344321) continuation;
            int i = c344321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c344321.label = i - Integer.MIN_VALUE;
            } else {
                c344321 = new C344321(continuation);
            }
        }
        C344321 c3443213 = c344321;
        Object variant$default = c3443213.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3443213.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(variant$default);
            ExperimentsStore experimentsStore = this.experimentsStore;
            I18nRegionOverrideExperiment i18nRegionOverrideExperiment = I18nRegionOverrideExperiment.INSTANCE;
            I18nRegionOverrideExperiment.Variant variant = I18nRegionOverrideExperiment.Variant.CONTROL;
            c3443213.label = 1;
            c3443212 = c3443213;
            variant$default = ExperimentsStore.getVariant$default(experimentsStore, i18nRegionOverrideExperiment, variant, false, c3443212, 4, null);
            if (variant$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(variant$default);
            return (UserRegion) variant$default;
        }
        ResultKt.throwOnFailure(variant$default);
        c3443212 = c3443213;
        I18nRegionOverrideExperiment.Variant variant2 = (I18nRegionOverrideExperiment.Variant) variant$default;
        if (variant2 == I18nRegionOverrideExperiment.Variant.CONTROL) {
            Endpoint<Unit, UserRegion> endpoint = this.getRegionEndpoint;
            Unit unit = Unit.INSTANCE;
            c3443212.label = 2;
            variant$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, c3443212, 2, null);
        } else {
            String upperCase = variant2.getServerValue().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return new UserRegion(upperCase);
        }
    }

    /* compiled from: UserRegionStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/UserRegion;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.UserRegionStore$getCurrentRegion$1", m3645f = "UserRegionStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.UserRegionStore$getCurrentRegion$1 */
    /* loaded from: classes13.dex */
    static final class C344331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UserRegion>, Object> {
        int label;

        C344331(Continuation<? super C344331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserRegionStore.this.new C344331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserRegion> continuation) {
            return ((C344331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            UserRegionStore userRegionStore = UserRegionStore.this;
            this.label = 1;
            Object objCoGetCurrentRegion = userRegionStore.coGetCurrentRegion(this);
            return objCoGetCurrentRegion == coroutine_suspended ? coroutine_suspended : objCoGetCurrentRegion;
        }
    }

    public final Single<UserRegion> getCurrentRegion() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344331(null), 1, null);
    }

    /* compiled from: UserRegionStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/UserRegion;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.UserRegionStore$getRegion$1", m3645f = "UserRegionStore.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.UserRegionStore$getRegion$1 */
    /* loaded from: classes13.dex */
    static final class C344341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UserRegion>, Object> {
        int label;

        C344341(Continuation<? super C344341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserRegionStore.this.new C344341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserRegion> continuation) {
            return ((C344341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = UserRegionStore.this.regionEndpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<UserRegion> getRegion() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344341(null), 1, null);
    }
}
