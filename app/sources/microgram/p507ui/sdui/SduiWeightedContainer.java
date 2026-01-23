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
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BY\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00101\u0012\u0004\b4\u00100\u001a\u0004\b2\u00103R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00105\u0012\u0004\b8\u00100\u001a\u0004\b6\u00107¨\u0006;"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiWeightedContainer;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiPlatformLayoutAxis;", "axis", "", "Lmicrogram/ui/sdui/SduiWeightedItem;", "content", "Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;", "itemSpacing", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiSecondaryAxisAlignment;", "secondaryAxisAlignment", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiPlatformLayoutAxis;Ljava/util/List;Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiSecondaryAxisAlignment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiWeightedContainer;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiPlatformLayoutAxis;", "getAxis", "()Lmicrogram/ui/sdui/SduiPlatformLayoutAxis;", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;", "getItemSpacing", "()Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;", "getItemSpacing$annotations", "()V", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiSecondaryAxisAlignment;", "getSecondaryAxisAlignment", "()Lmicrogram/ui/sdui/SduiSecondaryAxisAlignment;", "getSecondaryAxisAlignment$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiWeightedContainer extends SduiComponent {
    private final SduiPlatformLayoutAxis axis;
    private final List<SduiWeightedItem> content;
    private final SduiWindowWidthDependentNumber itemSpacing;
    private final SduiComponentType sduiComponentType;
    private final SduiSecondaryAxisAlignment secondaryAxisAlignment;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SduiWeightedItem$$serializer.INSTANCE), null, SduiComponentType.INSTANCE.serializer(), SduiSecondaryAxisAlignment.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiWeightedContainer)) {
            return false;
        }
        SduiWeightedContainer sduiWeightedContainer = (SduiWeightedContainer) other;
        return Intrinsics.areEqual(this.axis, sduiWeightedContainer.axis) && Intrinsics.areEqual(this.content, sduiWeightedContainer.content) && Intrinsics.areEqual(this.itemSpacing, sduiWeightedContainer.itemSpacing) && this.sduiComponentType == sduiWeightedContainer.sduiComponentType && this.secondaryAxisAlignment == sduiWeightedContainer.secondaryAxisAlignment;
    }

    public int hashCode() {
        return (((((((this.axis.hashCode() * 31) + this.content.hashCode()) * 31) + this.itemSpacing.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.secondaryAxisAlignment.hashCode();
    }

    public String toString() {
        return "SduiWeightedContainer(axis=" + this.axis + ", content=" + this.content + ", itemSpacing=" + this.itemSpacing + ", sduiComponentType=" + this.sduiComponentType + ", secondaryAxisAlignment=" + this.secondaryAxisAlignment + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiWeightedContainer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiWeightedContainer;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiWeightedContainer> serializer() {
            return SduiWeightedContainer$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiWeightedContainer(int i, SduiPlatformLayoutAxis sduiPlatformLayoutAxis, List list, @SerialName("item_spacing") SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("secondary_axis_alignment") SduiSecondaryAxisAlignment sduiSecondaryAxisAlignment, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, SduiWeightedContainer$$serializer.INSTANCE.getDescriptor());
        }
        this.axis = sduiPlatformLayoutAxis;
        this.content = list;
        if ((i & 4) == 0) {
            this.itemSpacing = new SduiWindowWidthDependentNumber(0L, 0L, 0L);
        } else {
            this.itemSpacing = sduiWindowWidthDependentNumber;
        }
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.WEIGHTED_CONTAINER;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 16) == 0) {
            this.secondaryAxisAlignment = SduiSecondaryAxisAlignment.FILL;
        } else {
            this.secondaryAxisAlignment = sduiSecondaryAxisAlignment;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiWeightedContainer self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiPlatformLayoutAxis$$serializer.INSTANCE, self.axis);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.content);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.itemSpacing, new SduiWindowWidthDependentNumber(0L, 0L, 0L))) {
            output.encodeSerializableElement(serialDesc, 2, SduiWindowWidthDependentNumber$$serializer.INSTANCE, self.itemSpacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.WEIGHTED_CONTAINER) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.secondaryAxisAlignment == SduiSecondaryAxisAlignment.FILL) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.secondaryAxisAlignment);
    }
}
