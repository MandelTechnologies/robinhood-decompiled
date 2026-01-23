package com.plaid.internal;

import com.google.gson.annotations.SerializedName;
import com.plaid.internal.C5925O3;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* renamed from: com.plaid.internal.C1 */
/* loaded from: classes16.dex */
public final class C5812C1 {

    /* renamed from: a */
    @SerializedName("available")
    private final Double f1292a;

    /* renamed from: b */
    @SerializedName("current")
    private final Double f1293b;

    /* renamed from: c */
    @SerializedName("currency")
    private final String f1294c;

    /* renamed from: d */
    @SerializedName("localized")
    private final C5925O3 f1295d;

    @Deprecated
    /* renamed from: com.plaid.internal.C1$a */
    public static final class a implements PluginHelperInterfaces<C5812C1> {

        /* renamed from: a */
        public static final a f1296a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1297b;

        static {
            a aVar = new a();
            f1296a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.url.LinkAccountResponseBalance", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("available", true);
            pluginGeneratedSerialDescriptor.addElement("current", true);
            pluginGeneratedSerialDescriptor.addElement("currency", true);
            pluginGeneratedSerialDescriptor.addElement("localized", true);
            f1297b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializers.getNullable(doubleSerializer), BuiltinSerializers.getNullable(doubleSerializer), BuiltinSerializers.getNullable(StringSerializer.INSTANCE), BuiltinSerializers.getNullable(C5925O3.a.f1587a)};
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            int i;
            Double d;
            Double d2;
            String str;
            C5925O3 c5925o3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1297b;
            Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Double d3 = null;
            if (decodingBeginStructure.decodeSequentially()) {
                DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
                Double d4 = (Double) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, doubleSerializer, null);
                Double d5 = (Double) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, doubleSerializer, null);
                String str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, null);
                d2 = d5;
                c5925o3 = (C5925O3) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, C5925O3.a.f1587a, null);
                str = str2;
                i = 15;
                d = d4;
            } else {
                boolean z = true;
                int i2 = 0;
                Double d6 = null;
                String str3 = null;
                C5925O3 c5925o32 = null;
                while (z) {
                    int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        d3 = (Double) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, DoubleSerializer.INSTANCE, d3);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        d6 = (Double) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, DoubleSerializer.INSTANCE, d6);
                        i2 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str3);
                        i2 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new SerializationExceptions3(iDecodeElementIndex);
                        }
                        c5925o32 = (C5925O3) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, C5925O3.a.f1587a, c5925o32);
                        i2 |= 8;
                    }
                }
                i = i2;
                d = d3;
                d2 = d6;
                str = str3;
                c5925o3 = c5925o32;
            }
            decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C5812C1(i, d, d2, str, c5925o3);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1297b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C5812C1 value = (C5812C1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1297b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            C5812C1.m1160a(value, encoding3BeginStructure, pluginGeneratedSerialDescriptor);
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public C5812C1() {
        this.f1292a = null;
        this.f1293b = null;
        this.f1294c = null;
        this.f1295d = null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final /* synthetic */ void m1160a(C5812C1 c5812c1, Encoding3 encoding3, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || c5812c1.f1292a != null) {
            encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, DoubleSerializer.INSTANCE, c5812c1.f1292a);
        }
        if (encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || c5812c1.f1293b != null) {
            encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, DoubleSerializer.INSTANCE, c5812c1.f1293b);
        }
        if (encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || c5812c1.f1294c != null) {
            encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, c5812c1.f1294c);
        }
        if (!encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) && c5812c1.f1295d == null) {
            return;
        }
        encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, C5925O3.a.f1587a, c5812c1.f1295d);
    }

    /* renamed from: b */
    public final String m1162b() {
        return this.f1294c;
    }

    /* renamed from: c */
    public final Double m1163c() {
        return this.f1293b;
    }

    /* renamed from: d */
    public final C5925O3 m1164d() {
        return this.f1295d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5812C1)) {
            return false;
        }
        C5812C1 c5812c1 = (C5812C1) obj;
        return Intrinsics.areEqual((Object) this.f1292a, (Object) c5812c1.f1292a) && Intrinsics.areEqual((Object) this.f1293b, (Object) c5812c1.f1293b) && Intrinsics.areEqual(this.f1294c, c5812c1.f1294c) && Intrinsics.areEqual(this.f1295d, c5812c1.f1295d);
    }

    public final int hashCode() {
        Double d = this.f1292a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.f1293b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.f1294c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C5925O3 c5925o3 = this.f1295d;
        return iHashCode3 + (c5925o3 != null ? c5925o3.hashCode() : 0);
    }

    public final String toString() {
        return "LinkAccountResponseBalance(available=" + this.f1292a + ", current=" + this.f1293b + ", currency=" + this.f1294c + ", localized=" + this.f1295d + ")";
    }

    /* renamed from: a */
    public final Double m1161a() {
        return this.f1292a;
    }

    @Deprecated
    public C5812C1(int i, Double d, Double d2, String str, C5925O3 c5925o3) {
        if ((i & 1) == 0) {
            this.f1292a = null;
        } else {
            this.f1292a = d;
        }
        if ((i & 2) == 0) {
            this.f1293b = null;
        } else {
            this.f1293b = d2;
        }
        if ((i & 4) == 0) {
            this.f1294c = null;
        } else {
            this.f1294c = str;
        }
        if ((i & 8) == 0) {
            this.f1295d = null;
        } else {
            this.f1295d = c5925o3;
        }
    }
}
