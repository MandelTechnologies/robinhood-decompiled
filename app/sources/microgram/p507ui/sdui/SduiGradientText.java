package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBO\b\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001d¨\u00067"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiGradientText;", "Lmicrogram/ui/sdui/SduiComponent;", "Lmicrogram/ui/sdui/SduiTextAlignment;", "alignment", "Lmicrogram/ui/sdui/SduiGradient;", "gradient", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTextStyle;", ResourceTypes.STYLE, "", "text", "<init>", "(Lmicrogram/ui/sdui/SduiTextAlignment;Lmicrogram/ui/sdui/SduiGradient;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextStyle;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiTextAlignment;Lmicrogram/ui/sdui/SduiGradient;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextStyle;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiGradientText;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiTextAlignment;", "getAlignment", "()Lmicrogram/ui/sdui/SduiTextAlignment;", "Lmicrogram/ui/sdui/SduiGradient;", "getGradient", "()Lmicrogram/ui/sdui/SduiGradient;", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "()V", "Lmicrogram/ui/sdui/SduiTextStyle;", "getStyle", "()Lmicrogram/ui/sdui/SduiTextStyle;", "Ljava/lang/String;", "getText", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiGradientText extends SduiComponent {
    private final SduiTextAlignment alignment;
    private final SduiGradient gradient;
    private final SduiComponentType sduiComponentType;
    private final SduiTextStyle style;
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiTextAlignment.INSTANCE.serializer(), null, SduiComponentType.INSTANCE.serializer(), SduiTextStyle.INSTANCE.serializer(), null};

    public SduiGradientText() {
        this((SduiTextAlignment) null, (SduiGradient) null, (SduiComponentType) null, (SduiTextStyle) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiGradientText)) {
            return false;
        }
        SduiGradientText sduiGradientText = (SduiGradientText) other;
        return this.alignment == sduiGradientText.alignment && Intrinsics.areEqual(this.gradient, sduiGradientText.gradient) && this.sduiComponentType == sduiGradientText.sduiComponentType && this.style == sduiGradientText.style && Intrinsics.areEqual(this.text, sduiGradientText.text);
    }

    public int hashCode() {
        return (((((((this.alignment.hashCode() * 31) + this.gradient.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.style.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "SduiGradientText(alignment=" + this.alignment + ", gradient=" + this.gradient + ", sduiComponentType=" + this.sduiComponentType + ", style=" + this.style + ", text=" + this.text + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiGradientText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiGradientText;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiGradientText> serializer() {
            return SduiGradientText$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiGradientText(int i, SduiTextAlignment sduiTextAlignment, SduiGradient sduiGradient, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiTextStyle sduiTextStyle, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.alignment = (i & 1) == 0 ? SduiTextAlignment.START : sduiTextAlignment;
        if ((i & 2) == 0) {
            this.gradient = new SduiGradient(CollectionsKt.emptyList(), SduiGradientDirection.HORIZONTAL);
        } else {
            this.gradient = sduiGradient;
        }
        if ((i & 4) == 0) {
            this.sduiComponentType = SduiComponentType.GRADIENT_TEXT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 8) == 0) {
            this.style = SduiTextStyle.TEXT_MEDIUM;
        } else {
            this.style = sduiTextStyle;
        }
        if ((i & 16) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiGradientText self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.alignment != SduiTextAlignment.START) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.alignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.gradient, new SduiGradient(CollectionsKt.emptyList(), SduiGradientDirection.HORIZONTAL))) {
            output.encodeSerializableElement(serialDesc, 1, SduiGradient$$serializer.INSTANCE, self.gradient);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.sduiComponentType != SduiComponentType.GRADIENT_TEXT) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.style != SduiTextStyle.TEXT_MEDIUM) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.style);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && Intrinsics.areEqual(self.text, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 4, self.text);
    }

    public /* synthetic */ SduiGradientText(SduiTextAlignment sduiTextAlignment, SduiGradient sduiGradient, SduiComponentType sduiComponentType, SduiTextStyle sduiTextStyle, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SduiTextAlignment.START : sduiTextAlignment, (i & 2) != 0 ? new SduiGradient(CollectionsKt.emptyList(), SduiGradientDirection.HORIZONTAL) : sduiGradient, (i & 4) != 0 ? SduiComponentType.GRADIENT_TEXT : sduiComponentType, (i & 8) != 0 ? SduiTextStyle.TEXT_MEDIUM : sduiTextStyle, (i & 16) != 0 ? "" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SduiGradientText(SduiTextAlignment alignment, SduiGradient gradient, SduiComponentType sduiComponentType, SduiTextStyle style, String text) {
        super(null);
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        Intrinsics.checkNotNullParameter(sduiComponentType, "sduiComponentType");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(text, "text");
        this.alignment = alignment;
        this.gradient = gradient;
        this.sduiComponentType = sduiComponentType;
        this.style = style;
        this.text = text;
    }
}
