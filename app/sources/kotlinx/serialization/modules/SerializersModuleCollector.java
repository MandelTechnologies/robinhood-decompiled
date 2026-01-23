package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.KSerializer3;
import kotlinx.serialization.modules.SerializersModuleCollector;

/* compiled from: SerializersModuleCollector.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJX\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032/\u0010\u000f\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\nH&¢\u0006\u0004\b\b\u0010\u0010JM\u0010\u0016\u001a\u00020\u0007\"\b\b\u0000\u0010\u0011*\u00020\u0001\"\b\b\u0001\u0010\u0012*\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¢\u0006\u0004\b\u0016\u0010\u0017JR\u0010\u001b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0011*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032)\u0010\u001a\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00190\nH&¢\u0006\u0004\b\u001b\u0010\u0010JT\u0010 \u001a\u00020\u0007\"\b\b\u0000\u0010\u0011*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032+\u0010\u001f\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001d\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e0\nH&¢\u0006\u0004\b \u0010\u0010¨\u0006!"}, m3636d2 = {"Lkotlinx/serialization/modules/SerializersModuleCollector;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "", "contextual", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphic", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "value", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefaultDeserializer", "kotlinx-serialization-core"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface SerializersModuleCollector {
    <T> void contextual(KClass<T> kClass, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider);

    <T> void contextual(KClass<T> kClass, KSerializer<T> serializer);

    <Base, Sub extends Base> void polymorphic(KClass<Base> baseClass, KClass<Sub> actualClass, KSerializer<Sub> actualSerializer);

    <Base> void polymorphicDefaultDeserializer(KClass<Base> baseClass, Function1<? super String, ? extends KSerializer2<? extends Base>> defaultDeserializerProvider);

    <Base> void polymorphicDefaultSerializer(KClass<Base> baseClass, Function1<? super Base, ? extends KSerializer3<? super Base>> defaultSerializerProvider);

    /* compiled from: SerializersModuleCollector.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: Access modifiers changed from: private */
        public static KSerializer contextual$lambda$0(KSerializer kSerializer, List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return kSerializer;
        }

        public static <T> void contextual(SerializersModuleCollector serializersModuleCollector, KClass<T> kClass, final KSerializer<T> serializer) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializersModuleCollector.contextual(kClass, new Function1() { // from class: kotlinx.serialization.modules.SerializersModuleCollector$DefaultImpls$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SerializersModuleCollector.DefaultImpls.contextual$lambda$0(serializer, (List) obj);
                }
            });
        }
    }
}
