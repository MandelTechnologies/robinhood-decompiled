package rh_server_driven_ui.p531v1;

import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rh_server_driven_ui.p531v1.Image;

/* compiled from: Image.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lrh_server_driven_ui/v1/Image;", "Lcom/squareup/wire/Message;", "", "source", "Lrh_server_driven_ui/v1/Image$Source;", "content_mode", "Lrh_server_driven_ui/v1/Image$ContentMode;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Image$Source;Lrh_server_driven_ui/v1/Image$ContentMode;Lokio/ByteString;)V", "getSource", "()Lrh_server_driven_ui/v1/Image$Source;", "getContent_mode", "()Lrh_server_driven_ui/v1/Image$ContentMode;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Source", "ContentMode", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Image extends Message {

    @JvmField
    public static final ProtoAdapter<Image> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Image$ContentMode#ADAPTER", jsonName = "contentMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ContentMode content_mode;

    @WireField(adapter = "rh_server_driven_ui.v1.Image$Source#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Source source;

    public Image() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29753newBuilder();
    }

    public final Source getSource() {
        return this.source;
    }

    public final ContentMode getContent_mode() {
        return this.content_mode;
    }

    public /* synthetic */ Image(Source source, ContentMode contentMode, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : source, (i & 2) != 0 ? ContentMode.CONTENT_MODE_UNSPECIFIED : contentMode, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Image(Source source, ContentMode content_mode, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(content_mode, "content_mode");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.source = source;
        this.content_mode = content_mode;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29753newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Image)) {
            return false;
        }
        Image image = (Image) other;
        return Intrinsics.areEqual(unknownFields(), image.unknownFields()) && Intrinsics.areEqual(this.source, image.source) && this.content_mode == image.content_mode;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Source source = this.source;
        int iHashCode2 = ((iHashCode + (source != null ? source.hashCode() : 0)) * 37) + this.content_mode.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Source source = this.source;
        if (source != null) {
            arrayList.add("source=" + source);
        }
        arrayList.add("content_mode=" + this.content_mode);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Image{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Image copy$default(Image image, Source source, ContentMode contentMode, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            source = image.source;
        }
        if ((i & 2) != 0) {
            contentMode = image.content_mode;
        }
        if ((i & 4) != 0) {
            byteString = image.unknownFields();
        }
        return image.copy(source, contentMode, byteString);
    }

    public final Image copy(Source source, ContentMode content_mode, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(content_mode, "content_mode");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Image(source, content_mode, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Image.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Image>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Image$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Image value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSource() != null) {
                    size += Image.Source.ADAPTER.encodedSizeWithTag(1, value.getSource());
                }
                return value.getContent_mode() != Image.ContentMode.CONTENT_MODE_UNSPECIFIED ? size + Image.ContentMode.ADAPTER.encodedSizeWithTag(2, value.getContent_mode()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Image value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSource() != null) {
                    Image.Source.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource());
                }
                if (value.getContent_mode() != Image.ContentMode.CONTENT_MODE_UNSPECIFIED) {
                    Image.ContentMode.ADAPTER.encodeWithTag(writer, 2, (int) value.getContent_mode());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Image value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getContent_mode() != Image.ContentMode.CONTENT_MODE_UNSPECIFIED) {
                    Image.ContentMode.ADAPTER.encodeWithTag(writer, 2, (int) value.getContent_mode());
                }
                if (value.getSource() != null) {
                    Image.Source.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Image decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Image.ContentMode contentModeDecode = Image.ContentMode.CONTENT_MODE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Image.Source sourceDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Image(sourceDecode, contentModeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        sourceDecode = Image.Source.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            contentModeDecode = Image.ContentMode.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Image redact(Image value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Image.Source source = value.getSource();
                return Image.copy$default(value, source != null ? Image.Source.ADAPTER.redact(source) : null, null, ByteString.EMPTY, 2, null);
            }
        };
    }

    /* compiled from: Image.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001d\u001e\u001f B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m3636d2 = {"Lrh_server_driven_ui/v1/Image$Source;", "Lcom/squareup/wire/Message;", "", "remote", "Lrh_server_driven_ui/v1/Image$Source$Remote;", "icon", "Lrh_server_driven_ui/v1/Image$Source$ImageIcon;", "pictogram", "Lrh_server_driven_ui/v1/Image$Source$ImagePictogram;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Image$Source$Remote;Lrh_server_driven_ui/v1/Image$Source$ImageIcon;Lrh_server_driven_ui/v1/Image$Source$ImagePictogram;Lokio/ByteString;)V", "getRemote", "()Lrh_server_driven_ui/v1/Image$Source$Remote;", "getIcon", "()Lrh_server_driven_ui/v1/Image$Source$ImageIcon;", "getPictogram", "()Lrh_server_driven_ui/v1/Image$Source$ImagePictogram;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Remote", "ImagePictogram", "ImageIcon", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Source extends Message {

        @JvmField
        public static final ProtoAdapter<Source> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.Image$Source$ImageIcon#ADAPTER", oneofName = "concrete", schemaIndex = 1, tag = 2)
        private final ImageIcon icon;

        @WireField(adapter = "rh_server_driven_ui.v1.Image$Source$ImagePictogram#ADAPTER", oneofName = "concrete", schemaIndex = 2, tag = 3)
        private final ImagePictogram pictogram;

        @WireField(adapter = "rh_server_driven_ui.v1.Image$Source$Remote#ADAPTER", oneofName = "concrete", schemaIndex = 0, tag = 1)
        private final Remote remote;

        public Source() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29754newBuilder();
        }

        public final Remote getRemote() {
            return this.remote;
        }

        public final ImageIcon getIcon() {
            return this.icon;
        }

        public final ImagePictogram getPictogram() {
            return this.pictogram;
        }

        public /* synthetic */ Source(Remote remote, ImageIcon imageIcon, ImagePictogram imagePictogram, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : remote, (i & 2) != 0 ? null : imageIcon, (i & 4) != 0 ? null : imagePictogram, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Source(Remote remote, ImageIcon imageIcon, ImagePictogram imagePictogram, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.remote = remote;
            this.icon = imageIcon;
            this.pictogram = imagePictogram;
            if (Internal.countNonNull(remote, imageIcon, imagePictogram) > 1) {
                throw new IllegalArgumentException("At most one of remote, icon, pictogram may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29754newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Source)) {
                return false;
            }
            Source source = (Source) other;
            return Intrinsics.areEqual(unknownFields(), source.unknownFields()) && Intrinsics.areEqual(this.remote, source.remote) && Intrinsics.areEqual(this.icon, source.icon) && Intrinsics.areEqual(this.pictogram, source.pictogram);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Remote remote = this.remote;
            int iHashCode2 = (iHashCode + (remote != null ? remote.hashCode() : 0)) * 37;
            ImageIcon imageIcon = this.icon;
            int iHashCode3 = (iHashCode2 + (imageIcon != null ? imageIcon.hashCode() : 0)) * 37;
            ImagePictogram imagePictogram = this.pictogram;
            int iHashCode4 = iHashCode3 + (imagePictogram != null ? imagePictogram.hashCode() : 0);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Remote remote = this.remote;
            if (remote != null) {
                arrayList.add("remote=" + remote);
            }
            ImageIcon imageIcon = this.icon;
            if (imageIcon != null) {
                arrayList.add("icon=" + imageIcon);
            }
            ImagePictogram imagePictogram = this.pictogram;
            if (imagePictogram != null) {
                arrayList.add("pictogram=" + imagePictogram);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Source{", "}", 0, null, null, 56, null);
        }

        public final Source copy(Remote remote, ImageIcon icon, ImagePictogram pictogram, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Source(remote, icon, pictogram, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Source.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Source>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Image$Source$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Image.Source value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + Image.Source.Remote.ADAPTER.encodedSizeWithTag(1, value.getRemote()) + Image.Source.ImageIcon.ADAPTER.encodedSizeWithTag(2, value.getIcon()) + Image.Source.ImagePictogram.ADAPTER.encodedSizeWithTag(3, value.getPictogram());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Image.Source value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Image.Source.Remote.ADAPTER.encodeWithTag(writer, 1, (int) value.getRemote());
                    Image.Source.ImageIcon.ADAPTER.encodeWithTag(writer, 2, (int) value.getIcon());
                    Image.Source.ImagePictogram.ADAPTER.encodeWithTag(writer, 3, (int) value.getPictogram());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Image.Source value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Image.Source.ImagePictogram.ADAPTER.encodeWithTag(writer, 3, (int) value.getPictogram());
                    Image.Source.ImageIcon.ADAPTER.encodeWithTag(writer, 2, (int) value.getIcon());
                    Image.Source.Remote.ADAPTER.encodeWithTag(writer, 1, (int) value.getRemote());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Image.Source redact(Image.Source value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Image.Source.Remote remote = value.getRemote();
                    Image.Source.Remote remoteRedact = remote != null ? Image.Source.Remote.ADAPTER.redact(remote) : null;
                    Image.Source.ImageIcon icon = value.getIcon();
                    Image.Source.ImageIcon imageIconRedact = icon != null ? Image.Source.ImageIcon.ADAPTER.redact(icon) : null;
                    Image.Source.ImagePictogram pictogram = value.getPictogram();
                    return value.copy(remoteRedact, imageIconRedact, pictogram != null ? Image.Source.ImagePictogram.ADAPTER.redact(pictogram) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Image.Source decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    Image.Source.Remote remoteDecode = null;
                    Image.Source.ImageIcon imageIconDecode = null;
                    Image.Source.ImagePictogram imagePictogramDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Image.Source(remoteDecode, imageIconDecode, imagePictogramDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            remoteDecode = Image.Source.Remote.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            imageIconDecode = Image.Source.ImageIcon.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            imagePictogramDecode = Image.Source.ImagePictogram.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* compiled from: Image.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/Image$Source$Remote;", "Lcom/squareup/wire/Message;", "", "url", "", "size", "Lrh_server_driven_ui/v1/Image$Source$Remote$Size;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/Image$Source$Remote$Size;Lokio/ByteString;)V", "getUrl", "()Ljava/lang/String;", "getSize", "()Lrh_server_driven_ui/v1/Image$Source$Remote$Size;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Size", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Remote extends Message {

            @JvmField
            public static final ProtoAdapter<Remote> ADAPTER;

            @WireField(adapter = "rh_server_driven_ui.v1.Image$Source$Remote$Size#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final Size size;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String url;

            public Remote() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29757newBuilder();
            }

            public final String getUrl() {
                return this.url;
            }

            public /* synthetic */ Remote(String str, Size size, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : size, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public final Size getSize() {
                return this.size;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Remote(String url, Size size, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.url = url;
                this.size = size;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29757newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Remote)) {
                    return false;
                }
                Remote remote = (Remote) other;
                return Intrinsics.areEqual(unknownFields(), remote.unknownFields()) && Intrinsics.areEqual(this.url, remote.url) && Intrinsics.areEqual(this.size, remote.size);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((unknownFields().hashCode() * 37) + this.url.hashCode()) * 37;
                Size size = this.size;
                int iHashCode2 = iHashCode + (size != null ? size.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("url=" + Internal.sanitize(this.url));
                Size size = this.size;
                if (size != null) {
                    arrayList.add("size=" + size);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Remote{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Remote copy$default(Remote remote, String str, Size size, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = remote.url;
                }
                if ((i & 2) != 0) {
                    size = remote.size;
                }
                if ((i & 4) != 0) {
                    byteString = remote.unknownFields();
                }
                return remote.copy(str, size, byteString);
            }

            public final Remote copy(String url, Size size, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Remote(url, size, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Remote.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Remote>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Image$Source$Remote$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Image.Source.Remote value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getUrl(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUrl());
                        }
                        return value.getSize() != null ? size + Image.Source.Remote.Size.ADAPTER.encodedSizeWithTag(2, value.getSize()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Image.Source.Remote value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getUrl(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
                        }
                        if (value.getSize() != null) {
                            Image.Source.Remote.Size.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Image.Source.Remote value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getSize() != null) {
                            Image.Source.Remote.Size.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                        }
                        if (Intrinsics.areEqual(value.getUrl(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Image.Source.Remote redact(Image.Source.Remote value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        Image.Source.Remote.Size size = value.getSize();
                        return Image.Source.Remote.copy$default(value, null, size != null ? Image.Source.Remote.Size.ADAPTER.redact(size) : null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Image.Source.Remote decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        Image.Source.Remote.Size sizeDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new Image.Source.Remote(strDecode, sizeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                sizeDecode = Image.Source.Remote.Size.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                };
            }

            /* compiled from: Image.kt */
            @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lrh_server_driven_ui/v1/Image$Source$Remote$Size;", "Lcom/squareup/wire/Message;", "", "width", "", "height", "unknownFields", "Lokio/ByteString;", "<init>", "(IILokio/ByteString;)V", "getWidth", "()I", "getHeight", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Size extends Message {

                @JvmField
                public static final ProtoAdapter<Size> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
                private final int height;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                private final int width;

                public Size() {
                    this(0, 0, null, 7, null);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m29758newBuilder();
                }

                public final int getWidth() {
                    return this.width;
                }

                public final int getHeight() {
                    return this.height;
                }

                public /* synthetic */ Size(int i, int i2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Size(int i, int i2, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.width = i;
                    this.height = i2;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m29758newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof Size)) {
                        return false;
                    }
                    Size size = (Size) other;
                    return Intrinsics.areEqual(unknownFields(), size.unknownFields()) && this.width == size.width && this.height == size.height;
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.width)) * 37) + Integer.hashCode(this.height);
                    this.hashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("width=" + this.width);
                    arrayList.add("height=" + this.height);
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Size{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ Size copy$default(Size size, int i, int i2, ByteString byteString, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = size.width;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = size.height;
                    }
                    if ((i3 & 4) != 0) {
                        byteString = size.unknownFields();
                    }
                    return size.copy(i, i2, byteString);
                }

                public final Size copy(int width, int height, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new Size(width, height, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Size.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<Size>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Image$Source$Remote$Size$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public Image.Source.Remote.Size decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            int iIntValue = 0;
                            int iIntValue2 = 0;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new Image.Source.Remote.Size(iIntValue, iIntValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                } else if (iNextTag == 2) {
                                    iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(Image.Source.Remote.Size value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            if (value.getWidth() != 0) {
                                size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getWidth()));
                            }
                            return value.getHeight() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getHeight())) : size;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, Image.Source.Remote.Size value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (value.getWidth() != 0) {
                                ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getWidth()));
                            }
                            if (value.getHeight() != 0) {
                                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getHeight()));
                            }
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, Image.Source.Remote.Size value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            if (value.getHeight() != 0) {
                                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getHeight()));
                            }
                            if (value.getWidth() != 0) {
                                ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getWidth()));
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public Image.Source.Remote.Size redact(Image.Source.Remote.Size value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return Image.Source.Remote.Size.copy$default(value, 0, 0, ByteString.EMPTY, 3, null);
                        }
                    };
                }
            }
        }

        /* compiled from: Image.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/Image$Source$ImagePictogram;", "Lcom/squareup/wire/Message;", "", "pictogram", "Lrh_server_driven_ui/v1/Pictogram;", "size", "Lrh_server_driven_ui/v1/PictogramSize;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Pictogram;Lrh_server_driven_ui/v1/PictogramSize;Lokio/ByteString;)V", "getPictogram", "()Lrh_server_driven_ui/v1/Pictogram;", "getSize", "()Lrh_server_driven_ui/v1/PictogramSize;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ImagePictogram extends Message {

            @JvmField
            public static final ProtoAdapter<ImagePictogram> ADAPTER;

            @WireField(adapter = "rh_server_driven_ui.v1.Pictogram#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final Pictogram pictogram;

            @WireField(adapter = "rh_server_driven_ui.v1.PictogramSize#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final PictogramSize size;

            public ImagePictogram() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29756newBuilder();
            }

            public final Pictogram getPictogram() {
                return this.pictogram;
            }

            public /* synthetic */ ImagePictogram(Pictogram pictogram, PictogramSize pictogramSize, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? Pictogram.PICTOGRAM_UNSPECIFIED : pictogram, (i & 2) != 0 ? PictogramSize.PICTOGRAM_SIZE_UNSPECIFIED : pictogramSize, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public final PictogramSize getSize() {
                return this.size;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImagePictogram(Pictogram pictogram, PictogramSize size, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(pictogram, "pictogram");
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.pictogram = pictogram;
                this.size = size;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29756newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ImagePictogram)) {
                    return false;
                }
                ImagePictogram imagePictogram = (ImagePictogram) other;
                return Intrinsics.areEqual(unknownFields(), imagePictogram.unknownFields()) && this.pictogram == imagePictogram.pictogram && this.size == imagePictogram.size;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((unknownFields().hashCode() * 37) + this.pictogram.hashCode()) * 37) + this.size.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("pictogram=" + this.pictogram);
                arrayList.add("size=" + this.size);
                return CollectionsKt.joinToString$default(arrayList, ", ", "ImagePictogram{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ ImagePictogram copy$default(ImagePictogram imagePictogram, Pictogram pictogram, PictogramSize pictogramSize, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    pictogram = imagePictogram.pictogram;
                }
                if ((i & 2) != 0) {
                    pictogramSize = imagePictogram.size;
                }
                if ((i & 4) != 0) {
                    byteString = imagePictogram.unknownFields();
                }
                return imagePictogram.copy(pictogram, pictogramSize, byteString);
            }

            public final ImagePictogram copy(Pictogram pictogram, PictogramSize size, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(pictogram, "pictogram");
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new ImagePictogram(pictogram, size, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ImagePictogram.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<ImagePictogram>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Image$Source$ImagePictogram$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Image.Source.ImagePictogram value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (value.getPictogram() != Pictogram.PICTOGRAM_UNSPECIFIED) {
                            size += Pictogram.ADAPTER.encodedSizeWithTag(1, value.getPictogram());
                        }
                        return value.getSize() != PictogramSize.PICTOGRAM_SIZE_UNSPECIFIED ? size + PictogramSize.ADAPTER.encodedSizeWithTag(2, value.getSize()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Image.Source.ImagePictogram value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getPictogram() != Pictogram.PICTOGRAM_UNSPECIFIED) {
                            Pictogram.ADAPTER.encodeWithTag(writer, 1, (int) value.getPictogram());
                        }
                        if (value.getSize() != PictogramSize.PICTOGRAM_SIZE_UNSPECIFIED) {
                            PictogramSize.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Image.Source.ImagePictogram value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getSize() != PictogramSize.PICTOGRAM_SIZE_UNSPECIFIED) {
                            PictogramSize.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                        }
                        if (value.getPictogram() != Pictogram.PICTOGRAM_UNSPECIFIED) {
                            Pictogram.ADAPTER.encodeWithTag(writer, 1, (int) value.getPictogram());
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Image.Source.ImagePictogram decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        Pictogram pictogramDecode = Pictogram.PICTOGRAM_UNSPECIFIED;
                        PictogramSize pictogramSizeDecode = PictogramSize.PICTOGRAM_SIZE_UNSPECIFIED;
                        long jBeginMessage = reader.beginMessage();
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new Image.Source.ImagePictogram(pictogramDecode, pictogramSizeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                try {
                                    pictogramDecode = Pictogram.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 2) {
                                try {
                                    pictogramSizeDecode = PictogramSize.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Image.Source.ImagePictogram redact(Image.Source.ImagePictogram value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return Image.Source.ImagePictogram.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }
                };
            }
        }

        /* compiled from: Image.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/Image$Source$ImageIcon;", "Lcom/squareup/wire/Message;", "", "icon", "Lrh_server_driven_ui/v1/Icon;", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ImageIcon extends Message {

            @JvmField
            public static final ProtoAdapter<ImageIcon> ADAPTER;

            @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final ThemedColor color;

            @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final Icon icon;

            public ImageIcon() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29755newBuilder();
            }

            public final Icon getIcon() {
                return this.icon;
            }

            public /* synthetic */ ImageIcon(Icon icon, ThemedColor themedColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? Icon.ICON_UNSPECIFIED : icon, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public final ThemedColor getColor() {
                return this.color;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageIcon(Icon icon, ThemedColor themedColor, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.icon = icon;
                this.color = themedColor;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29755newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ImageIcon)) {
                    return false;
                }
                ImageIcon imageIcon = (ImageIcon) other;
                return Intrinsics.areEqual(unknownFields(), imageIcon.unknownFields()) && this.icon == imageIcon.icon && Intrinsics.areEqual(this.color, imageIcon.color);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((unknownFields().hashCode() * 37) + this.icon.hashCode()) * 37;
                ThemedColor themedColor = this.color;
                int iHashCode2 = iHashCode + (themedColor != null ? themedColor.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("icon=" + this.icon);
                ThemedColor themedColor = this.color;
                if (themedColor != null) {
                    arrayList.add("color=" + themedColor);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ImageIcon{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ ImageIcon copy$default(ImageIcon imageIcon, Icon icon, ThemedColor themedColor, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    icon = imageIcon.icon;
                }
                if ((i & 2) != 0) {
                    themedColor = imageIcon.color;
                }
                if ((i & 4) != 0) {
                    byteString = imageIcon.unknownFields();
                }
                return imageIcon.copy(icon, themedColor, byteString);
            }

            public final ImageIcon copy(Icon icon, ThemedColor color, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new ImageIcon(icon, color, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ImageIcon.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<ImageIcon>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Image$Source$ImageIcon$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Image.Source.ImageIcon value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                            size += Icon.ADAPTER.encodedSizeWithTag(1, value.getIcon());
                        }
                        return value.getColor() != null ? size + ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getColor()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Image.Source.ImageIcon value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                            Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
                        }
                        if (value.getColor() != null) {
                            ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Image.Source.ImageIcon value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getColor() != null) {
                            ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                        }
                        if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                            Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Image.Source.ImageIcon decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        Icon iconDecode = Icon.ICON_UNSPECIFIED;
                        long jBeginMessage = reader.beginMessage();
                        ThemedColor themedColorDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new Image.Source.ImageIcon(iconDecode, themedColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                try {
                                    iconDecode = Icon.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 2) {
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Image.Source.ImageIcon redact(Image.Source.ImageIcon value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        ThemedColor color = value.getColor();
                        return Image.Source.ImageIcon.copy$default(value, null, color != null ? ThemedColor.ADAPTER.redact(color) : null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Image.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/Image$ContentMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTENT_MODE_UNSPECIFIED", "CONTENT_MODE_ASPECT_FIT", "CONTENT_MODE_ASPECT_FILL", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class ContentMode implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentMode[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ContentMode> ADAPTER;
        public static final ContentMode CONTENT_MODE_ASPECT_FILL;
        public static final ContentMode CONTENT_MODE_ASPECT_FIT;
        public static final ContentMode CONTENT_MODE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ ContentMode[] $values() {
            return new ContentMode[]{CONTENT_MODE_UNSPECIFIED, CONTENT_MODE_ASPECT_FIT, CONTENT_MODE_ASPECT_FILL};
        }

        @JvmStatic
        public static final ContentMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ContentMode> getEntries() {
            return $ENTRIES;
        }

        private ContentMode(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ContentMode contentMode = new ContentMode("CONTENT_MODE_UNSPECIFIED", 0, 0);
            CONTENT_MODE_UNSPECIFIED = contentMode;
            CONTENT_MODE_ASPECT_FIT = new ContentMode("CONTENT_MODE_ASPECT_FIT", 1, 1);
            CONTENT_MODE_ASPECT_FILL = new ContentMode("CONTENT_MODE_ASPECT_FILL", 2, 2);
            ContentMode[] contentModeArr$values = $values();
            $VALUES = contentModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contentModeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContentMode.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ContentMode>(orCreateKotlinClass, syntax, contentMode) { // from class: rh_server_driven_ui.v1.Image$ContentMode$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Image.ContentMode fromValue(int value) {
                    return Image.ContentMode.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Image.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/Image$ContentMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Image$ContentMode;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ContentMode fromValue(int value) {
                if (value == 0) {
                    return ContentMode.CONTENT_MODE_UNSPECIFIED;
                }
                if (value == 1) {
                    return ContentMode.CONTENT_MODE_ASPECT_FIT;
                }
                if (value != 2) {
                    return null;
                }
                return ContentMode.CONTENT_MODE_ASPECT_FILL;
            }
        }

        public static ContentMode valueOf(String str) {
            return (ContentMode) Enum.valueOf(ContentMode.class, str);
        }

        public static ContentMode[] values() {
            return (ContentMode[]) $VALUES.clone();
        }
    }
}
