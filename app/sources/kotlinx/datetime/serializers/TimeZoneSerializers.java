package kotlinx.datetime.serializers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.TimeZoneJvm;
import kotlinx.datetime.TimeZoneJvm2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.descriptors.SerialKinds2;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* compiled from: TimeZoneSerializers.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lkotlinx/datetime/serializers/FixedOffsetTimeZoneSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/FixedOffsetTimeZone;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.serializers.FixedOffsetTimeZoneSerializer, reason: use source file name */
/* loaded from: classes14.dex */
public final class TimeZoneSerializers implements KSerializer<TimeZoneJvm> {
    public static final TimeZoneSerializers INSTANCE = new TimeZoneSerializers();
    private static final SerialDescriptor descriptor = SerialDescriptors3.PrimitiveSerialDescriptor("kotlinx.datetime.FixedOffsetTimeZone", SerialKinds2.STRING.INSTANCE);

    private TimeZoneSerializers() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer2
    public TimeZoneJvm deserialize(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        TimeZoneJvm2 timeZoneJvm2M3732of = TimeZoneJvm2.INSTANCE.m3732of(decoder.decodeString());
        if (timeZoneJvm2M3732of instanceof TimeZoneJvm) {
            return (TimeZoneJvm) timeZoneJvm2M3732of;
        }
        throw new SerializationExceptions2("Timezone identifier '" + timeZoneJvm2M3732of + "' does not correspond to a fixed-offset timezone");
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, TimeZoneJvm value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.getId());
    }
}
