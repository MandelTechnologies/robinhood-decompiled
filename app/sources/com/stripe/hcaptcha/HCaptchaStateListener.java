package com.stripe.hcaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaStateListener.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0005\u0012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R2\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R2\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b&\u0010%¨\u0006'"}, m3636d2 = {"Lcom/stripe/hcaptcha/HCaptchaStateListener;", "Landroid/os/Parcelable;", "Lkotlin/Function0;", "", "onOpen", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "token", "onSuccess", "Lcom/stripe/hcaptcha/HCaptchaException;", "exception", "onFailure", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lkotlin/jvm/functions/Function0;", "getOnOpen", "()Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "getOnSuccess", "()Lkotlin/jvm/functions/Function1;", "getOnFailure", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class HCaptchaStateListener implements Parcelable {
    public static final Parcelable.Creator<HCaptchaStateListener> CREATOR = new Creator();
    private final Function1<HCaptchaException, Unit> onFailure;
    private final Function0<Unit> onOpen;
    private final Function1<String, Unit> onSuccess;

    /* compiled from: HCaptchaStateListener.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<HCaptchaStateListener> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HCaptchaStateListener createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HCaptchaStateListener((Function0) parcel.readSerializable(), (Function1) parcel.readSerializable(), (Function1) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HCaptchaStateListener[] newArray(int i) {
            return new HCaptchaStateListener[i];
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
        if (!(other instanceof HCaptchaStateListener)) {
            return false;
        }
        HCaptchaStateListener hCaptchaStateListener = (HCaptchaStateListener) other;
        return Intrinsics.areEqual(this.onOpen, hCaptchaStateListener.onOpen) && Intrinsics.areEqual(this.onSuccess, hCaptchaStateListener.onSuccess) && Intrinsics.areEqual(this.onFailure, hCaptchaStateListener.onFailure);
    }

    public int hashCode() {
        return (((this.onOpen.hashCode() * 31) + this.onSuccess.hashCode()) * 31) + this.onFailure.hashCode();
    }

    public String toString() {
        return "HCaptchaStateListener(onOpen=" + this.onOpen + ", onSuccess=" + this.onSuccess + ", onFailure=" + this.onFailure + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeSerializable((Serializable) this.onOpen);
        parcel.writeSerializable((Serializable) this.onSuccess);
        parcel.writeSerializable((Serializable) this.onFailure);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HCaptchaStateListener(Function0<Unit> onOpen, Function1<? super String, Unit> onSuccess, Function1<? super HCaptchaException, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(onOpen, "onOpen");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        this.onOpen = onOpen;
        this.onSuccess = onSuccess;
        this.onFailure = onFailure;
    }

    public final Function0<Unit> getOnOpen() {
        return this.onOpen;
    }

    public final Function1<String, Unit> getOnSuccess() {
        return this.onSuccess;
    }

    public final Function1<HCaptchaException, Unit> getOnFailure() {
        return this.onFailure;
    }
}
