package com.robinhood.android.portfolio.pnl.api;

import com.robinhood.android.portfolio.pnl.fixtures.FakeProfitAndLossTradeListApi;
import kotlin.Metadata;

/* compiled from: ProfitAndLossTradeListApiModule.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossTradeListApiModule;", "", "<init>", "()V", "provideProfitAndLossTradeListApi", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossTradeListApi;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfitAndLossTradeListApiModule {
    public static final ProfitAndLossTradeListApiModule INSTANCE = new ProfitAndLossTradeListApiModule();

    private ProfitAndLossTradeListApiModule() {
    }

    public final ProfitAndLossTradeListApi provideProfitAndLossTradeListApi() {
        return new FakeProfitAndLossTradeListApi();
    }
}
