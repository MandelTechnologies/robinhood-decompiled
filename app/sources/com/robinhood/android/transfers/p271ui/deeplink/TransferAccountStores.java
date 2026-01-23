package com.robinhood.android.transfers.p271ui.deeplink;

import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TransferAccountStores.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0000\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"getCorrectedAccountSelections", "Lkotlin/Pair;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "from", "to", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferAccountStoresKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferAccountStores {

    /* compiled from: TransferAccountStores.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.TransferAccountStoresKt", m3645f = "TransferAccountStores.kt", m3646l = {31, 51}, m3647m = "getCorrectedAccountSelections")
    /* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferAccountStoresKt$getCorrectedAccountSelections$1 */
    static final class C306061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C306061(Continuation<? super C306061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferAccountStores.getCorrectedAccountSelections(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getCorrectedAccountSelections(TransferAccountStore transferAccountStore, TransferConfiguration.TransferAccountSelection transferAccountSelection, TransferConfiguration.TransferAccountSelection transferAccountSelection2, Continuation<? super Tuples2<TransferConfiguration.TransferAccountSelection, TransferConfiguration.TransferAccountSelection>> continuation) {
        C306061 c306061;
        TransferAccountStore transferAccountStore2;
        TransferConfiguration.TransferAccountSelection transferAccountSelection3;
        Ref.ObjectRef objectRef;
        Object next;
        Object next2;
        TransferConfiguration.TransferAccountSelection transferAccountSelection4;
        Iterator it;
        Object next3;
        ApiTransferAccount.TransferAccountType type2;
        Iterator it2;
        Object next4;
        boolean z;
        TransferConfiguration.TransferAccountSelection transferAccountSelection5;
        TransferConfiguration.TransferAccountSelection transferAccountSelection6;
        if (continuation instanceof C306061) {
            c306061 = (C306061) continuation;
            int i = c306061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c306061.label = i - Integer.MIN_VALUE;
            } else {
                c306061 = new C306061(continuation);
            }
        }
        Object objForceFetch = c306061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c306061.label;
        boolean z2 = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = transferAccountSelection2;
            if ((transferAccountSelection != null ? transferAccountSelection.getId() : null) == null) {
                TransferConfiguration.TransferAccountSelection transferAccountSelection7 = (TransferConfiguration.TransferAccountSelection) objectRef2.element;
                if ((transferAccountSelection7 != null ? transferAccountSelection7.getId() : null) == null) {
                    return Tuples4.m3642to(transferAccountSelection, objectRef2.element);
                }
            }
            String id = transferAccountSelection != null ? transferAccountSelection.getId() : null;
            TransferConfiguration.TransferAccountSelection transferAccountSelection8 = (TransferConfiguration.TransferAccountSelection) objectRef2.element;
            if (Intrinsics.areEqual(id, transferAccountSelection8 != null ? transferAccountSelection8.getId() : null)) {
                objectRef2.element = null;
            }
            if ((transferAccountSelection != null ? transferAccountSelection.getType() : null) == null) {
                TransferConfiguration.TransferAccountSelection transferAccountSelection9 = (TransferConfiguration.TransferAccountSelection) objectRef2.element;
                if ((transferAccountSelection9 != null ? transferAccountSelection9.getType() : null) == null) {
                    Flow<List<TransferAccount>> flowStreamFlow = transferAccountStore.streamFlow();
                    transferAccountStore2 = transferAccountStore;
                    c306061.L$0 = transferAccountStore2;
                    c306061.L$1 = transferAccountSelection;
                    c306061.L$2 = objectRef2;
                    c306061.label = 1;
                    Object objFirst = FlowKt.first(flowStreamFlow, c306061);
                    if (objFirst != coroutine_suspended) {
                        transferAccountSelection3 = transferAccountSelection;
                        objectRef = objectRef2;
                        objForceFetch = objFirst;
                    }
                    return coroutine_suspended;
                }
            }
            return Tuples4.m3642to(transferAccountSelection, objectRef2.element);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c306061.L$1;
            TransferConfiguration.TransferAccountSelection transferAccountSelection10 = (TransferConfiguration.TransferAccountSelection) c306061.L$0;
            ResultKt.throwOnFailure(objForceFetch);
            transferAccountSelection4 = transferAccountSelection10;
            List list = (List) objForceFetch;
            it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                if (Intrinsics.areEqual(((ApiTransferAccount) next3).getAccount_id(), transferAccountSelection4 != null ? transferAccountSelection4.getId() : null)) {
                    break;
                }
            }
            ApiTransferAccount apiTransferAccount = (ApiTransferAccount) next3;
            type2 = apiTransferAccount == null ? apiTransferAccount.getType() : null;
            it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it2.next();
                String account_id = ((ApiTransferAccount) next4).getAccount_id();
                TransferConfiguration.TransferAccountSelection transferAccountSelection11 = (TransferConfiguration.TransferAccountSelection) objectRef.element;
                if (Intrinsics.areEqual(account_id, transferAccountSelection11 != null ? transferAccountSelection11.getId() : null)) {
                    break;
                }
            }
            ApiTransferAccount apiTransferAccount2 = (ApiTransferAccount) next4;
            ApiTransferAccount.TransferAccountType type3 = apiTransferAccount2 == null ? apiTransferAccount2.getType() : null;
            if ((transferAccountSelection4 == null ? transferAccountSelection4.getId() : null) == null || type2 != null) {
                z = (transferAccountSelection4 == null ? transferAccountSelection4.getId() : null) == null && type2 != null;
            }
            transferAccountSelection5 = (TransferConfiguration.TransferAccountSelection) objectRef.element;
            if ((transferAccountSelection5 == null ? transferAccountSelection5.getId() : null) == null || type3 != null) {
                transferAccountSelection6 = (TransferConfiguration.TransferAccountSelection) objectRef.element;
                if ((transferAccountSelection6 == null ? transferAccountSelection6.getId() : null) != null || type3 == null) {
                    z2 = false;
                }
            }
            if (z || !z2) {
                return null;
            }
            TransferConfiguration.TransferAccountSelection transferAccountSelectionCopy$default = transferAccountSelection4 != null ? TransferConfiguration.TransferAccountSelection.copy$default(transferAccountSelection4, null, false, type2, 3, null) : null;
            TransferConfiguration.TransferAccountSelection transferAccountSelection12 = (TransferConfiguration.TransferAccountSelection) objectRef.element;
            return Tuples4.m3642to(transferAccountSelectionCopy$default, transferAccountSelection12 != null ? TransferConfiguration.TransferAccountSelection.copy$default(transferAccountSelection12, null, false, type3, 3, null) : null);
        }
        objectRef = (Ref.ObjectRef) c306061.L$2;
        TransferConfiguration.TransferAccountSelection transferAccountSelection13 = (TransferConfiguration.TransferAccountSelection) c306061.L$1;
        transferAccountStore2 = (TransferAccountStore) c306061.L$0;
        ResultKt.throwOnFailure(objForceFetch);
        transferAccountSelection3 = transferAccountSelection13;
        List list2 = (List) objForceFetch;
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (Intrinsics.areEqual(((TransferAccount) next).getAccountId(), transferAccountSelection3 != null ? transferAccountSelection3.getId() : null)) {
                break;
            }
        }
        TransferAccount transferAccount = (TransferAccount) next;
        ApiTransferAccount.TransferAccountType type4 = transferAccount != null ? transferAccount.getType() : null;
        Iterator it4 = list2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
            String accountId = ((TransferAccount) next2).getAccountId();
            TransferConfiguration.TransferAccountSelection transferAccountSelection14 = (TransferConfiguration.TransferAccountSelection) objectRef.element;
            if (Intrinsics.areEqual(accountId, transferAccountSelection14 != null ? transferAccountSelection14.getId() : null)) {
                break;
            }
        }
        TransferAccount transferAccount2 = (TransferAccount) next2;
        ApiTransferAccount.TransferAccountType type5 = transferAccount2 != null ? transferAccount2.getType() : null;
        if ((transferAccountSelection3 != null ? transferAccountSelection3.getId() : null) == null || type4 != null) {
            TransferConfiguration.TransferAccountSelection transferAccountSelection15 = (TransferConfiguration.TransferAccountSelection) objectRef.element;
            if ((transferAccountSelection15 != null ? transferAccountSelection15.getId() : null) == null || type5 != null) {
                TransferConfiguration.TransferAccountSelection transferAccountSelectionCopy$default2 = transferAccountSelection3 != null ? TransferConfiguration.TransferAccountSelection.copy$default(transferAccountSelection3, null, false, type4, 3, null) : null;
                TransferConfiguration.TransferAccountSelection transferAccountSelection16 = (TransferConfiguration.TransferAccountSelection) objectRef.element;
                return Tuples4.m3642to(transferAccountSelectionCopy$default2, transferAccountSelection16 != null ? TransferConfiguration.TransferAccountSelection.copy$default(transferAccountSelection16, null, false, type5, 3, null) : null);
            }
        }
        c306061.L$0 = transferAccountSelection3;
        c306061.L$1 = objectRef;
        c306061.L$2 = null;
        c306061.label = 2;
        objForceFetch = transferAccountStore2.forceFetch(c306061);
        if (objForceFetch != coroutine_suspended) {
            transferAccountSelection4 = transferAccountSelection3;
            List list3 = (List) objForceFetch;
            it = list3.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            ApiTransferAccount apiTransferAccount3 = (ApiTransferAccount) next3;
            if (apiTransferAccount3 == null) {
            }
            it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                }
            }
            ApiTransferAccount apiTransferAccount22 = (ApiTransferAccount) next4;
            if (apiTransferAccount22 == null) {
            }
            if ((transferAccountSelection4 == null ? transferAccountSelection4.getId() : null) == null) {
                if ((transferAccountSelection4 == null ? transferAccountSelection4.getId() : null) == null) {
                }
            }
            transferAccountSelection5 = (TransferConfiguration.TransferAccountSelection) objectRef.element;
            if ((transferAccountSelection5 == null ? transferAccountSelection5.getId() : null) == null) {
                transferAccountSelection6 = (TransferConfiguration.TransferAccountSelection) objectRef.element;
                if ((transferAccountSelection6 == null ? transferAccountSelection6.getId() : null) != null) {
                    z2 = false;
                }
            }
            if (z) {
            }
            return null;
        }
        return coroutine_suspended;
    }
}
