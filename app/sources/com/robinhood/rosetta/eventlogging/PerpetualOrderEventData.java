package com.robinhood.rosetta.eventlogging;

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

/* compiled from: PerpetualOrderEventData.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventData;", "Lcom/squareup/wire/Message;", "", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "payload", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayload;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OrderFormStep;Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayload;Lokio/ByteString;)V", "getStep", "()Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "getPayload", "()Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayload;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PerpetualOrderEventData extends Message {

    @JvmField
    public static final ProtoAdapter<PerpetualOrderEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualOrderPayload#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PerpetualOrderPayload payload;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OrderFormStep#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OrderFormStep step;

    public PerpetualOrderEventData() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24490newBuilder();
    }

    public final OrderFormStep getStep() {
        return this.step;
    }

    public /* synthetic */ PerpetualOrderEventData(OrderFormStep orderFormStep, PerpetualOrderPayload perpetualOrderPayload, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED : orderFormStep, (i & 2) != 0 ? null : perpetualOrderPayload, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PerpetualOrderPayload getPayload() {
        return this.payload;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualOrderEventData(OrderFormStep step, PerpetualOrderPayload perpetualOrderPayload, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.step = step;
        this.payload = perpetualOrderPayload;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24490newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerpetualOrderEventData)) {
            return false;
        }
        PerpetualOrderEventData perpetualOrderEventData = (PerpetualOrderEventData) other;
        return Intrinsics.areEqual(unknownFields(), perpetualOrderEventData.unknownFields()) && this.step == perpetualOrderEventData.step && Intrinsics.areEqual(this.payload, perpetualOrderEventData.payload);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.step.hashCode()) * 37;
        PerpetualOrderPayload perpetualOrderPayload = this.payload;
        int iHashCode2 = iHashCode + (perpetualOrderPayload != null ? perpetualOrderPayload.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("step=" + this.step);
        PerpetualOrderPayload perpetualOrderPayload = this.payload;
        if (perpetualOrderPayload != null) {
            arrayList.add("payload=" + perpetualOrderPayload);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerpetualOrderEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PerpetualOrderEventData copy$default(PerpetualOrderEventData perpetualOrderEventData, OrderFormStep orderFormStep, PerpetualOrderPayload perpetualOrderPayload, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            orderFormStep = perpetualOrderEventData.step;
        }
        if ((i & 2) != 0) {
            perpetualOrderPayload = perpetualOrderEventData.payload;
        }
        if ((i & 4) != 0) {
            byteString = perpetualOrderEventData.unknownFields();
        }
        return perpetualOrderEventData.copy(orderFormStep, perpetualOrderPayload, byteString);
    }

    public final PerpetualOrderEventData copy(OrderFormStep step, PerpetualOrderPayload payload, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PerpetualOrderEventData(step, payload, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerpetualOrderEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PerpetualOrderEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerpetualOrderEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PerpetualOrderEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    size += OrderFormStep.ADAPTER.encodedSizeWithTag(1, value.getStep());
                }
                return value.getPayload() != null ? size + PerpetualOrderPayload.ADAPTER.encodedSizeWithTag(2, value.getPayload()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PerpetualOrderEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    OrderFormStep.ADAPTER.encodeWithTag(writer, 1, (int) value.getStep());
                }
                if (value.getPayload() != null) {
                    PerpetualOrderPayload.ADAPTER.encodeWithTag(writer, 2, (int) value.getPayload());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PerpetualOrderEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPayload() != null) {
                    PerpetualOrderPayload.ADAPTER.encodeWithTag(writer, 2, (int) value.getPayload());
                }
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    OrderFormStep.ADAPTER.encodeWithTag(writer, 1, (int) value.getStep());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PerpetualOrderEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderFormStep orderFormStepDecode = OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                PerpetualOrderPayload perpetualOrderPayloadDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PerpetualOrderEventData(orderFormStepDecode, perpetualOrderPayloadDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            orderFormStepDecode = OrderFormStep.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        perpetualOrderPayloadDecode = PerpetualOrderPayload.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerpetualOrderEventData redact(PerpetualOrderEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PerpetualOrderPayload payload = value.getPayload();
                return PerpetualOrderEventData.copy$default(value, null, payload != null ? PerpetualOrderPayload.ADAPTER.redact(payload) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
