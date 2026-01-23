package com.plaid.internal;

import com.google.gson.annotations.SerializedName;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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
/* renamed from: com.plaid.internal.D1 */
/* loaded from: classes16.dex */
public final class C5821D1 {

    /* renamed from: c */
    public static final b f1316c = new b();

    /* renamed from: a */
    @SerializedName("name")
    private final String f1317a;

    /* renamed from: b */
    @SerializedName(InquiryField.FloatField.TYPE2)
    private final String f1318b;

    @Deprecated
    /* renamed from: com.plaid.internal.D1$a */
    public static final class a implements PluginHelperInterfaces<C5821D1> {

        /* renamed from: a */
        public static final a f1319a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1320b;

        static {
            a aVar = new a();
            f1319a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.url.LinkAccountResponseMeta", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("name", true);
            pluginGeneratedSerialDescriptor.addElement(InquiryField.FloatField.TYPE2, true);
            f1320b = pluginGeneratedSerialDescriptor;
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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1320b;
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
            return new C5821D1(i, str, str2);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1320b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C5821D1 value = (C5821D1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1320b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            C5821D1.m1171a(value, encoding3BeginStructure, pluginGeneratedSerialDescriptor);
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.D1$b */
    public static final class b {
    }

    public C5821D1() {
        this.f1317a = null;
        this.f1318b = null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final /* synthetic */ void m1171a(C5821D1 c5821d1, Encoding3 encoding3, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || c5821d1.f1317a != null) {
            encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, c5821d1.f1317a);
        }
        if (!encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) && c5821d1.f1318b == null) {
            return;
        }
        encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, c5821d1.f1318b);
    }

    /* renamed from: b */
    public final String m1173b() {
        return this.f1318b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5821D1)) {
            return false;
        }
        C5821D1 c5821d1 = (C5821D1) obj;
        return Intrinsics.areEqual(this.f1317a, c5821d1.f1317a) && Intrinsics.areEqual(this.f1318b, c5821d1.f1318b);
    }

    public final int hashCode() {
        String str = this.f1317a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1318b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "LinkAccountResponseMeta(name=" + this.f1317a + ", number=" + this.f1318b + ")";
    }

    /* renamed from: a */
    public final String m1172a() {
        return this.f1317a;
    }

    @Deprecated
    public C5821D1(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f1317a = null;
        } else {
            this.f1317a = str;
        }
        if ((i & 2) == 0) {
            this.f1318b = null;
        } else {
            this.f1318b = str2;
        }
    }
}
