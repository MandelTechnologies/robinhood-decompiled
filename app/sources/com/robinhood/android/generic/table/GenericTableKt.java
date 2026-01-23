package com.robinhood.android.generic.table;

import androidx.compose.foundation.Overscroll3;
import androidx.compose.foundation.Overscroll4;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage;
import com.robinhood.android.generic.table.TableScreenFillSettings;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GenericTable.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a\u009e\u0002\u0010&\u001a\u00020\r\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022d\u0010\u000e\u001a`\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u001b\b\u0002\u0010!\u001a\u0015\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r\u0018\u00010\u001e¢\u0006\u0002\b 2\u001c\b\u0002\u0010#\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u001eH\u0007¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010'\u001a\u00020\rH\u0003¢\u0006\u0004\b'\u0010(\u001a\u000f\u0010)\u001a\u00020\rH\u0003¢\u0006\u0004\b)\u0010(¨\u00061²\u0006\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0*8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010-\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\"\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0.\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u00100\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/generic/table/GenericCell;", "T", "Lcom/robinhood/android/generic/table/GenericTableData;", "tableData", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "cell", "Landroidx/compose/ui/unit/Dp;", "height", "width", "Lcom/robinhood/android/generic/table/DisplayDetails;", "displayDetails", "", "displayCell", "Landroidx/compose/ui/Modifier;", "modifier", "", "animateItemPlacement", "overrideHeaderHeight", "Lcom/robinhood/android/generic/table/TableScreenFillSettings;", "tableScreenFillSettings", "Landroidx/compose/foundation/lazy/LazyListState;", "verticalScrollState", "Landroidx/compose/foundation/ScrollState;", "horizontalScrollState", "", "displayLimit", "Lcom/robinhood/android/generic/table/GenericStickyColumn;", "stickyColumnDetails", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", DirectDepositBrokerageExperimentPage.FOOTER_CONTENT, "Lcom/robinhood/android/generic/table/GenericRow;", "onRowClicked", "GenericTable-9SxZPhU", "(Lcom/robinhood/android/generic/table/GenericTableData;Lkotlin/jvm/functions/Function6;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/unit/Dp;Lcom/robinhood/android/generic/table/TableScreenFillSettings;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/ScrollState;Ljava/lang/Integer;Lcom/robinhood/android/generic/table/GenericStickyColumn;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "GenericTable", "GenericTableStickToEndPreview", "(Landroidx/compose/runtime/Composer;I)V", "GenericTableStickToStartPreview", "Lkotlinx/collections/immutable/ImmutableList;", "columnWidths", "rowHeight", "headerHeight", "", "rowsToDisplay", "stickyColumnExpanded", "lib-generic-table_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GenericTableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTableStickToEndPreview$lambda$18(int i, Composer composer, int i2) {
        GenericTableStickToEndPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTableStickToStartPreview$lambda$19(int i, Composer composer, int i2) {
        GenericTableStickToStartPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTable_9SxZPhU$lambda$0(GenericTableData genericTableData, Function6 function6, Modifier modifier, boolean z, C2002Dp c2002Dp, TableScreenFillSettings tableScreenFillSettings, LazyListState lazyListState, ScrollState scrollState, Integer num, StickyColumn stickyColumn, Function3 function3, Function1 function1, int i, int i2, int i3, Composer composer, int i4) {
        m14971GenericTable9SxZPhU(genericTableData, function6, modifier, z, c2002Dp, tableScreenFillSettings, lazyListState, scrollState, num, stickyColumn, function3, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTable_9SxZPhU$lambda$10(GenericTableData genericTableData, Function6 function6, Modifier modifier, boolean z, C2002Dp c2002Dp, TableScreenFillSettings tableScreenFillSettings, LazyListState lazyListState, ScrollState scrollState, Integer num, StickyColumn stickyColumn, Function3 function3, Function1 function1, int i, int i2, int i3, Composer composer, int i4) {
        m14971GenericTable9SxZPhU(genericTableData, function6, modifier, z, c2002Dp, tableScreenFillSettings, lazyListState, scrollState, num, stickyColumn, function3, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTable_9SxZPhU$lambda$17(GenericTableData genericTableData, Function6 function6, Modifier modifier, boolean z, C2002Dp c2002Dp, TableScreenFillSettings tableScreenFillSettings, LazyListState lazyListState, ScrollState scrollState, Integer num, StickyColumn stickyColumn, Function3 function3, Function1 function1, int i, int i2, int i3, Composer composer, int i4) {
        m14971GenericTable9SxZPhU(genericTableData, function6, modifier, z, c2002Dp, tableScreenFillSettings, lazyListState, scrollState, num, stickyColumn, function3, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122 A[PHI: r23
      0x0122: PHI (r23v16 int) = (r23v6 int), (r23v12 int), (r23v13 int) binds: [B:100:0x0120, B:110:0x013d, B:109:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[PHI: r20
      0x00a6: PHI (r20v12 int) = (r20v0 int), (r20v6 int), (r20v7 int) binds: [B:57:0x00a4, B:67:0x00c1, B:66:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* renamed from: GenericTable-9SxZPhU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends GenericCell> void m14971GenericTable9SxZPhU(final GenericTableData<T> tableData, final Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> displayCell, Modifier modifier, boolean z, C2002Dp c2002Dp, TableScreenFillSettings tableScreenFillSettings, LazyListState lazyListState, ScrollState scrollState, Integer num, StickyColumn stickyColumn, Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3, Function1<? super GenericRow<T>, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        C2002Dp c2002Dp2;
        int i7;
        LazyListState lazyListStateRememberLazyListState;
        ScrollState scrollStateRememberScrollState;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Function3<? super Column5, ? super Composer, ? super Integer, Unit> function32;
        final Integer num2;
        final TableScreenFillSettings tableScreenFillSettings2;
        boolean z3;
        final ScrollState scrollState2;
        int i16;
        final LazyListState lazyListState2;
        StickyColumn stickyColumn2;
        Modifier modifier3;
        final C2002Dp c2002Dp3;
        final Function1<? super GenericRow<T>, Unit> function12;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer.Companion companion;
        Overscroll3 overscroll3;
        Composer composer2;
        final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function33;
        final Modifier modifier5;
        final ScrollState scrollState3;
        final boolean z4;
        final Function1<? super GenericRow<T>, Unit> function13;
        final LazyListState lazyListState3;
        final StickyColumn stickyColumn3;
        final TableScreenFillSettings tableScreenFillSettings3;
        final Integer num3;
        final C2002Dp c2002Dp4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        StickyColumn stickyColumn4 = stickyColumn;
        Intrinsics.checkNotNullParameter(tableData, "tableData");
        Intrinsics.checkNotNullParameter(displayCell, "displayCell");
        Composer composerStartRestartGroup = composer.startRestartGroup(1861298999);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(tableData) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(displayCell) ? 32 : 16;
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((i & 24576) == 0) {
                        c2002Dp2 = c2002Dp;
                        i4 |= composerStartRestartGroup.changed(c2002Dp2) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    int i18 = 196608;
                    if (i7 != 0) {
                        i4 |= i18;
                    } else if ((i & 196608) == 0) {
                        i18 = (i & 262144) == 0 ? composerStartRestartGroup.changed(tableScreenFillSettings) : composerStartRestartGroup.changedInstance(tableScreenFillSettings) ? 131072 : 65536;
                        i4 |= i18;
                    }
                    if ((i & 1572864) != 0) {
                        lazyListStateRememberLazyListState = lazyListState;
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) ? 1048576 : 524288;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            scrollStateRememberScrollState = scrollState;
                            int i19 = composerStartRestartGroup.changed(scrollStateRememberScrollState) ? 8388608 : 4194304;
                            i4 |= i19;
                        } else {
                            scrollStateRememberScrollState = scrollState;
                        }
                        i4 |= i19;
                    } else {
                        scrollStateRememberScrollState = scrollState;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(num) ? 67108864 : 33554432;
                    }
                    i9 = i3 & 512;
                    int i20 = 805306368;
                    if (i9 != 0) {
                        i4 |= i20;
                    } else if ((i & 805306368) == 0) {
                        i20 = (i & 1073741824) == 0 ? composerStartRestartGroup.changed(stickyColumn4) : composerStartRestartGroup.changedInstance(stickyColumn4) ? 536870912 : 268435456;
                        i4 |= i20;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (composerStartRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    i13 = i3 & 2048;
                    if (i13 == 0) {
                        i12 |= 48;
                        i14 = i13;
                    } else if ((i2 & 48) == 0) {
                        i14 = i13;
                        i12 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
                    } else {
                        i14 = i13;
                    }
                    int i21 = i12;
                    if ((i4 & 306783379) == 306783378 || (i21 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier6 = i17 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                z2 = false;
                            }
                            if (i6 != 0) {
                                c2002Dp2 = null;
                            }
                            TableScreenFillSettings tableScreenFillSettings4 = i7 == 0 ? TableScreenFillSettings.Default.INSTANCE : tableScreenFillSettings;
                            if ((i3 & 64) == 0) {
                                i15 = 0;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i4 &= -3670017;
                            } else {
                                i15 = 0;
                            }
                            if ((i3 & 128) != 0) {
                                scrollStateRememberScrollState = ScrollKt.rememberScrollState(i15, composerStartRestartGroup, i15, 1);
                                i4 &= -29360129;
                            }
                            Integer num4 = i8 == 0 ? null : num;
                            if (i9 != 0) {
                                stickyColumn4 = null;
                            }
                            function32 = i11 == 0 ? null : function3;
                            TableScreenFillSettings tableScreenFillSettings5 = tableScreenFillSettings4;
                            num2 = num4;
                            tableScreenFillSettings2 = tableScreenFillSettings5;
                            ScrollState scrollState4 = scrollStateRememberScrollState;
                            z3 = z2;
                            scrollState2 = scrollState4;
                            i16 = i4;
                            lazyListState2 = lazyListStateRememberLazyListState;
                            stickyColumn2 = stickyColumn4;
                            modifier3 = modifier6;
                            c2002Dp3 = c2002Dp2;
                            function12 = i14 == 0 ? null : function1;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            ScrollState scrollState5 = scrollStateRememberScrollState;
                            z3 = z2;
                            scrollState2 = scrollState5;
                            tableScreenFillSettings2 = tableScreenFillSettings;
                            num2 = num;
                            i16 = i4;
                            lazyListState2 = lazyListStateRememberLazyListState;
                            c2002Dp3 = c2002Dp2;
                            function12 = function1;
                            stickyColumn2 = stickyColumn4;
                            modifier3 = modifier2;
                            function32 = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            ComposerKt.traceEventStart(1861298999, i16, i21, "com.robinhood.android.generic.table.GenericTable (GenericTable.kt:78)");
                        }
                        if (!tableData.getHeaders().isEmpty() || tableData.getRows().isEmpty() || !tableData.getValidTable()) {
                            final Modifier modifier7 = modifier4;
                            final C2002Dp c2002Dp5 = c2002Dp3;
                            final boolean z5 = z3;
                            final Integer num5 = num2;
                            final StickyColumn stickyColumn5 = stickyColumn2;
                            final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function34 = function32;
                            final TableScreenFillSettings tableScreenFillSettings6 = tableScreenFillSettings2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.GenericTableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return GenericTableKt.GenericTable_9SxZPhU$lambda$0(tableData, displayCell, modifier7, z5, c2002Dp5, tableScreenFillSettings6, lazyListState2, scrollState2, num5, stickyColumn5, function34, function12, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Composer.Companion companion2 = Composer.INSTANCE;
                        if (objRememberedValue == companion2.getEmpty()) {
                            companion = companion2;
                            SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                            objRememberedValue = snapshotStateMutableStateOf$default;
                        } else {
                            companion = companion2;
                        }
                        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        float fGenericTable_9SxZPhU$lambda$5 = GenericTable_9SxZPhU$lambda$5(snapshotState2);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        final LazyListState lazyListState4 = lazyListState2;
                        boolean zChanged = composerStartRestartGroup.changed(fGenericTable_9SxZPhU$lambda$5) | ((57344 & i16) == 16384);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.generic.table.GenericTableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return GenericTableKt.GenericTable_9SxZPhU$lambda$8$lambda$7(c2002Dp3, snapshotState2);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        final C2002Dp c2002Dp6 = c2002Dp3;
                        MeasureContent.MeasureItemsForSize(tableData, scrollState2, displayCell, ComposableLambda3.rememberComposableLambda(1403986485, true, new Function4<List<? extends C2002Dp>, C2002Dp, Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.GenericTableKt$GenericTable$2
                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends C2002Dp> list, C2002Dp c2002Dp7, Composer composer3, Integer num6) {
                                m14972invokeziNgDLE(list, c2002Dp7.getValue(), composer3, num6.intValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-ziNgDLE, reason: not valid java name */
                            public final void m14972invokeziNgDLE(List<C2002Dp> widths, float f, Composer composer3, int i22) {
                                Intrinsics.checkNotNullParameter(widths, "widths");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1403986485, i22, -1, "com.robinhood.android.generic.table.GenericTable.<anonymous> (GenericTable.kt:98)");
                                }
                                GenericTableKt.GenericTable_9SxZPhU$lambda$6(snapshotState2, f);
                                snapshotState.setValue(extensions2.toImmutableList(UtilsKt.adjustColumnWidthsToFillScreen((int) ((Density) composer3.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composer3.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32)), widths, tableScreenFillSettings2)));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i16 & 14) | 3072 | ((i16 >> 18) & 112) | ((i16 << 3) & 896));
                        if (!GenericTable_9SxZPhU$lambda$2(snapshotState).isEmpty()) {
                            if (!C2002Dp.m7997equalsimpl0(GenericTable_9SxZPhU$lambda$5(snapshotState2), C2002Dp.m7995constructorimpl(0)) && GenericTable_9SxZPhU$lambda$2(snapshotState).size() == tableData.getHeaders().size() && GenericTable_9SxZPhU$lambda$2(snapshotState).size() == ((GenericRow) CollectionsKt.first((List) tableData.getRows())).getCells().size()) {
                                ImmutableList<GenericRow<T>> rows = tableData.getRows();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChanged2 = composerStartRestartGroup.changed(rows) | ((234881024 & i16) == 67108864);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.generic.table.GenericTableKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return GenericTableKt.GenericTable_9SxZPhU$lambda$12$lambda$11(tableData, num2);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue4;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                    overscroll3 = null;
                                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                } else {
                                    overscroll3 = null;
                                }
                                SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
                                composerStartRestartGroup.endReplaceGroup();
                                ProvidedValue<Overscroll3> providedValueProvides = Overscroll4.getLocalOverscrollFactory().provides(overscroll3);
                                composer2 = composerStartRestartGroup;
                                TableScreenFillSettings tableScreenFillSettings7 = tableScreenFillSettings2;
                                ScrollState scrollState6 = scrollState2;
                                Integer num6 = num2;
                                Function1<? super GenericRow<T>, Unit> function14 = function12;
                                StickyColumn stickyColumn6 = stickyColumn2;
                                function33 = function32;
                                Modifier modifier8 = modifier4;
                                GenericTableKt$GenericTable$4 genericTableKt$GenericTable$4 = new GenericTableKt$GenericTable$4(modifier8, lazyListState4, snapshotState4, displayCell, tableData, stickyColumn6, scrollState6, snapshotState42, z3, function14, function33, snapshotState, snapshotState3, snapshotState2);
                                modifier5 = modifier8;
                                scrollState3 = scrollState6;
                                z4 = z3;
                                function13 = function14;
                                lazyListState3 = lazyListState4;
                                stickyColumn3 = stickyColumn6;
                                CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-2128826377, true, genericTableKt$GenericTable$4, composer2, 54), composer2, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                tableScreenFillSettings3 = tableScreenFillSettings7;
                                num3 = num6;
                                c2002Dp4 = c2002Dp6;
                            }
                        }
                        final Modifier modifier9 = modifier4;
                        final TableScreenFillSettings tableScreenFillSettings8 = tableScreenFillSettings2;
                        final boolean z6 = z3;
                        final Integer num7 = num2;
                        final StickyColumn stickyColumn7 = stickyColumn2;
                        final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function35 = function32;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup3 != null) {
                            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.GenericTableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return GenericTableKt.GenericTable_9SxZPhU$lambda$10(tableData, displayCell, modifier9, z6, c2002Dp6, tableScreenFillSettings8, lazyListState4, scrollState2, num7, stickyColumn7, function35, function12, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    composerStartRestartGroup.skipToGroupEnd();
                    stickyColumn3 = stickyColumn4;
                    composer2 = composerStartRestartGroup;
                    z4 = z2;
                    scrollState3 = scrollStateRememberScrollState;
                    lazyListState3 = lazyListStateRememberLazyListState;
                    c2002Dp4 = c2002Dp2;
                    modifier5 = modifier2;
                    tableScreenFillSettings3 = tableScreenFillSettings;
                    num3 = num;
                    function33 = function3;
                    function13 = function1;
                    scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 == null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.GenericTableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GenericTableKt.GenericTable_9SxZPhU$lambda$17(tableData, displayCell, modifier5, z4, c2002Dp4, tableScreenFillSettings3, lazyListState3, scrollState3, num3, stickyColumn3, function33, function13, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                c2002Dp2 = c2002Dp;
                i7 = i3 & 32;
                int i182 = 196608;
                if (i7 != 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                int i202 = 805306368;
                if (i9 != 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i13 = i3 & 2048;
                if (i13 == 0) {
                }
                int i212 = i12;
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        if ((i3 & 128) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 == 0) {
                        }
                        TableScreenFillSettings tableScreenFillSettings52 = tableScreenFillSettings4;
                        num2 = num4;
                        tableScreenFillSettings2 = tableScreenFillSettings52;
                        ScrollState scrollState42 = scrollStateRememberScrollState;
                        z3 = z2;
                        scrollState2 = scrollState42;
                        i16 = i4;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        stickyColumn2 = stickyColumn4;
                        modifier3 = modifier6;
                        c2002Dp3 = c2002Dp2;
                        if (i14 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!tableData.getHeaders().isEmpty()) {
                        }
                        final Modifier modifier72 = modifier4;
                        final C2002Dp c2002Dp52 = c2002Dp3;
                        final boolean z52 = z3;
                        final Integer num52 = num2;
                        final StickyColumn stickyColumn52 = stickyColumn2;
                        final Function3 function342 = function32;
                        final TableScreenFillSettings tableScreenFillSettings62 = tableScreenFillSettings2;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            c2002Dp2 = c2002Dp;
            i7 = i3 & 32;
            int i1822 = 196608;
            if (i7 != 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            int i2022 = 805306368;
            if (i9 != 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i13 = i3 & 2048;
            if (i13 == 0) {
            }
            int i2122 = i12;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        c2002Dp2 = c2002Dp;
        i7 = i3 & 32;
        int i18222 = 196608;
        if (i7 != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        int i20222 = 805306368;
        if (i9 != 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i13 = i3 & 2048;
        if (i13 == 0) {
        }
        int i21222 = i12;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List GenericTable_9SxZPhU$lambda$13(SnapshotState4 snapshotState4) {
        return (List) snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GenericTable_9SxZPhU$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList<C2002Dp> GenericTable_9SxZPhU$lambda$2(SnapshotState<ImmutableList<C2002Dp>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GenericTable_9SxZPhU$lambda$5(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GenericTable_9SxZPhU$lambda$9(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GenericTable_9SxZPhU$lambda$6(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp GenericTable_9SxZPhU$lambda$8$lambda$7(C2002Dp c2002Dp, SnapshotState snapshotState) {
        return C2002Dp.m7993boximpl(c2002Dp != null ? c2002Dp.getValue() : GenericTable_9SxZPhU$lambda$5(snapshotState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List GenericTable_9SxZPhU$lambda$12$lambda$11(GenericTableData genericTableData, Integer num) {
        ImmutableList rows = genericTableData.getRows();
        int iIntValue = (num != null && genericTableData.getRows().size() >= num.intValue()) ? num.intValue() : genericTableData.getRows().size();
        return CollectionsKt.take(rows, iIntValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GenericTable_9SxZPhU$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void GenericTableStickToEndPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(867574931);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(867574931, i, -1, "com.robinhood.android.generic.table.GenericTableStickToEndPreview (GenericTable.kt:205)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$GenericTableKt.INSTANCE.m14961getLambda$1142589989$lib_generic_table_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.GenericTableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenericTableKt.GenericTableStickToEndPreview$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void GenericTableStickToStartPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(614501594);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(614501594, i, -1, "com.robinhood.android.generic.table.GenericTableStickToStartPreview (GenericTable.kt:245)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$GenericTableKt.INSTANCE.getLambda$1581296674$lib_generic_table_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.GenericTableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenericTableKt.GenericTableStickToStartPreview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
