package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B[\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010*R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010\u001d¨\u00069"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarkdownText;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiTextAlignment;", "alignment", "Lmicrogram/ui/sdui/SduiThemedColor;", ResourceTypes.COLOR, "linkColorOverride", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTextStyle;", ResourceTypes.STYLE, "", "text", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiTextAlignment;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextStyle;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiMarkdownText;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiTextAlignment;", "getAlignment", "()Lmicrogram/ui/sdui/SduiTextAlignment;", "Lmicrogram/ui/sdui/SduiThemedColor;", "getColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getLinkColorOverride", "getLinkColorOverride$annotations", "()V", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTextStyle;", "getStyle", "()Lmicrogram/ui/sdui/SduiTextStyle;", "Ljava/lang/String;", "getText", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiMarkdownText extends SduiComponent {
    private final SduiTextAlignment alignment;
    private final SduiThemedColor color;
    private final SduiThemedColor linkColorOverride;
    private final SduiComponentType sduiComponentType;
    private final SduiTextStyle style;
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiTextAlignment.INSTANCE.serializer(), null, null, SduiComponentType.INSTANCE.serializer(), SduiTextStyle.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiMarkdownText)) {
            return false;
        }
        SduiMarkdownText sduiMarkdownText = (SduiMarkdownText) other;
        return this.alignment == sduiMarkdownText.alignment && Intrinsics.areEqual(this.color, sduiMarkdownText.color) && Intrinsics.areEqual(this.linkColorOverride, sduiMarkdownText.linkColorOverride) && this.sduiComponentType == sduiMarkdownText.sduiComponentType && this.style == sduiMarkdownText.style && Intrinsics.areEqual(this.text, sduiMarkdownText.text);
    }

    public int hashCode() {
        int iHashCode = ((this.alignment.hashCode() * 31) + this.color.hashCode()) * 31;
        SduiThemedColor sduiThemedColor = this.linkColorOverride;
        return ((((((iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31) + this.style.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "SduiMarkdownText(alignment=" + this.alignment + ", color=" + this.color + ", linkColorOverride=" + this.linkColorOverride + ", sduiComponentType=" + this.sduiComponentType + ", style=" + this.style + ", text=" + this.text + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarkdownText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiMarkdownText;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiMarkdownText> serializer() {
            return SduiMarkdownText$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiMarkdownText(int i, SduiTextAlignment sduiTextAlignment, SduiThemedColor sduiThemedColor, @SerialName("link_color_override") SduiThemedColor sduiThemedColor2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiTextStyle sduiTextStyle, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (32 != (i & 32)) {
            PluginExceptions.throwMissingFieldException(i, 32, SduiMarkdownText$$serializer.INSTANCE.getDescriptor());
        }
        this.alignment = (i & 1) == 0 ? SduiTextAlignment.START : sduiTextAlignment;
        if ((i & 2) == 0) {
            SduiColor sduiColor = SduiColor.f7102FG;
            this.color = new SduiThemedColor(sduiColor, sduiColor);
        } else {
            this.color = sduiThemedColor;
        }
        if ((i & 4) == 0) {
            this.linkColorOverride = null;
        } else {
            this.linkColorOverride = sduiThemedColor2;
        }
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.MARKDOWN_TEXT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 16) == 0) {
            this.style = SduiTextStyle.TEXT_MEDIUM;
        } else {
            this.style = sduiTextStyle;
        }
        this.text = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiMarkdownText self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.alignment != SduiTextAlignment.START) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.alignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1)) {
            output.encodeSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.color);
        } else {
            SduiThemedColor sduiThemedColor = self.color;
            SduiColor sduiColor = SduiColor.f7102FG;
            if (!Intrinsics.areEqual(sduiThemedColor, new SduiThemedColor(sduiColor, sduiColor))) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.linkColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiThemedColor$$serializer.INSTANCE, self.linkColorOverride);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.MARKDOWN_TEXT) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.style != SduiTextStyle.TEXT_MEDIUM) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.style);
        }
        output.encodeStringElement(serialDesc, 5, self.text);
    }
}
