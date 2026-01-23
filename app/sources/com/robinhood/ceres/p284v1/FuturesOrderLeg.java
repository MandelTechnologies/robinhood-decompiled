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
import rosetta.mainst.Side;

/* compiled from: FuturesOrderLeg.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020\nH\u0016J\b\u0010'\u001a\u00020\u0004H\u0016Jn\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLeg;", "Lcom/squareup/wire/Message;", "", "id", "", "leg_id", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractType;", "contract_id", "ratio_quantity", "", "order_side", "Lrosetta/mainst/Side;", "average_price", "symbol", "symbol_description", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractType;Ljava/lang/String;ILrosetta/mainst/Side;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getLeg_id", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractType;", "getContract_id", "getRatio_quantity", "()I", "getOrder_side", "()Lrosetta/mainst/Side;", "getAverage_price", "getSymbol", "getSymbol_description", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesOrderLeg extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesOrderLeg> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "averagePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String average_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String contract_id;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesContractType#ADAPTER", jsonName = "contractType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final FuturesContractType contract_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "legId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String leg_id;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Side order_side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ratioQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int ratio_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 9)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "symbolDescription", schemaIndex = 8, tag = 10)
    private final String symbol_description;

    public FuturesOrderLeg() {
        this(null, null, null, null, 0, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ FuturesOrderLeg(String str, String str2, FuturesContractType futuresContractType, String str3, int i, Side side, String str4, String str5, String str6, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED : futuresContractType, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? Side.SIDE_UNSPECIFIED : side, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20328newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getLeg_id() {
        return this.leg_id;
    }

    public final FuturesContractType getContract_type() {
        return this.contract_type;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final int getRatio_quantity() {
        return this.ratio_quantity;
    }

    public final Side getOrder_side() {
        return this.order_side;
    }

    public final String getAverage_price() {
        return this.average_price;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getSymbol_description() {
        return this.symbol_description;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOrderLeg(String id, String leg_id, FuturesContractType contract_type, String contract_id, int i, Side order_side, String average_price, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(average_price, "average_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.leg_id = leg_id;
        this.contract_type = contract_type;
        this.contract_id = contract_id;
        this.ratio_quantity = i;
        this.order_side = order_side;
        this.average_price = average_price;
        this.symbol = str;
        this.symbol_description = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20328newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesOrderLeg)) {
            return false;
        }
        FuturesOrderLeg futuresOrderLeg = (FuturesOrderLeg) other;
        return Intrinsics.areEqual(unknownFields(), futuresOrderLeg.unknownFields()) && Intrinsics.areEqual(this.id, futuresOrderLeg.id) && Intrinsics.areEqual(this.leg_id, futuresOrderLeg.leg_id) && this.contract_type == futuresOrderLeg.contract_type && Intrinsics.areEqual(this.contract_id, futuresOrderLeg.contract_id) && this.ratio_quantity == futuresOrderLeg.ratio_quantity && this.order_side == futuresOrderLeg.order_side && Intrinsics.areEqual(this.average_price, futuresOrderLeg.average_price) && Intrinsics.areEqual(this.symbol, futuresOrderLeg.symbol) && Intrinsics.areEqual(this.symbol_description, futuresOrderLeg.symbol_description);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.leg_id.hashCode()) * 37) + this.contract_type.hashCode()) * 37) + this.contract_id.hashCode()) * 37) + Integer.hashCode(this.ratio_quantity)) * 37) + this.order_side.hashCode()) * 37) + this.average_price.hashCode()) * 37;
        String str = this.symbol;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.symbol_description;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("leg_id=" + Internal.sanitize(this.leg_id));
        arrayList.add("contract_type=" + this.contract_type);
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("ratio_quantity=" + this.ratio_quantity);
        arrayList.add("order_side=" + this.order_side);
        arrayList.add("average_price=" + Internal.sanitize(this.average_price));
        String str = this.symbol;
        if (str != null) {
            arrayList.add("symbol=" + Internal.sanitize(str));
        }
        String str2 = this.symbol_description;
        if (str2 != null) {
            arrayList.add("symbol_description=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesOrderLeg{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesOrderLeg copy$default(FuturesOrderLeg futuresOrderLeg, String str, String str2, FuturesContractType futuresContractType, String str3, int i, Side side, String str4, String str5, String str6, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = futuresOrderLeg.id;
        }
        if ((i2 & 2) != 0) {
            str2 = futuresOrderLeg.leg_id;
        }
        if ((i2 & 4) != 0) {
            futuresContractType = futuresOrderLeg.contract_type;
        }
        if ((i2 & 8) != 0) {
            str3 = futuresOrderLeg.contract_id;
        }
        if ((i2 & 16) != 0) {
            i = futuresOrderLeg.ratio_quantity;
        }
        if ((i2 & 32) != 0) {
            side = futuresOrderLeg.order_side;
        }
        if ((i2 & 64) != 0) {
            str4 = futuresOrderLeg.average_price;
        }
        if ((i2 & 128) != 0) {
            str5 = futuresOrderLeg.symbol;
        }
        if ((i2 & 256) != 0) {
            str6 = futuresOrderLeg.symbol_description;
        }
        if ((i2 & 512) != 0) {
            byteString = futuresOrderLeg.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str4;
        String str9 = str5;
        int i3 = i;
        Side side2 = side;
        return futuresOrderLeg.copy(str, str2, futuresContractType, str3, i3, side2, str8, str9, str7, byteString2);
    }

    public final FuturesOrderLeg copy(String id, String leg_id, FuturesContractType contract_type, String contract_id, int ratio_quantity, Side order_side, String average_price, String symbol, String symbol_description, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(average_price, "average_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesOrderLeg(id, leg_id, contract_type, contract_id, ratio_quantity, order_side, average_price, symbol, symbol_description, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesOrderLeg.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesOrderLeg>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesOrderLeg$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesOrderLeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getLeg_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLeg_id());
                }
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    size += FuturesContractType.ADAPTER.encodedSizeWithTag(3, value.getContract_type());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getContract_id());
                }
                if (value.getRatio_quantity() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getRatio_quantity()));
                }
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(6, value.getOrder_side());
                }
                if (!Intrinsics.areEqual(value.getAverage_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getAverage_price());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(9, value.getSymbol()) + protoAdapter.encodedSizeWithTag(10, value.getSymbol_description());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesOrderLeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getLeg_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLeg_id());
                }
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    FuturesContractType.ADAPTER.encodeWithTag(writer, 3, (int) value.getContract_type());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getContract_id());
                }
                if (value.getRatio_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getRatio_quantity()));
                }
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_side());
                }
                if (!Intrinsics.areEqual(value.getAverage_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAverage_price());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 9, (int) value.getSymbol());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getSymbol_description());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesOrderLeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getSymbol_description());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getSymbol());
                if (!Intrinsics.areEqual(value.getAverage_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getAverage_price());
                }
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_side());
                }
                if (value.getRatio_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getRatio_quantity()));
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getContract_id());
                }
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    FuturesContractType.ADAPTER.encodeWithTag(writer, 3, (int) value.getContract_type());
                }
                if (!Intrinsics.areEqual(value.getLeg_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getLeg_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrderLeg decode(ProtoReader reader) throws IOException {
                Side side;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesContractType futuresContractType = FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED;
                Side side2 = Side.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                int iIntValue = 0;
                String strDecode3 = null;
                String strDecode4 = null;
                Side sideDecode = side2;
                String strDecode5 = strDecode2;
                String strDecode6 = strDecode5;
                FuturesContractType futuresContractTypeDecode = futuresContractType;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                side = sideDecode;
                                str = strDecode5;
                                try {
                                    futuresContractTypeDecode = FuturesContractType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str2 = strDecode6;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                strDecode5 = str;
                                sideDecode = side;
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 6:
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    side = sideDecode;
                                    str = strDecode5;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                            default:
                                reader.readUnknownField(iNextTag);
                                side = sideDecode;
                                str = strDecode5;
                                str2 = strDecode6;
                                strDecode6 = str2;
                                strDecode5 = str;
                                sideDecode = side;
                                break;
                            case 9:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                        }
                    } else {
                        return new FuturesOrderLeg(strDecode5, strDecode6, futuresContractTypeDecode, strDecode, iIntValue, sideDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrderLeg redact(FuturesOrderLeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FuturesOrderLeg.copy$default(value, null, null, null, null, 0, null, null, null, null, ByteString.EMPTY, 511, null);
            }
        };
    }
}
