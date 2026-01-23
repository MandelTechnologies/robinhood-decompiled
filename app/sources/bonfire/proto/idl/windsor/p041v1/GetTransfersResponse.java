package bonfire.proto.idl.windsor.p041v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetTransfersResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB?\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016J>\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetTransfersResponse;", "Lcom/squareup/wire/Message;", "", "transfers", "", "Lbonfire/proto/idl/windsor/v1/Transfer;", "next_cursor", "", "has_more", "", "previous_cursor", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lokio/ByteString;)V", "getNext_cursor", "()Ljava/lang/String;", "getHas_more", "()Z", "getPrevious_cursor", "getTransfers", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetTransfersResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetTransfersResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasMore", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean has_more;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nextCursor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String next_cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previousCursor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String previous_cursor;

    @WireField(adapter = "bonfire.proto.idl.windsor.v1.Transfer#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Transfer> transfers;

    public GetTransfersResponse() {
        this(null, null, false, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9063newBuilder();
    }

    public /* synthetic */ GetTransfersResponse(List list, String str, boolean z, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public final String getPrevious_cursor() {
        return this.previous_cursor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTransfersResponse(List<Transfer> transfers, String next_cursor, boolean z, String previous_cursor, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(transfers, "transfers");
        Intrinsics.checkNotNullParameter(next_cursor, "next_cursor");
        Intrinsics.checkNotNullParameter(previous_cursor, "previous_cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next_cursor = next_cursor;
        this.has_more = z;
        this.previous_cursor = previous_cursor;
        this.transfers = Internal.immutableCopyOf("transfers", transfers);
    }

    public final List<Transfer> getTransfers() {
        return this.transfers;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9063newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTransfersResponse)) {
            return false;
        }
        GetTransfersResponse getTransfersResponse = (GetTransfersResponse) other;
        return Intrinsics.areEqual(unknownFields(), getTransfersResponse.unknownFields()) && Intrinsics.areEqual(this.transfers, getTransfersResponse.transfers) && Intrinsics.areEqual(this.next_cursor, getTransfersResponse.next_cursor) && this.has_more == getTransfersResponse.has_more && Intrinsics.areEqual(this.previous_cursor, getTransfersResponse.previous_cursor);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.transfers.hashCode()) * 37) + this.next_cursor.hashCode()) * 37) + Boolean.hashCode(this.has_more)) * 37) + this.previous_cursor.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.transfers.isEmpty()) {
            arrayList.add("transfers=" + this.transfers);
        }
        arrayList.add("next_cursor=" + Internal.sanitize(this.next_cursor));
        arrayList.add("has_more=" + this.has_more);
        arrayList.add("previous_cursor=" + Internal.sanitize(this.previous_cursor));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTransfersResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetTransfersResponse copy$default(GetTransfersResponse getTransfersResponse, List list, String str, boolean z, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getTransfersResponse.transfers;
        }
        if ((i & 2) != 0) {
            str = getTransfersResponse.next_cursor;
        }
        if ((i & 4) != 0) {
            z = getTransfersResponse.has_more;
        }
        if ((i & 8) != 0) {
            str2 = getTransfersResponse.previous_cursor;
        }
        if ((i & 16) != 0) {
            byteString = getTransfersResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z2 = z;
        return getTransfersResponse.copy(list, str, z2, str2, byteString2);
    }

    public final GetTransfersResponse copy(List<Transfer> transfers, String next_cursor, boolean has_more, String previous_cursor, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(transfers, "transfers");
        Intrinsics.checkNotNullParameter(next_cursor, "next_cursor");
        Intrinsics.checkNotNullParameter(previous_cursor, "previous_cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTransfersResponse(transfers, next_cursor, has_more, previous_cursor, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTransfersResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTransfersResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.windsor.v1.GetTransfersResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTransfersResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + Transfer.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getTransfers());
                if (!Intrinsics.areEqual(value.getNext_cursor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNext_cursor());
                }
                if (value.getHas_more()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getHas_more()));
                }
                return !Intrinsics.areEqual(value.getPrevious_cursor(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPrevious_cursor()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTransfersResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Transfer.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getTransfers());
                if (!Intrinsics.areEqual(value.getNext_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext_cursor());
                }
                if (value.getHas_more()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getHas_more()));
                }
                if (!Intrinsics.areEqual(value.getPrevious_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrevious_cursor());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTransfersResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrevious_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrevious_cursor());
                }
                if (value.getHas_more()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getHas_more()));
                }
                if (!Intrinsics.areEqual(value.getNext_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext_cursor());
                }
                Transfer.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getTransfers());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTransfersResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTransfersResponse(arrayList, strDecode, zBooleanValue, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(Transfer.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTransfersResponse redact(GetTransfersResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetTransfersResponse.copy$default(value, Internal.m26823redactElements(value.getTransfers(), Transfer.ADAPTER), null, false, null, ByteString.EMPTY, 14, null);
            }
        };
    }
}
