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
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B;\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b'\u0010!¨\u0006*"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiAndEvaluator;", "Lmicrogram/ui/sdui/SduiLogicEvaluator;", "", "seen1", "lhs", "Lmicrogram/ui/sdui/SduiLogicalOperatorType;", "operatorType", "rhs", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiLogicEvaluator;Lmicrogram/ui/sdui/SduiLogicalOperatorType;Lmicrogram/ui/sdui/SduiLogicEvaluator;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiAndEvaluator;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiLogicEvaluator;", "getLhs", "()Lmicrogram/ui/sdui/SduiLogicEvaluator;", "Lmicrogram/ui/sdui/SduiLogicalOperatorType;", "getOperatorType", "()Lmicrogram/ui/sdui/SduiLogicalOperatorType;", "getOperatorType$annotations", "()V", "getRhs", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiAndEvaluator extends SduiLogicEvaluator {
    private final SduiLogicEvaluator lhs;
    private final SduiLogicalOperatorType operatorType;
    private final SduiLogicEvaluator rhs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiLogicalOperatorType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiAndEvaluator)) {
            return false;
        }
        SduiAndEvaluator sduiAndEvaluator = (SduiAndEvaluator) other;
        return Intrinsics.areEqual(this.lhs, sduiAndEvaluator.lhs) && this.operatorType == sduiAndEvaluator.operatorType && Intrinsics.areEqual(this.rhs, sduiAndEvaluator.rhs);
    }

    public int hashCode() {
        return (((this.lhs.hashCode() * 31) + this.operatorType.hashCode()) * 31) + this.rhs.hashCode();
    }

    public String toString() {
        return "SduiAndEvaluator(lhs=" + this.lhs + ", operatorType=" + this.operatorType + ", rhs=" + this.rhs + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiAndEvaluator$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiAndEvaluator;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiAndEvaluator> serializer() {
            return SduiAndEvaluator$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiAndEvaluator(int i, SduiLogicEvaluator sduiLogicEvaluator, @SerialName("operator_type") SduiLogicalOperatorType sduiLogicalOperatorType, SduiLogicEvaluator sduiLogicEvaluator2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (5 != (i & 5)) {
            PluginExceptions.throwMissingFieldException(i, 5, SduiAndEvaluator$$serializer.INSTANCE.getDescriptor());
        }
        this.lhs = sduiLogicEvaluator;
        if ((i & 2) == 0) {
            this.operatorType = SduiLogicalOperatorType.AND;
        } else {
            this.operatorType = sduiLogicalOperatorType;
        }
        this.rhs = sduiLogicEvaluator2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiAndEvaluator self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        SduiLogicEvaluatorSerializer sduiLogicEvaluatorSerializer = SduiLogicEvaluatorSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, sduiLogicEvaluatorSerializer, self.lhs);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.operatorType != SduiLogicalOperatorType.AND) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.operatorType);
        }
        output.encodeSerializableElement(serialDesc, 2, sduiLogicEvaluatorSerializer, self.rhs);
    }
}
