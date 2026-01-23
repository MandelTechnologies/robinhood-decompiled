package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeRequestExecutor.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "", "execute", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Config", "Factory", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ChallengeRequestExecutor {

    /* compiled from: ChallengeRequestExecutor.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "Ljava/io/Serializable;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Factory extends Serializable {
        ChallengeRequestExecutor create(ErrorReporter errorReporter, CoroutineContext workContext);
    }

    Object execute(ChallengeRequestData challengeRequestData, Continuation<? super ChallengeRequestResult> continuation);

    /* compiled from: ChallengeRequestExecutor.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "messageTransformer", "", "sdkReferenceId", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "acsUrl", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;", "keys", "<init>", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "getMessageTransformer$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "Ljava/lang/String;", "getSdkReferenceId$3ds2sdk_release", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "getCreqData$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "getAcsUrl$3ds2sdk_release", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;", "getKeys$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;", "Keys", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Config implements Serializable, Parcelable {
        public static final Parcelable.Creator<Config> CREATOR = new Creator();
        private final String acsUrl;
        private final ChallengeRequestData creqData;
        private final Keys keys;
        private final MessageTransformer messageTransformer;
        private final String sdkReferenceId;

        /* compiled from: ChallengeRequestExecutor.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Config((MessageTransformer) parcel.readSerializable(), parcel.readString(), ChallengeRequestData.CREATOR.createFromParcel(parcel), parcel.readString(), Keys.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i) {
                return new Config[i];
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
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.areEqual(this.messageTransformer, config.messageTransformer) && Intrinsics.areEqual(this.sdkReferenceId, config.sdkReferenceId) && Intrinsics.areEqual(this.creqData, config.creqData) && Intrinsics.areEqual(this.acsUrl, config.acsUrl) && Intrinsics.areEqual(this.keys, config.keys);
        }

        public int hashCode() {
            return (((((((this.messageTransformer.hashCode() * 31) + this.sdkReferenceId.hashCode()) * 31) + this.creqData.hashCode()) * 31) + this.acsUrl.hashCode()) * 31) + this.keys.hashCode();
        }

        public String toString() {
            return "Config(messageTransformer=" + this.messageTransformer + ", sdkReferenceId=" + this.sdkReferenceId + ", creqData=" + this.creqData + ", acsUrl=" + this.acsUrl + ", keys=" + this.keys + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeSerializable(this.messageTransformer);
            parcel.writeString(this.sdkReferenceId);
            this.creqData.writeToParcel(parcel, flags);
            parcel.writeString(this.acsUrl);
            this.keys.writeToParcel(parcel, flags);
        }

        public Config(MessageTransformer messageTransformer, String sdkReferenceId, ChallengeRequestData creqData, String acsUrl, Keys keys) {
            Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
            Intrinsics.checkNotNullParameter(sdkReferenceId, "sdkReferenceId");
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
            Intrinsics.checkNotNullParameter(keys, "keys");
            this.messageTransformer = messageTransformer;
            this.sdkReferenceId = sdkReferenceId;
            this.creqData = creqData;
            this.acsUrl = acsUrl;
            this.keys = keys;
        }

        /* renamed from: getMessageTransformer$3ds2sdk_release, reason: from getter */
        public final MessageTransformer getMessageTransformer() {
            return this.messageTransformer;
        }

        /* renamed from: getSdkReferenceId$3ds2sdk_release, reason: from getter */
        public final String getSdkReferenceId() {
            return this.sdkReferenceId;
        }

        /* renamed from: getAcsUrl$3ds2sdk_release, reason: from getter */
        public final String getAcsUrl() {
            return this.acsUrl;
        }

        /* renamed from: getKeys$3ds2sdk_release, reason: from getter */
        public final Keys getKeys() {
            return this.keys;
        }

        /* compiled from: ChallengeRequestExecutor.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "sdkPrivateKeyEncoded", "acsPublicKeyEncoded", "<init>", "([B[B)V", "keys", "", "typedEquals", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)Z", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "[B", "getSdkPrivateKeyEncoded$3ds2sdk_release", "()[B", "getAcsPublicKeyEncoded$3ds2sdk_release", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Keys implements Serializable, Parcelable {
            public static final Parcelable.Creator<Keys> CREATOR = new Creator();
            private final byte[] acsPublicKeyEncoded;
            private final byte[] sdkPrivateKeyEncoded;

            /* compiled from: ChallengeRequestExecutor.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Keys> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Keys createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Keys(parcel.createByteArray(), parcel.createByteArray());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Keys[] newArray(int i) {
                    return new Keys[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "Keys(sdkPrivateKeyEncoded=" + Arrays.toString(this.sdkPrivateKeyEncoded) + ", acsPublicKeyEncoded=" + Arrays.toString(this.acsPublicKeyEncoded) + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeByteArray(this.sdkPrivateKeyEncoded);
                parcel.writeByteArray(this.acsPublicKeyEncoded);
            }

            public Keys(byte[] sdkPrivateKeyEncoded, byte[] acsPublicKeyEncoded) {
                Intrinsics.checkNotNullParameter(sdkPrivateKeyEncoded, "sdkPrivateKeyEncoded");
                Intrinsics.checkNotNullParameter(acsPublicKeyEncoded, "acsPublicKeyEncoded");
                this.sdkPrivateKeyEncoded = sdkPrivateKeyEncoded;
                this.acsPublicKeyEncoded = acsPublicKeyEncoded;
            }

            /* renamed from: getSdkPrivateKeyEncoded$3ds2sdk_release, reason: from getter */
            public final byte[] getSdkPrivateKeyEncoded() {
                return this.sdkPrivateKeyEncoded;
            }

            /* renamed from: getAcsPublicKeyEncoded$3ds2sdk_release, reason: from getter */
            public final byte[] getAcsPublicKeyEncoded() {
                return this.acsPublicKeyEncoded;
            }

            public int hashCode() {
                return ObjectUtils.hash(this.sdkPrivateKeyEncoded, this.acsPublicKeyEncoded);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (other instanceof Keys) {
                    return typedEquals((Keys) other);
                }
                return false;
            }

            private final boolean typedEquals(Keys keys) {
                return Arrays.equals(this.sdkPrivateKeyEncoded, keys.sdkPrivateKeyEncoded) && Arrays.equals(this.acsPublicKeyEncoded, keys.acsPublicKeyEncoded);
            }
        }
    }
}
