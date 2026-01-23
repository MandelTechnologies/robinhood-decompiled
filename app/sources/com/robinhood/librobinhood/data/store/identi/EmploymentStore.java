package com.robinhood.librobinhood.data.store.identi;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.identi.ApiEmploymentInfo;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EmploymentStore.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019J4\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001fJ6\u0010\"\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001fH\u0086@¢\u0006\u0002\u0010#R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;", "Lcom/robinhood/store/Store;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/store/StoreBundle;)V", "employmentCache", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/ui/identi/UiEmploymentInfo;", "kotlin.jvm.PlatformType", "employmentSaveAction", "Lkotlin/reflect/KFunction1;", "Lkotlin/jvm/internal/EnhancedNullability;", "", "employmentEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo;", "employmentUpdateEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "refreshEmployment", "force", "", "streamEmploymentInfo", "Lio/reactivex/Observable;", "updateEmploymentInfo", "Lio/reactivex/Single;", "employmentStatus", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;", "occupation", "", "employerName", "employerIndustry", "updateEmploymentInfoCo", "(Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class EmploymentStore extends Store {
    private final BehaviorRelay<UiEmploymentInfo> employmentCache;
    private final Endpoint<Unit, ApiEmploymentInfo> employmentEndpoint;
    private final KFunction<Unit> employmentSaveAction;
    private final PostEndpoint<ApiEmploymentInfo, ApiEmploymentInfo> employmentUpdateEndpoint;

    /* compiled from: EmploymentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.EmploymentStore", m3645f = "EmploymentStore.kt", m3646l = {80}, m3647m = "updateEmploymentInfoCo")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.EmploymentStore$updateEmploymentInfoCo$1 */
    static final class C348331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348331(Continuation<? super C348331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmploymentStore.this.updateEmploymentInfoCo(null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmploymentStore(Identi identi2, StoreBundle storeBundle) {
        super(storeBundle, UiEmploymentInfo.INSTANCE);
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        BehaviorRelay<UiEmploymentInfo> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.employmentCache = behaviorRelayCreate;
        this.employmentSaveAction = new EmploymentStore4(behaviorRelayCreate);
        this.employmentEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new EmploymentStore2(identi2, null), getLogoutKillswitch(), new EmploymentStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.employmentUpdateEndpoint = PostEndpoint.INSTANCE.create(new EmploymentStore5(identi2, null), new EmploymentStore6(this, null));
    }

    public static /* synthetic */ void refreshEmployment$default(EmploymentStore employmentStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        employmentStore.refreshEmployment(z);
    }

    public final void refreshEmployment(boolean force) {
        Endpoint8.refresh$default(this.employmentEndpoint, force, null, 2, null);
    }

    public final Observable<UiEmploymentInfo> streamEmploymentInfo() {
        Observable<UiEmploymentInfo> observableHide = this.employmentCache.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    public static /* synthetic */ Single updateEmploymentInfo$default(EmploymentStore employmentStore, ApiEmploymentInfo.EmploymentStatus employmentStatus, String str, String str2, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return employmentStore.updateEmploymentInfo(employmentStatus, str, str2, str3);
    }

    /* compiled from: EmploymentStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/identi/UiEmploymentInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.EmploymentStore$updateEmploymentInfo$1", m3645f = "EmploymentStore.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.EmploymentStore$updateEmploymentInfo$1 */
    static final class C348321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiEmploymentInfo>, Object> {
        final /* synthetic */ String $employerIndustry;
        final /* synthetic */ String $employerName;
        final /* synthetic */ ApiEmploymentInfo.EmploymentStatus $employmentStatus;
        final /* synthetic */ String $occupation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348321(ApiEmploymentInfo.EmploymentStatus employmentStatus, String str, String str2, String str3, Continuation<? super C348321> continuation) {
            super(2, continuation);
            this.$employmentStatus = employmentStatus;
            this.$occupation = str;
            this.$employerName = str2;
            this.$employerIndustry = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmploymentStore.this.new C348321(this.$employmentStatus, this.$occupation, this.$employerName, this.$employerIndustry, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiEmploymentInfo> continuation) {
            return ((C348321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = EmploymentStore.this.employmentUpdateEndpoint;
                ApiEmploymentInfo apiEmploymentInfo = new ApiEmploymentInfo(this.$employmentStatus, this.$occupation, this.$employerName, this.$employerIndustry);
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiEmploymentInfo, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return UiEmploymentInfo2.toUiModel((ApiEmploymentInfo) obj);
        }
    }

    public final Single<UiEmploymentInfo> updateEmploymentInfo(ApiEmploymentInfo.EmploymentStatus employmentStatus, String occupation, String employerName, String employerIndustry) {
        Intrinsics.checkNotNullParameter(employmentStatus, "employmentStatus");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C348321(employmentStatus, occupation, employerName, employerIndustry, null), 1, null);
    }

    public static /* synthetic */ Object updateEmploymentInfoCo$default(EmploymentStore employmentStore, ApiEmploymentInfo.EmploymentStatus employmentStatus, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return employmentStore.updateEmploymentInfoCo(employmentStatus, str, str2, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateEmploymentInfoCo(ApiEmploymentInfo.EmploymentStatus employmentStatus, String str, String str2, String str3, Continuation<? super UiEmploymentInfo> continuation) {
        C348331 c348331;
        if (continuation instanceof C348331) {
            c348331 = (C348331) continuation;
            int i = c348331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348331.label = i - Integer.MIN_VALUE;
            } else {
                c348331 = new C348331(continuation);
            }
        }
        C348331 c3483312 = c348331;
        Object objPost$default = c3483312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3483312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPost$default);
            PostEndpoint<ApiEmploymentInfo, ApiEmploymentInfo> postEndpoint = this.employmentUpdateEndpoint;
            ApiEmploymentInfo apiEmploymentInfo = new ApiEmploymentInfo(employmentStatus, str, str2, str3);
            c3483312.label = 1;
            objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiEmploymentInfo, null, c3483312, 2, null);
            if (objPost$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPost$default);
        }
        return UiEmploymentInfo2.toUiModel((ApiEmploymentInfo) objPost$default);
    }
}
