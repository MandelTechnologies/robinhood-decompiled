package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b%\u0010\"¨\u0006("}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInsets;", "", "Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;", "bottom", "left", "right", "top", "<init>", "(Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiWindowWidthDependentNumber;Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiInsets;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;", "getBottom", "()Lmicrogram/ui/sdui/SduiWindowWidthDependentNumber;", "getLeft", "getRight", "getTop", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiInsets {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiWindowWidthDependentNumber bottom;
    private final SduiWindowWidthDependentNumber left;
    private final SduiWindowWidthDependentNumber right;
    private final SduiWindowWidthDependentNumber top;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInsets)) {
            return false;
        }
        SduiInsets sduiInsets = (SduiInsets) other;
        return Intrinsics.areEqual(this.bottom, sduiInsets.bottom) && Intrinsics.areEqual(this.left, sduiInsets.left) && Intrinsics.areEqual(this.right, sduiInsets.right) && Intrinsics.areEqual(this.top, sduiInsets.top);
    }

    public int hashCode() {
        return (((((this.bottom.hashCode() * 31) + this.left.hashCode()) * 31) + this.right.hashCode()) * 31) + this.top.hashCode();
    }

    public String toString() {
        return "SduiInsets(bottom=" + this.bottom + ", left=" + this.left + ", right=" + this.right + ", top=" + this.top + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInsets$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiInsets;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiInsets> serializer() {
            return SduiInsets$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiInsets(int i, SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber, SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber2, SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber3, SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, SduiInsets$$serializer.INSTANCE.getDescriptor());
        }
        this.bottom = sduiWindowWidthDependentNumber;
        this.left = sduiWindowWidthDependentNumber2;
        this.right = sduiWindowWidthDependentNumber3;
        this.top = sduiWindowWidthDependentNumber4;
    }

    public SduiInsets(SduiWindowWidthDependentNumber bottom, SduiWindowWidthDependentNumber left, SduiWindowWidthDependentNumber right, SduiWindowWidthDependentNumber top) {
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(top, "top");
        this.bottom = bottom;
        this.left = left;
        this.right = right;
        this.top = top;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiInsets self, Encoding3 output, SerialDescriptor serialDesc) {
        SduiWindowWidthDependentNumber$$serializer sduiWindowWidthDependentNumber$$serializer = SduiWindowWidthDependentNumber$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, sduiWindowWidthDependentNumber$$serializer, self.bottom);
        output.encodeSerializableElement(serialDesc, 1, sduiWindowWidthDependentNumber$$serializer, self.left);
        output.encodeSerializableElement(serialDesc, 2, sduiWindowWidthDependentNumber$$serializer, self.right);
        output.encodeSerializableElement(serialDesc, 3, sduiWindowWidthDependentNumber$$serializer, self.top);
    }
}
