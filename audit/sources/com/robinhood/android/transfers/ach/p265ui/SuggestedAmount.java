package com.robinhood.android.transfers.ach.p265ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuggestedAmount.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/SuggestedAmount;", "", "upTo100", "Lcom/robinhood/android/transfers/ach/ui/AmountBucket;", "upTo200", "upTo500", "<init>", "(Ljava/lang/String;ILcom/robinhood/android/transfers/ach/ui/AmountBucket;Lcom/robinhood/android/transfers/ach/ui/AmountBucket;Lcom/robinhood/android/transfers/ach/ui/AmountBucket;)V", "getUpTo100", "()Lcom/robinhood/android/transfers/ach/ui/AmountBucket;", "getUpTo200", "getUpTo500", "REGULAR", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SuggestedAmount {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SuggestedAmount[] $VALUES;
    public static final SuggestedAmount REGULAR = new SuggestedAmount("REGULAR", 0, new AmountBucket(10, 25, 50), new AmountBucket(25, 50, 100), new AmountBucket(50, 100, 200));
    private final AmountBucket upTo100;
    private final AmountBucket upTo200;
    private final AmountBucket upTo500;

    private static final /* synthetic */ SuggestedAmount[] $values() {
        return new SuggestedAmount[]{REGULAR};
    }

    public static EnumEntries<SuggestedAmount> getEntries() {
        return $ENTRIES;
    }

    private SuggestedAmount(String str, int i, AmountBucket amountBucket, AmountBucket amountBucket2, AmountBucket amountBucket3) {
        this.upTo100 = amountBucket;
        this.upTo200 = amountBucket2;
        this.upTo500 = amountBucket3;
    }

    public final AmountBucket getUpTo100() {
        return this.upTo100;
    }

    public final AmountBucket getUpTo200() {
        return this.upTo200;
    }

    public final AmountBucket getUpTo500() {
        return this.upTo500;
    }

    static {
        SuggestedAmount[] suggestedAmountArr$values = $values();
        $VALUES = suggestedAmountArr$values;
        $ENTRIES = EnumEntries2.enumEntries(suggestedAmountArr$values);
    }

    public static SuggestedAmount valueOf(String str) {
        return (SuggestedAmount) Enum.valueOf(SuggestedAmount.class, str);
    }

    public static SuggestedAmount[] values() {
        return (SuggestedAmount[]) $VALUES.clone();
    }
}
