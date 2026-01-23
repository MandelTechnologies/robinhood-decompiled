package com.robinhood.prediction_markets.proto.p361v1.combo;

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

/* compiled from: GetComboProposalsRequest.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsRequest;", "Lcom/squareup/wire/Message;", "", "rfq_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getRfq_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GetComboProposalsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetComboProposalsRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rfqId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String rfq_id;

    /* JADX WARN: Multi-variable type inference failed */
    public GetComboProposalsRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23760newBuilder();
    }

    public final String getRfq_id() {
        return this.rfq_id;
    }

    public /* synthetic */ GetComboProposalsRequest(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetComboProposalsRequest(String rfq_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rfq_id, "rfq_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rfq_id = rfq_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23760newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetComboProposalsRequest)) {
            return false;
        }
        GetComboProposalsRequest getComboProposalsRequest = (GetComboProposalsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getComboProposalsRequest.unknownFields()) && Intrinsics.areEqual(this.rfq_id, getComboProposalsRequest.rfq_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.rfq_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rfq_id=" + Internal.sanitize(this.rfq_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetComboProposalsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetComboProposalsRequest copy$default(GetComboProposalsRequest getComboProposalsRequest, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getComboProposalsRequest.rfq_id;
        }
        if ((i & 2) != 0) {
            byteString = getComboProposalsRequest.unknownFields();
        }
        return getComboProposalsRequest.copy(str, byteString);
    }

    public final GetComboProposalsRequest copy(String rfq_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rfq_id, "rfq_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetComboProposalsRequest(rfq_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetComboProposalsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetComboProposalsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.combo.GetComboProposalsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetComboProposalsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return !Intrinsics.areEqual(value.getRfq_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRfq_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetComboProposalsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRfq_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRfq_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetComboProposalsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (Intrinsics.areEqual(value.getRfq_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRfq_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetComboProposalsRequest redact(GetComboProposalsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetComboProposalsRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetComboProposalsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetComboProposalsRequest(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
