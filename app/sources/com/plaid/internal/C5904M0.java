package com.plaid.internal;

import com.plaid.internal.C5892L0;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

@Serializable
/* renamed from: com.plaid.internal.M0 */
/* loaded from: classes16.dex */
public final class C5904M0 {

    /* renamed from: a */
    public final C5892L0 f1539a;

    @Deprecated
    /* renamed from: com.plaid.internal.M0$a */
    public static final class a implements PluginHelperInterfaces<C5904M0> {

        /* renamed from: a */
        public static final a f1540a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1541b;

        static {
            a aVar = new a();
            f1540a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedSessionLinkTokenConfiguration", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("link_token_configuration", false);
            f1541b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{C5892L0.a.f1451a};
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            C5892L0 c5892l0;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1541b;
            Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i = 1;
            C5892L0 c5892l02 = null;
            if (decodingBeginStructure.decodeSequentially()) {
                c5892l0 = (C5892L0) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, C5892L0.a.f1451a, null);
            } else {
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else {
                        if (iDecodeElementIndex != 0) {
                            throw new SerializationExceptions3(iDecodeElementIndex);
                        }
                        c5892l02 = (C5892L0) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, C5892L0.a.f1451a, c5892l02);
                        i2 = 1;
                    }
                }
                c5892l0 = c5892l02;
                i = i2;
            }
            decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C5904M0(i, c5892l0);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1541b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C5904M0 value = (C5904M0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1541b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            encoding3BeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, C5892L0.a.f1451a, value.f1539a);
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.M0$b */
    public static final class b {
        /* renamed from: a */
        public static void m1252a() {
            a aVar = a.f1540a;
        }
    }

    @Deprecated
    public C5904M0(int i, @SerialName("link_token_configuration") C5892L0 c5892l0) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, a.f1541b);
        }
        this.f1539a = c5892l0;
    }

    /* renamed from: a */
    public final C5892L0 m1251a() {
        return this.f1539a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5904M0) && Intrinsics.areEqual(this.f1539a, ((C5904M0) obj).f1539a);
    }

    public final int hashCode() {
        return this.f1539a.hashCode();
    }

    public final String toString() {
        return "EmbeddedSessionLinkTokenConfiguration(embeddedSessionInfo=" + this.f1539a + ")";
    }
}
