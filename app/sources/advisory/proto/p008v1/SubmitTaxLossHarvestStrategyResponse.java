package advisory.proto.p008v1;

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

/* compiled from: SubmitTaxLossHarvestStrategyResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Ladvisory/proto/v1/SubmitTaxLossHarvestStrategyResponse;", "Lcom/squareup/wire/Message;", "", "celebration", "Ladvisory/proto/v1/TaxLossHarvestStrategyCelebration;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestStrategyCelebration;Lokio/ByteString;)V", "getCelebration", "()Ladvisory/proto/v1/TaxLossHarvestStrategyCelebration;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SubmitTaxLossHarvestStrategyResponse extends Message {

    @JvmField
    public static final ProtoAdapter<SubmitTaxLossHarvestStrategyResponse> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategyCelebration#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TaxLossHarvestStrategyCelebration celebration;

    /* JADX WARN: Multi-variable type inference failed */
    public SubmitTaxLossHarvestStrategyResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4544newBuilder();
    }

    public final TaxLossHarvestStrategyCelebration getCelebration() {
        return this.celebration;
    }

    public /* synthetic */ SubmitTaxLossHarvestStrategyResponse(TaxLossHarvestStrategyCelebration taxLossHarvestStrategyCelebration, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : taxLossHarvestStrategyCelebration, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitTaxLossHarvestStrategyResponse(TaxLossHarvestStrategyCelebration taxLossHarvestStrategyCelebration, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.celebration = taxLossHarvestStrategyCelebration;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4544newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubmitTaxLossHarvestStrategyResponse)) {
            return false;
        }
        SubmitTaxLossHarvestStrategyResponse submitTaxLossHarvestStrategyResponse = (SubmitTaxLossHarvestStrategyResponse) other;
        return Intrinsics.areEqual(unknownFields(), submitTaxLossHarvestStrategyResponse.unknownFields()) && Intrinsics.areEqual(this.celebration, submitTaxLossHarvestStrategyResponse.celebration);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        TaxLossHarvestStrategyCelebration taxLossHarvestStrategyCelebration = this.celebration;
        int iHashCode2 = iHashCode + (taxLossHarvestStrategyCelebration != null ? taxLossHarvestStrategyCelebration.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TaxLossHarvestStrategyCelebration taxLossHarvestStrategyCelebration = this.celebration;
        if (taxLossHarvestStrategyCelebration != null) {
            arrayList.add("celebration=" + taxLossHarvestStrategyCelebration);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitTaxLossHarvestStrategyResponse{", "}", 0, null, null, 56, null);
    }

    public final SubmitTaxLossHarvestStrategyResponse copy(TaxLossHarvestStrategyCelebration celebration, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubmitTaxLossHarvestStrategyResponse(celebration, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubmitTaxLossHarvestStrategyResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubmitTaxLossHarvestStrategyResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.SubmitTaxLossHarvestStrategyResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubmitTaxLossHarvestStrategyResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getCelebration() != null ? size + TaxLossHarvestStrategyCelebration.ADAPTER.encodedSizeWithTag(1, value.getCelebration()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubmitTaxLossHarvestStrategyResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCelebration() != null) {
                    TaxLossHarvestStrategyCelebration.ADAPTER.encodeWithTag(writer, 1, (int) value.getCelebration());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubmitTaxLossHarvestStrategyResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCelebration() != null) {
                    TaxLossHarvestStrategyCelebration.ADAPTER.encodeWithTag(writer, 1, (int) value.getCelebration());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubmitTaxLossHarvestStrategyResponse redact(SubmitTaxLossHarvestStrategyResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TaxLossHarvestStrategyCelebration celebration = value.getCelebration();
                return value.copy(celebration != null ? TaxLossHarvestStrategyCelebration.ADAPTER.redact(celebration) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SubmitTaxLossHarvestStrategyResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                TaxLossHarvestStrategyCelebration taxLossHarvestStrategyCelebrationDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SubmitTaxLossHarvestStrategyResponse(taxLossHarvestStrategyCelebrationDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        taxLossHarvestStrategyCelebrationDecode = TaxLossHarvestStrategyCelebration.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
