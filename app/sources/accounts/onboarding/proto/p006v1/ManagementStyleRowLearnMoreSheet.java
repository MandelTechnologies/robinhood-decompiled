package accounts.onboarding.proto.p006v1;

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

/* compiled from: ManagementStyleRowLearnMoreSheet.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001e\u001a\u00020\u0002H\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016Jr\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheet;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "bullets", "", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreBullet;", "primary_cta_text", "secondary_cta_text", "markdown_disclosure", "logging_identifier", "primary_cta_identifier", "secondary_cta_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimary_cta_text", "getSecondary_cta_text", "getMarkdown_disclosure", "getLogging_identifier", "getPrimary_cta_identifier", "getSecondary_cta_identifier", "getBullets", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class ManagementStyleRowLearnMoreSheet extends Message {

    @JvmField
    public static final ProtoAdapter<ManagementStyleRowLearnMoreSheet> ADAPTER;

    @WireField(adapter = "accounts.onboarding.proto.v1.ManagementStyleRowLearnMoreBullet#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<ManagementStyleRowLearnMoreBullet> bullets;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "markdownDisclosure", schemaIndex = 5, tag = 6)
    private final String markdown_disclosure;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCtaIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String primary_cta_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String primary_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCtaIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String secondary_cta_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String secondary_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public ManagementStyleRowLearnMoreSheet() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ ManagementStyleRowLearnMoreSheet(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4355newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getPrimary_cta_text() {
        return this.primary_cta_text;
    }

    public final String getSecondary_cta_text() {
        return this.secondary_cta_text;
    }

    public final String getMarkdown_disclosure() {
        return this.markdown_disclosure;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final String getPrimary_cta_identifier() {
        return this.primary_cta_identifier;
    }

    public final String getSecondary_cta_identifier() {
        return this.secondary_cta_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementStyleRowLearnMoreSheet(String title, String subtitle, List<ManagementStyleRowLearnMoreBullet> bullets, String primary_cta_text, String secondary_cta_text, String str, String logging_identifier, String primary_cta_identifier, String secondary_cta_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
        Intrinsics.checkNotNullParameter(secondary_cta_text, "secondary_cta_text");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(primary_cta_identifier, "primary_cta_identifier");
        Intrinsics.checkNotNullParameter(secondary_cta_identifier, "secondary_cta_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.primary_cta_text = primary_cta_text;
        this.secondary_cta_text = secondary_cta_text;
        this.markdown_disclosure = str;
        this.logging_identifier = logging_identifier;
        this.primary_cta_identifier = primary_cta_identifier;
        this.secondary_cta_identifier = secondary_cta_identifier;
        this.bullets = Internal.immutableCopyOf("bullets", bullets);
    }

    public final List<ManagementStyleRowLearnMoreBullet> getBullets() {
        return this.bullets;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4355newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ManagementStyleRowLearnMoreSheet)) {
            return false;
        }
        ManagementStyleRowLearnMoreSheet managementStyleRowLearnMoreSheet = (ManagementStyleRowLearnMoreSheet) other;
        return Intrinsics.areEqual(unknownFields(), managementStyleRowLearnMoreSheet.unknownFields()) && Intrinsics.areEqual(this.title, managementStyleRowLearnMoreSheet.title) && Intrinsics.areEqual(this.subtitle, managementStyleRowLearnMoreSheet.subtitle) && Intrinsics.areEqual(this.bullets, managementStyleRowLearnMoreSheet.bullets) && Intrinsics.areEqual(this.primary_cta_text, managementStyleRowLearnMoreSheet.primary_cta_text) && Intrinsics.areEqual(this.secondary_cta_text, managementStyleRowLearnMoreSheet.secondary_cta_text) && Intrinsics.areEqual(this.markdown_disclosure, managementStyleRowLearnMoreSheet.markdown_disclosure) && Intrinsics.areEqual(this.logging_identifier, managementStyleRowLearnMoreSheet.logging_identifier) && Intrinsics.areEqual(this.primary_cta_identifier, managementStyleRowLearnMoreSheet.primary_cta_identifier) && Intrinsics.areEqual(this.secondary_cta_identifier, managementStyleRowLearnMoreSheet.secondary_cta_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.bullets.hashCode()) * 37) + this.primary_cta_text.hashCode()) * 37) + this.secondary_cta_text.hashCode()) * 37;
        String str = this.markdown_disclosure;
        int iHashCode2 = ((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.logging_identifier.hashCode()) * 37) + this.primary_cta_identifier.hashCode()) * 37) + this.secondary_cta_identifier.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        if (!this.bullets.isEmpty()) {
            arrayList.add("bullets=" + this.bullets);
        }
        arrayList.add("primary_cta_text=" + Internal.sanitize(this.primary_cta_text));
        arrayList.add("secondary_cta_text=" + Internal.sanitize(this.secondary_cta_text));
        String str = this.markdown_disclosure;
        if (str != null) {
            arrayList.add("markdown_disclosure=" + Internal.sanitize(str));
        }
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        arrayList.add("primary_cta_identifier=" + Internal.sanitize(this.primary_cta_identifier));
        arrayList.add("secondary_cta_identifier=" + Internal.sanitize(this.secondary_cta_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagementStyleRowLearnMoreSheet{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ManagementStyleRowLearnMoreSheet copy$default(ManagementStyleRowLearnMoreSheet managementStyleRowLearnMoreSheet, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managementStyleRowLearnMoreSheet.title;
        }
        if ((i & 2) != 0) {
            str2 = managementStyleRowLearnMoreSheet.subtitle;
        }
        if ((i & 4) != 0) {
            list = managementStyleRowLearnMoreSheet.bullets;
        }
        if ((i & 8) != 0) {
            str3 = managementStyleRowLearnMoreSheet.primary_cta_text;
        }
        if ((i & 16) != 0) {
            str4 = managementStyleRowLearnMoreSheet.secondary_cta_text;
        }
        if ((i & 32) != 0) {
            str5 = managementStyleRowLearnMoreSheet.markdown_disclosure;
        }
        if ((i & 64) != 0) {
            str6 = managementStyleRowLearnMoreSheet.logging_identifier;
        }
        if ((i & 128) != 0) {
            str7 = managementStyleRowLearnMoreSheet.primary_cta_identifier;
        }
        if ((i & 256) != 0) {
            str8 = managementStyleRowLearnMoreSheet.secondary_cta_identifier;
        }
        if ((i & 512) != 0) {
            byteString = managementStyleRowLearnMoreSheet.unknownFields();
        }
        String str9 = str8;
        ByteString byteString2 = byteString;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        return managementStyleRowLearnMoreSheet.copy(str, str2, list, str3, str12, str13, str10, str11, str9, byteString2);
    }

    public final ManagementStyleRowLearnMoreSheet copy(String title, String subtitle, List<ManagementStyleRowLearnMoreBullet> bullets, String primary_cta_text, String secondary_cta_text, String markdown_disclosure, String logging_identifier, String primary_cta_identifier, String secondary_cta_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
        Intrinsics.checkNotNullParameter(secondary_cta_text, "secondary_cta_text");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(primary_cta_identifier, "primary_cta_identifier");
        Intrinsics.checkNotNullParameter(secondary_cta_identifier, "secondary_cta_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ManagementStyleRowLearnMoreSheet(title, subtitle, bullets, primary_cta_text, secondary_cta_text, markdown_disclosure, logging_identifier, primary_cta_identifier, secondary_cta_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ManagementStyleRowLearnMoreSheet.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ManagementStyleRowLearnMoreSheet>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: accounts.onboarding.proto.v1.ManagementStyleRowLearnMoreSheet$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ManagementStyleRowLearnMoreSheet value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                int iEncodedSizeWithTag = size + ManagementStyleRowLearnMoreBullet.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getBullets());
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPrimary_cta_text());
                }
                if (!Intrinsics.areEqual(value.getSecondary_cta_text(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSecondary_cta_text());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getMarkdown_disclosure());
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(7, value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_identifier(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(8, value.getPrimary_cta_identifier());
                }
                return !Intrinsics.areEqual(value.getSecondary_cta_identifier(), "") ? iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(9, value.getSecondary_cta_identifier()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ManagementStyleRowLearnMoreSheet value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                ManagementStyleRowLearnMoreBullet.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getBullets());
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrimary_cta_text());
                }
                if (!Intrinsics.areEqual(value.getSecondary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSecondary_cta_text());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getMarkdown_disclosure());
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_identifier(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getPrimary_cta_identifier());
                }
                if (!Intrinsics.areEqual(value.getSecondary_cta_identifier(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getSecondary_cta_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ManagementStyleRowLearnMoreSheet value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSecondary_cta_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getSecondary_cta_identifier());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPrimary_cta_identifier());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getMarkdown_disclosure());
                if (!Intrinsics.areEqual(value.getSecondary_cta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getSecondary_cta_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getPrimary_cta_text());
                }
                ManagementStyleRowLearnMoreBullet.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getBullets());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ManagementStyleRowLearnMoreSheet decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = null;
                String strDecode8 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                arrayList.add(ManagementStyleRowLearnMoreBullet.ADAPTER.decode(reader));
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ManagementStyleRowLearnMoreSheet(strDecode, strDecode8, arrayList, strDecode2, strDecode3, strDecode7, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ManagementStyleRowLearnMoreSheet redact(ManagementStyleRowLearnMoreSheet value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ManagementStyleRowLearnMoreSheet.copy$default(value, null, null, Internal.m26823redactElements(value.getBullets(), ManagementStyleRowLearnMoreBullet.ADAPTER), null, null, null, null, null, null, ByteString.EMPTY, 507, null);
            }
        };
    }
}
