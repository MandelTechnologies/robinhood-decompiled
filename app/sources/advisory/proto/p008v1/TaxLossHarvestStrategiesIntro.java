package advisory.proto.p008v1;

import com.robinhood.android.markdown.compose.MarkdownText4;
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

/* compiled from: TaxLossHarvestStrategiesIntro.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016JD\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesIntro;", "Lcom/squareup/wire/Message;", "", "title", "", "description_markdown", "disclosure_markdown", "continue_cta_title", "image_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription_markdown", "getDisclosure_markdown", "getContinue_cta_title", "getImage_url", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestStrategiesIntro extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestStrategiesIntro> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "continueCtaTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String continue_cta_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "descriptionMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MarkdownText4.TagImageUrl, schemaIndex = 4, tag = 5)
    private final String image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public TaxLossHarvestStrategiesIntro() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ TaxLossHarvestStrategiesIntro(String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4559newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription_markdown() {
        return this.description_markdown;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final String getContinue_cta_title() {
        return this.continue_cta_title;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestStrategiesIntro(String title, String description_markdown, String disclosure_markdown, String continue_cta_title, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(continue_cta_title, "continue_cta_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description_markdown = description_markdown;
        this.disclosure_markdown = disclosure_markdown;
        this.continue_cta_title = continue_cta_title;
        this.image_url = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4559newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestStrategiesIntro)) {
            return false;
        }
        TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro = (TaxLossHarvestStrategiesIntro) other;
        return Intrinsics.areEqual(unknownFields(), taxLossHarvestStrategiesIntro.unknownFields()) && Intrinsics.areEqual(this.title, taxLossHarvestStrategiesIntro.title) && Intrinsics.areEqual(this.description_markdown, taxLossHarvestStrategiesIntro.description_markdown) && Intrinsics.areEqual(this.disclosure_markdown, taxLossHarvestStrategiesIntro.disclosure_markdown) && Intrinsics.areEqual(this.continue_cta_title, taxLossHarvestStrategiesIntro.continue_cta_title) && Intrinsics.areEqual(this.image_url, taxLossHarvestStrategiesIntro.image_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description_markdown.hashCode()) * 37) + this.disclosure_markdown.hashCode()) * 37) + this.continue_cta_title.hashCode()) * 37;
        String str = this.image_url;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description_markdown=" + Internal.sanitize(this.description_markdown));
        arrayList.add("disclosure_markdown=" + Internal.sanitize(this.disclosure_markdown));
        arrayList.add("continue_cta_title=" + Internal.sanitize(this.continue_cta_title));
        String str = this.image_url;
        if (str != null) {
            arrayList.add("image_url=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLossHarvestStrategiesIntro{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLossHarvestStrategiesIntro copy$default(TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestStrategiesIntro.title;
        }
        if ((i & 2) != 0) {
            str2 = taxLossHarvestStrategiesIntro.description_markdown;
        }
        if ((i & 4) != 0) {
            str3 = taxLossHarvestStrategiesIntro.disclosure_markdown;
        }
        if ((i & 8) != 0) {
            str4 = taxLossHarvestStrategiesIntro.continue_cta_title;
        }
        if ((i & 16) != 0) {
            str5 = taxLossHarvestStrategiesIntro.image_url;
        }
        if ((i & 32) != 0) {
            byteString = taxLossHarvestStrategiesIntro.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        return taxLossHarvestStrategiesIntro.copy(str, str2, str3, str4, str6, byteString2);
    }

    public final TaxLossHarvestStrategiesIntro copy(String title, String description_markdown, String disclosure_markdown, String continue_cta_title, String image_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(continue_cta_title, "continue_cta_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLossHarvestStrategiesIntro(title, description_markdown, disclosure_markdown, continue_cta_title, image_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestStrategiesIntro.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLossHarvestStrategiesIntro>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.TaxLossHarvestStrategiesIntro$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLossHarvestStrategiesIntro value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription_markdown());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDisclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getContinue_cta_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getContinue_cta_title());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getImage_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLossHarvestStrategiesIntro value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getContinue_cta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getContinue_cta_title());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getImage_url());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLossHarvestStrategiesIntro value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getImage_url());
                if (!Intrinsics.areEqual(value.getContinue_cta_title(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getContinue_cta_title());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getDisclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategiesIntro redact(TaxLossHarvestStrategiesIntro value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TaxLossHarvestStrategiesIntro.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategiesIntro decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = null;
                String strDecode5 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TaxLossHarvestStrategiesIntro(strDecode, strDecode5, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
