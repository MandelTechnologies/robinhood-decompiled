package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.p011ui.platform.CompositionLocalsKt;
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
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
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
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;
import rh_server_driven_ui.p531v1.ZStackDto;

/* compiled from: SduiZStackIdl.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a=\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a$\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0013"}, m3636d2 = {"SduiZStack", "", "ActionT", "component", "Lrh_server_driven_ui/v1/ZStackDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/ZStackDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "convertConstraints", "Landroidx/constraintlayout/compose/ConstrainScope;", "layer", "Lrh_server_driven_ui/v1/ZStackDto$LayerDto;", "centerHorizontal", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "centerVertical", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiZStackIdl {

    /* compiled from: SduiZStackIdl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ZStackDto.LayerDto.EdgeDto.values().length];
            try {
                iArr[ZStackDto.LayerDto.EdgeDto.EDGE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZStackDto.LayerDto.EdgeDto.EDGE_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZStackDto.LayerDto.EdgeDto.EDGE_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ZStackDto.LayerDto.EdgeDto.EDGE_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ZStackDto.LayerDto.AxisDto.values().length];
            try {
                iArr2[ZStackDto.LayerDto.AxisDto.AXIS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ZStackDto.LayerDto.AxisDto.AXIS_X.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ZStackDto.LayerDto.AxisDto.AXIS_Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiZStack$lambda$3(ZStackDto zStackDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiZStack(zStackDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiZStack(final ZStackDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        final int i4;
        boolean zChanged;
        Object objRememberedValue6;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1173789953);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1173789953, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStack (SduiZStackIdl.kt:17)");
                }
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Measurer2(density);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                measurer2 = (Measurer2) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotState2 = (SnapshotState) objRememberedValue5;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$SduiZStack$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            snapshotState2.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$SduiZStack$$inlined$ConstraintLayout$2.1
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
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(measurePolicy);
                    objRememberedValue6 = measurePolicy;
                } else {
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                }
                MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$SduiZStack$$inlined$ConstraintLayout$3
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
                            snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl2.setKnownDirty(true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                final Function0 function0 = (Function0) objRememberedValue7;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$SduiZStack$$inlined$ConstraintLayout$4
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
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$SduiZStack$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        Composer composer3;
                        if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState2.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                            constraintLayoutScope.reset();
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            composer2.startReplaceGroup(-1700003670);
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope2.createGuidelineFromStart(0.5f);
                            ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorCreateGuidelineFromTop = constraintLayoutScope2.createGuidelineFromTop(0.5f);
                            composer2.startReplaceGroup(1192090912);
                            for (ZStackDto.LayerDto layerDto : component.getLayers()) {
                                UIComponentDto component2 = layerDto.getComponent();
                                UIComponentDto.ConcreteDto concrete = component2 != null ? component2.getConcrete() : null;
                                composer2.startReplaceGroup(1192093971);
                                if (concrete != null) {
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope2.createRef();
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    composer2.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance3 = composer2.changedInstance(layerDto) | composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                                    Object objRememberedValue9 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue9 = new SduiZStackIdl2(layerDto, verticalAnchorCreateGuidelineFromStart, horizontalAnchorCreateGuidelineFromTop);
                                        composer2.updateRememberedValue(objRememberedValue9);
                                    }
                                    composer2.endReplaceGroup();
                                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4CreateRef, (Function1) objRememberedValue9);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierConstrainAs);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer3 = composer2;
                                    SduiComponentIdl.SduiComponent(concrete, parseAction, (Modifier) null, (HorizontalPadding) null, composer3, 0, 12);
                                    composer3.endNode();
                                } else {
                                    composer3 = composer2;
                                }
                                composer3.endReplaceGroup();
                                composer2 = composer3;
                            }
                            Composer composer4 = composer2;
                            composer4.endReplaceGroup();
                            composer4.endReplaceGroup();
                            if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function0, composer4, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiZStackIdl.SduiZStack$lambda$3(component, parseAction, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            measurer2 = (Measurer2) objRememberedValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue3;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue5;
            boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
            i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            zChanged = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                MeasurePolicy measurePolicy3 = new MeasurePolicy() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$SduiZStack$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                        final Map linkedHashMap = new LinkedHashMap();
                        snapshotState2.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                        snapshotState.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$SduiZStack$$inlined$ConstraintLayout$2.1
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
                constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                snapshotState3 = snapshotState;
                composerStartRestartGroup.updateRememberedValue(measurePolicy3);
                objRememberedValue6 = measurePolicy3;
                MeasurePolicy measurePolicy22 = (MeasurePolicy) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                }
                final Function0 function02 = (Function0) objRememberedValue7;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$SduiZStack$$inlined$ConstraintLayout$4
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
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackIdlKt$SduiZStack$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            Composer composer3;
                            if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState2.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                constraintLayoutScope2.reset();
                                ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                composer2.startReplaceGroup(-1700003670);
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope22.createGuidelineFromStart(0.5f);
                                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorCreateGuidelineFromTop = constraintLayoutScope22.createGuidelineFromTop(0.5f);
                                composer2.startReplaceGroup(1192090912);
                                for (ZStackDto.LayerDto layerDto : component.getLayers()) {
                                    UIComponentDto component2 = layerDto.getComponent();
                                    UIComponentDto.ConcreteDto concrete = component2 != null ? component2.getConcrete() : null;
                                    composer2.startReplaceGroup(1192093971);
                                    if (concrete != null) {
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope22.createRef();
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        composer2.startReplaceGroup(-1746271574);
                                        boolean zChangedInstance3 = composer2.changedInstance(layerDto) | composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                                        Object objRememberedValue9 = composer2.rememberedValue();
                                        if (zChangedInstance3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue9 = new SduiZStackIdl2(layerDto, verticalAnchorCreateGuidelineFromStart, horizontalAnchorCreateGuidelineFromTop);
                                            composer2.updateRememberedValue(objRememberedValue9);
                                        }
                                        composer2.endReplaceGroup();
                                        Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4CreateRef, (Function1) objRememberedValue9);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierConstrainAs);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer3 = composer2;
                                        SduiComponentIdl.SduiComponent(concrete, parseAction, (Modifier) null, (HorizontalPadding) null, composer3, 0, 12);
                                        composer3.endNode();
                                    } else {
                                        composer3 = composer2;
                                    }
                                    composer3.endReplaceGroup();
                                    composer2 = composer3;
                                }
                                Composer composer4 = composer2;
                                composer4.endReplaceGroup();
                                composer4.endReplaceGroup();
                                if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                    EffectsKt.SideEffect(function02, composer4, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54), measurePolicy22, composerStartRestartGroup, 48, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final ConstraintLayoutBaseScope.VerticalAnchor convertConstraints$toVerticalAnchor(ZStackDto.LayerDto.EdgeDto edgeDto, ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor) {
        int i = WhenMappings.$EnumSwitchMapping$0[edgeDto.ordinal()];
        if (i == 1 || i == 2) {
            return constrainScope.getParent().getStart();
        }
        if (i == 3) {
            return verticalAnchor;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return constrainScope.getParent().getEnd();
    }

    private static final ConstraintLayoutBaseScope.HorizontalAnchor convertConstraints$toHorizontalAnchor(ZStackDto.LayerDto.EdgeDto edgeDto, ConstrainScope constrainScope, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor) {
        int i = WhenMappings.$EnumSwitchMapping$0[edgeDto.ordinal()];
        if (i == 1 || i == 2) {
            return constrainScope.getParent().getTop();
        }
        if (i == 3) {
            return horizontalAnchor;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return constrainScope.getParent().getBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convertConstraints(ConstrainScope constrainScope, ZStackDto.LayerDto layerDto, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor) {
        for (ZStackDto.LayerDto.ConstraintDto constraintDto : layerDto.getConstraints()) {
            constrainScope.setWidth(Dimension.INSTANCE.getPreferredWrapContent());
            int i = WhenMappings.$EnumSwitchMapping$1[constraintDto.getAxis().ordinal()];
            if (i == 1 || i == 2) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[constraintDto.getLayer_edge().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainScope.getStart(), convertConstraints$toVerticalAnchor(constraintDto.getParent_edge(), constrainScope, verticalAnchor), C2002Dp.m7995constructorimpl((float) constraintDto.getOffset()), 0.0f, 4, null);
                } else if (i2 == 3) {
                    ConstrainScope.m8130linkTo8ZKsbrE$default(constrainScope, constrainScope.getParent().getStart(), constrainScope.getParent().getEnd(), C2002Dp.m7995constructorimpl((float) constraintDto.getOffset()), 0.0f, 0.0f, 0.0f, 0.5f, 56, (Object) null);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainScope.getEnd(), convertConstraints$toVerticalAnchor(constraintDto.getParent_edge(), constrainScope, verticalAnchor), C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl((float) constraintDto.getOffset()) * (-1)), 0.0f, 4, null);
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = WhenMappings.$EnumSwitchMapping$0[constraintDto.getLayer_edge().ordinal()];
                if (i3 == 1 || i3 == 2) {
                    ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainScope.getTop(), convertConstraints$toHorizontalAnchor(constraintDto.getParent_edge(), constrainScope, horizontalAnchor), C2002Dp.m7995constructorimpl((float) constraintDto.getOffset()), 0.0f, 4, null);
                } else if (i3 == 3) {
                    ConstrainScope.m8129linkTo8ZKsbrE$default(constrainScope, constrainScope.getParent().getTop(), constrainScope.getParent().getBottom(), C2002Dp.m7995constructorimpl((float) constraintDto.getOffset()), 0.0f, 0.0f, 0.0f, 0.5f, 56, (Object) null);
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainScope.getBottom(), convertConstraints$toHorizontalAnchor(constraintDto.getParent_edge(), constrainScope, horizontalAnchor), C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl((float) constraintDto.getOffset()) * (-1)), 0.0f, 4, null);
                }
            }
        }
    }
}
