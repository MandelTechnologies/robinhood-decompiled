package com.robinhood.copilot.proto.p286v1;

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

/* compiled from: GetAccountStatusInternalResponse.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetAccountStatusInternalResponse;", "Lcom/squareup/wire/Message;", "", "is_gold", "", "is_digest_agreement_signed", "is_crypto_digest_agreement_signed", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZZLokio/ByteString;)V", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetAccountStatusInternalResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountStatusInternalResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_crypto_digest_agreement_signed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_digest_agreement_signed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_gold;

    public GetAccountStatusInternalResponse() {
        this(false, false, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22106newBuilder();
    }

    /* renamed from: is_gold, reason: from getter */
    public final boolean getIs_gold() {
        return this.is_gold;
    }

    /* renamed from: is_digest_agreement_signed, reason: from getter */
    public final boolean getIs_digest_agreement_signed() {
        return this.is_digest_agreement_signed;
    }

    /* renamed from: is_crypto_digest_agreement_signed, reason: from getter */
    public final boolean getIs_crypto_digest_agreement_signed() {
        return this.is_crypto_digest_agreement_signed;
    }

    public /* synthetic */ GetAccountStatusInternalResponse(boolean z, boolean z2, boolean z3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountStatusInternalResponse(boolean z, boolean z2, boolean z3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_gold = z;
        this.is_digest_agreement_signed = z2;
        this.is_crypto_digest_agreement_signed = z3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22106newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountStatusInternalResponse)) {
            return false;
        }
        GetAccountStatusInternalResponse getAccountStatusInternalResponse = (GetAccountStatusInternalResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAccountStatusInternalResponse.unknownFields()) && this.is_gold == getAccountStatusInternalResponse.is_gold && this.is_digest_agreement_signed == getAccountStatusInternalResponse.is_digest_agreement_signed && this.is_crypto_digest_agreement_signed == getAccountStatusInternalResponse.is_crypto_digest_agreement_signed;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_gold)) * 37) + Boolean.hashCode(this.is_digest_agreement_signed)) * 37) + Boolean.hashCode(this.is_crypto_digest_agreement_signed);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_gold=" + this.is_gold);
        arrayList.add("is_digest_agreement_signed=" + this.is_digest_agreement_signed);
        arrayList.add("is_crypto_digest_agreement_signed=" + this.is_crypto_digest_agreement_signed);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountStatusInternalResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAccountStatusInternalResponse copy$default(GetAccountStatusInternalResponse getAccountStatusInternalResponse, boolean z, boolean z2, boolean z3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getAccountStatusInternalResponse.is_gold;
        }
        if ((i & 2) != 0) {
            z2 = getAccountStatusInternalResponse.is_digest_agreement_signed;
        }
        if ((i & 4) != 0) {
            z3 = getAccountStatusInternalResponse.is_crypto_digest_agreement_signed;
        }
        if ((i & 8) != 0) {
            byteString = getAccountStatusInternalResponse.unknownFields();
        }
        return getAccountStatusInternalResponse.copy(z, z2, z3, byteString);
    }

    public final GetAccountStatusInternalResponse copy(boolean is_gold, boolean is_digest_agreement_signed, boolean is_crypto_digest_agreement_signed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountStatusInternalResponse(is_gold, is_digest_agreement_signed, is_crypto_digest_agreement_signed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountStatusInternalResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountStatusInternalResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetAccountStatusInternalResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountStatusInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_gold()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_gold()));
                }
                if (value.getIs_digest_agreement_signed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_digest_agreement_signed()));
                }
                return value.getIs_crypto_digest_agreement_signed() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_crypto_digest_agreement_signed())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountStatusInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_gold()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_gold()));
                }
                if (value.getIs_digest_agreement_signed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_digest_agreement_signed()));
                }
                if (value.getIs_crypto_digest_agreement_signed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_crypto_digest_agreement_signed()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountStatusInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_crypto_digest_agreement_signed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_crypto_digest_agreement_signed()));
                }
                if (value.getIs_digest_agreement_signed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_digest_agreement_signed()));
                }
                if (value.getIs_gold()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_gold()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountStatusInternalResponse redact(GetAccountStatusInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAccountStatusInternalResponse.copy$default(value, false, false, false, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountStatusInternalResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAccountStatusInternalResponse(zBooleanValue, zBooleanValue2, zBooleanValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
