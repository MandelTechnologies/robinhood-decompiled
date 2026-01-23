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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B_\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R \u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010(\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010*R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b5\u0010,\u001a\u0004\b3\u00104R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b9\u0010,\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiHorizontalScrollContainer;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiHorizontalScrollContainerAlignment;", "alignment", "", "alwaysBounceHorizontal", "", "content", "hidesScrollIndicator", "", "itemSpacing", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiHorizontalScrollContainerAlignment;ZLjava/util/List;ZDLmicrogram/ui/sdui/SduiComponentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiHorizontalScrollContainer;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiHorizontalScrollContainerAlignment;", "getAlignment", "()Lmicrogram/ui/sdui/SduiHorizontalScrollContainerAlignment;", "Z", "getAlwaysBounceHorizontal", "()Z", "getAlwaysBounceHorizontal$annotations", "()V", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "getHidesScrollIndicator", "getHidesScrollIndicator$annotations", "D", "getItemSpacing", "()D", "getItemSpacing$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiHorizontalScrollContainer extends SduiComponent {
    private final SduiHorizontalScrollContainerAlignment alignment;
    private final boolean alwaysBounceHorizontal;
    private final List<SduiComponent> content;
    private final boolean hidesScrollIndicator;
    private final double itemSpacing;
    private final SduiComponentType sduiComponentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiHorizontalScrollContainerAlignment.INSTANCE.serializer(), null, new ArrayListSerializer(SduiComponentSerializer.INSTANCE), null, null, SduiComponentType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiHorizontalScrollContainer)) {
            return false;
        }
        SduiHorizontalScrollContainer sduiHorizontalScrollContainer = (SduiHorizontalScrollContainer) other;
        return this.alignment == sduiHorizontalScrollContainer.alignment && this.alwaysBounceHorizontal == sduiHorizontalScrollContainer.alwaysBounceHorizontal && Intrinsics.areEqual(this.content, sduiHorizontalScrollContainer.content) && this.hidesScrollIndicator == sduiHorizontalScrollContainer.hidesScrollIndicator && Double.compare(this.itemSpacing, sduiHorizontalScrollContainer.itemSpacing) == 0 && this.sduiComponentType == sduiHorizontalScrollContainer.sduiComponentType;
    }

    public int hashCode() {
        return (((((((((this.alignment.hashCode() * 31) + Boolean.hashCode(this.alwaysBounceHorizontal)) * 31) + this.content.hashCode()) * 31) + Boolean.hashCode(this.hidesScrollIndicator)) * 31) + Double.hashCode(this.itemSpacing)) * 31) + this.sduiComponentType.hashCode();
    }

    public String toString() {
        return "SduiHorizontalScrollContainer(alignment=" + this.alignment + ", alwaysBounceHorizontal=" + this.alwaysBounceHorizontal + ", content=" + this.content + ", hidesScrollIndicator=" + this.hidesScrollIndicator + ", itemSpacing=" + this.itemSpacing + ", sduiComponentType=" + this.sduiComponentType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiHorizontalScrollContainer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiHorizontalScrollContainer;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiHorizontalScrollContainer> serializer() {
            return SduiHorizontalScrollContainer$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiHorizontalScrollContainer(int i, SduiHorizontalScrollContainerAlignment sduiHorizontalScrollContainerAlignment, @SerialName("always_bounce_horizontal") boolean z, List list, @SerialName("hides_scroll_indicator") boolean z2, @SerialName("item_spacing") double d, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (20 != (i & 20)) {
            PluginExceptions.throwMissingFieldException(i, 20, SduiHorizontalScrollContainer$$serializer.INSTANCE.getDescriptor());
        }
        this.alignment = (i & 1) == 0 ? SduiHorizontalScrollContainerAlignment.CENTER : sduiHorizontalScrollContainerAlignment;
        if ((i & 2) == 0) {
            this.alwaysBounceHorizontal = false;
        } else {
            this.alwaysBounceHorizontal = z;
        }
        this.content = list;
        if ((i & 8) == 0) {
            this.hidesScrollIndicator = false;
        } else {
            this.hidesScrollIndicator = z2;
        }
        this.itemSpacing = d;
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.HORIZONTAL_SCROLL_CONTAINER;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiHorizontalScrollContainer self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.alignment != SduiHorizontalScrollContainerAlignment.CENTER) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.alignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.alwaysBounceHorizontal) {
            output.encodeBooleanElement(serialDesc, 1, self.alwaysBounceHorizontal);
        }
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.content);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.hidesScrollIndicator) {
            output.encodeBooleanElement(serialDesc, 3, self.hidesScrollIndicator);
        }
        output.encodeDoubleElement(serialDesc, 4, self.itemSpacing);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.sduiComponentType == SduiComponentType.HORIZONTAL_SCROLL_CONTAINER) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
    }
}
