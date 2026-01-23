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
/* renamed from: com.plaid.internal.I0 */
/* loaded from: classes16.dex */
public final class C5865I0 implements Parcelable {
    public static final Parcelable.Creator<C5865I0> CREATOR = new b();

    @Deprecated
    /* renamed from: com.plaid.internal.I0$a */
    public static final class a implements PluginHelperInterfaces<C5865I0> {

        /* renamed from: a */
        public static final a f1378a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1379b;

        static {
            a aVar = new a();
            f1378a = aVar;
            f1379b = new PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedOpenLinkActionLinkWithAccountNumbers", aVar, 0);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[0];
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            int iDecodeElementIndex;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1379b;
            Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (!decodingBeginStructure.decodeSequentially() && (iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor)) != -1) {
                throw new SerializationExceptions3(iDecodeElementIndex);
            }
            decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C5865I0(0);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1379b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C5865I0 value = (C5865I0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1379b;
            encoder.beginStructure(pluginGeneratedSerialDescriptor).endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.I0$b */
    public static final class b implements Parcelable.Creator<C5865I0> {
        @Override // android.os.Parcelable.Creator
        public final C5865I0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new C5865I0();
        }

        @Override // android.os.Parcelable.Creator
        public final C5865I0[] newArray(int i) {
            return new C5865I0[i];
        }
    }

    public C5865I0() {
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
    public C5865I0(int i) {
    }
}
