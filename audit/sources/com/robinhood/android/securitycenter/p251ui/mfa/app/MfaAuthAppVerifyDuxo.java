package com.robinhood.android.securitycenter.p251ui.mfa.app;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.securitycenter.p251ui.mfa.app.MfaAuthAppVerifyEvent;
import com.robinhood.android.securitycenter.p251ui.mfa.app.MfaAuthAppVerifyFragment;
import com.robinhood.android.settings.util.MfaManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.Mfa;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MfaAuthAppVerifyDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyViewState;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "mfaManager", "Lcom/robinhood/android/settings/util/MfaManager;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/settings/util/MfaManager;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "loadAuthAppToken", "fetchAuthAppToken", "onInputChange", "mfaCode", "", "handleLoggedOutVerification", "handleLoggedInVerification", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MfaAuthAppVerifyDuxo extends BaseDuxo5<MfaAuthAppVerifyViewState, MfaAuthAppVerifyEvent> implements HasSavedState {
    public static final int MFA_CODE_LENGTH = 6;
    private final AuthManager authManager;
    private final MfaManager mfaManager;
    private final SavedStateHandle savedStateHandle;
    private final SuvWorkflowManager suvWorkflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaAuthAppVerifyDuxo(MfaManager mfaManager, SuvWorkflowManager suvWorkflowManager, AuthManager authManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new MfaAuthAppVerifyViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(mfaManager, "mfaManager");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.mfaManager = mfaManager;
        this.suvWorkflowManager = suvWorkflowManager;
        this.authManager = authManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        if (((MfaAuthAppVerifyFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getShouldOpenAuthApp()) {
            loadAuthAppToken();
        }
    }

    private final void loadAuthAppToken() {
        Companion companion = INSTANCE;
        if (((MfaAuthAppVerifyFragment.Args) companion.getArgs((HasSavedState) this)).getTotpToken() != null) {
            String totpToken = ((MfaAuthAppVerifyFragment.Args) companion.getArgs((HasSavedState) this)).getTotpToken();
            Intrinsics.checkNotNull(totpToken);
            submit(new MfaAuthAppVerifyEvent.TokenSuccess(totpToken));
            return;
        }
        fetchAuthAppToken();
    }

    /* compiled from: MfaAuthAppVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/Mfa$EnableAppMfaResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$fetchAuthAppToken$1", m3645f = "MfaAuthAppVerifyDuxo.kt", m3646l = {46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$fetchAuthAppToken$1 */
    static final class C282661 extends ContinuationImpl7 implements Function1<Continuation<? super Mfa.EnableAppMfaResponse>, Object> {
        int label;

        C282661(Continuation<? super C282661> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return MfaAuthAppVerifyDuxo.this.new C282661(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Mfa.EnableAppMfaResponse> continuation) {
            return ((C282661) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MfaAuthAppVerifyDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$fetchAuthAppToken$1$1", m3645f = "MfaAuthAppVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$fetchAuthAppToken$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MfaAuthAppVerifyViewState, Continuation<? super MfaAuthAppVerifyViewState>, Object> {
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
            public final Object invoke(MfaAuthAppVerifyViewState mfaAuthAppVerifyViewState, Continuation<? super MfaAuthAppVerifyViewState> continuation) {
                return ((AnonymousClass1) create(mfaAuthAppVerifyViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((MfaAuthAppVerifyViewState) this.L$0).copy(true);
            }
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
            MfaAuthAppVerifyDuxo.this.applyMutation(new AnonymousClass1(null));
            MfaManager mfaManager = MfaAuthAppVerifyDuxo.this.mfaManager;
            UUID challengeId = ((MfaAuthAppVerifyFragment.Args) MfaAuthAppVerifyDuxo.INSTANCE.getArgs((HasSavedState) MfaAuthAppVerifyDuxo.this)).getChallengeId();
            this.label = 1;
            Object objEnableAppMfa = mfaManager.enableAppMfa(challengeId, this);
            return objEnableAppMfa == coroutine_suspended ? coroutine_suspended : objEnableAppMfa;
        }
    }

    public final void fetchAuthAppToken() {
        this.suvWorkflowManager.handleRequest(new C282661(null), new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaAuthAppVerifyDuxo.fetchAuthAppToken$lambda$0(this.f$0, (Mfa.EnableAppMfaResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaAuthAppVerifyDuxo.fetchAuthAppToken$lambda$1(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MfaAuthAppVerifyDuxo.fetchAuthAppToken$lambda$2(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchAuthAppToken$lambda$0(MfaAuthAppVerifyDuxo mfaAuthAppVerifyDuxo, Mfa.EnableAppMfaResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        mfaAuthAppVerifyDuxo.applyMutation(new MfaAuthAppVerifyDuxo2(null));
        mfaAuthAppVerifyDuxo.submit(new MfaAuthAppVerifyEvent.TokenSuccess(response.getTotpToken()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchAuthAppToken$lambda$1(MfaAuthAppVerifyDuxo mfaAuthAppVerifyDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        Integer httpStatusCode = Throwables.getHttpStatusCode(t);
        if ((httpStatusCode != null && httpStatusCode.intValue() == 403) || !Throwables.isNetworkRelated(t)) {
            throw t;
        }
        mfaAuthAppVerifyDuxo.applyMutation(new MfaAuthAppVerifyDuxo3(null));
        mfaAuthAppVerifyDuxo.submit(new MfaAuthAppVerifyEvent.TokenError(t));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchAuthAppToken$lambda$2(MfaAuthAppVerifyDuxo mfaAuthAppVerifyDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        mfaAuthAppVerifyDuxo.submit(new MfaAuthAppVerifyEvent.VerificationRequired(workflowId, z));
        return Unit.INSTANCE;
    }

    public final void onInputChange(String mfaCode) {
        Intrinsics.checkNotNullParameter(mfaCode, "mfaCode");
        if (mfaCode.length() < 6) {
            return;
        }
        if (!this.authManager.isLoggedIn()) {
            handleLoggedOutVerification(mfaCode);
        } else {
            handleLoggedInVerification(mfaCode);
        }
    }

    private final void handleLoggedOutVerification(String mfaCode) {
        String enrollmentToken = ((MfaAuthAppVerifyFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEnrollmentToken();
        if (enrollmentToken == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Single singleDoOnSubscribe = RxFactory.DefaultImpls.rxSingle$default(this, null, new C282691(mfaCode, enrollmentToken, null), 1, null).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo.handleLoggedOutVerification.2

            /* compiled from: MfaAuthAppVerifyDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$handleLoggedOutVerification$2$1", m3645f = "MfaAuthAppVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$handleLoggedOutVerification$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MfaAuthAppVerifyViewState, Continuation<? super MfaAuthAppVerifyViewState>, Object> {
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
                public final Object invoke(MfaAuthAppVerifyViewState mfaAuthAppVerifyViewState, Continuation<? super MfaAuthAppVerifyViewState> continuation) {
                    return ((AnonymousClass1) create(mfaAuthAppVerifyViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((MfaAuthAppVerifyViewState) this.L$0).copy(true);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                MfaAuthAppVerifyDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaAuthAppVerifyDuxo.handleLoggedOutVerification$lambda$3(this.f$0, (Mfa.RecoverAppMfaResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaAuthAppVerifyDuxo.handleLoggedOutVerification$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: MfaAuthAppVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/Mfa$RecoverAppMfaResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$handleLoggedOutVerification$1", m3645f = "MfaAuthAppVerifyDuxo.kt", m3646l = {79}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$handleLoggedOutVerification$1 */
    static final class C282691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Mfa.RecoverAppMfaResponse>, Object> {
        final /* synthetic */ String $enrollmentToken;
        final /* synthetic */ String $mfaCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282691(String str, String str2, Continuation<? super C282691> continuation) {
            super(2, continuation);
            this.$mfaCode = str;
            this.$enrollmentToken = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaAuthAppVerifyDuxo.this.new C282691(this.$mfaCode, this.$enrollmentToken, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Mfa.RecoverAppMfaResponse> continuation) {
            return ((C282691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            MfaManager mfaManager = MfaAuthAppVerifyDuxo.this.mfaManager;
            String str = this.$mfaCode;
            String str2 = this.$enrollmentToken;
            this.label = 1;
            Object objRecoverAppMfa = mfaManager.recoverAppMfa(str, str2, this);
            return objRecoverAppMfa == coroutine_suspended ? coroutine_suspended : objRecoverAppMfa;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoggedOutVerification$lambda$3(MfaAuthAppVerifyDuxo mfaAuthAppVerifyDuxo, Mfa.RecoverAppMfaResponse recoverAppMfaResponse) {
        mfaAuthAppVerifyDuxo.applyMutation(new MfaAuthAppVerifyDuxo6(null));
        mfaAuthAppVerifyDuxo.submit(MfaAuthAppVerifyEvent.SubmitSuccess.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoggedOutVerification$lambda$4(MfaAuthAppVerifyDuxo mfaAuthAppVerifyDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            mfaAuthAppVerifyDuxo.applyMutation(new MfaAuthAppVerifyDuxo7(null));
            mfaAuthAppVerifyDuxo.submit(new MfaAuthAppVerifyEvent.SubmitError(t));
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* compiled from: MfaAuthAppVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/Mfa;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$handleLoggedInVerification$1", m3645f = "MfaAuthAppVerifyDuxo.kt", m3646l = {103}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$handleLoggedInVerification$1 */
    static final class C282671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Mfa>, Object> {
        final /* synthetic */ String $mfaCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282671(String str, Continuation<? super C282671> continuation) {
            super(2, continuation);
            this.$mfaCode = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaAuthAppVerifyDuxo.this.new C282671(this.$mfaCode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Mfa> continuation) {
            return ((C282671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            MfaManager mfaManager = MfaAuthAppVerifyDuxo.this.mfaManager;
            String str = this.$mfaCode;
            UUID challengeId = ((MfaAuthAppVerifyFragment.Args) MfaAuthAppVerifyDuxo.INSTANCE.getArgs((HasSavedState) MfaAuthAppVerifyDuxo.this)).getChallengeId();
            this.label = 1;
            Object objVerifyAppMfa = mfaManager.verifyAppMfa(str, challengeId, this);
            return objVerifyAppMfa == coroutine_suspended ? coroutine_suspended : objVerifyAppMfa;
        }
    }

    private final void handleLoggedInVerification(String mfaCode) {
        Single singleDoOnSubscribe = RxFactory.DefaultImpls.rxSingle$default(this, null, new C282671(mfaCode, null), 1, null).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo.handleLoggedInVerification.2

            /* compiled from: MfaAuthAppVerifyDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$handleLoggedInVerification$2$1", m3645f = "MfaAuthAppVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$handleLoggedInVerification$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MfaAuthAppVerifyViewState, Continuation<? super MfaAuthAppVerifyViewState>, Object> {
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
                public final Object invoke(MfaAuthAppVerifyViewState mfaAuthAppVerifyViewState, Continuation<? super MfaAuthAppVerifyViewState> continuation) {
                    return ((AnonymousClass1) create(mfaAuthAppVerifyViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((MfaAuthAppVerifyViewState) this.L$0).copy(true);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                MfaAuthAppVerifyDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaAuthAppVerifyDuxo.handleLoggedInVerification$lambda$5(this.f$0, (Mfa) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaAuthAppVerifyDuxo.handleLoggedInVerification$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoggedInVerification$lambda$5(MfaAuthAppVerifyDuxo mfaAuthAppVerifyDuxo, Mfa mfa) {
        mfaAuthAppVerifyDuxo.applyMutation(new MfaAuthAppVerifyDuxo4(null));
        mfaAuthAppVerifyDuxo.submit(MfaAuthAppVerifyEvent.SubmitSuccess.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoggedInVerification$lambda$6(MfaAuthAppVerifyDuxo mfaAuthAppVerifyDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            mfaAuthAppVerifyDuxo.applyMutation(new MfaAuthAppVerifyDuxo5(null));
            mfaAuthAppVerifyDuxo.submit(new MfaAuthAppVerifyEvent.SubmitError(t));
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* compiled from: MfaAuthAppVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyDuxo;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$Args;", "<init>", "()V", "MFA_CODE_LENGTH", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MfaAuthAppVerifyDuxo, MfaAuthAppVerifyFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MfaAuthAppVerifyFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MfaAuthAppVerifyFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MfaAuthAppVerifyFragment.Args getArgs(MfaAuthAppVerifyDuxo mfaAuthAppVerifyDuxo) {
            return (MfaAuthAppVerifyFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, mfaAuthAppVerifyDuxo);
        }
    }
}
