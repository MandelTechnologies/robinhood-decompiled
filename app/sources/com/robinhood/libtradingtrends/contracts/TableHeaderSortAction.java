package com.robinhood.libtradingtrends.contracts;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: TradingTrendsTable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TableHeaderSortAction;", "", "seen1", "", "key", "", "direction", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getDirection", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes13.dex */
public final /* data */ class TableHeaderSortAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String direction;
    private final String key;

    public static /* synthetic */ TableHeaderSortAction copy$default(TableHeaderSortAction tableHeaderSortAction, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tableHeaderSortAction.key;
        }
        if ((i & 2) != 0) {
            str2 = tableHeaderSortAction.direction;
        }
        return tableHeaderSortAction.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    public final TableHeaderSortAction copy(String key, String direction) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new TableHeaderSortAction(key, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TableHeaderSortAction)) {
            return false;
        }
        TableHeaderSortAction tableHeaderSortAction = (TableHeaderSortAction) other;
        return Intrinsics.areEqual(this.key, tableHeaderSortAction.key) && Intrinsics.areEqual(this.direction, tableHeaderSortAction.direction);
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.direction.hashCode();
    }

    public String toString() {
        return "TableHeaderSortAction(key=" + this.key + ", direction=" + this.direction + ")";
    }

    /* compiled from: TradingTrendsTable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TableHeaderSortAction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TableHeaderSortAction;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TableHeaderSortAction> serializer() {
            return TableHeaderSortAction$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ TableHeaderSortAction(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, TableHeaderSortAction$$serializer.INSTANCE.getDescriptor());
        }
        this.key = str;
        this.direction = str2;
    }

    public TableHeaderSortAction(String key, String direction) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.key = key;
        this.direction = direction;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(TableHeaderSortAction self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.key);
        output.encodeStringElement(serialDesc, 1, self.direction);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getDirection() {
        return this.direction;
    }
}
