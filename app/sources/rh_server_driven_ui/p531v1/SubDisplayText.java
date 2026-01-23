package rh_server_driven_ui.p531v1;

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

/* compiled from: SubDisplayText.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J@\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lrh_server_driven_ui/v1/SubDisplayText;", "Lcom/squareup/wire/Message;", "", "main", "Lrh_server_driven_ui/v1/IconDisplayText;", "string_format", "", "description", "Lrh_server_driven_ui/v1/DisplayText;", "trailing_icon", "Lrh_server_driven_ui/v1/Icon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/IconDisplayText;Ljava/lang/String;Lrh_server_driven_ui/v1/DisplayText;Lrh_server_driven_ui/v1/Icon;Lokio/ByteString;)V", "getMain", "()Lrh_server_driven_ui/v1/IconDisplayText;", "getString_format", "()Ljava/lang/String;", "getDescription", "()Lrh_server_driven_ui/v1/DisplayText;", "getTrailing_icon", "()Lrh_server_driven_ui/v1/Icon;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class SubDisplayText extends Message {

    @JvmField
    public static final ProtoAdapter<SubDisplayText> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.DisplayText#ADAPTER", schemaIndex = 2, tag = 3)
    private final DisplayText description;

    @WireField(adapter = "rh_server_driven_ui.v1.IconDisplayText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final IconDisplayText main;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stringFormat", schemaIndex = 1, tag = 2)
    private final String string_format;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", jsonName = "trailingIcon", schemaIndex = 3, tag = 4)
    private final Icon trailing_icon;

    public SubDisplayText() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29820newBuilder();
    }

    public final IconDisplayText getMain() {
        return this.main;
    }

    public final String getString_format() {
        return this.string_format;
    }

    public final DisplayText getDescription() {
        return this.description;
    }

    public final Icon getTrailing_icon() {
        return this.trailing_icon;
    }

    public /* synthetic */ SubDisplayText(IconDisplayText iconDisplayText, String str, DisplayText displayText, Icon icon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iconDisplayText, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : displayText, (i & 8) != 0 ? null : icon, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubDisplayText(IconDisplayText iconDisplayText, String str, DisplayText displayText, Icon icon, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.main = iconDisplayText;
        this.string_format = str;
        this.description = displayText;
        this.trailing_icon = icon;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29820newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubDisplayText)) {
            return false;
        }
        SubDisplayText subDisplayText = (SubDisplayText) other;
        return Intrinsics.areEqual(unknownFields(), subDisplayText.unknownFields()) && Intrinsics.areEqual(this.main, subDisplayText.main) && Intrinsics.areEqual(this.string_format, subDisplayText.string_format) && Intrinsics.areEqual(this.description, subDisplayText.description) && this.trailing_icon == subDisplayText.trailing_icon;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        IconDisplayText iconDisplayText = this.main;
        int iHashCode2 = (iHashCode + (iconDisplayText != null ? iconDisplayText.hashCode() : 0)) * 37;
        String str = this.string_format;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        DisplayText displayText = this.description;
        int iHashCode4 = (iHashCode3 + (displayText != null ? displayText.hashCode() : 0)) * 37;
        Icon icon = this.trailing_icon;
        int iHashCode5 = iHashCode4 + (icon != null ? icon.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        IconDisplayText iconDisplayText = this.main;
        if (iconDisplayText != null) {
            arrayList.add("main=" + iconDisplayText);
        }
        String str = this.string_format;
        if (str != null) {
            arrayList.add("string_format=" + Internal.sanitize(str));
        }
        DisplayText displayText = this.description;
        if (displayText != null) {
            arrayList.add("description=" + displayText);
        }
        Icon icon = this.trailing_icon;
        if (icon != null) {
            arrayList.add("trailing_icon=" + icon);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubDisplayText{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SubDisplayText copy$default(SubDisplayText subDisplayText, IconDisplayText iconDisplayText, String str, DisplayText displayText, Icon icon, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            iconDisplayText = subDisplayText.main;
        }
        if ((i & 2) != 0) {
            str = subDisplayText.string_format;
        }
        if ((i & 4) != 0) {
            displayText = subDisplayText.description;
        }
        if ((i & 8) != 0) {
            icon = subDisplayText.trailing_icon;
        }
        if ((i & 16) != 0) {
            byteString = subDisplayText.unknownFields();
        }
        ByteString byteString2 = byteString;
        DisplayText displayText2 = displayText;
        return subDisplayText.copy(iconDisplayText, str, displayText2, icon, byteString2);
    }

    public final SubDisplayText copy(IconDisplayText main, String string_format, DisplayText description, Icon trailing_icon, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubDisplayText(main, string_format, description, trailing_icon, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubDisplayText.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubDisplayText>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.SubDisplayText$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubDisplayText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMain() != null) {
                    size += IconDisplayText.ADAPTER.encodedSizeWithTag(1, value.getMain());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getString_format()) + DisplayText.ADAPTER.encodedSizeWithTag(3, value.getDescription()) + Icon.ADAPTER.encodedSizeWithTag(4, value.getTrailing_icon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubDisplayText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMain() != null) {
                    IconDisplayText.ADAPTER.encodeWithTag(writer, 1, (int) value.getMain());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getString_format());
                DisplayText.ADAPTER.encodeWithTag(writer, 3, (int) value.getDescription());
                Icon.ADAPTER.encodeWithTag(writer, 4, (int) value.getTrailing_icon());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubDisplayText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Icon.ADAPTER.encodeWithTag(writer, 4, (int) value.getTrailing_icon());
                DisplayText.ADAPTER.encodeWithTag(writer, 3, (int) value.getDescription());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getString_format());
                if (value.getMain() != null) {
                    IconDisplayText.ADAPTER.encodeWithTag(writer, 1, (int) value.getMain());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubDisplayText redact(SubDisplayText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IconDisplayText main = value.getMain();
                IconDisplayText iconDisplayTextRedact = main != null ? IconDisplayText.ADAPTER.redact(main) : null;
                DisplayText description = value.getDescription();
                return SubDisplayText.copy$default(value, iconDisplayTextRedact, null, description != null ? DisplayText.ADAPTER.redact(description) : null, null, ByteString.EMPTY, 10, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubDisplayText decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                IconDisplayText iconDisplayTextDecode = null;
                String strDecode = null;
                DisplayText displayTextDecode = null;
                Icon iconDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SubDisplayText(iconDisplayTextDecode, strDecode, displayTextDecode, iconDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iconDisplayTextDecode = IconDisplayText.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        displayTextDecode = DisplayText.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        try {
                            iconDecode = Icon.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
