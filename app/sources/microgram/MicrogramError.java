package microgram;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.descriptors.SerialKinds2;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MicrogramError.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000e\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0010"}, m3636d2 = {"Lmicrogram/MicrogramError;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INTERNAL_ERROR", "INTERRUPTED", "UNSUPPORTED", "WIRE_COMMUNICATION_ERROR", "UNKNOWN_TARGET", "APPLICATION_ERROR", "CodeSerializer", "Companion", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MicrogramError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MicrogramError[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final MicrogramError INTERNAL_ERROR = new MicrogramError("INTERNAL_ERROR", 0, 1);
    public static final MicrogramError INTERRUPTED = new MicrogramError("INTERRUPTED", 1, 2);
    public static final MicrogramError UNSUPPORTED = new MicrogramError("UNSUPPORTED", 2, 3);
    public static final MicrogramError WIRE_COMMUNICATION_ERROR = new MicrogramError("WIRE_COMMUNICATION_ERROR", 3, 4);
    public static final MicrogramError UNKNOWN_TARGET = new MicrogramError("UNKNOWN_TARGET", 4, 5);
    public static final MicrogramError APPLICATION_ERROR = new MicrogramError("APPLICATION_ERROR", 5, 6);

    private static final /* synthetic */ MicrogramError[] $values() {
        return new MicrogramError[]{INTERNAL_ERROR, INTERRUPTED, UNSUPPORTED, WIRE_COMMUNICATION_ERROR, UNKNOWN_TARGET, APPLICATION_ERROR};
    }

    public static EnumEntries<MicrogramError> getEntries() {
        return $ENTRIES;
    }

    private MicrogramError(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        MicrogramError[] microgramErrorArr$values = $values();
        $VALUES = microgramErrorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(microgramErrorArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: MicrogramError.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lmicrogram/MicrogramError$CodeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/MicrogramError;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CodeSerializer implements KSerializer<MicrogramError> {
        public static final CodeSerializer INSTANCE = new CodeSerializer();
        private static final SerialDescriptor descriptor = SerialDescriptors3.PrimitiveSerialDescriptor("MicrogramError", SerialKinds2.INT.INSTANCE);

        private CodeSerializer() {
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer2
        public MicrogramError deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return MicrogramError.INSTANCE.fromInt(decoder.decodeInt());
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MicrogramError value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeInt(value.getValue());
        }
    }

    /* compiled from: MicrogramError.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lmicrogram/MicrogramError$Companion;", "", "<init>", "()V", "fromInt", "Lmicrogram/MicrogramError;", "value", "", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MicrogramError fromInt(int value) {
            MicrogramError microgramError;
            MicrogramError[] microgramErrorArrValues = MicrogramError.values();
            int length = microgramErrorArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    microgramError = null;
                    break;
                }
                microgramError = microgramErrorArrValues[i];
                if (microgramError.getValue() == value) {
                    break;
                }
                i++;
            }
            return microgramError == null ? MicrogramError.INTERNAL_ERROR : microgramError;
        }
    }

    public static MicrogramError valueOf(String str) {
        return (MicrogramError) Enum.valueOf(MicrogramError.class, str);
    }

    public static MicrogramError[] values() {
        return (MicrogramError[]) $VALUES.clone();
    }
}
