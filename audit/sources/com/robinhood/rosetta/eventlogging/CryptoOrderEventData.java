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

/* compiled from: CryptoOrderEventData.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventData;", "Lcom/squareup/wire/Message;", "", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "payload", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayload;", Constants.REFERRER_API_META, "Lcom/robinhood/rosetta/eventlogging/CryptoOrderMeta;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OrderFormStep;Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayload;Lcom/robinhood/rosetta/eventlogging/CryptoOrderMeta;Lokio/ByteString;)V", "getStep", "()Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "getPayload", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayload;", "getMeta", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderMeta;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoOrderEventData extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoOrderEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoOrderMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CryptoOrderMeta meta;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoOrderPayload#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CryptoOrderPayload payload;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OrderFormStep#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OrderFormStep step;

    public CryptoOrderEventData() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24155newBuilder();
    }

    public final OrderFormStep getStep() {
        return this.step;
    }

    public /* synthetic */ CryptoOrderEventData(OrderFormStep orderFormStep, CryptoOrderPayload cryptoOrderPayload, CryptoOrderMeta cryptoOrderMeta, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED : orderFormStep, (i & 2) != 0 ? null : cryptoOrderPayload, (i & 4) != 0 ? null : cryptoOrderMeta, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final CryptoOrderPayload getPayload() {
        return this.payload;
    }

    public final CryptoOrderMeta getMeta() {
        return this.meta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderEventData(OrderFormStep step, CryptoOrderPayload cryptoOrderPayload, CryptoOrderMeta cryptoOrderMeta, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.step = step;
        this.payload = cryptoOrderPayload;
        this.meta = cryptoOrderMeta;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24155newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoOrderEventData)) {
            return false;
        }
        CryptoOrderEventData cryptoOrderEventData = (CryptoOrderEventData) other;
        return Intrinsics.areEqual(unknownFields(), cryptoOrderEventData.unknownFields()) && this.step == cryptoOrderEventData.step && Intrinsics.areEqual(this.payload, cryptoOrderEventData.payload) && Intrinsics.areEqual(this.meta, cryptoOrderEventData.meta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.step.hashCode()) * 37;
        CryptoOrderPayload cryptoOrderPayload = this.payload;
        int iHashCode2 = (iHashCode + (cryptoOrderPayload != null ? cryptoOrderPayload.hashCode() : 0)) * 37;
        CryptoOrderMeta cryptoOrderMeta = this.meta;
        int iHashCode3 = iHashCode2 + (cryptoOrderMeta != null ? cryptoOrderMeta.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("step=" + this.step);
        CryptoOrderPayload cryptoOrderPayload = this.payload;
        if (cryptoOrderPayload != null) {
            arrayList.add("payload=" + cryptoOrderPayload);
        }
        CryptoOrderMeta cryptoOrderMeta = this.meta;
        if (cryptoOrderMeta != null) {
            arrayList.add("meta=" + cryptoOrderMeta);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoOrderEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoOrderEventData copy$default(CryptoOrderEventData cryptoOrderEventData, OrderFormStep orderFormStep, CryptoOrderPayload cryptoOrderPayload, CryptoOrderMeta cryptoOrderMeta, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            orderFormStep = cryptoOrderEventData.step;
        }
        if ((i & 2) != 0) {
            cryptoOrderPayload = cryptoOrderEventData.payload;
        }
        if ((i & 4) != 0) {
            cryptoOrderMeta = cryptoOrderEventData.meta;
        }
        if ((i & 8) != 0) {
            byteString = cryptoOrderEventData.unknownFields();
        }
        return cryptoOrderEventData.copy(orderFormStep, cryptoOrderPayload, cryptoOrderMeta, byteString);
    }

    public final CryptoOrderEventData copy(OrderFormStep step, CryptoOrderPayload payload, CryptoOrderMeta meta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoOrderEventData(step, payload, meta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoOrderEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoOrderEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoOrderEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    size += OrderFormStep.ADAPTER.encodedSizeWithTag(1, value.getStep());
                }
                if (value.getPayload() != null) {
                    size += CryptoOrderPayload.ADAPTER.encodedSizeWithTag(2, value.getPayload());
                }
                return value.getMeta() != null ? size + CryptoOrderMeta.ADAPTER.encodedSizeWithTag(3, value.getMeta()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoOrderEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    OrderFormStep.ADAPTER.encodeWithTag(writer, 1, (int) value.getStep());
                }
                if (value.getPayload() != null) {
                    CryptoOrderPayload.ADAPTER.encodeWithTag(writer, 2, (int) value.getPayload());
                }
                if (value.getMeta() != null) {
                    CryptoOrderMeta.ADAPTER.encodeWithTag(writer, 3, (int) value.getMeta());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoOrderEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMeta() != null) {
                    CryptoOrderMeta.ADAPTER.encodeWithTag(writer, 3, (int) value.getMeta());
                }
                if (value.getPayload() != null) {
                    CryptoOrderPayload.ADAPTER.encodeWithTag(writer, 2, (int) value.getPayload());
                }
                if (value.getStep() != OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED) {
                    OrderFormStep.ADAPTER.encodeWithTag(writer, 1, (int) value.getStep());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoOrderEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderFormStep orderFormStepDecode = OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                CryptoOrderPayload cryptoOrderPayloadDecode = null;
                CryptoOrderMeta cryptoOrderMetaDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CryptoOrderEventData(orderFormStepDecode, cryptoOrderPayloadDecode, cryptoOrderMetaDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            orderFormStepDecode = OrderFormStep.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        cryptoOrderPayloadDecode = CryptoOrderPayload.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        cryptoOrderMetaDecode = CryptoOrderMeta.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoOrderEventData redact(CryptoOrderEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CryptoOrderPayload payload = value.getPayload();
                CryptoOrderPayload cryptoOrderPayloadRedact = payload != null ? CryptoOrderPayload.ADAPTER.redact(payload) : null;
                CryptoOrderMeta meta = value.getMeta();
                return CryptoOrderEventData.copy$default(value, null, cryptoOrderPayloadRedact, meta != null ? CryptoOrderMeta.ADAPTER.redact(meta) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
