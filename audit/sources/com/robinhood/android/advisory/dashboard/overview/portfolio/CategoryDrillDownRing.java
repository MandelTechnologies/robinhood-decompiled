package com.robinhood.android.advisory.dashboard.overview.portfolio;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctions;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.android.advisory.portfolio.AngleTools;
import com.robinhood.android.advisory.portfolio.PortfolioDonutChart;
import com.robinhood.android.advisory.portfolio.SliceWindow;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CategoryDrillDownRing.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0004X\u008a\u0084\u0002"}, m3636d2 = {"CategoryDrillDownRing", "", "slices", "Lkotlinx/collections/immutable/ImmutableList;", "", "onSliceSelected", "Lkotlin/Function1;", "", "activeIndexWithoutWraparound", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-advisory-dashboard_externalDebug", "center", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/geometry/Size;", "rotation"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownRingKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CategoryDrillDownRing {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryDrillDownRing$lambda$13(ImmutableList immutableList, Function1 function1, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        CategoryDrillDownRing(immutableList, function1, i, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CategoryDrillDownRing(final ImmutableList<Float> slices, final Function1<? super Integer, Unit> onSliceSelected, final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        int i5;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        final float fMo5012toDpu2uoSUM;
        final float size;
        List<SliceWindow> sliceWindows;
        final int i6;
        final float f;
        final long jM21371getBg0d7_KjU;
        final long jM21425getFg0d7_KjU;
        final long jM21427getFg30d7_KjU;
        final Brush brushM6679linearGradientmHitzGk$default;
        final float f2;
        Modifier modifier3;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState;
        final float fM6581getMaxDimensionimpl;
        final float f3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue3;
        Modifier modifierPointerInput;
        boolean zChanged2;
        Object objRememberedValue4;
        Modifier modifier4;
        Modifier modifier5;
        final Modifier modifier6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(slices, "slices");
        Intrinsics.checkNotNullParameter(onSliceSelected, "onSliceSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1482806747);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(slices) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSliceSelected) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier7 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1482806747, i4, -1, "com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownRing (CategoryDrillDownRing.kt:45)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    i5 = i4;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i5 = i4;
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Size.m6574boximpl(Size.INSTANCE.m6589getZeroNHjbRc()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                fMo5012toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (CategoryDrillDownRing$lambda$4(snapshotState2) >> 32)) * 0.38f);
                float f4 = slices.size() <= 1 ? 2.0f : 0.0f;
                size = slices.size() * f4;
                sliceWindows = AngleTools.getSliceWindows(slices, f4, size);
                int size2 = slices.size();
                int i8 = i % size2;
                i6 = i8 + (size2 & (((i8 ^ size2) & ((-i8) | i8)) >> 31));
                float midPoint = sliceWindows.get(i6).getMidPoint();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                f = f4;
                jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i9).m21371getBg0d7_KjU();
                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU();
                jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i9).m21427getFg30d7_KjU();
                Brush.Companion companion2 = Brush.INSTANCE;
                Tuples2<Float, Color>[] activeSliceFill = PortfolioDonutChart.getActiveSliceFill();
                brushM6679linearGradientmHitzGk$default = Brush.Companion.m6679linearGradientmHitzGk$default(companion2, (Tuples2[]) Arrays.copyOf(activeSliceFill, activeSliceFill.length), 0L, 0L, 0, 14, (Object) null);
                f2 = midPoint + 90.0f;
                modifier3 = modifier7;
                snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(-((((float) Math.floor(i / slices.size())) * 360.0f) + f2), AnimationSpecKt.tween$default(200, 0, EasingFunctions.getEaseInOut(), 2, null), 0.0f, null, null, composerStartRestartGroup, 0, 28);
                float fM6581getMaxDimensionimpl2 = Size.m6581getMaxDimensionimpl(CategoryDrillDownRing$lambda$4(snapshotState2)) * 0.025f;
                fM6581getMaxDimensionimpl = (Size.m6581getMaxDimensionimpl(CategoryDrillDownRing$lambda$4(snapshotState2)) / 2) - (Size.m6581getMaxDimensionimpl(CategoryDrillDownRing$lambda$4(snapshotState2)) * 0.01f);
                f3 = fM6581getMaxDimensionimpl - fM6581getMaxDimensionimpl2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Clip.clipToBounds(Modifier.INSTANCE), 0.0f, 1, null);
                String str = "tap_drill_down_slices_" + i6;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(f2) | composerStartRestartGroup.changedInstance(sliceWindows) | ((i5 & 112) != 32);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new CategoryDrillDownRing2(f2, sliceWindows, onSliceSelected, snapshotState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default, str, (PointerInputEventHandler) objRememberedValue3);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged2 = composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState) | composerStartRestartGroup.changed(fM6581getMaxDimensionimpl) | composerStartRestartGroup.changed(f3) | composerStartRestartGroup.changed(brushM6679linearGradientmHitzGk$default) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU) | ((i5 & 14) != 4) | composerStartRestartGroup.changed(i6) | composerStartRestartGroup.changed(f) | composerStartRestartGroup.changed(fMo5012toDpu2uoSUM) | composerStartRestartGroup.changed(size) | composerStartRestartGroup.changed(f2) | composerStartRestartGroup.changed(jM21425getFg0d7_KjU) | composerStartRestartGroup.changed(jM21427getFg30d7_KjU);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    modifier4 = modifierPointerInput;
                    modifier5 = modifier3;
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownRingKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CategoryDrillDownRing.CategoryDrillDownRing$lambda$12$lambda$11$lambda$10(snapshotState4AnimateFloatAsState, snapshotState, fM6581getMaxDimensionimpl, f3, brushM6679linearGradientmHitzGk$default, jM21371getBg0d7_KjU, slices, i6, f, fMo5012toDpu2uoSUM, size, f2, jM21425getFg0d7_KjU, jM21427getFg30d7_KjU, snapshotState2, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    modifier4 = modifierPointerInput;
                    modifier5 = modifier3;
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifier4, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier6 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier6 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownRingKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CategoryDrillDownRing.CategoryDrillDownRing$lambda$13(slices, onSliceSelected, i, modifier6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i4 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue != companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            fMo5012toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (CategoryDrillDownRing$lambda$4(snapshotState2) >> 32)) * 0.38f);
            if (slices.size() <= 1) {
            }
            size = slices.size() * f4;
            sliceWindows = AngleTools.getSliceWindows(slices, f4, size);
            int size22 = slices.size();
            int i82 = i % size22;
            i6 = i82 + (size22 & (((i82 ^ size22) & ((-i82) | i82)) >> 31));
            float midPoint2 = sliceWindows.get(i6).getMidPoint();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i92 = BentoTheme.$stable;
            f = f4;
            jM21371getBg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i92).m21371getBg0d7_KjU();
            jM21425getFg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i92).m21425getFg0d7_KjU();
            jM21427getFg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i92).m21427getFg30d7_KjU();
            Brush.Companion companion22 = Brush.INSTANCE;
            Tuples2<Float, Color>[] activeSliceFill2 = PortfolioDonutChart.getActiveSliceFill();
            brushM6679linearGradientmHitzGk$default = Brush.Companion.m6679linearGradientmHitzGk$default(companion22, (Tuples2[]) Arrays.copyOf(activeSliceFill2, activeSliceFill2.length), 0L, 0L, 0, 14, (Object) null);
            f2 = midPoint2 + 90.0f;
            modifier3 = modifier7;
            snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(-((((float) Math.floor(i / slices.size())) * 360.0f) + f2), AnimationSpecKt.tween$default(200, 0, EasingFunctions.getEaseInOut(), 2, null), 0.0f, null, null, composerStartRestartGroup, 0, 28);
            float fM6581getMaxDimensionimpl22 = Size.m6581getMaxDimensionimpl(CategoryDrillDownRing$lambda$4(snapshotState2)) * 0.025f;
            fM6581getMaxDimensionimpl = (Size.m6581getMaxDimensionimpl(CategoryDrillDownRing$lambda$4(snapshotState2)) / 2) - (Size.m6581getMaxDimensionimpl(CategoryDrillDownRing$lambda$4(snapshotState2)) * 0.01f);
            f3 = fM6581getMaxDimensionimpl - fM6581getMaxDimensionimpl22;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Clip.clipToBounds(Modifier.INSTANCE), 0.0f, 1, null);
                String str2 = "tap_drill_down_slices_" + i6;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(f2) | composerStartRestartGroup.changedInstance(sliceWindows) | ((i5 & 112) != 32);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue3 = new CategoryDrillDownRing2(f2, sliceWindows, onSliceSelected, snapshotState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default2, str2, (PointerInputEventHandler) objRememberedValue3);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged2 = composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState) | composerStartRestartGroup.changed(fM6581getMaxDimensionimpl) | composerStartRestartGroup.changed(f3) | composerStartRestartGroup.changed(brushM6679linearGradientmHitzGk$default) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU) | ((i5 & 14) != 4) | composerStartRestartGroup.changed(i6) | composerStartRestartGroup.changed(f) | composerStartRestartGroup.changed(fMo5012toDpu2uoSUM) | composerStartRestartGroup.changed(size) | composerStartRestartGroup.changed(f2) | composerStartRestartGroup.changed(jM21425getFg0d7_KjU) | composerStartRestartGroup.changed(jM21427getFg30d7_KjU);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        modifier4 = modifierPointerInput;
                        modifier5 = modifier3;
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownRingKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CategoryDrillDownRing.CategoryDrillDownRing$lambda$12$lambda$11$lambda$10(snapshotState4AnimateFloatAsState, snapshotState, fM6581getMaxDimensionimpl, f3, brushM6679linearGradientmHitzGk$default, jM21371getBg0d7_KjU, slices, i6, f, fMo5012toDpu2uoSUM, size, f2, jM21425getFg0d7_KjU, jM21427getFg30d7_KjU, snapshotState2, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        composerStartRestartGroup.endReplaceGroup();
                        Canvas2.Canvas(modifier4, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier6 = modifier5;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void CategoryDrillDownRing$lambda$2(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    private static final void CategoryDrillDownRing$lambda$5(SnapshotState<Size> snapshotState, long j) {
        snapshotState.setValue(Size.m6574boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CategoryDrillDownRing$lambda$1(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    private static final long CategoryDrillDownRing$lambda$4(SnapshotState<Size> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    private static final float CategoryDrillDownRing$lambda$7(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryDrillDownRing$lambda$12$lambda$11$lambda$10(SnapshotState4 snapshotState4, SnapshotState snapshotState, float f, float f2, Brush brush, long j, ImmutableList immutableList, int i, float f3, float f4, float f5, float f6, long j2, long j3, SnapshotState snapshotState2, DrawScope Canvas) throws Throwable {
        DrawContext drawContext;
        long j4;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fCategoryDrillDownRing$lambda$7 = CategoryDrillDownRing$lambda$7(snapshotState4);
        long jCategoryDrillDownRing$lambda$1 = CategoryDrillDownRing$lambda$1(snapshotState);
        DrawContext drawContext2 = Canvas.getDrawContext();
        long jMo6936getSizeNHjbRc = drawContext2.mo6936getSizeNHjbRc();
        drawContext2.getCanvas().save();
        try {
            drawContext2.getTransform().mo6941rotateUv8p0NA(fCategoryDrillDownRing$lambda$7, jCategoryDrillDownRing$lambda$1);
            float fM6581getMaxDimensionimpl = Size.m6581getMaxDimensionimpl(Canvas.mo6963getSizeNHjbRc());
            CategoryDrillDownRing$lambda$5(snapshotState2, Size.m6575constructorimpl((Float.floatToRawIntBits(Size.m6581getMaxDimensionimpl(Canvas.mo6963getSizeNHjbRc())) << 32) | (Float.floatToRawIntBits(fM6581getMaxDimensionimpl) & 4294967295L)));
            float f7 = 2;
            float fM6581getMaxDimensionimpl2 = Size.m6581getMaxDimensionimpl(CategoryDrillDownRing$lambda$4(snapshotState2)) / f7;
            float fM6581getMaxDimensionimpl3 = Size.m6581getMaxDimensionimpl(CategoryDrillDownRing$lambda$4(snapshotState2)) / f7;
            CategoryDrillDownRing$lambda$2(snapshotState, Offset.m6535constructorimpl((Float.floatToRawIntBits(fM6581getMaxDimensionimpl2) << 32) | (Float.floatToRawIntBits(fM6581getMaxDimensionimpl3) & 4294967295L)));
            Rect rectM6564Rect3MmeM6k = Rect2.m6564Rect3MmeM6k(CategoryDrillDownRing$lambda$1(snapshotState), f);
            Rect rectM6564Rect3MmeM6k2 = Rect2.m6564Rect3MmeM6k(CategoryDrillDownRing$lambda$1(snapshotState), f2);
            try {
                DrawScope.m6944drawArcillE91I$default(Canvas, brush, 0.0f, 360.0f, true, 0L, CategoryDrillDownRing$lambda$4(snapshotState2), 0.0f, null, null, 0, 976, null);
                PortfolioDonutChart.m11148cutouthwW44Og(Canvas, rectM6564Rect3MmeM6k2, j, CategoryDrillDownRing$lambda$4(snapshotState2));
                long jCategoryDrillDownRing$lambda$12 = CategoryDrillDownRing$lambda$1(snapshotState);
                long jCategoryDrillDownRing$lambda$4 = CategoryDrillDownRing$lambda$4(snapshotState2);
                Brush.Companion companion = Brush.INSTANCE;
                Tuples2<Float, Color>[] activeSliceStroke = PortfolioDonutChart.getActiveSliceStroke();
                PortfolioDonutChart.m11150drawSliceStrokesLl2eoaw$default(Canvas, immutableList, Integer.valueOf(i), f3, j, jCategoryDrillDownRing$lambda$4, jCategoryDrillDownRing$lambda$12, rectM6564Rect3MmeM6k, rectM6564Rect3MmeM6k2, f4, Brush.Companion.m6679linearGradientmHitzGk$default(companion, (Tuples2[]) Arrays.copyOf(activeSliceStroke, activeSliceStroke.length), 0L, 0L, 0, 14, (Object) null), f5, null, brush, 2048, null);
                DrillDownDial.m11020drillDownInnerDialPdMbvOo(Canvas, f4, f6 % 360.0f, j2, j3, CategoryDrillDownRing$lambda$1(snapshotState));
                drawContext2.getCanvas().restore();
                drawContext2.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                drawContext = drawContext2;
                j4 = jMo6936getSizeNHjbRc;
                drawContext.getCanvas().restore();
                drawContext.mo6937setSizeuvyYCjk(j4);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            drawContext = drawContext2;
            j4 = jMo6936getSizeNHjbRc;
        }
    }
}
