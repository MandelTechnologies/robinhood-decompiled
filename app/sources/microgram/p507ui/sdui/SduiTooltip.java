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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221BK\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100¨\u00063"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTooltip;", "", "", "seen1", "", "dismissTimeout", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "onDismiss", "Lmicrogram/ui/sdui/SduiTooltipPosition;", "position", "Lmicrogram/ui/sdui/SduiMarkdown;", "text", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Long;Lmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiTooltipPosition;Lmicrogram/ui/sdui/SduiMarkdown;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTooltip;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getDismissTimeout", "()Ljava/lang/Long;", "getDismissTimeout$annotations", "()V", "Lmicrogram/ui/sdui/SduiAction;", "getOnDismiss", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiTooltipPosition;", "getPosition", "()Lmicrogram/ui/sdui/SduiTooltipPosition;", "Lmicrogram/ui/sdui/SduiMarkdown;", "getText", "()Lmicrogram/ui/sdui/SduiMarkdown;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTooltip {
    private final Long dismissTimeout;
    private final SduiAction onDismiss;
    private final SduiTooltipPosition position;
    private final SduiMarkdown text;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, SduiTooltipPosition.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTooltip)) {
            return false;
        }
        SduiTooltip sduiTooltip = (SduiTooltip) other;
        return Intrinsics.areEqual(this.dismissTimeout, sduiTooltip.dismissTimeout) && Intrinsics.areEqual(this.onDismiss, sduiTooltip.onDismiss) && this.position == sduiTooltip.position && Intrinsics.areEqual(this.text, sduiTooltip.text);
    }

    public int hashCode() {
        Long l = this.dismissTimeout;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        SduiAction sduiAction = this.onDismiss;
        return ((((iHashCode + (sduiAction != null ? sduiAction.hashCode() : 0)) * 31) + this.position.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "SduiTooltip(dismissTimeout=" + this.dismissTimeout + ", onDismiss=" + this.onDismiss + ", position=" + this.position + ", text=" + this.text + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTooltip$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTooltip;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTooltip> serializer() {
            return SduiTooltip$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiTooltip(int i, @SerialName("dismiss_timeout") Long l, SduiAction sduiAction, SduiTooltipPosition sduiTooltipPosition, SduiMarkdown sduiMarkdown, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptions.throwMissingFieldException(i, 8, SduiTooltip$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.dismissTimeout = null;
        } else {
            this.dismissTimeout = l;
        }
        if ((i & 2) == 0) {
            this.onDismiss = null;
        } else {
            this.onDismiss = sduiAction;
        }
        if ((i & 4) == 0) {
            this.position = SduiTooltipPosition.BOTTOM;
        } else {
            this.position = sduiTooltipPosition;
        }
        this.text = sduiMarkdown;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTooltip self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.dismissTimeout != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.dismissTimeout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.onDismiss != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiAction2.INSTANCE, self.onDismiss);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.position != SduiTooltipPosition.BOTTOM) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.position);
        }
        output.encodeSerializableElement(serialDesc, 3, SduiMarkdown$$serializer.INSTANCE, self.text);
    }
}
