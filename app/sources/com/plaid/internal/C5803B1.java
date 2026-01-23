package com.plaid.internal;

import com.adjust.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.plaid.internal.C5812C1;
import com.plaid.internal.C5821D1;
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
/* renamed from: com.plaid.internal.B1 */
/* loaded from: classes16.dex */
public final class C5803B1 {

    /* renamed from: g */
    public static final b f1263g = new b();

    /* renamed from: a */
    @SerializedName("_id")
    private final String f1264a;

    /* renamed from: b */
    @SerializedName(Constants.REFERRER_API_META)
    private final C5821D1 f1265b;

    /* renamed from: c */
    @SerializedName("type")
    private final String f1266c;

    /* renamed from: d */
    @SerializedName("subtype")
    private final String f1267d;

    /* renamed from: e */
    @SerializedName("verification_status")
    private final String f1268e;

    /* renamed from: f */
    @SerializedName("balance")
    private final C5812C1 f1269f;

    @Deprecated
    /* renamed from: com.plaid.internal.B1$a */
    public static final class a implements PluginHelperInterfaces<C5803B1> {

        /* renamed from: a */
        public static final a f1270a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1271b;

        static {
            a aVar = new a();
            f1270a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.url.LinkAccountResponseAccount", aVar, 6);
            pluginGeneratedSerialDescriptor.addElement("_id", true);
            pluginGeneratedSerialDescriptor.addElement(Constants.REFERRER_API_META, true);
            pluginGeneratedSerialDescriptor.addElement("type", true);
            pluginGeneratedSerialDescriptor.addElement("subtype", true);
            pluginGeneratedSerialDescriptor.addElement("verification_status", true);
            pluginGeneratedSerialDescriptor.addElement("balance", true);
            f1271b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, BuiltinSerializers.getNullable(C5821D1.a.f1319a), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(C5812C1.a.f1296a)};
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            int i;
            String str;
            C5821D1 c5821d1;
            String str2;
            String str3;
            String str4;
            C5812C1 c5812c1;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1271b;
            Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            String strDecodeStringElement = null;
            if (decodingBeginStructure.decodeSequentially()) {
                String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                C5821D1 c5821d12 = (C5821D1) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C5821D1.a.f1319a, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
                String str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
                String str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, stringSerializer, null);
                str = strDecodeStringElement2;
                c5812c1 = (C5812C1) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, C5812C1.a.f1296a, null);
                str3 = str6;
                str4 = str7;
                str2 = str5;
                c5821d1 = c5821d12;
                i = 63;
            } else {
                boolean z = true;
                int i2 = 0;
                C5821D1 c5821d13 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                C5812C1 c5812c12 = null;
                while (z) {
                    int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z = false;
                            continue;
                        case 0:
                            strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                            continue;
                        case 1:
                            c5821d13 = (C5821D1) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C5821D1.a.f1319a, c5821d13);
                            i2 |= 2;
                            break;
                        case 2:
                            str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str8);
                            i2 |= 4;
                            break;
                        case 3:
                            str9 = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, str9);
                            i2 |= 8;
                            break;
                        case 4:
                            str10 = (String) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, str10);
                            i2 |= 16;
                            break;
                        case 5:
                            c5812c12 = (C5812C1) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, C5812C1.a.f1296a, c5812c12);
                            i2 |= 32;
                            break;
                        default:
                            throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                }
                i = i2;
                str = strDecodeStringElement;
                c5821d1 = c5821d13;
                str2 = str8;
                str3 = str9;
                str4 = str10;
                c5812c1 = c5812c12;
            }
            decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C5803B1(i, str, c5821d1, str2, str3, str4, c5812c1);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1271b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C5803B1 value = (C5803B1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1271b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            C5803B1.m1145a(value, encoding3BeginStructure, pluginGeneratedSerialDescriptor);
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.B1$b */
    public static final class b {
        /* renamed from: a */
        public static void m1152a() {
            a aVar = a.f1270a;
        }
    }

    @Deprecated
    public C5803B1(int i, String str, C5821D1 c5821d1, String str2, String str3, String str4, C5812C1 c5812c1) {
        this.f1264a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f1265b = null;
        } else {
            this.f1265b = c5821d1;
        }
        if ((i & 4) == 0) {
            this.f1266c = null;
        } else {
            this.f1266c = str2;
        }
        if ((i & 8) == 0) {
            this.f1267d = null;
        } else {
            this.f1267d = str3;
        }
        if ((i & 16) == 0) {
            this.f1268e = null;
        } else {
            this.f1268e = str4;
        }
        if ((i & 32) == 0) {
            this.f1269f = null;
        } else {
            this.f1269f = c5812c1;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final /* synthetic */ void m1145a(C5803B1 c5803b1, Encoding3 encoding3, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(c5803b1.f1264a, "")) {
            encoding3.encodeStringElement(pluginGeneratedSerialDescriptor, 0, c5803b1.f1264a);
        }
        if (encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || c5803b1.f1265b != null) {
            encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C5821D1.a.f1319a, c5803b1.f1265b);
        }
        if (encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || c5803b1.f1266c != null) {
            encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, c5803b1.f1266c);
        }
        if (encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || c5803b1.f1267d != null) {
            encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, c5803b1.f1267d);
        }
        if (encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || c5803b1.f1268e != null) {
            encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, c5803b1.f1268e);
        }
        if (!encoding3.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) && c5803b1.f1269f == null) {
            return;
        }
        encoding3.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, C5812C1.a.f1296a, c5803b1.f1269f);
    }

    /* renamed from: b */
    public final C5821D1 m1147b() {
        return this.f1265b;
    }

    /* renamed from: c */
    public final String m1148c() {
        return this.f1267d;
    }

    /* renamed from: d */
    public final String m1149d() {
        return this.f1266c;
    }

    /* renamed from: e */
    public final String m1150e() {
        return this.f1268e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5803B1)) {
            return false;
        }
        C5803B1 c5803b1 = (C5803B1) obj;
        return Intrinsics.areEqual(this.f1264a, c5803b1.f1264a) && Intrinsics.areEqual(this.f1265b, c5803b1.f1265b) && Intrinsics.areEqual(this.f1266c, c5803b1.f1266c) && Intrinsics.areEqual(this.f1267d, c5803b1.f1267d) && Intrinsics.areEqual(this.f1268e, c5803b1.f1268e) && Intrinsics.areEqual(this.f1269f, c5803b1.f1269f);
    }

    /* renamed from: f */
    public final String m1151f() {
        return this.f1264a;
    }

    public final int hashCode() {
        int iHashCode = this.f1264a.hashCode() * 31;
        C5821D1 c5821d1 = this.f1265b;
        int iHashCode2 = (iHashCode + (c5821d1 == null ? 0 : c5821d1.hashCode())) * 31;
        String str = this.f1266c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1267d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1268e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C5812C1 c5812c1 = this.f1269f;
        return iHashCode5 + (c5812c1 != null ? c5812c1.hashCode() : 0);
    }

    public final String toString() {
        return "LinkAccountResponseAccount(_id=" + this.f1264a + ", meta=" + this.f1265b + ", type=" + this.f1266c + ", subtype=" + this.f1267d + ", verification_status=" + this.f1268e + ", balance=" + this.f1269f + ")";
    }

    public C5803B1() {
        Intrinsics.checkNotNullParameter("", "_id");
        this.f1264a = "";
        this.f1265b = null;
        this.f1266c = null;
        this.f1267d = null;
        this.f1268e = null;
        this.f1269f = null;
    }

    /* renamed from: a */
    public final C5812C1 m1146a() {
        return this.f1269f;
    }
}
