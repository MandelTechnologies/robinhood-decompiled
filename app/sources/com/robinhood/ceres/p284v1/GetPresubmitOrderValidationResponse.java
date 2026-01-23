package com.robinhood.ceres.p284v1;

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

/* compiled from: GetPresubmitOrderValidationResponse.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationResponse;", "Lcom/squareup/wire/Message;", "", "global_max_order_quantity", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getGlobal_max_order_quantity", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetPresubmitOrderValidationResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetPresubmitOrderValidationResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "globalMaxOrderQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String global_max_order_quantity;

    /* JADX WARN: Multi-variable type inference failed */
    public GetPresubmitOrderValidationResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20378newBuilder();
    }

    public final String getGlobal_max_order_quantity() {
        return this.global_max_order_quantity;
    }

    public /* synthetic */ GetPresubmitOrderValidationResponse(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPresubmitOrderValidationResponse(String global_max_order_quantity, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(global_max_order_quantity, "global_max_order_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.global_max_order_quantity = global_max_order_quantity;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20378newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetPresubmitOrderValidationResponse)) {
            return false;
        }
        GetPresubmitOrderValidationResponse getPresubmitOrderValidationResponse = (GetPresubmitOrderValidationResponse) other;
        return Intrinsics.areEqual(unknownFields(), getPresubmitOrderValidationResponse.unknownFields()) && Intrinsics.areEqual(this.global_max_order_quantity, getPresubmitOrderValidationResponse.global_max_order_quantity);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.global_max_order_quantity.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("global_max_order_quantity=" + Internal.sanitize(this.global_max_order_quantity));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPresubmitOrderValidationResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetPresubmitOrderValidationResponse copy$default(GetPresubmitOrderValidationResponse getPresubmitOrderValidationResponse, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPresubmitOrderValidationResponse.global_max_order_quantity;
        }
        if ((i & 2) != 0) {
            byteString = getPresubmitOrderValidationResponse.unknownFields();
        }
        return getPresubmitOrderValidationResponse.copy(str, byteString);
    }

    public final GetPresubmitOrderValidationResponse copy(String global_max_order_quantity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(global_max_order_quantity, "global_max_order_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetPresubmitOrderValidationResponse(global_max_order_quantity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetPresubmitOrderValidationResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetPresubmitOrderValidationResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetPresubmitOrderValidationResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetPresubmitOrderValidationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return !Intrinsics.areEqual(value.getGlobal_max_order_quantity(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getGlobal_max_order_quantity()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetPresubmitOrderValidationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getGlobal_max_order_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getGlobal_max_order_quantity());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetPresubmitOrderValidationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (Intrinsics.areEqual(value.getGlobal_max_order_quantity(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getGlobal_max_order_quantity());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPresubmitOrderValidationResponse redact(GetPresubmitOrderValidationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetPresubmitOrderValidationResponse.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetPresubmitOrderValidationResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetPresubmitOrderValidationResponse(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
