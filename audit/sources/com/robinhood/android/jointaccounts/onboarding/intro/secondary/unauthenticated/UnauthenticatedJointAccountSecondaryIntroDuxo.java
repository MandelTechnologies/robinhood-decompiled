package com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated;

import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountSecondaryIntroViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountSecondaryIntroResponse;
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

/* compiled from: UnauthenticatedJointAccountSecondaryIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/unauthenticated/UnauthenticatedJointAccountSecondaryIntroDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;", "api", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "fetchData", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class UnauthenticatedJointAccountSecondaryIntroDuxo extends BaseDuxo4<JointAccountSecondaryIntroViewState> {
    private static final String LOGGING_IDENTIFIER = "unauthenticated";
    private final JointAccountsApi api;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnauthenticatedJointAccountSecondaryIntroDuxo(JointAccountsApi api, DuxoBundle duxoBundle) {
        super(JointAccountSecondaryIntroViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.api = api;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        fetchData();
    }

    /* compiled from: UnauthenticatedJointAccountSecondaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroDuxo$fetchData$1", m3645f = "UnauthenticatedJointAccountSecondaryIntroDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroDuxo$fetchData$1 */
    static final class C201121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C201121(Continuation<? super C201121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UnauthenticatedJointAccountSecondaryIntroDuxo.this.new C201121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UnauthenticatedJointAccountSecondaryIntroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroDuxo$fetchData$1$1", m3645f = "UnauthenticatedJointAccountSecondaryIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroDuxo$fetchData$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<JointAccountSecondaryIntroViewState, Continuation<? super JointAccountSecondaryIntroViewState>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(JointAccountSecondaryIntroViewState jointAccountSecondaryIntroViewState, Continuation<? super JointAccountSecondaryIntroViewState> continuation) {
                return ((AnonymousClass1) create(jointAccountSecondaryIntroViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return JointAccountSecondaryIntroViewState.Loading.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UnauthenticatedJointAccountSecondaryIntroDuxo.this.applyMutation(new AnonymousClass1(null));
                    JointAccountsApi jointAccountsApi = UnauthenticatedJointAccountSecondaryIntroDuxo.this.api;
                    this.label = 1;
                    obj = jointAccountsApi.getSecondaryIntroLoggedOut(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                UnauthenticatedJointAccountSecondaryIntroDuxo.this.applyMutation(new AnonymousClass2((ApiJointAccountSecondaryIntroResponse) obj, null));
            } catch (Exception unused) {
                UnauthenticatedJointAccountSecondaryIntroDuxo.this.applyMutation(new AnonymousClass3(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: UnauthenticatedJointAccountSecondaryIntroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroDuxo$fetchData$1$2", m3645f = "UnauthenticatedJointAccountSecondaryIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroDuxo$fetchData$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<JointAccountSecondaryIntroViewState, Continuation<? super JointAccountSecondaryIntroViewState>, Object> {
            final /* synthetic */ ApiJointAccountSecondaryIntroResponse $response;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ApiJointAccountSecondaryIntroResponse apiJointAccountSecondaryIntroResponse, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$response = apiJointAccountSecondaryIntroResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$response, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(JointAccountSecondaryIntroViewState jointAccountSecondaryIntroViewState, Continuation<? super JointAccountSecondaryIntroViewState> continuation) {
                return ((AnonymousClass2) create(jointAccountSecondaryIntroViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new JointAccountSecondaryIntroViewState.Loaded(this.$response, UnauthenticatedJointAccountSecondaryIntroDuxo.LOGGING_IDENTIFIER);
            }
        }

        /* compiled from: UnauthenticatedJointAccountSecondaryIntroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroDuxo$fetchData$1$3", m3645f = "UnauthenticatedJointAccountSecondaryIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroDuxo$fetchData$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<JointAccountSecondaryIntroViewState, Continuation<? super JointAccountSecondaryIntroViewState>, Object> {
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(JointAccountSecondaryIntroViewState jointAccountSecondaryIntroViewState, Continuation<? super JointAccountSecondaryIntroViewState> continuation) {
                return ((AnonymousClass3) create(jointAccountSecondaryIntroViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return JointAccountSecondaryIntroViewState.Error.INSTANCE;
            }
        }
    }

    public final void fetchData() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C201121(null), 3, null);
    }
}
