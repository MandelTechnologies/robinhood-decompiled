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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=B[\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b5\u0010*\u001a\u0004\b3\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u00108R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\b<\u0010*\u001a\u0004\b:\u0010;¨\u0006?"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiElevatedCard;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColor", "", "backgroundColorOpacity", "content", "", "cornerRadius", "Lmicrogram/ui/sdui/SduiOutline;", "outline", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;DLmicrogram/ui/sdui/SduiComponent;JLmicrogram/ui/sdui/SduiOutline;Lmicrogram/ui/sdui/SduiComponentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiElevatedCard;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor$annotations", "()V", "D", "getBackgroundColorOpacity", "()D", "getBackgroundColorOpacity$annotations", "Lmicrogram/ui/sdui/SduiComponent;", "getContent", "()Lmicrogram/ui/sdui/SduiComponent;", "J", "getCornerRadius", "()J", "getCornerRadius$annotations", "Lmicrogram/ui/sdui/SduiOutline;", "getOutline", "()Lmicrogram/ui/sdui/SduiOutline;", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiElevatedCard extends SduiComponent {
    private final SduiThemedColor backgroundColor;
    private final double backgroundColorOpacity;
    private final SduiComponent content;
    private final long cornerRadius;
    private final SduiOutline outline;
    private final SduiComponentType sduiComponentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, SduiComponentType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiElevatedCard)) {
            return false;
        }
        SduiElevatedCard sduiElevatedCard = (SduiElevatedCard) other;
        return Intrinsics.areEqual(this.backgroundColor, sduiElevatedCard.backgroundColor) && Double.compare(this.backgroundColorOpacity, sduiElevatedCard.backgroundColorOpacity) == 0 && Intrinsics.areEqual(this.content, sduiElevatedCard.content) && this.cornerRadius == sduiElevatedCard.cornerRadius && Intrinsics.areEqual(this.outline, sduiElevatedCard.outline) && this.sduiComponentType == sduiElevatedCard.sduiComponentType;
    }

    public int hashCode() {
        int iHashCode = ((((((this.backgroundColor.hashCode() * 31) + Double.hashCode(this.backgroundColorOpacity)) * 31) + this.content.hashCode()) * 31) + Long.hashCode(this.cornerRadius)) * 31;
        SduiOutline sduiOutline = this.outline;
        return ((iHashCode + (sduiOutline == null ? 0 : sduiOutline.hashCode())) * 31) + this.sduiComponentType.hashCode();
    }

    public String toString() {
        return "SduiElevatedCard(backgroundColor=" + this.backgroundColor + ", backgroundColorOpacity=" + this.backgroundColorOpacity + ", content=" + this.content + ", cornerRadius=" + this.cornerRadius + ", outline=" + this.outline + ", sduiComponentType=" + this.sduiComponentType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiElevatedCard$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiElevatedCard;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiElevatedCard> serializer() {
            return SduiElevatedCard$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiElevatedCard(int i, @SerialName("background_color") SduiThemedColor sduiThemedColor, @SerialName("background_color_opacity") double d, SduiComponent sduiComponent, @SerialName("corner_radius") long j, SduiOutline sduiOutline, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (4 != (i & 4)) {
            PluginExceptions.throwMissingFieldException(i, 4, SduiElevatedCard$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            SduiColor sduiColor = SduiColor.f7092BG;
            sduiThemedColor = new SduiThemedColor(sduiColor, sduiColor);
        }
        this.backgroundColor = sduiThemedColor;
        if ((i & 2) == 0) {
            this.backgroundColorOpacity = 1.0d;
        } else {
            this.backgroundColorOpacity = d;
        }
        this.content = sduiComponent;
        if ((i & 8) == 0) {
            this.cornerRadius = 0L;
        } else {
            this.cornerRadius = j;
        }
        if ((i & 16) == 0) {
            this.outline = null;
        } else {
            this.outline = sduiOutline;
        }
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.ELEVATED_CARD;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiElevatedCard self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.backgroundColor);
        } else {
            SduiThemedColor sduiThemedColor = self.backgroundColor;
            SduiColor sduiColor = SduiColor.f7092BG;
            if (!Intrinsics.areEqual(sduiThemedColor, new SduiThemedColor(sduiColor, sduiColor))) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.backgroundColorOpacity, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.backgroundColorOpacity);
        }
        output.encodeSerializableElement(serialDesc, 2, SduiComponentSerializer.INSTANCE, self.content);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.cornerRadius != 0) {
            output.encodeLongElement(serialDesc, 3, self.cornerRadius);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.outline != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiOutline$$serializer.INSTANCE, self.outline);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.sduiComponentType == SduiComponentType.ELEVATED_CARD) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
    }
}
