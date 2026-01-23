package com.robinhood.android.matcha.p177ui.instantwithdrawal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InstantWithdrawalIntroDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/ContentType;", "", "contentfulId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "FREE", "CHEAPER", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.instantwithdrawal.ContentType, reason: use source file name */
/* loaded from: classes8.dex */
public final class InstantWithdrawalIntroDataState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstantWithdrawalIntroDataState2[] $VALUES;
    private final String contentfulId;
    public static final InstantWithdrawalIntroDataState2 FREE = new InstantWithdrawalIntroDataState2("FREE", 0, "BDdsdic6zI783Waty1Rfn");
    public static final InstantWithdrawalIntroDataState2 CHEAPER = new InstantWithdrawalIntroDataState2("CHEAPER", 1, "6F4Pa2SUGpFTwEf9G10znl");

    private static final /* synthetic */ InstantWithdrawalIntroDataState2[] $values() {
        return new InstantWithdrawalIntroDataState2[]{FREE, CHEAPER};
    }

    public static EnumEntries<InstantWithdrawalIntroDataState2> getEntries() {
        return $ENTRIES;
    }

    private InstantWithdrawalIntroDataState2(String str, int i, String str2) {
        this.contentfulId = str2;
    }

    public final String getContentfulId() {
        return this.contentfulId;
    }

    static {
        InstantWithdrawalIntroDataState2[] instantWithdrawalIntroDataState2Arr$values = $values();
        $VALUES = instantWithdrawalIntroDataState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(instantWithdrawalIntroDataState2Arr$values);
    }

    public static InstantWithdrawalIntroDataState2 valueOf(String str) {
        return (InstantWithdrawalIntroDataState2) Enum.valueOf(InstantWithdrawalIntroDataState2.class, str);
    }

    public static InstantWithdrawalIntroDataState2[] values() {
        return (InstantWithdrawalIntroDataState2[]) $VALUES.clone();
    }
}
