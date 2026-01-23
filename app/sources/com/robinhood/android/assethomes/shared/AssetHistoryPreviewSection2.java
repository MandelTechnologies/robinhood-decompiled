package com.robinhood.android.assethomes.shared;

import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AssetHistoryPreviewSection.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/assethomes/shared/AssetHistoryType;", "", "<init>", "(Ljava/lang/String;I)V", "EQUITIES", "OPTIONS", "FUTURES", "transactionTypeFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "getTransactionTypeFilter", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "lib-asset-homes-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.assethomes.shared.AssetHistoryType, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHistoryPreviewSection2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetHistoryPreviewSection2[] $VALUES;
    public static final AssetHistoryPreviewSection2 EQUITIES = new AssetHistoryPreviewSection2("EQUITIES", 0);
    public static final AssetHistoryPreviewSection2 OPTIONS = new AssetHistoryPreviewSection2("OPTIONS", 1);
    public static final AssetHistoryPreviewSection2 FUTURES = new AssetHistoryPreviewSection2("FUTURES", 2);

    /* compiled from: AssetHistoryPreviewSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.assethomes.shared.AssetHistoryType$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetHistoryPreviewSection2.values().length];
            try {
                iArr[AssetHistoryPreviewSection2.EQUITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetHistoryPreviewSection2.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetHistoryPreviewSection2.FUTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ AssetHistoryPreviewSection2[] $values() {
        return new AssetHistoryPreviewSection2[]{EQUITIES, OPTIONS, FUTURES};
    }

    public static EnumEntries<AssetHistoryPreviewSection2> getEntries() {
        return $ENTRIES;
    }

    private AssetHistoryPreviewSection2(String str, int i) {
    }

    static {
        AssetHistoryPreviewSection2[] assetHistoryPreviewSection2Arr$values = $values();
        $VALUES = assetHistoryPreviewSection2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetHistoryPreviewSection2Arr$values);
    }

    public final AccountsHistoryTransactionTypeFilter getTransactionTypeFilter() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return AccountsHistoryTransactionTypeFilter.EQUITIES;
        }
        if (i == 2) {
            return AccountsHistoryTransactionTypeFilter.OPTIONS;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return AccountsHistoryTransactionTypeFilter.FUTURES;
    }

    public static AssetHistoryPreviewSection2 valueOf(String str) {
        return (AssetHistoryPreviewSection2) Enum.valueOf(AssetHistoryPreviewSection2.class, str);
    }

    public static AssetHistoryPreviewSection2[] values() {
        return (AssetHistoryPreviewSection2[]) $VALUES.clone();
    }
}
