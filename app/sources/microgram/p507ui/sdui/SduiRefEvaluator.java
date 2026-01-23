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
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010\u0017¨\u0006+"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRefEvaluator;", "Lmicrogram/ui/sdui/SduiLogicEvaluator;", "", "seen1", "", "componentID", "Lmicrogram/ui/sdui/SduiLogicalOperatorType;", "operatorType", "stateID", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiLogicalOperatorType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiRefEvaluator;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getComponentID", "getComponentID$annotations", "()V", "Lmicrogram/ui/sdui/SduiLogicalOperatorType;", "getOperatorType", "()Lmicrogram/ui/sdui/SduiLogicalOperatorType;", "getOperatorType$annotations", "getStateID", "getStateID$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiRefEvaluator extends SduiLogicEvaluator {
    private final String componentID;
    private final SduiLogicalOperatorType operatorType;
    private final String stateID;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiLogicalOperatorType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiRefEvaluator)) {
            return false;
        }
        SduiRefEvaluator sduiRefEvaluator = (SduiRefEvaluator) other;
        return Intrinsics.areEqual(this.componentID, sduiRefEvaluator.componentID) && this.operatorType == sduiRefEvaluator.operatorType && Intrinsics.areEqual(this.stateID, sduiRefEvaluator.stateID);
    }

    public int hashCode() {
        return (((this.componentID.hashCode() * 31) + this.operatorType.hashCode()) * 31) + this.stateID.hashCode();
    }

    public String toString() {
        return "SduiRefEvaluator(componentID=" + this.componentID + ", operatorType=" + this.operatorType + ", stateID=" + this.stateID + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRefEvaluator$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiRefEvaluator;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiRefEvaluator> serializer() {
            return SduiRefEvaluator$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiRefEvaluator(int i, @SerialName("component_id") String str, @SerialName("operator_type") SduiLogicalOperatorType sduiLogicalOperatorType, @SerialName("state_id") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (5 != (i & 5)) {
            PluginExceptions.throwMissingFieldException(i, 5, SduiRefEvaluator$$serializer.INSTANCE.getDescriptor());
        }
        this.componentID = str;
        if ((i & 2) == 0) {
            this.operatorType = SduiLogicalOperatorType.REF;
        } else {
            this.operatorType = sduiLogicalOperatorType;
        }
        this.stateID = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiRefEvaluator self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.componentID);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.operatorType != SduiLogicalOperatorType.REF) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.operatorType);
        }
        output.encodeStringElement(serialDesc, 2, self.stateID);
    }
}
