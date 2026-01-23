package microgram.p507ui.sdui;

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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKB\u008d\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÁ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010%R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u00104\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010=R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00105\u0012\u0004\b?\u00104\u001a\u0004\b>\u0010%R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010@\u0012\u0004\bC\u00104\u001a\u0004\bA\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bJ\u0010I¨\u0006M"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiFeatureCard;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColor", "", "badge", "Lmicrogram/ui/sdui/SduiFeatureDiscoveryBadgeType;", "badgeType", "Lmicrogram/ui/sdui/SduiThemedImageSource;", "image", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiFeatureDiscoveryContainerStyle;", ResourceTypes.STYLE, "Lmicrogram/ui/sdui/SduiMarkdownText;", "subtitle", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/String;Lmicrogram/ui/sdui/SduiFeatureDiscoveryBadgeType;Lmicrogram/ui/sdui/SduiThemedImageSource;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiFeatureDiscoveryContainerStyle;Lmicrogram/ui/sdui/SduiMarkdownText;Lmicrogram/ui/sdui/SduiMarkdownText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiFeatureCard;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor$annotations", "()V", "Ljava/lang/String;", "getBadge", "Lmicrogram/ui/sdui/SduiFeatureDiscoveryBadgeType;", "getBadgeType", "()Lmicrogram/ui/sdui/SduiFeatureDiscoveryBadgeType;", "getBadgeType$annotations", "Lmicrogram/ui/sdui/SduiThemedImageSource;", "getImage", "()Lmicrogram/ui/sdui/SduiThemedImageSource;", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiFeatureDiscoveryContainerStyle;", "getStyle", "()Lmicrogram/ui/sdui/SduiFeatureDiscoveryContainerStyle;", "Lmicrogram/ui/sdui/SduiMarkdownText;", "getSubtitle", "()Lmicrogram/ui/sdui/SduiMarkdownText;", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiFeatureCard extends SduiComponent {
    private final SduiAction action;
    private final SduiThemedColor backgroundColor;
    private final String badge;
    private final SduiFeatureDiscoveryBadgeType badgeType;
    private final SduiThemedImageSource image;
    private final String loggingIdentifier;
    private final SduiComponentType sduiComponentType;
    private final SduiFeatureDiscoveryContainerStyle style;
    private final SduiMarkdownText subtitle;
    private final SduiMarkdownText title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiFeatureDiscoveryBadgeType.INSTANCE.serializer(), null, null, SduiComponentType.INSTANCE.serializer(), SduiFeatureDiscoveryContainerStyle.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiFeatureCard)) {
            return false;
        }
        SduiFeatureCard sduiFeatureCard = (SduiFeatureCard) other;
        return Intrinsics.areEqual(this.action, sduiFeatureCard.action) && Intrinsics.areEqual(this.backgroundColor, sduiFeatureCard.backgroundColor) && Intrinsics.areEqual(this.badge, sduiFeatureCard.badge) && this.badgeType == sduiFeatureCard.badgeType && Intrinsics.areEqual(this.image, sduiFeatureCard.image) && Intrinsics.areEqual(this.loggingIdentifier, sduiFeatureCard.loggingIdentifier) && this.sduiComponentType == sduiFeatureCard.sduiComponentType && this.style == sduiFeatureCard.style && Intrinsics.areEqual(this.subtitle, sduiFeatureCard.subtitle) && Intrinsics.areEqual(this.title, sduiFeatureCard.title);
    }

    public int hashCode() {
        int iHashCode = ((this.action.hashCode() * 31) + this.backgroundColor.hashCode()) * 31;
        String str = this.badge;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SduiFeatureDiscoveryBadgeType sduiFeatureDiscoveryBadgeType = this.badgeType;
        int iHashCode3 = (((iHashCode2 + (sduiFeatureDiscoveryBadgeType == null ? 0 : sduiFeatureDiscoveryBadgeType.hashCode())) * 31) + this.image.hashCode()) * 31;
        String str2 = this.loggingIdentifier;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiFeatureDiscoveryContainerStyle sduiFeatureDiscoveryContainerStyle = this.style;
        return ((((iHashCode4 + (sduiFeatureDiscoveryContainerStyle != null ? sduiFeatureDiscoveryContainerStyle.hashCode() : 0)) * 31) + this.subtitle.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiFeatureCard(action=" + this.action + ", backgroundColor=" + this.backgroundColor + ", badge=" + this.badge + ", badgeType=" + this.badgeType + ", image=" + this.image + ", loggingIdentifier=" + this.loggingIdentifier + ", sduiComponentType=" + this.sduiComponentType + ", style=" + this.style + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiFeatureCard$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiFeatureCard;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiFeatureCard> serializer() {
            return SduiFeatureCard$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiFeatureCard(int i, SduiAction sduiAction, @SerialName("background_color") SduiThemedColor sduiThemedColor, String str, @SerialName("badge_type") SduiFeatureDiscoveryBadgeType sduiFeatureDiscoveryBadgeType, SduiThemedImageSource sduiThemedImageSource, @SerialName("logging_identifier") String str2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiFeatureDiscoveryContainerStyle sduiFeatureDiscoveryContainerStyle, SduiMarkdownText sduiMarkdownText, SduiMarkdownText sduiMarkdownText2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (785 != (i & 785)) {
            PluginExceptions.throwMissingFieldException(i, 785, SduiFeatureCard$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        if ((i & 2) == 0) {
            SduiColor sduiColor = SduiColor.BG2;
            this.backgroundColor = new SduiThemedColor(sduiColor, sduiColor);
        } else {
            this.backgroundColor = sduiThemedColor;
        }
        if ((i & 4) == 0) {
            this.badge = null;
        } else {
            this.badge = str;
        }
        if ((i & 8) == 0) {
            this.badgeType = SduiFeatureDiscoveryBadgeType.XRAY;
        } else {
            this.badgeType = sduiFeatureDiscoveryBadgeType;
        }
        this.image = sduiThemedImageSource;
        if ((i & 32) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str2;
        }
        if ((i & 64) == 0) {
            this.sduiComponentType = SduiComponentType.FEATURE_CARD;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 128) == 0) {
            this.style = SduiFeatureDiscoveryContainerStyle.CAROUSEL;
        } else {
            this.style = sduiFeatureDiscoveryContainerStyle;
        }
        this.subtitle = sduiMarkdownText;
        this.title = sduiMarkdownText2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiFeatureCard self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 1)) {
            output.encodeSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.backgroundColor);
        } else {
            SduiThemedColor sduiThemedColor = self.backgroundColor;
            SduiColor sduiColor = SduiColor.BG2;
            if (!Intrinsics.areEqual(sduiThemedColor, new SduiThemedColor(sduiColor, sduiColor))) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.badge != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.badge);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.badgeType != SduiFeatureDiscoveryBadgeType.XRAY) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.badgeType);
        }
        output.encodeSerializableElement(serialDesc, 4, SduiThemedImageSource$$serializer.INSTANCE, self.image);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.sduiComponentType != SduiComponentType.FEATURE_CARD) {
            output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.style != SduiFeatureDiscoveryContainerStyle.CAROUSEL) {
            output.encodeNullableSerializableElement(serialDesc, 7, kSerializerArr[7], self.style);
        }
        SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 8, sduiMarkdownText$$serializer, self.subtitle);
        output.encodeSerializableElement(serialDesc, 9, sduiMarkdownText$$serializer, self.title);
    }
}
