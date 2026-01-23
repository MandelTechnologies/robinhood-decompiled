package com.robinhood.shared.history;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HistoryDisclosure.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/history/HistoryDisclosure;", "", "disclosureId", "", "<init>", "(Ljava/lang/String;II)V", "getDisclosureId", "()I", "BASE", "BASE_UK", "ADVISORY", "CRYPTO", "FUTURES", "EVENT_CONTRACTS", "FUTURES_AND_EVENT_CONTRACTS", "SPENDING", "FUTURES_UK", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class HistoryDisclosure {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HistoryDisclosure[] $VALUES;
    private final int disclosureId;
    public static final HistoryDisclosure BASE = new HistoryDisclosure("BASE", 0, C38968R.string.history_base_disclosure);
    public static final HistoryDisclosure BASE_UK = new HistoryDisclosure("BASE_UK", 1, C38968R.string.history_base_disclosure_uk);
    public static final HistoryDisclosure ADVISORY = new HistoryDisclosure("ADVISORY", 2, C38968R.string.history_advisory_disclosure);
    public static final HistoryDisclosure CRYPTO = new HistoryDisclosure("CRYPTO", 3, C38968R.string.gated_crypto_rhc_history_crypto_disclosure);
    public static final HistoryDisclosure FUTURES = new HistoryDisclosure("FUTURES", 4, C38968R.string.history_futures_disclosure);
    public static final HistoryDisclosure EVENT_CONTRACTS = new HistoryDisclosure("EVENT_CONTRACTS", 5, C38968R.string.history_event_contracts_disclosure);
    public static final HistoryDisclosure FUTURES_AND_EVENT_CONTRACTS = new HistoryDisclosure("FUTURES_AND_EVENT_CONTRACTS", 6, C38968R.string.history_futures_and_event_contracts_disclosure);
    public static final HistoryDisclosure SPENDING = new HistoryDisclosure("SPENDING", 7, C38968R.string.history_spending_disclosure);
    public static final HistoryDisclosure FUTURES_UK = new HistoryDisclosure("FUTURES_UK", 8, C38968R.string.history_futures_disclosure_uk);

    private static final /* synthetic */ HistoryDisclosure[] $values() {
        return new HistoryDisclosure[]{BASE, BASE_UK, ADVISORY, CRYPTO, FUTURES, EVENT_CONTRACTS, FUTURES_AND_EVENT_CONTRACTS, SPENDING, FUTURES_UK};
    }

    public static EnumEntries<HistoryDisclosure> getEntries() {
        return $ENTRIES;
    }

    private HistoryDisclosure(String str, int i, int i2) {
        this.disclosureId = i2;
    }

    public final int getDisclosureId() {
        return this.disclosureId;
    }

    static {
        HistoryDisclosure[] historyDisclosureArr$values = $values();
        $VALUES = historyDisclosureArr$values;
        $ENTRIES = EnumEntries2.enumEntries(historyDisclosureArr$values);
    }

    public static HistoryDisclosure valueOf(String str) {
        return (HistoryDisclosure) Enum.valueOf(HistoryDisclosure.class, str);
    }

    public static HistoryDisclosure[] values() {
        return (HistoryDisclosure[]) $VALUES.clone();
    }
}
