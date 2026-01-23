package rh_server_driven_ui.p531v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.Decorator;

/* compiled from: Decorator.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator;", "Lcom/squareup/wire/Message;", "", "component", "Lrh_server_driven_ui/v1/UIComponent;", "modifiers", "Lrh_server_driven_ui/v1/Decorator$Modifiers;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Lrh_server_driven_ui/v1/Decorator$Modifiers;Lokio/ByteString;)V", "getComponent", "()Lrh_server_driven_ui/v1/UIComponent;", "getModifiers", "()Lrh_server_driven_ui/v1/Decorator$Modifiers;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Modifiers", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Decorator extends Message {

    @JvmField
    public static final ProtoAdapter<Decorator> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UIComponent component;

    @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Modifiers modifiers;

    public Decorator() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29714newBuilder();
    }

    public final UIComponent getComponent() {
        return this.component;
    }

    public final Modifiers getModifiers() {
        return this.modifiers;
    }

    public /* synthetic */ Decorator(UIComponent uIComponent, Modifiers modifiers, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? null : modifiers, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Decorator(UIComponent uIComponent, Modifiers modifiers, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.component = uIComponent;
        this.modifiers = modifiers;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29714newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Decorator)) {
            return false;
        }
        Decorator decorator = (Decorator) other;
        return Intrinsics.areEqual(unknownFields(), decorator.unknownFields()) && Intrinsics.areEqual(this.component, decorator.component) && Intrinsics.areEqual(this.modifiers, decorator.modifiers);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UIComponent uIComponent = this.component;
        int iHashCode2 = (iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37;
        Modifiers modifiers = this.modifiers;
        int iHashCode3 = iHashCode2 + (modifiers != null ? modifiers.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UIComponent uIComponent = this.component;
        if (uIComponent != null) {
            arrayList.add("component=" + uIComponent);
        }
        Modifiers modifiers = this.modifiers;
        if (modifiers != null) {
            arrayList.add("modifiers=" + modifiers);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Decorator{", "}", 0, null, null, 56, null);
    }

    public final Decorator copy(UIComponent component, Modifiers modifiers, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Decorator(component, modifiers, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Decorator.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Decorator>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Decorator value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getComponent() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(1, value.getComponent());
                }
                return value.getModifiers() != null ? size + Decorator.Modifiers.ADAPTER.encodedSizeWithTag(2, value.getModifiers()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Decorator value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getComponent() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent());
                }
                if (value.getModifiers() != null) {
                    Decorator.Modifiers.ADAPTER.encodeWithTag(writer, 2, (int) value.getModifiers());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Decorator value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getModifiers() != null) {
                    Decorator.Modifiers.ADAPTER.encodeWithTag(writer, 2, (int) value.getModifiers());
                }
                if (value.getComponent() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getComponent());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Decorator redact(Decorator value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent component = value.getComponent();
                UIComponent uIComponentRedact = component != null ? UIComponent.ADAPTER.redact(component) : null;
                Decorator.Modifiers modifiers = value.getModifiers();
                return value.copy(uIComponentRedact, modifiers != null ? Decorator.Modifiers.ADAPTER.redact(modifiers) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Decorator decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UIComponent uIComponentDecode = null;
                Decorator.Modifiers modifiersDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Decorator(uIComponentDecode, modifiersDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        modifiersDecode = Decorator.Modifiers.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: Decorator.kt */
    @Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u0000 S2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\tSTUVWXYZ[Bç\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010#\u001a\u00020$¢\u0006\u0004\b%\u0010&J\b\u0010J\u001a\u00020\u0002H\u0017J\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NH\u0096\u0002J\b\u0010O\u001a\u00020\nH\u0016J\b\u0010P\u001a\u00020\u0004H\u0016Jë\u0001\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010#\u001a\u00020$¢\u0006\u0002\u0010RR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010(R\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u001a\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010C\u001a\u0004\bI\u0010B¨\u0006\\"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers;", "Lcom/squareup/wire/Message;", "", "identifier", "", "background_color", "Lrh_server_driven_ui/v1/ThemedColor;", "border", "Lrh_server_driven_ui/v1/Border;", "corner_radius", "", "insets", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Insets;", "gutter_behavior", "Lrh_server_driven_ui/v1/Decorator$Modifiers$GutterBehavior;", "sizing", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing;", "analytics_event_descriptor", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AnalyticsEventDescriptor;", "gold_shimmer", "Lrh_server_driven_ui/v1/Decorator$Modifiers$GoldShimmer;", "on_tap_action", "Lrh_server_driven_ui/v1/Action;", "on_will_appear", "accessibility", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier;", "tag", "alpha", "", "tooltip", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip;", "test_tag", "background_gradient", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient;", "background_color_opacity", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/Border;ILrh_server_driven_ui/v1/Decorator$Modifiers$Insets;Lrh_server_driven_ui/v1/Decorator$Modifiers$GutterBehavior;Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing;Lrh_server_driven_ui/v1/Decorator$Modifiers$AnalyticsEventDescriptor;Lrh_server_driven_ui/v1/Decorator$Modifiers$GoldShimmer;Lrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier;Ljava/lang/Integer;Ljava/lang/Float;Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip;Ljava/lang/String;Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient;Ljava/lang/Float;Lokio/ByteString;)V", "getIdentifier", "()Ljava/lang/String;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getBorder", "()Lrh_server_driven_ui/v1/Border;", "getCorner_radius", "()I", "getInsets", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$Insets;", "getGutter_behavior", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$GutterBehavior;", "getSizing", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing;", "getAnalytics_event_descriptor", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$AnalyticsEventDescriptor;", "getGold_shimmer", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$GoldShimmer;", "getOn_tap_action", "()Lrh_server_driven_ui/v1/Action;", "getOn_will_appear", "getAccessibility", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier;", "getTag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTooltip", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip;", "getTest_tag", "getBackground_gradient", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient;", "getBackground_color_opacity", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/Border;ILrh_server_driven_ui/v1/Decorator$Modifiers$Insets;Lrh_server_driven_ui/v1/Decorator$Modifiers$GutterBehavior;Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing;Lrh_server_driven_ui/v1/Decorator$Modifiers$AnalyticsEventDescriptor;Lrh_server_driven_ui/v1/Decorator$Modifiers$GoldShimmer;Lrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier;Ljava/lang/Integer;Ljava/lang/Float;Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip;Ljava/lang/String;Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient;Ljava/lang/Float;Lokio/ByteString;)Lrh_server_driven_ui/v1/Decorator$Modifiers;", "Companion", "Insets", "GutterBehavior", "Sizing", "AnalyticsEventDescriptor", "GoldShimmer", "AccessibilityModifier", "Tooltip", "BackgroundGradient", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Modifiers extends Message {

        @JvmField
        public static final ProtoAdapter<Modifiers> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$AccessibilityModifier#ADAPTER", schemaIndex = 11, tag = 14)
        private final AccessibilityModifier accessibility;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 13, tag = 16)
        private final Float alpha;

        @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$AnalyticsEventDescriptor#ADAPTER", jsonName = "analyticsEventDescriptor", schemaIndex = 7, tag = 10)
        private final AnalyticsEventDescriptor analytics_event_descriptor;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColor", schemaIndex = 1, tag = 2)
        private final ThemedColor background_color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "backgroundColorOpacity", schemaIndex = 17, tag = 20)
        private final Float background_color_opacity;

        @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$BackgroundGradient#ADAPTER", jsonName = "backgroundGradient", schemaIndex = 16, tag = 19)
        private final BackgroundGradient background_gradient;

        @WireField(adapter = "rh_server_driven_ui.v1.Border#ADAPTER", schemaIndex = 2, tag = 3)
        private final Border border;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "cornerRadius", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final int corner_radius;

        @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$GoldShimmer#ADAPTER", jsonName = "goldShimmer", schemaIndex = 8, tag = 11)
        private final GoldShimmer gold_shimmer;

        @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$GutterBehavior#ADAPTER", jsonName = "gutterBehavior", schemaIndex = 5, tag = 8)
        private final GutterBehavior gutter_behavior;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        private final String identifier;

        @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$Insets#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 7)
        private final Insets insets;

        @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", jsonName = "onTapAction", schemaIndex = 9, tag = 12)
        private final Action on_tap_action;

        @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", jsonName = "onWillAppear", schemaIndex = 10, tag = 13)
        private final Action on_will_appear;

        @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$Sizing#ADAPTER", schemaIndex = 6, tag = 9)
        private final Sizing sizing;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 12, tag = 15)
        private final Integer tag;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "testTag", schemaIndex = 15, tag = 18)
        private final String test_tag;

        @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$Tooltip#ADAPTER", schemaIndex = 14, tag = 17)
        private final Tooltip tooltip;

        public Modifiers() {
            this(null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29715newBuilder();
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final ThemedColor getBackground_color() {
            return this.background_color;
        }

        public final Border getBorder() {
            return this.border;
        }

        public final int getCorner_radius() {
            return this.corner_radius;
        }

        public final Insets getInsets() {
            return this.insets;
        }

        public final GutterBehavior getGutter_behavior() {
            return this.gutter_behavior;
        }

        public final Sizing getSizing() {
            return this.sizing;
        }

        public final AnalyticsEventDescriptor getAnalytics_event_descriptor() {
            return this.analytics_event_descriptor;
        }

        public final GoldShimmer getGold_shimmer() {
            return this.gold_shimmer;
        }

        public final Action getOn_tap_action() {
            return this.on_tap_action;
        }

        public final Action getOn_will_appear() {
            return this.on_will_appear;
        }

        public final AccessibilityModifier getAccessibility() {
            return this.accessibility;
        }

        public final Integer getTag() {
            return this.tag;
        }

        public final Float getAlpha() {
            return this.alpha;
        }

        public final Tooltip getTooltip() {
            return this.tooltip;
        }

        public final String getTest_tag() {
            return this.test_tag;
        }

        public final BackgroundGradient getBackground_gradient() {
            return this.background_gradient;
        }

        public final Float getBackground_color_opacity() {
            return this.background_color_opacity;
        }

        public /* synthetic */ Modifiers(String str, ThemedColor themedColor, Border border, int i, Insets insets, GutterBehavior gutterBehavior, Sizing sizing, AnalyticsEventDescriptor analyticsEventDescriptor, GoldShimmer goldShimmer, Action action, Action action2, AccessibilityModifier accessibilityModifier, Integer num, Float f, Tooltip tooltip, String str2, BackgroundGradient backgroundGradient, Float f2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : themedColor, (i2 & 4) != 0 ? null : border, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : insets, (i2 & 32) != 0 ? null : gutterBehavior, (i2 & 64) != 0 ? null : sizing, (i2 & 128) != 0 ? null : analyticsEventDescriptor, (i2 & 256) != 0 ? null : goldShimmer, (i2 & 512) != 0 ? null : action, (i2 & 1024) != 0 ? null : action2, (i2 & 2048) != 0 ? null : accessibilityModifier, (i2 & 4096) != 0 ? null : num, (i2 & 8192) != 0 ? null : f, (i2 & 16384) != 0 ? null : tooltip, (i2 & 32768) != 0 ? null : str2, (i2 & 65536) != 0 ? null : backgroundGradient, (i2 & 131072) != 0 ? null : f2, (i2 & 262144) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Modifiers(String str, ThemedColor themedColor, Border border, int i, Insets insets, GutterBehavior gutterBehavior, Sizing sizing, AnalyticsEventDescriptor analyticsEventDescriptor, GoldShimmer goldShimmer, Action action, Action action2, AccessibilityModifier accessibilityModifier, Integer num, Float f, Tooltip tooltip, String str2, BackgroundGradient backgroundGradient, Float f2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.identifier = str;
            this.background_color = themedColor;
            this.border = border;
            this.corner_radius = i;
            this.insets = insets;
            this.gutter_behavior = gutterBehavior;
            this.sizing = sizing;
            this.analytics_event_descriptor = analyticsEventDescriptor;
            this.gold_shimmer = goldShimmer;
            this.on_tap_action = action;
            this.on_will_appear = action2;
            this.accessibility = accessibilityModifier;
            this.tag = num;
            this.alpha = f;
            this.tooltip = tooltip;
            this.test_tag = str2;
            this.background_gradient = backgroundGradient;
            this.background_color_opacity = f2;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29715newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Modifiers)) {
                return false;
            }
            Modifiers modifiers = (Modifiers) other;
            return Intrinsics.areEqual(unknownFields(), modifiers.unknownFields()) && Intrinsics.areEqual(this.identifier, modifiers.identifier) && Intrinsics.areEqual(this.background_color, modifiers.background_color) && Intrinsics.areEqual(this.border, modifiers.border) && this.corner_radius == modifiers.corner_radius && Intrinsics.areEqual(this.insets, modifiers.insets) && Intrinsics.areEqual(this.gutter_behavior, modifiers.gutter_behavior) && Intrinsics.areEqual(this.sizing, modifiers.sizing) && Intrinsics.areEqual(this.analytics_event_descriptor, modifiers.analytics_event_descriptor) && Intrinsics.areEqual(this.gold_shimmer, modifiers.gold_shimmer) && Intrinsics.areEqual(this.on_tap_action, modifiers.on_tap_action) && Intrinsics.areEqual(this.on_will_appear, modifiers.on_will_appear) && Intrinsics.areEqual(this.accessibility, modifiers.accessibility) && Intrinsics.areEqual(this.tag, modifiers.tag) && Intrinsics.areEqual(this.alpha, modifiers.alpha) && Intrinsics.areEqual(this.tooltip, modifiers.tooltip) && Intrinsics.areEqual(this.test_tag, modifiers.test_tag) && Intrinsics.areEqual(this.background_gradient, modifiers.background_gradient) && Intrinsics.areEqual(this.background_color_opacity, modifiers.background_color_opacity);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            String str = this.identifier;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
            ThemedColor themedColor = this.background_color;
            int iHashCode3 = (iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
            Border border = this.border;
            int iHashCode4 = (((iHashCode3 + (border != null ? border.hashCode() : 0)) * 37) + Integer.hashCode(this.corner_radius)) * 37;
            Insets insets = this.insets;
            int iHashCode5 = (iHashCode4 + (insets != null ? insets.hashCode() : 0)) * 37;
            GutterBehavior gutterBehavior = this.gutter_behavior;
            int iHashCode6 = (iHashCode5 + (gutterBehavior != null ? gutterBehavior.hashCode() : 0)) * 37;
            Sizing sizing = this.sizing;
            int iHashCode7 = (iHashCode6 + (sizing != null ? sizing.hashCode() : 0)) * 37;
            AnalyticsEventDescriptor analyticsEventDescriptor = this.analytics_event_descriptor;
            int iHashCode8 = (iHashCode7 + (analyticsEventDescriptor != null ? analyticsEventDescriptor.hashCode() : 0)) * 37;
            GoldShimmer goldShimmer = this.gold_shimmer;
            int iHashCode9 = (iHashCode8 + (goldShimmer != null ? goldShimmer.hashCode() : 0)) * 37;
            Action action = this.on_tap_action;
            int iHashCode10 = (iHashCode9 + (action != null ? action.hashCode() : 0)) * 37;
            Action action2 = this.on_will_appear;
            int iHashCode11 = (iHashCode10 + (action2 != null ? action2.hashCode() : 0)) * 37;
            AccessibilityModifier accessibilityModifier = this.accessibility;
            int iHashCode12 = (iHashCode11 + (accessibilityModifier != null ? accessibilityModifier.hashCode() : 0)) * 37;
            Integer num = this.tag;
            int iHashCode13 = (iHashCode12 + (num != null ? num.hashCode() : 0)) * 37;
            Float f = this.alpha;
            int iHashCode14 = (iHashCode13 + (f != null ? f.hashCode() : 0)) * 37;
            Tooltip tooltip = this.tooltip;
            int iHashCode15 = (iHashCode14 + (tooltip != null ? tooltip.hashCode() : 0)) * 37;
            String str2 = this.test_tag;
            int iHashCode16 = (iHashCode15 + (str2 != null ? str2.hashCode() : 0)) * 37;
            BackgroundGradient backgroundGradient = this.background_gradient;
            int iHashCode17 = (iHashCode16 + (backgroundGradient != null ? backgroundGradient.hashCode() : 0)) * 37;
            Float f2 = this.background_color_opacity;
            int iHashCode18 = iHashCode17 + (f2 != null ? f2.hashCode() : 0);
            this.hashCode = iHashCode18;
            return iHashCode18;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.identifier;
            if (str != null) {
                arrayList.add("identifier=" + Internal.sanitize(str));
            }
            ThemedColor themedColor = this.background_color;
            if (themedColor != null) {
                arrayList.add("background_color=" + themedColor);
            }
            Border border = this.border;
            if (border != null) {
                arrayList.add("border=" + border);
            }
            arrayList.add("corner_radius=" + this.corner_radius);
            Insets insets = this.insets;
            if (insets != null) {
                arrayList.add("insets=" + insets);
            }
            GutterBehavior gutterBehavior = this.gutter_behavior;
            if (gutterBehavior != null) {
                arrayList.add("gutter_behavior=" + gutterBehavior);
            }
            Sizing sizing = this.sizing;
            if (sizing != null) {
                arrayList.add("sizing=" + sizing);
            }
            AnalyticsEventDescriptor analyticsEventDescriptor = this.analytics_event_descriptor;
            if (analyticsEventDescriptor != null) {
                arrayList.add("analytics_event_descriptor=" + analyticsEventDescriptor);
            }
            GoldShimmer goldShimmer = this.gold_shimmer;
            if (goldShimmer != null) {
                arrayList.add("gold_shimmer=" + goldShimmer);
            }
            Action action = this.on_tap_action;
            if (action != null) {
                arrayList.add("on_tap_action=" + action);
            }
            Action action2 = this.on_will_appear;
            if (action2 != null) {
                arrayList.add("on_will_appear=" + action2);
            }
            AccessibilityModifier accessibilityModifier = this.accessibility;
            if (accessibilityModifier != null) {
                arrayList.add("accessibility=" + accessibilityModifier);
            }
            Integer num = this.tag;
            if (num != null) {
                arrayList.add("tag=" + num);
            }
            Float f = this.alpha;
            if (f != null) {
                arrayList.add("alpha=" + f);
            }
            Tooltip tooltip = this.tooltip;
            if (tooltip != null) {
                arrayList.add("tooltip=" + tooltip);
            }
            String str2 = this.test_tag;
            if (str2 != null) {
                arrayList.add("test_tag=" + Internal.sanitize(str2));
            }
            BackgroundGradient backgroundGradient = this.background_gradient;
            if (backgroundGradient != null) {
                arrayList.add("background_gradient=" + backgroundGradient);
            }
            Float f2 = this.background_color_opacity;
            if (f2 != null) {
                arrayList.add("background_color_opacity=" + f2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Modifiers{", "}", 0, null, null, 56, null);
        }

        public final Modifiers copy(String identifier, ThemedColor background_color, Border border, int corner_radius, Insets insets, GutterBehavior gutter_behavior, Sizing sizing, AnalyticsEventDescriptor analytics_event_descriptor, GoldShimmer gold_shimmer, Action on_tap_action, Action on_will_appear, AccessibilityModifier accessibility, Integer tag, Float alpha, Tooltip tooltip, String test_tag, BackgroundGradient background_gradient, Float background_color_opacity, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Modifiers(identifier, background_color, border, corner_radius, insets, gutter_behavior, sizing, analytics_event_descriptor, gold_shimmer, on_tap_action, on_will_appear, accessibility, tag, alpha, tooltip, test_tag, background_gradient, background_color_opacity, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Modifiers.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Modifiers>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Decorator.Modifiers value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getIdentifier()) + ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getBackground_color()) + Border.ADAPTER.encodedSizeWithTag(3, value.getBorder());
                    if (value.getCorner_radius() != 0) {
                        iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getCorner_radius()));
                    }
                    if (value.getInsets() != null) {
                        iEncodedSizeWithTag += Decorator.Modifiers.Insets.ADAPTER.encodedSizeWithTag(7, value.getInsets());
                    }
                    int iEncodedSizeWithTag2 = iEncodedSizeWithTag + Decorator.Modifiers.GutterBehavior.ADAPTER.encodedSizeWithTag(8, value.getGutter_behavior()) + Decorator.Modifiers.Sizing.ADAPTER.encodedSizeWithTag(9, value.getSizing()) + Decorator.Modifiers.AnalyticsEventDescriptor.ADAPTER.encodedSizeWithTag(10, value.getAnalytics_event_descriptor()) + Decorator.Modifiers.GoldShimmer.ADAPTER.encodedSizeWithTag(11, value.getGold_shimmer());
                    ProtoAdapter<Action> protoAdapter2 = Action.ADAPTER;
                    int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(12, value.getOn_tap_action()) + protoAdapter2.encodedSizeWithTag(13, value.getOn_will_appear()) + Decorator.Modifiers.AccessibilityModifier.ADAPTER.encodedSizeWithTag(14, value.getAccessibility()) + ProtoAdapter.INT32.encodedSizeWithTag(15, value.getTag());
                    ProtoAdapter<Float> protoAdapter3 = ProtoAdapter.FLOAT;
                    return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(16, value.getAlpha()) + Decorator.Modifiers.Tooltip.ADAPTER.encodedSizeWithTag(17, value.getTooltip()) + protoAdapter.encodedSizeWithTag(18, value.getTest_tag()) + Decorator.Modifiers.BackgroundGradient.ADAPTER.encodedSizeWithTag(19, value.getBackground_gradient()) + protoAdapter3.encodedSizeWithTag(20, value.getBackground_color_opacity());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Decorator.Modifiers decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    Border borderDecode = null;
                    Decorator.Modifiers.Insets insetsDecode = null;
                    Decorator.Modifiers.GutterBehavior gutterBehaviorDecode = null;
                    Decorator.Modifiers.Sizing sizingDecode = null;
                    Decorator.Modifiers.AnalyticsEventDescriptor analyticsEventDescriptorDecode = null;
                    Decorator.Modifiers.GoldShimmer goldShimmerDecode = null;
                    Action actionDecode = null;
                    Action actionDecode2 = null;
                    Decorator.Modifiers.AccessibilityModifier accessibilityModifierDecode = null;
                    Integer numDecode = null;
                    Float fDecode = null;
                    Decorator.Modifiers.Tooltip tooltipDecode = null;
                    String strDecode = null;
                    Decorator.Modifiers.BackgroundGradient backgroundGradientDecode = null;
                    Float fDecode2 = null;
                    String strDecode2 = null;
                    int iIntValue = 0;
                    ThemedColor themedColorDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        ThemedColor themedColor = themedColorDecode;
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                    continue;
                                case 3:
                                    borderDecode = Border.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 5:
                                case 6:
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                                case 7:
                                    insetsDecode = Decorator.Modifiers.Insets.ADAPTER.decode(reader);
                                    break;
                                case 8:
                                    gutterBehaviorDecode = Decorator.Modifiers.GutterBehavior.ADAPTER.decode(reader);
                                    break;
                                case 9:
                                    sizingDecode = Decorator.Modifiers.Sizing.ADAPTER.decode(reader);
                                    break;
                                case 10:
                                    analyticsEventDescriptorDecode = Decorator.Modifiers.AnalyticsEventDescriptor.ADAPTER.decode(reader);
                                    break;
                                case 11:
                                    goldShimmerDecode = Decorator.Modifiers.GoldShimmer.ADAPTER.decode(reader);
                                    break;
                                case 12:
                                    actionDecode = Action.ADAPTER.decode(reader);
                                    break;
                                case 13:
                                    actionDecode2 = Action.ADAPTER.decode(reader);
                                    break;
                                case 14:
                                    accessibilityModifierDecode = Decorator.Modifiers.AccessibilityModifier.ADAPTER.decode(reader);
                                    break;
                                case 15:
                                    numDecode = ProtoAdapter.INT32.decode(reader);
                                    break;
                                case 16:
                                    fDecode = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                case 17:
                                    tooltipDecode = Decorator.Modifiers.Tooltip.ADAPTER.decode(reader);
                                    break;
                                case 18:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 19:
                                    backgroundGradientDecode = Decorator.Modifiers.BackgroundGradient.ADAPTER.decode(reader);
                                    break;
                                case 20:
                                    fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                            }
                            themedColorDecode = themedColor;
                        } else {
                            return new Decorator.Modifiers(strDecode2, themedColor, borderDecode, iIntValue, insetsDecode, gutterBehaviorDecode, sizingDecode, analyticsEventDescriptorDecode, goldShimmerDecode, actionDecode, actionDecode2, accessibilityModifierDecode, numDecode, fDecode, tooltipDecode, strDecode, backgroundGradientDecode, fDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Decorator.Modifiers value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getIdentifier());
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getBackground_color());
                    Border.ADAPTER.encodeWithTag(writer, 3, (int) value.getBorder());
                    if (value.getCorner_radius() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getCorner_radius()));
                    }
                    if (value.getInsets() != null) {
                        Decorator.Modifiers.Insets.ADAPTER.encodeWithTag(writer, 7, (int) value.getInsets());
                    }
                    Decorator.Modifiers.GutterBehavior.ADAPTER.encodeWithTag(writer, 8, (int) value.getGutter_behavior());
                    Decorator.Modifiers.Sizing.ADAPTER.encodeWithTag(writer, 9, (int) value.getSizing());
                    Decorator.Modifiers.AnalyticsEventDescriptor.ADAPTER.encodeWithTag(writer, 10, (int) value.getAnalytics_event_descriptor());
                    Decorator.Modifiers.GoldShimmer.ADAPTER.encodeWithTag(writer, 11, (int) value.getGold_shimmer());
                    ProtoAdapter<Action> protoAdapter2 = Action.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 12, (int) value.getOn_tap_action());
                    protoAdapter2.encodeWithTag(writer, 13, (int) value.getOn_will_appear());
                    Decorator.Modifiers.AccessibilityModifier.ADAPTER.encodeWithTag(writer, 14, (int) value.getAccessibility());
                    ProtoAdapter.INT32.encodeWithTag(writer, 15, (int) value.getTag());
                    ProtoAdapter<Float> protoAdapter3 = ProtoAdapter.FLOAT;
                    protoAdapter3.encodeWithTag(writer, 16, (int) value.getAlpha());
                    Decorator.Modifiers.Tooltip.ADAPTER.encodeWithTag(writer, 17, (int) value.getTooltip());
                    protoAdapter.encodeWithTag(writer, 18, (int) value.getTest_tag());
                    Decorator.Modifiers.BackgroundGradient.ADAPTER.encodeWithTag(writer, 19, (int) value.getBackground_gradient());
                    protoAdapter3.encodeWithTag(writer, 20, (int) value.getBackground_color_opacity());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Decorator.Modifiers value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
                    protoAdapter.encodeWithTag(writer, 20, (int) value.getBackground_color_opacity());
                    Decorator.Modifiers.BackgroundGradient.ADAPTER.encodeWithTag(writer, 19, (int) value.getBackground_gradient());
                    ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 18, (int) value.getTest_tag());
                    Decorator.Modifiers.Tooltip.ADAPTER.encodeWithTag(writer, 17, (int) value.getTooltip());
                    protoAdapter.encodeWithTag(writer, 16, (int) value.getAlpha());
                    ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
                    protoAdapter3.encodeWithTag(writer, 15, (int) value.getTag());
                    Decorator.Modifiers.AccessibilityModifier.ADAPTER.encodeWithTag(writer, 14, (int) value.getAccessibility());
                    ProtoAdapter<Action> protoAdapter4 = Action.ADAPTER;
                    protoAdapter4.encodeWithTag(writer, 13, (int) value.getOn_will_appear());
                    protoAdapter4.encodeWithTag(writer, 12, (int) value.getOn_tap_action());
                    Decorator.Modifiers.GoldShimmer.ADAPTER.encodeWithTag(writer, 11, (int) value.getGold_shimmer());
                    Decorator.Modifiers.AnalyticsEventDescriptor.ADAPTER.encodeWithTag(writer, 10, (int) value.getAnalytics_event_descriptor());
                    Decorator.Modifiers.Sizing.ADAPTER.encodeWithTag(writer, 9, (int) value.getSizing());
                    Decorator.Modifiers.GutterBehavior.ADAPTER.encodeWithTag(writer, 8, (int) value.getGutter_behavior());
                    if (value.getInsets() != null) {
                        Decorator.Modifiers.Insets.ADAPTER.encodeWithTag(writer, 7, (int) value.getInsets());
                    }
                    if (value.getCorner_radius() != 0) {
                        protoAdapter3.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getCorner_radius()));
                    }
                    Border.ADAPTER.encodeWithTag(writer, 3, (int) value.getBorder());
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getBackground_color());
                    protoAdapter2.encodeWithTag(writer, 1, (int) value.getIdentifier());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Decorator.Modifiers redact(Decorator.Modifiers value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    ThemedColor background_color = value.getBackground_color();
                    ThemedColor themedColorRedact = background_color != null ? ThemedColor.ADAPTER.redact(background_color) : null;
                    Border border = value.getBorder();
                    Border borderRedact = border != null ? Border.ADAPTER.redact(border) : null;
                    Decorator.Modifiers.Insets insets = value.getInsets();
                    Decorator.Modifiers.Insets insetsRedact = insets != null ? Decorator.Modifiers.Insets.ADAPTER.redact(insets) : null;
                    Decorator.Modifiers.GutterBehavior gutter_behavior = value.getGutter_behavior();
                    Decorator.Modifiers.GutterBehavior gutterBehaviorRedact = gutter_behavior != null ? Decorator.Modifiers.GutterBehavior.ADAPTER.redact(gutter_behavior) : null;
                    Decorator.Modifiers.Sizing sizing = value.getSizing();
                    Decorator.Modifiers.Sizing sizingRedact = sizing != null ? Decorator.Modifiers.Sizing.ADAPTER.redact(sizing) : null;
                    Decorator.Modifiers.AnalyticsEventDescriptor analytics_event_descriptor = value.getAnalytics_event_descriptor();
                    Decorator.Modifiers.AnalyticsEventDescriptor analyticsEventDescriptorRedact = analytics_event_descriptor != null ? Decorator.Modifiers.AnalyticsEventDescriptor.ADAPTER.redact(analytics_event_descriptor) : null;
                    Decorator.Modifiers.GoldShimmer gold_shimmer = value.getGold_shimmer();
                    Decorator.Modifiers.GoldShimmer goldShimmerRedact = gold_shimmer != null ? Decorator.Modifiers.GoldShimmer.ADAPTER.redact(gold_shimmer) : null;
                    Action on_tap_action = value.getOn_tap_action();
                    Action actionRedact = on_tap_action != null ? Action.ADAPTER.redact(on_tap_action) : null;
                    Action on_will_appear = value.getOn_will_appear();
                    Action actionRedact2 = on_will_appear != null ? Action.ADAPTER.redact(on_will_appear) : null;
                    Decorator.Modifiers.AccessibilityModifier accessibility = value.getAccessibility();
                    Decorator.Modifiers.AccessibilityModifier accessibilityModifierRedact = accessibility != null ? Decorator.Modifiers.AccessibilityModifier.ADAPTER.redact(accessibility) : null;
                    Decorator.Modifiers.Tooltip tooltip = value.getTooltip();
                    Decorator.Modifiers.Tooltip tooltipRedact = tooltip != null ? Decorator.Modifiers.Tooltip.ADAPTER.redact(tooltip) : null;
                    Decorator.Modifiers.BackgroundGradient background_gradient = value.getBackground_gradient();
                    return value.copy((176137 & 1) != 0 ? value.identifier : null, (176137 & 2) != 0 ? value.background_color : themedColorRedact, (176137 & 4) != 0 ? value.border : borderRedact, (176137 & 8) != 0 ? value.corner_radius : 0, (176137 & 16) != 0 ? value.insets : insetsRedact, (176137 & 32) != 0 ? value.gutter_behavior : gutterBehaviorRedact, (176137 & 64) != 0 ? value.sizing : sizingRedact, (176137 & 128) != 0 ? value.analytics_event_descriptor : analyticsEventDescriptorRedact, (176137 & 256) != 0 ? value.gold_shimmer : goldShimmerRedact, (176137 & 512) != 0 ? value.on_tap_action : actionRedact, (176137 & 1024) != 0 ? value.on_will_appear : actionRedact2, (176137 & 2048) != 0 ? value.accessibility : accessibilityModifierRedact, (176137 & 4096) != 0 ? value.tag : null, (176137 & 8192) != 0 ? value.alpha : null, (176137 & 16384) != 0 ? value.tooltip : tooltipRedact, (176137 & 32768) != 0 ? value.test_tag : null, (176137 & 65536) != 0 ? value.background_gradient : background_gradient != null ? Decorator.Modifiers.BackgroundGradient.ADAPTER.redact(background_gradient) : null, (176137 & 131072) != 0 ? value.background_color_opacity : null, (176137 & 262144) != 0 ? value.unknownFields() : ByteString.EMPTY);
                }
            };
        }

        /* compiled from: Decorator.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$Insets;", "Lcom/squareup/wire/Message;", "", "top", "", "left", "bottom", "right", "unknownFields", "Lokio/ByteString;", "<init>", "(IIIILokio/ByteString;)V", "getTop", "()I", "getLeft", "getBottom", "getRight", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Insets extends Message {

            @JvmField
            public static final ProtoAdapter<Insets> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final int bottom;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final int left;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
            private final int right;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final int top;

            public Insets() {
                this(0, 0, 0, 0, null, 31, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29722newBuilder();
            }

            public final int getTop() {
                return this.top;
            }

            public final int getLeft() {
                return this.left;
            }

            public final int getBottom() {
                return this.bottom;
            }

            public final int getRight() {
                return this.right;
            }

            public /* synthetic */ Insets(int i, int i2, int i3, int i4, ByteString byteString, int i5, DefaultConstructorMarker defaultConstructorMarker) {
                this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Insets(int i, int i2, int i3, int i4, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.top = i;
                this.left = i2;
                this.bottom = i3;
                this.right = i4;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29722newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Insets)) {
                    return false;
                }
                Insets insets = (Insets) other;
                return Intrinsics.areEqual(unknownFields(), insets.unknownFields()) && this.top == insets.top && this.left == insets.left && this.bottom == insets.bottom && this.right == insets.right;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.top)) * 37) + Integer.hashCode(this.left)) * 37) + Integer.hashCode(this.bottom)) * 37) + Integer.hashCode(this.right);
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("top=" + this.top);
                arrayList.add("left=" + this.left);
                arrayList.add("bottom=" + this.bottom);
                arrayList.add("right=" + this.right);
                return CollectionsKt.joinToString$default(arrayList, ", ", "Insets{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Insets copy$default(Insets insets, int i, int i2, int i3, int i4, ByteString byteString, int i5, Object obj) {
                if ((i5 & 1) != 0) {
                    i = insets.top;
                }
                if ((i5 & 2) != 0) {
                    i2 = insets.left;
                }
                if ((i5 & 4) != 0) {
                    i3 = insets.bottom;
                }
                if ((i5 & 8) != 0) {
                    i4 = insets.right;
                }
                if ((i5 & 16) != 0) {
                    byteString = insets.unknownFields();
                }
                ByteString byteString2 = byteString;
                int i6 = i3;
                return insets.copy(i, i2, i6, i4, byteString2);
            }

            public final Insets copy(int top, int left, int bottom, int right, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Insets(top, left, bottom, right, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Insets.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Insets>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$Insets$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.Insets decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        int iIntValue = 0;
                        int iIntValue2 = 0;
                        int iIntValue3 = 0;
                        int iIntValue4 = 0;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new Decorator.Modifiers.Insets(iIntValue, iIntValue2, iIntValue3, iIntValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            } else if (iNextTag == 2) {
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                            } else if (iNextTag == 3) {
                                iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                            } else if (iNextTag == 4) {
                                iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Decorator.Modifiers.Insets value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (value.getTop() != 0) {
                            size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getTop()));
                        }
                        if (value.getLeft() != 0) {
                            size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getLeft()));
                        }
                        if (value.getBottom() != 0) {
                            size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getBottom()));
                        }
                        return value.getRight() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getRight())) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Decorator.Modifiers.Insets value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getTop() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTop()));
                        }
                        if (value.getLeft() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLeft()));
                        }
                        if (value.getBottom() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getBottom()));
                        }
                        if (value.getRight() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getRight()));
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Decorator.Modifiers.Insets value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getRight() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getRight()));
                        }
                        if (value.getBottom() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getBottom()));
                        }
                        if (value.getLeft() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLeft()));
                        }
                        if (value.getTop() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTop()));
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.Insets redact(Decorator.Modifiers.Insets value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return Decorator.Modifiers.Insets.copy$default(value, 0, 0, 0, 0, ByteString.EMPTY, 15, null);
                    }
                };
            }
        }

        /* compiled from: Decorator.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$GutterBehavior;", "Lcom/squareup/wire/Message;", "", "no_gutter_horizontal", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLokio/ByteString;)V", "getNo_gutter_horizontal", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class GutterBehavior extends Message {

            @JvmField
            public static final ProtoAdapter<GutterBehavior> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "noGutterHorizontal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final boolean no_gutter_horizontal;

            /* JADX WARN: Multi-variable type inference failed */
            public GutterBehavior() {
                this(false, null, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29721newBuilder();
            }

            public final boolean getNo_gutter_horizontal() {
                return this.no_gutter_horizontal;
            }

            public /* synthetic */ GutterBehavior(boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GutterBehavior(boolean z, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.no_gutter_horizontal = z;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29721newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof GutterBehavior)) {
                    return false;
                }
                GutterBehavior gutterBehavior = (GutterBehavior) other;
                return Intrinsics.areEqual(unknownFields(), gutterBehavior.unknownFields()) && this.no_gutter_horizontal == gutterBehavior.no_gutter_horizontal;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + Boolean.hashCode(this.no_gutter_horizontal);
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("no_gutter_horizontal=" + this.no_gutter_horizontal);
                return CollectionsKt.joinToString$default(arrayList, ", ", "GutterBehavior{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ GutterBehavior copy$default(GutterBehavior gutterBehavior, boolean z, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = gutterBehavior.no_gutter_horizontal;
                }
                if ((i & 2) != 0) {
                    byteString = gutterBehavior.unknownFields();
                }
                return gutterBehavior.copy(z, byteString);
            }

            public final GutterBehavior copy(boolean no_gutter_horizontal, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new GutterBehavior(no_gutter_horizontal, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GutterBehavior.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<GutterBehavior>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$GutterBehavior$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.GutterBehavior decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        boolean zBooleanValue = false;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new Decorator.Modifiers.GutterBehavior(zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Decorator.Modifiers.GutterBehavior value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return value.getNo_gutter_horizontal() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getNo_gutter_horizontal())) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Decorator.Modifiers.GutterBehavior value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getNo_gutter_horizontal()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getNo_gutter_horizontal()));
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Decorator.Modifiers.GutterBehavior value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getNo_gutter_horizontal()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getNo_gutter_horizontal()));
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.GutterBehavior redact(Decorator.Modifiers.GutterBehavior value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return Decorator.Modifiers.GutterBehavior.copy$default(value, false, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }

        /* compiled from: Decorator.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing;", "Lcom/squareup/wire/Message;", "", "vertical", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing$SizingPreference;", "horizontal", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing$SizingPreference;Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing$SizingPreference;Lokio/ByteString;)V", "getVertical", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing$SizingPreference;", "getHorizontal", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "SizingPreference", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Sizing extends Message {

            @JvmField
            public static final ProtoAdapter<Sizing> ADAPTER;

            @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$Sizing$SizingPreference#ADAPTER", schemaIndex = 1, tag = 2)
            private final SizingPreference horizontal;

            @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$Sizing$SizingPreference#ADAPTER", schemaIndex = 0, tag = 1)
            private final SizingPreference vertical;

            public Sizing() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29723newBuilder();
            }

            public final SizingPreference getVertical() {
                return this.vertical;
            }

            public final SizingPreference getHorizontal() {
                return this.horizontal;
            }

            public /* synthetic */ Sizing(SizingPreference sizingPreference, SizingPreference sizingPreference2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : sizingPreference, (i & 2) != 0 ? null : sizingPreference2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Sizing(SizingPreference sizingPreference, SizingPreference sizingPreference2, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.vertical = sizingPreference;
                this.horizontal = sizingPreference2;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29723newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Sizing)) {
                    return false;
                }
                Sizing sizing = (Sizing) other;
                return Intrinsics.areEqual(unknownFields(), sizing.unknownFields()) && Intrinsics.areEqual(this.vertical, sizing.vertical) && Intrinsics.areEqual(this.horizontal, sizing.horizontal);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                SizingPreference sizingPreference = this.vertical;
                int iHashCode2 = (iHashCode + (sizingPreference != null ? sizingPreference.hashCode() : 0)) * 37;
                SizingPreference sizingPreference2 = this.horizontal;
                int iHashCode3 = iHashCode2 + (sizingPreference2 != null ? sizingPreference2.hashCode() : 0);
                this.hashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                SizingPreference sizingPreference = this.vertical;
                if (sizingPreference != null) {
                    arrayList.add("vertical=" + sizingPreference);
                }
                SizingPreference sizingPreference2 = this.horizontal;
                if (sizingPreference2 != null) {
                    arrayList.add("horizontal=" + sizingPreference2);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Sizing{", "}", 0, null, null, 56, null);
            }

            public final Sizing copy(SizingPreference vertical, SizingPreference horizontal, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Sizing(vertical, horizontal, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Sizing.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Sizing>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$Sizing$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.Sizing decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        Decorator.Modifiers.Sizing.SizingPreference sizingPreferenceDecode = null;
                        Decorator.Modifiers.Sizing.SizingPreference sizingPreferenceDecode2 = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new Decorator.Modifiers.Sizing(sizingPreferenceDecode, sizingPreferenceDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                sizingPreferenceDecode = Decorator.Modifiers.Sizing.SizingPreference.ADAPTER.decode(reader);
                            } else if (iNextTag == 2) {
                                sizingPreferenceDecode2 = Decorator.Modifiers.Sizing.SizingPreference.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Decorator.Modifiers.Sizing value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        ProtoAdapter<Decorator.Modifiers.Sizing.SizingPreference> protoAdapter = Decorator.Modifiers.Sizing.SizingPreference.ADAPTER;
                        return size + protoAdapter.encodedSizeWithTag(1, value.getVertical()) + protoAdapter.encodedSizeWithTag(2, value.getHorizontal());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Decorator.Modifiers.Sizing value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ProtoAdapter<Decorator.Modifiers.Sizing.SizingPreference> protoAdapter = Decorator.Modifiers.Sizing.SizingPreference.ADAPTER;
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getVertical());
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getHorizontal());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Decorator.Modifiers.Sizing value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter<Decorator.Modifiers.Sizing.SizingPreference> protoAdapter = Decorator.Modifiers.Sizing.SizingPreference.ADAPTER;
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getHorizontal());
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getVertical());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.Sizing redact(Decorator.Modifiers.Sizing value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        Decorator.Modifiers.Sizing.SizingPreference vertical = value.getVertical();
                        Decorator.Modifiers.Sizing.SizingPreference sizingPreferenceRedact = vertical != null ? Decorator.Modifiers.Sizing.SizingPreference.ADAPTER.redact(vertical) : null;
                        Decorator.Modifiers.Sizing.SizingPreference horizontal = value.getHorizontal();
                        return value.copy(sizingPreferenceRedact, horizontal != null ? Decorator.Modifiers.Sizing.SizingPreference.ADAPTER.redact(horizontal) : null, ByteString.EMPTY);
                    }
                };
            }

            /* compiled from: Decorator.kt */
            @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001dR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing$SizingPreference;", "Lcom/squareup/wire/Message;", "", "min", "", AnalyticsStrings.MAX_WELCOME_TAG, "fixed", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lkotlin/Unit;Lkotlin/Unit;Ljava/lang/Double;Lokio/ByteString;)V", "getMin", "()Lkotlin/Unit;", "Lkotlin/Unit;", "getMax", "getFixed", "()Ljava/lang/Double;", "Ljava/lang/Double;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Lkotlin/Unit;Lkotlin/Unit;Ljava/lang/Double;Lokio/ByteString;)Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing$SizingPreference;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class SizingPreference extends Message {

                @JvmField
                public static final ProtoAdapter<SizingPreference> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", oneofName = "concrete", schemaIndex = 2, tag = 3)
                private final Double fixed;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#EMPTY", oneofName = "concrete", schemaIndex = 1, tag = 2)
                private final Unit max;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#EMPTY", oneofName = "concrete", schemaIndex = 0, tag = 1)
                private final Unit min;

                public SizingPreference() {
                    this(null, null, null, null, 15, null);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m29724newBuilder();
                }

                public final Unit getMin() {
                    return this.min;
                }

                public final Unit getMax() {
                    return this.max;
                }

                public final Double getFixed() {
                    return this.fixed;
                }

                public /* synthetic */ SizingPreference(Unit unit, Unit unit2, Double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : unit, (i & 2) != 0 ? null : unit2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SizingPreference(Unit unit, Unit unit2, Double d, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.min = unit;
                    this.max = unit2;
                    this.fixed = d;
                    if (Internal.countNonNull(unit, unit2, d) > 1) {
                        throw new IllegalArgumentException("At most one of min, max, fixed may be non-null");
                    }
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m29724newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof SizingPreference)) {
                        return false;
                    }
                    SizingPreference sizingPreference = (SizingPreference) other;
                    return Intrinsics.areEqual(unknownFields(), sizingPreference.unknownFields()) && Intrinsics.areEqual(this.min, sizingPreference.min) && Intrinsics.areEqual(this.max, sizingPreference.max) && Intrinsics.areEqual(this.fixed, sizingPreference.fixed);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = unknownFields().hashCode() * 37;
                    Unit unit = this.min;
                    int iHashCode2 = (iHashCode + (unit != null ? unit.hashCode() : 0)) * 37;
                    Unit unit2 = this.max;
                    int iHashCode3 = (iHashCode2 + (unit2 != null ? unit2.hashCode() : 0)) * 37;
                    Double d = this.fixed;
                    int iHashCode4 = iHashCode3 + (d != null ? d.hashCode() : 0);
                    this.hashCode = iHashCode4;
                    return iHashCode4;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    Unit unit = this.min;
                    if (unit != null) {
                        arrayList.add("min=" + unit);
                    }
                    Unit unit2 = this.max;
                    if (unit2 != null) {
                        arrayList.add("max=" + unit2);
                    }
                    Double d = this.fixed;
                    if (d != null) {
                        arrayList.add("fixed=" + d);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "SizingPreference{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ SizingPreference copy$default(SizingPreference sizingPreference, Unit unit, Unit unit2, Double d, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        unit = sizingPreference.min;
                    }
                    if ((i & 2) != 0) {
                        unit2 = sizingPreference.max;
                    }
                    if ((i & 4) != 0) {
                        d = sizingPreference.fixed;
                    }
                    if ((i & 8) != 0) {
                        byteString = sizingPreference.unknownFields();
                    }
                    return sizingPreference.copy(unit, unit2, d, byteString);
                }

                public final SizingPreference copy(Unit min, Unit max, Double fixed, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new SizingPreference(min, max, fixed, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SizingPreference.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<SizingPreference>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$Sizing$SizingPreference$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public Decorator.Modifiers.Sizing.SizingPreference decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            Unit unit = null;
                            Unit unit2 = null;
                            Double dDecode = null;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new Decorator.Modifiers.Sizing.SizingPreference(unit, unit2, dDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    ProtoAdapter.EMPTY.decode(reader);
                                    unit = Unit.INSTANCE;
                                } else if (iNextTag == 2) {
                                    ProtoAdapter.EMPTY.decode(reader);
                                    unit2 = Unit.INSTANCE;
                                } else if (iNextTag == 3) {
                                    dDecode = ProtoAdapter.DOUBLE.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(Decorator.Modifiers.Sizing.SizingPreference value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            ProtoAdapter<Unit> protoAdapter = ProtoAdapter.EMPTY;
                            return size + protoAdapter.encodedSizeWithTag(1, value.getMin()) + protoAdapter.encodedSizeWithTag(2, value.getMax()) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, value.getFixed());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, Decorator.Modifiers.Sizing.SizingPreference value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            ProtoAdapter<Unit> protoAdapter = ProtoAdapter.EMPTY;
                            protoAdapter.encodeWithTag(writer, 1, (int) value.getMin());
                            protoAdapter.encodeWithTag(writer, 2, (int) value.getMax());
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) value.getFixed());
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, Decorator.Modifiers.Sizing.SizingPreference value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) value.getFixed());
                            ProtoAdapter<Unit> protoAdapter = ProtoAdapter.EMPTY;
                            protoAdapter.encodeWithTag(writer, 2, (int) value.getMax());
                            protoAdapter.encodeWithTag(writer, 1, (int) value.getMin());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public Decorator.Modifiers.Sizing.SizingPreference redact(Decorator.Modifiers.Sizing.SizingPreference value) {
                            Unit unit;
                            Intrinsics.checkNotNullParameter(value, "value");
                            Unit min = value.getMin();
                            Unit unit2 = null;
                            if (min != null) {
                                ProtoAdapter.EMPTY.redact(min);
                                unit = Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            Unit max = value.getMax();
                            if (max != null) {
                                ProtoAdapter.EMPTY.redact(max);
                                unit2 = Unit.INSTANCE;
                            }
                            return Decorator.Modifiers.Sizing.SizingPreference.copy$default(value, unit, unit2, null, ByteString.EMPTY, 4, null);
                        }
                    };
                }
            }
        }

        /* compiled from: Decorator.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001aR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$AnalyticsEventDescriptor;", "Lcom/squareup/wire/Message;", "", "action", "", "component_type", "component_identifier", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)V", "getAction", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getComponent_type", "getComponent_identifier", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)Lrh_server_driven_ui/v1/Decorator$Modifiers$AnalyticsEventDescriptor;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AnalyticsEventDescriptor extends Message {

            @JvmField
            public static final ProtoAdapter<AnalyticsEventDescriptor> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
            private final Integer action;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "componentIdentifier", schemaIndex = 2, tag = 3)
            private final String component_identifier;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "componentType", schemaIndex = 1, tag = 2)
            private final Integer component_type;

            public AnalyticsEventDescriptor() {
                this(null, null, null, null, 15, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29717newBuilder();
            }

            public final Integer getAction() {
                return this.action;
            }

            public final Integer getComponent_type() {
                return this.component_type;
            }

            public final String getComponent_identifier() {
                return this.component_identifier;
            }

            public /* synthetic */ AnalyticsEventDescriptor(Integer num, Integer num2, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnalyticsEventDescriptor(Integer num, Integer num2, String str, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.action = num;
                this.component_type = num2;
                this.component_identifier = str;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29717newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof AnalyticsEventDescriptor)) {
                    return false;
                }
                AnalyticsEventDescriptor analyticsEventDescriptor = (AnalyticsEventDescriptor) other;
                return Intrinsics.areEqual(unknownFields(), analyticsEventDescriptor.unknownFields()) && Intrinsics.areEqual(this.action, analyticsEventDescriptor.action) && Intrinsics.areEqual(this.component_type, analyticsEventDescriptor.component_type) && Intrinsics.areEqual(this.component_identifier, analyticsEventDescriptor.component_identifier);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                Integer num = this.action;
                int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
                Integer num2 = this.component_type;
                int iHashCode3 = (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
                String str = this.component_identifier;
                int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
                this.hashCode = iHashCode4;
                return iHashCode4;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                Integer num = this.action;
                if (num != null) {
                    arrayList.add("action=" + num);
                }
                Integer num2 = this.component_type;
                if (num2 != null) {
                    arrayList.add("component_type=" + num2);
                }
                String str = this.component_identifier;
                if (str != null) {
                    arrayList.add("component_identifier=" + Internal.sanitize(str));
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "AnalyticsEventDescriptor{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ AnalyticsEventDescriptor copy$default(AnalyticsEventDescriptor analyticsEventDescriptor, Integer num, Integer num2, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = analyticsEventDescriptor.action;
                }
                if ((i & 2) != 0) {
                    num2 = analyticsEventDescriptor.component_type;
                }
                if ((i & 4) != 0) {
                    str = analyticsEventDescriptor.component_identifier;
                }
                if ((i & 8) != 0) {
                    byteString = analyticsEventDescriptor.unknownFields();
                }
                return analyticsEventDescriptor.copy(num, num2, str, byteString);
            }

            public final AnalyticsEventDescriptor copy(Integer action, Integer component_type, String component_identifier, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new AnalyticsEventDescriptor(action, component_type, component_identifier, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AnalyticsEventDescriptor.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<AnalyticsEventDescriptor>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$AnalyticsEventDescriptor$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.AnalyticsEventDescriptor decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        Integer numDecode = null;
                        Integer numDecode2 = null;
                        String strDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new Decorator.Modifiers.AnalyticsEventDescriptor(numDecode, numDecode2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                numDecode = ProtoAdapter.INT32.decode(reader);
                            } else if (iNextTag == 2) {
                                numDecode2 = ProtoAdapter.INT32.decode(reader);
                            } else if (iNextTag == 3) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Decorator.Modifiers.AnalyticsEventDescriptor value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                        return size + protoAdapter.encodedSizeWithTag(1, value.getAction()) + protoAdapter.encodedSizeWithTag(2, value.getComponent_type()) + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getComponent_identifier());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Decorator.Modifiers.AnalyticsEventDescriptor value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getAction());
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getComponent_type());
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getComponent_identifier());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Decorator.Modifiers.AnalyticsEventDescriptor value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getComponent_identifier());
                        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getComponent_type());
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getAction());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.AnalyticsEventDescriptor redact(Decorator.Modifiers.AnalyticsEventDescriptor value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return Decorator.Modifiers.AnalyticsEventDescriptor.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }
                };
            }
        }

        /* compiled from: Decorator.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$GoldShimmer;", "Lcom/squareup/wire/Message;", "", "apply_on_top", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Boolean;Lokio/ByteString;)V", "getApply_on_top", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Boolean;Lokio/ByteString;)Lrh_server_driven_ui/v1/Decorator$Modifiers$GoldShimmer;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class GoldShimmer extends Message {

            @JvmField
            public static final ProtoAdapter<GoldShimmer> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "applyOnTop", schemaIndex = 0, tag = 1)
            private final Boolean apply_on_top;

            /* JADX WARN: Multi-variable type inference failed */
            public GoldShimmer() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29720newBuilder();
            }

            public final Boolean getApply_on_top() {
                return this.apply_on_top;
            }

            public /* synthetic */ GoldShimmer(Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoldShimmer(Boolean bool, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.apply_on_top = bool;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29720newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof GoldShimmer)) {
                    return false;
                }
                GoldShimmer goldShimmer = (GoldShimmer) other;
                return Intrinsics.areEqual(unknownFields(), goldShimmer.unknownFields()) && Intrinsics.areEqual(this.apply_on_top, goldShimmer.apply_on_top);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                Boolean bool = this.apply_on_top;
                int iHashCode2 = iHashCode + (bool != null ? bool.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                Boolean bool = this.apply_on_top;
                if (bool != null) {
                    arrayList.add("apply_on_top=" + bool);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "GoldShimmer{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ GoldShimmer copy$default(GoldShimmer goldShimmer, Boolean bool, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = goldShimmer.apply_on_top;
                }
                if ((i & 2) != 0) {
                    byteString = goldShimmer.unknownFields();
                }
                return goldShimmer.copy(bool, byteString);
            }

            public final GoldShimmer copy(Boolean apply_on_top, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new GoldShimmer(apply_on_top, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldShimmer.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<GoldShimmer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$GoldShimmer$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.GoldShimmer decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        Boolean boolDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new Decorator.Modifiers.GoldShimmer(boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Decorator.Modifiers.GoldShimmer value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(1, value.getApply_on_top());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Decorator.Modifiers.GoldShimmer value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) value.getApply_on_top());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Decorator.Modifiers.GoldShimmer value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) value.getApply_on_top());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.GoldShimmer redact(Decorator.Modifiers.GoldShimmer value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return Decorator.Modifiers.GoldShimmer.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }

        /* compiled from: Decorator.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J,\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "", "traits", "", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier$Trait;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getLabel", "()Ljava/lang/String;", "getTraits", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Trait", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AccessibilityModifier extends Message {

            @JvmField
            public static final ProtoAdapter<AccessibilityModifier> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            private final String label;

            @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$AccessibilityModifier$Trait#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
            private final List<Trait> traits;

            public AccessibilityModifier() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29716newBuilder();
            }

            public final String getLabel() {
                return this.label;
            }

            public /* synthetic */ AccessibilityModifier(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccessibilityModifier(String str, List<? extends Trait> traits, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(traits, "traits");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.label = str;
                this.traits = Internal.immutableCopyOf("traits", traits);
            }

            public final List<Trait> getTraits() {
                return this.traits;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29716newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof AccessibilityModifier)) {
                    return false;
                }
                AccessibilityModifier accessibilityModifier = (AccessibilityModifier) other;
                return Intrinsics.areEqual(unknownFields(), accessibilityModifier.unknownFields()) && Intrinsics.areEqual(this.label, accessibilityModifier.label) && Intrinsics.areEqual(this.traits, accessibilityModifier.traits);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                String str = this.label;
                int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.traits.hashCode();
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.label;
                if (str != null) {
                    arrayList.add("label=" + Internal.sanitize(str));
                }
                if (!this.traits.isEmpty()) {
                    arrayList.add("traits=" + this.traits);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "AccessibilityModifier{", "}", 0, null, null, 56, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AccessibilityModifier copy$default(AccessibilityModifier accessibilityModifier, String str, List list, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = accessibilityModifier.label;
                }
                if ((i & 2) != 0) {
                    list = accessibilityModifier.traits;
                }
                if ((i & 4) != 0) {
                    byteString = accessibilityModifier.unknownFields();
                }
                return accessibilityModifier.copy(str, list, byteString);
            }

            public final AccessibilityModifier copy(String label, List<? extends Trait> traits, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(traits, "traits");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new AccessibilityModifier(label, traits, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccessibilityModifier.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<AccessibilityModifier>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$AccessibilityModifier$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Decorator.Modifiers.AccessibilityModifier value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLabel()) + Decorator.Modifiers.AccessibilityModifier.Trait.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getTraits());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Decorator.Modifiers.AccessibilityModifier value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                        Decorator.Modifiers.AccessibilityModifier.Trait.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getTraits());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Decorator.Modifiers.AccessibilityModifier value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        Decorator.Modifiers.AccessibilityModifier.Trait.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getTraits());
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.AccessibilityModifier decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        ArrayList arrayList = new ArrayList();
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new Decorator.Modifiers.AccessibilityModifier(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                try {
                                    Decorator.Modifiers.AccessibilityModifier.Trait.ADAPTER.tryDecode(reader, arrayList);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.AccessibilityModifier redact(Decorator.Modifiers.AccessibilityModifier value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return Decorator.Modifiers.AccessibilityModifier.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }
                };
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: Decorator.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier$Trait;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRAIT_UNSPECIFIED", "TRAIT_HEADER", "TRAIT_UPDATES_FREQUENTLY", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Trait implements WireEnum {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Trait[] $VALUES;

                @JvmField
                public static final ProtoAdapter<Trait> ADAPTER;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final Trait TRAIT_HEADER;
                public static final Trait TRAIT_UNSPECIFIED;
                public static final Trait TRAIT_UPDATES_FREQUENTLY;
                private final int value;

                private static final /* synthetic */ Trait[] $values() {
                    return new Trait[]{TRAIT_UNSPECIFIED, TRAIT_HEADER, TRAIT_UPDATES_FREQUENTLY};
                }

                @JvmStatic
                public static final Trait fromValue(int i) {
                    return INSTANCE.fromValue(i);
                }

                public static EnumEntries<Trait> getEntries() {
                    return $ENTRIES;
                }

                private Trait(String str, int i, int i2) {
                    this.value = i2;
                }

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                static {
                    final Trait trait = new Trait("TRAIT_UNSPECIFIED", 0, 0);
                    TRAIT_UNSPECIFIED = trait;
                    TRAIT_HEADER = new Trait("TRAIT_HEADER", 1, 1);
                    TRAIT_UPDATES_FREQUENTLY = new Trait("TRAIT_UPDATES_FREQUENTLY", 2, 2);
                    Trait[] traitArr$values = $values();
                    $VALUES = traitArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(traitArr$values);
                    INSTANCE = new Companion(null);
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Trait.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new EnumAdapter<Trait>(orCreateKotlinClass, syntax, trait) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$AccessibilityModifier$Trait$Companion$ADAPTER$1
                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.squareup.wire.EnumAdapter
                        public Decorator.Modifiers.AccessibilityModifier.Trait fromValue(int value) {
                            return Decorator.Modifiers.AccessibilityModifier.Trait.INSTANCE.fromValue(value);
                        }
                    };
                }

                /* compiled from: Decorator.kt */
                @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier$Trait$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier$Trait;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    @JvmStatic
                    public final Trait fromValue(int value) {
                        if (value == 0) {
                            return Trait.TRAIT_UNSPECIFIED;
                        }
                        if (value == 1) {
                            return Trait.TRAIT_HEADER;
                        }
                        if (value != 2) {
                            return null;
                        }
                        return Trait.TRAIT_UPDATES_FREQUENTLY;
                    }
                }

                public static Trait valueOf(String str) {
                    return (Trait) Enum.valueOf(Trait.class, str);
                }

                public static Trait[] values() {
                    return (Trait[]) $VALUES.clone();
                }
            }
        }

        /* compiled from: Decorator.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016JE\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010!R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip;", "Lcom/squareup/wire/Message;", "", "text", "Lrh_server_driven_ui/v1/MarkdownText;", "position", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position;", "dismiss_timeout", "", "on_dismiss", "Lrh_server_driven_ui/v1/Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/MarkdownText;Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position;Ljava/lang/Integer;Lrh_server_driven_ui/v1/Action;Lokio/ByteString;)V", "getText", "()Lrh_server_driven_ui/v1/MarkdownText;", "getPosition", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position;", "getDismiss_timeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOn_dismiss", "()Lrh_server_driven_ui/v1/Action;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Lrh_server_driven_ui/v1/MarkdownText;Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position;Ljava/lang/Integer;Lrh_server_driven_ui/v1/Action;Lokio/ByteString;)Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip;", "Companion", "Position", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Tooltip extends Message {

            @JvmField
            public static final ProtoAdapter<Tooltip> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "dismissTimeout", schemaIndex = 2, tag = 3)
            private final Integer dismiss_timeout;

            @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", jsonName = "onDismiss", schemaIndex = 3, tag = 4)
            private final Action on_dismiss;

            @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$Tooltip$Position#ADAPTER", schemaIndex = 1, tag = 2)
            private final Position position;

            @WireField(adapter = "rh_server_driven_ui.v1.MarkdownText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final MarkdownText text;

            public Tooltip() {
                this(null, null, null, null, null, 31, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29725newBuilder();
            }

            public final MarkdownText getText() {
                return this.text;
            }

            public final Position getPosition() {
                return this.position;
            }

            public final Integer getDismiss_timeout() {
                return this.dismiss_timeout;
            }

            public final Action getOn_dismiss() {
                return this.on_dismiss;
            }

            public /* synthetic */ Tooltip(MarkdownText markdownText, Position position, Integer num, Action action, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : markdownText, (i & 2) != 0 ? null : position, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : action, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Tooltip(MarkdownText markdownText, Position position, Integer num, Action action, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.text = markdownText;
                this.position = position;
                this.dismiss_timeout = num;
                this.on_dismiss = action;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29725newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Tooltip)) {
                    return false;
                }
                Tooltip tooltip = (Tooltip) other;
                return Intrinsics.areEqual(unknownFields(), tooltip.unknownFields()) && Intrinsics.areEqual(this.text, tooltip.text) && this.position == tooltip.position && Intrinsics.areEqual(this.dismiss_timeout, tooltip.dismiss_timeout) && Intrinsics.areEqual(this.on_dismiss, tooltip.on_dismiss);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                MarkdownText markdownText = this.text;
                int iHashCode2 = (iHashCode + (markdownText != null ? markdownText.hashCode() : 0)) * 37;
                Position position = this.position;
                int iHashCode3 = (iHashCode2 + (position != null ? position.hashCode() : 0)) * 37;
                Integer num = this.dismiss_timeout;
                int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
                Action action = this.on_dismiss;
                int iHashCode5 = iHashCode4 + (action != null ? action.hashCode() : 0);
                this.hashCode = iHashCode5;
                return iHashCode5;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                MarkdownText markdownText = this.text;
                if (markdownText != null) {
                    arrayList.add("text=" + markdownText);
                }
                Position position = this.position;
                if (position != null) {
                    arrayList.add("position=" + position);
                }
                Integer num = this.dismiss_timeout;
                if (num != null) {
                    arrayList.add("dismiss_timeout=" + num);
                }
                Action action = this.on_dismiss;
                if (action != null) {
                    arrayList.add("on_dismiss=" + action);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Tooltip{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, MarkdownText markdownText, Position position, Integer num, Action action, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    markdownText = tooltip.text;
                }
                if ((i & 2) != 0) {
                    position = tooltip.position;
                }
                if ((i & 4) != 0) {
                    num = tooltip.dismiss_timeout;
                }
                if ((i & 8) != 0) {
                    action = tooltip.on_dismiss;
                }
                if ((i & 16) != 0) {
                    byteString = tooltip.unknownFields();
                }
                ByteString byteString2 = byteString;
                Integer num2 = num;
                return tooltip.copy(markdownText, position, num2, action, byteString2);
            }

            public final Tooltip copy(MarkdownText text, Position position, Integer dismiss_timeout, Action on_dismiss, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Tooltip(text, position, dismiss_timeout, on_dismiss, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Tooltip.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Tooltip>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$Tooltip$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.Tooltip decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        MarkdownText markdownTextDecode = null;
                        Decorator.Modifiers.Tooltip.Position positionDecode = null;
                        Integer numDecode = null;
                        Action actionDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new Decorator.Modifiers.Tooltip(markdownTextDecode, positionDecode, numDecode, actionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                markdownTextDecode = MarkdownText.ADAPTER.decode(reader);
                            } else if (iNextTag == 2) {
                                try {
                                    positionDecode = Decorator.Modifiers.Tooltip.Position.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 3) {
                                numDecode = ProtoAdapter.INT32.decode(reader);
                            } else if (iNextTag == 4) {
                                actionDecode = Action.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Decorator.Modifiers.Tooltip value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (value.getText() != null) {
                            size += MarkdownText.ADAPTER.encodedSizeWithTag(1, value.getText());
                        }
                        return size + Decorator.Modifiers.Tooltip.Position.ADAPTER.encodedSizeWithTag(2, value.getPosition()) + ProtoAdapter.INT32.encodedSizeWithTag(3, value.getDismiss_timeout()) + Action.ADAPTER.encodedSizeWithTag(4, value.getOn_dismiss());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Decorator.Modifiers.Tooltip value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getText() != null) {
                            MarkdownText.ADAPTER.encodeWithTag(writer, 1, (int) value.getText());
                        }
                        Decorator.Modifiers.Tooltip.Position.ADAPTER.encodeWithTag(writer, 2, (int) value.getPosition());
                        ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getDismiss_timeout());
                        Action.ADAPTER.encodeWithTag(writer, 4, (int) value.getOn_dismiss());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Decorator.Modifiers.Tooltip value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        Action.ADAPTER.encodeWithTag(writer, 4, (int) value.getOn_dismiss());
                        ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getDismiss_timeout());
                        Decorator.Modifiers.Tooltip.Position.ADAPTER.encodeWithTag(writer, 2, (int) value.getPosition());
                        if (value.getText() != null) {
                            MarkdownText.ADAPTER.encodeWithTag(writer, 1, (int) value.getText());
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.Tooltip redact(Decorator.Modifiers.Tooltip value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        MarkdownText text = value.getText();
                        MarkdownText markdownTextRedact = text != null ? MarkdownText.ADAPTER.redact(text) : null;
                        Action on_dismiss = value.getOn_dismiss();
                        return Decorator.Modifiers.Tooltip.copy$default(value, markdownTextRedact, null, null, on_dismiss != null ? Action.ADAPTER.redact(on_dismiss) : null, ByteString.EMPTY, 6, null);
                    }
                };
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: Decorator.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "POSITION_UNSPECIFIED", "POSITION_TOP", "POSITION_BOTTOM", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public static final class Position implements WireEnum {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Position[] $VALUES;

                @JvmField
                public static final ProtoAdapter<Position> ADAPTER;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final Position POSITION_BOTTOM;
                public static final Position POSITION_TOP;
                public static final Position POSITION_UNSPECIFIED;
                private final int value;

                private static final /* synthetic */ Position[] $values() {
                    return new Position[]{POSITION_UNSPECIFIED, POSITION_TOP, POSITION_BOTTOM};
                }

                @JvmStatic
                public static final Position fromValue(int i) {
                    return INSTANCE.fromValue(i);
                }

                public static EnumEntries<Position> getEntries() {
                    return $ENTRIES;
                }

                private Position(String str, int i, int i2) {
                    this.value = i2;
                }

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                static {
                    final Position position = new Position("POSITION_UNSPECIFIED", 0, 0);
                    POSITION_UNSPECIFIED = position;
                    POSITION_TOP = new Position("POSITION_TOP", 1, 1);
                    POSITION_BOTTOM = new Position("POSITION_BOTTOM", 2, 2);
                    Position[] positionArr$values = $values();
                    $VALUES = positionArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(positionArr$values);
                    INSTANCE = new Companion(null);
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Position.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new EnumAdapter<Position>(orCreateKotlinClass, syntax, position) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$Tooltip$Position$Companion$ADAPTER$1
                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.squareup.wire.EnumAdapter
                        public Decorator.Modifiers.Tooltip.Position fromValue(int value) {
                            return Decorator.Modifiers.Tooltip.Position.INSTANCE.fromValue(value);
                        }
                    };
                }

                /* compiled from: Decorator.kt */
                @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    @JvmStatic
                    public final Position fromValue(int value) {
                        if (value == 0) {
                            return Position.POSITION_UNSPECIFIED;
                        }
                        if (value == 1) {
                            return Position.POSITION_TOP;
                        }
                        if (value != 2) {
                            return null;
                        }
                        return Position.POSITION_BOTTOM;
                    }
                }

                public static Position valueOf(String str) {
                    return (Position) Enum.valueOf(Position.class, str);
                }

                public static Position[] values() {
                    return (Position[]) $VALUES.clone();
                }
            }
        }

        /* compiled from: Decorator.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient;", "Lcom/squareup/wire/Message;", "", "stops", "", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientStop;", "direction", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientDirection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientDirection;Lokio/ByteString;)V", "getDirection", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientDirection;", "getStops", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "GradientStop", "GradientDirection", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class BackgroundGradient extends Message {

            @JvmField
            public static final ProtoAdapter<BackgroundGradient> ADAPTER;

            @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$BackgroundGradient$GradientDirection#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final GradientDirection direction;

            @WireField(adapter = "rh_server_driven_ui.v1.Decorator$Modifiers$BackgroundGradient$GradientStop#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
            private final List<GradientStop> stops;

            public BackgroundGradient() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29718newBuilder();
            }

            public /* synthetic */ BackgroundGradient(List list, GradientDirection gradientDirection, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? GradientDirection.DIRECTION_UNSPECIFIED : gradientDirection, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public final GradientDirection getDirection() {
                return this.direction;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BackgroundGradient(List<GradientStop> stops, GradientDirection direction, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(stops, "stops");
                Intrinsics.checkNotNullParameter(direction, "direction");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.direction = direction;
                this.stops = Internal.immutableCopyOf("stops", stops);
            }

            public final List<GradientStop> getStops() {
                return this.stops;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29718newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof BackgroundGradient)) {
                    return false;
                }
                BackgroundGradient backgroundGradient = (BackgroundGradient) other;
                return Intrinsics.areEqual(unknownFields(), backgroundGradient.unknownFields()) && Intrinsics.areEqual(this.stops, backgroundGradient.stops) && this.direction == backgroundGradient.direction;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((unknownFields().hashCode() * 37) + this.stops.hashCode()) * 37) + this.direction.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                if (!this.stops.isEmpty()) {
                    arrayList.add("stops=" + this.stops);
                }
                arrayList.add("direction=" + this.direction);
                return CollectionsKt.joinToString$default(arrayList, ", ", "BackgroundGradient{", "}", 0, null, null, 56, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ BackgroundGradient copy$default(BackgroundGradient backgroundGradient, List list, GradientDirection gradientDirection, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = backgroundGradient.stops;
                }
                if ((i & 2) != 0) {
                    gradientDirection = backgroundGradient.direction;
                }
                if ((i & 4) != 0) {
                    byteString = backgroundGradient.unknownFields();
                }
                return backgroundGradient.copy(list, gradientDirection, byteString);
            }

            public final BackgroundGradient copy(List<GradientStop> stops, GradientDirection direction, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(stops, "stops");
                Intrinsics.checkNotNullParameter(direction, "direction");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new BackgroundGradient(stops, direction, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BackgroundGradient.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<BackgroundGradient>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$BackgroundGradient$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Decorator.Modifiers.BackgroundGradient value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size() + Decorator.Modifiers.BackgroundGradient.GradientStop.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getStops());
                        return value.getDirection() != Decorator.Modifiers.BackgroundGradient.GradientDirection.DIRECTION_UNSPECIFIED ? size + Decorator.Modifiers.BackgroundGradient.GradientDirection.ADAPTER.encodedSizeWithTag(2, value.getDirection()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Decorator.Modifiers.BackgroundGradient value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        Decorator.Modifiers.BackgroundGradient.GradientStop.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getStops());
                        if (value.getDirection() != Decorator.Modifiers.BackgroundGradient.GradientDirection.DIRECTION_UNSPECIFIED) {
                            Decorator.Modifiers.BackgroundGradient.GradientDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Decorator.Modifiers.BackgroundGradient value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getDirection() != Decorator.Modifiers.BackgroundGradient.GradientDirection.DIRECTION_UNSPECIFIED) {
                            Decorator.Modifiers.BackgroundGradient.GradientDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                        }
                        Decorator.Modifiers.BackgroundGradient.GradientStop.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getStops());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.BackgroundGradient decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        ArrayList arrayList = new ArrayList();
                        Decorator.Modifiers.BackgroundGradient.GradientDirection gradientDirectionDecode = Decorator.Modifiers.BackgroundGradient.GradientDirection.DIRECTION_UNSPECIFIED;
                        long jBeginMessage = reader.beginMessage();
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new Decorator.Modifiers.BackgroundGradient(arrayList, gradientDirectionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                arrayList.add(Decorator.Modifiers.BackgroundGradient.GradientStop.ADAPTER.decode(reader));
                            } else if (iNextTag == 2) {
                                try {
                                    gradientDirectionDecode = Decorator.Modifiers.BackgroundGradient.GradientDirection.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Decorator.Modifiers.BackgroundGradient redact(Decorator.Modifiers.BackgroundGradient value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return Decorator.Modifiers.BackgroundGradient.copy$default(value, Internal.m26823redactElements(value.getStops(), Decorator.Modifiers.BackgroundGradient.GradientStop.ADAPTER), null, ByteString.EMPTY, 2, null);
                    }
                };
            }

            /* compiled from: Decorator.kt */
            @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J0\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientStop;", "Lcom/squareup/wire/Message;", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "opacity", "", "position", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;FFLokio/ByteString;)V", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getOpacity", "()F", "getPosition", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class GradientStop extends Message {

                @JvmField
                public static final ProtoAdapter<GradientStop> ADAPTER;

                @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                private final ThemedColor color;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
                private final float opacity;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
                private final float position;

                public GradientStop() {
                    this(null, 0.0f, 0.0f, null, 15, null);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m29719newBuilder();
                }

                public final ThemedColor getColor() {
                    return this.color;
                }

                public final float getOpacity() {
                    return this.opacity;
                }

                public final float getPosition() {
                    return this.position;
                }

                public /* synthetic */ GradientStop(ThemedColor themedColor, float f, float f2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public GradientStop(ThemedColor themedColor, float f, float f2, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.color = themedColor;
                    this.opacity = f;
                    this.position = f2;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m29719newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof GradientStop)) {
                        return false;
                    }
                    GradientStop gradientStop = (GradientStop) other;
                    return Intrinsics.areEqual(unknownFields(), gradientStop.unknownFields()) && Intrinsics.areEqual(this.color, gradientStop.color) && this.opacity == gradientStop.opacity && this.position == gradientStop.position;
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = unknownFields().hashCode() * 37;
                    ThemedColor themedColor = this.color;
                    int iHashCode2 = ((((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + Float.hashCode(this.opacity)) * 37) + Float.hashCode(this.position);
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
                    arrayList.add("opacity=" + this.opacity);
                    arrayList.add("position=" + this.position);
                    return CollectionsKt.joinToString$default(arrayList, ", ", "GradientStop{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ GradientStop copy$default(GradientStop gradientStop, ThemedColor themedColor, float f, float f2, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        themedColor = gradientStop.color;
                    }
                    if ((i & 2) != 0) {
                        f = gradientStop.opacity;
                    }
                    if ((i & 4) != 0) {
                        f2 = gradientStop.position;
                    }
                    if ((i & 8) != 0) {
                        byteString = gradientStop.unknownFields();
                    }
                    return gradientStop.copy(themedColor, f, f2, byteString);
                }

                public final GradientStop copy(ThemedColor color, float opacity, float position, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new GradientStop(color, opacity, position, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GradientStop.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<GradientStop>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$BackgroundGradient$GradientStop$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public Decorator.Modifiers.BackgroundGradient.GradientStop decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            ThemedColor themedColorDecode = null;
                            float fFloatValue = 0.0f;
                            float fFloatValue2 = 0.0f;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new Decorator.Modifiers.BackgroundGradient.GradientStop(themedColorDecode, fFloatValue, fFloatValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                } else if (iNextTag == 2) {
                                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                } else if (iNextTag == 3) {
                                    fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(Decorator.Modifiers.BackgroundGradient.GradientStop value) {
                            Float fValueOf = Float.valueOf(0.0f);
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            if (value.getColor() != null) {
                                size += ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getColor());
                            }
                            if (!Float.valueOf(value.getOpacity()).equals(fValueOf)) {
                                size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getOpacity()));
                            }
                            return !Float.valueOf(value.getPosition()).equals(fValueOf) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getPosition())) : size;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, Decorator.Modifiers.BackgroundGradient.GradientStop value) throws IOException {
                            Float fValueOf = Float.valueOf(0.0f);
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (value.getColor() != null) {
                                ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                            }
                            if (!Float.valueOf(value.getOpacity()).equals(fValueOf)) {
                                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getOpacity()));
                            }
                            if (!Float.valueOf(value.getPosition()).equals(fValueOf)) {
                                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getPosition()));
                            }
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, Decorator.Modifiers.BackgroundGradient.GradientStop value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            Float fValueOf = Float.valueOf(value.getPosition());
                            Float fValueOf2 = Float.valueOf(0.0f);
                            if (!fValueOf.equals(fValueOf2)) {
                                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getPosition()));
                            }
                            if (!Float.valueOf(value.getOpacity()).equals(fValueOf2)) {
                                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getOpacity()));
                            }
                            if (value.getColor() != null) {
                                ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public Decorator.Modifiers.BackgroundGradient.GradientStop redact(Decorator.Modifiers.BackgroundGradient.GradientStop value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            ThemedColor color = value.getColor();
                            return Decorator.Modifiers.BackgroundGradient.GradientStop.copy$default(value, color != null ? ThemedColor.ADAPTER.redact(color) : null, 0.0f, 0.0f, ByteString.EMPTY, 6, null);
                        }
                    };
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: Decorator.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientDirection;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DIRECTION_UNSPECIFIED", "DIRECTION_HORIZONTAL", "DIRECTION_VERTICAL", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class GradientDirection implements WireEnum {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ GradientDirection[] $VALUES;

                @JvmField
                public static final ProtoAdapter<GradientDirection> ADAPTER;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final GradientDirection DIRECTION_HORIZONTAL;
                public static final GradientDirection DIRECTION_UNSPECIFIED;
                public static final GradientDirection DIRECTION_VERTICAL;
                private final int value;

                private static final /* synthetic */ GradientDirection[] $values() {
                    return new GradientDirection[]{DIRECTION_UNSPECIFIED, DIRECTION_HORIZONTAL, DIRECTION_VERTICAL};
                }

                @JvmStatic
                public static final GradientDirection fromValue(int i) {
                    return INSTANCE.fromValue(i);
                }

                public static EnumEntries<GradientDirection> getEntries() {
                    return $ENTRIES;
                }

                private GradientDirection(String str, int i, int i2) {
                    this.value = i2;
                }

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                static {
                    final GradientDirection gradientDirection = new GradientDirection("DIRECTION_UNSPECIFIED", 0, 0);
                    DIRECTION_UNSPECIFIED = gradientDirection;
                    DIRECTION_HORIZONTAL = new GradientDirection("DIRECTION_HORIZONTAL", 1, 1);
                    DIRECTION_VERTICAL = new GradientDirection("DIRECTION_VERTICAL", 2, 2);
                    GradientDirection[] gradientDirectionArr$values = $values();
                    $VALUES = gradientDirectionArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(gradientDirectionArr$values);
                    INSTANCE = new Companion(null);
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GradientDirection.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new EnumAdapter<GradientDirection>(orCreateKotlinClass, syntax, gradientDirection) { // from class: rh_server_driven_ui.v1.Decorator$Modifiers$BackgroundGradient$GradientDirection$Companion$ADAPTER$1
                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.squareup.wire.EnumAdapter
                        public Decorator.Modifiers.BackgroundGradient.GradientDirection fromValue(int value) {
                            return Decorator.Modifiers.BackgroundGradient.GradientDirection.INSTANCE.fromValue(value);
                        }
                    };
                }

                /* compiled from: Decorator.kt */
                @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientDirection$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientDirection;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    @JvmStatic
                    public final GradientDirection fromValue(int value) {
                        if (value == 0) {
                            return GradientDirection.DIRECTION_UNSPECIFIED;
                        }
                        if (value == 1) {
                            return GradientDirection.DIRECTION_HORIZONTAL;
                        }
                        if (value != 2) {
                            return null;
                        }
                        return GradientDirection.DIRECTION_VERTICAL;
                    }
                }

                public static GradientDirection valueOf(String str) {
                    return (GradientDirection) Enum.valueOf(GradientDirection.class, str);
                }

                public static GradientDirection[] values() {
                    return (GradientDirection[]) $VALUES.clone();
                }
            }
        }
    }
}
