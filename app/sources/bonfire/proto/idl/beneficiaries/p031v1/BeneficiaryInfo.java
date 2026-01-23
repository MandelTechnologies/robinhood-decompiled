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

/* compiled from: BeneficiaryInfo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "Lcom/squareup/wire/Message;", "", "individual_info", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfo;", "trust_info", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfo;Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfo;Lokio/ByteString;)V", "getIndividual_info", "()Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfo;", "getTrust_info", "()Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryInfo;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryInfo extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryInfo> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.IndividualBeneficiaryInfo#ADAPTER", jsonName = "individualInfo", oneofName = "beneficiary_info", schemaIndex = 0, tag = 1)
    private final IndividualBeneficiaryInfo individual_info;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.TrustBeneficiaryInfo#ADAPTER", jsonName = "trustInfo", oneofName = "beneficiary_info", schemaIndex = 1, tag = 2)
    private final TrustBeneficiaryInfo trust_info;

    public BeneficiaryInfo() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8820newBuilder();
    }

    public final IndividualBeneficiaryInfo getIndividual_info() {
        return this.individual_info;
    }

    public final TrustBeneficiaryInfo getTrust_info() {
        return this.trust_info;
    }

    public /* synthetic */ BeneficiaryInfo(IndividualBeneficiaryInfo individualBeneficiaryInfo, TrustBeneficiaryInfo trustBeneficiaryInfo, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : individualBeneficiaryInfo, (i & 2) != 0 ? null : trustBeneficiaryInfo, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryInfo(IndividualBeneficiaryInfo individualBeneficiaryInfo, TrustBeneficiaryInfo trustBeneficiaryInfo, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.individual_info = individualBeneficiaryInfo;
        this.trust_info = trustBeneficiaryInfo;
        if (Internal.countNonNull(individualBeneficiaryInfo, trustBeneficiaryInfo) > 1) {
            throw new IllegalArgumentException("At most one of individual_info, trust_info may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8820newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryInfo)) {
            return false;
        }
        BeneficiaryInfo beneficiaryInfo = (BeneficiaryInfo) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryInfo.unknownFields()) && Intrinsics.areEqual(this.individual_info, beneficiaryInfo.individual_info) && Intrinsics.areEqual(this.trust_info, beneficiaryInfo.trust_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        IndividualBeneficiaryInfo individualBeneficiaryInfo = this.individual_info;
        int iHashCode2 = (iHashCode + (individualBeneficiaryInfo != null ? individualBeneficiaryInfo.hashCode() : 0)) * 37;
        TrustBeneficiaryInfo trustBeneficiaryInfo = this.trust_info;
        int iHashCode3 = iHashCode2 + (trustBeneficiaryInfo != null ? trustBeneficiaryInfo.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        IndividualBeneficiaryInfo individualBeneficiaryInfo = this.individual_info;
        if (individualBeneficiaryInfo != null) {
            arrayList.add("individual_info=" + individualBeneficiaryInfo);
        }
        TrustBeneficiaryInfo trustBeneficiaryInfo = this.trust_info;
        if (trustBeneficiaryInfo != null) {
            arrayList.add("trust_info=" + trustBeneficiaryInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryInfo{", "}", 0, null, null, 56, null);
    }

    public final BeneficiaryInfo copy(IndividualBeneficiaryInfo individual_info, TrustBeneficiaryInfo trust_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryInfo(individual_info, trust_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + IndividualBeneficiaryInfo.ADAPTER.encodedSizeWithTag(1, value.getIndividual_info()) + TrustBeneficiaryInfo.ADAPTER.encodedSizeWithTag(2, value.getTrust_info());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                IndividualBeneficiaryInfo.ADAPTER.encodeWithTag(writer, 1, (int) value.getIndividual_info());
                TrustBeneficiaryInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrust_info());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TrustBeneficiaryInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrust_info());
                IndividualBeneficiaryInfo.ADAPTER.encodeWithTag(writer, 1, (int) value.getIndividual_info());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryInfo redact(BeneficiaryInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IndividualBeneficiaryInfo individual_info = value.getIndividual_info();
                IndividualBeneficiaryInfo individualBeneficiaryInfoRedact = individual_info != null ? IndividualBeneficiaryInfo.ADAPTER.redact(individual_info) : null;
                TrustBeneficiaryInfo trust_info = value.getTrust_info();
                return value.copy(individualBeneficiaryInfoRedact, trust_info != null ? TrustBeneficiaryInfo.ADAPTER.redact(trust_info) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                IndividualBeneficiaryInfo individualBeneficiaryInfoDecode = null;
                TrustBeneficiaryInfo trustBeneficiaryInfoDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BeneficiaryInfo(individualBeneficiaryInfoDecode, trustBeneficiaryInfoDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        individualBeneficiaryInfoDecode = IndividualBeneficiaryInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        trustBeneficiaryInfoDecode = TrustBeneficiaryInfo.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
