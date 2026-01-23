package com.salesforce.android.smi.network.api.auth;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: UserVerificationProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider;", "", "userVerificationChallenge", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationToken;", "reason", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider$ChallengeReason;", "(Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider$ChallengeReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ChallengeReason", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface UserVerificationProvider {
    Object userVerificationChallenge(ChallengeReason challengeReason, Continuation<? super UserVerificationToken> continuation);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserVerificationProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider$ChallengeReason;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INITIAL", "RENEW", "EXPIRED", "MALFORMED", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ChallengeReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChallengeReason[] $VALUES;
        private final int value;
        public static final ChallengeReason INITIAL = new ChallengeReason("INITIAL", 0, 0);
        public static final ChallengeReason RENEW = new ChallengeReason("RENEW", 1, 1);
        public static final ChallengeReason EXPIRED = new ChallengeReason("EXPIRED", 2, 2);
        public static final ChallengeReason MALFORMED = new ChallengeReason("MALFORMED", 3, 3);

        private static final /* synthetic */ ChallengeReason[] $values() {
            return new ChallengeReason[]{INITIAL, RENEW, EXPIRED, MALFORMED};
        }

        public static EnumEntries<ChallengeReason> getEntries() {
            return $ENTRIES;
        }

        private ChallengeReason(String str, int i, int i2) {
            this.value = i2;
        }

        public final int getValue() {
            return this.value;
        }

        static {
            ChallengeReason[] challengeReasonArr$values = $values();
            $VALUES = challengeReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(challengeReasonArr$values);
        }

        public static ChallengeReason valueOf(String str) {
            return (ChallengeReason) Enum.valueOf(ChallengeReason.class, str);
        }

        public static ChallengeReason[] values() {
            return (ChallengeReason[]) $VALUES.clone();
        }
    }
}
