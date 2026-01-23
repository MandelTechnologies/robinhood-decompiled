package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C5883K0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* renamed from: com.plaid.internal.L0 */
/* loaded from: classes16.dex */
public final class C5892L0 implements Parcelable {
    public static final Parcelable.Creator<C5892L0> CREATOR = new b();

    /* renamed from: j */
    @JvmField
    public static final KSerializer<Object>[] f1441j = {null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* renamed from: a */
    public final String f1442a;

    /* renamed from: b */
    public final String f1443b;

    /* renamed from: c */
    public final String f1444c;

    /* renamed from: d */
    public final String f1445d;

    /* renamed from: e */
    public final String f1446e;

    /* renamed from: f */
    public final boolean f1447f;

    /* renamed from: g */
    public final String f1448g;

    /* renamed from: h */
    public final C5883K0 f1449h;

    /* renamed from: i */
    public final List<String> f1450i;

    @Deprecated
    /* renamed from: com.plaid.internal.L0$a */
    public static final class a implements PluginHelperInterfaces<C5892L0> {

        /* renamed from: a */
        public static final a f1451a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1452b;

        static {
            a aVar = new a();
            f1451a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedSessionInfo", aVar, 9);
            pluginGeneratedSerialDescriptor.addElement("link_token", false);
            pluginGeneratedSerialDescriptor.addElement("link_open_id", false);
            pluginGeneratedSerialDescriptor.addElement("link_persistent_id", false);
            pluginGeneratedSerialDescriptor.addElement("institution_id", true);
            pluginGeneratedSerialDescriptor.addElement("webview_fallback_id", true);
            pluginGeneratedSerialDescriptor.addElement("enable_account_select", true);
            pluginGeneratedSerialDescriptor.addElement("embedded_workflow_session_id", true);
            pluginGeneratedSerialDescriptor.addElement("embedded_open_link_configuration", true);
            pluginGeneratedSerialDescriptor.addElement("web3_valid_chains", true);
            f1452b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = C5892L0.f1441j;
            KSerializer<?> nullable = BuiltinSerializers.getNullable(C5883K0.a.f1421a);
            KSerializer<?> kSerializer = kSerializerArr[8];
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, nullable, kSerializer};
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            boolean z;
            List list;
            C5883K0 c5883k0;
            int i;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1452b;
            Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            KSerializer<Object>[] kSerializerArr = C5892L0.f1441j;
            if (decodingBeginStructure.decodeSequentially()) {
                String strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 5);
                String strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                C5883K0 c5883k02 = (C5883K0) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, C5883K0.a.f1421a, null);
                list = (List) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], null);
                str = strDecodeStringElement;
                c5883k0 = c5883k02;
                str6 = strDecodeStringElement6;
                z = zDecodeBooleanElement;
                str4 = strDecodeStringElement4;
                str5 = strDecodeStringElement5;
                str3 = strDecodeStringElement3;
                i = 511;
                str2 = strDecodeStringElement2;
            } else {
                boolean z2 = true;
                boolean zDecodeBooleanElement2 = false;
                List list2 = null;
                String strDecodeStringElement7 = null;
                String strDecodeStringElement8 = null;
                String strDecodeStringElement9 = null;
                String strDecodeStringElement10 = null;
                String strDecodeStringElement11 = null;
                String strDecodeStringElement12 = null;
                int i2 = 0;
                C5883K0 c5883k03 = null;
                while (z2) {
                    int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z2 = false;
                            break;
                        case 0:
                            i2 |= 1;
                            strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            continue;
                        case 1:
                            i2 |= 2;
                            strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            continue;
                        case 2:
                            strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i2 |= 4;
                            continue;
                        case 3:
                            strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i2 |= 8;
                            break;
                        case 4:
                            strDecodeStringElement11 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                            i2 |= 16;
                            break;
                        case 5:
                            zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 5);
                            i2 |= 32;
                            break;
                        case 6:
                            strDecodeStringElement12 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                            i2 |= 64;
                            break;
                        case 7:
                            c5883k03 = (C5883K0) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, C5883K0.a.f1421a, c5883k03);
                            i2 |= 128;
                            break;
                        case 8:
                            list2 = (List) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list2);
                            i2 |= 256;
                            break;
                        default:
                            throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                }
                z = zDecodeBooleanElement2;
                list = list2;
                c5883k0 = c5883k03;
                i = i2;
                str = strDecodeStringElement7;
                str2 = strDecodeStringElement8;
                str3 = strDecodeStringElement9;
                str4 = strDecodeStringElement10;
                str5 = strDecodeStringElement11;
                str6 = strDecodeStringElement12;
            }
            decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C5892L0(i, str, str2, str3, str4, str5, z, str6, c5883k0, list);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1452b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C5892L0 value = (C5892L0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1452b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            KSerializer<Object>[] kSerializerArr = C5892L0.f1441j;
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1442a);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, value.f1443b);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, value.f1444c);
            if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(value.f1445d, "")) {
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, value.f1445d);
            }
            if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(value.f1446e, "")) {
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, value.f1446e);
            }
            if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || value.f1447f) {
                encoding3BeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 5, value.f1447f);
            }
            if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(value.f1448g, "")) {
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, value.f1448g);
            }
            if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || value.f1449h != null) {
                encoding3BeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, C5883K0.a.f1421a, value.f1449h);
            }
            if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8) || !Intrinsics.areEqual(value.f1450i, CollectionsKt.emptyList())) {
                encoding3BeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], value.f1450i);
            }
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.L0$b */
    public static final class b implements Parcelable.Creator<C5892L0> {
        @Override // android.os.Parcelable.Creator
        public final C5892L0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C5892L0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : C5883K0.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final C5892L0[] newArray(int i) {
            return new C5892L0[i];
        }
    }

    @Deprecated
    public C5892L0(int i, @SerialName("link_token") String str, @SerialName("link_open_id") String str2, @SerialName("link_persistent_id") String str3, @SerialName("institution_id") String str4, @SerialName("webview_fallback_id") String str5, @SerialName("enable_account_select") boolean z, @SerialName("embedded_workflow_session_id") String str6, @SerialName("embedded_open_link_configuration") C5883K0 c5883k0, @SerialName("web3_valid_chains") List list) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, a.f1452b);
        }
        this.f1442a = str;
        this.f1443b = str2;
        this.f1444c = str3;
        if ((i & 8) == 0) {
            this.f1445d = "";
        } else {
            this.f1445d = str4;
        }
        if ((i & 16) == 0) {
            this.f1446e = "";
        } else {
            this.f1446e = str5;
        }
        if ((i & 32) == 0) {
            this.f1447f = false;
        } else {
            this.f1447f = z;
        }
        if ((i & 64) == 0) {
            this.f1448g = "";
        } else {
            this.f1448g = str6;
        }
        if ((i & 128) == 0) {
            this.f1449h = null;
        } else {
            this.f1449h = c5883k0;
        }
        if ((i & 256) == 0) {
            this.f1450i = CollectionsKt.emptyList();
        } else {
            this.f1450i = list;
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
        if (!(obj instanceof C5892L0)) {
            return false;
        }
        C5892L0 c5892l0 = (C5892L0) obj;
        return Intrinsics.areEqual(this.f1442a, c5892l0.f1442a) && Intrinsics.areEqual(this.f1443b, c5892l0.f1443b) && Intrinsics.areEqual(this.f1444c, c5892l0.f1444c) && Intrinsics.areEqual(this.f1445d, c5892l0.f1445d) && Intrinsics.areEqual(this.f1446e, c5892l0.f1446e) && this.f1447f == c5892l0.f1447f && Intrinsics.areEqual(this.f1448g, c5892l0.f1448g) && Intrinsics.areEqual(this.f1449h, c5892l0.f1449h) && Intrinsics.areEqual(this.f1450i, c5892l0.f1450i);
    }

    public final int hashCode() {
        int iM1646a = C7246x.m1646a(this.f1448g, (Boolean.hashCode(this.f1447f) + C7246x.m1646a(this.f1446e, C7246x.m1646a(this.f1445d, C7246x.m1646a(this.f1444c, C7246x.m1646a(this.f1443b, this.f1442a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31);
        C5883K0 c5883k0 = this.f1449h;
        return this.f1450i.hashCode() + ((iM1646a + (c5883k0 == null ? 0 : c5883k0.hashCode())) * 31);
    }

    public final String toString() {
        return "EmbeddedSessionInfo(linkToken=" + this.f1442a + ", linkOpenId=" + this.f1443b + ", linkPersistentId=" + this.f1444c + ", institutionId=" + this.f1445d + ", webviewFallbackId=" + this.f1446e + ", enableAccountSelect=" + this.f1447f + ", embeddedWorkflowSessionId=" + this.f1448g + ", embeddedOpenLinkConfiguration=" + this.f1449h + ", web3ValidChains=" + this.f1450i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f1442a);
        out.writeString(this.f1443b);
        out.writeString(this.f1444c);
        out.writeString(this.f1445d);
        out.writeString(this.f1446e);
        out.writeInt(this.f1447f ? 1 : 0);
        out.writeString(this.f1448g);
        C5883K0 c5883k0 = this.f1449h;
        if (c5883k0 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c5883k0.writeToParcel(out, i);
        }
        out.writeStringList(this.f1450i);
    }

    public C5892L0(String linkToken, String linkOpenId, String linkPersistentId, String institutionId, String webviewFallbackId, boolean z, String embeddedWorkflowSessionId, C5883K0 c5883k0, ArrayList web3ValidChains) {
        Intrinsics.checkNotNullParameter(linkToken, "linkToken");
        Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
        Intrinsics.checkNotNullParameter(linkPersistentId, "linkPersistentId");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
        Intrinsics.checkNotNullParameter(embeddedWorkflowSessionId, "embeddedWorkflowSessionId");
        Intrinsics.checkNotNullParameter(web3ValidChains, "web3ValidChains");
        this.f1442a = linkToken;
        this.f1443b = linkOpenId;
        this.f1444c = linkPersistentId;
        this.f1445d = institutionId;
        this.f1446e = webviewFallbackId;
        this.f1447f = z;
        this.f1448g = embeddedWorkflowSessionId;
        this.f1449h = c5883k0;
        this.f1450i = web3ValidChains;
    }
}
