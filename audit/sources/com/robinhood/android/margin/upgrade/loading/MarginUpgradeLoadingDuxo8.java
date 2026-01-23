package com.robinhood.android.margin.upgrade.loading;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.p320db.Account;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: MarginUpgradeLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingDataState;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$onStart$1$state$1", m3645f = "MarginUpgradeLoadingDuxo.kt", m3646l = {63, 64, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, 75, 79}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$onStart$1$state$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeLoadingDuxo8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MarginUpgradeLoadingDataState>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MarginUpgradeLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginUpgradeLoadingDuxo8(MarginUpgradeLoadingDuxo marginUpgradeLoadingDuxo, Continuation<? super MarginUpgradeLoadingDuxo8> continuation) {
        super(2, continuation);
        this.this$0 = marginUpgradeLoadingDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginUpgradeLoadingDuxo8(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MarginUpgradeLoadingDataState> continuation) {
        return ((MarginUpgradeLoadingDuxo8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x014b, code lost:
    
        if (r2 == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d A[Catch: Exception -> 0x0020, PHI: r2 r6
      0x009d: PHI (r2v12 java.lang.String) = (r2v9 java.lang.String), (r2v23 java.lang.String) binds: [B:33:0x0099, B:22:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r6v3 java.lang.Object) = (r6v2 java.lang.Object), (r6v7 java.lang.Object) binds: [B:33:0x0099, B:22:0x004c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0020, blocks: (B:9:0x0019, B:52:0x014e, B:16:0x0034, B:45:0x0100, B:47:0x010d, B:49:0x013b, B:19:0x0040, B:42:0x00e4, B:22:0x004c, B:35:0x009d, B:37:0x00a5, B:39:0x00cf, B:23:0x0052, B:31:0x007b, B:32:0x007d, B:26:0x005b, B:28:0x006b), top: B:56:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:9:0x0019, B:52:0x014e, B:16:0x0034, B:45:0x0100, B:47:0x010d, B:49:0x013b, B:19:0x0040, B:42:0x00e4, B:22:0x004c, B:35:0x009d, B:37:0x00a5, B:39:0x00cf, B:23:0x0052, B:31:0x007b, B:32:0x007d, B:26:0x005b, B:28:0x006b), top: B:56:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:9:0x0019, B:52:0x014e, B:16:0x0034, B:45:0x0100, B:47:0x010d, B:49:0x013b, B:19:0x0040, B:42:0x00e4, B:22:0x004c, B:35:0x009d, B:37:0x00a5, B:39:0x00cf, B:23:0x0052, B:31:0x007b, B:32:0x007d, B:26:0x005b, B:28:0x006b), top: B:56:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100 A[Catch: Exception -> 0x0020, PHI: r2 r4 r6
      0x0100: PHI (r2v17 com.robinhood.models.db.Account) = (r2v16 com.robinhood.models.db.Account), (r2v28 com.robinhood.models.db.Account) binds: [B:43:0x00fd, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r4v3 java.lang.Object) = (r4v2 java.lang.Object), (r4v9 java.lang.Object) binds: [B:43:0x00fd, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r6v6 com.robinhood.android.lib.margin.api.ApiMarginEligibility) = 
      (r6v5 com.robinhood.android.lib.margin.api.ApiMarginEligibility)
      (r6v9 com.robinhood.android.lib.margin.api.ApiMarginEligibility)
     binds: [B:43:0x00fd, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0020, blocks: (B:9:0x0019, B:52:0x014e, B:16:0x0034, B:45:0x0100, B:47:0x010d, B:49:0x013b, B:19:0x0040, B:42:0x00e4, B:22:0x004c, B:35:0x009d, B:37:0x00a5, B:39:0x00cf, B:23:0x0052, B:31:0x007b, B:32:0x007d, B:26:0x005b, B:28:0x006b), top: B:56:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:9:0x0019, B:52:0x014e, B:16:0x0034, B:45:0x0100, B:47:0x010d, B:49:0x013b, B:19:0x0040, B:42:0x00e4, B:22:0x004c, B:35:0x009d, B:37:0x00a5, B:39:0x00cf, B:23:0x0052, B:31:0x007b, B:32:0x007d, B:26:0x005b, B:28:0x006b), top: B:56:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013b A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:9:0x0019, B:52:0x014e, B:16:0x0034, B:45:0x0100, B:47:0x010d, B:49:0x013b, B:19:0x0040, B:42:0x00e4, B:22:0x004c, B:35:0x009d, B:37:0x00a5, B:39:0x00cf, B:23:0x0052, B:31:0x007b, B:32:0x007d, B:26:0x005b, B:28:0x006b), top: B:56:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String accountNumber;
        Object individualAccountNumberForced;
        Object marginEligibility;
        ApiMarginEligibility apiMarginEligibility;
        ApiMarginEligibility.ApiMarginUpgradeBlocked marginUpgradeBlocked;
        Object objAwaitFirst;
        Account account;
        Object objFirstOrNull;
        Object objFetchData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                accountNumber = ((EnableMarginInvestingKey) MarginUpgradeLoadingDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getAccountNumber();
                if (accountNumber == null) {
                    AccountProvider accountProvider = this.this$0.accountProvider;
                    this.label = 1;
                    individualAccountNumberForced = accountProvider.getIndividualAccountNumberForced(this);
                    if (individualAccountNumberForced == coroutine_suspended) {
                    }
                } else {
                    MarginEligibilityStore marginEligibilityStore = this.this$0.marginEligibilityStore;
                    boolean fromAcats = ((EnableMarginInvestingKey) MarginUpgradeLoadingDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getFromAcats();
                    this.L$0 = accountNumber;
                    this.label = 2;
                    marginEligibility = marginEligibilityStore.getMarginEligibility(accountNumber, fromAcats, this);
                    if (marginEligibility == coroutine_suspended) {
                        apiMarginEligibility = (ApiMarginEligibility) marginEligibility;
                        marginUpgradeBlocked = apiMarginEligibility.getMarginUpgradeBlocked();
                        if (marginUpgradeBlocked == null) {
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                individualAccountNumberForced = obj;
            } else {
                if (i == 2) {
                    accountNumber = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    marginEligibility = obj;
                    apiMarginEligibility = (ApiMarginEligibility) marginEligibility;
                    marginUpgradeBlocked = apiMarginEligibility.getMarginUpgradeBlocked();
                    if (marginUpgradeBlocked == null) {
                        return new MarginUpgradeLoadingDataState(null, null, null, null, null, null, null, null, null, null, marginUpgradeBlocked, null, null, null, null, null, null, null, null, null, 1047551, null);
                    }
                    Observable<Account> observableStreamAccount = this.this$0.accountProvider.streamAccount(accountNumber);
                    this.L$0 = apiMarginEligibility;
                    this.label = 3;
                    objAwaitFirst = RxAwait3.awaitFirst(observableStreamAccount, this);
                    if (objAwaitFirst != coroutine_suspended) {
                        account = (Account) objAwaitFirst;
                        MarginUpgradeRestrictionStore marginUpgradeRestrictionStore = this.this$0.marginUpgradeRestrictionStore;
                        Intrinsics.checkNotNull(account);
                        Flow<Boolean> flowHasNoUpgradeRestriction = marginUpgradeRestrictionStore.hasNoUpgradeRestriction(account);
                        this.L$0 = apiMarginEligibility;
                        this.L$1 = account;
                        this.label = 4;
                        objFirstOrNull = FlowKt.firstOrNull(flowHasNoUpgradeRestriction, this);
                        if (objFirstOrNull == coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 3) {
                    ApiMarginEligibility apiMarginEligibility2 = (ApiMarginEligibility) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    apiMarginEligibility = apiMarginEligibility2;
                    objAwaitFirst = obj;
                    account = (Account) objAwaitFirst;
                    MarginUpgradeRestrictionStore marginUpgradeRestrictionStore2 = this.this$0.marginUpgradeRestrictionStore;
                    Intrinsics.checkNotNull(account);
                    Flow<Boolean> flowHasNoUpgradeRestriction2 = marginUpgradeRestrictionStore2.hasNoUpgradeRestriction(account);
                    this.L$0 = apiMarginEligibility;
                    this.L$1 = account;
                    this.label = 4;
                    objFirstOrNull = FlowKt.firstOrNull(flowHasNoUpgradeRestriction2, this);
                    if (objFirstOrNull == coroutine_suspended) {
                        if (!Intrinsics.areEqual((Boolean) objFirstOrNull, boxing.boxBoolean(false))) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objFetchData = obj;
                    return (MarginUpgradeLoadingDataState) objFetchData;
                }
                account = (Account) this.L$1;
                ApiMarginEligibility apiMarginEligibility3 = (ApiMarginEligibility) this.L$0;
                ResultKt.throwOnFailure(obj);
                apiMarginEligibility = apiMarginEligibility3;
                objFirstOrNull = obj;
                if (!Intrinsics.areEqual((Boolean) objFirstOrNull, boxing.boxBoolean(false))) {
                    return new MarginUpgradeLoadingDataState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, boxing.boxBoolean(true), 524287, null);
                }
                MarginUpgradeLoadingDuxo marginUpgradeLoadingDuxo = this.this$0;
                Intrinsics.checkNotNull(account);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 5;
                objFetchData = marginUpgradeLoadingDuxo.fetchData(account, apiMarginEligibility, this);
            }
            accountNumber = (String) individualAccountNumberForced;
            MarginEligibilityStore marginEligibilityStore2 = this.this$0.marginEligibilityStore;
            boolean fromAcats2 = ((EnableMarginInvestingKey) MarginUpgradeLoadingDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getFromAcats();
            this.L$0 = accountNumber;
            this.label = 2;
            marginEligibility = marginEligibilityStore2.getMarginEligibility(accountNumber, fromAcats2, this);
            if (marginEligibility == coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Exception e) {
            return new MarginUpgradeLoadingDataState(null, null, null, null, null, null, null, null, null, null, null, e, null, null, null, null, null, null, null, null, 1046527, null);
        }
    }
}
