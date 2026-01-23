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

/* compiled from: BeneficiaryFlowTrustDateViewModel.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jp\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle_markdown", "date_hint", "date_value", "date_template", "android_format_template", "ios_format_template", "web_format_template", "logging_identifier", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle_markdown", "getDate_hint", "getDate_value", "getDate_template", "getAndroid_format_template", "getIos_format_template", "getWeb_format_template", "getLogging_identifier", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowTrustDateViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowTrustDateViewModel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "androidFormatTemplate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String android_format_template;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dateHint", schemaIndex = 2, tag = 3)
    private final String date_hint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dateTemplate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String date_template;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dateValue", schemaIndex = 3, tag = 4)
    private final String date_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "iosFormatTemplate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String ios_format_template;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowLoggingIdentifier#ADAPTER", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final BeneficiaryFlowLoggingIdentifier logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", schemaIndex = 1, tag = 2)
    private final String subtitle_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webFormatTemplate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String web_format_template;

    public BeneficiaryFlowTrustDateViewModel() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ BeneficiaryFlowTrustDateViewModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED : beneficiaryFlowLoggingIdentifier, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8815newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final String getDate_hint() {
        return this.date_hint;
    }

    public final String getDate_value() {
        return this.date_value;
    }

    public final String getDate_template() {
        return this.date_template;
    }

    public final String getAndroid_format_template() {
        return this.android_format_template;
    }

    public final String getIos_format_template() {
        return this.ios_format_template;
    }

    public final String getWeb_format_template() {
        return this.web_format_template;
    }

    public final BeneficiaryFlowLoggingIdentifier getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowTrustDateViewModel(String title, String str, String str2, String str3, String date_template, String android_format_template, String ios_format_template, String web_format_template, BeneficiaryFlowLoggingIdentifier logging_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(date_template, "date_template");
        Intrinsics.checkNotNullParameter(android_format_template, "android_format_template");
        Intrinsics.checkNotNullParameter(ios_format_template, "ios_format_template");
        Intrinsics.checkNotNullParameter(web_format_template, "web_format_template");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle_markdown = str;
        this.date_hint = str2;
        this.date_value = str3;
        this.date_template = date_template;
        this.android_format_template = android_format_template;
        this.ios_format_template = ios_format_template;
        this.web_format_template = web_format_template;
        this.logging_identifier = logging_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8815newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowTrustDateViewModel)) {
            return false;
        }
        BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel = (BeneficiaryFlowTrustDateViewModel) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowTrustDateViewModel.unknownFields()) && Intrinsics.areEqual(this.title, beneficiaryFlowTrustDateViewModel.title) && Intrinsics.areEqual(this.subtitle_markdown, beneficiaryFlowTrustDateViewModel.subtitle_markdown) && Intrinsics.areEqual(this.date_hint, beneficiaryFlowTrustDateViewModel.date_hint) && Intrinsics.areEqual(this.date_value, beneficiaryFlowTrustDateViewModel.date_value) && Intrinsics.areEqual(this.date_template, beneficiaryFlowTrustDateViewModel.date_template) && Intrinsics.areEqual(this.android_format_template, beneficiaryFlowTrustDateViewModel.android_format_template) && Intrinsics.areEqual(this.ios_format_template, beneficiaryFlowTrustDateViewModel.ios_format_template) && Intrinsics.areEqual(this.web_format_template, beneficiaryFlowTrustDateViewModel.web_format_template) && this.logging_identifier == beneficiaryFlowTrustDateViewModel.logging_identifier;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        String str = this.subtitle_markdown;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.date_hint;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.date_value;
        int iHashCode4 = ((((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.date_template.hashCode()) * 37) + this.android_format_template.hashCode()) * 37) + this.ios_format_template.hashCode()) * 37) + this.web_format_template.hashCode()) * 37) + this.logging_identifier.hashCode();
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
        String str2 = this.date_hint;
        if (str2 != null) {
            arrayList.add("date_hint=" + Internal.sanitize(str2));
        }
        String str3 = this.date_value;
        if (str3 != null) {
            arrayList.add("date_value=" + Internal.sanitize(str3));
        }
        arrayList.add("date_template=" + Internal.sanitize(this.date_template));
        arrayList.add("android_format_template=" + Internal.sanitize(this.android_format_template));
        arrayList.add("ios_format_template=" + Internal.sanitize(this.ios_format_template));
        arrayList.add("web_format_template=" + Internal.sanitize(this.web_format_template));
        arrayList.add("logging_identifier=" + this.logging_identifier);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowTrustDateViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BeneficiaryFlowTrustDateViewModel copy$default(BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryFlowTrustDateViewModel.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryFlowTrustDateViewModel.subtitle_markdown;
        }
        if ((i & 4) != 0) {
            str3 = beneficiaryFlowTrustDateViewModel.date_hint;
        }
        if ((i & 8) != 0) {
            str4 = beneficiaryFlowTrustDateViewModel.date_value;
        }
        if ((i & 16) != 0) {
            str5 = beneficiaryFlowTrustDateViewModel.date_template;
        }
        if ((i & 32) != 0) {
            str6 = beneficiaryFlowTrustDateViewModel.android_format_template;
        }
        if ((i & 64) != 0) {
            str7 = beneficiaryFlowTrustDateViewModel.ios_format_template;
        }
        if ((i & 128) != 0) {
            str8 = beneficiaryFlowTrustDateViewModel.web_format_template;
        }
        if ((i & 256) != 0) {
            beneficiaryFlowLoggingIdentifier = beneficiaryFlowTrustDateViewModel.logging_identifier;
        }
        if ((i & 512) != 0) {
            byteString = beneficiaryFlowTrustDateViewModel.unknownFields();
        }
        BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier2 = beneficiaryFlowLoggingIdentifier;
        ByteString byteString2 = byteString;
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return beneficiaryFlowTrustDateViewModel.copy(str, str2, str3, str4, str11, str12, str9, str10, beneficiaryFlowLoggingIdentifier2, byteString2);
    }

    public final BeneficiaryFlowTrustDateViewModel copy(String title, String subtitle_markdown, String date_hint, String date_value, String date_template, String android_format_template, String ios_format_template, String web_format_template, BeneficiaryFlowLoggingIdentifier logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(date_template, "date_template");
        Intrinsics.checkNotNullParameter(android_format_template, "android_format_template");
        Intrinsics.checkNotNullParameter(ios_format_template, "ios_format_template");
        Intrinsics.checkNotNullParameter(web_format_template, "web_format_template");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowTrustDateViewModel(title, subtitle_markdown, date_hint, date_value, date_template, android_format_template, ios_format_template, web_format_template, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowTrustDateViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowTrustDateViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowTrustDateViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowTrustDateViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getSubtitle_markdown()) + protoAdapter.encodedSizeWithTag(3, value.getDate_hint()) + protoAdapter.encodedSizeWithTag(4, value.getDate_value());
                if (!Intrinsics.areEqual(value.getDate_template(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getDate_template());
                }
                if (!Intrinsics.areEqual(value.getAndroid_format_template(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(6, value.getAndroid_format_template());
                }
                if (!Intrinsics.areEqual(value.getIos_format_template(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(7, value.getIos_format_template());
                }
                if (!Intrinsics.areEqual(value.getWeb_format_template(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getWeb_format_template());
                }
                return value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED ? iEncodedSizeWithTag + BeneficiaryFlowLoggingIdentifier.ADAPTER.encodedSizeWithTag(9, value.getLogging_identifier()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowTrustDateViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDate_hint());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDate_value());
                if (!Intrinsics.areEqual(value.getDate_template(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getDate_template());
                }
                if (!Intrinsics.areEqual(value.getAndroid_format_template(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getAndroid_format_template());
                }
                if (!Intrinsics.areEqual(value.getIos_format_template(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getIos_format_template());
                }
                if (!Intrinsics.areEqual(value.getWeb_format_template(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getWeb_format_template());
                }
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 9, (int) value.getLogging_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowTrustDateViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLogging_identifier() != BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryFlowLoggingIdentifier.ADAPTER.encodeWithTag(writer, 9, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getWeb_format_template(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getWeb_format_template());
                }
                if (!Intrinsics.areEqual(value.getIos_format_template(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getIos_format_template());
                }
                if (!Intrinsics.areEqual(value.getAndroid_format_template(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAndroid_format_template());
                }
                if (!Intrinsics.areEqual(value.getDate_template(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDate_template());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDate_value());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDate_hint());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowTrustDateViewModel decode(ProtoReader reader) throws IOException {
                BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier2 = BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = null;
                String strDecode6 = null;
                String strDecode7 = null;
                BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifierDecode = beneficiaryFlowLoggingIdentifier2;
                String strDecode8 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                try {
                                    beneficiaryFlowLoggingIdentifierDecode = BeneficiaryFlowLoggingIdentifier.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    beneficiaryFlowLoggingIdentifier = beneficiaryFlowLoggingIdentifierDecode;
                                    str = strDecode8;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                beneficiaryFlowLoggingIdentifier = beneficiaryFlowLoggingIdentifierDecode;
                                str = strDecode8;
                                break;
                        }
                        strDecode8 = str;
                        beneficiaryFlowLoggingIdentifierDecode = beneficiaryFlowLoggingIdentifier;
                    } else {
                        return new BeneficiaryFlowTrustDateViewModel(strDecode8, strDecode5, strDecode6, strDecode7, strDecode, strDecode2, strDecode3, strDecode4, beneficiaryFlowLoggingIdentifierDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowTrustDateViewModel redact(BeneficiaryFlowTrustDateViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryFlowTrustDateViewModel.copy$default(value, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 511, null);
            }
        };
    }
}
