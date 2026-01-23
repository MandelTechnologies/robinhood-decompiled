package com.robinhood.android.futures.sharedfuturesui.contextualbar;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctions;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.resource.StringResource;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesFtuxContextualBar.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\t\u001a-\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"FuturesFtuxContextualBar", "", "state", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData;", "onPrimaryClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onSecondaryClick", "(Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ContextualBarButton", "button", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;", "onClick", "(Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-shared-futures-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesFtuxContextualBar3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContextualBarButton$lambda$5(FtuxContextualBarData.ButtonType buttonType, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContextualBarButton(buttonType, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesFtuxContextualBar$lambda$0(FtuxContextualBarData ftuxContextualBarData, Function0 function0, Modifier modifier, Function0 function02, int i, int i2, Composer composer, int i3) {
        FuturesFtuxContextualBar(ftuxContextualBarData, function0, modifier, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesFtuxContextualBar$lambda$1(FtuxContextualBarData ftuxContextualBarData, Function0 function0, Modifier modifier, Function0 function02, int i, int i2, Composer composer, int i3) {
        FuturesFtuxContextualBar(ftuxContextualBarData, function0, modifier, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void FuturesFtuxContextualBar(final FtuxContextualBarData state, final Function0<Unit> onPrimaryClick, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Function0<Unit> function02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onPrimaryClick, "onPrimaryClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(519788599);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (i5 != 0) {
                function0 = null;
            }
            function02 = function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(519788599, i3, -1, "com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBar (FuturesFtuxContextualBar.kt:40)");
            }
            if (state.getDescription() == null || state.getPrimaryButton() == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FuturesFtuxContextualBar3.FuturesFtuxContextualBar$lambda$0(state, onPrimaryClick, modifier2, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(18466690, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt.FuturesFtuxContextualBar.2
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
                        ComposerKt.traceEventStart(18466690, i6, -1, "com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBar.<anonymous> (FuturesFtuxContextualBar.kt:44)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                    Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), C2002Dp.m7995constructorimpl(200), 0.0f, 2, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM5158heightInVpY3zN4$default, bentoTheme.getColors(composer2, i7).m21371getBg0d7_KjU(), null, 2, null);
                    final FtuxContextualBarData ftuxContextualBarData = state;
                    final Function0<Unit> function03 = onPrimaryClick;
                    final Function0<Unit> function04 = function02;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(bottom, centerHorizontally, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 5);
                    AnimatedContentKt.AnimatedContent(ftuxContextualBarData, null, null, null, "FuturesDetailFtuxContextualBarText", null, FuturesFtuxContextualBar.INSTANCE.m14747getLambda$1965602962$lib_shared_futures_ui_externalDebug(), composer2, 1597440, 46);
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(Modifier.INSTANCE, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM());
                    composer2.startReplaceGroup(-1003410150);
                    composer2.startReplaceGroup(212064437);
                    composer2.endReplaceGroup();
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = new Measurer2(density);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    final Measurer2 measurer2 = (Measurer2) objRememberedValue;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new ConstraintLayoutScope();
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue5;
                    boolean zChangedInstance = composer2.changedInstance(measurer2);
                    final int i8 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    boolean zChanged = zChangedInstance | composer2.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue6 == companion2.getEmpty()) {
                        objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$FuturesFtuxContextualBar$2$invoke$lambda$5$$inlined$ConstraintLayout$2
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
                                snapshotState2.getValue();
                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i8);
                                snapshotState.getValue();
                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                final Measurer2 measurer22 = measurer2;
                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$FuturesFtuxContextualBar$2$invoke$lambda$5$$inlined$ConstraintLayout$2.1
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
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (objRememberedValue7 == companion2.getEmpty()) {
                        objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$FuturesFtuxContextualBar$2$invoke$lambda$5$$inlined$ConstraintLayout$3
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
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    final Function0 function05 = (Function0) objRememberedValue7;
                    boolean zChangedInstance2 = composer2.changedInstance(measurer2);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue8 == companion2.getEmpty()) {
                        objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$FuturesFtuxContextualBar$2$invoke$lambda$5$$inlined$ConstraintLayout$4
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
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5145paddingqDBjuR0, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$FuturesFtuxContextualBar$2$invoke$lambda$5$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i9) {
                            if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i9, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState2.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                composer3.startReplaceGroup(-25052156);
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                constraintLayoutScope2.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2}, ConstraintLayoutBaseScope3.INSTANCE.getPacked());
                                FtuxContextualBarData.ButtonType secondaryButton = ftuxContextualBarData.getSecondaryButton();
                                composer3.startReplaceGroup(1246122355);
                                if (secondaryButton != null) {
                                    composer3.startReplaceGroup(1246126725);
                                    Function0 function06 = function04;
                                    if (function06 == null) {
                                        composer3.startReplaceGroup(1849434622);
                                        Object objRememberedValue9 = composer3.rememberedValue();
                                        if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue9 = FuturesFtuxContextualBar4.INSTANCE;
                                            composer3.updateRememberedValue(objRememberedValue9);
                                        }
                                        function06 = (Function0) objRememberedValue9;
                                        composer3.endReplaceGroup();
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component2);
                                    Object objRememberedValue10 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue10 = new FuturesFtuxContextualBar5(constraintLayoutBaseScope4Component2);
                                        composer3.updateRememberedValue(objRememberedValue10);
                                    }
                                    composer3.endReplaceGroup();
                                    FuturesFtuxContextualBar3.ContextualBarButton(secondaryButton, function06, constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10), composer3, 0, 0);
                                }
                                composer3.endReplaceGroup();
                                FtuxContextualBarData.ButtonType primaryButton = ftuxContextualBarData.getPrimaryButton();
                                Function0 function07 = function03;
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component1);
                                Object objRememberedValue11 = composer3.rememberedValue();
                                if (zChanged3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new FuturesFtuxContextualBar6(constraintLayoutBaseScope4Component1);
                                    composer3.updateRememberedValue(objRememberedValue11);
                                }
                                composer3.endReplaceGroup();
                                FuturesFtuxContextualBar3.ContextualBarButton(primaryButton, function07, constraintLayoutScope2.constrainAs(companion4, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue11), composer3, 0, 0);
                                composer3.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                    EffectsKt.SideEffect(function05, composer3, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composer2, 54), measurePolicy, composer2, 48, 0);
                    composer2.endReplaceGroup();
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
            modifier2 = modifier;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesFtuxContextualBar3.FuturesFtuxContextualBar$lambda$1(state, onPrimaryClick, modifier2, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextualBarButton(final FtuxContextualBarData.ButtonType buttonType, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1121179423);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(buttonType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1121179423, i3, -1, "com.robinhood.android.futures.sharedfuturesui.contextualbar.ContextualBarButton (FuturesFtuxContextualBar.kt:132)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FuturesFtuxContextualBar3.ContextualBarButton$lambda$4$lambda$3((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedContentKt.AnimatedContent(buttonType, modifier4, (Function1) objRememberedValue, null, "FuturesDetailFtuxContextualBarButton", null, ComposableLambda3.rememberComposableLambda(1561248068, true, new Function4<AnimatedContentScope, FtuxContextualBarData.ButtonType, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt.ContextualBarButton.2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, FtuxContextualBarData.ButtonType buttonType2, Composer composer2, Integer num) {
                        invoke(animatedContentScope, buttonType2, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, FtuxContextualBarData.ButtonType buttonState, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1561248068, i5, -1, "com.robinhood.android.futures.sharedfuturesui.contextualbar.ContextualBarButton.<anonymous> (FuturesFtuxContextualBar.kt:150)");
                        }
                        if (buttonState instanceof FtuxContextualBarData.ButtonType.TextButton) {
                            composer2.startReplaceGroup(940464849);
                            Function0<Unit> function02 = function0;
                            StringResource label = ((FtuxContextualBarData.ButtonType.TextButton) buttonState).getLabel();
                            Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            BentoButtonKt.m20586BentoButtonEikTQX8(function02, label.getText(resources).toString(), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(48), 0.0f, 2, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 1, null), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(buttonState instanceof FtuxContextualBarData.ButtonType.IconButton)) {
                                composer2.startReplaceGroup(1415808858);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(940924114);
                            FtuxContextualBarData.ButtonType.IconButton iconButton = (FtuxContextualBarData.ButtonType.IconButton) buttonState;
                            BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(iconButton.getAsset());
                            BentoIconButton4.Type type2 = iconButton.getType();
                            BentoIconButton2.m20641BentoIconButtoncqYvz4g(function0, heroSize24, StringResources_androidKt.stringResource(iconButton.getContentDescription(), composer2, 0), PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null), type2, false, null, null, null, C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(56)), false, composer2, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 805306368, 0, 1504);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 1597824 | ((i3 >> 3) & 112), 40);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesFtuxContextualBar3.ContextualBarButton$lambda$5(buttonType, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(buttonType, modifier4, (Function1) objRememberedValue, null, "FuturesDetailFtuxContextualBarButton", null, ComposableLambda3.rememberComposableLambda(1561248068, true, new Function4<AnimatedContentScope, FtuxContextualBarData.ButtonType, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt.ContextualBarButton.2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, FtuxContextualBarData.ButtonType buttonType2, Composer composer2, Integer num) {
                    invoke(animatedContentScope, buttonType2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, FtuxContextualBarData.ButtonType buttonState, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(buttonState, "buttonState");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1561248068, i5, -1, "com.robinhood.android.futures.sharedfuturesui.contextualbar.ContextualBarButton.<anonymous> (FuturesFtuxContextualBar.kt:150)");
                    }
                    if (buttonState instanceof FtuxContextualBarData.ButtonType.TextButton) {
                        composer2.startReplaceGroup(940464849);
                        Function0<Unit> function02 = function0;
                        StringResource label = ((FtuxContextualBarData.ButtonType.TextButton) buttonState).getLabel();
                        Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, label.getText(resources).toString(), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(48), 0.0f, 2, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 1, null), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(buttonState instanceof FtuxContextualBarData.ButtonType.IconButton)) {
                            composer2.startReplaceGroup(1415808858);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(940924114);
                        FtuxContextualBarData.ButtonType.IconButton iconButton = (FtuxContextualBarData.ButtonType.IconButton) buttonState;
                        BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(iconButton.getAsset());
                        BentoIconButton4.Type type2 = iconButton.getType();
                        BentoIconButton2.m20641BentoIconButtoncqYvz4g(function0, heroSize24, StringResources_androidKt.stringResource(iconButton.getContentDescription(), composer2, 0), PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null), type2, false, null, null, null, C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(56)), false, composer2, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 805306368, 0, 1504);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 1597824 | ((i3 >> 3) & 112), 40);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform ContextualBarButton$lambda$4$lambda$3(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContent.using(AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(0, 0, EasingFunctions.getEaseOut(), 3, null), 0.0f, 2, null)), AnimatedContentKt.SizeTransform$default(false, new Function2() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FuturesFtuxContextualBar3.ContextualBarButton$lambda$4$lambda$3$lambda$2((IntSize) obj, (IntSize) obj2);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec ContextualBarButton$lambda$4$lambda$3$lambda$2(IntSize intSize, IntSize intSize2) {
        return AnimationSpecKt.tween$default(0, 0, null, 7, null);
    }
}
