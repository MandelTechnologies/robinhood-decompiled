package com.robinhood.android.generic.table;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.draw.Shadow3;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: StickyColumn.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aÓ\u0001\u0010\u001d\u001a\u00020\u0010\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2d\u0010\u001a\u001a`\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00100\u0012H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a»\u0001\u0010!\u001a\u00020\u0010\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0007\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2d\u0010\u001a\u001a`\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00100\u0012H\u0003¢\u0006\u0004\b\u001f\u0010 \u001aÑ\u0001\u0010%\u001a\u00020\u0010\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2d\u0010\u001a\u001a`\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00100\u0012H\u0003¢\u0006\u0004\b#\u0010$¨\u0006*²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002²\u0006\f\u0010(\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002²\u0006\f\u0010(\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/generic/table/GenericCell;", "T", "", "rowIndex", "Lkotlinx/collections/immutable/ImmutableList;", "row", "Lcom/robinhood/android/generic/table/GenericStickyColumn;", "stickyColumnDetails", "Landroidx/compose/ui/unit/Dp;", "columnWidths", "Landroidx/compose/foundation/ScrollState;", "horizontalScrollState", "rowHeight", "", "stickyColumnExpanded", "Lkotlin/Function0;", "", "onStickyColumnExpanded", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "cell", "height", "width", "Lcom/robinhood/android/generic/table/DisplayDetails;", "displayDetails", "displayCell", "GenericTableStickyColumnComposable-eHTjO5g", "(ILkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/generic/table/GenericStickyColumn;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/foundation/ScrollState;FZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "GenericTableStickyColumnComposable", "Lcom/robinhood/android/generic/table/GenericStickyColumn$StickAtEndUntilOnScreen;", "StickAtEndComposable-HYR8e34", "(ILkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/generic/table/GenericStickyColumn$StickAtEndUntilOnScreen;Landroidx/compose/foundation/ScrollState;FLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "StickAtEndComposable", "Lcom/robinhood/android/generic/table/GenericStickyColumn$StickAtStartAfterOnScreen;", "StickAtStartComposable-eHTjO5g", "(ILkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/generic/table/GenericStickyColumn$StickAtStartAfterOnScreen;Landroidx/compose/foundation/ScrollState;FZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "StickAtStartComposable", "", "stickyColumnOffsetToBaseColumn", "isVisible", "collapsedColumnWidth", "lib-generic-table_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.generic.table.StickyColumnKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class StickyColumn2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTableStickyColumnComposable_eHTjO5g$lambda$0(int i, ImmutableList immutableList, StickyColumn stickyColumn, ImmutableList immutableList2, ScrollState scrollState, float f, boolean z, Function0 function0, Function6 function6, int i2, Composer composer, int i3) {
        m14978GenericTableStickyColumnComposableeHTjO5g(i, immutableList, stickyColumn, immutableList2, scrollState, f, z, function0, function6, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickAtEndComposable_HYR8e34$lambda$12(int i, ImmutableList immutableList, ImmutableList immutableList2, StickyColumn.StickAtEndUntilOnScreen stickAtEndUntilOnScreen, ScrollState scrollState, float f, Function6 function6, int i2, Composer composer, int i3) {
        m14979StickAtEndComposableHYR8e34(i, immutableList, immutableList2, stickAtEndUntilOnScreen, scrollState, f, function6, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickAtStartComposable_eHTjO5g$lambda$31(int i, ImmutableList immutableList, ImmutableList immutableList2, StickyColumn.StickAtStartAfterOnScreen stickAtStartAfterOnScreen, ScrollState scrollState, float f, boolean z, Function0 function0, Function6 function6, int i2, Composer composer, int i3) {
        m14980StickAtStartComposableeHTjO5g(i, immutableList, immutableList2, stickAtStartAfterOnScreen, scrollState, f, z, function0, function6, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: GenericTableStickyColumnComposable-eHTjO5g, reason: not valid java name */
    public static final <T extends GenericCell> void m14978GenericTableStickyColumnComposableeHTjO5g(final int i, final ImmutableList<? extends T> row, final StickyColumn stickyColumn, final ImmutableList<C2002Dp> columnWidths, final ScrollState horizontalScrollState, final float f, final boolean z, final Function0<Unit> onStickyColumnExpanded, final Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> displayCell, Composer composer, final int i2) {
        int i3;
        float f2;
        boolean z2;
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(columnWidths, "columnWidths");
        Intrinsics.checkNotNullParameter(horizontalScrollState, "horizontalScrollState");
        Intrinsics.checkNotNullParameter(onStickyColumnExpanded, "onStickyColumnExpanded");
        Intrinsics.checkNotNullParameter(displayCell, "displayCell");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1481356265);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(row) : composerStartRestartGroup.changedInstance(row) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? composerStartRestartGroup.changed(stickyColumn) : composerStartRestartGroup.changedInstance(stickyColumn) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(columnWidths) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalScrollState) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            f2 = f;
            i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
        } else {
            f2 = f;
        }
        if ((1572864 & i2) == 0) {
            z2 = z;
            i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
        } else {
            z2 = z;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStickyColumnExpanded) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(displayCell) ? 67108864 : 33554432;
        }
        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1481356265, i3, -1, "com.robinhood.android.generic.table.GenericTableStickyColumnComposable (StickyColumn.kt:56)");
            }
            if (stickyColumn instanceof StickyColumn.StickAtEndUntilOnScreen) {
                composerStartRestartGroup.startReplaceGroup(-294974025);
                m14979StickAtEndComposableHYR8e34(i, row, columnWidths, (StickyColumn.StickAtEndUntilOnScreen) stickyColumn, horizontalScrollState, f2, displayCell, composerStartRestartGroup, (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i3 >> 3) & 896) | (i3 & 57344) | (i3 & 458752) | ((i3 >> 6) & 3670016));
                composerStartRestartGroup.endReplaceGroup();
            } else if (stickyColumn instanceof StickyColumn.StickAtStartAfterOnScreen) {
                composerStartRestartGroup.startReplaceGroup(-294539529);
                m14980StickAtStartComposableeHTjO5g(i, row, columnWidths, (StickyColumn.StickAtStartAfterOnScreen) stickyColumn, horizontalScrollState, f, z2, onStickyColumnExpanded, displayCell, composerStartRestartGroup, (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i3 >> 3) & 896) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (29360128 & i3) | (234881024 & i3));
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (stickyColumn != null) {
                    composerStartRestartGroup.startReplaceGroup(-1949180020);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-294040181);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.StickyColumnKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StickyColumn2.GenericTableStickyColumnComposable_eHTjO5g$lambda$0(i, row, stickyColumn, columnWidths, horizontalScrollState, f, z, onStickyColumnExpanded, displayCell, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean StickAtEndComposable_HYR8e34$lambda$10(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final float StickAtEndComposable_HYR8e34$lambda$6(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float StickAtStartComposable_eHTjO5g$lambda$18(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final boolean StickAtStartComposable_eHTjO5g$lambda$22(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final float StickAtStartComposable_eHTjO5g$lambda$26(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* renamed from: StickAtEndComposable-HYR8e34, reason: not valid java name */
    private static final <T extends GenericCell> void m14979StickAtEndComposableHYR8e34(final int i, final ImmutableList<? extends T> immutableList, final ImmutableList<C2002Dp> immutableList2, final StickyColumn.StickAtEndUntilOnScreen stickAtEndUntilOnScreen, final ScrollState scrollState, final float f, final Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> function6, Composer composer, final int i2) {
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1299649710);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = (composerStartRestartGroup.changed(i3) ? 4 : 2) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(immutableList2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(stickAtEndUntilOnScreen) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(scrollState) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function6) ? 1048576 : 524288;
        }
        int i5 = i4;
        if ((599187 & i5) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1299649710, i5, -1, "com.robinhood.android.generic.table.StickAtEndComposable (StickyColumn.kt:99)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final int columnIndex = stickAtEndUntilOnScreen.getColumnIndex();
            final int iMo7449getContainerSizeYbymL2g = (int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32);
            float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(iMo7449getContainerSizeYbymL2g);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = ((i5 & 896) == 256) | composerStartRestartGroup.changed(columnIndex);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.generic.table.StickyColumnKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(StickyColumn2.StickAtEndComposable_HYR8e34$lambda$5$lambda$4(density, columnIndex, immutableList2, iMo7449getContainerSizeYbymL2g));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(density.mo5013toDpu2uoSUM(scrollState.getValue()) + fMo5013toDpu2uoSUM) - immutableList2.get(columnIndex).getValue());
            int value = scrollState.getValue();
            float fStickAtEndComposable_HYR8e34$lambda$6 = StickAtEndComposable_HYR8e34$lambda$6(snapshotState4);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(fStickAtEndComposable_HYR8e34$lambda$6);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.generic.table.StickyColumnKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(StickyColumn2.StickAtEndComposable_HYR8e34$lambda$9$lambda$8(scrollState, snapshotState4));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(Background3.m4872backgroundbw27NRU$default(ZIndexModifier2.zIndex(OffsetKt.m5125offsetVpY3zN4$default(companion, fM7995constructorimpl, 0.0f, 2, null), StickAtEndComposable_HYR8e34$lambda$10((SnapshotState4) objRememberedValue2) ? 1.0f : -99.0f), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), immutableList2.get(columnIndex).getValue(), f);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5171sizeVpY3zN4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            float f2 = (float) 0.5d;
            Spacer2.Spacer(SizeKt.m5163requiredSizeVpY3zN4(BoxScopeInstance.INSTANCE.align(Shadow3.m6468shadows4CzXII$default(companion, C2002Dp.m7995constructorimpl(1), null, false, 0L, 0L, 30, null), companion2.getCenterStart()), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f + C2002Dp.m7995constructorimpl(f2))), composerStartRestartGroup, 0);
            function6.invoke(immutableList.get(columnIndex), C2002Dp.m7993boximpl(f), immutableList2.get(columnIndex), new DisplayDetails(i3, columnIndex, false, true, scrollState), composerStartRestartGroup, Integer.valueOf(((i5 >> 12) & 112) | (57344 & (i5 >> 6))));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.StickyColumnKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StickyColumn2.StickAtEndComposable_HYR8e34$lambda$12(i, immutableList, immutableList2, stickAtEndUntilOnScreen, scrollState, f, function6, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float StickAtEndComposable_HYR8e34$lambda$5$lambda$4(Density density, int i, ImmutableList immutableList, int i2) {
        float value = 0.0f;
        if (i == 0) {
            return 0.0f;
        }
        Iterator<E> it = immutableList.subList(0, i + 1).iterator();
        while (it.hasNext()) {
            value += ((C2002Dp) it.next()).getValue();
        }
        return value - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StickAtEndComposable_HYR8e34$lambda$9$lambda$8(ScrollState scrollState, SnapshotState4 snapshotState4) {
        return ((float) scrollState.getValue()) < StickAtEndComposable_HYR8e34$lambda$6(snapshotState4) - ((float) 2);
    }

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* renamed from: StickAtStartComposable-eHTjO5g, reason: not valid java name */
    private static final <T extends GenericCell> void m14980StickAtStartComposableeHTjO5g(final int i, final ImmutableList<? extends T> immutableList, final ImmutableList<C2002Dp> immutableList2, final StickyColumn.StickAtStartAfterOnScreen stickAtStartAfterOnScreen, final ScrollState scrollState, final float f, final boolean z, final Function0<Unit> function0, final Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> function6, Composer composer, final int i2) {
        int i3;
        int i4;
        final float f2;
        ?? r0;
        int i5;
        Object objDerivedStateOf;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(272984028);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(immutableList2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(stickAtStartAfterOnScreen) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(scrollState) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function6) ? 67108864 : 33554432;
        }
        if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(272984028, i3, -1, "com.robinhood.android.generic.table.StickAtStartComposable (StickyColumn.kt:172)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final int columnIndex = stickAtStartAfterOnScreen.getColumnIndex();
            composerStartRestartGroup.startReplaceGroup(344664461);
            float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i6 = i3 & 896;
            boolean zChanged = (i6 == 256) | composerStartRestartGroup.changed(columnIndex);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.generic.table.StickyColumnKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(StickyColumn2.StickAtStartComposable_eHTjO5g$lambda$17$lambda$16(density, columnIndex, immutableList2));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            float fMo5013toDpu2uoSUM2 = density.mo5013toDpu2uoSUM(scrollState.getValue());
            int value = scrollState.getValue();
            float fStickAtStartComposable_eHTjO5g$lambda$18 = StickAtStartComposable_eHTjO5g$lambda$18(snapshotState4);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(fStickAtStartComposable_eHTjO5g$lambda$18);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.generic.table.StickyColumnKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(StickyColumn2.StickAtStartComposable_eHTjO5g$lambda$21$lambda$20(scrollState, snapshotState4));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            float fStickAtStartComposable_eHTjO5g$lambda$182 = StickAtStartComposable_eHTjO5g$lambda$18(snapshotState4);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged3 = composerStartRestartGroup.changed(fStickAtStartComposable_eHTjO5g$lambda$182) | ((i3 & 7168) == 2048) | composerStartRestartGroup.changed(fMo5013toDpu2uoSUM2) | (i6 == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                i4 = i3;
                f2 = fMo5013toDpu2uoSUM2;
                r0 = 0;
                i5 = columnIndex;
                objDerivedStateOf = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.generic.table.StickyColumnKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StickyColumn2.StickAtStartComposable_eHTjO5g$lambda$25$lambda$24(stickAtStartAfterOnScreen, immutableList2, columnIndex, f2, density, snapshotState4);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objDerivedStateOf);
            } else {
                i4 = i3;
                objDerivedStateOf = objRememberedValue3;
                f2 = fMo5013toDpu2uoSUM2;
                i5 = columnIndex;
                r0 = 0;
            }
            SnapshotState4 snapshotState43 = (SnapshotState4) objDerivedStateOf;
            composerStartRestartGroup.endReplaceGroup();
            if (!z) {
                fMo5013toDpu2uoSUM = StickAtStartComposable_eHTjO5g$lambda$26(snapshotState43);
            }
            composerStartRestartGroup.startReplaceGroup(344725199);
            Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(ZIndexModifier2.zIndex(OffsetKt.m5125offsetVpY3zN4$default(Modifier.INSTANCE, f2, 0.0f, 2, null), StickAtStartComposable_eHTjO5g$lambda$22(snapshotState42) ? 1.0f : -99.0f), fMo5013toDpu2uoSUM, f);
            if (stickAtStartAfterOnScreen.getExpandable()) {
                InteractionSource3 interactionSource3MutableInteractionSource = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z2 = (29360128 & i4) != 8388608 ? r0 : true;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.generic.table.StickyColumnKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StickyColumn2.StickAtStartComposable_eHTjO5g$lambda$29$lambda$28$lambda$27(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierM5171sizeVpY3zN4 = ClickableKt.m4891clickableO2vRcR0$default(modifierM5171sizeVpY3zN4, interactionSource3MutableInteractionSource, null, false, null, null, (Function0) objRememberedValue4, 28, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), r0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5171sizeVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            function6.invoke(immutableList.get(i5), C2002Dp.m7993boximpl(f), C2002Dp.m7993boximpl(fMo5013toDpu2uoSUM), new DisplayDetails(i, i5, false, true, scrollState), composer2, Integer.valueOf((i4 >> 12) & 57456));
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.StickyColumnKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StickyColumn2.StickAtStartComposable_eHTjO5g$lambda$31(i, immutableList, immutableList2, stickAtStartAfterOnScreen, scrollState, f, z, function0, function6, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float StickAtStartComposable_eHTjO5g$lambda$17$lambda$16(Density density, int i, ImmutableList immutableList) {
        float value = 0.0f;
        if (i == 0) {
            return 0.0f;
        }
        Iterator<E> it = immutableList.subList(0, i).iterator();
        while (it.hasNext()) {
            value += ((C2002Dp) it.next()).getValue();
        }
        return density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StickAtStartComposable_eHTjO5g$lambda$21$lambda$20(ScrollState scrollState, SnapshotState4 snapshotState4) {
        return ((float) scrollState.getValue()) > StickAtStartComposable_eHTjO5g$lambda$18(snapshotState4) - ((float) 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C2002Dp StickAtStartComposable_eHTjO5g$lambda$25$lambda$24(StickyColumn.StickAtStartAfterOnScreen stickAtStartAfterOnScreen, ImmutableList immutableList, int i, float f, Density density, SnapshotState4 snapshotState4) {
        float value;
        if (stickAtStartAfterOnScreen.m14968getCollapseSizelTKBWiU() == null || C2002Dp.m7994compareTo0680j_4(stickAtStartAfterOnScreen.m14968getCollapseSizelTKBWiU().getValue(), ((C2002Dp) immutableList.get(i)).getValue()) >= 0) {
            value = ((C2002Dp) immutableList.get(i)).getValue();
        } else {
            value = ((C2002Dp) RangesKt.coerceAtLeast(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(((C2002Dp) immutableList.get(i)).getValue() - f) + density.mo5012toDpu2uoSUM(StickAtStartComposable_eHTjO5g$lambda$18(snapshotState4)))), stickAtStartAfterOnScreen.m14968getCollapseSizelTKBWiU())).getValue();
        }
        return C2002Dp.m7993boximpl(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickAtStartComposable_eHTjO5g$lambda$29$lambda$28$lambda$27(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
