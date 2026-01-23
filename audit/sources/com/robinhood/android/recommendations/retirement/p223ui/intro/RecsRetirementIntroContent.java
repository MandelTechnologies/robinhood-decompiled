package com.robinhood.android.recommendations.retirement.p223ui.intro;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.recommendations.retirement.lib.p222ui.RecsRetirementLoadingPlaceholder3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.lottie.LoopingLottieAnimationWithInitialClip;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.recommendations.retirement.models.p364ui.UiRecsRetirementIntro;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RecsRetirementIntroContent.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u000f\u001aO\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u0084\u0002"}, m3636d2 = {"LoadingOrIntroContent", "", "intro", "Lcom/robinhood/recommendations/retirement/models/ui/UiRecsRetirementIntro;", "onCtaClick", "Lkotlin/Function0;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "(Lcom/robinhood/recommendations/retirement/models/ui/UiRecsRetirementIntro;Lkotlin/jvm/functions/Function0;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;I)V", "Intro", "Header", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "BottomHalf", "content", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", AccountOverviewOptionsSettingCard4.CTA, "", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;I)V", "feature-recommendations-for-retirement_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroContentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecsRetirementIntroContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomHalf$lambda$5(Modifier modifier, List list, String str, Function0 function0, Screen screen, Context context, int i, Composer composer, int i2) {
        BottomHalf(modifier, list, str, function0, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$3(Modifier modifier, int i, Composer composer, int i2) {
        Header(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Intro$lambda$1(UiRecsRetirementIntro uiRecsRetirementIntro, Function0 function0, Screen screen, Context context, int i, Composer composer, int i2) {
        Intro(uiRecsRetirementIntro, function0, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingOrIntroContent$lambda$0(UiRecsRetirementIntro uiRecsRetirementIntro, Function0 function0, Screen screen, Context context, int i, Composer composer, int i2) {
        LoadingOrIntroContent(uiRecsRetirementIntro, function0, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LoadingOrIntroContent(UiRecsRetirementIntro uiRecsRetirementIntro, Function0<Unit> onCtaClick, Screen eventScreen, Context eventContext, Composer composer, final int i) {
        int i2;
        final Context context;
        final Screen screen;
        final Function0<Unit> function0;
        final UiRecsRetirementIntro uiRecsRetirementIntro2;
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Composer composerStartRestartGroup = composer.startRestartGroup(470525965);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uiRecsRetirementIntro) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCtaClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(eventScreen) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(eventContext) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(470525965, i2, -1, "com.robinhood.android.recommendations.retirement.ui.intro.LoadingOrIntroContent (RecsRetirementIntroContent.kt:42)");
            }
            if (uiRecsRetirementIntro != null) {
                composerStartRestartGroup.startReplaceGroup(-1334036891);
                Intro(uiRecsRetirementIntro, onCtaClick, eventScreen, eventContext, composerStartRestartGroup, i2 & 8190);
                uiRecsRetirementIntro2 = uiRecsRetirementIntro;
                function0 = onCtaClick;
                screen = eventScreen;
                context = eventContext;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                context = eventContext;
                screen = eventScreen;
                function0 = onCtaClick;
                uiRecsRetirementIntro2 = uiRecsRetirementIntro;
                composerStartRestartGroup.startReplaceGroup(-1333858362);
                RecsRetirementLoadingPlaceholder3.RecsRetirementLoadingPlaceholder(TestTag3.testTag(Modifier.INSTANCE, "Loading"), composerStartRestartGroup, 6, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            context = eventContext;
            screen = eventScreen;
            function0 = onCtaClick;
            uiRecsRetirementIntro2 = uiRecsRetirementIntro;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecsRetirementIntroContent.LoadingOrIntroContent$lambda$0(uiRecsRetirementIntro2, function0, screen, context, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void Intro(final UiRecsRetirementIntro intro, final Function0<Unit> onCtaClick, final Screen eventScreen, final Context eventContext, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Composer composerStartRestartGroup = composer.startRestartGroup(1002881005);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(intro) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCtaClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(eventScreen) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(eventContext) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1002881005, i2, -1, "com.robinhood.android.recommendations.retirement.ui.intro.Intro (RecsRetirementIntroContent.kt:63)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-181737214, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroContentKt.Intro.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-181737214, i3, -1, "com.robinhood.android.recommendations.retirement.ui.intro.Intro.<anonymous> (RecsRetirementIntroContent.kt:65)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    UiRecsRetirementIntro uiRecsRetirementIntro = intro;
                    Function0<Unit> function0 = onCtaClick;
                    Screen screen = eventScreen;
                    Context context = eventContext;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    RecsRetirementIntroContent.Header(SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, 1, null), composer2, 0);
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, 0L, 0.0f, composer2, 0, 7);
                    RecsRetirementIntroContent.BottomHalf(SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, 1, null), uiRecsRetirementIntro.getContent(), uiRecsRetirementIntro.getCta(), function0, screen, context, composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecsRetirementIntroContent.Intro$lambda$1(intro, onCtaClick, eventScreen, eventContext, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final LottieComposition Header$lambda$2(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Header(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(227913908);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(227913908, i2, -1, "com.robinhood.android.recommendations.retirement.ui.intro.Header (RecsRetirementIntroContent.kt:91)");
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.RECS_RET_INTRO.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            Modifier modifierTestTag = TestTag3.testTag(modifier, "LottieAnimation");
            LottieComposition lottieCompositionHeader$lambda$2 = Header$lambda$2(lottieCompositionResultRememberLottieComposition);
            ContentScale crop = ContentScale.INSTANCE.getCrop();
            LottieClipSpec.Frame frame = new LottieClipSpec.Frame(0, 358, false, 4, null);
            LottieClipSpec.Frame frame2 = new LottieClipSpec.Frame(358, 837, false, 4, null);
            int i3 = LottieClipSpec.Frame.$stable;
            LoopingLottieAnimationWithInitialClip.LoopingLottieAnimationWithInitialClip(modifierTestTag, lottieCompositionHeader$lambda$2, crop, frame, frame2, composerStartRestartGroup, (i3 << 12) | (i3 << 9) | 384);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecsRetirementIntroContent.Header$lambda$3(modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomHalf(final Modifier modifier, final List<? extends UIComponent<? extends GenericAction>> list, final String str, final Function0<Unit> function0, final Screen screen, final Context context, Composer composer, final int i) {
        int i2;
        Screen screen2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1228035929);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            screen2 = screen;
            i2 |= composerStartRestartGroup.changedInstance(screen2) ? 16384 : 8192;
        } else {
            screen2 = screen;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(context) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1228035929, i2, -1, "com.robinhood.android.recommendations.retirement.ui.intro.BottomHalf (RecsRetirementIntroContent.kt:118)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            int i4 = i2;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1510558093);
            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
            ImmutableList3 persistentList = extensions2.toPersistentList(list);
            composerStartRestartGroup.startReplaceGroup(-1772220517);
            SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierVerticalScroll$default, null, sduiActionHandlerCurrentActionHandler, horizontalPadding, arrangement.getTop(), companion.getStart(), false, composerStartRestartGroup, 100663296, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, str, ModifiersKt.autoLogEvents$default(PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), new UserInteractionEventDescriptor(null, screen2, UserInteractionEventData.Action.CONTINUE, context, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null), true, false, false, true, false, null, 108, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i4 >> 9) & 14) | ((i4 >> 3) & 112), 0, 8184);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecsRetirementIntroContent.BottomHalf$lambda$5(modifier, list, str, function0, screen, context, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
