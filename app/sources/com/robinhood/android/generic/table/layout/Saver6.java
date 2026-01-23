package com.robinhood.android.generic.table.layout;

import androidx.compose.foundation.ScrollState;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: Saver.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\";\u0010\u0000\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\";\u0010\n\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00060\u00050\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\"G\u0010\u000e\u001a8\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0005\u0012\u0004\u0012\u00020\u00110\u00100\u00050\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\t¨\u0006\u0013"}, m3636d2 = {"horizontalScrollStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "", "Landroidx/compose/foundation/ScrollState;", "", "Lkotlin/Pair;", "", "getHorizontalScrollStateSaver", "()Landroidx/compose/runtime/saveable/Saver;", "expandedStateSaver", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "getExpandedStateSaver", "tableSizingSaver", "Lcom/robinhood/android/generic/table/layout/TableSizing;", "Lkotlin/Triple;", "", "getTableSizingSaver", "lib-generic-table_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.generic.table.layout.SaverKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class Saver6 {
    private static final Saver<Map<String, ScrollState>, List<Tuples2<String, Integer>>> horizontalScrollStateSaver = Saver2.Saver(new Function2() { // from class: com.robinhood.android.generic.table.layout.SaverKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Saver6.horizontalScrollStateSaver$lambda$1((Saver5) obj, (Map) obj2);
        }
    }, new Function1() { // from class: com.robinhood.android.generic.table.layout.SaverKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Saver6.horizontalScrollStateSaver$lambda$3((List) obj);
        }
    });
    private static final Saver<SnapshotStateMap<String, Boolean>, List<Tuples2<String, Boolean>>> expandedStateSaver = Saver2.Saver(new Function2() { // from class: com.robinhood.android.generic.table.layout.SaverKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Saver6.expandedStateSaver$lambda$4((Saver5) obj, (SnapshotStateMap) obj2);
        }
    }, new Function1() { // from class: com.robinhood.android.generic.table.layout.SaverKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Saver6.expandedStateSaver$lambda$5((List) obj);
        }
    });
    private static final Saver<SnapshotStateMap<String, TableSizing>, List<Tuples3<String, List<Float>, Float>>> tableSizingSaver = Saver2.Saver(new Function2() { // from class: com.robinhood.android.generic.table.layout.SaverKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Saver6.tableSizingSaver$lambda$8((Saver5) obj, (SnapshotStateMap) obj2);
        }
    }, new Function1() { // from class: com.robinhood.android.generic.table.layout.SaverKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Saver6.tableSizingSaver$lambda$11((List) obj);
        }
    });

    public static final Saver<Map<String, ScrollState>, List<Tuples2<String, Integer>>> getHorizontalScrollStateSaver() {
        return horizontalScrollStateSaver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List horizontalScrollStateSaver$lambda$1(Saver5 Saver, Map it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        List<Tuples2> list = MapsKt.toList(it);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Tuples2 tuples2 : list) {
            arrayList.add(Tuples4.m3642to(tuples2.getFirst(), Integer.valueOf(((ScrollState) tuples2.getSecond()).getValue())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map horizontalScrollStateSaver$lambda$3(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<Tuples2> list = it;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Tuples2 tuples2 : list) {
            arrayList.add(Tuples4.m3642to(tuples2.getFirst(), new ScrollState(((Number) tuples2.getSecond()).intValue())));
        }
        return MapsKt.toMap(arrayList);
    }

    public static final Saver<SnapshotStateMap<String, Boolean>, List<Tuples2<String, Boolean>>> getExpandedStateSaver() {
        return expandedStateSaver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List expandedStateSaver$lambda$4(Saver5 Saver, SnapshotStateMap it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return MapsKt.toList(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotStateMap expandedStateSaver$lambda$5(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Tuples2[] tuples2Arr = (Tuples2[]) it.toArray(new Tuples2[0]);
        return SnapshotStateKt.mutableStateMapOf((Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length));
    }

    public static final Saver<SnapshotStateMap<String, TableSizing>, List<Tuples3<String, List<Float>, Float>>> getTableSizingSaver() {
        return tableSizingSaver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List tableSizingSaver$lambda$8(Saver5 Saver, SnapshotStateMap it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        List<Tuples2> list = MapsKt.toList(it);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Tuples2 tuples2 : list) {
            Object first = tuples2.getFirst();
            ImmutableList<C2002Dp> columnWidths = ((TableSizing) tuples2.getSecond()).getColumnWidths();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(columnWidths, 10));
            Iterator<C2002Dp> it2 = columnWidths.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Float.valueOf(it2.next().getValue()));
            }
            arrayList.add(new Tuples3(first, arrayList2, Float.valueOf(((TableSizing) tuples2.getSecond()).m15005getRowHeightD9Ej5fM())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotStateMap tableSizingSaver$lambda$11(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<Tuples3> list = it;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Tuples3 tuples3 : list) {
            Object first = tuples3.getFirst();
            Iterable iterable = (Iterable) tuples3.getSecond();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(((Number) it2.next()).floatValue())));
            }
            arrayList.add(Tuples4.m3642to(first, new TableSizing(extensions2.toImmutableList(arrayList2), C2002Dp.m7995constructorimpl(((Number) tuples3.getThird()).floatValue()), null)));
        }
        Tuples2[] tuples2Arr = (Tuples2[]) arrayList.toArray(new Tuples2[0]);
        return SnapshotStateKt.mutableStateMapOf((Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length));
    }
}
