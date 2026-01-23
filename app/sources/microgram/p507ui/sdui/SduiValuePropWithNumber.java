package microgram.p507ui.sdui;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bi\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b4\u0010)\u001a\u0004\b2\u00103R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b8\u0010)\u001a\u0004\b6\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b9\u0010\u001eR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010*\u0012\u0004\b;\u0010)\u001a\u0004\b:\u0010,¨\u0006>"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiValuePropWithNumber;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "contentMarkdown", "Lmicrogram/ui/sdui/SduiThemedColor;", "contentTextColorOverride", "", InquiryField.FloatField.TYPE2, "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTextWithAction;", "supplementalAction", "title", "titleTextColorOverride", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;JLmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextWithAction;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiValuePropWithNumber;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContentMarkdown", "getContentMarkdown$annotations", "()V", "Lmicrogram/ui/sdui/SduiThemedColor;", "getContentTextColorOverride", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getContentTextColorOverride$annotations", "J", "getNumber", "()J", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTextWithAction;", "getSupplementalAction", "()Lmicrogram/ui/sdui/SduiTextWithAction;", "getSupplementalAction$annotations", "getTitle", "getTitleTextColorOverride", "getTitleTextColorOverride$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiValuePropWithNumber extends SduiComponent {
    private final String contentMarkdown;
    private final SduiThemedColor contentTextColorOverride;
    private final long number;
    private final SduiComponentType sduiComponentType;
    private final SduiTextWithAction supplementalAction;
    private final String title;
    private final SduiThemedColor titleTextColorOverride;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiComponentType.INSTANCE.serializer(), null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiValuePropWithNumber)) {
            return false;
        }
        SduiValuePropWithNumber sduiValuePropWithNumber = (SduiValuePropWithNumber) other;
        return Intrinsics.areEqual(this.contentMarkdown, sduiValuePropWithNumber.contentMarkdown) && Intrinsics.areEqual(this.contentTextColorOverride, sduiValuePropWithNumber.contentTextColorOverride) && this.number == sduiValuePropWithNumber.number && this.sduiComponentType == sduiValuePropWithNumber.sduiComponentType && Intrinsics.areEqual(this.supplementalAction, sduiValuePropWithNumber.supplementalAction) && Intrinsics.areEqual(this.title, sduiValuePropWithNumber.title) && Intrinsics.areEqual(this.titleTextColorOverride, sduiValuePropWithNumber.titleTextColorOverride);
    }

    public int hashCode() {
        int iHashCode = this.contentMarkdown.hashCode() * 31;
        SduiThemedColor sduiThemedColor = this.contentTextColorOverride;
        int iHashCode2 = (((((iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31) + Long.hashCode(this.number)) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiTextWithAction sduiTextWithAction = this.supplementalAction;
        int iHashCode3 = (iHashCode2 + (sduiTextWithAction == null ? 0 : sduiTextWithAction.hashCode())) * 31;
        String str = this.title;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        SduiThemedColor sduiThemedColor2 = this.titleTextColorOverride;
        return iHashCode4 + (sduiThemedColor2 != null ? sduiThemedColor2.hashCode() : 0);
    }

    public String toString() {
        return "SduiValuePropWithNumber(contentMarkdown=" + this.contentMarkdown + ", contentTextColorOverride=" + this.contentTextColorOverride + ", number=" + this.number + ", sduiComponentType=" + this.sduiComponentType + ", supplementalAction=" + this.supplementalAction + ", title=" + this.title + ", titleTextColorOverride=" + this.titleTextColorOverride + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiValuePropWithNumber$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiValuePropWithNumber;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiValuePropWithNumber> serializer() {
            return SduiValuePropWithNumber$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiValuePropWithNumber(int i, @SerialName("content_markdown") String str, @SerialName("content_text_color_override") SduiThemedColor sduiThemedColor, long j, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("supplemental_action") SduiTextWithAction sduiTextWithAction, String str2, @SerialName("title_text_color_override") SduiThemedColor sduiThemedColor2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (5 != (i & 5)) {
            PluginExceptions.throwMissingFieldException(i, 5, SduiValuePropWithNumber$$serializer.INSTANCE.getDescriptor());
        }
        this.contentMarkdown = str;
        if ((i & 2) == 0) {
            this.contentTextColorOverride = null;
        } else {
            this.contentTextColorOverride = sduiThemedColor;
        }
        this.number = j;
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.VALUE_PROP_WITH_NUMBER;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 16) == 0) {
            this.supplementalAction = null;
        } else {
            this.supplementalAction = sduiTextWithAction;
        }
        if ((i & 32) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 64) == 0) {
            this.titleTextColorOverride = null;
        } else {
            this.titleTextColorOverride = sduiThemedColor2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiValuePropWithNumber self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.contentMarkdown);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.contentTextColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.contentTextColorOverride);
        }
        output.encodeLongElement(serialDesc, 2, self.number);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.VALUE_PROP_WITH_NUMBER) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.supplementalAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiTextWithAction$$serializer.INSTANCE, self.supplementalAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.title);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.titleTextColorOverride == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, SduiThemedColor$$serializer.INSTANCE, self.titleTextColorOverride);
    }
}
