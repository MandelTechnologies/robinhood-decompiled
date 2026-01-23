package com.robinhood.android.securitycenter.p251ui.mfa.prompts;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.security.contracts.PromptsMfaEnrollment;
import com.robinhood.android.securitycenter.p251ui.mfa.prompts.MfaPromptsEnrollmentEvent;
import com.robinhood.android.securitycenter.p251ui.mfa.prompts.MfaPromptsEnrollmentFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.models.api.PromptsUserEnrollmentResponse;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.security.prefs.ShowPromptsValuePropsPref;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
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

/* compiled from: MfaPromptsEnrollmentDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B3\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0006\u0010\u0014\u001a\u00020\u0002J\r\u0010\u0015\u001a\u00020\u0002H\u0001¢\u0006\u0002\b\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "showPromptsValuePropsPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "enrollInPrompts", "onEnrollmentSuccess", "onEnrollmentSuccess$feature_security_center_externalDebug", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MfaPromptsEnrollmentDuxo extends BaseDuxo5<Unit, MfaPromptsEnrollmentEvent> implements HasSavedState {
    public static final String PROMPTS_ENROLLMENT_CRYPTO_TRANSFER_LOGGING_IDENTIFIER = "crypto_transfers_enrollment";
    public static final String PROMPTS_ENROLLMENT_MFA_SETTINGS_LOGGING_IDENTIFIER = "settings";
    private final SavedStateHandle savedStateHandle;
    private final Sheriff sheriff;
    private final BooleanPreference showPromptsValuePropsPref;
    private final SuvWorkflowManager suvWorkflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaPromptsEnrollmentDuxo(Sheriff sheriff, SuvWorkflowManager suvWorkflowManager, @ShowPromptsValuePropsPref BooleanPreference showPromptsValuePropsPref, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(showPromptsValuePropsPref, "showPromptsValuePropsPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.sheriff = sheriff;
        this.suvWorkflowManager = suvWorkflowManager;
        this.showPromptsValuePropsPref = showPromptsValuePropsPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        enrollInPrompts();
    }

    /* compiled from: MfaPromptsEnrollmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/PromptsUserEnrollmentResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentDuxo$enrollInPrompts$1", m3645f = "MfaPromptsEnrollmentDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentDuxo$enrollInPrompts$1 */
    static final class C282741 extends ContinuationImpl7 implements Function1<Continuation<? super PromptsUserEnrollmentResponse>, Object> {
        int label;

        C282741(Continuation<? super C282741> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return MfaPromptsEnrollmentDuxo.this.new C282741(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PromptsUserEnrollmentResponse> continuation) {
            return ((C282741) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            Sheriff sheriff = MfaPromptsEnrollmentDuxo.this.sheriff;
            UUID challengeId = ((MfaPromptsEnrollmentFragment.Args) MfaPromptsEnrollmentDuxo.INSTANCE.getArgs((HasSavedState) MfaPromptsEnrollmentDuxo.this)).getChallengeId();
            this.label = 1;
            Object objHardEnrollUserIntoPrompts = sheriff.hardEnrollUserIntoPrompts(challengeId, this);
            return objHardEnrollUserIntoPrompts == coroutine_suspended ? coroutine_suspended : objHardEnrollUserIntoPrompts;
        }
    }

    public final void enrollInPrompts() {
        this.suvWorkflowManager.handleRequest(new C282741(null), new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaPromptsEnrollmentDuxo.enrollInPrompts$lambda$0(this.f$0, (PromptsUserEnrollmentResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaPromptsEnrollmentDuxo.enrollInPrompts$lambda$1(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MfaPromptsEnrollmentDuxo.enrollInPrompts$lambda$2(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enrollInPrompts$lambda$0(MfaPromptsEnrollmentDuxo mfaPromptsEnrollmentDuxo, PromptsUserEnrollmentResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mfaPromptsEnrollmentDuxo.onEnrollmentSuccess$feature_security_center_externalDebug();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enrollInPrompts$lambda$1(MfaPromptsEnrollmentDuxo mfaPromptsEnrollmentDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            mfaPromptsEnrollmentDuxo.submit(new MfaPromptsEnrollmentEvent.NetworkErrorEvent(throwable));
        } else {
            CrashReporter.Companion companion = CrashReporter.INSTANCE;
            companion.log("Unable to hard enroll in device approvals");
            CrashReporter.DefaultImpls.reportNonFatal$default(companion, throwable, false, null, 4, null);
            mfaPromptsEnrollmentDuxo.submit(new MfaPromptsEnrollmentEvent.ErrorEvent(throwable));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enrollInPrompts$lambda$2(MfaPromptsEnrollmentDuxo mfaPromptsEnrollmentDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        mfaPromptsEnrollmentDuxo.submit(new MfaPromptsEnrollmentEvent.VerificationWorkflowEvent(workflowId, z));
        return Unit.INSTANCE;
    }

    public final void onEnrollmentSuccess$feature_security_center_externalDebug() {
        PromptsMfaEnrollment promptsMfaEnrollment;
        String str;
        if (this.showPromptsValuePropsPref.get()) {
            Companion companion = INSTANCE;
            boolean zIsFromCryptoTransfersEnrollment = ((MfaPromptsEnrollmentFragment.Args) companion.getArgs((HasSavedState) this)).isFromCryptoTransfersEnrollment();
            if (((MfaPromptsEnrollmentFragment.Args) companion.getArgs((HasSavedState) this)).isFromCryptoTransfersEnrollment()) {
                str = PROMPTS_ENROLLMENT_CRYPTO_TRANSFER_LOGGING_IDENTIFIER;
            } else {
                str = "settings";
            }
            promptsMfaEnrollment = new PromptsMfaEnrollment(zIsFromCryptoTransfersEnrollment, str);
        } else {
            promptsMfaEnrollment = null;
        }
        submit(new MfaPromptsEnrollmentEvent.SuccessEvent(promptsMfaEnrollment));
        this.showPromptsValuePropsPref.set(false);
    }

    /* compiled from: MfaPromptsEnrollmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentDuxo;", "Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment$Args;", "<init>", "()V", "PROMPTS_ENROLLMENT_MFA_SETTINGS_LOGGING_IDENTIFIER", "", "PROMPTS_ENROLLMENT_CRYPTO_TRANSFER_LOGGING_IDENTIFIER", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MfaPromptsEnrollmentDuxo, MfaPromptsEnrollmentFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MfaPromptsEnrollmentFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MfaPromptsEnrollmentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MfaPromptsEnrollmentFragment.Args getArgs(MfaPromptsEnrollmentDuxo mfaPromptsEnrollmentDuxo) {
            return (MfaPromptsEnrollmentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, mfaPromptsEnrollmentDuxo);
        }
    }
}
