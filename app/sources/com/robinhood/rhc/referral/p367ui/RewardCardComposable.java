package com.robinhood.rhc.referral.p367ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rhc.referral.p367ui.RewardCardComposableState;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RewardCardComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a/\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {RewardCardComposable.RewardsCardComposableTestTag, "", "RewardCardComposable", "", "state", "Lcom/robinhood/rhc/referral/ui/RewardCardComposableState;", "action", "Lcom/robinhood/rhc/referral/ui/RewardCardComposableState$Action;", "modifier", "Landroidx/compose/ui/Modifier;", "imageModifier", "imageAlignment", "Landroidx/compose/ui/Alignment;", "(Lcom/robinhood/rhc/referral/ui/RewardCardComposableState;Lcom/robinhood/rhc/referral/ui/RewardCardComposableState$Action;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/runtime/Composer;II)V", "Action", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/rhc/referral/ui/RewardCardComposableState$Action;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-referral-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.rhc.referral.ui.RewardCardComposableKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class RewardCardComposable {
    public static final String RewardsCardComposableTestTag = "RewardsCardComposableTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Action$lambda$3(RewardCardComposableState.Action action, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        Action(action, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardCardComposable$lambda$0(RewardCardComposableState rewardCardComposableState, RewardCardComposableState.Action action, Modifier modifier, Modifier modifier2, Alignment alignment, int i, int i2, Composer composer, int i3) {
        RewardCardComposable(rewardCardComposableState, action, modifier, modifier2, alignment, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RewardCardComposable(final RewardCardComposableState state, final RewardCardComposableState.Action action, Modifier modifier, Modifier modifier2, Alignment alignment, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier3;
        int i4;
        Modifier modifier4;
        int i5;
        Alignment alignment2;
        Composer composer2;
        final Alignment alignment3;
        final Modifier modifier5;
        final Modifier modifier6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(6607775);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(action) : composerStartRestartGroup.changedInstance(action) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier3 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier4 = modifier2;
                    i3 |= composerStartRestartGroup.changed(modifier4) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        alignment2 = alignment;
                        i3 |= composerStartRestartGroup.changed(alignment2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier7 = i6 == 0 ? Modifier.INSTANCE : modifier3;
                        final Modifier modifier8 = i4 == 0 ? Modifier.INSTANCE : modifier4;
                        final Alignment centerEnd = i5 == 0 ? Alignment.INSTANCE.getCenterEnd() : alignment2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(6607775, i3, -1, "com.robinhood.rhc.referral.ui.RewardCardComposable (RewardCardComposable.kt:40)");
                        }
                        Modifier modifierTestTag = TestTag3.testTag(modifier7, RewardsCardComposableTestTag);
                        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                        long jM23878getBackgroundColor0d7_KjU = state.m23878getBackgroundColor0d7_KjU();
                        Function0<Unit> onClick = state.getOnClick();
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-490191240, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt.RewardCardComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                                final SnapshotState snapshotState;
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-490191240, i7, -1, "com.robinhood.rhc.referral.ui.RewardCardComposable.<anonymous> (RewardCardComposable.kt:47)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Intrinsic3.height(Modifier.INSTANCE, Intrinsic4.Min), 0.0f, 1, null);
                                final RewardCardComposableState rewardCardComposableState = state;
                                final RewardCardComposableState.Action action2 = action;
                                final Modifier modifier9 = modifier8;
                                final Alignment alignment4 = centerEnd;
                                composer3.startReplaceGroup(-1003410150);
                                composer3.startReplaceGroup(212064437);
                                composer3.endReplaceGroup();
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                Object objRememberedValue = composer3.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new Measurer2(density);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                final Measurer2 measurer2 = (Measurer2) objRememberedValue;
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new ConstraintLayoutScope();
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
                                boolean zChangedInstance = composer3.changedInstance(measurer2);
                                final int i8 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                boolean zChanged = zChangedInstance | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                                Object objRememberedValue6 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                                    Object obj = new MeasurePolicy() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$2
                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i9);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i9);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i9);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i9);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        /* renamed from: measure-3p2s80s */
                                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            snapshotState3.getValue();
                                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i8);
                                            snapshotState2.getValue();
                                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                            final Measurer2 measurer22 = measurer2;
                                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    invoke2(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                    snapshotState = snapshotState2;
                                    composer3.updateRememberedValue(obj);
                                    objRememberedValue6 = obj;
                                } else {
                                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                    snapshotState = snapshotState2;
                                }
                                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                                Object objRememberedValue7 = composer3.rememberedValue();
                                if (objRememberedValue7 == companion.getEmpty()) {
                                    objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$3
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
                                            snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                            constraintSetForInlineDsl.setKnownDirty(true);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue7);
                                }
                                final Function0 function0 = (Function0) objRememberedValue7;
                                boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                                Object objRememberedValue8 = composer3.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$4
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue8);
                                }
                                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:35:0x01a7  */
                                    /* JADX WARN: Removed duplicated region for block: B:38:0x01ed  */
                                    /* JADX WARN: Removed duplicated region for block: B:41:0x01f9  */
                                    /* JADX WARN: Removed duplicated region for block: B:42:0x01fd  */
                                    /* JADX WARN: Removed duplicated region for block: B:47:0x022a  */
                                    /* JADX WARN: Removed duplicated region for block: B:52:0x02ae  */
                                    /* JADX WARN: Removed duplicated region for block: B:57:0x02ee  */
                                    /* JADX WARN: Removed duplicated region for block: B:60:0x0327  */
                                    /* JADX WARN: Removed duplicated region for block: B:63:0x0333  */
                                    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(Composer composer4, int i9) {
                                        int i10;
                                        float f;
                                        boolean z;
                                        Modifier modifier10;
                                        float f2;
                                        boolean z2;
                                        int i11;
                                        boolean zChanged2;
                                        Object objRememberedValue9;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                        int currentCompositeKeyHash;
                                        Composer composerM6388constructorimpl;
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
                                        boolean zChanged3;
                                        Object objRememberedValue10;
                                        boolean zChanged4;
                                        Object objRememberedValue11;
                                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1200550679, i9, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                        }
                                        snapshotState3.setValue(Unit.INSTANCE);
                                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                        constraintLayoutScope.reset();
                                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                        composer4.startReplaceGroup(-1777558516);
                                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope2.createGuidelineFromEnd(0.3f);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i12 = BentoTheme.$stable;
                                        float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer4, i12).m21590getDefaultD9Ej5fM();
                                        float fM21595getXsmallD9Ej5fM = bentoTheme.getSpacing(composer4, i12).m21595getXsmallD9Ej5fM();
                                        float fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer4, i12).m21592getMediumD9Ej5fM();
                                        String subtitle = rewardCardComposableState.getSubtitle();
                                        boolean z3 = (subtitle == null || StringsKt.isBlank(subtitle) || Intrinsics.areEqual(rewardCardComposableState.getSubtitle(), "&nbsp;")) ? false : true;
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer4, i12).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                        composer4.startReplaceGroup(-1224400529);
                                        boolean zChanged5 = composer4.changed(fM21592getMediumD9Ej5fM) | composer4.changed(z3) | composer4.changed(constraintLayoutBaseScope4Component2) | composer4.changed(constraintLayoutBaseScope4Component4) | composer4.changed(fM21595getXsmallD9Ej5fM) | composer4.changed(fM21590getDefaultD9Ej5fM) | composer4.changed(verticalAnchorCreateGuidelineFromEnd);
                                        Object objRememberedValue12 = composer4.rememberedValue();
                                        if (!zChanged5) {
                                            i10 = helpersHashCode;
                                            if (objRememberedValue12 != Composer.INSTANCE.getEmpty()) {
                                                modifier10 = modifierM5146paddingqDBjuR0$default;
                                                f = fM21590getDefaultD9Ej5fM;
                                                z = true;
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifier10, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue12);
                                            f2 = f;
                                            z2 = z3;
                                            i11 = i10;
                                            BentoText2.m20747BentoText38GnDrw(rewardCardComposableState.getTitle(), modifierConstrainAs, Color.m6701boximpl(bentoTheme.getColors(composer4, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i12).getDisplayCapsuleSmall(), composer4, 0, 0, 8184);
                                            composer4.startReplaceGroup(-1224400529);
                                            zChanged2 = composer4.changed(fM21592getMediumD9Ej5fM) | composer4.changed(verticalAnchorCreateGuidelineFromEnd) | composer4.changed(constraintLayoutBaseScope4Component4) | composer4.changed(f2) | composer4.changed(z2);
                                            objRememberedValue9 = composer4.rememberedValue();
                                            if (!zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                Object rewardCardComposable3 = new RewardCardComposable3(fM21592getMediumD9Ej5fM, verticalAnchorCreateGuidelineFromEnd, constraintLayoutBaseScope4Component4, f2, z2);
                                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
                                                composer4.updateRememberedValue(rewardCardComposable3);
                                                objRememberedValue9 = rewardCardComposable3;
                                            } else {
                                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue9);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs2);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.useNode();
                                            } else {
                                                composer4.createNode(constructor);
                                            }
                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
                                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, bentoTheme.getColors(composer4, i12).m21426getFg20d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-409319603, true, new RewardCardComposable4(rewardCardComposableState), composer4, 54), composer4, 805306368, 509);
                                            composer4.endNode();
                                            composer4.startReplaceGroup(5004770);
                                            zChanged3 = composer4.changed(fM21592getMediumD9Ej5fM);
                                            objRememberedValue10 = composer4.rememberedValue();
                                            if (!zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue10 = new RewardCardComposable5(fM21592getMediumD9Ej5fM);
                                                composer4.updateRememberedValue(objRememberedValue10);
                                            }
                                            composer4.endReplaceGroup();
                                            RewardCardComposable.Action(action2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope42, (Function1) objRememberedValue10), rewardCardComposableState.getOnClick(), composer4, 0, 0);
                                            Modifier modifier11 = modifier9;
                                            composer4.startReplaceGroup(5004770);
                                            zChanged4 = composer4.changed(verticalAnchorCreateGuidelineFromEnd);
                                            objRememberedValue11 = composer4.rememberedValue();
                                            if (!zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue11 = new RewardCardComposable6(verticalAnchorCreateGuidelineFromEnd);
                                                composer4.updateRememberedValue(objRememberedValue11);
                                            }
                                            composer4.endReplaceGroup();
                                            ImageKt.Image(rewardCardComposableState.getPainter(), (String) null, constraintLayoutScope2.constrainAs(modifier11, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), alignment4, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer4, 24624, 96);
                                            composer4.endReplaceGroup();
                                            if (constraintLayoutScope.getHelpersHashCode() != i11) {
                                                EffectsKt.SideEffect(function0, composer4, 6);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                return;
                                            }
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        i10 = helpersHashCode;
                                        modifier10 = modifierM5146paddingqDBjuR0$default;
                                        z = true;
                                        Object rewardCardComposable2 = new RewardCardComposable2(fM21592getMediumD9Ej5fM, z3, constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component4, fM21595getXsmallD9Ej5fM, fM21590getDefaultD9Ej5fM, verticalAnchorCreateGuidelineFromEnd);
                                        f = fM21590getDefaultD9Ej5fM;
                                        composer4.updateRememberedValue(rewardCardComposable2);
                                        objRememberedValue12 = rewardCardComposable2;
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(modifier10, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue12);
                                        f2 = f;
                                        z2 = z3;
                                        i11 = i10;
                                        BentoText2.m20747BentoText38GnDrw(rewardCardComposableState.getTitle(), modifierConstrainAs3, Color.m6701boximpl(bentoTheme.getColors(composer4, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i12).getDisplayCapsuleSmall(), composer4, 0, 0, 8184);
                                        composer4.startReplaceGroup(-1224400529);
                                        zChanged2 = composer4.changed(fM21592getMediumD9Ej5fM) | composer4.changed(verticalAnchorCreateGuidelineFromEnd) | composer4.changed(constraintLayoutBaseScope4Component4) | composer4.changed(f2) | composer4.changed(z2);
                                        objRememberedValue9 = composer4.rememberedValue();
                                        if (zChanged2) {
                                            Object rewardCardComposable32 = new RewardCardComposable3(fM21592getMediumD9Ej5fM, verticalAnchorCreateGuidelineFromEnd, constraintLayoutBaseScope4Component4, f2, z2);
                                            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
                                            composer4.updateRememberedValue(rewardCardComposable32);
                                            objRememberedValue9 = rewardCardComposable32;
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs22 = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue9);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs22);
                                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                                        if (composer4.getApplier() == null) {
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                        }
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting()) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope422 = constraintLayoutBaseScope4;
                                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, bentoTheme.getColors(composer4, i12).m21426getFg20d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-409319603, true, new RewardCardComposable4(rewardCardComposableState), composer4, 54), composer4, 805306368, 509);
                                        composer4.endNode();
                                        composer4.startReplaceGroup(5004770);
                                        zChanged3 = composer4.changed(fM21592getMediumD9Ej5fM);
                                        objRememberedValue10 = composer4.rememberedValue();
                                        if (!zChanged3) {
                                            objRememberedValue10 = new RewardCardComposable5(fM21592getMediumD9Ej5fM);
                                            composer4.updateRememberedValue(objRememberedValue10);
                                        }
                                        composer4.endReplaceGroup();
                                        RewardCardComposable.Action(action2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope422, (Function1) objRememberedValue10), rewardCardComposableState.getOnClick(), composer4, 0, 0);
                                        Modifier modifier112 = modifier9;
                                        composer4.startReplaceGroup(5004770);
                                        zChanged4 = composer4.changed(verticalAnchorCreateGuidelineFromEnd);
                                        objRememberedValue11 = composer4.rememberedValue();
                                        if (!zChanged4) {
                                            objRememberedValue11 = new RewardCardComposable6(verticalAnchorCreateGuidelineFromEnd);
                                            composer4.updateRememberedValue(objRememberedValue11);
                                        }
                                        composer4.endReplaceGroup();
                                        ImageKt.Image(rewardCardComposableState.getPainter(), (String) null, constraintLayoutScope2.constrainAs(modifier112, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), alignment4, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer4, 24624, 96);
                                        composer4.endReplaceGroup();
                                        if (constraintLayoutScope.getHelpersHashCode() != i11) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }
                                }, composer3, 54), measurePolicy, composer3, 48, 0);
                                composer3.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        composer2 = composerStartRestartGroup;
                        Alignment alignment4 = centerEnd;
                        Modifier modifier9 = modifier8;
                        SurfaceKt.m5644SurfaceLPr_se0(onClick, modifierTestTag, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM23878getBackgroundColor0d7_KjU, 0L, null, 0.0f, null, composableLambdaRememberComposableLambda, composer2, 805306368, 484);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Modifier modifier10 = modifier7;
                        alignment3 = alignment4;
                        modifier5 = modifier10;
                        modifier6 = modifier9;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier5 = modifier3;
                        modifier6 = modifier4;
                        alignment3 = alignment2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return RewardCardComposable.RewardCardComposable$lambda$0(state, action, modifier5, modifier6, alignment3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                alignment2 = alignment;
                if ((i3 & 9363) == 9362) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierTestTag2 = TestTag3.testTag(modifier7, RewardsCardComposableTestTag);
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                    long jM23878getBackgroundColor0d7_KjU2 = state.m23878getBackgroundColor0d7_KjU();
                    Function0<Unit> onClick2 = state.getOnClick();
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-490191240, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt.RewardCardComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                            final SnapshotState snapshotState;
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-490191240, i7, -1, "com.robinhood.rhc.referral.ui.RewardCardComposable.<anonymous> (RewardCardComposable.kt:47)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Intrinsic3.height(Modifier.INSTANCE, Intrinsic4.Min), 0.0f, 1, null);
                            final RewardCardComposableState rewardCardComposableState = state;
                            final RewardCardComposableState.Action action2 = action;
                            final Modifier modifier92 = modifier8;
                            final Alignment alignment42 = centerEnd;
                            composer3.startReplaceGroup(-1003410150);
                            composer3.startReplaceGroup(212064437);
                            composer3.endReplaceGroup();
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            Object objRememberedValue = composer3.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new Measurer2(density);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ConstraintLayoutScope();
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                            Object objRememberedValue4 = composer3.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
                            Object objRememberedValue5 = composer3.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                composer3.updateRememberedValue(objRememberedValue5);
                            }
                            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
                            boolean zChangedInstance = composer3.changedInstance(measurer2);
                            final int i8 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                            boolean zChanged = zChangedInstance | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                            Object objRememberedValue6 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                                Object obj = new MeasurePolicy() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$2
                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i9);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i9);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i9);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i9);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    /* renamed from: measure-3p2s80s */
                                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                        final Map linkedHashMap = new LinkedHashMap();
                                        snapshotState3.getValue();
                                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i8);
                                        snapshotState2.getValue();
                                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                        final Measurer2 measurer22 = measurer2;
                                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                invoke2(placementScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                measurer22.performLayout(placementScope, list, linkedHashMap);
                                            }
                                        }, 4, null);
                                    }
                                };
                                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                snapshotState = snapshotState2;
                                composer3.updateRememberedValue(obj);
                                objRememberedValue6 = obj;
                            } else {
                                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                snapshotState = snapshotState2;
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                            Object objRememberedValue7 = composer3.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$3
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
                                        snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                        constraintSetForInlineDsl.setKnownDirty(true);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue7);
                            }
                            final Function0 function0 = (Function0) objRememberedValue7;
                            boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                            Object objRememberedValue8 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$4
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue8);
                            }
                            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$invoke$$inlined$ConstraintLayout$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:35:0x01a7  */
                                /* JADX WARN: Removed duplicated region for block: B:38:0x01ed  */
                                /* JADX WARN: Removed duplicated region for block: B:41:0x01f9  */
                                /* JADX WARN: Removed duplicated region for block: B:42:0x01fd  */
                                /* JADX WARN: Removed duplicated region for block: B:47:0x022a  */
                                /* JADX WARN: Removed duplicated region for block: B:52:0x02ae  */
                                /* JADX WARN: Removed duplicated region for block: B:57:0x02ee  */
                                /* JADX WARN: Removed duplicated region for block: B:60:0x0327  */
                                /* JADX WARN: Removed duplicated region for block: B:63:0x0333  */
                                /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(Composer composer4, int i9) {
                                    int i10;
                                    float f;
                                    boolean z;
                                    Modifier modifier102;
                                    float f2;
                                    boolean z2;
                                    int i11;
                                    boolean zChanged2;
                                    Object objRememberedValue9;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                    int currentCompositeKeyHash;
                                    Composer composerM6388constructorimpl;
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
                                    boolean zChanged3;
                                    Object objRememberedValue10;
                                    boolean zChanged4;
                                    Object objRememberedValue11;
                                    if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1200550679, i9, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                    }
                                    snapshotState3.setValue(Unit.INSTANCE);
                                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                    constraintLayoutScope.reset();
                                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                    composer4.startReplaceGroup(-1777558516);
                                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope2.createGuidelineFromEnd(0.3f);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i12 = BentoTheme.$stable;
                                    float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer4, i12).m21590getDefaultD9Ej5fM();
                                    float fM21595getXsmallD9Ej5fM = bentoTheme.getSpacing(composer4, i12).m21595getXsmallD9Ej5fM();
                                    float fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer4, i12).m21592getMediumD9Ej5fM();
                                    String subtitle = rewardCardComposableState.getSubtitle();
                                    boolean z3 = (subtitle == null || StringsKt.isBlank(subtitle) || Intrinsics.areEqual(rewardCardComposableState.getSubtitle(), "&nbsp;")) ? false : true;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer4, i12).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                    composer4.startReplaceGroup(-1224400529);
                                    boolean zChanged5 = composer4.changed(fM21592getMediumD9Ej5fM) | composer4.changed(z3) | composer4.changed(constraintLayoutBaseScope4Component2) | composer4.changed(constraintLayoutBaseScope4Component4) | composer4.changed(fM21595getXsmallD9Ej5fM) | composer4.changed(fM21590getDefaultD9Ej5fM) | composer4.changed(verticalAnchorCreateGuidelineFromEnd);
                                    Object objRememberedValue12 = composer4.rememberedValue();
                                    if (!zChanged5) {
                                        i10 = helpersHashCode;
                                        if (objRememberedValue12 != Composer.INSTANCE.getEmpty()) {
                                            modifier102 = modifierM5146paddingqDBjuR0$default;
                                            f = fM21590getDefaultD9Ej5fM;
                                            z = true;
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(modifier102, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue12);
                                        f2 = f;
                                        z2 = z3;
                                        i11 = i10;
                                        BentoText2.m20747BentoText38GnDrw(rewardCardComposableState.getTitle(), modifierConstrainAs3, Color.m6701boximpl(bentoTheme.getColors(composer4, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i12).getDisplayCapsuleSmall(), composer4, 0, 0, 8184);
                                        composer4.startReplaceGroup(-1224400529);
                                        zChanged2 = composer4.changed(fM21592getMediumD9Ej5fM) | composer4.changed(verticalAnchorCreateGuidelineFromEnd) | composer4.changed(constraintLayoutBaseScope4Component4) | composer4.changed(f2) | composer4.changed(z2);
                                        objRememberedValue9 = composer4.rememberedValue();
                                        if (!zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            Object rewardCardComposable32 = new RewardCardComposable3(fM21592getMediumD9Ej5fM, verticalAnchorCreateGuidelineFromEnd, constraintLayoutBaseScope4Component4, f2, z2);
                                            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
                                            composer4.updateRememberedValue(rewardCardComposable32);
                                            objRememberedValue9 = rewardCardComposable32;
                                        } else {
                                            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs22 = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue9);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs22);
                                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.useNode();
                                        } else {
                                            composer4.createNode(constructor2);
                                        }
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope422 = constraintLayoutBaseScope4;
                                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, bentoTheme.getColors(composer4, i12).m21426getFg20d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-409319603, true, new RewardCardComposable4(rewardCardComposableState), composer4, 54), composer4, 805306368, 509);
                                        composer4.endNode();
                                        composer4.startReplaceGroup(5004770);
                                        zChanged3 = composer4.changed(fM21592getMediumD9Ej5fM);
                                        objRememberedValue10 = composer4.rememberedValue();
                                        if (!zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue10 = new RewardCardComposable5(fM21592getMediumD9Ej5fM);
                                            composer4.updateRememberedValue(objRememberedValue10);
                                        }
                                        composer4.endReplaceGroup();
                                        RewardCardComposable.Action(action2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope422, (Function1) objRememberedValue10), rewardCardComposableState.getOnClick(), composer4, 0, 0);
                                        Modifier modifier112 = modifier92;
                                        composer4.startReplaceGroup(5004770);
                                        zChanged4 = composer4.changed(verticalAnchorCreateGuidelineFromEnd);
                                        objRememberedValue11 = composer4.rememberedValue();
                                        if (!zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue11 = new RewardCardComposable6(verticalAnchorCreateGuidelineFromEnd);
                                            composer4.updateRememberedValue(objRememberedValue11);
                                        }
                                        composer4.endReplaceGroup();
                                        ImageKt.Image(rewardCardComposableState.getPainter(), (String) null, constraintLayoutScope2.constrainAs(modifier112, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), alignment42, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer4, 24624, 96);
                                        composer4.endReplaceGroup();
                                        if (constraintLayoutScope.getHelpersHashCode() != i11) {
                                            EffectsKt.SideEffect(function0, composer4, 6);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            return;
                                        }
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    i10 = helpersHashCode;
                                    modifier102 = modifierM5146paddingqDBjuR0$default;
                                    z = true;
                                    Object rewardCardComposable2 = new RewardCardComposable2(fM21592getMediumD9Ej5fM, z3, constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component4, fM21595getXsmallD9Ej5fM, fM21590getDefaultD9Ej5fM, verticalAnchorCreateGuidelineFromEnd);
                                    f = fM21590getDefaultD9Ej5fM;
                                    composer4.updateRememberedValue(rewardCardComposable2);
                                    objRememberedValue12 = rewardCardComposable2;
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs32 = constraintLayoutScope2.constrainAs(modifier102, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue12);
                                    f2 = f;
                                    z2 = z3;
                                    i11 = i10;
                                    BentoText2.m20747BentoText38GnDrw(rewardCardComposableState.getTitle(), modifierConstrainAs32, Color.m6701boximpl(bentoTheme.getColors(composer4, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i12).getDisplayCapsuleSmall(), composer4, 0, 0, 8184);
                                    composer4.startReplaceGroup(-1224400529);
                                    zChanged2 = composer4.changed(fM21592getMediumD9Ej5fM) | composer4.changed(verticalAnchorCreateGuidelineFromEnd) | composer4.changed(constraintLayoutBaseScope4Component4) | composer4.changed(f2) | composer4.changed(z2);
                                    objRememberedValue9 = composer4.rememberedValue();
                                    if (zChanged2) {
                                        Object rewardCardComposable322 = new RewardCardComposable3(fM21592getMediumD9Ej5fM, verticalAnchorCreateGuidelineFromEnd, constraintLayoutBaseScope4Component4, f2, z2);
                                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
                                        composer4.updateRememberedValue(rewardCardComposable322);
                                        objRememberedValue9 = rewardCardComposable322;
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs222 = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue9);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs222);
                                    ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor22 = companion322.getConstructor();
                                    if (composer4.getApplier() == null) {
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion322.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion322.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion322.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier22, companion322.getSetModifier());
                                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4222 = constraintLayoutBaseScope4;
                                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, bentoTheme.getColors(composer4, i12).m21426getFg20d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-409319603, true, new RewardCardComposable4(rewardCardComposableState), composer4, 54), composer4, 805306368, 509);
                                    composer4.endNode();
                                    composer4.startReplaceGroup(5004770);
                                    zChanged3 = composer4.changed(fM21592getMediumD9Ej5fM);
                                    objRememberedValue10 = composer4.rememberedValue();
                                    if (!zChanged3) {
                                        objRememberedValue10 = new RewardCardComposable5(fM21592getMediumD9Ej5fM);
                                        composer4.updateRememberedValue(objRememberedValue10);
                                    }
                                    composer4.endReplaceGroup();
                                    RewardCardComposable.Action(action2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4222, (Function1) objRememberedValue10), rewardCardComposableState.getOnClick(), composer4, 0, 0);
                                    Modifier modifier1122 = modifier92;
                                    composer4.startReplaceGroup(5004770);
                                    zChanged4 = composer4.changed(verticalAnchorCreateGuidelineFromEnd);
                                    objRememberedValue11 = composer4.rememberedValue();
                                    if (!zChanged4) {
                                        objRememberedValue11 = new RewardCardComposable6(verticalAnchorCreateGuidelineFromEnd);
                                        composer4.updateRememberedValue(objRememberedValue11);
                                    }
                                    composer4.endReplaceGroup();
                                    ImageKt.Image(rewardCardComposableState.getPainter(), (String) null, constraintLayoutScope2.constrainAs(modifier1122, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), alignment42, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer4, 24624, 96);
                                    composer4.endReplaceGroup();
                                    if (constraintLayoutScope.getHelpersHashCode() != i11) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }, composer3, 54), measurePolicy, composer3, 48, 0);
                            composer3.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    composer2 = composerStartRestartGroup;
                    Alignment alignment42 = centerEnd;
                    Modifier modifier92 = modifier8;
                    SurfaceKt.m5644SurfaceLPr_se0(onClick2, modifierTestTag2, false, roundedCornerShapeM5327RoundedCornerShape0680j_42, jM23878getBackgroundColor0d7_KjU2, 0L, null, 0.0f, null, composableLambdaRememberComposableLambda2, composer2, 805306368, 484);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier102 = modifier7;
                    alignment3 = alignment42;
                    modifier5 = modifier102;
                    modifier6 = modifier92;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier4 = modifier2;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            alignment2 = alignment;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier3 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier4 = modifier2;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        alignment2 = alignment;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Action(final RewardCardComposableState.Action action, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        Function0<Unit> function03;
        final Function0<Unit> function04;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2112881550);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(action) : composerStartRestartGroup.changedInstance(action) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function03 = (Function0) objRememberedValue;
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2112881550, i3, -1, "com.robinhood.rhc.referral.ui.Action (RewardCardComposable.kt:126)");
                    }
                    if (!(action instanceof RewardCardComposableState.Action.Cta)) {
                        composerStartRestartGroup.startReplaceGroup(-2108299304);
                        modifier3 = modifier5;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function03, ((RewardCardComposableState.Action.Cta) action).getText(), modifier3, null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i3 >> 6) & 14) | 24576 | ((i3 << 3) & 896), 0, 8168);
                        function04 = function03;
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        function04 = function03;
                        Modifier modifier6 = modifier5;
                        if (!(action instanceof RewardCardComposableState.Action.Icon)) {
                            composerStartRestartGroup.startReplaceGroup(1040366810);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-2108051273);
                        BentoIcon2.m20644BentoIconFU0evQE(((RewardCardComposableState.Action.Icon) action).getIcon(), null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), modifier6, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48 | ((i3 << 6) & 7168), 48);
                        modifier3 = modifier6;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RewardCardComposable.Action$lambda$3(action, modifier4, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function02 = function0;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!(action instanceof RewardCardComposableState.Action.Cta)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
