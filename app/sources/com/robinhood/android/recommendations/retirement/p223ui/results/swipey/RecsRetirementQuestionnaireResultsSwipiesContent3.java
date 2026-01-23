package com.robinhood.android.recommendations.retirement.p223ui.results.swipey;

import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import com.adjust.sdk.network.ErrorCodes;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerScope;
import com.google.accompanist.pager.PagerState;
import com.google.accompanist.pager.PagerStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.chart.BlockRegion;
import com.robinhood.android.designsystem.chart.StackedBlockChart;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.responsive.AspectRatio;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.common.lottie.LoopingLottieAnimationWithInitialClip;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.recommendations.retirement.models.p364ui.UiQuestionnaireResults;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecsRetirementQuestionnaireResultsSwipiesContent.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\u001a5\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0013\u001a3\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0019\u001a%\u0010\u001a\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u001d\u001a/\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060!2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\"\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u008e\u0002²\u0006\f\u0010&\u001a\u0004\u0018\u00010'X\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002"}, m3636d2 = {"blockChartHeightDp", "Landroidx/compose/ui/unit/Dp;", "F", "RecsRetirementSwipeysLottieTestTag", "", "ResultsSwipeyScreen", "", "swipies", "", "Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults$SwipeyPage;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "callbacks", "Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementSwipiesCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementSwipiesCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Page", "swipey", "(Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults$SwipeyPage;Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementSwipiesCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoopableLottie", "lottieUrl", "firstLoopRange", "Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults$SwipeyPage$AnimationRange;", "repeatingRange", "(Ljava/lang/String;Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults$SwipeyPage$AnimationRange;Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults$SwipeyPage$AnimationRange;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BlockChart", "allocation", "Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults$SwipeyPage$Allocation;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Cta", "ctaText", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-recommendations-for-retirement_externalDebug", "progress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecsRetirementQuestionnaireResultsSwipiesContent3 {
    public static final String RecsRetirementSwipeysLottieTestTag = "recs_retirement_swipeys_lottie";
    private static final float blockChartHeightDp = C2002Dp.m7995constructorimpl(120);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockChart$lambda$21(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BlockChart(list, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Cta$lambda$22(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Cta(str, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoopableLottie$lambda$15(String str, UiQuestionnaireResults.SwipeyPage.AnimationRange animationRange, UiQuestionnaireResults.SwipeyPage.AnimationRange animationRange2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoopableLottie(str, animationRange, animationRange2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Page$lambda$10(UiQuestionnaireResults.SwipeyPage swipeyPage, RecsRetirementQuestionnaireResultsSwipiesContent8 recsRetirementQuestionnaireResultsSwipiesContent8, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Page(swipeyPage, recsRetirementQuestionnaireResultsSwipiesContent8, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultsSwipeyScreen$lambda$7(List list, Context context, RecsRetirementQuestionnaireResultsSwipiesContent8 recsRetirementQuestionnaireResultsSwipiesContent8, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ResultsSwipeyScreen(list, context, recsRetirementQuestionnaireResultsSwipiesContent8, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ResultsSwipeyScreen$lambda$1(SnapshotFloatState2 snapshotFloatState2) {
        return snapshotFloatState2.getFloatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ResultsSwipeyScreen(final List<UiQuestionnaireResults.SwipeyPage> swipies, final Context eventContext, final RecsRetirementQuestionnaireResultsSwipiesContent8 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final PagerState pagerStateRememberPagerState;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        Object objRememberedValue2;
        boolean zChanged;
        Object objRememberedValue3;
        boolean zChanged2;
        Object objRememberedValue4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(swipies, "swipies");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-436195197);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(swipies) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventContext) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-436195197, i3, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen (RecsRetirementQuestionnaireResultsSwipiesContent.kt:83)");
                }
                pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, composerStartRestartGroup, 0, 1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                final Screen screen = new Screen(Screen.Name.RECS_RET_QUESTIONNAIRE_RESULTS, null, String.valueOf(pagerStateRememberPagerState.getCurrentPage()), null, 10, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                int i5 = i3 & 896;
                zChanged = composerStartRestartGroup.changed(pagerStateRememberPagerState) | (i5 != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(coroutineScope);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecsRetirementQuestionnaireResultsSwipiesContent3.ResultsSwipeyScreen$lambda$4$lambda$3(pagerStateRememberPagerState, callbacks, coroutineScope);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                final Function0<Unit> function0HapticClick = Haptics.hapticClick((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged2 = (i5 != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changed(pagerStateRememberPagerState) | composerStartRestartGroup.changedInstance(coroutineScope);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecsRetirementQuestionnaireResultsSwipiesContent3.ResultsSwipeyScreen$lambda$6$lambda$5(pagerStateRememberPagerState, coroutineScope, callbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                final Function0 function0 = (Function0) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                BackHandler.BackHandler(false, function0, composerStartRestartGroup, 0, 1);
                final Modifier modifier5 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, eventContext, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1289033170, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1289033170, i6, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:120)");
                        }
                        final Modifier modifier6 = modifier5;
                        final Function0<Unit> function02 = function0;
                        final SnapshotFloatState2 snapshotFloatState22 = snapshotFloatState2;
                        final List<UiQuestionnaireResults.SwipeyPage> list = swipies;
                        final PagerState pagerState = pagerStateRememberPagerState;
                        final Function0<Unit> function03 = function0HapticClick;
                        final RecsRetirementQuestionnaireResultsSwipiesContent8 recsRetirementQuestionnaireResultsSwipiesContent8 = callbacks;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1271096835, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1271096835, i7, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:121)");
                                }
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU();
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU();
                                Modifier modifier7 = modifier6;
                                final Function0<Unit> function04 = function02;
                                final SnapshotFloatState2 snapshotFloatState23 = snapshotFloatState22;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1206589854, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i9) {
                                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1206589854, i9, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:126)");
                                        }
                                        Function2<Composer, Integer, Unit> function2M2393x75b104b9 = RecsRetirementQuestionnaireResultsSwipiesContent.INSTANCE.m2393x75b104b9();
                                        final Function0<Unit> function05 = function04;
                                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(240297405, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1.1.1.1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                                invoke(bentoAppBarScope, composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i10) {
                                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                if ((i10 & 6) == 0) {
                                                    i10 |= (i10 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                                                }
                                                if ((i10 & 19) == 18 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(240297405, i10, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:134)");
                                                }
                                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function05, composer5, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54);
                                        final SnapshotFloatState2 snapshotFloatState24 = snapshotFloatState23;
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2393x75b104b9, null, composableLambdaRememberComposableLambda2, null, ComposableLambda3.rememberComposableLambda(-1137486996, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1.1.1.2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                                invoke(boxScope, composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BoxScope BentoAppBar, Composer composer5, int i10) {
                                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                if ((i10 & 17) == 16 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1137486996, i10, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:129)");
                                                }
                                                BentoProgressBar2.m20698BentoProgressBarjB83MbM(RecsRetirementQuestionnaireResultsSwipiesContent3.ResultsSwipeyScreen$lambda$1(snapshotFloatState24), null, 0, 0L, 0L, false, composer5, 0, 62);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), false, false, null, null, 0L, null, composer4, 24966, 0, 2026);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final List<UiQuestionnaireResults.SwipeyPage> list2 = list;
                                final PagerState pagerState2 = pagerState;
                                final Function0<Unit> function05 = function03;
                                final RecsRetirementQuestionnaireResultsSwipiesContent8 recsRetirementQuestionnaireResultsSwipiesContent82 = recsRetirementQuestionnaireResultsSwipiesContent8;
                                ScaffoldKt.m5625Scaffold27mzLpw(modifier7, null, composableLambdaRememberComposableLambda, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(-2030783611, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1.1.2
                                    public final void invoke(PaddingValues paddingValues, Composer composer4, int i9) {
                                        int i10;
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i9 & 6) == 0) {
                                            i10 = i9 | (composer4.changed(paddingValues) ? 4 : 2);
                                        } else {
                                            i10 = i9;
                                        }
                                        if ((i10 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2030783611, i10, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:141)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Modifier modifierPadding = PaddingKt.padding(companion2, paddingValues);
                                        Alignment.Companion companion3 = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                        final List<UiQuestionnaireResults.SwipeyPage> list3 = list2;
                                        PagerState pagerState3 = pagerState2;
                                        Function0<Unit> function06 = function05;
                                        final RecsRetirementQuestionnaireResultsSwipiesContent8 recsRetirementQuestionnaireResultsSwipiesContent83 = recsRetirementQuestionnaireResultsSwipiesContent82;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer4, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierPadding);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                        Pager.m9191HorizontalPager7SJwSw(list3.size(), Column5.weight$default(Column6.INSTANCE, companion2, 1.0f, false, 2, null), pagerState3, false, 0.0f, null, companion3.getTop(), null, null, false, ComposableLambda3.rememberComposableLambda(-1511615190, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$ResultsSwipeyScreen$1$1$2$1$1
                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer5, Integer num2) {
                                                invoke(pagerScope, num.intValue(), composer5, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PagerScope HorizontalPager, int i11, Composer composer5, int i12) {
                                                Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                                                if ((i12 & 48) == 0) {
                                                    i12 |= composer5.changed(i11) ? 32 : 16;
                                                }
                                                if ((i12 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1511615190, i12, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:151)");
                                                }
                                                RecsRetirementQuestionnaireResultsSwipiesContent3.Page(list3.get(i11), recsRetirementQuestionnaireResultsSwipiesContent83, null, composer5, 0, 4);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, 1572864, 6, 952);
                                        RecsRetirementQuestionnaireResultsSwipiesContent3.Cta(list3.get(pagerState3.getCurrentPage()).getCtaText(), function06, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer4, 6, 0), composer4, 0, 0);
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                        invoke(paddingValues, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 384, 12582912, 32762);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                        Integer numValueOf = Integer.valueOf(pagerStateRememberPagerState.getCurrentPage());
                        composer2.startReplaceGroup(-1224400529);
                        boolean zChanged3 = composer2.changed(pagerStateRememberPagerState) | composer2.changedInstance(swipies) | composer2.changedInstance(current) | composer2.changedInstance(screen) | composer2.changedInstance(eventContext);
                        PagerState pagerState2 = pagerStateRememberPagerState;
                        List<UiQuestionnaireResults.SwipeyPage> list2 = swipies;
                        Screen screen2 = screen;
                        Context context = eventContext;
                        SnapshotFloatState2 snapshotFloatState23 = snapshotFloatState2;
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new RecsRetirementQuestionnaireResultsSwipiesContent5(pagerState2, list2, current, screen2, context, snapshotFloatState23, null);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecsRetirementQuestionnaireResultsSwipiesContent3.ResultsSwipeyScreen$lambda$7(swipies, eventContext, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, composerStartRestartGroup, 0, 1);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            final Screen screen2 = new Screen(Screen.Name.RECS_RET_QUESTIONNAIRE_RESULTS, null, String.valueOf(pagerStateRememberPagerState.getCurrentPage()), null, 10, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i52 = i3 & 896;
            if (i52 != 256) {
                zChanged = composerStartRestartGroup.changed(pagerStateRememberPagerState) | (i52 != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(coroutineScope);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecsRetirementQuestionnaireResultsSwipiesContent3.ResultsSwipeyScreen$lambda$4$lambda$3(pagerStateRememberPagerState, callbacks, coroutineScope);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    final Function0<Unit> function0HapticClick2 = Haptics.hapticClick((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    if (i52 != 256) {
                        zChanged2 = (i52 != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changed(pagerStateRememberPagerState) | composerStartRestartGroup.changedInstance(coroutineScope);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RecsRetirementQuestionnaireResultsSwipiesContent3.ResultsSwipeyScreen$lambda$6$lambda$5(pagerStateRememberPagerState, coroutineScope, callbacks);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            final Function0<Unit> function02 = (Function0) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            BackHandler.BackHandler(false, function02, composerStartRestartGroup, 0, 1);
                            final Modifier modifier52 = modifier4;
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen2, null, eventContext, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1289033170, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i6) {
                                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1289033170, i6, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:120)");
                                    }
                                    final Modifier modifier6 = modifier52;
                                    final Function0<Unit> function022 = function02;
                                    final SnapshotFloatState2 snapshotFloatState222 = snapshotFloatState22;
                                    final List<UiQuestionnaireResults.SwipeyPage> list = swipies;
                                    final PagerState pagerState = pagerStateRememberPagerState;
                                    final Function0<Unit> function03 = function0HapticClick2;
                                    final RecsRetirementQuestionnaireResultsSwipiesContent8 recsRetirementQuestionnaireResultsSwipiesContent8 = callbacks;
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1271096835, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i7) {
                                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1271096835, i7, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:121)");
                                            }
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i8 = BentoTheme.$stable;
                                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU();
                                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU();
                                            Modifier modifier7 = modifier6;
                                            final Function0<Unit> function04 = function022;
                                            final SnapshotFloatState2 snapshotFloatState23 = snapshotFloatState222;
                                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1206589854, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1.1.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i9) {
                                                    if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1206589854, i9, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:126)");
                                                    }
                                                    Function2<Composer, Integer, Unit> function2M2393x75b104b9 = RecsRetirementQuestionnaireResultsSwipiesContent.INSTANCE.m2393x75b104b9();
                                                    final Function0<Unit> function05 = function04;
                                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(240297405, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1.1.1.1
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                                            invoke(bentoAppBarScope, composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i10) {
                                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                            if ((i10 & 6) == 0) {
                                                                i10 |= (i10 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                                                            }
                                                            if ((i10 & 19) == 18 && composer5.getSkipping()) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(240297405, i10, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:134)");
                                                            }
                                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function05, composer5, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer4, 54);
                                                    final SnapshotFloatState2 snapshotFloatState24 = snapshotFloatState23;
                                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2393x75b104b9, null, composableLambdaRememberComposableLambda2, null, ComposableLambda3.rememberComposableLambda(-1137486996, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1.1.1.2
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                                            invoke(boxScope, composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(BoxScope BentoAppBar, Composer composer5, int i10) {
                                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                            if ((i10 & 17) == 16 && composer5.getSkipping()) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1137486996, i10, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:129)");
                                                            }
                                                            BentoProgressBar2.m20698BentoProgressBarjB83MbM(RecsRetirementQuestionnaireResultsSwipiesContent3.ResultsSwipeyScreen$lambda$1(snapshotFloatState24), null, 0, 0L, 0L, false, composer5, 0, 62);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer4, 54), false, false, null, null, 0L, null, composer4, 24966, 0, 2026);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer3, 54);
                                            final List<UiQuestionnaireResults.SwipeyPage> list2 = list;
                                            final PagerState pagerState2 = pagerState;
                                            final Function0<Unit> function05 = function03;
                                            final RecsRetirementQuestionnaireResultsSwipiesContent8 recsRetirementQuestionnaireResultsSwipiesContent82 = recsRetirementQuestionnaireResultsSwipiesContent8;
                                            ScaffoldKt.m5625Scaffold27mzLpw(modifier7, null, composableLambdaRememberComposableLambda, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(-2030783611, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt.ResultsSwipeyScreen.1.1.2
                                                public final void invoke(PaddingValues paddingValues, Composer composer4, int i9) {
                                                    int i10;
                                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                    if ((i9 & 6) == 0) {
                                                        i10 = i9 | (composer4.changed(paddingValues) ? 4 : 2);
                                                    } else {
                                                        i10 = i9;
                                                    }
                                                    if ((i10 & 19) == 18 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-2030783611, i10, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:141)");
                                                    }
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    Modifier modifierPadding = PaddingKt.padding(companion2, paddingValues);
                                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                                    final List<UiQuestionnaireResults.SwipeyPage> list3 = list2;
                                                    PagerState pagerState3 = pagerState2;
                                                    Function0<Unit> function06 = function05;
                                                    final RecsRetirementQuestionnaireResultsSwipiesContent8 recsRetirementQuestionnaireResultsSwipiesContent83 = recsRetirementQuestionnaireResultsSwipiesContent82;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer4, 48);
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierPadding);
                                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                        Composables.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                                    Pager.m9191HorizontalPager7SJwSw(list3.size(), Column5.weight$default(Column6.INSTANCE, companion2, 1.0f, false, 2, null), pagerState3, false, 0.0f, null, companion3.getTop(), null, null, false, ComposableLambda3.rememberComposableLambda(-1511615190, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$ResultsSwipeyScreen$1$1$2$1$1
                                                        @Override // kotlin.jvm.functions.Function4
                                                        public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer5, Integer num2) {
                                                            invoke(pagerScope, num.intValue(), composer5, num2.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(PagerScope HorizontalPager, int i11, Composer composer5, int i12) {
                                                            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                                                            if ((i12 & 48) == 0) {
                                                                i12 |= composer5.changed(i11) ? 32 : 16;
                                                            }
                                                            if ((i12 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer5.getSkipping()) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1511615190, i12, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ResultsSwipeyScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:151)");
                                                            }
                                                            RecsRetirementQuestionnaireResultsSwipiesContent3.Page(list3.get(i11), recsRetirementQuestionnaireResultsSwipiesContent83, null, composer5, 0, 4);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer4, 54), composer4, 1572864, 6, 952);
                                                    RecsRetirementQuestionnaireResultsSwipiesContent3.Cta(list3.get(pagerState3.getCurrentPage()).getCtaText(), function06, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer4, 6, 0), composer4, 0, 0);
                                                    composer4.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                                    invoke(paddingValues, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }
                                            }, composer3, 54), composer3, 384, 12582912, 32762);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), composer2, 6);
                                    EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                                    Integer numValueOf = Integer.valueOf(pagerStateRememberPagerState.getCurrentPage());
                                    composer2.startReplaceGroup(-1224400529);
                                    boolean zChanged3 = composer2.changed(pagerStateRememberPagerState) | composer2.changedInstance(swipies) | composer2.changedInstance(current) | composer2.changedInstance(screen2) | composer2.changedInstance(eventContext);
                                    PagerState pagerState2 = pagerStateRememberPagerState;
                                    List<UiQuestionnaireResults.SwipeyPage> list2 = swipies;
                                    Screen screen22 = screen2;
                                    Context context = eventContext;
                                    SnapshotFloatState2 snapshotFloatState23 = snapshotFloatState22;
                                    Object objRememberedValue5 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new RecsRetirementQuestionnaireResultsSwipiesContent5(pagerState2, list2, current, screen22, context, snapshotFloatState23, null);
                                        composer2.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer2.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final LottieComposition LoopableLottie$lambda$11(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LoopableLottie$lambda$12(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultsSwipeyScreen$lambda$4$lambda$3(PagerState pagerState, RecsRetirementQuestionnaireResultsSwipiesContent8 recsRetirementQuestionnaireResultsSwipiesContent8, CoroutineScope coroutineScope) {
        if (pagerState.getCurrentPage() != pagerState.getPageCount() - 1) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RecsRetirementQuestionnaireResultsSwipiesContent7(pagerState, null), 3, null);
        } else {
            recsRetirementQuestionnaireResultsSwipiesContent8.onLastPageContinue();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultsSwipeyScreen$lambda$6$lambda$5(PagerState pagerState, CoroutineScope coroutineScope, RecsRetirementQuestionnaireResultsSwipiesContent8 recsRetirementQuestionnaireResultsSwipiesContent8) {
        if (pagerState.getCurrentPage() > 0) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RecsRetirementQuestionnaireResultsSwipiesContent6(pagerState, null), 3, null);
        } else {
            recsRetirementQuestionnaireResultsSwipiesContent8.exit();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Page(final UiQuestionnaireResults.SwipeyPage swipey, final RecsRetirementQuestionnaireResultsSwipiesContent8 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        BentoTheme bentoTheme;
        int i5;
        String headerLottieUrlNight;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ?? r0;
        Object obj;
        List<UiQuestionnaireResults.SwipeyPage.Allocation> portfolioAllocation;
        int i6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(swipey, "swipey");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(573626368);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(swipey) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(573626368, i4, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.Page (RecsRetirementQuestionnaireResultsSwipiesContent.kt:187)");
                }
                bentoTheme = BentoTheme.INSTANCE;
                i5 = BentoTheme.$stable;
                if (!bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay()) {
                    headerLottieUrlNight = swipey.getHeaderLottieUrlDay();
                } else {
                    headerLottieUrlNight = swipey.getHeaderLottieUrlNight();
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1973248315);
                if (headerLottieUrlNight == null) {
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(AspectRatio3.aspectRatio$default(TestTag3.testTag(Modifier.INSTANCE, RecsRetirementSwipeysLottieTestTag), AspectRatio.INSTANCE.getHeroImage(composerStartRestartGroup, AspectRatio.$stable), false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                    r0 = 0;
                    composer2 = composerStartRestartGroup;
                    obj = null;
                    LoopableLottie(headerLottieUrlNight, swipey.getFirstRoundAnimationRange(), swipey.getLoopingRange(), modifierM5143paddingVpY3zN4, composer2, 0, 0);
                } else {
                    composer2 = composerStartRestartGroup;
                    r0 = 0;
                    obj = null;
                }
                composer2.endReplaceGroup();
                portfolioAllocation = swipey.getPortfolioAllocation();
                composer2.startReplaceGroup(-1973228011);
                if (portfolioAllocation == null) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(AspectRatio3.aspectRatio$default(companion3, AspectRatio.INSTANCE.getHeroImage(composer2, AspectRatio.$stable), r0, 2, obj), 0.0f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 1, obj);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), r0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, r0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    i6 = 0;
                    BlockChart(portfolioAllocation, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion3, blockChartHeightDp), 0.0f, 1, obj), 0.0f, composer2, 6, 1), composer2, 0, 0);
                    composer2.endNode();
                } else {
                    i6 = r0;
                }
                composer2.endReplaceGroup();
                ImmutableList immutableList = extensions2.toImmutableList(swipey.getContent());
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(i6, composer2, i6, 1), false, null, false, 14, null);
                composer2.startReplaceGroup(-1772220517);
                composerStartRestartGroup = composer2;
                SduiColumns.SduiColumn(immutableList, GenericAction.class, modifierVerticalScroll$default, null, callbacks, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composerStartRestartGroup, (((((i4 << 6) & 7168) | 12582912) << 3) & 57344) | 100663296, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return RecsRetirementQuestionnaireResultsSwipiesContent3.Page$lambda$10(swipey, callbacks, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) != 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            bentoTheme = BentoTheme.INSTANCE;
            i5 = BentoTheme.$stable;
            if (!bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1973248315);
                if (headerLottieUrlNight == null) {
                }
                composer2.endReplaceGroup();
                portfolioAllocation = swipey.getPortfolioAllocation();
                composer2.startReplaceGroup(-1973228011);
                if (portfolioAllocation == null) {
                }
                composer2.endReplaceGroup();
                ImmutableList immutableList2 = extensions2.toImmutableList(swipey.getContent());
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(i6, composer2, i6, 1), false, null, false, 14, null);
                composer2.startReplaceGroup(-1772220517);
                composerStartRestartGroup = composer2;
                SduiColumns.SduiColumn(immutableList2, GenericAction.class, modifierVerticalScroll$default2, null, callbacks, HorizontalPadding.Default, arrangement2.getTop(), companion4.getStart(), false, composerStartRestartGroup, (((((i4 << 6) & 7168) | 12582912) << 3) & 57344) | 100663296, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoopableLottie(final String lottieUrl, final UiQuestionnaireResults.SwipeyPage.AnimationRange animationRange, final UiQuestionnaireResults.SwipeyPage.AnimationRange animationRange2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
        Composer composerStartRestartGroup = composer.startRestartGroup(741719037);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(lottieUrl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(animationRange) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(animationRange2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(741719037, i3, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.LoopableLottie (RecsRetirementQuestionnaireResultsSwipiesContent.kt:247)");
                }
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(lottieUrl)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                LottieClipSpec.Frame frame = new LottieClipSpec.Frame(animationRange == null ? Integer.valueOf(animationRange.getStart()) : null, animationRange != null ? Integer.valueOf(animationRange.getEnd()) : null, false, 4, null);
                if (animationRange2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-1054407768);
                    LottieComposition lottieCompositionLoopableLottie$lambda$11 = LoopableLottie$lambda$11(lottieCompositionResultRememberLottieComposition);
                    LottieClipSpec.Frame frame2 = new LottieClipSpec.Frame(Integer.valueOf(animationRange2.getStart()), Integer.valueOf(animationRange2.getEnd()), false, 4, null);
                    ContentScale fit = ContentScale.INSTANCE.getFit();
                    int i5 = ((i3 >> 9) & 14) | 384;
                    int i6 = LottieClipSpec.Frame.$stable;
                    modifier3 = modifier5;
                    LoopingLottieAnimationWithInitialClip.LoopingLottieAnimationWithInitialClip(modifier3, lottieCompositionLoopableLottie$lambda$11, fit, frame, frame2, composerStartRestartGroup, i5 | (i6 << 9) | (i6 << 12));
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    Modifier modifier6 = modifier5;
                    composerStartRestartGroup.startReplaceGroup(-1054026468);
                    final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(LoopableLottie$lambda$11(lottieCompositionResultRememberLottieComposition), false, false, false, frame, 0.0f, 0, null, false, false, composerStartRestartGroup, LottieClipSpec.Frame.$stable << 12, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                    LottieComposition lottieCompositionLoopableLottie$lambda$112 = LoopableLottie$lambda$11(lottieCompositionResultRememberLottieComposition);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(RecsRetirementQuestionnaireResultsSwipiesContent3.LoopableLottie$lambda$12(lottieAnimationStateAnimateLottieCompositionAsState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LottieAnimation2.LottieAnimation(lottieCompositionLoopableLottie$lambda$112, (Function0) objRememberedValue, modifier6, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, (i3 >> 3) & 896, 0, 65528);
                    modifier3 = modifier6;
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecsRetirementQuestionnaireResultsSwipiesContent3.LoopableLottie$lambda$15(lottieUrl, animationRange, animationRange2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(lottieUrl)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            LottieClipSpec.Frame frame3 = new LottieClipSpec.Frame(animationRange == null ? Integer.valueOf(animationRange.getStart()) : null, animationRange != null ? Integer.valueOf(animationRange.getEnd()) : null, false, 4, null);
            if (animationRange2 == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void BlockChart(final List<UiQuestionnaireResults.SwipeyPage.Allocation> allocation, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1208832874);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(allocation) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1208832874, i3, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.BlockChart (RecsRetirementQuestionnaireResultsSwipiesContent.kt:282)");
            }
            final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecsRetirementQuestionnaireResultsSwipiesContent3.BlockChart$lambda$17$lambda$16((android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(allocation) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecsRetirementQuestionnaireResultsSwipiesContent3.BlockChart$lambda$20$lambda$19(allocation, context, (StackedBlockChart) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function1, modifier2, (Function1) objRememberedValue2, composerStartRestartGroup, (i3 & 112) | 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecsRetirementQuestionnaireResultsSwipiesContent3.BlockChart$lambda$21(allocation, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final StackedBlockChart BlockChart$lambda$17$lambda$16(android.content.Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new StackedBlockChart(it, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockChart$lambda$20$lambda$19(List list, android.content.Context context, StackedBlockChart chart) {
        Integer numResolve;
        Intrinsics.checkNotNullParameter(chart, "chart");
        List<UiQuestionnaireResults.SwipeyPage.Allocation> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (UiQuestionnaireResults.SwipeyPage.Allocation allocation : list2) {
            String identifier = allocation.getIdentifier();
            float weight = allocation.getWeight();
            ResourceReferences4<Integer> resourceReferences4MapSimpleServerColor = ServerToBentoColorMapper.INSTANCE.mapSimpleServerColor(allocation.getColor());
            if (resourceReferences4MapSimpleServerColor != null) {
                Resources.Theme theme = context.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                numResolve = resourceReferences4MapSimpleServerColor.resolve(theme);
            } else {
                numResolve = null;
            }
            arrayList.add(new BlockRegion(identifier, weight, null, numResolve, null, null, 52, null));
        }
        chart.setRegions(arrayList);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Cta(final String str, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(318612242);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(318612242, i3, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.Cta (RecsRetirementQuestionnaireResultsSwipiesContent.kt:307)");
                }
                if (str == null) {
                    composerStartRestartGroup.startReplaceGroup(-100263582);
                    composer2 = composerStartRestartGroup;
                    BentoButtonKt.m20586BentoButtonEikTQX8(onClick, str, SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifier5, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer2, ((i3 >> 3) & 14) | ((i3 << 3) & 112), 0, 8184);
                    composer2.endReplaceGroup();
                    modifier3 = modifier5;
                } else {
                    Modifier modifier6 = modifier5;
                    composerStartRestartGroup.startReplaceGroup(-99652665);
                    BentoIconButton2.m20641BentoIconButtoncqYvz4g(onClick, new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.ARROW_RIGHT_24), "Right Arrow", modifier6, null, false, null, null, null, null, false, composerStartRestartGroup, ((i3 >> 3) & 14) | 384 | (BentoIconButton4.Icon.HeroSize24.$stable << 3) | ((i3 << 3) & 7168), 0, 2032);
                    modifier3 = modifier6;
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecsRetirementQuestionnaireResultsSwipiesContent3.Cta$lambda$22(str, onClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (str == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
