package bff_money_movement.service.p019v1;

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

/* compiled from: InstrumentRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m3636d2 = {"Lbff_money_movement/service/v1/InstrumentRequest;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "instrument_type", "Lbff_money_movement/service/v1/PaymentInstrumentType;", "priority", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/PaymentInstrumentType;ILokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getInstrument_type", "()Lbff_money_movement/service/v1/PaymentInstrumentType;", "getPriority", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class InstrumentRequest extends Message {

    @JvmField
    public static final ProtoAdapter<InstrumentRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "bff_money_movement.service.v1.PaymentInstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PaymentInstrumentType instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int priority;

    public InstrumentRequest() {
        this(null, null, 0, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8439newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public /* synthetic */ InstrumentRequest(String str, PaymentInstrumentType paymentInstrumentType, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? PaymentInstrumentType.INSTRUMENT_UNSPECIFIED : paymentInstrumentType, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PaymentInstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    public final int getPriority() {
        return this.priority;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentRequest(String instrument_id, PaymentInstrumentType instrument_type, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.instrument_type = instrument_type;
        this.priority = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8439newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InstrumentRequest)) {
            return false;
        }
        InstrumentRequest instrumentRequest = (InstrumentRequest) other;
        return Intrinsics.areEqual(unknownFields(), instrumentRequest.unknownFields()) && Intrinsics.areEqual(this.instrument_id, instrumentRequest.instrument_id) && this.instrument_type == instrumentRequest.instrument_type && this.priority == instrumentRequest.priority;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.instrument_type.hashCode()) * 37) + Integer.hashCode(this.priority);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("instrument_type=" + this.instrument_type);
        arrayList.add("priority=" + this.priority);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InstrumentRequest copy$default(InstrumentRequest instrumentRequest, String str, PaymentInstrumentType paymentInstrumentType, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = instrumentRequest.instrument_id;
        }
        if ((i2 & 2) != 0) {
            paymentInstrumentType = instrumentRequest.instrument_type;
        }
        if ((i2 & 4) != 0) {
            i = instrumentRequest.priority;
        }
        if ((i2 & 8) != 0) {
            byteString = instrumentRequest.unknownFields();
        }
        return instrumentRequest.copy(str, paymentInstrumentType, i, byteString);
    }

    public final InstrumentRequest copy(String instrument_id, PaymentInstrumentType instrument_type, int priority, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InstrumentRequest(instrument_id, instrument_type, priority, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InstrumentRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InstrumentRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InstrumentRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InstrumentRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (value.getInstrument_type() != PaymentInstrumentType.INSTRUMENT_UNSPECIFIED) {
                    size += PaymentInstrumentType.ADAPTER.encodedSizeWithTag(2, value.getInstrument_type());
                }
                return value.getPriority() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getPriority())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstrumentRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (value.getInstrument_type() != PaymentInstrumentType.INSTRUMENT_UNSPECIFIED) {
                    PaymentInstrumentType.ADAPTER.encodeWithTag(writer, 2, (int) value.getInstrument_type());
                }
                if (value.getPriority() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getPriority()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstrumentRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPriority() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getPriority()));
                }
                if (value.getInstrument_type() != PaymentInstrumentType.INSTRUMENT_UNSPECIFIED) {
                    PaymentInstrumentType.ADAPTER.encodeWithTag(writer, 2, (int) value.getInstrument_type());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PaymentInstrumentType paymentInstrumentTypeDecode = PaymentInstrumentType.INSTRUMENT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InstrumentRequest(strDecode, paymentInstrumentTypeDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            paymentInstrumentTypeDecode = PaymentInstrumentType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentRequest redact(InstrumentRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InstrumentRequest.copy$default(value, null, null, 0, ByteString.EMPTY, 7, null);
            }
        };
    }
}
