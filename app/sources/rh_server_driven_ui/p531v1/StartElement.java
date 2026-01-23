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

/* compiled from: StartElement.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElement;", "Lcom/squareup/wire/Message;", "", "icon", "Lrh_server_driven_ui/v1/Icon;", "number_pog", "Lrh_server_driven_ui/v1/NumberPog;", "pictogram_pog", "Lrh_server_driven_ui/v1/PogWithPictogram;", "text_pog", "Lrh_server_driven_ui/v1/TextPog;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/NumberPog;Lrh_server_driven_ui/v1/PogWithPictogram;Lrh_server_driven_ui/v1/TextPog;Lokio/ByteString;)V", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getNumber_pog", "()Lrh_server_driven_ui/v1/NumberPog;", "getPictogram_pog", "()Lrh_server_driven_ui/v1/PogWithPictogram;", "getText_pog", "()Lrh_server_driven_ui/v1/TextPog;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class StartElement extends Message {

    @JvmField
    public static final ProtoAdapter<StartElement> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final Icon icon;

    @WireField(adapter = "rh_server_driven_ui.v1.NumberPog#ADAPTER", jsonName = "numberPog", oneofName = "concrete", schemaIndex = 1, tag = 2)
    private final NumberPog number_pog;

    @WireField(adapter = "rh_server_driven_ui.v1.PogWithPictogram#ADAPTER", jsonName = "pictogramPog", oneofName = "concrete", schemaIndex = 2, tag = 3)
    private final PogWithPictogram pictogram_pog;

    @WireField(adapter = "rh_server_driven_ui.v1.TextPog#ADAPTER", jsonName = "textPog", oneofName = "concrete", schemaIndex = 3, tag = 4)
    private final TextPog text_pog;

    public StartElement() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29813newBuilder();
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final NumberPog getNumber_pog() {
        return this.number_pog;
    }

    public final PogWithPictogram getPictogram_pog() {
        return this.pictogram_pog;
    }

    public final TextPog getText_pog() {
        return this.text_pog;
    }

    public /* synthetic */ StartElement(Icon icon, NumberPog numberPog, PogWithPictogram pogWithPictogram, TextPog textPog, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : numberPog, (i & 4) != 0 ? null : pogWithPictogram, (i & 8) != 0 ? null : textPog, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartElement(Icon icon, NumberPog numberPog, PogWithPictogram pogWithPictogram, TextPog textPog, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.icon = icon;
        this.number_pog = numberPog;
        this.pictogram_pog = pogWithPictogram;
        this.text_pog = textPog;
        if (Internal.countNonNull(icon, numberPog, pogWithPictogram, textPog, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of icon, number_pog, pictogram_pog, text_pog may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29813newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StartElement)) {
            return false;
        }
        StartElement startElement = (StartElement) other;
        return Intrinsics.areEqual(unknownFields(), startElement.unknownFields()) && this.icon == startElement.icon && Intrinsics.areEqual(this.number_pog, startElement.number_pog) && Intrinsics.areEqual(this.pictogram_pog, startElement.pictogram_pog) && Intrinsics.areEqual(this.text_pog, startElement.text_pog);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int iHashCode2 = (iHashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        NumberPog numberPog = this.number_pog;
        int iHashCode3 = (iHashCode2 + (numberPog != null ? numberPog.hashCode() : 0)) * 37;
        PogWithPictogram pogWithPictogram = this.pictogram_pog;
        int iHashCode4 = (iHashCode3 + (pogWithPictogram != null ? pogWithPictogram.hashCode() : 0)) * 37;
        TextPog textPog = this.text_pog;
        int iHashCode5 = iHashCode4 + (textPog != null ? textPog.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        NumberPog numberPog = this.number_pog;
        if (numberPog != null) {
            arrayList.add("number_pog=" + numberPog);
        }
        PogWithPictogram pogWithPictogram = this.pictogram_pog;
        if (pogWithPictogram != null) {
            arrayList.add("pictogram_pog=" + pogWithPictogram);
        }
        TextPog textPog = this.text_pog;
        if (textPog != null) {
            arrayList.add("text_pog=" + textPog);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartElement{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StartElement copy$default(StartElement startElement, Icon icon, NumberPog numberPog, PogWithPictogram pogWithPictogram, TextPog textPog, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            icon = startElement.icon;
        }
        if ((i & 2) != 0) {
            numberPog = startElement.number_pog;
        }
        if ((i & 4) != 0) {
            pogWithPictogram = startElement.pictogram_pog;
        }
        if ((i & 8) != 0) {
            textPog = startElement.text_pog;
        }
        if ((i & 16) != 0) {
            byteString = startElement.unknownFields();
        }
        ByteString byteString2 = byteString;
        PogWithPictogram pogWithPictogram2 = pogWithPictogram;
        return startElement.copy(icon, numberPog, pogWithPictogram2, textPog, byteString2);
    }

    public final StartElement copy(Icon icon, NumberPog number_pog, PogWithPictogram pictogram_pog, TextPog text_pog, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StartElement(icon, number_pog, pictogram_pog, text_pog, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StartElement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StartElement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.StartElement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StartElement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + Icon.ADAPTER.encodedSizeWithTag(1, value.getIcon()) + NumberPog.ADAPTER.encodedSizeWithTag(2, value.getNumber_pog()) + PogWithPictogram.ADAPTER.encodedSizeWithTag(3, value.getPictogram_pog()) + TextPog.ADAPTER.encodedSizeWithTag(4, value.getText_pog());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StartElement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
                NumberPog.ADAPTER.encodeWithTag(writer, 2, (int) value.getNumber_pog());
                PogWithPictogram.ADAPTER.encodeWithTag(writer, 3, (int) value.getPictogram_pog());
                TextPog.ADAPTER.encodeWithTag(writer, 4, (int) value.getText_pog());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StartElement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TextPog.ADAPTER.encodeWithTag(writer, 4, (int) value.getText_pog());
                PogWithPictogram.ADAPTER.encodeWithTag(writer, 3, (int) value.getPictogram_pog());
                NumberPog.ADAPTER.encodeWithTag(writer, 2, (int) value.getNumber_pog());
                Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StartElement redact(StartElement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                NumberPog number_pog = value.getNumber_pog();
                NumberPog numberPogRedact = number_pog != null ? NumberPog.ADAPTER.redact(number_pog) : null;
                PogWithPictogram pictogram_pog = value.getPictogram_pog();
                PogWithPictogram pogWithPictogramRedact = pictogram_pog != null ? PogWithPictogram.ADAPTER.redact(pictogram_pog) : null;
                TextPog text_pog = value.getText_pog();
                return StartElement.copy$default(value, null, numberPogRedact, pogWithPictogramRedact, text_pog != null ? TextPog.ADAPTER.redact(text_pog) : null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StartElement decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Icon iconDecode = null;
                NumberPog numberPogDecode = null;
                PogWithPictogram pogWithPictogramDecode = null;
                TextPog textPogDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StartElement(iconDecode, numberPogDecode, pogWithPictogramDecode, textPogDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            iconDecode = Icon.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        numberPogDecode = NumberPog.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        pogWithPictogramDecode = PogWithPictogram.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        textPogDecode = TextPog.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
