package com.robinhood.android.internalassettransfers.presubmissionwarn;

import com.robinhood.android.internalassettransfers.AccountSelection;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo7;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.internalassettransfers.review.models.UiEligibleAsset;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.p320db.Account;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import nimbus.service.p511v1.NimbusService;
import nimbus.service.p511v1.PreSubmissionChecksRequestDto;
import nimbus.service.p511v1.PreSubmissionChecksResponseDto;
import nimbus.service.p511v1.TransferAccountInfoDto;

/* compiled from: PreSubmitWarningsCheckUseCase.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086B¢\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0018J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitWarningsCheckUseCase;", "", "factory", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitAlertSheetFactory;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "nimbusService", "Lnimbus/service/v1/NimbusService;", "<init>", "(Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitAlertSheetFactory;Lcom/robinhood/android/lib/account/AccountProvider;Lnimbus/service/v1/NimbusService;)V", "invoke", "", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PresubmissionChecksAlertSheet;", "accountSelection", "Lcom/robinhood/android/internalassettransfers/AccountSelection;", "eligibleAssets", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "(Lcom/robinhood/android/internalassettransfers/AccountSelection;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchBrokerageAccounts", "Lkotlin/Pair;", "Lcom/robinhood/models/db/Account;", "sourceAccountNumber", "", "sinkAccountNumber", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performPresubmitCheck", "Lnimbus/service/v1/PreSubmissionChecksResponseDto;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "assetsToTransfer", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PreSubmitWarningsCheckUseCase {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final PresubmissionCheckAlertSheets3 factory;
    private final NimbusService nimbusService;

    /* compiled from: PreSubmitWarningsCheckUseCase.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.presubmissionwarn.PreSubmitWarningsCheckUseCase", m3645f = "PreSubmitWarningsCheckUseCase.kt", m3646l = {31, 35}, m3647m = "invoke")
    /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.PreSubmitWarningsCheckUseCase$invoke$1 */
    static final class C192591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C192591(Continuation<? super C192591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PreSubmitWarningsCheckUseCase.this.invoke(null, null, this);
        }
    }

    public PreSubmitWarningsCheckUseCase(PresubmissionCheckAlertSheets3 factory, AccountProvider accountProvider, NimbusService nimbusService) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
        this.factory = factory;
        this.accountProvider = accountProvider;
        this.nimbusService = nimbusService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(AccountSelection accountSelection, UiAssets uiAssets, Continuation<? super List<PresubmissionChecksAlertSheet>> continuation) {
        C192591 c192591;
        Account account;
        Account account2;
        if (continuation instanceof C192591) {
            c192591 = (C192591) continuation;
            int i = c192591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c192591.label = i - Integer.MIN_VALUE;
            } else {
                c192591 = new C192591(continuation);
            }
        }
        Object objFetchBrokerageAccounts = c192591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c192591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchBrokerageAccounts);
            String rhsAccountNumber = accountSelection.getSourceAccount().getRhsAccountNumber();
            String rhsAccountNumber2 = accountSelection.getSinkAccount().getRhsAccountNumber();
            c192591.L$0 = accountSelection;
            c192591.L$1 = uiAssets;
            c192591.label = 1;
            objFetchBrokerageAccounts = fetchBrokerageAccounts(rhsAccountNumber, rhsAccountNumber2, c192591);
            if (objFetchBrokerageAccounts != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            account = (Account) c192591.L$1;
            account2 = (Account) c192591.L$0;
            ResultKt.throwOnFailure(objFetchBrokerageAccounts);
            return this.factory.build((PreSubmissionChecksResponseDto) objFetchBrokerageAccounts, account2, account);
        }
        uiAssets = (UiAssets) c192591.L$1;
        accountSelection = (AccountSelection) c192591.L$0;
        ResultKt.throwOnFailure(objFetchBrokerageAccounts);
        Tuples2 tuples2 = (Tuples2) objFetchBrokerageAccounts;
        Account account3 = (Account) tuples2.component1();
        Account account4 = (Account) tuples2.component2();
        UiIatAccount sourceAccount = accountSelection.getSourceAccount();
        UiIatAccount sinkAccount = accountSelection.getSinkAccount();
        c192591.L$0 = account3;
        c192591.L$1 = account4;
        c192591.label = 2;
        Object objPerformPresubmitCheck = performPresubmitCheck(sourceAccount, sinkAccount, uiAssets, c192591);
        if (objPerformPresubmitCheck != coroutine_suspended) {
            objFetchBrokerageAccounts = objPerformPresubmitCheck;
            account = account4;
            account2 = account3;
            return this.factory.build((PreSubmissionChecksResponseDto) objFetchBrokerageAccounts, account2, account);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchBrokerageAccounts(String str, String str2, Continuation<? super Tuples2<Account, Account>> continuation) {
        return FlowKt.first(Operators.combine(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccountByRhs(str)), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccountByRhs(str2)), Integer.MAX_VALUE, null, 2, null)), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object performPresubmitCheck(UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, UiAssets uiAssets, Continuation<? super PreSubmissionChecksResponseDto> continuation) {
        TransferAccountInfoDto transferAccountInfoDto = InternalAssetTransferReviewDuxo7.toTransferAccountInfoDto(uiIatAccount);
        TransferAccountInfoDto transferAccountInfoDto2 = InternalAssetTransferReviewDuxo7.toTransferAccountInfoDto(uiIatAccount2);
        String string2 = uiAssets.getCash().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        IdlDecimal idlDecimal = new IdlDecimal(string2);
        List<UiEligibleAsset> equities = uiAssets.getEquities();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equities, 10));
        Iterator<T> it = equities.iterator();
        while (it.hasNext()) {
            arrayList.add(InternalAssetTransferReviewDuxo7.toEquityPositionDto((UiEligibleAsset) it.next()));
        }
        return this.nimbusService.PreSubmissionChecks(new PreSubmissionChecksRequestDto(transferAccountInfoDto, transferAccountInfoDto2, idlDecimal, arrayList), continuation);
    }
}
