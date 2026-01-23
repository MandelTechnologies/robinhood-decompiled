package microgram.p507ui.p508v1;

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

/* compiled from: EmbeddedSectionReadyResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/ui/v1/EmbeddedSectionReadyResponse;", "Lcom/squareup/wire/Message;", "", "screen_type", "", "identifier", "encoded_initial_content", "microgram_ui_type", "Lmicrogram/ui/v1/MicrogramUiType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/v1/MicrogramUiType;Lokio/ByteString;)V", "getScreen_type", "()Ljava/lang/String;", "getIdentifier", "getEncoded_initial_content", "getMicrogram_ui_type", "()Lmicrogram/ui/v1/MicrogramUiType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class EmbeddedSectionReadyResponse extends Message {

    @JvmField
    public static final ProtoAdapter<EmbeddedSectionReadyResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "encodedInitialContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String encoded_initial_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String identifier;

    @WireField(adapter = "microgram.ui.v1.MicrogramUiType#ADAPTER", jsonName = "microgramUiType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final MicrogramUiType microgram_ui_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String screen_type;

    public EmbeddedSectionReadyResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ EmbeddedSectionReadyResponse(String str, String str2, String str3, MicrogramUiType microgramUiType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? MicrogramUiType.TYPE_UNSPECIFIED : microgramUiType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29245newBuilder();
    }

    public final String getScreen_type() {
        return this.screen_type;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getEncoded_initial_content() {
        return this.encoded_initial_content;
    }

    public final MicrogramUiType getMicrogram_ui_type() {
        return this.microgram_ui_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedSectionReadyResponse(String screen_type, String identifier, String encoded_initial_content, MicrogramUiType microgram_ui_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(screen_type, "screen_type");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
        Intrinsics.checkNotNullParameter(microgram_ui_type, "microgram_ui_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screen_type = screen_type;
        this.identifier = identifier;
        this.encoded_initial_content = encoded_initial_content;
        this.microgram_ui_type = microgram_ui_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29245newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EmbeddedSectionReadyResponse)) {
            return false;
        }
        EmbeddedSectionReadyResponse embeddedSectionReadyResponse = (EmbeddedSectionReadyResponse) other;
        return Intrinsics.areEqual(unknownFields(), embeddedSectionReadyResponse.unknownFields()) && Intrinsics.areEqual(this.screen_type, embeddedSectionReadyResponse.screen_type) && Intrinsics.areEqual(this.identifier, embeddedSectionReadyResponse.identifier) && Intrinsics.areEqual(this.encoded_initial_content, embeddedSectionReadyResponse.encoded_initial_content) && this.microgram_ui_type == embeddedSectionReadyResponse.microgram_ui_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.screen_type.hashCode()) * 37) + this.identifier.hashCode()) * 37) + this.encoded_initial_content.hashCode()) * 37) + this.microgram_ui_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("screen_type=" + Internal.sanitize(this.screen_type));
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        arrayList.add("encoded_initial_content=" + Internal.sanitize(this.encoded_initial_content));
        arrayList.add("microgram_ui_type=" + this.microgram_ui_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EmbeddedSectionReadyResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EmbeddedSectionReadyResponse copy$default(EmbeddedSectionReadyResponse embeddedSectionReadyResponse, String str, String str2, String str3, MicrogramUiType microgramUiType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = embeddedSectionReadyResponse.screen_type;
        }
        if ((i & 2) != 0) {
            str2 = embeddedSectionReadyResponse.identifier;
        }
        if ((i & 4) != 0) {
            str3 = embeddedSectionReadyResponse.encoded_initial_content;
        }
        if ((i & 8) != 0) {
            microgramUiType = embeddedSectionReadyResponse.microgram_ui_type;
        }
        if ((i & 16) != 0) {
            byteString = embeddedSectionReadyResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return embeddedSectionReadyResponse.copy(str, str2, str4, microgramUiType, byteString2);
    }

    public final EmbeddedSectionReadyResponse copy(String screen_type, String identifier, String encoded_initial_content, MicrogramUiType microgram_ui_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(screen_type, "screen_type");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
        Intrinsics.checkNotNullParameter(microgram_ui_type, "microgram_ui_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EmbeddedSectionReadyResponse(screen_type, identifier, encoded_initial_content, microgram_ui_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EmbeddedSectionReadyResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EmbeddedSectionReadyResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.EmbeddedSectionReadyResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EmbeddedSectionReadyResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getScreen_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getScreen_type());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getIdentifier());
                }
                if (!Intrinsics.areEqual(value.getEncoded_initial_content(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getEncoded_initial_content());
                }
                return value.getMicrogram_ui_type() != MicrogramUiType.TYPE_UNSPECIFIED ? size + MicrogramUiType.ADAPTER.encodedSizeWithTag(4, value.getMicrogram_ui_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EmbeddedSectionReadyResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getScreen_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen_type());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIdentifier());
                }
                if (!Intrinsics.areEqual(value.getEncoded_initial_content(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEncoded_initial_content());
                }
                if (value.getMicrogram_ui_type() != MicrogramUiType.TYPE_UNSPECIFIED) {
                    MicrogramUiType.ADAPTER.encodeWithTag(writer, 4, (int) value.getMicrogram_ui_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EmbeddedSectionReadyResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMicrogram_ui_type() != MicrogramUiType.TYPE_UNSPECIFIED) {
                    MicrogramUiType.ADAPTER.encodeWithTag(writer, 4, (int) value.getMicrogram_ui_type());
                }
                if (!Intrinsics.areEqual(value.getEncoded_initial_content(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEncoded_initial_content());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIdentifier());
                }
                if (Intrinsics.areEqual(value.getScreen_type(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EmbeddedSectionReadyResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MicrogramUiType microgramUiTypeDecode = MicrogramUiType.TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    MicrogramUiType microgramUiType = microgramUiTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new EmbeddedSectionReadyResponse(strDecode, strDecode2, strDecode3, microgramUiType, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                microgramUiTypeDecode = MicrogramUiType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EmbeddedSectionReadyResponse redact(EmbeddedSectionReadyResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EmbeddedSectionReadyResponse.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
