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

/* compiled from: PogWithPictogram.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016JF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017¨\u0006\""}, m3636d2 = {"Lrh_server_driven_ui/v1/PogWithPictogram;", "Lcom/squareup/wire/Message;", "", "pictogram", "Lrh_server_driven_ui/v1/Pictogram;", "size", "Lrh_server_driven_ui/v1/PictogramSize;", "foreground_color_override", "Lrh_server_driven_ui/v1/ThemedColor;", "background_color_override", "is_disabled", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Pictogram;Lrh_server_driven_ui/v1/PictogramSize;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;ZLokio/ByteString;)V", "getPictogram", "()Lrh_server_driven_ui/v1/Pictogram;", "getSize", "()Lrh_server_driven_ui/v1/PictogramSize;", "getForeground_color_override", "()Lrh_server_driven_ui/v1/ThemedColor;", "getBackground_color_override", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PogWithPictogram extends Message {

    @JvmField
    public static final ProtoAdapter<PogWithPictogram> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColorOverride", schemaIndex = 3, tag = 4)
    private final ThemedColor background_color_override;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "foregroundColorOverride", schemaIndex = 2, tag = 3)
    private final ThemedColor foreground_color_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_disabled;

    @WireField(adapter = "rh_server_driven_ui.v1.Pictogram#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Pictogram pictogram;

    @WireField(adapter = "rh_server_driven_ui.v1.PictogramSize#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PictogramSize size;

    public PogWithPictogram() {
        this(null, null, null, null, false, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29795newBuilder();
    }

    public final Pictogram getPictogram() {
        return this.pictogram;
    }

    public /* synthetic */ PogWithPictogram(Pictogram pictogram, PictogramSize pictogramSize, ThemedColor themedColor, ThemedColor themedColor2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Pictogram.PICTOGRAM_UNSPECIFIED : pictogram, (i & 2) != 0 ? PictogramSize.PICTOGRAM_SIZE_UNSPECIFIED : pictogramSize, (i & 4) != 0 ? null : themedColor, (i & 8) != 0 ? null : themedColor2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PictogramSize getSize() {
        return this.size;
    }

    public final ThemedColor getForeground_color_override() {
        return this.foreground_color_override;
    }

    public final ThemedColor getBackground_color_override() {
        return this.background_color_override;
    }

    /* renamed from: is_disabled, reason: from getter */
    public final boolean getIs_disabled() {
        return this.is_disabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PogWithPictogram(Pictogram pictogram, PictogramSize size, ThemedColor themedColor, ThemedColor themedColor2, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(pictogram, "pictogram");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.pictogram = pictogram;
        this.size = size;
        this.foreground_color_override = themedColor;
        this.background_color_override = themedColor2;
        this.is_disabled = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29795newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PogWithPictogram)) {
            return false;
        }
        PogWithPictogram pogWithPictogram = (PogWithPictogram) other;
        return Intrinsics.areEqual(unknownFields(), pogWithPictogram.unknownFields()) && this.pictogram == pogWithPictogram.pictogram && this.size == pogWithPictogram.size && Intrinsics.areEqual(this.foreground_color_override, pogWithPictogram.foreground_color_override) && Intrinsics.areEqual(this.background_color_override, pogWithPictogram.background_color_override) && this.is_disabled == pogWithPictogram.is_disabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.pictogram.hashCode()) * 37) + this.size.hashCode()) * 37;
        ThemedColor themedColor = this.foreground_color_override;
        int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.background_color_override;
        int iHashCode3 = ((iHashCode2 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_disabled);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("pictogram=" + this.pictogram);
        arrayList.add("size=" + this.size);
        ThemedColor themedColor = this.foreground_color_override;
        if (themedColor != null) {
            arrayList.add("foreground_color_override=" + themedColor);
        }
        ThemedColor themedColor2 = this.background_color_override;
        if (themedColor2 != null) {
            arrayList.add("background_color_override=" + themedColor2);
        }
        arrayList.add("is_disabled=" + this.is_disabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PogWithPictogram{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PogWithPictogram copy$default(PogWithPictogram pogWithPictogram, Pictogram pictogram, PictogramSize pictogramSize, ThemedColor themedColor, ThemedColor themedColor2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            pictogram = pogWithPictogram.pictogram;
        }
        if ((i & 2) != 0) {
            pictogramSize = pogWithPictogram.size;
        }
        if ((i & 4) != 0) {
            themedColor = pogWithPictogram.foreground_color_override;
        }
        if ((i & 8) != 0) {
            themedColor2 = pogWithPictogram.background_color_override;
        }
        if ((i & 16) != 0) {
            z = pogWithPictogram.is_disabled;
        }
        if ((i & 32) != 0) {
            byteString = pogWithPictogram.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        return pogWithPictogram.copy(pictogram, pictogramSize, themedColor, themedColor2, z2, byteString2);
    }

    public final PogWithPictogram copy(Pictogram pictogram, PictogramSize size, ThemedColor foreground_color_override, ThemedColor background_color_override, boolean is_disabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(pictogram, "pictogram");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PogWithPictogram(pictogram, size, foreground_color_override, background_color_override, is_disabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PogWithPictogram.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PogWithPictogram>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.PogWithPictogram$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PogWithPictogram value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPictogram() != Pictogram.PICTOGRAM_UNSPECIFIED) {
                    size += Pictogram.ADAPTER.encodedSizeWithTag(1, value.getPictogram());
                }
                if (value.getSize() != PictogramSize.PICTOGRAM_SIZE_UNSPECIFIED) {
                    size += PictogramSize.ADAPTER.encodedSizeWithTag(2, value.getSize());
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getForeground_color_override()) + protoAdapter.encodedSizeWithTag(4, value.getBackground_color_override());
                return value.getIs_disabled() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_disabled())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PogWithPictogram value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPictogram() != Pictogram.PICTOGRAM_UNSPECIFIED) {
                    Pictogram.ADAPTER.encodeWithTag(writer, 1, (int) value.getPictogram());
                }
                if (value.getSize() != PictogramSize.PICTOGRAM_SIZE_UNSPECIFIED) {
                    PictogramSize.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getForeground_color_override());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getBackground_color_override());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PogWithPictogram value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getBackground_color_override());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getForeground_color_override());
                if (value.getSize() != PictogramSize.PICTOGRAM_SIZE_UNSPECIFIED) {
                    PictogramSize.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                }
                if (value.getPictogram() != Pictogram.PICTOGRAM_UNSPECIFIED) {
                    Pictogram.ADAPTER.encodeWithTag(writer, 1, (int) value.getPictogram());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PogWithPictogram decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Pictogram pictogramDecode = Pictogram.PICTOGRAM_UNSPECIFIED;
                PictogramSize pictogramSize = PictogramSize.PICTOGRAM_SIZE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                boolean zBooleanValue = false;
                PictogramSize pictogramSizeDecode = pictogramSize;
                ThemedColor themedColorDecode2 = null;
                while (true) {
                    Pictogram pictogram = pictogramDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PogWithPictogram(pictogram, pictogramSizeDecode, themedColorDecode2, themedColorDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                pictogramDecode = Pictogram.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                pictogramSizeDecode = PictogramSize.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 5) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PogWithPictogram redact(PogWithPictogram value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor foreground_color_override = value.getForeground_color_override();
                ThemedColor themedColorRedact = foreground_color_override != null ? ThemedColor.ADAPTER.redact(foreground_color_override) : null;
                ThemedColor background_color_override = value.getBackground_color_override();
                return PogWithPictogram.copy$default(value, null, null, themedColorRedact, background_color_override != null ? ThemedColor.ADAPTER.redact(background_color_override) : null, false, ByteString.EMPTY, 19, null);
            }
        };
    }
}
