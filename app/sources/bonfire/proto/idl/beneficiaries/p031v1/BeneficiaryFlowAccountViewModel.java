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

/* compiled from: BeneficiaryFlowAccountViewModel.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle_markdown", "account_rows", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountRow;", "logging_identifier", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "footer_markdown", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle_markdown", "getLogging_identifier", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "getFooter_markdown", "getAccount_rows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowAccountViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowAccountViewModel> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowAccountRow#ADAPTER", jsonName = "accountRows", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<BeneficiaryFlowAccountRow> account_rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "footerMarkdown", schemaIndex = 4, tag = 5)
    private final String footer_markdown;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowLoggingIdentifier#ADAPTER", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final BeneficiaryFlowLoggingIdentifier logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", schemaIndex = 1, tag = 2)
    private final String subtitle_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public BeneficiaryFlowAccountViewModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8799newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ BeneficiaryFlowAccountViewModel(String str, String str2, List list, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED : beneficiaryFlowLoggingIdentifier, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final BeneficiaryFlowLoggingIdentifier getLogging_identifier() {
        return this.logging_identifier;
    }

    public final String getFooter_markdown() {
        return this.footer_markdown;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowAccountViewModel(String title, String str, List<BeneficiaryFlowAccountRow> account_rows, BeneficiaryFlowLoggingIdentifier logging_identifier, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(account_rows, "account_rows");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle_markdown = str;
        this.logging_identifier = logging_identifier;
        this.footer_markdown = str2;
        this.account_rows = Internal.immutableCopyOf("account_rows", account_rows);
    }

    public final List<BeneficiaryFlowAccountRow> getAccount_rows() {
        return this.account_rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8799newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowAccountViewModel)) {
            return false;
        }
        BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel = (BeneficiaryFlowAccountViewModel) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowAccountViewModel.unknownFields()) && Intrinsics.areEqual(this.title, beneficiaryFlowAccountViewModel.title) && Intrinsics.areEqual(this.subtitle_markdown, beneficiaryFlowAccountViewModel.subtitle_markdown) && Intrinsics.areEqual(this.account_rows, beneficiaryFlowAccountViewModel.account_rows) && this.logging_identifier == beneficiaryFlowAccountViewModel.logging_identifier && Intrinsics.areEqual(this.footer_markdown, beneficiaryFlowAccountViewModel.footer_markdown);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        String str = this.subtitle_markdown;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.account_rows.hashCode()) * 37) + this.logging_identifier.hashCode()) * 37;
        String str2 = this.footer_markdown;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
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
        if (!this.account_rows.isEmpty()) {
            arrayList.add("account_rows=" + this.account_rows);
        }
        arrayList.add("logging_identifier=" + this.logging_identifier);
        String str2 = this.footer_markdown;
        if (str2 != null) {
            arrayList.add("footer_markdown=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowAccountViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BeneficiaryFlowAccountViewModel copy$default(BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel, String str, String str2, List list, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryFlowAccountViewModel.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryFlowAccountViewModel.subtitle_markdown;
        }
        if ((i & 4) != 0) {
            list = beneficiaryFlowAccountViewModel.account_rows;
        }
        if ((i & 8) != 0) {
            beneficiaryFlowLoggingIdentifier = beneficiaryFlowAccountViewModel.logging_identifier;
        }
        if ((i & 16) != 0) {
            str3 = beneficiaryFlowAccountViewModel.footer_markdown;
        }
        if ((i & 32) != 0) {
            byteString = beneficiaryFlowAccountViewModel.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        return beneficiaryFlowAccountViewModel.copy(str, str2, list, beneficiaryFlowLoggingIdentifier, str4, byteString2);
    }

    public final BeneficiaryFlowAccountViewModel copy(String title, String subtitle_markdown, List<BeneficiaryFlowAccountRow> account_rows, BeneficiaryFlowLoggingIdentifier logging_identifier, String footer_markdown, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(account_rows, "account_rows");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowAccountViewModel(title, subtitle_markdown, account_rows, logging_identifier, footer_markdown, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowAccountViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowAccountViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowAccountViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowAccountViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getSubtitle_markdown()) + BeneficiaryFlowAccountRow.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getAccount_rows());
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    iEncodedSizeWithTag += BeneficiaryFlowLoggingIdentifier.ADAPTER.encodedSizeWithTag(4, value.getLogging_identifier());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, value.getFooter_markdown());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowAccountViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                BeneficiaryFlowAccountRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAccount_rows());
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                }
                protoAdapter.encodeWithTag(writer, 5, (int) value.getFooter_markdown());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowAccountViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getFooter_markdown());
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                }
                BeneficiaryFlowAccountRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAccount_rows());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowAccountViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifierDecode = BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier = beneficiaryFlowLoggingIdentifierDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new BeneficiaryFlowAccountViewModel(strDecode3, strDecode, arrayList, beneficiaryFlowLoggingIdentifier, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            arrayList.add(BeneficiaryFlowAccountRow.ADAPTER.decode(reader));
                        } else if (iNextTag == 4) {
                            try {
                                beneficiaryFlowLoggingIdentifierDecode = BeneficiaryFlowLoggingIdentifier.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 5) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowAccountViewModel redact(BeneficiaryFlowAccountViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryFlowAccountViewModel.copy$default(value, null, null, Internal.m26823redactElements(value.getAccount_rows(), BeneficiaryFlowAccountRow.ADAPTER), null, null, ByteString.EMPTY, 27, null);
            }
        };
    }
}
