package microgram.p507ui.p508v1;

import com.robinhood.utils.extensions.ResourceTypes;
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
import microgram.p507ui.p508v1.BottomSheetBackground;
import okio.ByteString;
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: BottomSheetBackground.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetBackground;", "Lcom/squareup/wire/Message;", "", "solid", "Lmicrogram/ui/v1/BottomSheetBackground$Solid;", "gradient", "Lmicrogram/ui/v1/BottomSheetBackground$Gradient;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/BottomSheetBackground$Solid;Lmicrogram/ui/v1/BottomSheetBackground$Gradient;Lokio/ByteString;)V", "getSolid", "()Lmicrogram/ui/v1/BottomSheetBackground$Solid;", "getGradient", "()Lmicrogram/ui/v1/BottomSheetBackground$Gradient;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Solid", "Gradient", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class BottomSheetBackground extends Message {

    @JvmField
    public static final ProtoAdapter<BottomSheetBackground> ADAPTER;

    @WireField(adapter = "microgram.ui.v1.BottomSheetBackground$Gradient#ADAPTER", oneofName = "concrete", schemaIndex = 1, tag = 2)
    private final Gradient gradient;

    @WireField(adapter = "microgram.ui.v1.BottomSheetBackground$Solid#ADAPTER", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final Solid solid;

    public BottomSheetBackground() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29235newBuilder();
    }

    public final Solid getSolid() {
        return this.solid;
    }

    public final Gradient getGradient() {
        return this.gradient;
    }

    public /* synthetic */ BottomSheetBackground(Solid solid, Gradient gradient, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : solid, (i & 2) != 0 ? null : gradient, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetBackground(Solid solid, Gradient gradient, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.solid = solid;
        this.gradient = gradient;
        if (Internal.countNonNull(solid, gradient) > 1) {
            throw new IllegalArgumentException("At most one of solid, gradient may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29235newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BottomSheetBackground)) {
            return false;
        }
        BottomSheetBackground bottomSheetBackground = (BottomSheetBackground) other;
        return Intrinsics.areEqual(unknownFields(), bottomSheetBackground.unknownFields()) && Intrinsics.areEqual(this.solid, bottomSheetBackground.solid) && Intrinsics.areEqual(this.gradient, bottomSheetBackground.gradient);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Solid solid = this.solid;
        int iHashCode2 = (iHashCode + (solid != null ? solid.hashCode() : 0)) * 37;
        Gradient gradient = this.gradient;
        int iHashCode3 = iHashCode2 + (gradient != null ? gradient.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Solid solid = this.solid;
        if (solid != null) {
            arrayList.add("solid=" + solid);
        }
        Gradient gradient = this.gradient;
        if (gradient != null) {
            arrayList.add("gradient=" + gradient);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BottomSheetBackground{", "}", 0, null, null, 56, null);
    }

    public final BottomSheetBackground copy(Solid solid, Gradient gradient, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BottomSheetBackground(solid, gradient, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BottomSheetBackground.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BottomSheetBackground>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.BottomSheetBackground$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BottomSheetBackground value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + BottomSheetBackground.Solid.ADAPTER.encodedSizeWithTag(1, value.getSolid()) + BottomSheetBackground.Gradient.ADAPTER.encodedSizeWithTag(2, value.getGradient());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BottomSheetBackground value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheetBackground.Solid.ADAPTER.encodeWithTag(writer, 1, (int) value.getSolid());
                BottomSheetBackground.Gradient.ADAPTER.encodeWithTag(writer, 2, (int) value.getGradient());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BottomSheetBackground value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BottomSheetBackground.Gradient.ADAPTER.encodeWithTag(writer, 2, (int) value.getGradient());
                BottomSheetBackground.Solid.ADAPTER.encodeWithTag(writer, 1, (int) value.getSolid());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BottomSheetBackground redact(BottomSheetBackground value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheetBackground.Solid solid = value.getSolid();
                BottomSheetBackground.Solid solidRedact = solid != null ? BottomSheetBackground.Solid.ADAPTER.redact(solid) : null;
                BottomSheetBackground.Gradient gradient = value.getGradient();
                return value.copy(solidRedact, gradient != null ? BottomSheetBackground.Gradient.ADAPTER.redact(gradient) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BottomSheetBackground decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BottomSheetBackground.Solid solidDecode = null;
                BottomSheetBackground.Gradient gradientDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BottomSheetBackground(solidDecode, gradientDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        solidDecode = BottomSheetBackground.Solid.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        gradientDecode = BottomSheetBackground.Gradient.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: BottomSheetBackground.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetBackground$Solid;", "Lcom/squareup/wire/Message;", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Solid extends Message {

        @JvmField
        public static final ProtoAdapter<Solid> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final ThemedColor color;

        /* JADX WARN: Multi-variable type inference failed */
        public Solid() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29237newBuilder();
        }

        public final ThemedColor getColor() {
            return this.color;
        }

        public /* synthetic */ Solid(ThemedColor themedColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Solid(ThemedColor themedColor, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.color = themedColor;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29237newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Solid)) {
                return false;
            }
            Solid solid = (Solid) other;
            return Intrinsics.areEqual(unknownFields(), solid.unknownFields()) && Intrinsics.areEqual(this.color, solid.color);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ThemedColor themedColor = this.color;
            int iHashCode2 = iHashCode + (themedColor != null ? themedColor.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ThemedColor themedColor = this.color;
            if (themedColor != null) {
                arrayList.add("color=" + themedColor);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Solid{", "}", 0, null, null, 56, null);
        }

        public final Solid copy(ThemedColor color, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Solid(color, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Solid.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Solid>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.BottomSheetBackground$Solid$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BottomSheetBackground.Solid value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getColor() != null ? size + ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getColor()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BottomSheetBackground.Solid value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getColor() != null) {
                        ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BottomSheetBackground.Solid value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getColor() != null) {
                        ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetBackground.Solid redact(BottomSheetBackground.Solid value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    ThemedColor color = value.getColor();
                    return value.copy(color != null ? ThemedColor.ADAPTER.redact(color) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetBackground.Solid decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    ThemedColor themedColorDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new BottomSheetBackground.Solid(themedColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: BottomSheetBackground.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetBackground$Gradient;", "Lcom/squareup/wire/Message;", "", ResourceTypes.COLOR, "Lmicrogram/ui/v1/LinearGradientColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/LinearGradientColor;Lokio/ByteString;)V", "getColor", "()Lmicrogram/ui/v1/LinearGradientColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Gradient extends Message {

        @JvmField
        public static final ProtoAdapter<Gradient> ADAPTER;

        @WireField(adapter = "microgram.ui.v1.LinearGradientColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final LinearGradientColor color;

        /* JADX WARN: Multi-variable type inference failed */
        public Gradient() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29236newBuilder();
        }

        public final LinearGradientColor getColor() {
            return this.color;
        }

        public /* synthetic */ Gradient(LinearGradientColor linearGradientColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : linearGradientColor, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gradient(LinearGradientColor linearGradientColor, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.color = linearGradientColor;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29236newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return Intrinsics.areEqual(unknownFields(), gradient.unknownFields()) && Intrinsics.areEqual(this.color, gradient.color);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            LinearGradientColor linearGradientColor = this.color;
            int iHashCode2 = iHashCode + (linearGradientColor != null ? linearGradientColor.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            LinearGradientColor linearGradientColor = this.color;
            if (linearGradientColor != null) {
                arrayList.add("color=" + linearGradientColor);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Gradient{", "}", 0, null, null, 56, null);
        }

        public final Gradient copy(LinearGradientColor color, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Gradient(color, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Gradient.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Gradient>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.BottomSheetBackground$Gradient$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BottomSheetBackground.Gradient value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getColor() != null ? size + LinearGradientColor.ADAPTER.encodedSizeWithTag(1, value.getColor()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BottomSheetBackground.Gradient value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getColor() != null) {
                        LinearGradientColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BottomSheetBackground.Gradient value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getColor() != null) {
                        LinearGradientColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetBackground.Gradient redact(BottomSheetBackground.Gradient value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    LinearGradientColor color = value.getColor();
                    return value.copy(color != null ? LinearGradientColor.ADAPTER.redact(color) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetBackground.Gradient decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    LinearGradientColor linearGradientColorDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new BottomSheetBackground.Gradient(linearGradientColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            linearGradientColorDecode = LinearGradientColor.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
