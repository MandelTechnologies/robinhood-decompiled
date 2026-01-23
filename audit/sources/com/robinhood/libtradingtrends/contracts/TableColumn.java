package com.robinhood.libtradingtrends.contracts;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: TradingTrendsTable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J&\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÁ\u0001¢\u0006\u0002\b*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TableColumn;", "", "seen1", "", "id", "", "alignment", "Lcom/robinhood/libtradingtrends/contracts/TableColumnAlignment;", "width", "headerItem", "Lcom/robinhood/libtradingtrends/contracts/TableHeader;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/libtradingtrends/contracts/TableColumnAlignment;Ljava/lang/Integer;Lcom/robinhood/libtradingtrends/contracts/TableHeader;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/robinhood/libtradingtrends/contracts/TableColumnAlignment;Ljava/lang/Integer;Lcom/robinhood/libtradingtrends/contracts/TableHeader;)V", "getAlignment", "()Lcom/robinhood/libtradingtrends/contracts/TableColumnAlignment;", "getHeaderItem", "()Lcom/robinhood/libtradingtrends/contracts/TableHeader;", "getId", "()Ljava/lang/String;", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/robinhood/libtradingtrends/contracts/TableColumnAlignment;Ljava/lang/Integer;Lcom/robinhood/libtradingtrends/contracts/TableHeader;)Lcom/robinhood/libtradingtrends/contracts/TableColumn;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes13.dex */
public final /* data */ class TableColumn {
    private final TableColumnAlignment alignment;
    private final TableHeader headerItem;
    private final String id;
    private final Integer width;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, TableColumnAlignment.INSTANCE.serializer(), null, null};

    public static /* synthetic */ TableColumn copy$default(TableColumn tableColumn, String str, TableColumnAlignment tableColumnAlignment, Integer num, TableHeader tableHeader, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tableColumn.id;
        }
        if ((i & 2) != 0) {
            tableColumnAlignment = tableColumn.alignment;
        }
        if ((i & 4) != 0) {
            num = tableColumn.width;
        }
        if ((i & 8) != 0) {
            tableHeader = tableColumn.headerItem;
        }
        return tableColumn.copy(str, tableColumnAlignment, num, tableHeader);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final TableColumnAlignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final TableHeader getHeaderItem() {
        return this.headerItem;
    }

    public final TableColumn copy(String id, TableColumnAlignment alignment, Integer width, TableHeader headerItem) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(headerItem, "headerItem");
        return new TableColumn(id, alignment, width, headerItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TableColumn)) {
            return false;
        }
        TableColumn tableColumn = (TableColumn) other;
        return Intrinsics.areEqual(this.id, tableColumn.id) && this.alignment == tableColumn.alignment && Intrinsics.areEqual(this.width, tableColumn.width) && Intrinsics.areEqual(this.headerItem, tableColumn.headerItem);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.alignment.hashCode()) * 31;
        Integer num = this.width;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.headerItem.hashCode();
    }

    public String toString() {
        return "TableColumn(id=" + this.id + ", alignment=" + this.alignment + ", width=" + this.width + ", headerItem=" + this.headerItem + ")";
    }

    /* compiled from: TradingTrendsTable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TableColumn$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TableColumn;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TableColumn> serializer() {
            return TableColumn$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ TableColumn(int i, String str, TableColumnAlignment tableColumnAlignment, Integer num, TableHeader tableHeader, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, TableColumn$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.alignment = tableColumnAlignment;
        this.width = num;
        this.headerItem = tableHeader;
    }

    public TableColumn(String id, TableColumnAlignment alignment, Integer num, TableHeader headerItem) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(headerItem, "headerItem");
        this.id = id;
        this.alignment = alignment;
        this.width = num;
        this.headerItem = headerItem;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(TableColumn self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.alignment);
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.width);
        output.encodeSerializableElement(serialDesc, 3, TableHeader$$serializer.INSTANCE, self.headerItem);
    }

    public final String getId() {
        return this.id;
    }

    public final TableColumnAlignment getAlignment() {
        return this.alignment;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final TableHeader getHeaderItem() {
        return this.headerItem;
    }
}
