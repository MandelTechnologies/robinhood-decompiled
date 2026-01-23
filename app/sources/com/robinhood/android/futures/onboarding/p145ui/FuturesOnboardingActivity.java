package com.robinhood.android.futures.onboarding.p145ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.agreements.models.ApiPreviousAgreement;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
import com.robinhood.android.eventcontracts.contracts.EventTradeActivityKey;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.contracts.HubNavigateUtils2;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.futures.contracts.FuturesTradeActivityKey;
import com.robinhood.android.futures.onboarding.p145ui.FuturesOnboardingDuxo5;
import com.robinhood.android.futures.onboarding.p145ui.agreement.FuturesOnboardingAgreementFragment;
import com.robinhood.android.futures.onboarding.p145ui.arbitration.CheckArbitrationFragment;
import com.robinhood.android.futures.onboarding.p145ui.arbitration.FuturesOnboardingArbitrationAgreementFragment;
import com.robinhood.android.futures.onboarding.p145ui.eligibility.FuturesEligibilityFragment;
import com.robinhood.android.futures.onboarding.p145ui.p146uk.FuturesUkCheckEligibilityFragment;
import com.robinhood.android.futures.onboarding.p145ui.p146uk.FuturesUkOnboardingFlowManager;
import com.robinhood.android.futures.onboarding.p145ui.result.FuturesAccountResultFragment;
import com.robinhood.android.futures.onboarding.p145ui.submission.FuturesAccountSubmissionFragment;
import com.robinhood.android.futures.onboarding.p145ui.valueprops.FuturesOnboardingValuePropsFragment;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.models.futures.p192ui.CreateFuturesAccountResult;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.onboarding.contracts.PostUserCreationShimIntentKey;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.regiongate.FuturesTradingOrEventContractsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import com.robinhood.ceres.p284v1.SuitabilityCheckpointDto;
import com.robinhood.futures.application.contracts.ApplicationCallbackService;
import com.robinhood.models.investorprofile.questionnaire.QuestionnaireLoggingParams;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.shared.questionnaire.libquestionnaire.ReviewInvestorProfileCallbacks;
import com.robinhood.store.futures.FuturesLocaleStore2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: FuturesOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r:\u0003pqrB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0010\u00100\u001a\u00020-2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020-2\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020-H\u0014J\b\u00107\u001a\u00020-H\u0016J\b\u00108\u001a\u00020-H\u0002J\u001a\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010/H\u0016J\b\u0010=\u001a\u00020-H\u0016J\b\u0010>\u001a\u00020-H\u0002J\b\u0010?\u001a\u00020-H\u0016J\b\u0010@\u001a\u00020-H\u0016J\b\u0010A\u001a\u00020-H\u0016J\b\u0010B\u001a\u00020-H\u0002J\u000e\u0010C\u001a\u00020-H\u0096@¢\u0006\u0002\u0010DJ\b\u0010E\u001a\u00020-H\u0016J\b\u0010F\u001a\u00020-H\u0016J\"\u0010G\u001a\u00020-2\b\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020)H\u0016J\b\u0010L\u001a\u00020-H\u0016J\u0012\u0010M\u001a\u00020-2\b\u0010N\u001a\u0004\u0018\u00010IH\u0016J\u0010\u0010O\u001a\u00020-2\u0006\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u00020-H\u0016J\"\u0010S\u001a\u00020-2\u0006\u0010T\u001a\u00020;2\u0006\u0010U\u001a\u00020;2\b\u0010V\u001a\u0004\u0018\u00010WH\u0014J\b\u0010X\u001a\u00020-H\u0002J\b\u0010Y\u001a\u00020-H\u0016J\b\u0010Z\u001a\u00020-H\u0002J\u0010\u0010[\u001a\u00020-2\u0006\u0010\\\u001a\u00020]H\u0016J\u0010\u0010^\u001a\u00020-2\u0006\u0010_\u001a\u00020)H\u0016J\b\u0010`\u001a\u00020-H\u0002J\u0010\u0010a\u001a\u00020-2\u0006\u0010b\u001a\u00020cH\u0016J\b\u0010d\u001a\u00020-H\u0002J\b\u0010e\u001a\u00020-H\u0002J\b\u0010f\u001a\u00020-H\u0002J\b\u0010g\u001a\u00020-H\u0002J\b\u0010h\u001a\u00020-H\u0016J\b\u0010i\u001a\u00020-H\u0016J\t\u0010j\u001a\u00020)H\u0096\u0001R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010k\u001a\b\u0012\u0004\u0012\u00020m0lX\u0096\u0005¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006s"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsFragment$Callbacks;", "Lcom/robinhood/futures/application/contracts/ApplicationCallbackService;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityFragment$Callbacks;", "Lcom/robinhood/shared/questionnaire/libquestionnaire/ReviewInvestorProfileCallbacks;", "Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementFragment$Callbacks;", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/CheckArbitrationFragment$Callbacks;", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationAgreementFragment$Callbacks;", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionFragment$Callbacks;", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultFragment$Callbacks;", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityFragment$Callbacks;", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkOnboardingFlowManager$Callbacks;", "<init>", "()V", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "getMicrogramManager", "()Lcom/robinhood/android/microgramsdui/MicrogramManager;", "setMicrogramManager", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;)V", "futuresApplicationMicrogramSource", "Lmicrogram/android/RemoteMicrogramApplication;", "microgramCallbacks", "Lcom/robinhood/android/futures/onboarding/ui/RealApplicationCallbackService;", "getMicrogramCallbacks", "()Lcom/robinhood/android/futures/onboarding/ui/RealApplicationCallbackService;", "duxo", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "locality", "Lcom/robinhood/store/futures/FuturesLocale;", "ukOnboardingFlowManager", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkOnboardingFlowManager;", "postOnboardingNavigation", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "streamlineToTradeFlow", "", "getStreamlineToTradeFlow", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onDestroy", "onSignupClicked", "showEligibilityFragment", "onPrimaryButtonClicked", "dialogId", "", "passthroughArgs", "onUserBecameEligible", "startRhdOnboarding", "onUserAlreadyHasAccount", "onUsersApplicationIsInReview", "onUserIsNotEligible", "showReviewInvestmentProfileFragment", "continueFromFuturesInvestorProfile", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onInvestorProfileReviewed", "showInvestorProfile", "onProceedToNextStepUk", "passedCheckpoint", "Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;", "alreadyEligibleForNextStep", "canSubmitNextStep", "popBackstack", "checkSuitability", "checkpoint", "showQuestionnaireFlow", "questionnaireFlow", "Lcom/robinhood/android/futures/onboarding/ui/QuestionnaireFlow;", "onUkSubflowCompleted", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "showAgreementFragment", "onUserAgreed", "showArbitrationAgreementFragment", "onPreviousArbitrationAgreementLoaded", "previousAgreement", "Lcom/robinhood/android/agreements/models/ApiPreviousAgreement;", "onUserArbitrationDismissed", "accepted", "showSubmissionFragment", "onAccountSubmitted", "result", "Lcom/robinhood/android/models/futures/ui/CreateFuturesAccountResult;", "showManualReviewFragment", "showRejectedFragment", "showAccountApprovedFragment", "showAccountAlreadyExistsFragment", "onFlowCompleted", "onFlowCompletedWithRejectionOrReview", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "UserIsIneligibleForFuturesWithUnknownReason", "UserInIneligibleLocalityForRhdOnboarding", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesOnboardingActivity extends BaseActivity implements RegionGated, FuturesOnboardingValuePropsFragment.Callbacks, ApplicationCallbackService, FuturesEligibilityFragment.Callbacks, ReviewInvestorProfileCallbacks, FuturesOnboardingAgreementFragment.Callbacks, CheckArbitrationFragment.Callbacks, FuturesOnboardingArbitrationAgreementFragment.Callbacks, FuturesAccountSubmissionFragment.Callbacks, FuturesAccountResultFragment.Callbacks, FuturesUkCheckEligibilityFragment.Callbacks, FuturesUkOnboardingFlowManager.Callbacks {
    public static final int FUTURES_QUESTIONNAIRE_REQUEST_CODE = 73;
    public static final int FUTURES_UK_KNOWLEDGE_QUIZ_REQUEST_CODE = 75;
    public static final int FUTURES_UK_QUESTIONNAIRE_REQUEST_CODE = 74;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final RemoteMicrogramApplication futuresApplicationMicrogramSource;
    private FuturesLocaleStore2 locality;
    public MicrogramManager microgramManager;
    private FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation;
    private final FuturesUkOnboardingFlowManager ukOnboardingFlowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FuturesOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingActivity$UserInIneligibleLocalityForRhdOnboarding;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UserInIneligibleLocalityForRhdOnboarding extends IllegalStateException {
        public static final int $stable = 8;
    }

    /* compiled from: FuturesOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingActivity$UserIsIneligibleForFuturesWithUnknownReason;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UserIsIneligibleForFuturesWithUnknownReason extends IllegalStateException {
        public static final int $stable = 8;
    }

    /* compiled from: FuturesOnboardingActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AccountFuturesEligibilityStatusDto.values().length];
            try {
                iArr[AccountFuturesEligibilityStatusDto.ACCOUNT_FUTURES_ELIGIBILITY_STATUS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.INELIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.ELIGIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.ALREADY_HAS_ACCOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.IN_MANUAL_REVIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FuturesLocaleStore2.values().length];
            try {
                iArr2[FuturesLocaleStore2.f6324US.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FuturesLocaleStore2.f6323UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FuturesLocaleStore2.UNSUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[QuestionnaireFlow.values().length];
            try {
                iArr3[QuestionnaireFlow.US_FUTURES_SUITABILITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[QuestionnaireFlow.UK_FUTURES_SUITABILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[QuestionnaireFlow.UK_KNOWLEDGE_QUIZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public FuturesOnboardingActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(FuturesTradingOrEventContractsRegionGate.INSTANCE);
        this.futuresApplicationMicrogramSource = new RemoteMicrogramApplication("app-futures-application", null, 2, null);
        this.duxo = DuxosKt.duxo(this, FuturesOnboardingDuxo.class);
        this.ukOnboardingFlowManager = new FuturesUkOnboardingFlowManager(this);
    }

    public final MicrogramManager getMicrogramManager() {
        MicrogramManager microgramManager = this.microgramManager;
        if (microgramManager != null) {
            return microgramManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("microgramManager");
        return null;
    }

    public final void setMicrogramManager(MicrogramManager microgramManager) {
        Intrinsics.checkNotNullParameter(microgramManager, "<set-?>");
        this.microgramManager = microgramManager;
    }

    private final RealApplicationCallbackService getMicrogramCallbacks() {
        Object hostImplementation = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(getMicrogramManager(), getLifecycleScope(), new MicrogramLaunchId(this.futuresApplicationMicrogramSource, null), null, 4, null).getComponent().getServiceLocator().getHostImplementation(ApplicationCallbackService.class);
        Intrinsics.checkNotNull(hostImplementation, "null cannot be cast to non-null type com.robinhood.android.futures.onboarding.ui.RealApplicationCallbackService");
        return (RealApplicationCallbackService) hostImplementation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesOnboardingDuxo getDuxo() {
        return (FuturesOnboardingDuxo) this.duxo.getValue();
    }

    private final boolean getStreamlineToTradeFlow() {
        FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation = this.postOnboardingNavigation;
        if ((postOnboardingNavigation instanceof FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm) || (postOnboardingNavigation instanceof FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEdpByContractId) || (postOnboardingNavigation instanceof FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEdpByEventId)) {
            return true;
        }
        if ((postOnboardingNavigation instanceof FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToBracket) || Intrinsics.areEqual(postOnboardingNavigation, FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcHub.INSTANCE) || Intrinsics.areEqual(postOnboardingNavigation, FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToRhFuturesList.INSTANCE) || (postOnboardingNavigation instanceof FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToFuturesOrderForm) || postOnboardingNavigation == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            FuturesOnboardingValuePropsFragment.Companion companion = FuturesOnboardingValuePropsFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new FuturesOnboardingValuePropsFragment.Args(((FuturesOnboardingActivityKey) companion2.getExtras((Activity) this)).getEntryPoint(), ((FuturesOnboardingActivityKey) companion2.getExtras((Activity) this)).isEventsContracts())));
        }
        getMicrogramCallbacks().setDelegate(this);
        collectDuxoState(Lifecycle.State.RESUMED, new C172971(null));
    }

    /* compiled from: FuturesOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onCreate$1", m3645f = "FuturesOnboardingActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onCreate$1 */
    static final class C172971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C172971(Continuation<? super C172971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C172971 c172971 = FuturesOnboardingActivity.this.new C172971(continuation);
            c172971.L$0 = obj;
            return c172971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C172971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(FuturesOnboardingActivity.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(FuturesOnboardingActivity.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: FuturesOnboardingActivity.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onCreate$1$1", m3645f = "FuturesOnboardingActivity.kt", m3646l = {123}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOnboardingActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesOnboardingActivity futuresOnboardingActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresOnboardingActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FuturesOnboardingActivity.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "dataState", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onCreate$1$1$1", m3645f = "FuturesOnboardingActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501241 extends ContinuationImpl7 implements Function2<FuturesOnboardingViewState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOnboardingActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501241(FuturesOnboardingActivity futuresOnboardingActivity, Continuation<? super C501241> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOnboardingActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501241 c501241 = new C501241(this.this$0, continuation);
                    c501241.L$0 = obj;
                    return c501241;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesOnboardingViewState futuresOnboardingViewState, Continuation<? super Unit> continuation) {
                    return ((C501241) create(futuresOnboardingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    FuturesOnboardingViewState futuresOnboardingViewState = (FuturesOnboardingViewState) this.L$0;
                    this.this$0.locality = futuresOnboardingViewState.getLocale();
                    this.this$0.postOnboardingNavigation = futuresOnboardingViewState.getPostOnboardingNavigation();
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<FuturesOnboardingViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C501241 c501241 = new C501241(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c501241, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: FuturesOnboardingActivity.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onCreate$1$2", m3645f = "FuturesOnboardingActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOnboardingActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FuturesOnboardingActivity futuresOnboardingActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = futuresOnboardingActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FuturesOnboardingActivity.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onCreate$1$2$1", m3645f = "FuturesOnboardingActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<FuturesOnboardingDuxo5>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOnboardingActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesOnboardingActivity futuresOnboardingActivity, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOnboardingActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Event<FuturesOnboardingDuxo5> event, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    EventConsumer eventConsumer;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final Event event = (Event) this.L$0;
                    if (event != null) {
                        final FuturesOnboardingActivity futuresOnboardingActivity = this.this$0;
                        if ((event.getData() instanceof FuturesOnboardingDuxo5) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                            eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onCreate$1$2$1$invokeSuspend$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m14667invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m14667invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    futuresOnboardingActivity.handleEvent((FuturesOnboardingDuxo5) event.getData());
                                }
                            });
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Event<FuturesOnboardingDuxo5>> eventFlow = this.this$0.getDuxo().getEventFlow();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(FuturesOnboardingDuxo5 event) {
        if (Intrinsics.areEqual(event, FuturesOnboardingDuxo5.ShowEligibility.INSTANCE)) {
            showEligibilityFragment();
            return;
        }
        if (Intrinsics.areEqual(event, FuturesOnboardingDuxo5.ShowFuturesTradingEvent.INSTANCE)) {
            finish();
            startActivity(Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, CuratedListKey.INSTANCE.getFuturesListKey(), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
            return;
        }
        if (Intrinsics.areEqual(event, FuturesOnboardingDuxo5.ShowValuePropsEvent.INSTANCE)) {
            FuturesOnboardingValuePropsFragment.Companion companion = FuturesOnboardingValuePropsFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            replaceFragmentWithoutBackStack(companion.newInstance((Parcelable) new FuturesOnboardingValuePropsFragment.Args(((FuturesOnboardingActivityKey) companion2.getExtras((Activity) this)).getEntryPoint(), ((FuturesOnboardingActivityKey) companion2.getExtras((Activity) this)).isEventsContracts())));
        } else {
            if (Intrinsics.areEqual(event, FuturesOnboardingDuxo5.StartRhdOnboarding.INSTANCE)) {
                startRhdOnboarding();
                return;
            }
            if (event instanceof FuturesOnboardingDuxo5.UserAlreadyHasAccount) {
                showAccountAlreadyExistsFragment();
            } else if (Intrinsics.areEqual(event, FuturesOnboardingDuxo5.SignAgreement.INSTANCE)) {
                showAgreementFragment();
            } else {
                if (!Intrinsics.areEqual(event, FuturesOnboardingDuxo5.UserNotInExperimentEvent.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                finish();
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(toolbar), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getMicrogramCallbacks().setDelegate(null);
    }

    @Override // com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsFragment.Callbacks
    public void onSignupClicked() {
        getDuxo().onSignupClicked();
    }

    private final void showEligibilityFragment() {
        FuturesOnboardingViewState value = getDuxo().getStateFlow().getValue();
        if (Intrinsics.areEqual(value.getUserHasNoBrokerageAccount(), Boolean.TRUE)) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            RhBottomSheetDialogFragment rhBottomSheetDialogFragmentShowUserHasNoBrokerageAccountBottomSheet = UserHasNoBrokerageAccountBottomSheet.showUserHasNoBrokerageAccountBottomSheet(resources, ((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).isEventsContracts());
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            rhBottomSheetDialogFragmentShowUserHasNoBrokerageAccountBottomSheet.show(supportFragmentManager, "noBrokerageAccountBottomSheet");
            return;
        }
        AccountFuturesEligibilityStatusDto eligibilityStatus = value.getEligibilityStatus();
        int i = eligibilityStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eligibilityStatus.ordinal()];
        if (i == -1 || i == 1 || i == 2) {
            replaceFragment(FuturesEligibilityFragment.INSTANCE.newInstance((Parcelable) new FuturesEligibilityFragment.Args(eligibilityStatus, ((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).isEventsContracts())));
            return;
        }
        if (i == 3) {
            onUserBecameEligible();
        } else if (i == 4) {
            showAccountAlreadyExistsFragment();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            showManualReviewFragment();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == 73462) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new PostUserCreationShimIntentKey(false, null, null, false, null, 31, null), null, false, null, null, 60, null);
            return true;
        }
        return super.onPrimaryButtonClicked(dialogId, passthroughArgs);
    }

    @Override // com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment.Callbacks
    public void onUserBecameEligible() {
        popLastFragment();
        startRhdOnboarding();
    }

    private final void startRhdOnboarding() {
        FuturesLocaleStore2 futuresLocaleStore2 = this.locality;
        int i = futuresLocaleStore2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[futuresLocaleStore2.ordinal()];
        if (i == 1) {
            showReviewInvestmentProfileFragment();
        } else if (i == 2) {
            checkSuitability(null);
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new UserInIneligibleLocalityForRhdOnboarding(), false, null, 6, null);
        }
    }

    @Override // com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment.Callbacks
    public void onUserAlreadyHasAccount() {
        popLastFragment();
        showAccountAlreadyExistsFragment();
    }

    @Override // com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment.Callbacks
    public void onUsersApplicationIsInReview() {
        popLastFragment();
        showManualReviewFragment();
    }

    @Override // com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment.Callbacks
    public void onUserIsNotEligible() {
        popLastFragment();
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new UserIsIneligibleForFuturesWithUnknownReason(), false, null, 6, null);
        finish();
    }

    private final void showReviewInvestmentProfileFragment() {
        String str;
        String countryCode;
        Navigator navigator = getNavigator();
        RemoteMicrogramApplication remoteMicrogramApplication = this.futuresApplicationMicrogramSource;
        FuturesLocaleStore2 futuresLocaleStore2 = this.locality;
        if (futuresLocaleStore2 == null || (countryCode = futuresLocaleStore2.getCountryCode()) == null) {
            str = null;
        } else {
            str = "robinhood://params?locality=" + countryCode;
        }
        replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new MicrogramRouterFragmentKey(remoteMicrogramApplication, str, null, null, null, 28, null), null, 2, null));
    }

    @Override // com.robinhood.futures.application.contracts.ApplicationCallbackService
    public Object continueFromFuturesInvestorProfile(Continuation<? super Unit> continuation) {
        onInvestorProfileReviewed();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.questionnaire.libquestionnaire.ReviewInvestorProfileCallbacks
    public void onInvestorProfileReviewed() {
        FuturesLocaleStore2 futuresLocaleStore2 = this.locality;
        int i = futuresLocaleStore2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[futuresLocaleStore2.ordinal()];
        if (i == 1) {
            showQuestionnaireFlow(QuestionnaireFlow.US_FUTURES_SUITABILITY);
        } else if (i == 2) {
            this.ukOnboardingFlowManager.onInvestorProfileReviewed();
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new UserInIneligibleLocalityForRhdOnboarding(), false, null, 6, null);
        }
    }

    @Override // com.robinhood.android.futures.onboarding.ui.uk.FuturesUkOnboardingFlowManager.Callbacks
    public void showInvestorProfile() {
        showReviewInvestmentProfileFragment();
    }

    @Override // com.robinhood.android.futures.onboarding.ui.uk.FuturesUkCheckEligibilityFragment.Callbacks
    public void onProceedToNextStepUk(SuitabilityCheckpointDto passedCheckpoint, boolean alreadyEligibleForNextStep, boolean canSubmitNextStep) {
        this.ukOnboardingFlowManager.onProceedToNextStepUk(passedCheckpoint, alreadyEligibleForNextStep, canSubmitNextStep);
    }

    @Override // com.robinhood.android.futures.onboarding.ui.uk.FuturesUkOnboardingFlowManager.Callbacks
    public void popBackstack() {
        popLastFragment();
    }

    @Override // com.robinhood.android.futures.onboarding.ui.uk.FuturesUkOnboardingFlowManager.Callbacks
    public void checkSuitability(SuitabilityCheckpointDto checkpoint) {
        replaceFragment(FuturesUkCheckEligibilityFragment.INSTANCE.newInstance((Parcelable) new FuturesUkCheckEligibilityFragment.Args(checkpoint)));
    }

    @Override // com.robinhood.android.futures.onboarding.ui.uk.FuturesUkOnboardingFlowManager.Callbacks
    public void showQuestionnaireFlow(QuestionnaireFlow questionnaireFlow) {
        Intrinsics.checkNotNullParameter(questionnaireFlow, "questionnaireFlow");
        int i = WhenMappings.$EnumSwitchMapping$2[questionnaireFlow.ordinal()];
        if (i == 1) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new Questionnaire(false, "futures", null, null, null, null, false, true, true, false, true, new QuestionnaireLoggingParams(((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).getEntryPoint(), null, 2, null), null, false, true, false, false, false, null, null, 963192, null), 73, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        } else if (i == 2) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new Questionnaire(false, QuestionnaireContexts.FUTURES_UK_SUITABILITY, null, null, null, null, false, false, true, false, true, new QuestionnaireLoggingParams(((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).getEntryPoint(), null, 2, null), null, true, true, false, false, false, null, null, 955000, null), 74, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new Questionnaire(false, QuestionnaireContexts.FUTURES_UK_KNOWLEDGE_QUIZ, null, null, null, null, false, false, true, false, false, new QuestionnaireLoggingParams(((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).getEntryPoint(), null, 2, null), null, true, true, false, false, false, null, null, 955000, null), 75, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        }
    }

    @Override // com.robinhood.android.futures.onboarding.ui.uk.FuturesUkOnboardingFlowManager.Callbacks
    public void onUkSubflowCompleted() {
        showAgreementFragment();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            switch (requestCode) {
                case 73:
                    showAgreementFragment();
                    break;
                case 74:
                    this.ukOnboardingFlowManager.onUkSuitabilityCompleted();
                    break;
                case 75:
                    this.ukOnboardingFlowManager.onUkKnowledgeQuizCompleted();
                    break;
            }
        }
    }

    private final void showAgreementFragment() {
        replaceFragment(FuturesOnboardingAgreementFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementFragment.Callbacks
    public void onUserAgreed() {
        showArbitrationAgreementFragment();
    }

    private final void showArbitrationAgreementFragment() {
        FuturesLocaleStore2 futuresLocaleStore2 = this.locality;
        if (futuresLocaleStore2 == null) {
            futuresLocaleStore2 = FuturesLocaleStore2.f6324US;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[futuresLocaleStore2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                showSubmissionFragment();
                return;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                finish();
                return;
            }
        }
        Boolean showArbitrationAgreementScreen = getDuxo().getStateFlow().getValue().getShowArbitrationAgreementScreen();
        if (showArbitrationAgreementScreen == null) {
            replaceFragmentWithoutAnimation(CheckArbitrationFragment.INSTANCE.newInstance());
        } else if (Intrinsics.areEqual(showArbitrationAgreementScreen, Boolean.TRUE)) {
            replaceFragmentWithoutAnimation(FuturesOnboardingArbitrationAgreementFragment.INSTANCE.newInstance());
        } else {
            if (!Intrinsics.areEqual(showArbitrationAgreementScreen, Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            showSubmissionFragment();
        }
    }

    @Override // com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationFragment.Callbacks
    public void onPreviousArbitrationAgreementLoaded(ApiPreviousAgreement previousAgreement) {
        Intrinsics.checkNotNullParameter(previousAgreement, "previousAgreement");
        popLastFragment();
        getDuxo().onPreviousArbitrationAgreementLoaded(previousAgreement);
        showArbitrationAgreementFragment();
    }

    @Override // com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment.Callbacks
    public void onUserArbitrationDismissed(boolean accepted) {
        showSubmissionFragment();
    }

    private final void showSubmissionFragment() {
        replaceFragment(FuturesAccountSubmissionFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionFragment.Callbacks
    public void onAccountSubmitted(CreateFuturesAccountResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.areEqual(result, CreateFuturesAccountResult.ApplicationRejected.INSTANCE)) {
            showRejectedFragment();
        } else if (Intrinsics.areEqual(result, CreateFuturesAccountResult.ManualReviewRequired.INSTANCE)) {
            showManualReviewFragment();
        } else {
            if (!(result instanceof CreateFuturesAccountResult.SuccessfulAccountCreation)) {
                throw new NoWhenBranchMatchedException();
            }
            showAccountApprovedFragment();
        }
    }

    private final void showManualReviewFragment() {
        replaceFragment(FuturesAccountResultFragment.INSTANCE.newInstance((Parcelable) new FuturesAccountResultFragment.Args(FuturesAccountResultFragment.ApplicationResult.MANUAL_REVIEW, ((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).isEventsContracts(), getStreamlineToTradeFlow())));
    }

    private final void showRejectedFragment() {
        replaceFragment(FuturesAccountResultFragment.INSTANCE.newInstance((Parcelable) new FuturesAccountResultFragment.Args(FuturesAccountResultFragment.ApplicationResult.REJECTED, ((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).isEventsContracts(), getStreamlineToTradeFlow())));
    }

    private final void showAccountApprovedFragment() {
        replaceFragment(FuturesAccountResultFragment.INSTANCE.newInstance((Parcelable) new FuturesAccountResultFragment.Args(FuturesAccountResultFragment.ApplicationResult.SUCCESS, ((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).isEventsContracts(), getStreamlineToTradeFlow())));
    }

    private final void showAccountAlreadyExistsFragment() {
        replaceFragment(FuturesAccountResultFragment.INSTANCE.newInstance((Parcelable) new FuturesAccountResultFragment.Args(FuturesAccountResultFragment.ApplicationResult.ALREADY_EXISTS, ((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).isEventsContracts(), getStreamlineToTradeFlow())));
    }

    @Override // com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultFragment.Callbacks
    public void onFlowCompleted() {
        finish();
        FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation = this.postOnboardingNavigation;
        if (postOnboardingNavigation instanceof FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToBracket) {
            return;
        }
        if (postOnboardingNavigation instanceof FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new EventTradeActivityKey(new EventTradeOrderContext(((FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm) postOnboardingNavigation).getContractId(), SideDto.BUY, PositionEffectDto.OPEN), new Screen(Screen.Name.FUTURES_APPLICATION_ACCOUNT_APPROVED, null, null, null, 14, null), ((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).getEntryPoint() + "-onboarding"), null, false, null, null, 60, null);
            return;
        }
        if (postOnboardingNavigation instanceof FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEdpByContractId) {
            startActivity(Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new EventDetailRoutingFragmentKey(((FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEdpByContractId) postOnboardingNavigation).getContractId(), EcUuidType.CONTRACT_ID, ((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).getEntryPoint() + "-onboarding", false, 8, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
            return;
        }
        if (postOnboardingNavigation instanceof FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEdpByEventId) {
            startActivity(Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new EventDetailRoutingFragmentKey(((FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEdpByEventId) postOnboardingNavigation).getEventId(), EcUuidType.EVENT_ID, ((FuturesOnboardingActivityKey) INSTANCE.getExtras((Activity) this)).getEntryPoint() + "-onboarding", false, 8, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
            return;
        }
        if (Intrinsics.areEqual(postOnboardingNavigation, FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcHub.INSTANCE)) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C172981(null), 3, null);
            return;
        }
        if (postOnboardingNavigation instanceof FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToFuturesOrderForm) {
            FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToFuturesOrderForm routeToFuturesOrderForm = (FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToFuturesOrderForm) postOnboardingNavigation;
            startActivity(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new FuturesTradeActivityKey(new FuturesTradeActivityKey.TradeData.OrderForm(routeToFuturesOrderForm.getContractId(), new Screen(Screen.Name.FUTURES_APPLICATION_ACCOUNT_APPROVED, null, null, null, 14, null), routeToFuturesOrderForm.getSide(), routeToFuturesOrderForm.getDefaultQuantity(), routeToFuturesOrderForm.getRetainAdvancedChart())), null, false, 12, null));
        } else if (Intrinsics.areEqual(postOnboardingNavigation, FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToRhFuturesList.INSTANCE)) {
            startActivity(Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, CuratedListKey.INSTANCE.getFuturesListKey(), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
        } else if (postOnboardingNavigation != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: FuturesOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onFlowCompleted$1", m3645f = "FuturesOnboardingActivity.kt", m3646l = {587}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingActivity$onFlowCompleted$1 */
    static final class C172981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C172981(Continuation<? super C172981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesOnboardingActivity.this.new C172981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C172981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Navigator navigator = FuturesOnboardingActivity.this.getNavigator();
                FuturesOnboardingActivity futuresOnboardingActivity = FuturesOnboardingActivity.this;
                String str = ((FuturesOnboardingActivityKey) FuturesOnboardingActivity.INSTANCE.getExtras((Activity) futuresOnboardingActivity)).getEntryPoint() + "-onboarding";
                this.label = 1;
                if (HubNavigateUtils2.navigateToEcHub(navigator, futuresOnboardingActivity, str, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultFragment.Callbacks
    public void onFlowCompletedWithRejectionOrReview() {
        finish();
    }

    /* compiled from: FuturesOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingActivity;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey;", "<init>", "()V", "FUTURES_QUESTIONNAIRE_REQUEST_CODE", "", "FUTURES_UK_QUESTIONNAIRE_REQUEST_CODE", "FUTURES_UK_KNOWLEDGE_QUIZ_REQUEST_CODE", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<FuturesOnboardingActivity, FuturesOnboardingActivityKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public FuturesOnboardingActivityKey getExtras(FuturesOnboardingActivity futuresOnboardingActivity) {
            return (FuturesOnboardingActivityKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, futuresOnboardingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, FuturesOnboardingActivityKey futuresOnboardingActivityKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, futuresOnboardingActivityKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, FuturesOnboardingActivityKey futuresOnboardingActivityKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, futuresOnboardingActivityKey);
        }
    }
}
