package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: TabGroupEventData.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TabGroupEventData;", "Lcom/squareup/wire/Message;", "", "tab_group_name", "", "tab_name", "time_spent", "", "tag", "additional_info", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataAdditionalInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataAdditionalInfo;Lokio/ByteString;)V", "getTab_group_name", "()Ljava/lang/String;", "getTab_name", "getTime_spent", "()I", "getTag", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataAdditionalInfo;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TabGroupEventData extends Message {

    @JvmField
    public static final ProtoAdapter<TabGroupEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TabGroupEventDataAdditionalInfo#ADAPTER", jsonName = "additionalInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final TabGroupEventDataAdditionalInfo additional_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tabGroupName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String tab_group_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tabName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String tab_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "timeSpent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int time_spent;

    public TabGroupEventData() {
        this(null, null, 0, null, null, null, 63, null);
    }

    public /* synthetic */ TabGroupEventData(String str, String str2, int i, String str3, TabGroupEventDataAdditionalInfo tabGroupEventDataAdditionalInfo, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : tabGroupEventDataAdditionalInfo, (i2 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24571newBuilder();
    }

    public final String getTab_group_name() {
        return this.tab_group_name;
    }

    public final String getTab_name() {
        return this.tab_name;
    }

    public final int getTime_spent() {
        return this.time_spent;
    }

    public final String getTag() {
        return this.tag;
    }

    public final TabGroupEventDataAdditionalInfo getAdditional_info() {
        return this.additional_info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabGroupEventData(String tab_group_name, String tab_name, int i, String tag, TabGroupEventDataAdditionalInfo tabGroupEventDataAdditionalInfo, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
        Intrinsics.checkNotNullParameter(tab_name, "tab_name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.tab_group_name = tab_group_name;
        this.tab_name = tab_name;
        this.time_spent = i;
        this.tag = tag;
        this.additional_info = tabGroupEventDataAdditionalInfo;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24571newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TabGroupEventData)) {
            return false;
        }
        TabGroupEventData tabGroupEventData = (TabGroupEventData) other;
        return Intrinsics.areEqual(unknownFields(), tabGroupEventData.unknownFields()) && Intrinsics.areEqual(this.tab_group_name, tabGroupEventData.tab_group_name) && Intrinsics.areEqual(this.tab_name, tabGroupEventData.tab_name) && this.time_spent == tabGroupEventData.time_spent && Intrinsics.areEqual(this.tag, tabGroupEventData.tag) && Intrinsics.areEqual(this.additional_info, tabGroupEventData.additional_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.tab_group_name.hashCode()) * 37) + this.tab_name.hashCode()) * 37) + Integer.hashCode(this.time_spent)) * 37) + this.tag.hashCode()) * 37;
        TabGroupEventDataAdditionalInfo tabGroupEventDataAdditionalInfo = this.additional_info;
        int iHashCode2 = iHashCode + (tabGroupEventDataAdditionalInfo != null ? tabGroupEventDataAdditionalInfo.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tab_group_name=" + Internal.sanitize(this.tab_group_name));
        arrayList.add("tab_name=" + Internal.sanitize(this.tab_name));
        arrayList.add("time_spent=" + this.time_spent);
        arrayList.add("tag=" + Internal.sanitize(this.tag));
        TabGroupEventDataAdditionalInfo tabGroupEventDataAdditionalInfo = this.additional_info;
        if (tabGroupEventDataAdditionalInfo != null) {
            arrayList.add("additional_info=" + tabGroupEventDataAdditionalInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TabGroupEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TabGroupEventData copy$default(TabGroupEventData tabGroupEventData, String str, String str2, int i, String str3, TabGroupEventDataAdditionalInfo tabGroupEventDataAdditionalInfo, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tabGroupEventData.tab_group_name;
        }
        if ((i2 & 2) != 0) {
            str2 = tabGroupEventData.tab_name;
        }
        if ((i2 & 4) != 0) {
            i = tabGroupEventData.time_spent;
        }
        if ((i2 & 8) != 0) {
            str3 = tabGroupEventData.tag;
        }
        if ((i2 & 16) != 0) {
            tabGroupEventDataAdditionalInfo = tabGroupEventData.additional_info;
        }
        if ((i2 & 32) != 0) {
            byteString = tabGroupEventData.unknownFields();
        }
        TabGroupEventDataAdditionalInfo tabGroupEventDataAdditionalInfo2 = tabGroupEventDataAdditionalInfo;
        ByteString byteString2 = byteString;
        return tabGroupEventData.copy(str, str2, i, str3, tabGroupEventDataAdditionalInfo2, byteString2);
    }

    public final TabGroupEventData copy(String tab_group_name, String tab_name, int time_spent, String tag, TabGroupEventDataAdditionalInfo additional_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
        Intrinsics.checkNotNullParameter(tab_name, "tab_name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TabGroupEventData(tab_group_name, tab_name, time_spent, tag, additional_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TabGroupEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TabGroupEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.TabGroupEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TabGroupEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTab_group_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTab_group_name());
                }
                if (!Intrinsics.areEqual(value.getTab_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTab_name());
                }
                if (value.getTime_spent() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTag());
                }
                return value.getAdditional_info() != null ? size + TabGroupEventDataAdditionalInfo.ADAPTER.encodedSizeWithTag(5, value.getAdditional_info()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TabGroupEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTab_group_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTab_group_name());
                }
                if (!Intrinsics.areEqual(value.getTab_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTab_name());
                }
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTag());
                }
                if (value.getAdditional_info() != null) {
                    TabGroupEventDataAdditionalInfo.ADAPTER.encodeWithTag(writer, 5, (int) value.getAdditional_info());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TabGroupEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAdditional_info() != null) {
                    TabGroupEventDataAdditionalInfo.ADAPTER.encodeWithTag(writer, 5, (int) value.getAdditional_info());
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTag());
                }
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getTab_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTab_name());
                }
                if (Intrinsics.areEqual(value.getTab_group_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTab_group_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TabGroupEventData redact(TabGroupEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TabGroupEventDataAdditionalInfo additional_info = value.getAdditional_info();
                return TabGroupEventData.copy$default(value, null, null, 0, null, additional_info != null ? TabGroupEventDataAdditionalInfo.ADAPTER.redact(additional_info) : null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TabGroupEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                TabGroupEventDataAdditionalInfo tabGroupEventDataAdditionalInfoDecode = null;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TabGroupEventData(strDecode, strDecode2, iIntValue, strDecode3, tabGroupEventDataAdditionalInfoDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        tabGroupEventDataAdditionalInfoDecode = TabGroupEventDataAdditionalInfo.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
