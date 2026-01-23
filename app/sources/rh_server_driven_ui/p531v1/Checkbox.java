package rh_server_driven_ui.p531v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: Checkbox.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lrh_server_driven_ui/v1/Checkbox;", "Lcom/squareup/wire/Message;", "", "is_checked", "", "checked_color", "Lrh_server_driven_ui/v1/ThemedColor;", "is_disabled", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLrh_server_driven_ui/v1/ThemedColor;ZLokio/ByteString;)V", "()Z", "getChecked_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Checkbox extends Message {

    @JvmField
    public static final ProtoAdapter<Checkbox> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "checkedColor", schemaIndex = 1, tag = 2)
    private final ThemedColor checked_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isChecked", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_checked;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_disabled;

    public Checkbox() {
        this(false, null, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29699newBuilder();
    }

    /* renamed from: is_checked, reason: from getter */
    public final boolean getIs_checked() {
        return this.is_checked;
    }

    public final ThemedColor getChecked_color() {
        return this.checked_color;
    }

    /* renamed from: is_disabled, reason: from getter */
    public final boolean getIs_disabled() {
        return this.is_disabled;
    }

    public /* synthetic */ Checkbox(boolean z, ThemedColor themedColor, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Checkbox(boolean z, ThemedColor themedColor, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_checked = z;
        this.checked_color = themedColor;
        this.is_disabled = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29699newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Checkbox)) {
            return false;
        }
        Checkbox checkbox = (Checkbox) other;
        return Intrinsics.areEqual(unknownFields(), checkbox.unknownFields()) && this.is_checked == checkbox.is_checked && Intrinsics.areEqual(this.checked_color, checkbox.checked_color) && this.is_disabled == checkbox.is_disabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_checked)) * 37;
        ThemedColor themedColor = this.checked_color;
        int iHashCode2 = ((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_disabled);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_checked=" + this.is_checked);
        ThemedColor themedColor = this.checked_color;
        if (themedColor != null) {
            arrayList.add("checked_color=" + themedColor);
        }
        arrayList.add("is_disabled=" + this.is_disabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Checkbox{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, boolean z, ThemedColor themedColor, boolean z2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkbox.is_checked;
        }
        if ((i & 2) != 0) {
            themedColor = checkbox.checked_color;
        }
        if ((i & 4) != 0) {
            z2 = checkbox.is_disabled;
        }
        if ((i & 8) != 0) {
            byteString = checkbox.unknownFields();
        }
        return checkbox.copy(z, themedColor, z2, byteString);
    }

    public final Checkbox copy(boolean is_checked, ThemedColor checked_color, boolean is_disabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Checkbox(is_checked, checked_color, is_disabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Checkbox.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Checkbox>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Checkbox$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Checkbox value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_checked()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_checked()));
                }
                int iEncodedSizeWithTag = size + ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getChecked_color());
                return value.getIs_disabled() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_disabled())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Checkbox value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_checked()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_checked()));
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getChecked_color());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Checkbox value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getChecked_color());
                if (value.getIs_checked()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_checked()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Checkbox redact(Checkbox value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor checked_color = value.getChecked_color();
                return Checkbox.copy$default(value, false, checked_color != null ? ThemedColor.ADAPTER.redact(checked_color) : null, false, ByteString.EMPTY, 5, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Checkbox decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                ThemedColor themedColorDecode = null;
                boolean zBooleanValue2 = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Checkbox(zBooleanValue, themedColorDecode, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
