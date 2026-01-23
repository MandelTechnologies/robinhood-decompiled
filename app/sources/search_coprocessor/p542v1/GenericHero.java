package search_coprocessor.p542v1;

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

/* compiled from: GenericHero.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010#R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lsearch_coprocessor/v1/GenericHero;", "Lcom/squareup/wire/Message;", "", "id", "", "title", "body_text", "button", "Lsearch_coprocessor/v1/Button;", "background_image_url", "aspect_ratio", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsearch_coprocessor/v1/Button;Ljava/lang/String;Ljava/lang/Double;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getTitle", "getBody_text", "getButton", "()Lsearch_coprocessor/v1/Button;", "getBackground_image_url", "getAspect_ratio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsearch_coprocessor/v1/Button;Ljava/lang/String;Ljava/lang/Double;Lokio/ByteString;)Lsearch_coprocessor/v1/GenericHero;", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class GenericHero extends Message {

    @JvmField
    public static final ProtoAdapter<GenericHero> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "aspectRatio", schemaIndex = 5, tag = 6)
    private final Double aspect_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "backgroundImageUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String background_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bodyText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String body_text;

    @WireField(adapter = "search_coprocessor.v1.Button#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Button button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public GenericHero() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ GenericHero(String str, String str2, String str3, Button button, String str4, Double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : button, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : d, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29954newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody_text() {
        return this.body_text;
    }

    public final Button getButton() {
        return this.button;
    }

    public final String getBackground_image_url() {
        return this.background_image_url;
    }

    public final Double getAspect_ratio() {
        return this.aspect_ratio;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericHero(String id, String title, String body_text, Button button, String background_image_url, Double d, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body_text, "body_text");
        Intrinsics.checkNotNullParameter(background_image_url, "background_image_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.title = title;
        this.body_text = body_text;
        this.button = button;
        this.background_image_url = background_image_url;
        this.aspect_ratio = d;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29954newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GenericHero)) {
            return false;
        }
        GenericHero genericHero = (GenericHero) other;
        return Intrinsics.areEqual(unknownFields(), genericHero.unknownFields()) && Intrinsics.areEqual(this.id, genericHero.id) && Intrinsics.areEqual(this.title, genericHero.title) && Intrinsics.areEqual(this.body_text, genericHero.body_text) && Intrinsics.areEqual(this.button, genericHero.button) && Intrinsics.areEqual(this.background_image_url, genericHero.background_image_url) && Intrinsics.areEqual(this.aspect_ratio, genericHero.aspect_ratio);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.title.hashCode()) * 37) + this.body_text.hashCode()) * 37;
        Button button = this.button;
        int iHashCode2 = (((iHashCode + (button != null ? button.hashCode() : 0)) * 37) + this.background_image_url.hashCode()) * 37;
        Double d = this.aspect_ratio;
        int iHashCode3 = iHashCode2 + (d != null ? d.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("body_text=" + Internal.sanitize(this.body_text));
        Button button = this.button;
        if (button != null) {
            arrayList.add("button=" + button);
        }
        arrayList.add("background_image_url=" + Internal.sanitize(this.background_image_url));
        Double d = this.aspect_ratio;
        if (d != null) {
            arrayList.add("aspect_ratio=" + d);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GenericHero{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GenericHero copy$default(GenericHero genericHero, String str, String str2, String str3, Button button, String str4, Double d, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = genericHero.id;
        }
        if ((i & 2) != 0) {
            str2 = genericHero.title;
        }
        if ((i & 4) != 0) {
            str3 = genericHero.body_text;
        }
        if ((i & 8) != 0) {
            button = genericHero.button;
        }
        if ((i & 16) != 0) {
            str4 = genericHero.background_image_url;
        }
        if ((i & 32) != 0) {
            d = genericHero.aspect_ratio;
        }
        if ((i & 64) != 0) {
            byteString = genericHero.unknownFields();
        }
        Double d2 = d;
        ByteString byteString2 = byteString;
        String str5 = str4;
        String str6 = str3;
        return genericHero.copy(str, str2, str6, button, str5, d2, byteString2);
    }

    public final GenericHero copy(String id, String title, String body_text, Button button, String background_image_url, Double aspect_ratio, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body_text, "body_text");
        Intrinsics.checkNotNullParameter(background_image_url, "background_image_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GenericHero(id, title, body_text, button, background_image_url, aspect_ratio, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GenericHero.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GenericHero>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.GenericHero$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GenericHero value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBody_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBody_text());
                }
                if (value.getButton() != null) {
                    size += Button.ADAPTER.encodedSizeWithTag(4, value.getButton());
                }
                if (!Intrinsics.areEqual(value.getBackground_image_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getBackground_image_url());
                }
                return size + ProtoAdapter.DOUBLE.encodedSizeWithTag(6, value.getAspect_ratio());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GenericHero value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBody_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBody_text());
                }
                if (value.getButton() != null) {
                    Button.ADAPTER.encodeWithTag(writer, 4, (int) value.getButton());
                }
                if (!Intrinsics.areEqual(value.getBackground_image_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBackground_image_url());
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) value.getAspect_ratio());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GenericHero value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) value.getAspect_ratio());
                if (!Intrinsics.areEqual(value.getBackground_image_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBackground_image_url());
                }
                if (value.getButton() != null) {
                    Button.ADAPTER.encodeWithTag(writer, 4, (int) value.getButton());
                }
                if (!Intrinsics.areEqual(value.getBody_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBody_text());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GenericHero redact(GenericHero value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Button button = value.getButton();
                return GenericHero.copy$default(value, null, null, null, button != null ? Button.ADAPTER.redact(button) : null, null, null, ByteString.EMPTY, 55, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GenericHero decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                Button buttonDecode = null;
                Double dDecode = null;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                buttonDecode = Button.ADAPTER.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                dDecode = ProtoAdapter.DOUBLE.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GenericHero(strDecode, strDecode4, strDecode2, buttonDecode, strDecode3, dDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
