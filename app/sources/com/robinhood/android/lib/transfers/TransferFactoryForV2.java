package com.robinhood.android.lib.transfers;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.GetTransferValidationRequestDto;
import bff_money_movement.service.p019v1.GetTransferValidationResponseDto;
import bff_money_movement.service.p019v1.TransferStateDto;
import bff_money_movement.service.p019v1.TransferValidationErrorDetailsDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.incentives.wonka.WonkaServiceManager;
import com.robinhood.android.lib.stepupverification.SuvResult;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.lib.transfers.CreateTransferResult;
import com.robinhood.android.lib.transfers.util.AssetRetentionUtils;
import com.robinhood.android.lib.transfers.util.GetThreeDSRedirectUrl;
import com.robinhood.android.lib.transfers.util.IdlConverters;
import com.robinhood.android.transfers.lib.lastused.PaymentMethodLastUsagesPref;
import com.robinhood.android.transfers.lib.lastused.UpdatePaymentMethodLastUsed;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.librobinhood.data.store.bonfire.TransferPrecreateStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferSduiContainer;
import com.robinhood.models.api.bonfire.transfer.AssetRetentionUpsellContent;
import com.robinhood.models.api.bonfire.transfer.ClawbackGracePeriodContent;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow2;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.DisplayRTPUpsellAction;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferFactoryForV2.kt */
@Metadata(m3635d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B[\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0002J\u008f\u0002\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001c0$2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001c0$2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001c0$2*\u0010*\u001a&\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0012\u0004\u0012\u00020/0,\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001c0+2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c0+2!\u00103\u001a\u001d\u0012\u0013\u0012\u001104¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u001c0$2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u001c0$2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0$H\u0086@¢\u0006\u0002\u0010=J:\u0010\u001b\u001a\u00020>2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0$H\u0086@¢\u0006\u0002\u0010?J*\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020;2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0$H\u0082@¢\u0006\u0002\u0010CJ2\u0010D\u001a\u00020A2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00192\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0$H\u0086@¢\u0006\u0002\u0010EJ\u0010\u0010F\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020;H\u0002J\u000e\u0010G\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;", "", "paymentMethodLastUsagesPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "transferPrecreateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferPrecreateStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "requestFactory", "Lcom/robinhood/android/lib/transfers/CreateTransferV2RequestFactory;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "wonkaServiceManager", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "<init>", "(Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/librobinhood/data/store/bonfire/TransferPrecreateStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/lib/transfers/CreateTransferV2RequestFactory;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;)V", "isManagedAccountInvolved", "", "Lcom/robinhood/android/lib/transfers/TransferData;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "", "transferData", "continuingTransferAfterValidation", "resubmissionAfter3ds", "onLoading", "Lkotlin/Function0;", "onLoadingStopped", "onThreeDSRequested", "Lkotlin/Function1;", "", "onTransferCreated", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onTransferCreationFailed", "", "onShowPrecreateContent", "Lkotlin/Function2;", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplayRTPUpsellAction;", "Lcom/robinhood/models/api/bonfire/transfer/AssetRetentionUpsellContent;", "Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;", "onVerificationRequired", "Ljava/util/UUID;", "validationFailedCallback", "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "Lkotlin/ParameterName;", "name", "errorDetails", "onClawbackGracePeriodContent", "Lcom/robinhood/models/api/bonfire/transfer/ClawbackGracePeriodContent;", "eventDataForTransferCreation", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "(Lcom/robinhood/android/lib/transfers/TransferData;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult;", "(Lcom/robinhood/android/lib/transfers/TransferData;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransferMappingSuvErrors", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Required;", "request", "(Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransferSkippingOptionalChecks", "(Lcom/robinhood/android/lib/transfers/TransferData;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performPostSuccessSideEffects", "invalidatePreviousState", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TransferFactoryForV2 {
    private final BffMoneyMovementService bffMoneyMovementService;
    private final EventLogger eventLogger;
    private final StringToLongMapPreference paymentMethodLastUsagesPref;
    private final CreateTransferV2RequestFactory requestFactory;
    private final BaseSortingHatStore sortingHatStore;
    private final SuvWorkflowManager suvWorkflowManager;
    private final TransferV2LimitsStore transferLimitsStore;
    private final TransferPrecreateStore transferPrecreateStore;
    private final TransfersBonfireApi transfersBonfireApi;
    private final WonkaServiceManager wonkaServiceManager;

    /* compiled from: TransferFactoryForV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.transfers.TransferFactoryForV2", m3645f = "TransferFactoryForV2.kt", m3646l = {80}, m3647m = AnalyticsStrings.BUTTON_NEW_LIST_CREATE)
    /* renamed from: com.robinhood.android.lib.transfers.TransferFactoryForV2$create$1 */
    static final class C206771 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C206771(Continuation<? super C206771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferFactoryForV2.this.create(null, false, false, null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: TransferFactoryForV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.transfers.TransferFactoryForV2", m3645f = "TransferFactoryForV2.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, 165, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = AnalyticsStrings.BUTTON_NEW_LIST_CREATE)
    /* renamed from: com.robinhood.android.lib.transfers.TransferFactoryForV2$create$2 */
    static final class C206782 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C206782(Continuation<? super C206782> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferFactoryForV2.this.create(null, false, false, null, this);
        }
    }

    /* compiled from: TransferFactoryForV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.transfers.TransferFactoryForV2", m3645f = "TransferFactoryForV2.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m3647m = "createTransferMappingSuvErrors")
    /* renamed from: com.robinhood.android.lib.transfers.TransferFactoryForV2$createTransferMappingSuvErrors$1 */
    static final class C206791 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C206791(Continuation<? super C206791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferFactoryForV2.this.createTransferMappingSuvErrors(null, null, this);
        }
    }

    /* compiled from: TransferFactoryForV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.transfers.TransferFactoryForV2", m3645f = "TransferFactoryForV2.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE}, m3647m = "createTransferSkippingOptionalChecks")
    /* renamed from: com.robinhood.android.lib.transfers.TransferFactoryForV2$createTransferSkippingOptionalChecks$1 */
    static final class C206811 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C206811(Continuation<? super C206811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferFactoryForV2.this.createTransferSkippingOptionalChecks(null, false, null, this);
        }
    }

    public TransferFactoryForV2(@PaymentMethodLastUsagesPref StringToLongMapPreference paymentMethodLastUsagesPref, TransferPrecreateStore transferPrecreateStore, TransfersBonfireApi transfersBonfireApi, EventLogger eventLogger, CreateTransferV2RequestFactory requestFactory, SuvWorkflowManager suvWorkflowManager, BffMoneyMovementService bffMoneyMovementService, WonkaServiceManager wonkaServiceManager, TransferV2LimitsStore transferLimitsStore, BaseSortingHatStore sortingHatStore) {
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
        Intrinsics.checkNotNullParameter(transferPrecreateStore, "transferPrecreateStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(wonkaServiceManager, "wonkaServiceManager");
        Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        this.paymentMethodLastUsagesPref = paymentMethodLastUsagesPref;
        this.transferPrecreateStore = transferPrecreateStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.eventLogger = eventLogger;
        this.requestFactory = requestFactory;
        this.suvWorkflowManager = suvWorkflowManager;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.wonkaServiceManager = wonkaServiceManager;
        this.transferLimitsStore = transferLimitsStore;
        this.sortingHatStore = sortingHatStore;
    }

    private final boolean isManagedAccountInvolved(TransferData transferData) {
        ManagementInfo managementInfo = transferData.getFromAccount().getManagementInfo();
        ManagementType management_type = managementInfo != null ? managementInfo.getManagement_type() : null;
        ManagementType managementType = ManagementType.MANAGED;
        if (management_type == managementType) {
            return true;
        }
        ManagementInfo managementInfo2 = transferData.getToAccount().getManagementInfo();
        return (managementInfo2 != null ? managementInfo2.getManagement_type() : null) == managementType;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:13:0x0049, B:28:0x0099, B:30:0x009f, B:52:0x012c, B:31:0x00b5, B:33:0x00b9, B:34:0x00c3, B:36:0x00c7, B:37:0x00dc, B:39:0x00e0, B:40:0x00ea, B:42:0x00ee, B:43:0x00f8, B:45:0x00fc, B:46:0x0106, B:48:0x010a, B:49:0x011f, B:51:0x0123, B:53:0x0130, B:54:0x0135), top: B:68:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:13:0x0049, B:28:0x0099, B:30:0x009f, B:52:0x012c, B:31:0x00b5, B:33:0x00b9, B:34:0x00c3, B:36:0x00c7, B:37:0x00dc, B:39:0x00e0, B:40:0x00ea, B:42:0x00ee, B:43:0x00f8, B:45:0x00fc, B:46:0x0106, B:48:0x010a, B:49:0x011f, B:51:0x0123, B:53:0x0130, B:54:0x0135), top: B:68:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object create(TransferData transferData, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function1, Function1<? super PostTransferFlow, Unit> function12, Function1<? super Throwable, Unit> function13, Function2<? super Either<? extends AlertAction<? extends DisplayRTPUpsellAction>, AssetRetentionUpsellContent>, ? super PreCreatePopupType, Unit> function2, Function2<? super UUID, ? super Boolean, Unit> function22, Function1<? super TransferValidationErrorDetailsDto, Unit> function14, Function1<? super ClawbackGracePeriodContent, Unit> function15, Function1<? super ApiCreateTransferRequest, UserInteractionEventData> function16, Continuation<? super Unit> continuation) {
        C206771 c206771;
        Function0<Unit> function03;
        Function1<? super Throwable, Unit> function17;
        Function0<Unit> function04;
        Function1<? super Throwable, Unit> function18;
        Function1<? super PostTransferFlow, Unit> function19;
        Function2<? super Either<? extends AlertAction<? extends DisplayRTPUpsellAction>, AssetRetentionUpsellContent>, ? super PreCreatePopupType, Unit> function23;
        Function1<? super TransferValidationErrorDetailsDto, Unit> function110;
        Function1<? super ClawbackGracePeriodContent, Unit> function111;
        Function1<? super String, Unit> function112;
        Function2<? super UUID, ? super Boolean, Unit> function24;
        CreateTransferResult createTransferResult;
        if (continuation instanceof C206771) {
            c206771 = (C206771) continuation;
            int i = c206771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c206771.label = i - Integer.MIN_VALUE;
            } else {
                c206771 = new C206771(continuation);
            }
        }
        C206771 c2067712 = c206771;
        Object obj = c2067712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2067712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                function0.invoke();
                function03 = function02;
                try {
                    c2067712.L$0 = function03;
                    c2067712.L$1 = function1;
                    c2067712.L$2 = function12;
                    function17 = function13;
                    try {
                        c2067712.L$3 = function17;
                        c2067712.L$4 = function2;
                        c2067712.L$5 = function22;
                        c2067712.L$6 = function14;
                        c2067712.L$7 = function15;
                        c2067712.label = 1;
                        Object objCreate = create(transferData, z, z2, function16, c2067712);
                        if (objCreate == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function04 = function03;
                        function19 = function12;
                        function18 = function17;
                        function23 = function2;
                        function110 = function14;
                        function111 = function15;
                        function112 = function1;
                        obj = objCreate;
                        function24 = function22;
                        createTransferResult = (CreateTransferResult) obj;
                        if (!(createTransferResult instanceof CreateTransferResult.PreCreateCheck.AssetRetention)) {
                        }
                        function04.invoke();
                    } catch (Throwable th) {
                        th = th;
                        function04 = function03;
                        function18 = function17;
                        function18.invoke(th);
                        function04.invoke();
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    function17 = function13;
                    function04 = function03;
                    function18 = function17;
                    function18.invoke(th);
                    function04.invoke();
                    return Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                th = th3;
                function03 = function02;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function111 = (Function1) c2067712.L$7;
            function110 = (Function1) c2067712.L$6;
            function24 = (Function2) c2067712.L$5;
            function23 = (Function2) c2067712.L$4;
            function18 = (Function1) c2067712.L$3;
            function19 = (Function1) c2067712.L$2;
            function112 = (Function1) c2067712.L$1;
            function04 = (Function0) c2067712.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                createTransferResult = (CreateTransferResult) obj;
                if (!(createTransferResult instanceof CreateTransferResult.PreCreateCheck.AssetRetention)) {
                    function23.invoke(Either2.asRight(((CreateTransferResult.PreCreateCheck.AssetRetention) createTransferResult).getContent()), ((CreateTransferResult.PreCreateCheck.AssetRetention) createTransferResult).getPopupType());
                } else if (createTransferResult instanceof CreateTransferResult.PreCreateCheck.Clawback) {
                    function111.invoke(((CreateTransferResult.PreCreateCheck.Clawback) createTransferResult).getContent());
                } else if (createTransferResult instanceof CreateTransferResult.PreCreateCheck.Rtp) {
                    function23.invoke(Either2.asLeft(((CreateTransferResult.PreCreateCheck.Rtp) createTransferResult).getAction()), ((CreateTransferResult.PreCreateCheck.Rtp) createTransferResult).getPopupType());
                } else if (createTransferResult instanceof CreateTransferResult.PreCreateCheck.Validation) {
                    function110.invoke(((CreateTransferResult.PreCreateCheck.Validation) createTransferResult).getErrorDetails());
                } else if (createTransferResult instanceof CreateTransferResult.Failure.Generic) {
                    function18.invoke(((CreateTransferResult.Failure.Generic) createTransferResult).getException());
                } else if (createTransferResult instanceof CreateTransferResult.Failure.ThreeDs) {
                    function112.invoke(((CreateTransferResult.Failure.ThreeDs) createTransferResult).getRedirectUrl());
                } else if (createTransferResult instanceof CreateTransferResult.Failure.VerificationRequired) {
                    function24.invoke(((CreateTransferResult.Failure.VerificationRequired) createTransferResult).getWorkflowId(), boxing.boxBoolean(((CreateTransferResult.Failure.VerificationRequired) createTransferResult).isMigrated()));
                } else {
                    if (!(createTransferResult instanceof CreateTransferResult.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    function19.invoke(((CreateTransferResult.Success) createTransferResult).getPostTransferFlow());
                }
                function04.invoke();
            } catch (Throwable th4) {
                th = th4;
                function18.invoke(th);
                function04.invoke();
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0154, code lost:
    
        if (r0 == r3) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:14:0x0032, B:73:0x0157, B:21:0x004e, B:49:0x0105, B:51:0x010a, B:54:0x0112, B:57:0x011c, B:60:0x0124, B:62:0x012a, B:65:0x0132, B:68:0x013e, B:70:0x0148, B:24:0x005b, B:45:0x00e4, B:27:0x006b, B:36:0x00bf, B:38:0x00c7, B:41:0x00d3, B:31:0x0077, B:33:0x007d), top: B:77:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:14:0x0032, B:73:0x0157, B:21:0x004e, B:49:0x0105, B:51:0x010a, B:54:0x0112, B:57:0x011c, B:60:0x0124, B:62:0x012a, B:65:0x0132, B:68:0x013e, B:70:0x0148, B:24:0x005b, B:45:0x00e4, B:27:0x006b, B:36:0x00bf, B:38:0x00c7, B:41:0x00d3, B:31:0x0077, B:33:0x007d), top: B:77:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:14:0x0032, B:73:0x0157, B:21:0x004e, B:49:0x0105, B:51:0x010a, B:54:0x0112, B:57:0x011c, B:60:0x0124, B:62:0x012a, B:65:0x0132, B:68:0x013e, B:70:0x0148, B:24:0x005b, B:45:0x00e4, B:27:0x006b, B:36:0x00bf, B:38:0x00c7, B:41:0x00d3, B:31:0x0077, B:33:0x007d), top: B:77:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:14:0x0032, B:73:0x0157, B:21:0x004e, B:49:0x0105, B:51:0x010a, B:54:0x0112, B:57:0x011c, B:60:0x0124, B:62:0x012a, B:65:0x0132, B:68:0x013e, B:70:0x0148, B:24:0x005b, B:45:0x00e4, B:27:0x006b, B:36:0x00bf, B:38:0x00c7, B:41:0x00d3, B:31:0x0077, B:33:0x007d), top: B:77:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object create(TransferData transferData, boolean z, boolean z2, Function1<? super ApiCreateTransferRequest, UserInteractionEventData> function1, Continuation<? super CreateTransferResult> continuation) {
        C206782 c206782;
        TransferData transferData2;
        boolean z3;
        Function1<? super ApiCreateTransferRequest, UserInteractionEventData> function12;
        TransferData transferData3;
        ApiCreateTransferRequest apiCreateTransferRequest;
        Function1<? super ApiCreateTransferRequest, UserInteractionEventData> function13;
        AlertAction<DisplayRTPUpsellAction> sduiAlertAction;
        ClawbackGracePeriodContent clawbackGracePeriodContent;
        if (continuation instanceof C206782) {
            c206782 = (C206782) continuation;
            int i = c206782.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c206782.label = i - Integer.MIN_VALUE;
            } else {
                c206782 = new C206782(continuation);
            }
        }
        Object objGetTransferValidation = c206782.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c206782.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetTransferValidation);
                if (z || !isManagedAccountInvolved(transferData)) {
                    transferData2 = transferData;
                    z3 = z2;
                    function12 = function1;
                    CreateTransferV2RequestFactory createTransferV2RequestFactory = this.requestFactory;
                    c206782.L$0 = transferData2;
                    c206782.L$1 = function12;
                    c206782.label = 2;
                    objGetTransferValidation = createTransferV2RequestFactory.createTransferRequest(transferData2, z3, c206782);
                    if (objGetTransferValidation != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    transferData3 = transferData2;
                    apiCreateTransferRequest = (ApiCreateTransferRequest) objGetTransferValidation;
                    TransferPrecreateStore transferPrecreateStore = this.transferPrecreateStore;
                    Set<? extends PreCreatePopupType> of = SetsKt.setOf((Object[]) new PreCreatePopupType[]{PreCreatePopupType.INSTANT_UPSELL, PreCreatePopupType.RFP_UPSELL});
                    c206782.L$0 = transferData3;
                    c206782.L$1 = function12;
                    c206782.L$2 = apiCreateTransferRequest;
                    c206782.label = 3;
                    objGetTransferValidation = transferPrecreateStore.precreate(apiCreateTransferRequest, of, c206782);
                    if (objGetTransferValidation != coroutine_suspended) {
                    }
                } else {
                    BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService;
                    GetTransferValidationRequestDto getTransferValidationRequestDto = new GetTransferValidationRequestDto(TransferStateDto.TRANSFER_STATE_REVIEW, null, new MoneyDto(IdlDecimal2.toIdlDecimal(transferData.getAmount()), CurrencyDto.USD), IdlConverters.toTransferAccountDto(transferData.getFromAccount()), IdlConverters.toTransferAccountDto(transferData.getToAccount()), 2, null);
                    transferData2 = transferData;
                    c206782.L$0 = transferData2;
                    function12 = function1;
                    c206782.L$1 = function12;
                    z3 = z2;
                    c206782.Z$0 = z3;
                    c206782.label = 1;
                    objGetTransferValidation = bffMoneyMovementService.GetTransferValidation(getTransferValidationRequestDto, c206782);
                    if (objGetTransferValidation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i2 == 1) {
                boolean z4 = c206782.Z$0;
                Function1<? super ApiCreateTransferRequest, UserInteractionEventData> function14 = (Function1) c206782.L$1;
                TransferData transferData4 = (TransferData) c206782.L$0;
                ResultKt.throwOnFailure(objGetTransferValidation);
                z3 = z4;
                function12 = function14;
                transferData2 = transferData4;
            } else if (i2 == 2) {
                Function1<? super ApiCreateTransferRequest, UserInteractionEventData> function15 = (Function1) c206782.L$1;
                transferData3 = (TransferData) c206782.L$0;
                ResultKt.throwOnFailure(objGetTransferValidation);
                function12 = function15;
                apiCreateTransferRequest = (ApiCreateTransferRequest) objGetTransferValidation;
                TransferPrecreateStore transferPrecreateStore2 = this.transferPrecreateStore;
                Set<? extends PreCreatePopupType> of2 = SetsKt.setOf((Object[]) new PreCreatePopupType[]{PreCreatePopupType.INSTANT_UPSELL, PreCreatePopupType.RFP_UPSELL});
                c206782.L$0 = transferData3;
                c206782.L$1 = function12;
                c206782.L$2 = apiCreateTransferRequest;
                c206782.label = 3;
                objGetTransferValidation = transferPrecreateStore2.precreate(apiCreateTransferRequest, of2, c206782);
                if (objGetTransferValidation != coroutine_suspended) {
                    return coroutine_suspended;
                }
                function13 = function12;
                ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer = (ApiPreCreateTransferSduiContainer) objGetTransferValidation;
                if (apiPreCreateTransferSduiContainer == null) {
                }
                if (apiPreCreateTransferSduiContainer == null) {
                }
                if (apiPreCreateTransferSduiContainer == null) {
                }
                if (clawbackGracePeriodContent == null) {
                }
                if (sduiAlertAction == null) {
                }
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objGetTransferValidation);
                    return (CreateTransferResult) objGetTransferValidation;
                }
                apiCreateTransferRequest = (ApiCreateTransferRequest) c206782.L$2;
                function13 = (Function1) c206782.L$1;
                transferData3 = (TransferData) c206782.L$0;
                ResultKt.throwOnFailure(objGetTransferValidation);
                ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer2 = (ApiPreCreateTransferSduiContainer) objGetTransferValidation;
                sduiAlertAction = apiPreCreateTransferSduiContainer2 == null ? apiPreCreateTransferSduiContainer2.getSduiAlertAction() : null;
                AssetRetentionUpsellContent assetRetentionUpsellIfAllowed = apiPreCreateTransferSduiContainer2 == null ? AssetRetentionUtils.getAssetRetentionUpsellIfAllowed(apiPreCreateTransferSduiContainer2, this.wonkaServiceManager) : null;
                clawbackGracePeriodContent = apiPreCreateTransferSduiContainer2 == null ? apiPreCreateTransferSduiContainer2.getClawbackGracePeriodContent() : null;
                if (clawbackGracePeriodContent == null && transferData3.getClawbackGracePeriodOptIn() == null) {
                    return new CreateTransferResult.PreCreateCheck.Clawback(clawbackGracePeriodContent);
                }
                if (sduiAlertAction == null) {
                    return new CreateTransferResult.PreCreateCheck.Rtp(apiPreCreateTransferSduiContainer2.getType(), sduiAlertAction);
                }
                if (assetRetentionUpsellIfAllowed != null) {
                    return new CreateTransferResult.PreCreateCheck.AssetRetention(apiPreCreateTransferSduiContainer2.getType(), assetRetentionUpsellIfAllowed);
                }
                c206782.L$0 = null;
                c206782.L$1 = null;
                c206782.L$2 = null;
                c206782.label = 4;
                objGetTransferValidation = createTransferMappingSuvErrors(apiCreateTransferRequest, function13, c206782);
            }
            TransferValidationErrorDetailsDto error_details = ((GetTransferValidationResponseDto) objGetTransferValidation).getError_details();
            if (error_details != null) {
                return new CreateTransferResult.PreCreateCheck.Validation(error_details);
            }
            CreateTransferV2RequestFactory createTransferV2RequestFactory2 = this.requestFactory;
            c206782.L$0 = transferData2;
            c206782.L$1 = function12;
            c206782.label = 2;
            objGetTransferValidation = createTransferV2RequestFactory2.createTransferRequest(transferData2, z3, c206782);
            if (objGetTransferValidation != coroutine_suspended) {
            }
        } catch (Exception e) {
            return new CreateTransferResult.Failure.Generic(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTransferMappingSuvErrors(ApiCreateTransferRequest apiCreateTransferRequest, Function1<? super ApiCreateTransferRequest, UserInteractionEventData> function1, Continuation<? super CreateTransferResult.Required> continuation) {
        C206791 c206791;
        if (continuation instanceof C206791) {
            c206791 = (C206791) continuation;
            int i = c206791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c206791.label = i - Integer.MIN_VALUE;
            } else {
                c206791 = new C206791(continuation);
            }
        }
        Object objHandleRequest = c206791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c206791.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHandleRequest);
            SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager;
            TransferFactoryForV22 transferFactoryForV22 = new TransferFactoryForV22(this, function1, apiCreateTransferRequest, null);
            c206791.L$0 = apiCreateTransferRequest;
            c206791.label = 1;
            objHandleRequest = suvWorkflowManager.handleRequest(transferFactoryForV22, c206791);
            if (objHandleRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apiCreateTransferRequest = (ApiCreateTransferRequest) c206791.L$0;
            ResultKt.throwOnFailure(objHandleRequest);
        }
        SuvResult suvResult = (SuvResult) objHandleRequest;
        if (suvResult instanceof SuvResult.Error) {
            SuvResult.Error error = (SuvResult.Error) suvResult;
            String threeDSRedirectUrl = GetThreeDSRedirectUrl.getThreeDSRedirectUrl(error.getException());
            if (threeDSRedirectUrl != null) {
                return new CreateTransferResult.Failure.ThreeDs(threeDSRedirectUrl);
            }
            return new CreateTransferResult.Failure.Generic(error.getException());
        }
        if (suvResult instanceof SuvResult.Success) {
            performPostSuccessSideEffects(apiCreateTransferRequest);
            return new CreateTransferResult.Success(PostTransferFlow2.toUiModel((ApiCreateTransferResponse) ((SuvResult.Success) suvResult).getValue(), apiCreateTransferRequest.getSink().getType()));
        }
        if (!(suvResult instanceof SuvResult.VerificationRequired)) {
            throw new NoWhenBranchMatchedException();
        }
        SuvResult.VerificationRequired verificationRequired = (SuvResult.VerificationRequired) suvResult;
        return new CreateTransferResult.Failure.VerificationRequired(verificationRequired.getWorkflowId(), verificationRequired.isMigrated());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTransferSkippingOptionalChecks(TransferData transferData, boolean z, Function1<? super ApiCreateTransferRequest, UserInteractionEventData> function1, Continuation<? super CreateTransferResult.Required> continuation) {
        C206811 c206811;
        if (continuation instanceof C206811) {
            c206811 = (C206811) continuation;
            int i = c206811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c206811.label = i - Integer.MIN_VALUE;
            } else {
                c206811 = new C206811(continuation);
            }
        }
        Object objCreateTransferRequest = c206811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c206811.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateTransferRequest);
                CreateTransferV2RequestFactory createTransferV2RequestFactory = this.requestFactory;
                c206811.L$0 = function1;
                c206811.label = 1;
                objCreateTransferRequest = createTransferV2RequestFactory.createTransferRequest(transferData, z, c206811);
                if (objCreateTransferRequest == coroutine_suspended) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateTransferRequest);
                return objCreateTransferRequest;
            }
            function1 = (Function1) c206811.L$0;
            ResultKt.throwOnFailure(objCreateTransferRequest);
            c206811.L$0 = null;
            c206811.label = 2;
            Object objCreateTransferMappingSuvErrors = createTransferMappingSuvErrors((ApiCreateTransferRequest) objCreateTransferRequest, function1, c206811);
            return objCreateTransferMappingSuvErrors == coroutine_suspended ? coroutine_suspended : objCreateTransferMappingSuvErrors;
        } catch (Exception e) {
            return new CreateTransferResult.Failure.Generic(e);
        }
    }

    private final void performPostSuccessSideEffects(ApiCreateTransferRequest request) {
        Object next;
        Iterator it = CollectionsKt.listOf((Object[]) new ApiCreateTransferRequest.ApiTransferAccount[]{request.getSource(), request.getSink()}).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ApiCreateTransferRequest.ApiTransferAccount) next).getType().isExternal()) {
                    break;
                }
            }
        }
        ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount = (ApiCreateTransferRequest.ApiTransferAccount) next;
        String id = apiTransferAccount != null ? apiTransferAccount.getId() : null;
        if (id != null) {
            UpdatePaymentMethodLastUsed.updatePaymentMethodLastUsed(this.paymentMethodLastUsagesPref, id);
        }
        this.sortingHatStore.invalidateSortingHatCacheIfNeeded();
        this.transferLimitsStore.refresh();
    }

    public final void invalidatePreviousState(TransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.requestFactory.invalidatePreviousState(transferData);
    }
}
