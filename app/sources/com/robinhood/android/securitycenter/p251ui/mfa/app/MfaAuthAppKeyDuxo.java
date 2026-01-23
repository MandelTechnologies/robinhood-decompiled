package com.robinhood.android.securitycenter.p251ui.mfa.app;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.securitycenter.p251ui.mfa.app.MfaAuthAppKeyEvent;
import com.robinhood.android.securitycenter.p251ui.mfa.app.MfaAuthAppKeyFragment;
import com.robinhood.android.settings.util.MfaManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.Mfa;
import com.robinhood.utils.extensions.Throwables;
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

/* compiled from: MfaAuthAppKeyDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyViewState;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "mfaManager", "Lcom/robinhood/android/settings/util/MfaManager;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/settings/util/MfaManager;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "fetchAuthAppToken", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MfaAuthAppKeyDuxo extends BaseDuxo5<MfaAuthAppKeyViewState, MfaAuthAppKeyEvent> implements HasSavedState {
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
    public MfaAuthAppKeyDuxo(MfaManager mfaManager, SuvWorkflowManager suvWorkflowManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new MfaAuthAppKeyViewState(false, ((MfaAuthAppKeyFragment.Args) INSTANCE.getArgs(savedStateHandle)).getToken()), duxoBundle);
        Intrinsics.checkNotNullParameter(mfaManager, "mfaManager");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.mfaManager = mfaManager;
        this.suvWorkflowManager = suvWorkflowManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        if (((MfaAuthAppKeyFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getToken() == null) {
            fetchAuthAppToken();
        }
    }

    /* compiled from: MfaAuthAppKeyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/Mfa$EnableAppMfaResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyDuxo$fetchAuthAppToken$1", m3645f = "MfaAuthAppKeyDuxo.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyDuxo$fetchAuthAppToken$1 */
    static final class C282611 extends ContinuationImpl7 implements Function1<Continuation<? super Mfa.EnableAppMfaResponse>, Object> {
        int label;

        C282611(Continuation<? super C282611> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return MfaAuthAppKeyDuxo.this.new C282611(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Mfa.EnableAppMfaResponse> continuation) {
            return ((C282611) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MfaAuthAppKeyDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyDuxo$fetchAuthAppToken$1$1", m3645f = "MfaAuthAppKeyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyDuxo$fetchAuthAppToken$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MfaAuthAppKeyViewState, Continuation<? super MfaAuthAppKeyViewState>, Object> {
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
            public final Object invoke(MfaAuthAppKeyViewState mfaAuthAppKeyViewState, Continuation<? super MfaAuthAppKeyViewState> continuation) {
                return ((AnonymousClass1) create(mfaAuthAppKeyViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MfaAuthAppKeyViewState.copy$default((MfaAuthAppKeyViewState) this.L$0, true, null, 2, null);
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
            MfaAuthAppKeyDuxo.this.applyMutation(new AnonymousClass1(null));
            MfaManager mfaManager = MfaAuthAppKeyDuxo.this.mfaManager;
            UUID challengeId = ((MfaAuthAppKeyFragment.Args) MfaAuthAppKeyDuxo.INSTANCE.getArgs((HasSavedState) MfaAuthAppKeyDuxo.this)).getChallengeId();
            this.label = 1;
            Object objEnableAppMfa = mfaManager.enableAppMfa(challengeId, this);
            return objEnableAppMfa == coroutine_suspended ? coroutine_suspended : objEnableAppMfa;
        }
    }

    public final void fetchAuthAppToken() {
        this.suvWorkflowManager.handleRequest(new C282611(null), new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaAuthAppKeyDuxo.fetchAuthAppToken$lambda$0(this.f$0, (Mfa.EnableAppMfaResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaAuthAppKeyDuxo.fetchAuthAppToken$lambda$1(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MfaAuthAppKeyDuxo.fetchAuthAppToken$lambda$2(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchAuthAppToken$lambda$0(MfaAuthAppKeyDuxo mfaAuthAppKeyDuxo, Mfa.EnableAppMfaResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        mfaAuthAppKeyDuxo.applyMutation(new MfaAuthAppKeyDuxo2(response, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchAuthAppToken$lambda$1(MfaAuthAppKeyDuxo mfaAuthAppKeyDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        Integer httpStatusCode = Throwables.getHttpStatusCode(t);
        if ((httpStatusCode != null && httpStatusCode.intValue() == 403) || !Throwables.isNetworkRelated(t)) {
            throw t;
        }
        mfaAuthAppKeyDuxo.applyMutation(new MfaAuthAppKeyDuxo3(null));
        mfaAuthAppKeyDuxo.submit(new MfaAuthAppKeyEvent.Error(t));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchAuthAppToken$lambda$2(MfaAuthAppKeyDuxo mfaAuthAppKeyDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        mfaAuthAppKeyDuxo.applyMutation(new MfaAuthAppKeyDuxo4(null));
        mfaAuthAppKeyDuxo.submit(new MfaAuthAppKeyEvent.VerificationRequired(workflowId, z));
        return Unit.INSTANCE;
    }

    /* compiled from: MfaAuthAppKeyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyDuxo;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment$Args;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MfaAuthAppKeyDuxo, MfaAuthAppKeyFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MfaAuthAppKeyFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MfaAuthAppKeyFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MfaAuthAppKeyFragment.Args getArgs(MfaAuthAppKeyDuxo mfaAuthAppKeyDuxo) {
            return (MfaAuthAppKeyFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, mfaAuthAppKeyDuxo);
        }
    }
}
