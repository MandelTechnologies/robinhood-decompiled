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

/* compiled from: Switch.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016Jl\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006%"}, m3636d2 = {"Lrh_server_driven_ui/v1/Switch;", "Lcom/squareup/wire/Message;", "", "is_checked", "", "is_disabled", "checked_icon", "Lrh_server_driven_ui/v1/Icon;", "unchecked_icon", "checked_colors", "Lrh_server_driven_ui/v1/SwitchColors;", "unchecked_colors", "disabled_unchecked_colors", "disabled_checked_colors", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZLrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/SwitchColors;Lrh_server_driven_ui/v1/SwitchColors;Lrh_server_driven_ui/v1/SwitchColors;Lrh_server_driven_ui/v1/SwitchColors;Lokio/ByteString;)V", "()Z", "getChecked_icon", "()Lrh_server_driven_ui/v1/Icon;", "getUnchecked_icon", "getChecked_colors", "()Lrh_server_driven_ui/v1/SwitchColors;", "getUnchecked_colors", "getDisabled_unchecked_colors", "getDisabled_checked_colors", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Switch extends Message {

    @JvmField
    public static final ProtoAdapter<Switch> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.SwitchColors#ADAPTER", jsonName = "checkedColors", schemaIndex = 4, tag = 5)
    private final SwitchColors checked_colors;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", jsonName = "checkedIcon", schemaIndex = 2, tag = 3)
    private final Icon checked_icon;

    @WireField(adapter = "rh_server_driven_ui.v1.SwitchColors#ADAPTER", jsonName = "disabledCheckedColors", schemaIndex = 7, tag = 8)
    private final SwitchColors disabled_checked_colors;

    @WireField(adapter = "rh_server_driven_ui.v1.SwitchColors#ADAPTER", jsonName = "disabledUncheckedColors", schemaIndex = 6, tag = 7)
    private final SwitchColors disabled_unchecked_colors;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isChecked", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_checked;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_disabled;

    @WireField(adapter = "rh_server_driven_ui.v1.SwitchColors#ADAPTER", jsonName = "uncheckedColors", schemaIndex = 5, tag = 6)
    private final SwitchColors unchecked_colors;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", jsonName = "uncheckedIcon", schemaIndex = 3, tag = 4)
    private final Icon unchecked_icon;

    public Switch() {
        this(false, false, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29821newBuilder();
    }

    /* renamed from: is_checked, reason: from getter */
    public final boolean getIs_checked() {
        return this.is_checked;
    }

    /* renamed from: is_disabled, reason: from getter */
    public final boolean getIs_disabled() {
        return this.is_disabled;
    }

    public final Icon getChecked_icon() {
        return this.checked_icon;
    }

    public final Icon getUnchecked_icon() {
        return this.unchecked_icon;
    }

    public final SwitchColors getChecked_colors() {
        return this.checked_colors;
    }

    public final SwitchColors getUnchecked_colors() {
        return this.unchecked_colors;
    }

    public final SwitchColors getDisabled_unchecked_colors() {
        return this.disabled_unchecked_colors;
    }

    public final SwitchColors getDisabled_checked_colors() {
        return this.disabled_checked_colors;
    }

    public /* synthetic */ Switch(boolean z, boolean z2, Icon icon, Icon icon2, SwitchColors switchColors, SwitchColors switchColors2, SwitchColors switchColors3, SwitchColors switchColors4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? null : icon2, (i & 16) != 0 ? null : switchColors, (i & 32) != 0 ? null : switchColors2, (i & 64) != 0 ? null : switchColors3, (i & 128) != 0 ? null : switchColors4, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Switch(boolean z, boolean z2, Icon icon, Icon icon2, SwitchColors switchColors, SwitchColors switchColors2, SwitchColors switchColors3, SwitchColors switchColors4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_checked = z;
        this.is_disabled = z2;
        this.checked_icon = icon;
        this.unchecked_icon = icon2;
        this.checked_colors = switchColors;
        this.unchecked_colors = switchColors2;
        this.disabled_unchecked_colors = switchColors3;
        this.disabled_checked_colors = switchColors4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29821newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Switch)) {
            return false;
        }
        Switch r5 = (Switch) other;
        return Intrinsics.areEqual(unknownFields(), r5.unknownFields()) && this.is_checked == r5.is_checked && this.is_disabled == r5.is_disabled && this.checked_icon == r5.checked_icon && this.unchecked_icon == r5.unchecked_icon && Intrinsics.areEqual(this.checked_colors, r5.checked_colors) && Intrinsics.areEqual(this.unchecked_colors, r5.unchecked_colors) && Intrinsics.areEqual(this.disabled_unchecked_colors, r5.disabled_unchecked_colors) && Intrinsics.areEqual(this.disabled_checked_colors, r5.disabled_checked_colors);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_checked)) * 37) + Boolean.hashCode(this.is_disabled)) * 37;
        Icon icon = this.checked_icon;
        int iHashCode2 = (iHashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        Icon icon2 = this.unchecked_icon;
        int iHashCode3 = (iHashCode2 + (icon2 != null ? icon2.hashCode() : 0)) * 37;
        SwitchColors switchColors = this.checked_colors;
        int iHashCode4 = (iHashCode3 + (switchColors != null ? switchColors.hashCode() : 0)) * 37;
        SwitchColors switchColors2 = this.unchecked_colors;
        int iHashCode5 = (iHashCode4 + (switchColors2 != null ? switchColors2.hashCode() : 0)) * 37;
        SwitchColors switchColors3 = this.disabled_unchecked_colors;
        int iHashCode6 = (iHashCode5 + (switchColors3 != null ? switchColors3.hashCode() : 0)) * 37;
        SwitchColors switchColors4 = this.disabled_checked_colors;
        int iHashCode7 = iHashCode6 + (switchColors4 != null ? switchColors4.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_checked=" + this.is_checked);
        arrayList.add("is_disabled=" + this.is_disabled);
        Icon icon = this.checked_icon;
        if (icon != null) {
            arrayList.add("checked_icon=" + icon);
        }
        Icon icon2 = this.unchecked_icon;
        if (icon2 != null) {
            arrayList.add("unchecked_icon=" + icon2);
        }
        SwitchColors switchColors = this.checked_colors;
        if (switchColors != null) {
            arrayList.add("checked_colors=" + switchColors);
        }
        SwitchColors switchColors2 = this.unchecked_colors;
        if (switchColors2 != null) {
            arrayList.add("unchecked_colors=" + switchColors2);
        }
        SwitchColors switchColors3 = this.disabled_unchecked_colors;
        if (switchColors3 != null) {
            arrayList.add("disabled_unchecked_colors=" + switchColors3);
        }
        SwitchColors switchColors4 = this.disabled_checked_colors;
        if (switchColors4 != null) {
            arrayList.add("disabled_checked_colors=" + switchColors4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Switch{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Switch copy$default(Switch r0, boolean z, boolean z2, Icon icon, Icon icon2, SwitchColors switchColors, SwitchColors switchColors2, SwitchColors switchColors3, SwitchColors switchColors4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = r0.is_checked;
        }
        if ((i & 2) != 0) {
            z2 = r0.is_disabled;
        }
        if ((i & 4) != 0) {
            icon = r0.checked_icon;
        }
        if ((i & 8) != 0) {
            icon2 = r0.unchecked_icon;
        }
        if ((i & 16) != 0) {
            switchColors = r0.checked_colors;
        }
        if ((i & 32) != 0) {
            switchColors2 = r0.unchecked_colors;
        }
        if ((i & 64) != 0) {
            switchColors3 = r0.disabled_unchecked_colors;
        }
        if ((i & 128) != 0) {
            switchColors4 = r0.disabled_checked_colors;
        }
        if ((i & 256) != 0) {
            byteString = r0.unknownFields();
        }
        SwitchColors switchColors5 = switchColors4;
        ByteString byteString2 = byteString;
        SwitchColors switchColors6 = switchColors2;
        SwitchColors switchColors7 = switchColors3;
        SwitchColors switchColors8 = switchColors;
        Icon icon3 = icon;
        return r0.copy(z, z2, icon3, icon2, switchColors8, switchColors6, switchColors7, switchColors5, byteString2);
    }

    public final Switch copy(boolean is_checked, boolean is_disabled, Icon checked_icon, Icon unchecked_icon, SwitchColors checked_colors, SwitchColors unchecked_colors, SwitchColors disabled_unchecked_colors, SwitchColors disabled_checked_colors, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Switch(is_checked, is_disabled, checked_icon, unchecked_icon, checked_colors, unchecked_colors, disabled_unchecked_colors, disabled_checked_colors, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Switch.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Switch>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Switch$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Switch value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_checked()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_checked()));
                }
                if (value.getIs_disabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_disabled()));
                }
                ProtoAdapter<Icon> protoAdapter = Icon.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getChecked_icon()) + protoAdapter.encodedSizeWithTag(4, value.getUnchecked_icon());
                ProtoAdapter<SwitchColors> protoAdapter2 = SwitchColors.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, value.getChecked_colors()) + protoAdapter2.encodedSizeWithTag(6, value.getUnchecked_colors()) + protoAdapter2.encodedSizeWithTag(7, value.getDisabled_unchecked_colors()) + protoAdapter2.encodedSizeWithTag(8, value.getDisabled_checked_colors());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Switch value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_checked()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_checked()));
                }
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                ProtoAdapter<Icon> protoAdapter = Icon.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getChecked_icon());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getUnchecked_icon());
                ProtoAdapter<SwitchColors> protoAdapter2 = SwitchColors.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getChecked_colors());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getUnchecked_colors());
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getDisabled_unchecked_colors());
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getDisabled_checked_colors());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Switch value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<SwitchColors> protoAdapter = SwitchColors.ADAPTER;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getDisabled_checked_colors());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getDisabled_unchecked_colors());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getUnchecked_colors());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getChecked_colors());
                ProtoAdapter<Icon> protoAdapter2 = Icon.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getUnchecked_icon());
                protoAdapter2.encodeWithTag(writer, 3, (int) value.getChecked_icon());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                if (value.getIs_checked()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_checked()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Switch redact(Switch value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SwitchColors checked_colors = value.getChecked_colors();
                SwitchColors switchColorsRedact = checked_colors != null ? SwitchColors.ADAPTER.redact(checked_colors) : null;
                SwitchColors unchecked_colors = value.getUnchecked_colors();
                SwitchColors switchColorsRedact2 = unchecked_colors != null ? SwitchColors.ADAPTER.redact(unchecked_colors) : null;
                SwitchColors disabled_unchecked_colors = value.getDisabled_unchecked_colors();
                SwitchColors switchColorsRedact3 = disabled_unchecked_colors != null ? SwitchColors.ADAPTER.redact(disabled_unchecked_colors) : null;
                SwitchColors disabled_checked_colors = value.getDisabled_checked_colors();
                return Switch.copy$default(value, false, false, null, null, switchColorsRedact, switchColorsRedact2, switchColorsRedact3, disabled_checked_colors != null ? SwitchColors.ADAPTER.redact(disabled_checked_colors) : null, ByteString.EMPTY, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Switch decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Icon iconDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                Icon iconDecode2 = null;
                SwitchColors switchColorsDecode = null;
                SwitchColors switchColorsDecode2 = null;
                SwitchColors switchColorsDecode3 = null;
                SwitchColors switchColorsDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 2:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
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
                                try {
                                    iconDecode2 = Icon.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 5:
                                switchColorsDecode = SwitchColors.ADAPTER.decode(reader);
                                break;
                            case 6:
                                switchColorsDecode2 = SwitchColors.ADAPTER.decode(reader);
                                break;
                            case 7:
                                switchColorsDecode3 = SwitchColors.ADAPTER.decode(reader);
                                break;
                            case 8:
                                switchColorsDecode4 = SwitchColors.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Switch(zBooleanValue, zBooleanValue2, iconDecode, iconDecode2, switchColorsDecode, switchColorsDecode2, switchColorsDecode3, switchColorsDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
