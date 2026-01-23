package contracts.crypto.trade.proto.p431v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import contracts.crypto.trade.proto.p431v1.TokenizationFxFee;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.nummus.order.Side;

/* compiled from: TokenizationFxFee.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFee;", "Lcom/squareup/wire/Message;", "", "exchange_rate", "", "exchange_fee_percentage", "primary_currency_code", "secondary_currency_code", "touchpoint", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint;", "order_side", "Lrosetta/nummus/order/Side;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint;Lrosetta/nummus/order/Side;Lokio/ByteString;)V", "getExchange_rate", "()Ljava/lang/String;", "getExchange_fee_percentage", "getPrimary_currency_code", "getSecondary_currency_code", "getTouchpoint", "()Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint;", "getOrder_side", "()Lrosetta/nummus/order/Side;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "TouchPoint", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TokenizationFxFee extends Message {

    @JvmField
    public static final ProtoAdapter<TokenizationFxFee> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exchangeFeePercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String exchange_fee_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exchangeRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String exchange_rate;

    @WireField(adapter = "rosetta.nummus.order.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Side order_side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String secondary_currency_code;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.TokenizationFxFee$TouchPoint#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final TouchPoint touchpoint;

    public TokenizationFxFee() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ TokenizationFxFee(String str, String str2, String str3, String str4, TouchPoint touchPoint, Side side, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? TouchPoint.TOUCHPOINT_UNSPECIFIED : touchPoint, (i & 32) != 0 ? Side.SIDE__UNSPECIFIED : side, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27713newBuilder();
    }

    public final String getExchange_rate() {
        return this.exchange_rate;
    }

    public final String getExchange_fee_percentage() {
        return this.exchange_fee_percentage;
    }

    public final String getPrimary_currency_code() {
        return this.primary_currency_code;
    }

    public final String getSecondary_currency_code() {
        return this.secondary_currency_code;
    }

    public final TouchPoint getTouchpoint() {
        return this.touchpoint;
    }

    public final Side getOrder_side() {
        return this.order_side;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenizationFxFee(String exchange_rate, String exchange_fee_percentage, String primary_currency_code, String secondary_currency_code, TouchPoint touchpoint, Side order_side, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
        Intrinsics.checkNotNullParameter(exchange_fee_percentage, "exchange_fee_percentage");
        Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
        Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
        Intrinsics.checkNotNullParameter(touchpoint, "touchpoint");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.exchange_rate = exchange_rate;
        this.exchange_fee_percentage = exchange_fee_percentage;
        this.primary_currency_code = primary_currency_code;
        this.secondary_currency_code = secondary_currency_code;
        this.touchpoint = touchpoint;
        this.order_side = order_side;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27713newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TokenizationFxFee)) {
            return false;
        }
        TokenizationFxFee tokenizationFxFee = (TokenizationFxFee) other;
        return Intrinsics.areEqual(unknownFields(), tokenizationFxFee.unknownFields()) && Intrinsics.areEqual(this.exchange_rate, tokenizationFxFee.exchange_rate) && Intrinsics.areEqual(this.exchange_fee_percentage, tokenizationFxFee.exchange_fee_percentage) && Intrinsics.areEqual(this.primary_currency_code, tokenizationFxFee.primary_currency_code) && Intrinsics.areEqual(this.secondary_currency_code, tokenizationFxFee.secondary_currency_code) && this.touchpoint == tokenizationFxFee.touchpoint && this.order_side == tokenizationFxFee.order_side;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.exchange_rate.hashCode()) * 37) + this.exchange_fee_percentage.hashCode()) * 37) + this.primary_currency_code.hashCode()) * 37) + this.secondary_currency_code.hashCode()) * 37) + this.touchpoint.hashCode()) * 37) + this.order_side.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("exchange_rate=" + Internal.sanitize(this.exchange_rate));
        arrayList.add("exchange_fee_percentage=" + Internal.sanitize(this.exchange_fee_percentage));
        arrayList.add("primary_currency_code=" + Internal.sanitize(this.primary_currency_code));
        arrayList.add("secondary_currency_code=" + Internal.sanitize(this.secondary_currency_code));
        arrayList.add("touchpoint=" + this.touchpoint);
        arrayList.add("order_side=" + this.order_side);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TokenizationFxFee{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TokenizationFxFee copy$default(TokenizationFxFee tokenizationFxFee, String str, String str2, String str3, String str4, TouchPoint touchPoint, Side side, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenizationFxFee.exchange_rate;
        }
        if ((i & 2) != 0) {
            str2 = tokenizationFxFee.exchange_fee_percentage;
        }
        if ((i & 4) != 0) {
            str3 = tokenizationFxFee.primary_currency_code;
        }
        if ((i & 8) != 0) {
            str4 = tokenizationFxFee.secondary_currency_code;
        }
        if ((i & 16) != 0) {
            touchPoint = tokenizationFxFee.touchpoint;
        }
        if ((i & 32) != 0) {
            side = tokenizationFxFee.order_side;
        }
        if ((i & 64) != 0) {
            byteString = tokenizationFxFee.unknownFields();
        }
        Side side2 = side;
        ByteString byteString2 = byteString;
        TouchPoint touchPoint2 = touchPoint;
        String str5 = str3;
        return tokenizationFxFee.copy(str, str2, str5, str4, touchPoint2, side2, byteString2);
    }

    public final TokenizationFxFee copy(String exchange_rate, String exchange_fee_percentage, String primary_currency_code, String secondary_currency_code, TouchPoint touchpoint, Side order_side, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
        Intrinsics.checkNotNullParameter(exchange_fee_percentage, "exchange_fee_percentage");
        Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
        Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
        Intrinsics.checkNotNullParameter(touchpoint, "touchpoint");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TokenizationFxFee(exchange_rate, exchange_fee_percentage, primary_currency_code, secondary_currency_code, touchpoint, order_side, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenizationFxFee.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TokenizationFxFee>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.TokenizationFxFee$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TokenizationFxFee value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getExchange_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getExchange_rate());
                }
                if (!Intrinsics.areEqual(value.getExchange_fee_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getExchange_fee_percentage());
                }
                if (!Intrinsics.areEqual(value.getPrimary_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrimary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getSecondary_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSecondary_currency_code());
                }
                if (value.getTouchpoint() != TokenizationFxFee.TouchPoint.TOUCHPOINT_UNSPECIFIED) {
                    size += TokenizationFxFee.TouchPoint.ADAPTER.encodedSizeWithTag(5, value.getTouchpoint());
                }
                return value.getOrder_side() != Side.SIDE__UNSPECIFIED ? size + Side.ADAPTER.encodedSizeWithTag(6, value.getOrder_side()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TokenizationFxFee value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getExchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getExchange_rate());
                }
                if (!Intrinsics.areEqual(value.getExchange_fee_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getExchange_fee_percentage());
                }
                if (!Intrinsics.areEqual(value.getPrimary_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getSecondary_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSecondary_currency_code());
                }
                if (value.getTouchpoint() != TokenizationFxFee.TouchPoint.TOUCHPOINT_UNSPECIFIED) {
                    TokenizationFxFee.TouchPoint.ADAPTER.encodeWithTag(writer, 5, (int) value.getTouchpoint());
                }
                if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_side());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TokenizationFxFee value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_side());
                }
                if (value.getTouchpoint() != TokenizationFxFee.TouchPoint.TOUCHPOINT_UNSPECIFIED) {
                    TokenizationFxFee.TouchPoint.ADAPTER.encodeWithTag(writer, 5, (int) value.getTouchpoint());
                }
                if (!Intrinsics.areEqual(value.getSecondary_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSecondary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getPrimary_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getExchange_fee_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getExchange_fee_percentage());
                }
                if (Intrinsics.areEqual(value.getExchange_rate(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getExchange_rate());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TokenizationFxFee decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TokenizationFxFee.TouchPoint touchPointDecode = TokenizationFxFee.TouchPoint.TOUCHPOINT_UNSPECIFIED;
                Side side = Side.SIDE__UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                Side sideDecode = side;
                while (true) {
                    TokenizationFxFee.TouchPoint touchPoint = touchPointDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        touchPointDecode = TokenizationFxFee.TouchPoint.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 6:
                                    try {
                                        sideDecode = Side.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new TokenizationFxFee(strDecode, strDecode2, strDecode3, strDecode4, touchPoint, sideDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TokenizationFxFee redact(TokenizationFxFee value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TokenizationFxFee.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TokenizationFxFee.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TOUCHPOINT_UNSPECIFIED", "PRETRADE", "CONFIRMATION", "ORDER_HISTORY_DETAILS", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TouchPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TouchPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TouchPoint> ADAPTER;
        public static final TouchPoint CONFIRMATION;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TouchPoint ORDER_HISTORY_DETAILS;
        public static final TouchPoint PRETRADE;
        public static final TouchPoint TOUCHPOINT_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ TouchPoint[] $values() {
            return new TouchPoint[]{TOUCHPOINT_UNSPECIFIED, PRETRADE, CONFIRMATION, ORDER_HISTORY_DETAILS};
        }

        @JvmStatic
        public static final TouchPoint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TouchPoint> getEntries() {
            return $ENTRIES;
        }

        private TouchPoint(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TouchPoint touchPoint = new TouchPoint("TOUCHPOINT_UNSPECIFIED", 0, 0);
            TOUCHPOINT_UNSPECIFIED = touchPoint;
            PRETRADE = new TouchPoint("PRETRADE", 1, 1);
            CONFIRMATION = new TouchPoint("CONFIRMATION", 2, 2);
            ORDER_HISTORY_DETAILS = new TouchPoint("ORDER_HISTORY_DETAILS", 3, 3);
            TouchPoint[] touchPointArr$values = $values();
            $VALUES = touchPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(touchPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TouchPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TouchPoint>(orCreateKotlinClass, syntax, touchPoint) { // from class: contracts.crypto.trade.proto.v1.TokenizationFxFee$TouchPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TokenizationFxFee.TouchPoint fromValue(int value) {
                    return TokenizationFxFee.TouchPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TokenizationFxFee.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint;", "fromValue", "value", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TouchPoint fromValue(int value) {
                if (value == 0) {
                    return TouchPoint.TOUCHPOINT_UNSPECIFIED;
                }
                if (value == 1) {
                    return TouchPoint.PRETRADE;
                }
                if (value == 2) {
                    return TouchPoint.CONFIRMATION;
                }
                if (value != 3) {
                    return null;
                }
                return TouchPoint.ORDER_HISTORY_DETAILS;
            }
        }

        public static TouchPoint valueOf(String str) {
            return (TouchPoint) Enum.valueOf(TouchPoint.class, str);
        }

        public static TouchPoint[] values() {
            return (TouchPoint[]) $VALUES.clone();
        }
    }
}
