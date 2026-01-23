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

/* compiled from: BeneficiaryFlowReuseExistingViewModel.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingViewModel;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle_markdown", "existing_beneficiaries", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingRow;", "add_new_cta_title", "add_new_cta_logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle_markdown", "getAdd_new_cta_title", "getAdd_new_cta_logging_identifier", "getExisting_beneficiaries", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowReuseExistingViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowReuseExistingViewModel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "addNewCtaLoggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String add_new_cta_logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "addNewCtaTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String add_new_cta_title;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowReuseExistingRow#ADAPTER", jsonName = "existingBeneficiaries", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<BeneficiaryFlowReuseExistingRow> existing_beneficiaries;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public BeneficiaryFlowReuseExistingViewModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ BeneficiaryFlowReuseExistingViewModel(String str, String str2, List list, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8814newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final String getAdd_new_cta_title() {
        return this.add_new_cta_title;
    }

    public final String getAdd_new_cta_logging_identifier() {
        return this.add_new_cta_logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowReuseExistingViewModel(String title, String subtitle_markdown, List<BeneficiaryFlowReuseExistingRow> existing_beneficiaries, String add_new_cta_title, String add_new_cta_logging_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
        Intrinsics.checkNotNullParameter(existing_beneficiaries, "existing_beneficiaries");
        Intrinsics.checkNotNullParameter(add_new_cta_title, "add_new_cta_title");
        Intrinsics.checkNotNullParameter(add_new_cta_logging_identifier, "add_new_cta_logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle_markdown = subtitle_markdown;
        this.add_new_cta_title = add_new_cta_title;
        this.add_new_cta_logging_identifier = add_new_cta_logging_identifier;
        this.existing_beneficiaries = Internal.immutableCopyOf("existing_beneficiaries", existing_beneficiaries);
    }

    public final List<BeneficiaryFlowReuseExistingRow> getExisting_beneficiaries() {
        return this.existing_beneficiaries;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8814newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowReuseExistingViewModel)) {
            return false;
        }
        BeneficiaryFlowReuseExistingViewModel beneficiaryFlowReuseExistingViewModel = (BeneficiaryFlowReuseExistingViewModel) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowReuseExistingViewModel.unknownFields()) && Intrinsics.areEqual(this.title, beneficiaryFlowReuseExistingViewModel.title) && Intrinsics.areEqual(this.subtitle_markdown, beneficiaryFlowReuseExistingViewModel.subtitle_markdown) && Intrinsics.areEqual(this.existing_beneficiaries, beneficiaryFlowReuseExistingViewModel.existing_beneficiaries) && Intrinsics.areEqual(this.add_new_cta_title, beneficiaryFlowReuseExistingViewModel.add_new_cta_title) && Intrinsics.areEqual(this.add_new_cta_logging_identifier, beneficiaryFlowReuseExistingViewModel.add_new_cta_logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle_markdown.hashCode()) * 37) + this.existing_beneficiaries.hashCode()) * 37) + this.add_new_cta_title.hashCode()) * 37) + this.add_new_cta_logging_identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle_markdown=" + Internal.sanitize(this.subtitle_markdown));
        if (!this.existing_beneficiaries.isEmpty()) {
            arrayList.add("existing_beneficiaries=" + this.existing_beneficiaries);
        }
        arrayList.add("add_new_cta_title=" + Internal.sanitize(this.add_new_cta_title));
        arrayList.add("add_new_cta_logging_identifier=" + Internal.sanitize(this.add_new_cta_logging_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowReuseExistingViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BeneficiaryFlowReuseExistingViewModel copy$default(BeneficiaryFlowReuseExistingViewModel beneficiaryFlowReuseExistingViewModel, String str, String str2, List list, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryFlowReuseExistingViewModel.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryFlowReuseExistingViewModel.subtitle_markdown;
        }
        if ((i & 4) != 0) {
            list = beneficiaryFlowReuseExistingViewModel.existing_beneficiaries;
        }
        if ((i & 8) != 0) {
            str3 = beneficiaryFlowReuseExistingViewModel.add_new_cta_title;
        }
        if ((i & 16) != 0) {
            str4 = beneficiaryFlowReuseExistingViewModel.add_new_cta_logging_identifier;
        }
        if ((i & 32) != 0) {
            byteString = beneficiaryFlowReuseExistingViewModel.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return beneficiaryFlowReuseExistingViewModel.copy(str, str2, list, str3, str5, byteString2);
    }

    public final BeneficiaryFlowReuseExistingViewModel copy(String title, String subtitle_markdown, List<BeneficiaryFlowReuseExistingRow> existing_beneficiaries, String add_new_cta_title, String add_new_cta_logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
        Intrinsics.checkNotNullParameter(existing_beneficiaries, "existing_beneficiaries");
        Intrinsics.checkNotNullParameter(add_new_cta_title, "add_new_cta_title");
        Intrinsics.checkNotNullParameter(add_new_cta_logging_identifier, "add_new_cta_logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowReuseExistingViewModel(title, subtitle_markdown, existing_beneficiaries, add_new_cta_title, add_new_cta_logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowReuseExistingViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowReuseExistingViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowReuseExistingViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowReuseExistingViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle_markdown());
                }
                int iEncodedSizeWithTag = size + BeneficiaryFlowReuseExistingRow.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getExisting_beneficiaries());
                if (!Intrinsics.areEqual(value.getAdd_new_cta_title(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAdd_new_cta_title());
                }
                return !Intrinsics.areEqual(value.getAdd_new_cta_logging_identifier(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAdd_new_cta_logging_identifier()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowReuseExistingViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                }
                BeneficiaryFlowReuseExistingRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getExisting_beneficiaries());
                if (!Intrinsics.areEqual(value.getAdd_new_cta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAdd_new_cta_title());
                }
                if (!Intrinsics.areEqual(value.getAdd_new_cta_logging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAdd_new_cta_logging_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowReuseExistingViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAdd_new_cta_logging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAdd_new_cta_logging_identifier());
                }
                if (!Intrinsics.areEqual(value.getAdd_new_cta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAdd_new_cta_title());
                }
                BeneficiaryFlowReuseExistingRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getExisting_beneficiaries());
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowReuseExistingViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BeneficiaryFlowReuseExistingViewModel(strDecode, strDecode2, arrayList, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(BeneficiaryFlowReuseExistingRow.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowReuseExistingViewModel redact(BeneficiaryFlowReuseExistingViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryFlowReuseExistingViewModel.copy$default(value, null, null, Internal.m26823redactElements(value.getExisting_beneficiaries(), BeneficiaryFlowReuseExistingRow.ADAPTER), null, null, ByteString.EMPTY, 27, null);
            }
        };
    }
}
