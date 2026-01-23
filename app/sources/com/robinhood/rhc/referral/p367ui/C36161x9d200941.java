package com.robinhood.rhc.referral.p367ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rhc.referral.p367ui.RewardCardComposableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$1 */
/* loaded from: classes26.dex */
public final class C36161x9d200941 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ RewardCardComposableState.Action $action$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Alignment $imageAlignment$inlined;
    final /* synthetic */ Modifier $imageModifier$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ RewardCardComposableState $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36161x9d200941(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, RewardCardComposableState rewardCardComposableState, RewardCardComposableState.Action action, Modifier modifier, Alignment alignment) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$state$inlined = rewardCardComposableState;
        this.$action$inlined = action;
        this.$imageModifier$inlined = modifier;
        this.$imageAlignment$inlined = alignment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Modifier modifier;
        float f;
        boolean z;
        boolean z2;
        float f2;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
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
        ConstraintLayoutScope constraintLayoutScope = this.$scope;
        composer.startReplaceGroup(-1777558516);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope.createGuidelineFromEnd(0.3f);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM();
        float fM21595getXsmallD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM();
        float fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM();
        String subtitle = this.$state$inlined.getSubtitle();
        boolean z3 = false;
        if (subtitle != null && !StringsKt.isBlank(subtitle) && !Intrinsics.areEqual(this.$state$inlined.getSubtitle(), "&nbsp;")) {
            z3 = true;
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(fM21592getMediumD9Ej5fM) | composer.changed(z3) | composer.changed(constraintLayoutBaseScope4Component2) | composer.changed(constraintLayoutBaseScope4Component4) | composer.changed(fM21595getXsmallD9Ej5fM) | composer.changed(fM21590getDefaultD9Ej5fM) | composer.changed(verticalAnchorCreateGuidelineFromEnd);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            modifier = modifierM5146paddingqDBjuR0$default;
            f = fM21592getMediumD9Ej5fM;
            z = true;
            objRememberedValue = new RewardCardComposable2(f, z3, constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component4, fM21595getXsmallD9Ej5fM, fM21590getDefaultD9Ej5fM, verticalAnchorCreateGuidelineFromEnd);
            z2 = z3;
            f2 = fM21590getDefaultD9Ej5fM;
            composer.updateRememberedValue(objRememberedValue);
        } else {
            modifier = modifierM5146paddingqDBjuR0$default;
            z2 = z3;
            f2 = fM21590getDefaultD9Ej5fM;
            f = fM21592getMediumD9Ej5fM;
            z = true;
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(modifier, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue);
        String title = this.$state$inlined.getTitle();
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        float f3 = f2;
        boolean z4 = z2;
        float f4 = f;
        BentoText2.m20747BentoText38GnDrw(title, modifierConstrainAs, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8184);
        composer.startReplaceGroup(-1224400529);
        boolean zChanged2 = composer.changed(f4) | composer.changed(verticalAnchorCreateGuidelineFromEnd) | composer.changed(constraintLayoutBaseScope4Component4) | composer.changed(f3) | composer.changed(z4);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Object rewardCardComposable3 = new RewardCardComposable3(f4, verticalAnchorCreateGuidelineFromEnd, constraintLayoutBaseScope4Component4, f3, z4);
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
            composer.updateRememberedValue(rewardCardComposable3);
            objRememberedValue2 = rewardCardComposable3;
        } else {
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs2 = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierConstrainAs2);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-409319603, true, new RewardCardComposable4(this.$state$inlined), composer, 54), composer, 805306368, 509);
        composer.endNode();
        composer.startReplaceGroup(5004770);
        boolean zChanged3 = composer.changed(f4);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new RewardCardComposable5(f4);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        RewardCardComposable.Action(this.$action$inlined, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope42, (Function1) objRememberedValue3), this.$state$inlined.getOnClick(), composer, 0, 0);
        Modifier modifier2 = this.$imageModifier$inlined;
        composer.startReplaceGroup(5004770);
        boolean zChanged4 = composer.changed(verticalAnchorCreateGuidelineFromEnd);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new RewardCardComposable6(verticalAnchorCreateGuidelineFromEnd);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs3 = constraintLayoutScope.constrainAs(modifier2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue4);
        ImageKt.Image(this.$state$inlined.getPainter(), (String) null, modifierConstrainAs3, this.$imageAlignment$inlined, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer, 24624, 96);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope2.getContainerObject().mo8187clone());
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
