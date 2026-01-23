package com.robinhood.shared.security.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChallengeSource.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/ChallengeSource;", "", "requiresAuth", "", "<init>", "(Ljava/lang/String;IZ)V", "getRequiresAuth", "()Z", "EMAIL_UPDATE", "PHONE_UPDATE", "LOGIN", "PERSONAL_DATA_DELETION", "PERSONAL_DATA_DOWNLOAD", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChallengeSource[] $VALUES;
    private final boolean requiresAuth;
    public static final ChallengeSource EMAIL_UPDATE = new ChallengeSource("EMAIL_UPDATE", 0, true);
    public static final ChallengeSource PHONE_UPDATE = new ChallengeSource("PHONE_UPDATE", 1, true);
    public static final ChallengeSource LOGIN = new ChallengeSource("LOGIN", 2, false);
    public static final ChallengeSource PERSONAL_DATA_DELETION = new ChallengeSource("PERSONAL_DATA_DELETION", 3, true);
    public static final ChallengeSource PERSONAL_DATA_DOWNLOAD = new ChallengeSource("PERSONAL_DATA_DOWNLOAD", 4, true);

    private static final /* synthetic */ ChallengeSource[] $values() {
        return new ChallengeSource[]{EMAIL_UPDATE, PHONE_UPDATE, LOGIN, PERSONAL_DATA_DELETION, PERSONAL_DATA_DOWNLOAD};
    }

    public static EnumEntries<ChallengeSource> getEntries() {
        return $ENTRIES;
    }

    private ChallengeSource(String str, int i, boolean z) {
        this.requiresAuth = z;
    }

    public final boolean getRequiresAuth() {
        return this.requiresAuth;
    }

    static {
        ChallengeSource[] challengeSourceArr$values = $values();
        $VALUES = challengeSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(challengeSourceArr$values);
    }

    public static ChallengeSource valueOf(String str) {
        return (ChallengeSource) Enum.valueOf(ChallengeSource.class, str);
    }

    public static ChallengeSource[] values() {
        return (ChallengeSource[]) $VALUES.clone();
    }
}
