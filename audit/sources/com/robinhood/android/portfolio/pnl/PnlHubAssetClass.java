package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.portfolio.pnlhub.models.C25781R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PnlHubAssetClass.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "", "assetClassName", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/resource/StringResource;)V", "getAssetClassName", "()Lcom/robinhood/utils/resource/StringResource;", "CRYPTO", "EQUITY_ETF", "EQUITY", "OPTIONS", DisplaySpans.ALL, "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PnlHubAssetClass {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PnlHubAssetClass[] $VALUES;
    public static final PnlHubAssetClass ALL;
    public static final PnlHubAssetClass CRYPTO;
    public static final PnlHubAssetClass EQUITY;
    public static final PnlHubAssetClass EQUITY_ETF;
    public static final PnlHubAssetClass OPTIONS;
    private final StringResource assetClassName;

    private static final /* synthetic */ PnlHubAssetClass[] $values() {
        return new PnlHubAssetClass[]{CRYPTO, EQUITY_ETF, EQUITY, OPTIONS, ALL};
    }

    public static EnumEntries<PnlHubAssetClass> getEntries() {
        return $ENTRIES;
    }

    private PnlHubAssetClass(String str, int i, StringResource stringResource) {
        this.assetClassName = stringResource;
    }

    public final StringResource getAssetClassName() {
        return this.assetClassName;
    }

    static {
        StringResource.Companion companion = StringResource.INSTANCE;
        CRYPTO = new PnlHubAssetClass("CRYPTO", 0, companion.invoke(C25781R.string.gated_crypto_crypto_asset_name, new Object[0]));
        EQUITY_ETF = new PnlHubAssetClass("EQUITY_ETF", 1, companion.invoke(C25781R.string.gated_etf_equities_asset_name, new Object[0]));
        EQUITY = new PnlHubAssetClass("EQUITY", 2, companion.invoke(C25781R.string.equities_asset_name, new Object[0]));
        OPTIONS = new PnlHubAssetClass("OPTIONS", 3, companion.invoke(C25781R.string.gated_options_asset_name, new Object[0]));
        ALL = new PnlHubAssetClass(DisplaySpans.ALL, 4, companion.invoke(C25781R.string.all_assets, new Object[0]));
        PnlHubAssetClass[] pnlHubAssetClassArr$values = $values();
        $VALUES = pnlHubAssetClassArr$values;
        $ENTRIES = EnumEntries2.enumEntries(pnlHubAssetClassArr$values);
    }

    public static PnlHubAssetClass valueOf(String str) {
        return (PnlHubAssetClass) Enum.valueOf(PnlHubAssetClass.class, str);
    }

    public static PnlHubAssetClass[] values() {
        return (PnlHubAssetClass[]) $VALUES.clone();
    }
}
