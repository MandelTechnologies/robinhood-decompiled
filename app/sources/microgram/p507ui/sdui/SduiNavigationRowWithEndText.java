package microgram.p507ui.sdui;

import com.plaid.internal.EnumC7081g;
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
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B\u0085\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b\b\u0010,R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010!R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010!R \u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010/\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010!R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b9\u0010.\u001a\u0004\b7\u00108R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010:\u0012\u0004\b=\u0010.\u001a\u0004\b;\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b>\u0010!R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b?\u0010!¨\u0006B"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNavigationRowWithEndText;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "", "isEnabled", "", "loggingIdentifier", "markdownSubtitle", "metadataText", "Lmicrogram/ui/sdui/SduiThemedColor;", "metadataTextColor", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "subtitle", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiComponentType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiNavigationRowWithEndText;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Z", "()Z", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "getMarkdownSubtitle", "getMarkdownSubtitle$annotations", "getMetadataText", "getMetadataText$annotations", "Lmicrogram/ui/sdui/SduiThemedColor;", "getMetadataTextColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getMetadataTextColor$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getSubtitle", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiNavigationRowWithEndText extends SduiComponent {
    private final SduiAction action;
    private final boolean isEnabled;
    private final String loggingIdentifier;
    private final String markdownSubtitle;
    private final String metadataText;
    private final SduiThemedColor metadataTextColor;
    private final SduiComponentType sduiComponentType;
    private final String subtitle;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiNavigationRowWithEndText)) {
            return false;
        }
        SduiNavigationRowWithEndText sduiNavigationRowWithEndText = (SduiNavigationRowWithEndText) other;
        return Intrinsics.areEqual(this.action, sduiNavigationRowWithEndText.action) && this.isEnabled == sduiNavigationRowWithEndText.isEnabled && Intrinsics.areEqual(this.loggingIdentifier, sduiNavigationRowWithEndText.loggingIdentifier) && Intrinsics.areEqual(this.markdownSubtitle, sduiNavigationRowWithEndText.markdownSubtitle) && Intrinsics.areEqual(this.metadataText, sduiNavigationRowWithEndText.metadataText) && Intrinsics.areEqual(this.metadataTextColor, sduiNavigationRowWithEndText.metadataTextColor) && this.sduiComponentType == sduiNavigationRowWithEndText.sduiComponentType && Intrinsics.areEqual(this.subtitle, sduiNavigationRowWithEndText.subtitle) && Intrinsics.areEqual(this.title, sduiNavigationRowWithEndText.title);
    }

    public int hashCode() {
        SduiAction sduiAction = this.action;
        int iHashCode = (((sduiAction == null ? 0 : sduiAction.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        String str = this.loggingIdentifier;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.markdownSubtitle;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.metadataText.hashCode()) * 31;
        SduiThemedColor sduiThemedColor = this.metadataTextColor;
        int iHashCode4 = (((iHashCode3 + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        String str3 = this.subtitle;
        return ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiNavigationRowWithEndText(action=" + this.action + ", isEnabled=" + this.isEnabled + ", loggingIdentifier=" + this.loggingIdentifier + ", markdownSubtitle=" + this.markdownSubtitle + ", metadataText=" + this.metadataText + ", metadataTextColor=" + this.metadataTextColor + ", sduiComponentType=" + this.sduiComponentType + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNavigationRowWithEndText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiNavigationRowWithEndText;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiNavigationRowWithEndText> serializer() {
            return SduiNavigationRowWithEndText$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiNavigationRowWithEndText(int i, SduiAction sduiAction, @SerialName("is_enabled") boolean z, @SerialName("logging_identifier") String str, @SerialName("markdown_subtitle") String str2, @SerialName("metadata_text") String str3, @SerialName("metadata_text_color") SduiThemedColor sduiThemedColor, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (272 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE)) {
            PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, SduiNavigationRowWithEndText$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = sduiAction;
        }
        if ((i & 2) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z;
        }
        if ((i & 4) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str;
        }
        if ((i & 8) == 0) {
            this.markdownSubtitle = null;
        } else {
            this.markdownSubtitle = str2;
        }
        this.metadataText = str3;
        if ((i & 32) == 0) {
            this.metadataTextColor = null;
        } else {
            this.metadataTextColor = sduiThemedColor;
        }
        if ((i & 64) == 0) {
            this.sduiComponentType = SduiComponentType.NAVIGATION_ROW_WITH_END_TEXT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 128) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str4;
        }
        this.title = str5;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiNavigationRowWithEndText self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 1, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.markdownSubtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.markdownSubtitle);
        }
        output.encodeStringElement(serialDesc, 4, self.metadataText);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.metadataTextColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, SduiThemedColor$$serializer.INSTANCE, self.metadataTextColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.sduiComponentType != SduiComponentType.NAVIGATION_ROW_WITH_END_TEXT) {
            output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.subtitle);
        }
        output.encodeStringElement(serialDesc, 8, self.title);
    }
}
