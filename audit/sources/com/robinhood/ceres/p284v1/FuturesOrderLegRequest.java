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

/* compiled from: FuturesOrderLegRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegRequest;", "Lcom/squareup/wire/Message;", "", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractType;", "contract_id", "", "ratio_quantity", "", "order_side", "Lrosetta/mainst/Side;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesContractType;Ljava/lang/String;ILrosetta/mainst/Side;Lokio/ByteString;)V", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractType;", "getContract_id", "()Ljava/lang/String;", "getRatio_quantity", "()I", "getOrder_side", "()Lrosetta/mainst/Side;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesOrderLegRequest extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesOrderLegRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String contract_id;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesContractType#ADAPTER", jsonName = "contractType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FuturesContractType contract_type;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Side order_side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ratioQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int ratio_quantity;

    public FuturesOrderLegRequest() {
        this(null, null, 0, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20329newBuilder();
    }

    public final FuturesContractType getContract_type() {
        return this.contract_type;
    }

    public /* synthetic */ FuturesOrderLegRequest(FuturesContractType futuresContractType, String str, int i, Side side, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED : futuresContractType, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? Side.SIDE_UNSPECIFIED : side, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOrderLegRequest(FuturesContractType contract_type, String contract_id, int i, Side order_side, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_type = contract_type;
        this.contract_id = contract_id;
        this.ratio_quantity = i;
        this.order_side = order_side;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20329newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesOrderLegRequest)) {
            return false;
        }
        FuturesOrderLegRequest futuresOrderLegRequest = (FuturesOrderLegRequest) other;
        return Intrinsics.areEqual(unknownFields(), futuresOrderLegRequest.unknownFields()) && this.contract_type == futuresOrderLegRequest.contract_type && Intrinsics.areEqual(this.contract_id, futuresOrderLegRequest.contract_id) && this.ratio_quantity == futuresOrderLegRequest.ratio_quantity && this.order_side == futuresOrderLegRequest.order_side;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.contract_type.hashCode()) * 37) + this.contract_id.hashCode()) * 37) + Integer.hashCode(this.ratio_quantity)) * 37) + this.order_side.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_type=" + this.contract_type);
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("ratio_quantity=" + this.ratio_quantity);
        arrayList.add("order_side=" + this.order_side);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesOrderLegRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesOrderLegRequest copy$default(FuturesOrderLegRequest futuresOrderLegRequest, FuturesContractType futuresContractType, String str, int i, Side side, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            futuresContractType = futuresOrderLegRequest.contract_type;
        }
        if ((i2 & 2) != 0) {
            str = futuresOrderLegRequest.contract_id;
        }
        if ((i2 & 4) != 0) {
            i = futuresOrderLegRequest.ratio_quantity;
        }
        if ((i2 & 8) != 0) {
            side = futuresOrderLegRequest.order_side;
        }
        if ((i2 & 16) != 0) {
            byteString = futuresOrderLegRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i3 = i;
        return futuresOrderLegRequest.copy(futuresContractType, str, i3, side, byteString2);
    }

    public final FuturesOrderLegRequest copy(FuturesContractType contract_type, String contract_id, int ratio_quantity, Side order_side, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesOrderLegRequest(contract_type, contract_id, ratio_quantity, order_side, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesOrderLegRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesOrderLegRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesOrderLegRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesOrderLegRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    size += FuturesContractType.ADAPTER.encodedSizeWithTag(1, value.getContract_type());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContract_id());
                }
                if (value.getRatio_quantity() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getRatio_quantity()));
                }
                return value.getOrder_side() != Side.SIDE_UNSPECIFIED ? size + Side.ADAPTER.encodedSizeWithTag(4, value.getOrder_side()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesOrderLegRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    FuturesContractType.ADAPTER.encodeWithTag(writer, 1, (int) value.getContract_type());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_id());
                }
                if (value.getRatio_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getRatio_quantity()));
                }
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_side());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesOrderLegRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_side());
                }
                if (value.getRatio_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getRatio_quantity()));
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_id());
                }
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    FuturesContractType.ADAPTER.encodeWithTag(writer, 1, (int) value.getContract_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrderLegRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesContractType futuresContractTypeDecode = FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED;
                Side side = Side.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                String strDecode = "";
                Side sideDecode = side;
                while (true) {
                    FuturesContractType futuresContractType = futuresContractTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new FuturesOrderLegRequest(futuresContractType, strDecode, iIntValue, sideDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                futuresContractTypeDecode = FuturesContractType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 4) {
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrderLegRequest redact(FuturesOrderLegRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FuturesOrderLegRequest.copy$default(value, null, null, 0, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
