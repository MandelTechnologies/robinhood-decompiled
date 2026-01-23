package crypto_portkey.service.p443v1;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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

/* compiled from: ProcessMigrationAuthedRequest.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JD\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcrypto_portkey/service/v1/ProcessMigrationAuthedRequest;", "Lcom/squareup/wire/Message;", "", "id", "", "timestamp", "", "type", WebsocketGatewayConstants.DATA_KEY, "Lcrypto_portkey/service/v1/MigrationData;", "partner", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Lcrypto_portkey/service/v1/MigrationData;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getType", "getData", "()Lcrypto_portkey/service/v1/MigrationData;", "getPartner", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ProcessMigrationAuthedRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ProcessMigrationAuthedRequest> ADAPTER;

    @WireField(adapter = "crypto_portkey.service.v1.MigrationData#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final MigrationData data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String partner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String type;

    public ProcessMigrationAuthedRequest() {
        this(null, 0L, null, null, null, null, 63, null);
    }

    public /* synthetic */ ProcessMigrationAuthedRequest(String str, long j, String str2, MigrationData migrationData, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : migrationData, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27918newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final MigrationData getData() {
        return this.data;
    }

    public final String getPartner() {
        return this.partner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessMigrationAuthedRequest(String id, long j, String type2, MigrationData migrationData, String partner, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(partner, "partner");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.timestamp = j;
        this.type = type2;
        this.data = migrationData;
        this.partner = partner;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27918newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ProcessMigrationAuthedRequest)) {
            return false;
        }
        ProcessMigrationAuthedRequest processMigrationAuthedRequest = (ProcessMigrationAuthedRequest) other;
        return Intrinsics.areEqual(unknownFields(), processMigrationAuthedRequest.unknownFields()) && Intrinsics.areEqual(this.id, processMigrationAuthedRequest.id) && this.timestamp == processMigrationAuthedRequest.timestamp && Intrinsics.areEqual(this.type, processMigrationAuthedRequest.type) && Intrinsics.areEqual(this.data, processMigrationAuthedRequest.data) && Intrinsics.areEqual(this.partner, processMigrationAuthedRequest.partner);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + Long.hashCode(this.timestamp)) * 37) + this.type.hashCode()) * 37;
        MigrationData migrationData = this.data;
        int iHashCode2 = ((iHashCode + (migrationData != null ? migrationData.hashCode() : 0)) * 37) + this.partner.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("timestamp=" + this.timestamp);
        arrayList.add("type=" + Internal.sanitize(this.type));
        MigrationData migrationData = this.data;
        if (migrationData != null) {
            arrayList.add("data=" + migrationData);
        }
        arrayList.add("partner=" + Internal.sanitize(this.partner));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProcessMigrationAuthedRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ProcessMigrationAuthedRequest copy$default(ProcessMigrationAuthedRequest processMigrationAuthedRequest, String str, long j, String str2, MigrationData migrationData, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = processMigrationAuthedRequest.id;
        }
        if ((i & 2) != 0) {
            j = processMigrationAuthedRequest.timestamp;
        }
        if ((i & 4) != 0) {
            str2 = processMigrationAuthedRequest.type;
        }
        if ((i & 8) != 0) {
            migrationData = processMigrationAuthedRequest.data;
        }
        if ((i & 16) != 0) {
            str3 = processMigrationAuthedRequest.partner;
        }
        if ((i & 32) != 0) {
            byteString = processMigrationAuthedRequest.unknownFields();
        }
        return processMigrationAuthedRequest.copy(str, j, str2, migrationData, str3, byteString);
    }

    public final ProcessMigrationAuthedRequest copy(String id, long timestamp, String type2, MigrationData data, String partner, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(partner, "partner");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ProcessMigrationAuthedRequest(id, timestamp, type2, data, partner, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ProcessMigrationAuthedRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ProcessMigrationAuthedRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.ProcessMigrationAuthedRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ProcessMigrationAuthedRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getTimestamp() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getTimestamp()));
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getType());
                }
                if (value.getData() != null) {
                    size += MigrationData.ADAPTER.encodedSizeWithTag(4, value.getData());
                }
                return !Intrinsics.areEqual(value.getPartner(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getPartner()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ProcessMigrationAuthedRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getTimestamp() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getTimestamp()));
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (value.getData() != null) {
                    MigrationData.ADAPTER.encodeWithTag(writer, 4, (int) value.getData());
                }
                if (!Intrinsics.areEqual(value.getPartner(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPartner());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ProcessMigrationAuthedRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPartner(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPartner());
                }
                if (value.getData() != null) {
                    MigrationData.ADAPTER.encodeWithTag(writer, 4, (int) value.getData());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (value.getTimestamp() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getTimestamp()));
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ProcessMigrationAuthedRequest redact(ProcessMigrationAuthedRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MigrationData data = value.getData();
                return ProcessMigrationAuthedRequest.copy$default(value, null, 0L, null, data != null ? MigrationData.ADAPTER.redact(data) : null, null, ByteString.EMPTY, 23, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ProcessMigrationAuthedRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                MigrationData migrationDataDecode = null;
                long jLongValue = 0;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ProcessMigrationAuthedRequest(strDecode, jLongValue, strDecode2, migrationDataDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        migrationDataDecode = MigrationData.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
