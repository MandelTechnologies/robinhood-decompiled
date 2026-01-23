package com.robinhood.android.redesign.accounttab.duxo;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountTabDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/db/Account;", "cachedAccounts", "individualBrokerageAccount"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$allOtherIndividualAccounts$1", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$allOtherIndividualAccounts$1, reason: use source file name */
/* loaded from: classes5.dex */
final class AccountTabDuxo2 extends ContinuationImpl7 implements Function3<List<? extends Account>, Account, Continuation<? super List<? extends Account>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    AccountTabDuxo2(Continuation<? super AccountTabDuxo2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Account> list, Account account, Continuation<? super List<? extends Account>> continuation) {
        return invoke2((List<Account>) list, account, (Continuation<? super List<Account>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<Account> list, Account account, Continuation<? super List<Account>> continuation) {
        AccountTabDuxo2 accountTabDuxo2 = new AccountTabDuxo2(continuation);
        accountTabDuxo2.L$0 = list;
        accountTabDuxo2.L$1 = account;
        return accountTabDuxo2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) this.L$0;
        Account account = (Account) this.L$1;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.areEqual((Account) obj2, account)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!((Account) obj3).isOriginal()) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList2) {
            if (!((Account) obj4).getDeactivated()) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : arrayList3) {
            Account account2 = (Account) obj5;
            if (account2.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL && account2.getManagementType() == ManagementType.SELF_DIRECTED) {
                arrayList4.add(obj5);
            }
        }
        return arrayList4;
    }
}
