package com.plaid.internal;

import com.google.gson.annotations.SerializedName;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* renamed from: com.plaid.internal.O3 */
/* loaded from: classes16.dex */
public final class C5925O3 {

    /* renamed from: a */
    @SerializedName("available")
    private final String f1585a;

    /* renamed from: b */
    @SerializedName("current")
    private final String f1586b;

    @Deprecated
    /* renamed from: com.plaid.internal.O3$a */
    public static final class a implements PluginHelperInterfaces<C5925O3> {

        /* renamed from: a */
        public static final a f1587a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1588b;

        static {
            a aVar = new a();
            f1587a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.url.LocalizedLinkAccountResponseBalance", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("available", true);
            pluginGeneratedSerialDescriptor.addElement("current", true);
            f1588b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer)};
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            int i;
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1588b;
            Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            String str3 = null;
            if (decodingBeginStructure.decodeSequentially()) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                str = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, stringSerializer, null);
                str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, stringSerializer, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                String str4 = null;
                while (z) {
                    int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, str3);
                        i2 |= 1;
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new SerializationExceptions3(iDecodeElementIndex);
                        }
                        str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str4);
                        i2 |= 2;
                    }
                }
                i = i2;
                str = str3;
                str2 = str4;
            }
            decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C5925O3(i, str, str2);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1588b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C5925O3 value = (C5925O3) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1588b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            C5925O3.m1274a(value, encoding3BeginStructure, pluginGeneratedSerialDescriptor);
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public C5925O3() {
        this.f1585a = null;
        this.f1586b = null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final /* synthetic */ void m1274a(C5925O3 c5925o3, Encoding3 encoding3, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || c5925o3.f1585a != null) {
            encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, c5925o3.f1585a);
        }
        if (!encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) && c5925o3.f1586b == null) {
            return;
        }
        encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, c5925o3.f1586b);
    }

    /* renamed from: b */
    public final String m1276b() {
        return this.f1586b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5925O3)) {
            return false;
        }
        C5925O3 c5925o3 = (C5925O3) obj;
        return Intrinsics.areEqual(this.f1585a, c5925o3.f1585a) && Intrinsics.areEqual(this.f1586b, c5925o3.f1586b);
    }

    public final int hashCode() {
        String str = this.f1585a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1586b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "LocalizedLinkAccountResponseBalance(available=" + this.f1585a + ", current=" + this.f1586b + ")";
    }

    /* renamed from: a */
    public final String m1275a() {
        return this.f1585a;
    }

    @Deprecated
    public C5925O3(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f1585a = null;
        } else {
            this.f1585a = str;
        }
        if ((i & 2) == 0) {
            this.f1586b = null;
        } else {
            this.f1586b = str2;
        }
    }
}
