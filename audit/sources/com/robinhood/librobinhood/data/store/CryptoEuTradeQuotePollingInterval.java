package com.robinhood.librobinhood.data.store;

import com.robinhood.experiments.Experiment;
import kotlin.Metadata;

/* compiled from: CryptoExperimentsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoEuTradeQuotePollingInterval;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/librobinhood/data/store/PollingIntervalVariant;", "<init>", "()V", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoEuTradeQuotePollingInterval extends Experiment<PollingIntervalVariant> {
    public static final CryptoEuTradeQuotePollingInterval INSTANCE = new CryptoEuTradeQuotePollingInterval();

    private CryptoEuTradeQuotePollingInterval() {
        super("crypto-eu-trade-quote-polling-interval", null, 2, null);
    }
}
