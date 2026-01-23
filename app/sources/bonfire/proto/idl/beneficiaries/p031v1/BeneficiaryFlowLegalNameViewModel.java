package bonfire.proto.idl.beneficiaries.p031v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: BeneficiaryFlowLegalNameViewModel.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\\\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModel;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle_markdown", "first_name_hint", "first_name_value", "last_name_hint", "last_name_value", "logging_identifier", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle_markdown", "getFirst_name_hint", "getFirst_name_value", "getLast_name_hint", "getLast_name_value", "getLogging_identifier", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowLegalNameViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowLegalNameViewModel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "firstNameHint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String first_name_hint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "firstNameValue", schemaIndex = 3, tag = 4)
    private final String first_name_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastNameHint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String last_name_hint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastNameValue", schemaIndex = 5, tag = 6)
    private final String last_name_value;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowLoggingIdentifier#ADAPTER", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final BeneficiaryFlowLoggingIdentifier logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", schemaIndex = 1, tag = 2)
    private final String subtitle_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public BeneficiaryFlowLegalNameViewModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ BeneficiaryFlowLegalNameViewModel(String str, String str2, String str3, String str4, String str5, String str6, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED : beneficiaryFlowLoggingIdentifier, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8808newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final String getFirst_name_hint() {
        return this.first_name_hint;
    }

    public final String getFirst_name_value() {
        return this.first_name_value;
    }

    public final String getLast_name_hint() {
        return this.last_name_hint;
    }

    public final String getLast_name_value() {
        return this.last_name_value;
    }

    public final BeneficiaryFlowLoggingIdentifier getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowLegalNameViewModel(String title, String str, String first_name_hint, String str2, String last_name_hint, String str3, BeneficiaryFlowLoggingIdentifier logging_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(first_name_hint, "first_name_hint");
        Intrinsics.checkNotNullParameter(last_name_hint, "last_name_hint");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle_markdown = str;
        this.first_name_hint = first_name_hint;
        this.first_name_value = str2;
        this.last_name_hint = last_name_hint;
        this.last_name_value = str3;
        this.logging_identifier = logging_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8808newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowLegalNameViewModel)) {
            return false;
        }
        BeneficiaryFlowLegalNameViewModel beneficiaryFlowLegalNameViewModel = (BeneficiaryFlowLegalNameViewModel) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowLegalNameViewModel.unknownFields()) && Intrinsics.areEqual(this.title, beneficiaryFlowLegalNameViewModel.title) && Intrinsics.areEqual(this.subtitle_markdown, beneficiaryFlowLegalNameViewModel.subtitle_markdown) && Intrinsics.areEqual(this.first_name_hint, beneficiaryFlowLegalNameViewModel.first_name_hint) && Intrinsics.areEqual(this.first_name_value, beneficiaryFlowLegalNameViewModel.first_name_value) && Intrinsics.areEqual(this.last_name_hint, beneficiaryFlowLegalNameViewModel.last_name_hint) && Intrinsics.areEqual(this.last_name_value, beneficiaryFlowLegalNameViewModel.last_name_value) && this.logging_identifier == beneficiaryFlowLegalNameViewModel.logging_identifier;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        String str = this.subtitle_markdown;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.first_name_hint.hashCode()) * 37;
        String str2 = this.first_name_value;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.last_name_hint.hashCode()) * 37;
        String str3 = this.last_name_value;
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
        arrayList.add("first_name_hint=" + Internal.sanitize(this.first_name_hint));
        String str2 = this.first_name_value;
        if (str2 != null) {
            arrayList.add("first_name_value=" + Internal.sanitize(str2));
        }
        arrayList.add("last_name_hint=" + Internal.sanitize(this.last_name_hint));
        String str3 = this.last_name_value;
        if (str3 != null) {
            arrayList.add("last_name_value=" + Internal.sanitize(str3));
        }
        arrayList.add("logging_identifier=" + this.logging_identifier);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowLegalNameViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BeneficiaryFlowLegalNameViewModel copy$default(BeneficiaryFlowLegalNameViewModel beneficiaryFlowLegalNameViewModel, String str, String str2, String str3, String str4, String str5, String str6, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryFlowLegalNameViewModel.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryFlowLegalNameViewModel.subtitle_markdown;
        }
        if ((i & 4) != 0) {
            str3 = beneficiaryFlowLegalNameViewModel.first_name_hint;
        }
        if ((i & 8) != 0) {
            str4 = beneficiaryFlowLegalNameViewModel.first_name_value;
        }
        if ((i & 16) != 0) {
            str5 = beneficiaryFlowLegalNameViewModel.last_name_hint;
        }
        if ((i & 32) != 0) {
            str6 = beneficiaryFlowLegalNameViewModel.last_name_value;
        }
        if ((i & 64) != 0) {
            beneficiaryFlowLoggingIdentifier = beneficiaryFlowLegalNameViewModel.logging_identifier;
        }
        if ((i & 128) != 0) {
            byteString = beneficiaryFlowLegalNameViewModel.unknownFields();
        }
        BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier2 = beneficiaryFlowLoggingIdentifier;
        ByteString byteString2 = byteString;
        String str7 = str5;
        String str8 = str6;
        return beneficiaryFlowLegalNameViewModel.copy(str, str2, str3, str4, str7, str8, beneficiaryFlowLoggingIdentifier2, byteString2);
    }

    public final BeneficiaryFlowLegalNameViewModel copy(String title, String subtitle_markdown, String first_name_hint, String first_name_value, String last_name_hint, String last_name_value, BeneficiaryFlowLoggingIdentifier logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(first_name_hint, "first_name_hint");
        Intrinsics.checkNotNullParameter(last_name_hint, "last_name_hint");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowLegalNameViewModel(title, subtitle_markdown, first_name_hint, first_name_value, last_name_hint, last_name_value, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowLegalNameViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowLegalNameViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowLegalNameViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowLegalNameViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getSubtitle_markdown());
                if (!Intrinsics.areEqual(value.getFirst_name_hint(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getFirst_name_hint());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getFirst_name_value());
                if (!Intrinsics.areEqual(value.getLast_name_hint(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(5, value.getLast_name_hint());
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(6, value.getLast_name_value());
                return value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED ? iEncodedSizeWithTag3 + BeneficiaryFlowLoggingIdentifier.ADAPTER.encodedSizeWithTag(7, value.getLogging_identifier()) : iEncodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowLegalNameViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                if (!Intrinsics.areEqual(value.getFirst_name_hint(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getFirst_name_hint());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getFirst_name_value());
                if (!Intrinsics.areEqual(value.getLast_name_hint(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getLast_name_hint());
                }
                protoAdapter.encodeWithTag(writer, 6, (int) value.getLast_name_value());
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowLegalNameViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getLast_name_value());
                if (!Intrinsics.areEqual(value.getLast_name_hint(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getLast_name_hint());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getFirst_name_value());
                if (!Intrinsics.areEqual(value.getFirst_name_hint(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getFirst_name_hint());
                }
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowLegalNameViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier = BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = null;
                BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifierDecode = beneficiaryFlowLoggingIdentifier;
                String strDecode6 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                try {
                                    beneficiaryFlowLoggingIdentifierDecode = BeneficiaryFlowLoggingIdentifier.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new BeneficiaryFlowLegalNameViewModel(strDecode6, strDecode3, strDecode, strDecode4, strDecode2, strDecode5, beneficiaryFlowLoggingIdentifierDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowLegalNameViewModel redact(BeneficiaryFlowLegalNameViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryFlowLegalNameViewModel.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        };
    }
}
