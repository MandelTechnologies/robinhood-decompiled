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

/* compiled from: GetTaxLossHarvestStrategiesResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponse;", "Lcom/squareup/wire/Message;", "", "intro", "Ladvisory/proto/v1/TaxLossHarvestStrategiesIntro;", "strategies", "Ladvisory/proto/v1/TaxLossHarvestStrategies;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestStrategiesIntro;Ladvisory/proto/v1/TaxLossHarvestStrategies;Lokio/ByteString;)V", "getIntro", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesIntro;", "getStrategies", "()Ladvisory/proto/v1/TaxLossHarvestStrategies;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetTaxLossHarvestStrategiesResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetTaxLossHarvestStrategiesResponse> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategiesIntro#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TaxLossHarvestStrategiesIntro intro;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategies#ADAPTER", schemaIndex = 1, tag = 2)
    private final TaxLossHarvestStrategies strategies;

    public GetTaxLossHarvestStrategiesResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4500newBuilder();
    }

    public final TaxLossHarvestStrategiesIntro getIntro() {
        return this.intro;
    }

    public final TaxLossHarvestStrategies getStrategies() {
        return this.strategies;
    }

    public /* synthetic */ GetTaxLossHarvestStrategiesResponse(TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro, TaxLossHarvestStrategies taxLossHarvestStrategies, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : taxLossHarvestStrategiesIntro, (i & 2) != 0 ? null : taxLossHarvestStrategies, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTaxLossHarvestStrategiesResponse(TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro, TaxLossHarvestStrategies taxLossHarvestStrategies, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.intro = taxLossHarvestStrategiesIntro;
        this.strategies = taxLossHarvestStrategies;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4500newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTaxLossHarvestStrategiesResponse)) {
            return false;
        }
        GetTaxLossHarvestStrategiesResponse getTaxLossHarvestStrategiesResponse = (GetTaxLossHarvestStrategiesResponse) other;
        return Intrinsics.areEqual(unknownFields(), getTaxLossHarvestStrategiesResponse.unknownFields()) && Intrinsics.areEqual(this.intro, getTaxLossHarvestStrategiesResponse.intro) && Intrinsics.areEqual(this.strategies, getTaxLossHarvestStrategiesResponse.strategies);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro = this.intro;
        int iHashCode2 = (iHashCode + (taxLossHarvestStrategiesIntro != null ? taxLossHarvestStrategiesIntro.hashCode() : 0)) * 37;
        TaxLossHarvestStrategies taxLossHarvestStrategies = this.strategies;
        int iHashCode3 = iHashCode2 + (taxLossHarvestStrategies != null ? taxLossHarvestStrategies.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro = this.intro;
        if (taxLossHarvestStrategiesIntro != null) {
            arrayList.add("intro=" + taxLossHarvestStrategiesIntro);
        }
        TaxLossHarvestStrategies taxLossHarvestStrategies = this.strategies;
        if (taxLossHarvestStrategies != null) {
            arrayList.add("strategies=" + taxLossHarvestStrategies);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTaxLossHarvestStrategiesResponse{", "}", 0, null, null, 56, null);
    }

    public final GetTaxLossHarvestStrategiesResponse copy(TaxLossHarvestStrategiesIntro intro, TaxLossHarvestStrategies strategies, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTaxLossHarvestStrategiesResponse(intro, strategies, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTaxLossHarvestStrategiesResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTaxLossHarvestStrategiesResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetTaxLossHarvestStrategiesResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTaxLossHarvestStrategiesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIntro() != null) {
                    size += TaxLossHarvestStrategiesIntro.ADAPTER.encodedSizeWithTag(1, value.getIntro());
                }
                return size + TaxLossHarvestStrategies.ADAPTER.encodedSizeWithTag(2, value.getStrategies());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTaxLossHarvestStrategiesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIntro() != null) {
                    TaxLossHarvestStrategiesIntro.ADAPTER.encodeWithTag(writer, 1, (int) value.getIntro());
                }
                TaxLossHarvestStrategies.ADAPTER.encodeWithTag(writer, 2, (int) value.getStrategies());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTaxLossHarvestStrategiesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TaxLossHarvestStrategies.ADAPTER.encodeWithTag(writer, 2, (int) value.getStrategies());
                if (value.getIntro() != null) {
                    TaxLossHarvestStrategiesIntro.ADAPTER.encodeWithTag(writer, 1, (int) value.getIntro());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxLossHarvestStrategiesResponse redact(GetTaxLossHarvestStrategiesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TaxLossHarvestStrategiesIntro intro = value.getIntro();
                TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntroRedact = intro != null ? TaxLossHarvestStrategiesIntro.ADAPTER.redact(intro) : null;
                TaxLossHarvestStrategies strategies = value.getStrategies();
                return value.copy(taxLossHarvestStrategiesIntroRedact, strategies != null ? TaxLossHarvestStrategies.ADAPTER.redact(strategies) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxLossHarvestStrategiesResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntroDecode = null;
                TaxLossHarvestStrategies taxLossHarvestStrategiesDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTaxLossHarvestStrategiesResponse(taxLossHarvestStrategiesIntroDecode, taxLossHarvestStrategiesDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        taxLossHarvestStrategiesIntroDecode = TaxLossHarvestStrategiesIntro.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        taxLossHarvestStrategiesDecode = TaxLossHarvestStrategies.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
