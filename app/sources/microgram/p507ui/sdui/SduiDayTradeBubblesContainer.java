package microgram.p507ui.sdui;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BO\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001bR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDayTradeBubblesContainer;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "Lmicrogram/ui/sdui/SduiDayTradeBubble;", "bubbles", "", "overlayMessage", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiThemedColor;", "tintColor", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiThemedColor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiDayTradeBubblesContainer;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBubbles", "()Ljava/util/List;", "Ljava/lang/String;", "getOverlayMessage", "getOverlayMessage$annotations", "()V", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiThemedColor;", "getTintColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getTintColor$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiDayTradeBubblesContainer extends SduiComponent {
    private final List<SduiDayTradeBubble> bubbles;
    private final String overlayMessage;
    private final SduiComponentType sduiComponentType;
    private final SduiThemedColor tintColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SduiDayTradeBubble$$serializer.INSTANCE), null, SduiComponentType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiDayTradeBubblesContainer)) {
            return false;
        }
        SduiDayTradeBubblesContainer sduiDayTradeBubblesContainer = (SduiDayTradeBubblesContainer) other;
        return Intrinsics.areEqual(this.bubbles, sduiDayTradeBubblesContainer.bubbles) && Intrinsics.areEqual(this.overlayMessage, sduiDayTradeBubblesContainer.overlayMessage) && this.sduiComponentType == sduiDayTradeBubblesContainer.sduiComponentType && Intrinsics.areEqual(this.tintColor, sduiDayTradeBubblesContainer.tintColor);
    }

    public int hashCode() {
        int iHashCode = this.bubbles.hashCode() * 31;
        String str = this.overlayMessage;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiThemedColor sduiThemedColor = this.tintColor;
        return iHashCode2 + (sduiThemedColor != null ? sduiThemedColor.hashCode() : 0);
    }

    public String toString() {
        return "SduiDayTradeBubblesContainer(bubbles=" + this.bubbles + ", overlayMessage=" + this.overlayMessage + ", sduiComponentType=" + this.sduiComponentType + ", tintColor=" + this.tintColor + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDayTradeBubblesContainer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiDayTradeBubblesContainer;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiDayTradeBubblesContainer> serializer() {
            return SduiDayTradeBubblesContainer$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiDayTradeBubblesContainer(int i, List list, @SerialName("overlay_message") String str, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("tint_color") SduiThemedColor sduiThemedColor, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, SduiDayTradeBubblesContainer$$serializer.INSTANCE.getDescriptor());
        }
        this.bubbles = list;
        if ((i & 2) == 0) {
            this.overlayMessage = null;
        } else {
            this.overlayMessage = str;
        }
        if ((i & 4) == 0) {
            this.sduiComponentType = SduiComponentType.DAY_TRADE_BUBBLES_VIEW;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 8) == 0) {
            this.tintColor = null;
        } else {
            this.tintColor = sduiThemedColor;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiDayTradeBubblesContainer self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.bubbles);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.overlayMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.overlayMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.sduiComponentType != SduiComponentType.DAY_TRADE_BUBBLES_VIEW) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.sduiComponentType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.tintColor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, SduiThemedColor$$serializer.INSTANCE, self.tintColor);
    }
}
