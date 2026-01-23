package com.robinhood.android.charts.overlay;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Overlays.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0007¢\u0006\u0002\u0010\r\u001a#\u0010\u000e\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002"}, m3636d2 = {"PositionedOverlay", "", "modifier", "Landroidx/compose/ui/Modifier;", "overlay", "Lcom/robinhood/android/charts/overlay/ChartOverlay;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "PositionedOverlay-oSjs1mQ", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/overlay/ChartOverlay;JLandroidx/compose/runtime/Composer;II)V", "Overlays", "overlays", "", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "coerceXInBounds", "Landroidx/compose/ui/unit/IntOffset;", "elementSize", "coerceXInBounds-bA10MnU", "(JJJ)J", "coerceYInBounds", "coerceYInBounds-bA10MnU", "lib-charts_externalDebug", "size"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.overlay.OverlaysKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Overlays2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Overlays$lambda$17(Modifier modifier, List list, int i, int i2, Composer composer, int i3) {
        Overlays(modifier, list, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionedOverlay_oSjs1mQ$lambda$8(Modifier modifier, Overlays overlays, long j, int i, int i2, Composer composer, int i3) {
        m12113PositionedOverlayoSjs1mQ(modifier, overlays, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: PositionedOverlay-oSjs1mQ, reason: not valid java name */
    public static final void m12113PositionedOverlayoSjs1mQ(Modifier modifier, final Overlays overlay, final long j, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Composer composerStartRestartGroup = composer.startRestartGroup(1882851943);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(overlay) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1882851943, i3, -1, "com.robinhood.android.charts.overlay.PositionedOverlay (Overlays.kt:29)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(IntSize.INSTANCE.m8064getZeroYbymL2g()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.charts.overlay.OverlaysKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Overlays2.PositionedOverlay_oSjs1mQ$lambda$4$lambda$3(overlay, j, snapshotState, (Density) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAbsoluteOffset = OffsetKt.absoluteOffset(modifier, (Function1) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.charts.overlay.OverlaysKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Overlays2.PositionedOverlay_oSjs1mQ$lambda$6$lambda$5(snapshotState, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierAbsoluteOffset, (Function1) objRememberedValue3);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            overlay.getContent().invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.overlay.OverlaysKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Overlays2.PositionedOverlay_oSjs1mQ$lambda$8(modifier2, overlay, j, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PositionedOverlay_oSjs1mQ$lambda$2(SnapshotState<IntSize> snapshotState, long j) {
        snapshotState.setValue(IntSize.m8055boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset PositionedOverlay_oSjs1mQ$lambda$4$lambda$3(Overlays overlays, long j, SnapshotState snapshotState, Density absoluteOffset) {
        long j2;
        Intrinsics.checkNotNullParameter(absoluteOffset, "$this$absoluteOffset");
        long jM12111getAlignedOffsetemnUabE = overlays.getPosition().m12111getAlignedOffsetemnUabE(j, PositionedOverlay_oSjs1mQ$lambda$1(snapshotState));
        if (overlays.getCoerceXInBounds()) {
            j2 = j;
            jM12111getAlignedOffsetemnUabE = m12114coerceXInBoundsbA10MnU(jM12111getAlignedOffsetemnUabE, j2, PositionedOverlay_oSjs1mQ$lambda$1(snapshotState));
        } else {
            j2 = j;
        }
        if (overlays.getCoerceYInBounds()) {
            long j3 = j2;
            jM12111getAlignedOffsetemnUabE = m12115coerceYInBoundsbA10MnU(jM12111getAlignedOffsetemnUabE, j3, PositionedOverlay_oSjs1mQ$lambda$1(snapshotState));
        }
        return IntOffset.m8030boximpl(jM12111getAlignedOffsetemnUabE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionedOverlay_oSjs1mQ$lambda$6$lambda$5(SnapshotState snapshotState, IntSize intSize) {
        PositionedOverlay_oSjs1mQ$lambda$2(snapshotState, intSize.getPackedValue());
        return Unit.INSTANCE;
    }

    public static final void Overlays(final Modifier modifier, final List<Overlays> overlays, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1578451096);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(overlays) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1578451096, i3, -1, "com.robinhood.android.charts.overlay.Overlays (Overlays.kt:55)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.charts.overlay.OverlaysKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Overlays2.Overlays$lambda$13$lambda$12(snapshotState, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifier, (Function1) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IntSize intSizeOverlays$lambda$10 = Overlays$lambda$10(snapshotState);
            composerStartRestartGroup.startReplaceGroup(-2031363199);
            if (intSizeOverlays$lambda$10 != null) {
                long packedValue = intSizeOverlays$lambda$10.getPackedValue();
                composerStartRestartGroup.startReplaceGroup(-2031362124);
                Iterator<T> it = overlays.iterator();
                while (it.hasNext()) {
                    m12113PositionedOverlayoSjs1mQ(null, (Overlays) it.next(), packedValue, composerStartRestartGroup, 0, 1);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.overlay.OverlaysKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Overlays2.Overlays$lambda$17(modifier, overlays, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Overlays$lambda$13$lambda$12(SnapshotState snapshotState, IntSize intSize) {
        snapshotState.setValue(intSize);
        return Unit.INSTANCE;
    }

    /* renamed from: coerceXInBounds-bA10MnU, reason: not valid java name */
    private static final long m12114coerceXInBoundsbA10MnU(long j, long j2, long j3) {
        return IntOffset.m8035copyiSbpLlY$default(j, RangesKt.coerceAtMost(RangesKt.coerceAtLeast(IntOffset.m8038getXimpl(j), 0), ((int) (j2 >> 32)) - ((int) (j3 >> 32))), 0, 2, null);
    }

    /* renamed from: coerceYInBounds-bA10MnU, reason: not valid java name */
    private static final long m12115coerceYInBoundsbA10MnU(long j, long j2, long j3) {
        return IntOffset.m8035copyiSbpLlY$default(j, 0, RangesKt.coerceAtMost(RangesKt.coerceAtLeast(IntOffset.m8039getYimpl(j), 0), ((int) (j2 & 4294967295L)) - ((int) (j3 & 4294967295L))), 1, null);
    }

    private static final IntSize Overlays$lambda$10(SnapshotState<IntSize> snapshotState) {
        return snapshotState.getValue();
    }

    private static final long PositionedOverlay_oSjs1mQ$lambda$1(SnapshotState<IntSize> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }
}
