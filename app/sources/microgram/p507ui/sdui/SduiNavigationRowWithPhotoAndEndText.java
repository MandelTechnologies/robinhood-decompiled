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
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCB\u0091\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÁ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\"R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b\n\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010,\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\"R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b8\u0010/\u001a\u0004\b6\u00107R \u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00105\u0012\u0004\b:\u0010/\u001a\u0004\b9\u00107R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010,\u0012\u0004\b<\u0010/\u001a\u0004\b;\u0010\"R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010=\u0012\u0004\b@\u0010/\u001a\u0004\b>\u0010?R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\bA\u00107R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\bB\u00107¨\u0006E"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNavigationRowWithPhotoAndEndText;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "", "backupPhotoText", "", "isEnabled", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiRichText;", "metadataSubtitle", "metadataTitle", "photoURL", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "subtitle", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Ljava/lang/String;ZLjava/lang/String;Lmicrogram/ui/sdui/SduiRichText;Lmicrogram/ui/sdui/SduiRichText;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiRichText;Lmicrogram/ui/sdui/SduiRichText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiNavigationRowWithPhotoAndEndText;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Ljava/lang/String;", "getBackupPhotoText", "getBackupPhotoText$annotations", "()V", "Z", "()Z", "isEnabled$annotations", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiRichText;", "getMetadataSubtitle", "()Lmicrogram/ui/sdui/SduiRichText;", "getMetadataSubtitle$annotations", "getMetadataTitle", "getMetadataTitle$annotations", "getPhotoURL", "getPhotoURL$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getSubtitle", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiNavigationRowWithPhotoAndEndText extends SduiComponent {
    private final SduiAction action;
    private final String backupPhotoText;
    private final boolean isEnabled;
    private final String loggingIdentifier;
    private final SduiRichText metadataSubtitle;
    private final SduiRichText metadataTitle;
    private final String photoURL;
    private final SduiComponentType sduiComponentType;
    private final SduiRichText subtitle;
    private final SduiRichText title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiNavigationRowWithPhotoAndEndText)) {
            return false;
        }
        SduiNavigationRowWithPhotoAndEndText sduiNavigationRowWithPhotoAndEndText = (SduiNavigationRowWithPhotoAndEndText) other;
        return Intrinsics.areEqual(this.action, sduiNavigationRowWithPhotoAndEndText.action) && Intrinsics.areEqual(this.backupPhotoText, sduiNavigationRowWithPhotoAndEndText.backupPhotoText) && this.isEnabled == sduiNavigationRowWithPhotoAndEndText.isEnabled && Intrinsics.areEqual(this.loggingIdentifier, sduiNavigationRowWithPhotoAndEndText.loggingIdentifier) && Intrinsics.areEqual(this.metadataSubtitle, sduiNavigationRowWithPhotoAndEndText.metadataSubtitle) && Intrinsics.areEqual(this.metadataTitle, sduiNavigationRowWithPhotoAndEndText.metadataTitle) && Intrinsics.areEqual(this.photoURL, sduiNavigationRowWithPhotoAndEndText.photoURL) && this.sduiComponentType == sduiNavigationRowWithPhotoAndEndText.sduiComponentType && Intrinsics.areEqual(this.subtitle, sduiNavigationRowWithPhotoAndEndText.subtitle) && Intrinsics.areEqual(this.title, sduiNavigationRowWithPhotoAndEndText.title);
    }

    public int hashCode() {
        SduiAction sduiAction = this.action;
        int iHashCode = (sduiAction == null ? 0 : sduiAction.hashCode()) * 31;
        String str = this.backupPhotoText;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        String str2 = this.loggingIdentifier;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SduiRichText sduiRichText = this.metadataSubtitle;
        int iHashCode4 = (((iHashCode3 + (sduiRichText == null ? 0 : sduiRichText.hashCode())) * 31) + this.metadataTitle.hashCode()) * 31;
        String str3 = this.photoURL;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiRichText sduiRichText2 = this.subtitle;
        return ((iHashCode5 + (sduiRichText2 != null ? sduiRichText2.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiNavigationRowWithPhotoAndEndText(action=" + this.action + ", backupPhotoText=" + this.backupPhotoText + ", isEnabled=" + this.isEnabled + ", loggingIdentifier=" + this.loggingIdentifier + ", metadataSubtitle=" + this.metadataSubtitle + ", metadataTitle=" + this.metadataTitle + ", photoURL=" + this.photoURL + ", sduiComponentType=" + this.sduiComponentType + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNavigationRowWithPhotoAndEndText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiNavigationRowWithPhotoAndEndText;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiNavigationRowWithPhotoAndEndText> serializer() {
            return SduiNavigationRowWithPhotoAndEndText$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiNavigationRowWithPhotoAndEndText(int i, SduiAction sduiAction, @SerialName("backup_photo_text") String str, @SerialName("is_enabled") boolean z, @SerialName("logging_identifier") String str2, @SerialName("metadata_subtitle") SduiRichText sduiRichText, @SerialName("metadata_title") SduiRichText sduiRichText2, @SerialName("photo_url") String str3, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiRichText sduiRichText3, SduiRichText sduiRichText4, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (544 != (i & 544)) {
            PluginExceptions.throwMissingFieldException(i, 544, SduiNavigationRowWithPhotoAndEndText$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = sduiAction;
        }
        if ((i & 2) == 0) {
            this.backupPhotoText = "";
        } else {
            this.backupPhotoText = str;
        }
        if ((i & 4) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z;
        }
        if ((i & 8) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str2;
        }
        if ((i & 16) == 0) {
            this.metadataSubtitle = null;
        } else {
            this.metadataSubtitle = sduiRichText;
        }
        this.metadataTitle = sduiRichText2;
        if ((i & 64) == 0) {
            this.photoURL = null;
        } else {
            this.photoURL = str3;
        }
        if ((i & 128) == 0) {
            this.sduiComponentType = SduiComponentType.NAVIGATION_ROW_WITH_PHOTO_AND_END_TEXT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 256) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = sduiRichText3;
        }
        this.title = sduiRichText4;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiNavigationRowWithPhotoAndEndText self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.backupPhotoText, "")) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.backupPhotoText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 2, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.metadataSubtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiRichText$$serializer.INSTANCE, self.metadataSubtitle);
        }
        SduiRichText$$serializer sduiRichText$$serializer = SduiRichText$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 5, sduiRichText$$serializer, self.metadataTitle);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.photoURL != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.photoURL);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.sduiComponentType != SduiComponentType.NAVIGATION_ROW_WITH_PHOTO_AND_END_TEXT) {
            output.encodeSerializableElement(serialDesc, 7, kSerializerArr[7], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, sduiRichText$$serializer, self.subtitle);
        }
        output.encodeSerializableElement(serialDesc, 9, sduiRichText$$serializer, self.title);
    }
}
