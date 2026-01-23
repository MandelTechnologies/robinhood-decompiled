package midas.service.p509v1;

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

/* compiled from: ImageAsset.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lmidas/service/v1/ImageAsset;", "Lcom/squareup/wire/Message;", "", "path_light", "", "path_dark", "alt_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPath_light", "()Ljava/lang/String;", "getPath_dark", "getAlt_text", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ImageAsset extends Message {

    @JvmField
    public static final ProtoAdapter<ImageAsset> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String alt_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String path_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String path_light;

    public ImageAsset() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ ImageAsset(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29319newBuilder();
    }

    public final String getPath_light() {
        return this.path_light;
    }

    public final String getPath_dark() {
        return this.path_dark;
    }

    public final String getAlt_text() {
        return this.alt_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAsset(String path_light, String path_dark, String alt_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(path_light, "path_light");
        Intrinsics.checkNotNullParameter(path_dark, "path_dark");
        Intrinsics.checkNotNullParameter(alt_text, "alt_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.path_light = path_light;
        this.path_dark = path_dark;
        this.alt_text = alt_text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29319newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ImageAsset)) {
            return false;
        }
        ImageAsset imageAsset = (ImageAsset) other;
        return Intrinsics.areEqual(unknownFields(), imageAsset.unknownFields()) && Intrinsics.areEqual(this.path_light, imageAsset.path_light) && Intrinsics.areEqual(this.path_dark, imageAsset.path_dark) && Intrinsics.areEqual(this.alt_text, imageAsset.alt_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.path_light.hashCode()) * 37) + this.path_dark.hashCode()) * 37) + this.alt_text.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("path_light=" + Internal.sanitize(this.path_light));
        arrayList.add("path_dark=" + Internal.sanitize(this.path_dark));
        arrayList.add("alt_text=" + Internal.sanitize(this.alt_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ImageAsset{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ImageAsset copy$default(ImageAsset imageAsset, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageAsset.path_light;
        }
        if ((i & 2) != 0) {
            str2 = imageAsset.path_dark;
        }
        if ((i & 4) != 0) {
            str3 = imageAsset.alt_text;
        }
        if ((i & 8) != 0) {
            byteString = imageAsset.unknownFields();
        }
        return imageAsset.copy(str, str2, str3, byteString);
    }

    public final ImageAsset copy(String path_light, String path_dark, String alt_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(path_light, "path_light");
        Intrinsics.checkNotNullParameter(path_dark, "path_dark");
        Intrinsics.checkNotNullParameter(alt_text, "alt_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ImageAsset(path_light, path_dark, alt_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ImageAsset.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ImageAsset>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: midas.service.v1.ImageAsset$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ImageAsset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPath_light(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPath_light());
                }
                if (!Intrinsics.areEqual(value.getPath_dark(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPath_dark());
                }
                return !Intrinsics.areEqual(value.getAlt_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAlt_text()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ImageAsset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPath_light(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPath_light());
                }
                if (!Intrinsics.areEqual(value.getPath_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPath_dark());
                }
                if (!Intrinsics.areEqual(value.getAlt_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAlt_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ImageAsset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAlt_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAlt_text());
                }
                if (!Intrinsics.areEqual(value.getPath_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPath_dark());
                }
                if (Intrinsics.areEqual(value.getPath_light(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPath_light());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ImageAsset redact(ImageAsset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ImageAsset.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ImageAsset decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ImageAsset(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
