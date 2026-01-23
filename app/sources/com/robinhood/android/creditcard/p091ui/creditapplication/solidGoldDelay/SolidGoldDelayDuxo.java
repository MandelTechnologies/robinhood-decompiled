package com.robinhood.android.creditcard.p091ui.creditapplication.solidGoldDelay;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: SolidGoldDelayDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0000¢\u0006\u0002\b\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayEvent;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/android/udf/DuxoBundle;)V", "claimCashPrize", "", "callback", "Lkotlin/Function0;", "claimCashPrize$feature_credit_card_externalDebug", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class SolidGoldDelayDuxo extends BaseDuxo5<SolidGoldDelayViewState, SolidGoldDelayDuxo4> {
    public static final int $stable = 8;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidGoldDelayDuxo(CreditCardStore creditCardStore, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
        super(new SolidGoldDelayViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.creditCardStore = creditCardStore;
        this.defaultDispatcher = defaultDispatcher;
    }

    public final void claimCashPrize$feature_credit_card_externalDebug(Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        applyMutation(new SolidGoldDelayDuxo2(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new SolidGoldDelayDuxo3(this, callback, null), 2, null);
    }
}
