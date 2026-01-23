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
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BS\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b3\u0010(\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001c¨\u00068"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiValuePropWithPictogramAndRichText;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiRichText;", "contentRichText", "Lmicrogram/ui/sdui/SduiPictogram;", "pictogram", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTextWithAction;", "supplementalAction", "", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiRichText;Lmicrogram/ui/sdui/SduiPictogram;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextWithAction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiValuePropWithPictogramAndRichText;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiRichText;", "getContentRichText", "()Lmicrogram/ui/sdui/SduiRichText;", "getContentRichText$annotations", "()V", "Lmicrogram/ui/sdui/SduiPictogram;", "getPictogram", "()Lmicrogram/ui/sdui/SduiPictogram;", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTextWithAction;", "getSupplementalAction", "()Lmicrogram/ui/sdui/SduiTextWithAction;", "getSupplementalAction$annotations", "Ljava/lang/String;", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiValuePropWithPictogramAndRichText extends SduiComponent {
    private final SduiRichText contentRichText;
    private final SduiPictogram pictogram;
    private final SduiComponentType sduiComponentType;
    private final SduiTextWithAction supplementalAction;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiPictogram.INSTANCE.serializer(), SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiValuePropWithPictogramAndRichText)) {
            return false;
        }
        SduiValuePropWithPictogramAndRichText sduiValuePropWithPictogramAndRichText = (SduiValuePropWithPictogramAndRichText) other;
        return Intrinsics.areEqual(this.contentRichText, sduiValuePropWithPictogramAndRichText.contentRichText) && this.pictogram == sduiValuePropWithPictogramAndRichText.pictogram && this.sduiComponentType == sduiValuePropWithPictogramAndRichText.sduiComponentType && Intrinsics.areEqual(this.supplementalAction, sduiValuePropWithPictogramAndRichText.supplementalAction) && Intrinsics.areEqual(this.title, sduiValuePropWithPictogramAndRichText.title);
    }

    public int hashCode() {
        int iHashCode = ((((this.contentRichText.hashCode() * 31) + this.pictogram.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiTextWithAction sduiTextWithAction = this.supplementalAction;
        int iHashCode2 = (iHashCode + (sduiTextWithAction == null ? 0 : sduiTextWithAction.hashCode())) * 31;
        String str = this.title;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SduiValuePropWithPictogramAndRichText(contentRichText=" + this.contentRichText + ", pictogram=" + this.pictogram + ", sduiComponentType=" + this.sduiComponentType + ", supplementalAction=" + this.supplementalAction + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiValuePropWithPictogramAndRichText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiValuePropWithPictogramAndRichText;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiValuePropWithPictogramAndRichText> serializer() {
            return SduiValuePropWithPictogramAndRichText$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiValuePropWithPictogramAndRichText(int i, @SerialName("content_rich_text") SduiRichText sduiRichText, SduiPictogram sduiPictogram, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("supplemental_action") SduiTextWithAction sduiTextWithAction, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, SduiValuePropWithPictogramAndRichText$$serializer.INSTANCE.getDescriptor());
        }
        this.contentRichText = sduiRichText;
        this.pictogram = sduiPictogram;
        if ((i & 4) == 0) {
            this.sduiComponentType = SduiComponentType.VALUE_PROP_WITH_PICTOGRAM_AND_RICH_TEXT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 8) == 0) {
            this.supplementalAction = null;
        } else {
            this.supplementalAction = sduiTextWithAction;
        }
        if ((i & 16) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiValuePropWithPictogramAndRichText self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiRichText$$serializer.INSTANCE, self.contentRichText);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.pictogram);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.sduiComponentType != SduiComponentType.VALUE_PROP_WITH_PICTOGRAM_AND_RICH_TEXT) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.supplementalAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SduiTextWithAction$$serializer.INSTANCE, self.supplementalAction);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.title == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.title);
    }
}
