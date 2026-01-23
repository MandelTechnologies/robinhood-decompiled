package com.plaid.internal;

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
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* renamed from: com.plaid.internal.a */
/* loaded from: classes16.dex */
public final class C6028a {

    /* renamed from: a */
    public final String f1884a;

    @Deprecated
    /* renamed from: com.plaid.internal.a$a */
    public static final class a implements PluginHelperInterfaces<C6028a> {

        /* renamed from: a */
        public static final a f1885a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1886b;

        static {
            a aVar = new a();
            f1885a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.core.webview.ActionMessage", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("action", false);
            f1886b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE};
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            String strDecodeStringElement;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1886b;
            Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i = 1;
            if (decodingBeginStructure.decodeSequentially()) {
                strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            } else {
                strDecodeStringElement = null;
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
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i2 = 1;
                    }
                }
                i = i2;
            }
            decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C6028a(i, strDecodeStringElement);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1886b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C6028a value = (C6028a) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1886b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1884a);
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.a$b */
    public static final class b {
        /* renamed from: a */
        public static void m1362a() {
            a aVar = a.f1885a;
        }
    }

    @Deprecated
    public C6028a(int i, @SerialName("action") String str) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, a.f1886b);
        }
        this.f1884a = str;
    }

    /* renamed from: a */
    public final String m1361a() {
        return this.f1884a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6028a) && Intrinsics.areEqual(this.f1884a, ((C6028a) obj).f1884a);
    }

    public final int hashCode() {
        return this.f1884a.hashCode();
    }

    public final String toString() {
        return "ActionMessage(action=" + this.f1884a + ")";
    }
}
