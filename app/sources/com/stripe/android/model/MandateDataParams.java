package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabsCallback;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MandateDataParams.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001c¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/MandateDataParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/MandateDataParams$Type;", "type", "<init>", "(Lcom/stripe/android/model/MandateDataParams$Type;)V", "", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/MandateDataParams$Type;", "Companion", "Type", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MandateDataParams implements StripeParamsModel, Parcelable {
    private final Type type;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MandateDataParams> CREATOR = new Creator();

    /* compiled from: MandateDataParams.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MandateDataParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MandateDataParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MandateDataParams((Type) parcel.readParcelable(MandateDataParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MandateDataParams[] newArray(int i) {
            return new MandateDataParams[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MandateDataParams) && Intrinsics.areEqual(this.type, ((MandateDataParams) other).type);
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public String toString() {
        return "MandateDataParams(type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.type, flags);
    }

    public MandateDataParams(Type type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        return MapsKt.mapOf(Tuples4.m3642to("customer_acceptance", MapsKt.mapOf(Tuples4.m3642to("type", this.type.getCode()), Tuples4.m3642to(this.type.getCode(), this.type.toParamMap()))));
    }

    /* compiled from: MandateDataParams.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/model/MandateDataParams$Type;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "code", "", "(Ljava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Online", "Lcom/stripe/android/model/MandateDataParams$Type$Online;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class Type implements StripeParamsModel, Parcelable {
        private final String code;

        public /* synthetic */ Type(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private Type(String str) {
            this.code = str;
        }

        /* renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* compiled from: MandateDataParams.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB+\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/MandateDataParams$Type$Online;", "Lcom/stripe/android/model/MandateDataParams$Type;", "", "ipAddress", "userAgent", "", "inferFromClient", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "Z", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Online extends Type {
            private final boolean inferFromClient;
            private final String ipAddress;
            private final String userAgent;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Online> CREATOR = new Creator();
            private static final Online DEFAULT = new Online(null, null, true, 3, null);

            /* compiled from: MandateDataParams.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Online> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Online createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Online(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Online[] newArray(int i) {
                    return new Online[i];
                }
            }

            public Online() {
                this(null, null, false, 7, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Online)) {
                    return false;
                }
                Online online = (Online) other;
                return Intrinsics.areEqual(this.ipAddress, online.ipAddress) && Intrinsics.areEqual(this.userAgent, online.userAgent) && this.inferFromClient == online.inferFromClient;
            }

            public int hashCode() {
                String str = this.ipAddress;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.userAgent;
                return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.inferFromClient);
            }

            public String toString() {
                return "Online(ipAddress=" + this.ipAddress + ", userAgent=" + this.userAgent + ", inferFromClient=" + this.inferFromClient + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.ipAddress);
                parcel.writeString(this.userAgent);
                parcel.writeInt(this.inferFromClient ? 1 : 0);
            }

            public /* synthetic */ Online(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
            }

            public Online(String str, String str2, boolean z) {
                super(CustomTabsCallback.ONLINE_EXTRAS_KEY, null);
                this.ipAddress = str;
                this.userAgent = str2;
                this.inferFromClient = z;
            }

            @Override // com.stripe.android.model.StripeParamsModel
            public Map<String, Object> toParamMap() {
                if (this.inferFromClient) {
                    return MapsKt.mapOf(Tuples4.m3642to("infer_from_client", Boolean.TRUE));
                }
                String str = this.ipAddress;
                if (str == null) {
                    str = "";
                }
                Tuples2 tuples2M3642to = Tuples4.m3642to("ip_address", str);
                String str2 = this.userAgent;
                return MapsKt.mapOf(tuples2M3642to, Tuples4.m3642to("user_agent", str2 != null ? str2 : ""));
            }

            /* compiled from: MandateDataParams.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/MandateDataParams$Type$Online$Companion;", "", "()V", "DEFAULT", "Lcom/stripe/android/model/MandateDataParams$Type$Online;", "getDEFAULT", "()Lcom/stripe/android/model/MandateDataParams$Type$Online;", "PARAM_INFER_FROM_CLIENT", "", "PARAM_IP_ADDRESS", "PARAM_USER_AGENT", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final Online getDEFAULT() {
                    return Online.DEFAULT;
                }
            }
        }
    }

    /* compiled from: MandateDataParams.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/model/MandateDataParams$Companion;", "", "()V", "PARAM_CUSTOMER_ACCEPTANCE", "", "PARAM_TYPE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
