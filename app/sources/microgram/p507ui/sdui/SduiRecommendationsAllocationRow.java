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
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B[\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001cR \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u001cR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010-\u0012\u0004\b0\u0010*\u001a\u0004\b.\u0010/R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00101\u0012\u0004\b4\u0010*\u001a\u0004\b2\u00103¨\u00067"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRecommendationsAllocationRow;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "", "metadataText", "primaryText", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiThemedColor;", "squareColor", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiThemedColor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiRecommendationsAllocationRow;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Ljava/lang/String;", "getMetadataText", "getMetadataText$annotations", "()V", "getPrimaryText", "getPrimaryText$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiThemedColor;", "getSquareColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getSquareColor$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiRecommendationsAllocationRow extends SduiComponent {
    private final SduiAction action;
    private final String metadataText;
    private final String primaryText;
    private final SduiComponentType sduiComponentType;
    private final SduiThemedColor squareColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiComponentType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiRecommendationsAllocationRow)) {
            return false;
        }
        SduiRecommendationsAllocationRow sduiRecommendationsAllocationRow = (SduiRecommendationsAllocationRow) other;
        return Intrinsics.areEqual(this.action, sduiRecommendationsAllocationRow.action) && Intrinsics.areEqual(this.metadataText, sduiRecommendationsAllocationRow.metadataText) && Intrinsics.areEqual(this.primaryText, sduiRecommendationsAllocationRow.primaryText) && this.sduiComponentType == sduiRecommendationsAllocationRow.sduiComponentType && Intrinsics.areEqual(this.squareColor, sduiRecommendationsAllocationRow.squareColor);
    }

    public int hashCode() {
        SduiAction sduiAction = this.action;
        return ((((((((sduiAction == null ? 0 : sduiAction.hashCode()) * 31) + this.metadataText.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.squareColor.hashCode();
    }

    public String toString() {
        return "SduiRecommendationsAllocationRow(action=" + this.action + ", metadataText=" + this.metadataText + ", primaryText=" + this.primaryText + ", sduiComponentType=" + this.sduiComponentType + ", squareColor=" + this.squareColor + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRecommendationsAllocationRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiRecommendationsAllocationRow;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiRecommendationsAllocationRow> serializer() {
            return SduiRecommendationsAllocationRow$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiRecommendationsAllocationRow(int i, SduiAction sduiAction, @SerialName("metadata_text") String str, @SerialName("primary_text") String str2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("square_color") SduiThemedColor sduiThemedColor, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (22 != (i & 22)) {
            PluginExceptions.throwMissingFieldException(i, 22, SduiRecommendationsAllocationRow$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = sduiAction;
        }
        this.metadataText = str;
        this.primaryText = str2;
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.RECOMMENDATIONS_ALLOCATION_ROW;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.squareColor = sduiThemedColor;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiRecommendationsAllocationRow self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        }
        output.encodeStringElement(serialDesc, 1, self.metadataText);
        output.encodeStringElement(serialDesc, 2, self.primaryText);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.RECOMMENDATIONS_ALLOCATION_ROW) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        output.encodeSerializableElement(serialDesc, 4, SduiThemedColor$$serializer.INSTANCE, self.squareColor);
    }
}
