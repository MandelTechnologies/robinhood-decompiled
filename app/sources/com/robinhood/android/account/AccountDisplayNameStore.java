package com.robinhood.android.account;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AccountDisplayNameStore.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/account/AccountDisplayNameStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/StoreBundle;)V", "getDisplayName", "Lcom/robinhood/android/account/strings/DisplayName;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "displayNameStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "lib-account-strings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountDisplayNameStore extends Store {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;

    /* compiled from: AccountDisplayNameStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.AccountDisplayNameStore", m3645f = "AccountDisplayNameStore.kt", m3646l = {44}, m3647m = "getDisplayName")
    /* renamed from: com.robinhood.android.account.AccountDisplayNameStore$getDisplayName$1 */
    static final class C80651 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C80651(Continuation<? super C80651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountDisplayNameStore.this.getDisplayName(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDisplayNameStore(AccountProvider accountProvider, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDisplayName(String str, Continuation<? super DisplayName> continuation) {
        C80651 c80651;
        if (continuation instanceof C80651) {
            c80651 = (C80651) continuation;
            int i = c80651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c80651.label = i - Integer.MIN_VALUE;
            } else {
                c80651 = new C80651(continuation);
            }
        }
        Object objAwaitFirst = c80651.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c80651.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Observable<Account> observableStreamAccount = this.accountProvider.streamAccount(str);
            c80651.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(observableStreamAccount, c80651);
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
        return AccountDisplayNames.getDisplayName((Account) objAwaitFirst);
    }

    public final StateFlow<DisplayName> displayNameStateFlow(String accountNumber, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(scope, "scope");
        ObservableSource map = this.accountProvider.streamAccount(accountNumber).map(new Function() { // from class: com.robinhood.android.account.AccountDisplayNameStore.displayNameStateFlow.1
            @Override // io.reactivex.functions.Function
            public final DisplayName apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                return AccountDisplayNames.getDisplayName(account);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return FlowKt.stateIn(Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null), scope, SharingStarted.INSTANCE.getLazily(), null);
    }
}
