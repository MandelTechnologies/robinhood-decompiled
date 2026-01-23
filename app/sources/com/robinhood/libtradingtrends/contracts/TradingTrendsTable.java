package com.robinhood.libtradingtrends.contracts;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TradingTrendsTable.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223Bw\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012B[\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\r\u0010\u001d\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jk\u0010$\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J&\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200HÁ\u0001¢\u0006\u0002\b1R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u00064"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "", "seen1", "", "selectedType", "", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsType;", "sortKey", "sortDirection", "availableSortKeys", "", "columns", "Lcom/robinhood/libtradingtrends/contracts/TableColumn;", "rows", "Lcom/robinhood/libtradingtrends/contracts/TableRow;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAvailableSortKeys", "()Ljava/util/List;", "getColumns", "getDisclosure", "()Ljava/lang/String;", "getRows", "getSelectedType", "getSortDirection", "getSortKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes13.dex */
public final /* data */ class TradingTrendsTable {
    private final List<String> availableSortKeys;
    private final List<TableColumn> columns;
    private final String disclosure;
    private final List<TableRow> rows;
    private final String selectedType;
    private final String sortDirection;
    private final String sortKey;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(TableColumn$$serializer.INSTANCE), new ArrayListSerializer(TableRow$$serializer.INSTANCE), null};

    public static /* synthetic */ TradingTrendsTable copy$default(TradingTrendsTable tradingTrendsTable, String str, String str2, String str3, List list, List list2, List list3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradingTrendsTable.selectedType;
        }
        if ((i & 2) != 0) {
            str2 = tradingTrendsTable.sortKey;
        }
        if ((i & 4) != 0) {
            str3 = tradingTrendsTable.sortDirection;
        }
        if ((i & 8) != 0) {
            list = tradingTrendsTable.availableSortKeys;
        }
        if ((i & 16) != 0) {
            list2 = tradingTrendsTable.columns;
        }
        if ((i & 32) != 0) {
            list3 = tradingTrendsTable.rows;
        }
        if ((i & 64) != 0) {
            str4 = tradingTrendsTable.disclosure;
        }
        List list4 = list3;
        String str5 = str4;
        List list5 = list2;
        String str6 = str3;
        return tradingTrendsTable.copy(str, str2, str6, list, list5, list4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSelectedType() {
        return this.selectedType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSortKey() {
        return this.sortKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSortDirection() {
        return this.sortDirection;
    }

    public final List<String> component4() {
        return this.availableSortKeys;
    }

    public final List<TableColumn> component5() {
        return this.columns;
    }

    public final List<TableRow> component6() {
        return this.rows;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    public final TradingTrendsTable copy(String selectedType, String sortKey, String sortDirection, List<String> availableSortKeys, List<TableColumn> columns, List<TableRow> rows, String disclosure) {
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        Intrinsics.checkNotNullParameter(availableSortKeys, "availableSortKeys");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new TradingTrendsTable(selectedType, sortKey, sortDirection, availableSortKeys, columns, rows, disclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingTrendsTable)) {
            return false;
        }
        TradingTrendsTable tradingTrendsTable = (TradingTrendsTable) other;
        return Intrinsics.areEqual(this.selectedType, tradingTrendsTable.selectedType) && Intrinsics.areEqual(this.sortKey, tradingTrendsTable.sortKey) && Intrinsics.areEqual(this.sortDirection, tradingTrendsTable.sortDirection) && Intrinsics.areEqual(this.availableSortKeys, tradingTrendsTable.availableSortKeys) && Intrinsics.areEqual(this.columns, tradingTrendsTable.columns) && Intrinsics.areEqual(this.rows, tradingTrendsTable.rows) && Intrinsics.areEqual(this.disclosure, tradingTrendsTable.disclosure);
    }

    public int hashCode() {
        int iHashCode = this.selectedType.hashCode() * 31;
        String str = this.sortKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sortDirection;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.availableSortKeys.hashCode()) * 31) + this.columns.hashCode()) * 31) + this.rows.hashCode()) * 31;
        String str3 = this.disclosure;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "TradingTrendsTable(selectedType=" + this.selectedType + ", sortKey=" + this.sortKey + ", sortDirection=" + this.sortDirection + ", availableSortKeys=" + this.availableSortKeys + ", columns=" + this.columns + ", rows=" + this.rows + ", disclosure=" + this.disclosure + ")";
    }

    /* compiled from: TradingTrendsTable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradingTrendsTable> serializer() {
            return TradingTrendsTable$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ TradingTrendsTable(int i, String str, String str2, String str3, List list, List list2, List list3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (119 != (i & 119)) {
            PluginExceptions.throwMissingFieldException(i, 119, TradingTrendsTable$$serializer.INSTANCE.getDescriptor());
        }
        this.selectedType = str;
        this.sortKey = str2;
        this.sortDirection = str3;
        if ((i & 8) == 0) {
            this.availableSortKeys = CollectionsKt.emptyList();
        } else {
            this.availableSortKeys = list;
        }
        this.columns = list2;
        this.rows = list3;
        this.disclosure = str4;
    }

    public TradingTrendsTable(String selectedType, String str, String str2, List<String> availableSortKeys, List<TableColumn> columns, List<TableRow> rows, String str3) {
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        Intrinsics.checkNotNullParameter(availableSortKeys, "availableSortKeys");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.selectedType = selectedType;
        this.sortKey = str;
        this.sortDirection = str2;
        this.availableSortKeys = availableSortKeys;
        this.columns = columns;
        this.rows = rows;
        this.disclosure = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(TradingTrendsTable self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.selectedType);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.sortKey);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.sortDirection);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.availableSortKeys, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.availableSortKeys);
        }
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.columns);
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.rows);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.disclosure);
    }

    public final String getSelectedType() {
        return this.selectedType;
    }

    public final String getSortKey() {
        return this.sortKey;
    }

    public final String getSortDirection() {
        return this.sortDirection;
    }

    public /* synthetic */ TradingTrendsTable(String str, String str2, String str3, List list, List list2, List list3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, list2, list3, str4);
    }

    public final List<String> getAvailableSortKeys() {
        return this.availableSortKeys;
    }

    public final List<TableColumn> getColumns() {
        return this.columns;
    }

    public final List<TableRow> getRows() {
        return this.rows;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }
}
