package microgram.contracts.margin.margin_call.proto.p496v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: GetMaintenanceCallDataResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponse;", "Lcom/squareup/wire/Message;", "", "maintenance_call_data", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallData;Lokio/ByteString;)V", "getMaintenance_call_data", "()Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetMaintenanceCallDataResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetMaintenanceCallDataResponse> ADAPTER;

    @WireField(adapter = "microgram.contracts.margin.margin_call.proto.v1.MaintenanceCallData#ADAPTER", jsonName = "maintenanceCallData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MaintenanceCallData maintenance_call_data;

    /* JADX WARN: Multi-variable type inference failed */
    public GetMaintenanceCallDataResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29139newBuilder();
    }

    public final MaintenanceCallData getMaintenance_call_data() {
        return this.maintenance_call_data;
    }

    public /* synthetic */ GetMaintenanceCallDataResponse(MaintenanceCallData maintenanceCallData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : maintenanceCallData, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMaintenanceCallDataResponse(MaintenanceCallData maintenanceCallData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.maintenance_call_data = maintenanceCallData;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29139newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetMaintenanceCallDataResponse)) {
            return false;
        }
        GetMaintenanceCallDataResponse getMaintenanceCallDataResponse = (GetMaintenanceCallDataResponse) other;
        return Intrinsics.areEqual(unknownFields(), getMaintenanceCallDataResponse.unknownFields()) && Intrinsics.areEqual(this.maintenance_call_data, getMaintenanceCallDataResponse.maintenance_call_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        MaintenanceCallData maintenanceCallData = this.maintenance_call_data;
        int iHashCode2 = iHashCode + (maintenanceCallData != null ? maintenanceCallData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        MaintenanceCallData maintenanceCallData = this.maintenance_call_data;
        if (maintenanceCallData != null) {
            arrayList.add("maintenance_call_data=" + maintenanceCallData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMaintenanceCallDataResponse{", "}", 0, null, null, 56, null);
    }

    public final GetMaintenanceCallDataResponse copy(MaintenanceCallData maintenance_call_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetMaintenanceCallDataResponse(maintenance_call_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetMaintenanceCallDataResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetMaintenanceCallDataResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.margin.margin_call.proto.v1.GetMaintenanceCallDataResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetMaintenanceCallDataResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getMaintenance_call_data() != null ? size + MaintenanceCallData.ADAPTER.encodedSizeWithTag(1, value.getMaintenance_call_data()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetMaintenanceCallDataResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMaintenance_call_data() != null) {
                    MaintenanceCallData.ADAPTER.encodeWithTag(writer, 1, (int) value.getMaintenance_call_data());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetMaintenanceCallDataResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMaintenance_call_data() != null) {
                    MaintenanceCallData.ADAPTER.encodeWithTag(writer, 1, (int) value.getMaintenance_call_data());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMaintenanceCallDataResponse redact(GetMaintenanceCallDataResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MaintenanceCallData maintenance_call_data = value.getMaintenance_call_data();
                return value.copy(maintenance_call_data != null ? MaintenanceCallData.ADAPTER.redact(maintenance_call_data) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMaintenanceCallDataResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                MaintenanceCallData maintenanceCallDataDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetMaintenanceCallDataResponse(maintenanceCallDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        maintenanceCallDataDecode = MaintenanceCallData.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
