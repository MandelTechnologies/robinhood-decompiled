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

/* compiled from: GetRealizedPnlForOrdersResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersResponse;", "Lcom/squareup/wire/Message;", "", "realized_pnl_for_orders", "", "Lcom/robinhood/ceres/v1/RealizedPnlForOrder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getRealized_pnl_for_orders", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetRealizedPnlForOrdersResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetRealizedPnlForOrdersResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.RealizedPnlForOrder#ADAPTER", jsonName = "realizedPnlForOrders", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<RealizedPnlForOrder> realized_pnl_for_orders;

    /* JADX WARN: Multi-variable type inference failed */
    public GetRealizedPnlForOrdersResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20380newBuilder();
    }

    public /* synthetic */ GetRealizedPnlForOrdersResponse(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRealizedPnlForOrdersResponse(List<RealizedPnlForOrder> realized_pnl_for_orders, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(realized_pnl_for_orders, "realized_pnl_for_orders");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.realized_pnl_for_orders = Internal.immutableCopyOf("realized_pnl_for_orders", realized_pnl_for_orders);
    }

    public final List<RealizedPnlForOrder> getRealized_pnl_for_orders() {
        return this.realized_pnl_for_orders;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20380newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRealizedPnlForOrdersResponse)) {
            return false;
        }
        GetRealizedPnlForOrdersResponse getRealizedPnlForOrdersResponse = (GetRealizedPnlForOrdersResponse) other;
        return Intrinsics.areEqual(unknownFields(), getRealizedPnlForOrdersResponse.unknownFields()) && Intrinsics.areEqual(this.realized_pnl_for_orders, getRealizedPnlForOrdersResponse.realized_pnl_for_orders);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.realized_pnl_for_orders.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.realized_pnl_for_orders.isEmpty()) {
            arrayList.add("realized_pnl_for_orders=" + this.realized_pnl_for_orders);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRealizedPnlForOrdersResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetRealizedPnlForOrdersResponse copy$default(GetRealizedPnlForOrdersResponse getRealizedPnlForOrdersResponse, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getRealizedPnlForOrdersResponse.realized_pnl_for_orders;
        }
        if ((i & 2) != 0) {
            byteString = getRealizedPnlForOrdersResponse.unknownFields();
        }
        return getRealizedPnlForOrdersResponse.copy(list, byteString);
    }

    public final GetRealizedPnlForOrdersResponse copy(List<RealizedPnlForOrder> realized_pnl_for_orders, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(realized_pnl_for_orders, "realized_pnl_for_orders");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRealizedPnlForOrdersResponse(realized_pnl_for_orders, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRealizedPnlForOrdersResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRealizedPnlForOrdersResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetRealizedPnlForOrdersResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRealizedPnlForOrdersResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + RealizedPnlForOrder.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getRealized_pnl_for_orders());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRealizedPnlForOrdersResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                RealizedPnlForOrder.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRealized_pnl_for_orders());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRealizedPnlForOrdersResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                RealizedPnlForOrder.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRealized_pnl_for_orders());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedPnlForOrdersResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetRealizedPnlForOrdersResponse(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(RealizedPnlForOrder.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedPnlForOrdersResponse redact(GetRealizedPnlForOrdersResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy(Internal.m26823redactElements(value.getRealized_pnl_for_orders(), RealizedPnlForOrder.ADAPTER), ByteString.EMPTY);
            }
        };
    }
}
