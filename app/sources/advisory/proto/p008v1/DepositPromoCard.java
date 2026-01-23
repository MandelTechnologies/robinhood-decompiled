package advisory.proto.p008v1;

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
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: DepositPromoCard.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCard;", "Lcom/squareup/wire/Message;", "", "image_url_light", "", "image_url_dark", "title", "cta_title", "cta_color", "Lrh_server_driven_ui/v1/ThemedColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getImage_url_light", "()Ljava/lang/String;", "getImage_url_dark", "getTitle", "getCta_title", "getCta_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class DepositPromoCard extends Message {

    @JvmField
    public static final ProtoAdapter<DepositPromoCard> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "ctaColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final ThemedColor cta_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String cta_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageUrlDark", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String image_url_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageUrlLight", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String image_url_light;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String title;

    public DepositPromoCard() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ DepositPromoCard(String str, String str2, String str3, String str4, ThemedColor themedColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : themedColor, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4417newBuilder();
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

    public final String getCta_title() {
        return this.cta_title;
    }

    public final ThemedColor getCta_color() {
        return this.cta_color;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositPromoCard(String image_url_light, String image_url_dark, String title, String cta_title, ThemedColor themedColor, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
        Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cta_title, "cta_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.image_url_light = image_url_light;
        this.image_url_dark = image_url_dark;
        this.title = title;
        this.cta_title = cta_title;
        this.cta_color = themedColor;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4417newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DepositPromoCard)) {
            return false;
        }
        DepositPromoCard depositPromoCard = (DepositPromoCard) other;
        return Intrinsics.areEqual(unknownFields(), depositPromoCard.unknownFields()) && Intrinsics.areEqual(this.image_url_light, depositPromoCard.image_url_light) && Intrinsics.areEqual(this.image_url_dark, depositPromoCard.image_url_dark) && Intrinsics.areEqual(this.title, depositPromoCard.title) && Intrinsics.areEqual(this.cta_title, depositPromoCard.cta_title) && Intrinsics.areEqual(this.cta_color, depositPromoCard.cta_color);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.image_url_light.hashCode()) * 37) + this.image_url_dark.hashCode()) * 37) + this.title.hashCode()) * 37) + this.cta_title.hashCode()) * 37;
        ThemedColor themedColor = this.cta_color;
        int iHashCode2 = iHashCode + (themedColor != null ? themedColor.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("image_url_light=" + Internal.sanitize(this.image_url_light));
        arrayList.add("image_url_dark=" + Internal.sanitize(this.image_url_dark));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("cta_title=" + Internal.sanitize(this.cta_title));
        ThemedColor themedColor = this.cta_color;
        if (themedColor != null) {
            arrayList.add("cta_color=" + themedColor);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DepositPromoCard{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DepositPromoCard copy$default(DepositPromoCard depositPromoCard, String str, String str2, String str3, String str4, ThemedColor themedColor, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositPromoCard.image_url_light;
        }
        if ((i & 2) != 0) {
            str2 = depositPromoCard.image_url_dark;
        }
        if ((i & 4) != 0) {
            str3 = depositPromoCard.title;
        }
        if ((i & 8) != 0) {
            str4 = depositPromoCard.cta_title;
        }
        if ((i & 16) != 0) {
            themedColor = depositPromoCard.cta_color;
        }
        if ((i & 32) != 0) {
            byteString = depositPromoCard.unknownFields();
        }
        ThemedColor themedColor2 = themedColor;
        ByteString byteString2 = byteString;
        return depositPromoCard.copy(str, str2, str3, str4, themedColor2, byteString2);
    }

    public final DepositPromoCard copy(String image_url_light, String image_url_dark, String title, String cta_title, ThemedColor cta_color, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
        Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cta_title, "cta_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DepositPromoCard(image_url_light, image_url_dark, title, cta_title, cta_color, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositPromoCard.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DepositPromoCard>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.DepositPromoCard$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DepositPromoCard value) {
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
                if (!Intrinsics.areEqual(value.getCta_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCta_title());
                }
                return value.getCta_color() != null ? size + ThemedColor.ADAPTER.encodedSizeWithTag(5, value.getCta_color()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DepositPromoCard value) throws IOException {
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
                if (!Intrinsics.areEqual(value.getCta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_title());
                }
                if (value.getCta_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 5, (int) value.getCta_color());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DepositPromoCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCta_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 5, (int) value.getCta_color());
                }
                if (!Intrinsics.areEqual(value.getCta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_title());
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
            public DepositPromoCard redact(DepositPromoCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor cta_color = value.getCta_color();
                return DepositPromoCard.copy$default(value, null, null, null, null, cta_color != null ? ThemedColor.ADAPTER.redact(cta_color) : null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DepositPromoCard decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                ThemedColor themedColorDecode = null;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DepositPromoCard(strDecode, strDecode4, strDecode2, strDecode3, themedColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
