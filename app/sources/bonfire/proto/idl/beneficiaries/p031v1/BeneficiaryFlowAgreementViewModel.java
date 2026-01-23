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

/* compiled from: BeneficiaryFlowAgreementViewModel.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "Lcom/squareup/wire/Message;", "", "contentful_id", "", "agreement_type", "agreement_context", "logging_identifier", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;Lokio/ByteString;)V", "getContentful_id", "()Ljava/lang/String;", "getAgreement_type", "getAgreement_context", "getLogging_identifier", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowAgreementViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowAgreementViewModel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String agreement_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String agreement_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contentfulId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contentful_id;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowLoggingIdentifier#ADAPTER", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final BeneficiaryFlowLoggingIdentifier logging_identifier;

    public BeneficiaryFlowAgreementViewModel() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ BeneficiaryFlowAgreementViewModel(String str, String str2, String str3, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED : beneficiaryFlowLoggingIdentifier, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8800newBuilder();
    }

    public final String getContentful_id() {
        return this.contentful_id;
    }

    public final String getAgreement_type() {
        return this.agreement_type;
    }

    public final String getAgreement_context() {
        return this.agreement_context;
    }

    public final BeneficiaryFlowLoggingIdentifier getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowAgreementViewModel(String contentful_id, String agreement_type, String agreement_context, BeneficiaryFlowLoggingIdentifier logging_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contentful_id, "contentful_id");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(agreement_context, "agreement_context");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contentful_id = contentful_id;
        this.agreement_type = agreement_type;
        this.agreement_context = agreement_context;
        this.logging_identifier = logging_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8800newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowAgreementViewModel)) {
            return false;
        }
        BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel = (BeneficiaryFlowAgreementViewModel) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowAgreementViewModel.unknownFields()) && Intrinsics.areEqual(this.contentful_id, beneficiaryFlowAgreementViewModel.contentful_id) && Intrinsics.areEqual(this.agreement_type, beneficiaryFlowAgreementViewModel.agreement_type) && Intrinsics.areEqual(this.agreement_context, beneficiaryFlowAgreementViewModel.agreement_context) && this.logging_identifier == beneficiaryFlowAgreementViewModel.logging_identifier;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.contentful_id.hashCode()) * 37) + this.agreement_type.hashCode()) * 37) + this.agreement_context.hashCode()) * 37) + this.logging_identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contentful_id=" + Internal.sanitize(this.contentful_id));
        arrayList.add("agreement_type=" + Internal.sanitize(this.agreement_type));
        arrayList.add("agreement_context=" + Internal.sanitize(this.agreement_context));
        arrayList.add("logging_identifier=" + this.logging_identifier);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowAgreementViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BeneficiaryFlowAgreementViewModel copy$default(BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, String str, String str2, String str3, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryFlowAgreementViewModel.contentful_id;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryFlowAgreementViewModel.agreement_type;
        }
        if ((i & 4) != 0) {
            str3 = beneficiaryFlowAgreementViewModel.agreement_context;
        }
        if ((i & 8) != 0) {
            beneficiaryFlowLoggingIdentifier = beneficiaryFlowAgreementViewModel.logging_identifier;
        }
        if ((i & 16) != 0) {
            byteString = beneficiaryFlowAgreementViewModel.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return beneficiaryFlowAgreementViewModel.copy(str, str2, str4, beneficiaryFlowLoggingIdentifier, byteString2);
    }

    public final BeneficiaryFlowAgreementViewModel copy(String contentful_id, String agreement_type, String agreement_context, BeneficiaryFlowLoggingIdentifier logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contentful_id, "contentful_id");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(agreement_context, "agreement_context");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowAgreementViewModel(contentful_id, agreement_type, agreement_context, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowAgreementViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowAgreementViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowAgreementViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowAgreementViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContentful_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContentful_id());
                }
                if (!Intrinsics.areEqual(value.getAgreement_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAgreement_type());
                }
                if (!Intrinsics.areEqual(value.getAgreement_context(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAgreement_context());
                }
                return value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED ? size + BeneficiaryFlowLoggingIdentifier.ADAPTER.encodedSizeWithTag(4, value.getLogging_identifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowAgreementViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContentful_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContentful_id());
                }
                if (!Intrinsics.areEqual(value.getAgreement_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAgreement_type());
                }
                if (!Intrinsics.areEqual(value.getAgreement_context(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAgreement_context());
                }
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowAgreementViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getAgreement_context(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAgreement_context());
                }
                if (!Intrinsics.areEqual(value.getAgreement_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAgreement_type());
                }
                if (Intrinsics.areEqual(value.getContentful_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContentful_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowAgreementViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifierDecode = BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier = beneficiaryFlowLoggingIdentifierDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new BeneficiaryFlowAgreementViewModel(strDecode, strDecode2, strDecode3, beneficiaryFlowLoggingIdentifier, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                beneficiaryFlowLoggingIdentifierDecode = BeneficiaryFlowLoggingIdentifier.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowAgreementViewModel redact(BeneficiaryFlowAgreementViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryFlowAgreementViewModel.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
