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
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B1\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNotEvaluator;", "Lmicrogram/ui/sdui/SduiLogicEvaluator;", "", "seen1", "Lmicrogram/ui/sdui/SduiLogicalOperatorType;", "operatorType", "value", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiLogicalOperatorType;Lmicrogram/ui/sdui/SduiLogicEvaluator;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiNotEvaluator;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiLogicalOperatorType;", "getOperatorType", "()Lmicrogram/ui/sdui/SduiLogicalOperatorType;", "getOperatorType$annotations", "()V", "Lmicrogram/ui/sdui/SduiLogicEvaluator;", "getValue", "()Lmicrogram/ui/sdui/SduiLogicEvaluator;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiNotEvaluator extends SduiLogicEvaluator {
    private final SduiLogicalOperatorType operatorType;
    private final SduiLogicEvaluator value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiLogicalOperatorType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiNotEvaluator)) {
            return false;
        }
        SduiNotEvaluator sduiNotEvaluator = (SduiNotEvaluator) other;
        return this.operatorType == sduiNotEvaluator.operatorType && Intrinsics.areEqual(this.value, sduiNotEvaluator.value);
    }

    public int hashCode() {
        return (this.operatorType.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "SduiNotEvaluator(operatorType=" + this.operatorType + ", value=" + this.value + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNotEvaluator$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiNotEvaluator;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiNotEvaluator> serializer() {
            return SduiNotEvaluator$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiNotEvaluator(int i, @SerialName("operator_type") SduiLogicalOperatorType sduiLogicalOperatorType, SduiLogicEvaluator sduiLogicEvaluator, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (2 != (i & 2)) {
            PluginExceptions.throwMissingFieldException(i, 2, SduiNotEvaluator$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.operatorType = SduiLogicalOperatorType.NOT;
        } else {
            this.operatorType = sduiLogicalOperatorType;
        }
        this.value = sduiLogicEvaluator;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiNotEvaluator self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.operatorType != SduiLogicalOperatorType.NOT) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.operatorType);
        }
        output.encodeSerializableElement(serialDesc, 1, SduiLogicEvaluatorSerializer.INSTANCE, self.value);
    }
}
