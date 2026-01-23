package com.robinhood.shared.trade.crypto.p397ui.recurringHook;

import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoOrderRecurringHookFrequency.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;", "", "apiFrequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "<init>", "(Ljava/lang/String;ILcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "getApiFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "ONE_TIME", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderRecurringHookFrequency {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoOrderRecurringHookFrequency[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final ApiInvestmentSchedule.Frequency apiFrequency;
    public static final CryptoOrderRecurringHookFrequency ONE_TIME = new CryptoOrderRecurringHookFrequency("ONE_TIME", 0, null);
    public static final CryptoOrderRecurringHookFrequency DAILY = new CryptoOrderRecurringHookFrequency("DAILY", 1, ApiInvestmentSchedule.Frequency.DAILY);
    public static final CryptoOrderRecurringHookFrequency WEEKLY = new CryptoOrderRecurringHookFrequency("WEEKLY", 2, ApiInvestmentSchedule.Frequency.WEEKLY);
    public static final CryptoOrderRecurringHookFrequency BIWEEKLY = new CryptoOrderRecurringHookFrequency("BIWEEKLY", 3, ApiInvestmentSchedule.Frequency.BIWEEKLY);
    public static final CryptoOrderRecurringHookFrequency MONTHLY = new CryptoOrderRecurringHookFrequency("MONTHLY", 4, ApiInvestmentSchedule.Frequency.MONTHLY);

    private static final /* synthetic */ CryptoOrderRecurringHookFrequency[] $values() {
        return new CryptoOrderRecurringHookFrequency[]{ONE_TIME, DAILY, WEEKLY, BIWEEKLY, MONTHLY};
    }

    public static EnumEntries<CryptoOrderRecurringHookFrequency> getEntries() {
        return $ENTRIES;
    }

    private CryptoOrderRecurringHookFrequency(String str, int i, ApiInvestmentSchedule.Frequency frequency) {
        this.apiFrequency = frequency;
    }

    public final ApiInvestmentSchedule.Frequency getApiFrequency() {
        return this.apiFrequency;
    }

    static {
        CryptoOrderRecurringHookFrequency[] cryptoOrderRecurringHookFrequencyArr$values = $values();
        $VALUES = cryptoOrderRecurringHookFrequencyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoOrderRecurringHookFrequencyArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: CryptoOrderRecurringHookFrequency.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency$Companion;", "", "<init>", "()V", "fromApiFrequency", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;", "apiFrequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: CryptoOrderRecurringHookFrequency.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
                try {
                    iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CryptoOrderRecurringHookFrequency fromApiFrequency(ApiInvestmentSchedule.Frequency apiFrequency) {
            int i = apiFrequency == null ? -1 : WhenMappings.$EnumSwitchMapping$0[apiFrequency.ordinal()];
            if (i == -1) {
                return CryptoOrderRecurringHookFrequency.ONE_TIME;
            }
            if (i == 1) {
                throw new IllegalStateException(("Invalid frequency used for crypto order recurring hook: " + apiFrequency.name()).toString());
            }
            if (i == 2) {
                return CryptoOrderRecurringHookFrequency.DAILY;
            }
            if (i == 3) {
                return CryptoOrderRecurringHookFrequency.WEEKLY;
            }
            if (i == 4) {
                return CryptoOrderRecurringHookFrequency.BIWEEKLY;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return CryptoOrderRecurringHookFrequency.MONTHLY;
        }
    }

    public static CryptoOrderRecurringHookFrequency valueOf(String str) {
        return (CryptoOrderRecurringHookFrequency) Enum.valueOf(CryptoOrderRecurringHookFrequency.class, str);
    }

    public static CryptoOrderRecurringHookFrequency[] values() {
        return (CryptoOrderRecurringHookFrequency[]) $VALUES.clone();
    }
}
