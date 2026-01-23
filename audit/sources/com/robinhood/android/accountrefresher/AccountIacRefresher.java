package com.robinhood.android.accountrefresher;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.coroutines.Timeout2;
import com.robinhood.librobinhood.data.store.CardStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import timber.log.Timber;

/* compiled from: AccountIacRefresher.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J$\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0087@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/accountrefresher/AccountIacRefresher;", "", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Lcom/robinhood/librobinhood/data/store/CardStore;Lcom/robinhood/utils/LogoutKillswitch;)V", "ongoingJob", "Lkotlinx/coroutines/Job;", "refresh", "", "iacLocations", "", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "accountNumber", "", "pollAccountForPcoLiftAndRefreshIac", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-account-refresher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountIacRefresher {
    private static final long POLLING_TIMEOUT_MILLIS = 60000;
    private final AccountProvider accountProvider;
    private final CardStore cardStore;
    private final IacInfoBannerStore iacInfoBannerStore;
    private final LogoutKillswitch logoutKillswitch;
    private Job ongoingJob;

    /* compiled from: AccountIacRefresher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.accountrefresher.AccountIacRefresher", m3645f = "AccountIacRefresher.kt", m3646l = {62, 64}, m3647m = "pollAccountForPcoLiftAndRefreshIac")
    /* renamed from: com.robinhood.android.accountrefresher.AccountIacRefresher$pollAccountForPcoLiftAndRefreshIac$1 */
    static final class C83161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C83161(Continuation<? super C83161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountIacRefresher.this.pollAccountForPcoLiftAndRefreshIac(null, null, this);
        }
    }

    public AccountIacRefresher(AccountProvider accountProvider, IacInfoBannerStore iacInfoBannerStore, CardStore cardStore, LogoutKillswitch logoutKillswitch) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(cardStore, "cardStore");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        this.accountProvider = accountProvider;
        this.iacInfoBannerStore = iacInfoBannerStore;
        this.cardStore = cardStore;
        this.logoutKillswitch = logoutKillswitch;
    }

    /* compiled from: AccountIacRefresher.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.accountrefresher.AccountIacRefresher$refresh$1", m3645f = "AccountIacRefresher.kt", m3646l = {49, 50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.accountrefresher.AccountIacRefresher$refresh$1 */
    static final class C83181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ List<IacInfoBannerLocation> $iacLocations;
        int label;
        final /* synthetic */ AccountIacRefresher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C83181(String str, AccountIacRefresher accountIacRefresher, List<? extends IacInfoBannerLocation> list, Continuation<? super C83181> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.this$0 = accountIacRefresher;
            this.$iacLocations = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C83181(this.$accountNumber, this.this$0, this.$iacLocations, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C83181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        
            if (r1.pollAccountForPcoLiftAndRefreshIac(r3, r7, r6) != r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Timeout2 e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                str = this.$accountNumber;
                if (str == null) {
                    AccountProvider accountProvider = this.this$0.accountProvider;
                    this.label = 1;
                    obj = accountProvider.getIndividualAccountNumberForced(this);
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    AccountIacRefresher accountIacRefresher = this.this$0;
                    List<IacInfoBannerLocation> list = this.$iacLocations;
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            str = (String) obj;
            AccountIacRefresher accountIacRefresher2 = this.this$0;
            List<IacInfoBannerLocation> list2 = this.$iacLocations;
            this.label = 2;
        }
    }

    public final void refresh(List<? extends IacInfoBannerLocation> iacLocations, String accountNumber) {
        Intrinsics.checkNotNullParameter(iacLocations, "iacLocations");
        Job job = this.ongoingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.ongoingJob = BuildersKt__Builders_commonKt.launch$default(this.logoutKillswitch.getLoggedInScope(), null, null, new C83181(accountNumber, this, iacLocations, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (com.robinhood.coroutines.Timeout3.withTimeoutStacktrace(com.robinhood.android.accountrefresher.AccountIacRefresher.POLLING_TIMEOUT_MILLIS, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollAccountForPcoLiftAndRefreshIac(List<? extends IacInfoBannerLocation> list, String str, Continuation<? super Unit> continuation) {
        C83161 c83161;
        if (continuation instanceof C83161) {
            c83161 = (C83161) continuation;
            int i = c83161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c83161.label = i - Integer.MIN_VALUE;
            } else {
                c83161 = new C83161(continuation);
            }
        }
        Object obj = c83161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c83161.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            IacInfoBannerStore iacInfoBannerStore = this.iacInfoBannerStore;
            c83161.L$0 = list;
            c83161.L$1 = str;
            c83161.label = 1;
            if (iacInfoBannerStore.deleteAll(c83161) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        str = (String) c83161.L$1;
        list = (List) c83161.L$0;
        ResultKt.throwOnFailure(obj);
        this.cardStore.deleteCards();
        C83172 c83172 = new C83172(str, list, null);
        c83161.L$0 = null;
        c83161.L$1 = null;
        c83161.label = 2;
    }

    /* compiled from: AccountIacRefresher.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.accountrefresher.AccountIacRefresher$pollAccountForPcoLiftAndRefreshIac$2", m3645f = "AccountIacRefresher.kt", m3646l = {66, 78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.accountrefresher.AccountIacRefresher$pollAccountForPcoLiftAndRefreshIac$2 */
    static final class C83172 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ List<IacInfoBannerLocation> $iacLocations;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C83172(String str, List<? extends IacInfoBannerLocation> list, Continuation<? super C83172> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$iacLocations = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountIacRefresher.this.new C83172(this.$accountNumber, this.$iacLocations, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C83172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[PHI: r2
          0x0033: PHI (r2v4 java.lang.Object) = (r2v3 java.lang.Object), (r2v9 java.lang.Object) binds: [B:12:0x0030, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0099 -> B:11:0x0022). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object accountForced;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    accountForced = obj;
                    Account account = (Account) accountForced;
                    Timber.Companion companion = Timber.INSTANCE;
                    companion.mo3350d("AccountIacRefresher refreshed accountPco=" + account.getOnlyPositionClosingTrades() + ".", new Object[0]);
                    if (account.getOnlyPositionClosingTrades()) {
                        IacInfoBannerStore.refresh$default(AccountIacRefresher.this.iacInfoBannerStore, this.$iacLocations, null, null, null, null, null, null, null, this.$accountNumber, null, null, true, 1790, null);
                        AccountIacRefresher.this.cardStore.refresh(true);
                        companion.mo3350d("AccountIacRefresher refreshed iac.", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    this.label = 2;
                    if (DelayKt.delay(5000L, this) != coroutine_suspended) {
                        AccountProvider accountProvider = AccountIacRefresher.this.accountProvider;
                        String str = this.$accountNumber;
                        this.label = 1;
                        accountForced = accountProvider.getAccountForced(str, this);
                        if (accountForced != coroutine_suspended) {
                            Account account2 = (Account) accountForced;
                            Timber.Companion companion2 = Timber.INSTANCE;
                            companion2.mo3350d("AccountIacRefresher refreshed accountPco=" + account2.getOnlyPositionClosingTrades() + ".", new Object[0]);
                            if (account2.getOnlyPositionClosingTrades()) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            AccountProvider accountProvider2 = AccountIacRefresher.this.accountProvider;
            String str2 = this.$accountNumber;
            this.label = 1;
            accountForced = accountProvider2.getAccountForced(str2, this);
            if (accountForced != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }
}
