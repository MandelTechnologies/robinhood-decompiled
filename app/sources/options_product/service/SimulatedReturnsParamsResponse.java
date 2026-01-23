package options_product.service;

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

/* compiled from: SimulatedReturnsParamsResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/SimulatedReturnsParamsResponse;", "Lcom/squareup/wire/Message;", "", "pricing_model_used", "", "param_responses", "", "Loptions_product/service/SimulatedReturnsParams;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getPricing_model_used", "()Ljava/lang/String;", "getParam_responses", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class SimulatedReturnsParamsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<SimulatedReturnsParamsResponse> ADAPTER;

    @WireField(adapter = "options_product.service.SimulatedReturnsParams#ADAPTER", jsonName = "paramResponses", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<SimulatedReturnsParams> param_responses;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pricingModelUsed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String pricing_model_used;

    public SimulatedReturnsParamsResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29563newBuilder();
    }

    public final String getPricing_model_used() {
        return this.pricing_model_used;
    }

    public /* synthetic */ SimulatedReturnsParamsResponse(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimulatedReturnsParamsResponse(String pricing_model_used, List<SimulatedReturnsParams> param_responses, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(pricing_model_used, "pricing_model_used");
        Intrinsics.checkNotNullParameter(param_responses, "param_responses");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.pricing_model_used = pricing_model_used;
        this.param_responses = Internal.immutableCopyOf("param_responses", param_responses);
    }

    public final List<SimulatedReturnsParams> getParam_responses() {
        return this.param_responses;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29563newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SimulatedReturnsParamsResponse)) {
            return false;
        }
        SimulatedReturnsParamsResponse simulatedReturnsParamsResponse = (SimulatedReturnsParamsResponse) other;
        return Intrinsics.areEqual(unknownFields(), simulatedReturnsParamsResponse.unknownFields()) && Intrinsics.areEqual(this.pricing_model_used, simulatedReturnsParamsResponse.pricing_model_used) && Intrinsics.areEqual(this.param_responses, simulatedReturnsParamsResponse.param_responses);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.pricing_model_used.hashCode()) * 37) + this.param_responses.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("pricing_model_used=" + Internal.sanitize(this.pricing_model_used));
        if (!this.param_responses.isEmpty()) {
            arrayList.add("param_responses=" + this.param_responses);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SimulatedReturnsParamsResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimulatedReturnsParamsResponse copy$default(SimulatedReturnsParamsResponse simulatedReturnsParamsResponse, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simulatedReturnsParamsResponse.pricing_model_used;
        }
        if ((i & 2) != 0) {
            list = simulatedReturnsParamsResponse.param_responses;
        }
        if ((i & 4) != 0) {
            byteString = simulatedReturnsParamsResponse.unknownFields();
        }
        return simulatedReturnsParamsResponse.copy(str, list, byteString);
    }

    public final SimulatedReturnsParamsResponse copy(String pricing_model_used, List<SimulatedReturnsParams> param_responses, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(pricing_model_used, "pricing_model_used");
        Intrinsics.checkNotNullParameter(param_responses, "param_responses");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SimulatedReturnsParamsResponse(pricing_model_used, param_responses, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SimulatedReturnsParamsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SimulatedReturnsParamsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.SimulatedReturnsParamsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SimulatedReturnsParamsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPricing_model_used(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPricing_model_used());
                }
                return size + SimulatedReturnsParams.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getParam_responses());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SimulatedReturnsParamsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPricing_model_used(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPricing_model_used());
                }
                SimulatedReturnsParams.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getParam_responses());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SimulatedReturnsParamsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SimulatedReturnsParams.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getParam_responses());
                if (Intrinsics.areEqual(value.getPricing_model_used(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPricing_model_used());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SimulatedReturnsParamsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SimulatedReturnsParamsResponse(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(SimulatedReturnsParams.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SimulatedReturnsParamsResponse redact(SimulatedReturnsParamsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SimulatedReturnsParamsResponse.copy$default(value, null, Internal.m26823redactElements(value.getParam_responses(), SimulatedReturnsParams.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
