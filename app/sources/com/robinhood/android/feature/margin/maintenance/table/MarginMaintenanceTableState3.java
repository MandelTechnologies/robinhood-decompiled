package com.robinhood.android.feature.margin.maintenance.table;

import androidx.compose.p011ui.unit.C2002Dp;
import bonfire.proto.idl.margin.p036v1.MaintenanceTableActionDto;
import bonfire.proto.idl.margin.p036v1.MarginTableChildRowDto;
import bonfire.proto.idl.margin.p036v1.MarginTableColumnDto;
import bonfire.proto.idl.margin.p036v1.MarginTableItemDto;
import bonfire.proto.idl.margin.p036v1.MarginTableRowDto;
import com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableState4;
import com.robinhood.android.generic.table.GenericChildRow;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.lib.margin.hub.p168db.models.MarginMaintenanceTableView;
import com.robinhood.android.lib.screener.ScreenTableCells;
import com.robinhood.android.udf.StateProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.TableColumnAlignmentDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: MarginMaintenanceTableState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J>\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDataState;", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState;", "<init>", "()V", "reduce", "dataState", "makeTable", "Lcom/robinhood/android/generic/table/GenericTableData;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "columns", "", "Lbonfire/proto/idl/margin/v1/MarginTableColumnDto;", "rows", "Lbonfire/proto/idl/margin/v1/MarginTableRowDto;", "isRowExpanded", "", "", "", "feature-margin-maintenance-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class MarginMaintenanceTableState3 implements StateProvider<MarginMaintenanceTableDataState, MarginMaintenanceTableState4> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public MarginMaintenanceTableState4 reduce(MarginMaintenanceTableDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Exception error = dataState.getError();
        if (error != null) {
            return new MarginMaintenanceTableState4.Failure(error);
        }
        MarginMaintenanceTableView tableView = dataState.getTableView();
        if (tableView != null) {
            Map<String, Boolean> mapIsRowExpanded = dataState.isRowExpanded();
            if (mapIsRowExpanded == null) {
                throw new IllegalStateException("Required value was null.");
            }
            List<UIComponentDto> header = tableView.getHeader();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = header.iterator();
            while (it.hasNext()) {
                UIComponentDto.ConcreteDto concrete = ((UIComponentDto) it.next()).getConcrete();
                if (concrete != null) {
                    arrayList.add(concrete);
                }
            }
            return new MarginMaintenanceTableState4.Success(arrayList, makeTable(tableView.getColumns(), tableView.getRows(), mapIsRowExpanded), tableView.getMarginHealthState());
        }
        return MarginMaintenanceTableState4.Loading.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14, types: [androidx.compose.ui.unit.Dp] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [androidx.compose.ui.unit.Dp] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [rh_server_driven_ui.v1.UIComponentDto$ConcreteDto] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [com.robinhood.android.generic.table.GenericTableAction] */
    /* JADX WARN: Type inference failed for: r31v2 */
    private final GenericTableData<ScreenTableCells> makeTable(List<MarginTableColumnDto> columns, List<MarginTableRowDto> rows, Map<String, Boolean> isRowExpanded) {
        boolean z;
        bonfire.proto.idl.margin.p036v1.MaintenanceTableAction proto;
        bonfire.proto.idl.margin.p036v1.MaintenanceTableAction proto2;
        List<MarginTableColumnDto> list = columns;
        Map<String, Boolean> map = isRowExpanded;
        List<MarginTableRowDto> list2 = rows;
        boolean z2 = true;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!((MarginTableRowDto) it.next()).getChild_rows().isEmpty()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        MarginTableRowDto marginTableRowDto = (MarginTableRowDto) CollectionsKt.first((List) rows);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(new ScreenTableCells.RowStart(marginTableRowDto.getInstrument_id(), 0, null, z, true));
        List<MarginTableItemDto> items = marginTableRowDto.getItems();
        int i = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator it2 = items.iterator();
        int i2 = 0;
        while (true) {
            String str = "Required value was null.";
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!it2.hasNext()) {
                listCreateListBuilder.addAll(arrayList);
                ImmutableList immutableList = extensions2.toImmutableList(CollectionsKt.build(listCreateListBuilder));
                List listDrop = CollectionsKt.drop(list2, 1);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDrop, 10));
                int i3 = 0;
                for (Object obj : listDrop) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    MarginTableRowDto marginTableRowDto2 = (MarginTableRowDto) obj;
                    String instrument_id = marginTableRowDto2.getInstrument_id();
                    boolean zAreEqual = Intrinsics.areEqual(map.get(marginTableRowDto2.getInstrument_id()), Boolean.TRUE);
                    List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                    listCreateListBuilder2.add(new ScreenTableCells.RowStart(marginTableRowDto2.getInstrument_id(), i3, !marginTableRowDto2.getChild_rows().isEmpty() ? map.get(marginTableRowDto2.getInstrument_id()) : defaultConstructorMarker, (marginTableRowDto2.getChild_rows().isEmpty() && z) ? z2 : false, false, 16, null));
                    List<MarginTableItemDto> items2 = marginTableRowDto2.getItems();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(items2, i));
                    int i5 = 0;
                    for (Object obj2 : items2) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        MarginTableColumnDto marginTableColumnDto = list.get(i5);
                        TableColumnAlignmentDto alignment = marginTableColumnDto.getAlignment();
                        UIComponentDto component = ((MarginTableItemDto) obj2).getComponent();
                        ?? concrete = component != null ? component.getConcrete() : defaultConstructorMarker;
                        if (concrete == 0) {
                            throw new IllegalStateException(str);
                        }
                        arrayList3.add(new ScreenTableCells.SduiDto(concrete, alignment, marginTableColumnDto.getWidth() != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(r13.intValue())) : defaultConstructorMarker, defaultConstructorMarker));
                        i5 = i6;
                    }
                    listCreateListBuilder2.addAll(arrayList3);
                    List listBuild = CollectionsKt.build(listCreateListBuilder2);
                    List<MarginTableChildRowDto> child_rows = marginTableRowDto2.getChild_rows();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(child_rows, i));
                    for (MarginTableChildRowDto marginTableChildRowDto : child_rows) {
                        List listCreateListBuilder3 = CollectionsKt.createListBuilder();
                        String str2 = str;
                        listCreateListBuilder3.add(new ScreenTableCells.RowStart(marginTableRowDto2.getInstrument_id(), i3, null, z, false, 16, null));
                        List<MarginTableItemDto> items3 = marginTableChildRowDto.getItems();
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(items3, 10));
                        int i7 = 0;
                        for (Object obj3 : items3) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            MarginTableColumnDto marginTableColumnDto2 = list.get(i7);
                            TableColumnAlignmentDto alignment2 = marginTableColumnDto2.getAlignment();
                            UIComponentDto component2 = ((MarginTableItemDto) obj3).getComponent();
                            UIComponentDto.ConcreteDto concrete2 = component2 != null ? component2.getConcrete() : null;
                            if (concrete2 == null) {
                                throw new IllegalStateException(str2);
                            }
                            arrayList5.add(new ScreenTableCells.SduiDto(concrete2, alignment2, marginTableColumnDto2.getWidth() != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(r10.intValue())) : null, null));
                            list = columns;
                            i7 = i8;
                        }
                        listCreateListBuilder3.addAll(arrayList5);
                        List listBuild2 = CollectionsKt.build(listCreateListBuilder3);
                        MaintenanceTableActionDto on_click_action = marginTableChildRowDto.getOn_click_action();
                        arrayList4.add(new GenericChildRow(listBuild2, (on_click_action == null || (proto2 = on_click_action.toProto()) == null) ? null : new MaintenanceTableAction(proto2)));
                        defaultConstructorMarker = null;
                        str = str2;
                        list = columns;
                    }
                    String str3 = str;
                    DefaultConstructorMarker defaultConstructorMarker2 = defaultConstructorMarker;
                    MaintenanceTableActionDto on_click_action2 = marginTableRowDto2.getOn_click_action();
                    arrayList2.add(new GenericRow(instrument_id, listBuild, zAreEqual, arrayList4, (on_click_action2 == null || (proto = on_click_action2.toProto()) == null) ? defaultConstructorMarker2 : new MaintenanceTableAction(proto)));
                    defaultConstructorMarker = defaultConstructorMarker2;
                    str = str3;
                    i3 = i4;
                    z2 = true;
                    i = 10;
                    list = columns;
                    map = isRowExpanded;
                }
                return new GenericTableData<>(immutableList, extensions2.toImmutableList(arrayList2));
            }
            Object next = it2.next();
            int i9 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MarginTableColumnDto marginTableColumnDto3 = list.get(i2);
            TableColumnAlignmentDto alignment3 = marginTableColumnDto3.getAlignment();
            UIComponentDto component3 = ((MarginTableItemDto) next).getComponent();
            UIComponentDto.ConcreteDto concrete3 = component3 != null ? component3.getConcrete() : null;
            if (concrete3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(new ScreenTableCells.SduiDto(concrete3, alignment3, marginTableColumnDto3.getWidth() != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(r8.intValue())) : null, defaultConstructorMarker));
            i2 = i9;
        }
    }
}
