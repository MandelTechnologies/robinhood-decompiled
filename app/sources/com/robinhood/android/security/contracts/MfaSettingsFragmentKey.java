package com.robinhood.android.security.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.api.Challenge;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MfaSettingsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/security/contracts/MfaSettingsFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "launchType", "Lcom/robinhood/android/security/contracts/MfaSettingsFragmentKey$LaunchType;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "totpToken", "", "enrollmentToken", "phoneNumber", "flowId", "Lcom/robinhood/models/api/Challenge$Flow;", "<init>", "(Lcom/robinhood/android/security/contracts/MfaSettingsFragmentKey$LaunchType;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/Challenge$Flow;)V", "getLaunchType", "()Lcom/robinhood/android/security/contracts/MfaSettingsFragmentKey$LaunchType;", "getChallengeId", "()Ljava/util/UUID;", "getTotpToken", "()Ljava/lang/String;", "getEnrollmentToken", "getPhoneNumber", "getFlowId", "()Lcom/robinhood/models/api/Challenge$Flow;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LaunchType", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MfaSettingsFragmentKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<MfaSettingsFragmentKey> CREATOR = new Creator();
    private final UUID challengeId;
    private final String enrollmentToken;
    private final Challenge.Flow flowId;
    private final LaunchType launchType;
    private final String phoneNumber;
    private final String totpToken;

    /* compiled from: MfaSettingsFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<MfaSettingsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaSettingsFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MfaSettingsFragmentKey(LaunchType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), (Challenge.Flow) parcel.readParcelable(MfaSettingsFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaSettingsFragmentKey[] newArray(int i) {
            return new MfaSettingsFragmentKey[i];
        }
    }

    public MfaSettingsFragmentKey() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.launchType.name());
        dest.writeSerializable(this.challengeId);
        dest.writeString(this.totpToken);
        dest.writeString(this.enrollmentToken);
        dest.writeString(this.phoneNumber);
        dest.writeParcelable(this.flowId, flags);
    }

    public MfaSettingsFragmentKey(LaunchType launchType, UUID uuid, String str, String str2, String str3, Challenge.Flow flow) {
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        this.launchType = launchType;
        this.challengeId = uuid;
        this.totpToken = str;
        this.enrollmentToken = str2;
        this.phoneNumber = str3;
        this.flowId = flow;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MfaSettingsFragmentKey(com.robinhood.android.security.contracts.MfaSettingsFragmentKey.LaunchType r2, java.util.UUID r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, com.robinhood.models.api.Challenge.Flow r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            com.robinhood.android.security.contracts.MfaSettingsFragmentKey$LaunchType r2 = com.robinhood.android.security.contracts.MfaSettingsFragmentKey.LaunchType.DEFAULT
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.security.contracts.MfaSettingsFragmentKey.<init>(com.robinhood.android.security.contracts.MfaSettingsFragmentKey$LaunchType, java.util.UUID, java.lang.String, java.lang.String, java.lang.String, com.robinhood.models.api.Challenge$Flow, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final LaunchType getLaunchType() {
        return this.launchType;
    }

    public final UUID getChallengeId() {
        return this.challengeId;
    }

    public final String getTotpToken() {
        return this.totpToken;
    }

    public final String getEnrollmentToken() {
        return this.enrollmentToken;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final Challenge.Flow getFlowId() {
        return this.flowId;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.ACCOUNT;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MfaSettingsFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/security/contracts/MfaSettingsFragmentKey$LaunchType;", "", "<init>", "(Ljava/lang/String;I)V", "CRYPTO_AUTH_APP_ENROLL", "CRYPTO_PROMPTS_ENROLL", "DEFAULT", "VERIFY_SMS", "VERIFY_AUTH_APP", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class LaunchType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LaunchType[] $VALUES;
        public static final LaunchType CRYPTO_AUTH_APP_ENROLL = new LaunchType("CRYPTO_AUTH_APP_ENROLL", 0);
        public static final LaunchType CRYPTO_PROMPTS_ENROLL = new LaunchType("CRYPTO_PROMPTS_ENROLL", 1);
        public static final LaunchType DEFAULT = new LaunchType("DEFAULT", 2);
        public static final LaunchType VERIFY_SMS = new LaunchType("VERIFY_SMS", 3);
        public static final LaunchType VERIFY_AUTH_APP = new LaunchType("VERIFY_AUTH_APP", 4);

        private static final /* synthetic */ LaunchType[] $values() {
            return new LaunchType[]{CRYPTO_AUTH_APP_ENROLL, CRYPTO_PROMPTS_ENROLL, DEFAULT, VERIFY_SMS, VERIFY_AUTH_APP};
        }

        public static EnumEntries<LaunchType> getEntries() {
            return $ENTRIES;
        }

        private LaunchType(String str, int i) {
        }

        static {
            LaunchType[] launchTypeArr$values = $values();
            $VALUES = launchTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(launchTypeArr$values);
        }

        public static LaunchType valueOf(String str) {
            return (LaunchType) Enum.valueOf(LaunchType.class, str);
        }

        public static LaunchType[] values() {
            return (LaunchType[]) $VALUES.clone();
        }
    }
}
