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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011B\u008f\u0001\b\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010*R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b2\u0010,\u001a\u0004\b0\u00101R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010!R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b7\u0010,\u001a\u0004\b6\u0010!R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b;\u0010,\u001a\u0004\b9\u0010:R\"\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\b=\u0010,\u001a\u0004\b<\u0010!R\"\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00103\u0012\u0004\b?\u0010,\u001a\u0004\b>\u0010!R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00103\u0012\u0004\bA\u0010,\u001a\u0004\b@\u0010!R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00103\u0012\u0004\bC\u0010,\u001a\u0004\bB\u0010!¨\u0006F"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRetirementContributionRow;", "Lmicrogram/ui/sdui/SduiComponent;", "", "dividerBottom", "dividerTop", "Lmicrogram/ui/sdui/SduiThemedColor;", "leadingDotColor", "", "primaryMetadata", "primaryText", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "secondaryMetadata", "secondaryText", "tertiaryMetadata", "tertiaryText", "<init>", "(ZZLmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiRetirementContributionRow;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getDividerBottom", "()Z", "getDividerBottom$annotations", "()V", "getDividerTop", "getDividerTop$annotations", "Lmicrogram/ui/sdui/SduiThemedColor;", "getLeadingDotColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getLeadingDotColor$annotations", "Ljava/lang/String;", "getPrimaryMetadata", "getPrimaryMetadata$annotations", "getPrimaryText", "getPrimaryText$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getSecondaryMetadata", "getSecondaryMetadata$annotations", "getSecondaryText", "getSecondaryText$annotations", "getTertiaryMetadata", "getTertiaryMetadata$annotations", "getTertiaryText", "getTertiaryText$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiRetirementContributionRow extends SduiComponent {
    private final boolean dividerBottom;
    private final boolean dividerTop;
    private final SduiThemedColor leadingDotColor;
    private final String primaryMetadata;
    private final String primaryText;
    private final SduiComponentType sduiComponentType;
    private final String secondaryMetadata;
    private final String secondaryText;
    private final String tertiaryMetadata;
    private final String tertiaryText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, SduiComponentType.INSTANCE.serializer(), null, null, null, null};

    public SduiRetirementContributionRow() {
        this(false, false, (SduiThemedColor) null, (String) null, (String) null, (SduiComponentType) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiRetirementContributionRow)) {
            return false;
        }
        SduiRetirementContributionRow sduiRetirementContributionRow = (SduiRetirementContributionRow) other;
        return this.dividerBottom == sduiRetirementContributionRow.dividerBottom && this.dividerTop == sduiRetirementContributionRow.dividerTop && Intrinsics.areEqual(this.leadingDotColor, sduiRetirementContributionRow.leadingDotColor) && Intrinsics.areEqual(this.primaryMetadata, sduiRetirementContributionRow.primaryMetadata) && Intrinsics.areEqual(this.primaryText, sduiRetirementContributionRow.primaryText) && this.sduiComponentType == sduiRetirementContributionRow.sduiComponentType && Intrinsics.areEqual(this.secondaryMetadata, sduiRetirementContributionRow.secondaryMetadata) && Intrinsics.areEqual(this.secondaryText, sduiRetirementContributionRow.secondaryText) && Intrinsics.areEqual(this.tertiaryMetadata, sduiRetirementContributionRow.tertiaryMetadata) && Intrinsics.areEqual(this.tertiaryText, sduiRetirementContributionRow.tertiaryText);
    }

    public int hashCode() {
        int iHashCode = ((((((((((Boolean.hashCode(this.dividerBottom) * 31) + Boolean.hashCode(this.dividerTop)) * 31) + this.leadingDotColor.hashCode()) * 31) + this.primaryMetadata.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31;
        String str = this.secondaryMetadata;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tertiaryMetadata;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tertiaryText;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "SduiRetirementContributionRow(dividerBottom=" + this.dividerBottom + ", dividerTop=" + this.dividerTop + ", leadingDotColor=" + this.leadingDotColor + ", primaryMetadata=" + this.primaryMetadata + ", primaryText=" + this.primaryText + ", sduiComponentType=" + this.sduiComponentType + ", secondaryMetadata=" + this.secondaryMetadata + ", secondaryText=" + this.secondaryText + ", tertiaryMetadata=" + this.tertiaryMetadata + ", tertiaryText=" + this.tertiaryText + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRetirementContributionRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiRetirementContributionRow;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiRetirementContributionRow> serializer() {
            return SduiRetirementContributionRow$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiRetirementContributionRow(int i, @SerialName("divider_bottom") boolean z, @SerialName("divider_top") boolean z2, @SerialName("leading_dot_color") SduiThemedColor sduiThemedColor, @SerialName("primary_metadata") String str, @SerialName("primary_text") String str2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("secondary_metadata") String str3, @SerialName("secondary_text") String str4, @SerialName("tertiary_metadata") String str5, @SerialName("tertiary_text") String str6, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i & 1) == 0) {
            this.dividerBottom = false;
        } else {
            this.dividerBottom = z;
        }
        if ((i & 2) == 0) {
            this.dividerTop = false;
        } else {
            this.dividerTop = z2;
        }
        if ((i & 4) == 0) {
            SduiColor sduiColor = SduiColor.f7092BG;
            this.leadingDotColor = new SduiThemedColor(sduiColor, sduiColor);
        } else {
            this.leadingDotColor = sduiThemedColor;
        }
        if ((i & 8) == 0) {
            this.primaryMetadata = "";
        } else {
            this.primaryMetadata = str;
        }
        if ((i & 16) == 0) {
            this.primaryText = "";
        } else {
            this.primaryText = str2;
        }
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.RETIREMENT_CONTRIBUTION_ROW;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 64) == 0) {
            this.secondaryMetadata = null;
        } else {
            this.secondaryMetadata = str3;
        }
        if ((i & 128) == 0) {
            this.secondaryText = null;
        } else {
            this.secondaryText = str4;
        }
        if ((i & 256) == 0) {
            this.tertiaryMetadata = null;
        } else {
            this.tertiaryMetadata = str5;
        }
        if ((i & 512) == 0) {
            this.tertiaryText = null;
        } else {
            this.tertiaryText = str6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiRetirementContributionRow self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.dividerBottom) {
            output.encodeBooleanElement(serialDesc, 0, self.dividerBottom);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.dividerTop) {
            output.encodeBooleanElement(serialDesc, 1, self.dividerTop);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2)) {
            output.encodeSerializableElement(serialDesc, 2, SduiThemedColor$$serializer.INSTANCE, self.leadingDotColor);
        } else {
            SduiThemedColor sduiThemedColor = self.leadingDotColor;
            SduiColor sduiColor = SduiColor.f7092BG;
            if (!Intrinsics.areEqual(sduiThemedColor, new SduiThemedColor(sduiColor, sduiColor))) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.primaryMetadata, "")) {
            output.encodeStringElement(serialDesc, 3, self.primaryMetadata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.primaryText, "")) {
            output.encodeStringElement(serialDesc, 4, self.primaryText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.sduiComponentType != SduiComponentType.RETIREMENT_CONTRIBUTION_ROW) {
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.secondaryMetadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.secondaryMetadata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.secondaryText != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.secondaryText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.tertiaryMetadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.tertiaryMetadata);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.tertiaryText == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.tertiaryText);
    }

    public /* synthetic */ SduiRetirementContributionRow(boolean z, boolean z2, SduiThemedColor sduiThemedColor, String str, String str2, SduiComponentType sduiComponentType, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        if ((i & 4) != 0) {
            SduiColor sduiColor = SduiColor.f7092BG;
            sduiThemedColor = new SduiThemedColor(sduiColor, sduiColor);
        }
        this(z, z2, sduiThemedColor, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? SduiComponentType.RETIREMENT_CONTRIBUTION_ROW : sduiComponentType, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SduiRetirementContributionRow(boolean z, boolean z2, SduiThemedColor leadingDotColor, String primaryMetadata, String primaryText, SduiComponentType sduiComponentType, String str, String str2, String str3, String str4) {
        super(null);
        Intrinsics.checkNotNullParameter(leadingDotColor, "leadingDotColor");
        Intrinsics.checkNotNullParameter(primaryMetadata, "primaryMetadata");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(sduiComponentType, "sduiComponentType");
        this.dividerBottom = z;
        this.dividerTop = z2;
        this.leadingDotColor = leadingDotColor;
        this.primaryMetadata = primaryMetadata;
        this.primaryText = primaryText;
        this.sduiComponentType = sduiComponentType;
        this.secondaryMetadata = str;
        this.secondaryText = str2;
        this.tertiaryMetadata = str3;
        this.tertiaryText = str4;
    }
}
