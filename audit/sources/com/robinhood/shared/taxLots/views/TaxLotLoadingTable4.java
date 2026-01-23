package com.robinhood.shared.taxLots.views;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.GenericTableKt;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.shared.taxLots.TaxLotTableState;
import com.robinhood.shared.taxLots.views.TaxLotLoadingTable3;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TaxLotLoadingTable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"TaxLotLoadingTable", "", "T", "state", "Lcom/robinhood/shared/taxLots/TaxLotTableState$Loading;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/taxLots/TaxLotTableState$Loading;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-lot-table-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.taxLots.views.TaxLotLoadingTableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TaxLotLoadingTable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotLoadingTable$lambda$0(TaxLotTableState.Loading loading, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TaxLotLoadingTable(loading, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <T> void TaxLotLoadingTable(final TaxLotTableState.Loading<T> state, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-728270056);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-728270056, i3, -1, "com.robinhood.shared.taxLots.views.TaxLotLoadingTable (TaxLotLoadingTable.kt:21)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(2099722120, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.taxLots.views.TaxLotLoadingTableKt.TaxLotLoadingTable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    char c;
                    TaxLotLoadingTable3 displayCell;
                    char c2 = 2;
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2099722120, i5, -1, "com.robinhood.shared.taxLots.views.TaxLotLoadingTable.<anonymous> (TaxLotLoadingTable.kt:23)");
                    }
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(36);
                    TaxLotLoadingTable3.HeaderCell headerCell = TaxLotLoadingTable3.HeaderCell.INSTANCE;
                    ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(headerCell, headerCell, headerCell, headerCell, headerCell);
                    TaxLotTableState.Loading<T> loading = state;
                    int i6 = 20;
                    ArrayList arrayList = new ArrayList(20);
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            break;
                        }
                        String str = "row" + i7;
                        TaxLotLoadingTable3.DisplayCell displayCell2 = new TaxLotLoadingTable3.DisplayCell(true);
                        TaxLotLoadingTable3.DisplayCell displayCell3 = new TaxLotLoadingTable3.DisplayCell(false, 1, null);
                        char c3 = c2;
                        TaxLotLoadingTable3.DisplayCell displayCell4 = new TaxLotLoadingTable3.DisplayCell(false, 1, null);
                        TaxLotLoadingTable3.DisplayCell displayCell5 = new TaxLotLoadingTable3.DisplayCell(false, 1, null);
                        if (loading.getHasInputCell()) {
                            displayCell = TaxLotLoadingTable3.InputCell.INSTANCE;
                            c = 4;
                        } else {
                            c = 4;
                            displayCell = new TaxLotLoadingTable3.DisplayCell(false, 1, null);
                        }
                        TaxLotLoadingTable3[] taxLotLoadingTable3Arr = new TaxLotLoadingTable3[5];
                        taxLotLoadingTable3Arr[0] = displayCell2;
                        taxLotLoadingTable3Arr[1] = displayCell3;
                        taxLotLoadingTable3Arr[c3] = displayCell4;
                        taxLotLoadingTable3Arr[3] = displayCell5;
                        taxLotLoadingTable3Arr[c] = displayCell;
                        arrayList.add(new GenericRow(str, extensions2.persistentListOf(taxLotLoadingTable3Arr), false, null, null, 28, null));
                        i7++;
                        c2 = c3;
                        i6 = 20;
                    }
                    GenericTableKt.m14971GenericTable9SxZPhU(new GenericTableData(immutableList3PersistentListOf, extensions2.toPersistentList(arrayList)), TaxLotLoadingTable.INSTANCE.m25777getLambda$641038409$lib_lot_table_ui_externalDebug(), modifier, false, C2002Dp.m7993boximpl(fM7995constructorimpl), null, null, null, null, state.getHasStickyLastColumn() ? new StickyColumn.StickAtEndUntilOnScreen(4) : null, null, null, composer2, GenericTableData.$stable | 24624 | (StickyColumn.StickAtEndUntilOnScreen.$stable << 27), 0, 3560);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.taxLots.views.TaxLotLoadingTableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotLoadingTable4.TaxLotLoadingTable$lambda$0(state, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
