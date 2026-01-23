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

/* compiled from: BeneficiaryFlowEmailViewModel.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JF\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle_markdown", "email_hint", "email_value", "logging_identifier", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle_markdown", "getEmail_hint", "getEmail_value", "getLogging_identifier", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowEmailViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowEmailViewModel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "emailHint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String email_hint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "emailValue", schemaIndex = 3, tag = 4)
    private final String email_value;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowLoggingIdentifier#ADAPTER", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final BeneficiaryFlowLoggingIdentifier logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", schemaIndex = 1, tag = 2)
    private final String subtitle_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public BeneficiaryFlowEmailViewModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ BeneficiaryFlowEmailViewModel(String str, String str2, String str3, String str4, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED : beneficiaryFlowLoggingIdentifier, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8807newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final String getEmail_hint() {
        return this.email_hint;
    }

    public final String getEmail_value() {
        return this.email_value;
    }

    public final BeneficiaryFlowLoggingIdentifier getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowEmailViewModel(String title, String str, String email_hint, String str2, BeneficiaryFlowLoggingIdentifier logging_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(email_hint, "email_hint");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle_markdown = str;
        this.email_hint = email_hint;
        this.email_value = str2;
        this.logging_identifier = logging_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8807newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowEmailViewModel)) {
            return false;
        }
        BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel = (BeneficiaryFlowEmailViewModel) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowEmailViewModel.unknownFields()) && Intrinsics.areEqual(this.title, beneficiaryFlowEmailViewModel.title) && Intrinsics.areEqual(this.subtitle_markdown, beneficiaryFlowEmailViewModel.subtitle_markdown) && Intrinsics.areEqual(this.email_hint, beneficiaryFlowEmailViewModel.email_hint) && Intrinsics.areEqual(this.email_value, beneficiaryFlowEmailViewModel.email_value) && this.logging_identifier == beneficiaryFlowEmailViewModel.logging_identifier;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        String str = this.subtitle_markdown;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.email_hint.hashCode()) * 37;
        String str2 = this.email_value;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.logging_identifier.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        String str = this.subtitle_markdown;
        if (str != null) {
            arrayList.add("subtitle_markdown=" + Internal.sanitize(str));
        }
        arrayList.add("email_hint=" + Internal.sanitize(this.email_hint));
        String str2 = this.email_value;
        if (str2 != null) {
            arrayList.add("email_value=" + Internal.sanitize(str2));
        }
        arrayList.add("logging_identifier=" + this.logging_identifier);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowEmailViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BeneficiaryFlowEmailViewModel copy$default(BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel, String str, String str2, String str3, String str4, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryFlowEmailViewModel.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryFlowEmailViewModel.subtitle_markdown;
        }
        if ((i & 4) != 0) {
            str3 = beneficiaryFlowEmailViewModel.email_hint;
        }
        if ((i & 8) != 0) {
            str4 = beneficiaryFlowEmailViewModel.email_value;
        }
        if ((i & 16) != 0) {
            beneficiaryFlowLoggingIdentifier = beneficiaryFlowEmailViewModel.logging_identifier;
        }
        if ((i & 32) != 0) {
            byteString = beneficiaryFlowEmailViewModel.unknownFields();
        }
        BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier2 = beneficiaryFlowLoggingIdentifier;
        ByteString byteString2 = byteString;
        return beneficiaryFlowEmailViewModel.copy(str, str2, str3, str4, beneficiaryFlowLoggingIdentifier2, byteString2);
    }

    public final BeneficiaryFlowEmailViewModel copy(String title, String subtitle_markdown, String email_hint, String email_value, BeneficiaryFlowLoggingIdentifier logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(email_hint, "email_hint");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowEmailViewModel(title, subtitle_markdown, email_hint, email_value, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowEmailViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowEmailViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowEmailViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowEmailViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getSubtitle_markdown());
                if (!Intrinsics.areEqual(value.getEmail_hint(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getEmail_hint());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getEmail_value());
                return value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED ? iEncodedSizeWithTag2 + BeneficiaryFlowLoggingIdentifier.ADAPTER.encodedSizeWithTag(5, value.getLogging_identifier()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowEmailViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                if (!Intrinsics.areEqual(value.getEmail_hint(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getEmail_hint());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getEmail_value());
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowEmailViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getEmail_value());
                if (!Intrinsics.areEqual(value.getEmail_hint(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getEmail_hint());
                }
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowEmailViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier = BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = null;
                BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifierDecode = beneficiaryFlowLoggingIdentifier;
                String strDecode4 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BeneficiaryFlowEmailViewModel(strDecode4, strDecode2, strDecode, strDecode3, beneficiaryFlowLoggingIdentifierDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        try {
                            beneficiaryFlowLoggingIdentifierDecode = BeneficiaryFlowLoggingIdentifier.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowEmailViewModel redact(BeneficiaryFlowEmailViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryFlowEmailViewModel.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
