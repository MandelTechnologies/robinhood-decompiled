package com.robinhood.android.support.supporthub;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import androidx.media3.exoplayer.ExoPlayer;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.support.C39996R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$invoke$$inlined$ConstraintLayout$1 */
/* loaded from: classes9.dex */
public final class C29023xdcf091af extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ SnapshotState $currentSubtitle$delegate$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ ExoPlayer $exoPlayer$inlined;
    final /* synthetic */ boolean $loadingVisible$inlined;
    final /* synthetic */ Function0 $onClickContinue$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ SnapshotState $videoEnd$delegate$inlined;
    final /* synthetic */ SnapshotState $videoLoading$delegate$inlined;
    final /* synthetic */ SnapshotState $videoPlaying$delegate$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29023xdcf091af(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, Context context, ExoPlayer exoPlayer, boolean z, SnapshotState snapshotState4, SnapshotState snapshotState5, SnapshotState snapshotState6, Function0 function0, SnapshotState snapshotState7) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$context$inlined = context;
        this.$exoPlayer$inlined = exoPlayer;
        this.$loadingVisible$inlined = z;
        this.$videoEnd$delegate$inlined = snapshotState4;
        this.$videoPlaying$delegate$inlined = snapshotState5;
        this.$currentSubtitle$delegate$inlined = snapshotState6;
        this.$onClickContinue$inlined = function0;
        this.$videoLoading$delegate$inlined = snapshotState7;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [androidx.compose.animation.core.Easing, androidx.compose.animation.core.FiniteAnimationSpec, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    public final void invoke(Composer composer, int i) {
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        Composer composer2;
        ConstraintLayoutScope constraintLayoutScope;
        float f;
        Modifier.Companion companion;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        int i2;
        ?? r13;
        ?? r15;
        String strConciergeWelcomeVideo$lambda$47;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(Unit.INSTANCE);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        composer.startReplaceGroup(509153946);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(LocalShowPlaceholder.withBentoPlaceholder$default(companion2, false, null, 3, null), 0.0f, 1, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$1$1.INSTANCE;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierFillMaxWidth$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$exoPlayer$inlined) | composer.changedInstance(this.$context$inlined);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$2$1(this.$context$inlined, this.$exoPlayer$inlined);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifierConstrainAs, null, composer, 0, 4);
        Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), AnimationSpecKt.tween$default(1000, 500, null, 4, null), null, 2, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(constraintLayoutBaseScope4Component1);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$3$1(constraintLayoutBaseScope4Component1, this.$videoEnd$delegate$inlined);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(modifierAnimateContentSize$default, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue3);
        Brush.Companion companion4 = Brush.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        Modifier modifierBackground$default = Background3.background$default(modifierConstrainAs2, Brush.Companion.m6682verticalGradient8A3gB4$default(companion4, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i3).getJet(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i3).getJet(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
        Alignment.Companion companion5 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierBackground$default);
        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion6.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Spacer2.Spacer(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), composer, 6);
        composer.endNode();
        composer.startReplaceGroup(293588618);
        if (!ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$38(this.$videoPlaying$delegate$inlined) || (strConciergeWelcomeVideo$lambda$47 = ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$47(this.$currentSubtitle$delegate$inlined)) == null) {
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
            composer2 = composer;
            constraintLayoutScope = constraintLayoutScope2;
            f = 0.0f;
            companion = companion2;
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component4;
            i2 = 1849434622;
            r13 = 0;
            r15 = 1;
        } else {
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component1);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion3.getEmpty()) {
                objRememberedValue4 = new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$5$1$1(constraintLayoutBaseScope4Component1);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue4), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion5.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            float f2 = 100;
            constraintLayoutScope = constraintLayoutScope2;
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
            companion = companion2;
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component4;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_video_vlad, composer, 0), androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(Background3.m4871backgroundbw27NRU(column6.align(companion2, companion5.getCenterHorizontally()), bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2))), C2002Dp.m7995constructorimpl((float) 0.5d), bentoTheme.getColors(composer, i3).m21427getFg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2))), C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl(2)), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i3).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 8120);
            r13 = 0;
            f = 0.0f;
            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 200, null, 4, null), 0.0f, 2, null);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 200, null, 4, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion3.getEmpty()) {
                objRememberedValue5 = C29038x64520.INSTANCE;
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            EnterTransition enterTransitionPlus = enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue5));
            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(200, 0, null, 6, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == companion3.getEmpty()) {
                objRememberedValue6 = C29039x648e1.INSTANCE;
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            i2 = 1849434622;
            r15 = 1;
            AnimatedVisibilityKt.AnimatedVisibility((Column5) column6, true, (Modifier) null, enterTransitionPlus, exitTransitionFadeOut$default.plus(EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) objRememberedValue6)), (String) null, (Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(1767609128, true, new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$5$2$3(strConciergeWelcomeVideo$lambda$47), composer, 54), composer, 1600566, 18);
            composer2 = composer;
            composer2.endNode();
        }
        composer2.endReplaceGroup();
        Modifier.Companion companion7 = companion;
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion7, f, r15, r13);
        composer2.startReplaceGroup(i2);
        Object objRememberedValue7 = composer2.rememberedValue();
        if (objRememberedValue7 == companion3.getEmpty()) {
            objRememberedValue7 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$6$1.INSTANCE;
            composer2.updateRememberedValue(objRememberedValue7);
        }
        composer2.endReplaceGroup();
        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
        Modifier modifierConstrainAs3 = constraintLayoutScope3.constrainAs(modifierFillMaxWidth$default2, constraintLayoutBaseScope4, (Function1) objRememberedValue7);
        boolean zConciergeWelcomeVideo$lambda$41 = ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$41(this.$videoEnd$delegate$inlined);
        composer2.startReplaceGroup(i2);
        Object objRememberedValue8 = composer2.rememberedValue();
        if (objRememberedValue8 == companion3.getEmpty()) {
            objRememberedValue8 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$7$1.INSTANCE;
            composer2.updateRememberedValue(objRememberedValue8);
        }
        composer2.endReplaceGroup();
        EnterTransition enterTransitionPlus2 = EnterExitTransitionKt.slideInVertically$default(r13, (Function1) objRememberedValue8, r15, r13).plus(EnterExitTransitionKt.fadeIn$default(r13, f, 3, r13));
        composer2.startReplaceGroup(i2);
        Object objRememberedValue9 = composer2.rememberedValue();
        if (objRememberedValue9 == companion3.getEmpty()) {
            objRememberedValue9 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$8$1.INSTANCE;
            composer2.updateRememberedValue(objRememberedValue9);
        }
        composer2.endReplaceGroup();
        ExitTransition exitTransitionPlus = EnterExitTransitionKt.slideOutVertically$default(r13, (Function1) objRememberedValue9, r15, r13).plus(EnterExitTransitionKt.fadeOut$default(r13, f, 3, r13));
        ComposableSingletons$ConciergeOnboardingComposableKt composableSingletons$ConciergeOnboardingComposableKt = ComposableSingletons$ConciergeOnboardingComposableKt.INSTANCE;
        AnimatedVisibilityKt.AnimatedVisibility(zConciergeWelcomeVideo$lambda$41, modifierConstrainAs3, enterTransitionPlus2, exitTransitionPlus, (String) null, composableSingletons$ConciergeOnboardingComposableKt.getLambda$881661233$feature_support_externalRelease(), composer2, 200064, 16);
        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion7, f, r15, r13);
        composer2.startReplaceGroup(i2);
        Object objRememberedValue10 = composer2.rememberedValue();
        if (objRememberedValue10 == companion3.getEmpty()) {
            objRememberedValue10 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$9$1.INSTANCE;
            composer2.updateRememberedValue(objRememberedValue10);
        }
        composer2.endReplaceGroup();
        Modifier modifierConstrainAs4 = constraintLayoutScope3.constrainAs(modifierFillMaxWidth$default3, constraintLayoutBaseScope42, (Function1) objRememberedValue10);
        boolean zConciergeWelcomeVideo$lambda$412 = ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$41(this.$videoEnd$delegate$inlined);
        EnterTransition enterTransitionFadeIn$default2 = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(600, 200, r13, 4, r13), f, 2, r13);
        TweenSpec tweenSpecTween$default3 = AnimationSpecKt.tween$default(600, 200, r13, 4, r13);
        composer2.startReplaceGroup(i2);
        Object objRememberedValue11 = composer2.rememberedValue();
        if (objRememberedValue11 == companion3.getEmpty()) {
            objRememberedValue11 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$10$1.INSTANCE;
            composer2.updateRememberedValue(objRememberedValue11);
        }
        composer2.endReplaceGroup();
        EnterTransition enterTransitionPlus3 = enterTransitionFadeIn$default2.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default3, (Function1) objRememberedValue11));
        ExitTransition exitTransitionFadeOut$default2 = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, r13, 6, r13), f, 2, r13);
        TweenSpec tweenSpecTween$default4 = AnimationSpecKt.tween$default(300, 0, r13, 6, r13);
        composer2.startReplaceGroup(i2);
        Object objRememberedValue12 = composer2.rememberedValue();
        if (objRememberedValue12 == companion3.getEmpty()) {
            objRememberedValue12 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$11$1.INSTANCE;
            composer2.updateRememberedValue(objRememberedValue12);
        }
        composer2.endReplaceGroup();
        AnimatedVisibilityKt.AnimatedVisibility(zConciergeWelcomeVideo$lambda$412, modifierConstrainAs4, enterTransitionPlus3, exitTransitionFadeOut$default2.plus(EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default4, (Function1) objRememberedValue12)), (String) null, ComposableLambda3.rememberComposableLambda(2049317736, r15, new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$12(this.$exoPlayer$inlined, this.$onClickContinue$inlined, this.$videoPlaying$delegate$inlined, this.$videoEnd$delegate$inlined, this.$videoLoading$delegate$inlined), composer2, 54), composer2, 200064, 16);
        AnimatedVisibilityKt.AnimatedVisibility(this.$loadingVisible$inlined, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 0, r13, 6, r13), f, 2, r13), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(1000, 0, r13, 6, r13), f, 2, r13), (String) null, composableSingletons$ConciergeOnboardingComposableKt.m19096getLambda$416443223$feature_support_externalRelease(), composer, 200064, 18);
        Boolean boolValueOf = Boolean.valueOf(this.$loadingVisible$inlined);
        composer.startReplaceGroup(-1746271574);
        boolean zChanged3 = composer.changed(this.$loadingVisible$inlined) | composer.changedInstance(this.$exoPlayer$inlined);
        Object objRememberedValue13 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue13 == companion3.getEmpty()) {
            objRememberedValue13 = new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$13$1(this.$loadingVisible$inlined, this.$exoPlayer$inlined, 1000, r13);
            composer.updateRememberedValue(objRememberedValue13);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composer, 0);
        composer.endReplaceGroup();
        boolean zChangedInstance2 = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope4 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue14 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue14 == companion3.getEmpty()) {
            objRememberedValue14 = new Function0<Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$invoke$$inlined$ConstraintLayout$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope4.getContainerObject().mo8187clone());
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue14);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue14, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
