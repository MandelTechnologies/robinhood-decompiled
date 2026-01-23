package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C5856H0;
import com.plaid.internal.C5865I0;
import com.plaid.internal.C5874J0;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* renamed from: com.plaid.internal.K0 */
/* loaded from: classes16.dex */
public final class C5883K0 implements Parcelable {
    public static final Parcelable.Creator<C5883K0> CREATOR = new b();

    /* renamed from: a */
    public final String f1416a;

    /* renamed from: b */
    public final C5856H0 f1417b;

    /* renamed from: c */
    public final C5874J0 f1418c;

    /* renamed from: d */
    public final C5865I0 f1419d;

    /* renamed from: e */
    public final boolean f1420e;

    @Deprecated
    /* renamed from: com.plaid.internal.K0$a */
    public static final class a implements PluginHelperInterfaces<C5883K0> {

        /* renamed from: a */
        public static final a f1421a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1422b;

        static {
            a aVar = new a();
            f1421a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedOpenLinkConfiguration", aVar, 5);
            pluginGeneratedSerialDescriptor.addElement("embedded_workflow_session_id", false);
            pluginGeneratedSerialDescriptor.addElement("open_link_action_default", true);
            pluginGeneratedSerialDescriptor.addElement("open_link_action_with_institution_id", true);
            pluginGeneratedSerialDescriptor.addElement("open_link_action_link_with_account_numbers", true);
            pluginGeneratedSerialDescriptor.addElement("is_polling", true);
            f1422b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializers.getNullable(C5856H0.a.f1356a), BuiltinSerializers.getNullable(C5874J0.a.f1390a), BuiltinSerializers.getNullable(C5865I0.a.f1378a), BooleanSerializer.INSTANCE};
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            boolean zDecodeBooleanElement;
            int i;
            String str;
            C5856H0 c5856h0;
            C5874J0 c5874j0;
            C5865I0 c5865i0;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1422b;
            Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (decodingBeginStructure.decodeSequentially()) {
                String strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                C5856H0 c5856h02 = (C5856H0) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C5856H0.a.f1356a, null);
                C5874J0 c5874j02 = (C5874J0) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, C5874J0.a.f1390a, null);
                str = strDecodeStringElement;
                c5865i0 = (C5865I0) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, C5865I0.a.f1378a, null);
                zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 4);
                c5874j0 = c5874j02;
                c5856h0 = c5856h02;
                i = 31;
            } else {
                boolean z = true;
                boolean zDecodeBooleanElement2 = false;
                String strDecodeStringElement2 = null;
                C5856H0 c5856h03 = null;
                C5874J0 c5874j03 = null;
                C5865I0 c5865i02 = null;
                int i2 = 0;
                while (z) {
                    int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        c5856h03 = (C5856H0) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C5856H0.a.f1356a, c5856h03);
                        i2 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        c5874j03 = (C5874J0) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, C5874J0.a.f1390a, c5874j03);
                        i2 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        c5865i02 = (C5865I0) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, C5865I0.a.f1378a, c5865i02);
                        i2 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new SerializationExceptions3(iDecodeElementIndex);
                        }
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 4);
                        i2 |= 16;
                    }
                }
                zDecodeBooleanElement = zDecodeBooleanElement2;
                i = i2;
                str = strDecodeStringElement2;
                c5856h0 = c5856h03;
                c5874j0 = c5874j03;
                c5865i0 = c5865i02;
            }
            decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C5883K0(i, str, c5856h0, c5874j0, c5865i0, zDecodeBooleanElement);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1422b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C5883K0 value = (C5883K0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1422b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1416a);
            if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || value.f1417b != null) {
                encoding3BeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C5856H0.a.f1356a, value.f1417b);
            }
            if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || value.f1418c != null) {
                encoding3BeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, C5874J0.a.f1390a, value.f1418c);
            }
            if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || value.f1419d != null) {
                encoding3BeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, C5865I0.a.f1378a, value.f1419d);
            }
            if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || value.f1420e) {
                encoding3BeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 4, value.f1420e);
            }
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.K0$b */
    public static final class b implements Parcelable.Creator<C5883K0> {
        @Override // android.os.Parcelable.Creator
        public final C5883K0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C5883K0(parcel.readString(), parcel.readInt() == 0 ? null : C5856H0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C5874J0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C5865I0.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final C5883K0[] newArray(int i) {
            return new C5883K0[i];
        }
    }

    @Deprecated
    public C5883K0(int i, @SerialName("embedded_workflow_session_id") String str, @SerialName("open_link_action_default") C5856H0 c5856h0, @SerialName("open_link_action_with_institution_id") C5874J0 c5874j0, @SerialName("open_link_action_link_with_account_numbers") C5865I0 c5865i0, @SerialName("is_polling") boolean z) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, a.f1422b);
        }
        this.f1416a = str;
        if ((i & 2) == 0) {
            this.f1417b = null;
        } else {
            this.f1417b = c5856h0;
        }
        if ((i & 4) == 0) {
            this.f1418c = null;
        } else {
            this.f1418c = c5874j0;
        }
        if ((i & 8) == 0) {
            this.f1419d = null;
        } else {
            this.f1419d = c5865i0;
        }
        if ((i & 16) == 0) {
            this.f1420e = false;
        } else {
            this.f1420e = z;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5883K0)) {
            return false;
        }
        C5883K0 c5883k0 = (C5883K0) obj;
        return Intrinsics.areEqual(this.f1416a, c5883k0.f1416a) && Intrinsics.areEqual(this.f1417b, c5883k0.f1417b) && Intrinsics.areEqual(this.f1418c, c5883k0.f1418c) && Intrinsics.areEqual(this.f1419d, c5883k0.f1419d) && this.f1420e == c5883k0.f1420e;
    }

    public final int hashCode() {
        int iHashCode = this.f1416a.hashCode() * 31;
        C5856H0 c5856h0 = this.f1417b;
        int iHashCode2 = (iHashCode + (c5856h0 == null ? 0 : c5856h0.hashCode())) * 31;
        C5874J0 c5874j0 = this.f1418c;
        int iHashCode3 = (iHashCode2 + (c5874j0 == null ? 0 : c5874j0.f1389a.hashCode())) * 31;
        C5865I0 c5865i0 = this.f1419d;
        return Boolean.hashCode(this.f1420e) + ((iHashCode3 + (c5865i0 != null ? c5865i0.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EmbeddedOpenLinkConfiguration(embeddedWorkflowSessionId=" + this.f1416a + ", openLinkActionDefault=" + this.f1417b + ", openLinkActionWithInstitutionId=" + this.f1418c + ", openLinkActionLinkWithAccountNumbers=" + this.f1419d + ", isPolling=" + this.f1420e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f1416a);
        if (this.f1417b == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
        C5874J0 c5874j0 = this.f1418c;
        if (c5874j0 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(c5874j0.f1389a);
        }
        if (this.f1419d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
        out.writeInt(this.f1420e ? 1 : 0);
    }

    public C5883K0(String embeddedWorkflowSessionId, C5856H0 c5856h0, C5874J0 c5874j0, C5865I0 c5865i0, boolean z) {
        Intrinsics.checkNotNullParameter(embeddedWorkflowSessionId, "embeddedWorkflowSessionId");
        this.f1416a = embeddedWorkflowSessionId;
        this.f1417b = c5856h0;
        this.f1418c = c5874j0;
        this.f1419d = c5865i0;
        this.f1420e = z;
    }
}
