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
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BQ\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010%\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010'R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b2\u0010)\u001a\u0004\b0\u00101¨\u00065"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiFloatingValueProp;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "content", "", "imageHeight", "", "imageURL", "imageWidth", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiComponent;JLjava/lang/String;JLmicrogram/ui/sdui/SduiComponentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiFloatingValueProp;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiComponent;", "getContent", "()Lmicrogram/ui/sdui/SduiComponent;", "J", "getImageHeight", "()J", "getImageHeight$annotations", "()V", "Ljava/lang/String;", "getImageURL", "getImageURL$annotations", "getImageWidth", "getImageWidth$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiFloatingValueProp extends SduiComponent {
    private final SduiComponent content;
    private final long imageHeight;
    private final String imageURL;
    private final long imageWidth;
    private final SduiComponentType sduiComponentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, SduiComponentType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiFloatingValueProp)) {
            return false;
        }
        SduiFloatingValueProp sduiFloatingValueProp = (SduiFloatingValueProp) other;
        return Intrinsics.areEqual(this.content, sduiFloatingValueProp.content) && this.imageHeight == sduiFloatingValueProp.imageHeight && Intrinsics.areEqual(this.imageURL, sduiFloatingValueProp.imageURL) && this.imageWidth == sduiFloatingValueProp.imageWidth && this.sduiComponentType == sduiFloatingValueProp.sduiComponentType;
    }

    public int hashCode() {
        return (((((((this.content.hashCode() * 31) + Long.hashCode(this.imageHeight)) * 31) + this.imageURL.hashCode()) * 31) + Long.hashCode(this.imageWidth)) * 31) + this.sduiComponentType.hashCode();
    }

    public String toString() {
        return "SduiFloatingValueProp(content=" + this.content + ", imageHeight=" + this.imageHeight + ", imageURL=" + this.imageURL + ", imageWidth=" + this.imageWidth + ", sduiComponentType=" + this.sduiComponentType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiFloatingValueProp$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiFloatingValueProp;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiFloatingValueProp> serializer() {
            return SduiFloatingValueProp$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiFloatingValueProp(int i, SduiComponent sduiComponent, @SerialName("image_height") long j, @SerialName("image_url") String str, @SerialName("image_width") long j2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, SduiFloatingValueProp$$serializer.INSTANCE.getDescriptor());
        }
        this.content = sduiComponent;
        this.imageHeight = j;
        this.imageURL = str;
        this.imageWidth = j2;
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.FLOATING_VALUE_PROP;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiFloatingValueProp self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiComponentSerializer.INSTANCE, self.content);
        output.encodeLongElement(serialDesc, 1, self.imageHeight);
        output.encodeStringElement(serialDesc, 2, self.imageURL);
        output.encodeLongElement(serialDesc, 3, self.imageWidth);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.sduiComponentType == SduiComponentType.FLOATING_VALUE_PROP) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
    }
}
