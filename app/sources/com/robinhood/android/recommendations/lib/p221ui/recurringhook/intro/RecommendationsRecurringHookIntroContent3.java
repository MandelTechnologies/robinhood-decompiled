package com.robinhood.android.recommendations.lib.p221ui.recurringhook.intro;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.recommendations.lib.C25982R;
import com.robinhood.android.recommendations.lib.p221ui.recurringhook.intro.RecommendationsRecurringHookIntroContent3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecommendationsRecurringHookIntroContent.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"RecurringHookContent", "", "context", "Landroid/content/Context;", "onProceed", "Lkotlin/Function0;", "onDismiss", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;I)V", "feature-lib-recommendations_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecommendationsRecurringHookIntroContentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecommendationsRecurringHookIntroContent3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringHookContent$lambda$0(Context context, Function0 function0, Function0 function02, Screen screen, com.robinhood.rosetta.eventlogging.Context context2, int i, Composer composer, int i2) {
        RecurringHookContent(context, function0, function02, screen, context2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RecurringHookContent(Context context, final Function0<Unit> onProceed, final Function0<Unit> onDismiss, final Screen eventScreen, final com.robinhood.rosetta.eventlogging.Context eventContext, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(onProceed, "onProceed");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Composer composerStartRestartGroup = composer.startRestartGroup(1423809013);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(context2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onProceed) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(eventScreen) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(eventContext) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1423809013, i2, -1, "com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecurringHookContent (RecommendationsRecurringHookIntroContent.kt:43)");
            }
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE));
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(39926705, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecommendationsRecurringHookIntroContentKt.RecurringHookContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(39926705, i3, -1, "com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecurringHookContent.<anonymous> (RecommendationsRecurringHookIntroContent.kt:49)");
                    }
                    Function2<Composer, Integer, Unit> lambda$934074724$feature_lib_recommendations_externalDebug = RecommendationsRecurringHookIntroContent.INSTANCE.getLambda$934074724$feature_lib_recommendations_externalDebug();
                    final Function0<Unit> function0 = onDismiss;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$934074724$feature_lib_recommendations_externalDebug, null, ComposableLambda3.rememberComposableLambda(2130568336, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecommendationsRecurringHookIntroContentKt.RecurringHookContent.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i4) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i4 & 6) == 0) {
                                i4 |= (i4 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2130568336, i4, -1, "com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecurringHookContent.<anonymous>.<anonymous> (RecommendationsRecurringHookIntroContent.kt:52)");
                            }
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, true, false, null, null, Color.INSTANCE.m6725getTransparent0d7_KjU(), null, composer3, 805503366, 0, 1498);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecommendationsRecurringHookIntroContentKt.RecurringHookContent.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-387343024, i3, -1, "com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecurringHookContent.<anonymous> (RecommendationsRecurringHookIntroContent.kt:59)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer3, i4).getXrayLight(), null, 2, null), bentoTheme.getSpacing(composer3, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    Screen screen = eventScreen;
                    com.robinhood.rosetta.eventlogging.Context context3 = eventContext;
                    Context context4 = context2;
                    Function0<Unit> function0 = onProceed;
                    Function0<Unit> function02 = onDismiss;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i4).m21593getSmallD9Ej5fM(), 7, null), 0.0f, 1, null);
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, new UserInteractionEventDescriptor(null, screen, UserInteractionEventData.Action.CONTINUE, context3, new Component(componentType, null, null, 6, null), null, 33, null), true, false, false, true, false, null, 108, null);
                    String string2 = context4.getString(C25982R.string.recs_recurring_hook_intro_primary_cta);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, string2, modifierAutoLogEvents$default, null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer3, 24576, 0, 8168);
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i4).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null), new UserInteractionEventDescriptor(null, screen, UserInteractionEventData.Action.DISMISS, context3, new Component(componentType, null, null, 6, null), null, 33, null), true, false, false, true, false, null, 108, null);
                    String string3 = context4.getString(C25982R.string.recs_recurring_hook_intro_dismiss_cta);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, string3, modifierAutoLogEvents$default2, null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer3, 24576, 0, 8168);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            };
            context2 = context2;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-387343024, true, function2, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1550164166, true, new C259913(context2), composerStartRestartGroup, 54), composer2, 805306800, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecommendationsRecurringHookIntroContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecommendationsRecurringHookIntroContent3.RecurringHookContent$lambda$0(context2, onProceed, onDismiss, eventScreen, eventContext, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RecommendationsRecurringHookIntroContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecommendationsRecurringHookIntroContentKt$RecurringHookContent$3 */
    static final class C259913 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;

        C259913(Context context) {
            this.$context = context;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
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
                ComposerKt.traceEventStart(1550164166, i2, -1, "com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecurringHookContent.<anonymous> (RecommendationsRecurringHookIntroContent.kt:103)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierPadding = PaddingKt.padding(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i3).getXrayLight(), null, 2, null), paddingValues);
            Context context = this.$context;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.RECS_RET_RECURRING_HOOK.getUrl().getUrl())), null, null, null, null, null, composer, 0, 62);
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(invoke$lambda$5$lambda$4$lambda$0(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, 1, null, false, false, composer, 1572864, 958);
            Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.4f, false, 2, null), 1.0f, false, 2, null);
            LottieComposition lottieCompositionInvoke$lambda$5$lambda$4$lambda$0 = invoke$lambda$5$lambda$4$lambda$0(lottieCompositionResultRememberLottieComposition);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecommendationsRecurringHookIntroContentKt$RecurringHookContent$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(RecommendationsRecurringHookIntroContent3.C259913.invoke$lambda$5$lambda$4$lambda$1(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LottieAnimation2.LottieAnimation(lottieCompositionInvoke$lambda$5$lambda$4$lambda$0, (Function0) objRememberedValue, modifierAspectRatio$default, false, false, false, null, false, null, null, null, false, false, null, null, false, composer, 0, 0, 65528);
            String string2 = context.getString(C25982R.string.recs_recurring_hook_intro_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge();
            Color.Companion companion4 = Color.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(string2, companion, Color.m6701boximpl(companion4.m6716getBlack0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 432, 0, 8184);
            String string3 = context.getString(C25982R.string.recs_recurring_hook_intro_subtitle);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            BentoText2.m20747BentoText38GnDrw(string3, companion, Color.m6701boximpl(companion4.m6716getBlack0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 432, 0, 8184);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 0.1f, false, 2, null), composer, 0);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        private static final LottieComposition invoke$lambda$5$lambda$4$lambda$0(LottieCompositionResult lottieCompositionResult) {
            return lottieCompositionResult.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$5$lambda$4$lambda$1(LottieAnimationState lottieAnimationState) {
            return lottieAnimationState.getValue().floatValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }
}
