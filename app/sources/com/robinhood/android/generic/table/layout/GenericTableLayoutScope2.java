package com.robinhood.android.generic.table.layout;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.android.generic.table.GenericChildRow;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.android.generic.table.layout.GenericTableLayoutContent;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import defpackage.C0007xc1408999;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GenericTableLayoutScope.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJM\u0010\u000e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJï\u0001\u0010-\u001a\u00020\u0007\"\b\b\u0000\u0010\u0011*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0018\u0010\u001f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0018\u0010!\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2d\u0010*\u001a`\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(&\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b('\u0012\u0013\u0012\u00110(¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00070\"H\u0016¢\u0006\u0004\b+\u0010,R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R'\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u000305048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/generic/table/layout/GenericTableLayoutScopeImpl;", "Lcom/robinhood/android/generic/table/layout/GenericTableLayoutScope;", "<init>", "()V", "", "key", "Lkotlin/Function0;", "", "display", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "K", "Lkotlin/Function1;", "", "items", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "Lcom/robinhood/android/generic/table/GenericCell;", "T", "", "tableId", "Lcom/robinhood/android/generic/table/GenericTableData;", "tableData", "Lcom/robinhood/android/generic/table/GenericStickyColumn;", "stickyColumnDetails", "Landroidx/compose/ui/unit/Dp;", "overrideHeaderHeight", "", "animateItemPlacement", "", "displayLimit", "Lcom/robinhood/android/generic/table/GenericRow;", "onRowClicked", "Lcom/robinhood/android/generic/table/GenericChildRow;", "onChildRowClicked", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "cell", "height", "width", "Lcom/robinhood/android/generic/table/DisplayDetails;", "displayDetails", "displayCell", "table-Y3c_0f4", "(Ljava/lang/String;Lcom/robinhood/android/generic/table/GenericTableData;Lcom/robinhood/android/generic/table/GenericStickyColumn;Landroidx/compose/ui/unit/Dp;ZLjava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function6;)V", "table", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/robinhood/android/generic/table/layout/GenericTableLayoutContent;", "content", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getContent", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Lcom/robinhood/android/generic/table/layout/GenericTableLayoutContent$Table;", "tables", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "getTables", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.generic.table.layout.GenericTableLayoutScopeImpl, reason: use source file name */
/* loaded from: classes10.dex */
public final class GenericTableLayoutScope2 implements GenericTableLayoutScope {
    public static final int $stable = 0;
    private final SnapshotStateList<GenericTableLayoutContent> content = SnapshotStateKt.mutableStateListOf();
    private final SnapshotStateMap<String, GenericTableLayoutContent.Table<?>> tables = SnapshotStateKt.mutableStateMapOf();

    public final SnapshotStateList<GenericTableLayoutContent> getContent() {
        return this.content;
    }

    public final SnapshotStateMap<String, GenericTableLayoutContent.Table<?>> getTables() {
        return this.tables;
    }

    @Override // com.robinhood.android.generic.table.layout.GenericTableLayoutScope
    public void item(Object key, Function2<? super Composer, ? super Integer, Unit> display) {
        Intrinsics.checkNotNullParameter(display, "display");
        this.content.add(new GenericTableLayoutContent.Item(key, display));
    }

    @Override // com.robinhood.android.generic.table.layout.GenericTableLayoutScope
    public <K> void items(Function1<? super K, ? extends Object> key, List<? extends K> item, final Function3<? super K, ? super Composer, ? super Integer, Unit> display) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(display, "display");
        SnapshotStateList<GenericTableLayoutContent> snapshotStateList = this.content;
        List<? extends K> list = item;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            final C0007xc1408999 c0007xc1408999 = (Object) it.next();
            arrayList.add(new GenericTableLayoutContent.Item(key.invoke(c0007xc1408999), ComposableLambda3.composableLambdaInstance(-31987273, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutScopeImpl$items$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-31987273, i, -1, "com.robinhood.android.generic.table.layout.GenericTableLayoutScopeImpl.items.<anonymous>.<anonymous> (GenericTableLayoutScope.kt:49)");
                    }
                    display.invoke(c0007xc1408999, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            })));
        }
        snapshotStateList.addAll(arrayList);
    }

    @Override // com.robinhood.android.generic.table.layout.GenericTableLayoutScope
    /* renamed from: table-Y3c_0f4 */
    public <T extends GenericCell> void mo14998tableY3c_0f4(String tableId, GenericTableData<T> tableData, StickyColumn stickyColumnDetails, C2002Dp overrideHeaderHeight, boolean animateItemPlacement, Integer displayLimit, Function1<? super GenericRow<?>, Unit> onRowClicked, Function1<? super GenericChildRow<?>, Unit> onChildRowClicked, Function6<? super GenericCell, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> displayCell) {
        Intrinsics.checkNotNullParameter(tableId, "tableId");
        Intrinsics.checkNotNullParameter(tableData, "tableData");
        Intrinsics.checkNotNullParameter(displayCell, "displayCell");
        GenericTableLayoutContent.Table<?> table = new GenericTableLayoutContent.Table<>(tableId, tableData, displayCell, stickyColumnDetails, overrideHeaderHeight, animateItemPlacement, displayLimit, onRowClicked, onChildRowClicked, null);
        this.content.add(table);
        this.tables.put(tableId, table);
    }
}
