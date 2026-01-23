package bff_money_movement.service.p019v1;

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

/* compiled from: SignAgreementRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lbff_money_movement/service/v1/SignAgreementRequest;", "Lcom/squareup/wire/Message;", "", "agreement_type", "Lbff_money_movement/service/v1/InvestmentsTrackerAgreementType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerAgreementType;Lokio/ByteString;)V", "getAgreement_type", "()Lbff_money_movement/service/v1/InvestmentsTrackerAgreementType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SignAgreementRequest extends Message {

    @JvmField
    public static final ProtoAdapter<SignAgreementRequest> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerAgreementType#ADAPTER", jsonName = "agreementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final InvestmentsTrackerAgreementType agreement_type;

    /* JADX WARN: Multi-variable type inference failed */
    public SignAgreementRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8512newBuilder();
    }

    public final InvestmentsTrackerAgreementType getAgreement_type() {
        return this.agreement_type;
    }

    public /* synthetic */ SignAgreementRequest(InvestmentsTrackerAgreementType investmentsTrackerAgreementType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestmentsTrackerAgreementType.AGREEMENT_UNSPECIFIED : investmentsTrackerAgreementType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignAgreementRequest(InvestmentsTrackerAgreementType agreement_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.agreement_type = agreement_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8512newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SignAgreementRequest)) {
            return false;
        }
        SignAgreementRequest signAgreementRequest = (SignAgreementRequest) other;
        return Intrinsics.areEqual(unknownFields(), signAgreementRequest.unknownFields()) && this.agreement_type == signAgreementRequest.agreement_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.agreement_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("agreement_type=" + this.agreement_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SignAgreementRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SignAgreementRequest copy$default(SignAgreementRequest signAgreementRequest, InvestmentsTrackerAgreementType investmentsTrackerAgreementType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerAgreementType = signAgreementRequest.agreement_type;
        }
        if ((i & 2) != 0) {
            byteString = signAgreementRequest.unknownFields();
        }
        return signAgreementRequest.copy(investmentsTrackerAgreementType, byteString);
    }

    public final SignAgreementRequest copy(InvestmentsTrackerAgreementType agreement_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SignAgreementRequest(agreement_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SignAgreementRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SignAgreementRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.SignAgreementRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SignAgreementRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getAgreement_type() != InvestmentsTrackerAgreementType.AGREEMENT_UNSPECIFIED ? size + InvestmentsTrackerAgreementType.ADAPTER.encodedSizeWithTag(1, value.getAgreement_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SignAgreementRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAgreement_type() != InvestmentsTrackerAgreementType.AGREEMENT_UNSPECIFIED) {
                    InvestmentsTrackerAgreementType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAgreement_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SignAgreementRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAgreement_type() != InvestmentsTrackerAgreementType.AGREEMENT_UNSPECIFIED) {
                    InvestmentsTrackerAgreementType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAgreement_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SignAgreementRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestmentsTrackerAgreementType investmentsTrackerAgreementTypeDecode = InvestmentsTrackerAgreementType.AGREEMENT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SignAgreementRequest(investmentsTrackerAgreementTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            investmentsTrackerAgreementTypeDecode = InvestmentsTrackerAgreementType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SignAgreementRequest redact(SignAgreementRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SignAgreementRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
