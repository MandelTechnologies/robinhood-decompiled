package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp;

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

/* compiled from: PhoneOtpDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0013J)\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/fraudalert/phoneotp/PhoneOtpDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/fraudalert/phoneotp/PhoneOtpViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/PageEvent;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/android/udf/DuxoBundle;Lkotlinx/coroutines/CoroutineDispatcher;)V", "doneLoading", "", "doneLoading$feature_credit_card_externalDebug", "onContinue", "phone", "", "code", "onContinue$feature_credit_card_externalDebug", "onLandline", "dismiss", "Lkotlin/Function0;", "onLandlinePressCallback", "onLandline$feature_credit_card_externalDebug", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PhoneOtpDuxo extends BaseDuxo5<PhoneOtpViewState, CreditApplicationDuxo9> {
    public static final int $stable = 8;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneOtpDuxo(CreditCardStore creditCardStore, DuxoBundle duxoBundle, @DefaultDispatcher CoroutineDispatcher defaultDispatcher) {
        super(new PhoneOtpViewState(false, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.creditCardStore = creditCardStore;
        this.defaultDispatcher = defaultDispatcher;
    }

    public final void doneLoading$feature_credit_card_externalDebug() {
        applyMutation(new PhoneOtpDuxo2(null));
    }

    public final void onContinue$feature_credit_card_externalDebug(String phone, String code) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(code, "code");
        applyMutation(new PhoneOtpDuxo3(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new PhoneOtpDuxo4(this, phone, code, null), 2, null);
    }

    public final void onLandline$feature_credit_card_externalDebug(Function0<Unit> dismiss, Function0<Unit> onLandlinePressCallback) {
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Intrinsics.checkNotNullParameter(onLandlinePressCallback, "onLandlinePressCallback");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new PhoneOtpDuxo5(this, dismiss, onLandlinePressCallback, null), 2, null);
    }
}
