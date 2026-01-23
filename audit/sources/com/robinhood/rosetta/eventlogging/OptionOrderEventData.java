package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.Constants;
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

/* compiled from: OptionOrderEventData.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderEventData;", "Lcom/squareup/wire/Message;", "", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "payload", "Lcom/robinhood/rosetta/eventlogging/OptionOrderPayload;", Constants.REFERRER_API_META, "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OrderFormStep;Lcom/robinhood/rosetta/eventlogging/OptionOrderPayload;Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta;Lokio/ByteString;)V", "getStep", "()Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "getPayload", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderPayload;", "getMeta", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionOrderEventData extends Message {

    @JvmField
    public static final ProtoAdapter<OptionOrderEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionOrderMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final OptionOrderMeta meta;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionOrderPayload#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OptionOrderPayload payload;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OrderFormStep#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OrderFormStep step;

    public OptionOrderEventData() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24430newBuilder();
    }

    public final OrderFormStep getStep() {
        return this.step;
    }

    public /* synthetic */ OptionOrderEventData(OrderFormStep orderFormStep, OptionOrderPayload optionOrderPayload, OptionOrderMeta optionOrderMeta, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED : orderFormStep, (i & 2) != 0 ? null : optionOrderPayload, (i & 4) != 0 ? null : optionOrderMeta, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final OptionOrderPayload getPayload() {
        return this.payload;
    }

    public final OptionOrderMeta getMeta() {
        return this.meta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderEventData(OrderFormStep step, OptionOrderPayload optionOrderPayload, OptionOrderMeta optionOrderMeta, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.step = step;
        this.payload = optionOrderPayload;
        this.meta = optionOrderMeta;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24430newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionOrderEventData)) {
            return false;
        }
        OptionOrderEventData optionOrderEventData = (OptionOrderEventData) other;
        return Intrinsics.areEqual(unknownFields(), optionOrderEventData.unknownFields()) && this.step == optionOrderEventData.step && Intrinsics.areEqual(this.payload, optionOrderEventData.payload) && Intrinsics.areEqual(this.meta, optionOrderEventData.meta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.step.hashCode()) * 37;
        OptionOrderPayload optionOrderPayload = this.payload;
        int iHashCode2 = (iHashCode + (optionOrderPayload != null ? optionOrderPayload.hashCode() : 0)) * 37;
        OptionOrderMeta optionOrderMeta = this.meta;
        int iHashCode3 = iHashCode2 + (optionOrderMeta != null ? optionOrderMeta.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("step=" + this.step);
        OptionOrderPayload optionOrderPayload = this.payload;
        if (optionOrderPayload != null) {
            arrayList.add("payload=" + optionOrderPayload);
        }
        OptionOrderMeta optionOrderMeta = this.meta;
        if (optionOrderMeta != null) {
            arrayList.add("meta=" + optionOrderMeta);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionOrderEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionOrderEventData copy$default(OptionOrderEventData optionOrderEventData, OrderFormStep orderFormStep, OptionOrderPayload optionOrderPayload, OptionOrderMeta optionOrderMeta, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            orderFormStep = optionOrderEventData.step;
        }
        if ((i & 2) != 0) {
            optionOrderPayload = optionOrderEventData.payload;
        }
        if ((i & 4) != 0) {
            optionOrderMeta = optionOrderEventData.meta;
        }
        if ((i & 8) != 0) {
            byteString = optionOrderEventData.unknownFields();
        }
        return optionOrderEventData.copy(orderFormStep, optionOrderPayload, optionOrderMeta, byteString);
    }

    public final OptionOrderEventData copy(OrderFormStep step, OptionOrderPayload payload, OptionOrderMeta meta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionOrderEventData(step, payload, meta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionOrderEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionOrderEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionOrderEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionOrderEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    size += OrderFormStep.ADAPTER.encodedSizeWithTag(1, value.getStep());
                }
                if (value.getPayload() != null) {
                    size += OptionOrderPayload.ADAPTER.encodedSizeWithTag(2, value.getPayload());
                }
                return value.getMeta() != null ? size + OptionOrderMeta.ADAPTER.encodedSizeWithTag(3, value.getMeta()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionOrderEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    OrderFormStep.ADAPTER.encodeWithTag(writer, 1, (int) value.getStep());
                }
                if (value.getPayload() != null) {
                    OptionOrderPayload.ADAPTER.encodeWithTag(writer, 2, (int) value.getPayload());
                }
                if (value.getMeta() != null) {
                    OptionOrderMeta.ADAPTER.encodeWithTag(writer, 3, (int) value.getMeta());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionOrderEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMeta() != null) {
                    OptionOrderMeta.ADAPTER.encodeWithTag(writer, 3, (int) value.getMeta());
                }
                if (value.getPayload() != null) {
                    OptionOrderPayload.ADAPTER.encodeWithTag(writer, 2, (int) value.getPayload());
                }
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    OrderFormStep.ADAPTER.encodeWithTag(writer, 1, (int) value.getStep());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderFormStep orderFormStepDecode = OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                OptionOrderPayload optionOrderPayloadDecode = null;
                OptionOrderMeta optionOrderMetaDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OptionOrderEventData(orderFormStepDecode, optionOrderPayloadDecode, optionOrderMetaDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            orderFormStepDecode = OrderFormStep.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        optionOrderPayloadDecode = OptionOrderPayload.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        optionOrderMetaDecode = OptionOrderMeta.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderEventData redact(OptionOrderEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                OptionOrderPayload payload = value.getPayload();
                OptionOrderPayload optionOrderPayloadRedact = payload != null ? OptionOrderPayload.ADAPTER.redact(payload) : null;
                OptionOrderMeta meta = value.getMeta();
                return OptionOrderEventData.copy$default(value, null, optionOrderPayloadRedact, meta != null ? OptionOrderMeta.ADAPTER.redact(meta) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
