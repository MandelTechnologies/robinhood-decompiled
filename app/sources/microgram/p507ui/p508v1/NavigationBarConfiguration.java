package microgram.p507ui.p508v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import microgram.p507ui.p508v1.NavigationBarConfiguration;
import okio.ByteString;
import rh_server_driven_ui.p531v1.Button;
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: NavigationBarConfiguration.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'(B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001e\u001a\u00020\u0002H\u0017J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\\\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006)"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfiguration;", "Lcom/squareup/wire/Message;", "", ResourceTypes.STYLE, "Lmicrogram/ui/v1/NavigationBarConfiguration$Style;", "tint_color", "Lrh_server_driven_ui/v1/ThemedColor;", "left_buttons", "", "Lrh_server_driven_ui/v1/Button;", "right_buttons", "hides_back_button", "", "progress_bar", "Lmicrogram/ui/v1/ProgressBar;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/NavigationBarConfiguration$Style;Lrh_server_driven_ui/v1/ThemedColor;Ljava/util/List;Ljava/util/List;ZLmicrogram/ui/v1/ProgressBar;Lokio/ByteString;)V", "getStyle", "()Lmicrogram/ui/v1/NavigationBarConfiguration$Style;", "getTint_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getHides_back_button", "()Z", "getProgress_bar", "()Lmicrogram/ui/v1/ProgressBar;", "getLeft_buttons", "()Ljava/util/List;", "getRight_buttons", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Style", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class NavigationBarConfiguration extends Message {

    @JvmField
    public static final ProtoAdapter<NavigationBarConfiguration> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hidesBackButton", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean hides_back_button;

    @WireField(adapter = "rh_server_driven_ui.v1.Button#ADAPTER", jsonName = "leftButtons", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Button> left_buttons;

    @WireField(adapter = "microgram.ui.v1.ProgressBar#ADAPTER", jsonName = "progressBar", schemaIndex = 5, tag = 6)
    private final ProgressBar progress_bar;

    @WireField(adapter = "rh_server_driven_ui.v1.Button#ADAPTER", jsonName = "rightButtons", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<Button> right_buttons;

    @WireField(adapter = "microgram.ui.v1.NavigationBarConfiguration$Style#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Style style;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "tintColor", schemaIndex = 1, tag = 2)
    private final ThemedColor tint_color;

    public NavigationBarConfiguration() {
        this(null, null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29259newBuilder();
    }

    public final Style getStyle() {
        return this.style;
    }

    public /* synthetic */ NavigationBarConfiguration(Style style, ThemedColor themedColor, List list, List list2, boolean z, ProgressBar progressBar, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Style.STYLE_UNSPECIFIED : style, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : progressBar, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ThemedColor getTint_color() {
        return this.tint_color;
    }

    public final boolean getHides_back_button() {
        return this.hides_back_button;
    }

    public final ProgressBar getProgress_bar() {
        return this.progress_bar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarConfiguration(Style style, ThemedColor themedColor, List<Button> left_buttons, List<Button> right_buttons, boolean z, ProgressBar progressBar, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(left_buttons, "left_buttons");
        Intrinsics.checkNotNullParameter(right_buttons, "right_buttons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.style = style;
        this.tint_color = themedColor;
        this.hides_back_button = z;
        this.progress_bar = progressBar;
        this.left_buttons = Internal.immutableCopyOf("left_buttons", left_buttons);
        this.right_buttons = Internal.immutableCopyOf("right_buttons", right_buttons);
    }

    public final List<Button> getLeft_buttons() {
        return this.left_buttons;
    }

    public final List<Button> getRight_buttons() {
        return this.right_buttons;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29259newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NavigationBarConfiguration)) {
            return false;
        }
        NavigationBarConfiguration navigationBarConfiguration = (NavigationBarConfiguration) other;
        return Intrinsics.areEqual(unknownFields(), navigationBarConfiguration.unknownFields()) && this.style == navigationBarConfiguration.style && Intrinsics.areEqual(this.tint_color, navigationBarConfiguration.tint_color) && Intrinsics.areEqual(this.left_buttons, navigationBarConfiguration.left_buttons) && Intrinsics.areEqual(this.right_buttons, navigationBarConfiguration.right_buttons) && this.hides_back_button == navigationBarConfiguration.hides_back_button && Intrinsics.areEqual(this.progress_bar, navigationBarConfiguration.progress_bar);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.style.hashCode()) * 37;
        ThemedColor themedColor = this.tint_color;
        int iHashCode2 = (((((((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + this.left_buttons.hashCode()) * 37) + this.right_buttons.hashCode()) * 37) + Boolean.hashCode(this.hides_back_button)) * 37;
        ProgressBar progressBar = this.progress_bar;
        int iHashCode3 = iHashCode2 + (progressBar != null ? progressBar.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("style=" + this.style);
        ThemedColor themedColor = this.tint_color;
        if (themedColor != null) {
            arrayList.add("tint_color=" + themedColor);
        }
        if (!this.left_buttons.isEmpty()) {
            arrayList.add("left_buttons=" + this.left_buttons);
        }
        if (!this.right_buttons.isEmpty()) {
            arrayList.add("right_buttons=" + this.right_buttons);
        }
        arrayList.add("hides_back_button=" + this.hides_back_button);
        ProgressBar progressBar = this.progress_bar;
        if (progressBar != null) {
            arrayList.add("progress_bar=" + progressBar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NavigationBarConfiguration{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NavigationBarConfiguration copy$default(NavigationBarConfiguration navigationBarConfiguration, Style style, ThemedColor themedColor, List list, List list2, boolean z, ProgressBar progressBar, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            style = navigationBarConfiguration.style;
        }
        if ((i & 2) != 0) {
            themedColor = navigationBarConfiguration.tint_color;
        }
        if ((i & 4) != 0) {
            list = navigationBarConfiguration.left_buttons;
        }
        if ((i & 8) != 0) {
            list2 = navigationBarConfiguration.right_buttons;
        }
        if ((i & 16) != 0) {
            z = navigationBarConfiguration.hides_back_button;
        }
        if ((i & 32) != 0) {
            progressBar = navigationBarConfiguration.progress_bar;
        }
        if ((i & 64) != 0) {
            byteString = navigationBarConfiguration.unknownFields();
        }
        ProgressBar progressBar2 = progressBar;
        ByteString byteString2 = byteString;
        boolean z2 = z;
        List list3 = list;
        return navigationBarConfiguration.copy(style, themedColor, list3, list2, z2, progressBar2, byteString2);
    }

    public final NavigationBarConfiguration copy(Style style, ThemedColor tint_color, List<Button> left_buttons, List<Button> right_buttons, boolean hides_back_button, ProgressBar progress_bar, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(left_buttons, "left_buttons");
        Intrinsics.checkNotNullParameter(right_buttons, "right_buttons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NavigationBarConfiguration(style, tint_color, left_buttons, right_buttons, hides_back_button, progress_bar, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NavigationBarConfiguration.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NavigationBarConfiguration>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.NavigationBarConfiguration$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NavigationBarConfiguration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStyle() != NavigationBarConfiguration.Style.STYLE_UNSPECIFIED) {
                    size += NavigationBarConfiguration.Style.ADAPTER.encodedSizeWithTag(1, value.getStyle());
                }
                int iEncodedSizeWithTag = size + ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getTint_color());
                ProtoAdapter<Button> protoAdapter = Button.ADAPTER;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getLeft_buttons()) + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getRight_buttons());
                if (value.getHides_back_button()) {
                    iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getHides_back_button()));
                }
                return iEncodedSizeWithTag2 + ProgressBar.ADAPTER.encodedSizeWithTag(6, value.getProgress_bar());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NavigationBarConfiguration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStyle() != NavigationBarConfiguration.Style.STYLE_UNSPECIFIED) {
                    NavigationBarConfiguration.Style.ADAPTER.encodeWithTag(writer, 1, (int) value.getStyle());
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getTint_color());
                ProtoAdapter<Button> protoAdapter = Button.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getLeft_buttons());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getRight_buttons());
                if (value.getHides_back_button()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getHides_back_button()));
                }
                ProgressBar.ADAPTER.encodeWithTag(writer, 6, (int) value.getProgress_bar());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NavigationBarConfiguration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProgressBar.ADAPTER.encodeWithTag(writer, 6, (int) value.getProgress_bar());
                if (value.getHides_back_button()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getHides_back_button()));
                }
                ProtoAdapter<Button> protoAdapter = Button.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getRight_buttons());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getLeft_buttons());
                ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getTint_color());
                if (value.getStyle() != NavigationBarConfiguration.Style.STYLE_UNSPECIFIED) {
                    NavigationBarConfiguration.Style.ADAPTER.encodeWithTag(writer, 1, (int) value.getStyle());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NavigationBarConfiguration decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                NavigationBarConfiguration.Style style = NavigationBarConfiguration.Style.STYLE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                ProgressBar progressBarDecode = null;
                boolean zBooleanValue = false;
                NavigationBarConfiguration.Style styleDecode = style;
                ThemedColor themedColorDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    styleDecode = NavigationBarConfiguration.Style.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 3:
                                arrayList.add(Button.ADAPTER.decode(reader));
                                break;
                            case 4:
                                arrayList2.add(Button.ADAPTER.decode(reader));
                                break;
                            case 5:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                progressBarDecode = ProgressBar.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new NavigationBarConfiguration(styleDecode, themedColorDecode, arrayList, arrayList2, zBooleanValue, progressBarDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NavigationBarConfiguration redact(NavigationBarConfiguration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor tint_color = value.getTint_color();
                ThemedColor themedColorRedact = tint_color != null ? ThemedColor.ADAPTER.redact(tint_color) : null;
                List<Button> left_buttons = value.getLeft_buttons();
                ProtoAdapter<Button> protoAdapter = Button.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(left_buttons, protoAdapter);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getRight_buttons(), protoAdapter);
                ProgressBar progress_bar = value.getProgress_bar();
                return NavigationBarConfiguration.copy$default(value, null, themedColorRedact, listM26823redactElements, listM26823redactElements2, false, progress_bar != null ? ProgressBar.ADAPTER.redact(progress_bar) : null, ByteString.EMPTY, 17, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NavigationBarConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfiguration$Style;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STYLE_UNSPECIFIED", "STANDARD", "TRANSPARENT", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Style implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Style> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Style STANDARD;
        public static final Style STYLE_UNSPECIFIED;
        public static final Style TRANSPARENT;
        private final int value;

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{STYLE_UNSPECIFIED, STANDARD, TRANSPARENT};
        }

        @JvmStatic
        public static final Style fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Style> getEntries() {
            return $ENTRIES;
        }

        private Style(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Style style = new Style("STYLE_UNSPECIFIED", 0, 0);
            STYLE_UNSPECIFIED = style;
            STANDARD = new Style("STANDARD", 1, 1);
            TRANSPARENT = new Style("TRANSPARENT", 2, 2);
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(styleArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Style.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Style>(orCreateKotlinClass, syntax, style) { // from class: microgram.ui.v1.NavigationBarConfiguration$Style$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NavigationBarConfiguration.Style fromValue(int value) {
                    return NavigationBarConfiguration.Style.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NavigationBarConfiguration.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfiguration$Style$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lmicrogram/ui/v1/NavigationBarConfiguration$Style;", "fromValue", "value", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Style fromValue(int value) {
                if (value == 0) {
                    return Style.STYLE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Style.STANDARD;
                }
                if (value != 2) {
                    return null;
                }
                return Style.TRANSPARENT;
            }
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }
}
