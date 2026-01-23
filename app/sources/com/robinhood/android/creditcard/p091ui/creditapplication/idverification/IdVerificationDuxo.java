package com.robinhood.android.creditcard.p091ui.creditapplication.idverification;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo9;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.idverification.IdVerificationData;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: IdVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/idverification/IdVerificationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/idverification/IdVerificationViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/PageEvent;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/android/udf/DuxoBundle;Lkotlinx/coroutines/CoroutineDispatcher;)V", "doneLoading", "", "doneLoading$feature_credit_card_externalDebug", "onSubmit", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/models/creditcard/api/idverification/IdVerificationData;", "onSubmit$feature_credit_card_externalDebug", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class IdVerificationDuxo extends BaseDuxo5<IdVerificationViewState, CreditApplicationDuxo9> {
    public static final int $stable = 8;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdVerificationDuxo(CreditCardStore creditCardStore, DuxoBundle duxoBundle, @DefaultDispatcher CoroutineDispatcher defaultDispatcher) {
        super(new IdVerificationViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.creditCardStore = creditCardStore;
        this.defaultDispatcher = defaultDispatcher;
    }

    public final void doneLoading$feature_credit_card_externalDebug() {
        applyMutation(new IdVerificationDuxo2(null));
    }

    public final void onSubmit$feature_credit_card_externalDebug(IdVerificationData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        applyMutation(new IdVerificationDuxo3(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new IdVerificationDuxo4(this, data, null), 2, null);
    }
}
