package com.robinhood.android.rollover401k.steps.verifyinfo;

import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverSubmitUserInfoResponse;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverUserInfoResponse;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Rollover401kVerifyInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoViewState;", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo$RolloverVerifyInfoEvent;", "rolloverStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "submitUserInfo", "", "RolloverVerifyInfoEvent", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class Rollover401kVerifyInfoDuxo extends BaseDuxo5<Rollover401kVerifyInfoViewState, RolloverVerifyInfoEvent> {
    public static final int $stable = 8;
    private final Retirement401kRolloverStore rolloverStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rollover401kVerifyInfoDuxo(Retirement401kRolloverStore rolloverStore, DuxoBundle duxoBundle) {
        super(new Rollover401kVerifyInfoViewState(null, false, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(rolloverStore, "rolloverStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rolloverStore = rolloverStore;
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C277781(null));
    }

    /* compiled from: Rollover401kVerifyInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoDuxo$1", m3645f = "Rollover401kVerifyInfoDuxo.kt", m3646l = {23}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoDuxo$1 */
    static final class C277781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C277781(Continuation<? super C277781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Rollover401kVerifyInfoDuxo.this.new C277781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Retirement401kRolloverStore retirement401kRolloverStore = Rollover401kVerifyInfoDuxo.this.rolloverStore;
                this.label = 1;
                obj = retirement401kRolloverStore.get401kRolloverUserInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Rollover401kVerifyInfoDuxo.this.applyMutation(new AnonymousClass1((ApiRetirement401kRolloverUserInfoResponse) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: Rollover401kVerifyInfoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoDuxo$1$1", m3645f = "Rollover401kVerifyInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Rollover401kVerifyInfoViewState, Continuation<? super Rollover401kVerifyInfoViewState>, Object> {
            final /* synthetic */ ApiRetirement401kRolloverUserInfoResponse $userInfo;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiRetirement401kRolloverUserInfoResponse apiRetirement401kRolloverUserInfoResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$userInfo = apiRetirement401kRolloverUserInfoResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userInfo, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Rollover401kVerifyInfoViewState rollover401kVerifyInfoViewState, Continuation<? super Rollover401kVerifyInfoViewState> continuation) {
                return ((AnonymousClass1) create(rollover401kVerifyInfoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Rollover401kVerifyInfoViewState.copy$default((Rollover401kVerifyInfoViewState) this.L$0, this.$userInfo, false, 2, null);
            }
        }
    }

    /* compiled from: Rollover401kVerifyInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoDuxo$submitUserInfo$1", m3645f = "Rollover401kVerifyInfoDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoDuxo$submitUserInfo$1 */
    static final class C277791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C277791(Continuation<? super C277791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Rollover401kVerifyInfoDuxo.this.new C277791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Rollover401kVerifyInfoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoDuxo$submitUserInfo$1$1", m3645f = "Rollover401kVerifyInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoDuxo$submitUserInfo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Rollover401kVerifyInfoViewState, Continuation<? super Rollover401kVerifyInfoViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Rollover401kVerifyInfoViewState rollover401kVerifyInfoViewState, Continuation<? super Rollover401kVerifyInfoViewState> continuation) {
                return ((AnonymousClass1) create(rollover401kVerifyInfoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Rollover401kVerifyInfoViewState.copy$default((Rollover401kVerifyInfoViewState) this.L$0, null, true, 1, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Rollover401kVerifyInfoDuxo.this.applyMutation(new AnonymousClass1(null));
                    Retirement401kRolloverStore retirement401kRolloverStore = Rollover401kVerifyInfoDuxo.this.rolloverStore;
                    this.label = 1;
                    obj = retirement401kRolloverStore.submit401kRolloverUserInfo(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Rollover401kVerifyInfoDuxo.this.submit(new RolloverVerifyInfoEvent.NavigateForward(((ApiRetirement401kRolloverSubmitUserInfoResponse) obj).getDeeplink()));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    throw th;
                }
                Rollover401kVerifyInfoDuxo.this.submit(new RolloverVerifyInfoEvent.NetworkError(th));
                Rollover401kVerifyInfoDuxo.this.applyMutation(new Rollover401kVerifyInfoDuxo2(null));
                return Unit.INSTANCE;
            }
        }
    }

    public final void submitUserInfo() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C277791(null), 3, null);
    }

    /* compiled from: Rollover401kVerifyInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo$RolloverVerifyInfoEvent;", "", "NavigateForward", "NetworkError", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo$RolloverVerifyInfoEvent$NavigateForward;", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo$RolloverVerifyInfoEvent$NetworkError;", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RolloverVerifyInfoEvent {

        /* compiled from: Rollover401kVerifyInfoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo$RolloverVerifyInfoEvent$NavigateForward;", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo$RolloverVerifyInfoEvent;", "deeplink", "", "<init>", "(Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NavigateForward implements RolloverVerifyInfoEvent {
            public static final int $stable = 0;
            private final String deeplink;

            public static /* synthetic */ NavigateForward copy$default(NavigateForward navigateForward, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = navigateForward.deeplink;
                }
                return navigateForward.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final NavigateForward copy(String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return new NavigateForward(deeplink);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateForward) && Intrinsics.areEqual(this.deeplink, ((NavigateForward) other).deeplink);
            }

            public int hashCode() {
                return this.deeplink.hashCode();
            }

            public String toString() {
                return "NavigateForward(deeplink=" + this.deeplink + ")";
            }

            public NavigateForward(String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }
        }

        /* compiled from: Rollover401kVerifyInfoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo$RolloverVerifyInfoEvent$NetworkError;", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo$RolloverVerifyInfoEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NetworkError implements RolloverVerifyInfoEvent {
            public static final int $stable = 8;
            private final Throwable throwable;

            public static /* synthetic */ NetworkError copy$default(NetworkError networkError, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = networkError.throwable;
                }
                return networkError.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final NetworkError copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new NetworkError(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NetworkError) && Intrinsics.areEqual(this.throwable, ((NetworkError) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "NetworkError(throwable=" + this.throwable + ")";
            }

            public NetworkError(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }
}
