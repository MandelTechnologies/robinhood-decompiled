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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEB\u0083\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010,\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u00103R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010/R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b9\u0010,\u001a\u0004\b7\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010:\u0012\u0004\b=\u0010,\u001a\u0004\b;\u0010<R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010>\u0012\u0004\bA\u0010,\u001a\u0004\b?\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\bB\u0010!R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010-\u0012\u0004\bD\u0010,\u001a\u0004\bC\u0010/¨\u0006G"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiValuePropWithIcon;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "contentMarkdown", "Lmicrogram/ui/sdui/SduiThemedColor;", "contentTextColorOverride", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "iconColorOverride", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTextWithAction;", "supplementalAction", "Lmicrogram/ui/sdui/SduiTextStyle;", "textStyleOverride", "title", "titleTextColorOverride", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiIcon;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextWithAction;Lmicrogram/ui/sdui/SduiTextStyle;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiValuePropWithIcon;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContentMarkdown", "getContentMarkdown$annotations", "()V", "Lmicrogram/ui/sdui/SduiThemedColor;", "getContentTextColorOverride", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getContentTextColorOverride$annotations", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "getIconColorOverride", "getIconColorOverride$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTextWithAction;", "getSupplementalAction", "()Lmicrogram/ui/sdui/SduiTextWithAction;", "getSupplementalAction$annotations", "Lmicrogram/ui/sdui/SduiTextStyle;", "getTextStyleOverride", "()Lmicrogram/ui/sdui/SduiTextStyle;", "getTextStyleOverride$annotations", "getTitle", "getTitleTextColorOverride", "getTitleTextColorOverride$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiValuePropWithIcon extends SduiComponent {
    private final String contentMarkdown;
    private final SduiThemedColor contentTextColorOverride;
    private final SduiIcon icon;
    private final SduiThemedColor iconColorOverride;
    private final SduiComponentType sduiComponentType;
    private final SduiTextWithAction supplementalAction;
    private final SduiTextStyle textStyleOverride;
    private final String title;
    private final SduiThemedColor titleTextColorOverride;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, SduiIcon.INSTANCE.serializer(), null, SduiComponentType.INSTANCE.serializer(), null, SduiTextStyle.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiValuePropWithIcon)) {
            return false;
        }
        SduiValuePropWithIcon sduiValuePropWithIcon = (SduiValuePropWithIcon) other;
        return Intrinsics.areEqual(this.contentMarkdown, sduiValuePropWithIcon.contentMarkdown) && Intrinsics.areEqual(this.contentTextColorOverride, sduiValuePropWithIcon.contentTextColorOverride) && this.icon == sduiValuePropWithIcon.icon && Intrinsics.areEqual(this.iconColorOverride, sduiValuePropWithIcon.iconColorOverride) && this.sduiComponentType == sduiValuePropWithIcon.sduiComponentType && Intrinsics.areEqual(this.supplementalAction, sduiValuePropWithIcon.supplementalAction) && this.textStyleOverride == sduiValuePropWithIcon.textStyleOverride && Intrinsics.areEqual(this.title, sduiValuePropWithIcon.title) && Intrinsics.areEqual(this.titleTextColorOverride, sduiValuePropWithIcon.titleTextColorOverride);
    }

    public int hashCode() {
        int iHashCode = this.contentMarkdown.hashCode() * 31;
        SduiThemedColor sduiThemedColor = this.contentTextColorOverride;
        int iHashCode2 = (((iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31) + this.icon.hashCode()) * 31;
        SduiThemedColor sduiThemedColor2 = this.iconColorOverride;
        int iHashCode3 = (((iHashCode2 + (sduiThemedColor2 == null ? 0 : sduiThemedColor2.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiTextWithAction sduiTextWithAction = this.supplementalAction;
        int iHashCode4 = (iHashCode3 + (sduiTextWithAction == null ? 0 : sduiTextWithAction.hashCode())) * 31;
        SduiTextStyle sduiTextStyle = this.textStyleOverride;
        int iHashCode5 = (iHashCode4 + (sduiTextStyle == null ? 0 : sduiTextStyle.hashCode())) * 31;
        String str = this.title;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        SduiThemedColor sduiThemedColor3 = this.titleTextColorOverride;
        return iHashCode6 + (sduiThemedColor3 != null ? sduiThemedColor3.hashCode() : 0);
    }

    public String toString() {
        return "SduiValuePropWithIcon(contentMarkdown=" + this.contentMarkdown + ", contentTextColorOverride=" + this.contentTextColorOverride + ", icon=" + this.icon + ", iconColorOverride=" + this.iconColorOverride + ", sduiComponentType=" + this.sduiComponentType + ", supplementalAction=" + this.supplementalAction + ", textStyleOverride=" + this.textStyleOverride + ", title=" + this.title + ", titleTextColorOverride=" + this.titleTextColorOverride + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiValuePropWithIcon$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiValuePropWithIcon;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiValuePropWithIcon> serializer() {
            return SduiValuePropWithIcon$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiValuePropWithIcon(int i, @SerialName("content_markdown") String str, @SerialName("content_text_color_override") SduiThemedColor sduiThemedColor, SduiIcon sduiIcon, @SerialName("icon_color_override") SduiThemedColor sduiThemedColor2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("supplemental_action") SduiTextWithAction sduiTextWithAction, @SerialName("text_style_override") SduiTextStyle sduiTextStyle, String str2, @SerialName("title_text_color_override") SduiThemedColor sduiThemedColor3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (5 != (i & 5)) {
            PluginExceptions.throwMissingFieldException(i, 5, SduiValuePropWithIcon$$serializer.INSTANCE.getDescriptor());
        }
        this.contentMarkdown = str;
        if ((i & 2) == 0) {
            this.contentTextColorOverride = null;
        } else {
            this.contentTextColorOverride = sduiThemedColor;
        }
        this.icon = sduiIcon;
        if ((i & 8) == 0) {
            this.iconColorOverride = null;
        } else {
            this.iconColorOverride = sduiThemedColor2;
        }
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.VALUE_PROP_WITH_ICON;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 32) == 0) {
            this.supplementalAction = null;
        } else {
            this.supplementalAction = sduiTextWithAction;
        }
        if ((i & 64) == 0) {
            this.textStyleOverride = null;
        } else {
            this.textStyleOverride = sduiTextStyle;
        }
        if ((i & 128) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 256) == 0) {
            this.titleTextColorOverride = null;
        } else {
            this.titleTextColorOverride = sduiThemedColor3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiValuePropWithIcon self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.contentMarkdown);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.contentTextColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.contentTextColorOverride);
        }
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.icon);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.iconColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SduiThemedColor$$serializer.INSTANCE, self.iconColorOverride);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sduiComponentType != SduiComponentType.VALUE_PROP_WITH_ICON) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.supplementalAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, SduiTextWithAction$$serializer.INSTANCE, self.supplementalAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.textStyleOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, kSerializerArr[6], self.textStyleOverride);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.title);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.titleTextColorOverride == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, SduiThemedColor$$serializer.INSTANCE, self.titleTextColorOverride);
    }
}
