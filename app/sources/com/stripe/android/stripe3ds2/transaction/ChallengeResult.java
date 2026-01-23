package com.stripe.android.stripe3ds2.transaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.IntentCompat;
import androidx.core.os.Bundle2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChallengeResult.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "Landroid/os/Parcelable;", "()V", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "toBundle", "Landroid/os/Bundle;", "toBundle$3ds2sdk_release", "Canceled", "Companion", "Failed", "ProtocolError", "RuntimeError", "Succeeded", "Timeout", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public abstract class ChallengeResult implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ ChallengeResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract UiType getInitialUiType();

    public abstract IntentData getIntentData();

    private ChallengeResult() {
    }

    public final Bundle toBundle$3ds2sdk_release() {
        return Bundle2.bundleOf(Tuples4.m3642to("extra_result", this));
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "intentData", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Succeeded extends ChallengeResult {
        public static final Parcelable.Creator<Succeeded> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* compiled from: ChallengeResult.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Succeeded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Succeeded(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded[] newArray(int i) {
                return new Succeeded[i];
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
            if (!(other instanceof Succeeded)) {
                return false;
            }
            Succeeded succeeded = (Succeeded) other;
            return Intrinsics.areEqual(this.uiTypeCode, succeeded.uiTypeCode) && this.initialUiType == succeeded.initialUiType && Intrinsics.areEqual(this.intentData, succeeded.intentData);
        }

        public int hashCode() {
            int iHashCode = this.uiTypeCode.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType == null ? 0 : uiType.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Succeeded(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(String uiTypeCode, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(uiTypeCode, "uiTypeCode");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = uiTypeCode;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "intentData", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Failed extends ChallengeResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* compiled from: ChallengeResult.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failed(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
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
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.uiTypeCode, failed.uiTypeCode) && this.initialUiType == failed.initialUiType && Intrinsics.areEqual(this.intentData, failed.intentData);
        }

        public int hashCode() {
            int iHashCode = this.uiTypeCode.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType == null ? 0 : uiType.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Failed(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String uiTypeCode, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(uiTypeCode, "uiTypeCode");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = uiTypeCode;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "intentData", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Canceled extends ChallengeResult {
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* compiled from: ChallengeResult.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Canceled(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
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
            if (!(other instanceof Canceled)) {
                return false;
            }
            Canceled canceled = (Canceled) other;
            return Intrinsics.areEqual(this.uiTypeCode, canceled.uiTypeCode) && this.initialUiType == canceled.initialUiType && Intrinsics.areEqual(this.intentData, canceled.intentData);
        }

        public int hashCode() {
            String str = this.uiTypeCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType != null ? uiType.hashCode() : 0)) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Canceled(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Canceled(String str, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", WebsocketGatewayConstants.DATA_KEY, "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "intentData", "<init>", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "getData", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ProtocolError extends ChallengeResult {
        public static final Parcelable.Creator<ProtocolError> CREATOR = new Creator();
        private final ErrorData data;
        private final UiType initialUiType;
        private final IntentData intentData;

        /* compiled from: ChallengeResult.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ProtocolError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProtocolError(ErrorData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError[] newArray(int i) {
                return new ProtocolError[i];
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
            if (!(other instanceof ProtocolError)) {
                return false;
            }
            ProtocolError protocolError = (ProtocolError) other;
            return Intrinsics.areEqual(this.data, protocolError.data) && this.initialUiType == protocolError.initialUiType && Intrinsics.areEqual(this.intentData, protocolError.intentData);
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType == null ? 0 : uiType.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.data + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.data.writeToParcel(parcel, flags);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProtocolError(ErrorData data, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.data = data;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "", "throwable", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "intentData", "<init>", "(Ljava/lang/Throwable;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class RuntimeError extends ChallengeResult {
        public static final Parcelable.Creator<RuntimeError> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final Throwable throwable;

        /* compiled from: ChallengeResult.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RuntimeError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RuntimeError((Throwable) parcel.readSerializable(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError[] newArray(int i) {
                return new RuntimeError[i];
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
            if (!(other instanceof RuntimeError)) {
                return false;
            }
            RuntimeError runtimeError = (RuntimeError) other;
            return Intrinsics.areEqual(this.throwable, runtimeError.throwable) && this.initialUiType == runtimeError.initialUiType && Intrinsics.areEqual(this.intentData, runtimeError.intentData);
        }

        public int hashCode() {
            int iHashCode = this.throwable.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType == null ? 0 : uiType.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.throwable + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeSerializable(this.throwable);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuntimeError(Throwable throwable, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.throwable = throwable;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "intentData", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Timeout extends ChallengeResult {
        public static final Parcelable.Creator<Timeout> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* compiled from: ChallengeResult.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Timeout> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Timeout(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout[] newArray(int i) {
                return new Timeout[i];
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
            if (!(other instanceof Timeout)) {
                return false;
            }
            Timeout timeout = (Timeout) other;
            return Intrinsics.areEqual(this.uiTypeCode, timeout.uiTypeCode) && this.initialUiType == timeout.initialUiType && Intrinsics.areEqual(this.intentData, timeout.intentData);
        }

        public int hashCode() {
            String str = this.uiTypeCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType != null ? uiType.hashCode() : 0)) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Timeout(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(String str, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Companion;", "", "()V", "EXTRA_RESULT", "", "fromIntent", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "intent", "Landroid/content/Intent;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChallengeResult fromIntent(Intent intent) {
            ChallengeResult challengeResult;
            return (intent == null || (challengeResult = (ChallengeResult) IntentCompat.getParcelableExtra(intent, "extra_result", ChallengeResult.class)) == null) ? new RuntimeError(new IllegalStateException("Intent extras did not contain a valid ChallengeResult."), null, IntentData.INSTANCE.getEMPTY()) : challengeResult;
        }
    }
}
