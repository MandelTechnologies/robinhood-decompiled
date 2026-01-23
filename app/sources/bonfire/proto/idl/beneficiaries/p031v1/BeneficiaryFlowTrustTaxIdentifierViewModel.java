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

/* compiled from: BeneficiaryFlowTrustTaxIdentifierViewModel.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JH\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle_markdown", "tax_identifier_hint", "tax_identifier_value", "logging_identifier", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle_markdown", "getTax_identifier_hint", "getTax_identifier_value", "getLogging_identifier", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowTrustTaxIdentifierViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowTrustTaxIdentifierViewModel> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowLoggingIdentifier#ADAPTER", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 7)
    private final BeneficiaryFlowLoggingIdentifier logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", schemaIndex = 1, tag = 2)
    private final String subtitle_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "taxIdentifierHint", schemaIndex = 2, tag = 3)
    private final String tax_identifier_hint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "taxIdentifierValue", schemaIndex = 3, tag = 4)
    private final String tax_identifier_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public BeneficiaryFlowTrustTaxIdentifierViewModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8818newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ BeneficiaryFlowTrustTaxIdentifierViewModel(String str, String str2, String str3, String str4, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED : beneficiaryFlowLoggingIdentifier, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final String getTax_identifier_hint() {
        return this.tax_identifier_hint;
    }

    public final String getTax_identifier_value() {
        return this.tax_identifier_value;
    }

    public final BeneficiaryFlowLoggingIdentifier getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowTrustTaxIdentifierViewModel(String title, String str, String str2, String str3, BeneficiaryFlowLoggingIdentifier logging_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle_markdown = str;
        this.tax_identifier_hint = str2;
        this.tax_identifier_value = str3;
        this.logging_identifier = logging_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8818newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowTrustTaxIdentifierViewModel)) {
            return false;
        }
        BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel = (BeneficiaryFlowTrustTaxIdentifierViewModel) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowTrustTaxIdentifierViewModel.unknownFields()) && Intrinsics.areEqual(this.title, beneficiaryFlowTrustTaxIdentifierViewModel.title) && Intrinsics.areEqual(this.subtitle_markdown, beneficiaryFlowTrustTaxIdentifierViewModel.subtitle_markdown) && Intrinsics.areEqual(this.tax_identifier_hint, beneficiaryFlowTrustTaxIdentifierViewModel.tax_identifier_hint) && Intrinsics.areEqual(this.tax_identifier_value, beneficiaryFlowTrustTaxIdentifierViewModel.tax_identifier_value) && this.logging_identifier == beneficiaryFlowTrustTaxIdentifierViewModel.logging_identifier;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        String str = this.subtitle_markdown;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.tax_identifier_hint;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.tax_identifier_value;
        int iHashCode4 = ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.logging_identifier.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        String str = this.subtitle_markdown;
        if (str != null) {
            arrayList.add("subtitle_markdown=" + Internal.sanitize(str));
        }
        String str2 = this.tax_identifier_hint;
        if (str2 != null) {
            arrayList.add("tax_identifier_hint=" + Internal.sanitize(str2));
        }
        String str3 = this.tax_identifier_value;
        if (str3 != null) {
            arrayList.add("tax_identifier_value=" + Internal.sanitize(str3));
        }
        arrayList.add("logging_identifier=" + this.logging_identifier);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowTrustTaxIdentifierViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BeneficiaryFlowTrustTaxIdentifierViewModel copy$default(BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel, String str, String str2, String str3, String str4, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryFlowTrustTaxIdentifierViewModel.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryFlowTrustTaxIdentifierViewModel.subtitle_markdown;
        }
        if ((i & 4) != 0) {
            str3 = beneficiaryFlowTrustTaxIdentifierViewModel.tax_identifier_hint;
        }
        if ((i & 8) != 0) {
            str4 = beneficiaryFlowTrustTaxIdentifierViewModel.tax_identifier_value;
        }
        if ((i & 16) != 0) {
            beneficiaryFlowLoggingIdentifier = beneficiaryFlowTrustTaxIdentifierViewModel.logging_identifier;
        }
        if ((i & 32) != 0) {
            byteString = beneficiaryFlowTrustTaxIdentifierViewModel.unknownFields();
        }
        BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier2 = beneficiaryFlowLoggingIdentifier;
        ByteString byteString2 = byteString;
        return beneficiaryFlowTrustTaxIdentifierViewModel.copy(str, str2, str3, str4, beneficiaryFlowLoggingIdentifier2, byteString2);
    }

    public final BeneficiaryFlowTrustTaxIdentifierViewModel copy(String title, String subtitle_markdown, String tax_identifier_hint, String tax_identifier_value, BeneficiaryFlowLoggingIdentifier logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowTrustTaxIdentifierViewModel(title, subtitle_markdown, tax_identifier_hint, tax_identifier_value, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowTrustTaxIdentifierViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowTrustTaxIdentifierViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowTrustTaxIdentifierViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowTrustTaxIdentifierViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getSubtitle_markdown()) + protoAdapter.encodedSizeWithTag(3, value.getTax_identifier_hint()) + protoAdapter.encodedSizeWithTag(4, value.getTax_identifier_value());
                return value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED ? iEncodedSizeWithTag + BeneficiaryFlowLoggingIdentifier.ADAPTER.encodedSizeWithTag(7, value.getLogging_identifier()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowTrustTaxIdentifierViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTax_identifier_hint());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getTax_identifier_value());
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowTrustTaxIdentifierViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getTax_identifier_value());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTax_identifier_hint());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowTrustTaxIdentifierViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifierDecode = BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = "";
                while (true) {
                    BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier = beneficiaryFlowLoggingIdentifierDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new BeneficiaryFlowTrustTaxIdentifierViewModel(strDecode4, strDecode, strDecode2, strDecode3, beneficiaryFlowLoggingIdentifier, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 7) {
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
            public BeneficiaryFlowTrustTaxIdentifierViewModel redact(BeneficiaryFlowTrustTaxIdentifierViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryFlowTrustTaxIdentifierViewModel.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
