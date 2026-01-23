package com.plaid.internal;

import com.plaid.internal.C5792A;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* renamed from: com.plaid.internal.o4 */
/* loaded from: classes16.dex */
public final class C7169o4 {

    /* renamed from: a */
    public final int f3070a;

    /* renamed from: b */
    public final String f3071b;

    /* renamed from: c */
    public final String f3072c;

    /* renamed from: d */
    public final C5792A f3073d;

    @Deprecated
    /* renamed from: com.plaid.internal.o4$a */
    public static final class a implements PluginHelperInterfaces<C7169o4> {

        /* renamed from: a */
        public static final a f3074a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f3075b;

        static {
            a aVar = new a();
            f3074a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.url.OutOfProcessWebviewFallbackJson", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("mode", false);
            pluginGeneratedSerialDescriptor.addElement("url", false);
            pluginGeneratedSerialDescriptor.addElement("webview_fallback_id", false);
            pluginGeneratedSerialDescriptor.addElement("channel_from_webview", false);
            f3075b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{IntSerializer.INSTANCE, stringSerializer, stringSerializer, C5792A.a.f1220a};
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            int iDecodeIntElement;
            int i;
            String str;
            String str2;
            C5792A c5792a;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3075b;
            Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (decodingBeginStructure.decodeSequentially()) {
                iDecodeIntElement = decodingBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                String strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                c5792a = (C5792A) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, C5792A.a.f1220a, null);
                str2 = strDecodeStringElement2;
                str = strDecodeStringElement;
                i = 15;
            } else {
                boolean z = true;
                iDecodeIntElement = 0;
                String strDecodeStringElement3 = null;
                String strDecodeStringElement4 = null;
                C5792A c5792a2 = null;
                int i2 = 0;
                while (z) {
                    int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        iDecodeIntElement = decodingBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i2 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i2 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new SerializationExceptions3(iDecodeElementIndex);
                        }
                        c5792a2 = (C5792A) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, C5792A.a.f1220a, c5792a2);
                        i2 |= 8;
                    }
                }
                i = i2;
                str = strDecodeStringElement3;
                str2 = strDecodeStringElement4;
                c5792a = c5792a2;
            }
            int i3 = iDecodeIntElement;
            decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C7169o4(i, i3, str, str2, c5792a);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f3075b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C7169o4 value = (C7169o4) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3075b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            encoding3BeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 0, value.f3070a);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, value.f3071b);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, value.f3072c);
            encoding3BeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, C5792A.a.f1220a, value.f3073d);
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Deprecated
    public C7169o4(int i, @SerialName("mode") int i2, @SerialName("url") String str, @SerialName("webview_fallback_id") String str2, @SerialName("channel_from_webview") C5792A c5792a) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, a.f3075b);
        }
        this.f3070a = i2;
        this.f3071b = str;
        this.f3072c = str2;
        this.f3073d = c5792a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7169o4)) {
            return false;
        }
        C7169o4 c7169o4 = (C7169o4) obj;
        return this.f3070a == c7169o4.f3070a && Intrinsics.areEqual(this.f3071b, c7169o4.f3071b) && Intrinsics.areEqual(this.f3072c, c7169o4.f3072c) && Intrinsics.areEqual(this.f3073d, c7169o4.f3073d);
    }

    public final int hashCode() {
        return this.f3073d.hashCode() + C7246x.m1646a(this.f3072c, C7246x.m1646a(this.f3071b, Integer.hashCode(this.f3070a) * 31, 31), 31);
    }

    public final String toString() {
        return "OutOfProcessWebviewFallbackJson(mode=" + this.f3070a + ", url=" + this.f3071b + ", webviewFallbackId=" + this.f3072c + ", channelInfo=" + this.f3073d + ")";
    }
}
