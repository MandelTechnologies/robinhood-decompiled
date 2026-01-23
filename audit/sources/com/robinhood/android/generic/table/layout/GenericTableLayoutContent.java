package com.robinhood.android.generic.table.layout;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.android.generic.table.GenericChildRow;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.StickyColumn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/generic/table/layout/GenericTableLayoutContent;", "", "Item", "Table", "Lcom/robinhood/android/generic/table/layout/GenericTableLayoutContent$Item;", "Lcom/robinhood/android/generic/table/layout/GenericTableLayoutContent$Table;", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface GenericTableLayoutContent {

    /* compiled from: Models.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/generic/table/layout/GenericTableLayoutContent$Item;", "Lcom/robinhood/android/generic/table/layout/GenericTableLayoutContent;", "", "key", "Lkotlin/Function0;", "", "display", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Lcom/robinhood/android/generic/table/layout/GenericTableLayoutContent$Item;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getKey", "Lkotlin/jvm/functions/Function2;", "getDisplay", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Item implements GenericTableLayoutContent {
        public static final int $stable = 8;
        private final Function2<Composer, Integer, Unit> display;
        private final Object key;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Item copy$default(Item item, Object obj, Function2 function2, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = item.key;
            }
            if ((i & 2) != 0) {
                function2 = item.display;
            }
            return item.copy(obj, function2);
        }

        /* renamed from: component1, reason: from getter */
        public final Object getKey() {
            return this.key;
        }

        public final Function2<Composer, Integer, Unit> component2() {
            return this.display;
        }

        public final Item copy(Object key, Function2<? super Composer, ? super Integer, Unit> display) {
            Intrinsics.checkNotNullParameter(display, "display");
            return new Item(key, display);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.key, item.key) && Intrinsics.areEqual(this.display, item.display);
        }

        public int hashCode() {
            Object obj = this.key;
            return ((obj == null ? 0 : obj.hashCode()) * 31) + this.display.hashCode();
        }

        public String toString() {
            return "Item(key=" + this.key + ", display=" + this.display + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Item(Object obj, Function2<? super Composer, ? super Integer, Unit> display) {
            Intrinsics.checkNotNullParameter(display, "display");
            this.key = obj;
            this.display = display;
        }

        public final Function2<Composer, Integer, Unit> getDisplay() {
            return this.display;
        }

        public final Object getKey() {
            return this.key;
        }
    }

    /* compiled from: Models.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003Bá\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012d\u0010\u0012\u001a`\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u001a\b\u0002\u0010\u001c\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a\u0012\u001a\b\u0002\u0010\u001e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$Jn\u0010%\u001a`\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b.\u0010/J\"\u00100\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b0\u00101J\"\u00102\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b2\u00101Jþ\u0001\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062f\b\u0002\u0010\u0012\u001a`\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u001a\b\u0002\u0010\u001c\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a2\u001a\b\u0002\u0010\u001e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b6\u0010\"J\u0010\u00107\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\u00162\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010$Ru\u0010\u0012\u001a`\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010&R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bF\u0010*R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\bH\u0010-R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010I\u001a\u0004\bJ\u0010/R)\u0010\u001c\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010K\u001a\u0004\bL\u00101R)\u0010\u001e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001e\u0010K\u001a\u0004\bM\u00101¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/generic/table/layout/GenericTableLayoutContent$Table;", "Lcom/robinhood/android/generic/table/GenericCell;", "T", "Lcom/robinhood/android/generic/table/layout/GenericTableLayoutContent;", "", "tableId", "Lcom/robinhood/android/generic/table/GenericTableData;", "tableData", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "cell", "Landroidx/compose/ui/unit/Dp;", "height", "width", "Lcom/robinhood/android/generic/table/DisplayDetails;", "displayDetails", "", "displayCell", "Lcom/robinhood/android/generic/table/GenericStickyColumn;", "stickyColumnDetails", "overrideHeaderHeight", "", "animateItemPlacement", "", "displayLimit", "Lkotlin/Function1;", "Lcom/robinhood/android/generic/table/GenericRow;", "onRowClicked", "Lcom/robinhood/android/generic/table/GenericChildRow;", "onChildRowClicked", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/generic/table/GenericTableData;Lkotlin/jvm/functions/Function6;Lcom/robinhood/android/generic/table/GenericStickyColumn;Landroidx/compose/ui/unit/Dp;ZLjava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/android/generic/table/GenericTableData;", "component3", "()Lkotlin/jvm/functions/Function6;", "component4", "()Lcom/robinhood/android/generic/table/GenericStickyColumn;", "component5-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "component5", "component6", "()Z", "component7", "()Ljava/lang/Integer;", "component8", "()Lkotlin/jvm/functions/Function1;", "component9", "copy-zX9VqPk", "(Ljava/lang/String;Lcom/robinhood/android/generic/table/GenericTableData;Lkotlin/jvm/functions/Function6;Lcom/robinhood/android/generic/table/GenericStickyColumn;Landroidx/compose/ui/unit/Dp;ZLjava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/android/generic/table/layout/GenericTableLayoutContent$Table;", "copy", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTableId", "Lcom/robinhood/android/generic/table/GenericTableData;", "getTableData", "Lkotlin/jvm/functions/Function6;", "getDisplayCell", "Lcom/robinhood/android/generic/table/GenericStickyColumn;", "getStickyColumnDetails", "Landroidx/compose/ui/unit/Dp;", "getOverrideHeaderHeight-lTKBWiU", "Z", "getAnimateItemPlacement", "Ljava/lang/Integer;", "getDisplayLimit", "Lkotlin/jvm/functions/Function1;", "getOnRowClicked", "getOnChildRowClicked", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Table<T extends GenericCell> implements GenericTableLayoutContent {
        public static final int $stable = 8;
        private final boolean animateItemPlacement;
        private final Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> displayCell;
        private final Integer displayLimit;
        private final Function1<GenericChildRow<?>, Unit> onChildRowClicked;
        private final Function1<GenericRow<?>, Unit> onRowClicked;
        private final C2002Dp overrideHeaderHeight;
        private final StickyColumn stickyColumnDetails;
        private final GenericTableData<T> tableData;
        private final String tableId;

        public /* synthetic */ Table(String str, GenericTableData genericTableData, Function6 function6, StickyColumn stickyColumn, C2002Dp c2002Dp, boolean z, Integer num, Function1 function1, Function1 function12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, genericTableData, function6, stickyColumn, c2002Dp, z, num, function1, function12);
        }

        /* renamed from: copy-zX9VqPk$default, reason: not valid java name */
        public static /* synthetic */ Table m14988copyzX9VqPk$default(Table table, String str, GenericTableData genericTableData, Function6 function6, StickyColumn stickyColumn, C2002Dp c2002Dp, boolean z, Integer num, Function1 function1, Function1 function12, int i, Object obj) {
            if ((i & 1) != 0) {
                str = table.tableId;
            }
            if ((i & 2) != 0) {
                genericTableData = table.tableData;
            }
            if ((i & 4) != 0) {
                function6 = table.displayCell;
            }
            if ((i & 8) != 0) {
                stickyColumn = table.stickyColumnDetails;
            }
            if ((i & 16) != 0) {
                c2002Dp = table.overrideHeaderHeight;
            }
            if ((i & 32) != 0) {
                z = table.animateItemPlacement;
            }
            if ((i & 64) != 0) {
                num = table.displayLimit;
            }
            if ((i & 128) != 0) {
                function1 = table.onRowClicked;
            }
            if ((i & 256) != 0) {
                function12 = table.onChildRowClicked;
            }
            Function1 function13 = function1;
            Function1 function14 = function12;
            boolean z2 = z;
            Integer num2 = num;
            C2002Dp c2002Dp2 = c2002Dp;
            Function6 function62 = function6;
            return table.m14990copyzX9VqPk(str, genericTableData, function62, stickyColumn, c2002Dp2, z2, num2, function13, function14);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTableId() {
            return this.tableId;
        }

        public final GenericTableData<T> component2() {
            return this.tableData;
        }

        public final Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> component3() {
            return this.displayCell;
        }

        /* renamed from: component4, reason: from getter */
        public final StickyColumn getStickyColumnDetails() {
            return this.stickyColumnDetails;
        }

        /* renamed from: component5-lTKBWiU, reason: not valid java name and from getter */
        public final C2002Dp getOverrideHeaderHeight() {
            return this.overrideHeaderHeight;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getAnimateItemPlacement() {
            return this.animateItemPlacement;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getDisplayLimit() {
            return this.displayLimit;
        }

        public final Function1<GenericRow<?>, Unit> component8() {
            return this.onRowClicked;
        }

        public final Function1<GenericChildRow<?>, Unit> component9() {
            return this.onChildRowClicked;
        }

        /* renamed from: copy-zX9VqPk, reason: not valid java name */
        public final Table<T> m14990copyzX9VqPk(String tableId, GenericTableData<T> tableData, Function6<? super GenericCell, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> displayCell, StickyColumn stickyColumnDetails, C2002Dp overrideHeaderHeight, boolean animateItemPlacement, Integer displayLimit, Function1<? super GenericRow<?>, Unit> onRowClicked, Function1<? super GenericChildRow<?>, Unit> onChildRowClicked) {
            Intrinsics.checkNotNullParameter(tableId, "tableId");
            Intrinsics.checkNotNullParameter(tableData, "tableData");
            Intrinsics.checkNotNullParameter(displayCell, "displayCell");
            return new Table<>(tableId, tableData, displayCell, stickyColumnDetails, overrideHeaderHeight, animateItemPlacement, displayLimit, onRowClicked, onChildRowClicked, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Table)) {
                return false;
            }
            Table table = (Table) other;
            return Intrinsics.areEqual(this.tableId, table.tableId) && Intrinsics.areEqual(this.tableData, table.tableData) && Intrinsics.areEqual(this.displayCell, table.displayCell) && Intrinsics.areEqual(this.stickyColumnDetails, table.stickyColumnDetails) && Intrinsics.areEqual(this.overrideHeaderHeight, table.overrideHeaderHeight) && this.animateItemPlacement == table.animateItemPlacement && Intrinsics.areEqual(this.displayLimit, table.displayLimit) && Intrinsics.areEqual(this.onRowClicked, table.onRowClicked) && Intrinsics.areEqual(this.onChildRowClicked, table.onChildRowClicked);
        }

        public int hashCode() {
            int iHashCode = ((((this.tableId.hashCode() * 31) + this.tableData.hashCode()) * 31) + this.displayCell.hashCode()) * 31;
            StickyColumn stickyColumn = this.stickyColumnDetails;
            int iHashCode2 = (iHashCode + (stickyColumn == null ? 0 : stickyColumn.hashCode())) * 31;
            C2002Dp c2002Dp = this.overrideHeaderHeight;
            int iM7998hashCodeimpl = (((iHashCode2 + (c2002Dp == null ? 0 : C2002Dp.m7998hashCodeimpl(c2002Dp.getValue()))) * 31) + Boolean.hashCode(this.animateItemPlacement)) * 31;
            Integer num = this.displayLimit;
            int iHashCode3 = (iM7998hashCodeimpl + (num == null ? 0 : num.hashCode())) * 31;
            Function1<GenericRow<?>, Unit> function1 = this.onRowClicked;
            int iHashCode4 = (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function1<GenericChildRow<?>, Unit> function12 = this.onChildRowClicked;
            return iHashCode4 + (function12 != null ? function12.hashCode() : 0);
        }

        public String toString() {
            return "Table(tableId=" + this.tableId + ", tableData=" + this.tableData + ", displayCell=" + this.displayCell + ", stickyColumnDetails=" + this.stickyColumnDetails + ", overrideHeaderHeight=" + this.overrideHeaderHeight + ", animateItemPlacement=" + this.animateItemPlacement + ", displayLimit=" + this.displayLimit + ", onRowClicked=" + this.onRowClicked + ", onChildRowClicked=" + this.onChildRowClicked + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Table(String tableId, GenericTableData<T> tableData, Function6<? super GenericCell, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> displayCell, StickyColumn stickyColumn, C2002Dp c2002Dp, boolean z, Integer num, Function1<? super GenericRow<?>, Unit> function1, Function1<? super GenericChildRow<?>, Unit> function12) {
            Intrinsics.checkNotNullParameter(tableId, "tableId");
            Intrinsics.checkNotNullParameter(tableData, "tableData");
            Intrinsics.checkNotNullParameter(displayCell, "displayCell");
            this.tableId = tableId;
            this.tableData = tableData;
            this.displayCell = displayCell;
            this.stickyColumnDetails = stickyColumn;
            this.overrideHeaderHeight = c2002Dp;
            this.animateItemPlacement = z;
            this.displayLimit = num;
            this.onRowClicked = function1;
            this.onChildRowClicked = function12;
        }

        public /* synthetic */ Table(String str, GenericTableData genericTableData, Function6 function6, StickyColumn stickyColumn, C2002Dp c2002Dp, boolean z, Integer num, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, genericTableData, function6, stickyColumn, c2002Dp, z, num, (i & 128) != 0 ? null : function1, (i & 256) != 0 ? null : function12, null);
        }

        public final String getTableId() {
            return this.tableId;
        }

        public final GenericTableData<T> getTableData() {
            return this.tableData;
        }

        public final Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> getDisplayCell() {
            return this.displayCell;
        }

        public final StickyColumn getStickyColumnDetails() {
            return this.stickyColumnDetails;
        }

        /* renamed from: getOverrideHeaderHeight-lTKBWiU, reason: not valid java name */
        public final C2002Dp m14991getOverrideHeaderHeightlTKBWiU() {
            return this.overrideHeaderHeight;
        }

        public final boolean getAnimateItemPlacement() {
            return this.animateItemPlacement;
        }

        public final Integer getDisplayLimit() {
            return this.displayLimit;
        }

        public final Function1<GenericRow<?>, Unit> getOnRowClicked() {
            return this.onRowClicked;
        }

        public final Function1<GenericChildRow<?>, Unit> getOnChildRowClicked() {
            return this.onChildRowClicked;
        }
    }
}
