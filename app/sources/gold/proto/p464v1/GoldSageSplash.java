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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GoldSageSplash.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016Jh\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, m3636d2 = {"Lgold/proto/v1/GoldSageSplash;", "Lcom/squareup/wire/Message;", "", "image_path", "", "title", "description", "cta_disclosure", "cta_text", "secondary_cta_text", "secondary_cta_url", "animation_path", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getImage_path", "()Ljava/lang/String;", "getTitle", "getDescription", "getCta_disclosure", "getCta_text", "getSecondary_cta_text", "getSecondary_cta_url", "getAnimation_path", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GoldSageSplash extends Message {

    @JvmField
    public static final ProtoAdapter<GoldSageSplash> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "animationPath", schemaIndex = 7, tag = 8)
    private final String animation_path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaDisclosure", schemaIndex = 3, tag = 4)
    private final String cta_disclosure;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imagePath", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String image_path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCtaText", schemaIndex = 5, tag = 6)
    private final String secondary_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCtaUrl", schemaIndex = 6, tag = 7)
    private final String secondary_cta_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public GoldSageSplash() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ GoldSageSplash(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28136newBuilder();
    }

    public final String getImage_path() {
        return this.image_path;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getCta_disclosure() {
        return this.cta_disclosure;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    public final String getSecondary_cta_text() {
        return this.secondary_cta_text;
    }

    public final String getSecondary_cta_url() {
        return this.secondary_cta_url;
    }

    public final String getAnimation_path() {
        return this.animation_path;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSageSplash(String image_path, String title, String description, String str, String cta_text, String str2, String str3, String str4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(image_path, "image_path");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.image_path = image_path;
        this.title = title;
        this.description = description;
        this.cta_disclosure = str;
        this.cta_text = cta_text;
        this.secondary_cta_text = str2;
        this.secondary_cta_url = str3;
        this.animation_path = str4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28136newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldSageSplash)) {
            return false;
        }
        GoldSageSplash goldSageSplash = (GoldSageSplash) other;
        return Intrinsics.areEqual(unknownFields(), goldSageSplash.unknownFields()) && Intrinsics.areEqual(this.image_path, goldSageSplash.image_path) && Intrinsics.areEqual(this.title, goldSageSplash.title) && Intrinsics.areEqual(this.description, goldSageSplash.description) && Intrinsics.areEqual(this.cta_disclosure, goldSageSplash.cta_disclosure) && Intrinsics.areEqual(this.cta_text, goldSageSplash.cta_text) && Intrinsics.areEqual(this.secondary_cta_text, goldSageSplash.secondary_cta_text) && Intrinsics.areEqual(this.secondary_cta_url, goldSageSplash.secondary_cta_url) && Intrinsics.areEqual(this.animation_path, goldSageSplash.animation_path);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.image_path.hashCode()) * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37;
        String str = this.cta_disclosure;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.cta_text.hashCode()) * 37;
        String str2 = this.secondary_cta_text;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.secondary_cta_url;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.animation_path;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("image_path=" + Internal.sanitize(this.image_path));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        String str = this.cta_disclosure;
        if (str != null) {
            arrayList.add("cta_disclosure=" + Internal.sanitize(str));
        }
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        String str2 = this.secondary_cta_text;
        if (str2 != null) {
            arrayList.add("secondary_cta_text=" + Internal.sanitize(str2));
        }
        String str3 = this.secondary_cta_url;
        if (str3 != null) {
            arrayList.add("secondary_cta_url=" + Internal.sanitize(str3));
        }
        String str4 = this.animation_path;
        if (str4 != null) {
            arrayList.add("animation_path=" + Internal.sanitize(str4));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldSageSplash{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GoldSageSplash copy$default(GoldSageSplash goldSageSplash, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldSageSplash.image_path;
        }
        if ((i & 2) != 0) {
            str2 = goldSageSplash.title;
        }
        if ((i & 4) != 0) {
            str3 = goldSageSplash.description;
        }
        if ((i & 8) != 0) {
            str4 = goldSageSplash.cta_disclosure;
        }
        if ((i & 16) != 0) {
            str5 = goldSageSplash.cta_text;
        }
        if ((i & 32) != 0) {
            str6 = goldSageSplash.secondary_cta_text;
        }
        if ((i & 64) != 0) {
            str7 = goldSageSplash.secondary_cta_url;
        }
        if ((i & 128) != 0) {
            str8 = goldSageSplash.animation_path;
        }
        if ((i & 256) != 0) {
            byteString = goldSageSplash.unknownFields();
        }
        String str9 = str8;
        ByteString byteString2 = byteString;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return goldSageSplash.copy(str, str2, str13, str4, str12, str10, str11, str9, byteString2);
    }

    public final GoldSageSplash copy(String image_path, String title, String description, String cta_disclosure, String cta_text, String secondary_cta_text, String secondary_cta_url, String animation_path, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(image_path, "image_path");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldSageSplash(image_path, title, description, cta_disclosure, cta_text, secondary_cta_text, secondary_cta_url, animation_path, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldSageSplash.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldSageSplash>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold.proto.v1.GoldSageSplash$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldSageSplash value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getImage_path(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getImage_path());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDescription());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getCta_disclosure());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getCta_text());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getSecondary_cta_text()) + protoAdapter.encodedSizeWithTag(7, value.getSecondary_cta_url()) + protoAdapter.encodedSizeWithTag(8, value.getAnimation_path());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldSageSplash value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getImage_path(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getImage_path());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getCta_disclosure());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getCta_text());
                }
                protoAdapter.encodeWithTag(writer, 6, (int) value.getSecondary_cta_text());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getSecondary_cta_url());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getAnimation_path());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldSageSplash value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getAnimation_path());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getSecondary_cta_url());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getSecondary_cta_text());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getCta_text());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getCta_disclosure());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getImage_path(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getImage_path());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldSageSplash redact(GoldSageSplash value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GoldSageSplash.copy$default(value, null, null, null, null, null, null, null, null, ByteString.EMPTY, 255, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GoldSageSplash decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = null;
                String strDecode5 = null;
                String strDecode6 = null;
                String strDecode7 = null;
                String strDecode8 = strDecode3;
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
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GoldSageSplash(strDecode, strDecode8, strDecode2, strDecode4, strDecode3, strDecode5, strDecode6, strDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
