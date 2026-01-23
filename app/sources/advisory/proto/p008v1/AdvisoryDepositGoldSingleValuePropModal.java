package advisory.proto.p008v1;

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

/* compiled from: AdvisoryDepositGoldSingleValuePropModal.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryDepositGoldSingleValuePropModal;", "Lcom/squareup/wire/Message;", "", "image_url_light", "", "image_url_dark", "title", "subtitle", "disclosure_markdown", "done_cta_title", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getImage_url_light", "()Ljava/lang/String;", "getImage_url_dark", "getTitle", "getSubtitle", "getDisclosure_markdown", "getDone_cta_title", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AdvisoryDepositGoldSingleValuePropModal extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryDepositGoldSingleValuePropModal> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "doneCtaTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String done_cta_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageUrlDark", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String image_url_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageUrlLight", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String image_url_light;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String title;

    public AdvisoryDepositGoldSingleValuePropModal() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ AdvisoryDepositGoldSingleValuePropModal(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4369newBuilder();
    }

    public final String getImage_url_light() {
        return this.image_url_light;
    }

    public final String getImage_url_dark() {
        return this.image_url_dark;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final String getDone_cta_title() {
        return this.done_cta_title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryDepositGoldSingleValuePropModal(String image_url_light, String image_url_dark, String title, String subtitle, String disclosure_markdown, String done_cta_title, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
        Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(done_cta_title, "done_cta_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.image_url_light = image_url_light;
        this.image_url_dark = image_url_dark;
        this.title = title;
        this.subtitle = subtitle;
        this.disclosure_markdown = disclosure_markdown;
        this.done_cta_title = done_cta_title;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4369newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryDepositGoldSingleValuePropModal)) {
            return false;
        }
        AdvisoryDepositGoldSingleValuePropModal advisoryDepositGoldSingleValuePropModal = (AdvisoryDepositGoldSingleValuePropModal) other;
        return Intrinsics.areEqual(unknownFields(), advisoryDepositGoldSingleValuePropModal.unknownFields()) && Intrinsics.areEqual(this.image_url_light, advisoryDepositGoldSingleValuePropModal.image_url_light) && Intrinsics.areEqual(this.image_url_dark, advisoryDepositGoldSingleValuePropModal.image_url_dark) && Intrinsics.areEqual(this.title, advisoryDepositGoldSingleValuePropModal.title) && Intrinsics.areEqual(this.subtitle, advisoryDepositGoldSingleValuePropModal.subtitle) && Intrinsics.areEqual(this.disclosure_markdown, advisoryDepositGoldSingleValuePropModal.disclosure_markdown) && Intrinsics.areEqual(this.done_cta_title, advisoryDepositGoldSingleValuePropModal.done_cta_title);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.image_url_light.hashCode()) * 37) + this.image_url_dark.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.disclosure_markdown.hashCode()) * 37) + this.done_cta_title.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("image_url_light=" + Internal.sanitize(this.image_url_light));
        arrayList.add("image_url_dark=" + Internal.sanitize(this.image_url_dark));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("disclosure_markdown=" + Internal.sanitize(this.disclosure_markdown));
        arrayList.add("done_cta_title=" + Internal.sanitize(this.done_cta_title));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryDepositGoldSingleValuePropModal{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryDepositGoldSingleValuePropModal copy$default(AdvisoryDepositGoldSingleValuePropModal advisoryDepositGoldSingleValuePropModal, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryDepositGoldSingleValuePropModal.image_url_light;
        }
        if ((i & 2) != 0) {
            str2 = advisoryDepositGoldSingleValuePropModal.image_url_dark;
        }
        if ((i & 4) != 0) {
            str3 = advisoryDepositGoldSingleValuePropModal.title;
        }
        if ((i & 8) != 0) {
            str4 = advisoryDepositGoldSingleValuePropModal.subtitle;
        }
        if ((i & 16) != 0) {
            str5 = advisoryDepositGoldSingleValuePropModal.disclosure_markdown;
        }
        if ((i & 32) != 0) {
            str6 = advisoryDepositGoldSingleValuePropModal.done_cta_title;
        }
        if ((i & 64) != 0) {
            byteString = advisoryDepositGoldSingleValuePropModal.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str5;
        String str9 = str3;
        return advisoryDepositGoldSingleValuePropModal.copy(str, str2, str9, str4, str8, str7, byteString2);
    }

    public final AdvisoryDepositGoldSingleValuePropModal copy(String image_url_light, String image_url_dark, String title, String subtitle, String disclosure_markdown, String done_cta_title, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
        Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(done_cta_title, "done_cta_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryDepositGoldSingleValuePropModal(image_url_light, image_url_dark, title, subtitle, disclosure_markdown, done_cta_title, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryDepositGoldSingleValuePropModal.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryDepositGoldSingleValuePropModal>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryDepositGoldSingleValuePropModal$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryDepositGoldSingleValuePropModal value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getImage_url_light(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getImage_url_light());
                }
                if (!Intrinsics.areEqual(value.getImage_url_dark(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getImage_url_dark());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDisclosure_markdown());
                }
                return !Intrinsics.areEqual(value.getDone_cta_title(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDone_cta_title()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryDepositGoldSingleValuePropModal value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getImage_url_light(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getImage_url_light());
                }
                if (!Intrinsics.areEqual(value.getImage_url_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getImage_url_dark());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getDone_cta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDone_cta_title());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryDepositGoldSingleValuePropModal value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDone_cta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDone_cta_title());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getImage_url_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getImage_url_dark());
                }
                if (Intrinsics.areEqual(value.getImage_url_light(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getImage_url_light());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryDepositGoldSingleValuePropModal redact(AdvisoryDepositGoldSingleValuePropModal value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdvisoryDepositGoldSingleValuePropModal.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryDepositGoldSingleValuePropModal decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AdvisoryDepositGoldSingleValuePropModal(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
