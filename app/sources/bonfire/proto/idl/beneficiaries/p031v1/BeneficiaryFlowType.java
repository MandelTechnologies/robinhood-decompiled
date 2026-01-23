package bonfire.proto.idl.beneficiaries.p031v1;

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

/* compiled from: BeneficiaryFlowType.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowType;", "Lcom/squareup/wire/Message;", "", "individual", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlow;", "trust", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlow;", "reuse", "Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlow;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlow;Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlow;Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlow;Lokio/ByteString;)V", "getIndividual", "()Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlow;", "getTrust", "()Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlow;", "getReuse", "()Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlow;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowType extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowType> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.IndividualBeneficiaryFlow#ADAPTER", oneofName = "flow_type", schemaIndex = 0, tag = 1)
    private final IndividualBeneficiaryFlow individual;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.ReuseBeneficiaryFlow#ADAPTER", oneofName = "flow_type", schemaIndex = 2, tag = 3)
    private final ReuseBeneficiaryFlow reuse;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.TrustBeneficiaryFlow#ADAPTER", oneofName = "flow_type", schemaIndex = 1, tag = 2)
    private final TrustBeneficiaryFlow trust;

    public BeneficiaryFlowType() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8819newBuilder();
    }

    public final IndividualBeneficiaryFlow getIndividual() {
        return this.individual;
    }

    public final TrustBeneficiaryFlow getTrust() {
        return this.trust;
    }

    public final ReuseBeneficiaryFlow getReuse() {
        return this.reuse;
    }

    public /* synthetic */ BeneficiaryFlowType(IndividualBeneficiaryFlow individualBeneficiaryFlow, TrustBeneficiaryFlow trustBeneficiaryFlow, ReuseBeneficiaryFlow reuseBeneficiaryFlow, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : individualBeneficiaryFlow, (i & 2) != 0 ? null : trustBeneficiaryFlow, (i & 4) != 0 ? null : reuseBeneficiaryFlow, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowType(IndividualBeneficiaryFlow individualBeneficiaryFlow, TrustBeneficiaryFlow trustBeneficiaryFlow, ReuseBeneficiaryFlow reuseBeneficiaryFlow, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.individual = individualBeneficiaryFlow;
        this.trust = trustBeneficiaryFlow;
        this.reuse = reuseBeneficiaryFlow;
        if (Internal.countNonNull(individualBeneficiaryFlow, trustBeneficiaryFlow, reuseBeneficiaryFlow) > 1) {
            throw new IllegalArgumentException("At most one of individual, trust, reuse may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8819newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowType)) {
            return false;
        }
        BeneficiaryFlowType beneficiaryFlowType = (BeneficiaryFlowType) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowType.unknownFields()) && Intrinsics.areEqual(this.individual, beneficiaryFlowType.individual) && Intrinsics.areEqual(this.trust, beneficiaryFlowType.trust) && Intrinsics.areEqual(this.reuse, beneficiaryFlowType.reuse);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        IndividualBeneficiaryFlow individualBeneficiaryFlow = this.individual;
        int iHashCode2 = (iHashCode + (individualBeneficiaryFlow != null ? individualBeneficiaryFlow.hashCode() : 0)) * 37;
        TrustBeneficiaryFlow trustBeneficiaryFlow = this.trust;
        int iHashCode3 = (iHashCode2 + (trustBeneficiaryFlow != null ? trustBeneficiaryFlow.hashCode() : 0)) * 37;
        ReuseBeneficiaryFlow reuseBeneficiaryFlow = this.reuse;
        int iHashCode4 = iHashCode3 + (reuseBeneficiaryFlow != null ? reuseBeneficiaryFlow.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        IndividualBeneficiaryFlow individualBeneficiaryFlow = this.individual;
        if (individualBeneficiaryFlow != null) {
            arrayList.add("individual=" + individualBeneficiaryFlow);
        }
        TrustBeneficiaryFlow trustBeneficiaryFlow = this.trust;
        if (trustBeneficiaryFlow != null) {
            arrayList.add("trust=" + trustBeneficiaryFlow);
        }
        ReuseBeneficiaryFlow reuseBeneficiaryFlow = this.reuse;
        if (reuseBeneficiaryFlow != null) {
            arrayList.add("reuse=" + reuseBeneficiaryFlow);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowType{", "}", 0, null, null, 56, null);
    }

    public final BeneficiaryFlowType copy(IndividualBeneficiaryFlow individual, TrustBeneficiaryFlow trust, ReuseBeneficiaryFlow reuse, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowType(individual, trust, reuse, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowType>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowType$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + IndividualBeneficiaryFlow.ADAPTER.encodedSizeWithTag(1, value.getIndividual()) + TrustBeneficiaryFlow.ADAPTER.encodedSizeWithTag(2, value.getTrust()) + ReuseBeneficiaryFlow.ADAPTER.encodedSizeWithTag(3, value.getReuse());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                IndividualBeneficiaryFlow.ADAPTER.encodeWithTag(writer, 1, (int) value.getIndividual());
                TrustBeneficiaryFlow.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrust());
                ReuseBeneficiaryFlow.ADAPTER.encodeWithTag(writer, 3, (int) value.getReuse());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ReuseBeneficiaryFlow.ADAPTER.encodeWithTag(writer, 3, (int) value.getReuse());
                TrustBeneficiaryFlow.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrust());
                IndividualBeneficiaryFlow.ADAPTER.encodeWithTag(writer, 1, (int) value.getIndividual());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowType redact(BeneficiaryFlowType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IndividualBeneficiaryFlow individual = value.getIndividual();
                IndividualBeneficiaryFlow individualBeneficiaryFlowRedact = individual != null ? IndividualBeneficiaryFlow.ADAPTER.redact(individual) : null;
                TrustBeneficiaryFlow trust = value.getTrust();
                TrustBeneficiaryFlow trustBeneficiaryFlowRedact = trust != null ? TrustBeneficiaryFlow.ADAPTER.redact(trust) : null;
                ReuseBeneficiaryFlow reuse = value.getReuse();
                return value.copy(individualBeneficiaryFlowRedact, trustBeneficiaryFlowRedact, reuse != null ? ReuseBeneficiaryFlow.ADAPTER.redact(reuse) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowType decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                IndividualBeneficiaryFlow individualBeneficiaryFlowDecode = null;
                TrustBeneficiaryFlow trustBeneficiaryFlowDecode = null;
                ReuseBeneficiaryFlow reuseBeneficiaryFlowDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BeneficiaryFlowType(individualBeneficiaryFlowDecode, trustBeneficiaryFlowDecode, reuseBeneficiaryFlowDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        individualBeneficiaryFlowDecode = IndividualBeneficiaryFlow.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        trustBeneficiaryFlowDecode = TrustBeneficiaryFlow.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        reuseBeneficiaryFlowDecode = ReuseBeneficiaryFlow.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
