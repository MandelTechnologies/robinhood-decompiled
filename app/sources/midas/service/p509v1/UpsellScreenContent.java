package midas.service.p509v1;

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

/* compiled from: UpsellScreenContent.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\bH\u0016JR\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006#"}, m3636d2 = {"Lmidas/service/v1/UpsellScreenContent;", "Lcom/squareup/wire/Message;", "", "asset", "Lmidas/service/v1/Asset;", "info_tag", "Lmidas/service/v1/InfoTag;", "title", "", "description_markdown", "cta_text", "cta_disclosure_markdown", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmidas/service/v1/Asset;Lmidas/service/v1/InfoTag;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAsset", "()Lmidas/service/v1/Asset;", "getInfo_tag", "()Lmidas/service/v1/InfoTag;", "getTitle", "()Ljava/lang/String;", "getDescription_markdown", "getCta_text", "getCta_disclosure_markdown", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class UpsellScreenContent extends Message {

    @JvmField
    public static final ProtoAdapter<UpsellScreenContent> ADAPTER;

    @WireField(adapter = "midas.service.v1.Asset#ADAPTER", schemaIndex = 0, tag = 1)
    private final Asset asset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String cta_disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String description_markdown;

    @WireField(adapter = "midas.service.v1.InfoTag#ADAPTER", schemaIndex = 1, tag = 2)
    private final InfoTag info_tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String title;

    public UpsellScreenContent() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ UpsellScreenContent(Asset asset, InfoTag infoTag, String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : asset, (i & 2) != 0 ? null : infoTag, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29328newBuilder();
    }

    public final Asset getAsset() {
        return this.asset;
    }

    public final InfoTag getInfo_tag() {
        return this.info_tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription_markdown() {
        return this.description_markdown;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    public final String getCta_disclosure_markdown() {
        return this.cta_disclosure_markdown;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpsellScreenContent(Asset asset, InfoTag infoTag, String title, String description_markdown, String cta_text, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset = asset;
        this.info_tag = infoTag;
        this.title = title;
        this.description_markdown = description_markdown;
        this.cta_text = cta_text;
        this.cta_disclosure_markdown = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29328newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpsellScreenContent)) {
            return false;
        }
        UpsellScreenContent upsellScreenContent = (UpsellScreenContent) other;
        return Intrinsics.areEqual(unknownFields(), upsellScreenContent.unknownFields()) && Intrinsics.areEqual(this.asset, upsellScreenContent.asset) && Intrinsics.areEqual(this.info_tag, upsellScreenContent.info_tag) && Intrinsics.areEqual(this.title, upsellScreenContent.title) && Intrinsics.areEqual(this.description_markdown, upsellScreenContent.description_markdown) && Intrinsics.areEqual(this.cta_text, upsellScreenContent.cta_text) && Intrinsics.areEqual(this.cta_disclosure_markdown, upsellScreenContent.cta_disclosure_markdown);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Asset asset = this.asset;
        int iHashCode2 = (iHashCode + (asset != null ? asset.hashCode() : 0)) * 37;
        InfoTag infoTag = this.info_tag;
        int iHashCode3 = (((((((iHashCode2 + (infoTag != null ? infoTag.hashCode() : 0)) * 37) + this.title.hashCode()) * 37) + this.description_markdown.hashCode()) * 37) + this.cta_text.hashCode()) * 37;
        String str = this.cta_disclosure_markdown;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Asset asset = this.asset;
        if (asset != null) {
            arrayList.add("asset=" + asset);
        }
        InfoTag infoTag = this.info_tag;
        if (infoTag != null) {
            arrayList.add("info_tag=" + infoTag);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description_markdown=" + Internal.sanitize(this.description_markdown));
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        String str = this.cta_disclosure_markdown;
        if (str != null) {
            arrayList.add("cta_disclosure_markdown=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpsellScreenContent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpsellScreenContent copy$default(UpsellScreenContent upsellScreenContent, Asset asset, InfoTag infoTag, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            asset = upsellScreenContent.asset;
        }
        if ((i & 2) != 0) {
            infoTag = upsellScreenContent.info_tag;
        }
        if ((i & 4) != 0) {
            str = upsellScreenContent.title;
        }
        if ((i & 8) != 0) {
            str2 = upsellScreenContent.description_markdown;
        }
        if ((i & 16) != 0) {
            str3 = upsellScreenContent.cta_text;
        }
        if ((i & 32) != 0) {
            str4 = upsellScreenContent.cta_disclosure_markdown;
        }
        if ((i & 64) != 0) {
            byteString = upsellScreenContent.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        String str6 = str3;
        String str7 = str;
        return upsellScreenContent.copy(asset, infoTag, str7, str2, str6, str5, byteString2);
    }

    public final UpsellScreenContent copy(Asset asset, InfoTag info_tag, String title, String description_markdown, String cta_text, String cta_disclosure_markdown, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpsellScreenContent(asset, info_tag, title, description_markdown, cta_text, cta_disclosure_markdown, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpsellScreenContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpsellScreenContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: midas.service.v1.UpsellScreenContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpsellScreenContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + Asset.ADAPTER.encodedSizeWithTag(1, value.getAsset()) + InfoTag.ADAPTER.encodedSizeWithTag(2, value.getInfo_tag());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDescription_markdown());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCta_text());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getCta_disclosure_markdown());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpsellScreenContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Asset.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset());
                InfoTag.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_tag());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDescription_markdown());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCta_text());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCta_disclosure_markdown());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpsellScreenContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getCta_disclosure_markdown());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getCta_text());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getDescription_markdown());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                InfoTag.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_tag());
                Asset.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpsellScreenContent redact(UpsellScreenContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Asset asset = value.getAsset();
                Asset assetRedact = asset != null ? Asset.ADAPTER.redact(asset) : null;
                InfoTag info_tag = value.getInfo_tag();
                return UpsellScreenContent.copy$default(value, assetRedact, info_tag != null ? InfoTag.ADAPTER.redact(info_tag) : null, null, null, null, null, ByteString.EMPTY, 60, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpsellScreenContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Asset assetDecode = null;
                String strDecode = null;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                InfoTag infoTagDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                assetDecode = Asset.ADAPTER.decode(reader);
                                break;
                            case 2:
                                infoTagDecode = InfoTag.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new UpsellScreenContent(assetDecode, infoTagDecode, strDecode2, strDecode3, strDecode4, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
