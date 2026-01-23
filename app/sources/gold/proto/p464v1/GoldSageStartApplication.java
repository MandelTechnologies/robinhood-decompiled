package gold.proto.p464v1;

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
import rh_server_driven_ui.p531v1.Icon;

/* compiled from: GoldSageStartApplication.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016Jf\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006&"}, m3636d2 = {"Lgold/proto/v1/GoldSageStartApplication;", "Lcom/squareup/wire/Message;", "", "title", "", "description_markdown", "options", "", "Lgold/proto/v1/GoldSageMortgageOption;", "cta_disclosure", "cta_text", "agreement_type", "cta_icon", "Lrh_server_driven_ui/v1/Icon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lrh_server_driven_ui/v1/Icon;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription_markdown", "getCta_disclosure", "getCta_text", "getCta_icon", "()Lrh_server_driven_ui/v1/Icon;", "getOptions", "()Ljava/util/List;", "getAgreement_type", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GoldSageStartApplication extends Message {

    @JvmField
    public static final ProtoAdapter<GoldSageStartApplication> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementType", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<String> agreement_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaDisclosure", schemaIndex = 3, tag = 4)
    private final String cta_disclosure;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", jsonName = "ctaIcon", schemaIndex = 6, tag = 7)
    private final Icon cta_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "descriptionMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description_markdown;

    @WireField(adapter = "gold.proto.v1.GoldSageMortgageOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<GoldSageMortgageOption> options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public GoldSageStartApplication() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ GoldSageStartApplication(String str, String str2, List list, String str3, String str4, List list2, Icon icon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? null : icon, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28137newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription_markdown() {
        return this.description_markdown;
    }

    public final String getCta_disclosure() {
        return this.cta_disclosure;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    public final Icon getCta_icon() {
        return this.cta_icon;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSageStartApplication(String title, String description_markdown, List<GoldSageMortgageOption> options, String str, String cta_text, List<String> agreement_type, Icon icon, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description_markdown = description_markdown;
        this.cta_disclosure = str;
        this.cta_text = cta_text;
        this.cta_icon = icon;
        this.options = Internal.immutableCopyOf("options", options);
        this.agreement_type = Internal.immutableCopyOf("agreement_type", agreement_type);
    }

    public final List<GoldSageMortgageOption> getOptions() {
        return this.options;
    }

    public final List<String> getAgreement_type() {
        return this.agreement_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28137newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldSageStartApplication)) {
            return false;
        }
        GoldSageStartApplication goldSageStartApplication = (GoldSageStartApplication) other;
        return Intrinsics.areEqual(unknownFields(), goldSageStartApplication.unknownFields()) && Intrinsics.areEqual(this.title, goldSageStartApplication.title) && Intrinsics.areEqual(this.description_markdown, goldSageStartApplication.description_markdown) && Intrinsics.areEqual(this.options, goldSageStartApplication.options) && Intrinsics.areEqual(this.cta_disclosure, goldSageStartApplication.cta_disclosure) && Intrinsics.areEqual(this.cta_text, goldSageStartApplication.cta_text) && Intrinsics.areEqual(this.agreement_type, goldSageStartApplication.agreement_type) && this.cta_icon == goldSageStartApplication.cta_icon;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description_markdown.hashCode()) * 37) + this.options.hashCode()) * 37;
        String str = this.cta_disclosure;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.cta_text.hashCode()) * 37) + this.agreement_type.hashCode()) * 37;
        Icon icon = this.cta_icon;
        int iHashCode3 = iHashCode2 + (icon != null ? icon.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description_markdown=" + Internal.sanitize(this.description_markdown));
        if (!this.options.isEmpty()) {
            arrayList.add("options=" + this.options);
        }
        String str = this.cta_disclosure;
        if (str != null) {
            arrayList.add("cta_disclosure=" + Internal.sanitize(str));
        }
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        if (!this.agreement_type.isEmpty()) {
            arrayList.add("agreement_type=" + Internal.sanitize(this.agreement_type));
        }
        Icon icon = this.cta_icon;
        if (icon != null) {
            arrayList.add("cta_icon=" + icon);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldSageStartApplication{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GoldSageStartApplication copy$default(GoldSageStartApplication goldSageStartApplication, String str, String str2, List list, String str3, String str4, List list2, Icon icon, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldSageStartApplication.title;
        }
        if ((i & 2) != 0) {
            str2 = goldSageStartApplication.description_markdown;
        }
        if ((i & 4) != 0) {
            list = goldSageStartApplication.options;
        }
        if ((i & 8) != 0) {
            str3 = goldSageStartApplication.cta_disclosure;
        }
        if ((i & 16) != 0) {
            str4 = goldSageStartApplication.cta_text;
        }
        if ((i & 32) != 0) {
            list2 = goldSageStartApplication.agreement_type;
        }
        if ((i & 64) != 0) {
            icon = goldSageStartApplication.cta_icon;
        }
        if ((i & 128) != 0) {
            byteString = goldSageStartApplication.unknownFields();
        }
        Icon icon2 = icon;
        ByteString byteString2 = byteString;
        String str5 = str4;
        List list3 = list2;
        return goldSageStartApplication.copy(str, str2, list, str3, str5, list3, icon2, byteString2);
    }

    public final GoldSageStartApplication copy(String title, String description_markdown, List<GoldSageMortgageOption> options, String cta_disclosure, String cta_text, List<String> agreement_type, Icon cta_icon, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldSageStartApplication(title, description_markdown, options, cta_disclosure, cta_text, agreement_type, cta_icon, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldSageStartApplication.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldSageStartApplication>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold.proto.v1.GoldSageStartApplication$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldSageStartApplication value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription_markdown());
                }
                int iEncodedSizeWithTag = size + GoldSageMortgageOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getOptions());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getCta_disclosure());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(5, value.getCta_text());
                }
                return iEncodedSizeWithTag2 + protoAdapter.asRepeated().encodedSizeWithTag(6, value.getAgreement_type()) + Icon.ADAPTER.encodedSizeWithTag(7, value.getCta_icon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldSageStartApplication value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                }
                GoldSageMortgageOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOptions());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getCta_disclosure());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getCta_text());
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 6, (int) value.getAgreement_type());
                Icon.ADAPTER.encodeWithTag(writer, 7, (int) value.getCta_icon());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldSageStartApplication value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Icon.ADAPTER.encodeWithTag(writer, 7, (int) value.getCta_icon());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 6, (int) value.getAgreement_type());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getCta_text());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getCta_disclosure());
                GoldSageMortgageOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOptions());
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GoldSageStartApplication decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                Icon iconDecode = null;
                String strDecode4 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                arrayList.add(GoldSageMortgageOption.ADAPTER.decode(reader));
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                arrayList2.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 7:
                                try {
                                    iconDecode = Icon.ADAPTER.decode(reader);
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
                        return new GoldSageStartApplication(strDecode4, strDecode, arrayList, strDecode3, strDecode2, arrayList2, iconDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldSageStartApplication redact(GoldSageStartApplication value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GoldSageStartApplication.copy$default(value, null, null, Internal.m26823redactElements(value.getOptions(), GoldSageMortgageOption.ADAPTER), null, null, null, null, ByteString.EMPTY, 123, null);
            }
        };
    }
}
