package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState2;
import com.robinhood.android.optionschain.sbschain.table.TableCellState;
import com.robinhood.android.optionschain.sbschain.table.TableRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: OptionSideBySideChainLoadingTable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\"\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"OptionSideBySideChainLoadingTable", "", "callPutSwitcherState", "Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "metricSize", "", "leftScrollableRowOffset", "Landroidx/compose/ui/unit/Dp;", "leftScrollableRowWidth", "rightScrollableRowOffset", "rightScrollableRowWidth", "stickCellOffset", "stickyCellBackgroundBrush", "Landroidx/compose/ui/graphics/Brush;", "cellWidth", "OptionSideBySideChainLoadingTable-ntPy8-A", "(Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;IFFFFFLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/runtime/Composer;I)V", "OptionSideBySideChainLoadingTableShimmer", "rowWidthPx", "", "numOfCellsCanHoldOneSide", "modifier", "Landroidx/compose/ui/Modifier;", "(FILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getLoadingInstrumentRow", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$InstrumentRow;", "rowIndex", "LOADING_TABLE_QUOTE_INDEX", "LOADING_SHIMMER_GRADIENT_WIDTH_PERCENT", "LOADING_PLACEHOLDER_STRING", "", "feature-options-chain_externalDebug", "shimmerProgress"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainLoadingTable {
    private static final String LOADING_PLACEHOLDER_STRING = "            ";
    private static final float LOADING_SHIMMER_GRADIENT_WIDTH_PERCENT = 0.8f;
    private static final int LOADING_TABLE_QUOTE_INDEX = 20;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainLoadingTableShimmer$lambda$5(float f, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        OptionSideBySideChainLoadingTableShimmer(f, i, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainLoadingTable_ntPy8_A$lambda$2(OptionSideBySideChainDataState2 optionSideBySideChainDataState2, int i, float f, float f2, float f3, float f4, float f5, Brush brush, float f6, int i2, Composer composer, int i3) {
        m17251OptionSideBySideChainLoadingTablentPy8A(optionSideBySideChainDataState2, i, f, f2, f3, f4, f5, brush, f6, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: OptionSideBySideChainLoadingTable-ntPy8-A, reason: not valid java name */
    public static final void m17251OptionSideBySideChainLoadingTablentPy8A(final OptionSideBySideChainDataState2 optionSideBySideChainDataState2, final int i, final float f, final float f2, final float f3, final float f4, final float f5, final Brush brush, final float f6, Composer composer, final int i2) {
        int i3;
        float f7;
        float f8;
        float f9;
        int i4;
        int i5;
        OptionSideBySideChainDataState2 callPutSwitcherState = optionSideBySideChainDataState2;
        int i6 = i;
        Brush stickyCellBackgroundBrush = brush;
        Intrinsics.checkNotNullParameter(callPutSwitcherState, "callPutSwitcherState");
        Intrinsics.checkNotNullParameter(stickyCellBackgroundBrush, "stickyCellBackgroundBrush");
        Composer composerStartRestartGroup = composer.startRestartGroup(-645182752);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(callPutSwitcherState.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i6) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            f7 = f;
            i3 |= composerStartRestartGroup.changed(f7) ? 256 : 128;
        } else {
            f7 = f;
        }
        if ((i2 & 3072) == 0) {
            f8 = f2;
            i3 |= composerStartRestartGroup.changed(f8) ? 2048 : 1024;
        } else {
            f8 = f2;
        }
        if ((i2 & 24576) == 0) {
            f9 = f3;
            i3 |= composerStartRestartGroup.changed(f9) ? 16384 : 8192;
        } else {
            f9 = f3;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f5) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(stickyCellBackgroundBrush) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f6) ? 67108864 : 33554432;
        }
        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-645182752, i3, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTable (OptionSideBySideChainLoadingTable.kt:36)");
            }
            Modifier modifierClipToBounds = Clip.clipToBounds(Modifier.INSTANCE);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.wrapContentHeight(modifierClipToBounds, companion.getCenterVertically(), true), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = OptionSideBySideChainLoadingTable2.INSTANCE;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierM4872backgroundbw27NRU$default, unit, (PointerInputEventHandler) objRememberedValue);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
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
            int i7 = i3;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-420614307);
            int i8 = 0;
            while (i8 < 41) {
                if (i8 == 20) {
                    composerStartRestartGroup.startReplaceGroup(-154073675);
                    OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainUnderlyingQuoteRow(LOADING_PLACEHOLDER_STRING, LoadingStyle.NORMAL, callPutSwitcherState == OptionSideBySideChainDataState2.BOTH, null, composerStartRestartGroup, 3126);
                    composerStartRestartGroup.endReplaceGroup();
                    i4 = i8;
                    i5 = i7;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-153714292);
                    int i9 = i7 << 3;
                    Composer composer2 = composerStartRestartGroup;
                    i4 = i8;
                    i5 = i7;
                    OptionSideBySideChainTableKt.m17267OptionSideBySideChainTableRowirZm130(0.0f, getLoadingInstrumentRow(i8, i6), optionSideBySideChainDataState2, f7, f8, f9, f4, f5, stickyCellBackgroundBrush, f6, false, null, null, null, null, null, null, null, null, null, composer2, ((i7 << 6) & 896) | 6 | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9) | (i9 & 1879048192), 6, 1046528);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                }
                i8 = i4 + 1;
                callPutSwitcherState = optionSideBySideChainDataState2;
                i6 = i;
                f7 = f;
                f8 = f2;
                f9 = f3;
                stickyCellBackgroundBrush = brush;
                i7 = i5;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainLoadingTable.OptionSideBySideChainLoadingTable_ntPy8_A$lambda$2(optionSideBySideChainDataState2, i, f, f2, f3, f4, f5, brush, f6, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7 A[LOOP:0: B:47:0x00c5->B:48:0x00c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionSideBySideChainLoadingTableShimmer(final float f, final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1357190939);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1357190939, i4, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableShimmer (OptionSideBySideChainLoadingTable.kt:78)");
                }
                SnapshotState4<Float> snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition("loading shimmer transition", composerStartRestartGroup, 6, 0), 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null), "loading shimmer progress", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
                i5 = (i * 2) + 1;
                float f2 = f / i5;
                composerStartRestartGroup.startReplaceGroup(-1409538771);
                ArrayList arrayList = new ArrayList(i5);
                i6 = 0;
                while (i6 < i5) {
                    float f3 = (i6 * f2) / f;
                    i6++;
                    float f4 = ((i6 * f2) / f) - f3;
                    Float fValueOf = Float.valueOf(((OptionSideBySideChainLoadingTableShimmer$lambda$3(snapshotState4AnimateFloat) - 0.4f) * f4) + f3);
                    Color.Companion companion = Color.INSTANCE;
                    arrayList.add(CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(fValueOf, Color.m6701boximpl(companion.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf((OptionSideBySideChainLoadingTableShimmer$lambda$3(snapshotState4AnimateFloat) * f4) + f3), Color.m6701boximpl(Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(f3 + (f4 * (OptionSideBySideChainLoadingTableShimmer$lambda$3(snapshotState4AnimateFloat) + 0.4f))), Color.m6701boximpl(companion.m6725getTransparent0d7_KjU()))}));
                }
                composerStartRestartGroup.endReplaceGroup();
                List listFlatten = CollectionsKt.flatten(arrayList);
                Brush.Companion companion2 = Brush.INSTANCE;
                Tuples2[] tuples2Arr = (Tuples2[]) listFlatten.toArray(new Tuples2[0]);
                Modifier modifier5 = modifier4;
                BoxKt.Box(Background3.background$default(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), Brush.Companion.m6677horizontalGradient8A3gB4$default(companion2, (Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length), 0.0f, f, 0, 8, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionSideBySideChainLoadingTable.OptionSideBySideChainLoadingTableShimmer$lambda$5(f, i, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        modifier2 = modifier;
        if ((i4 & 147) == 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            SnapshotState4<Float> snapshotState4AnimateFloat2 = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition("loading shimmer transition", composerStartRestartGroup, 6, 0), 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null), "loading shimmer progress", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            i5 = (i * 2) + 1;
            float f22 = f / i5;
            composerStartRestartGroup.startReplaceGroup(-1409538771);
            ArrayList arrayList2 = new ArrayList(i5);
            i6 = 0;
            while (i6 < i5) {
            }
            composerStartRestartGroup.endReplaceGroup();
            List listFlatten2 = CollectionsKt.flatten(arrayList2);
            Brush.Companion companion22 = Brush.INSTANCE;
            Tuples2[] tuples2Arr2 = (Tuples2[]) listFlatten2.toArray(new Tuples2[0]);
            Modifier modifier52 = modifier4;
            BoxKt.Box(Background3.background$default(SizeKt.fillMaxSize$default(modifier52, 0.0f, 1, null), Brush.Companion.m6677horizontalGradient8A3gB4$default(companion22, (Tuples2[]) Arrays.copyOf(tuples2Arr2, tuples2Arr2.length), 0.0f, f, 0, 8, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final float OptionSideBySideChainLoadingTableShimmer$lambda$3(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final TableRowState.InstrumentRow getLoadingInstrumentRow(int i, int i2) {
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i2 - 2, 0);
        ArrayList arrayList = new ArrayList(iCoerceAtLeast);
        for (int i3 = 0; i3 < iCoerceAtLeast; i3++) {
            arrayList.add(LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionSideBySideChainLoadingTable.LOADING_PLACEHOLDER_STRING;
                }
            }));
        }
        LoadingStyle loadingStyle = LoadingStyle.NORMAL;
        TableCellState.BidAsk bidAsk = new TableCellState.BidAsk(true, false, loadingStyle, null, null, false, false, null, LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionSideBySideChainLoadingTable.getLoadingInstrumentRow$lambda$8();
            }
        }), 64, null);
        TableCellState.BidAsk bidAsk2 = new TableCellState.BidAsk(false, false, loadingStyle, null, null, false, false, null, LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionSideBySideChainLoadingTable.getLoadingInstrumentRow$lambda$9();
            }
        }), 64, null);
        TableCellState.BidAsk bidAsk3 = new TableCellState.BidAsk(true, false, loadingStyle, null, null, false, false, null, LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionSideBySideChainLoadingTable.getLoadingInstrumentRow$lambda$10();
            }
        }), 64, null);
        TableCellState.BidAsk bidAsk4 = new TableCellState.BidAsk(false, false, loadingStyle, null, null, false, false, null, LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionSideBySideChainLoadingTable.getLoadingInstrumentRow$lambda$11();
            }
        }), 64, null);
        Lazy lazy = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionSideBySideChainLoadingTable.LOADING_PLACEHOLDER_STRING;
            }
        });
        SelectedLegIndicator selectedLegIndicator = SelectedLegIndicator.NONE;
        return new TableRowState.InstrumentRow(bidAsk, bidAsk2, bidAsk3, bidAsk4, lazy, arrayList, arrayList, false, loadingStyle, false, false, i, selectedLegIndicator, selectedLegIndicator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLoadingInstrumentRow$lambda$8() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLoadingInstrumentRow$lambda$9() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLoadingInstrumentRow$lambda$10() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLoadingInstrumentRow$lambda$11() {
        return "";
    }
}
