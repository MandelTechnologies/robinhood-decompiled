package com.robinhood.android.transfers.p271ui.updaterecurring;

import com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateRecurringDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/updaterecurring/UpdateRecurringDepositDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ui/updaterecurring/UpdateRecurringDepositViewState;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "streamMaxAwarenessExperimentState", "Lio/reactivex/Observable;", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class UpdateRecurringDepositDuxo extends BaseDuxo4<UpdateRecurringDepositViewState> {
    public static final int $stable = 8;
    private final GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRecurringDepositDuxo(GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, DuxoBundle duxoBundle) {
        super(UpdateRecurringDepositViewState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldDepositBoostMaxAwarenessStore = goldDepositBoostMaxAwarenessStore;
    }

    public final Observable<Boolean> streamMaxAwarenessExperimentState() {
        return this.goldDepositBoostMaxAwarenessStore.streamGoldDepositBoostMaxAwareness();
    }
}
