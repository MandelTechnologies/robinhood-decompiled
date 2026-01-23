package com.robinhood.android.generic.table;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: Row.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0099\u0002\u0010$\u001a\u00020\u0010\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052d\u0010\u0011\u001a`\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u001a\b\u0002\u0010!\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010 H\u0001¢\u0006\u0004\b\"\u0010#¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/generic/table/GenericCell;", "T", "", "rowIndex", "Lkotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/ui/unit/Dp;", "columnWidths", "rowHeight", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "cell", "height", "width", "Lcom/robinhood/android/generic/table/DisplayDetails;", "displayDetails", "", "displayCell", "row", "Lcom/robinhood/android/generic/table/GenericStickyColumn;", "stickyColumnDetails", "Landroidx/compose/foundation/ScrollState;", "horizontalScrollState", "", "stickyColumnExpanded", "Lkotlin/Function0;", "onStickyColumnExpanded", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/generic/table/GenericChildRow;", "childRows", "childRowsExpanded", "Lkotlin/Function1;", "onChildRowClicked", "GenericTableRow-uS7v9H0", "(ILkotlinx/collections/immutable/ImmutableList;FLkotlin/jvm/functions/Function6;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/generic/table/GenericStickyColumn;Landroidx/compose/foundation/ScrollState;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlinx/collections/immutable/ImmutableList;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "GenericTableRow", "lib-generic-table_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.generic.table.RowKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class Row7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTableRow_uS7v9H0$lambda$5(int i, ImmutableList immutableList, float f, Function6 function6, ImmutableList immutableList2, StickyColumn stickyColumn, ScrollState scrollState, boolean z, Function0 function0, Modifier modifier, ImmutableList immutableList3, boolean z2, Function1 function1, int i2, int i3, int i4, Composer composer, int i5) {
        m14975GenericTableRowuS7v9H0(i, immutableList, f, function6, immutableList2, stickyColumn, scrollState, z, function0, modifier, immutableList3, z2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0127  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* renamed from: GenericTableRow-uS7v9H0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends GenericCell> void m14975GenericTableRowuS7v9H0(final int i, final ImmutableList<C2002Dp> columnWidths, final float f, final Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> displayCell, final ImmutableList<? extends T> row, final StickyColumn stickyColumn, final ScrollState horizontalScrollState, final boolean z, final Function0<Unit> onStickyColumnExpanded, Modifier modifier, ImmutableList<GenericChildRow<T>> immutableList, boolean z2, Function1<? super GenericChildRow<?>, Unit> function1, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        int i13;
        Composer composer3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer4;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        final Function1<? super GenericChildRow<?>, Unit> function12;
        final Modifier modifier3;
        final boolean z3;
        final ImmutableList<GenericChildRow<T>> immutableList2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(columnWidths, "columnWidths");
        Intrinsics.checkNotNullParameter(displayCell, "displayCell");
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(horizontalScrollState, "horizontalScrollState");
        Intrinsics.checkNotNullParameter(onStickyColumnExpanded, "onStickyColumnExpanded");
        Composer composerStartRestartGroup = composer.startRestartGroup(-886411832);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(columnWidths) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(displayCell) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= (32768 & i2) == 0 ? composerStartRestartGroup.changed(row) : composerStartRestartGroup.changedInstance(row) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i5 |= (262144 & i2) == 0 ? composerStartRestartGroup.changed(stickyColumn) : composerStartRestartGroup.changedInstance(stickyColumn) ? 131072 : 65536;
        }
        if ((i4 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changed(horizontalScrollState) ? 1048576 : 524288;
        }
        if ((i4 & 128) == 0) {
            if ((i2 & 12582912) == 0) {
                i5 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
            }
            if ((i4 & 256) == 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(onStickyColumnExpanded) ? 67108864 : 33554432;
            }
            i6 = i4 & 512;
            if (i6 == 0) {
                i5 |= 805306368;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i2 & 805306368) == 0) {
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                }
            }
            i7 = i4 & 1024;
            if (i7 == 0) {
                i9 = i3 | 6;
                i8 = i7;
            } else if ((i3 & 6) == 0) {
                i8 = i7;
                i9 = i3 | (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2);
            } else {
                i8 = i7;
                i9 = i3;
            }
            i10 = i4 & 2048;
            if (i10 == 0) {
                i9 |= 48;
                i11 = i10;
            } else if ((i3 & 48) == 0) {
                i11 = i10;
                i9 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            } else {
                i11 = i10;
            }
            int i14 = i9;
            i12 = i4 & 4096;
            if (i12 == 0) {
                composer2 = composerStartRestartGroup;
                i13 = i14 | 384;
            } else {
                int i15 = i14;
                if ((i3 & 384) == 0) {
                    i15 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                }
                composer2 = composerStartRestartGroup;
                i13 = i15;
            }
            if ((i5 & 306783379) != 306783378 && (i13 & 147) == 146 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                immutableList2 = immutableList;
                z3 = z2;
                function12 = function1;
                composer4 = composer2;
                modifier3 = modifier2;
            } else {
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                ImmutableList<GenericChildRow<T>> immutableListPersistentListOf = i8 == 0 ? extensions2.persistentListOf() : immutableList;
                boolean z4 = i11 == 0 ? false : z2;
                Function1<? super GenericChildRow<?>, Unit> function13 = i12 == 0 ? null : function1;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-886411832, i5, i13, "com.robinhood.android.generic.table.GenericTableRow (Row.kt:35)");
                }
                int i16 = i5;
                int i17 = i13;
                composer3 = composer2;
                Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(modifier2, horizontalScrollState, false, null, false, 14, null);
                Modifier modifier4 = modifier2;
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierHorizontalScroll$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.useNode();
                } else {
                    composer3.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i18 = i16 >> 9;
                int i19 = i16 >> 3;
                composer4 = composer3;
                ?? r12 = 0;
                StickyColumn2.m14978GenericTableStickyColumnComposableeHTjO5g(i, row, stickyColumn, columnWidths, horizontalScrollState, f, z, onStickyColumnExpanded, displayCell, composer4, (i16 & 14) | (i18 & 112) | (i18 & 896) | ((i16 << 6) & 7168) | ((i16 >> 6) & 57344) | (458752 & (i16 << 9)) | (i19 & 3670016) | (i19 & 29360128) | ((i16 << 15) & 234881024));
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer4, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, companion3);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.useNode();
                } else {
                    composer4.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Function1<? super GenericChildRow<?>, Unit> function14 = function13;
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion3, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer4, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM4872backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.useNode();
                } else {
                    composer4.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composer4.startReplaceGroup(819551903);
                int i20 = 0;
                for (T t : row) {
                    int i21 = i20 + 1;
                    if (i20 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    T t2 = t;
                    Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), columnWidths.get(i20).getValue(), f);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), r12);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, r12);
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer4, modifierM5171sizeVpY3zN4);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    displayCell.invoke(t2, C2002Dp.m7993boximpl(f), columnWidths.get(i20), new DisplayDetails(i, i20, false, false, horizontalScrollState), composer4, Integer.valueOf((i19 & 112) | ((i16 << 3) & 57344)));
                    composer4.endNode();
                    i20 = i21;
                    r12 = 0;
                }
                composer4.endReplaceGroup();
                composer4.endNode();
                ImmutableList<GenericChildRow<T>> immutableList3 = immutableListPersistentListOf;
                boolean z5 = z4;
                AnimatedVisibilityKt.AnimatedVisibility(column6, z5, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(70845300, true, new Row8(immutableList3, function14, columnWidths, f, displayCell, horizontalScrollState), composer4, 54), composer4, 1572870 | (i17 & 112), 30);
                composer4.endNode();
                composer4.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function12 = function14;
                modifier3 = modifier4;
                z3 = z5;
                immutableList2 = immutableList3;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.RowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Row7.GenericTableRow_uS7v9H0$lambda$5(i, columnWidths, f, displayCell, row, stickyColumn, horizontalScrollState, z, onStickyColumnExpanded, modifier3, immutableList2, z3, function12, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 12582912;
        if ((i4 & 256) == 0) {
        }
        i6 = i4 & 512;
        if (i6 == 0) {
        }
        i7 = i4 & 1024;
        if (i7 == 0) {
        }
        i10 = i4 & 2048;
        if (i10 == 0) {
        }
        int i142 = i9;
        i12 = i4 & 4096;
        if (i12 == 0) {
        }
        if ((i5 & 306783379) != 306783378) {
            if (i6 != 0) {
            }
            if (i8 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i162 = i5;
            int i172 = i13;
            composer3 = composer2;
            Modifier modifierHorizontalScroll$default2 = ScrollKt.horizontalScroll$default(modifier2, horizontalScrollState, false, null, false, 14, null);
            Modifier modifier42 = modifier2;
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, modifierHorizontalScroll$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor5 = companion22.getConstructor();
            if (composer3.getApplier() == null) {
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                int i182 = i162 >> 9;
                int i192 = i162 >> 3;
                composer4 = composer3;
                ?? r122 = 0;
                StickyColumn2.m14978GenericTableStickyColumnComposableeHTjO5g(i, row, stickyColumn, columnWidths, horizontalScrollState, f, z, onStickyColumnExpanded, displayCell, composer4, (i162 & 14) | (i182 & 112) | (i182 & 896) | ((i162 << 6) & 7168) | ((i162 >> 6) & 57344) | (458752 & (i162 << 9)) | (i192 & 3670016) | (i192 & 29360128) | ((i162 << 15) & 234881024));
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composer4, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer4, companion32);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composer4.getApplier() == null) {
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Function1<? super GenericChildRow<?>, Unit> function142 = function13;
                    Column6 column62 = Column6.INSTANCE;
                    Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(companion32, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion5.getTop(), composer4, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer4, modifierM4872backgroundbw27NRU$default2);
                    Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                    if (composer4.getApplier() == null) {
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composer4.startReplaceGroup(819551903);
                        int i202 = 0;
                        while (r21.hasNext()) {
                        }
                        composer4.endReplaceGroup();
                        composer4.endNode();
                        ImmutableList<GenericChildRow<T>> immutableList32 = immutableListPersistentListOf;
                        boolean z52 = z4;
                        AnimatedVisibilityKt.AnimatedVisibility(column62, z52, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(70845300, true, new Row8(immutableList32, function142, columnWidths, f, displayCell, horizontalScrollState), composer4, 54), composer4, 1572870 | (i172 & 112), 30);
                        composer4.endNode();
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function12 = function142;
                        modifier3 = modifier42;
                        z3 = z52;
                        immutableList2 = immutableList32;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
