package com.robinhood.android.optionsupgrade;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultCaller;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.options.contracts.OptionOnboarding4;
import com.robinhood.android.optionsupgrade.OptionOnboardingApprovedTradesFragment;
import com.robinhood.android.optionsupgrade.OptionOnboardingFailureFragment;
import com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeFragment;
import com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment;
import com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment;
import com.robinhood.android.optionsupgrade.OptionOnboardingSuccessFragment;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenError;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededFragment;
import com.robinhood.android.optionsupgrade.p210uk.UkEducationBenefitsFragment;
import com.robinhood.android.optionsupgrade.p210uk.UkEducationBenefitsL2Fragment;
import com.robinhood.android.optionsupgrade.p210uk.UkEducationRisksFragment;
import com.robinhood.android.optionsupgrade.p210uk.UkExperienceTestQuestionnaireFragment;
import com.robinhood.android.optionsupgrade.p210uk.UkInvestorProfileQuestionnaireFragment;
import com.robinhood.android.optionsupgrade.p210uk.UkKnowledgeTestQuestionnaireFragment;
import com.robinhood.android.optionsupgrade.p210uk.UkProfessionalTraderFragment;
import com.robinhood.android.optionsupgrade.p210uk.UkReviewInvestorProfileFragment;
import com.robinhood.android.optionsupgrade.p210uk.UkSplashL0Fragment;
import com.robinhood.android.optionsupgrade.p210uk.UkSplashL2Fragment;
import com.robinhood.android.optionsupgrade.rhsg.RhsgCarTestQuestionnaireFragment;
import com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingApprovedTradesFragment;
import com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashFragment;
import com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.options.p360uk.intro.contracts.model.UkOptionsOnboardingContent;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.utils.http.HttpStatusCode;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: OptionOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002ihB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010\u0005J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010,H\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u0005J\u001f\u00105\u001a\u00020\n2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0010H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0010\u0010@\u001a\u00020?H\u0096\u0001¢\u0006\u0004\b@\u0010AR\"\u0010C\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010J\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010Q\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR&\u0010Y\u001a\u0014\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\n0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001b\u0010_\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020d0c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006j"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "<init>", "()V", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "currentScreenArgs", "", "goToNextScreenImpl", "(Lcom/robinhood/android/optionsupgrade/ScreenRequest;Lcom/robinhood/android/optionsupgrade/ScreenArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextScreenArgs", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "onboardingProgress", "Landroidx/fragment/app/Fragment;", "getNextFragment", "(Lcom/robinhood/android/optionsupgrade/ScreenArgs;Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/optionsupgrade/ScreenError;", "error", "handleScreenError", "(Lcom/robinhood/android/optionsupgrade/ScreenError;Lcom/robinhood/android/optionsupgrade/ScreenRequest;Lcom/robinhood/android/optionsupgrade/ScreenArgs;)V", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$End;", "endMetadata", "handleResult", "(Lcom/robinhood/android/optionsupgrade/ScreenArgs$End;Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;)V", "Lkotlin/Pair;", "goToNextScreenWithSuvHandler", "(Lcom/robinhood/android/optionsupgrade/ScreenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDuxo;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "awaitNonNullUkContent", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingDuxo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity$PostFlowAction;", "actions", "handlePostFlowActions", "(Ljava/util/List;)V", "prefetchLottieUrls", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "configureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$Start;", "startScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Start;", "startScreenArgs", "startOptionOnboardingFlow", "(Lcom/robinhood/android/optionsupgrade/ScreenRequest$Start;Lcom/robinhood/android/optionsupgrade/ScreenArgs$Start;)V", "goToNextScreen", "(Lcom/robinhood/android/optionsupgrade/ScreenRequest;Lcom/robinhood/android/optionsupgrade/ScreenArgs;)V", "fragment", "goToNonOptionOnboardingScreenFragment", "(Landroidx/fragment/app/Fragment;)V", "Lcom/robinhood/rosetta/eventlogging/OptionOnboardingContext;", "getOptionOnboardingScreenContext", "()Lcom/robinhood/rosetta/eventlogging/OptionOnboardingContext;", "", "onDismissUnsupportedFeatureDialog", "()Z", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "getSuvWorkflowManager", "()Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "setSuvWorkflowManager", "(Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "setClock", "(Lj$/time/Clock;)V", "Lkotlin/Function2;", "Ljava/util/UUID;", "launchSuv", "Lkotlin/jvm/functions/Function2;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingDuxo;", "duxo", "Lcom/robinhood/android/optionsupgrade/GoToNextScreenJob;", "goToNextScreenJob", "Lcom/robinhood/android/optionsupgrade/GoToNextScreenJob;", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "PostFlowAction", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingActivity extends BaseActivity implements RegionGated, OptionOnboardingScreens2 {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public Clock clock;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private GoToNextScreenJob goToNextScreenJob;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    public SuvWorkflowManager suvWorkflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionOnboardingActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOnboardingProgress.values().length];
            try {
                iArr[OptionOnboardingProgress.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOnboardingProgress.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionOnboardingProgress.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionOnboardingProgress.ALREADY_HAS_OPTIONS_ACCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OptionOnboardingActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingActivity", m3645f = "OptionOnboardingActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, 346, 358, 369, 380, 398, HttpStatusCode.GONE, 423, 435, 452, 464, 488}, m3647m = "getNextFragment")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$getNextFragment$1 */
    static final class C249101 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C249101(Continuation<? super C249101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionOnboardingActivity.this.getNextFragment(null, null, this);
        }
    }

    /* compiled from: OptionOnboardingActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingActivity", m3645f = "OptionOnboardingActivity.kt", m3646l = {202, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "goToNextScreenImpl")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$goToNextScreenImpl$1 */
    static final class C249111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C249111(Continuation<? super C249111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionOnboardingActivity.this.goToNextScreenImpl(null, null, this);
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

    public OptionOnboardingActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.launchSuv = SuvLauncher.registerSuvLauncher((ComponentActivity) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOnboardingActivity.launchSuv$lambda$2(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOnboardingActivity.launchSuv$lambda$4(this.f$0);
            }
        });
        this.duxo = DuxosKt.duxo(this, OptionOnboardingDuxo.class);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final SuvWorkflowManager getSuvWorkflowManager() {
        SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager;
        if (suvWorkflowManager != null) {
            return suvWorkflowManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("suvWorkflowManager");
        return null;
    }

    public final void setSuvWorkflowManager(SuvWorkflowManager suvWorkflowManager) {
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "<set-?>");
        this.suvWorkflowManager = suvWorkflowManager;
    }

    public final Clock getClock() {
        Clock clock = this.clock;
        if (clock != null) {
            return clock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Card.Icon.CLOCK);
        return null;
    }

    public final void setClock(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<set-?>");
        this.clock = clock;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(OptionOnboardingActivity optionOnboardingActivity) {
        GoToNextScreenJob goToNextScreenJob = optionOnboardingActivity.goToNextScreenJob;
        if (goToNextScreenJob != null) {
            optionOnboardingActivity.goToNextScreen(goToNextScreenJob.getCurrentScreenRequest(), goToNextScreenJob.getCurrentScreenArgs());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$4(OptionOnboardingActivity optionOnboardingActivity) {
        GoToNextScreenJob goToNextScreenJob = optionOnboardingActivity.goToNextScreenJob;
        if (goToNextScreenJob != null) {
            ActivityResultCaller currentFragment = optionOnboardingActivity.getCurrentFragment();
            OptionOnboardingScreens optionOnboardingScreens = currentFragment instanceof OptionOnboardingScreens ? (OptionOnboardingScreens) currentFragment : null;
            if (optionOnboardingScreens != null) {
                optionOnboardingScreens.setLoading(false, goToNextScreenJob.getCurrentScreenRequest());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionOnboardingDuxo getDuxo() {
        return (OptionOnboardingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefetchLottieUrls();
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, OptionOnboardingStartFragment.INSTANCE.newInstance((Parcelable) OptionOnboardingStatesKt.getInitialScreenArgs()));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Job job;
        if (getDuxo().backwardNavigationDisabled()) {
            return;
        }
        GoToNextScreenJob goToNextScreenJob = this.goToNextScreenJob;
        if (goToNextScreenJob != null && (job = goToNextScreenJob.getJob()) != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        if (getCurrentFragment() instanceof OptionOnboardingScreens) {
            Tuples2<ScreenArgs, OptionOnboardingProgress> tuples2BackToPreviousScreen = getDuxo().backToPreviousScreen();
            ScreenArgs screenArgsComponent1 = tuples2BackToPreviousScreen.component1();
            OptionOnboardingProgress optionOnboardingProgressComponent2 = tuples2BackToPreviousScreen.component2();
            if (screenArgsComponent1 == null) {
                handleResult(null, optionOnboardingProgressComponent2);
                return;
            } else {
                super.onBackPressed();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens2
    public void startOptionOnboardingFlow(ScreenRequest.Start startScreenRequest, ScreenArgs.Start startScreenArgs) {
        Intrinsics.checkNotNullParameter(startScreenRequest, "startScreenRequest");
        Intrinsics.checkNotNullParameter(startScreenArgs, "startScreenArgs");
        getDuxo().resetScreenStack();
        goToNextScreen(startScreenRequest, startScreenArgs);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens2
    public void goToNextScreen(ScreenRequest currentScreenRequest, ScreenArgs currentScreenArgs) {
        ScreenArgs currentScreenArgs2;
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        Intrinsics.checkNotNullParameter(currentScreenArgs, "currentScreenArgs");
        GoToNextScreenJob goToNextScreenJob = this.goToNextScreenJob;
        if (!Intrinsics.areEqual((goToNextScreenJob == null || (currentScreenArgs2 = goToNextScreenJob.getCurrentScreenArgs()) == null) ? null : currentScreenArgs2.getScreenId(), currentScreenArgs.getScreenId()) || (!goToNextScreenJob.getJob().isActive() && Instant.now().toEpochMilli() - goToNextScreenJob.getStartTimestamp() >= 500)) {
            this.goToNextScreenJob = new GoToNextScreenJob(BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new OptionOnboardingActivity3(this, currentScreenRequest, currentScreenArgs, null), 3, null), currentScreenArgs, currentScreenRequest, Instant.now().toEpochMilli());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object goToNextScreenImpl(ScreenRequest screenRequest, ScreenArgs screenArgs, Continuation<? super Unit> continuation) {
        C249111 c249111;
        OptionOnboardingScreens optionOnboardingScreens;
        Object objGoToNextScreenWithSuvHandler;
        ScreenRequest screenRequest2;
        OptionOnboardingScreens optionOnboardingScreens2;
        Fragment fragment;
        if (continuation instanceof C249111) {
            c249111 = (C249111) continuation;
            int i = c249111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c249111.label = i - Integer.MIN_VALUE;
            } else {
                c249111 = new C249111(continuation);
            }
        }
        Object obj = c249111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c249111.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ActivityResultCaller currentFragment = getCurrentFragment();
            optionOnboardingScreens = currentFragment instanceof OptionOnboardingScreens ? (OptionOnboardingScreens) currentFragment : null;
            if (optionOnboardingScreens != null) {
                optionOnboardingScreens.setLoading(true, screenRequest);
            }
            OptionOnboardingLoggings.logOptionOnboardingNavigationTap(getEventLogger(), screenArgs, screenRequest, getOptionOnboardingScreenContext());
            c249111.L$0 = screenRequest;
            c249111.L$1 = screenArgs;
            c249111.L$2 = optionOnboardingScreens;
            c249111.label = 1;
            objGoToNextScreenWithSuvHandler = goToNextScreenWithSuvHandler(screenRequest, c249111);
            if (objGoToNextScreenWithSuvHandler != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            optionOnboardingScreens2 = (OptionOnboardingScreens) c249111.L$2;
            screenArgs = (ScreenArgs) c249111.L$1;
            screenRequest2 = (ScreenRequest) c249111.L$0;
            ResultKt.throwOnFailure(obj);
            fragment = (Fragment) obj;
            if (fragment != null) {
                return Unit.INSTANCE;
            }
            if (optionOnboardingScreens2 != null) {
                optionOnboardingScreens2.setLoading(false, screenRequest2);
            }
            if (!screenArgs.getShouldLiveInBackstack()) {
                popLastFragment();
            }
            replaceFragment(fragment);
            return Unit.INSTANCE;
        }
        OptionOnboardingScreens optionOnboardingScreens3 = (OptionOnboardingScreens) c249111.L$2;
        screenArgs = (ScreenArgs) c249111.L$1;
        ScreenRequest screenRequest3 = (ScreenRequest) c249111.L$0;
        ResultKt.throwOnFailure(obj);
        optionOnboardingScreens = optionOnboardingScreens3;
        screenRequest = screenRequest3;
        objGoToNextScreenWithSuvHandler = obj;
        Tuples2 tuples2 = (Tuples2) objGoToNextScreenWithSuvHandler;
        if (tuples2 == null) {
            return Unit.INSTANCE;
        }
        ScreenArgs screenArgs2 = (ScreenArgs) tuples2.component1();
        OptionOnboardingProgress optionOnboardingProgress = (OptionOnboardingProgress) tuples2.component2();
        c249111.L$0 = screenRequest;
        c249111.L$1 = screenArgs;
        c249111.L$2 = optionOnboardingScreens;
        c249111.label = 2;
        Object nextFragment = getNextFragment(screenArgs2, optionOnboardingProgress, c249111);
        if (nextFragment != coroutine_suspended) {
            screenRequest2 = screenRequest;
            optionOnboardingScreens2 = optionOnboardingScreens;
            obj = nextFragment;
            fragment = (Fragment) obj;
            if (fragment != null) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b7 A[LOOP:1: B:164:0x03b1->B:166:0x03b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05a6 A[LOOP:0: B:238:0x05a0->B:240:0x05a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getNextFragment(ScreenArgs screenArgs, OptionOnboardingProgress optionOnboardingProgress, Continuation<? super Fragment> continuation) {
        C249101 c249101;
        ScreenArgs screenArgs2;
        OptionOnboardingProgress optionOnboardingProgress2;
        ScreenArgs screenArgs3;
        ScreenArgs screenArgs4;
        ScreenArgs screenArgs5;
        String str;
        ScreenArgs screenArgs6;
        String str2;
        ScreenArgs screenArgs7;
        String str3;
        ScreenArgs screenArgs8;
        String str4;
        ScreenArgs screenArgs9;
        ScreenArgs screenArgs10;
        ScreenArgs screenArgs11;
        ScreenArgs screenArgs12;
        ScreenArgs screenArgs13;
        Iterator<T> it;
        UkOptionsOnboardingContent.QuestionnaireSplashScreen knowledgeTestSplashScreen;
        ScreenArgs.UkKnowledgeTestQuestionnaire ukKnowledgeTestQuestionnaire;
        String description;
        Iterator<T> it2;
        if (continuation instanceof C249101) {
            c249101 = (C249101) continuation;
            int i = c249101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c249101.label = i - Integer.MIN_VALUE;
            } else {
                c249101 = new C249101(continuation);
            }
        }
        Object accountNumber = c249101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c249101.label) {
            case 0:
                ResultKt.throwOnFailure(accountNumber);
                OptionOnboardingDuxo duxo = getDuxo();
                screenArgs2 = screenArgs;
                c249101.L$0 = screenArgs2;
                optionOnboardingProgress2 = optionOnboardingProgress;
                c249101.L$1 = optionOnboardingProgress2;
                c249101.label = 1;
                accountNumber = duxo.getAccountNumber(c249101);
                if (accountNumber != coroutine_suspended) {
                    String str5 = (String) accountNumber;
                    if (!(screenArgs2 instanceof ScreenArgs.Start)) {
                        return OptionOnboardingStartFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.ApprovedTrades) {
                        return OptionOnboardingApprovedTradesFragment.INSTANCE.newInstance((Parcelable) new OptionOnboardingApprovedTradesFragment.Args(getDuxo().getStateFlow().getValue().getLocality(), (ScreenArgs.ApprovedTrades) screenArgs2));
                    }
                    if (screenArgs2 instanceof ScreenArgs.Disclosure) {
                        return OptionOnboardingDisclosureFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.EducationL3Strategies) {
                        return OptionOnboardingEducationL3StrategiesFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.EducationSpread) {
                        return OptionOnboardingEducationSpreadFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    SdpInfo sdpInfo = null;
                    if (screenArgs2 instanceof ScreenArgs.Failure) {
                        CountryCode.Supported locality = getDuxo().getStateFlow().getValue().getLocality();
                        OptionOnboardingFailureFragment.Companion companion = OptionOnboardingFailureFragment.INSTANCE;
                        ScreenArgs.Failure failure = (ScreenArgs.Failure) screenArgs2;
                        Companion companion2 = INSTANCE;
                        OptionOnboarding.OptionOnboardingSource source = ((OptionOnboarding) companion2.getExtras((Activity) this)).getSource();
                        OptionOnboarding2 accountInfo = ((OptionOnboarding) companion2.getExtras((Activity) this)).getAccountInfo();
                        OptionOnboarding2.AccountNumber accountNumber2 = accountInfo instanceof OptionOnboarding2.AccountNumber ? (OptionOnboarding2.AccountNumber) accountInfo : null;
                        return companion.newInstance((Parcelable) new OptionOnboardingFailureFragment.Args(locality, failure, source, accountNumber2 != null ? accountNumber2.getAccountNumber() : null));
                    }
                    if (screenArgs2 instanceof ScreenArgs.InvestmentProfile) {
                        return OptionOnboardingInvestmentProfileFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.QuestionFinancialRegulator) {
                        return OptionOnboardingQuestionFinancialRegulatorFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.QuestionInvestmentAdvice) {
                        return OptionOnboardingQuestionInvestmentAdviceFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.QuestionOptionExperience) {
                        return OptionOnboardingQuestionOptionExperienceFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.QuestionUnderstandSpread) {
                        return OptionOnboardingQuestionUnderstandSpreadFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.ReadyL3Upgrade) {
                        return OptionOnboardingReadyToUpgradeFragment.INSTANCE.newInstance((Parcelable) new OptionOnboardingReadyToUpgradeFragment.Args(getDuxo().getStateFlow().getValue().getLocality(), (ScreenArgs.ReadyL3Upgrade) screenArgs2));
                    }
                    if (screenArgs2 instanceof ScreenArgs.SplashL0) {
                        return OptionOnboardingSplashL0Fragment.INSTANCE.newInstance((Parcelable) new OptionOnboardingSplashL0Fragment.Args(getDuxo().getSplashL0Experiment(), (ScreenArgs.SplashL0) screenArgs2));
                    }
                    if (screenArgs2 instanceof ScreenArgs.SplashL2) {
                        CountryCode.Supported locality2 = getDuxo().getStateFlow().getValue().getLocality();
                        OptionOnboarding.OptionOnboardingSource source2 = ((OptionOnboarding) INSTANCE.getExtras((Activity) this)).getSource();
                        OptionOnboarding.OptionOnboardingSource.Legacy legacy = source2 instanceof OptionOnboarding.OptionOnboardingSource.Legacy ? (OptionOnboarding.OptionOnboardingSource.Legacy) source2 : null;
                        return OptionOnboardingSplashL2Fragment.INSTANCE.newInstance((Parcelable) new OptionOnboardingSplashL2Fragment.Args(legacy != null && legacy.isFromPostTradeUpsell(), getDuxo().getSplashL2Experiment(), locality2, (ScreenArgs.SplashL2) screenArgs2));
                    }
                    if (screenArgs2 instanceof ScreenArgs.SplashRetirement) {
                        return OptionOnboardingSplashRetirementFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.Success) {
                        return OptionOnboardingSuccessFragment.INSTANCE.newInstance((Parcelable) new OptionOnboardingSuccessFragment.Args(getDuxo().getStateFlow().getValue().getLocality(), (ScreenArgs.Success) screenArgs2));
                    }
                    if (screenArgs2 instanceof ScreenArgs.Suitability) {
                        return OptionOnboardingSuitabilityShimFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.UpsellAlert) {
                        return OptionOnboardingUpsellAlertFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.UpsellAllSet) {
                        OptionOnboardingUpsellAllSetFragment.Companion companion3 = OptionOnboardingUpsellAllSetFragment.INSTANCE;
                        ScreenArgs.UpsellAllSet upsellAllSet = (ScreenArgs.UpsellAllSet) screenArgs2;
                        OptionOnboarding.OptionOnboardingSource source3 = ((OptionOnboarding) INSTANCE.getExtras((Activity) this)).getSource();
                        if (!(source3 instanceof OptionOnboarding.OptionOnboardingSource.Legacy)) {
                            if (!(source3 instanceof OptionOnboarding.OptionOnboardingSource.ServerDriven)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            OptionOnboarding.OptionOnboardingSource.ServerDriven serverDriven = (OptionOnboarding.OptionOnboardingSource.ServerDriven) source3;
                            sdpInfo = new SdpInfo(serverDriven.getSymbol(), serverDriven.getUuid(), serverDriven.getChainUuid());
                        }
                        return companion3.newInstance((Parcelable) ScreenArgs.UpsellAllSet.copy$default(upsellAllSet, null, null, sdpInfo, false, false, false, false, false, null, null, 1019, null));
                    }
                    if (screenArgs2 instanceof ScreenArgs.UpsellTradeOnExpiration) {
                        return OptionOnboardingUpsellTradeOnExpirationFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                    }
                    if (screenArgs2 instanceof ScreenArgs.End) {
                        handleResult((ScreenArgs.End) screenArgs2, optionOnboardingProgress2);
                        return null;
                    }
                    if (screenArgs2 instanceof ScreenArgs.UkSplashL0) {
                        OptionOnboardingDuxo duxo2 = getDuxo();
                        c249101.L$0 = screenArgs2;
                        c249101.L$1 = null;
                        c249101.label = 2;
                        accountNumber = awaitNonNullUkContent(duxo2, c249101);
                        if (accountNumber != coroutine_suspended) {
                            screenArgs13 = screenArgs2;
                            UkOptionsOnboardingContent.L2SplashScreen l2SplashScreen = ((UkOptionsOnboardingContent) accountNumber).getL2SplashScreen();
                            return UkSplashL0Fragment.INSTANCE.newInstance((Parcelable) new UkSplashL0Fragment.Args(l2SplashScreen.getTitle(), l2SplashScreen.getDescription(), l2SplashScreen.getDisclosureMarkdown(), (ScreenArgs.UkSplashL0) screenArgs13));
                        }
                    } else if (screenArgs2 instanceof ScreenArgs.UkEducationBenefits) {
                        OptionOnboardingDuxo duxo3 = getDuxo();
                        c249101.L$0 = screenArgs2;
                        c249101.L$1 = null;
                        c249101.label = 3;
                        accountNumber = awaitNonNullUkContent(duxo3, c249101);
                        if (accountNumber != coroutine_suspended) {
                            screenArgs12 = screenArgs2;
                            ScreenArgs.UkEducationBenefits ukEducationBenefits = (ScreenArgs.UkEducationBenefits) screenArgs12;
                            return UkEducationBenefitsFragment.INSTANCE.newInstance((Parcelable) new UkEducationBenefitsFragment.Args(ukEducationBenefits, ((UkOptionsOnboardingContent) accountNumber).getBenefitsScreen().getDisclosureMarkdown(), ukEducationBenefits.getProgressBarData()));
                        }
                    } else if (screenArgs2 instanceof ScreenArgs.UkEducationRisks) {
                        OptionOnboardingDuxo duxo4 = getDuxo();
                        c249101.L$0 = screenArgs2;
                        c249101.L$1 = null;
                        c249101.label = 4;
                        accountNumber = awaitNonNullUkContent(duxo4, c249101);
                        if (accountNumber != coroutine_suspended) {
                            screenArgs11 = screenArgs2;
                            ScreenArgs.UkEducationRisks ukEducationRisks = (ScreenArgs.UkEducationRisks) screenArgs11;
                            return UkEducationRisksFragment.INSTANCE.newInstance((Parcelable) new UkEducationRisksFragment.Args(((UkOptionsOnboardingContent) accountNumber).getRisksScreen().getDisclosureMarkdown(), ukEducationRisks, ukEducationRisks.getProgressBarData()));
                        }
                    } else if (screenArgs2 instanceof ScreenArgs.UkProfessionalTrader) {
                        OptionOnboardingDuxo duxo5 = getDuxo();
                        c249101.L$0 = screenArgs2;
                        c249101.L$1 = null;
                        c249101.label = 5;
                        accountNumber = awaitNonNullUkContent(duxo5, c249101);
                        if (accountNumber != coroutine_suspended) {
                            screenArgs10 = screenArgs2;
                            UkOptionsOnboardingContent.ProfessionalTraderScreen professionalTraderScreen = ((UkOptionsOnboardingContent) accountNumber).getProfessionalTraderScreen();
                            String title = professionalTraderScreen.getTitle();
                            String description2 = professionalTraderScreen.getDescription();
                            List<UkOptionsOnboardingContent.ValueProp> valueProps = professionalTraderScreen.getValueProps();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(valueProps, 10));
                            it = valueProps.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((UkOptionsOnboardingContent.ValueProp) it.next()).getText());
                            }
                            ScreenArgs.UkProfessionalTrader ukProfessionalTrader = (ScreenArgs.UkProfessionalTrader) screenArgs10;
                            return UkProfessionalTraderFragment.INSTANCE.newInstance((Parcelable) new UkProfessionalTraderFragment.Args(title, description2, arrayList, professionalTraderScreen.getDisclosureMarkdown(), ukProfessionalTrader, ukProfessionalTrader.getProgressBarData()));
                        }
                    } else if (screenArgs2 instanceof ScreenArgs.UkInvestorProfile) {
                        OptionOnboardingDuxo duxo6 = getDuxo();
                        c249101.L$0 = screenArgs2;
                        c249101.L$1 = str5;
                        c249101.label = 6;
                        Object objAwaitNonNullUkContent = awaitNonNullUkContent(duxo6, c249101);
                        if (objAwaitNonNullUkContent != coroutine_suspended) {
                            str4 = str5;
                            accountNumber = objAwaitNonNullUkContent;
                            screenArgs9 = screenArgs2;
                            UkOptionsOnboardingContent.QuestionnaireSplashScreen investorProfileSplashScreen = ((UkOptionsOnboardingContent) accountNumber).getInvestorProfileSplashScreen();
                            return UkInvestorProfileQuestionnaireFragment.INSTANCE.newInstance((Parcelable) new UkInvestorProfileQuestionnaireFragment.Args(str4, investorProfileSplashScreen.getTitle(), investorProfileSplashScreen.getDescription(), (ScreenArgs.UkInvestorProfile) screenArgs9));
                        }
                    } else if (screenArgs2 instanceof ScreenArgs.UkReviewInvestorProfile) {
                        OptionOnboardingDuxo duxo7 = getDuxo();
                        c249101.L$0 = screenArgs2;
                        c249101.L$1 = str5;
                        c249101.label = 7;
                        Object objAwaitNonNullUkContent2 = awaitNonNullUkContent(duxo7, c249101);
                        if (objAwaitNonNullUkContent2 != coroutine_suspended) {
                            ScreenArgs screenArgs14 = screenArgs2;
                            str3 = str5;
                            accountNumber = objAwaitNonNullUkContent2;
                            screenArgs8 = screenArgs14;
                            UkOptionsOnboardingContent.QuestionnaireSplashScreen investorProfileSplashScreen2 = ((UkOptionsOnboardingContent) accountNumber).getInvestorProfileSplashScreen();
                            ScreenArgs.UkReviewInvestorProfile ukReviewInvestorProfile = (ScreenArgs.UkReviewInvestorProfile) screenArgs8;
                            return UkReviewInvestorProfileFragment.INSTANCE.newInstance((Parcelable) new UkReviewInvestorProfileFragment.Args(str3, investorProfileSplashScreen2.getTitle(), investorProfileSplashScreen2.getDescription(), ukReviewInvestorProfile, ukReviewInvestorProfile.getProgressBarData()));
                        }
                    } else if (screenArgs2 instanceof ScreenArgs.UkExperienceTestQuestionnaire) {
                        OptionOnboardingDuxo duxo8 = getDuxo();
                        c249101.L$0 = screenArgs2;
                        c249101.L$1 = str5;
                        c249101.label = 8;
                        Object objAwaitNonNullUkContent3 = awaitNonNullUkContent(duxo8, c249101);
                        if (objAwaitNonNullUkContent3 != coroutine_suspended) {
                            str2 = str5;
                            accountNumber = objAwaitNonNullUkContent3;
                            screenArgs7 = screenArgs2;
                            UkOptionsOnboardingContent.QuestionnaireSplashScreen experienceTestSplashScreen = ((UkOptionsOnboardingContent) accountNumber).getExperienceTestSplashScreen();
                            return UkExperienceTestQuestionnaireFragment.INSTANCE.newInstance((Parcelable) new UkExperienceTestQuestionnaireFragment.Args(str2, experienceTestSplashScreen.getTitle(), experienceTestSplashScreen.getDescription(), (ScreenArgs.UkExperienceTestQuestionnaire) screenArgs7));
                        }
                    } else if (screenArgs2 instanceof ScreenArgs.UkKnowledgeTestQuestionnaire) {
                        OptionOnboardingDuxo duxo9 = getDuxo();
                        c249101.L$0 = screenArgs2;
                        c249101.L$1 = str5;
                        c249101.label = 9;
                        Object objAwaitNonNullUkContent4 = awaitNonNullUkContent(duxo9, c249101);
                        if (objAwaitNonNullUkContent4 != coroutine_suspended) {
                            str = str5;
                            accountNumber = objAwaitNonNullUkContent4;
                            screenArgs6 = screenArgs2;
                            knowledgeTestSplashScreen = ((UkOptionsOnboardingContent) accountNumber).getKnowledgeTestSplashScreen();
                            ukKnowledgeTestQuestionnaire = (ScreenArgs.UkKnowledgeTestQuestionnaire) screenArgs6;
                            if (Intrinsics.areEqual(ukKnowledgeTestQuestionnaire.getProductContext(), "options_l3_knowledge") || (description = knowledgeTestSplashScreen.getL3description()) == null) {
                                description = knowledgeTestSplashScreen.getDescription();
                            }
                            return UkKnowledgeTestQuestionnaireFragment.INSTANCE.newInstance((Parcelable) new UkKnowledgeTestQuestionnaireFragment.Args(str, knowledgeTestSplashScreen.getTitle(), description, ukKnowledgeTestQuestionnaire));
                        }
                    } else if (screenArgs2 instanceof ScreenArgs.UkSplashL2) {
                        OptionOnboardingDuxo duxo10 = getDuxo();
                        c249101.L$0 = screenArgs2;
                        c249101.L$1 = null;
                        c249101.label = 10;
                        accountNumber = awaitNonNullUkContent(duxo10, c249101);
                        if (accountNumber != coroutine_suspended) {
                            screenArgs5 = screenArgs2;
                            UkOptionsOnboardingContent.L3SplashScreen l3SplashScreen = ((UkOptionsOnboardingContent) accountNumber).getL3SplashScreen();
                            return UkSplashL2Fragment.INSTANCE.newInstance((Parcelable) new UkSplashL2Fragment.Args(l3SplashScreen.getTitle(), l3SplashScreen.getDescription(), l3SplashScreen.getDisclosureMarkdown(), (ScreenArgs.UkSplashL2) screenArgs5));
                        }
                    } else if (screenArgs2 instanceof ScreenArgs.UkEducationBenefitsL2) {
                        OptionOnboardingDuxo duxo11 = getDuxo();
                        c249101.L$0 = screenArgs2;
                        c249101.L$1 = null;
                        c249101.label = 11;
                        accountNumber = awaitNonNullUkContent(duxo11, c249101);
                        if (accountNumber != coroutine_suspended) {
                            screenArgs4 = screenArgs2;
                            ScreenArgs.UkEducationBenefitsL2 ukEducationBenefitsL2 = (ScreenArgs.UkEducationBenefitsL2) screenArgs4;
                            return UkEducationBenefitsL2Fragment.INSTANCE.newInstance((Parcelable) new UkEducationBenefitsL2Fragment.Args(ukEducationBenefitsL2, ((UkOptionsOnboardingContent) accountNumber).getL3benefitsScreen().getDisclosureMarkdown(), ukEducationBenefitsL2.getProgressBarData()));
                        }
                    } else {
                        if (screenArgs2 instanceof ScreenArgs.RhsgSplash) {
                            return RhsgOptionOnboardingSplashFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                        }
                        if (screenArgs2 instanceof ScreenArgs.RhsgCustomerAccountReviewQuestionnaire) {
                            ScreenArgs.RhsgCustomerAccountReviewQuestionnaire rhsgCustomerAccountReviewQuestionnaire = (ScreenArgs.RhsgCustomerAccountReviewQuestionnaire) screenArgs2;
                            return RhsgCarTestQuestionnaireFragment.INSTANCE.newInstance((Parcelable) new RhsgCarTestQuestionnaireFragment.Args(str5, Intrinsics.areEqual(rhsgCustomerAccountReviewQuestionnaire.getProductContext(), QuestionnaireContexts.CAR_SUITABILITY_RETRY), rhsgCustomerAccountReviewQuestionnaire));
                        }
                        if (!(screenArgs2 instanceof ScreenArgs.RhsgProfessionalTrader)) {
                            if (screenArgs2 instanceof ScreenArgs.RhsgL2ApprovedTrades) {
                                return RhsgOptionOnboardingApprovedTradesFragment.INSTANCE.newInstance((Parcelable) new RhsgOptionOnboardingApprovedTradesFragment.Args(screenArgs2, false));
                            }
                            if (screenArgs2 instanceof ScreenArgs.RhsgL3ApprovedTrades) {
                                return RhsgOptionOnboardingApprovedTradesFragment.INSTANCE.newInstance((Parcelable) new RhsgOptionOnboardingApprovedTradesFragment.Args(screenArgs2, true));
                            }
                            if (screenArgs2 instanceof ScreenArgs.JointAccountPendingApplication) {
                                return OptionOnboardingJAPendingScreenFragment.INSTANCE.newInstance((Parcelable) screenArgs2);
                            }
                            if (screenArgs2 instanceof ScreenArgs.KnowledgeCheckNeeded) {
                                return OptionOnboardingKnowledgeCheckNeededFragment.INSTANCE.newInstance((Parcelable) new OptionOnboardingKnowledgeCheckNeededFragment.Args((ScreenArgs.KnowledgeCheckNeeded) screenArgs2, str5));
                            }
                            if (screenArgs2 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Next screen args is null. This should not happen."), true, null, 4, null);
                            finish();
                            return null;
                        }
                        OptionOnboardingDuxo duxo12 = getDuxo();
                        c249101.L$0 = screenArgs2;
                        c249101.L$1 = null;
                        c249101.label = 12;
                        accountNumber = awaitNonNullUkContent(duxo12, c249101);
                        if (accountNumber != coroutine_suspended) {
                            screenArgs3 = screenArgs2;
                            UkOptionsOnboardingContent.ProfessionalTraderScreen professionalTraderScreen2 = ((UkOptionsOnboardingContent) accountNumber).getProfessionalTraderScreen();
                            String title2 = professionalTraderScreen2.getTitle();
                            String description3 = professionalTraderScreen2.getDescription();
                            List<UkOptionsOnboardingContent.ValueProp> valueProps2 = professionalTraderScreen2.getValueProps();
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(valueProps2, 10));
                            it2 = valueProps2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((UkOptionsOnboardingContent.ValueProp) it2.next()).getText());
                            }
                            return RhsgProfessionalTraderFragment.INSTANCE.newInstance((Parcelable) new RhsgProfessionalTraderFragment.Args(title2, description3, arrayList2, professionalTraderScreen2.getDisclosureMarkdown(), (ScreenArgs.RhsgProfessionalTrader) screenArgs3));
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                OptionOnboardingProgress optionOnboardingProgress3 = (OptionOnboardingProgress) c249101.L$1;
                ScreenArgs screenArgs15 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                optionOnboardingProgress2 = optionOnboardingProgress3;
                screenArgs2 = screenArgs15;
                String str52 = (String) accountNumber;
                if (!(screenArgs2 instanceof ScreenArgs.Start)) {
                }
                break;
            case 2:
                screenArgs13 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                UkOptionsOnboardingContent.L2SplashScreen l2SplashScreen2 = ((UkOptionsOnboardingContent) accountNumber).getL2SplashScreen();
                return UkSplashL0Fragment.INSTANCE.newInstance((Parcelable) new UkSplashL0Fragment.Args(l2SplashScreen2.getTitle(), l2SplashScreen2.getDescription(), l2SplashScreen2.getDisclosureMarkdown(), (ScreenArgs.UkSplashL0) screenArgs13));
            case 3:
                screenArgs12 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                ScreenArgs.UkEducationBenefits ukEducationBenefits2 = (ScreenArgs.UkEducationBenefits) screenArgs12;
                return UkEducationBenefitsFragment.INSTANCE.newInstance((Parcelable) new UkEducationBenefitsFragment.Args(ukEducationBenefits2, ((UkOptionsOnboardingContent) accountNumber).getBenefitsScreen().getDisclosureMarkdown(), ukEducationBenefits2.getProgressBarData()));
            case 4:
                screenArgs11 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                ScreenArgs.UkEducationRisks ukEducationRisks2 = (ScreenArgs.UkEducationRisks) screenArgs11;
                return UkEducationRisksFragment.INSTANCE.newInstance((Parcelable) new UkEducationRisksFragment.Args(((UkOptionsOnboardingContent) accountNumber).getRisksScreen().getDisclosureMarkdown(), ukEducationRisks2, ukEducationRisks2.getProgressBarData()));
            case 5:
                screenArgs10 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                UkOptionsOnboardingContent.ProfessionalTraderScreen professionalTraderScreen3 = ((UkOptionsOnboardingContent) accountNumber).getProfessionalTraderScreen();
                String title3 = professionalTraderScreen3.getTitle();
                String description22 = professionalTraderScreen3.getDescription();
                List<UkOptionsOnboardingContent.ValueProp> valueProps3 = professionalTraderScreen3.getValueProps();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(valueProps3, 10));
                it = valueProps3.iterator();
                while (it.hasNext()) {
                }
                ScreenArgs.UkProfessionalTrader ukProfessionalTrader2 = (ScreenArgs.UkProfessionalTrader) screenArgs10;
                return UkProfessionalTraderFragment.INSTANCE.newInstance((Parcelable) new UkProfessionalTraderFragment.Args(title3, description22, arrayList3, professionalTraderScreen3.getDisclosureMarkdown(), ukProfessionalTrader2, ukProfessionalTrader2.getProgressBarData()));
            case 6:
                str4 = (String) c249101.L$1;
                screenArgs9 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                UkOptionsOnboardingContent.QuestionnaireSplashScreen investorProfileSplashScreen3 = ((UkOptionsOnboardingContent) accountNumber).getInvestorProfileSplashScreen();
                return UkInvestorProfileQuestionnaireFragment.INSTANCE.newInstance((Parcelable) new UkInvestorProfileQuestionnaireFragment.Args(str4, investorProfileSplashScreen3.getTitle(), investorProfileSplashScreen3.getDescription(), (ScreenArgs.UkInvestorProfile) screenArgs9));
            case 7:
                String str6 = (String) c249101.L$1;
                screenArgs8 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                str3 = str6;
                UkOptionsOnboardingContent.QuestionnaireSplashScreen investorProfileSplashScreen22 = ((UkOptionsOnboardingContent) accountNumber).getInvestorProfileSplashScreen();
                ScreenArgs.UkReviewInvestorProfile ukReviewInvestorProfile2 = (ScreenArgs.UkReviewInvestorProfile) screenArgs8;
                return UkReviewInvestorProfileFragment.INSTANCE.newInstance((Parcelable) new UkReviewInvestorProfileFragment.Args(str3, investorProfileSplashScreen22.getTitle(), investorProfileSplashScreen22.getDescription(), ukReviewInvestorProfile2, ukReviewInvestorProfile2.getProgressBarData()));
            case 8:
                str2 = (String) c249101.L$1;
                screenArgs7 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                UkOptionsOnboardingContent.QuestionnaireSplashScreen experienceTestSplashScreen2 = ((UkOptionsOnboardingContent) accountNumber).getExperienceTestSplashScreen();
                return UkExperienceTestQuestionnaireFragment.INSTANCE.newInstance((Parcelable) new UkExperienceTestQuestionnaireFragment.Args(str2, experienceTestSplashScreen2.getTitle(), experienceTestSplashScreen2.getDescription(), (ScreenArgs.UkExperienceTestQuestionnaire) screenArgs7));
            case 9:
                str = (String) c249101.L$1;
                screenArgs6 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                knowledgeTestSplashScreen = ((UkOptionsOnboardingContent) accountNumber).getKnowledgeTestSplashScreen();
                ukKnowledgeTestQuestionnaire = (ScreenArgs.UkKnowledgeTestQuestionnaire) screenArgs6;
                if (Intrinsics.areEqual(ukKnowledgeTestQuestionnaire.getProductContext(), "options_l3_knowledge")) {
                    description = knowledgeTestSplashScreen.getDescription();
                    break;
                } else {
                    description = knowledgeTestSplashScreen.getDescription();
                }
                return UkKnowledgeTestQuestionnaireFragment.INSTANCE.newInstance((Parcelable) new UkKnowledgeTestQuestionnaireFragment.Args(str, knowledgeTestSplashScreen.getTitle(), description, ukKnowledgeTestQuestionnaire));
            case 10:
                screenArgs5 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                UkOptionsOnboardingContent.L3SplashScreen l3SplashScreen2 = ((UkOptionsOnboardingContent) accountNumber).getL3SplashScreen();
                return UkSplashL2Fragment.INSTANCE.newInstance((Parcelable) new UkSplashL2Fragment.Args(l3SplashScreen2.getTitle(), l3SplashScreen2.getDescription(), l3SplashScreen2.getDisclosureMarkdown(), (ScreenArgs.UkSplashL2) screenArgs5));
            case 11:
                screenArgs4 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                ScreenArgs.UkEducationBenefitsL2 ukEducationBenefitsL22 = (ScreenArgs.UkEducationBenefitsL2) screenArgs4;
                return UkEducationBenefitsL2Fragment.INSTANCE.newInstance((Parcelable) new UkEducationBenefitsL2Fragment.Args(ukEducationBenefitsL22, ((UkOptionsOnboardingContent) accountNumber).getL3benefitsScreen().getDisclosureMarkdown(), ukEducationBenefitsL22.getProgressBarData()));
            case 12:
                screenArgs3 = (ScreenArgs) c249101.L$0;
                ResultKt.throwOnFailure(accountNumber);
                UkOptionsOnboardingContent.ProfessionalTraderScreen professionalTraderScreen22 = ((UkOptionsOnboardingContent) accountNumber).getProfessionalTraderScreen();
                String title22 = professionalTraderScreen22.getTitle();
                String description32 = professionalTraderScreen22.getDescription();
                List<UkOptionsOnboardingContent.ValueProp> valueProps22 = professionalTraderScreen22.getValueProps();
                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(valueProps22, 10));
                it2 = valueProps22.iterator();
                while (it2.hasNext()) {
                }
                return RhsgProfessionalTraderFragment.INSTANCE.newInstance((Parcelable) new RhsgProfessionalTraderFragment.Args(title22, description32, arrayList22, professionalTraderScreen22.getDisclosureMarkdown(), (ScreenArgs.RhsgProfessionalTrader) screenArgs3));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleScreenError(ScreenError error, ScreenRequest currentScreenRequest, ScreenArgs currentScreenArgs) {
        OptionOnboardingLoggings.logOptionOnboardingErrorAppear(getEventLogger(), error, currentScreenArgs, currentScreenRequest, getOptionOnboardingScreenContext());
        if (!(error instanceof ScreenError.Dialog)) {
            throw new NoWhenBranchMatchedException();
        }
        RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(this).setId(C11048R.id.dialog_id_generic_error).setUseDesignSystemOverlay(true).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(((ScreenError.Dialog) error).getErrorMessage());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, supportFragmentManager, "option-onboarding-screen-error", false, 4, null);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens2
    public void goToNonOptionOnboardingScreenFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        replaceFragment(fragment);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens2
    public OptionOnboardingContext getOptionOnboardingScreenContext() {
        return getDuxo().getStateFlow().getValue().getOptionOnboardingContext();
    }

    /* compiled from: OptionOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity$PostFlowAction;", "", "<init>", "()V", "Deeplink", "NavigationFragmentKey", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity$PostFlowAction$Deeplink;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity$PostFlowAction$NavigationFragmentKey;", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static abstract class PostFlowAction {
        public /* synthetic */ PostFlowAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PostFlowAction() {
        }

        /* compiled from: OptionOnboardingActivity.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity$PostFlowAction$Deeplink;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity$PostFlowAction;", "deeplink", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getDeeplink", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Deeplink extends PostFlowAction {
            public static final int $stable = 8;
            private final Uri deeplink;

            public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, Uri uri, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = deeplink.deeplink;
                }
                return deeplink.copy(uri);
            }

            /* renamed from: component1, reason: from getter */
            public final Uri getDeeplink() {
                return this.deeplink;
            }

            public final Deeplink copy(Uri deeplink) {
                return new Deeplink(deeplink);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Deeplink) && Intrinsics.areEqual(this.deeplink, ((Deeplink) other).deeplink);
            }

            public int hashCode() {
                Uri uri = this.deeplink;
                if (uri == null) {
                    return 0;
                }
                return uri.hashCode();
            }

            public String toString() {
                return "Deeplink(deeplink=" + this.deeplink + ")";
            }

            public Deeplink(Uri uri) {
                super(null);
                this.deeplink = uri;
            }

            public final Uri getDeeplink() {
                return this.deeplink;
            }
        }

        /* compiled from: OptionOnboardingActivity.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity$PostFlowAction$NavigationFragmentKey;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity$PostFlowAction;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NavigationFragmentKey extends PostFlowAction {
            public static final int $stable = 8;
            private final FragmentKey fragmentKey;

            public static /* synthetic */ NavigationFragmentKey copy$default(NavigationFragmentKey navigationFragmentKey, FragmentKey fragmentKey, int i, Object obj) {
                if ((i & 1) != 0) {
                    fragmentKey = navigationFragmentKey.fragmentKey;
                }
                return navigationFragmentKey.copy(fragmentKey);
            }

            /* renamed from: component1, reason: from getter */
            public final FragmentKey getFragmentKey() {
                return this.fragmentKey;
            }

            public final NavigationFragmentKey copy(FragmentKey fragmentKey) {
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                return new NavigationFragmentKey(fragmentKey);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigationFragmentKey) && Intrinsics.areEqual(this.fragmentKey, ((NavigationFragmentKey) other).fragmentKey);
            }

            public int hashCode() {
                return this.fragmentKey.hashCode();
            }

            public String toString() {
                return "NavigationFragmentKey(fragmentKey=" + this.fragmentKey + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigationFragmentKey(FragmentKey fragmentKey) {
                super(null);
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                this.fragmentKey = fragmentKey;
            }

            public final FragmentKey getFragmentKey() {
                return this.fragmentKey;
            }
        }
    }

    private final void handleResult(ScreenArgs.End endMetadata, OptionOnboardingProgress onboardingProgress) {
        OptionOnboardingViewState value = getDuxo().getStateFlow().getValue();
        Long ongoingEndpointRequestStartedAt = value.getOngoingEndpointRequestStartedAt();
        if (ongoingEndpointRequestStartedAt != null) {
            EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, new Screen(OptionOnboardingLoggings.getScreenName(value.getCurrentScreen()), null, OptionOnboardingLoggings.OPTION_ONBOARDING_NEXT_SCREENS_DROPOFF_SCREEN_IDENTIFIER, null, 10, null), null, null, new Context(0, 0, 0, null, null, null, null, null, (int) (Instant.now(getClock()).toEpochMilli() - ongoingEndpointRequestStartedAt.longValue()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, value.getOptionOnboardingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -65, 16383, null), 13, null);
        }
        OptionOnboarding4.Result result = OptionOnboardingStatesKt.toResult(onboardingProgress);
        ArrayList arrayList = new ArrayList();
        String postFlowDeeplink = endMetadata != null ? endMetadata.getPostFlowDeeplink() : null;
        if (postFlowDeeplink != null && !StringsKt.isBlank(postFlowDeeplink)) {
            arrayList.add(new PostFlowAction.Deeplink(Uri.parse(endMetadata.getPostFlowDeeplink())));
        }
        int i = WhenMappings.$EnumSwitchMapping$0[onboardingProgress.ordinal()];
        if (i == 1) {
            String successDeeplink = ((OptionOnboarding) INSTANCE.getExtras((Activity) this)).getSuccessDeeplink();
            Uri uri = successDeeplink != null ? Uri.parse(successDeeplink) : null;
            if (uri != null) {
                arrayList.add(new PostFlowAction.Deeplink(uri));
            }
        } else if (i != 2 && i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new PostFlowAction.NavigationFragmentKey(new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_OPTIONS_SETTINGS, false, false, false, null, null, null, null, false, 510, null)));
        }
        handlePostFlowActions(arrayList);
        NavigationActivityResultContract3.finishWithResult(this, result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object goToNextScreenWithSuvHandler(ScreenRequest screenRequest, Continuation<? super Tuples2<? extends ScreenArgs, ? extends OptionOnboardingProgress>> continuation) {
        final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(continuation));
        getSuvWorkflowManager().handleRequest(new OptionOnboardingActivity4(this, screenRequest, null), new OptionOnboardingActivity5(safeContinuationJvm), new OptionOnboardingActivity6(safeContinuationJvm), new Function2<UUID, Boolean, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$goToNextScreenWithSuvHandler$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, Boolean bool) {
                invoke(uuid, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(UUID workflowId, boolean z) {
                Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                this.this$0.launchSuv.invoke(workflowId, Boolean.valueOf(z));
                safeContinuationJvm.resumeWith(Result.m28550constructorimpl(null));
            }
        });
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitNonNullUkContent(OptionOnboardingDuxo optionOnboardingDuxo, Continuation<? super UkOptionsOnboardingContent> continuation) {
        final StateFlow<OptionOnboardingViewState> stateFlow = optionOnboardingDuxo.getStateFlow();
        final Flow<OptionOnboardingViewState> flow = new Flow<OptionOnboardingViewState>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$awaitNonNullUkContent$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OptionOnboardingViewState> flowCollector, Continuation continuation2) {
                Object objCollect = stateFlow.collect(new C249082(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$awaitNonNullUkContent$$inlined$filter$1$2 */
            public static final class C249082<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingActivity$awaitNonNullUkContent$$inlined$filter$1$2", m3645f = "OptionOnboardingActivity.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$awaitNonNullUkContent$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C249082.this.emit(null, this);
                    }
                }

                public C249082(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((OptionOnboardingViewState) obj).getI18nOptionsOnboardingContent() != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        return FlowKt.first(new Flow<UkOptionsOnboardingContent>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$awaitNonNullUkContent$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UkOptionsOnboardingContent> flowCollector, Continuation continuation2) {
                Object objCollect = flow.collect(new C249092(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$awaitNonNullUkContent$$inlined$map$1$2 */
            public static final class C249092<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingActivity$awaitNonNullUkContent$$inlined$map$1$2", m3645f = "OptionOnboardingActivity.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$awaitNonNullUkContent$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C249092.this.emit(null, this);
                    }
                }

                public C249092(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        UkOptionsOnboardingContent i18nOptionsOnboardingContent = ((OptionOnboardingViewState) obj).getI18nOptionsOnboardingContent();
                        Intrinsics.checkNotNull(i18nOptionsOnboardingContent);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(i18nOptionsOnboardingContent, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, continuation);
    }

    private final void handlePostFlowActions(List<? extends PostFlowAction> actions) {
        for (PostFlowAction postFlowAction : actions) {
            if (postFlowAction instanceof PostFlowAction.Deeplink) {
                if (Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, ((PostFlowAction.Deeplink) postFlowAction).getDeeplink(), null, null, false, null, 60, null)) {
                    return;
                }
            } else {
                if (!(postFlowAction instanceof PostFlowAction.NavigationFragmentKey)) {
                    throw new NoWhenBranchMatchedException();
                }
                Navigator.DefaultImpls.showFragment$default(getNavigator(), this, ((PostFlowAction.NavigationFragmentKey) postFlowAction).getFragmentKey(), false, false, false, null, false, null, false, false, null, null, 4084, null);
                return;
            }
        }
    }

    private final void prefetchLottieUrls() {
        LottieUrl.OPTIONS_ONBOARDING_L0_DAY.prefetch(this);
        LottieUrl.OPTIONS_ONBOARDING_L0_NIGHT.prefetch(this);
        LottieUrl.OPTIONS_ONBOARDING_L2_DAY.prefetch(this);
        LottieUrl.OPTIONS_ONBOARDING_L2_NEON.prefetch(this);
        LottieUrl.OPTIONS_ONBOARDING_L2_NIGHT.prefetch(this);
        LottieUrl.OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_DAY.prefetch(this);
        LottieUrl.OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_NIGHT.prefetch(this);
        LottieUrl.OPTIONS_ONBOARDING_ALL_SET_SDP_DAY.prefetch(this);
        LottieUrl.OPTIONS_ONBOARDING_ALL_SET_SDP_NIGHT.prefetch(this);
        LottieUrl.OPTIONS_ONBOARDING_ALL_SET_NON_SDP_DAY.prefetch(this);
        LottieUrl.OPTIONS_ONBOARDING_ALL_SET_NON_SDP_NIGHT.prefetch(this);
    }

    /* compiled from: OptionOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity;", "Lcom/robinhood/android/options/contracts/OptionOnboarding;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<OptionOnboardingActivity, OptionOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public OptionOnboarding getExtras(OptionOnboardingActivity optionOnboardingActivity) {
            return (OptionOnboarding) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, optionOnboardingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, OptionOnboarding optionOnboarding) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, optionOnboarding);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(android.content.Context context, OptionOnboarding optionOnboarding) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, optionOnboarding);
        }
    }
}
