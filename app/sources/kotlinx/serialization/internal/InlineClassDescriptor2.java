package kotlinx.serialization.internal;

import com.robinhood.android.optionchain.chainsettings.logging.OptionChainCustomizationLogging;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: InlineClassDescriptor.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0007¨\u0006\u0007"}, m3636d2 = {"InlinePrimitiveDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "name", "", "primitiveSerializer", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.internal.InlineClassDescriptorKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class InlineClassDescriptor2 {
    public static final <T> SerialDescriptor InlinePrimitiveDescriptor(String name, final KSerializer<T> primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new InlineClassDescriptor(name, new PluginHelperInterfaces<T>() { // from class: kotlinx.serialization.internal.InlineClassDescriptorKt.InlinePrimitiveDescriptor.1
            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public KSerializer<?>[] typeParametersSerializers() {
                return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public KSerializer<?>[] childSerializers() {
                return new KSerializer[]{primitiveSerializer};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                throw new IllegalStateException(OptionChainCustomizationLogging.UNSUPPORTED_TOAST_IDENTIFIER);
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, T value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                throw new IllegalStateException(OptionChainCustomizationLogging.UNSUPPORTED_TOAST_IDENTIFIER);
            }

            @Override // kotlinx.serialization.KSerializer2
            public T deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                throw new IllegalStateException(OptionChainCustomizationLogging.UNSUPPORTED_TOAST_IDENTIFIER);
            }
        });
    }
}
