package com.robinhood.android.portfolio.pnl.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossTradeListApiModule_ProvideProfitAndLossTradeListApiFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossTradeListApiModule_ProvideProfitAndLossTradeListApiFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossTradeListApi;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideProfitAndLossTradeListApi", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnl.api.ProfitAndLossTradeListApiModule_ProvideProfitAndLossTradeListApiFactory */
/* loaded from: classes11.dex */
public final class C25678xf6213878 implements Factory<ProfitAndLossTradeListApi> {
    public static final C25678xf6213878 INSTANCE = new C25678xf6213878();

    private C25678xf6213878() {
    }

    @Override // javax.inject.Provider
    public ProfitAndLossTradeListApi get() {
        return provideProfitAndLossTradeListApi();
    }

    @JvmStatic
    public static final C25678xf6213878 create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final ProfitAndLossTradeListApi provideProfitAndLossTradeListApi() {
        Object objCheckNotNull = Preconditions.checkNotNull(ProfitAndLossTradeListApiModule.INSTANCE.provideProfitAndLossTradeListApi(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (ProfitAndLossTradeListApi) objCheckNotNull;
    }
}
