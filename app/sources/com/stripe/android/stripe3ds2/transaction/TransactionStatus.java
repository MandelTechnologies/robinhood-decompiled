package com.stripe.android.stripe3ds2.transaction;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransactionStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "VerificationSuccessful", "VerificationDenied", "VerificationNotPerformed", "VerificationAttempted", "ChallengeAdditionalAuth", "ChallengeDecoupledAuth", "VerificationRejected", "InformationOnly", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class TransactionStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransactionStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String code;
    public static final TransactionStatus VerificationSuccessful = new TransactionStatus("VerificationSuccessful", 0, "Y");
    public static final TransactionStatus VerificationDenied = new TransactionStatus("VerificationDenied", 1, "N");
    public static final TransactionStatus VerificationNotPerformed = new TransactionStatus("VerificationNotPerformed", 2, "U");
    public static final TransactionStatus VerificationAttempted = new TransactionStatus("VerificationAttempted", 3, "A");
    public static final TransactionStatus ChallengeAdditionalAuth = new TransactionStatus("ChallengeAdditionalAuth", 4, "C");
    public static final TransactionStatus ChallengeDecoupledAuth = new TransactionStatus("ChallengeDecoupledAuth", 5, "D");
    public static final TransactionStatus VerificationRejected = new TransactionStatus("VerificationRejected", 6, "R");
    public static final TransactionStatus InformationOnly = new TransactionStatus("InformationOnly", 7, "I");

    private static final /* synthetic */ TransactionStatus[] $values() {
        return new TransactionStatus[]{VerificationSuccessful, VerificationDenied, VerificationNotPerformed, VerificationAttempted, ChallengeAdditionalAuth, ChallengeDecoupledAuth, VerificationRejected, InformationOnly};
    }

    public static EnumEntries<TransactionStatus> getEntries() {
        return $ENTRIES;
    }

    public static TransactionStatus valueOf(String str) {
        return (TransactionStatus) Enum.valueOf(TransactionStatus.class, str);
    }

    public static TransactionStatus[] values() {
        return (TransactionStatus[]) $VALUES.clone();
    }

    private TransactionStatus(String str, int i, String str2) {
        this.code = str2;
    }

    public final String getCode() {
        return this.code;
    }

    static {
        TransactionStatus[] transactionStatusArr$values = $values();
        $VALUES = transactionStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transactionStatusArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: TransactionStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", "code", "", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TransactionStatus fromCode(String code) {
            TransactionStatus transactionStatus = null;
            if (code == null) {
                return null;
            }
            Iterator<TransactionStatus> it = TransactionStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TransactionStatus next = it.next();
                if (Intrinsics.areEqual(next.getCode(), code)) {
                    transactionStatus = next;
                    break;
                }
            }
            return transactionStatus;
        }
    }
}
