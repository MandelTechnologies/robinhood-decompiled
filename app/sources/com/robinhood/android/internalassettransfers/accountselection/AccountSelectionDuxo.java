package com.robinhood.android.internalassettransfers.accountselection;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionEvent;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment;
import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import com.robinhood.android.internalassettransfers.maritalstatus.models.UiMaritalStatusQuestion;
import com.robinhood.android.internalassettransfers.maritalstatus.models.UiMaritalStatusQuestion2;
import com.robinhood.android.internalassettransfers.review.models.UiAssets3;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import com.robinhood.compose.duxo.DuxoComposableCompanion;
import com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.resource.StringResource;
import internal_asset_transfers.proto.p475v1.GetEligibleAccountsRequestDto;
import internal_asset_transfers.proto.p475v1.GetEligibleAccountsResponseDto;
import internal_asset_transfers.proto.p475v1.GetInvestorProfileConfirmationRequestDto;
import internal_asset_transfers.proto.p475v1.GetInvestorProfileConfirmationResponseDto;
import internal_asset_transfers.proto.p475v1.InternalAssetTransfersService;
import internal_asset_transfers.proto.p475v1.QuestionDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import p479j$.time.Clock;

/* compiled from: AccountSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 @2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002A@B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0016¢\u0006\u0004\b0\u0010)J\u0015\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "internalAssetTransfersStore", "j$/time/Clock", Card.Icon.CLOCK, "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;Lj$/time/Clock;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "rhsAccountNumber", "", "onSourceAccountSelected", "(Ljava/lang/String;)V", "onSinkAccountSelected", "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "sourceIatAccount", "sinkIatAccount", "Linternal_asset_transfers/proto/v1/QuestionDto;", "checkMaritalStatusRequest", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "loadMaritalStatusQuestionAndEligibleAssets", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent$AlertSheetWarning;", "noAssetsToTransferAlertSheetData", "()Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent$AlertSheetWarning;", "loadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "()V", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "selectionType", "onAccountSelected", "(Ljava/lang/String;Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;)V", "validateAccountPair", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;)V", "dismissErrorDialog", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction;", "alertSheetAction", "handleAlertSheetAction", "(Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction;)V", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lmicrogram/android/inject/MicrogramComponent;", "internalAssetTransfersMicrogramApp", "Lmicrogram/android/inject/MicrogramComponent;", "Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;", "internalAssetTransfersService", "Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;", "Companion", "AlertSheetAction", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AccountSelectionDuxo extends BaseDuxo3<AccountSelectionDataState, AccountSelectionViewState, AccountSelectionEvent> implements HasSavedState {
    private final Clock clock;
    private final MicrogramComponent internalAssetTransfersMicrogramApp;
    private final InternalAssetTransfersService internalAssetTransfersService;
    private final InternalAssetTransfersStore internalAssetTransfersStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountSelectionListFragment.AccountSelectionType.values().length];
            try {
                iArr[AccountSelectionListFragment.AccountSelectionType.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountSelectionListFragment.AccountSelectionType.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo", m3645f = "AccountSelectionDuxo.kt", m3646l = {128}, m3647m = "checkMaritalStatusRequest")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$checkMaritalStatusRequest$1 */
    static final class C189991 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C189991(Continuation<? super C189991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountSelectionDuxo.this.checkMaritalStatusRequest(null, null, this);
        }
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo", m3645f = "AccountSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE}, m3647m = "loadData")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadData$1 */
    static final class C190011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C190011(Continuation<? super C190011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountSelectionDuxo.this.loadData(this);
        }
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo", m3645f = "AccountSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 144}, m3647m = "loadMaritalStatusQuestionAndEligibleAssets")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadMaritalStatusQuestionAndEligibleAssets$1 */
    static final class C190051 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C190051(Continuation<? super C190051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountSelectionDuxo.this.loadMaritalStatusQuestionAndEligibleAssets(null, null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSelectionDuxo(InternalAssetTransfersStore internalAssetTransfersStore, Clock clock, MicrogramComponent.Factory microgramComponentFactory, AccountSelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AccountSelectionDataState(null, null, null, false, null, null, 63, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.internalAssetTransfersStore = internalAssetTransfersStore;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent microgramComponentCreate$default = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-internal-asset-transfers", null, 2, null), null, 4, null);
        this.internalAssetTransfersMicrogramApp = microgramComponentCreate$default;
        this.internalAssetTransfersService = (InternalAssetTransfersService) microgramComponentCreate$default.getServiceLocator().getClient(InternalAssetTransfersService.class);
        getLifecycleScope().launchWhenStarted(new C189981(null));
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$1", m3645f = "AccountSelectionDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$1 */
    static final class C189981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C189981(Continuation<? super C189981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountSelectionDuxo.this.new C189981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C189981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountSelectionDuxo accountSelectionDuxo = AccountSelectionDuxo.this;
                this.label = 1;
                if (accountSelectionDuxo.loadData(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$refresh$1", m3645f = "AccountSelectionDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$refresh$1 */
    static final class C190111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C190111(Continuation<? super C190111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountSelectionDuxo.this.new C190111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C190111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountSelectionDuxo accountSelectionDuxo = AccountSelectionDuxo.this;
                this.label = 1;
                if (accountSelectionDuxo.loadData(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void refresh() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C190111(null), 3, null);
    }

    public final void onAccountSelected(String rhsAccountNumber, AccountSelectionListFragment.AccountSelectionType selectionType) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        int i = WhenMappings.$EnumSwitchMapping$0[selectionType.ordinal()];
        if (i == 1) {
            onSourceAccountSelected(rhsAccountNumber);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            onSinkAccountSelected(rhsAccountNumber);
        }
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$onSourceAccountSelected$1", m3645f = "AccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$onSourceAccountSelected$1 */
    static final class C190101 extends ContinuationImpl7 implements Function2<AccountSelectionDataState, Continuation<? super AccountSelectionDataState>, Object> {
        final /* synthetic */ String $rhsAccountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C190101(String str, Continuation<? super C190101> continuation) {
            super(2, continuation);
            this.$rhsAccountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190101 c190101 = new C190101(this.$rhsAccountNumber, continuation);
            c190101.L$0 = obj;
            return c190101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountSelectionDataState accountSelectionDataState, Continuation<? super AccountSelectionDataState> continuation) {
            return ((C190101) create(accountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List listEmptyList;
            Map<String, List<UiIatAccount>> validSourceToSink;
            List<UiIatAccount> list;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountSelectionDataState accountSelectionDataState = (AccountSelectionDataState) this.L$0;
            UiEligibleAccounts eligibleAccounts = accountSelectionDataState.getEligibleAccounts();
            if (eligibleAccounts == null || (validSourceToSink = eligibleAccounts.getValidSourceToSink()) == null || (list = validSourceToSink.get(this.$rhsAccountNumber)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = new ArrayList();
                for (Object obj2 : list) {
                    if (((UiIatAccount) obj2).isEligibleSink()) {
                        listEmptyList.add(obj2);
                    }
                }
            }
            String selectedSinkAccountNumberRhs = null;
            if (listEmptyList.size() == 1) {
                UiIatAccount uiIatAccount = (UiIatAccount) CollectionsKt.first(listEmptyList);
                if (uiIatAccount.isEligibleSink()) {
                    selectedSinkAccountNumberRhs = uiIatAccount.getRhsAccountNumber();
                }
            } else {
                List list2 = listEmptyList;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (Intrinsics.areEqual(((UiIatAccount) it.next()).getRhsAccountNumber(), accountSelectionDataState.getSelectedSinkAccountNumberRhs())) {
                            selectedSinkAccountNumberRhs = accountSelectionDataState.getSelectedSinkAccountNumberRhs();
                            break;
                        }
                    }
                }
            }
            return AccountSelectionDataState.copy$default(accountSelectionDataState, null, this.$rhsAccountNumber, selectedSinkAccountNumberRhs, false, null, null, 57, null);
        }
    }

    private final void onSourceAccountSelected(String rhsAccountNumber) {
        applyMutation(new C190101(rhsAccountNumber, null));
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$onSinkAccountSelected$1", m3645f = "AccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$onSinkAccountSelected$1 */
    static final class C190091 extends ContinuationImpl7 implements Function2<AccountSelectionDataState, Continuation<? super AccountSelectionDataState>, Object> {
        final /* synthetic */ String $rhsAccountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C190091(String str, Continuation<? super C190091> continuation) {
            super(2, continuation);
            this.$rhsAccountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190091 c190091 = new C190091(this.$rhsAccountNumber, continuation);
            c190091.L$0 = obj;
            return c190091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountSelectionDataState accountSelectionDataState, Continuation<? super AccountSelectionDataState> continuation) {
            return ((C190091) create(accountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List<UiIatAccount> listEmptyList;
            Map<String, List<UiIatAccount>> validSinkToSource;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountSelectionDataState accountSelectionDataState = (AccountSelectionDataState) this.L$0;
            UiEligibleAccounts eligibleAccounts = accountSelectionDataState.getEligibleAccounts();
            if (eligibleAccounts == null || (validSinkToSource = eligibleAccounts.getValidSinkToSource()) == null || (listEmptyList = validSinkToSource.get(this.$rhsAccountNumber)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            String selectedSourceAccountNumberRhs = null;
            if (listEmptyList.size() == 1) {
                UiIatAccount uiIatAccount = (UiIatAccount) CollectionsKt.first((List) listEmptyList);
                if (uiIatAccount.isEligibleSource()) {
                    selectedSourceAccountNumberRhs = uiIatAccount.getRhsAccountNumber();
                }
            } else {
                List<UiIatAccount> list = listEmptyList;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (Intrinsics.areEqual(((UiIatAccount) it.next()).getRhsAccountNumber(), accountSelectionDataState.getSelectedSourceAccountNumberRhs())) {
                            selectedSourceAccountNumberRhs = accountSelectionDataState.getSelectedSourceAccountNumberRhs();
                            break;
                        }
                    }
                }
            }
            return AccountSelectionDataState.copy$default(accountSelectionDataState, null, selectedSourceAccountNumberRhs, this.$rhsAccountNumber, false, null, null, 57, null);
        }
    }

    private final void onSinkAccountSelected(String rhsAccountNumber) {
        applyMutation(new C190091(rhsAccountNumber, null));
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$validateAccountPair$1", m3645f = "AccountSelectionDuxo.kt", m3646l = {116}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$validateAccountPair$1 */
    static final class C190121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiIatAccount $sinkIatAccount;
        final /* synthetic */ UiIatAccount $sourceIatAccount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C190121(UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, Continuation<? super C190121> continuation) {
            super(2, continuation);
            this.$sourceIatAccount = uiIatAccount;
            this.$sinkIatAccount = uiIatAccount2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountSelectionDuxo.this.new C190121(this.$sourceIatAccount, this.$sinkIatAccount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C190121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountSelectionDuxo accountSelectionDuxo = AccountSelectionDuxo.this;
                UiIatAccount uiIatAccount = this.$sourceIatAccount;
                UiIatAccount uiIatAccount2 = this.$sinkIatAccount;
                this.label = 1;
                if (accountSelectionDuxo.loadMaritalStatusQuestionAndEligibleAssets(uiIatAccount, uiIatAccount2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void validateAccountPair(UiIatAccount sourceIatAccount, UiIatAccount sinkIatAccount) {
        Intrinsics.checkNotNullParameter(sourceIatAccount, "sourceIatAccount");
        Intrinsics.checkNotNullParameter(sinkIatAccount, "sinkIatAccount");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C190121(sourceIatAccount, sinkIatAccount, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkMaritalStatusRequest(UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, Continuation<? super QuestionDto> continuation) {
        C189991 c189991;
        if (continuation instanceof C189991) {
            c189991 = (C189991) continuation;
            int i = c189991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c189991.label = i - Integer.MIN_VALUE;
            } else {
                c189991 = new C189991(continuation);
            }
        }
        Object objGetInvestorProfileConfirmation = c189991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c189991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetInvestorProfileConfirmation);
            GetInvestorProfileConfirmationRequestDto getInvestorProfileConfirmationRequestDto = new GetInvestorProfileConfirmationRequestDto(UiEligibleAccounts2.toIatAccountDto(uiIatAccount), UiEligibleAccounts2.toIatAccountDto(uiIatAccount2));
            InternalAssetTransfersService internalAssetTransfersService = this.internalAssetTransfersService;
            c189991.label = 1;
            objGetInvestorProfileConfirmation = internalAssetTransfersService.GetInvestorProfileConfirmation(getInvestorProfileConfirmationRequestDto, c189991);
            if (objGetInvestorProfileConfirmation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetInvestorProfileConfirmation);
        }
        return ((GetInvestorProfileConfirmationResponseDto) objGetInvestorProfileConfirmation).getQuestion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0035, B:34:0x0090, B:36:0x009c, B:37:0x00a5, B:20:0x004d, B:26:0x0069, B:28:0x006d, B:30:0x0073, B:23:0x005c), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0035, B:34:0x0090, B:36:0x009c, B:37:0x00a5, B:20:0x004d, B:26:0x0069, B:28:0x006d, B:30:0x0073, B:23:0x005c), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadMaritalStatusQuestionAndEligibleAssets(UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, Continuation<? super Unit> continuation) throws Exception {
        C190051 c190051;
        UiIatAccount uiIatAccount3;
        UiMaritalStatusQuestion uiMaritalStatusQuestion;
        EligibleAssets eligibleAssets;
        if (continuation instanceof C190051) {
            c190051 = (C190051) continuation;
            int i = c190051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c190051.label = i - Integer.MIN_VALUE;
            } else {
                c190051 = new C190051(continuation);
            }
        }
        Object objCheckMaritalStatusRequest = c190051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c190051.label;
        try {
        } catch (Exception e) {
            if (!Throwables.isNetworkRelated(e)) {
                throw e;
            }
            applyMutation(new C190073(e, null));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCheckMaritalStatusRequest);
            applyMutation(new C190062(null));
            c190051.L$0 = uiIatAccount;
            c190051.L$1 = uiIatAccount2;
            c190051.label = 1;
            objCheckMaritalStatusRequest = checkMaritalStatusRequest(uiIatAccount, uiIatAccount2, c190051);
            if (objCheckMaritalStatusRequest == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uiMaritalStatusQuestion = (UiMaritalStatusQuestion) c190051.L$2;
            uiIatAccount2 = (UiIatAccount) c190051.L$1;
            uiIatAccount3 = (UiIatAccount) c190051.L$0;
            ResultKt.throwOnFailure(objCheckMaritalStatusRequest);
            eligibleAssets = (EligibleAssets) objCheckMaritalStatusRequest;
            if (UiAssets3.toTransferableUiModel(eligibleAssets).getAssetsCount() <= 0) {
                submit(new AccountSelectionEvent.AccountsSelected(uiIatAccount3, uiIatAccount2, uiMaritalStatusQuestion, eligibleAssets));
            } else {
                submit(noAssetsToTransferAlertSheetData());
            }
            applyMutation(new C190084(null));
            return Unit.INSTANCE;
        }
        uiIatAccount2 = (UiIatAccount) c190051.L$1;
        uiIatAccount = (UiIatAccount) c190051.L$0;
        ResultKt.throwOnFailure(objCheckMaritalStatusRequest);
        QuestionDto questionDto = (QuestionDto) objCheckMaritalStatusRequest;
        UiMaritalStatusQuestion uiMartialStatusQuestion = questionDto != null ? UiMaritalStatusQuestion2.toUiMartialStatusQuestion(questionDto) : null;
        InternalAssetTransfersStore internalAssetTransfersStore = this.internalAssetTransfersStore;
        String rhsAccountNumber = uiIatAccount.getRhsAccountNumber();
        String rhsAccountNumber2 = uiIatAccount2.getRhsAccountNumber();
        c190051.L$0 = uiIatAccount;
        c190051.L$1 = uiIatAccount2;
        c190051.L$2 = uiMartialStatusQuestion;
        c190051.label = 2;
        Object eligibleAssets2 = internalAssetTransfersStore.getEligibleAssets(rhsAccountNumber, rhsAccountNumber2, c190051);
        if (eligibleAssets2 != coroutine_suspended) {
            uiIatAccount3 = uiIatAccount;
            uiMaritalStatusQuestion = uiMartialStatusQuestion;
            objCheckMaritalStatusRequest = eligibleAssets2;
            eligibleAssets = (EligibleAssets) objCheckMaritalStatusRequest;
            if (UiAssets3.toTransferableUiModel(eligibleAssets).getAssetsCount() <= 0) {
            }
            applyMutation(new C190084(null));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadMaritalStatusQuestionAndEligibleAssets$2", m3645f = "AccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadMaritalStatusQuestionAndEligibleAssets$2 */
    static final class C190062 extends ContinuationImpl7 implements Function2<AccountSelectionDataState, Continuation<? super AccountSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C190062(Continuation<? super C190062> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190062 c190062 = new C190062(continuation);
            c190062.L$0 = obj;
            return c190062;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountSelectionDataState accountSelectionDataState, Continuation<? super AccountSelectionDataState> continuation) {
            return ((C190062) create(accountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountSelectionDataState.copy$default((AccountSelectionDataState) this.L$0, null, null, null, true, null, null, 55, null);
        }
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadMaritalStatusQuestionAndEligibleAssets$3", m3645f = "AccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadMaritalStatusQuestionAndEligibleAssets$3 */
    static final class C190073 extends ContinuationImpl7 implements Function2<AccountSelectionDataState, Continuation<? super AccountSelectionDataState>, Object> {
        final /* synthetic */ Exception $exception;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C190073(Exception exc, Continuation<? super C190073> continuation) {
            super(2, continuation);
            this.$exception = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190073 c190073 = new C190073(this.$exception, continuation);
            c190073.L$0 = obj;
            return c190073;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountSelectionDataState accountSelectionDataState, Continuation<? super AccountSelectionDataState> continuation) {
            return ((C190073) create(accountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountSelectionDataState.copy$default((AccountSelectionDataState) this.L$0, null, null, null, false, null, this.$exception, 31, null);
        }
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadMaritalStatusQuestionAndEligibleAssets$4", m3645f = "AccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadMaritalStatusQuestionAndEligibleAssets$4 */
    static final class C190084 extends ContinuationImpl7 implements Function2<AccountSelectionDataState, Continuation<? super AccountSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C190084(Continuation<? super C190084> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190084 c190084 = new C190084(continuation);
            c190084.L$0 = obj;
            return c190084;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountSelectionDataState accountSelectionDataState, Continuation<? super AccountSelectionDataState> continuation) {
            return ((C190084) create(accountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountSelectionDataState.copy$default((AccountSelectionDataState) this.L$0, null, null, null, false, null, null, 55, null);
        }
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$dismissErrorDialog$1", m3645f = "AccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$dismissErrorDialog$1 */
    static final class C190001 extends ContinuationImpl7 implements Function2<AccountSelectionDataState, Continuation<? super AccountSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C190001(Continuation<? super C190001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190001 c190001 = new C190001(continuation);
            c190001.L$0 = obj;
            return c190001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountSelectionDataState accountSelectionDataState, Continuation<? super AccountSelectionDataState> continuation) {
            return ((C190001) create(accountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountSelectionDataState.copy$default((AccountSelectionDataState) this.L$0, null, null, null, false, null, null, 31, null);
        }
    }

    public final void dismissErrorDialog() {
        applyMutation(new C190001(null));
    }

    public final void handleAlertSheetAction(AlertSheetAction alertSheetAction) {
        Intrinsics.checkNotNullParameter(alertSheetAction, "alertSheetAction");
        if (alertSheetAction instanceof AlertSheetAction.Dismiss) {
            return;
        }
        if (!(alertSheetAction instanceof AlertSheetAction.SecondaryNavigation)) {
            throw new NoWhenBranchMatchedException();
        }
        submit(new AccountSelectionEvent.NavigateToFragment(((AlertSheetAction.SecondaryNavigation) alertSheetAction).getFragmentKey()));
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction;", "", BentoAlertSheet6.button2Title, "SecondaryNavigation", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction$Dismiss;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction$SecondaryNavigation;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface AlertSheetAction {

        /* compiled from: AccountSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction$Dismiss;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Dismiss implements AlertSheetAction {
            public static final int $stable = 0;
            public static final Dismiss INSTANCE = new Dismiss();

            public boolean equals(Object other) {
                return this == other || (other instanceof Dismiss);
            }

            public int hashCode() {
                return 544309202;
            }

            public String toString() {
                return BentoAlertSheet6.button2Title;
            }

            private Dismiss() {
            }
        }

        /* compiled from: AccountSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction$SecondaryNavigation;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction;", "fragmentKey", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SecondaryNavigation implements AlertSheetAction {
            public static final int $stable = 8;
            private final LegacyFragmentKey fragmentKey;

            public static /* synthetic */ SecondaryNavigation copy$default(SecondaryNavigation secondaryNavigation, LegacyFragmentKey legacyFragmentKey, int i, Object obj) {
                if ((i & 1) != 0) {
                    legacyFragmentKey = secondaryNavigation.fragmentKey;
                }
                return secondaryNavigation.copy(legacyFragmentKey);
            }

            /* renamed from: component1, reason: from getter */
            public final LegacyFragmentKey getFragmentKey() {
                return this.fragmentKey;
            }

            public final SecondaryNavigation copy(LegacyFragmentKey fragmentKey) {
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                return new SecondaryNavigation(fragmentKey);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SecondaryNavigation) && Intrinsics.areEqual(this.fragmentKey, ((SecondaryNavigation) other).fragmentKey);
            }

            public int hashCode() {
                return this.fragmentKey.hashCode();
            }

            public String toString() {
                return "SecondaryNavigation(fragmentKey=" + this.fragmentKey + ")";
            }

            public SecondaryNavigation(LegacyFragmentKey fragmentKey) {
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                this.fragmentKey = fragmentKey;
            }

            public final LegacyFragmentKey getFragmentKey() {
                return this.fragmentKey;
            }
        }
    }

    private final AccountSelectionEvent.AlertSheetWarning noAssetsToTransferAlertSheetData() {
        StringResource.Companion companion = StringResource.INSTANCE;
        return new AccountSelectionEvent.AlertSheetWarning(new AccountFeatureParityBottomSheetData(companion.invoke(C18977R.string.internal_asset_transfer_accountselection_check_no_assets_title, new Object[0]), companion.invoke(C18977R.string.f4212x6b4db8a, new Object[0]), companion.invoke(C18977R.string.f4211x49e00969, new Object[0]), null, null, 16, null), AlertSheetAction.Dismiss.INSTANCE, null);
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadData$2", m3645f = "AccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadData$2 */
    static final class C190032 extends ContinuationImpl7 implements Function2<AccountSelectionDataState, Continuation<? super AccountSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C190032(Continuation<? super C190032> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190032 c190032 = new C190032(continuation);
            c190032.L$0 = obj;
            return c190032;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountSelectionDataState accountSelectionDataState, Continuation<? super AccountSelectionDataState> continuation) {
            return ((C190032) create(accountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountSelectionDataState.copy$default((AccountSelectionDataState) this.L$0, null, null, null, false, null, null, 46, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadData(Continuation<? super Unit> continuation) {
        C190011 c190011;
        Object next;
        Object next2;
        Object next3;
        if (continuation instanceof C190011) {
            c190011 = (C190011) continuation;
            int i = c190011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c190011.label = i - Integer.MIN_VALUE;
            } else {
                c190011 = new C190011(continuation);
            }
        }
        Object objGetEligibleAccounts = c190011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c190011.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetEligibleAccounts);
                applyMutation(new C190032(null));
                InternalAssetTransfersService internalAssetTransfersService = this.internalAssetTransfersService;
                BrokerageAccountType accountTypeFilter = ((AccountSelectionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountTypeFilter();
                GetEligibleAccountsRequestDto getEligibleAccountsRequestDto = new GetEligibleAccountsRequestDto(accountTypeFilter != null ? accountTypeFilter.toBrokerageAccountTypeDto() : null);
                c190011.label = 1;
                objGetEligibleAccounts = internalAssetTransfersService.GetEligibleAccounts(getEligibleAccountsRequestDto, c190011);
                if (objGetEligibleAccounts == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetEligibleAccounts);
            }
            UiEligibleAccounts uiModel = UiEligibleAccounts2.toUiModel((GetEligibleAccountsResponseDto) objGetEligibleAccounts, this.clock);
            applyMutation(new C190043(uiModel, null));
            if (((AccountSelectionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountTypeFilter() != null) {
                Iterator<T> it = uiModel.getAccounts().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    UiIatAccount uiIatAccount = (UiIatAccount) next2;
                    if (uiIatAccount.isEligibleSource() && uiIatAccount.getBrokerageAccountType() == ((AccountSelectionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountTypeFilter()) {
                        break;
                    }
                }
                UiIatAccount uiIatAccount2 = (UiIatAccount) next2;
                if (uiIatAccount2 != null) {
                    onAccountSelected(uiIatAccount2.getRhsAccountNumber(), AccountSelectionListFragment.AccountSelectionType.SOURCE);
                }
                Iterator<T> it2 = uiModel.getAccounts().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                    UiIatAccount uiIatAccount3 = (UiIatAccount) next3;
                    String rhsAccountNumber = uiIatAccount3.getRhsAccountNumber();
                    Companion companion = INSTANCE;
                    if (Intrinsics.areEqual(rhsAccountNumber, ((AccountSelectionFragment.Args) companion.getArgs((HasSavedState) this)).getSinkRhsAccountNumber()) && uiIatAccount3.isEligibleSink() && uiIatAccount3.getBrokerageAccountType() == ((AccountSelectionFragment.Args) companion.getArgs((HasSavedState) this)).getAccountTypeFilter()) {
                        break;
                    }
                }
                UiIatAccount uiIatAccount4 = (UiIatAccount) next3;
                if (uiIatAccount4 != null) {
                    onAccountSelected(uiIatAccount4.getRhsAccountNumber(), AccountSelectionListFragment.AccountSelectionType.SINK);
                }
            } else {
                Iterator<T> it3 = uiModel.getAccounts().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    UiIatAccount uiIatAccount5 = (UiIatAccount) next;
                    if (Intrinsics.areEqual(uiIatAccount5.getRhsAccountNumber(), ((AccountSelectionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSinkRhsAccountNumber()) && uiIatAccount5.isEligibleSink()) {
                        break;
                    }
                }
                UiIatAccount uiIatAccount6 = (UiIatAccount) next;
                if (uiIatAccount6 != null) {
                    onAccountSelected(uiIatAccount6.getRhsAccountNumber(), AccountSelectionListFragment.AccountSelectionType.SINK);
                }
            }
        } catch (Throwable th) {
            if (!Throwables.isNetworkRelated(th)) {
                throw th;
            }
            applyMutation(new C1900210(th, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadData$3", m3645f = "AccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadData$3 */
    static final class C190043 extends ContinuationImpl7 implements Function2<AccountSelectionDataState, Continuation<? super AccountSelectionDataState>, Object> {
        final /* synthetic */ UiEligibleAccounts $eligibleAccounts;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C190043(UiEligibleAccounts uiEligibleAccounts, Continuation<? super C190043> continuation) {
            super(2, continuation);
            this.$eligibleAccounts = uiEligibleAccounts;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190043 c190043 = new C190043(this.$eligibleAccounts, continuation);
            c190043.L$0 = obj;
            return c190043;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountSelectionDataState accountSelectionDataState, Continuation<? super AccountSelectionDataState> continuation) {
            return ((C190043) create(accountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountSelectionDataState.copy$default((AccountSelectionDataState) this.L$0, this.$eligibleAccounts, null, null, false, null, null, 62, null);
        }
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadData$10", m3645f = "AccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo$loadData$10 */
    static final class C1900210 extends ContinuationImpl7 implements Function2<AccountSelectionDataState, Continuation<? super AccountSelectionDataState>, Object> {

        /* renamed from: $t */
        final /* synthetic */ Throwable f4230$t;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1900210(Throwable th, Continuation<? super C1900210> continuation) {
            super(2, continuation);
            this.f4230$t = th;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1900210 c1900210 = new C1900210(this.f4230$t, continuation);
            c1900210.L$0 = obj;
            return c1900210;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountSelectionDataState accountSelectionDataState, Continuation<? super AccountSelectionDataState> continuation) {
            return ((C1900210) create(accountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountSelectionDataState.copy$default((AccountSelectionDataState) this.L$0, null, null, null, false, this.f4230$t, null, 47, null);
        }
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$Companion;", "Lcom/robinhood/compose/duxo/DuxoComposableCompanion;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoComposableCompanion<AccountSelectionDuxo, AccountSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public AccountSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AccountSelectionFragment.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public AccountSelectionFragment.Args getArgs(AccountSelectionDuxo accountSelectionDuxo) {
            return (AccountSelectionFragment.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, accountSelectionDuxo);
        }
    }
}
