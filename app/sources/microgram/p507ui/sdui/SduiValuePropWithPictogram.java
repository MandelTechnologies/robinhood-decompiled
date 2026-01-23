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
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B_\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b3\u0010(\u001a\u0004\b1\u00102R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00104\u0012\u0004\b7\u0010(\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b8\u0010\u001d¨\u0006;"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiValuePropWithPictogram;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "contentMarkdown", "Lmicrogram/ui/sdui/SduiPictogram;", "pictogram", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTextWithAction;", "supplementalAction", "Lmicrogram/ui/sdui/SduiTextStyle;", "textStyleOverride", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiPictogram;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextWithAction;Lmicrogram/ui/sdui/SduiTextStyle;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiValuePropWithPictogram;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContentMarkdown", "getContentMarkdown$annotations", "()V", "Lmicrogram/ui/sdui/SduiPictogram;", "getPictogram", "()Lmicrogram/ui/sdui/SduiPictogram;", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTextWithAction;", "getSupplementalAction", "()Lmicrogram/ui/sdui/SduiTextWithAction;", "getSupplementalAction$annotations", "Lmicrogram/ui/sdui/SduiTextStyle;", "getTextStyleOverride", "()Lmicrogram/ui/sdui/SduiTextStyle;", "getTextStyleOverride$annotations", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiValuePropWithPictogram extends SduiComponent {
    private final String contentMarkdown;
    private final SduiPictogram pictogram;
    private final SduiComponentType sduiComponentType;
    private final SduiTextWithAction supplementalAction;
    private final SduiTextStyle textStyleOverride;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiPictogram.INSTANCE.serializer(), SduiComponentType.INSTANCE.serializer(), null, SduiTextStyle.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiValuePropWithPictogram)) {
            return false;
        }
        SduiValuePropWithPictogram sduiValuePropWithPictogram = (SduiValuePropWithPictogram) other;
        return Intrinsics.areEqual(this.contentMarkdown, sduiValuePropWithPictogram.contentMarkdown) && this.pictogram == sduiValuePropWithPictogram.pictogram && this.sduiComponentType == sduiValuePropWithPictogram.sduiComponentType && Intrinsics.areEqual(this.supplementalAction, sduiValuePropWithPictogram.supplementalAction) && this.textStyleOverride == sduiValuePropWithPictogram.textStyleOverride && Intrinsics.areEqual(this.title, sduiValuePropWithPictogram.title);
    }

    public int hashCode() {
        int iHashCode = ((((this.contentMarkdown.hashCode() * 31) + this.pictogram.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiTextWithAction sduiTextWithAction = this.supplementalAction;
        int iHashCode2 = (iHashCode + (sduiTextWithAction == null ? 0 : sduiTextWithAction.hashCode())) * 31;
        SduiTextStyle sduiTextStyle = this.textStyleOverride;
        int iHashCode3 = (iHashCode2 + (sduiTextStyle == null ? 0 : sduiTextStyle.hashCode())) * 31;
        String str = this.title;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SduiValuePropWithPictogram(contentMarkdown=" + this.contentMarkdown + ", pictogram=" + this.pictogram + ", sduiComponentType=" + this.sduiComponentType + ", supplementalAction=" + this.supplementalAction + ", textStyleOverride=" + this.textStyleOverride + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiValuePropWithPictogram$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiValuePropWithPictogram;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiValuePropWithPictogram> serializer() {
            return SduiValuePropWithPictogram$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiValuePropWithPictogram(int i, @SerialName("content_markdown") String str, SduiPictogram sduiPictogram, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("supplemental_action") SduiTextWithAction sduiTextWithAction, @SerialName("text_style_override") SduiTextStyle sduiTextStyle, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, SduiValuePropWithPictogram$$serializer.INSTANCE.getDescriptor());
        }
        this.contentMarkdown = str;
        this.pictogram = sduiPictogram;
        if ((i & 4) == 0) {
            this.sduiComponentType = SduiComponentType.VALUE_PROP_WITH_PICTOGRAM;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 8) == 0) {
            this.supplementalAction = null;
        } else {
            this.supplementalAction = sduiTextWithAction;
        }
        if ((i & 16) == 0) {
            this.textStyleOverride = null;
        } else {
            this.textStyleOverride = sduiTextStyle;
        }
        if ((i & 32) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiValuePropWithPictogram self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.contentMarkdown);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.pictogram);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.sduiComponentType != SduiComponentType.VALUE_PROP_WITH_PICTOGRAM) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.supplementalAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SduiTextWithAction$$serializer.INSTANCE, self.supplementalAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.textStyleOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kSerializerArr[4], self.textStyleOverride);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.title == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.title);
    }
}
