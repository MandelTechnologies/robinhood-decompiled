package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

@Serializable
/* renamed from: com.plaid.internal.H0 */
/* loaded from: classes16.dex */
public final class C5856H0 implements Parcelable {
    public static final Parcelable.Creator<C5856H0> CREATOR = new b();

    @Deprecated
    /* renamed from: com.plaid.internal.H0$a */
    public static final class a implements PluginHelperInterfaces<C5856H0> {

        /* renamed from: a */
        public static final a f1356a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1357b;

        static {
            a aVar = new a();
            f1356a = aVar;
            f1357b = new PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedOpenLinkActionDefault", aVar, 0);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[0];
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            int iDecodeElementIndex;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1357b;
            Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (!decodingBeginStructure.decodeSequentially() && (iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor)) != -1) {
                throw new SerializationExceptions3(iDecodeElementIndex);
            }
            decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C5856H0(0);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1357b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C5856H0 value = (C5856H0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1357b;
            encoder.beginStructure(pluginGeneratedSerialDescriptor).endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.H0$b */
    public static final class b implements Parcelable.Creator<C5856H0> {
        @Override // android.os.Parcelable.Creator
        public final C5856H0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new C5856H0();
        }

        @Override // android.os.Parcelable.Creator
        public final C5856H0[] newArray(int i) {
            return new C5856H0[i];
        }
    }

    public C5856H0() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(1);
    }

    @Deprecated
    public C5856H0(int i) {
    }
}
