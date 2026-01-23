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
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BY\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u0010\u001e¨\u0006;"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiBookCoverText;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiTextAlignment;", "alignment", "Lmicrogram/ui/sdui/SduiThemedColor;", ResourceTypes.COLOR, "Lmicrogram/ui/sdui/SduiFont;", "font", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiBookCoverTextStyle;", ResourceTypes.STYLE, "", "text", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiTextAlignment;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiFont;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiBookCoverTextStyle;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiBookCoverText;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiTextAlignment;", "getAlignment", "()Lmicrogram/ui/sdui/SduiTextAlignment;", "Lmicrogram/ui/sdui/SduiThemedColor;", "getColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "Lmicrogram/ui/sdui/SduiFont;", "getFont", "()Lmicrogram/ui/sdui/SduiFont;", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "()V", "Lmicrogram/ui/sdui/SduiBookCoverTextStyle;", "getStyle", "()Lmicrogram/ui/sdui/SduiBookCoverTextStyle;", "Ljava/lang/String;", "getText", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiBookCoverText extends SduiComponent {
    private final SduiTextAlignment alignment;
    private final SduiThemedColor color;
    private final SduiFont font;
    private final SduiComponentType sduiComponentType;
    private final SduiBookCoverTextStyle style;
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiTextAlignment.INSTANCE.serializer(), null, SduiFont.INSTANCE.serializer(), SduiComponentType.INSTANCE.serializer(), SduiBookCoverTextStyle.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiBookCoverText)) {
            return false;
        }
        SduiBookCoverText sduiBookCoverText = (SduiBookCoverText) other;
        return this.alignment == sduiBookCoverText.alignment && Intrinsics.areEqual(this.color, sduiBookCoverText.color) && this.font == sduiBookCoverText.font && this.sduiComponentType == sduiBookCoverText.sduiComponentType && this.style == sduiBookCoverText.style && Intrinsics.areEqual(this.text, sduiBookCoverText.text);
    }

    public int hashCode() {
        return (((((((((this.alignment.hashCode() * 31) + this.color.hashCode()) * 31) + this.font.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.style.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "SduiBookCoverText(alignment=" + this.alignment + ", color=" + this.color + ", font=" + this.font + ", sduiComponentType=" + this.sduiComponentType + ", style=" + this.style + ", text=" + this.text + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiBookCoverText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiBookCoverText;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiBookCoverText> serializer() {
            return SduiBookCoverText$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiBookCoverText(int i, SduiTextAlignment sduiTextAlignment, SduiThemedColor sduiThemedColor, SduiFont sduiFont, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiBookCoverTextStyle sduiBookCoverTextStyle, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (32 != (i & 32)) {
            PluginExceptions.throwMissingFieldException(i, 32, SduiBookCoverText$$serializer.INSTANCE.getDescriptor());
        }
        this.alignment = (i & 1) == 0 ? SduiTextAlignment.START : sduiTextAlignment;
        if ((i & 2) == 0) {
            SduiColor sduiColor = SduiColor.f7102FG;
            this.color = new SduiThemedColor(sduiColor, sduiColor);
        } else {
            this.color = sduiThemedColor;
        }
        if ((i & 4) == 0) {
            this.font = SduiFont.CAPSULE;
        } else {
            this.font = sduiFont;
        }
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.BOOK_COVER_TEXT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 16) == 0) {
            this.style = SduiBookCoverTextStyle.UNKNOWN;
        } else {
            this.style = sduiBookCoverTextStyle;
        }
        this.text = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiBookCoverText self, Encoding3 output, SerialDescriptor serialDesc) {
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
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.font != SduiFont.CAPSULE) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.font);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.BOOK_COVER_TEXT) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.style != SduiBookCoverTextStyle.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.style);
        }
        output.encodeStringElement(serialDesc, 5, self.text);
    }
}
