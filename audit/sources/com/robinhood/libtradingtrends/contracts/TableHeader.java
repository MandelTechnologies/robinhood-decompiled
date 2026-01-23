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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.p507ui.sdui.SduiIcon;

/* compiled from: TradingTrendsTable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B?\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J5\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TableHeader;", "", "seen1", "", "title", "", "action", "Lcom/robinhood/libtradingtrends/contracts/TableHeaderSortAction;", "active", "", "icon", "Lmicrogram/ui/sdui/SduiIcon;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/libtradingtrends/contracts/TableHeaderSortAction;ZLmicrogram/ui/sdui/SduiIcon;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/robinhood/libtradingtrends/contracts/TableHeaderSortAction;ZLmicrogram/ui/sdui/SduiIcon;)V", "getAction", "()Lcom/robinhood/libtradingtrends/contracts/TableHeaderSortAction;", "getActive", "()Z", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes13.dex */
public final /* data */ class TableHeader {
    private final TableHeaderSortAction action;
    private final boolean active;
    private final SduiIcon icon;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiIcon.INSTANCE.serializer()};

    public static /* synthetic */ TableHeader copy$default(TableHeader tableHeader, String str, TableHeaderSortAction tableHeaderSortAction, boolean z, SduiIcon sduiIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tableHeader.title;
        }
        if ((i & 2) != 0) {
            tableHeaderSortAction = tableHeader.action;
        }
        if ((i & 4) != 0) {
            z = tableHeader.active;
        }
        if ((i & 8) != 0) {
            sduiIcon = tableHeader.icon;
        }
        return tableHeader.copy(str, tableHeaderSortAction, z, sduiIcon);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TableHeaderSortAction getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* renamed from: component4, reason: from getter */
    public final SduiIcon getIcon() {
        return this.icon;
    }

    public final TableHeader copy(String title, TableHeaderSortAction action, boolean active, SduiIcon icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new TableHeader(title, action, active, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TableHeader)) {
            return false;
        }
        TableHeader tableHeader = (TableHeader) other;
        return Intrinsics.areEqual(this.title, tableHeader.title) && Intrinsics.areEqual(this.action, tableHeader.action) && this.active == tableHeader.active && this.icon == tableHeader.icon;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TableHeaderSortAction tableHeaderSortAction = this.action;
        int iHashCode2 = (((iHashCode + (tableHeaderSortAction == null ? 0 : tableHeaderSortAction.hashCode())) * 31) + Boolean.hashCode(this.active)) * 31;
        SduiIcon sduiIcon = this.icon;
        return iHashCode2 + (sduiIcon != null ? sduiIcon.hashCode() : 0);
    }

    public String toString() {
        return "TableHeader(title=" + this.title + ", action=" + this.action + ", active=" + this.active + ", icon=" + this.icon + ")";
    }

    /* compiled from: TradingTrendsTable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TableHeader$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TableHeader;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TableHeader> serializer() {
            return TableHeader$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ TableHeader(int i, String str, TableHeaderSortAction tableHeaderSortAction, boolean z, SduiIcon sduiIcon, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, TableHeader$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.action = null;
        } else {
            this.action = tableHeaderSortAction;
        }
        if ((i & 4) == 0) {
            this.active = false;
        } else {
            this.active = z;
        }
        if ((i & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = sduiIcon;
        }
    }

    public TableHeader(String title, TableHeaderSortAction tableHeaderSortAction, boolean z, SduiIcon sduiIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.action = tableHeaderSortAction;
        this.active = z;
        this.icon = sduiIcon;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(TableHeader self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, TableHeaderSortAction$$serializer.INSTANCE, self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.active) {
            output.encodeBooleanElement(serialDesc, 2, self.active);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.icon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.icon);
    }

    public /* synthetic */ TableHeader(String str, TableHeaderSortAction tableHeaderSortAction, boolean z, SduiIcon sduiIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : tableHeaderSortAction, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : sduiIcon);
    }

    public final String getTitle() {
        return this.title;
    }

    public final TableHeaderSortAction getAction() {
        return this.action;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final SduiIcon getIcon() {
        return this.icon;
    }
}
