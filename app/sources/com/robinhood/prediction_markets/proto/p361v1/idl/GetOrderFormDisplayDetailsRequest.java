package com.robinhood.prediction_markets.proto.p361v1.idl;

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
import rosetta.mainst.PositionEffect;

/* compiled from: GetOrderFormDisplayDetailsRequest.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequest;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "yes_no_from_contract_element", "Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;", "position_effect", "Lrosetta/mainst/PositionEffect;", "order_form_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;Lrosetta/mainst/PositionEffect;Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormType;Lokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getYes_no_from_contract_element", "()Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;", "getPosition_effect", "()Lrosetta/mainst/PositionEffect;", "getOrder_form_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GetOrderFormDisplayDetailsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetOrderFormDisplayDetailsRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.OrderFormType#ADAPTER", jsonName = "orderFormType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final OrderFormType order_form_type;

    @WireField(adapter = "rosetta.mainst.PositionEffect#ADAPTER", jsonName = "positionEffect", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PositionEffect position_effect;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.YesNo#ADAPTER", jsonName = "yesNoFromContractElement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final YesNo yes_no_from_contract_element;

    public GetOrderFormDisplayDetailsRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23816newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public /* synthetic */ GetOrderFormDisplayDetailsRequest(String str, YesNo yesNo, PositionEffect positionEffect, OrderFormType orderFormType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? YesNo.YESNO_UNSPECIFIED : yesNo, (i & 4) != 0 ? PositionEffect.POSITION_EFFECT_UNSPECIFIED : positionEffect, (i & 8) != 0 ? OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED : orderFormType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final YesNo getYes_no_from_contract_element() {
        return this.yes_no_from_contract_element;
    }

    public final PositionEffect getPosition_effect() {
        return this.position_effect;
    }

    public final OrderFormType getOrder_form_type() {
        return this.order_form_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrderFormDisplayDetailsRequest(String contract_id, YesNo yes_no_from_contract_element, PositionEffect position_effect, OrderFormType order_form_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(yes_no_from_contract_element, "yes_no_from_contract_element");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.yes_no_from_contract_element = yes_no_from_contract_element;
        this.position_effect = position_effect;
        this.order_form_type = order_form_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23816newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetOrderFormDisplayDetailsRequest)) {
            return false;
        }
        GetOrderFormDisplayDetailsRequest getOrderFormDisplayDetailsRequest = (GetOrderFormDisplayDetailsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getOrderFormDisplayDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.contract_id, getOrderFormDisplayDetailsRequest.contract_id) && this.yes_no_from_contract_element == getOrderFormDisplayDetailsRequest.yes_no_from_contract_element && this.position_effect == getOrderFormDisplayDetailsRequest.position_effect && this.order_form_type == getOrderFormDisplayDetailsRequest.order_form_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.yes_no_from_contract_element.hashCode()) * 37) + this.position_effect.hashCode()) * 37) + this.order_form_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("yes_no_from_contract_element=" + this.yes_no_from_contract_element);
        arrayList.add("position_effect=" + this.position_effect);
        arrayList.add("order_form_type=" + this.order_form_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOrderFormDisplayDetailsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetOrderFormDisplayDetailsRequest copy$default(GetOrderFormDisplayDetailsRequest getOrderFormDisplayDetailsRequest, String str, YesNo yesNo, PositionEffect positionEffect, OrderFormType orderFormType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getOrderFormDisplayDetailsRequest.contract_id;
        }
        if ((i & 2) != 0) {
            yesNo = getOrderFormDisplayDetailsRequest.yes_no_from_contract_element;
        }
        if ((i & 4) != 0) {
            positionEffect = getOrderFormDisplayDetailsRequest.position_effect;
        }
        if ((i & 8) != 0) {
            orderFormType = getOrderFormDisplayDetailsRequest.order_form_type;
        }
        if ((i & 16) != 0) {
            byteString = getOrderFormDisplayDetailsRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        PositionEffect positionEffect2 = positionEffect;
        return getOrderFormDisplayDetailsRequest.copy(str, yesNo, positionEffect2, orderFormType, byteString2);
    }

    public final GetOrderFormDisplayDetailsRequest copy(String contract_id, YesNo yes_no_from_contract_element, PositionEffect position_effect, OrderFormType order_form_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(yes_no_from_contract_element, "yes_no_from_contract_element");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetOrderFormDisplayDetailsRequest(contract_id, yes_no_from_contract_element, position_effect, order_form_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetOrderFormDisplayDetailsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetOrderFormDisplayDetailsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetOrderFormDisplayDetailsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetOrderFormDisplayDetailsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                if (value.getYes_no_from_contract_element() != YesNo.YESNO_UNSPECIFIED) {
                    size += YesNo.ADAPTER.encodedSizeWithTag(2, value.getYes_no_from_contract_element());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    size += PositionEffect.ADAPTER.encodedSizeWithTag(3, value.getPosition_effect());
                }
                return value.getOrder_form_type() != OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED ? size + OrderFormType.ADAPTER.encodedSizeWithTag(4, value.getOrder_form_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetOrderFormDisplayDetailsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (value.getYes_no_from_contract_element() != YesNo.YESNO_UNSPECIFIED) {
                    YesNo.ADAPTER.encodeWithTag(writer, 2, (int) value.getYes_no_from_contract_element());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 3, (int) value.getPosition_effect());
                }
                if (value.getOrder_form_type() != OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED) {
                    OrderFormType.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_form_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetOrderFormDisplayDetailsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrder_form_type() != OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED) {
                    OrderFormType.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_form_type());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 3, (int) value.getPosition_effect());
                }
                if (value.getYes_no_from_contract_element() != YesNo.YESNO_UNSPECIFIED) {
                    YesNo.ADAPTER.encodeWithTag(writer, 2, (int) value.getYes_no_from_contract_element());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetOrderFormDisplayDetailsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                YesNo yesNoDecode = YesNo.YESNO_UNSPECIFIED;
                PositionEffect positionEffect = PositionEffect.POSITION_EFFECT_UNSPECIFIED;
                OrderFormType orderFormType = OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                OrderFormType orderFormTypeDecode = orderFormType;
                PositionEffect positionEffectDecode = positionEffect;
                while (true) {
                    YesNo yesNo = yesNoDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetOrderFormDisplayDetailsRequest(strDecode, yesNo, positionEffectDecode, orderFormTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                yesNoDecode = YesNo.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                positionEffectDecode = PositionEffect.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 4) {
                            try {
                                orderFormTypeDecode = OrderFormType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetOrderFormDisplayDetailsRequest redact(GetOrderFormDisplayDetailsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetOrderFormDisplayDetailsRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
