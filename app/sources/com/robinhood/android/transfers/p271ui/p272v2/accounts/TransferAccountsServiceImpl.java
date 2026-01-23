package com.robinhood.android.transfers.p271ui.p272v2.accounts;

import com.robinhood.android.lib.transfers.microgram.TransferAccounts;
import com.robinhood.lib.transfers.contracts.TransferAccountsService;
import com.robinhood.lib.transfers.contracts.models.TransferAccount;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import io.reactivex.Observable;
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

/* compiled from: TransferAccountsServiceImpl.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/accounts/TransferAccountsServiceImpl;", "Lcom/robinhood/lib/transfers/contracts/TransferAccountsService;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;)V", "getTransferAccounts", "", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccount;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferAccountsServiceImpl implements TransferAccountsService {
    public static final int $stable = 8;
    private final TransferAccountStore transferAccountStore;

    /* compiled from: TransferAccountsServiceImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.accounts.TransferAccountsServiceImpl", m3645f = "TransferAccountsServiceImpl.kt", m3646l = {25}, m3647m = "getTransferAccounts")
    /* renamed from: com.robinhood.android.transfers.ui.v2.accounts.TransferAccountsServiceImpl$getTransferAccounts$1 */
    static final class C312271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C312271(Continuation<? super C312271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferAccountsServiceImpl.this.getTransferAccounts(this);
        }
    }

    public TransferAccountsServiceImpl(TransferAccountStore transferAccountStore) {
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        this.transferAccountStore = transferAccountStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.lib.transfers.contracts.TransferAccountsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTransferAccounts(Continuation<? super List<TransferAccount>> continuation) {
        C312271 c312271;
        if (continuation instanceof C312271) {
            c312271 = (C312271) continuation;
            int i = c312271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c312271.label = i - Integer.MIN_VALUE;
            } else {
                c312271 = new C312271(continuation);
            }
        }
        Object objAwaitFirst = c312271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c312271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Observable<List<com.robinhood.models.p320db.bonfire.TransferAccount>> observableStream = this.transferAccountStore.stream();
            c312271.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(observableStream, c312271);
            if (objAwaitFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitFirst);
        }
        List list = (List) objAwaitFirst;
        Intrinsics.checkNotNull(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(TransferAccounts.toMicrogramTransferAccount((com.robinhood.models.p320db.bonfire.TransferAccount) it.next()));
        }
        return arrayList;
    }
}
