package com.robinhood.android.generic.table.layout;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.android.generic.table.GenericChildRow;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;

/* compiled from: GenericTableLayoutScope.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J)\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007JO\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u000b\u0010\fJû\u0001\u0010*\u001a\u00020\u0004\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u001a\b\u0002\u0010\u001c\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u001a\b\u0002\u0010\u001e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2d\u0010'\u001a`\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b($\u0012\u0013\u0012\u00110%¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00040\u001fH&¢\u0006\u0004\b(\u0010)¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/generic/table/layout/GenericTableLayoutScope;", "", "key", "Lkotlin/Function0;", "", "display", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "K", "Lkotlin/Function1;", "", "items", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "Lcom/robinhood/android/generic/table/GenericCell;", "T", "", "tableId", "Lcom/robinhood/android/generic/table/GenericTableData;", "tableData", "Lcom/robinhood/android/generic/table/GenericStickyColumn;", "stickyColumnDetails", "Landroidx/compose/ui/unit/Dp;", "overrideHeaderHeight", "", "animateItemPlacement", "", "displayLimit", "Lcom/robinhood/android/generic/table/GenericRow;", "onRowClicked", "Lcom/robinhood/android/generic/table/GenericChildRow;", "onChildRowClicked", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "cell", "height", "width", "Lcom/robinhood/android/generic/table/DisplayDetails;", "displayDetails", "displayCell", "table-Y3c_0f4", "(Ljava/lang/String;Lcom/robinhood/android/generic/table/GenericTableData;Lcom/robinhood/android/generic/table/GenericStickyColumn;Landroidx/compose/ui/unit/Dp;ZLjava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function6;)V", "table", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface GenericTableLayoutScope {
    void item(Object key, Function2<? super Composer, ? super Integer, Unit> display);

    <K> void items(Function1<? super K, ? extends Object> key, List<? extends K> item, Function3<? super K, ? super Composer, ? super Integer, Unit> display);

    /* renamed from: table-Y3c_0f4, reason: not valid java name */
    <T extends GenericCell> void mo14998tableY3c_0f4(String tableId, GenericTableData<T> tableData, StickyColumn stickyColumnDetails, C2002Dp overrideHeaderHeight, boolean animateItemPlacement, Integer displayLimit, Function1<? super GenericRow<?>, Unit> onRowClicked, Function1<? super GenericChildRow<?>, Unit> onChildRowClicked, Function6<? super GenericCell, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> displayCell);

    /* compiled from: GenericTableLayoutScope.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void item$default(GenericTableLayoutScope genericTableLayoutScope, Object obj, Function2 function2, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            genericTableLayoutScope.item(obj, function2);
        }

        public static /* synthetic */ void items$default(GenericTableLayoutScope genericTableLayoutScope, Function1 function1, List list, Function3 function3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i & 1) != 0) {
                function1 = new Function1() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutScope.items.1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(Object obj2) {
                        return null;
                    }
                };
            }
            genericTableLayoutScope.items(function1, list, function3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: table-Y3c_0f4$default, reason: not valid java name */
        public static /* synthetic */ void m14999tableY3c_0f4$default(GenericTableLayoutScope genericTableLayoutScope, String str, GenericTableData genericTableData, StickyColumn stickyColumn, C2002Dp c2002Dp, boolean z, Integer num, Function1 function1, Function1 function12, Function6 function6, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: table-Y3c_0f4");
            }
            if ((i & 4) != 0) {
                stickyColumn = null;
            }
            if ((i & 8) != 0) {
                c2002Dp = null;
            }
            if ((i & 16) != 0) {
                z = false;
            }
            if ((i & 32) != 0) {
                num = null;
            }
            if ((i & 64) != 0) {
                function1 = null;
            }
            if ((i & 128) != 0) {
                function12 = null;
            }
            genericTableLayoutScope.mo14998tableY3c_0f4(str, genericTableData, stickyColumn, c2002Dp, z, num, function1, function12, function6);
        }
    }
}
