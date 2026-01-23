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

/* compiled from: GetBuyingPowerEffectRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetBuyingPowerEffectRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "tentative_futures_order", "Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequest;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequest;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getTentative_futures_order", "()Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequest;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetBuyingPowerEffectRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetBuyingPowerEffectRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.robinhood.ceres.v1.TentativeFuturesOrderRequest#ADAPTER", jsonName = "tentativeFuturesOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TentativeFuturesOrderRequest tentative_futures_order;

    public GetBuyingPowerEffectRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20336newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ GetBuyingPowerEffectRequest(String str, TentativeFuturesOrderRequest tentativeFuturesOrderRequest, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : tentativeFuturesOrderRequest, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TentativeFuturesOrderRequest getTentative_futures_order() {
        return this.tentative_futures_order;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBuyingPowerEffectRequest(String account_id, TentativeFuturesOrderRequest tentativeFuturesOrderRequest, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.tentative_futures_order = tentativeFuturesOrderRequest;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20336newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetBuyingPowerEffectRequest)) {
            return false;
        }
        GetBuyingPowerEffectRequest getBuyingPowerEffectRequest = (GetBuyingPowerEffectRequest) other;
        return Intrinsics.areEqual(unknownFields(), getBuyingPowerEffectRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getBuyingPowerEffectRequest.account_id) && Intrinsics.areEqual(this.tentative_futures_order, getBuyingPowerEffectRequest.tentative_futures_order);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37;
        TentativeFuturesOrderRequest tentativeFuturesOrderRequest = this.tentative_futures_order;
        int iHashCode2 = iHashCode + (tentativeFuturesOrderRequest != null ? tentativeFuturesOrderRequest.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        TentativeFuturesOrderRequest tentativeFuturesOrderRequest = this.tentative_futures_order;
        if (tentativeFuturesOrderRequest != null) {
            arrayList.add("tentative_futures_order=" + tentativeFuturesOrderRequest);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBuyingPowerEffectRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetBuyingPowerEffectRequest copy$default(GetBuyingPowerEffectRequest getBuyingPowerEffectRequest, String str, TentativeFuturesOrderRequest tentativeFuturesOrderRequest, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getBuyingPowerEffectRequest.account_id;
        }
        if ((i & 2) != 0) {
            tentativeFuturesOrderRequest = getBuyingPowerEffectRequest.tentative_futures_order;
        }
        if ((i & 4) != 0) {
            byteString = getBuyingPowerEffectRequest.unknownFields();
        }
        return getBuyingPowerEffectRequest.copy(str, tentativeFuturesOrderRequest, byteString);
    }

    public final GetBuyingPowerEffectRequest copy(String account_id, TentativeFuturesOrderRequest tentative_futures_order, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetBuyingPowerEffectRequest(account_id, tentative_futures_order, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetBuyingPowerEffectRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetBuyingPowerEffectRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetBuyingPowerEffectRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetBuyingPowerEffectRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                return value.getTentative_futures_order() != null ? size + TentativeFuturesOrderRequest.ADAPTER.encodedSizeWithTag(2, value.getTentative_futures_order()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetBuyingPowerEffectRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                if (value.getTentative_futures_order() != null) {
                    TentativeFuturesOrderRequest.ADAPTER.encodeWithTag(writer, 2, (int) value.getTentative_futures_order());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetBuyingPowerEffectRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTentative_futures_order() != null) {
                    TentativeFuturesOrderRequest.ADAPTER.encodeWithTag(writer, 2, (int) value.getTentative_futures_order());
                }
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetBuyingPowerEffectRequest redact(GetBuyingPowerEffectRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TentativeFuturesOrderRequest tentative_futures_order = value.getTentative_futures_order();
                return GetBuyingPowerEffectRequest.copy$default(value, null, tentative_futures_order != null ? TentativeFuturesOrderRequest.ADAPTER.redact(tentative_futures_order) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetBuyingPowerEffectRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                TentativeFuturesOrderRequest tentativeFuturesOrderRequestDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetBuyingPowerEffectRequest(strDecode, tentativeFuturesOrderRequestDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        tentativeFuturesOrderRequestDecode = TentativeFuturesOrderRequest.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
