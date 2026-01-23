package crypto_perpetuals.order.p438v1;

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

/* compiled from: MarketOrderDetails.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarketOrderDetails;", "Lcom/squareup/wire/Message;", "", "base_order_details", "Lcrypto_perpetuals/order/v1/BaseOrderDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/order/v1/BaseOrderDetails;Lokio/ByteString;)V", "getBase_order_details", "()Lcrypto_perpetuals/order/v1/BaseOrderDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MarketOrderDetails extends Message {

    @JvmField
    public static final ProtoAdapter<MarketOrderDetails> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.order.v1.BaseOrderDetails#ADAPTER", jsonName = "baseOrderDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BaseOrderDetails base_order_details;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketOrderDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27841newBuilder();
    }

    public final BaseOrderDetails getBase_order_details() {
        return this.base_order_details;
    }

    public /* synthetic */ MarketOrderDetails(BaseOrderDetails baseOrderDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseOrderDetails, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketOrderDetails(BaseOrderDetails baseOrderDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.base_order_details = baseOrderDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27841newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarketOrderDetails)) {
            return false;
        }
        MarketOrderDetails marketOrderDetails = (MarketOrderDetails) other;
        return Intrinsics.areEqual(unknownFields(), marketOrderDetails.unknownFields()) && Intrinsics.areEqual(this.base_order_details, marketOrderDetails.base_order_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BaseOrderDetails baseOrderDetails = this.base_order_details;
        int iHashCode2 = iHashCode + (baseOrderDetails != null ? baseOrderDetails.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        BaseOrderDetails baseOrderDetails = this.base_order_details;
        if (baseOrderDetails != null) {
            arrayList.add("base_order_details=" + baseOrderDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketOrderDetails{", "}", 0, null, null, 56, null);
    }

    public final MarketOrderDetails copy(BaseOrderDetails base_order_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarketOrderDetails(base_order_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarketOrderDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarketOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.order.v1.MarketOrderDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarketOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getBase_order_details() != null ? size + BaseOrderDetails.ADAPTER.encodedSizeWithTag(1, value.getBase_order_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarketOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBase_order_details() != null) {
                    BaseOrderDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getBase_order_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarketOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBase_order_details() != null) {
                    BaseOrderDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getBase_order_details());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarketOrderDetails redact(MarketOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BaseOrderDetails base_order_details = value.getBase_order_details();
                return value.copy(base_order_details != null ? BaseOrderDetails.ADAPTER.redact(base_order_details) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarketOrderDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BaseOrderDetails baseOrderDetailsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarketOrderDetails(baseOrderDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        baseOrderDetailsDecode = BaseOrderDetails.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
