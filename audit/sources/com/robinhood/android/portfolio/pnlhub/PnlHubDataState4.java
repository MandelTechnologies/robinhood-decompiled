package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.portfolio.pnlhub.p216ui.C25819R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PnlHubDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSortSettings;", "", "sortName", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/resource/StringResource;)V", "getSortName", "()Lcom/robinhood/utils/resource/StringResource;", "DATE", "SYMBOL", "PNL", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubTradeDetailSortSettings, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubDataState4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PnlHubDataState4[] $VALUES;
    public static final PnlHubDataState4 DATE;
    public static final PnlHubDataState4 PNL;
    public static final PnlHubDataState4 SYMBOL;
    private final StringResource sortName;

    private static final /* synthetic */ PnlHubDataState4[] $values() {
        return new PnlHubDataState4[]{DATE, SYMBOL, PNL};
    }

    public static EnumEntries<PnlHubDataState4> getEntries() {
        return $ENTRIES;
    }

    private PnlHubDataState4(String str, int i, StringResource stringResource) {
        this.sortName = stringResource;
    }

    public final StringResource getSortName() {
        return this.sortName;
    }

    static {
        StringResource.Companion companion = StringResource.INSTANCE;
        DATE = new PnlHubDataState4("DATE", 0, companion.invoke(C25819R.string.pnl_hub_trade_detail_sort_key_date, new Object[0]));
        SYMBOL = new PnlHubDataState4("SYMBOL", 1, companion.invoke(C25819R.string.pnl_hub_trade_detail_sort_key_symbol, new Object[0]));
        PNL = new PnlHubDataState4("PNL", 2, companion.invoke(C25819R.string.pnl_hub_trade_detail_sort_key_pnl, new Object[0]));
        PnlHubDataState4[] pnlHubDataState4Arr$values = $values();
        $VALUES = pnlHubDataState4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(pnlHubDataState4Arr$values);
    }

    public static PnlHubDataState4 valueOf(String str) {
        return (PnlHubDataState4) Enum.valueOf(PnlHubDataState4.class, str);
    }

    public static PnlHubDataState4[] values() {
        return (PnlHubDataState4[]) $VALUES.clone();
    }
}
