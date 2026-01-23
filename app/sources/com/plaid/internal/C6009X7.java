package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
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
/* renamed from: com.plaid.internal.X7 */
/* loaded from: classes16.dex */
public final class C6009X7 implements Parcelable {
    public static final c CREATOR = new c();

    /* renamed from: e */
    public static final C6009X7 f1833e = new C6009X7("unknown", "unknown", "unknown");

    /* renamed from: a */
    public final String f1834a;

    /* renamed from: b */
    public final String f1835b;

    /* renamed from: c */
    public final String f1836c;

    /* renamed from: d */
    public final Lazy f1837d;

    @Deprecated
    /* renamed from: com.plaid.internal.X7$a */
    public static final class a implements PluginHelperInterfaces<C6009X7> {

        /* renamed from: a */
        public static final a f1838a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1839b;

        static {
            a aVar = new a();
            f1838a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.WorkflowPaneId", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("workflowId", false);
            pluginGeneratedSerialDescriptor.addElement("paneRenderingId", false);
            pluginGeneratedSerialDescriptor.addElement("paneNodeId", false);
            f1839b = pluginGeneratedSerialDescriptor;
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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1839b;
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
            return new C6009X7(i, strDecodeStringElement, strDecodeStringElement3, strDecodeStringElement2);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1839b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            C6009X7 value = (C6009X7) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1839b;
            Encoding3 encoding3BeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, value.f1834a);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, value.f1835b);
            encoding3BeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, value.f1836c);
            encoding3BeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.X7$b */
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C6009X7.this.m1353b() + ":" + C6009X7.this.m1352a();
        }
    }

    /* renamed from: com.plaid.internal.X7$c */
    public static final class c implements Parcelable.Creator<C6009X7> {
        /* renamed from: a */
        public static C6009X7 m1355a(Pane$PaneRendering pane$PaneRendering, String workflowId) {
            Intrinsics.checkNotNullParameter(pane$PaneRendering, "<this>");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            String id = pane$PaneRendering.getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            String paneNodeId = pane$PaneRendering.getPaneNodeId();
            Intrinsics.checkNotNullExpressionValue(paneNodeId, "getPaneNodeId(...)");
            return new C6009X7(workflowId, id, paneNodeId);
        }

        @Override // android.os.Parcelable.Creator
        public final C6009X7 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            Intrinsics.checkNotNull(string2, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.WorkflowId }");
            String string3 = parcel.readString();
            Intrinsics.checkNotNull(string3, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.PaneRenderingId }");
            String string4 = parcel.readString();
            Intrinsics.checkNotNull(string4, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.PaneNodeId }");
            return new C6009X7(string2, string3, string4);
        }

        @Override // android.os.Parcelable.Creator
        public final C6009X7[] newArray(int i) {
            return new C6009X7[i];
        }
    }

    @Deprecated
    public C6009X7(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, a.f1839b);
        }
        this.f1834a = str;
        this.f1835b = str2;
        this.f1836c = str3;
        this.f1837d = LazyKt.lazy(new b());
    }

    /* renamed from: a */
    public final String m1352a() {
        return this.f1835b;
    }

    /* renamed from: b */
    public final String m1353b() {
        return this.f1834a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6009X7)) {
            return false;
        }
        C6009X7 c6009x7 = (C6009X7) obj;
        return Intrinsics.areEqual(this.f1834a, c6009x7.f1834a) && Intrinsics.areEqual(this.f1835b, c6009x7.f1835b) && Intrinsics.areEqual(this.f1836c, c6009x7.f1836c);
    }

    public final int hashCode() {
        return this.f1836c.hashCode() + C7246x.m1646a(this.f1835b, this.f1834a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "WorkflowPaneId(workflowId=" + this.f1834a + ", paneRenderingId=" + this.f1835b + ", paneNodeId=" + this.f1836c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f1834a);
        parcel.writeString(this.f1835b);
        parcel.writeString(this.f1836c);
    }

    public C6009X7(String str, String str2, String str3) {
        this.f1834a = str;
        this.f1835b = str2;
        this.f1836c = str3;
        this.f1837d = LazyKt.lazy(new b());
    }
}
