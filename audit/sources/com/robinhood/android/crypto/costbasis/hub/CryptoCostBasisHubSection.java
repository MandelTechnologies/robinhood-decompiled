package com.robinhood.android.crypto.costbasis.hub;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import nummus.p512v1.CostBasisStatusDto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoCostBasisHubSection.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSection;", "", "<init>", "(Ljava/lang/String;I)V", "SOLD_IN_2025", "MISSING_DETAILS", "CONFIRMED", "status", "Lnummus/v1/CostBasisStatusDto;", "getStatus", "()Lnummus/v1/CostBasisStatusDto;", "year", "", "getYear", "()Ljava/lang/Integer;", "allowCorrection", "", "getAllowCorrection", "()Z", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoCostBasisHubSection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoCostBasisHubSection[] $VALUES;
    public static final CryptoCostBasisHubSection SOLD_IN_2025 = new CryptoCostBasisHubSection("SOLD_IN_2025", 0);
    public static final CryptoCostBasisHubSection MISSING_DETAILS = new CryptoCostBasisHubSection("MISSING_DETAILS", 1);
    public static final CryptoCostBasisHubSection CONFIRMED = new CryptoCostBasisHubSection("CONFIRMED", 2);

    /* compiled from: CryptoCostBasisHubSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoCostBasisHubSection.values().length];
            try {
                iArr[CryptoCostBasisHubSection.SOLD_IN_2025.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoCostBasisHubSection.MISSING_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoCostBasisHubSection.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ CryptoCostBasisHubSection[] $values() {
        return new CryptoCostBasisHubSection[]{SOLD_IN_2025, MISSING_DETAILS, CONFIRMED};
    }

    public static EnumEntries<CryptoCostBasisHubSection> getEntries() {
        return $ENTRIES;
    }

    private CryptoCostBasisHubSection(String str, int i) {
    }

    static {
        CryptoCostBasisHubSection[] cryptoCostBasisHubSectionArr$values = $values();
        $VALUES = cryptoCostBasisHubSectionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoCostBasisHubSectionArr$values);
    }

    public final CostBasisStatusDto getStatus() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return CostBasisStatusDto.COST_BASIS_STATUS_NEEDS_ACTION;
        }
        if (i == 2) {
            return CostBasisStatusDto.COST_BASIS_STATUS_NEEDS_ACTION;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return CostBasisStatusDto.COST_BASIS_STATUS_COMPLETED;
    }

    public final Integer getYear() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return 2025;
        }
        if (i == 2 || i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getAllowCorrection() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static CryptoCostBasisHubSection valueOf(String str) {
        return (CryptoCostBasisHubSection) Enum.valueOf(CryptoCostBasisHubSection.class, str);
    }

    public static CryptoCostBasisHubSection[] values() {
        return (CryptoCostBasisHubSection[]) $VALUES.clone();
    }
}
