package microgram.p507ui.sdui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHB\u0083\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010-R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\b;\u00102\u001a\u0004\b:\u0010$R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010<\u0012\u0004\b?\u00102\u001a\u0004\b=\u0010>R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010@\u0012\u0004\bC\u00102\u001a\u0004\bA\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bG\u0010F¨\u0006J"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowCapsule;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColor", "Lmicrogram/ui/sdui/SduiTextButton;", AccountOverviewOptionsSettingCard4.CTA, "Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;", "image", "", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "", "showBorder", "Lmicrogram/ui/sdui/SduiMarkdownText;", "subtitle", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiTextButton;Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Ljava/lang/Boolean;Lmicrogram/ui/sdui/SduiMarkdownText;Lmicrogram/ui/sdui/SduiMarkdownText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiInvestFlowCapsule;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor$annotations", "()V", "Lmicrogram/ui/sdui/SduiTextButton;", "getCta", "()Lmicrogram/ui/sdui/SduiTextButton;", "Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;", "getImage", "()Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;", "Ljava/lang/String;", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Ljava/lang/Boolean;", "getShowBorder", "()Ljava/lang/Boolean;", "getShowBorder$annotations", "Lmicrogram/ui/sdui/SduiMarkdownText;", "getSubtitle", "()Lmicrogram/ui/sdui/SduiMarkdownText;", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiInvestFlowCapsule extends SduiComponent {
    private final SduiAction action;
    private final SduiThemedColor backgroundColor;
    private final SduiTextButton cta;
    private final SduiInvestFlowThemedImageSource image;
    private final String loggingIdentifier;
    private final SduiComponentType sduiComponentType;
    private final Boolean showBorder;
    private final SduiMarkdownText subtitle;
    private final SduiMarkdownText title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, SduiComponentType.INSTANCE.serializer(), null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInvestFlowCapsule)) {
            return false;
        }
        SduiInvestFlowCapsule sduiInvestFlowCapsule = (SduiInvestFlowCapsule) other;
        return Intrinsics.areEqual(this.action, sduiInvestFlowCapsule.action) && Intrinsics.areEqual(this.backgroundColor, sduiInvestFlowCapsule.backgroundColor) && Intrinsics.areEqual(this.cta, sduiInvestFlowCapsule.cta) && Intrinsics.areEqual(this.image, sduiInvestFlowCapsule.image) && Intrinsics.areEqual(this.loggingIdentifier, sduiInvestFlowCapsule.loggingIdentifier) && this.sduiComponentType == sduiInvestFlowCapsule.sduiComponentType && Intrinsics.areEqual(this.showBorder, sduiInvestFlowCapsule.showBorder) && Intrinsics.areEqual(this.subtitle, sduiInvestFlowCapsule.subtitle) && Intrinsics.areEqual(this.title, sduiInvestFlowCapsule.title);
    }

    public int hashCode() {
        SduiAction sduiAction = this.action;
        int iHashCode = (((sduiAction == null ? 0 : sduiAction.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31;
        SduiTextButton sduiTextButton = this.cta;
        int iHashCode2 = (((iHashCode + (sduiTextButton == null ? 0 : sduiTextButton.hashCode())) * 31) + this.image.hashCode()) * 31;
        String str = this.loggingIdentifier;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        Boolean bool = this.showBorder;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        SduiMarkdownText sduiMarkdownText = this.subtitle;
        return ((iHashCode4 + (sduiMarkdownText != null ? sduiMarkdownText.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiInvestFlowCapsule(action=" + this.action + ", backgroundColor=" + this.backgroundColor + ", cta=" + this.cta + ", image=" + this.image + ", loggingIdentifier=" + this.loggingIdentifier + ", sduiComponentType=" + this.sduiComponentType + ", showBorder=" + this.showBorder + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowCapsule$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiInvestFlowCapsule;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiInvestFlowCapsule> serializer() {
            return SduiInvestFlowCapsule$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiInvestFlowCapsule(int i, SduiAction sduiAction, @SerialName("background_color") SduiThemedColor sduiThemedColor, SduiTextButton sduiTextButton, SduiInvestFlowThemedImageSource sduiInvestFlowThemedImageSource, @SerialName("logging_identifier") String str, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("show_border") Boolean bool, SduiMarkdownText sduiMarkdownText, SduiMarkdownText sduiMarkdownText2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (264 != (i & EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE)) {
            PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, SduiInvestFlowCapsule$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = sduiAction;
        }
        if ((i & 2) == 0) {
            SduiColor sduiColor = SduiColor.BG2;
            this.backgroundColor = new SduiThemedColor(sduiColor, sduiColor);
        } else {
            this.backgroundColor = sduiThemedColor;
        }
        if ((i & 4) == 0) {
            this.cta = null;
        } else {
            this.cta = sduiTextButton;
        }
        this.image = sduiInvestFlowThemedImageSource;
        if ((i & 16) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str;
        }
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.INVEST_FLOW_CAPSULE;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 64) == 0) {
            this.showBorder = Boolean.TRUE;
        } else {
            this.showBorder = bool;
        }
        if ((i & 128) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = sduiMarkdownText;
        }
        this.title = sduiMarkdownText2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiInvestFlowCapsule self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1)) {
            output.encodeSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.backgroundColor);
        } else {
            SduiThemedColor sduiThemedColor = self.backgroundColor;
            SduiColor sduiColor = SduiColor.BG2;
            if (!Intrinsics.areEqual(sduiThemedColor, new SduiThemedColor(sduiColor, sduiColor))) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.cta != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiTextButton$$serializer.INSTANCE, self.cta);
        }
        output.encodeSerializableElement(serialDesc, 3, SduiInvestFlowThemedImageSource$$serializer.INSTANCE, self.image);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.sduiComponentType != SduiComponentType.INVEST_FLOW_CAPSULE) {
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.showBorder, Boolean.TRUE)) {
            output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, self.showBorder);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, SduiMarkdownText$$serializer.INSTANCE, self.subtitle);
        }
        output.encodeSerializableElement(serialDesc, 8, SduiMarkdownText$$serializer.INSTANCE, self.title);
    }
}
