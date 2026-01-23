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
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B]\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010'R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b.\u0010)\u001a\u0004\b\b\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108¨\u0006;"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiPogWithPictogram;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColorOverride", "foregroundColorOverride", "", "isEnabled", "Lmicrogram/ui/sdui/SduiPictogram;", "pictogram", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiPictogramSize;", "size", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;ZLmicrogram/ui/sdui/SduiPictogram;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiPictogramSize;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiPogWithPictogram;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColorOverride", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColorOverride$annotations", "()V", "getForegroundColorOverride", "getForegroundColorOverride$annotations", "Z", "()Z", "isEnabled$annotations", "Lmicrogram/ui/sdui/SduiPictogram;", "getPictogram", "()Lmicrogram/ui/sdui/SduiPictogram;", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiPictogramSize;", "getSize", "()Lmicrogram/ui/sdui/SduiPictogramSize;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiPogWithPictogram extends SduiComponent {
    private final SduiThemedColor backgroundColorOverride;
    private final SduiThemedColor foregroundColorOverride;
    private final boolean isEnabled;
    private final SduiPictogram pictogram;
    private final SduiComponentType sduiComponentType;
    private final SduiPictogramSize size;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiPictogram.INSTANCE.serializer(), SduiComponentType.INSTANCE.serializer(), SduiPictogramSize.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiPogWithPictogram)) {
            return false;
        }
        SduiPogWithPictogram sduiPogWithPictogram = (SduiPogWithPictogram) other;
        return Intrinsics.areEqual(this.backgroundColorOverride, sduiPogWithPictogram.backgroundColorOverride) && Intrinsics.areEqual(this.foregroundColorOverride, sduiPogWithPictogram.foregroundColorOverride) && this.isEnabled == sduiPogWithPictogram.isEnabled && this.pictogram == sduiPogWithPictogram.pictogram && this.sduiComponentType == sduiPogWithPictogram.sduiComponentType && this.size == sduiPogWithPictogram.size;
    }

    public int hashCode() {
        SduiThemedColor sduiThemedColor = this.backgroundColorOverride;
        int iHashCode = (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode()) * 31;
        SduiThemedColor sduiThemedColor2 = this.foregroundColorOverride;
        return ((((((((iHashCode + (sduiThemedColor2 != null ? sduiThemedColor2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.pictogram.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.size.hashCode();
    }

    public String toString() {
        return "SduiPogWithPictogram(backgroundColorOverride=" + this.backgroundColorOverride + ", foregroundColorOverride=" + this.foregroundColorOverride + ", isEnabled=" + this.isEnabled + ", pictogram=" + this.pictogram + ", sduiComponentType=" + this.sduiComponentType + ", size=" + this.size + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiPogWithPictogram$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiPogWithPictogram;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiPogWithPictogram> serializer() {
            return SduiPogWithPictogram$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiPogWithPictogram(int i, @SerialName("background_color_override") SduiThemedColor sduiThemedColor, @SerialName("foreground_color_override") SduiThemedColor sduiThemedColor2, @SerialName("is_enabled") boolean z, SduiPictogram sduiPictogram, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiPictogramSize sduiPictogramSize, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (40 != (i & 40)) {
            PluginExceptions.throwMissingFieldException(i, 40, SduiPogWithPictogram$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.backgroundColorOverride = null;
        } else {
            this.backgroundColorOverride = sduiThemedColor;
        }
        if ((i & 2) == 0) {
            this.foregroundColorOverride = null;
        } else {
            this.foregroundColorOverride = sduiThemedColor2;
        }
        if ((i & 4) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z;
        }
        this.pictogram = sduiPictogram;
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.POG_WITH_PICTOGRAM;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.size = sduiPictogramSize;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiPogWithPictogram self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.backgroundColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.backgroundColorOverride);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.foregroundColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.foregroundColorOverride);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 2, self.isEnabled);
        }
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.pictogram);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sduiComponentType != SduiComponentType.POG_WITH_PICTOGRAM) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
        }
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.size);
    }
}
