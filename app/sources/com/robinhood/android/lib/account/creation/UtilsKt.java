package com.robinhood.android.lib.account.creation;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.creation.AccountCreationState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086@¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"pollForAccount", "Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "predicate", "Lkotlin/Function1;", "Lcom/robinhood/models/db/Account;", "", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-account-provider_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class UtilsKt {

    /* compiled from: Utils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.account.creation.UtilsKt", m3645f = "Utils.kt", m3646l = {15, 25}, m3647m = "pollForAccount")
    /* renamed from: com.robinhood.android.lib.account.creation.UtilsKt$pollForAccount$1 */
    static final class C201761 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C201761(Continuation<? super C201761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UtilsKt.pollForAccount(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pollForAccount$lambda$0(Account account) {
        Intrinsics.checkNotNullParameter(account, "<unused var>");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00be -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object pollForAccount(AccountProvider accountProvider, BrokerageAccountType brokerageAccountType, Function1<? super Account, Boolean> function1, Continuation<? super AccountCreationState> continuation) {
        C201761 c201761;
        AccountProvider accountProvider2;
        int i;
        Function1<? super Account, Boolean> function12;
        BrokerageAccountType brokerageAccountType2;
        Function1<? super Account, Boolean> function13;
        AccountProvider accountProvider3;
        List listEmptyList;
        Iterator it;
        Object next;
        Account account;
        if (continuation instanceof C201761) {
            c201761 = (C201761) continuation;
            int i2 = c201761.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c201761.label = i2 - Integer.MIN_VALUE;
            } else {
                c201761 = new C201761(continuation);
            }
        }
        Object obj = c201761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c201761.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            accountProvider2 = accountProvider;
            i = 0;
            function12 = function1;
            brokerageAccountType2 = brokerageAccountType;
            if (i >= 15) {
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c201761.I$0;
                function13 = (Function1) c201761.L$2;
                brokerageAccountType2 = (BrokerageAccountType) c201761.L$1;
                accountProvider3 = (AccountProvider) c201761.L$0;
                ResultKt.throwOnFailure(obj);
                function12 = function13;
                accountProvider2 = accountProvider3;
                if (i >= 15) {
                    try {
                    } catch (Exception unused) {
                        accountProvider3 = accountProvider2;
                        function13 = function12;
                        listEmptyList = CollectionsKt.emptyList();
                        it = listEmptyList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        account = (Account) next;
                        if (account == null) {
                        }
                    }
                    c201761.L$0 = accountProvider2;
                    c201761.L$1 = brokerageAccountType2;
                    c201761.L$2 = function12;
                    c201761.I$0 = i;
                    c201761.label = 1;
                    Object accountsByTypeForced = accountProvider2.getAccountsByTypeForced(brokerageAccountType2, c201761);
                    if (accountsByTypeForced != coroutine_suspended) {
                        accountProvider3 = accountProvider2;
                        function13 = function12;
                        obj = accountsByTypeForced;
                        listEmptyList = (List) obj;
                        it = listEmptyList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (function13.invoke(next).booleanValue()) {
                                break;
                            }
                        }
                        account = (Account) next;
                        if (account == null) {
                            return new AccountCreationState.Fetched(account.getAccountNumber());
                        }
                        i++;
                        c201761.L$0 = accountProvider3;
                        c201761.L$1 = brokerageAccountType2;
                        c201761.L$2 = function13;
                        c201761.I$0 = i;
                        c201761.label = 2;
                    }
                    return coroutine_suspended;
                }
                return AccountCreationState.Absent.INSTANCE;
            }
            i = c201761.I$0;
            function13 = (Function1) c201761.L$2;
            brokerageAccountType2 = (BrokerageAccountType) c201761.L$1;
            accountProvider3 = (AccountProvider) c201761.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused2) {
                listEmptyList = CollectionsKt.emptyList();
                it = listEmptyList.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                account = (Account) next;
                if (account == null) {
                }
            }
            listEmptyList = (List) obj;
            it = listEmptyList.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            account = (Account) next;
            if (account == null) {
            }
        }
    }

    public static /* synthetic */ Object pollForAccount$default(AccountProvider accountProvider, BrokerageAccountType brokerageAccountType, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.lib.account.creation.UtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(UtilsKt.pollForAccount$lambda$0((Account) obj2));
                }
            };
        }
        return pollForAccount(accountProvider, brokerageAccountType, function1, continuation);
    }
}
