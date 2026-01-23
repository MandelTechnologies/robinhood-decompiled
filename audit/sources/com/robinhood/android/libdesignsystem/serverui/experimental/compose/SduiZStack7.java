package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
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
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.AnalyticsEventDescriptor;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.Container;
import com.robinhood.models.serverdriven.experimental.api.Decorator;
import com.robinhood.models.serverdriven.experimental.api.Edge;
import com.robinhood.models.serverdriven.experimental.api.GoldShimmer;
import com.robinhood.models.serverdriven.experimental.api.GradientDirection;
import com.robinhood.models.serverdriven.experimental.api.GradientStop;
import com.robinhood.models.serverdriven.experimental.api.GradientWithStops;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.IconImage;
import com.robinhood.models.serverdriven.experimental.api.Insets;
import com.robinhood.models.serverdriven.experimental.api.LayerConstraint;
import com.robinhood.models.serverdriven.experimental.api.LayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.Markdown;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.PlatformLayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.PrimaryAxisAlignment;
import com.robinhood.models.serverdriven.experimental.api.SecondaryAxisAlignment;
import com.robinhood.models.serverdriven.experimental.api.Sizing;
import com.robinhood.models.serverdriven.experimental.api.SizingPreference;
import com.robinhood.models.serverdriven.experimental.api.Spacer;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.TextAlignment;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.Tooltip;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.api.WindowWidthDependentNumber;
import com.robinhood.models.serverdriven.experimental.api.ZStack;
import com.robinhood.models.serverdriven.experimental.api.ZStackLayer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiZStack.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a4\u0010\t\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0002\u001a\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0002\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0017"}, m3636d2 = {"SduiZStack", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/ZStack;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/ZStack;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "convertConstraints", "Landroidx/constraintlayout/compose/ConstrainScope;", "layer", "Lcom/robinhood/models/serverdriven/experimental/api/ZStackLayer;", "centerHorizontal", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "centerVertical", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "ZStackPreview", "(Landroidx/compose/runtime/Composer;I)V", "ZStackOffsetPreview", "timelineElement1ZStack", "timelineElement2ZStack", "ZStackTimelinePreview", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiZStack7 {

    /* compiled from: SduiZStack.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Edge.values().length];
            try {
                iArr[Edge.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Edge.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Edge.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SizingPreference.values().length];
            try {
                iArr2[SizingPreference.MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[LayoutAxis.values().length];
            try {
                iArr3[LayoutAxis.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[LayoutAxis.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiZStack$lambda$3(ZStack zStack, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiZStack(zStack, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ZStackOffsetPreview$lambda$5(int i, Composer composer, int i2) {
        ZStackOffsetPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ZStackPreview$lambda$4(int i, Composer composer, int i2) {
        ZStackPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ZStackTimelinePreview$lambda$6(int i, Composer composer, int i2) {
        ZStackTimelinePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiZStack(final ZStack<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
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
        final SnapshotState snapshotState3;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-562749152);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-562749152, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStack (SduiZStack.kt:50)");
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
                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$SduiZStack$$inlined$ConstraintLayout$2
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
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$SduiZStack$$inlined$ConstraintLayout$2.1
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
                    snapshotState3 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(measurePolicy);
                    objRememberedValue6 = measurePolicy;
                } else {
                    snapshotState3 = snapshotState;
                }
                MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$SduiZStack$$inlined$ConstraintLayout$3
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
                            constraintSetForInlineDsl.setKnownDirty(true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                final Function0 function0 = (Function0) objRememberedValue7;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$SduiZStack$$inlined$ConstraintLayout$4
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
                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier3, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$SduiZStack$$inlined$ConstraintLayout$5
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
                        if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState2.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                            constraintLayoutScope.reset();
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            composer2.startReplaceGroup(-1717401892);
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope2.createGuidelineFromStart(0.5f);
                            ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorCreateGuidelineFromTop = constraintLayoutScope2.createGuidelineFromTop(0.5f);
                            composer2.startReplaceGroup(83151022);
                            for (ZStackLayer zStackLayer : component.getLayers()) {
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope2.createRef();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                composer2.startReplaceGroup(-1746271574);
                                boolean zChangedInstance3 = composer2.changedInstance(zStackLayer) | composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                                Object objRememberedValue9 = composer2.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new SduiZStack8(zStackLayer, verticalAnchorCreateGuidelineFromStart, horizontalAnchorCreateGuidelineFromTop);
                                    composer2.updateRememberedValue(objRememberedValue9);
                                }
                                composer2.endReplaceGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4CreateRef, (Function1) objRememberedValue9);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
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
                                SduiComponent3.SduiComponent(zStackLayer.getContent(), null, null, composer2, 0, 6);
                                composer2.endNode();
                            }
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                            if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function0, composer2, 6);
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
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiZStack7.SduiZStack$lambda$3(component, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
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
                MeasurePolicy measurePolicy3 = new MeasurePolicy() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$SduiZStack$$inlined$ConstraintLayout$2
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
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$SduiZStack$$inlined$ConstraintLayout$2.1
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
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$SduiZStack$$inlined$ConstraintLayout$4
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
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier3, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$SduiZStack$$inlined$ConstraintLayout$5
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
                            if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState2.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                constraintLayoutScope2.reset();
                                ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                composer2.startReplaceGroup(-1717401892);
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope22.createGuidelineFromStart(0.5f);
                                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorCreateGuidelineFromTop = constraintLayoutScope22.createGuidelineFromTop(0.5f);
                                composer2.startReplaceGroup(83151022);
                                for (ZStackLayer zStackLayer : component.getLayers()) {
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope22.createRef();
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    composer2.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance3 = composer2.changedInstance(zStackLayer) | composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                                    Object objRememberedValue9 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue9 = new SduiZStack8(zStackLayer, verticalAnchorCreateGuidelineFromStart, horizontalAnchorCreateGuidelineFromTop);
                                        composer2.updateRememberedValue(objRememberedValue9);
                                    }
                                    composer2.endReplaceGroup();
                                    Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4CreateRef, (Function1) objRememberedValue9);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
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
                                    SduiComponent3.SduiComponent(zStackLayer.getContent(), null, null, composer2, 0, 6);
                                    composer2.endNode();
                                }
                                composer2.endReplaceGroup();
                                composer2.endReplaceGroup();
                                if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                    EffectsKt.SideEffect(function02, composer2, 6);
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
                    modifier2 = modifier3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final ConstraintLayoutBaseScope.VerticalAnchor convertConstraints$toVerticalAnchor(Edge edge, ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor) {
        int i = WhenMappings.$EnumSwitchMapping$0[edge.ordinal()];
        if (i == 1) {
            return constrainScope.getParent().getStart();
        }
        if (i == 2) {
            return verticalAnchor;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return constrainScope.getParent().getEnd();
    }

    private static final ConstraintLayoutBaseScope.HorizontalAnchor convertConstraints$toHorizontalAnchor(Edge edge, ConstrainScope constrainScope, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor) {
        int i = WhenMappings.$EnumSwitchMapping$0[edge.ordinal()];
        if (i == 1) {
            return constrainScope.getParent().getTop();
        }
        if (i == 2) {
            return horizontalAnchor;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return constrainScope.getParent().getBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <ActionT extends Parcelable> void convertConstraints(ConstrainScope constrainScope, ZStackLayer<? extends ActionT> zStackLayer, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor) {
        Dimension wrapContent;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor3 = horizontalAnchor;
        for (LayerConstraint layerConstraint : zStackLayer.getConstraints()) {
            Dimension.Companion companion = Dimension.INSTANCE;
            constrainScope.setWidth(companion.getPreferredWrapContent());
            UIComponent<ActionT> content = zStackLayer.getContent();
            if (content instanceof Decorator) {
                Sizing sizing = ((Decorator) content).getSizing();
                SizingPreference vertical = sizing != null ? sizing.getVertical() : null;
                wrapContent = (vertical == null ? -1 : WhenMappings.$EnumSwitchMapping$1[vertical.ordinal()]) == 1 ? companion.getFillToConstraints() : companion.getWrapContent();
            } else {
                wrapContent = companion.getWrapContent();
            }
            constrainScope.setHeight(wrapContent);
            int i = WhenMappings.$EnumSwitchMapping$2[layerConstraint.getAxis().ordinal()];
            if (i == 1) {
                horizontalAnchor2 = horizontalAnchor3;
                int i2 = WhenMappings.$EnumSwitchMapping$0[layerConstraint.getLayer_edge().ordinal()];
                if (i2 == 1) {
                    ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainScope.getStart(), convertConstraints$toVerticalAnchor(layerConstraint.getParent_edge(), constrainScope, verticalAnchor), C2002Dp.m7995constructorimpl(layerConstraint.getOffset()), 0.0f, 4, null);
                } else if (i2 == 2) {
                    ConstrainScope.m8130linkTo8ZKsbrE$default(constrainScope, verticalAnchor, verticalAnchor, C2002Dp.m7995constructorimpl(layerConstraint.getOffset()), 0.0f, 0.0f, 0.0f, 0.0f, 120, (Object) null);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainScope.getEnd(), convertConstraints$toVerticalAnchor(layerConstraint.getParent_edge(), constrainScope, verticalAnchor), C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(layerConstraint.getOffset()) * (-1)), 0.0f, 4, null);
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = WhenMappings.$EnumSwitchMapping$0[layerConstraint.getLayer_edge().ordinal()];
                if (i3 == 1) {
                    horizontalAnchor2 = horizontalAnchor3;
                    ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainScope.getTop(), convertConstraints$toHorizontalAnchor(layerConstraint.getParent_edge(), constrainScope, horizontalAnchor2), C2002Dp.m7995constructorimpl(layerConstraint.getOffset()), 0.0f, 4, null);
                } else if (i3 == 2) {
                    ConstrainScope.m8129linkTo8ZKsbrE$default(constrainScope, horizontalAnchor3, horizontalAnchor, C2002Dp.m7995constructorimpl(layerConstraint.getOffset()), 0.0f, 0.0f, 0.0f, 0.0f, 120, (Object) null);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainScope.getBottom(), convertConstraints$toHorizontalAnchor(layerConstraint.getParent_edge(), constrainScope, horizontalAnchor3), C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(layerConstraint.getOffset()) * (-1)), 0.0f, 4, null);
                }
            }
            horizontalAnchor3 = horizontalAnchor2;
        }
    }

    public static final void ZStackPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1217049390);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1217049390, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ZStackPreview (SduiZStack.kt:147)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SduiZStack2.INSTANCE.getLambda$80619126$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiZStack7.ZStackPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ZStackOffsetPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-991377439);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-991377439, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ZStackOffsetPreview (SduiZStack.kt:304)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SduiZStack2.INSTANCE.getLambda$1347069225$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiZStack7.ZStackOffsetPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ZStack<Parcelable> timelineElement1ZStack() {
        int i = 2;
        LayoutAxis.Companion companion = LayoutAxis.INSTANCE;
        LayoutAxis layoutAxisFromServerValue = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayoutAxis layoutAxisFromServerValue2 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        Spacer spacer = new Spacer(2, new PlatformLayoutAxis(layoutAxisFromServerValue, layoutAxisFromServerValue2));
        Color.Companion companion2 = Color.INSTANCE;
        Color colorFromServerValue = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue2 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        AnalyticsEventDescriptor analyticsEventDescriptor = null;
        GoldShimmer goldShimmer = null;
        Tooltip tooltip = null;
        Decorator decorator = new Decorator(null, spacer, new ThemedColor(colorFromServerValue, colorFromServerValue2), null, null, null, 0, i, i, new Insets(new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0)), null, null, null, null, null, analyticsEventDescriptor, null, goldShimmer, null, Float.valueOf(0.2f), tooltip, null, 3669049, null);
        LayoutAxis layoutAxisFromServerValue3 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue3, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayoutAxis layoutAxisFromServerValue4 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue4, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        Spacer spacer2 = new Spacer(2, new PlatformLayoutAxis(layoutAxisFromServerValue3, layoutAxisFromServerValue4));
        Color colorFromServerValue3 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue3, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue4 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue4, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        int i2 = 3669049;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Sizing sizing = null;
        String str = null;
        Decorator decorator2 = new Decorator(null, spacer2, new ThemedColor(colorFromServerValue3, colorFromServerValue4), null, null, null, 0, i, i, new Insets(new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0)), null == true ? 1 : 0, null == true ? 1 : 0, analyticsEventDescriptor, null == true ? 1 : 0, goldShimmer, null == true ? 1 : 0, sizing, tooltip, null == true ? 1 : 0, Float.valueOf(0.4f), null == true ? 1 : 0, str, i2, defaultConstructorMarker);
        LayoutAxis layoutAxisFromServerValue5 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue5, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayoutAxis layoutAxisFromServerValue6 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue6, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        Spacer spacer3 = new Spacer(2, new PlatformLayoutAxis(layoutAxisFromServerValue5, layoutAxisFromServerValue6));
        Color colorFromServerValue5 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue5, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue6 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue6, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Decorator decorator3 = new Decorator(null, spacer3, new ThemedColor(colorFromServerValue5, colorFromServerValue6), null, null, null, 0, i, i, new Insets(new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0)), null == true ? 1 : 0, null == true ? 1 : 0, analyticsEventDescriptor, null == true ? 1 : 0, goldShimmer, null == true ? 1 : 0, sizing, tooltip, null == true ? 1 : 0, Float.valueOf(0.6f), null == true ? 1 : 0, str, i2, defaultConstructorMarker);
        LayoutAxis layoutAxisFromServerValue7 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue7, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayoutAxis layoutAxisFromServerValue8 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue8, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        Spacer spacer4 = new Spacer(2, new PlatformLayoutAxis(layoutAxisFromServerValue7, layoutAxisFromServerValue8));
        Color colorFromServerValue7 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue7, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue8 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue8, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        List listListOf = CollectionsKt.listOf((Object[]) new Decorator[]{decorator, decorator2, decorator3, new Decorator(null, spacer4, new ThemedColor(colorFromServerValue7, colorFromServerValue8), null, null, null, 0, i, i, new Insets(new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0)), null == true ? 1 : 0, null == true ? 1 : 0, analyticsEventDescriptor, null == true ? 1 : 0, goldShimmer, null == true ? 1 : 0, sizing, tooltip, null == true ? 1 : 0, Float.valueOf(0.8f), null == true ? 1 : 0, str, i2, defaultConstructorMarker)});
        WindowWidthDependentNumber windowWidthDependentNumber = new WindowWidthDependentNumber(2, 2, 2);
        LayoutAxis layoutAxisFromServerValue9 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue9, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayoutAxis layoutAxisFromServerValue10 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue10, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        PlatformLayoutAxis platformLayoutAxis = new PlatformLayoutAxis(layoutAxisFromServerValue9, layoutAxisFromServerValue10);
        PrimaryAxisAlignment.Companion companion3 = PrimaryAxisAlignment.INSTANCE;
        PrimaryAxisAlignment primaryAxisAlignmentFromServerValue = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(primaryAxisAlignmentFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.PrimaryAxisAlignment");
        SecondaryAxisAlignment.Companion companion4 = SecondaryAxisAlignment.INSTANCE;
        SecondaryAxisAlignment secondaryAxisAlignmentFromServerValue = companion4.fromServerValue("START");
        Intrinsics.checkNotNull(secondaryAxisAlignmentFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.SecondaryAxisAlignment");
        Container container = new Container(listListOf, windowWidthDependentNumber, platformLayoutAxis, primaryAxisAlignmentFromServerValue, secondaryAxisAlignmentFromServerValue);
        Edge.Companion companion5 = Edge.INSTANCE;
        Edge edgeFromServerValue = companion5.fromServerValue("CENTER");
        Intrinsics.checkNotNull(edgeFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue2 = companion5.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue11 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue11, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint = new LayerConstraint(edgeFromServerValue, edgeFromServerValue2, layoutAxisFromServerValue11, 0.0f);
        Edge edgeFromServerValue3 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue3, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue4 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue4, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue12 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue12, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        ZStackLayer zStackLayer = new ZStackLayer(container, CollectionsKt.listOf((Object[]) new LayerConstraint[]{layerConstraint, new LayerConstraint(edgeFromServerValue3, edgeFromServerValue4, layoutAxisFromServerValue12, 11.0f)}));
        LayoutAxis layoutAxisFromServerValue13 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue13, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayoutAxis layoutAxisFromServerValue14 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue14, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        Spacer spacer5 = new Spacer(2, new PlatformLayoutAxis(layoutAxisFromServerValue13, layoutAxisFromServerValue14));
        Color colorFromServerValue9 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue9, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue10 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue10, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        ThemedColor themedColor = new ThemedColor(colorFromServerValue9, colorFromServerValue10);
        Insets insets = new Insets(new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0));
        SizingPreference.Companion companion6 = SizingPreference.INSTANCE;
        SizingPreference sizingPreferenceFromServerValue = companion6.fromServerValue("MAX");
        Intrinsics.checkNotNull(sizingPreferenceFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.SizingPreference");
        Object[] objArr = null == true ? 1 : 0;
        Decorator decorator4 = new Decorator(null, spacer5, themedColor, null, null, null, 0, i, null, insets, null, null, null, null, null, objArr, new Sizing(sizingPreferenceFromServerValue, null, 2, null), null, null, null, null, null, 4128057, defaultConstructorMarker);
        Edge edgeFromServerValue5 = companion5.fromServerValue("CENTER");
        Intrinsics.checkNotNull(edgeFromServerValue5, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue6 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue6, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue15 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue15, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint2 = new LayerConstraint(edgeFromServerValue5, edgeFromServerValue6, layoutAxisFromServerValue15, 0.0f);
        Edge edgeFromServerValue7 = companion5.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue7, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue8 = companion5.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue8, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue16 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue16, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint3 = new LayerConstraint(edgeFromServerValue7, edgeFromServerValue8, layoutAxisFromServerValue16, 0.0f);
        Edge edgeFromServerValue9 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue9, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue10 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue10, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue17 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue17, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        ZStackLayer zStackLayer2 = new ZStackLayer(decorator4, CollectionsKt.listOf((Object[]) new LayerConstraint[]{layerConstraint2, layerConstraint3, new LayerConstraint(edgeFromServerValue9, edgeFromServerValue10, layoutAxisFromServerValue17, 11.0f)}));
        Icon iconFromServerValue = Icon.INSTANCE.fromServerValue("dot_24");
        Intrinsics.checkNotNull(iconFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Icon");
        Color colorFromServerValue11 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue11, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue12 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue12, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        IconImage iconImage = new IconImage(iconFromServerValue, new ThemedColor(colorFromServerValue11, colorFromServerValue12));
        Edge edgeFromServerValue11 = companion5.fromServerValue("CENTER");
        Intrinsics.checkNotNull(edgeFromServerValue11, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue12 = companion5.fromServerValue("CENTER");
        Intrinsics.checkNotNull(edgeFromServerValue12, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue18 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue18, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint4 = new LayerConstraint(edgeFromServerValue11, edgeFromServerValue12, layoutAxisFromServerValue18, 0.0f);
        Edge edgeFromServerValue13 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue13, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue14 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue14, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue19 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue19, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        ZStackLayer zStackLayer3 = new ZStackLayer(iconImage, CollectionsKt.listOf((Object[]) new LayerConstraint[]{layerConstraint4, new LayerConstraint(edgeFromServerValue13, edgeFromServerValue14, layoutAxisFromServerValue19, 0.0f)}));
        PlainText plainText = new PlainText("More coming up...");
        TextStyle textStyleFromServerValue = TextStyle.INSTANCE.fromServerValue("TEXT_MEDIUM");
        Intrinsics.checkNotNull(textStyleFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.TextStyle");
        TextAlignment textAlignmentFromServerValue = TextAlignment.INSTANCE.fromServerValue("START");
        Intrinsics.checkNotNull(textAlignmentFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.TextAlignment");
        Color colorFromServerValue13 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue13, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue14 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue14, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        List listListOf2 = CollectionsKt.listOf(new Text(plainText, textStyleFromServerValue, textAlignmentFromServerValue, new ThemedColor(colorFromServerValue13, colorFromServerValue14), null, 16, null));
        WindowWidthDependentNumber windowWidthDependentNumber2 = new WindowWidthDependentNumber(0, 0, 0);
        LayoutAxis layoutAxisFromServerValue20 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue20, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayoutAxis layoutAxisFromServerValue21 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue21, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        PlatformLayoutAxis platformLayoutAxis2 = new PlatformLayoutAxis(layoutAxisFromServerValue20, layoutAxisFromServerValue21);
        PrimaryAxisAlignment primaryAxisAlignmentFromServerValue2 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(primaryAxisAlignmentFromServerValue2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.PrimaryAxisAlignment");
        SecondaryAxisAlignment secondaryAxisAlignmentFromServerValue2 = companion4.fromServerValue("START");
        Intrinsics.checkNotNull(secondaryAxisAlignmentFromServerValue2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.SecondaryAxisAlignment");
        Container container2 = new Container(listListOf2, windowWidthDependentNumber2, platformLayoutAxis2, primaryAxisAlignmentFromServerValue2, secondaryAxisAlignmentFromServerValue2);
        Insets insets2 = new Insets(new WindowWidthDependentNumber(16, 16, 16), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(16, 16, 16), new WindowWidthDependentNumber(0, 0, 0));
        SizingPreference sizingPreferenceFromServerValue2 = companion6.fromServerValue("MAX");
        Intrinsics.checkNotNull(sizingPreferenceFromServerValue2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.SizingPreference");
        Decorator decorator5 = new Decorator(null, container2, null, null, null, null, 0, null, null, insets2, null, null, null, null, null, null, new Sizing(null, sizingPreferenceFromServerValue2, 1, null), null, null, null, null, null, 4128189, null);
        Edge edgeFromServerValue15 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue15, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue16 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue16, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue22 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue22, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint5 = new LayerConstraint(edgeFromServerValue15, edgeFromServerValue16, layoutAxisFromServerValue22, 0.0f);
        Edge edgeFromServerValue17 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue17, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue18 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue18, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue23 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue23, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint6 = new LayerConstraint(edgeFromServerValue17, edgeFromServerValue18, layoutAxisFromServerValue23, 40.0f);
        Edge edgeFromServerValue19 = companion5.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue19, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue20 = companion5.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue20, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue24 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue24, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint7 = new LayerConstraint(edgeFromServerValue19, edgeFromServerValue20, layoutAxisFromServerValue24, 0.0f);
        Edge edgeFromServerValue21 = companion5.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue21, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue22 = companion5.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue22, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue25 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue25, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        return new ZStack<>(CollectionsKt.listOf((Object[]) new ZStackLayer[]{zStackLayer, zStackLayer2, zStackLayer3, new ZStackLayer(decorator5, CollectionsKt.listOf((Object[]) new LayerConstraint[]{layerConstraint5, layerConstraint6, layerConstraint7, new LayerConstraint(edgeFromServerValue21, edgeFromServerValue22, layoutAxisFromServerValue25, 0.0f)}))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ZStack<Parcelable> timelineElement2ZStack() {
        int i = 2;
        LayoutAxis.Companion companion = LayoutAxis.INSTANCE;
        LayoutAxis layoutAxisFromServerValue = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayoutAxis layoutAxisFromServerValue2 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        Spacer spacer = new Spacer(2, new PlatformLayoutAxis(layoutAxisFromServerValue, layoutAxisFromServerValue2));
        Color.Companion companion2 = Color.INSTANCE;
        Color colorFromServerValue = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue2 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        GradientStop gradientStop = new GradientStop(new ThemedColor(colorFromServerValue, colorFromServerValue2), 1.0f, 0.0f);
        Color colorFromServerValue3 = companion2.fromServerValue("sol-light");
        Intrinsics.checkNotNull(colorFromServerValue3, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue4 = companion2.fromServerValue("sol-light");
        Intrinsics.checkNotNull(colorFromServerValue4, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        List listListOf = CollectionsKt.listOf((Object[]) new GradientStop[]{gradientStop, new GradientStop(new ThemedColor(colorFromServerValue3, colorFromServerValue4), 1.0f, 1.0f)});
        GradientDirection gradientDirectionFromServerValue = GradientDirection.INSTANCE.fromServerValue("vertical");
        Intrinsics.checkNotNull(gradientDirectionFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.GradientDirection");
        GradientWithStops gradientWithStops = new GradientWithStops(listListOf, gradientDirectionFromServerValue);
        Insets insets = new Insets(new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0));
        SizingPreference sizingPreferenceFromServerValue = SizingPreference.INSTANCE.fromServerValue("MAX");
        Intrinsics.checkNotNull(sizingPreferenceFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.SizingPreference");
        Decorator decorator = new Decorator(null, spacer, null, null, gradientWithStops, null, 0, i, null, insets, null, null, null, null, null, null, new Sizing(sizingPreferenceFromServerValue, null, 2, null), null, null, null, null, null, 4128045, null);
        Edge.Companion companion3 = Edge.INSTANCE;
        Edge edgeFromServerValue = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue2 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue3 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue3, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint = new LayerConstraint(edgeFromServerValue, edgeFromServerValue2, layoutAxisFromServerValue3, 0.0f);
        Edge edgeFromServerValue3 = companion3.fromServerValue("CENTER");
        Intrinsics.checkNotNull(edgeFromServerValue3, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue4 = companion3.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue4, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue4 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue4, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint2 = new LayerConstraint(edgeFromServerValue3, edgeFromServerValue4, layoutAxisFromServerValue4, -6.0f);
        Edge edgeFromServerValue5 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue5, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue6 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue6, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue5 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue5, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        ZStackLayer zStackLayer = new ZStackLayer(decorator, CollectionsKt.listOf((Object[]) new LayerConstraint[]{layerConstraint, layerConstraint2, new LayerConstraint(edgeFromServerValue5, edgeFromServerValue6, layoutAxisFromServerValue5, 11.0f)}));
        LayoutAxis layoutAxisFromServerValue6 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue6, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayoutAxis layoutAxisFromServerValue7 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue7, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        Spacer spacer2 = new Spacer(2, new PlatformLayoutAxis(layoutAxisFromServerValue6, layoutAxisFromServerValue7));
        Color colorFromServerValue5 = companion2.fromServerValue("sol-light");
        Intrinsics.checkNotNull(colorFromServerValue5, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue6 = companion2.fromServerValue("sol-light");
        Intrinsics.checkNotNull(colorFromServerValue6, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Object[] objArr = null == true ? 1 : 0;
        Decorator decorator2 = new Decorator(null, spacer2, new ThemedColor(colorFromServerValue5, colorFromServerValue6), null, null, null, 0, i, null, new Insets(new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(0, 0, 0)), null, objArr, null, null, null, null, null, null, null, null, null, null, 4193593, null);
        Edge edgeFromServerValue7 = companion3.fromServerValue("CENTER");
        Intrinsics.checkNotNull(edgeFromServerValue7, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue8 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue8, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue8 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue8, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint3 = new LayerConstraint(edgeFromServerValue7, edgeFromServerValue8, layoutAxisFromServerValue8, -6.0f);
        Edge edgeFromServerValue9 = companion3.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue9, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue10 = companion3.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue10, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue9 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue9, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint4 = new LayerConstraint(edgeFromServerValue9, edgeFromServerValue10, layoutAxisFromServerValue9, 0.0f);
        Edge edgeFromServerValue11 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue11, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue12 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue12, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue10 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue10, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        ZStackLayer zStackLayer2 = new ZStackLayer(decorator2, CollectionsKt.listOf((Object[]) new LayerConstraint[]{layerConstraint3, layerConstraint4, new LayerConstraint(edgeFromServerValue11, edgeFromServerValue12, layoutAxisFromServerValue10, 11.0f)}));
        Icon iconFromServerValue = Icon.INSTANCE.fromServerValue("bubble_checked_24");
        Intrinsics.checkNotNull(iconFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Icon");
        Color colorFromServerValue7 = companion2.fromServerValue("sol-light");
        Intrinsics.checkNotNull(colorFromServerValue7, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue8 = companion2.fromServerValue("sol-light");
        Intrinsics.checkNotNull(colorFromServerValue8, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        IconImage iconImage = new IconImage(iconFromServerValue, new ThemedColor(colorFromServerValue7, colorFromServerValue8));
        Edge edgeFromServerValue13 = companion3.fromServerValue("CENTER");
        Intrinsics.checkNotNull(edgeFromServerValue13, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue14 = companion3.fromServerValue("CENTER");
        Intrinsics.checkNotNull(edgeFromServerValue14, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue11 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue11, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint5 = new LayerConstraint(edgeFromServerValue13, edgeFromServerValue14, layoutAxisFromServerValue11, 0.0f);
        Edge edgeFromServerValue15 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue15, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue16 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue16, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue12 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue12, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        ZStackLayer zStackLayer3 = new ZStackLayer(iconImage, CollectionsKt.listOf((Object[]) new LayerConstraint[]{layerConstraint5, new LayerConstraint(edgeFromServerValue15, edgeFromServerValue16, layoutAxisFromServerValue12, 0.0f)}));
        PlainText plainText = new PlainText("Now 3");
        TextStyle.Companion companion4 = TextStyle.INSTANCE;
        TextStyle textStyleFromServerValue = companion4.fromServerValue("TEXT_SMALL");
        Intrinsics.checkNotNull(textStyleFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.TextStyle");
        TextAlignment.Companion companion5 = TextAlignment.INSTANCE;
        TextAlignment textAlignmentFromServerValue = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(textAlignmentFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.TextAlignment");
        Color colorFromServerValue9 = companion2.fromServerValue("sol-light");
        Intrinsics.checkNotNull(colorFromServerValue9, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue10 = companion2.fromServerValue("sol-light");
        Intrinsics.checkNotNull(colorFromServerValue10, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Text text = new Text(plainText, textStyleFromServerValue, textAlignmentFromServerValue, new ThemedColor(colorFromServerValue9, colorFromServerValue10), null, 16, null);
        PlainText plainText2 = new PlainText("Robinhood Strategies");
        TextStyle textStyleFromServerValue2 = companion4.fromServerValue("TEXT_MEDIUM");
        Intrinsics.checkNotNull(textStyleFromServerValue2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.TextStyle");
        TextAlignment textAlignmentFromServerValue2 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(textAlignmentFromServerValue2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.TextAlignment");
        Color colorFromServerValue11 = companion2.fromServerValue("fg");
        Intrinsics.checkNotNull(colorFromServerValue11, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue12 = companion2.fromServerValue("fg");
        Intrinsics.checkNotNull(colorFromServerValue12, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Text text2 = new Text(plainText2, textStyleFromServerValue2, textAlignmentFromServerValue2, new ThemedColor(colorFromServerValue11, colorFromServerValue12), null, 16, null);
        Markdown markdown = new Markdown("Get early access to an expert-managed portfolio. You'll pay zero management fees on your first $1K until Dec 31. [Learn more](http://microgram/0)", null, 2, null);
        TextStyle textStyleFromServerValue3 = companion4.fromServerValue("TEXT_SMALL");
        Intrinsics.checkNotNull(textStyleFromServerValue3, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.TextStyle");
        TextAlignment textAlignmentFromServerValue3 = companion5.fromServerValue("START");
        Intrinsics.checkNotNull(textAlignmentFromServerValue3, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.TextAlignment");
        Color colorFromServerValue13 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue13, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue14 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue14, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        ThemedColor themedColor = new ThemedColor(colorFromServerValue13, colorFromServerValue14);
        Color colorFromServerValue15 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue15, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        Color colorFromServerValue16 = companion2.fromServerValue("fg2");
        Intrinsics.checkNotNull(colorFromServerValue16, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Color");
        List listListOf2 = CollectionsKt.listOf((Object[]) new Text[]{text, text2, new Text(markdown, textStyleFromServerValue3, textAlignmentFromServerValue3, themedColor, new ThemedColor(colorFromServerValue15, colorFromServerValue16))});
        WindowWidthDependentNumber windowWidthDependentNumber = new WindowWidthDependentNumber(0, 0, 0);
        LayoutAxis layoutAxisFromServerValue13 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue13, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayoutAxis layoutAxisFromServerValue14 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue14, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        PlatformLayoutAxis platformLayoutAxis = new PlatformLayoutAxis(layoutAxisFromServerValue13, layoutAxisFromServerValue14);
        PrimaryAxisAlignment primaryAxisAlignmentFromServerValue = PrimaryAxisAlignment.INSTANCE.fromServerValue("START");
        Intrinsics.checkNotNull(primaryAxisAlignmentFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.PrimaryAxisAlignment");
        SecondaryAxisAlignment secondaryAxisAlignmentFromServerValue = SecondaryAxisAlignment.INSTANCE.fromServerValue("START");
        Intrinsics.checkNotNull(secondaryAxisAlignmentFromServerValue, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.SecondaryAxisAlignment");
        String str = null;
        Decorator decorator3 = new Decorator(str, new Container(listListOf2, windowWidthDependentNumber, platformLayoutAxis, primaryAxisAlignmentFromServerValue, secondaryAxisAlignmentFromServerValue), null, null, null, null, 0, null, null, new Insets(new WindowWidthDependentNumber(16, 16, 16), new WindowWidthDependentNumber(0, 0, 0), new WindowWidthDependentNumber(16, 16, 16), new WindowWidthDependentNumber(0, 0, 0)), null, null, null, null, null, null, null, null, null, null, null, null, 4193725, null);
        Edge edgeFromServerValue17 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue17, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue18 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue18, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue15 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue15, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint6 = new LayerConstraint(edgeFromServerValue17, edgeFromServerValue18, layoutAxisFromServerValue15, 0.0f);
        Edge edgeFromServerValue19 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue19, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue20 = companion3.fromServerValue("START");
        Intrinsics.checkNotNull(edgeFromServerValue20, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue16 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue16, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint7 = new LayerConstraint(edgeFromServerValue19, edgeFromServerValue20, layoutAxisFromServerValue16, 40.0f);
        Edge edgeFromServerValue21 = companion3.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue21, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue22 = companion3.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue22, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue17 = companion.fromServerValue("HORIZONTAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue17, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        LayerConstraint layerConstraint8 = new LayerConstraint(edgeFromServerValue21, edgeFromServerValue22, layoutAxisFromServerValue17, 0.0f);
        Edge edgeFromServerValue23 = companion3.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue23, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        Edge edgeFromServerValue24 = companion3.fromServerValue("END");
        Intrinsics.checkNotNull(edgeFromServerValue24, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.Edge");
        LayoutAxis layoutAxisFromServerValue18 = companion.fromServerValue("VERTICAL");
        Intrinsics.checkNotNull(layoutAxisFromServerValue18, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.LayoutAxis");
        return new ZStack<>(CollectionsKt.listOf((Object[]) new ZStackLayer[]{zStackLayer, zStackLayer2, zStackLayer3, new ZStackLayer(decorator3, CollectionsKt.listOf((Object[]) new LayerConstraint[]{layerConstraint6, layerConstraint7, layerConstraint8, new LayerConstraint(edgeFromServerValue23, edgeFromServerValue24, layoutAxisFromServerValue18, 0.0f)}))}));
    }

    public static final void ZStackTimelinePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1504406897);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1504406897, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ZStackTimelinePreview (SduiZStack.kt:839)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SduiZStack2.INSTANCE.m15955getLambda$525058601$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiZStackKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiZStack7.ZStackTimelinePreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
