package com.robinhood.chatbot.proto.p285v1;

import com.plaid.internal.EnumC7081g;
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
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ClearingGatewayEvent.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J_\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010#R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEvent;", "Lcom/squareup/wire/Message;", "", "id", "", "type", "account_id", "", "final_clearing_status", "additional_fields", "", "record_date", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getType", "getAccount_id", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFinal_clearing_status", "getRecord_date", "getAdditional_fields", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEvent;", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ClearingGatewayEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClearingGatewayEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "accountId", schemaIndex = 2, tag = 3)
    private final Long account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", jsonName = "additionalFields", schemaIndex = 4, tag = 5)
    private final Map<String, ?> additional_fields;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "finalClearingStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String final_clearing_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "recordDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String record_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String type;

    public ClearingGatewayEvent() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ ClearingGatewayEvent(String str, String str2, Long l, String str3, Map map, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : map, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20468newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getAccount_id() {
        return this.account_id;
    }

    public final String getFinal_clearing_status() {
        return this.final_clearing_status;
    }

    public final String getRecord_date() {
        return this.record_date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearingGatewayEvent(String id, String type2, Long l, String final_clearing_status, Map<String, ?> map, String record_date, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(final_clearing_status, "final_clearing_status");
        Intrinsics.checkNotNullParameter(record_date, "record_date");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.type = type2;
        this.account_id = l;
        this.final_clearing_status = final_clearing_status;
        this.record_date = record_date;
        this.additional_fields = (Map) Internal.immutableCopyOfStruct("additional_fields", map);
    }

    public final Map<String, ?> getAdditional_fields() {
        return this.additional_fields;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20468newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClearingGatewayEvent)) {
            return false;
        }
        ClearingGatewayEvent clearingGatewayEvent = (ClearingGatewayEvent) other;
        return Intrinsics.areEqual(unknownFields(), clearingGatewayEvent.unknownFields()) && Intrinsics.areEqual(this.id, clearingGatewayEvent.id) && Intrinsics.areEqual(this.type, clearingGatewayEvent.type) && Intrinsics.areEqual(this.account_id, clearingGatewayEvent.account_id) && Intrinsics.areEqual(this.final_clearing_status, clearingGatewayEvent.final_clearing_status) && Intrinsics.areEqual(this.additional_fields, clearingGatewayEvent.additional_fields) && Intrinsics.areEqual(this.record_date, clearingGatewayEvent.record_date);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.type.hashCode()) * 37;
        Long l = this.account_id;
        int iHashCode2 = (((iHashCode + (l != null ? l.hashCode() : 0)) * 37) + this.final_clearing_status.hashCode()) * 37;
        Map<String, ?> map = this.additional_fields;
        int iHashCode3 = ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 37) + this.record_date.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("type=" + Internal.sanitize(this.type));
        Long l = this.account_id;
        if (l != null) {
            arrayList.add("account_id=" + l);
        }
        arrayList.add("final_clearing_status=" + Internal.sanitize(this.final_clearing_status));
        Map<String, ?> map = this.additional_fields;
        if (map != null) {
            arrayList.add("additional_fields=" + map);
        }
        arrayList.add("record_date=" + Internal.sanitize(this.record_date));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClearingGatewayEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClearingGatewayEvent copy$default(ClearingGatewayEvent clearingGatewayEvent, String str, String str2, Long l, String str3, Map map, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clearingGatewayEvent.id;
        }
        if ((i & 2) != 0) {
            str2 = clearingGatewayEvent.type;
        }
        if ((i & 4) != 0) {
            l = clearingGatewayEvent.account_id;
        }
        if ((i & 8) != 0) {
            str3 = clearingGatewayEvent.final_clearing_status;
        }
        if ((i & 16) != 0) {
            map = clearingGatewayEvent.additional_fields;
        }
        if ((i & 32) != 0) {
            str4 = clearingGatewayEvent.record_date;
        }
        if ((i & 64) != 0) {
            byteString = clearingGatewayEvent.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        Map map2 = map;
        Long l2 = l;
        return clearingGatewayEvent.copy(str, str2, l2, str3, map2, str5, byteString2);
    }

    public final ClearingGatewayEvent copy(String id, String type2, Long account_id, String final_clearing_status, Map<String, ?> additional_fields, String record_date, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(final_clearing_status, "final_clearing_status");
        Intrinsics.checkNotNullParameter(record_date, "record_date");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClearingGatewayEvent(id, type2, account_id, final_clearing_status, additional_fields, record_date, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClearingGatewayEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClearingGatewayEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.ClearingGatewayEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClearingGatewayEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getType());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.INT64.encodedSizeWithTag(3, value.getAccount_id());
                if (!Intrinsics.areEqual(value.getFinal_clearing_status(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getFinal_clearing_status());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, value.getAdditional_fields());
                return !Intrinsics.areEqual(value.getRecord_date(), "") ? iEncodedSizeWithTag2 + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getRecord_date()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClearingGatewayEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getType());
                }
                ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) value.getAccount_id());
                if (!Intrinsics.areEqual(value.getFinal_clearing_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getFinal_clearing_status());
                }
                ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (int) value.getAdditional_fields());
                if (!Intrinsics.areEqual(value.getRecord_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getRecord_date());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClearingGatewayEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRecord_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getRecord_date());
                }
                ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (int) value.getAdditional_fields());
                if (!Intrinsics.areEqual(value.getFinal_clearing_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getFinal_clearing_status());
                }
                ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) value.getAccount_id());
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClearingGatewayEvent redact(ClearingGatewayEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Map<String, ?> additional_fields = value.getAdditional_fields();
                return ClearingGatewayEvent.copy$default(value, null, null, null, null, additional_fields != null ? ProtoAdapter.STRUCT_MAP.redact(additional_fields) : null, null, ByteString.EMPTY, 47, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClearingGatewayEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                Long lDecode = null;
                Map<String, ?> mapDecode = null;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                lDecode = ProtoAdapter.INT64.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                mapDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ClearingGatewayEvent(strDecode, strDecode4, lDecode, strDecode2, mapDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
