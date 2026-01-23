package microgram.p507ui.sdui;

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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFB\u0083\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÁ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010#R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b8\u00101\u001a\u0004\b7\u0010#R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\b<\u00101\u001a\u0004\b:\u0010;R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010=\u0012\u0004\b@\u00101\u001a\u0004\b>\u0010?R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010-\u0012\u0004\bB\u00101\u001a\u0004\bA\u0010/R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010E¨\u0006H"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInfoTag;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColorOverride", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "", AnnotatedPrivateKey.LABEL, "loggingIdentifier", "", "prefersIconOnRight", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "textColorOverride", "Lmicrogram/ui/sdui/SduiInfoTagType;", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiIcon;Ljava/lang/String;Ljava/lang/String;ZLmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiInfoTagType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiInfoTag;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColorOverride", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColorOverride$annotations", "()V", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "Ljava/lang/String;", "getLabel", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Z", "getPrefersIconOnRight", "()Z", "getPrefersIconOnRight$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getTextColorOverride", "getTextColorOverride$annotations", "Lmicrogram/ui/sdui/SduiInfoTagType;", "getType", "()Lmicrogram/ui/sdui/SduiInfoTagType;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiInfoTag extends SduiComponent {
    private final SduiAction action;
    private final SduiThemedColor backgroundColorOverride;
    private final SduiIcon icon;
    private final String label;
    private final String loggingIdentifier;
    private final boolean prefersIconOnRight;
    private final SduiComponentType sduiComponentType;
    private final SduiThemedColor textColorOverride;
    private final SduiInfoTagType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, SduiIcon.INSTANCE.serializer(), null, null, null, SduiComponentType.INSTANCE.serializer(), null, SduiInfoTagType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInfoTag)) {
            return false;
        }
        SduiInfoTag sduiInfoTag = (SduiInfoTag) other;
        return Intrinsics.areEqual(this.action, sduiInfoTag.action) && Intrinsics.areEqual(this.backgroundColorOverride, sduiInfoTag.backgroundColorOverride) && this.icon == sduiInfoTag.icon && Intrinsics.areEqual(this.label, sduiInfoTag.label) && Intrinsics.areEqual(this.loggingIdentifier, sduiInfoTag.loggingIdentifier) && this.prefersIconOnRight == sduiInfoTag.prefersIconOnRight && this.sduiComponentType == sduiInfoTag.sduiComponentType && Intrinsics.areEqual(this.textColorOverride, sduiInfoTag.textColorOverride) && this.type == sduiInfoTag.type;
    }

    public int hashCode() {
        SduiAction sduiAction = this.action;
        int iHashCode = (sduiAction == null ? 0 : sduiAction.hashCode()) * 31;
        SduiThemedColor sduiThemedColor = this.backgroundColorOverride;
        int iHashCode2 = (iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31;
        SduiIcon sduiIcon = this.icon;
        int iHashCode3 = (((((((((iHashCode2 + (sduiIcon == null ? 0 : sduiIcon.hashCode())) * 31) + this.label.hashCode()) * 31) + this.loggingIdentifier.hashCode()) * 31) + Boolean.hashCode(this.prefersIconOnRight)) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiThemedColor sduiThemedColor2 = this.textColorOverride;
        return ((iHashCode3 + (sduiThemedColor2 != null ? sduiThemedColor2.hashCode() : 0)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SduiInfoTag(action=" + this.action + ", backgroundColorOverride=" + this.backgroundColorOverride + ", icon=" + this.icon + ", label=" + this.label + ", loggingIdentifier=" + this.loggingIdentifier + ", prefersIconOnRight=" + this.prefersIconOnRight + ", sduiComponentType=" + this.sduiComponentType + ", textColorOverride=" + this.textColorOverride + ", type=" + this.type + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInfoTag$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiInfoTag;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiInfoTag> serializer() {
            return SduiInfoTag$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiInfoTag(int i, SduiAction sduiAction, @SerialName("background_color_override") SduiThemedColor sduiThemedColor, SduiIcon sduiIcon, String str, @SerialName("logging_identifier") String str2, @SerialName("prefers_icon_on_right") boolean z, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("text_color_override") SduiThemedColor sduiThemedColor2, SduiInfoTagType sduiInfoTagType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (280 != (i & 280)) {
            PluginExceptions.throwMissingFieldException(i, 280, SduiInfoTag$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = sduiAction;
        }
        if ((i & 2) == 0) {
            this.backgroundColorOverride = null;
        } else {
            this.backgroundColorOverride = sduiThemedColor;
        }
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = sduiIcon;
        }
        this.label = str;
        this.loggingIdentifier = str2;
        if ((i & 32) == 0) {
            this.prefersIconOnRight = false;
        } else {
            this.prefersIconOnRight = z;
        }
        if ((i & 64) == 0) {
            this.sduiComponentType = SduiComponentType.INFO_TAG;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 128) == 0) {
            this.textColorOverride = null;
        } else {
            this.textColorOverride = sduiThemedColor2;
        }
        this.type = sduiInfoTagType;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiInfoTag self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.backgroundColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.backgroundColorOverride);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.icon);
        }
        output.encodeStringElement(serialDesc, 3, self.label);
        output.encodeStringElement(serialDesc, 4, self.loggingIdentifier);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.prefersIconOnRight) {
            output.encodeBooleanElement(serialDesc, 5, self.prefersIconOnRight);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.sduiComponentType != SduiComponentType.INFO_TAG) {
            output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.textColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, SduiThemedColor$$serializer.INSTANCE, self.textColorOverride);
        }
        output.encodeSerializableElement(serialDesc, 8, kSerializerArr[8], self.type);
    }
}
