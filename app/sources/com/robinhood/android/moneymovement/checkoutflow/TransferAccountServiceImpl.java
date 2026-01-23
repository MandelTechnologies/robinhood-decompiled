package com.robinhood.android.moneymovement.checkoutflow;

import com.robinhood.android.lib.transfers.microgram.TransferAccounts;
import com.robinhood.lib.transfers.contracts.TransferAccountsService;
import com.robinhood.lib.transfers.contracts.models.TransferAccount;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: TransferAccountServiceImpl.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/TransferAccountServiceImpl;", "Lcom/robinhood/lib/transfers/contracts/TransferAccountsService;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;)V", "getTransferAccounts", "", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccount;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TransferAccountServiceImpl implements TransferAccountsService {
    public static final int $stable = 8;
    private final TransferAccountStore transferAccountStore;

    /* compiled from: TransferAccountServiceImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.TransferAccountServiceImpl", m3645f = "TransferAccountServiceImpl.kt", m3646l = {32}, m3647m = "getTransferAccounts")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.TransferAccountServiceImpl$getTransferAccounts$1 */
    static final class C222061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C222061(Continuation<? super C222061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferAccountServiceImpl.this.getTransferAccounts(this);
        }
    }

    public TransferAccountServiceImpl(TransferAccountStore transferAccountStore) {
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        this.transferAccountStore = transferAccountStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.lib.transfers.contracts.TransferAccountsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTransferAccounts(Continuation<? super List<TransferAccount>> continuation) {
        C222061 c222061;
        if (continuation instanceof C222061) {
            c222061 = (C222061) continuation;
            int i = c222061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c222061.label = i - Integer.MIN_VALUE;
            } else {
                c222061 = new C222061(continuation);
            }
        }
        Object objAwaitFirst = c222061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c222061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            ObservableSource map = this.transferAccountStore.stream().map(new Function() { // from class: com.robinhood.android.moneymovement.checkoutflow.TransferAccountServiceImpl.getTransferAccounts.2
                @Override // io.reactivex.functions.Function
                public final List<com.robinhood.models.p320db.bonfire.TransferAccount> apply(List<com.robinhood.models.p320db.bonfire.TransferAccount> accounts2) {
                    Intrinsics.checkNotNullParameter(accounts2, "accounts");
                    ArrayList arrayList = new ArrayList();
                    for (T t : accounts2) {
                        com.robinhood.models.p320db.bonfire.TransferAccount transferAccount = (com.robinhood.models.p320db.bonfire.TransferAccount) t;
                        if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.RHS ? Intrinsics.areEqual(transferAccount.isDefaultInternalAccount(), Boolean.TRUE) : true) {
                            arrayList.add(t);
                        }
                    }
                    return arrayList;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            c222061.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(map, c222061);
            if (objAwaitFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitFirst);
        }
        Intrinsics.checkNotNullExpressionValue(objAwaitFirst, "awaitFirst(...)");
        Iterable iterable = (Iterable) objAwaitFirst;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(TransferAccounts.toMicrogramTransferAccount((com.robinhood.models.p320db.bonfire.TransferAccount) it.next()));
        }
        return arrayList;
    }
}
