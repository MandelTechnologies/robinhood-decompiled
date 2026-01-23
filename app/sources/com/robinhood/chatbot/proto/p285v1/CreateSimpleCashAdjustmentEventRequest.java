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
import com.truelayer.payments.analytics.sender.EventSenderWorker;
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

/* compiled from: CreateSimpleCashAdjustmentEventRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JX\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequest;", "Lcom/squareup/wire/Message;", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "amount", "description", "direction", "account_id", "", "additional_fields", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Lokio/ByteString;)V", "getConfiguration", "()Ljava/lang/String;", "getAmount", "getDescription", "getDirection", "getAccount_id", "()J", "getAdditional_fields", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CreateSimpleCashAdjustmentEventRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateSimpleCashAdjustmentEventRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final long account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", jsonName = "additionalFields", schemaIndex = 5, tag = 6)
    private final Map<String, ?> additional_fields;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String configuration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String direction;

    public CreateSimpleCashAdjustmentEventRequest() {
        this(null, null, null, null, 0L, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ CreateSimpleCashAdjustmentEventRequest(String str, String str2, String str3, String str4, long j, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : map, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20478newBuilder();
    }

    public final String getConfiguration() {
        return this.configuration;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final long getAccount_id() {
        return this.account_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSimpleCashAdjustmentEventRequest(String configuration, String amount, String description, String direction, long j, Map<String, ?> map, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.configuration = configuration;
        this.amount = amount;
        this.description = description;
        this.direction = direction;
        this.account_id = j;
        this.additional_fields = (Map) Internal.immutableCopyOfStruct("additional_fields", map);
    }

    public final Map<String, ?> getAdditional_fields() {
        return this.additional_fields;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20478newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateSimpleCashAdjustmentEventRequest)) {
            return false;
        }
        CreateSimpleCashAdjustmentEventRequest createSimpleCashAdjustmentEventRequest = (CreateSimpleCashAdjustmentEventRequest) other;
        return Intrinsics.areEqual(unknownFields(), createSimpleCashAdjustmentEventRequest.unknownFields()) && Intrinsics.areEqual(this.configuration, createSimpleCashAdjustmentEventRequest.configuration) && Intrinsics.areEqual(this.amount, createSimpleCashAdjustmentEventRequest.amount) && Intrinsics.areEqual(this.description, createSimpleCashAdjustmentEventRequest.description) && Intrinsics.areEqual(this.direction, createSimpleCashAdjustmentEventRequest.direction) && this.account_id == createSimpleCashAdjustmentEventRequest.account_id && Intrinsics.areEqual(this.additional_fields, createSimpleCashAdjustmentEventRequest.additional_fields);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.configuration.hashCode()) * 37) + this.amount.hashCode()) * 37) + this.description.hashCode()) * 37) + this.direction.hashCode()) * 37) + Long.hashCode(this.account_id)) * 37;
        Map<String, ?> map = this.additional_fields;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("configuration=" + Internal.sanitize(this.configuration));
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("direction=" + Internal.sanitize(this.direction));
        arrayList.add("account_id=" + this.account_id);
        Map<String, ?> map = this.additional_fields;
        if (map != null) {
            arrayList.add("additional_fields=" + map);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateSimpleCashAdjustmentEventRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateSimpleCashAdjustmentEventRequest copy$default(CreateSimpleCashAdjustmentEventRequest createSimpleCashAdjustmentEventRequest, String str, String str2, String str3, String str4, long j, Map map, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createSimpleCashAdjustmentEventRequest.configuration;
        }
        if ((i & 2) != 0) {
            str2 = createSimpleCashAdjustmentEventRequest.amount;
        }
        if ((i & 4) != 0) {
            str3 = createSimpleCashAdjustmentEventRequest.description;
        }
        if ((i & 8) != 0) {
            str4 = createSimpleCashAdjustmentEventRequest.direction;
        }
        if ((i & 16) != 0) {
            j = createSimpleCashAdjustmentEventRequest.account_id;
        }
        if ((i & 32) != 0) {
            map = createSimpleCashAdjustmentEventRequest.additional_fields;
        }
        if ((i & 64) != 0) {
            byteString = createSimpleCashAdjustmentEventRequest.unknownFields();
        }
        long j2 = j;
        String str5 = str3;
        String str6 = str4;
        return createSimpleCashAdjustmentEventRequest.copy(str, str2, str5, str6, j2, map, byteString);
    }

    public final CreateSimpleCashAdjustmentEventRequest copy(String configuration, String amount, String description, String direction, long account_id, Map<String, ?> additional_fields, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateSimpleCashAdjustmentEventRequest(configuration, amount, description, direction, account_id, additional_fields, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateSimpleCashAdjustmentEventRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateSimpleCashAdjustmentEventRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.CreateSimpleCashAdjustmentEventRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateSimpleCashAdjustmentEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getConfiguration(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getConfiguration());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDirection());
                }
                if (value.getAccount_id() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(5, Long.valueOf(value.getAccount_id()));
                }
                return size + ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(6, value.getAdditional_fields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateSimpleCashAdjustmentEventRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getConfiguration(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConfiguration());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDirection());
                }
                if (value.getAccount_id() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 5, (int) Long.valueOf(value.getAccount_id()));
                }
                ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 6, (int) value.getAdditional_fields());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateSimpleCashAdjustmentEventRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 6, (int) value.getAdditional_fields());
                if (value.getAccount_id() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 5, (int) Long.valueOf(value.getAccount_id()));
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDirection());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (Intrinsics.areEqual(value.getConfiguration(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConfiguration());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateSimpleCashAdjustmentEventRequest redact(CreateSimpleCashAdjustmentEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Map<String, ?> additional_fields = value.getAdditional_fields();
                return CreateSimpleCashAdjustmentEventRequest.copy$default(value, null, null, null, null, 0L, additional_fields != null ? ProtoAdapter.STRUCT_MAP.redact(additional_fields) : null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateSimpleCashAdjustmentEventRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                long jLongValue = 0;
                Map<String, ?> mapDecode = null;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 6:
                                mapDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CreateSimpleCashAdjustmentEventRequest(strDecode, strDecode2, strDecode3, strDecode4, jLongValue, mapDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
