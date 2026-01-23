package com.robinhood.android.lib.transfers;

import com.robinhood.android.banking.util.RefIdFactory;
import com.robinhood.android.doc.DocUploadParentFragment;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccounts7;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiRhyBankingData;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.RhyBankingData;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.store.stripe.StripeStore;
import com.robinhood.utils.logging.CrashReporter;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateTransferV2RequestFactory.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferV2RequestFactory;", "", "refIdFactory", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/lib/transfers/TransferData;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "<init>", "(Lcom/robinhood/android/banking/util/RefIdFactory;Lcom/robinhood/store/stripe/StripeStore;)V", "transferDataToRequest", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "createTransferRequest", "transferData", "resubmissionAfter3ds", "", "(Lcom/robinhood/android/lib/transfers/TransferData;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidatePreviousState", "", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CreateTransferV2RequestFactory {
    private final RefIdFactory<TransferData> refIdFactory;
    private final StripeStore stripeStore;
    private final ConcurrentHashMap<TransferData, ApiCreateTransferRequest> transferDataToRequest;

    /* compiled from: CreateTransferV2RequestFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.transfers.CreateTransferV2RequestFactory", m3645f = "CreateTransferV2RequestFactory.kt", m3646l = {51}, m3647m = "createTransferRequest")
    /* renamed from: com.robinhood.android.lib.transfers.CreateTransferV2RequestFactory$createTransferRequest$1 */
    static final class C206741 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C206741(Continuation<? super C206741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreateTransferV2RequestFactory.this.createTransferRequest(null, false, this);
        }
    }

    public CreateTransferV2RequestFactory(RefIdFactory<TransferData> refIdFactory, StripeStore stripeStore) {
        Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
        Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
        this.refIdFactory = refIdFactory;
        this.stripeStore = stripeStore;
        this.transferDataToRequest = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTransferRequest(TransferData transferData, boolean z, Continuation<? super ApiCreateTransferRequest> continuation) {
        C206741 c206741;
        ConcurrentMap concurrentMap;
        Object apiCreateTransferRequest;
        boolean z2;
        UUID uuidGenerateRefId;
        BigDecimal amount;
        ApiCreateTransferRequest.ApiTransferAccount apiAccount;
        ApiCreateTransferRequest.ApiTransferAccount apiAccount2;
        ApiCreateTransferRequest2 frequency;
        ApiCreateTransferRequest2 apiCreateTransferRequest2;
        Boolean clawbackGracePeriodOptIn;
        MAXTransferContext.EntryPoint entryPoint;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData;
        boolean z3;
        boolean z4;
        int i;
        Boolean bool;
        ApiCreateTransferRequest2 apiCreateTransferRequest22;
        ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount;
        ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount2;
        BigDecimal bigDecimal;
        TransferData transferData2;
        String str;
        String str2;
        ApiRhyBankingData apiRhyBankingData;
        Object objPutIfAbsent;
        TransferAccount toAccount;
        TransferData transferData3 = transferData;
        if (continuation instanceof C206741) {
            c206741 = (C206741) continuation;
            int i2 = c206741.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c206741.label = i2 - Integer.MIN_VALUE;
            } else {
                c206741 = new C206741(continuation);
            }
        }
        Object radarSessionId = c206741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c206741.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(radarSessionId);
            concurrentMap = this.transferDataToRequest;
            apiCreateTransferRequest = concurrentMap.get(transferData3);
            if (apiCreateTransferRequest == null) {
                uuidGenerateRefId = this.refIdFactory.generateRefId(transferData3);
                amount = transferData3.getAmount();
                apiAccount = TransferAccounts7.toApiAccount(transferData3.getFromAccount());
                apiAccount2 = TransferAccounts7.toApiAccount(transferData3.getToAccount());
                if (TransferDataExtensions.isEligibleForRecurringDeposit(transferData3)) {
                    frequency = transferData3.getFrequency();
                } else {
                    frequency = ApiCreateTransferRequest2.ONCE;
                }
                apiCreateTransferRequest2 = frequency;
                clawbackGracePeriodOptIn = transferData3.getClawbackGracePeriodOptIn();
                entryPoint = transferData3.getEntryPoint();
                iraDistributionData = transferData3.getIraDistributionData();
                IraContributionQuestionnaireResult.IraContribution iraContribution = transferData3.getIraContribution();
                iraContributionData = iraContribution != null ? iraContribution.toIraContributionData() : null;
                int i4 = transferData3.getAchTransferOption() == AchTransferOption.INSTANT ? 1 : 0;
                if (transferData3.getFromAccount().getType() == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
                    try {
                        StripeStore stripeStore = this.stripeStore;
                        ApiTransferAccount.TransferAccountType type2 = transferData3.getToAccount().getType();
                        c206741.L$0 = transferData3;
                        c206741.L$1 = transferData3;
                        c206741.L$2 = concurrentMap;
                        c206741.L$3 = uuidGenerateRefId;
                        c206741.L$4 = amount;
                        c206741.L$5 = apiAccount;
                        c206741.L$6 = apiAccount2;
                        c206741.L$7 = apiCreateTransferRequest2;
                        c206741.L$8 = clawbackGracePeriodOptIn;
                        c206741.L$9 = entryPoint;
                        c206741.L$10 = iraDistributionData;
                        c206741.L$11 = iraContributionData;
                        c206741.Z$0 = z;
                        c206741.I$0 = i4;
                        z3 = true;
                        try {
                            c206741.label = 1;
                            radarSessionId = stripeStore.getRadarSessionId(type2, c206741);
                        } catch (Throwable th) {
                            th = th;
                            z4 = z;
                            i = i4;
                            bool = clawbackGracePeriodOptIn;
                            apiCreateTransferRequest22 = apiCreateTransferRequest2;
                            apiTransferAccount = apiAccount2;
                            apiTransferAccount2 = apiAccount;
                            bigDecimal = amount;
                            transferData2 = transferData3;
                            ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData2 = iraDistributionData;
                            MAXTransferContext.EntryPoint entryPoint2 = entryPoint;
                            Throwable th2 = th;
                            ConcurrentMap concurrentMap2 = concurrentMap;
                            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th2, false, null, 4, null);
                            concurrentMap = concurrentMap2;
                            iraDistributionData = iraDistributionData2;
                            entryPoint = entryPoint2;
                            clawbackGracePeriodOptIn = bool;
                            apiCreateTransferRequest2 = apiCreateTransferRequest22;
                            apiAccount2 = apiTransferAccount;
                            apiAccount = apiTransferAccount2;
                            amount = bigDecimal;
                            str2 = null;
                            str = str2;
                            ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData2 = iraContributionData;
                            ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData3 = iraDistributionData;
                            MAXTransferContext.EntryPoint entryPoint3 = entryPoint;
                            ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData apiIncentivesTransferData = new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData(transferData3.getPromotionName(), transferData3.getPromotionType());
                            boolean zShouldExecuteImmediately = TransferDataExtensions.shouldExecuteImmediately(transferData3);
                            if (transferData3.getIraRothConversionTransferInfo() == null) {
                            }
                            Boolean boolIsFullWithdrawal = transferData3.isFullWithdrawal();
                            if (TransferDataExtensions.isRhyBankingTransfer(transferData3)) {
                            }
                            if (i == 0) {
                            }
                            ApiCreateTransferRequest.ApiTransferAdditionalData apiTransferAdditionalData = new ApiCreateTransferRequest.ApiTransferAdditionalData(str, iraContributionData2, iraDistributionData3, iraConversionData, entryPoint3, null, boxing.boxBoolean(z3), null, null, null, null, apiIncentivesTransferData, DocUploadParentFragment.V2_TAG, zShouldExecuteImmediately, boolIsFullWithdrawal, apiRhyBankingData, 1952, null);
                            ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount3 = apiAccount;
                            BigDecimal bigDecimal2 = amount;
                            apiCreateTransferRequest = new ApiCreateTransferRequest(uuidGenerateRefId, bigDecimal2, apiTransferAccount3, apiAccount2, apiCreateTransferRequest2, null, apiTransferAdditionalData, null, null, null, null, false, clawbackGracePeriodOptIn, 4000, null);
                            objPutIfAbsent = concurrentMap.putIfAbsent(transferData3, apiCreateTransferRequest);
                            if (objPutIfAbsent != null) {
                            }
                            z2 = z4;
                            return ApiCreateTransferRequest.copy$default((ApiCreateTransferRequest) apiCreateTransferRequest, null, null, null, null, null, null, null, null, null, null, null, z2, null, 6143, null);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z3 = true;
                    }
                    if (radarSessionId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z4 = z;
                    i = i4;
                    transferData2 = transferData3;
                    str2 = (String) radarSessionId;
                    str = str2;
                    ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData22 = iraContributionData;
                    ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData32 = iraDistributionData;
                    MAXTransferContext.EntryPoint entryPoint32 = entryPoint;
                    ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData apiIncentivesTransferData2 = new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData(transferData3.getPromotionName(), transferData3.getPromotionType());
                    boolean zShouldExecuteImmediately2 = TransferDataExtensions.shouldExecuteImmediately(transferData3);
                    if (transferData3.getIraRothConversionTransferInfo() == null) {
                    }
                    Boolean boolIsFullWithdrawal2 = transferData3.isFullWithdrawal();
                    if (TransferDataExtensions.isRhyBankingTransfer(transferData3)) {
                    }
                    if (i == 0) {
                    }
                    ApiCreateTransferRequest.ApiTransferAdditionalData apiTransferAdditionalData2 = new ApiCreateTransferRequest.ApiTransferAdditionalData(str, iraContributionData22, iraDistributionData32, iraConversionData, entryPoint32, null, boxing.boxBoolean(z3), null, null, null, null, apiIncentivesTransferData2, DocUploadParentFragment.V2_TAG, zShouldExecuteImmediately2, boolIsFullWithdrawal2, apiRhyBankingData, 1952, null);
                    ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount32 = apiAccount;
                    BigDecimal bigDecimal22 = amount;
                    apiCreateTransferRequest = new ApiCreateTransferRequest(uuidGenerateRefId, bigDecimal22, apiTransferAccount32, apiAccount2, apiCreateTransferRequest2, null, apiTransferAdditionalData2, null, null, null, null, false, clawbackGracePeriodOptIn, 4000, null);
                    objPutIfAbsent = concurrentMap.putIfAbsent(transferData3, apiCreateTransferRequest);
                    if (objPutIfAbsent != null) {
                    }
                    z2 = z4;
                } else {
                    z3 = true;
                    z4 = z;
                    i = i4;
                    str = null;
                    transferData2 = transferData3;
                    ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData222 = iraContributionData;
                    ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData322 = iraDistributionData;
                    MAXTransferContext.EntryPoint entryPoint322 = entryPoint;
                    ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData apiIncentivesTransferData22 = new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData(transferData3.getPromotionName(), transferData3.getPromotionType());
                    boolean zShouldExecuteImmediately22 = TransferDataExtensions.shouldExecuteImmediately(transferData3);
                    if (transferData3.getIraRothConversionTransferInfo() == null) {
                    }
                    Boolean boolIsFullWithdrawal22 = transferData3.isFullWithdrawal();
                    if (TransferDataExtensions.isRhyBankingTransfer(transferData3)) {
                    }
                    if (i == 0) {
                    }
                    ApiCreateTransferRequest.ApiTransferAdditionalData apiTransferAdditionalData22 = new ApiCreateTransferRequest.ApiTransferAdditionalData(str, iraContributionData222, iraDistributionData322, iraConversionData, entryPoint322, null, boxing.boxBoolean(z3), null, null, null, null, apiIncentivesTransferData22, DocUploadParentFragment.V2_TAG, zShouldExecuteImmediately22, boolIsFullWithdrawal22, apiRhyBankingData, 1952, null);
                    ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount322 = apiAccount;
                    BigDecimal bigDecimal222 = amount;
                    apiCreateTransferRequest = new ApiCreateTransferRequest(uuidGenerateRefId, bigDecimal222, apiTransferAccount322, apiAccount2, apiCreateTransferRequest2, null, apiTransferAdditionalData22, null, null, null, null, false, clawbackGracePeriodOptIn, 4000, null);
                    objPutIfAbsent = concurrentMap.putIfAbsent(transferData3, apiCreateTransferRequest);
                    if (objPutIfAbsent != null) {
                    }
                    z2 = z4;
                }
            } else {
                z2 = z;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = c206741.I$0;
            z4 = c206741.Z$0;
            iraContributionData = (ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData) c206741.L$11;
            iraDistributionData = (ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData) c206741.L$10;
            entryPoint = (MAXTransferContext.EntryPoint) c206741.L$9;
            clawbackGracePeriodOptIn = (Boolean) c206741.L$8;
            apiCreateTransferRequest2 = (ApiCreateTransferRequest2) c206741.L$7;
            apiAccount2 = (ApiCreateTransferRequest.ApiTransferAccount) c206741.L$6;
            apiAccount = (ApiCreateTransferRequest.ApiTransferAccount) c206741.L$5;
            amount = (BigDecimal) c206741.L$4;
            uuidGenerateRefId = (UUID) c206741.L$3;
            concurrentMap = (ConcurrentMap) c206741.L$2;
            transferData2 = (TransferData) c206741.L$1;
            TransferData transferData4 = (TransferData) c206741.L$0;
            try {
                ResultKt.throwOnFailure(radarSessionId);
                i = i5;
                transferData3 = transferData4;
                z3 = true;
                try {
                    str2 = (String) radarSessionId;
                } catch (Throwable th4) {
                    th = th4;
                    bool = clawbackGracePeriodOptIn;
                    apiCreateTransferRequest22 = apiCreateTransferRequest2;
                    apiTransferAccount = apiAccount2;
                    apiTransferAccount2 = apiAccount;
                    bigDecimal = amount;
                    ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData22 = iraDistributionData;
                    MAXTransferContext.EntryPoint entryPoint22 = entryPoint;
                    Throwable th22 = th;
                    ConcurrentMap concurrentMap22 = concurrentMap;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th22, false, null, 4, null);
                    concurrentMap = concurrentMap22;
                    iraDistributionData = iraDistributionData22;
                    entryPoint = entryPoint22;
                    clawbackGracePeriodOptIn = bool;
                    apiCreateTransferRequest2 = apiCreateTransferRequest22;
                    apiAccount2 = apiTransferAccount;
                    apiAccount = apiTransferAccount2;
                    amount = bigDecimal;
                    str2 = null;
                    str = str2;
                    ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData2222 = iraContributionData;
                    ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData3222 = iraDistributionData;
                    MAXTransferContext.EntryPoint entryPoint3222 = entryPoint;
                    ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData apiIncentivesTransferData222 = new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData(transferData3.getPromotionName(), transferData3.getPromotionType());
                    boolean zShouldExecuteImmediately222 = TransferDataExtensions.shouldExecuteImmediately(transferData3);
                    if (transferData3.getIraRothConversionTransferInfo() == null) {
                    }
                    Boolean boolIsFullWithdrawal222 = transferData3.isFullWithdrawal();
                    if (TransferDataExtensions.isRhyBankingTransfer(transferData3)) {
                    }
                    if (i == 0) {
                    }
                    ApiCreateTransferRequest.ApiTransferAdditionalData apiTransferAdditionalData222 = new ApiCreateTransferRequest.ApiTransferAdditionalData(str, iraContributionData2222, iraDistributionData3222, iraConversionData, entryPoint3222, null, boxing.boxBoolean(z3), null, null, null, null, apiIncentivesTransferData222, DocUploadParentFragment.V2_TAG, zShouldExecuteImmediately222, boolIsFullWithdrawal222, apiRhyBankingData, 1952, null);
                    ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount3222 = apiAccount;
                    BigDecimal bigDecimal2222 = amount;
                    apiCreateTransferRequest = new ApiCreateTransferRequest(uuidGenerateRefId, bigDecimal2222, apiTransferAccount3222, apiAccount2, apiCreateTransferRequest2, null, apiTransferAdditionalData222, null, null, null, null, false, clawbackGracePeriodOptIn, 4000, null);
                    objPutIfAbsent = concurrentMap.putIfAbsent(transferData3, apiCreateTransferRequest);
                    if (objPutIfAbsent != null) {
                    }
                    z2 = z4;
                    return ApiCreateTransferRequest.copy$default((ApiCreateTransferRequest) apiCreateTransferRequest, null, null, null, null, null, null, null, null, null, null, null, z2, null, 6143, null);
                }
            } catch (Throwable th5) {
                th = th5;
                i = i5;
                transferData3 = transferData4;
                bool = clawbackGracePeriodOptIn;
                apiCreateTransferRequest22 = apiCreateTransferRequest2;
                apiTransferAccount = apiAccount2;
                apiTransferAccount2 = apiAccount;
                bigDecimal = amount;
                z3 = true;
                ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData222 = iraDistributionData;
                MAXTransferContext.EntryPoint entryPoint222 = entryPoint;
                Throwable th222 = th;
                ConcurrentMap concurrentMap222 = concurrentMap;
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th222, false, null, 4, null);
                concurrentMap = concurrentMap222;
                iraDistributionData = iraDistributionData222;
                entryPoint = entryPoint222;
                clawbackGracePeriodOptIn = bool;
                apiCreateTransferRequest2 = apiCreateTransferRequest22;
                apiAccount2 = apiTransferAccount;
                apiAccount = apiTransferAccount2;
                amount = bigDecimal;
                str2 = null;
                str = str2;
                ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData22222 = iraContributionData;
                ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData32222 = iraDistributionData;
                MAXTransferContext.EntryPoint entryPoint32222 = entryPoint;
                ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData apiIncentivesTransferData2222 = new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData(transferData3.getPromotionName(), transferData3.getPromotionType());
                boolean zShouldExecuteImmediately2222 = TransferDataExtensions.shouldExecuteImmediately(transferData3);
                if (transferData3.getIraRothConversionTransferInfo() == null) {
                }
                Boolean boolIsFullWithdrawal2222 = transferData3.isFullWithdrawal();
                if (TransferDataExtensions.isRhyBankingTransfer(transferData3)) {
                }
                if (i == 0) {
                }
                ApiCreateTransferRequest.ApiTransferAdditionalData apiTransferAdditionalData2222 = new ApiCreateTransferRequest.ApiTransferAdditionalData(str, iraContributionData22222, iraDistributionData32222, iraConversionData, entryPoint32222, null, boxing.boxBoolean(z3), null, null, null, null, apiIncentivesTransferData2222, DocUploadParentFragment.V2_TAG, zShouldExecuteImmediately2222, boolIsFullWithdrawal2222, apiRhyBankingData, 1952, null);
                ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount32222 = apiAccount;
                BigDecimal bigDecimal22222 = amount;
                apiCreateTransferRequest = new ApiCreateTransferRequest(uuidGenerateRefId, bigDecimal22222, apiTransferAccount32222, apiAccount2, apiCreateTransferRequest2, null, apiTransferAdditionalData2222, null, null, null, null, false, clawbackGracePeriodOptIn, 4000, null);
                objPutIfAbsent = concurrentMap.putIfAbsent(transferData3, apiCreateTransferRequest);
                if (objPutIfAbsent != null) {
                }
                z2 = z4;
                return ApiCreateTransferRequest.copy$default((ApiCreateTransferRequest) apiCreateTransferRequest, null, null, null, null, null, null, null, null, null, null, null, z2, null, 6143, null);
            }
            str = str2;
            ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData222222 = iraContributionData;
            ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData322222 = iraDistributionData;
            MAXTransferContext.EntryPoint entryPoint322222 = entryPoint;
            ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData apiIncentivesTransferData22222 = new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData(transferData3.getPromotionName(), transferData3.getPromotionType());
            boolean zShouldExecuteImmediately22222 = TransferDataExtensions.shouldExecuteImmediately(transferData3);
            ApiCreateTransferRequest.ApiTransferAdditionalData.IraConversionData iraConversionData = transferData3.getIraRothConversionTransferInfo() == null ? new ApiCreateTransferRequest.ApiTransferAdditionalData.IraConversionData(transferData3.getIraRothConversionTransferInfo().getTax_year()) : null;
            Boolean boolIsFullWithdrawal22222 = transferData3.isFullWithdrawal();
            if (TransferDataExtensions.isRhyBankingTransfer(transferData3)) {
                apiRhyBankingData = null;
            } else {
                ApiTransferAccount.TransferAccountType type3 = transferData2.getFromAccount().getType();
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHY_BANKING;
                if (type3 == transferAccountType) {
                    toAccount = transferData2.getFromAccount();
                } else {
                    if (transferData2.getToAccount().getType() != transferAccountType) {
                        throw new IllegalStateException("Source or sink account must be RHY_BANKING");
                    }
                    toAccount = transferData2.getToAccount();
                }
                RhyBankingData rhyBankingData = toAccount.getRhyBankingData();
                if (rhyBankingData != null) {
                    apiRhyBankingData = new ApiRhyBankingData(rhyBankingData.getType());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (i == 0) {
                z3 = false;
            }
            ApiCreateTransferRequest.ApiTransferAdditionalData apiTransferAdditionalData22222 = new ApiCreateTransferRequest.ApiTransferAdditionalData(str, iraContributionData222222, iraDistributionData322222, iraConversionData, entryPoint322222, null, boxing.boxBoolean(z3), null, null, null, null, apiIncentivesTransferData22222, DocUploadParentFragment.V2_TAG, zShouldExecuteImmediately22222, boolIsFullWithdrawal22222, apiRhyBankingData, 1952, null);
            ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount322222 = apiAccount;
            BigDecimal bigDecimal222222 = amount;
            apiCreateTransferRequest = new ApiCreateTransferRequest(uuidGenerateRefId, bigDecimal222222, apiTransferAccount322222, apiAccount2, apiCreateTransferRequest2, null, apiTransferAdditionalData22222, null, null, null, null, false, clawbackGracePeriodOptIn, 4000, null);
            objPutIfAbsent = concurrentMap.putIfAbsent(transferData3, apiCreateTransferRequest);
            if (objPutIfAbsent != null) {
                apiCreateTransferRequest = objPutIfAbsent;
            }
            z2 = z4;
        }
        return ApiCreateTransferRequest.copy$default((ApiCreateTransferRequest) apiCreateTransferRequest, null, null, null, null, null, null, null, null, null, null, null, z2, null, 6143, null);
    }

    public final void invalidatePreviousState(TransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.transferDataToRequest.remove(transferData);
        this.refIdFactory.invalidateTransfer(transferData);
    }
}
