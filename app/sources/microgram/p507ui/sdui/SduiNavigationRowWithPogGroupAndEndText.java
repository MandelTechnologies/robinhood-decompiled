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
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCB\u0085\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÁ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b\b\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\"R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\b6\u0010/\u001a\u0004\b4\u00105R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00103\u0012\u0004\b8\u0010/\u001a\u0004\b7\u00105R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\b<\u0010/\u001a\u0004\b:\u0010;R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010=\u0012\u0004\b@\u0010/\u001a\u0004\b>\u0010?R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\bA\u00105R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\bB\u00105¨\u0006E"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNavigationRowWithPogGroupAndEndText;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "", "isEnabled", "", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiRichText;", "metadataSubtitle", "metadataTitle", "Lmicrogram/ui/sdui/SduiPogGroup;", "pogGroup", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "subtitle", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;ZLjava/lang/String;Lmicrogram/ui/sdui/SduiRichText;Lmicrogram/ui/sdui/SduiRichText;Lmicrogram/ui/sdui/SduiPogGroup;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiRichText;Lmicrogram/ui/sdui/SduiRichText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiNavigationRowWithPogGroupAndEndText;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Z", "()Z", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiRichText;", "getMetadataSubtitle", "()Lmicrogram/ui/sdui/SduiRichText;", "getMetadataSubtitle$annotations", "getMetadataTitle", "getMetadataTitle$annotations", "Lmicrogram/ui/sdui/SduiPogGroup;", "getPogGroup", "()Lmicrogram/ui/sdui/SduiPogGroup;", "getPogGroup$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getSubtitle", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiNavigationRowWithPogGroupAndEndText extends SduiComponent {
    private final SduiAction action;
    private final boolean isEnabled;
    private final String loggingIdentifier;
    private final SduiRichText metadataSubtitle;
    private final SduiRichText metadataTitle;
    private final SduiPogGroup pogGroup;
    private final SduiComponentType sduiComponentType;
    private final SduiRichText subtitle;
    private final SduiRichText title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiNavigationRowWithPogGroupAndEndText)) {
            return false;
        }
        SduiNavigationRowWithPogGroupAndEndText sduiNavigationRowWithPogGroupAndEndText = (SduiNavigationRowWithPogGroupAndEndText) other;
        return Intrinsics.areEqual(this.action, sduiNavigationRowWithPogGroupAndEndText.action) && this.isEnabled == sduiNavigationRowWithPogGroupAndEndText.isEnabled && Intrinsics.areEqual(this.loggingIdentifier, sduiNavigationRowWithPogGroupAndEndText.loggingIdentifier) && Intrinsics.areEqual(this.metadataSubtitle, sduiNavigationRowWithPogGroupAndEndText.metadataSubtitle) && Intrinsics.areEqual(this.metadataTitle, sduiNavigationRowWithPogGroupAndEndText.metadataTitle) && Intrinsics.areEqual(this.pogGroup, sduiNavigationRowWithPogGroupAndEndText.pogGroup) && this.sduiComponentType == sduiNavigationRowWithPogGroupAndEndText.sduiComponentType && Intrinsics.areEqual(this.subtitle, sduiNavigationRowWithPogGroupAndEndText.subtitle) && Intrinsics.areEqual(this.title, sduiNavigationRowWithPogGroupAndEndText.title);
    }

    public int hashCode() {
        SduiAction sduiAction = this.action;
        int iHashCode = (((sduiAction == null ? 0 : sduiAction.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        String str = this.loggingIdentifier;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SduiRichText sduiRichText = this.metadataSubtitle;
        int iHashCode3 = (iHashCode2 + (sduiRichText == null ? 0 : sduiRichText.hashCode())) * 31;
        SduiRichText sduiRichText2 = this.metadataTitle;
        int iHashCode4 = (iHashCode3 + (sduiRichText2 == null ? 0 : sduiRichText2.hashCode())) * 31;
        SduiPogGroup sduiPogGroup = this.pogGroup;
        int iHashCode5 = (((iHashCode4 + (sduiPogGroup == null ? 0 : sduiPogGroup.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiRichText sduiRichText3 = this.subtitle;
        return ((iHashCode5 + (sduiRichText3 != null ? sduiRichText3.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiNavigationRowWithPogGroupAndEndText(action=" + this.action + ", isEnabled=" + this.isEnabled + ", loggingIdentifier=" + this.loggingIdentifier + ", metadataSubtitle=" + this.metadataSubtitle + ", metadataTitle=" + this.metadataTitle + ", pogGroup=" + this.pogGroup + ", sduiComponentType=" + this.sduiComponentType + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNavigationRowWithPogGroupAndEndText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiNavigationRowWithPogGroupAndEndText;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiNavigationRowWithPogGroupAndEndText> serializer() {
            return SduiNavigationRowWithPogGroupAndEndText$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiNavigationRowWithPogGroupAndEndText(int i, SduiAction sduiAction, @SerialName("is_enabled") boolean z, @SerialName("logging_identifier") String str, @SerialName("metadata_subtitle") SduiRichText sduiRichText, @SerialName("metadata_title") SduiRichText sduiRichText2, @SerialName("pog_group") SduiPogGroup sduiPogGroup, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiRichText sduiRichText3, SduiRichText sduiRichText4, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (256 != (i & 256)) {
            PluginExceptions.throwMissingFieldException(i, 256, SduiNavigationRowWithPogGroupAndEndText$$serializer.INSTANCE.getDescriptor());
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
            this.metadataSubtitle = null;
        } else {
            this.metadataSubtitle = sduiRichText;
        }
        if ((i & 16) == 0) {
            this.metadataTitle = null;
        } else {
            this.metadataTitle = sduiRichText2;
        }
        if ((i & 32) == 0) {
            this.pogGroup = null;
        } else {
            this.pogGroup = sduiPogGroup;
        }
        if ((i & 64) == 0) {
            this.sduiComponentType = SduiComponentType.NAVIGATION_ROW_WITH_POG_GROUP_AND_END_TEXT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 128) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = sduiRichText3;
        }
        this.title = sduiRichText4;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiNavigationRowWithPogGroupAndEndText self, Encoding3 output, SerialDescriptor serialDesc) {
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
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.metadataSubtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SduiRichText$$serializer.INSTANCE, self.metadataSubtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.metadataTitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiRichText$$serializer.INSTANCE, self.metadataTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.pogGroup != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, SduiPogGroup$$serializer.INSTANCE, self.pogGroup);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.sduiComponentType != SduiComponentType.NAVIGATION_ROW_WITH_POG_GROUP_AND_END_TEXT) {
            output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, SduiRichText$$serializer.INSTANCE, self.subtitle);
        }
        output.encodeSerializableElement(serialDesc, 8, SduiRichText$$serializer.INSTANCE, self.title);
    }
}
