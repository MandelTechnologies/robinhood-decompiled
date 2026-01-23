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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 ¨\u0006'"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInfoBannerStyle;", "", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColor", "textColor", "<init>", "(Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiInfoBannerStyle;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor$annotations", "()V", "getTextColor", "getTextColor$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiInfoBannerStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiThemedColor backgroundColor;
    private final SduiThemedColor textColor;

    /* JADX WARN: Multi-variable type inference failed */
    public SduiInfoBannerStyle() {
        this((SduiThemedColor) null, (SduiThemedColor) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInfoBannerStyle)) {
            return false;
        }
        SduiInfoBannerStyle sduiInfoBannerStyle = (SduiInfoBannerStyle) other;
        return Intrinsics.areEqual(this.backgroundColor, sduiInfoBannerStyle.backgroundColor) && Intrinsics.areEqual(this.textColor, sduiInfoBannerStyle.textColor);
    }

    public int hashCode() {
        return (this.backgroundColor.hashCode() * 31) + this.textColor.hashCode();
    }

    public String toString() {
        return "SduiInfoBannerStyle(backgroundColor=" + this.backgroundColor + ", textColor=" + this.textColor + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInfoBannerStyle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiInfoBannerStyle;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiInfoBannerStyle> serializer() {
            return SduiInfoBannerStyle$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiInfoBannerStyle(int i, @SerialName("background_color") SduiThemedColor sduiThemedColor, @SerialName("text_color") SduiThemedColor sduiThemedColor2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            SduiColor sduiColor = SduiColor.BG2;
            sduiThemedColor = new SduiThemedColor(sduiColor, sduiColor);
        }
        this.backgroundColor = sduiThemedColor;
        if ((i & 2) != 0) {
            this.textColor = sduiThemedColor2;
        } else {
            SduiColor sduiColor2 = SduiColor.f7102FG;
            this.textColor = new SduiThemedColor(sduiColor2, sduiColor2);
        }
    }

    public SduiInfoBannerStyle(SduiThemedColor backgroundColor, SduiThemedColor textColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiInfoBannerStyle self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.backgroundColor);
        } else {
            SduiThemedColor sduiThemedColor = self.backgroundColor;
            SduiColor sduiColor = SduiColor.BG2;
            if (!Intrinsics.areEqual(sduiThemedColor, new SduiThemedColor(sduiColor, sduiColor))) {
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1)) {
            SduiThemedColor sduiThemedColor2 = self.textColor;
            SduiColor sduiColor2 = SduiColor.f7102FG;
            if (Intrinsics.areEqual(sduiThemedColor2, new SduiThemedColor(sduiColor2, sduiColor2))) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.textColor);
    }

    public /* synthetic */ SduiInfoBannerStyle(SduiThemedColor sduiThemedColor, SduiThemedColor sduiThemedColor2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            SduiColor sduiColor = SduiColor.BG2;
            sduiThemedColor = new SduiThemedColor(sduiColor, sduiColor);
        }
        if ((i & 2) != 0) {
            SduiColor sduiColor2 = SduiColor.f7102FG;
            sduiThemedColor2 = new SduiThemedColor(sduiColor2, sduiColor2);
        }
        this(sduiThemedColor, sduiThemedColor2);
    }
}
