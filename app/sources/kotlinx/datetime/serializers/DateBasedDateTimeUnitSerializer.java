package kotlinx.datetime.serializers;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.KSerializer3;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

/* compiled from: DateTimeUnitSerializers.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u0010R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m3636d2 = {"Lkotlinx/datetime/serializers/DateBasedDateTimeUnitSerializer;", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "<init>", "()V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializerOrNull", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/datetime/DateTimeUnit$DateBased;)Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/SealedClassSerializer;", "impl$delegate", "Lkotlin/Lazy;", "getImpl", "()Lkotlinx/serialization/SealedClassSerializer;", "impl", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "baseClass", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor$annotations", "descriptor", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DateBasedDateTimeUnitSerializer extends AbstractPolymorphicSerializer<DateTimeUnit.DateBased> {
    public static final DateBasedDateTimeUnitSerializer INSTANCE = new DateBasedDateTimeUnitSerializer();

    /* renamed from: impl$delegate, reason: from kotlin metadata */
    private static final Lazy impl = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<SealedSerializer<DateTimeUnit.DateBased>>() { // from class: kotlinx.datetime.serializers.DateBasedDateTimeUnitSerializer$impl$2
        @Override // kotlin.jvm.functions.Function0
        public final SealedSerializer<DateTimeUnit.DateBased> invoke() {
            return new SealedSerializer<>("kotlinx.datetime.DateTimeUnit.DateBased", Reflection.getOrCreateKotlinClass(DateTimeUnit.DateBased.class), new KClass[]{Reflection.getOrCreateKotlinClass(DateTimeUnit.DayBased.class), Reflection.getOrCreateKotlinClass(DateTimeUnit.MonthBased.class)}, new KSerializer[]{DayBasedDateTimeUnitSerializer.INSTANCE, MonthBasedDateTimeUnitSerializer.INSTANCE});
        }
    });

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public KClass<DateTimeUnit.DateBased> getBaseClass() {
        return Reflection.getOrCreateKotlinClass(DateTimeUnit.DateBased.class);
    }

    private DateBasedDateTimeUnitSerializer() {
    }

    private final SealedSerializer<DateTimeUnit.DateBased> getImpl() {
        return (SealedSerializer) impl.getValue();
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public KSerializer2<DateTimeUnit.DateBased> findPolymorphicSerializerOrNull(Decoding decoder, String klassName) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return getImpl().findPolymorphicSerializerOrNull(decoder, klassName);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public KSerializer3<DateTimeUnit.DateBased> findPolymorphicSerializerOrNull(Encoding4 encoder, DateTimeUnit.DateBased value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return getImpl().findPolymorphicSerializerOrNull(encoder, (Encoding4) value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return getImpl().getDescriptor();
    }
}
