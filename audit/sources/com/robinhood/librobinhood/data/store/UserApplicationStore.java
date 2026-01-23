package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.p355ui.identi.UiApplication;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.logging.TimberLogger;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: UserApplicationStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/api/retrofit/Identi;", "identi", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/retrofit/Identi;)V", "Lcom/robinhood/models/ui/identi/UiApplication;", "coGetApplication", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "getApplication", "()Lio/reactivex/Single;", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "pollApplicationUntilFinal", "(Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "Lio/reactivex/Observable;", "pollApplicationUntilFinalObservable", "(Lj$/time/Duration;)Lio/reactivex/Observable;", "Lcom/robinhood/api/retrofit/Identi;", "Lcom/robinhood/android/moria/network/Endpoint;", "", "getApplicationEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class UserApplicationStore extends Store {
    private final Endpoint<Unit, Optional<UiApplication>> getApplicationEndpoint;
    private final Identi identi;

    /* compiled from: UserApplicationStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.UserApplicationStore", m3645f = "UserApplicationStore.kt", m3646l = {50}, m3647m = "coGetApplication")
    /* renamed from: com.robinhood.librobinhood.data.store.UserApplicationStore$coGetApplication$1 */
    static final class C344281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C344281(Continuation<? super C344281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserApplicationStore.this.coGetApplication(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserApplicationStore(StoreBundle storeBundle, Identi identi2) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(identi2, "identi");
        this.identi = identi2;
        this.getApplicationEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new UserApplicationStore2(this, null), getLogoutKillswitch(), new UserApplicationStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object coGetApplication(Continuation<? super UiApplication> continuation) {
        C344281 c344281;
        if (continuation instanceof C344281) {
            c344281 = (C344281) continuation;
            int i = c344281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c344281.label = i - Integer.MIN_VALUE;
            } else {
                c344281 = new C344281(continuation);
            }
        }
        Object objForceFetch$default = c344281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c344281.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objForceFetch$default);
                Endpoint<Unit, Optional<UiApplication>> endpoint = this.getApplicationEndpoint;
                c344281.label = 1;
                objForceFetch$default = Endpoint8.forceFetch$default(endpoint, null, c344281, 1, null);
                if (objForceFetch$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objForceFetch$default);
            }
            return (UiApplication) ((Optional) objForceFetch$default).getOrNull();
        } catch (Exception unused) {
            TimberLogger.INSTANCE.mo1679d("Unable to fetch application", new Object[0]);
            return null;
        }
    }

    /* compiled from: UserApplicationStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/identi/UiApplication;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.UserApplicationStore$getApplication$1", m3645f = "UserApplicationStore.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.UserApplicationStore$getApplication$1 */
    static final class C344291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends UiApplication>>, Object> {
        int label;

        C344291(Continuation<? super C344291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserApplicationStore.this.new C344291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends UiApplication>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<UiApplication>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<UiApplication>> continuation) {
            return ((C344291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = UserApplicationStore.this.getApplicationEndpoint;
            this.label = 1;
            Object objForceFetch$default = Endpoint8.forceFetch$default(endpoint, null, this, 1, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<Optional<UiApplication>> getApplication() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344291(null), 1, null);
    }

    public static /* synthetic */ Flow pollApplicationUntilFinal$default(UserApplicationStore userApplicationStore, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return userApplicationStore.pollApplicationUntilFinal(duration);
    }

    public final Flow<UiApplication> pollApplicationUntilFinal(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        return FlowKt.transformWhile(Endpoint8.poll$default(this.getApplicationEndpoint, duration, null, 2, null), new C344301(null));
    }

    /* compiled from: UserApplicationStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/ui/identi/UiApplication;", "<destruct>", "Lcom/robinhood/utils/Optional;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.UserApplicationStore$pollApplicationUntilFinal$1", m3645f = "UserApplicationStore.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.UserApplicationStore$pollApplicationUntilFinal$1 */
    static final class C344301 extends ContinuationImpl7 implements Function3<FlowCollector<? super UiApplication>, Optional<? extends UiApplication>, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C344301(Continuation<? super C344301> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super UiApplication> flowCollector, Optional<? extends UiApplication> optional, Continuation<? super Boolean> continuation) {
            return invoke2(flowCollector, (Optional<UiApplication>) optional, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super UiApplication> flowCollector, Optional<UiApplication> optional, Continuation<? super Boolean> continuation) {
            C344301 c344301 = new C344301(continuation);
            c344301.L$0 = flowCollector;
            c344301.L$1 = optional;
            return c344301.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UiApplication uiApplication;
            UiApplication uiApplication2;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                uiApplication = (UiApplication) ((Optional) this.L$1).component1();
                if (uiApplication != null) {
                    this.L$0 = uiApplication;
                    this.label = 1;
                    if (flowCollector.emit(uiApplication, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    uiApplication2 = uiApplication;
                }
                z = false;
                if (uiApplication != null && uiApplication.isStateFinal()) {
                    z = true;
                }
                return boxing.boxBoolean(!z);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uiApplication2 = (UiApplication) this.L$0;
            ResultKt.throwOnFailure(obj);
            uiApplication = uiApplication2;
            z = false;
            if (uiApplication != null) {
                z = true;
            }
            return boxing.boxBoolean(!z);
        }
    }

    public static /* synthetic */ Observable pollApplicationUntilFinalObservable$default(UserApplicationStore userApplicationStore, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return userApplicationStore.pollApplicationUntilFinalObservable(duration);
    }

    public final Observable<UiApplication> pollApplicationUntilFinalObservable(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        return asObservable(pollApplicationUntilFinal(duration));
    }
}
