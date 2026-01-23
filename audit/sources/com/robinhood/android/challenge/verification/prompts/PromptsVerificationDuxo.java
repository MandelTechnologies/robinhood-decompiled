package com.robinhood.android.challenge.verification.prompts;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.challenge.verification.prompts.PromptsVerificationEvent;
import com.robinhood.android.lib.stepupverification.SuvConstants;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.PromptsStatusResponse;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.security.prompts.PromptsChallengeStatusManager;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeDataState;
import com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeStateProvider;
import com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeViewState;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.contracts.ChallengeVerificationInput;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: PromptsVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 72\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00017BI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010#\u001a\u00020$H\u0016J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\u0006\u0010'\u001a\u00020$J\u0018\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020$H\u0002J\b\u0010/\u001a\u00020$H\u0002J\u0010\u00100\u001a\u00020$2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020$H\u0002J\u0010\u00104\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeViewState;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "statusManager", "Lcom/robinhood/security/prompts/PromptsChallengeStatusManager;", "challengeManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeStateProvider;", "<init>", "(Lcom/robinhood/security/prompts/PromptsChallengeStatusManager;Lcom/robinhood/shared/lib/challenge/ChallengeManager;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "disposable", "Lio/reactivex/disposables/Disposable;", "value", "Lcom/robinhood/models/api/Challenge;", "challenge", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "setChallenge", "(Lcom/robinhood/models/api/Challenge;)V", "onStart", "", "resendNotification", "onAnimationFinished", "onSecondaryCtaClicked", "logCtaTap", "challengeStatus", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState$ChallengeStatus;", "isFallback", "", "retryChallenge", "recreateChallenge", "pollChallenge", "logBlockedScreen", "type", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "cancelPollChallenge", "startTimeout", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class PromptsVerificationDuxo extends BaseDuxo3<DeviceApprovalChallengeDataState, DeviceApprovalChallengeViewState, PromptsVerificationEvent> implements HasSavedState {
    private static final long LOGIN_ANIMATION_TIMEOUT = 10;
    private static final String SAVED_CHALLENGE = "challenge";
    private final ChallengeManager challengeManager;
    private Disposable disposable;
    private final EventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;
    private final PromptsChallengeStatusManager statusManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PromptsVerificationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DeviceApprovalChallengeDataState.ChallengeStatus.values().length];
            try {
                iArr[DeviceApprovalChallengeDataState.ChallengeStatus.BLOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceApprovalChallengeDataState.ChallengeStatus.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceApprovalChallengeDataState.ChallengeStatus.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PromptsStatusResponse.PromptsChallengeStatus.values().length];
            try {
                iArr2[PromptsStatusResponse.PromptsChallengeStatus.VALIDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PromptsStatusResponse.PromptsChallengeStatus.REDEEMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PromptsStatusResponse.PromptsChallengeStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PromptsStatusResponse.PromptsChallengeStatus.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PromptsStatusResponse.PromptsChallengeStatus.ISSUED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PromptsVerificationDuxo(PromptsChallengeStatusManager statusManager, ChallengeManager challengeManager, EventLogger eventLogger, SavedStateHandle savedStateHandle, AppType appType, AuthManager authManager, DuxoBundle duxoBundle, DeviceApprovalChallengeStateProvider stateProvider) {
        Intrinsics.checkNotNullParameter(statusManager, "statusManager");
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Companion companion = INSTANCE;
        String fallbackCtaText = ((ChallengeVerificationInput) companion.getArgs(savedStateHandle)).getFallbackCtaText();
        Challenge challenge = ((ChallengeVerificationInput) companion.getArgs(savedStateHandle)).getChallenge();
        String device_approval_device_label = challenge != null ? challenge.getDevice_approval_device_label() : null;
        Challenge challenge2 = ((ChallengeVerificationInput) companion.getArgs(savedStateHandle)).getChallenge();
        super(new DeviceApprovalChallengeDataState(null, false, fallbackCtaText, authManager.isLoggedIn(), appType == AppType.RHC, device_approval_device_label, (challenge2 != null ? challenge2.getAlternate_type() : null) != null, 3, null), stateProvider, duxoBundle);
        this.statusManager = statusManager;
        this.challengeManager = challengeManager;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Challenge getChallenge() {
        Challenge challenge = (Challenge) getSavedStateHandle().get("challenge");
        return challenge == null ? ((ChallengeVerificationInput) INSTANCE.getArgs((HasSavedState) this)).getChallenge() : challenge;
    }

    private final void setChallenge(Challenge challenge) {
        getSavedStateHandle().set("challenge", challenge);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        pollChallenge();
    }

    public final void resendNotification() {
        withDataState(new Function1() { // from class: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromptsVerificationDuxo.resendNotification$lambda$0(this.f$0, (DeviceApprovalChallengeDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendNotification$lambda$0(PromptsVerificationDuxo promptsVerificationDuxo, DeviceApprovalChallengeDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        promptsVerificationDuxo.logCtaTap(it.getChallengeStatus(), false);
        Companion companion = INSTANCE;
        if (Intrinsics.areEqual(((ChallengeVerificationInput) companion.getArgs((HasSavedState) promptsVerificationDuxo)).getFlowId(), Challenge.Flow.LOGIN.getId()) && ((ChallengeVerificationInput) companion.getArgs((HasSavedState) promptsVerificationDuxo)).isEmbeddedInPathfinder()) {
            promptsVerificationDuxo.submit(PromptsVerificationEvent.ResendChallenge.INSTANCE);
        } else if (it.getChallengeStatus() == DeviceApprovalChallengeDataState.ChallengeStatus.LOADING) {
            promptsVerificationDuxo.retryChallenge();
        } else {
            promptsVerificationDuxo.recreateChallenge();
        }
        return Unit.INSTANCE;
    }

    public final void onAnimationFinished() {
        Challenge challenge = getChallenge();
        Intrinsics.checkNotNull(challenge);
        submit(new PromptsVerificationEvent.Success(challenge.getId()));
    }

    public final void onSecondaryCtaClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromptsVerificationDuxo.onSecondaryCtaClicked$lambda$1(this.f$0, (DeviceApprovalChallengeDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSecondaryCtaClicked$lambda$1(PromptsVerificationDuxo promptsVerificationDuxo, DeviceApprovalChallengeDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        promptsVerificationDuxo.logCtaTap(it.getChallengeStatus(), true);
        Challenge challenge = promptsVerificationDuxo.getChallenge();
        Intrinsics.checkNotNull(challenge);
        promptsVerificationDuxo.submit(new PromptsVerificationEvent.UseFallback(challenge.getId()));
        return Unit.INSTANCE;
    }

    private final void logCtaTap(DeviceApprovalChallengeDataState.ChallengeStatus challengeStatus, boolean isFallback) {
        UserInteractionEventData.Action action;
        Screen.Name name;
        ChallengeContext.DeviceApprovalBlockedType deviceApprovalBlockedType;
        EventLogger eventLogger = this.eventLogger;
        if (isFallback) {
            action = UserInteractionEventData.Action.CHALLENGE_FALLBACK;
        } else {
            action = UserInteractionEventData.Action.RESEND_CHALLENGE;
        }
        if (challengeStatus == DeviceApprovalChallengeDataState.ChallengeStatus.LOADING) {
            name = Screen.Name.DEVICE_APPROVAL_WAITING;
        } else {
            name = Screen.Name.DEVICE_APPROVAL_WAITING_BLOCKED;
        }
        Companion companion = INSTANCE;
        Screen screen = new Screen(name, null, ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getFlowId(), null, 10, null);
        Challenge challenge = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getChallenge();
        String strValueOf = String.valueOf(challenge != null ? challenge.getId() : null);
        String strValueOf2 = String.valueOf(((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getVerificationWorkflowId());
        Boolean r19 = Boolean.FALSE;
        int i = WhenMappings.$EnumSwitchMapping$0[challengeStatus.ordinal()];
        if (i == 1) {
            deviceApprovalBlockedType = ChallengeContext.DeviceApprovalBlockedType.DENIED;
        } else if (i == 2) {
            deviceApprovalBlockedType = ChallengeContext.DeviceApprovalBlockedType.ERROR;
        } else if (i == 3) {
            deviceApprovalBlockedType = ChallengeContext.DeviceApprovalBlockedType.TIMEOUT;
        } else {
            deviceApprovalBlockedType = ChallengeContext.DeviceApprovalBlockedType.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED;
        }
        ChallengeContext.DeviceApprovalBlockedType deviceApprovalBlockedType2 = deviceApprovalBlockedType;
        String serverValue = "";
        if (isFallback) {
            if (((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getFallbackCtaText() != null) {
                serverValue = SuvConstants.DEFAULT_FLOW_ID;
            } else {
                Challenge challenge2 = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getChallenge();
                if ((challenge2 != null ? challenge2.getAlternate_type() : null) != null) {
                    Challenge challenge3 = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getChallenge();
                    Intrinsics.checkNotNull(challenge3);
                    Challenge.Type alternate_type = challenge3.getAlternate_type();
                    Intrinsics.checkNotNull(alternate_type);
                    serverValue = alternate_type.getServerValue();
                }
            }
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChallengeContext(null, strValueOf, null, null, null, strValueOf2, r19, deviceApprovalBlockedType2, null, serverValue, null, null, 3357, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -4097, -1, -1, -1, 16383, null), false, 44, null);
    }

    /* compiled from: PromptsVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$retryChallenge$1", m3645f = "PromptsVerificationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$retryChallenge$1 */
    static final class C105321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C105321(Continuation<? super C105321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PromptsVerificationDuxo.this.new C105321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PromptsVerificationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$retryChallenge$1$1", m3645f = "PromptsVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$retryChallenge$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
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
            public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
                return ((AnonymousClass1) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DeviceApprovalChallengeDataState.copy$default((DeviceApprovalChallengeDataState) this.L$0, DeviceApprovalChallengeDataState.ChallengeStatus.LOADING, true, null, false, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PromptsVerificationDuxo.this.applyMutation(new AnonymousClass1(null));
                    PromptsVerificationDuxo promptsVerificationDuxo = PromptsVerificationDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    ChallengeManager challengeManager = promptsVerificationDuxo.challengeManager;
                    Challenge challenge = promptsVerificationDuxo.getChallenge();
                    Intrinsics.checkNotNull(challenge);
                    UUID id = challenge.getId();
                    this.label = 1;
                    obj = challengeManager.retryChallenge(id, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((Challenge) obj);
            } catch (Throwable th) {
                Throwables.rethrowIfNotNetworkRelated(th);
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            PromptsVerificationDuxo.this.applyMutation(new AnonymousClass2(null));
            PromptsVerificationDuxo promptsVerificationDuxo2 = PromptsVerificationDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                promptsVerificationDuxo2.pollChallenge();
            } else {
                Timber.INSTANCE.mo3355e(thM28553exceptionOrNullimpl, "Failed to retry challenge.", new Object[0]);
                promptsVerificationDuxo2.logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType.ERROR);
                promptsVerificationDuxo2.applyMutation(new PromptsVerificationDuxo8(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: PromptsVerificationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$retryChallenge$1$2", m3645f = "PromptsVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$retryChallenge$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
                return ((AnonymousClass2) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DeviceApprovalChallengeDataState.copy$default((DeviceApprovalChallengeDataState) this.L$0, null, false, null, false, false, null, false, 125, null);
            }
        }
    }

    private final void retryChallenge() {
        cancelPollChallenge();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C105321(null), 3, null);
    }

    private final void recreateChallenge() {
        Companion companion = INSTANCE;
        if (Intrinsics.areEqual(((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getFlowId(), Challenge.Flow.LOGIN.getId())) {
            submit(PromptsVerificationEvent.RecreateLoginChallenge.INSTANCE);
            return;
        }
        Single singleDoOnSubscribe = ChallengeManager.recreateChallenge$default(this.challengeManager, ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getFlowId(), getChallenge(), ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getVerificationWorkflowId(), null, null, 24, null).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo.recreateChallenge.1

            /* compiled from: PromptsVerificationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$recreateChallenge$1$1", m3645f = "PromptsVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$recreateChallenge$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DeviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState>, Object> {
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
                public final Object invoke(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, Continuation<? super DeviceApprovalChallengeDataState> continuation) {
                    return ((AnonymousClass1) create(deviceApprovalChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DeviceApprovalChallengeDataState.copy$default((DeviceApprovalChallengeDataState) this.L$0, DeviceApprovalChallengeDataState.ChallengeStatus.LOADING, false, null, false, false, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                PromptsVerificationDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromptsVerificationDuxo.recreateChallenge$lambda$2(this.f$0, (ChallengeManager.CreateChallengeResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromptsVerificationDuxo.recreateChallenge$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recreateChallenge$lambda$2(PromptsVerificationDuxo promptsVerificationDuxo, ChallengeManager.CreateChallengeResult createChallengeResult) {
        Challenge challenge = createChallengeResult.getChallenge();
        if ((challenge != null ? challenge.getType() : null) != Challenge.Type.PROMPTS) {
            Preconditions preconditions = Preconditions.INSTANCE;
            Challenge challenge2 = createChallengeResult.getChallenge();
            preconditions.failUnexpectedItemKotlin(challenge2 != null ? challenge2.getType() : null);
            throw new ExceptionsH();
        }
        promptsVerificationDuxo.setChallenge(createChallengeResult.getChallenge());
        promptsVerificationDuxo.applyMutation(new PromptsVerificationDuxo6(promptsVerificationDuxo, null));
        promptsVerificationDuxo.pollChallenge();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recreateChallenge$lambda$3(PromptsVerificationDuxo promptsVerificationDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        Timber.INSTANCE.mo3355e(t, "Failed to recreate challenge.", new Object[0]);
        promptsVerificationDuxo.logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType.ERROR);
        promptsVerificationDuxo.applyMutation(new PromptsVerificationDuxo7(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pollChallenge() {
        PromptsChallengeStatusManager promptsChallengeStatusManager = this.statusManager;
        Challenge challenge = getChallenge();
        Intrinsics.checkNotNull(challenge);
        Single<PromptsStatusResponse> singleFirstOrError = promptsChallengeStatusManager.pollChallengeStatus(challenge).filter(new Predicate() { // from class: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo.pollChallenge.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(PromptsStatusResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getChallengeStatus() != PromptsStatusResponse.PromptsChallengeStatus.ISSUED;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        this.disposable = LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromptsVerificationDuxo.pollChallenge$lambda$4(this.f$0, (PromptsStatusResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromptsVerificationDuxo.pollChallenge$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pollChallenge$lambda$4(PromptsVerificationDuxo promptsVerificationDuxo, PromptsStatusResponse promptsStatusResponse) {
        promptsVerificationDuxo.cancelPollChallenge();
        int i = WhenMappings.$EnumSwitchMapping$1[promptsStatusResponse.getChallengeStatus().ordinal()];
        if (i == 1 || i == 2) {
            promptsVerificationDuxo.applyMutation(new PromptsVerificationDuxo2(null));
            promptsVerificationDuxo.submit(PromptsVerificationEvent.ChallengeCompleted.INSTANCE);
            Challenge challenge = promptsVerificationDuxo.getChallenge();
            Intrinsics.checkNotNull(challenge);
            promptsVerificationDuxo.startTimeout(challenge.getId());
        } else if (i == 3) {
            promptsVerificationDuxo.logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType.DENIED);
            promptsVerificationDuxo.applyMutation(new PromptsVerificationDuxo3(null));
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(promptsStatusResponse.getChallengeStatus());
                throw new ExceptionsH();
            }
            promptsVerificationDuxo.logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType.TIMEOUT);
            promptsVerificationDuxo.applyMutation(new PromptsVerificationDuxo4(null));
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.PROMPTS_CHALLENGE_PENDING, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pollChallenge$lambda$5(PromptsVerificationDuxo promptsVerificationDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        promptsVerificationDuxo.cancelPollChallenge();
        Timber.INSTANCE.mo3355e(t, "Failed to poll challenge status.", new Object[0]);
        promptsVerificationDuxo.logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType.ERROR);
        promptsVerificationDuxo.applyMutation(new PromptsVerificationDuxo5(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logBlockedScreen(ChallengeContext.DeviceApprovalBlockedType type2) {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.DEVICE_APPROVAL_WAITING_BLOCKED;
        Companion companion = INSTANCE;
        Screen screen = new Screen(name, null, ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getFlowId(), null, 10, null);
        Challenge challenge = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getChallenge();
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChallengeContext(null, String.valueOf(challenge != null ? challenge.getId() : null), null, null, null, String.valueOf(((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getVerificationWorkflowId()), Boolean.FALSE, type2, null, ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getChallengeContextFallbackType(), null, null, 3357, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -4097, -1, -1, -1, 16383, null), 13, null);
    }

    private final void cancelPollChallenge() {
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.disposable = null;
    }

    private final void startTimeout(final UUID challengeId) {
        Observable<Long> observableTimer = Observable.timer(10L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTimer, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.prompts.PromptsVerificationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromptsVerificationDuxo.startTimeout$lambda$6(this.f$0, challengeId, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startTimeout$lambda$6(PromptsVerificationDuxo promptsVerificationDuxo, UUID uuid, Long l) {
        Timber.INSTANCE.mo3353e("Prompts login animation failed to complete", new Object[0]);
        promptsVerificationDuxo.submit(new PromptsVerificationEvent.Timeout(uuid));
        return Unit.INSTANCE;
    }

    /* compiled from: PromptsVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationDuxo;", "Lcom/robinhood/shared/security/contracts/ChallengeVerificationInput;", "<init>", "()V", "LOGIN_ANIMATION_TIMEOUT", "", "SAVED_CHALLENGE", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PromptsVerificationDuxo, ChallengeVerificationInput> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ChallengeVerificationInput getArgs(SavedStateHandle savedStateHandle) {
            return (ChallengeVerificationInput) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ChallengeVerificationInput getArgs(PromptsVerificationDuxo promptsVerificationDuxo) {
            return (ChallengeVerificationInput) DuxoCompanion.DefaultImpls.getArgs(this, promptsVerificationDuxo);
        }
    }
}
