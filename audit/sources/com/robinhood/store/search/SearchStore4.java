package com.robinhood.store.search;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/store/search/SearchSource;", "", "<init>", "(Ljava/lang/String;I)V", "UNIVERSAL", "RETIREMENT", "JOINT_ACCOUNTS", "CRYPTO_TRADER", "CRYPTO_RHC", "PERPETUALS_RHC", "lib-store-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.search.SearchSource, reason: use source file name */
/* loaded from: classes12.dex */
public final class SearchStore4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SearchStore4[] $VALUES;
    public static final SearchStore4 UNIVERSAL = new SearchStore4("UNIVERSAL", 0);
    public static final SearchStore4 RETIREMENT = new SearchStore4("RETIREMENT", 1);
    public static final SearchStore4 JOINT_ACCOUNTS = new SearchStore4("JOINT_ACCOUNTS", 2);
    public static final SearchStore4 CRYPTO_TRADER = new SearchStore4("CRYPTO_TRADER", 3);
    public static final SearchStore4 CRYPTO_RHC = new SearchStore4("CRYPTO_RHC", 4);
    public static final SearchStore4 PERPETUALS_RHC = new SearchStore4("PERPETUALS_RHC", 5);

    private static final /* synthetic */ SearchStore4[] $values() {
        return new SearchStore4[]{UNIVERSAL, RETIREMENT, JOINT_ACCOUNTS, CRYPTO_TRADER, CRYPTO_RHC, PERPETUALS_RHC};
    }

    public static EnumEntries<SearchStore4> getEntries() {
        return $ENTRIES;
    }

    private SearchStore4(String str, int i) {
    }

    static {
        SearchStore4[] searchStore4Arr$values = $values();
        $VALUES = searchStore4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(searchStore4Arr$values);
    }

    public static SearchStore4 valueOf(String str) {
        return (SearchStore4) Enum.valueOf(SearchStore4.class, str);
    }

    public static SearchStore4[] values() {
        return (SearchStore4[]) $VALUES.clone();
    }
}
