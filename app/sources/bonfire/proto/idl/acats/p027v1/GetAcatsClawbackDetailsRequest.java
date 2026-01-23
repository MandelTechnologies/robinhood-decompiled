package bonfire.proto.idl.acats.p027v1;

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

/* compiled from: GetAcatsClawbackDetailsRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J9\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/GetAcatsClawbackDetailsRequest;", "Lcom/squareup/wire/Message;", "", "clawback_id", "", "account_number", "transfer_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lokio/ByteString;)V", "getClawback_id", "()Ljava/lang/String;", "getAccount_number", "getTransfer_amount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lokio/ByteString;)Lbonfire/proto/idl/acats/v1/GetAcatsClawbackDetailsRequest;", "Companion", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetAcatsClawbackDetailsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetAcatsClawbackDetailsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clawbackId", schemaIndex = 0, tag = 1)
    private final String clawback_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "transferAmount", schemaIndex = 2, tag = 3)
    private final Double transfer_amount;

    public GetAcatsClawbackDetailsRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8700newBuilder();
    }

    public final String getClawback_id() {
        return this.clawback_id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final Double getTransfer_amount() {
        return this.transfer_amount;
    }

    public /* synthetic */ GetAcatsClawbackDetailsRequest(String str, String str2, Double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAcatsClawbackDetailsRequest(String str, String str2, Double d, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.clawback_id = str;
        this.account_number = str2;
        this.transfer_amount = d;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8700newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAcatsClawbackDetailsRequest)) {
            return false;
        }
        GetAcatsClawbackDetailsRequest getAcatsClawbackDetailsRequest = (GetAcatsClawbackDetailsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getAcatsClawbackDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.clawback_id, getAcatsClawbackDetailsRequest.clawback_id) && Intrinsics.areEqual(this.account_number, getAcatsClawbackDetailsRequest.account_number) && Intrinsics.areEqual(this.transfer_amount, getAcatsClawbackDetailsRequest.transfer_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.clawback_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.account_number;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Double d = this.transfer_amount;
        int iHashCode4 = iHashCode3 + (d != null ? d.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.clawback_id;
        if (str != null) {
            arrayList.add("clawback_id=" + Internal.sanitize(str));
        }
        String str2 = this.account_number;
        if (str2 != null) {
            arrayList.add("account_number=" + Internal.sanitize(str2));
        }
        Double d = this.transfer_amount;
        if (d != null) {
            arrayList.add("transfer_amount=" + d);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAcatsClawbackDetailsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAcatsClawbackDetailsRequest copy$default(GetAcatsClawbackDetailsRequest getAcatsClawbackDetailsRequest, String str, String str2, Double d, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAcatsClawbackDetailsRequest.clawback_id;
        }
        if ((i & 2) != 0) {
            str2 = getAcatsClawbackDetailsRequest.account_number;
        }
        if ((i & 4) != 0) {
            d = getAcatsClawbackDetailsRequest.transfer_amount;
        }
        if ((i & 8) != 0) {
            byteString = getAcatsClawbackDetailsRequest.unknownFields();
        }
        return getAcatsClawbackDetailsRequest.copy(str, str2, d, byteString);
    }

    public final GetAcatsClawbackDetailsRequest copy(String clawback_id, String account_number, Double transfer_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAcatsClawbackDetailsRequest(clawback_id, account_number, transfer_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAcatsClawbackDetailsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAcatsClawbackDetailsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.acats.v1.GetAcatsClawbackDetailsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAcatsClawbackDetailsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getClawback_id()) + protoAdapter.encodedSizeWithTag(2, value.getAccount_number()) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, value.getTransfer_amount());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAcatsClawbackDetailsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getClawback_id());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount_number());
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) value.getTransfer_amount());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAcatsClawbackDetailsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) value.getTransfer_amount());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount_number());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getClawback_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAcatsClawbackDetailsRequest redact(GetAcatsClawbackDetailsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAcatsClawbackDetailsRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAcatsClawbackDetailsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                Double dDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAcatsClawbackDetailsRequest(strDecode, strDecode2, dDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        dDecode = ProtoAdapter.DOUBLE.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
