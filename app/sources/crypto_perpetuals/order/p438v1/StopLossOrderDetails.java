package crypto_perpetuals.order.p438v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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

/* compiled from: StopLossOrderDetails.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J&\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/StopLossOrderDetails;", "Lcom/squareup/wire/Message;", "", "base_order_details", "Lcrypto_perpetuals/order/v1/BaseOrderDetails;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/order/v1/BaseOrderDetails;Ljava/lang/String;Lokio/ByteString;)V", "getBase_order_details", "()Lcrypto_perpetuals/order/v1/BaseOrderDetails;", "getPrice", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StopLossOrderDetails extends Message {

    @JvmField
    public static final ProtoAdapter<StopLossOrderDetails> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.order.v1.BaseOrderDetails#ADAPTER", jsonName = "baseOrderDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BaseOrderDetails base_order_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String price;

    public StopLossOrderDetails() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27847newBuilder();
    }

    public final BaseOrderDetails getBase_order_details() {
        return this.base_order_details;
    }

    public final String getPrice() {
        return this.price;
    }

    public /* synthetic */ StopLossOrderDetails(BaseOrderDetails baseOrderDetails, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseOrderDetails, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopLossOrderDetails(BaseOrderDetails baseOrderDetails, String price, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.base_order_details = baseOrderDetails;
        this.price = price;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27847newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StopLossOrderDetails)) {
            return false;
        }
        StopLossOrderDetails stopLossOrderDetails = (StopLossOrderDetails) other;
        return Intrinsics.areEqual(unknownFields(), stopLossOrderDetails.unknownFields()) && Intrinsics.areEqual(this.base_order_details, stopLossOrderDetails.base_order_details) && Intrinsics.areEqual(this.price, stopLossOrderDetails.price);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BaseOrderDetails baseOrderDetails = this.base_order_details;
        int iHashCode2 = ((iHashCode + (baseOrderDetails != null ? baseOrderDetails.hashCode() : 0)) * 37) + this.price.hashCode();
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
        arrayList.add("price=" + Internal.sanitize(this.price));
        return CollectionsKt.joinToString$default(arrayList, ", ", "StopLossOrderDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StopLossOrderDetails copy$default(StopLossOrderDetails stopLossOrderDetails, BaseOrderDetails baseOrderDetails, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            baseOrderDetails = stopLossOrderDetails.base_order_details;
        }
        if ((i & 2) != 0) {
            str = stopLossOrderDetails.price;
        }
        if ((i & 4) != 0) {
            byteString = stopLossOrderDetails.unknownFields();
        }
        return stopLossOrderDetails.copy(baseOrderDetails, str, byteString);
    }

    public final StopLossOrderDetails copy(BaseOrderDetails base_order_details, String price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StopLossOrderDetails(base_order_details, price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StopLossOrderDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StopLossOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.order.v1.StopLossOrderDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StopLossOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBase_order_details() != null) {
                    size += BaseOrderDetails.ADAPTER.encodedSizeWithTag(1, value.getBase_order_details());
                }
                return !Intrinsics.areEqual(value.getPrice(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrice()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StopLossOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBase_order_details() != null) {
                    BaseOrderDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getBase_order_details());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrice());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StopLossOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrice());
                }
                if (value.getBase_order_details() != null) {
                    BaseOrderDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getBase_order_details());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StopLossOrderDetails redact(StopLossOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BaseOrderDetails base_order_details = value.getBase_order_details();
                return StopLossOrderDetails.copy$default(value, base_order_details != null ? BaseOrderDetails.ADAPTER.redact(base_order_details) : null, null, ByteString.EMPTY, 2, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StopLossOrderDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BaseOrderDetails baseOrderDetailsDecode = null;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StopLossOrderDetails(baseOrderDetailsDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        baseOrderDetailsDecode = BaseOrderDetails.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
