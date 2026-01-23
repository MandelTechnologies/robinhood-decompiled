package contracts.crypto.trade.proto.p431v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import contracts.crypto.trade.proto.p431v1.UserInputs;
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
import rosetta.nummus.MonetizationModel;
import rosetta.nummus.order.InputMode;
import rosetta.nummus.order.Side;
import rosetta.nummus.order.TimeInForce;

/* compiled from: UserInputs.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,-Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\nH\u0016Jf\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001c¨\u0006."}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputs;", "Lcom/squareup/wire/Message;", "", "input_mode", "Lrosetta/nummus/order/InputMode;", "order_side", "Lrosetta/nummus/order/Side;", "monetization_model", "Lrosetta/nummus/MonetizationModel;", "quantity", "", "crypto_order_prices", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices;", "time_in_force", "Lrosetta/nummus/order/TimeInForce;", "display_asset_quantity", "fee_ratio", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/nummus/order/InputMode;Lrosetta/nummus/order/Side;Lrosetta/nummus/MonetizationModel;Ljava/lang/String;Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices;Lrosetta/nummus/order/TimeInForce;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getInput_mode", "()Lrosetta/nummus/order/InputMode;", "getOrder_side", "()Lrosetta/nummus/order/Side;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModel;", "getQuantity", "()Ljava/lang/String;", "getCrypto_order_prices", "()Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices;", "getTime_in_force", "()Lrosetta/nummus/order/TimeInForce;", "getDisplay_asset_quantity", "getFee_ratio", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "CryptoOrderPrices", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class UserInputs extends Message {

    @JvmField
    public static final ProtoAdapter<UserInputs> ADAPTER;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.UserInputs$CryptoOrderPrices#ADAPTER", jsonName = "cryptoOrderPrices", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final CryptoOrderPrices crypto_order_prices;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayAssetQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final String display_asset_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeRatio", schemaIndex = 7, tag = 9)
    private final String fee_ratio;

    @WireField(adapter = "rosetta.nummus.order.InputMode#ADAPTER", jsonName = "inputMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 2)
    private final InputMode input_mode;

    @WireField(adapter = "rosetta.nummus.MonetizationModel#ADAPTER", jsonName = "monetizationModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final MonetizationModel monetization_model;

    @WireField(adapter = "rosetta.nummus.order.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final Side order_side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 5)
    private final String quantity;

    @WireField(adapter = "rosetta.nummus.order.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 7)
    private final TimeInForce time_in_force;

    public UserInputs() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27716newBuilder();
    }

    public final InputMode getInput_mode() {
        return this.input_mode;
    }

    public /* synthetic */ UserInputs(InputMode inputMode, Side side, MonetizationModel monetizationModel, String str, CryptoOrderPrices cryptoOrderPrices, TimeInForce timeInForce, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InputMode.INPUT_MODE__UNSPECIFIED : inputMode, (i & 2) != 0 ? Side.SIDE__UNSPECIFIED : side, (i & 4) != 0 ? MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED : monetizationModel, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : cryptoOrderPrices, (i & 32) != 0 ? TimeInForce.TIME_IN_FORCE__UNSPECIFIED : timeInForce, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Side getOrder_side() {
        return this.order_side;
    }

    public final MonetizationModel getMonetization_model() {
        return this.monetization_model;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final CryptoOrderPrices getCrypto_order_prices() {
        return this.crypto_order_prices;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final String getDisplay_asset_quantity() {
        return this.display_asset_quantity;
    }

    public final String getFee_ratio() {
        return this.fee_ratio;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInputs(InputMode input_mode, Side order_side, MonetizationModel monetization_model, String str, CryptoOrderPrices cryptoOrderPrices, TimeInForce time_in_force, String display_asset_quantity, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(input_mode, "input_mode");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(display_asset_quantity, "display_asset_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.input_mode = input_mode;
        this.order_side = order_side;
        this.monetization_model = monetization_model;
        this.quantity = str;
        this.crypto_order_prices = cryptoOrderPrices;
        this.time_in_force = time_in_force;
        this.display_asset_quantity = display_asset_quantity;
        this.fee_ratio = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27716newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UserInputs)) {
            return false;
        }
        UserInputs userInputs = (UserInputs) other;
        return Intrinsics.areEqual(unknownFields(), userInputs.unknownFields()) && this.input_mode == userInputs.input_mode && this.order_side == userInputs.order_side && this.monetization_model == userInputs.monetization_model && Intrinsics.areEqual(this.quantity, userInputs.quantity) && Intrinsics.areEqual(this.crypto_order_prices, userInputs.crypto_order_prices) && this.time_in_force == userInputs.time_in_force && Intrinsics.areEqual(this.display_asset_quantity, userInputs.display_asset_quantity) && Intrinsics.areEqual(this.fee_ratio, userInputs.fee_ratio);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.input_mode.hashCode()) * 37) + this.order_side.hashCode()) * 37) + this.monetization_model.hashCode()) * 37;
        String str = this.quantity;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        CryptoOrderPrices cryptoOrderPrices = this.crypto_order_prices;
        int iHashCode3 = (((((iHashCode2 + (cryptoOrderPrices != null ? cryptoOrderPrices.hashCode() : 0)) * 37) + this.time_in_force.hashCode()) * 37) + this.display_asset_quantity.hashCode()) * 37;
        String str2 = this.fee_ratio;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("input_mode=" + this.input_mode);
        arrayList.add("order_side=" + this.order_side);
        arrayList.add("monetization_model=" + this.monetization_model);
        String str = this.quantity;
        if (str != null) {
            arrayList.add("quantity=" + Internal.sanitize(str));
        }
        CryptoOrderPrices cryptoOrderPrices = this.crypto_order_prices;
        if (cryptoOrderPrices != null) {
            arrayList.add("crypto_order_prices=" + cryptoOrderPrices);
        }
        arrayList.add("time_in_force=" + this.time_in_force);
        arrayList.add("display_asset_quantity=" + Internal.sanitize(this.display_asset_quantity));
        String str2 = this.fee_ratio;
        if (str2 != null) {
            arrayList.add("fee_ratio=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserInputs{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UserInputs copy$default(UserInputs userInputs, InputMode inputMode, Side side, MonetizationModel monetizationModel, String str, CryptoOrderPrices cryptoOrderPrices, TimeInForce timeInForce, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            inputMode = userInputs.input_mode;
        }
        if ((i & 2) != 0) {
            side = userInputs.order_side;
        }
        if ((i & 4) != 0) {
            monetizationModel = userInputs.monetization_model;
        }
        if ((i & 8) != 0) {
            str = userInputs.quantity;
        }
        if ((i & 16) != 0) {
            cryptoOrderPrices = userInputs.crypto_order_prices;
        }
        if ((i & 32) != 0) {
            timeInForce = userInputs.time_in_force;
        }
        if ((i & 64) != 0) {
            str2 = userInputs.display_asset_quantity;
        }
        if ((i & 128) != 0) {
            str3 = userInputs.fee_ratio;
        }
        if ((i & 256) != 0) {
            byteString = userInputs.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        TimeInForce timeInForce2 = timeInForce;
        String str5 = str2;
        CryptoOrderPrices cryptoOrderPrices2 = cryptoOrderPrices;
        MonetizationModel monetizationModel2 = monetizationModel;
        return userInputs.copy(inputMode, side, monetizationModel2, str, cryptoOrderPrices2, timeInForce2, str5, str4, byteString2);
    }

    public final UserInputs copy(InputMode input_mode, Side order_side, MonetizationModel monetization_model, String quantity, CryptoOrderPrices crypto_order_prices, TimeInForce time_in_force, String display_asset_quantity, String fee_ratio, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(input_mode, "input_mode");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(display_asset_quantity, "display_asset_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UserInputs(input_mode, order_side, monetization_model, quantity, crypto_order_prices, time_in_force, display_asset_quantity, fee_ratio, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserInputs.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UserInputs>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.UserInputs$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UserInputs value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getInput_mode() != InputMode.INPUT_MODE__UNSPECIFIED) {
                    size += InputMode.ADAPTER.encodedSizeWithTag(2, value.getInput_mode());
                }
                if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(3, value.getOrder_side());
                }
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    size += MonetizationModel.ADAPTER.encodedSizeWithTag(4, value.getMonetization_model());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(5, value.getQuantity());
                if (value.getCrypto_order_prices() != null) {
                    iEncodedSizeWithTag += UserInputs.CryptoOrderPrices.ADAPTER.encodedSizeWithTag(6, value.getCrypto_order_prices());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE__UNSPECIFIED) {
                    iEncodedSizeWithTag += TimeInForce.ADAPTER.encodedSizeWithTag(7, value.getTime_in_force());
                }
                if (!Intrinsics.areEqual(value.getDisplay_asset_quantity(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getDisplay_asset_quantity());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(9, value.getFee_ratio());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UserInputs value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getInput_mode() != InputMode.INPUT_MODE__UNSPECIFIED) {
                    InputMode.ADAPTER.encodeWithTag(writer, 2, (int) value.getInput_mode());
                }
                if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_side());
                }
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getMonetization_model());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getQuantity());
                if (value.getCrypto_order_prices() != null) {
                    UserInputs.CryptoOrderPrices.ADAPTER.encodeWithTag(writer, 6, (int) value.getCrypto_order_prices());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE__UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 7, (int) value.getTime_in_force());
                }
                if (!Intrinsics.areEqual(value.getDisplay_asset_quantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getDisplay_asset_quantity());
                }
                protoAdapter.encodeWithTag(writer, 9, (int) value.getFee_ratio());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UserInputs value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 9, (int) value.getFee_ratio());
                if (!Intrinsics.areEqual(value.getDisplay_asset_quantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getDisplay_asset_quantity());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE__UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 7, (int) value.getTime_in_force());
                }
                if (value.getCrypto_order_prices() != null) {
                    UserInputs.CryptoOrderPrices.ADAPTER.encodeWithTag(writer, 6, (int) value.getCrypto_order_prices());
                }
                protoAdapter.encodeWithTag(writer, 5, (int) value.getQuantity());
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getMonetization_model());
                }
                if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_side());
                }
                if (value.getInput_mode() != InputMode.INPUT_MODE__UNSPECIFIED) {
                    InputMode.ADAPTER.encodeWithTag(writer, 2, (int) value.getInput_mode());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UserInputs decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InputMode inputModeDecode = InputMode.INPUT_MODE__UNSPECIFIED;
                Side side = Side.SIDE__UNSPECIFIED;
                MonetizationModel monetizationModel = MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED;
                TimeInForce timeInForce = TimeInForce.TIME_IN_FORCE__UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                UserInputs.CryptoOrderPrices cryptoOrderPricesDecode = null;
                String strDecode = null;
                String strDecode2 = "";
                TimeInForce timeInForceDecode = timeInForce;
                String strDecode3 = null;
                MonetizationModel monetizationModelDecode = monetizationModel;
                Side sideDecode = side;
                while (true) {
                    InputMode inputMode = inputModeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 2:
                                    try {
                                        inputModeDecode = InputMode.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        sideDecode = Side.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        monetizationModelDecode = MonetizationModel.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 5:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    cryptoOrderPricesDecode = UserInputs.CryptoOrderPrices.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    try {
                                        timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                case 8:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 9:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new UserInputs(inputMode, sideDecode, monetizationModelDecode, strDecode3, cryptoOrderPricesDecode, timeInForceDecode, strDecode2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UserInputs redact(UserInputs value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UserInputs.CryptoOrderPrices crypto_order_prices = value.getCrypto_order_prices();
                return UserInputs.copy$default(value, null, null, null, null, crypto_order_prices != null ? UserInputs.CryptoOrderPrices.ADAPTER.redact(crypto_order_prices) : null, null, null, null, ByteString.EMPTY, 239, null);
            }
        };
    }

    /* compiled from: UserInputs.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$%BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices;", "Lcom/squareup/wire/Message;", "", "market", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Market;", "limit", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Limit;", "stop_loss", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLoss;", "stop_limit", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLimit;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Market;Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Limit;Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLoss;Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLimit;Lokio/ByteString;)V", "getMarket", "()Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Market;", "getLimit", "()Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Limit;", "getStop_loss", "()Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLoss;", "getStop_limit", "()Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLimit;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Market", "Limit", "StopLoss", "StopLimit", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoOrderPrices extends Message {

        @JvmField
        public static final ProtoAdapter<CryptoOrderPrices> ADAPTER;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.UserInputs$CryptoOrderPrices$Limit#ADAPTER", oneofName = "prices", schemaIndex = 1, tag = 2)
        private final Limit limit;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.UserInputs$CryptoOrderPrices$Market#ADAPTER", oneofName = "prices", schemaIndex = 0, tag = 1)
        private final Market market;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.UserInputs$CryptoOrderPrices$StopLimit#ADAPTER", jsonName = "stopLimit", oneofName = "prices", schemaIndex = 3, tag = 4)
        private final StopLimit stop_limit;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.UserInputs$CryptoOrderPrices$StopLoss#ADAPTER", jsonName = "stopLoss", oneofName = "prices", schemaIndex = 2, tag = 3)
        private final StopLoss stop_loss;

        public CryptoOrderPrices() {
            this(null, null, null, null, null, 31, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27717newBuilder();
        }

        public final Market getMarket() {
            return this.market;
        }

        public final Limit getLimit() {
            return this.limit;
        }

        public final StopLoss getStop_loss() {
            return this.stop_loss;
        }

        public final StopLimit getStop_limit() {
            return this.stop_limit;
        }

        public /* synthetic */ CryptoOrderPrices(Market market, Limit limit, StopLoss stopLoss, StopLimit stopLimit, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : market, (i & 2) != 0 ? null : limit, (i & 4) != 0 ? null : stopLoss, (i & 8) != 0 ? null : stopLimit, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoOrderPrices(Market market, Limit limit, StopLoss stopLoss, StopLimit stopLimit, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.market = market;
            this.limit = limit;
            this.stop_loss = stopLoss;
            this.stop_limit = stopLimit;
            if (Internal.countNonNull(market, limit, stopLoss, stopLimit, new Object[0]) > 1) {
                throw new IllegalArgumentException("At most one of market, limit, stop_loss, stop_limit may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27717newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CryptoOrderPrices)) {
                return false;
            }
            CryptoOrderPrices cryptoOrderPrices = (CryptoOrderPrices) other;
            return Intrinsics.areEqual(unknownFields(), cryptoOrderPrices.unknownFields()) && Intrinsics.areEqual(this.market, cryptoOrderPrices.market) && Intrinsics.areEqual(this.limit, cryptoOrderPrices.limit) && Intrinsics.areEqual(this.stop_loss, cryptoOrderPrices.stop_loss) && Intrinsics.areEqual(this.stop_limit, cryptoOrderPrices.stop_limit);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Market market = this.market;
            int iHashCode2 = (iHashCode + (market != null ? market.hashCode() : 0)) * 37;
            Limit limit = this.limit;
            int iHashCode3 = (iHashCode2 + (limit != null ? limit.hashCode() : 0)) * 37;
            StopLoss stopLoss = this.stop_loss;
            int iHashCode4 = (iHashCode3 + (stopLoss != null ? stopLoss.hashCode() : 0)) * 37;
            StopLimit stopLimit = this.stop_limit;
            int iHashCode5 = iHashCode4 + (stopLimit != null ? stopLimit.hashCode() : 0);
            this.hashCode = iHashCode5;
            return iHashCode5;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Market market = this.market;
            if (market != null) {
                arrayList.add("market=" + market);
            }
            Limit limit = this.limit;
            if (limit != null) {
                arrayList.add("limit=" + limit);
            }
            StopLoss stopLoss = this.stop_loss;
            if (stopLoss != null) {
                arrayList.add("stop_loss=" + stopLoss);
            }
            StopLimit stopLimit = this.stop_limit;
            if (stopLimit != null) {
                arrayList.add("stop_limit=" + stopLimit);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoOrderPrices{", "}", 0, null, null, 56, null);
        }

        public final CryptoOrderPrices copy(Market market, Limit limit, StopLoss stop_loss, StopLimit stop_limit, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CryptoOrderPrices(market, limit, stop_loss, stop_limit, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoOrderPrices.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CryptoOrderPrices>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.UserInputs$CryptoOrderPrices$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(UserInputs.CryptoOrderPrices value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + UserInputs.CryptoOrderPrices.Market.ADAPTER.encodedSizeWithTag(1, value.getMarket()) + UserInputs.CryptoOrderPrices.Limit.ADAPTER.encodedSizeWithTag(2, value.getLimit()) + UserInputs.CryptoOrderPrices.StopLoss.ADAPTER.encodedSizeWithTag(3, value.getStop_loss()) + UserInputs.CryptoOrderPrices.StopLimit.ADAPTER.encodedSizeWithTag(4, value.getStop_limit());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, UserInputs.CryptoOrderPrices value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    UserInputs.CryptoOrderPrices.Market.ADAPTER.encodeWithTag(writer, 1, (int) value.getMarket());
                    UserInputs.CryptoOrderPrices.Limit.ADAPTER.encodeWithTag(writer, 2, (int) value.getLimit());
                    UserInputs.CryptoOrderPrices.StopLoss.ADAPTER.encodeWithTag(writer, 3, (int) value.getStop_loss());
                    UserInputs.CryptoOrderPrices.StopLimit.ADAPTER.encodeWithTag(writer, 4, (int) value.getStop_limit());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, UserInputs.CryptoOrderPrices value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    UserInputs.CryptoOrderPrices.StopLimit.ADAPTER.encodeWithTag(writer, 4, (int) value.getStop_limit());
                    UserInputs.CryptoOrderPrices.StopLoss.ADAPTER.encodeWithTag(writer, 3, (int) value.getStop_loss());
                    UserInputs.CryptoOrderPrices.Limit.ADAPTER.encodeWithTag(writer, 2, (int) value.getLimit());
                    UserInputs.CryptoOrderPrices.Market.ADAPTER.encodeWithTag(writer, 1, (int) value.getMarket());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public UserInputs.CryptoOrderPrices redact(UserInputs.CryptoOrderPrices value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    UserInputs.CryptoOrderPrices.Market market = value.getMarket();
                    UserInputs.CryptoOrderPrices.Market marketRedact = market != null ? UserInputs.CryptoOrderPrices.Market.ADAPTER.redact(market) : null;
                    UserInputs.CryptoOrderPrices.Limit limit = value.getLimit();
                    UserInputs.CryptoOrderPrices.Limit limitRedact = limit != null ? UserInputs.CryptoOrderPrices.Limit.ADAPTER.redact(limit) : null;
                    UserInputs.CryptoOrderPrices.StopLoss stop_loss = value.getStop_loss();
                    UserInputs.CryptoOrderPrices.StopLoss stopLossRedact = stop_loss != null ? UserInputs.CryptoOrderPrices.StopLoss.ADAPTER.redact(stop_loss) : null;
                    UserInputs.CryptoOrderPrices.StopLimit stop_limit = value.getStop_limit();
                    return value.copy(marketRedact, limitRedact, stopLossRedact, stop_limit != null ? UserInputs.CryptoOrderPrices.StopLimit.ADAPTER.redact(stop_limit) : null, ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public UserInputs.CryptoOrderPrices decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    UserInputs.CryptoOrderPrices.Market marketDecode = null;
                    UserInputs.CryptoOrderPrices.Limit limitDecode = null;
                    UserInputs.CryptoOrderPrices.StopLoss stopLossDecode = null;
                    UserInputs.CryptoOrderPrices.StopLimit stopLimitDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new UserInputs.CryptoOrderPrices(marketDecode, limitDecode, stopLossDecode, stopLimitDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            marketDecode = UserInputs.CryptoOrderPrices.Market.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            limitDecode = UserInputs.CryptoOrderPrices.Limit.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            stopLossDecode = UserInputs.CryptoOrderPrices.StopLoss.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            stopLimitDecode = UserInputs.CryptoOrderPrices.StopLimit.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* compiled from: UserInputs.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Market;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Market extends Message {

            @JvmField
            public static final ProtoAdapter<Market> ADAPTER;

            /* JADX WARN: Multi-variable type inference failed */
            public Market() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27719newBuilder();
            }

            public /* synthetic */ Market(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Market(ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27719newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof Market) && Intrinsics.areEqual(unknownFields(), ((Market) other).unknownFields());
            }

            public int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                return "Market{}";
            }

            public final Market copy(ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Market(unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Market.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Market>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.UserInputs$CryptoOrderPrices$Market$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public UserInputs.CryptoOrderPrices.Market decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag != -1) {
                                reader.readUnknownField(iNextTag);
                            } else {
                                return new UserInputs.CryptoOrderPrices.Market(reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(UserInputs.CryptoOrderPrices.Market value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, UserInputs.CryptoOrderPrices.Market value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, UserInputs.CryptoOrderPrices.Market value) {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public UserInputs.CryptoOrderPrices.Market redact(UserInputs.CryptoOrderPrices.Market value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.copy(ByteString.EMPTY);
                    }
                };
            }
        }

        /* compiled from: UserInputs.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Limit;", "Lcom/squareup/wire/Message;", "", "limit_price", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getLimit_price", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Limit extends Message {

            @JvmField
            public static final ProtoAdapter<Limit> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 0, tag = 1)
            private final String limit_price;

            /* JADX WARN: Multi-variable type inference failed */
            public Limit() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27718newBuilder();
            }

            public final String getLimit_price() {
                return this.limit_price;
            }

            public /* synthetic */ Limit(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Limit(String str, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.limit_price = str;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27718newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Limit)) {
                    return false;
                }
                Limit limit = (Limit) other;
                return Intrinsics.areEqual(unknownFields(), limit.unknownFields()) && Intrinsics.areEqual(this.limit_price, limit.limit_price);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                String str = this.limit_price;
                int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.limit_price;
                if (str != null) {
                    arrayList.add("limit_price=" + Internal.sanitize(str));
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Limit{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Limit copy$default(Limit limit, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = limit.limit_price;
                }
                if ((i & 2) != 0) {
                    byteString = limit.unknownFields();
                }
                return limit.copy(str, byteString);
            }

            public final Limit copy(String limit_price, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Limit(limit_price, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Limit.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Limit>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.UserInputs$CryptoOrderPrices$Limit$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public UserInputs.CryptoOrderPrices.Limit decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new UserInputs.CryptoOrderPrices.Limit(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(UserInputs.CryptoOrderPrices.Limit value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLimit_price());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, UserInputs.CryptoOrderPrices.Limit value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLimit_price());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, UserInputs.CryptoOrderPrices.Limit value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLimit_price());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public UserInputs.CryptoOrderPrices.Limit redact(UserInputs.CryptoOrderPrices.Limit value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return UserInputs.CryptoOrderPrices.Limit.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }

        /* compiled from: UserInputs.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLoss;", "Lcom/squareup/wire/Message;", "", "stop_price", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getStop_price", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class StopLoss extends Message {

            @JvmField
            public static final ProtoAdapter<StopLoss> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", schemaIndex = 0, tag = 1)
            private final String stop_price;

            /* JADX WARN: Multi-variable type inference failed */
            public StopLoss() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27721newBuilder();
            }

            public final String getStop_price() {
                return this.stop_price;
            }

            public /* synthetic */ StopLoss(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StopLoss(String str, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.stop_price = str;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27721newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof StopLoss)) {
                    return false;
                }
                StopLoss stopLoss = (StopLoss) other;
                return Intrinsics.areEqual(unknownFields(), stopLoss.unknownFields()) && Intrinsics.areEqual(this.stop_price, stopLoss.stop_price);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                String str = this.stop_price;
                int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.stop_price;
                if (str != null) {
                    arrayList.add("stop_price=" + Internal.sanitize(str));
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "StopLoss{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ StopLoss copy$default(StopLoss stopLoss, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stopLoss.stop_price;
                }
                if ((i & 2) != 0) {
                    byteString = stopLoss.unknownFields();
                }
                return stopLoss.copy(str, byteString);
            }

            public final StopLoss copy(String stop_price, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new StopLoss(stop_price, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StopLoss.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<StopLoss>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.UserInputs$CryptoOrderPrices$StopLoss$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public UserInputs.CryptoOrderPrices.StopLoss decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new UserInputs.CryptoOrderPrices.StopLoss(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(UserInputs.CryptoOrderPrices.StopLoss value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getStop_price());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, UserInputs.CryptoOrderPrices.StopLoss value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStop_price());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, UserInputs.CryptoOrderPrices.StopLoss value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStop_price());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public UserInputs.CryptoOrderPrices.StopLoss redact(UserInputs.CryptoOrderPrices.StopLoss value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return UserInputs.CryptoOrderPrices.StopLoss.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }

        /* compiled from: UserInputs.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J(\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLimit;", "Lcom/squareup/wire/Message;", "", "limit_price", "", "stop_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLimit_price", "()Ljava/lang/String;", "getStop_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class StopLimit extends Message {

            @JvmField
            public static final ProtoAdapter<StopLimit> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 0, tag = 1)
            private final String limit_price;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", schemaIndex = 1, tag = 2)
            private final String stop_price;

            public StopLimit() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27720newBuilder();
            }

            public final String getLimit_price() {
                return this.limit_price;
            }

            public final String getStop_price() {
                return this.stop_price;
            }

            public /* synthetic */ StopLimit(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StopLimit(String str, String str2, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.limit_price = str;
                this.stop_price = str2;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27720newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof StopLimit)) {
                    return false;
                }
                StopLimit stopLimit = (StopLimit) other;
                return Intrinsics.areEqual(unknownFields(), stopLimit.unknownFields()) && Intrinsics.areEqual(this.limit_price, stopLimit.limit_price) && Intrinsics.areEqual(this.stop_price, stopLimit.stop_price);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                String str = this.limit_price;
                int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.stop_price;
                int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.limit_price;
                if (str != null) {
                    arrayList.add("limit_price=" + Internal.sanitize(str));
                }
                String str2 = this.stop_price;
                if (str2 != null) {
                    arrayList.add("stop_price=" + Internal.sanitize(str2));
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "StopLimit{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ StopLimit copy$default(StopLimit stopLimit, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stopLimit.limit_price;
                }
                if ((i & 2) != 0) {
                    str2 = stopLimit.stop_price;
                }
                if ((i & 4) != 0) {
                    byteString = stopLimit.unknownFields();
                }
                return stopLimit.copy(str, str2, byteString);
            }

            public final StopLimit copy(String limit_price, String stop_price, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new StopLimit(limit_price, stop_price, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StopLimit.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<StopLimit>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.UserInputs$CryptoOrderPrices$StopLimit$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public UserInputs.CryptoOrderPrices.StopLimit decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = null;
                        String strDecode2 = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new UserInputs.CryptoOrderPrices.StopLimit(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(UserInputs.CryptoOrderPrices.StopLimit value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        return size + protoAdapter.encodedSizeWithTag(1, value.getLimit_price()) + protoAdapter.encodedSizeWithTag(2, value.getStop_price());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, UserInputs.CryptoOrderPrices.StopLimit value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getLimit_price());
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getStop_price());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, UserInputs.CryptoOrderPrices.StopLimit value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getStop_price());
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getLimit_price());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public UserInputs.CryptoOrderPrices.StopLimit redact(UserInputs.CryptoOrderPrices.StopLimit value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return UserInputs.CryptoOrderPrices.StopLimit.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }
                };
            }
        }
    }
}
