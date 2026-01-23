package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: EquitiesLimitOrderPayload.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016JD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayload;", "Lcom/squareup/wire/Message;", "", "side", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSide;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "", "quantity", "is_sell_all", "", "is_buy_all", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSide;Ljava/lang/String;Ljava/lang/String;ZZLokio/ByteString;)V", "getSide", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSide;", "getPrice", "()Ljava/lang/String;", "getQuantity", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class EquitiesLimitOrderPayload extends Message {

    @JvmField
    public static final ProtoAdapter<EquitiesLimitOrderPayload> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isBuyAll", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_buy_all;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSellAll", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_sell_all;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String quantity;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.EquitiesOrderSide#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EquitiesOrderSide side;

    public EquitiesLimitOrderPayload() {
        this(null, null, null, false, false, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8589newBuilder();
    }

    public final EquitiesOrderSide getSide() {
        return this.side;
    }

    public /* synthetic */ EquitiesLimitOrderPayload(EquitiesOrderSide equitiesOrderSide, String str, String str2, boolean z, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EquitiesOrderSide.EQUITIES_ORDER_SIDE_UNSPECIFIED : equitiesOrderSide, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    /* renamed from: is_sell_all, reason: from getter */
    public final boolean getIs_sell_all() {
        return this.is_sell_all;
    }

    /* renamed from: is_buy_all, reason: from getter */
    public final boolean getIs_buy_all() {
        return this.is_buy_all;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquitiesLimitOrderPayload(EquitiesOrderSide side, String price, String str, boolean z, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.side = side;
        this.price = price;
        this.quantity = str;
        this.is_sell_all = z;
        this.is_buy_all = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8589newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EquitiesLimitOrderPayload)) {
            return false;
        }
        EquitiesLimitOrderPayload equitiesLimitOrderPayload = (EquitiesLimitOrderPayload) other;
        return Intrinsics.areEqual(unknownFields(), equitiesLimitOrderPayload.unknownFields()) && this.side == equitiesLimitOrderPayload.side && Intrinsics.areEqual(this.price, equitiesLimitOrderPayload.price) && Intrinsics.areEqual(this.quantity, equitiesLimitOrderPayload.quantity) && this.is_sell_all == equitiesLimitOrderPayload.is_sell_all && this.is_buy_all == equitiesLimitOrderPayload.is_buy_all;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.side.hashCode()) * 37) + this.price.hashCode()) * 37;
        String str = this.quantity;
        int iHashCode2 = ((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_sell_all)) * 37) + Boolean.hashCode(this.is_buy_all);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("side=" + this.side);
        arrayList.add("price=" + Internal.sanitize(this.price));
        String str = this.quantity;
        if (str != null) {
            arrayList.add("quantity=" + Internal.sanitize(str));
        }
        arrayList.add("is_sell_all=" + this.is_sell_all);
        arrayList.add("is_buy_all=" + this.is_buy_all);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EquitiesLimitOrderPayload{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EquitiesLimitOrderPayload copy$default(EquitiesLimitOrderPayload equitiesLimitOrderPayload, EquitiesOrderSide equitiesOrderSide, String str, String str2, boolean z, boolean z2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            equitiesOrderSide = equitiesLimitOrderPayload.side;
        }
        if ((i & 2) != 0) {
            str = equitiesLimitOrderPayload.price;
        }
        if ((i & 4) != 0) {
            str2 = equitiesLimitOrderPayload.quantity;
        }
        if ((i & 8) != 0) {
            z = equitiesLimitOrderPayload.is_sell_all;
        }
        if ((i & 16) != 0) {
            z2 = equitiesLimitOrderPayload.is_buy_all;
        }
        if ((i & 32) != 0) {
            byteString = equitiesLimitOrderPayload.unknownFields();
        }
        boolean z3 = z2;
        ByteString byteString2 = byteString;
        return equitiesLimitOrderPayload.copy(equitiesOrderSide, str, str2, z, z3, byteString2);
    }

    public final EquitiesLimitOrderPayload copy(EquitiesOrderSide side, String price, String quantity, boolean is_sell_all, boolean is_buy_all, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EquitiesLimitOrderPayload(side, price, quantity, is_sell_all, is_buy_all, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquitiesLimitOrderPayload.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EquitiesLimitOrderPayload>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.EquitiesLimitOrderPayload$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EquitiesLimitOrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSide() != EquitiesOrderSide.EQUITIES_ORDER_SIDE_UNSPECIFIED) {
                    size += EquitiesOrderSide.ADAPTER.encodedSizeWithTag(1, value.getSide());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrice());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getQuantity());
                if (value.getIs_sell_all()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_sell_all()));
                }
                return value.getIs_buy_all() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_buy_all())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EquitiesLimitOrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSide() != EquitiesOrderSide.EQUITIES_ORDER_SIDE_UNSPECIFIED) {
                    EquitiesOrderSide.ADAPTER.encodeWithTag(writer, 1, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrice());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuantity());
                if (value.getIs_sell_all()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_sell_all()));
                }
                if (value.getIs_buy_all()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_buy_all()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EquitiesLimitOrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_buy_all()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_buy_all()));
                }
                if (value.getIs_sell_all()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_sell_all()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getQuantity());
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPrice());
                }
                if (value.getSide() != EquitiesOrderSide.EQUITIES_ORDER_SIDE_UNSPECIFIED) {
                    EquitiesOrderSide.ADAPTER.encodeWithTag(writer, 1, (int) value.getSide());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EquitiesLimitOrderPayload decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EquitiesOrderSide equitiesOrderSideDecode = EquitiesOrderSide.EQUITIES_ORDER_SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                String strDecode = null;
                String strDecode2 = "";
                while (true) {
                    EquitiesOrderSide equitiesOrderSide = equitiesOrderSideDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new EquitiesLimitOrderPayload(equitiesOrderSide, strDecode2, strDecode, zBooleanValue, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                equitiesOrderSideDecode = EquitiesOrderSide.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (iNextTag == 5) {
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EquitiesLimitOrderPayload redact(EquitiesLimitOrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EquitiesLimitOrderPayload.copy$default(value, null, null, null, false, false, ByteString.EMPTY, 31, null);
            }
        };
    }
}
