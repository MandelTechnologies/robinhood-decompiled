package crypto_perpetuals.order.p438v1;

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

/* compiled from: LimitOrderDetails.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J2\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/LimitOrderDetails;", "Lcom/squareup/wire/Message;", "", "base_order_details", "Lcrypto_perpetuals/order/v1/BaseOrderDetails;", "limit_price", "", "time_in_force", "Lcrypto_perpetuals/order/v1/TimeInForce;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/order/v1/BaseOrderDetails;Ljava/lang/String;Lcrypto_perpetuals/order/v1/TimeInForce;Lokio/ByteString;)V", "getBase_order_details", "()Lcrypto_perpetuals/order/v1/BaseOrderDetails;", "getLimit_price", "()Ljava/lang/String;", "getTime_in_force", "()Lcrypto_perpetuals/order/v1/TimeInForce;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LimitOrderDetails extends Message {

    @JvmField
    public static final ProtoAdapter<LimitOrderDetails> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.order.v1.BaseOrderDetails#ADAPTER", jsonName = "baseOrderDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BaseOrderDetails base_order_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String limit_price;

    @WireField(adapter = "crypto_perpetuals.order.v1.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TimeInForce time_in_force;

    public LimitOrderDetails() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27834newBuilder();
    }

    public final BaseOrderDetails getBase_order_details() {
        return this.base_order_details;
    }

    public final String getLimit_price() {
        return this.limit_price;
    }

    public /* synthetic */ LimitOrderDetails(BaseOrderDetails baseOrderDetails, String str, TimeInForce timeInForce, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseOrderDetails, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : timeInForce, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderDetails(BaseOrderDetails baseOrderDetails, String limit_price, TimeInForce timeInForce, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(limit_price, "limit_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.base_order_details = baseOrderDetails;
        this.limit_price = limit_price;
        this.time_in_force = timeInForce;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27834newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LimitOrderDetails)) {
            return false;
        }
        LimitOrderDetails limitOrderDetails = (LimitOrderDetails) other;
        return Intrinsics.areEqual(unknownFields(), limitOrderDetails.unknownFields()) && Intrinsics.areEqual(this.base_order_details, limitOrderDetails.base_order_details) && Intrinsics.areEqual(this.limit_price, limitOrderDetails.limit_price) && Intrinsics.areEqual(this.time_in_force, limitOrderDetails.time_in_force);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BaseOrderDetails baseOrderDetails = this.base_order_details;
        int iHashCode2 = (((iHashCode + (baseOrderDetails != null ? baseOrderDetails.hashCode() : 0)) * 37) + this.limit_price.hashCode()) * 37;
        TimeInForce timeInForce = this.time_in_force;
        int iHashCode3 = iHashCode2 + (timeInForce != null ? timeInForce.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        BaseOrderDetails baseOrderDetails = this.base_order_details;
        if (baseOrderDetails != null) {
            arrayList.add("base_order_details=" + baseOrderDetails);
        }
        arrayList.add("limit_price=" + Internal.sanitize(this.limit_price));
        TimeInForce timeInForce = this.time_in_force;
        if (timeInForce != null) {
            arrayList.add("time_in_force=" + timeInForce);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LimitOrderDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LimitOrderDetails copy$default(LimitOrderDetails limitOrderDetails, BaseOrderDetails baseOrderDetails, String str, TimeInForce timeInForce, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            baseOrderDetails = limitOrderDetails.base_order_details;
        }
        if ((i & 2) != 0) {
            str = limitOrderDetails.limit_price;
        }
        if ((i & 4) != 0) {
            timeInForce = limitOrderDetails.time_in_force;
        }
        if ((i & 8) != 0) {
            byteString = limitOrderDetails.unknownFields();
        }
        return limitOrderDetails.copy(baseOrderDetails, str, timeInForce, byteString);
    }

    public final LimitOrderDetails copy(BaseOrderDetails base_order_details, String limit_price, TimeInForce time_in_force, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(limit_price, "limit_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LimitOrderDetails(base_order_details, limit_price, time_in_force, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LimitOrderDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LimitOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.order.v1.LimitOrderDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LimitOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBase_order_details() != null) {
                    size += BaseOrderDetails.ADAPTER.encodedSizeWithTag(1, value.getBase_order_details());
                }
                if (!Intrinsics.areEqual(value.getLimit_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLimit_price());
                }
                return value.getTime_in_force() != null ? size + TimeInForce.ADAPTER.encodedSizeWithTag(3, value.getTime_in_force()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LimitOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBase_order_details() != null) {
                    BaseOrderDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getBase_order_details());
                }
                if (!Intrinsics.areEqual(value.getLimit_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLimit_price());
                }
                if (value.getTime_in_force() != null) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 3, (int) value.getTime_in_force());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LimitOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTime_in_force() != null) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 3, (int) value.getTime_in_force());
                }
                if (!Intrinsics.areEqual(value.getLimit_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLimit_price());
                }
                if (value.getBase_order_details() != null) {
                    BaseOrderDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getBase_order_details());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LimitOrderDetails redact(LimitOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BaseOrderDetails base_order_details = value.getBase_order_details();
                BaseOrderDetails baseOrderDetailsRedact = base_order_details != null ? BaseOrderDetails.ADAPTER.redact(base_order_details) : null;
                TimeInForce time_in_force = value.getTime_in_force();
                return LimitOrderDetails.copy$default(value, baseOrderDetailsRedact, null, time_in_force != null ? TimeInForce.ADAPTER.redact(time_in_force) : null, ByteString.EMPTY, 2, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LimitOrderDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BaseOrderDetails baseOrderDetailsDecode = null;
                String strDecode = "";
                TimeInForce timeInForceDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LimitOrderDetails(baseOrderDetailsDecode, strDecode, timeInForceDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        baseOrderDetailsDecode = BaseOrderDetails.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
