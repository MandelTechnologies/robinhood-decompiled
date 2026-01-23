package com.robinhood.android.advisory.projection.transfer;

import com.robinhood.android.advisory.ManagedAccountsDefaultSelector;
import com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimEvent;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.p320db.Account;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: StrategiesTransferShimDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimViewState;", "Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimEvent;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class StrategiesTransferShimDuxo extends BaseDuxo5<StrategiesTransferShimViewState, StrategiesTransferShimEvent> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategiesTransferShimDuxo(AccountProvider accountProvider, DuxoBundle duxoBundle) {
        super(new StrategiesTransferShimViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
    }

    /* compiled from: StrategiesTransferShimDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimDuxo$onCreate$1", m3645f = "StrategiesTransferShimDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimDuxo$onCreate$1 */
    static final class C93031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C93031(Continuation<? super C93031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StrategiesTransferShimDuxo.this.new C93031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C93031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<List<Account>> observableStreamAllManagedAccounts = StrategiesTransferShimDuxo.this.accountProvider.streamAllManagedAccounts();
                this.label = 1;
                obj = RxAwait3.awaitFirstOrNull(observableStreamAllManagedAccounts, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            Account defaultManagedAccount = list != null ? ManagedAccountsDefaultSelector.getDefaultManagedAccount(list) : null;
            if (defaultManagedAccount != null) {
                StrategiesTransferShimDuxo.this.submit(new StrategiesTransferShimEvent.Navigate(TransferNavigationDestination.getTransferNavigationDestination$default(defaultManagedAccount.getAccountNumberRhs(), defaultManagedAccount.getBrokerageAccountType(), null, null, 12, null)));
            } else {
                StrategiesTransferShimDuxo.this.submit(StrategiesTransferShimEvent.Error.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().launchWhenCreated(new C93031(null));
    }
}
