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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210BI\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010,\u0012\u0004\b/\u0010%\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiAspectRatioRemoteImage;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiSize;", "imageSize", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "", "url", "", "useLegacyWebMargin", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiSize;Lmicrogram/ui/sdui/SduiComponentType;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiAspectRatioRemoteImage;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiSize;", "getImageSize", "()Lmicrogram/ui/sdui/SduiSize;", "getImageSize$annotations", "()V", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Ljava/lang/String;", "getUrl", "Ljava/lang/Boolean;", "getUseLegacyWebMargin", "()Ljava/lang/Boolean;", "getUseLegacyWebMargin$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiAspectRatioRemoteImage extends SduiComponent {
    private final SduiSize imageSize;
    private final SduiComponentType sduiComponentType;
    private final String url;
    private final Boolean useLegacyWebMargin;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiAspectRatioRemoteImage)) {
            return false;
        }
        SduiAspectRatioRemoteImage sduiAspectRatioRemoteImage = (SduiAspectRatioRemoteImage) other;
        return Intrinsics.areEqual(this.imageSize, sduiAspectRatioRemoteImage.imageSize) && this.sduiComponentType == sduiAspectRatioRemoteImage.sduiComponentType && Intrinsics.areEqual(this.url, sduiAspectRatioRemoteImage.url) && Intrinsics.areEqual(this.useLegacyWebMargin, sduiAspectRatioRemoteImage.useLegacyWebMargin);
    }

    public int hashCode() {
        int iHashCode = ((((this.imageSize.hashCode() * 31) + this.sduiComponentType.hashCode()) * 31) + this.url.hashCode()) * 31;
        Boolean bool = this.useLegacyWebMargin;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "SduiAspectRatioRemoteImage(imageSize=" + this.imageSize + ", sduiComponentType=" + this.sduiComponentType + ", url=" + this.url + ", useLegacyWebMargin=" + this.useLegacyWebMargin + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiAspectRatioRemoteImage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiAspectRatioRemoteImage;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiAspectRatioRemoteImage> serializer() {
            return SduiAspectRatioRemoteImage$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiAspectRatioRemoteImage(int i, @SerialName("image_size") SduiSize sduiSize, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, String str, @SerialName("use_legacy_web_margin") Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (5 != (i & 5)) {
            PluginExceptions.throwMissingFieldException(i, 5, SduiAspectRatioRemoteImage$$serializer.INSTANCE.getDescriptor());
        }
        this.imageSize = sduiSize;
        if ((i & 2) == 0) {
            this.sduiComponentType = SduiComponentType.REMOTE_IMAGE_ASPECT_RATIO;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.url = str;
        if ((i & 8) == 0) {
            this.useLegacyWebMargin = null;
        } else {
            this.useLegacyWebMargin = bool;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiAspectRatioRemoteImage self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiSize$$serializer.INSTANCE, self.imageSize);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.sduiComponentType != SduiComponentType.REMOTE_IMAGE_ASPECT_RATIO) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.sduiComponentType);
        }
        output.encodeStringElement(serialDesc, 2, self.url);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.useLegacyWebMargin == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.useLegacyWebMargin);
    }
}
