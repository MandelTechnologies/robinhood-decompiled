package microgram.p507ui.sdui;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.utils.extensions.ResourceTypes;
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
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementSerializers6;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMB\u0091\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÁ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R(\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b4\u00100\u001a\u0004\b2\u00103R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010:R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\b>\u00100\u001a\u0004\b<\u0010=R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00105\u0012\u0004\b@\u00100\u001a\u0004\b?\u0010%R\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00105\u0012\u0004\bB\u00100\u001a\u0004\bA\u0010%R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010C\u0012\u0004\bF\u00100\u001a\u0004\bD\u0010ER\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bK\u0010L¨\u0006O"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInfoBanner;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "canDismiss", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "ctaAction", "", "ctaText", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "Lkotlinx/serialization/json/JsonObject;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "loggingIdentifier", "receiptUUID", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiInfoBannerStyle;", ResourceTypes.STYLE, "Lmicrogram/ui/sdui/SduiRichText;", "text", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IZLmicrogram/ui/sdui/SduiAction;Ljava/lang/String;Lmicrogram/ui/sdui/SduiIcon;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiInfoBannerStyle;Lmicrogram/ui/sdui/SduiRichText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiInfoBanner;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getCanDismiss", "()Z", "getCanDismiss$annotations", "()V", "Lmicrogram/ui/sdui/SduiAction;", "getCtaAction", "()Lmicrogram/ui/sdui/SduiAction;", "getCtaAction$annotations", "Ljava/lang/String;", "getCtaText", "getCtaText$annotations", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "Lkotlinx/serialization/json/JsonObject;", "getLoggingContext", "()Lkotlinx/serialization/json/JsonObject;", "getLoggingContext$annotations", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "getReceiptUUID", "getReceiptUUID$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiInfoBannerStyle;", "getStyle", "()Lmicrogram/ui/sdui/SduiInfoBannerStyle;", "Lmicrogram/ui/sdui/SduiRichText;", "getText", "()Lmicrogram/ui/sdui/SduiRichText;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiInfoBanner extends SduiComponent {
    private final boolean canDismiss;
    private final SduiAction ctaAction;
    private final String ctaText;
    private final SduiIcon icon;
    private final JsonElement6 loggingContext;
    private final String loggingIdentifier;
    private final String receiptUUID;
    private final SduiComponentType sduiComponentType;
    private final SduiInfoBannerStyle style;
    private final SduiRichText text;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiIcon.INSTANCE.serializer(), null, null, null, SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInfoBanner)) {
            return false;
        }
        SduiInfoBanner sduiInfoBanner = (SduiInfoBanner) other;
        return this.canDismiss == sduiInfoBanner.canDismiss && Intrinsics.areEqual(this.ctaAction, sduiInfoBanner.ctaAction) && Intrinsics.areEqual(this.ctaText, sduiInfoBanner.ctaText) && this.icon == sduiInfoBanner.icon && Intrinsics.areEqual(this.loggingContext, sduiInfoBanner.loggingContext) && Intrinsics.areEqual(this.loggingIdentifier, sduiInfoBanner.loggingIdentifier) && Intrinsics.areEqual(this.receiptUUID, sduiInfoBanner.receiptUUID) && this.sduiComponentType == sduiInfoBanner.sduiComponentType && Intrinsics.areEqual(this.style, sduiInfoBanner.style) && Intrinsics.areEqual(this.text, sduiInfoBanner.text);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.canDismiss) * 31;
        SduiAction sduiAction = this.ctaAction;
        int iHashCode2 = (iHashCode + (sduiAction == null ? 0 : sduiAction.hashCode())) * 31;
        String str = this.ctaText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SduiIcon sduiIcon = this.icon;
        int iHashCode4 = (iHashCode3 + (sduiIcon == null ? 0 : sduiIcon.hashCode())) * 31;
        JsonElement6 jsonElement6 = this.loggingContext;
        int iHashCode5 = (iHashCode4 + (jsonElement6 == null ? 0 : jsonElement6.hashCode())) * 31;
        String str2 = this.loggingIdentifier;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.receiptUUID;
        return ((((((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.sduiComponentType.hashCode()) * 31) + this.style.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "SduiInfoBanner(canDismiss=" + this.canDismiss + ", ctaAction=" + this.ctaAction + ", ctaText=" + this.ctaText + ", icon=" + this.icon + ", loggingContext=" + this.loggingContext + ", loggingIdentifier=" + this.loggingIdentifier + ", receiptUUID=" + this.receiptUUID + ", sduiComponentType=" + this.sduiComponentType + ", style=" + this.style + ", text=" + this.text + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInfoBanner$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiInfoBanner;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiInfoBanner> serializer() {
            return SduiInfoBanner$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiInfoBanner(int i, @SerialName("can_dismiss") boolean z, @SerialName("cta_action") SduiAction sduiAction, @SerialName("cta_text") String str, SduiIcon sduiIcon, @SerialName("logging_context") JsonElement6 jsonElement6, @SerialName("logging_identifier") String str2, @SerialName("receipt_uuid") String str3, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiInfoBannerStyle sduiInfoBannerStyle, SduiRichText sduiRichText, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (512 != (i & 512)) {
            PluginExceptions.throwMissingFieldException(i, 512, SduiInfoBanner$$serializer.INSTANCE.getDescriptor());
        }
        this.canDismiss = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.ctaAction = null;
        } else {
            this.ctaAction = sduiAction;
        }
        if ((i & 4) == 0) {
            this.ctaText = null;
        } else {
            this.ctaText = str;
        }
        if ((i & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = sduiIcon;
        }
        if ((i & 16) == 0) {
            this.loggingContext = null;
        } else {
            this.loggingContext = jsonElement6;
        }
        if ((i & 32) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str2;
        }
        if ((i & 64) == 0) {
            this.receiptUUID = null;
        } else {
            this.receiptUUID = str3;
        }
        if ((i & 128) == 0) {
            this.sduiComponentType = SduiComponentType.INFO_BANNER;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 256) == 0) {
            SduiColor sduiColor = SduiColor.BG2;
            SduiThemedColor sduiThemedColor = new SduiThemedColor(sduiColor, sduiColor);
            SduiColor sduiColor2 = SduiColor.f7102FG;
            this.style = new SduiInfoBannerStyle(sduiThemedColor, new SduiThemedColor(sduiColor2, sduiColor2));
        } else {
            this.style = sduiInfoBannerStyle;
        }
        this.text = sduiRichText;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiInfoBanner self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.canDismiss) {
            output.encodeBooleanElement(serialDesc, 0, self.canDismiss);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ctaAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiAction2.INSTANCE, self.ctaAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.ctaText != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.ctaText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.loggingContext != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, JsonElementSerializers6.INSTANCE, self.loggingContext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.receiptUUID != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.receiptUUID);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.sduiComponentType != SduiComponentType.INFO_BANNER) {
            output.encodeSerializableElement(serialDesc, 7, kSerializerArr[7], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8)) {
            output.encodeSerializableElement(serialDesc, 8, SduiInfoBannerStyle$$serializer.INSTANCE, self.style);
        } else {
            SduiInfoBannerStyle sduiInfoBannerStyle = self.style;
            SduiColor sduiColor = SduiColor.BG2;
            SduiThemedColor sduiThemedColor = new SduiThemedColor(sduiColor, sduiColor);
            SduiColor sduiColor2 = SduiColor.f7102FG;
            if (!Intrinsics.areEqual(sduiInfoBannerStyle, new SduiInfoBannerStyle(sduiThemedColor, new SduiThemedColor(sduiColor2, sduiColor2)))) {
            }
        }
        output.encodeSerializableElement(serialDesc, 9, SduiRichText$$serializer.INSTANCE, self.text);
    }
}
