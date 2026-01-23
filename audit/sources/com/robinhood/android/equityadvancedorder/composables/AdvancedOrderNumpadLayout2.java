package com.robinhood.android.equityadvancedorder.composables;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderNumpadButtonState;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderNumpadState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvancedOrderNumpadLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$AdvancedOrderKeyboardV2$1$3, reason: use source file name */
/* loaded from: classes3.dex */
final class AdvancedOrderNumpadLayout2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BentoNumpadScopeV22 $bentoNumpadScopeV2Impl;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ EquityAdvancedOrderNumpadState $numpadState;
    final /* synthetic */ Function0<Unit> $primaryButtonOnClick;
    final /* synthetic */ Resources $resources;
    final /* synthetic */ AnimatedContentScope $this_AdvancedOrderKeyboardV2;
    final /* synthetic */ Function0<Unit> $twentyFourHourButtonOnClick;

    AdvancedOrderNumpadLayout2(EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState, Function0<Unit> function0, FocusManager focusManager, Function0<Unit> function02, Resources resources, AnimatedContentScope animatedContentScope, BentoNumpadScopeV22 bentoNumpadScopeV22) {
        this.$numpadState = equityAdvancedOrderNumpadState;
        this.$twentyFourHourButtonOnClick = function0;
        this.$focusManager = focusManager;
        this.$primaryButtonOnClick = function02;
        this.$resources = resources;
        this.$this_AdvancedOrderKeyboardV2 = animatedContentScope;
        this.$bentoNumpadScopeV2Impl = bentoNumpadScopeV22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$10$lambda$7$lambda$6(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$10$lambda$9$lambda$8(int i) {
        return (int) (i * 1.25d);
    }

    public final void invoke(Composer composer, int i) {
        Easing easing;
        int i2;
        int i3;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1114760885, i, -1, "com.robinhood.android.equityadvancedorder.composables.AdvancedOrderKeyboardV2.<anonymous>.<anonymous> (AdvancedOrderNumpadLayout.kt:184)");
        }
        EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState = this.$numpadState;
        final Function0<Unit> function0 = this.$twentyFourHourButtonOnClick;
        final FocusManager focusManager = this.$focusManager;
        final Function0<Unit> function02 = this.$primaryButtonOnClick;
        Resources resources = this.$resources;
        AnimatedContentScope animatedContentScope = this.$this_AdvancedOrderKeyboardV2;
        BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$bentoNumpadScopeV2Impl;
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
        if (equityAdvancedOrderNumpadState.getShowTwentyFourHourButton()) {
            composer.startReplaceGroup(1828773687);
            boolean z = equityAdvancedOrderNumpadState.getPrimaryButtonState().getState() == EquityAdvancedOrderNumpadButtonState.ButtonState.LOADING;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$AdvancedOrderKeyboardV2$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvancedOrderNumpadLayout2.invoke$lambda$10$lambda$1$lambda$0(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function03 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(focusManager) | composer.changed(function02);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$AdvancedOrderKeyboardV2$1$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvancedOrderNumpadLayout2.invoke$lambda$10$lambda$3$lambda$2(focusManager, function02);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            i3 = 6;
            boolean z2 = z;
            easing = null;
            i2 = 0;
            TwentyFourHourMarketReviewComposable.TwentyFourHourMarketReviewComposable(z2, function03, (Function0) objRememberedValue2, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), composer, 0, 0);
            composer.endReplaceGroup();
        } else {
            easing = null;
            i2 = 0;
            i3 = 6;
            composer.startReplaceGroup(1829498591);
            StringResource buttonText = equityAdvancedOrderNumpadState.getPrimaryButtonState().getButtonText();
            Intrinsics.checkNotNull(resources);
            BentoButtonState bentoButtonState = new BentoButtonState(buttonText.getText(resources).toString(), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, equityAdvancedOrderNumpadState.getPrimaryButtonState().getState().getEnabled(), equityAdvancedOrderNumpadState.getPrimaryButtonState().getState().getLoading(), (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2022, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(focusManager) | composer.changed(function02);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$AdvancedOrderKeyboardV2$1$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvancedOrderNumpadLayout2.invoke$lambda$10$lambda$5$lambda$4(focusManager, function02);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BentoButtonKt.BentoButton(bentoButtonState, (Function0<Unit>) objRememberedValue3, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, composer, 6, 1), (String) null, composer, BentoButtonState.$stable, 8);
            composer.endReplaceGroup();
        }
        boolean showKeyboardDelimiter = equityAdvancedOrderNumpadState.getShowKeyboardDelimiter();
        Modifier modifierTestTag = TestTag3.testTag(companion, AdvancedOrderNumpadLayout.KEYPAD_TEST_TAG);
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, i2, easing, i3, easing);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$AdvancedOrderKeyboardV2$1$3$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AdvancedOrderNumpadLayout2.invoke$lambda$10$lambda$7$lambda$6(((Integer) obj).intValue()));
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        EnterTransition enterTransitionSlideInVertically = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue4);
        TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(300, i2, easing, i3, easing);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion3.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$AdvancedOrderKeyboardV2$1$3$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AdvancedOrderNumpadLayout2.invoke$lambda$10$lambda$9$lambda$8(((Integer) obj).intValue()));
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        bentoNumpadScopeV22.BentoNumpadOnly(AnimatedVisibilityScope.animateEnterExit$default(animatedContentScope, modifierTestTag, enterTransitionSlideInVertically, EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) objRememberedValue5), null, 4, null), false, showKeyboardDelimiter, false, null, composer, BentoNumpadScopeV22.$stable << 15, 26);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$3$lambda$2(FocusManager focusManager, Function0 function0) {
        focusManager.clearFocus(true);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$5$lambda$4(FocusManager focusManager, Function0 function0) {
        focusManager.clearFocus(true);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
