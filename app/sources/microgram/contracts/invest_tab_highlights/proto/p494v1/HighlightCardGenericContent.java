package microgram.contracts.invest_tab_highlights.proto.p494v1;

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
import rh_server_driven_ui.p531v1.Color;
import rh_server_driven_ui.p531v1.Icon;

/* compiled from: HighlightCardGenericContent.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010#R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u000b\u0010\u0019¨\u0006%"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContent;", "Lcom/squareup/wire/Message;", "", "secondary_text", "", "primary_text", "icon", "Lrh_server_driven_ui/v1/Icon;", "metadata_text", "metadata_text_color", "Lrh_server_driven_ui/v1/Color;", "is_live_earnings", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;Ljava/lang/String;Lrh_server_driven_ui/v1/Color;Ljava/lang/Boolean;Lokio/ByteString;)V", "getSecondary_text", "()Ljava/lang/String;", "getPrimary_text", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getMetadata_text", "getMetadata_text_color", "()Lrh_server_driven_ui/v1/Color;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;Ljava/lang/String;Lrh_server_driven_ui/v1/Color;Ljava/lang/Boolean;Lokio/ByteString;)Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContent;", "Companion", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class HighlightCardGenericContent extends Message {

    @JvmField
    public static final ProtoAdapter<HighlightCardGenericContent> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", schemaIndex = 2, tag = 3)
    private final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLiveEarnings", schemaIndex = 5, tag = 6)
    private final Boolean is_live_earnings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "metadataText", schemaIndex = 3, tag = 4)
    private final String metadata_text;

    @WireField(adapter = "rh_server_driven_ui.v1.Color#ADAPTER", jsonName = "metadataTextColor", schemaIndex = 4, tag = 5)
    private final Color metadata_text_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String primary_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String secondary_text;

    public HighlightCardGenericContent() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ HighlightCardGenericContent(String str, String str2, Icon icon, String str3, Color color, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : color, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29127newBuilder();
    }

    public final String getSecondary_text() {
        return this.secondary_text;
    }

    public final String getPrimary_text() {
        return this.primary_text;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getMetadata_text() {
        return this.metadata_text;
    }

    public final Color getMetadata_text_color() {
        return this.metadata_text_color;
    }

    /* renamed from: is_live_earnings, reason: from getter */
    public final Boolean getIs_live_earnings() {
        return this.is_live_earnings;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightCardGenericContent(String secondary_text, String primary_text, Icon icon, String str, Color color, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(secondary_text, "secondary_text");
        Intrinsics.checkNotNullParameter(primary_text, "primary_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.secondary_text = secondary_text;
        this.primary_text = primary_text;
        this.icon = icon;
        this.metadata_text = str;
        this.metadata_text_color = color;
        this.is_live_earnings = bool;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29127newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HighlightCardGenericContent)) {
            return false;
        }
        HighlightCardGenericContent highlightCardGenericContent = (HighlightCardGenericContent) other;
        return Intrinsics.areEqual(unknownFields(), highlightCardGenericContent.unknownFields()) && Intrinsics.areEqual(this.secondary_text, highlightCardGenericContent.secondary_text) && Intrinsics.areEqual(this.primary_text, highlightCardGenericContent.primary_text) && this.icon == highlightCardGenericContent.icon && Intrinsics.areEqual(this.metadata_text, highlightCardGenericContent.metadata_text) && this.metadata_text_color == highlightCardGenericContent.metadata_text_color && Intrinsics.areEqual(this.is_live_earnings, highlightCardGenericContent.is_live_earnings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.secondary_text.hashCode()) * 37) + this.primary_text.hashCode()) * 37;
        Icon icon = this.icon;
        int iHashCode2 = (iHashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        String str = this.metadata_text;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Color color = this.metadata_text_color;
        int iHashCode4 = (iHashCode3 + (color != null ? color.hashCode() : 0)) * 37;
        Boolean bool = this.is_live_earnings;
        int iHashCode5 = iHashCode4 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("secondary_text=" + Internal.sanitize(this.secondary_text));
        arrayList.add("primary_text=" + Internal.sanitize(this.primary_text));
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        String str = this.metadata_text;
        if (str != null) {
            arrayList.add("metadata_text=" + Internal.sanitize(str));
        }
        Color color = this.metadata_text_color;
        if (color != null) {
            arrayList.add("metadata_text_color=" + color);
        }
        Boolean bool = this.is_live_earnings;
        if (bool != null) {
            arrayList.add("is_live_earnings=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HighlightCardGenericContent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ HighlightCardGenericContent copy$default(HighlightCardGenericContent highlightCardGenericContent, String str, String str2, Icon icon, String str3, Color color, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = highlightCardGenericContent.secondary_text;
        }
        if ((i & 2) != 0) {
            str2 = highlightCardGenericContent.primary_text;
        }
        if ((i & 4) != 0) {
            icon = highlightCardGenericContent.icon;
        }
        if ((i & 8) != 0) {
            str3 = highlightCardGenericContent.metadata_text;
        }
        if ((i & 16) != 0) {
            color = highlightCardGenericContent.metadata_text_color;
        }
        if ((i & 32) != 0) {
            bool = highlightCardGenericContent.is_live_earnings;
        }
        if ((i & 64) != 0) {
            byteString = highlightCardGenericContent.unknownFields();
        }
        Boolean bool2 = bool;
        ByteString byteString2 = byteString;
        Color color2 = color;
        Icon icon2 = icon;
        return highlightCardGenericContent.copy(str, str2, icon2, str3, color2, bool2, byteString2);
    }

    public final HighlightCardGenericContent copy(String secondary_text, String primary_text, Icon icon, String metadata_text, Color metadata_text_color, Boolean is_live_earnings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(secondary_text, "secondary_text");
        Intrinsics.checkNotNullParameter(primary_text, "primary_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HighlightCardGenericContent(secondary_text, primary_text, icon, metadata_text, metadata_text_color, is_live_earnings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HighlightCardGenericContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HighlightCardGenericContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightCardGenericContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HighlightCardGenericContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSecondary_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSecondary_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrimary_text());
                }
                return size + Icon.ADAPTER.encodedSizeWithTag(3, value.getIcon()) + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getMetadata_text()) + Color.ADAPTER.encodedSizeWithTag(5, value.getMetadata_text_color()) + ProtoAdapter.BOOL.encodedSizeWithTag(6, value.getIs_live_earnings());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HighlightCardGenericContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSecondary_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSecondary_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrimary_text());
                }
                Icon.ADAPTER.encodeWithTag(writer, 3, (int) value.getIcon());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMetadata_text());
                Color.ADAPTER.encodeWithTag(writer, 5, (int) value.getMetadata_text_color());
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) value.getIs_live_earnings());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HighlightCardGenericContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) value.getIs_live_earnings());
                Color.ADAPTER.encodeWithTag(writer, 5, (int) value.getMetadata_text_color());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getMetadata_text());
                Icon.ADAPTER.encodeWithTag(writer, 3, (int) value.getIcon());
                if (!Intrinsics.areEqual(value.getPrimary_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPrimary_text());
                }
                if (Intrinsics.areEqual(value.getSecondary_text(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getSecondary_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HighlightCardGenericContent redact(HighlightCardGenericContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return HighlightCardGenericContent.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HighlightCardGenericContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Icon iconDecode = null;
                String strDecode2 = null;
                Color colorDecode = null;
                Boolean boolDecode = null;
                String strDecode3 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                try {
                                    iconDecode = Icon.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                try {
                                    colorDecode = Color.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 6:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new HighlightCardGenericContent(strDecode3, strDecode, iconDecode, strDecode2, colorDecode, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
