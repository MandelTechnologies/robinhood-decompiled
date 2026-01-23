package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.banner;

import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RhyOverviewBannerType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "", "<init>", "(Ljava/lang/String;I)V", TransferContext3.NORMAL, "WARNING", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyOverviewBannerType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RhyOverviewBannerType[] $VALUES;
    public static final RhyOverviewBannerType NORMAL = new RhyOverviewBannerType(TransferContext3.NORMAL, 0);
    public static final RhyOverviewBannerType WARNING = new RhyOverviewBannerType("WARNING", 1);

    private static final /* synthetic */ RhyOverviewBannerType[] $values() {
        return new RhyOverviewBannerType[]{NORMAL, WARNING};
    }

    public static EnumEntries<RhyOverviewBannerType> getEntries() {
        return $ENTRIES;
    }

    private RhyOverviewBannerType(String str, int i) {
    }

    static {
        RhyOverviewBannerType[] rhyOverviewBannerTypeArr$values = $values();
        $VALUES = rhyOverviewBannerTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rhyOverviewBannerTypeArr$values);
    }

    public static RhyOverviewBannerType valueOf(String str) {
        return (RhyOverviewBannerType) Enum.valueOf(RhyOverviewBannerType.class, str);
    }

    public static RhyOverviewBannerType[] values() {
        return (RhyOverviewBannerType[]) $VALUES.clone();
    }
}
