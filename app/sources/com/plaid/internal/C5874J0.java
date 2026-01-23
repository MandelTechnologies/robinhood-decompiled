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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* renamed from: com.plaid.internal.J0 */
/* loaded from: classes16.dex */
public final class C5874J0 implements Parcelable {
    public static final Parcelable.Creator<C5874J0> CREATOR = new b();

    /* renamed from: a */
    public final String f1389a;

    @Deprecated
    /* renamed from: com.plaid.internal.J0$a */
    public static final class a implements PluginHelperInterfaces<C5874J0> {

        /* renamed from: a */
        public static final a f1390a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1391b;

        static {
            a aVar = new a();
            f1390a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedOpenLinkActionWithInstitutionId", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("institution_id", false);
            f1391b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE};
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            String strDecodeStringElement;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1391b;
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
            return new C5874J0(i, strDecodeStringElement);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1391b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C5874J0 value = (C5874J0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1391b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1389a);
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.J0$b */
    public static final class b implements Parcelable.Creator<C5874J0> {
        @Override // android.os.Parcelable.Creator
        public final C5874J0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C5874J0(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C5874J0[] newArray(int i) {
            return new C5874J0[i];
        }
    }

    @Deprecated
    public C5874J0(int i, @SerialName("institution_id") String str) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, a.f1391b);
        }
        this.f1389a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5874J0) && Intrinsics.areEqual(this.f1389a, ((C5874J0) obj).f1389a);
    }

    public final int hashCode() {
        return this.f1389a.hashCode();
    }

    public final String toString() {
        return "EmbeddedOpenLinkActionWithInstitutionId(institutionId=" + this.f1389a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f1389a);
    }

    public C5874J0(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f1389a = institutionId;
    }
}
