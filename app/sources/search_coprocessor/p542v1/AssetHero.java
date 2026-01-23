package search_coprocessor.p542v1;

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
import search_coprocessor.p542v1.AssetHero;

/* compiled from: AssetHero.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lsearch_coprocessor/v1/AssetHero;", "Lcom/squareup/wire/Message;", "", "id", "", "asset", "Lsearch_coprocessor/v1/Asset;", "title", "corner_content", "Lsearch_coprocessor/v1/AssetHero$CornerContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/Asset;Ljava/lang/String;Lsearch_coprocessor/v1/AssetHero$CornerContent;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getAsset", "()Lsearch_coprocessor/v1/Asset;", "getTitle", "getCorner_content", "()Lsearch_coprocessor/v1/AssetHero$CornerContent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "CornerContent", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class AssetHero extends Message {

    @JvmField
    public static final ProtoAdapter<AssetHero> ADAPTER;

    @WireField(adapter = "search_coprocessor.v1.Asset#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Asset asset;

    @WireField(adapter = "search_coprocessor.v1.AssetHero$CornerContent#ADAPTER", jsonName = "cornerContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CornerContent corner_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String title;

    public AssetHero() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ AssetHero(String str, Asset asset, String str2, CornerContent cornerContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : asset, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : cornerContent, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29941newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final Asset getAsset() {
        return this.asset;
    }

    public final String getTitle() {
        return this.title;
    }

    public final CornerContent getCorner_content() {
        return this.corner_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetHero(String id, Asset asset, String title, CornerContent cornerContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.asset = asset;
        this.title = title;
        this.corner_content = cornerContent;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29941newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AssetHero)) {
            return false;
        }
        AssetHero assetHero = (AssetHero) other;
        return Intrinsics.areEqual(unknownFields(), assetHero.unknownFields()) && Intrinsics.areEqual(this.id, assetHero.id) && Intrinsics.areEqual(this.asset, assetHero.asset) && Intrinsics.areEqual(this.title, assetHero.title) && Intrinsics.areEqual(this.corner_content, assetHero.corner_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        Asset asset = this.asset;
        int iHashCode2 = (((iHashCode + (asset != null ? asset.hashCode() : 0)) * 37) + this.title.hashCode()) * 37;
        CornerContent cornerContent = this.corner_content;
        int iHashCode3 = iHashCode2 + (cornerContent != null ? cornerContent.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        Asset asset = this.asset;
        if (asset != null) {
            arrayList.add("asset=" + asset);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        CornerContent cornerContent = this.corner_content;
        if (cornerContent != null) {
            arrayList.add("corner_content=" + cornerContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AssetHero{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AssetHero copy$default(AssetHero assetHero, String str, Asset asset, String str2, CornerContent cornerContent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetHero.id;
        }
        if ((i & 2) != 0) {
            asset = assetHero.asset;
        }
        if ((i & 4) != 0) {
            str2 = assetHero.title;
        }
        if ((i & 8) != 0) {
            cornerContent = assetHero.corner_content;
        }
        if ((i & 16) != 0) {
            byteString = assetHero.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return assetHero.copy(str, asset, str3, cornerContent, byteString2);
    }

    public final AssetHero copy(String id, Asset asset, String title, CornerContent corner_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AssetHero(id, asset, title, corner_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetHero.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AssetHero>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.AssetHero$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AssetHero value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getAsset() != null) {
                    size += Asset.ADAPTER.encodedSizeWithTag(2, value.getAsset());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                }
                return value.getCorner_content() != null ? size + AssetHero.CornerContent.ADAPTER.encodedSizeWithTag(4, value.getCorner_content()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AssetHero value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getAsset() != null) {
                    Asset.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (value.getCorner_content() != null) {
                    AssetHero.CornerContent.ADAPTER.encodeWithTag(writer, 4, (int) value.getCorner_content());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AssetHero value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCorner_content() != null) {
                    AssetHero.CornerContent.ADAPTER.encodeWithTag(writer, 4, (int) value.getCorner_content());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (value.getAsset() != null) {
                    Asset.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AssetHero redact(AssetHero value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Asset asset = value.getAsset();
                Asset assetRedact = asset != null ? Asset.ADAPTER.redact(asset) : null;
                AssetHero.CornerContent corner_content = value.getCorner_content();
                return AssetHero.copy$default(value, null, assetRedact, null, corner_content != null ? AssetHero.CornerContent.ADAPTER.redact(corner_content) : null, ByteString.EMPTY, 5, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AssetHero decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Asset assetDecode = null;
                AssetHero.CornerContent cornerContentDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AssetHero(strDecode, assetDecode, strDecode2, cornerContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        assetDecode = Asset.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        cornerContentDecode = AssetHero.CornerContent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: AssetHero.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lsearch_coprocessor/v1/AssetHero$CornerContent;", "Lcom/squareup/wire/Message;", "", "button", "Lsearch_coprocessor/v1/Button;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsearch_coprocessor/v1/Button;Ljava/lang/String;Lokio/ByteString;)V", "getButton", "()Lsearch_coprocessor/v1/Button;", "getText", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CornerContent extends Message {

        @JvmField
        public static final ProtoAdapter<CornerContent> ADAPTER;

        @WireField(adapter = "search_coprocessor.v1.Button#ADAPTER", oneofName = "content", schemaIndex = 0, tag = 1)
        private final Button button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", oneofName = "content", schemaIndex = 1, tag = 2)
        private final String text;

        public CornerContent() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29942newBuilder();
        }

        public final Button getButton() {
            return this.button;
        }

        public final String getText() {
            return this.text;
        }

        public /* synthetic */ CornerContent(Button button, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : button, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CornerContent(Button button, String str, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.button = button;
            this.text = str;
            if (Internal.countNonNull(button, str) > 1) {
                throw new IllegalArgumentException("At most one of button, text may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29942newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CornerContent)) {
                return false;
            }
            CornerContent cornerContent = (CornerContent) other;
            return Intrinsics.areEqual(unknownFields(), cornerContent.unknownFields()) && Intrinsics.areEqual(this.button, cornerContent.button) && Intrinsics.areEqual(this.text, cornerContent.text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Button button = this.button;
            int iHashCode2 = (iHashCode + (button != null ? button.hashCode() : 0)) * 37;
            String str = this.text;
            int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            String str = this.text;
            if (str != null) {
                arrayList.add("text=" + Internal.sanitize(str));
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CornerContent{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CornerContent copy$default(CornerContent cornerContent, Button button, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                button = cornerContent.button;
            }
            if ((i & 2) != 0) {
                str = cornerContent.text;
            }
            if ((i & 4) != 0) {
                byteString = cornerContent.unknownFields();
            }
            return cornerContent.copy(button, str, byteString);
        }

        public final CornerContent copy(Button button, String text, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CornerContent(button, text, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CornerContent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CornerContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.AssetHero$CornerContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AssetHero.CornerContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + Button.ADAPTER.encodedSizeWithTag(1, value.getButton()) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getText());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AssetHero.CornerContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Button.ADAPTER.encodeWithTag(writer, 1, (int) value.getButton());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AssetHero.CornerContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                    Button.ADAPTER.encodeWithTag(writer, 1, (int) value.getButton());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AssetHero.CornerContent redact(AssetHero.CornerContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Button button = value.getButton();
                    return AssetHero.CornerContent.copy$default(value, button != null ? Button.ADAPTER.redact(button) : null, null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AssetHero.CornerContent decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    Button buttonDecode = null;
                    String strDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new AssetHero.CornerContent(buttonDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            buttonDecode = Button.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
