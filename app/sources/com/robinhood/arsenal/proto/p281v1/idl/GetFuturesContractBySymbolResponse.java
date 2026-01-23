package com.robinhood.arsenal.proto.p281v1.idl;

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

/* compiled from: GetFuturesContractBySymbolResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolResponse;", "Lcom/squareup/wire/Message;", "", "result", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContract;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/FuturesContract;Lokio/ByteString;)V", "getResult", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesContract;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class GetFuturesContractBySymbolResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetFuturesContractBySymbolResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.FuturesContract#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FuturesContract result;

    /* JADX WARN: Multi-variable type inference failed */
    public GetFuturesContractBySymbolResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20156newBuilder();
    }

    public final FuturesContract getResult() {
        return this.result;
    }

    public /* synthetic */ GetFuturesContractBySymbolResponse(FuturesContract futuresContract, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : futuresContract, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFuturesContractBySymbolResponse(FuturesContract futuresContract, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.result = futuresContract;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20156newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFuturesContractBySymbolResponse)) {
            return false;
        }
        GetFuturesContractBySymbolResponse getFuturesContractBySymbolResponse = (GetFuturesContractBySymbolResponse) other;
        return Intrinsics.areEqual(unknownFields(), getFuturesContractBySymbolResponse.unknownFields()) && Intrinsics.areEqual(this.result, getFuturesContractBySymbolResponse.result);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FuturesContract futuresContract = this.result;
        int iHashCode2 = iHashCode + (futuresContract != null ? futuresContract.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FuturesContract futuresContract = this.result;
        if (futuresContract != null) {
            arrayList.add("result=" + futuresContract);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFuturesContractBySymbolResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFuturesContractBySymbolResponse copy$default(GetFuturesContractBySymbolResponse getFuturesContractBySymbolResponse, FuturesContract futuresContract, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresContract = getFuturesContractBySymbolResponse.result;
        }
        if ((i & 2) != 0) {
            byteString = getFuturesContractBySymbolResponse.unknownFields();
        }
        return getFuturesContractBySymbolResponse.copy(futuresContract, byteString);
    }

    public final GetFuturesContractBySymbolResponse copy(FuturesContract result, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFuturesContractBySymbolResponse(result, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFuturesContractBySymbolResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFuturesContractBySymbolResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.GetFuturesContractBySymbolResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFuturesContractBySymbolResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getResult() != null ? size + FuturesContract.ADAPTER.encodedSizeWithTag(1, value.getResult()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFuturesContractBySymbolResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getResult() != null) {
                    FuturesContract.ADAPTER.encodeWithTag(writer, 1, (int) value.getResult());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFuturesContractBySymbolResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getResult() != null) {
                    FuturesContract.ADAPTER.encodeWithTag(writer, 1, (int) value.getResult());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesContractBySymbolResponse redact(GetFuturesContractBySymbolResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FuturesContract result = value.getResult();
                return value.copy(result != null ? FuturesContract.ADAPTER.redact(result) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesContractBySymbolResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FuturesContract futuresContractDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetFuturesContractBySymbolResponse(futuresContractDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        futuresContractDecode = FuturesContract.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
