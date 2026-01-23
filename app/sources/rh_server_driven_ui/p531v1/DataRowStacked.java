package rh_server_driven_ui.p531v1;

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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: DataRowStacked.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JT\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, m3636d2 = {"Lrh_server_driven_ui/v1/DataRowStacked;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "", "label_icon", "Lrh_server_driven_ui/v1/IconWithAction;", "value", "label_color", "Lrh_server_driven_ui/v1/ThemedColor;", "value_color_override", "value_description", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/IconWithAction;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/String;Lokio/ByteString;)V", "getLabel", "()Ljava/lang/String;", "getLabel_icon", "()Lrh_server_driven_ui/v1/IconWithAction;", "getValue", "getLabel_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getValue_color_override", "getValue_description", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class DataRowStacked extends Message {

    @JvmField
    public static final ProtoAdapter<DataRowStacked> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String label;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "labelColor", schemaIndex = 3, tag = 4)
    private final ThemedColor label_color;

    @WireField(adapter = "rh_server_driven_ui.v1.IconWithAction#ADAPTER", jsonName = "labelIcon", schemaIndex = 1, tag = 2)
    private final IconWithAction label_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String value;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "valueColorOverride", schemaIndex = 4, tag = 5)
    private final ThemedColor value_color_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "valueDescription", schemaIndex = 5, tag = 6)
    private final String value_description;

    public DataRowStacked() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ DataRowStacked(String str, IconWithAction iconWithAction, String str2, ThemedColor themedColor, ThemedColor themedColor2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : iconWithAction, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : themedColor, (i & 16) != 0 ? null : themedColor2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29713newBuilder();
    }

    public final String getLabel() {
        return this.label;
    }

    public final IconWithAction getLabel_icon() {
        return this.label_icon;
    }

    public final String getValue() {
        return this.value;
    }

    public final ThemedColor getLabel_color() {
        return this.label_color;
    }

    public final ThemedColor getValue_color_override() {
        return this.value_color_override;
    }

    public final String getValue_description() {
        return this.value_description;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRowStacked(String label, IconWithAction iconWithAction, String value, ThemedColor themedColor, ThemedColor themedColor2, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.label = label;
        this.label_icon = iconWithAction;
        this.value = value;
        this.label_color = themedColor;
        this.value_color_override = themedColor2;
        this.value_description = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29713newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DataRowStacked)) {
            return false;
        }
        DataRowStacked dataRowStacked = (DataRowStacked) other;
        return Intrinsics.areEqual(unknownFields(), dataRowStacked.unknownFields()) && Intrinsics.areEqual(this.label, dataRowStacked.label) && Intrinsics.areEqual(this.label_icon, dataRowStacked.label_icon) && Intrinsics.areEqual(this.value, dataRowStacked.value) && Intrinsics.areEqual(this.label_color, dataRowStacked.label_color) && Intrinsics.areEqual(this.value_color_override, dataRowStacked.value_color_override) && Intrinsics.areEqual(this.value_description, dataRowStacked.value_description);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.label.hashCode()) * 37;
        IconWithAction iconWithAction = this.label_icon;
        int iHashCode2 = (((iHashCode + (iconWithAction != null ? iconWithAction.hashCode() : 0)) * 37) + this.value.hashCode()) * 37;
        ThemedColor themedColor = this.label_color;
        int iHashCode3 = (iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.value_color_override;
        int iHashCode4 = (iHashCode3 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37;
        String str = this.value_description;
        int iHashCode5 = iHashCode4 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("label=" + Internal.sanitize(this.label));
        IconWithAction iconWithAction = this.label_icon;
        if (iconWithAction != null) {
            arrayList.add("label_icon=" + iconWithAction);
        }
        arrayList.add("value=" + Internal.sanitize(this.value));
        ThemedColor themedColor = this.label_color;
        if (themedColor != null) {
            arrayList.add("label_color=" + themedColor);
        }
        ThemedColor themedColor2 = this.value_color_override;
        if (themedColor2 != null) {
            arrayList.add("value_color_override=" + themedColor2);
        }
        String str = this.value_description;
        if (str != null) {
            arrayList.add("value_description=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DataRowStacked{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DataRowStacked copy$default(DataRowStacked dataRowStacked, String str, IconWithAction iconWithAction, String str2, ThemedColor themedColor, ThemedColor themedColor2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataRowStacked.label;
        }
        if ((i & 2) != 0) {
            iconWithAction = dataRowStacked.label_icon;
        }
        if ((i & 4) != 0) {
            str2 = dataRowStacked.value;
        }
        if ((i & 8) != 0) {
            themedColor = dataRowStacked.label_color;
        }
        if ((i & 16) != 0) {
            themedColor2 = dataRowStacked.value_color_override;
        }
        if ((i & 32) != 0) {
            str3 = dataRowStacked.value_description;
        }
        if ((i & 64) != 0) {
            byteString = dataRowStacked.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        ThemedColor themedColor3 = themedColor2;
        String str5 = str2;
        return dataRowStacked.copy(str, iconWithAction, str5, themedColor, themedColor3, str4, byteString2);
    }

    public final DataRowStacked copy(String label, IconWithAction label_icon, String value, ThemedColor label_color, ThemedColor value_color_override, String value_description, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DataRowStacked(label, label_icon, value, label_color, value_color_override, value_description, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DataRowStacked.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DataRowStacked>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.DataRowStacked$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DataRowStacked value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLabel());
                }
                int iEncodedSizeWithTag = size + IconWithAction.ADAPTER.encodedSizeWithTag(2, value.getLabel_icon());
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getValue());
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getLabel_color()) + protoAdapter.encodedSizeWithTag(5, value.getValue_color_override()) + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getValue_description());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DataRowStacked value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                }
                IconWithAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getLabel_icon());
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLabel_color());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getValue_color_override());
                ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getValue_description());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DataRowStacked value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getValue_description());
                ProtoAdapter<ThemedColor> protoAdapter2 = ThemedColor.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getValue_color_override());
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getLabel_color());
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getValue());
                }
                IconWithAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getLabel_icon());
                if (Intrinsics.areEqual(value.getLabel(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getLabel());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DataRowStacked redact(DataRowStacked value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IconWithAction label_icon = value.getLabel_icon();
                IconWithAction iconWithActionRedact = label_icon != null ? IconWithAction.ADAPTER.redact(label_icon) : null;
                ThemedColor label_color = value.getLabel_color();
                ThemedColor themedColorRedact = label_color != null ? ThemedColor.ADAPTER.redact(label_color) : null;
                ThemedColor value_color_override = value.getValue_color_override();
                return DataRowStacked.copy$default(value, null, iconWithActionRedact, null, themedColorRedact, value_color_override != null ? ThemedColor.ADAPTER.redact(value_color_override) : null, null, ByteString.EMPTY, 37, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DataRowStacked decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                IconWithAction iconWithActionDecode = null;
                ThemedColor themedColorDecode = null;
                ThemedColor themedColorDecode2 = null;
                String strDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                iconWithActionDecode = IconWithAction.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 5:
                                themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new DataRowStacked(strDecode, iconWithActionDecode, strDecode3, themedColorDecode, themedColorDecode2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
