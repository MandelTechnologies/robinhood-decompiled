package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.splash;

import android.content.res.Resources;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositExtraCashSplashStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDataState;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashSplashStateProvider implements StateProvider<RecurringDepositExtraCashSplashDataState, RecurringDepositExtraCashSplashViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public RecurringDepositExtraCashSplashStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public RecurringDepositExtraCashSplashViewState reduce(RecurringDepositExtraCashSplashDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new RecurringDepositExtraCashSplashViewState(RecurringDepositExtraCashSplashStateProvider2.isLoading(dataState), RecurringDepositExtraCashSplashStateProvider2.dayNightLottieAssets(dataState), RecurringDepositExtraCashSplashStateProvider2.title(dataState, this.resources), RecurringDepositExtraCashSplashStateProvider2.description(dataState, this.resources));
    }
}
