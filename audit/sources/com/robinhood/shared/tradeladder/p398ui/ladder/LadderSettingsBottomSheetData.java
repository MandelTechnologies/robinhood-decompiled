package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: GenericLadderSettingsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/LadderSettingsBottomSheetData;", "", "title", "", "rows", "", "Lcom/robinhood/shared/tradeladder/ui/ladder/LadderSettingsBottomSheetData$Row;", "disclaimer", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getRows", "()Ljava/util/List;", "getDisclaimer", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Row", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LadderSettingsBottomSheetData {
    public static final int $stable = 8;
    private final String disclaimer;
    private final List<Row> rows;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LadderSettingsBottomSheetData copy$default(LadderSettingsBottomSheetData ladderSettingsBottomSheetData, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ladderSettingsBottomSheetData.title;
        }
        if ((i & 2) != 0) {
            list = ladderSettingsBottomSheetData.rows;
        }
        if ((i & 4) != 0) {
            str2 = ladderSettingsBottomSheetData.disclaimer;
        }
        return ladderSettingsBottomSheetData.copy(str, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Row> component2() {
        return this.rows;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final LadderSettingsBottomSheetData copy(String title, List<Row> rows, String disclaimer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new LadderSettingsBottomSheetData(title, rows, disclaimer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderSettingsBottomSheetData)) {
            return false;
        }
        LadderSettingsBottomSheetData ladderSettingsBottomSheetData = (LadderSettingsBottomSheetData) other;
        return Intrinsics.areEqual(this.title, ladderSettingsBottomSheetData.title) && Intrinsics.areEqual(this.rows, ladderSettingsBottomSheetData.rows) && Intrinsics.areEqual(this.disclaimer, ladderSettingsBottomSheetData.disclaimer);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.rows.hashCode()) * 31;
        String str = this.disclaimer;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LadderSettingsBottomSheetData(title=" + this.title + ", rows=" + this.rows + ", disclaimer=" + this.disclaimer + ")";
    }

    public LadderSettingsBottomSheetData(String title, List<Row> rows, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.title = title;
        this.rows = rows;
        this.disclaimer = str;
    }

    public /* synthetic */ LadderSettingsBottomSheetData(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2);
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<Row> getRows() {
        return this.rows;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* compiled from: GenericLadderSettingsBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/LadderSettingsBottomSheetData$Row;", "", "", AnnotatedPrivateKey.LABEL, "", "Lkotlin/Function0;", "", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/robinhood/shared/tradeladder/ui/ladder/LadderSettingsBottomSheetData$Row;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "Ljava/util/List;", "getItems", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Row {
        public static final int $stable = 8;
        private final List<Function2<Composer, Integer, Unit>> items;
        private final String label;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Row copy$default(Row row, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = row.label;
            }
            if ((i & 2) != 0) {
                list = row.items;
            }
            return row.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final List<Function2<Composer, Integer, Unit>> component2() {
            return this.items;
        }

        public final Row copy(String label, List<? extends Function2<? super Composer, ? super Integer, Unit>> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new Row(label, items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.label, row.label) && Intrinsics.areEqual(this.items, row.items);
        }

        public int hashCode() {
            String str = this.label;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.items.hashCode();
        }

        public String toString() {
            return "Row(label=" + this.label + ", items=" + this.items + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Row(String str, List<? extends Function2<? super Composer, ? super Integer, Unit>> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.label = str;
            this.items = items;
        }

        public final String getLabel() {
            return this.label;
        }

        public final List<Function2<Composer, Integer, Unit>> getItems() {
            return this.items;
        }
    }
}
