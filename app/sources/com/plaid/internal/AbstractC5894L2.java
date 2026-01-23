package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C5792A;
import com.plaid.internal.C5892L0;
import com.plaid.internal.C6009X7;
import com.plaid.internal.EnumC5880J6;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.SealedSerializer;
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
import kotlinx.serialization.internal.Enums3;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

@Polymorphic
@Serializable
/* renamed from: com.plaid.internal.L2 */
/* loaded from: classes16.dex */
public abstract class AbstractC5894L2 implements Parcelable {

    /* renamed from: a */
    public static final Lazy<KSerializer<Object>> f1455a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, c.f1467a);

    /* renamed from: com.plaid.internal.L2$c */
    public static final class c extends Lambda implements Function0<KSerializer<Object>> {

        /* renamed from: a */
        public static final c f1467a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("com.plaid.internal.workflow.model.LinkState", Reflection.getOrCreateKotlinClass(AbstractC5894L2.class), new KClass[]{Reflection.getOrCreateKotlinClass(a.class), Reflection.getOrCreateKotlinClass(b.class), Reflection.getOrCreateKotlinClass(d.class), Reflection.getOrCreateKotlinClass(e.class), Reflection.getOrCreateKotlinClass(i.class), Reflection.getOrCreateKotlinClass(j.class), Reflection.getOrCreateKotlinClass(k.class), Reflection.getOrCreateKotlinClass(l.class)}, new KSerializer[]{a.C49487a.f1459a, b.a.f1465a, d.a.f1472a, e.a.f1477a, i.a.f1490a, new ObjectSerializer("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", j.f1492b, new Annotation[0]), k.a.f1507a, l.a.f1518a}, new Annotation[0]);
        }
    }

    /* renamed from: com.plaid.internal.L2$f */
    public interface f {
        /* renamed from: b */
        String mo1240b();

        /* renamed from: d */
        List<C6009X7> mo1241d();

        /* renamed from: e */
        C6009X7 mo1242e();
    }

    /* renamed from: com.plaid.internal.L2$g */
    public interface g {
        /* renamed from: a */
        String mo1236a();
    }

    /* renamed from: com.plaid.internal.L2$h */
    public interface h {
        /* renamed from: c */
        String mo1237c();
    }

    @Serializable
    /* renamed from: com.plaid.internal.L2$j */
    public static final class j extends AbstractC5894L2 {
        public static final Parcelable.Creator<j> CREATOR;

        /* renamed from: b */
        public static final j f1492b = new j();

        /* renamed from: c */
        public static final String f1493c = "";

        /* renamed from: d */
        public static final String f1494d = "";

        /* renamed from: com.plaid.internal.L2$j$a */
        public static final class a extends Lambda implements Function0<KSerializer<Object>> {

            /* renamed from: a */
            public static final a f1495a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", j.f1492b, new Annotation[0]);
            }
        }

        /* renamed from: com.plaid.internal.L2$j$b */
        public static final class b implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            public final j createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return j.f1492b;
            }

            @Override // android.os.Parcelable.Creator
            public final j[] newArray(int i) {
                return new j[i];
            }
        }

        static {
            LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, a.f1495a);
            CREATOR = new b();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: g */
        public final String mo1234g() {
            return f1493c;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: h */
        public final String mo1235h() {
            return f1494d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    public AbstractC5894L2() {
    }

    /* renamed from: f */
    public final C6009X7 m1233f() {
        if (this instanceof a) {
            C6009X7.CREATOR.getClass();
            return C6009X7.f1833e;
        }
        if (this instanceof b) {
            C6009X7.CREATOR.getClass();
            return C6009X7.f1833e;
        }
        if (this instanceof l) {
            return ((l) this).f1514f;
        }
        if (this instanceof i) {
            return ((i) this).f1481c;
        }
        if (Intrinsics.areEqual(this, j.f1492b)) {
            C6009X7.CREATOR.getClass();
            return C6009X7.f1833e;
        }
        if (this instanceof e) {
            C6009X7.CREATOR.getClass();
            return C6009X7.f1833e;
        }
        if (this instanceof k) {
            C6009X7.CREATOR.getClass();
            return C6009X7.f1833e;
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        C6009X7.CREATOR.getClass();
        return C6009X7.f1833e;
    }

    /* renamed from: g */
    public abstract String mo1234g();

    /* renamed from: h */
    public abstract String mo1235h();

    @Deprecated
    public /* synthetic */ AbstractC5894L2(int i2) {
    }

    @Serializable
    /* renamed from: com.plaid.internal.L2$d */
    public static final class d extends AbstractC5894L2 implements h {
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* renamed from: b */
        public final String f1468b;

        /* renamed from: c */
        public final String f1469c;

        /* renamed from: d */
        public final String f1470d;

        /* renamed from: e */
        public final boolean f1471e;

        @Deprecated
        /* renamed from: com.plaid.internal.L2$d$a */
        public static final class a implements PluginHelperInterfaces<d> {

            /* renamed from: a */
            public static final a f1472a;

            /* renamed from: b */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f1473b;

            static {
                a aVar = new a();
                f1472a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.CompleteOutOfProcess", aVar, 4);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                pluginGeneratedSerialDescriptor.addElement("userClosedOutOfProcess", false);
                f1473b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] childSerializers() {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE};
            }

            @Override // kotlinx.serialization.KSerializer2
            public final Object deserialize(Decoding2 decoder) {
                String strDecodeStringElement;
                boolean zDecodeBooleanElement;
                String str;
                String str2;
                int i;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1473b;
                Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                if (decodingBeginStructure.decodeSequentially()) {
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 3);
                    str = strDecodeStringElement3;
                    str2 = strDecodeStringElement2;
                    i = 15;
                } else {
                    strDecodeStringElement = null;
                    String strDecodeStringElement4 = null;
                    String strDecodeStringElement5 = null;
                    boolean z = true;
                    boolean zDecodeBooleanElement2 = false;
                    int i2 = 0;
                    while (z) {
                        int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z = false;
                        } else if (iDecodeElementIndex == 0) {
                            strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i2 |= 2;
                        } else if (iDecodeElementIndex == 2) {
                            strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i2 |= 4;
                        } else {
                            if (iDecodeElementIndex != 3) {
                                throw new SerializationExceptions3(iDecodeElementIndex);
                            }
                            zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 3);
                            i2 |= 8;
                        }
                    }
                    zDecodeBooleanElement = zDecodeBooleanElement2;
                    str = strDecodeStringElement4;
                    str2 = strDecodeStringElement5;
                    i = i2;
                }
                String str3 = strDecodeStringElement;
                decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new d(i, str3, str2, str, zDecodeBooleanElement);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public final SerialDescriptor getDescriptor() {
                return f1473b;
            }

            @Override // kotlinx.serialization.KSerializer3
            public final void serialize(Encoding4 encoder, Object obj) {
                d value = (d) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1473b;
                Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1468b);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, value.f1469c);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, value.f1470d);
                encoding3BeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 3, value.f1471e);
                encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] typeParametersSerializers() {
                return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* renamed from: com.plaid.internal.L2$d$b */
        public static final class b implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        public d(String linkOpenId, String workflowId, String requestId, boolean z) {
            Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.f1468b = linkOpenId;
            this.f1469c = workflowId;
            this.f1470d = requestId;
            this.f1471e = z;
        }

        @Override // com.plaid.internal.AbstractC5894L2.h
        /* renamed from: c */
        public final String mo1237c() {
            return this.f1470d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: g */
        public final String mo1234g() {
            return this.f1468b;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: h */
        public final String mo1235h() {
            return this.f1469c;
        }

        /* renamed from: i */
        public final boolean m1238i() {
            return this.f1471e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f1468b);
            out.writeString(this.f1469c);
            out.writeString(this.f1470d);
            out.writeInt(this.f1471e ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public d(int i, String str, String str2, String str3, boolean z) {
            super(0);
            if (15 != (i & 15)) {
                PluginExceptions.throwMissingFieldException(i, 15, a.f1473b);
            }
            this.f1468b = str;
            this.f1469c = str2;
            this.f1470d = str3;
            this.f1471e = z;
        }
    }

    @Serializable
    /* renamed from: com.plaid.internal.L2$a */
    public static final class a extends AbstractC5894L2 {
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: b */
        public final C5892L0 f1456b;

        /* renamed from: c */
        public final String f1457c;

        /* renamed from: d */
        public final String f1458d;

        @Deprecated
        /* renamed from: com.plaid.internal.L2$a$a, reason: collision with other inner class name */
        public static final class C49487a implements PluginHelperInterfaces<a> {

            /* renamed from: a */
            public static final C49487a f1459a;

            /* renamed from: b */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f1460b;

            static {
                C49487a c49487a = new C49487a();
                f1459a = c49487a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.BeforeEmbeddedTransition", c49487a, 3);
                pluginGeneratedSerialDescriptor.addElement("embeddedSessionInfo", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", true);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", true);
                f1460b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] childSerializers() {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{C5892L0.a.f1451a, stringSerializer, stringSerializer};
            }

            @Override // kotlinx.serialization.KSerializer2
            public final Object deserialize(Decoding2 decoder) {
                int i;
                C5892L0 c5892l0;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1460b;
                Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                C5892L0 c5892l02 = null;
                if (decodingBeginStructure.decodeSequentially()) {
                    c5892l0 = (C5892L0) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, C5892L0.a.f1451a, null);
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i = 7;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    String strDecodeStringElement3 = null;
                    String strDecodeStringElement4 = null;
                    while (z) {
                        int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z = false;
                        } else if (iDecodeElementIndex == 0) {
                            c5892l02 = (C5892L0) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, C5892L0.a.f1451a, c5892l02);
                            i2 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i2 |= 2;
                        } else {
                            if (iDecodeElementIndex != 2) {
                                throw new SerializationExceptions3(iDecodeElementIndex);
                            }
                            strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i2 |= 4;
                        }
                    }
                    i = i2;
                    c5892l0 = c5892l02;
                    strDecodeStringElement = strDecodeStringElement3;
                    strDecodeStringElement2 = strDecodeStringElement4;
                }
                decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new a(i, c5892l0, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public final SerialDescriptor getDescriptor() {
                return f1460b;
            }

            @Override // kotlinx.serialization.KSerializer3
            public final void serialize(Encoding4 encoder, Object obj) {
                a value = (a) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1460b;
                Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                Parcelable.Creator<a> creator = a.CREATOR;
                encoding3BeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, C5892L0.a.f1451a, value.f1456b);
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(value.f1457c, "")) {
                    encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, value.f1457c);
                }
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(value.f1458d, value.f1456b.f1443b)) {
                    encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, value.f1458d);
                }
                encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] typeParametersSerializers() {
                return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* renamed from: com.plaid.internal.L2$a$b */
        public static final class b implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(C5892L0.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(C5892L0 embeddedSessionInfo) {
            Intrinsics.checkNotNullParameter(embeddedSessionInfo, "embeddedSessionInfo");
            this.f1456b = embeddedSessionInfo;
            this.f1457c = "";
            this.f1458d = embeddedSessionInfo.f1443b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f1456b, ((a) obj).f1456b);
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: g */
        public final String mo1234g() {
            return this.f1458d;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: h */
        public final String mo1235h() {
            return this.f1457c;
        }

        public final int hashCode() {
            return this.f1456b.hashCode();
        }

        public final String toString() {
            return "BeforeEmbeddedTransition(embeddedSessionInfo=" + this.f1456b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f1456b.writeToParcel(out, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public a(int i, C5892L0 c5892l0, String str, String str2) {
            super(0);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, C49487a.f1460b);
            }
            this.f1456b = c5892l0;
            this.f1457c = (i & 2) == 0 ? "" : str;
            if ((i & 4) == 0) {
                this.f1458d = c5892l0.f1443b;
            } else {
                this.f1458d = str2;
            }
        }
    }

    @Serializable
    /* renamed from: com.plaid.internal.L2$b */
    public static final class b extends AbstractC5894L2 implements g {
        public static final Parcelable.Creator<b> CREATOR = new C49488b();

        /* renamed from: b */
        public final String f1461b;

        /* renamed from: c */
        public final LinkTokenConfiguration f1462c;

        /* renamed from: d */
        public final String f1463d;

        /* renamed from: e */
        public final String f1464e;

        @Deprecated
        /* renamed from: com.plaid.internal.L2$b$a */
        public static final class a implements PluginHelperInterfaces<b> {

            /* renamed from: a */
            public static final a f1465a;

            /* renamed from: b */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f1466b;

            static {
                a aVar = new a();
                f1465a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.BeforeLinkOpen", aVar, 3);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", true);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", true);
                f1466b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] childSerializers() {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer};
            }

            @Override // kotlinx.serialization.KSerializer2
            public final Object deserialize(Decoding2 decoder) {
                String strDecodeStringElement;
                String strDecodeStringElement2;
                String strDecodeStringElement3;
                int i;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1466b;
                Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                if (decodingBeginStructure.decodeSequentially()) {
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i = 7;
                } else {
                    strDecodeStringElement = null;
                    String strDecodeStringElement4 = null;
                    String strDecodeStringElement5 = null;
                    boolean z = true;
                    int i2 = 0;
                    while (z) {
                        int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z = false;
                        } else if (iDecodeElementIndex == 0) {
                            strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i2 |= 2;
                        } else {
                            if (iDecodeElementIndex != 2) {
                                throw new SerializationExceptions3(iDecodeElementIndex);
                            }
                            strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i2 |= 4;
                        }
                    }
                    strDecodeStringElement2 = strDecodeStringElement4;
                    strDecodeStringElement3 = strDecodeStringElement5;
                    i = i2;
                }
                decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new b(i, strDecodeStringElement, strDecodeStringElement3, strDecodeStringElement2);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public final SerialDescriptor getDescriptor() {
                return f1466b;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
            @Override // kotlinx.serialization.KSerializer3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void serialize(Encoding4 encoder, Object obj) {
                b value = (b) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1466b;
                Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1461b);
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(value.f1463d, "")) {
                    encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, value.f1463d);
                }
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2)) {
                    encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, value.f1464e);
                } else {
                    String str = value.f1464e;
                    String string2 = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    if (!Intrinsics.areEqual(str, string2)) {
                    }
                }
                encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] typeParametersSerializers() {
                return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* renamed from: com.plaid.internal.L2$b$b, reason: collision with other inner class name */
        public static final class C49488b implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readString(), LinkTokenConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(String linkOpenId, LinkTokenConfiguration configuration) {
            Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f1461b = linkOpenId;
            this.f1462c = configuration;
            this.f1463d = "";
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.f1464e = string2;
        }

        @Override // com.plaid.internal.AbstractC5894L2.g
        /* renamed from: a */
        public final String mo1236a() {
            return this.f1464e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f1461b, bVar.f1461b) && Intrinsics.areEqual(this.f1462c, bVar.f1462c);
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: g */
        public final String mo1234g() {
            return this.f1461b;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: h */
        public final String mo1235h() {
            return this.f1463d;
        }

        public final int hashCode() {
            return this.f1462c.hashCode() + (this.f1461b.hashCode() * 31);
        }

        public final String toString() {
            return "BeforeLinkOpen(linkOpenId=" + this.f1461b + ", configuration=" + this.f1462c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f1461b);
            this.f1462c.writeToParcel(out, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public b(int i, String str, String str2, String str3) {
            super(0);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, a.f1466b);
            }
            this.f1461b = str;
            this.f1462c = new LinkTokenConfiguration.Builder().build();
            if ((i & 2) == 0) {
                this.f1463d = "";
            } else {
                this.f1463d = str2;
            }
            if ((i & 4) != 0) {
                this.f1464e = str3;
                return;
            }
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.f1464e = string2;
        }
    }

    @Serializable
    /* renamed from: com.plaid.internal.L2$e */
    public static final class e extends AbstractC5894L2 {
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* renamed from: b */
        public final String f1474b;

        /* renamed from: c */
        public final LinkExit f1475c;

        /* renamed from: d */
        public final String f1476d;

        @Deprecated
        /* renamed from: com.plaid.internal.L2$e$a */
        public static final class a implements PluginHelperInterfaces<e> {

            /* renamed from: a */
            public static final a f1477a;

            /* renamed from: b */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f1478b;

            static {
                a aVar = new a();
                f1477a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.Exit", aVar, 2);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", true);
                f1478b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] childSerializers() {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer};
            }

            @Override // kotlinx.serialization.KSerializer2
            public final Object deserialize(Decoding2 decoder) {
                String strDecodeStringElement;
                String strDecodeStringElement2;
                int i;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1478b;
                Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                if (decodingBeginStructure.decodeSequentially()) {
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i = 3;
                } else {
                    strDecodeStringElement = null;
                    String strDecodeStringElement3 = null;
                    boolean z = true;
                    int i2 = 0;
                    while (z) {
                        int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z = false;
                        } else if (iDecodeElementIndex == 0) {
                            strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        } else {
                            if (iDecodeElementIndex != 1) {
                                throw new SerializationExceptions3(iDecodeElementIndex);
                            }
                            strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i2 |= 2;
                        }
                    }
                    strDecodeStringElement2 = strDecodeStringElement3;
                    i = i2;
                }
                decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new e(i, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public final SerialDescriptor getDescriptor() {
                return f1478b;
            }

            @Override // kotlinx.serialization.KSerializer3
            public final void serialize(Encoding4 encoder, Object obj) {
                e value = (e) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1478b;
                Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1474b);
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(value.f1476d, "")) {
                    encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, value.f1476d);
                }
                encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] typeParametersSerializers() {
                return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* renamed from: com.plaid.internal.L2$e$b */
        public static final class b implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new e(parcel.readString(), LinkExit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(String workflowId, LinkExit linkExit) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(linkExit, "linkExit");
            this.f1474b = workflowId;
            this.f1475c = linkExit;
            this.f1476d = "";
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f1474b, eVar.f1474b) && Intrinsics.areEqual(this.f1475c, eVar.f1475c);
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: g */
        public final String mo1234g() {
            return this.f1476d;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: h */
        public final String mo1235h() {
            return this.f1474b;
        }

        public final int hashCode() {
            return this.f1475c.hashCode() + (this.f1474b.hashCode() * 31);
        }

        /* renamed from: i */
        public final LinkExit m1239i() {
            return this.f1475c;
        }

        public final String toString() {
            return "Exit(workflowId=" + this.f1474b + ", linkExit=" + this.f1475c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f1474b);
            this.f1475c.writeToParcel(out, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public e(int i, String str, String str2) {
            super(0);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, a.f1478b);
            }
            this.f1474b = str;
            LinkExitMetadata metadata = C5876J2.m1222a(31, (String) null);
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.f1475c = new LinkExit(null, metadata);
            if ((i & 2) == 0) {
                this.f1476d = "";
            } else {
                this.f1476d = str2;
            }
        }
    }

    @Serializable
    /* renamed from: com.plaid.internal.L2$l */
    public static final class l extends AbstractC5894L2 implements f, h, g {
        public static final Parcelable.Creator<l> CREATOR = new b();

        /* renamed from: j */
        @JvmField
        public static final KSerializer<Object>[] f1509j;

        /* renamed from: b */
        public final String f1510b;

        /* renamed from: c */
        public final String f1511c;

        /* renamed from: d */
        public final String f1512d;

        /* renamed from: e */
        public final String f1513e;

        /* renamed from: f */
        public final C6009X7 f1514f;

        /* renamed from: g */
        public final List<C6009X7> f1515g;

        /* renamed from: h */
        public final List<C6009X7> f1516h;

        /* renamed from: i */
        public final String f1517i;

        @Deprecated
        /* renamed from: com.plaid.internal.L2$l$a */
        public static final class a implements PluginHelperInterfaces<l> {

            /* renamed from: a */
            public static final a f1518a;

            /* renamed from: b */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f1519b;

            static {
                a aVar = new a();
                f1518a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.Workflow", aVar, 8);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("continuationToken", false);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", false);
                pluginGeneratedSerialDescriptor.addElement("currentPane", false);
                pluginGeneratedSerialDescriptor.addElement("additionalPanes", false);
                pluginGeneratedSerialDescriptor.addElement("backstack", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                f1519b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?>[] kSerializerArr = l.f1509j;
                KSerializer<?> kSerializer = kSerializerArr[5];
                KSerializer<?> kSerializer2 = kSerializerArr[6];
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, C6009X7.a.f1838a, kSerializer, kSerializer2, stringSerializer};
            }

            @Override // kotlinx.serialization.KSerializer2
            public final Object deserialize(Decoding2 decoder) {
                int i;
                List list;
                List list2;
                C6009X7 c6009x7;
                String str;
                String str2;
                String str3;
                String str4;
                String strDecodeStringElement;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1519b;
                Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                KSerializer<Object>[] kSerializerArr = l.f1509j;
                String strDecodeStringElement2 = null;
                if (decodingBeginStructure.decodeSequentially()) {
                    String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    String strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    C6009X7 c6009x72 = (C6009X7) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, C6009X7.a.f1838a, null);
                    List list3 = (List) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], null);
                    list = (List) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], null);
                    str = strDecodeStringElement3;
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                    str4 = strDecodeStringElement6;
                    c6009x7 = c6009x72;
                    str3 = strDecodeStringElement5;
                    i = 255;
                    list2 = list3;
                    str2 = strDecodeStringElement4;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    List list4 = null;
                    List list5 = null;
                    C6009X7 c6009x73 = null;
                    String strDecodeStringElement7 = null;
                    String strDecodeStringElement8 = null;
                    String strDecodeStringElement9 = null;
                    String strDecodeStringElement10 = null;
                    while (z) {
                        int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z = false;
                                break;
                            case 0:
                                i2 |= 1;
                                strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                continue;
                            case 1:
                                i2 |= 2;
                                strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                continue;
                            case 2:
                                i2 |= 4;
                                strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                continue;
                            case 3:
                                strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i2 |= 8;
                                continue;
                            case 4:
                                c6009x73 = (C6009X7) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, C6009X7.a.f1838a, c6009x73);
                                i2 |= 16;
                                break;
                            case 5:
                                list5 = (List) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list5);
                                i2 |= 32;
                                break;
                            case 6:
                                list4 = (List) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list4);
                                i2 |= 64;
                                break;
                            case 7:
                                strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                                i2 |= 128;
                                break;
                            default:
                                throw new SerializationExceptions3(iDecodeElementIndex);
                        }
                    }
                    i = i2;
                    list = list4;
                    list2 = list5;
                    c6009x7 = c6009x73;
                    str = strDecodeStringElement2;
                    str2 = strDecodeStringElement7;
                    str3 = strDecodeStringElement8;
                    str4 = strDecodeStringElement9;
                    strDecodeStringElement = strDecodeStringElement10;
                }
                decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new l(i, str, str2, str3, str4, c6009x7, list2, list, strDecodeStringElement);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public final SerialDescriptor getDescriptor() {
                return f1519b;
            }

            @Override // kotlinx.serialization.KSerializer3
            public final void serialize(Encoding4 encoder, Object obj) {
                l value = (l) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1519b;
                Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                KSerializer<Object>[] kSerializerArr = l.f1509j;
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1510b);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, value.f1511c);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, value.f1512d);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, value.f1513e);
                encoding3BeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 4, C6009X7.a.f1838a, value.f1514f);
                encoding3BeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], value.f1515g);
                encoding3BeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], value.f1516h);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 7, value.f1517i);
                encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] typeParametersSerializers() {
                return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* renamed from: com.plaid.internal.L2$l$b */
        public static final class b implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                C6009X7 c6009x7 = (C6009X7) parcel.readParcelable(l.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(l.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(l.class.getClassLoader()));
                }
                return new l(string2, string3, string4, string5, c6009x7, arrayList, arrayList2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i) {
                return new l[i];
            }
        }

        static {
            C6009X7.a aVar = C6009X7.a.f1838a;
            f1509j = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(aVar), new ArrayListSerializer(aVar), null};
        }

        public l(String linkOpenId, String workflowId, String continuationToken, String oauthNonce, C6009X7 currentPane, List<C6009X7> additionalPanes, List<C6009X7> backstack, String requestId) {
            Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(continuationToken, "continuationToken");
            Intrinsics.checkNotNullParameter(oauthNonce, "oauthNonce");
            Intrinsics.checkNotNullParameter(currentPane, "currentPane");
            Intrinsics.checkNotNullParameter(additionalPanes, "additionalPanes");
            Intrinsics.checkNotNullParameter(backstack, "backstack");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.f1510b = linkOpenId;
            this.f1511c = workflowId;
            this.f1512d = continuationToken;
            this.f1513e = oauthNonce;
            this.f1514f = currentPane;
            this.f1515g = additionalPanes;
            this.f1516h = backstack;
            this.f1517i = requestId;
        }

        @Override // com.plaid.internal.AbstractC5894L2.g
        /* renamed from: a */
        public final String mo1236a() {
            return this.f1513e;
        }

        @Override // com.plaid.internal.AbstractC5894L2.f
        /* renamed from: b */
        public final String mo1240b() {
            return this.f1512d;
        }

        @Override // com.plaid.internal.AbstractC5894L2.h
        /* renamed from: c */
        public final String mo1237c() {
            return this.f1517i;
        }

        @Override // com.plaid.internal.AbstractC5894L2.f
        /* renamed from: d */
        public final List<C6009X7> mo1241d() {
            return this.f1516h;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.AbstractC5894L2.f
        /* renamed from: e */
        public final C6009X7 mo1242e() {
            return this.f1514f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Intrinsics.areEqual(this.f1510b, lVar.f1510b) && Intrinsics.areEqual(this.f1511c, lVar.f1511c) && Intrinsics.areEqual(this.f1512d, lVar.f1512d) && Intrinsics.areEqual(this.f1513e, lVar.f1513e) && Intrinsics.areEqual(this.f1514f, lVar.f1514f) && Intrinsics.areEqual(this.f1515g, lVar.f1515g) && Intrinsics.areEqual(this.f1516h, lVar.f1516h) && Intrinsics.areEqual(this.f1517i, lVar.f1517i);
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: g */
        public final String mo1234g() {
            return this.f1510b;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: h */
        public final String mo1235h() {
            return this.f1511c;
        }

        public final int hashCode() {
            return this.f1517i.hashCode() + ((this.f1516h.hashCode() + ((this.f1515g.hashCode() + ((this.f1514f.hashCode() + C7246x.m1646a(this.f1513e, C7246x.m1646a(this.f1512d, C7246x.m1646a(this.f1511c, this.f1510b.hashCode() * 31, 31), 31), 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Workflow(linkOpenId=" + this.f1510b + ", workflowId=" + this.f1511c + ", continuationToken=" + this.f1512d + ", oauthNonce=" + this.f1513e + ", currentPane=" + this.f1514f + ", additionalPanes=" + this.f1515g + ", backstack=" + this.f1516h + ", requestId=" + this.f1517i + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f1510b);
            out.writeString(this.f1511c);
            out.writeString(this.f1512d);
            out.writeString(this.f1513e);
            out.writeParcelable(this.f1514f, i);
            List<C6009X7> list = this.f1515g;
            out.writeInt(list.size());
            Iterator<C6009X7> it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable(it.next(), i);
            }
            List<C6009X7> list2 = this.f1516h;
            out.writeInt(list2.size());
            Iterator<C6009X7> it2 = list2.iterator();
            while (it2.hasNext()) {
                out.writeParcelable(it2.next(), i);
            }
            out.writeString(this.f1517i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public l(int i, String str, String str2, String str3, String str4, C6009X7 c6009x7, List list, List list2, String str5) {
            super(0);
            if (255 != (i & 255)) {
                PluginExceptions.throwMissingFieldException(i, 255, a.f1519b);
            }
            this.f1510b = str;
            this.f1511c = str2;
            this.f1512d = str3;
            this.f1513e = str4;
            this.f1514f = c6009x7;
            this.f1515g = list;
            this.f1516h = list2;
            this.f1517i = str5;
        }
    }

    @Serializable
    /* renamed from: com.plaid.internal.L2$k */
    public static final class k extends AbstractC5894L2 implements h, g {
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* renamed from: b */
        public final String f1496b;

        /* renamed from: c */
        public final String f1497c;

        /* renamed from: d */
        public final String f1498d;

        /* renamed from: e */
        public final String f1499e;

        /* renamed from: f */
        public final String f1500f;

        /* renamed from: g */
        public final String f1501g;

        /* renamed from: h */
        public final C5792A f1502h;

        /* renamed from: i */
        public final boolean f1503i;

        /* renamed from: j */
        public final boolean f1504j;

        /* renamed from: k */
        public final boolean f1505k;

        /* renamed from: l */
        public final EnumC5880J6 f1506l;

        @Deprecated
        /* renamed from: com.plaid.internal.L2$k$a */
        public static final class a implements PluginHelperInterfaces<k> {

            /* renamed from: a */
            public static final a f1507a;

            /* renamed from: b */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f1508b;

            static {
                a aVar = new a();
                f1507a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.WebviewFallback", aVar, 11);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", false);
                pluginGeneratedSerialDescriptor.addElement("url", false);
                pluginGeneratedSerialDescriptor.addElement("webviewFallbackId", false);
                pluginGeneratedSerialDescriptor.addElement("channelInfo", true);
                pluginGeneratedSerialDescriptor.addElement("hasTransparentBackground", true);
                pluginGeneratedSerialDescriptor.addElement("isOutOfProcess", true);
                pluginGeneratedSerialDescriptor.addElement("shouldPreloadLink", false);
                pluginGeneratedSerialDescriptor.addElement("smsAutofillType", true);
                f1508b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?> nullable = BuiltinSerializers.getNullable(C5792A.a.f1220a);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, nullable, booleanSerializer, booleanSerializer, booleanSerializer, EnumC5880J6.a.f1411a};
            }

            @Override // kotlinx.serialization.KSerializer2
            public final Object deserialize(Decoding2 decoder) {
                boolean z;
                EnumC5880J6 enumC5880J6;
                C5792A c5792a;
                boolean z2;
                boolean z3;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1508b;
                Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                int i = 10;
                int i2 = 0;
                if (decodingBeginStructure.decodeSequentially()) {
                    String strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    String strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                    C5792A c5792a2 = (C5792A) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, C5792A.a.f1220a, null);
                    boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 7);
                    boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 8);
                    boolean zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 9);
                    i2 = 2047;
                    str = strDecodeStringElement;
                    enumC5880J6 = (EnumC5880J6) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 10, EnumC5880J6.a.f1411a, null);
                    z = zDecodeBooleanElement3;
                    z2 = zDecodeBooleanElement;
                    c5792a = c5792a2;
                    str6 = strDecodeStringElement6;
                    str4 = strDecodeStringElement4;
                    z3 = zDecodeBooleanElement2;
                    str5 = strDecodeStringElement5;
                    str3 = strDecodeStringElement3;
                    str2 = strDecodeStringElement2;
                } else {
                    boolean z4 = true;
                    boolean zDecodeBooleanElement4 = false;
                    boolean zDecodeBooleanElement5 = false;
                    EnumC5880J6 enumC5880J62 = null;
                    C5792A c5792a3 = null;
                    String strDecodeStringElement7 = null;
                    String strDecodeStringElement8 = null;
                    String strDecodeStringElement9 = null;
                    String strDecodeStringElement10 = null;
                    String strDecodeStringElement11 = null;
                    String strDecodeStringElement12 = null;
                    boolean zDecodeBooleanElement6 = false;
                    while (z4) {
                        int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z4 = false;
                                i = 10;
                            case 0:
                                strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                i2 |= 1;
                                i = 10;
                            case 1:
                                strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i2 |= 2;
                                i = 10;
                            case 2:
                                strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i2 |= 4;
                                i = 10;
                            case 3:
                                strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i2 |= 8;
                            case 4:
                                strDecodeStringElement11 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                                i2 |= 16;
                            case 5:
                                strDecodeStringElement12 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                                i2 |= 32;
                            case 6:
                                c5792a3 = (C5792A) decodingBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, C5792A.a.f1220a, c5792a3);
                                i2 |= 64;
                            case 7:
                                zDecodeBooleanElement6 = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 7);
                                i2 |= 128;
                            case 8:
                                zDecodeBooleanElement5 = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 8);
                                i2 |= 256;
                            case 9:
                                zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 9);
                                i2 |= 512;
                            case 10:
                                enumC5880J62 = (EnumC5880J6) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, i, EnumC5880J6.a.f1411a, enumC5880J62);
                                i2 |= 1024;
                            default:
                                throw new SerializationExceptions3(iDecodeElementIndex);
                        }
                    }
                    z = zDecodeBooleanElement4;
                    enumC5880J6 = enumC5880J62;
                    c5792a = c5792a3;
                    z2 = zDecodeBooleanElement6;
                    z3 = zDecodeBooleanElement5;
                    str = strDecodeStringElement7;
                    str2 = strDecodeStringElement8;
                    str3 = strDecodeStringElement9;
                    str4 = strDecodeStringElement10;
                    str5 = strDecodeStringElement11;
                    str6 = strDecodeStringElement12;
                }
                int i3 = i2;
                decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new k(i3, str, str2, str3, str4, str5, str6, c5792a, z2, z3, z, enumC5880J6);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public final SerialDescriptor getDescriptor() {
                return f1508b;
            }

            @Override // kotlinx.serialization.KSerializer3
            public final void serialize(Encoding4 encoder, Object obj) {
                k value = (k) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1508b;
                Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1496b);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, value.f1497c);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, value.f1498d);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, value.f1499e);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, value.f1500f);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, value.f1501g);
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || value.f1502h != null) {
                    encoding3BeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, C5792A.a.f1220a, value.f1502h);
                }
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || value.f1503i) {
                    encoding3BeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 7, value.f1503i);
                }
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8) || value.f1504j) {
                    encoding3BeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 8, value.f1504j);
                }
                encoding3BeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 9, value.f1505k);
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 10) || value.f1506l != EnumC5880J6.NO_SMS_AUTOFILL) {
                    encoding3BeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 10, EnumC5880J6.a.f1411a, value.f1506l);
                }
                encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] typeParametersSerializers() {
                return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* renamed from: com.plaid.internal.L2$k$b */
        public static final class b implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                C5792A c5792aCreateFromParcel = parcel.readInt() == 0 ? null : C5792A.CREATOR.createFromParcel(parcel);
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new k(string2, string3, string4, string5, string6, string7, c5792aCreateFromParcel, z3, z4, z2, EnumC5880J6.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i) {
                return new k[i];
            }
        }

        public k(String linkOpenId, String workflowId, String requestId, String oauthNonce, String url, String webviewFallbackId, C5792A c5792a, boolean z, boolean z2, boolean z3, EnumC5880J6 smsAutofillType) {
            Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(oauthNonce, "oauthNonce");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
            Intrinsics.checkNotNullParameter(smsAutofillType, "smsAutofillType");
            this.f1496b = linkOpenId;
            this.f1497c = workflowId;
            this.f1498d = requestId;
            this.f1499e = oauthNonce;
            this.f1500f = url;
            this.f1501g = webviewFallbackId;
            this.f1502h = c5792a;
            this.f1503i = z;
            this.f1504j = z2;
            this.f1505k = z3;
            this.f1506l = smsAutofillType;
        }

        @Override // com.plaid.internal.AbstractC5894L2.g
        /* renamed from: a */
        public final String mo1236a() {
            return this.f1499e;
        }

        @Override // com.plaid.internal.AbstractC5894L2.h
        /* renamed from: c */
        public final String mo1237c() {
            return this.f1498d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: g */
        public final String mo1234g() {
            return this.f1496b;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: h */
        public final String mo1235h() {
            return this.f1497c;
        }

        /* renamed from: i */
        public final C5792A m1243i() {
            return this.f1502h;
        }

        /* renamed from: j */
        public final EnumC5880J6 m1244j() {
            return this.f1506l;
        }

        /* renamed from: k */
        public final String m1245k() {
            return this.f1500f;
        }

        /* renamed from: l */
        public final String m1246l() {
            return this.f1501g;
        }

        /* renamed from: m */
        public final boolean m1247m() {
            return this.f1504j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f1496b);
            out.writeString(this.f1497c);
            out.writeString(this.f1498d);
            out.writeString(this.f1499e);
            out.writeString(this.f1500f);
            out.writeString(this.f1501g);
            C5792A c5792a = this.f1502h;
            if (c5792a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(c5792a.f1217a);
                out.writeString(c5792a.f1218b);
                out.writeLong(c5792a.f1219c);
            }
            out.writeInt(this.f1503i ? 1 : 0);
            out.writeInt(this.f1504j ? 1 : 0);
            out.writeInt(this.f1505k ? 1 : 0);
            this.f1506l.writeToParcel(out, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public k(int i, String str, String str2, String str3, String str4, String str5, String str6, C5792A c5792a, boolean z, boolean z2, boolean z3, EnumC5880J6 enumC5880J6) {
            super(0);
            if (575 != (i & CompanyFinancialsSection.LINE_REVEAL_ANIMATION_DURATION)) {
                PluginExceptions.throwMissingFieldException(i, CompanyFinancialsSection.LINE_REVEAL_ANIMATION_DURATION, a.f1508b);
            }
            this.f1496b = str;
            this.f1497c = str2;
            this.f1498d = str3;
            this.f1499e = str4;
            this.f1500f = str5;
            this.f1501g = str6;
            if ((i & 64) == 0) {
                this.f1502h = null;
            } else {
                this.f1502h = c5792a;
            }
            if ((i & 128) == 0) {
                this.f1503i = false;
            } else {
                this.f1503i = z;
            }
            if ((i & 256) == 0) {
                this.f1504j = false;
            } else {
                this.f1504j = z2;
            }
            this.f1505k = z3;
            if ((i & 1024) == 0) {
                this.f1506l = EnumC5880J6.NO_SMS_AUTOFILL;
            } else {
                this.f1506l = enumC5880J6;
            }
        }

        public /* synthetic */ k(String str, String str2, String str3, String str4, String str5, String str6, C5792A c5792a, boolean z, EnumC5880J6 enumC5880J6, int i) {
            this(str, str2, str3, str4, str5, str6, c5792a, false, true, z, (i & 1024) != 0 ? EnumC5880J6.NO_SMS_AUTOFILL : enumC5880J6);
        }
    }

    @Serializable
    /* renamed from: com.plaid.internal.L2$i */
    public static final class i extends AbstractC5894L2 implements f, g, h {
        public static final Parcelable.Creator<i> CREATOR = new b();

        /* renamed from: l */
        @JvmField
        public static final KSerializer<Object>[] f1479l = {null, null, null, null, null, new ArrayListSerializer(C6009X7.a.f1838a), null, new Enums3("com.plaid.internal.workflow.error.LocalErrorType", EnumC5805B3.values()), null, null};

        /* renamed from: b */
        public final String f1480b;

        /* renamed from: c */
        public final C6009X7 f1481c;

        /* renamed from: d */
        public final String f1482d;

        /* renamed from: e */
        public final String f1483e;

        /* renamed from: f */
        public final String f1484f;

        /* renamed from: g */
        public final List<C6009X7> f1485g;

        /* renamed from: h */
        public final String f1486h;

        /* renamed from: i */
        public final EnumC5805B3 f1487i;

        /* renamed from: j */
        public final String f1488j;

        /* renamed from: k */
        public final String f1489k;

        @Deprecated
        /* renamed from: com.plaid.internal.L2$i$a */
        public static final class a implements PluginHelperInterfaces<i> {

            /* renamed from: a */
            public static final a f1490a;

            /* renamed from: b */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f1491b;

            static {
                a aVar = new a();
                f1490a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.LocalError", aVar, 10);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("currentPane", false);
                pluginGeneratedSerialDescriptor.addElement("continuationToken", false);
                pluginGeneratedSerialDescriptor.addElement("errorMessage", false);
                pluginGeneratedSerialDescriptor.addElement("errorCode", false);
                pluginGeneratedSerialDescriptor.addElement("backstack", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                pluginGeneratedSerialDescriptor.addElement("errorType", true);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", true);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", true);
                f1491b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?>[] kSerializerArr = i.f1479l;
                KSerializer<?> kSerializer = kSerializerArr[5];
                KSerializer<?> kSerializer2 = kSerializerArr[7];
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, C6009X7.a.f1838a, stringSerializer, stringSerializer, stringSerializer, kSerializer, stringSerializer, kSerializer2, stringSerializer, stringSerializer};
            }

            @Override // kotlinx.serialization.KSerializer2
            public final Object deserialize(Decoding2 decoder) {
                int i;
                EnumC5805B3 enumC5805B3;
                List list;
                String str;
                C6009X7 c6009x7;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String strDecodeStringElement;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1491b;
                Decoding decodingBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                KSerializer<Object>[] kSerializerArr = i.f1479l;
                int i2 = 9;
                int i3 = 6;
                String strDecodeStringElement2 = null;
                if (decodingBeginStructure.decodeSequentially()) {
                    String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    C6009X7 c6009x72 = (C6009X7) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, C6009X7.a.f1838a, null);
                    String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    String strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    List list2 = (List) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], null);
                    String strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                    EnumC5805B3 enumC5805B32 = (EnumC5805B3) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], null);
                    String strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                    enumC5805B3 = enumC5805B32;
                    str = strDecodeStringElement3;
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 9);
                    str5 = strDecodeStringElement7;
                    str3 = strDecodeStringElement5;
                    str6 = strDecodeStringElement8;
                    str4 = strDecodeStringElement6;
                    str2 = strDecodeStringElement4;
                    i = 1023;
                    list = list2;
                    c6009x7 = c6009x72;
                } else {
                    boolean z = true;
                    int i4 = 0;
                    EnumC5805B3 enumC5805B33 = null;
                    List list3 = null;
                    C6009X7 c6009x73 = null;
                    String strDecodeStringElement9 = null;
                    String strDecodeStringElement10 = null;
                    String strDecodeStringElement11 = null;
                    String strDecodeStringElement12 = null;
                    String strDecodeStringElement13 = null;
                    String strDecodeStringElement14 = null;
                    while (z) {
                        int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z = false;
                                i2 = 9;
                            case 0:
                                strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                i4 |= 1;
                                i2 = 9;
                                i3 = 6;
                            case 1:
                                c6009x73 = (C6009X7) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, C6009X7.a.f1838a, c6009x73);
                                i4 |= 2;
                                i2 = 9;
                                i3 = 6;
                            case 2:
                                strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i4 |= 4;
                            case 3:
                                strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i4 |= 8;
                            case 4:
                                strDecodeStringElement11 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                                i4 |= 16;
                            case 5:
                                list3 = (List) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list3);
                                i4 |= 32;
                            case 6:
                                strDecodeStringElement12 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i3);
                                i4 |= 64;
                            case 7:
                                enumC5805B33 = (EnumC5805B3) decodingBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], enumC5805B33);
                                i4 |= 128;
                            case 8:
                                strDecodeStringElement13 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                                i4 |= 256;
                            case 9:
                                strDecodeStringElement14 = decodingBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i2);
                                i4 |= 512;
                            default:
                                throw new SerializationExceptions3(iDecodeElementIndex);
                        }
                    }
                    i = i4;
                    enumC5805B3 = enumC5805B33;
                    list = list3;
                    str = strDecodeStringElement2;
                    c6009x7 = c6009x73;
                    str2 = strDecodeStringElement9;
                    str3 = strDecodeStringElement10;
                    str4 = strDecodeStringElement11;
                    str5 = strDecodeStringElement12;
                    str6 = strDecodeStringElement13;
                    strDecodeStringElement = strDecodeStringElement14;
                }
                decodingBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new i(i, str, c6009x7, str2, str3, str4, list, str5, enumC5805B3, str6, strDecodeStringElement);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public final SerialDescriptor getDescriptor() {
                return f1491b;
            }

            @Override // kotlinx.serialization.KSerializer3
            public final void serialize(Encoding4 encoder, Object obj) {
                i value = (i) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1491b;
                Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                KSerializer<Object>[] kSerializerArr = i.f1479l;
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1480b);
                encoding3BeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, C6009X7.a.f1838a, value.f1481c);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, value.f1482d);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, value.f1483e);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, value.f1484f);
                encoding3BeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], value.f1485g);
                encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, value.f1486h);
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || value.f1487i != EnumC5805B3.UNKNOWN_ERROR) {
                    encoding3BeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], value.f1487i);
                }
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8) || !Intrinsics.areEqual(value.f1488j, "")) {
                    encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 8, value.f1488j);
                }
                if (encoding3BeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9) || !Intrinsics.areEqual(value.f1489k, "")) {
                    encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 9, value.f1489k);
                }
                encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.PluginHelperInterfaces
            public final KSerializer<?>[] typeParametersSerializers() {
                return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* renamed from: com.plaid.internal.L2$i$b */
        public static final class b implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public final i createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                C6009X7 c6009x7 = (C6009X7) parcel.readParcelable(i.class.getClassLoader());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(i.class.getClassLoader()));
                }
                return new i(string2, c6009x7, string3, string4, string5, arrayList, parcel.readString(), EnumC5805B3.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final i[] newArray(int i) {
                return new i[i];
            }
        }

        public i(String workflowId, C6009X7 currentPane, String continuationToken, String errorMessage, String errorCode, List<C6009X7> backstack, String requestId, EnumC5805B3 errorType) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(currentPane, "currentPane");
            Intrinsics.checkNotNullParameter(continuationToken, "continuationToken");
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(backstack, "backstack");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            this.f1480b = workflowId;
            this.f1481c = currentPane;
            this.f1482d = continuationToken;
            this.f1483e = errorMessage;
            this.f1484f = errorCode;
            this.f1485g = backstack;
            this.f1486h = requestId;
            this.f1487i = errorType;
            this.f1488j = "";
            this.f1489k = "";
        }

        @Override // com.plaid.internal.AbstractC5894L2.g
        /* renamed from: a */
        public final String mo1236a() {
            return this.f1489k;
        }

        @Override // com.plaid.internal.AbstractC5894L2.f
        /* renamed from: b */
        public final String mo1240b() {
            return this.f1482d;
        }

        @Override // com.plaid.internal.AbstractC5894L2.h
        /* renamed from: c */
        public final String mo1237c() {
            return this.f1486h;
        }

        @Override // com.plaid.internal.AbstractC5894L2.f
        /* renamed from: d */
        public final List<C6009X7> mo1241d() {
            return this.f1485g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.AbstractC5894L2.f
        /* renamed from: e */
        public final C6009X7 mo1242e() {
            return this.f1481c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.areEqual(this.f1480b, iVar.f1480b) && Intrinsics.areEqual(this.f1481c, iVar.f1481c) && Intrinsics.areEqual(this.f1482d, iVar.f1482d) && Intrinsics.areEqual(this.f1483e, iVar.f1483e) && Intrinsics.areEqual(this.f1484f, iVar.f1484f) && Intrinsics.areEqual(this.f1485g, iVar.f1485g) && Intrinsics.areEqual(this.f1486h, iVar.f1486h) && this.f1487i == iVar.f1487i;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: g */
        public final String mo1234g() {
            return this.f1488j;
        }

        @Override // com.plaid.internal.AbstractC5894L2
        /* renamed from: h */
        public final String mo1235h() {
            return this.f1480b;
        }

        public final int hashCode() {
            return this.f1487i.hashCode() + C7246x.m1646a(this.f1486h, (this.f1485g.hashCode() + C7246x.m1646a(this.f1484f, C7246x.m1646a(this.f1483e, C7246x.m1646a(this.f1482d, (this.f1481c.hashCode() + (this.f1480b.hashCode() * 31)) * 31, 31), 31), 31)) * 31, 31);
        }

        public final String toString() {
            return "LocalError(workflowId=" + this.f1480b + ", currentPane=" + this.f1481c + ", continuationToken=" + this.f1482d + ", errorMessage=" + this.f1483e + ", errorCode=" + this.f1484f + ", backstack=" + this.f1485g + ", requestId=" + this.f1486h + ", errorType=" + this.f1487i + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f1480b);
            out.writeParcelable(this.f1481c, i);
            out.writeString(this.f1482d);
            out.writeString(this.f1483e);
            out.writeString(this.f1484f);
            List<C6009X7> list = this.f1485g;
            out.writeInt(list.size());
            Iterator<C6009X7> it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable(it.next(), i);
            }
            out.writeString(this.f1486h);
            this.f1487i.writeToParcel(out, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public i(int i, String str, C6009X7 c6009x7, String str2, String str3, String str4, List list, String str5, EnumC5805B3 enumC5805B3, String str6, String str7) {
            super(0);
            if (127 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE)) {
                PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, a.f1491b);
            }
            this.f1480b = str;
            this.f1481c = c6009x7;
            this.f1482d = str2;
            this.f1483e = str3;
            this.f1484f = str4;
            this.f1485g = list;
            this.f1486h = str5;
            if ((i & 128) == 0) {
                this.f1487i = EnumC5805B3.UNKNOWN_ERROR;
            } else {
                this.f1487i = enumC5805B3;
            }
            if ((i & 256) == 0) {
                this.f1488j = "";
            } else {
                this.f1488j = str6;
            }
            if ((i & 512) == 0) {
                this.f1489k = "";
            } else {
                this.f1489k = str7;
            }
        }
    }
}
