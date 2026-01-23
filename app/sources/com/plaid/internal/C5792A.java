package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* renamed from: com.plaid.internal.A */
/* loaded from: classes16.dex */
public final class C5792A implements Parcelable {
    public static final Parcelable.Creator<C5792A> CREATOR = new b();

    /* renamed from: a */
    public final String f1217a;

    /* renamed from: b */
    public final String f1218b;

    /* renamed from: c */
    public final long f1219c;

    @Deprecated
    /* renamed from: com.plaid.internal.A$a */
    public static final class a implements PluginHelperInterfaces<C5792A> {

        /* renamed from: a */
        public static final a f1220a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1221b;

        static {
            a aVar = new a();
            f1220a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.ChannelInfo", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("id", false);
            pluginGeneratedSerialDescriptor.addElement("secret", false);
            pluginGeneratedSerialDescriptor.addElement("polling_interval_ms", false);
            f1221b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, stringSerializer, LongSerializer.INSTANCE};
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            String strDecodeStringElement;
            int i;
            String strDecodeStringElement2;
            long jDecodeLongElement;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1221b;
            Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (decodingBeginStructure.decodeSequentially()) {
                strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                i = 7;
                strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                jDecodeLongElement = decodingBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 2);
            } else {
                strDecodeStringElement = null;
                boolean z = true;
                long jDecodeLongElement2 = 0;
                String strDecodeStringElement3 = null;
                int i2 = 0;
                while (z) {
                    int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i2 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new SerializationExceptions3(iDecodeElementIndex);
                        }
                        jDecodeLongElement2 = decodingBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 2);
                        i2 |= 4;
                    }
                }
                i = i2;
                strDecodeStringElement2 = strDecodeStringElement3;
                jDecodeLongElement = jDecodeLongElement2;
            }
            String str = strDecodeStringElement;
            decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C5792A(i, str, strDecodeStringElement2, jDecodeLongElement);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1221b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C5792A value = (C5792A) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1221b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1217a);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, value.f1218b);
            encoding3BeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 2, value.f1219c);
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.A$b */
    public static final class b implements Parcelable.Creator<C5792A> {
        @Override // android.os.Parcelable.Creator
        public final C5792A createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C5792A(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C5792A[] newArray(int i) {
            return new C5792A[i];
        }
    }

    @Deprecated
    public C5792A(int i, @SerialName("id") String str, @SerialName("secret") String str2, @SerialName("polling_interval_ms") long j) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, a.f1221b);
        }
        this.f1217a = str;
        this.f1218b = str2;
        this.f1219c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5792A)) {
            return false;
        }
        C5792A c5792a = (C5792A) obj;
        return Intrinsics.areEqual(this.f1217a, c5792a.f1217a) && Intrinsics.areEqual(this.f1218b, c5792a.f1218b) && this.f1219c == c5792a.f1219c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1219c) + C7246x.m1646a(this.f1218b, this.f1217a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ChannelInfo(channelId=" + this.f1217a + ", channelSecret=" + this.f1218b + ", pollingInterval=" + this.f1219c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f1217a);
        out.writeString(this.f1218b);
        out.writeLong(this.f1219c);
    }

    public C5792A(long j, String channelId, String channelSecret) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(channelSecret, "channelSecret");
        this.f1217a = channelId;
        this.f1218b = channelSecret;
        this.f1219c = j;
    }
}
