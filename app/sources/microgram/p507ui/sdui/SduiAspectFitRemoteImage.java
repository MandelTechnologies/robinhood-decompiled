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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B]\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001dR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b6\u0010&¨\u00069"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiAspectFitRemoteImage;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "height", "Lmicrogram/ui/sdui/SduiSize;", "imageSize", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "", "url", "", "useLegacyWebMargin", "width", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Long;Lmicrogram/ui/sdui/SduiSize;Lmicrogram/ui/sdui/SduiComponentType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiAspectFitRemoteImage;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getHeight", "()Ljava/lang/Long;", "Lmicrogram/ui/sdui/SduiSize;", "getImageSize", "()Lmicrogram/ui/sdui/SduiSize;", "getImageSize$annotations", "()V", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Ljava/lang/String;", "getUrl", "Ljava/lang/Boolean;", "getUseLegacyWebMargin", "()Ljava/lang/Boolean;", "getUseLegacyWebMargin$annotations", "getWidth", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiAspectFitRemoteImage extends SduiComponent {
    private final Long height;
    private final SduiSize imageSize;
    private final SduiComponentType sduiComponentType;
    private final String url;
    private final Boolean useLegacyWebMargin;
    private final Long width;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, SduiComponentType.INSTANCE.serializer(), null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiAspectFitRemoteImage)) {
            return false;
        }
        SduiAspectFitRemoteImage sduiAspectFitRemoteImage = (SduiAspectFitRemoteImage) other;
        return Intrinsics.areEqual(this.height, sduiAspectFitRemoteImage.height) && Intrinsics.areEqual(this.imageSize, sduiAspectFitRemoteImage.imageSize) && this.sduiComponentType == sduiAspectFitRemoteImage.sduiComponentType && Intrinsics.areEqual(this.url, sduiAspectFitRemoteImage.url) && Intrinsics.areEqual(this.useLegacyWebMargin, sduiAspectFitRemoteImage.useLegacyWebMargin) && Intrinsics.areEqual(this.width, sduiAspectFitRemoteImage.width);
    }

    public int hashCode() {
        Long l = this.height;
        int iHashCode = (((((((l == null ? 0 : l.hashCode()) * 31) + this.imageSize.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.url.hashCode()) * 31;
        Boolean bool = this.useLegacyWebMargin;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.width;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "SduiAspectFitRemoteImage(height=" + this.height + ", imageSize=" + this.imageSize + ", sduiComponentType=" + this.sduiComponentType + ", url=" + this.url + ", useLegacyWebMargin=" + this.useLegacyWebMargin + ", width=" + this.width + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiAspectFitRemoteImage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiAspectFitRemoteImage;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiAspectFitRemoteImage> serializer() {
            return SduiAspectFitRemoteImage$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiAspectFitRemoteImage(int i, Long l, @SerialName("image_size") SduiSize sduiSize, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, String str, @SerialName("use_legacy_web_margin") Boolean bool, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (10 != (i & 10)) {
            PluginExceptions.throwMissingFieldException(i, 10, SduiAspectFitRemoteImage$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.height = null;
        } else {
            this.height = l;
        }
        this.imageSize = sduiSize;
        if ((i & 4) == 0) {
            this.sduiComponentType = SduiComponentType.REMOTE_IMAGE_ASPECT_FIT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.url = str;
        if ((i & 16) == 0) {
            this.useLegacyWebMargin = null;
        } else {
            this.useLegacyWebMargin = bool;
        }
        if ((i & 32) == 0) {
            this.width = null;
        } else {
            this.width = l2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiAspectFitRemoteImage self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.height != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.height);
        }
        output.encodeSerializableElement(serialDesc, 1, SduiSize$$serializer.INSTANCE, self.imageSize);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.sduiComponentType != SduiComponentType.REMOTE_IMAGE_ASPECT_FIT) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.sduiComponentType);
        }
        output.encodeStringElement(serialDesc, 3, self.url);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.useLegacyWebMargin != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.useLegacyWebMargin);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.width == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.width);
    }
}
