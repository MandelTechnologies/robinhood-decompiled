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

/* compiled from: ValidateOrderRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "order_info", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequest;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/CreateFuturesOrderRequest;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getOrder_info", "()Lcom/robinhood/ceres/v1/CreateFuturesOrderRequest;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ValidateOrderRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ValidateOrderRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.robinhood.ceres.v1.CreateFuturesOrderRequest#ADAPTER", jsonName = "orderInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CreateFuturesOrderRequest order_info;

    public ValidateOrderRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20452newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ ValidateOrderRequest(String str, CreateFuturesOrderRequest createFuturesOrderRequest, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : createFuturesOrderRequest, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final CreateFuturesOrderRequest getOrder_info() {
        return this.order_info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateOrderRequest(String account_id, CreateFuturesOrderRequest createFuturesOrderRequest, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.order_info = createFuturesOrderRequest;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20452newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidateOrderRequest)) {
            return false;
        }
        ValidateOrderRequest validateOrderRequest = (ValidateOrderRequest) other;
        return Intrinsics.areEqual(unknownFields(), validateOrderRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, validateOrderRequest.account_id) && Intrinsics.areEqual(this.order_info, validateOrderRequest.order_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37;
        CreateFuturesOrderRequest createFuturesOrderRequest = this.order_info;
        int iHashCode2 = iHashCode + (createFuturesOrderRequest != null ? createFuturesOrderRequest.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        CreateFuturesOrderRequest createFuturesOrderRequest = this.order_info;
        if (createFuturesOrderRequest != null) {
            arrayList.add("order_info=" + createFuturesOrderRequest);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateOrderRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValidateOrderRequest copy$default(ValidateOrderRequest validateOrderRequest, String str, CreateFuturesOrderRequest createFuturesOrderRequest, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateOrderRequest.account_id;
        }
        if ((i & 2) != 0) {
            createFuturesOrderRequest = validateOrderRequest.order_info;
        }
        if ((i & 4) != 0) {
            byteString = validateOrderRequest.unknownFields();
        }
        return validateOrderRequest.copy(str, createFuturesOrderRequest, byteString);
    }

    public final ValidateOrderRequest copy(String account_id, CreateFuturesOrderRequest order_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidateOrderRequest(account_id, order_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateOrderRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidateOrderRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.ValidateOrderRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidateOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                return value.getOrder_info() != null ? size + CreateFuturesOrderRequest.ADAPTER.encodedSizeWithTag(2, value.getOrder_info()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidateOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                if (value.getOrder_info() != null) {
                    CreateFuturesOrderRequest.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_info());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidateOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrder_info() != null) {
                    CreateFuturesOrderRequest.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_info());
                }
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderRequest redact(ValidateOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CreateFuturesOrderRequest order_info = value.getOrder_info();
                return ValidateOrderRequest.copy$default(value, null, order_info != null ? CreateFuturesOrderRequest.ADAPTER.redact(order_info) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                CreateFuturesOrderRequest createFuturesOrderRequestDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValidateOrderRequest(strDecode, createFuturesOrderRequestDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        createFuturesOrderRequestDecode = CreateFuturesOrderRequest.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
