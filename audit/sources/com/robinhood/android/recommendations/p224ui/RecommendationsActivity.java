package com.robinhood.android.recommendations.p224ui;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowInsets;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.contracts.RecommendationsIntentKeys;
import com.robinhood.android.recommendations.lib.overlay.RecsOverlay;
import com.robinhood.android.recommendations.lib.p221ui.Recommendations404Fragment;
import com.robinhood.android.recommendations.lib.p221ui.RecommendationsLoadingFragment;
import com.robinhood.android.recommendations.p224ui.confirmation.RecommendationsQuestionnaireConfirmationFragment;
import com.robinhood.android.recommendations.p224ui.congrats.RecommendationsCelebrationFragment;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnaireParentFragment;
import com.robinhood.android.recommendations.p224ui.reentry.RecommendationsReentryLandingFragment;
import com.robinhood.android.recommendations.p224ui.reentry.RecommendationsReentryQuestionnaireConfirmationFragment;
import com.robinhood.android.recommendations.p224ui.risk.RecommendationsRiskProfileFragment;
import com.robinhood.android.recommendations.p224ui.risk.RecommendationsRiskProfileLandingFragment;
import com.robinhood.android.recommendations.p224ui.utils.UiRecommendationPortfolios;
import com.robinhood.android.recommendations.p224ui.walkthrough.PortfolioBlocksDrawable;
import com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughFragment;
import com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughSummaryFragment;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsExistingAnswers;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsPortfolio;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsRiskProfile;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ViewsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecommendationsActivity.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0001QB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020&H\u0016J\b\u0010-\u001a\u00020&H\u0016J\b\u0010.\u001a\u00020&H\u0016J\b\u0010/\u001a\u00020&H\u0016J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0016J\"\u00104\u001a\u00020&2\u0018\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0706H\u0016J>\u00108\u001a\u00020&2\u0018\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a07062\u001a\u00109\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001d07\u0018\u000106H\u0016J2\u0010;\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020=2\u0018\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001d0706H\u0016J2\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020@2\u0018\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001d07062\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020&2\u0006\u0010?\u001a\u00020@H\u0016J*\u0010D\u001a\u00020&2\u0006\u0010?\u001a\u00020@2\u0018\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001d0706H\u0016J\b\u0010E\u001a\u00020&H\u0016J\b\u0010F\u001a\u00020&H\u0016J\u001a\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010(H\u0016JF\u00108\u001a\u00020&2\u0018\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a07062\u001a\u00109\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001d07\u0018\u0001062\u0006\u0010L\u001a\u00020HH\u0002J\u0010\u0010M\u001a\u00020&2\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020&H\u0002R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001f¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/RecommendationsActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/recommendations/lib/ui/RecommendationsLoadingFragment$Callbacks;", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryLandingFragment$Callbacks;", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationFragment$Callbacks;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireParentFragment$Callbacks;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingFragment$Callbacks;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileFragment$Callbacks;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughFragment$Callbacks;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughSummaryFragment$Callbacks;", "Lcom/robinhood/android/recommendations/ui/congrats/RecommendationsCelebrationFragment$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "submissionId", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "source", "", "getSource", "()Ljava/lang/String;", "source$delegate", "Lkotlin/Lazy;", "loggingId", "getLoggingId", "loggingId$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "generateNewSubmissionId", "onRecommendationsEligibilityConfirmed", "onRecommendationsEligibilityDenied", "onRecommendationsReentry", "existingAnswers", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsExistingAnswers;", "onStartReentryQuestionnaireConfirmation", "onSubmitQuestionnaireForReentry", "questionsAndAnswers", "", "Lkotlin/Pair;", "startRiskProfileLandingFlow", "sharedElements", "Landroid/view/View;", "startRiskProfile", "riskProfile", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;", "startWalkthroughFlow", "portfolioRecommendation", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio;", "sharedElementLottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "onBackFromWalkthrough", "showPortfolioSummary", "onShowCelebration", "onExitCelebration", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "skipConfirmationScreen", "logExitOnAlertTap", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "prefetchLotties", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsActivity extends BaseActivity implements RecommendationsLoadingFragment.Callbacks, RecommendationsReentryLandingFragment.Callbacks, RecommendationsReentryQuestionnaireConfirmationFragment.Callbacks, RecommendationsQuestionnaireParentFragment.Callbacks, RecommendationsRiskProfileLandingFragment.Callbacks, RecommendationsRiskProfileFragment.Callbacks, RecommendationsWalkthroughFragment.Callbacks, RecommendationsWalkthroughSummaryFragment.Callbacks, RecommendationsCelebrationFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_LOGGING_ID = "logging_id";
    private static final String EXTRA_SOURCE = "source";
    private static final String RISK_LANDING_TRANSACTION_NAME = "recs_questionnaire_to_risk_landing_transaction";
    public EventLogger eventLogger;

    /* renamed from: loggingId$delegate, reason: from kotlin metadata */
    private final Lazy loggingId;

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source;
    private UUID submissionId;
    public SurveyManager3 userLeapManager;

    public RecommendationsActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.submissionId = UUID.randomUUID();
        this.source = Activity.intentExtra(this, "source");
        this.loggingId = Activity.intentExtra(this, EXTRA_LOGGING_ID);
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
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

    private final String getSource() {
        return (String) this.source.getValue();
    }

    private final String getLoggingId() {
        return (String) this.loggingId.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(savedInstanceState);
        prefetchLotties();
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), RecsOverlay.INSTANCE, null, 2, null);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, RecommendationsLoadingFragment.INSTANCE.newInstance());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setUseDesignSystemTheme(true);
        toolbar.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.recommendations.ui.RecommendationsActivity$configureToolbar$1$1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                ViewsKt.setMarginTop(v, insets.getSystemWindowInsetTop());
                return insets.consumeSystemWindowInsets();
            }
        });
        ScarletManager2.overrideAttribute(toolbar, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorTransparent));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment instanceof RecommendationsRiskProfileFragment) || (currentFragment instanceof RecommendationsQuestionnaireConfirmationFragment)) {
            getSupportFragmentManager().popBackStack(RISK_LANDING_TRANSACTION_NAME, 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireParentFragment.Callbacks
    public void generateNewSubmissionId() {
        this.submissionId = UUID.randomUUID();
    }

    @Override // com.robinhood.android.recommendations.lib.ui.RecommendationsLoadingFragment.Callbacks
    public void onRecommendationsEligibilityConfirmed() {
        replaceFragmentWithoutAnimationAndBackStack(RecommendationsQuestionnaireParentFragment.INSTANCE.newInstance((Parcelable) new RecommendationsQuestionnaireParentFragment.Args(getSource(), getLoggingId())));
    }

    @Override // com.robinhood.android.recommendations.lib.ui.RecommendationsLoadingFragment.Callbacks
    public void onRecommendationsEligibilityDenied() {
        replaceFragmentWithoutBackStack(Recommendations404Fragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.recommendations.lib.ui.RecommendationsLoadingFragment.Callbacks
    public void onRecommendationsReentry(UiRecommendationsExistingAnswers existingAnswers) {
        Intrinsics.checkNotNullParameter(existingAnswers, "existingAnswers");
        replaceFragmentWithoutAnimationAndBackStack(RecommendationsReentryLandingFragment.INSTANCE.newInstance((Parcelable) new RecommendationsReentryLandingFragment.Args(getSource(), getLoggingId(), existingAnswers)));
    }

    @Override // com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryLandingFragment.Callbacks
    public void onStartReentryQuestionnaireConfirmation(UiRecommendationsExistingAnswers existingAnswers) {
        Intrinsics.checkNotNullParameter(existingAnswers, "existingAnswers");
        replaceFragment(RecommendationsReentryQuestionnaireConfirmationFragment.INSTANCE.newInstance((Parcelable) new RecommendationsReentryQuestionnaireConfirmationFragment.Args(existingAnswers)));
    }

    @Override // com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationFragment.Callbacks
    public void onSubmitQuestionnaireForReentry(List<Tuples2<UUID, UUID>> questionsAndAnswers) {
        Intrinsics.checkNotNullParameter(questionsAndAnswers, "questionsAndAnswers");
        generateNewSubmissionId();
        startRiskProfileLandingFlow(questionsAndAnswers, CollectionsKt.emptyList(), true);
    }

    @Override // com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireParentFragment.Callbacks
    public void startRiskProfileLandingFlow(List<Tuples2<UUID, UUID>> questionsAndAnswers, List<? extends Tuples2<? extends View, String>> sharedElements) {
        Intrinsics.checkNotNullParameter(questionsAndAnswers, "questionsAndAnswers");
        startRiskProfileLandingFlow(questionsAndAnswers, sharedElements, false);
    }

    @Override // com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingFragment.Callbacks
    public void startRiskProfile(UUID submissionId, UiRecommendationsRiskProfile riskProfile, final List<? extends Tuples2<? extends View, String>> sharedElements) {
        Intrinsics.checkNotNullParameter(submissionId, "submissionId");
        Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        RecommendationsRiskProfileFragment.Companion companion = RecommendationsRiskProfileFragment.INSTANCE;
        List<? extends Tuples2<? extends View, String>> list = sharedElements;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            arrayList.add(Tuples4.m3642to(Integer.valueOf(((View) tuples2.getFirst()).getId()), tuples2.getSecond()));
        }
        new ReplaceFragmentBuilder((RecommendationsRiskProfileFragment) companion.newInstance((Parcelable) new RecommendationsRiskProfileFragment.Args(submissionId, riskProfile, arrayList))).setModifier(new Function1() { // from class: com.robinhood.android.recommendations.ui.RecommendationsActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsActivity.startRiskProfile$lambda$3(sharedElements, (FragmentTransaction) obj);
            }
        }).buildAndExecute(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startRiskProfile$lambda$3(List list, FragmentTransaction ft) {
        Intrinsics.checkNotNullParameter(ft, "ft");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            ft.addSharedElement((View) tuples2.getFirst(), (String) tuples2.getSecond());
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment.Callbacks
    public void startWalkthroughFlow(UiRecommendationsPortfolio portfolioRecommendation, final List<? extends Tuples2<? extends View, String>> sharedElements, LottieUrl sharedElementLottieUrl) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(portfolioRecommendation, "portfolioRecommendation");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        Intrinsics.checkNotNullParameter(sharedElementLottieUrl, "sharedElementLottieUrl");
        RecommendationsWalkthroughFragment.Companion companion = RecommendationsWalkthroughFragment.INSTANCE;
        List<PortfolioBlocksDrawable.Block> portfolioBlocks = UiRecommendationPortfolios.getPortfolioBlocks(portfolioRecommendation, this);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        new ReplaceFragmentBuilder((RecommendationsWalkthroughFragment) companion.newInstance((Parcelable) new RecommendationsWalkthroughFragment.Args(portfolioRecommendation, portfolioBlocks, UiRecommendationPortfolios.getPages(portfolioRecommendation, resources), sharedElementLottieUrl))).setModifier(new Function1() { // from class: com.robinhood.android.recommendations.ui.RecommendationsActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsActivity.startWalkthroughFlow$lambda$5(sharedElements, (FragmentTransaction) obj);
            }
        }).buildAndExecute(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startWalkthroughFlow$lambda$5(List list, FragmentTransaction ft) {
        Intrinsics.checkNotNullParameter(ft, "ft");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            ft.addSharedElement((View) tuples2.getFirst(), (String) tuples2.getSecond());
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment.Callbacks
    public void onBackFromWalkthrough(UiRecommendationsPortfolio portfolioRecommendation) {
        Intrinsics.checkNotNullParameter(portfolioRecommendation, "portfolioRecommendation");
        RhDialogFragment.Builder id = UiRecommendationPortfolios.createExitAlertDialog(portfolioRecommendation.getSummary(), this).setId(C25978R.id.dialog_id_walkthrough_exit_alert);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, supportFragmentManager, "recommendations-exit-dialog", false, 4, null);
    }

    @Override // com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment.Callbacks
    public void showPortfolioSummary(UiRecommendationsPortfolio portfolioRecommendation, final List<? extends Tuples2<? extends View, String>> sharedElements) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(portfolioRecommendation, "portfolioRecommendation");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        RecommendationsWalkthroughSummaryFragment.Companion companion = RecommendationsWalkthroughSummaryFragment.INSTANCE;
        UiRecommendationsPortfolio.Summary summary = portfolioRecommendation.getSummary();
        List<PortfolioBlocksDrawable.Block> portfolioBlocks = UiRecommendationPortfolios.getPortfolioBlocks(portfolioRecommendation, this);
        List<? extends Tuples2<? extends View, String>> list = sharedElements;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            arrayList.add(Tuples4.m3642to(Integer.valueOf(((View) tuples2.getFirst()).getId()), tuples2.getSecond()));
        }
        new ReplaceFragmentBuilder((RecommendationsWalkthroughSummaryFragment) companion.newInstance((Parcelable) new RecommendationsWalkthroughSummaryFragment.Args(summary, portfolioBlocks, arrayList, portfolioRecommendation.getRecommendationId()))).setModifier(new Function1() { // from class: com.robinhood.android.recommendations.ui.RecommendationsActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsActivity.showPortfolioSummary$lambda$8(sharedElements, (FragmentTransaction) obj);
            }
        }).buildAndExecute(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPortfolioSummary$lambda$8(List list, FragmentTransaction ft) {
        Intrinsics.checkNotNullParameter(ft, "ft");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            ft.addSharedElement((View) tuples2.getFirst(), (String) tuples2.getSecond());
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment.Callbacks
    public void onShowCelebration() {
        replaceFragment(new RecommendationsCelebrationFragment());
    }

    @Override // com.robinhood.android.recommendations.ui.congrats.RecommendationsCelebrationFragment.Callbacks
    public void onExitCelebration() {
        getUserLeapManager().setPendingSurvey(Survey.RECOMMENDATION_AFTER_SUBMISSION);
        finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C25978R.id.dialog_id_walkthrough_exit_alert) {
            logExitOnAlertTap(Screen.Name.RECS_PORTFOLIO_DIVERSIFICATION);
            getUserLeapManager().setPendingSurvey(Survey.RECOMMENDATIONS_EXIT_FLOW);
            finish();
            return true;
        }
        if (id != C25978R.id.dialog_id_walkthrough_summary_exit_alert) {
            return true;
        }
        logExitOnAlertTap(Screen.Name.RECS_PORTFOLIO_SUMMARY);
        getUserLeapManager().setPendingSurvey(Survey.RECOMMENDATIONS_EXIT_FLOW);
        finish();
        return true;
    }

    private final void startRiskProfileLandingFlow(List<Tuples2<UUID, UUID>> questionsAndAnswers, final List<? extends Tuples2<? extends View, String>> sharedElements, boolean skipConfirmationScreen) {
        RecommendationsRiskProfileLandingFragment.Companion companion = RecommendationsRiskProfileLandingFragment.INSTANCE;
        UUID submissionId = this.submissionId;
        Intrinsics.checkNotNullExpressionValue(submissionId, "submissionId");
        new ReplaceFragmentBuilder((RecommendationsRiskProfileLandingFragment) companion.newInstance((Parcelable) new RecommendationsRiskProfileLandingFragment.Args(questionsAndAnswers, submissionId, skipConfirmationScreen))).setName(RISK_LANDING_TRANSACTION_NAME).setModifier(new Function1() { // from class: com.robinhood.android.recommendations.ui.RecommendationsActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsActivity.startRiskProfileLandingFlow$lambda$10(sharedElements, (FragmentTransaction) obj);
            }
        }).buildAndExecute(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startRiskProfileLandingFlow$lambda$10(List list, FragmentTransaction ft) {
        Intrinsics.checkNotNullParameter(ft, "ft");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Tuples2 tuples2 = (Tuples2) it.next();
                ft.addSharedElement((View) tuples2.getFirst(), (String) tuples2.getSecond());
            }
        }
        return Unit.INSTANCE;
    }

    private final void logExitOnAlertTap(Screen.Name screenName) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.EXIT_RECS_FLOW, new Screen(screenName, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
    }

    private final void prefetchLotties() {
        LottieUrl.RECS_LANDING_ORB_DAY.prefetch(this);
        LottieUrl.RECS_LANDING_ORB_NIGHT.prefetch(this);
        LottieUrl.RECS_PROGRESSION_ORB_DAY.prefetch(this);
        LottieUrl.RECS_PROGRESSION_ORB_NIGHT.prefetch(this);
        LottieUrl.RECS_RISK_LOADER_DAY.prefetch(this);
        LottieUrl.RECS_RISK_LOADER_NIGHT.prefetch(this);
        LottieUrl.RECS_RISK_INDICATOR_DAY.prefetch(this);
        LottieUrl.RECS_RISK_INDICATOR_NIGHT.prefetch(this);
        LottieUrl.RECS_RISK_SHEEN.prefetch(this);
        LottieUrl.RECS_PORTFOLIO_ASSETS_DAY.prefetch(this);
        LottieUrl.RECS_PORTFOLIO_ASSETS_NIGHT.prefetch(this);
    }

    /* compiled from: RecommendationsActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/RecommendationsActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/recommendations/contracts/Recommendations;", "<init>", "()V", "RISK_LANDING_TRANSACTION_NAME", "", "EXTRA_SOURCE", "EXTRA_LOGGING_ID", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<RecommendationsIntentKeys> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RecommendationsIntentKeys key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) RecommendationsActivity.class);
            intent.putExtra("source", key.getSource());
            intent.putExtra(RecommendationsActivity.EXTRA_LOGGING_ID, key.getLoggingId());
            return intent;
        }
    }
}
