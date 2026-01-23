package com.robinhood.android.jointaccounts.onboarding;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreen4;
import com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset;
import com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCta;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountCelebrationPageViewModel;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: JointAccountCelebrationScreen.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a-\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001ab\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00070\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0007¢\u0006\u0002\u0010\u0018\u001a5\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001e\u001a^\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!2#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00070\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010#\u001a\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020,H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006.²\u0006\n\u0010/\u001a\u000200X\u008a\u008e\u0002"}, m3636d2 = {"CelebrationScreenTextSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "toCelebrationScreenState", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenState;", "Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountCelebrationPageViewModel;", "ActionHandlingJointAccountCelebrationScreen", "", "viewModel", "onDismissClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/jointaccounts/api/onboarding/ApiJointAccountCelebrationPageViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "JointAccountCelebrationContent", "state", "onPrimaryCtaClicked", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "deeplinkTemplate", "onCloseClicked", "onSecondaryCtaClicked", "(Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CelebrationText", "title", CarResultComposable2.BODY, "textStyleData", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenTextStyleData;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenTextStyleData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CelebrationCtas", "primaryCta", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;", "secondaryCta", "(Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "slideInVerticallyAnimation", "Landroidx/compose/animation/EnterTransition;", "fadeInAnimation", "fadeOutAnimation", "Landroidx/compose/animation/ExitTransition;", "celebrationAnimationTransitionSpec", "Landroidx/compose/animation/ContentTransform;", "slideInVertically", "", "shouldAnimate", "feature-joint-account-onboarding_externalDebug", "textState", "Lcom/robinhood/android/jointaccounts/onboarding/TextState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class JointAccountCelebrationScreen4 {
    private static final float CelebrationScreenTextSpacing = C2002Dp.m7995constructorimpl(12);
    private static final EnterTransition slideInVerticallyAnimation = EnterExitTransitionKt.slideInVertically(new TweenSpec(1133, 1000, new CubicBezierEasing(0.0f, 0.0f, 0.0f, 1.0f)), new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Integer.valueOf(JointAccountCelebrationScreen4.slideInVerticallyAnimation$lambda$17(((Integer) obj).intValue()));
        }
    });
    private static final EnterTransition fadeInAnimation = EnterExitTransitionKt.fadeIn$default(new TweenSpec(1133, 1000, new CubicBezierEasing(0.17f, 0.17f, 0.83f, 0.83f)), 0.0f, 2, null);
    private static final ExitTransition fadeOutAnimation = EnterExitTransitionKt.fadeOut$default(new TweenSpec(1000, 0, null, 6, null), 0.0f, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionHandlingJointAccountCelebrationScreen$lambda$0(ApiJointAccountCelebrationPageViewModel apiJointAccountCelebrationPageViewModel, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ActionHandlingJointAccountCelebrationScreen(apiJointAccountCelebrationPageViewModel, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CelebrationCtas$lambda$16(JointAccountCta jointAccountCta, JointAccountCta jointAccountCta2, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CelebrationCtas(jointAccountCta, jointAccountCta2, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CelebrationText$lambda$10(String str, String str2, JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CelebrationText(str, str2, jointAccountCelebrationScreenTextStyleData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JointAccountCelebrationContent$lambda$6(JointAccountCelebrationScreenState jointAccountCelebrationScreenState, Function1 function1, Function0 function0, Modifier modifier, Function0 function02, int i, int i2, Composer composer, int i3) {
        JointAccountCelebrationContent(jointAccountCelebrationScreenState, function1, function0, modifier, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int slideInVerticallyAnimation$lambda$17(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JointAccountCelebrationScreenState toCelebrationScreenState(ApiJointAccountCelebrationPageViewModel apiJointAccountCelebrationPageViewModel) {
        return new JointAccountCelebrationScreenState(apiJointAccountCelebrationPageViewModel.getTitle_text(), apiJointAccountCelebrationPageViewModel.getBody_text(), JointAccountOnboardingAsset.Hero.Confirmation.INSTANCE, new JointAccountCta(apiJointAccountCelebrationPageViewModel.getCta_text(), apiJointAccountCelebrationPageViewModel.getCta_identifier(), null, 4, null), null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextState JointAccountCelebrationContent$lambda$4(SnapshotState<TextState> snapshotState) {
        return snapshotState.getValue();
    }

    public static final void ActionHandlingJointAccountCelebrationScreen(final ApiJointAccountCelebrationPageViewModel viewModel, final Function0<Unit> onDismissClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1718011037);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1718011037, i3, -1, "com.robinhood.android.jointaccounts.onboarding.ActionHandlingJointAccountCelebrationScreen (JointAccountCelebrationScreen.kt:87)");
            }
            GenericActionHandlerKt.GenericActionHandler(null, false, onDismissClicked, null, ComposableLambda3.rememberComposableLambda(918284021, true, new C200011(viewModel, onDismissClicked, modifier3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & 896) | 24576, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountCelebrationScreen4.ActionHandlingJointAccountCelebrationScreen$lambda$0(viewModel, onDismissClicked, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: JointAccountCelebrationScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$ActionHandlingJointAccountCelebrationScreen$1 */
    static final class C200011 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onDismissClicked;
        final /* synthetic */ ApiJointAccountCelebrationPageViewModel $viewModel;

        C200011(ApiJointAccountCelebrationPageViewModel apiJointAccountCelebrationPageViewModel, Function0<Unit> function0, Modifier modifier) {
            this.$viewModel = apiJointAccountCelebrationPageViewModel;
            this.$onDismissClicked = function0;
            this.$modifier = modifier;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(918284021, i, -1, "com.robinhood.android.jointaccounts.onboarding.ActionHandlingJointAccountCelebrationScreen.<anonymous> (JointAccountCelebrationScreen.kt:91)");
            }
            final SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer, 0);
            JointAccountCelebrationScreenState celebrationScreenState = JointAccountCelebrationScreen4.toCelebrationScreenState(this.$viewModel);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(sduiActionHandlerCurrentActionHandler) | composer.changedInstance(this.$viewModel);
            final ApiJointAccountCelebrationPageViewModel apiJointAccountCelebrationPageViewModel = this.$viewModel;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$ActionHandlingJointAccountCelebrationScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return JointAccountCelebrationScreen4.C200011.invoke$lambda$1$lambda$0(sduiActionHandlerCurrentActionHandler, apiJointAccountCelebrationPageViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            JointAccountCelebrationScreen4.JointAccountCelebrationContent(celebrationScreenState, (Function1) objRememberedValue, this.$onDismissClicked, this.$modifier, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SduiActionHandler sduiActionHandler, ApiJointAccountCelebrationPageViewModel apiJointAccountCelebrationPageViewModel, String str) {
            sduiActionHandler.mo15941handle(apiJointAccountCelebrationPageViewModel.getCta_action());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: JointAccountCelebrationScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$JointAccountCelebrationContent$2 */
    static final class C200022 implements Function4<Column5, Float, Composer, Integer, Unit> {
        final /* synthetic */ Function1<String, Unit> $onPrimaryCtaClicked;
        final /* synthetic */ Function0<Unit> $onSecondaryCtaClicked;
        final /* synthetic */ JointAccountCelebrationScreenState $state;
        final /* synthetic */ SnapshotState<TextState> $textState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C200022(JointAccountCelebrationScreenState jointAccountCelebrationScreenState, SnapshotState<TextState> snapshotState, Function1<? super String, Unit> function1, Function0<Unit> function0) {
            this.$state = jointAccountCelebrationScreenState;
            this.$textState$delegate = snapshotState;
            this.$onPrimaryCtaClicked = function1;
            this.$onSecondaryCtaClicked = function0;
        }

        public final void invoke(Column5 JointAccountMotionContainer, Float f, Composer composer, int i) {
            int i2;
            int i3;
            Integer textAnimationFrame;
            Intrinsics.checkNotNullParameter(JointAccountMotionContainer, "$this$JointAccountMotionContainer");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(JointAccountMotionContainer) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(f) ? 32 : 16;
            }
            if ((i2 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1970555353, i2, -1, "com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationContent.<anonymous> (JointAccountCelebrationScreen.kt:126)");
            }
            float fFloatValue = f != null ? f.floatValue() : 0.0f;
            final JointAccountCelebrationScreenAnimationData animationData = this.$state.getAnimationData();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(ScrollKt.verticalScroll$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Column5.weight$default(JointAccountMotionContainer, companion, 1.0f, false, 2, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            JointAccountCelebrationScreenState jointAccountCelebrationScreenState = this.$state;
            SnapshotState<TextState> snapshotState = this.$textState$delegate;
            final Function1<String, Unit> function1 = this.$onPrimaryCtaClicked;
            final Function0<Unit> function0 = this.$onSecondaryCtaClicked;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierNavigationBarsPadding);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer.startReplaceGroup(-992022637);
            float f2 = fFloatValue + 60;
            if (f2 >= ((animationData == null || (textAnimationFrame = animationData.getTextAnimationFrame()) == null) ? 0 : textAnimationFrame.intValue())) {
                TextState textState = new TextState(jointAccountCelebrationScreenState.getTitleText(), jointAccountCelebrationScreenState.getBodyText(), jointAccountCelebrationScreenState.getTextStyleData());
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(textState);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new JointAccountCelebrationScreen5(textState, snapshotState, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                i3 = 0;
                EffectsKt.LaunchedEffect(textState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 0);
            } else {
                i3 = 0;
            }
            composer.endReplaceGroup();
            TextState textStateJointAccountCelebrationContent$lambda$4 = JointAccountCelebrationScreen4.JointAccountCelebrationContent$lambda$4(snapshotState);
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(animationData);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$JointAccountCelebrationContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return JointAccountCelebrationScreen4.C200022.invoke$lambda$5$lambda$2$lambda$1(animationData, (AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(textStateJointAccountCelebrationContent$lambda$4, null, (Function1) objRememberedValue2, null, "celebration-text-animation", null, JointAccountCelebrationScreen.INSTANCE.m2142xff95276b(), composer, 1597440, 42);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, i3);
            Tuples2 tuples2 = ((animationData != null ? animationData.getCtaAnimationFrame() : null) == null || f2 > ((float) animationData.getCtaAnimationFrame().intValue())) ? new Tuples2(jointAccountCelebrationScreenState.getPrimaryCta(), jointAccountCelebrationScreenState.getSecondaryCta()) : new Tuples2(null, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged3 = composer.changed(animationData);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$JointAccountCelebrationContent$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return JointAccountCelebrationScreen4.C200022.invoke$lambda$5$lambda$4$lambda$3(animationData, (AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(tuples2, null, (Function1) objRememberedValue3, null, "celebration-cta-animation", null, ComposableLambda3.rememberComposableLambda(383976185, true, new Function4<AnimatedContentScope, Tuples2<? extends JointAccountCta, ? extends JointAccountCta>, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$JointAccountCelebrationContent$2$1$4
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Tuples2<? extends JointAccountCta, ? extends JointAccountCta> tuples22, Composer composer2, Integer num) {
                    invoke(animatedContentScope, (Tuples2<JointAccountCta, JointAccountCta>) tuples22, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, Tuples2<JointAccountCta, JointAccountCta> destruct$, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(destruct$, "$destruct$");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(383976185, i4, -1, "com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationContent.<anonymous>.<anonymous>.<anonymous> (JointAccountCelebrationScreen.kt:176)");
                    }
                    JointAccountCelebrationScreen4.CelebrationCtas(destruct$.component1(), destruct$.component2(), function1, function0, null, composer2, 0, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 1597440, 42);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Float f, Composer composer, Integer num) {
            invoke(column5, f, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final ContentTransform invoke$lambda$5$lambda$2$lambda$1(JointAccountCelebrationScreenAnimationData jointAccountCelebrationScreenAnimationData, AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return JointAccountCelebrationScreen4.celebrationAnimationTransitionSpec(((TextState) AnimatedContent.getTargetState()).getTitle() != null, jointAccountCelebrationScreenAnimationData != null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$5$lambda$4$lambda$3(JointAccountCelebrationScreenAnimationData jointAccountCelebrationScreenAnimationData, AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return JointAccountCelebrationScreen4.celebrationAnimationTransitionSpec(true, jointAccountCelebrationScreenAnimationData != null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void JointAccountCelebrationContent(final JointAccountCelebrationScreenState state, final Function1<? super String, Unit> onPrimaryCtaClicked, final Function0<Unit> onCloseClicked, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        Function0<Unit> function03;
        Object objRememberedValue;
        final Modifier modifier3;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onPrimaryCtaClicked, "onPrimaryCtaClicked");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1621299366);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryCtaClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClicked) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function03 = (Function0) objRememberedValue2;
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1621299366, i3, -1, "com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationContent (JointAccountCelebrationScreen.kt:116)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(new TextState(null, null, null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    JointAccountOnboardingAsset asset = state.getAsset();
                    boolean showCloseButton = state.getShowCloseButton();
                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
                    JointAccountCelebrationScreenAnimationData animationData = state.getAnimationData();
                    Integer animationLoopEndFrame = animationData == null ? animationData.getAnimationLoopEndFrame() : null;
                    JointAccountCelebrationScreenAnimationData animationData2 = state.getAnimationData();
                    JointAccountMotionContainer.JointAccountMotionContainer(asset, showCloseButton, onCloseClicked, modifierLogScreenTransitions$default, animationData2 != null ? animationData2.getAnimationLoopStartFrame() : null, animationLoopEndFrame, ComposableLambda3.rememberComposableLambda(1970555353, true, new C200022(state, snapshotState, onPrimaryCtaClicked, function03), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 896) | 1572864, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function04 = function03;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return JointAccountCelebrationScreen4.JointAccountCelebrationContent$lambda$6(state, onPrimaryCtaClicked, onCloseClicked, modifier3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function02 = function0;
            if ((i3 & 9363) != 9362) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                JointAccountOnboardingAsset asset2 = state.getAsset();
                boolean showCloseButton2 = state.getShowCloseButton();
                Modifier modifierLogScreenTransitions$default2 = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
                JointAccountCelebrationScreenAnimationData animationData3 = state.getAnimationData();
                if (animationData3 == null) {
                }
                JointAccountCelebrationScreenAnimationData animationData22 = state.getAnimationData();
                JointAccountMotionContainer.JointAccountMotionContainer(asset2, showCloseButton2, onCloseClicked, modifierLogScreenTransitions$default2, animationData22 != null ? animationData22.getAnimationLoopStartFrame() : null, animationLoopEndFrame, ComposableLambda3.rememberComposableLambda(1970555353, true, new C200022(state, snapshotState2, onPrimaryCtaClicked, function03), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 896) | 1572864, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                function04 = function03;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CelebrationText(final String str, final String str2, final JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1338236961);
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
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(jointAccountCelebrationScreenTextStyleData) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            } else {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1338236961, i3, -1, "com.robinhood.android.jointaccounts.onboarding.CelebrationText (JointAccountCelebrationScreen.kt:193)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(211702920);
                if (str != null) {
                    modifier3 = modifier5;
                } else {
                    TextStyle titleStyle = jointAccountCelebrationScreenTextStyleData != null ? jointAccountCelebrationScreenTextStyleData.getTitleStyle() : null;
                    composerStartRestartGroup.startReplaceGroup(211705723);
                    if (titleStyle == null) {
                        titleStyle = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleLarge();
                    }
                    TextStyle textStyle = titleStyle;
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                    BentoText2.m20747BentoText38GnDrw(str, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, jointAccountCelebrationScreenTextStyleData != null ? jointAccountCelebrationScreenTextStyleData.m15763getTitleAndBodySpacingD9Ej5fM() : CelebrationScreenTextSpacing, 7, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composerStartRestartGroup, 0, 0, 8124);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(211718146);
                if (str2 != null) {
                    BentoText2.m20747BentoText38GnDrw(str2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composerStartRestartGroup, 48, 0, 8124);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return JointAccountCelebrationScreen4.CelebrationText$lambda$10(str, str2, jointAccountCelebrationScreenTextStyleData, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(211702920);
                if (str != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(211718146);
                if (str2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CelebrationCtas(final JointAccountCta jointAccountCta, final JointAccountCta jointAccountCta2, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        float f;
        Modifier modifier3;
        Object obj;
        int i5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(29361883);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(jointAccountCta) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(jointAccountCta2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                } else {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(29361883, i3, -1, "com.robinhood.android.jointaccounts.onboarding.CelebrationCtas (JointAccountCelebrationScreen.kt:228)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier5, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-846814595);
                    if (jointAccountCta != null) {
                        modifier3 = modifier5;
                        f = 0.0f;
                        obj = null;
                        i5 = 1;
                    } else {
                        BentoButtons.Type type2 = BentoButtons.Type.Primary;
                        String title = jointAccountCta.getTitle();
                        Modifier modifier6 = modifier5;
                        f = 0.0f;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.BUTTON, jointAccountCta.getLoggingIdentifier(), false, composerStartRestartGroup, 54, 4), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged = composerStartRestartGroup.changed(jointAccountCta) | ((i3 & 896) == 256);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return JointAccountCelebrationScreen4.CelebrationCtas$lambda$15$lambda$13$lambda$12$lambda$11(function1, jointAccountCta);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier6;
                        obj = null;
                        i5 = 1;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, title, modifierFillMaxWidth$default2, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-846798745);
                    if (jointAccountCta2 != null) {
                        Composer composer2 = composerStartRestartGroup;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, jointAccountCta2.getTitle(), SizeKt.fillMaxWidth$default(UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.BUTTON, jointAccountCta2.getLoggingIdentifier(), false, composerStartRestartGroup, 54, 4), f, i5, obj), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer2, ((i3 >> 9) & 14) | 24576, 0, 8168);
                        composerStartRestartGroup = composer2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return JointAccountCelebrationScreen4.CelebrationCtas$lambda$16(jointAccountCta, jointAccountCta2, function1, function0, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier5, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-846814595);
                    if (jointAccountCta != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-846798745);
                    if (jointAccountCta2 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CelebrationCtas$lambda$15$lambda$13$lambda$12$lambda$11(Function1 function1, JointAccountCta jointAccountCta) {
        function1.invoke(jointAccountCta.getDeeplinkTemplate());
        return Unit.INSTANCE;
    }

    static /* synthetic */ ContentTransform celebrationAnimationTransitionSpec$default(boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return celebrationAnimationTransitionSpec(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform celebrationAnimationTransitionSpec(boolean z, boolean z2) {
        if (!z2) {
            return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
        }
        if (z) {
            return AnimatedContentKt.togetherWith(slideInVerticallyAnimation.plus(fadeInAnimation), fadeOutAnimation);
        }
        return AnimatedContentKt.togetherWith(fadeInAnimation, fadeOutAnimation);
    }
}
