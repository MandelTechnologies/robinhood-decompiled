package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+BG\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b\u0007\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0019¨\u0006-"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginTieredRateTableCallout;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColor", "", "isGold", "textColor", "", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;ZLmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiMarginTieredRateTableCallout;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor$annotations", "()V", "Z", "()Z", "isGold$annotations", "getTextColor", "getTextColor$annotations", "Ljava/lang/String;", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiMarginTieredRateTableCallout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiThemedColor backgroundColor;
    private final boolean isGold;
    private final SduiThemedColor textColor;
    private final String title;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiMarginTieredRateTableCallout)) {
            return false;
        }
        SduiMarginTieredRateTableCallout sduiMarginTieredRateTableCallout = (SduiMarginTieredRateTableCallout) other;
        return Intrinsics.areEqual(this.backgroundColor, sduiMarginTieredRateTableCallout.backgroundColor) && this.isGold == sduiMarginTieredRateTableCallout.isGold && Intrinsics.areEqual(this.textColor, sduiMarginTieredRateTableCallout.textColor) && Intrinsics.areEqual(this.title, sduiMarginTieredRateTableCallout.title);
    }

    public int hashCode() {
        SduiThemedColor sduiThemedColor = this.backgroundColor;
        int iHashCode = (((sduiThemedColor == null ? 0 : sduiThemedColor.hashCode()) * 31) + Boolean.hashCode(this.isGold)) * 31;
        SduiThemedColor sduiThemedColor2 = this.textColor;
        return ((iHashCode + (sduiThemedColor2 != null ? sduiThemedColor2.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiMarginTieredRateTableCallout(backgroundColor=" + this.backgroundColor + ", isGold=" + this.isGold + ", textColor=" + this.textColor + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginTieredRateTableCallout$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiMarginTieredRateTableCallout;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiMarginTieredRateTableCallout> serializer() {
            return SduiMarginTieredRateTableCallout$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiMarginTieredRateTableCallout(int i, @SerialName("background_color") SduiThemedColor sduiThemedColor, @SerialName("is_gold") boolean z, @SerialName("text_color") SduiThemedColor sduiThemedColor2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (10 != (i & 10)) {
            PluginExceptions.throwMissingFieldException(i, 10, SduiMarginTieredRateTableCallout$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = sduiThemedColor;
        }
        this.isGold = z;
        if ((i & 4) == 0) {
            this.textColor = null;
        } else {
            this.textColor = sduiThemedColor2;
        }
        this.title = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiMarginTieredRateTableCallout self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.backgroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.backgroundColor);
        }
        output.encodeBooleanElement(serialDesc, 1, self.isGold);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.textColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiThemedColor$$serializer.INSTANCE, self.textColor);
        }
        output.encodeStringElement(serialDesc, 3, self.title);
    }
}
