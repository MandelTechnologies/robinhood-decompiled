package bonfire.proto.idl.crypto.p033v1;

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

/* compiled from: Media.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/Media;", "Lcom/squareup/wire/Message;", "", "url", "", "width", "", "height", "mimetype", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;FFLjava/lang/String;Lokio/ByteString;)V", "getUrl", "()Ljava/lang/String;", "getWidth", "()F", "getHeight", "getMimetype", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Media extends Message {

    @JvmField
    public static final ProtoAdapter<Media> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String mimetype;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float width;

    public Media() {
        this(null, 0.0f, 0.0f, null, null, 31, null);
    }

    public /* synthetic */ Media(String str, float f, float f2, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8955newBuilder();
    }

    public final String getUrl() {
        return this.url;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    public final String getMimetype() {
        return this.mimetype;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Media(String url, float f, float f2, String mimetype, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mimetype, "mimetype");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.url = url;
        this.width = f;
        this.height = f2;
        this.mimetype = mimetype;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8955newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Media)) {
            return false;
        }
        Media media = (Media) other;
        return Intrinsics.areEqual(unknownFields(), media.unknownFields()) && Intrinsics.areEqual(this.url, media.url) && this.width == media.width && this.height == media.height && Intrinsics.areEqual(this.mimetype, media.mimetype);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.url.hashCode()) * 37) + Float.hashCode(this.width)) * 37) + Float.hashCode(this.height)) * 37) + this.mimetype.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("url=" + Internal.sanitize(this.url));
        arrayList.add("width=" + this.width);
        arrayList.add("height=" + this.height);
        arrayList.add("mimetype=" + Internal.sanitize(this.mimetype));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Media{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Media copy$default(Media media, String str, float f, float f2, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = media.url;
        }
        if ((i & 2) != 0) {
            f = media.width;
        }
        if ((i & 4) != 0) {
            f2 = media.height;
        }
        if ((i & 8) != 0) {
            str2 = media.mimetype;
        }
        if ((i & 16) != 0) {
            byteString = media.unknownFields();
        }
        ByteString byteString2 = byteString;
        float f3 = f2;
        return media.copy(str, f, f3, str2, byteString2);
    }

    public final Media copy(String url, float width, float height, String mimetype, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mimetype, "mimetype");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Media(url, width, height, mimetype, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Media.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Media>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.Media$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Media value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUrl());
                }
                if (!Float.valueOf(value.getWidth()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getWidth()));
                }
                if (!Float.valueOf(value.getHeight()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getHeight()));
                }
                return !Intrinsics.areEqual(value.getMimetype(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getMimetype()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Media value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
                }
                if (!Float.valueOf(value.getWidth()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getWidth()));
                }
                if (!Float.valueOf(value.getHeight()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getHeight()));
                }
                if (!Intrinsics.areEqual(value.getMimetype(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMimetype());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Media value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMimetype(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMimetype());
                }
                if (!Float.valueOf(value.getHeight()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getHeight()));
                }
                if (!Float.valueOf(value.getWidth()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getWidth()));
                }
                if (Intrinsics.areEqual(value.getUrl(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Media redact(Media value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Media.copy$default(value, null, 0.0f, 0.0f, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Media decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Media(strDecode, fFloatValue, fFloatValue2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 3) {
                        fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
