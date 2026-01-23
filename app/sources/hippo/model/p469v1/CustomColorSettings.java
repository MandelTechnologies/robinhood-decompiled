package hippo.model.p469v1;

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

/* compiled from: CustomColorSettings.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lhippo/model/v1/CustomColorSettings;", "Lcom/squareup/wire/Message;", "", "positive_color", "Lhippo/model/v1/ColorPickerScheme;", "negative_color", "unknownFields", "Lokio/ByteString;", "<init>", "(Lhippo/model/v1/ColorPickerScheme;Lhippo/model/v1/ColorPickerScheme;Lokio/ByteString;)V", "getPositive_color", "()Lhippo/model/v1/ColorPickerScheme;", "getNegative_color", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CustomColorSettings extends Message {

    @JvmField
    public static final ProtoAdapter<CustomColorSettings> ADAPTER;

    @WireField(adapter = "hippo.model.v1.ColorPickerScheme#ADAPTER", jsonName = "negativeColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ColorPickerScheme negative_color;

    @WireField(adapter = "hippo.model.v1.ColorPickerScheme#ADAPTER", jsonName = "positiveColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ColorPickerScheme positive_color;

    public CustomColorSettings() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28240newBuilder();
    }

    public final ColorPickerScheme getPositive_color() {
        return this.positive_color;
    }

    public /* synthetic */ CustomColorSettings(ColorPickerScheme colorPickerScheme, ColorPickerScheme colorPickerScheme2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ColorPickerScheme.COLOR_PICKER_SCHEME_UNSPECIFIED : colorPickerScheme, (i & 2) != 0 ? ColorPickerScheme.COLOR_PICKER_SCHEME_UNSPECIFIED : colorPickerScheme2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ColorPickerScheme getNegative_color() {
        return this.negative_color;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomColorSettings(ColorPickerScheme positive_color, ColorPickerScheme negative_color, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(positive_color, "positive_color");
        Intrinsics.checkNotNullParameter(negative_color, "negative_color");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.positive_color = positive_color;
        this.negative_color = negative_color;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28240newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CustomColorSettings)) {
            return false;
        }
        CustomColorSettings customColorSettings = (CustomColorSettings) other;
        return Intrinsics.areEqual(unknownFields(), customColorSettings.unknownFields()) && this.positive_color == customColorSettings.positive_color && this.negative_color == customColorSettings.negative_color;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.positive_color.hashCode()) * 37) + this.negative_color.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("positive_color=" + this.positive_color);
        arrayList.add("negative_color=" + this.negative_color);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomColorSettings{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CustomColorSettings copy$default(CustomColorSettings customColorSettings, ColorPickerScheme colorPickerScheme, ColorPickerScheme colorPickerScheme2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            colorPickerScheme = customColorSettings.positive_color;
        }
        if ((i & 2) != 0) {
            colorPickerScheme2 = customColorSettings.negative_color;
        }
        if ((i & 4) != 0) {
            byteString = customColorSettings.unknownFields();
        }
        return customColorSettings.copy(colorPickerScheme, colorPickerScheme2, byteString);
    }

    public final CustomColorSettings copy(ColorPickerScheme positive_color, ColorPickerScheme negative_color, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(positive_color, "positive_color");
        Intrinsics.checkNotNullParameter(negative_color, "negative_color");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CustomColorSettings(positive_color, negative_color, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CustomColorSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CustomColorSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.CustomColorSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CustomColorSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ColorPickerScheme positive_color = value.getPositive_color();
                ColorPickerScheme colorPickerScheme = ColorPickerScheme.COLOR_PICKER_SCHEME_UNSPECIFIED;
                if (positive_color != colorPickerScheme) {
                    size += ColorPickerScheme.ADAPTER.encodedSizeWithTag(1, value.getPositive_color());
                }
                return value.getNegative_color() != colorPickerScheme ? size + ColorPickerScheme.ADAPTER.encodedSizeWithTag(2, value.getNegative_color()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CustomColorSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ColorPickerScheme positive_color = value.getPositive_color();
                ColorPickerScheme colorPickerScheme = ColorPickerScheme.COLOR_PICKER_SCHEME_UNSPECIFIED;
                if (positive_color != colorPickerScheme) {
                    ColorPickerScheme.ADAPTER.encodeWithTag(writer, 1, (int) value.getPositive_color());
                }
                if (value.getNegative_color() != colorPickerScheme) {
                    ColorPickerScheme.ADAPTER.encodeWithTag(writer, 2, (int) value.getNegative_color());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CustomColorSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ColorPickerScheme negative_color = value.getNegative_color();
                ColorPickerScheme colorPickerScheme = ColorPickerScheme.COLOR_PICKER_SCHEME_UNSPECIFIED;
                if (negative_color != colorPickerScheme) {
                    ColorPickerScheme.ADAPTER.encodeWithTag(writer, 2, (int) value.getNegative_color());
                }
                if (value.getPositive_color() != colorPickerScheme) {
                    ColorPickerScheme.ADAPTER.encodeWithTag(writer, 1, (int) value.getPositive_color());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CustomColorSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ColorPickerScheme colorPickerSchemeDecode = ColorPickerScheme.COLOR_PICKER_SCHEME_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ColorPickerScheme colorPickerSchemeDecode2 = colorPickerSchemeDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CustomColorSettings(colorPickerSchemeDecode, colorPickerSchemeDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            colorPickerSchemeDecode = ColorPickerScheme.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            colorPickerSchemeDecode2 = ColorPickerScheme.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CustomColorSettings redact(CustomColorSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CustomColorSettings.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
