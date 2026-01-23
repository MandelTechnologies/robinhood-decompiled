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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CreateOrUpdatePaymentPreferenceRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/CreateOrUpdatePaymentPreferenceRequest;", "Lcom/squareup/wire/Message;", "", "payment_instrument_id", "", "instruments", "", "Lbff_money_movement/service/v1/InstrumentRequest;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getPayment_instrument_id", "()Ljava/lang/String;", "getInstruments", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class CreateOrUpdatePaymentPreferenceRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateOrUpdatePaymentPreferenceRequest> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InstrumentRequest#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<InstrumentRequest> instruments;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "paymentInstrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String payment_instrument_id;

    public CreateOrUpdatePaymentPreferenceRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8400newBuilder();
    }

    public final String getPayment_instrument_id() {
        return this.payment_instrument_id;
    }

    public /* synthetic */ CreateOrUpdatePaymentPreferenceRequest(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOrUpdatePaymentPreferenceRequest(String payment_instrument_id, List<InstrumentRequest> instruments, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(payment_instrument_id, "payment_instrument_id");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.payment_instrument_id = payment_instrument_id;
        this.instruments = Internal.immutableCopyOf("instruments", instruments);
    }

    public final List<InstrumentRequest> getInstruments() {
        return this.instruments;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8400newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateOrUpdatePaymentPreferenceRequest)) {
            return false;
        }
        CreateOrUpdatePaymentPreferenceRequest createOrUpdatePaymentPreferenceRequest = (CreateOrUpdatePaymentPreferenceRequest) other;
        return Intrinsics.areEqual(unknownFields(), createOrUpdatePaymentPreferenceRequest.unknownFields()) && Intrinsics.areEqual(this.payment_instrument_id, createOrUpdatePaymentPreferenceRequest.payment_instrument_id) && Intrinsics.areEqual(this.instruments, createOrUpdatePaymentPreferenceRequest.instruments);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.payment_instrument_id.hashCode()) * 37) + this.instruments.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("payment_instrument_id=" + Internal.sanitize(this.payment_instrument_id));
        if (!this.instruments.isEmpty()) {
            arrayList.add("instruments=" + this.instruments);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateOrUpdatePaymentPreferenceRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateOrUpdatePaymentPreferenceRequest copy$default(CreateOrUpdatePaymentPreferenceRequest createOrUpdatePaymentPreferenceRequest, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createOrUpdatePaymentPreferenceRequest.payment_instrument_id;
        }
        if ((i & 2) != 0) {
            list = createOrUpdatePaymentPreferenceRequest.instruments;
        }
        if ((i & 4) != 0) {
            byteString = createOrUpdatePaymentPreferenceRequest.unknownFields();
        }
        return createOrUpdatePaymentPreferenceRequest.copy(str, list, byteString);
    }

    public final CreateOrUpdatePaymentPreferenceRequest copy(String payment_instrument_id, List<InstrumentRequest> instruments, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(payment_instrument_id, "payment_instrument_id");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateOrUpdatePaymentPreferenceRequest(payment_instrument_id, instruments, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateOrUpdatePaymentPreferenceRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateOrUpdatePaymentPreferenceRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.CreateOrUpdatePaymentPreferenceRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateOrUpdatePaymentPreferenceRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPayment_instrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPayment_instrument_id());
                }
                return size + InstrumentRequest.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getInstruments());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateOrUpdatePaymentPreferenceRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPayment_instrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPayment_instrument_id());
                }
                InstrumentRequest.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getInstruments());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateOrUpdatePaymentPreferenceRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                InstrumentRequest.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getInstruments());
                if (Intrinsics.areEqual(value.getPayment_instrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPayment_instrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateOrUpdatePaymentPreferenceRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateOrUpdatePaymentPreferenceRequest(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(InstrumentRequest.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateOrUpdatePaymentPreferenceRequest redact(CreateOrUpdatePaymentPreferenceRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CreateOrUpdatePaymentPreferenceRequest.copy$default(value, null, Internal.m26823redactElements(value.getInstruments(), InstrumentRequest.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
