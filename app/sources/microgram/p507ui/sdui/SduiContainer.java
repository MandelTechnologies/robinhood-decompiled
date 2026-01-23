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
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>Be\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\b5\u00101\u001a\u0004\b3\u00104R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\b9\u00101\u001a\u0004\b7\u00108R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010:\u0012\u0004\b=\u00101\u001a\u0004\b;\u0010<¨\u0006@"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiContainer;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiPlatformLayoutAxis;", "axis", "", "content", "Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;", "itemSpacing", "Lmicrogram/ui/sdui/SduiPrimaryAxisAlignment;", "primaryAxisAlignment", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiSecondaryAxisAlignment;", "secondaryAxisAlignment", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiPlatformLayoutAxis;Ljava/util/List;Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;Lmicrogram/ui/sdui/SduiPrimaryAxisAlignment;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiSecondaryAxisAlignment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiContainer;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiPlatformLayoutAxis;", "getAxis", "()Lmicrogram/ui/sdui/SduiPlatformLayoutAxis;", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;", "getItemSpacing", "()Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;", "getItemSpacing$annotations", "()V", "Lmicrogram/ui/sdui/SduiPrimaryAxisAlignment;", "getPrimaryAxisAlignment", "()Lmicrogram/ui/sdui/SduiPrimaryAxisAlignment;", "getPrimaryAxisAlignment$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiSecondaryAxisAlignment;", "getSecondaryAxisAlignment", "()Lmicrogram/ui/sdui/SduiSecondaryAxisAlignment;", "getSecondaryAxisAlignment$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiContainer extends SduiComponent {
    private final SduiPlatformLayoutAxis axis;
    private final List<SduiComponent> content;
    private final SduiWindowWidthDependentNumber itemSpacing;
    private final SduiPrimaryAxisAlignment primaryAxisAlignment;
    private final SduiComponentType sduiComponentType;
    private final SduiSecondaryAxisAlignment secondaryAxisAlignment;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SduiComponentSerializer.INSTANCE), null, SduiPrimaryAxisAlignment.INSTANCE.serializer(), SduiComponentType.INSTANCE.serializer(), SduiSecondaryAxisAlignment.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiContainer)) {
            return false;
        }
        SduiContainer sduiContainer = (SduiContainer) other;
        return Intrinsics.areEqual(this.axis, sduiContainer.axis) && Intrinsics.areEqual(this.content, sduiContainer.content) && Intrinsics.areEqual(this.itemSpacing, sduiContainer.itemSpacing) && this.primaryAxisAlignment == sduiContainer.primaryAxisAlignment && this.sduiComponentType == sduiContainer.sduiComponentType && this.secondaryAxisAlignment == sduiContainer.secondaryAxisAlignment;
    }

    public int hashCode() {
        return (((((((((this.axis.hashCode() * 31) + this.content.hashCode()) * 31) + this.itemSpacing.hashCode()) * 31) + this.primaryAxisAlignment.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.secondaryAxisAlignment.hashCode();
    }

    public String toString() {
        return "SduiContainer(axis=" + this.axis + ", content=" + this.content + ", itemSpacing=" + this.itemSpacing + ", primaryAxisAlignment=" + this.primaryAxisAlignment + ", sduiComponentType=" + this.sduiComponentType + ", secondaryAxisAlignment=" + this.secondaryAxisAlignment + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiContainer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiContainer;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiContainer> serializer() {
            return SduiContainer$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiContainer(int i, SduiPlatformLayoutAxis sduiPlatformLayoutAxis, List list, @SerialName("item_spacing") SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber, @SerialName("primary_axis_alignment") SduiPrimaryAxisAlignment sduiPrimaryAxisAlignment, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("secondary_axis_alignment") SduiSecondaryAxisAlignment sduiSecondaryAxisAlignment, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, SduiContainer$$serializer.INSTANCE.getDescriptor());
        }
        this.axis = sduiPlatformLayoutAxis;
        this.content = list;
        if ((i & 4) == 0) {
            this.itemSpacing = new SduiWindowWidthDependentNumber(0L, 0L, 0L);
        } else {
            this.itemSpacing = sduiWindowWidthDependentNumber;
        }
        if ((i & 8) == 0) {
            this.primaryAxisAlignment = SduiPrimaryAxisAlignment.START;
        } else {
            this.primaryAxisAlignment = sduiPrimaryAxisAlignment;
        }
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.CONTAINER;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 32) == 0) {
            this.secondaryAxisAlignment = SduiSecondaryAxisAlignment.FILL;
        } else {
            this.secondaryAxisAlignment = sduiSecondaryAxisAlignment;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiContainer self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiPlatformLayoutAxis$$serializer.INSTANCE, self.axis);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.content);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.itemSpacing, new SduiWindowWidthDependentNumber(0L, 0L, 0L))) {
            output.encodeSerializableElement(serialDesc, 2, SduiWindowWidthDependentNumber$$serializer.INSTANCE, self.itemSpacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.primaryAxisAlignment != SduiPrimaryAxisAlignment.START) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.primaryAxisAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sduiComponentType != SduiComponentType.CONTAINER) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.secondaryAxisAlignment == SduiSecondaryAxisAlignment.FILL) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.secondaryAxisAlignment);
    }
}
