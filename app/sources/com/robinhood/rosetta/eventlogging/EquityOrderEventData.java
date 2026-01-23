package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.Constants;
import com.plaid.internal.EnumC7081g;
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

/* compiled from: EquityOrderEventData.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016JZ\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderEventData;", "Lcom/squareup/wire/Message;", "", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "payload", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", Constants.REFERRER_API_META, "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta;", "order_check_data", "Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckData;", "order_check_action_data", "Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckActionData;", "executions", "", "Lcom/robinhood/rosetta/eventlogging/EquityOrderExecutionData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OrderFormStep;Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta;Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckData;Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckActionData;Ljava/util/List;Lokio/ByteString;)V", "getStep", "()Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "getPayload", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", "getMeta", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta;", "getOrder_check_data", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckData;", "getOrder_check_action_data", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckActionData;", "getExecutions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class EquityOrderEventData extends Message {

    @JvmField
    public static final ProtoAdapter<EquityOrderEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EquityOrderExecutionData#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final java.util.List<EquityOrderExecutionData> executions;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EquityOrderMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final EquityOrderMeta meta;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EquityOrderCheckActionData#ADAPTER", jsonName = "orderCheckActionData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final EquityOrderCheckActionData order_check_action_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EquityOrderCheckData#ADAPTER", jsonName = "orderCheckData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final EquityOrderCheckData order_check_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EquityOrderPayload#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EquityOrderPayload payload;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OrderFormStep#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OrderFormStep step;

    public EquityOrderEventData() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24247newBuilder();
    }

    public final OrderFormStep getStep() {
        return this.step;
    }

    public /* synthetic */ EquityOrderEventData(OrderFormStep orderFormStep, EquityOrderPayload equityOrderPayload, EquityOrderMeta equityOrderMeta, EquityOrderCheckData equityOrderCheckData, EquityOrderCheckActionData equityOrderCheckActionData, java.util.List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED : orderFormStep, (i & 2) != 0 ? null : equityOrderPayload, (i & 4) != 0 ? null : equityOrderMeta, (i & 8) != 0 ? null : equityOrderCheckData, (i & 16) != 0 ? null : equityOrderCheckActionData, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final EquityOrderPayload getPayload() {
        return this.payload;
    }

    public final EquityOrderMeta getMeta() {
        return this.meta;
    }

    public final EquityOrderCheckData getOrder_check_data() {
        return this.order_check_data;
    }

    public final EquityOrderCheckActionData getOrder_check_action_data() {
        return this.order_check_action_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderEventData(OrderFormStep step, EquityOrderPayload equityOrderPayload, EquityOrderMeta equityOrderMeta, EquityOrderCheckData equityOrderCheckData, EquityOrderCheckActionData equityOrderCheckActionData, java.util.List<EquityOrderExecutionData> executions, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(executions, "executions");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.step = step;
        this.payload = equityOrderPayload;
        this.meta = equityOrderMeta;
        this.order_check_data = equityOrderCheckData;
        this.order_check_action_data = equityOrderCheckActionData;
        this.executions = Internal.immutableCopyOf("executions", executions);
    }

    public final java.util.List<EquityOrderExecutionData> getExecutions() {
        return this.executions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24247newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EquityOrderEventData)) {
            return false;
        }
        EquityOrderEventData equityOrderEventData = (EquityOrderEventData) other;
        return Intrinsics.areEqual(unknownFields(), equityOrderEventData.unknownFields()) && this.step == equityOrderEventData.step && Intrinsics.areEqual(this.payload, equityOrderEventData.payload) && Intrinsics.areEqual(this.meta, equityOrderEventData.meta) && Intrinsics.areEqual(this.order_check_data, equityOrderEventData.order_check_data) && Intrinsics.areEqual(this.order_check_action_data, equityOrderEventData.order_check_action_data) && Intrinsics.areEqual(this.executions, equityOrderEventData.executions);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.step.hashCode()) * 37;
        EquityOrderPayload equityOrderPayload = this.payload;
        int iHashCode2 = (iHashCode + (equityOrderPayload != null ? equityOrderPayload.hashCode() : 0)) * 37;
        EquityOrderMeta equityOrderMeta = this.meta;
        int iHashCode3 = (iHashCode2 + (equityOrderMeta != null ? equityOrderMeta.hashCode() : 0)) * 37;
        EquityOrderCheckData equityOrderCheckData = this.order_check_data;
        int iHashCode4 = (iHashCode3 + (equityOrderCheckData != null ? equityOrderCheckData.hashCode() : 0)) * 37;
        EquityOrderCheckActionData equityOrderCheckActionData = this.order_check_action_data;
        int iHashCode5 = ((iHashCode4 + (equityOrderCheckActionData != null ? equityOrderCheckActionData.hashCode() : 0)) * 37) + this.executions.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("step=" + this.step);
        EquityOrderPayload equityOrderPayload = this.payload;
        if (equityOrderPayload != null) {
            arrayList.add("payload=" + equityOrderPayload);
        }
        EquityOrderMeta equityOrderMeta = this.meta;
        if (equityOrderMeta != null) {
            arrayList.add("meta=" + equityOrderMeta);
        }
        EquityOrderCheckData equityOrderCheckData = this.order_check_data;
        if (equityOrderCheckData != null) {
            arrayList.add("order_check_data=" + equityOrderCheckData);
        }
        EquityOrderCheckActionData equityOrderCheckActionData = this.order_check_action_data;
        if (equityOrderCheckActionData != null) {
            arrayList.add("order_check_action_data=" + equityOrderCheckActionData);
        }
        if (!this.executions.isEmpty()) {
            arrayList.add("executions=" + this.executions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EquityOrderEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EquityOrderEventData copy$default(EquityOrderEventData equityOrderEventData, OrderFormStep orderFormStep, EquityOrderPayload equityOrderPayload, EquityOrderMeta equityOrderMeta, EquityOrderCheckData equityOrderCheckData, EquityOrderCheckActionData equityOrderCheckActionData, java.util.List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            orderFormStep = equityOrderEventData.step;
        }
        if ((i & 2) != 0) {
            equityOrderPayload = equityOrderEventData.payload;
        }
        if ((i & 4) != 0) {
            equityOrderMeta = equityOrderEventData.meta;
        }
        if ((i & 8) != 0) {
            equityOrderCheckData = equityOrderEventData.order_check_data;
        }
        if ((i & 16) != 0) {
            equityOrderCheckActionData = equityOrderEventData.order_check_action_data;
        }
        if ((i & 32) != 0) {
            list = equityOrderEventData.executions;
        }
        if ((i & 64) != 0) {
            byteString = equityOrderEventData.unknownFields();
        }
        java.util.List list2 = list;
        ByteString byteString2 = byteString;
        EquityOrderCheckActionData equityOrderCheckActionData2 = equityOrderCheckActionData;
        EquityOrderMeta equityOrderMeta2 = equityOrderMeta;
        return equityOrderEventData.copy(orderFormStep, equityOrderPayload, equityOrderMeta2, equityOrderCheckData, equityOrderCheckActionData2, list2, byteString2);
    }

    public final EquityOrderEventData copy(OrderFormStep step, EquityOrderPayload payload, EquityOrderMeta meta, EquityOrderCheckData order_check_data, EquityOrderCheckActionData order_check_action_data, java.util.List<EquityOrderExecutionData> executions, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(executions, "executions");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EquityOrderEventData(step, payload, meta, order_check_data, order_check_action_data, executions, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquityOrderEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EquityOrderEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EquityOrderEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EquityOrderEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    size += OrderFormStep.ADAPTER.encodedSizeWithTag(1, value.getStep());
                }
                if (value.getPayload() != null) {
                    size += EquityOrderPayload.ADAPTER.encodedSizeWithTag(2, value.getPayload());
                }
                if (value.getMeta() != null) {
                    size += EquityOrderMeta.ADAPTER.encodedSizeWithTag(3, value.getMeta());
                }
                if (value.getOrder_check_data() != null) {
                    size += EquityOrderCheckData.ADAPTER.encodedSizeWithTag(4, value.getOrder_check_data());
                }
                if (value.getOrder_check_action_data() != null) {
                    size += EquityOrderCheckActionData.ADAPTER.encodedSizeWithTag(5, value.getOrder_check_action_data());
                }
                return size + EquityOrderExecutionData.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getExecutions());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EquityOrderEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    OrderFormStep.ADAPTER.encodeWithTag(writer, 1, (int) value.getStep());
                }
                if (value.getPayload() != null) {
                    EquityOrderPayload.ADAPTER.encodeWithTag(writer, 2, (int) value.getPayload());
                }
                if (value.getMeta() != null) {
                    EquityOrderMeta.ADAPTER.encodeWithTag(writer, 3, (int) value.getMeta());
                }
                if (value.getOrder_check_data() != null) {
                    EquityOrderCheckData.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_check_data());
                }
                if (value.getOrder_check_action_data() != null) {
                    EquityOrderCheckActionData.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_check_action_data());
                }
                EquityOrderExecutionData.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getExecutions());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EquityOrderEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                EquityOrderExecutionData.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getExecutions());
                if (value.getOrder_check_action_data() != null) {
                    EquityOrderCheckActionData.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_check_action_data());
                }
                if (value.getOrder_check_data() != null) {
                    EquityOrderCheckData.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_check_data());
                }
                if (value.getMeta() != null) {
                    EquityOrderMeta.ADAPTER.encodeWithTag(writer, 3, (int) value.getMeta());
                }
                if (value.getPayload() != null) {
                    EquityOrderPayload.ADAPTER.encodeWithTag(writer, 2, (int) value.getPayload());
                }
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    OrderFormStep.ADAPTER.encodeWithTag(writer, 1, (int) value.getStep());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EquityOrderEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderFormStep orderFormStepDecode = OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                EquityOrderPayload equityOrderPayloadDecode = null;
                EquityOrderMeta equityOrderMetaDecode = null;
                EquityOrderCheckData equityOrderCheckDataDecode = null;
                EquityOrderCheckActionData equityOrderCheckActionDataDecode = null;
                while (true) {
                    OrderFormStep orderFormStep = orderFormStepDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        orderFormStepDecode = OrderFormStep.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    equityOrderPayloadDecode = EquityOrderPayload.ADAPTER.decode(reader);
                                    break;
                                case 3:
                                    equityOrderMetaDecode = EquityOrderMeta.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    equityOrderCheckDataDecode = EquityOrderCheckData.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    equityOrderCheckActionDataDecode = EquityOrderCheckActionData.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    arrayList.add(EquityOrderExecutionData.ADAPTER.decode(reader));
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new EquityOrderEventData(orderFormStep, equityOrderPayloadDecode, equityOrderMetaDecode, equityOrderCheckDataDecode, equityOrderCheckActionDataDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EquityOrderEventData redact(EquityOrderEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                EquityOrderPayload payload = value.getPayload();
                EquityOrderPayload equityOrderPayloadRedact = payload != null ? EquityOrderPayload.ADAPTER.redact(payload) : null;
                EquityOrderMeta meta = value.getMeta();
                EquityOrderMeta equityOrderMetaRedact = meta != null ? EquityOrderMeta.ADAPTER.redact(meta) : null;
                EquityOrderCheckData order_check_data = value.getOrder_check_data();
                EquityOrderCheckData equityOrderCheckDataRedact = order_check_data != null ? EquityOrderCheckData.ADAPTER.redact(order_check_data) : null;
                EquityOrderCheckActionData order_check_action_data = value.getOrder_check_action_data();
                return EquityOrderEventData.copy$default(value, null, equityOrderPayloadRedact, equityOrderMetaRedact, equityOrderCheckDataRedact, order_check_action_data != null ? EquityOrderCheckActionData.ADAPTER.redact(order_check_action_data) : null, Internal.m26823redactElements(value.getExecutions(), EquityOrderExecutionData.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
