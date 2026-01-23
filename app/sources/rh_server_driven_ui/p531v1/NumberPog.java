package rh_server_driven_ui.p531v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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

/* compiled from: NumberPog.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/NumberPog;", "Lcom/squareup/wire/Message;", "", InquiryField.FloatField.TYPE2, "", "background_color_override", "Lrh_server_driven_ui/v1/ThemedColor;", "is_disabled", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ILrh_server_driven_ui/v1/ThemedColor;ZLokio/ByteString;)V", "getNumber", "()I", "getBackground_color_override", "()Lrh_server_driven_ui/v1/ThemedColor;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class NumberPog extends Message {

    @JvmField
    public static final ProtoAdapter<NumberPog> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColorOverride", schemaIndex = 1, tag = 2)
    private final ThemedColor background_color_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_disabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int number;

    public NumberPog() {
        this(0, null, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29786newBuilder();
    }

    public final int getNumber() {
        return this.number;
    }

    public final ThemedColor getBackground_color_override() {
        return this.background_color_override;
    }

    /* renamed from: is_disabled, reason: from getter */
    public final boolean getIs_disabled() {
        return this.is_disabled;
    }

    public /* synthetic */ NumberPog(int i, ThemedColor themedColor, boolean z, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : themedColor, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberPog(int i, ThemedColor themedColor, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.number = i;
        this.background_color_override = themedColor;
        this.is_disabled = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29786newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NumberPog)) {
            return false;
        }
        NumberPog numberPog = (NumberPog) other;
        return Intrinsics.areEqual(unknownFields(), numberPog.unknownFields()) && this.number == numberPog.number && Intrinsics.areEqual(this.background_color_override, numberPog.background_color_override) && this.is_disabled == numberPog.is_disabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Integer.hashCode(this.number)) * 37;
        ThemedColor themedColor = this.background_color_override;
        int iHashCode2 = ((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_disabled);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("number=" + this.number);
        ThemedColor themedColor = this.background_color_override;
        if (themedColor != null) {
            arrayList.add("background_color_override=" + themedColor);
        }
        arrayList.add("is_disabled=" + this.is_disabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "NumberPog{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NumberPog copy$default(NumberPog numberPog, int i, ThemedColor themedColor, boolean z, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = numberPog.number;
        }
        if ((i2 & 2) != 0) {
            themedColor = numberPog.background_color_override;
        }
        if ((i2 & 4) != 0) {
            z = numberPog.is_disabled;
        }
        if ((i2 & 8) != 0) {
            byteString = numberPog.unknownFields();
        }
        return numberPog.copy(i, themedColor, z, byteString);
    }

    public final NumberPog copy(int number, ThemedColor background_color_override, boolean is_disabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NumberPog(number, background_color_override, is_disabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NumberPog.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NumberPog>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.NumberPog$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NumberPog value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getNumber() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getNumber()));
                }
                int iEncodedSizeWithTag = size + ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getBackground_color_override());
                return value.getIs_disabled() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_disabled())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NumberPog value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getNumber() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNumber()));
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getBackground_color_override());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NumberPog value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getBackground_color_override());
                if (value.getNumber() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNumber()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NumberPog redact(NumberPog value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor background_color_override = value.getBackground_color_override();
                return NumberPog.copy$default(value, 0, background_color_override != null ? ThemedColor.ADAPTER.redact(background_color_override) : null, false, ByteString.EMPTY, 5, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NumberPog decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                ThemedColor themedColorDecode = null;
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new NumberPog(iIntValue, themedColorDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
