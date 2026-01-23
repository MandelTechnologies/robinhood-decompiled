package com.robinhood.android.internalassettransfers.validation;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AccountFeatureParityChecker.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker;", "", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;)V", "checkoutMarginFeatureParity", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityWarning;", "sourceRhsAccountNumber", "", "sinkRhsAccountNumber", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkMarginParity", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/Account;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Account;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AccountFeatureParityChecker {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final LeveredMarginSettingsStore leveredMarginSettingsStore;

    /* compiled from: AccountFeatureParityChecker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.validation.AccountFeatureParityChecker", m3645f = "AccountFeatureParityChecker.kt", m3646l = {41, 46}, m3647m = "checkMarginParity")
    /* renamed from: com.robinhood.android.internalassettransfers.validation.AccountFeatureParityChecker$checkMarginParity$1 */
    static final class C193381 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C193381(Continuation<? super C193381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountFeatureParityChecker.this.checkMarginParity(null, null, this);
        }
    }

    /* compiled from: AccountFeatureParityChecker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.validation.AccountFeatureParityChecker", m3645f = "AccountFeatureParityChecker.kt", m3646l = {27, 30, 32}, m3647m = "checkoutMarginFeatureParity")
    /* renamed from: com.robinhood.android.internalassettransfers.validation.AccountFeatureParityChecker$checkoutMarginFeatureParity$1 */
    static final class C193391 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C193391(Continuation<? super C193391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountFeatureParityChecker.this.checkoutMarginFeatureParity(null, null, this);
        }
    }

    public AccountFeatureParityChecker(AccountProvider accountProvider, LeveredMarginSettingsStore leveredMarginSettingsStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
        this.accountProvider = accountProvider;
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkoutMarginFeatureParity(String str, String str2, Continuation<? super AccountFeatureParityWarning> continuation) {
        C193391 c193391;
        Account account;
        if (continuation instanceof C193391) {
            c193391 = (C193391) continuation;
            int i = c193391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c193391.label = i - Integer.MIN_VALUE;
            } else {
                c193391 = new C193391(continuation);
            }
        }
        Object objFirst = c193391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c193391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccountByRhs(str)), Integer.MAX_VALUE, null, 2, null);
            c193391.L$0 = str2;
            c193391.label = 1;
            objFirst = FlowKt.first(flowBuffer$default, c193391);
            if (objFirst != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirst);
                return objFirst;
            }
            account = (Account) c193391.L$0;
            ResultKt.throwOnFailure(objFirst);
            c193391.L$0 = null;
            c193391.label = 3;
            Object objCheckMarginParity = checkMarginParity(account, (Account) objFirst, c193391);
            return objCheckMarginParity != coroutine_suspended ? coroutine_suspended : objCheckMarginParity;
        }
        str2 = (String) c193391.L$0;
        ResultKt.throwOnFailure(objFirst);
        account = (Account) objFirst;
        Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccountByRhs(str2)), Integer.MAX_VALUE, null, 2, null);
        c193391.L$0 = account;
        c193391.label = 2;
        objFirst = FlowKt.first(flowBuffer$default2, c193391);
        if (objFirst != coroutine_suspended) {
            c193391.L$0 = null;
            c193391.label = 3;
            Object objCheckMarginParity2 = checkMarginParity(account, (Account) objFirst, c193391);
            if (objCheckMarginParity2 != coroutine_suspended) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkMarginParity(Account account, Account account2, Continuation<? super AccountFeatureParityWarning> continuation) {
        C193381 c193381;
        boolean zIsMarginInvestingEnabled;
        if (continuation instanceof C193381) {
            c193381 = (C193381) continuation;
            int i = c193381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c193381.label = i - Integer.MIN_VALUE;
            } else {
                c193381 = new C193381(continuation);
            }
        }
        Object objFirst = c193381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c193381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.leveredMarginSettingsStore.streamMarginSettings(account.getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
            c193381.L$0 = account2;
            c193381.label = 1;
            objFirst = FlowKt.first(flowBuffer$default, c193381);
            if (objFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zIsMarginInvestingEnabled = c193381.Z$0;
            ResultKt.throwOnFailure(objFirst);
            boolean zIsMarginInvestingEnabled2 = ((MarginSettings) objFirst).isMarginInvestingEnabled();
            if (!zIsMarginInvestingEnabled || zIsMarginInvestingEnabled2) {
                return null;
            }
            return AccountFeatureParityWarning.SOURCE_HAS_MARGIN_SINK_DOES_NOT;
        }
        account2 = (Account) c193381.L$0;
        ResultKt.throwOnFailure(objFirst);
        zIsMarginInvestingEnabled = ((MarginSettings) objFirst).isMarginInvestingEnabled();
        Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(this.leveredMarginSettingsStore.streamMarginSettings(account2.getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
        c193381.L$0 = null;
        c193381.Z$0 = zIsMarginInvestingEnabled;
        c193381.label = 2;
        objFirst = FlowKt.first(flowBuffer$default2, c193381);
    }
}
