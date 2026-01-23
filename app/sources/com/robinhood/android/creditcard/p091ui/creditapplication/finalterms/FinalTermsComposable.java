package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import android.content.Context;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.view.compose.BackHandler;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.CreditApplicationGoldBasicExperiment;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsComposable;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsViewState;
import com.robinhood.android.creditcard.p091ui.creditapplication.incentive.bonus.points.BonusPointsTextVariant;
import com.robinhood.android.creditcard.p091ui.creditapplication.incentive.bonus.points.BonusPointsWelcomeScreenComposable;
import com.robinhood.android.creditcard.p091ui.creditapplication.incentive.free.gold.FreeGoldWelcomeScreenComposable7;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.compose.extensions.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FinalTermsComposable.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aµ\u0001\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aM\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u001c\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001aY\u0010'\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+\"\u0014\u0010.\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020-8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010/\"\u0014\u00101\u001a\u00020-8\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010/¨\u0006A²\u0006\u000e\u00102\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00103\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00105\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00106\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00107\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00108\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\n@\nX\u008a\u008e\u0002²\u0006\f\u00109\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010:\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010;\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010=\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\u000e\u0010?\u001a\u0004\u0018\u00010>8\nX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u00020!8\nX\u008a\u0084\u0002"}, m3636d2 = {"", "isGold", "", "annualFeeMicro", "showErrorDialog", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState$Screen;", "secondScreen", "Lcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;", "bonusPointsTextVariant", "isGoldBasicEligible", "Lcom/robinhood/android/creditcard/ui/CreditApplicationGoldBasicExperiment$Variant;", "goldBasicVariant", "showPlanSelectorFromDeeplink", "Lkotlin/Function0;", "", "onCardholderAgreementClick", "onCreditScoreNoticeClick", "onGoldAgreementClick", "onGoldLearnMore", "onContinue", "onDownsellCtaClick", "onBackPressedOnTermsScreen", "FinalTerms", "(ZJZLcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState$Screen;Lcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;ZLcom/robinhood/android/creditcard/ui/CreditApplicationGoldBasicExperiment$Variant;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "shouldShowGoldBasicDownsellCta", "onAnimateOut", "shouldShowPlanSelector", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/SelectedPlan;", "selectedPlan", "FinalTermsAgreeButton", "(Lcom/robinhood/analytics/EventLogger;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLcom/robinhood/android/creditcard/ui/creditapplication/finalterms/SelectedPlan;Landroidx/compose/runtime/Composer;I)V", "", "bottomBarFadeState", "", "screen", "onScreenTransition", "agreeButton", "FinalTermsBottomButton", "(FILcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState$Screen;Lcom/robinhood/analytics/EventLogger;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/animation/core/CubicBezierEasing;", "SLIDE_CURVE", "Landroidx/compose/animation/core/CubicBezierEasing;", "FADE_CURVE", "", "LOTTIE", "Ljava/lang/String;", "FINAL_TERMS_TERMS_TEST_TAG", "FINAL_TERMS_REWARDS_TEST_TAG", "frameStart", "frameEnd", "animateOut", "transitionScreens", "lottieHeight", "rewardsScreenHeight", "termsScreenHeight", "slideState", "rewardsScreenState", "lottieFadeState", "termsScreenState", "contentFadeState", "Lcom/airbnb/lottie/LottieComposition;", "composition", "progress", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class FinalTermsComposable {
    public static final String FINAL_TERMS_REWARDS_TEST_TAG = "final-terms-rewards-test-tag";
    public static final String FINAL_TERMS_TERMS_TEST_TAG = "final-terms-terms-test-tag";
    private static final String LOTTIE = "card-reveal";
    private static final CubicBezierEasing SLIDE_CURVE = new CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);
    private static final CubicBezierEasing FADE_CURVE = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinalTerms$lambda$52(boolean z, long j, boolean z2, FinalTermsViewState.Screen screen, BonusPointsTextVariant bonusPointsTextVariant, boolean z3, CreditApplicationGoldBasicExperiment.Variant variant, boolean z4, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, int i, int i2, Composer composer, int i3) {
        FinalTerms(z, j, z2, screen, bonusPointsTextVariant, z3, variant, z4, function0, function02, function03, function04, function05, function06, function07, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinalTermsAgreeButton$lambda$57(EventLogger eventLogger, boolean z, Function0 function0, Function0 function02, boolean z2, SelectedPlan selectedPlan, int i, Composer composer, int i2) {
        FinalTermsAgreeButton(eventLogger, z, function0, function02, z2, selectedPlan, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinalTermsBottomButton$lambda$61(float f, int i, FinalTermsViewState.Screen screen, EventLogger eventLogger, Function0 function0, Function0 function02, Function2 function2, int i2, Composer composer, int i3) {
        FinalTermsBottomButton(f, i, screen, eventLogger, function0, function02, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ float access$FinalTerms$lambda$47(LottieAnimationState lottieAnimationState) {
        return FinalTerms$lambda$47(lottieAnimationState);
    }

    /* compiled from: FinalTermsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4 */
    static final class C123394 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $animateOut$delegate;
        final /* synthetic */ long $annualFeeMicro;
        final /* synthetic */ BonusPointsTextVariant $bonusPointsTextVariant;
        final /* synthetic */ SnapshotState4<Float> $bottomBarFadeState$delegate;
        final /* synthetic */ LottieCompositionResult $composition$delegate;
        final /* synthetic */ SnapshotState4<Float> $contentFadeState$delegate;
        final /* synthetic */ float $density;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ boolean $isGold;
        final /* synthetic */ SnapshotState4<Float> $lottieFadeState$delegate;
        final /* synthetic */ SnapshotIntState2 $lottieHeight$delegate;
        final /* synthetic */ double $maxContentHeight;
        final /* synthetic */ Function0<Unit> $onCardholderAgreementClick;
        final /* synthetic */ Function0<Unit> $onContinue;
        final /* synthetic */ Function0<Unit> $onCreditScoreNoticeClick;
        final /* synthetic */ Function0<Unit> $onDownsellCtaClick;
        final /* synthetic */ Function0<Unit> $onGoldAgreementClick;
        final /* synthetic */ Function0<Unit> $onGoldLearnMore;
        final /* synthetic */ LottieAnimationState $progress$delegate;
        final /* synthetic */ SnapshotIntState2 $rewardsScreenHeight$delegate;
        final /* synthetic */ SnapshotState4<Float> $rewardsScreenState$delegate;
        final /* synthetic */ SnapshotIntState2 $screen$delegate;
        final /* synthetic */ int $screenHeight;
        final /* synthetic */ FinalTermsViewState.Screen $secondScreen;
        final /* synthetic */ SnapshotState<SelectedPlan> $selectedPlan$delegate;
        final /* synthetic */ boolean $shouldShowGoldBasicDownsellCta;
        final /* synthetic */ boolean $shouldShowPlanSelector;
        final /* synthetic */ boolean $showErrorDialog;
        final /* synthetic */ SnapshotState4<Float> $slideState$delegate;
        final /* synthetic */ SnapshotIntState2 $termsScreenHeight$delegate;
        final /* synthetic */ SnapshotState4<Float> $termsScreenState$delegate;
        final /* synthetic */ SnapshotState<Boolean> $transitionScreens$delegate;

        C123394(SnapshotState4<Float> snapshotState4, SnapshotState4<Float> snapshotState42, SnapshotState4<Float> snapshotState43, LottieAnimationState lottieAnimationState, SnapshotIntState2 snapshotIntState2, LottieCompositionResult lottieCompositionResult, SnapshotIntState2 snapshotIntState22, SnapshotState4<Float> snapshotState44, SnapshotIntState2 snapshotIntState23, SnapshotState4<Float> snapshotState45, boolean z, EventLogger eventLogger, Function0<Unit> function0, SnapshotIntState2 snapshotIntState24, SnapshotState<Boolean> snapshotState, double d, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, FinalTermsViewState.Screen screen, SnapshotState4<Float> snapshotState46, boolean z2, Function0<Unit> function05, SnapshotState<Boolean> snapshotState2, boolean z3, SnapshotState<SelectedPlan> snapshotState3, long j, boolean z4, Function0<Unit> function06, int i, float f, BonusPointsTextVariant bonusPointsTextVariant) {
            this.$slideState$delegate = snapshotState4;
            this.$lottieFadeState$delegate = snapshotState42;
            this.$contentFadeState$delegate = snapshotState43;
            this.$progress$delegate = lottieAnimationState;
            this.$lottieHeight$delegate = snapshotIntState2;
            this.$composition$delegate = lottieCompositionResult;
            this.$rewardsScreenHeight$delegate = snapshotIntState22;
            this.$rewardsScreenState$delegate = snapshotState44;
            this.$termsScreenHeight$delegate = snapshotIntState23;
            this.$termsScreenState$delegate = snapshotState45;
            this.$showErrorDialog = z;
            this.$eventLogger = eventLogger;
            this.$onContinue = function0;
            this.$screen$delegate = snapshotIntState24;
            this.$transitionScreens$delegate = snapshotState;
            this.$maxContentHeight = d;
            this.$onCardholderAgreementClick = function02;
            this.$onCreditScoreNoticeClick = function03;
            this.$onGoldAgreementClick = function04;
            this.$secondScreen = screen;
            this.$bottomBarFadeState$delegate = snapshotState46;
            this.$shouldShowGoldBasicDownsellCta = z2;
            this.$onDownsellCtaClick = function05;
            this.$animateOut$delegate = snapshotState2;
            this.$shouldShowPlanSelector = z3;
            this.$selectedPlan$delegate = snapshotState3;
            this.$annualFeeMicro = j;
            this.$isGold = z4;
            this.$onGoldLearnMore = function06;
            this.$screenHeight = i;
            this.$density = f;
            this.$bonusPointsTextVariant = bonusPointsTextVariant;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            boolean z;
            Function0<Unit> function0;
            SnapshotState<Boolean> snapshotState;
            boolean z2;
            EventLogger eventLogger;
            final SnapshotState<SelectedPlan> snapshotState2;
            SnapshotState<Boolean> snapshotState3;
            BoxScopeInstance boxScopeInstance;
            FinalTermsViewState.Screen screen;
            FinalTermsViewState.Screen screen2;
            int i3;
            final EventLogger eventLogger2;
            final Function0<Unit> function02;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526044509, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTerms.<anonymous> (FinalTermsComposable.kt:220)");
            }
            final SnapshotState4<Float> snapshotState4 = this.$slideState$delegate;
            final SnapshotState4<Float> snapshotState42 = this.$lottieFadeState$delegate;
            final SnapshotState4<Float> snapshotState43 = this.$contentFadeState$delegate;
            final LottieAnimationState lottieAnimationState = this.$progress$delegate;
            final SnapshotIntState2 snapshotIntState2 = this.$lottieHeight$delegate;
            LottieCompositionResult lottieCompositionResult = this.$composition$delegate;
            final SnapshotIntState2 snapshotIntState22 = this.$rewardsScreenHeight$delegate;
            final SnapshotState4<Float> snapshotState44 = this.$rewardsScreenState$delegate;
            final SnapshotIntState2 snapshotIntState23 = this.$termsScreenHeight$delegate;
            final SnapshotState4<Float> snapshotState45 = this.$termsScreenState$delegate;
            boolean z3 = this.$showErrorDialog;
            EventLogger eventLogger3 = this.$eventLogger;
            Function0<Unit> function03 = this.$onContinue;
            SnapshotIntState2 snapshotIntState24 = this.$screen$delegate;
            final SnapshotState<Boolean> snapshotState5 = this.$transitionScreens$delegate;
            double d = this.$maxContentHeight;
            Function0<Unit> function04 = this.$onCardholderAgreementClick;
            Function0<Unit> function05 = this.$onCreditScoreNoticeClick;
            Function0<Unit> function06 = this.$onGoldAgreementClick;
            FinalTermsViewState.Screen screen3 = this.$secondScreen;
            SnapshotState4<Float> snapshotState46 = this.$bottomBarFadeState$delegate;
            boolean z4 = this.$shouldShowGoldBasicDownsellCta;
            Function0<Unit> function07 = this.$onDownsellCtaClick;
            SnapshotState<Boolean> snapshotState6 = this.$animateOut$delegate;
            boolean z5 = this.$shouldShowPlanSelector;
            SnapshotState<SelectedPlan> snapshotState7 = this.$selectedPlan$delegate;
            long j = this.$annualFeeMicro;
            boolean z6 = this.$isGold;
            Function0<Unit> function08 = this.$onGoldLearnMore;
            int i4 = this.$screenHeight;
            float f = this.$density;
            BonusPointsTextVariant bonusPointsTextVariant = this.$bonusPointsTextVariant;
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(snapshotState4) | composer.changed(snapshotState42);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FinalTermsComposable.C123394.invoke$lambda$31$lambda$1$lambda$0(snapshotState4, snapshotState42, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(companion, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierGraphicsLayer);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            LottieComposition lottieCompositionFinalTerms$lambda$46 = FinalTermsComposable.FinalTerms$lambda$46(lottieCompositionResult);
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(lottieAnimationState);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(FinalTermsComposable.access$FinalTerms$lambda$47(lottieAnimationState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function09 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged3 = composer.changed(snapshotIntState2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FinalTermsComposable.C123394.invoke$lambda$31$lambda$6$lambda$5$lambda$4(snapshotIntState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            final SnapshotIntState2 snapshotIntState25 = snapshotIntState24;
            LottieAnimation2.LottieAnimation(lottieCompositionFinalTerms$lambda$46, function09, Scale2.scale(OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue3), 0.82f), false, false, false, null, false, null, null, ContentScale.INSTANCE.getCrop(), false, false, null, null, false, composer, 0, 6, 64504);
            Composer composer2 = composer;
            composer2.endNode();
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues), 0.0f, composer2, 0, 1);
            composer2.startReplaceGroup(5004770);
            boolean zChanged4 = composer2.changed(snapshotState43);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FinalTermsComposable.C123394.invoke$lambda$31$lambda$8$lambda$7(snapshotState43, (GraphicsLayerScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceGroup();
            Modifier modifierGraphicsLayer2 = GraphicsLayerModifier6.graphicsLayer(modifierM21623defaultHorizontalPaddingrAjV9yQ, (Function1) objRememberedValue4);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierGraphicsLayer2);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            composer2.startReplaceGroup(-877955233);
            if (FinalTermsComposable.FinalTerms$lambda$14(snapshotIntState25) == 1 || FinalTermsComposable.FinalTerms$lambda$18(snapshotState5)) {
                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                Modifier modifierAlign = boxScopeInstance2.align(companion, companion2.getBottomCenter());
                composer2.startReplaceGroup(5004770);
                boolean zChanged5 = composer2.changed(snapshotIntState22);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FinalTermsComposable.C123394.invoke$lambda$31$lambda$30$lambda$10$lambda$9(snapshotIntState22, (LayoutCoordinates) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierAlign, (Function1) objRememberedValue5);
                composer2.startReplaceGroup(5004770);
                boolean zChanged6 = composer2.changed(snapshotState44);
                Object objRememberedValue6 = composer2.rememberedValue();
                if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FinalTermsComposable.C123394.invoke$lambda$31$lambda$30$lambda$12$lambda$11(snapshotState44, (GraphicsLayerScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue6);
                }
                composer2.endReplaceGroup();
                Modifier modifierGraphicsLayer3 = GraphicsLayerModifier6.graphicsLayer(modifierOnGloballyPositioned, (Function1) objRememberedValue6);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(bottom, companion2.getStart(), composer2, 6);
                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierGraphicsLayer3);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                RewardsComposableKt.Rewards(d, function04, function05, function06, TestTag3.testTag(companion, FinalTermsComposable.FINAL_TERMS_REWARDS_TEST_TAG), composer, 24576, 0);
                composer2 = composer;
                float fFinalTerms$lambda$45 = FinalTermsComposable.FinalTerms$lambda$45(snapshotState46);
                int iFinalTerms$lambda$14 = FinalTermsComposable.FinalTerms$lambda$14(snapshotIntState25);
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged7 = composer2.changed(snapshotIntState25) | composer2.changed(snapshotState5);
                Object objRememberedValue7 = composer2.rememberedValue();
                if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinalTermsComposable.C123394.invoke$lambda$31$lambda$30$lambda$15$lambda$14$lambda$13(snapshotIntState25, snapshotState5);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceGroup();
                z = z4;
                function0 = function07;
                snapshotState = snapshotState6;
                z2 = z5;
                eventLogger = eventLogger3;
                snapshotState2 = snapshotState7;
                snapshotIntState25 = snapshotIntState25;
                snapshotState3 = snapshotState5;
                boxScopeInstance = boxScopeInstance2;
                FinalTermsComposable.FinalTermsBottomButton(fFinalTerms$lambda$45, iFinalTerms$lambda$14, screen3, eventLogger, function03, (Function0) objRememberedValue7, ComposableLambda3.rememberComposableLambda(1686362328, true, new FinalTermsComposable4(eventLogger, z, function0, snapshotState, z2, snapshotState7), composer2, 54), composer2, 1572864);
                screen = screen3;
                composer2.endNode();
            } else {
                screen = screen3;
                z = z4;
                function0 = function07;
                snapshotState = snapshotState6;
                z2 = z5;
                snapshotState2 = snapshotState7;
                snapshotState3 = snapshotState5;
                eventLogger = eventLogger3;
                boxScopeInstance = boxScopeInstance2;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-877884005);
            if (FinalTermsComposable.FinalTerms$lambda$14(snapshotIntState25) == 2 || FinalTermsComposable.FinalTerms$lambda$18(snapshotState3)) {
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical bottom2 = arrangement.getBottom();
                Modifier modifierAlign2 = boxScopeInstance.align(companion, companion2.getBottomCenter());
                composer2.startReplaceGroup(5004770);
                boolean zChanged8 = composer2.changed(snapshotIntState23);
                Object objRememberedValue8 = composer2.rememberedValue();
                if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FinalTermsComposable.C123394.invoke$lambda$31$lambda$30$lambda$17$lambda$16(snapshotIntState23, (LayoutCoordinates) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue8);
                }
                composer2.endReplaceGroup();
                Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierAlign2, (Function1) objRememberedValue8);
                composer2.startReplaceGroup(5004770);
                boolean zChanged9 = composer2.changed(snapshotState45);
                Object objRememberedValue9 = composer2.rememberedValue();
                if (zChanged9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FinalTermsComposable.C123394.invoke$lambda$31$lambda$30$lambda$19$lambda$18(snapshotState45, (GraphicsLayerScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                composer2.endReplaceGroup();
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(GraphicsLayerModifier6.graphicsLayer(modifierOnGloballyPositioned2, (Function1) objRememberedValue9), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(bottom2, companion2.getStart(), composer2, 6);
                int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (screen == FinalTermsViewState.Screen.TERMS) {
                    composer2.startReplaceGroup(-120359469);
                    if (z2) {
                        composer2.startReplaceGroup(-120317805);
                        Modifier modifierTestTag = TestTag3.testTag(companion, FinalTermsComposable.FINAL_TERMS_TERMS_TEST_TAG);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getBottom(), companion2.getCenterHorizontally(), composer2, 54);
                        int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer2, modifierTestTag);
                        Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor6);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
                        SelectedPlan selectedPlanFinalTerms$lambda$34 = FinalTermsComposable.FinalTerms$lambda$34(snapshotState2);
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged10 = composer2.changed(snapshotState2);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChanged10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return FinalTermsComposable.C123394.m1876x3c798d09(snapshotState2, (SelectedPlan) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        composer2.endReplaceGroup();
                        PlanSelectorComposableKt.PlanSelectorComposable(d, j, selectedPlanFinalTerms$lambda$34, (Function1) objRememberedValue10, composer, 0);
                        composer2 = composer;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                        TermsComposableKt.LearnMore(function08, composer2, 0);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                        TermsComposableKt.RewardsDisclaimer(composer2, 0);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        screen2 = screen;
                    } else {
                        composer2.startReplaceGroup(-119125514);
                        screen2 = screen;
                        TermsComposableKt.Terms(d, j, z6, function08, TestTag3.testTag(companion, FinalTermsComposable.FINAL_TERMS_TERMS_TEST_TAG), composer2, 24576, 0);
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                } else {
                    screen2 = screen;
                    if (screen2 == FinalTermsViewState.Screen.FREE_GOLD) {
                        composer2.startReplaceGroup(-118474142);
                        FreeGoldWelcomeScreenComposable7.FreeGoldWelcomeScreenComposable(i4 / f, j, function08, null, composer, 0, 8);
                        composer2 = composer;
                        Spacer2.Spacer(Column5.weight$default(column62, companion, 1.0f, false, 2, null), composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (screen2 != FinalTermsViewState.Screen.BONUS_POINTS || bonusPointsTextVariant == null) {
                        composer2.startReplaceGroup(-117234700);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-117823638);
                        BonusPointsWelcomeScreenComposable.BonusPointsWelcomeScreenComposable(i4 / f, bonusPointsTextVariant, j, function08, null, composer2, 0, 16);
                        Spacer2.Spacer(Column5.weight$default(column62, companion, 1.0f, false, 2, null), composer2, 0);
                        composer2.endReplaceGroup();
                    }
                }
                float fFinalTerms$lambda$452 = FinalTermsComposable.FinalTerms$lambda$45(snapshotState46);
                int iFinalTerms$lambda$142 = FinalTermsComposable.FinalTerms$lambda$14(snapshotIntState25);
                i3 = -1633490746;
                composer2.startReplaceGroup(-1633490746);
                final SnapshotIntState2 snapshotIntState26 = snapshotIntState25;
                final SnapshotState<Boolean> snapshotState8 = snapshotState3;
                boolean zChanged11 = composer2.changed(snapshotIntState26) | composer2.changed(snapshotState8);
                Object objRememberedValue11 = composer2.rememberedValue();
                if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue11 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinalTermsComposable.C123394.invoke$lambda$31$lambda$30$lambda$25$lambda$24$lambda$23(snapshotIntState26, snapshotState8);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue11);
                }
                composer2.endReplaceGroup();
                eventLogger2 = eventLogger;
                function02 = function03;
                FinalTermsComposable.FinalTermsBottomButton(fFinalTerms$lambda$452, iFinalTerms$lambda$142, screen2, eventLogger2, function02, (Function0) objRememberedValue11, ComposableLambda3.rememberComposableLambda(-283534449, true, new FinalTermsComposable5(eventLogger, z, function0, snapshotState, z2, snapshotState2), composer2, 54), composer2, 1572864);
                composer2.endNode();
            } else {
                eventLogger2 = eventLogger;
                function02 = function03;
                i3 = -1633490746;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-877727168);
            if (z3) {
                String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_unexpected_error_title, composer2, 0);
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C12201R.string.credit_app_unexpected_error_subtitle, composer2, 0));
                String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_retry, composer2, 0);
                composer2.startReplaceGroup(i3);
                boolean zChangedInstance = composer2.changedInstance(eventLogger2) | composer2.changed(function02);
                Object objRememberedValue12 = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinalTermsComposable.C123394.invoke$lambda$31$lambda$30$lambda$27$lambda$26(eventLogger2, function02);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue12);
                }
                composer2.endReplaceGroup();
                BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue12);
                composer2.startReplaceGroup(1849434622);
                Object objRememberedValue13 = composer2.rememberedValue();
                if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue13 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue13);
                }
                composer2.endReplaceGroup();
                BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue13, composer, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$31$lambda$1$lambda$0(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setTranslationY(FinalTermsComposable.FinalTerms$lambda$36(snapshotState4));
            graphicsLayer.setAlpha(FinalTermsComposable.FinalTerms$lambda$38(snapshotState42));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$31$lambda$6$lambda$5$lambda$4(SnapshotIntState2 snapshotIntState2, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FinalTermsComposable.FinalTerms$lambda$23(snapshotIntState2, (int) (it.mo7241getSizeYbymL2g() & 4294967295L));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$31$lambda$8$lambda$7(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(FinalTermsComposable.FinalTerms$lambda$44(snapshotState4));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$31$lambda$30$lambda$10$lambda$9(SnapshotIntState2 snapshotIntState2, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FinalTermsComposable.FinalTerms$lambda$27(snapshotIntState2, (int) (it.mo7241getSizeYbymL2g() & 4294967295L));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$31$lambda$30$lambda$12$lambda$11(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(FinalTermsComposable.FinalTerms$lambda$37(snapshotState4));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$31$lambda$30$lambda$15$lambda$14$lambda$13(SnapshotIntState2 snapshotIntState2, SnapshotState snapshotState) {
            FinalTermsComposable.FinalTerms$lambda$15(snapshotIntState2, 2);
            FinalTermsComposable.FinalTerms$lambda$19(snapshotState, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$31$lambda$30$lambda$17$lambda$16(SnapshotIntState2 snapshotIntState2, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FinalTermsComposable.FinalTerms$lambda$31(snapshotIntState2, (int) (it.mo7241getSizeYbymL2g() & 4294967295L));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$31$lambda$30$lambda$19$lambda$18(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(FinalTermsComposable.FinalTerms$lambda$41(snapshotState4));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda$31$lambda$30$lambda$25$lambda$22$lambda$21$lambda$20 */
        public static final Unit m1876x3c798d09(SnapshotState snapshotState, SelectedPlan it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FinalTermsComposable.FinalTerms$lambda$35(snapshotState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$31$lambda$30$lambda$25$lambda$24$lambda$23(SnapshotIntState2 snapshotIntState2, SnapshotState snapshotState) {
            FinalTermsComposable.FinalTerms$lambda$15(snapshotIntState2, 2);
            FinalTermsComposable.FinalTerms$lambda$19(snapshotState, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$31$lambda$30$lambda$27$lambda$26(EventLogger eventLogger, Function0 function0) {
            loggingUtils.logDismiss(eventLogger, new Component(Component.ComponentType.ALERT, null, null, 6, null));
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FinalTerms$lambda$14(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    public static final void FinalTerms(final boolean z, final long j, final boolean z2, final FinalTermsViewState.Screen secondScreen, final BonusPointsTextVariant bonusPointsTextVariant, final boolean z3, final CreditApplicationGoldBasicExperiment.Variant variant, final boolean z4, final Function0<Unit> onCardholderAgreementClick, final Function0<Unit> onCreditScoreNoticeClick, final Function0<Unit> onGoldAgreementClick, final Function0<Unit> onGoldLearnMore, final Function0<Unit> onContinue, final Function0<Unit> onDownsellCtaClick, final Function0<Unit> onBackPressedOnTermsScreen, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function0<Unit> function0;
        float f;
        float f2;
        int i5;
        double d;
        TweenSpec tweenSpecTween;
        Composer composer2;
        Intrinsics.checkNotNullParameter(secondScreen, "secondScreen");
        Intrinsics.checkNotNullParameter(onCardholderAgreementClick, "onCardholderAgreementClick");
        Intrinsics.checkNotNullParameter(onCreditScoreNoticeClick, "onCreditScoreNoticeClick");
        Intrinsics.checkNotNullParameter(onGoldAgreementClick, "onGoldAgreementClick");
        Intrinsics.checkNotNullParameter(onGoldLearnMore, "onGoldLearnMore");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onDownsellCtaClick, "onDownsellCtaClick");
        Intrinsics.checkNotNullParameter(onBackPressedOnTermsScreen, "onBackPressedOnTermsScreen");
        Composer composerStartRestartGroup = composer.startRestartGroup(1539773167);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(secondScreen.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(bonusPointsTextVariant == null ? -1 : bonusPointsTextVariant.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(variant == null ? -1 : variant.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCardholderAgreementClick) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCreditScoreNoticeClick) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onGoldAgreementClick) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onGoldLearnMore) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function0 = onContinue;
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        } else {
            function0 = onContinue;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onDownsellCtaClick) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBackPressedOnTermsScreen) ? 16384 : 8192;
        }
        int i7 = i4;
        if ((i6 & 306783379) == 306783378 && (i7 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1539773167, i6, i7, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTerms (FinalTermsComposable.kt:82)");
            }
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int i8 = context.getResources().getDisplayMetrics().heightPixels;
            float f3 = context.getResources().getDisplayMetrics().density;
            boolean z5 = z3 && variant == CreditApplicationGoldBasicExperiment.Variant.DOWNSELL_CTA;
            boolean z6 = z3 && z4;
            boolean z7 = z5;
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable.FinalTerms$lambda$1$lambda$0();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable.FinalTerms$lambda$5$lambda$4();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable.FinalTerms$lambda$9$lambda$8();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
            Object[] objArr4 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable.FinalTerms$lambda$13$lambda$12();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotIntState2 snapshotIntState23 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) objRememberedValue4, composerStartRestartGroup, 3072, 6);
            Object[] objArr5 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable.FinalTerms$lambda$17$lambda$16();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) objRememberedValue5, composerStartRestartGroup, 3072, 6);
            Object[] objArr6 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable.FinalTerms$lambda$21$lambda$20();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotIntState2 snapshotIntState24 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr6, (Saver) null, (String) null, (Function0) objRememberedValue6, composerStartRestartGroup, 3072, 6);
            Object[] objArr7 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable.FinalTerms$lambda$25$lambda$24();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotIntState2 snapshotIntState25 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr7, (Saver) null, (String) null, (Function0) objRememberedValue7, composerStartRestartGroup, 3072, 6);
            Object[] objArr8 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable.FinalTerms$lambda$29$lambda$28();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotIntState2 snapshotIntState26 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr8, (Saver) null, (String) null, (Function0) objRememberedValue8, composerStartRestartGroup, 3072, 6);
            Object[] objArr9 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable.FinalTerms$lambda$33$lambda$32();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr9, (Saver) null, (String) null, (Function0) objRememberedValue9, composerStartRestartGroup, 3072, 6);
            int intValue = snapshotIntState23.getIntValue() == 2 ? snapshotIntState26.getIntValue() : snapshotIntState25.getIntValue();
            double intValue2 = (i8 - (snapshotIntState24.getIntValue() / 2.5d)) / f3;
            if (FinalTerms$lambda$10(snapshotState)) {
                f = f3;
                f2 = 0.0f;
            } else {
                f = f3;
                f2 = -(((i8 / 2.0f) - (i8 - intValue)) + ((snapshotIntState24.getIntValue() * 0.7f) / 2.0f));
            }
            if (FinalTerms$lambda$18(snapshotState2)) {
                i5 = i8;
                d = intValue2;
                tweenSpecTween = AnimationSpecKt.tween(600, 0, SLIDE_CURVE);
            } else {
                i5 = i8;
                d = intValue2;
                tweenSpecTween = AnimationSpecKt.tween(FinalTerms$lambda$10(snapshotState) ? 1000 : 1200, FinalTerms$lambda$10(snapshotState) ? 400 : 1400, SLIDE_CURVE);
            }
            SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(f2, tweenSpecTween, 0.0f, "", null, composerStartRestartGroup, 3072, 20);
            float f4 = snapshotIntState23.getIntValue() == 1 ? 1.0f : 0.0f;
            CubicBezierEasing cubicBezierEasing = FADE_CURVE;
            SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(f4, AnimationSpecKt.tween(300, 0, cubicBezierEasing), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
            SnapshotState4<Float> snapshotState4AnimateFloatAsState3 = AnimateAsState.animateFloatAsState((snapshotIntState23.getIntValue() == 2 && (secondScreen == FinalTermsViewState.Screen.FREE_GOLD || secondScreen == FinalTermsViewState.Screen.BONUS_POINTS)) ? 0.0f : 1.0f, AnimationSpecKt.tween(300, 0, cubicBezierEasing), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
            float f5 = snapshotIntState23.getIntValue() == 2 ? 1.0f : 0.0f;
            TweenSpec tweenSpecTween2 = AnimationSpecKt.tween(300, 300, cubicBezierEasing);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState2);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FinalTermsComposable.FinalTerms$lambda$40$lambda$39(snapshotState2, ((Float) obj).floatValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4<Float> snapshotState4AnimateFloatAsState4 = AnimateAsState.animateFloatAsState(f5, tweenSpecTween2, 0.0f, "", (Function1) objRememberedValue10, composerStartRestartGroup, 3120, 4);
            float f6 = !FinalTerms$lambda$10(snapshotState) ? 1.0f : 0.0f;
            TweenSpec tweenSpecTween3 = AnimationSpecKt.tween(600, FinalTerms$lambda$10(snapshotState) ? 0 : 2300, cubicBezierEasing);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotIntState2) | composerStartRestartGroup.changed(snapshotIntState22);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FinalTermsComposable.FinalTerms$lambda$43$lambda$42(snapshotState, snapshotIntState2, snapshotIntState22, ((Float) obj).floatValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4<Float> snapshotState4AnimateFloatAsState5 = AnimateAsState.animateFloatAsState(f6, tweenSpecTween3, 0.0f, "", (Function1) objRememberedValue11, composerStartRestartGroup, 3072, 4);
            SnapshotState4<Float> snapshotState4AnimateFloatAsState6 = AnimateAsState.animateFloatAsState(!FinalTerms$lambda$10(snapshotState) ? 1.0f : 0.0f, AnimationSpecKt.tween(600, FinalTerms$lambda$10(snapshotState) ? 0 : 2500, cubicBezierEasing), 0.0f, "", null, composerStartRestartGroup, 3072, 20);
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Asset.m9150boximpl(LottieCompositionSpec.Asset.m9151constructorimpl(LOTTIE)), null, null, null, null, null, composerStartRestartGroup, 6, 62);
            LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(FinalTerms$lambda$46(lottieCompositionResultRememberLottieComposition), false, false, false, new LottieClipSpec.Frame(Integer.valueOf(snapshotIntState2.getIntValue()), Integer.valueOf(snapshotIntState22.getIntValue()), false, 4, null), z2 ? -1.0f : 1.0f, 1, null, false, false, composerStartRestartGroup, (LottieClipSpec.Frame.$stable << 12) | 1572864, 910);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged3 = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = new FinalTermsComposable2(snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composerStartRestartGroup, 6);
            Float fValueOf = Float.valueOf(FinalTerms$lambda$47(lottieAnimationStateAnimateLottieCompositionAsState));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged4 = ((i7 & 896) == 256) | composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue13 == companion.getEmpty()) {
                objRememberedValue13 = new FinalTermsComposable3(function0, lottieAnimationStateAnimateLottieCompositionAsState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composerStartRestartGroup, 0);
            boolean z8 = snapshotIntState23.getIntValue() == 2 && z7;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z9 = (i7 & 57344) == 16384;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable.FinalTerms$lambda$51$lambda$50(onBackPressedOnTermsScreen);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandler.BackHandler(z8, (Function0) objRememberedValue14, composerStartRestartGroup, 0, 0);
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_ACCOUNT_TERMS, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, true, true, ComposableLambda3.rememberComposableLambda(-526044509, true, new C123394(snapshotState4AnimateFloatAsState, snapshotState4AnimateFloatAsState3, snapshotState4AnimateFloatAsState5, lottieAnimationStateAnimateLottieCompositionAsState, snapshotIntState24, lottieCompositionResultRememberLottieComposition, snapshotIntState25, snapshotState4AnimateFloatAsState2, snapshotIntState26, snapshotState4AnimateFloatAsState4, z2, current, function0, snapshotIntState23, snapshotState2, d, onCardholderAgreementClick, onCreditScoreNoticeClick, onGoldAgreementClick, secondScreen, snapshotState4AnimateFloatAsState6, z7, onDownsellCtaClick, snapshotState, z6, snapshotState3, j, z, onGoldLearnMore, i5, f, bonusPointsTextVariant), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 438, 1022);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinalTermsComposable.FinalTerms$lambda$52(z, j, z2, secondScreen, bonusPointsTextVariant, z3, variant, z4, onCardholderAgreementClick, onCreditScoreNoticeClick, onGoldAgreementClick, onGoldLearnMore, onContinue, onDownsellCtaClick, onBackPressedOnTermsScreen, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean FinalTerms$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FinalTerms$lambda$18(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectedPlan FinalTerms$lambda$34(SnapshotState<SelectedPlan> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FinalTerms$lambda$36(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FinalTerms$lambda$37(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FinalTerms$lambda$38(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FinalTerms$lambda$41(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FinalTerms$lambda$44(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FinalTerms$lambda$45(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieComposition FinalTerms$lambda$46(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FinalTerms$lambda$47(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 FinalTerms$lambda$1$lambda$0() {
        return SnapshotIntState3.mutableIntStateOf(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 FinalTerms$lambda$5$lambda$4() {
        return SnapshotIntState3.mutableIntStateOf(61);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinalTerms$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState FinalTerms$lambda$9$lambda$8() {
        return SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 FinalTerms$lambda$13$lambda$12() {
        return SnapshotIntState3.mutableIntStateOf(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState FinalTerms$lambda$17$lambda$16() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinalTerms$lambda$19(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 FinalTerms$lambda$21$lambda$20() {
        return SnapshotIntState3.mutableIntStateOf(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 FinalTerms$lambda$25$lambda$24() {
        return SnapshotIntState3.mutableIntStateOf(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 FinalTerms$lambda$29$lambda$28() {
        return SnapshotIntState3.mutableIntStateOf(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState FinalTerms$lambda$33$lambda$32() {
        return SnapshotState3.mutableStateOf$default(SelectedPlan.BASIC_1P5_PERCENT, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinalTerms$lambda$15(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinalTerms$lambda$23(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinalTerms$lambda$27(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinalTerms$lambda$31(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinalTerms$lambda$35(SnapshotState<SelectedPlan> snapshotState, SelectedPlan selectedPlan) {
        snapshotState.setValue(selectedPlan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinalTerms$lambda$40$lambda$39(SnapshotState snapshotState, float f) {
        FinalTerms$lambda$19(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinalTerms$lambda$43$lambda$42(SnapshotState snapshotState, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, float f) {
        if (FinalTerms$lambda$10(snapshotState)) {
            snapshotIntState2.setIntValue(61);
            snapshotIntState22.setIntValue(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
        } else {
            snapshotIntState2.setIntValue(60);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinalTerms$lambda$51$lambda$50(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinalTermsAgreeButton(final EventLogger eventLogger, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, final boolean z2, final SelectedPlan selectedPlan, Composer composer, final int i) {
        int i2;
        Function0<Unit> function03;
        int i3;
        Object obj;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-836393372);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(eventLogger) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function03 = function02;
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
        } else {
            function03 = function02;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(selectedPlan == null ? -1 : selectedPlan.ordinal()) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-836393372, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsAgreeButton (FinalTermsComposable.kt:401)");
            }
            boolean z3 = (z2 && selectedPlan == null) ? false : true;
            if (z2) {
                i3 = C11048R.string.general_label_continue;
            } else {
                i3 = C11048R.string.general_action_agree;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(i3, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(eventLogger) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final Function0<Unit> function04 = function03;
                obj = null;
                Function0 function05 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable.FinalTermsAgreeButton$lambda$56$lambda$54$lambda$53(eventLogger, z2, selectedPlan, function0, function04);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function05);
                objRememberedValue = function05;
            } else {
                obj = null;
            }
            composerStartRestartGroup.endReplaceGroup();
            Object obj2 = obj;
            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, false, null, z3, null, null, false, null, false, composerStartRestartGroup, 0, 0, 64319);
            composerStartRestartGroup.startReplaceGroup(-2092700961);
            if (z) {
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj2);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Modifier modifierM26603pressableiJQMabo$default = ModifiersKt.m26603pressableiJQMabo$default(modifierFillMaxWidth$default2, bentoTheme.getColors(composerStartRestartGroup, i4).getCcGoldFg(), 0.0f, null, function0, 6, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion2.getTop(), composerStartRestartGroup, 6);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM26603pressableiJQMabo$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                long ccGoldFg = bentoTheme.getColors(composerStartRestartGroup, i4).getCcGoldFg();
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                BentoText2.m20747BentoText38GnDrw("Prefer not to subscribe?", null, Color.m6701boximpl(ccGoldFg), null, FontWeight.INSTANCE.getBold(), TextDecoration.INSTANCE.getUnderline(), TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 221190, 0, 16266);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return FinalTermsComposable.FinalTermsAgreeButton$lambda$57(eventLogger, z, function0, function02, z2, selectedPlan, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinalTermsAgreeButton$lambda$56$lambda$54$lambda$53(EventLogger eventLogger, boolean z, SelectedPlan selectedPlan, Function0 function0, Function0 function02) {
        loggingUtils.logAccept$default(eventLogger, null, 1, null);
        if (z && selectedPlan == SelectedPlan.BASIC_1P5_PERCENT) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinalTermsBottomButton(final float f, final int i, final FinalTermsViewState.Screen screen, final EventLogger eventLogger, final Function0<Unit> function0, final Function0<Unit> function02, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2024004503);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(screen.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventLogger) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2024004503, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsBottomButton (FinalTermsComposable.kt:454)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FinalTermsComposable.FinalTermsBottomButton$lambda$59$lambda$58(f, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierFillMaxWidth$default, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-117976075, true, new FinalTermsComposable6(i, eventLogger, function02, screen, function0, function2), composerStartRestartGroup, 54), composer2, 805306368, 510);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinalTermsComposable.FinalTermsBottomButton$lambda$61(f, i, screen, eventLogger, function0, function02, function2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinalTermsBottomButton$lambda$59$lambda$58(float f, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(f);
        return Unit.INSTANCE;
    }
}
