package microgram.p507ui.sdui;

import java.util.Map;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:Bk\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R.\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u001dR \u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b1\u0010(\u001a\u0004\b0\u0010\u001dR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b5\u0010(\u001a\u0004\b3\u00104R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b9\u0010(\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRemoteLottie;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "", "animationTextMapping", "", "aspectRatio", "darkModeContentLink", "lightModeContentLink", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "", "shouldLoop", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/util/Map;DLjava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiRemoteLottie;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getAnimationTextMapping", "()Ljava/util/Map;", "getAnimationTextMapping$annotations", "()V", "D", "getAspectRatio", "()D", "getAspectRatio$annotations", "Ljava/lang/String;", "getDarkModeContentLink", "getDarkModeContentLink$annotations", "getLightModeContentLink", "getLightModeContentLink$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Z", "getShouldLoop", "()Z", "getShouldLoop$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiRemoteLottie extends SduiComponent {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, String> animationTextMapping;
    private final double aspectRatio;
    private final String darkModeContentLink;
    private final String lightModeContentLink;
    private final SduiComponentType sduiComponentType;
    private final boolean shouldLoop;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiRemoteLottie)) {
            return false;
        }
        SduiRemoteLottie sduiRemoteLottie = (SduiRemoteLottie) other;
        return Intrinsics.areEqual(this.animationTextMapping, sduiRemoteLottie.animationTextMapping) && Double.compare(this.aspectRatio, sduiRemoteLottie.aspectRatio) == 0 && Intrinsics.areEqual(this.darkModeContentLink, sduiRemoteLottie.darkModeContentLink) && Intrinsics.areEqual(this.lightModeContentLink, sduiRemoteLottie.lightModeContentLink) && this.sduiComponentType == sduiRemoteLottie.sduiComponentType && this.shouldLoop == sduiRemoteLottie.shouldLoop;
    }

    public int hashCode() {
        Map<String, String> map = this.animationTextMapping;
        return ((((((((((map == null ? 0 : map.hashCode()) * 31) + Double.hashCode(this.aspectRatio)) * 31) + this.darkModeContentLink.hashCode()) * 31) + this.lightModeContentLink.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + Boolean.hashCode(this.shouldLoop);
    }

    public String toString() {
        return "SduiRemoteLottie(animationTextMapping=" + this.animationTextMapping + ", aspectRatio=" + this.aspectRatio + ", darkModeContentLink=" + this.darkModeContentLink + ", lightModeContentLink=" + this.lightModeContentLink + ", sduiComponentType=" + this.sduiComponentType + ", shouldLoop=" + this.shouldLoop + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRemoteLottie$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiRemoteLottie;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiRemoteLottie> serializer() {
            return SduiRemoteLottie$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null, SduiComponentType.INSTANCE.serializer(), null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiRemoteLottie(int i, @SerialName("animation_text_mapping") Map map, @SerialName("aspect_ratio") double d, @SerialName("dark_mode_content_link") String str, @SerialName("light_mode_content_link") String str2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("should_loop") boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (12 != (i & 12)) {
            PluginExceptions.throwMissingFieldException(i, 12, SduiRemoteLottie$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.animationTextMapping = null;
        } else {
            this.animationTextMapping = map;
        }
        if ((i & 2) == 0) {
            this.aspectRatio = 1.0d;
        } else {
            this.aspectRatio = d;
        }
        this.darkModeContentLink = str;
        this.lightModeContentLink = str2;
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.REMOTE_LOTTIE;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 32) == 0) {
            this.shouldLoop = true;
        } else {
            this.shouldLoop = z;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiRemoteLottie self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.animationTextMapping != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kSerializerArr[0], self.animationTextMapping);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.aspectRatio, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.aspectRatio);
        }
        output.encodeStringElement(serialDesc, 2, self.darkModeContentLink);
        output.encodeStringElement(serialDesc, 3, self.lightModeContentLink);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sduiComponentType != SduiComponentType.REMOTE_LOTTIE) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.shouldLoop) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 5, self.shouldLoop);
    }
}
