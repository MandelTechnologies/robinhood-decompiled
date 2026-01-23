package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.Enums2;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* renamed from: com.plaid.internal.J6 */
/* loaded from: classes16.dex */
public final class EnumC5880J6 implements Parcelable {
    public static final Parcelable.Creator<EnumC5880J6> CREATOR;
    public static final c Companion;

    @SerialName("NO_SMS_AUTOFILL")
    public static final EnumC5880J6 NO_SMS_AUTOFILL;

    @SerialName("SMS_RECEIVER")
    public static final EnumC5880J6 SMS_RECEIVER;

    /* renamed from: a */
    public static final Lazy<KSerializer<Object>> f1408a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC5880J6[] f1409b;

    /* renamed from: c */
    public static final /* synthetic */ EnumEntries f1410c;

    @Deprecated
    /* renamed from: com.plaid.internal.J6$a */
    public static final class a implements PluginHelperInterfaces<EnumC5880J6> {

        /* renamed from: a */
        public static final a f1411a = new a();

        /* renamed from: b */
        public static final /* synthetic */ Enums2 f1412b;

        static {
            Enums2 enums2 = new Enums2("com.plaid.internal.workflow.model.SmsAutofillType", 2);
            enums2.addElement("SMS_RECEIVER", false);
            enums2.addElement("NO_SMS_AUTOFILL", false);
            f1412b = enums2;
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[0];
        }

        @Override // kotlinx.serialization.KSerializer2
        public final Object deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return EnumC5880J6.values()[decoder.decodeEnum(f1412b)];
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public final SerialDescriptor getDescriptor() {
            return f1412b;
        }

        @Override // kotlinx.serialization.KSerializer3
        public final void serialize(Encoding4 encoder, Object obj) {
            EnumC5880J6 value = (EnumC5880J6) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeEnum(f1412b, value.ordinal());
        }

        @Override // kotlinx.serialization.internal.PluginHelperInterfaces
        public final KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.plaid.internal.J6$c] */
    static {
        EnumC5880J6 enumC5880J6 = new EnumC5880J6("SMS_RECEIVER", 0);
        SMS_RECEIVER = enumC5880J6;
        EnumC5880J6 enumC5880J62 = new EnumC5880J6("NO_SMS_AUTOFILL", 1);
        NO_SMS_AUTOFILL = enumC5880J62;
        EnumC5880J6[] enumC5880J6Arr = {enumC5880J6, enumC5880J62};
        f1409b = enumC5880J6Arr;
        f1410c = EnumEntries2.enumEntries(enumC5880J6Arr);
        Companion = new Object() { // from class: com.plaid.internal.J6.c
        };
        CREATOR = new Parcelable.Creator<EnumC5880J6>() { // from class: com.plaid.internal.J6.d
            @Override // android.os.Parcelable.Creator
            public final EnumC5880J6 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return EnumC5880J6.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnumC5880J6[] newArray(int i) {
                return new EnumC5880J6[i];
            }
        };
        f1408a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.plaid.internal.J6.b
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return a.f1411a;
            }
        });
    }

    public EnumC5880J6(String str, int i) {
    }

    public static EnumEntries<EnumC5880J6> getEntries() {
        return f1410c;
    }

    public static EnumC5880J6 valueOf(String str) {
        return (EnumC5880J6) Enum.valueOf(EnumC5880J6.class, str);
    }

    public static EnumC5880J6[] values() {
        return (EnumC5880J6[]) f1409b.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
