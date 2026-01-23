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
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-BG\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010 \u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0019R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010)\u0012\u0004\b,\u0010#\u001a\u0004\b*\u0010+¨\u0006/"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiLengthValidator;", "", "", "seen1", "", "errorMessage", "", "length", "stateID", "Lmicrogram/ui/sdui/SduiTextValidationType;", "validationType", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;JLjava/lang/String;Lmicrogram/ui/sdui/SduiTextValidationType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiLengthValidator;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorMessage", "getErrorMessage$annotations", "()V", "J", "getLength", "()J", "getStateID", "getStateID$annotations", "Lmicrogram/ui/sdui/SduiTextValidationType;", "getValidationType", "()Lmicrogram/ui/sdui/SduiTextValidationType;", "getValidationType$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiLengthValidator {
    private final String errorMessage;
    private final long length;
    private final String stateID;
    private final SduiTextValidationType validationType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiTextValidationType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiLengthValidator)) {
            return false;
        }
        SduiLengthValidator sduiLengthValidator = (SduiLengthValidator) other;
        return Intrinsics.areEqual(this.errorMessage, sduiLengthValidator.errorMessage) && this.length == sduiLengthValidator.length && Intrinsics.areEqual(this.stateID, sduiLengthValidator.stateID) && this.validationType == sduiLengthValidator.validationType;
    }

    public int hashCode() {
        return (((((this.errorMessage.hashCode() * 31) + Long.hashCode(this.length)) * 31) + this.stateID.hashCode()) * 31) + this.validationType.hashCode();
    }

    public String toString() {
        return "SduiLengthValidator(errorMessage=" + this.errorMessage + ", length=" + this.length + ", stateID=" + this.stateID + ", validationType=" + this.validationType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiLengthValidator$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiLengthValidator;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiLengthValidator> serializer() {
            return SduiLengthValidator$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiLengthValidator(int i, @SerialName("error_message") String str, long j, @SerialName("state_id") String str2, @SerialName("validation_type") SduiTextValidationType sduiTextValidationType, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, SduiLengthValidator$$serializer.INSTANCE.getDescriptor());
        }
        this.errorMessage = str;
        this.length = j;
        this.stateID = str2;
        if ((i & 8) == 0) {
            this.validationType = SduiTextValidationType.DELAYED;
        } else {
            this.validationType = sduiTextValidationType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiLengthValidator self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.errorMessage);
        output.encodeLongElement(serialDesc, 1, self.length);
        output.encodeStringElement(serialDesc, 2, self.stateID);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.validationType == SduiTextValidationType.DELAYED) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.validationType);
    }
}
