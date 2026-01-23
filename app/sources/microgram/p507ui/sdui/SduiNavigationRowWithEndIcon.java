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
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:Bm\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b\n\u0010/R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00101\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001fR \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00104\u0012\u0004\b7\u0010-\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b8\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b9\u0010\u001f¨\u0006<"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNavigationRowWithEndIcon;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiIcon;", "ctaIcon", "", "isEnabled", "", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "subtitle", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiIcon;ZLjava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiNavigationRowWithEndIcon;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiIcon;", "getCtaIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "getCtaIcon$annotations", "()V", "Z", "()Z", "isEnabled$annotations", "Ljava/lang/String;", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getSubtitle", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiNavigationRowWithEndIcon extends SduiComponent {
    private final SduiAction action;
    private final SduiIcon ctaIcon;
    private final boolean isEnabled;
    private final String loggingIdentifier;
    private final SduiComponentType sduiComponentType;
    private final String subtitle;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiIcon.INSTANCE.serializer(), null, null, SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiNavigationRowWithEndIcon)) {
            return false;
        }
        SduiNavigationRowWithEndIcon sduiNavigationRowWithEndIcon = (SduiNavigationRowWithEndIcon) other;
        return Intrinsics.areEqual(this.action, sduiNavigationRowWithEndIcon.action) && this.ctaIcon == sduiNavigationRowWithEndIcon.ctaIcon && this.isEnabled == sduiNavigationRowWithEndIcon.isEnabled && Intrinsics.areEqual(this.loggingIdentifier, sduiNavigationRowWithEndIcon.loggingIdentifier) && this.sduiComponentType == sduiNavigationRowWithEndIcon.sduiComponentType && Intrinsics.areEqual(this.subtitle, sduiNavigationRowWithEndIcon.subtitle) && Intrinsics.areEqual(this.title, sduiNavigationRowWithEndIcon.title);
    }

    public int hashCode() {
        SduiAction sduiAction = this.action;
        int iHashCode = (((((sduiAction == null ? 0 : sduiAction.hashCode()) * 31) + this.ctaIcon.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        String str = this.loggingIdentifier;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        String str2 = this.subtitle;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiNavigationRowWithEndIcon(action=" + this.action + ", ctaIcon=" + this.ctaIcon + ", isEnabled=" + this.isEnabled + ", loggingIdentifier=" + this.loggingIdentifier + ", sduiComponentType=" + this.sduiComponentType + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNavigationRowWithEndIcon$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiNavigationRowWithEndIcon;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiNavigationRowWithEndIcon> serializer() {
            return SduiNavigationRowWithEndIcon$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiNavigationRowWithEndIcon(int i, SduiAction sduiAction, @SerialName("cta_icon") SduiIcon sduiIcon, @SerialName("is_enabled") boolean z, @SerialName("logging_identifier") String str, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (66 != (i & 66)) {
            PluginExceptions.throwMissingFieldException(i, 66, SduiNavigationRowWithEndIcon$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = sduiAction;
        }
        this.ctaIcon = sduiIcon;
        if ((i & 4) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z;
        }
        if ((i & 8) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str;
        }
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.NAVIGATION_ROW_WITH_END_ICON;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 32) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        this.title = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiNavigationRowWithEndIcon self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        }
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.ctaIcon);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 2, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sduiComponentType != SduiComponentType.NAVIGATION_ROW_WITH_END_ICON) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.subtitle);
        }
        output.encodeStringElement(serialDesc, 6, self.title);
    }
}
