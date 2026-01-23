package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneconfirmation;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo9;
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

/* compiled from: PhoneConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ1\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0000¢\u0006\u0002\b\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/fraudalert/phoneconfirmation/PhoneConfirmationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/fraudalert/phoneconfirmation/PhoneConfirmationViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/PageEvent;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/android/udf/DuxoBundle;)V", "doneLoading", "", "doneLoading$feature_credit_card_externalDebug", "onContinue", "phone", "", "onSuccess", "Lkotlin/Function0;", "onError", "onContinue$feature_credit_card_externalDebug", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PhoneConfirmationDuxo extends BaseDuxo5<PhoneConfirmationViewState, CreditApplicationDuxo9> {
    public static final int $stable = 8;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneConfirmationDuxo(CreditCardStore creditCardStore, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
        super(new PhoneConfirmationViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.creditCardStore = creditCardStore;
        this.defaultDispatcher = defaultDispatcher;
    }

    public final void doneLoading$feature_credit_card_externalDebug() {
        applyMutation(new PhoneConfirmationDuxo2(null));
    }

    public final void onContinue$feature_credit_card_externalDebug(String phone, Function0<Unit> onSuccess, Function0<Unit> onError) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        applyMutation(new PhoneConfirmationDuxo3(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new PhoneConfirmationDuxo4(this, phone, onSuccess, onError, null), 2, null);
    }
}
