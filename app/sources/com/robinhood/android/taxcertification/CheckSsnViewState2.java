package com.robinhood.android.taxcertification;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckSsnViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/SsnVerifyResult;", "", "<init>", "(Ljava/lang/String;I)V", "PASSED", "FAILED", "LOCKED_OUT", "OTHER_ERROR", "analyticsString", "", "getAnalyticsString", "()Ljava/lang/String;", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcertification.SsnVerifyResult, reason: use source file name */
/* loaded from: classes9.dex */
public final class CheckSsnViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CheckSsnViewState2[] $VALUES;
    public static final CheckSsnViewState2 PASSED = new CheckSsnViewState2("PASSED", 0);
    public static final CheckSsnViewState2 FAILED = new CheckSsnViewState2("FAILED", 1);
    public static final CheckSsnViewState2 LOCKED_OUT = new CheckSsnViewState2("LOCKED_OUT", 2);
    public static final CheckSsnViewState2 OTHER_ERROR = new CheckSsnViewState2("OTHER_ERROR", 3);

    /* compiled from: CheckSsnViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.taxcertification.SsnVerifyResult$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckSsnViewState2.values().length];
            try {
                iArr[CheckSsnViewState2.PASSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckSsnViewState2.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckSsnViewState2.LOCKED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckSsnViewState2.OTHER_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ CheckSsnViewState2[] $values() {
        return new CheckSsnViewState2[]{PASSED, FAILED, LOCKED_OUT, OTHER_ERROR};
    }

    public static EnumEntries<CheckSsnViewState2> getEntries() {
        return $ENTRIES;
    }

    private CheckSsnViewState2(String str, int i) {
    }

    static {
        CheckSsnViewState2[] checkSsnViewState2Arr$values = $values();
        $VALUES = checkSsnViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(checkSsnViewState2Arr$values);
    }

    public final String getAnalyticsString() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "success";
        }
        if (i == 2 || i == 3) {
            return "failure";
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return "error";
    }

    public static CheckSsnViewState2 valueOf(String str) {
        return (CheckSsnViewState2) Enum.valueOf(CheckSsnViewState2.class, str);
    }

    public static CheckSsnViewState2[] values() {
        return (CheckSsnViewState2[]) $VALUES.clone();
    }
}
