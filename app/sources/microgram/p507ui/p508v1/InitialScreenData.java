package microgram.p507ui.p508v1;

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

/* compiled from: InitialScreenData.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lmicrogram/ui/v1/InitialScreenData;", "Lcom/squareup/wire/Message;", "", "router_identifier", "", "theme", "Lmicrogram/ui/v1/Theme;", "screen_type", "screen_identifier", "encoded_initial_content", "microgram_ui_type", "Lmicrogram/ui/v1/MicrogramUiType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lmicrogram/ui/v1/Theme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/v1/MicrogramUiType;Lokio/ByteString;)V", "getRouter_identifier", "()Ljava/lang/String;", "getTheme", "()Lmicrogram/ui/v1/Theme;", "getScreen_type", "getScreen_identifier", "getEncoded_initial_content", "getMicrogram_ui_type", "()Lmicrogram/ui/v1/MicrogramUiType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class InitialScreenData extends Message {

    @JvmField
    public static final ProtoAdapter<InitialScreenData> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "encodedInitialContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String encoded_initial_content;

    @WireField(adapter = "microgram.ui.v1.MicrogramUiType#ADAPTER", jsonName = "microgramUiType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final MicrogramUiType microgram_ui_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "routerIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String router_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String screen_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String screen_type;

    @WireField(adapter = "microgram.ui.v1.Theme#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Theme theme;

    public InitialScreenData() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ InitialScreenData(String str, Theme theme, String str2, String str3, String str4, MicrogramUiType microgramUiType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : theme, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? MicrogramUiType.TYPE_UNSPECIFIED : microgramUiType, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29247newBuilder();
    }

    public final String getRouter_identifier() {
        return this.router_identifier;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final String getScreen_type() {
        return this.screen_type;
    }

    public final String getScreen_identifier() {
        return this.screen_identifier;
    }

    public final String getEncoded_initial_content() {
        return this.encoded_initial_content;
    }

    public final MicrogramUiType getMicrogram_ui_type() {
        return this.microgram_ui_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialScreenData(String router_identifier, Theme theme, String screen_type, String screen_identifier, String encoded_initial_content, MicrogramUiType microgram_ui_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(router_identifier, "router_identifier");
        Intrinsics.checkNotNullParameter(screen_type, "screen_type");
        Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
        Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
        Intrinsics.checkNotNullParameter(microgram_ui_type, "microgram_ui_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.router_identifier = router_identifier;
        this.theme = theme;
        this.screen_type = screen_type;
        this.screen_identifier = screen_identifier;
        this.encoded_initial_content = encoded_initial_content;
        this.microgram_ui_type = microgram_ui_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29247newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InitialScreenData)) {
            return false;
        }
        InitialScreenData initialScreenData = (InitialScreenData) other;
        return Intrinsics.areEqual(unknownFields(), initialScreenData.unknownFields()) && Intrinsics.areEqual(this.router_identifier, initialScreenData.router_identifier) && Intrinsics.areEqual(this.theme, initialScreenData.theme) && Intrinsics.areEqual(this.screen_type, initialScreenData.screen_type) && Intrinsics.areEqual(this.screen_identifier, initialScreenData.screen_identifier) && Intrinsics.areEqual(this.encoded_initial_content, initialScreenData.encoded_initial_content) && this.microgram_ui_type == initialScreenData.microgram_ui_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.router_identifier.hashCode()) * 37;
        Theme theme = this.theme;
        int iHashCode2 = ((((((((iHashCode + (theme != null ? theme.hashCode() : 0)) * 37) + this.screen_type.hashCode()) * 37) + this.screen_identifier.hashCode()) * 37) + this.encoded_initial_content.hashCode()) * 37) + this.microgram_ui_type.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("router_identifier=" + Internal.sanitize(this.router_identifier));
        Theme theme = this.theme;
        if (theme != null) {
            arrayList.add("theme=" + theme);
        }
        arrayList.add("screen_type=" + Internal.sanitize(this.screen_type));
        arrayList.add("screen_identifier=" + Internal.sanitize(this.screen_identifier));
        arrayList.add("encoded_initial_content=" + Internal.sanitize(this.encoded_initial_content));
        arrayList.add("microgram_ui_type=" + this.microgram_ui_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitialScreenData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InitialScreenData copy$default(InitialScreenData initialScreenData, String str, Theme theme, String str2, String str3, String str4, MicrogramUiType microgramUiType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initialScreenData.router_identifier;
        }
        if ((i & 2) != 0) {
            theme = initialScreenData.theme;
        }
        if ((i & 4) != 0) {
            str2 = initialScreenData.screen_type;
        }
        if ((i & 8) != 0) {
            str3 = initialScreenData.screen_identifier;
        }
        if ((i & 16) != 0) {
            str4 = initialScreenData.encoded_initial_content;
        }
        if ((i & 32) != 0) {
            microgramUiType = initialScreenData.microgram_ui_type;
        }
        if ((i & 64) != 0) {
            byteString = initialScreenData.unknownFields();
        }
        MicrogramUiType microgramUiType2 = microgramUiType;
        ByteString byteString2 = byteString;
        String str5 = str4;
        String str6 = str2;
        return initialScreenData.copy(str, theme, str6, str3, str5, microgramUiType2, byteString2);
    }

    public final InitialScreenData copy(String router_identifier, Theme theme, String screen_type, String screen_identifier, String encoded_initial_content, MicrogramUiType microgram_ui_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(router_identifier, "router_identifier");
        Intrinsics.checkNotNullParameter(screen_type, "screen_type");
        Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
        Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
        Intrinsics.checkNotNullParameter(microgram_ui_type, "microgram_ui_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InitialScreenData(router_identifier, theme, screen_type, screen_identifier, encoded_initial_content, microgram_ui_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InitialScreenData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InitialScreenData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.InitialScreenData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InitialScreenData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRouter_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRouter_identifier());
                }
                if (value.getTheme() != null) {
                    size += Theme.ADAPTER.encodedSizeWithTag(2, value.getTheme());
                }
                if (!Intrinsics.areEqual(value.getScreen_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getScreen_type());
                }
                if (!Intrinsics.areEqual(value.getScreen_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getScreen_identifier());
                }
                if (!Intrinsics.areEqual(value.getEncoded_initial_content(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getEncoded_initial_content());
                }
                return value.getMicrogram_ui_type() != MicrogramUiType.TYPE_UNSPECIFIED ? size + MicrogramUiType.ADAPTER.encodedSizeWithTag(6, value.getMicrogram_ui_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InitialScreenData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRouter_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRouter_identifier());
                }
                if (value.getTheme() != null) {
                    Theme.ADAPTER.encodeWithTag(writer, 2, (int) value.getTheme());
                }
                if (!Intrinsics.areEqual(value.getScreen_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScreen_type());
                }
                if (!Intrinsics.areEqual(value.getScreen_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getScreen_identifier());
                }
                if (!Intrinsics.areEqual(value.getEncoded_initial_content(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEncoded_initial_content());
                }
                if (value.getMicrogram_ui_type() != MicrogramUiType.TYPE_UNSPECIFIED) {
                    MicrogramUiType.ADAPTER.encodeWithTag(writer, 6, (int) value.getMicrogram_ui_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InitialScreenData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMicrogram_ui_type() != MicrogramUiType.TYPE_UNSPECIFIED) {
                    MicrogramUiType.ADAPTER.encodeWithTag(writer, 6, (int) value.getMicrogram_ui_type());
                }
                if (!Intrinsics.areEqual(value.getEncoded_initial_content(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEncoded_initial_content());
                }
                if (!Intrinsics.areEqual(value.getScreen_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getScreen_identifier());
                }
                if (!Intrinsics.areEqual(value.getScreen_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScreen_type());
                }
                if (value.getTheme() != null) {
                    Theme.ADAPTER.encodeWithTag(writer, 2, (int) value.getTheme());
                }
                if (Intrinsics.areEqual(value.getRouter_identifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRouter_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InitialScreenData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MicrogramUiType microgramUiType = MicrogramUiType.TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Theme themeDecode = null;
                MicrogramUiType microgramUiTypeDecode = microgramUiType;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                themeDecode = Theme.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                try {
                                    microgramUiTypeDecode = MicrogramUiType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new InitialScreenData(strDecode4, themeDecode, strDecode, strDecode2, strDecode3, microgramUiTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InitialScreenData redact(InitialScreenData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Theme theme = value.getTheme();
                return InitialScreenData.copy$default(value, null, theme != null ? Theme.ADAPTER.redact(theme) : null, null, null, null, null, ByteString.EMPTY, 61, null);
            }
        };
    }
}
