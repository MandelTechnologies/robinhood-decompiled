package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import android.content.Context;
import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaPromotion;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.moneymovement.checkoutflow.MicrogramConstants;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.common.TransferAmountEntryLayout;
import com.robinhood.android.transfers.p271ui.max.i18n.MoneyInputConsumer;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.AccountSelectionCallbacks;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2Event;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2Fragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.lib.transfers.contracts.TransferLimitsService;
import com.robinhood.lib.transfers.contracts.models.TransferAccountType;
import com.robinhood.lib.transfers.contracts.models.TransferLimits;
import com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.transfer.ApiSuggestedAmountsResponse;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.store.isa.IsaPromotionStore;
import com.robinhood.transfers.accounts.contracts.AccountSelectionBottomSheetService;
import com.robinhood.transfers.accounts.contracts.AccountSelectionResolver;
import com.robinhood.transfers.accounts.contracts.model.IraTransferType;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.service.ManagedServiceExtension2;

/* compiled from: InternationalTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ?2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001?Bk\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010'\u001a\u00020(H\u0016J\u000e\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020(J\u0006\u0010-\u001a\u00020(J\u0006\u0010.\u001a\u00020(J\u0006\u0010/\u001a\u00020(J\u0006\u00100\u001a\u00020(J\u0010\u00101\u001a\u00020(2\u0006\u00102\u001a\u000203H\u0002J\u001e\u00104\u001a\u00020(2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0096@¢\u0006\u0002\u00109J\u000e\u0010:\u001a\u00020(H\u0096@¢\u0006\u0002\u0010;J\u000e\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020>R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Duxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/AccountSelectionCallbacks;", "stateProvider", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2StateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transferRequestCreator", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator;", "suggestedAmountsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;", "isaPromotionStore", "Lcom/robinhood/store/isa/IsaPromotionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2StateProvider;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator;Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;Lcom/robinhood/store/isa/IsaPromotionStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "inputKeyEventConsumer", "Lcom/robinhood/android/transfers/ui/max/i18n/MoneyInputConsumer;", "accountSelectionService", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionBottomSheetService;", "onCreate", "", "onNumpadKeyPress", "keyEvent", "Landroid/view/KeyEvent;", "onReviewClick", "onSubmitClick", "onBackClick", "onSourceAccountClick", "onSinkAccountClick", "launchAccountSelection", "accountDirection", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "accountSelected", "transferAccountId", "", "direction", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "(Ljava/lang/String;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSuggestedDepositAmountClick", "amount", "Lcom/robinhood/models/util/Money;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InternationalTransferV2Duxo extends BaseDuxo3<InternationalTransferV2DataState, InternationalTransferV2ViewState, InternationalTransferV2Event> implements HasSavedState, AccountSelectionCallbacks {
    private final AccountSelectionBottomSheetService accountSelectionService;
    private final MoneyInputConsumer inputKeyEventConsumer;
    private final IsaPromotionStore isaPromotionStore;
    private final SavedStateHandle savedStateHandle;
    private final SuggestedAmountsStore suggestedAmountsStore;
    private final TransferAccountStore transferAccountStore;
    private final TransferRequestCreator transferRequestCreator;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InternationalTransferV2Duxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferAmountEntryLayout.values().length];
            try {
                iArr[TransferAmountEntryLayout.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAmountEntryLayout.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransferAccountDirection.values().length];
            try {
                iArr2[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.transfers.p271ui.max.i18n.mcw.AccountSelectionCallbacks, com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchDebitCardLinking(Continuation<? super Unit> continuation) {
        return AccountSelectionCallbacks.DefaultImpls.launchDebitCardLinking(this, continuation);
    }

    @Override // com.robinhood.android.transfers.p271ui.max.i18n.mcw.AccountSelectionCallbacks, com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchIraMatchInfo(Continuation<? super Unit> continuation) {
        return AccountSelectionCallbacks.DefaultImpls.launchIraMatchInfo(this, continuation);
    }

    @Override // com.robinhood.android.transfers.p271ui.max.i18n.mcw.AccountSelectionCallbacks, com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchIraQuestionnaire(IraTransferType iraTransferType, String str, String str2, Continuation<? super Unit> continuation) {
        return AccountSelectionCallbacks.DefaultImpls.launchIraQuestionnaire(this, iraTransferType, str, str2, continuation);
    }

    @Override // com.robinhood.android.transfers.p271ui.max.i18n.mcw.AccountSelectionCallbacks, com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object onAccountRowAppear(String str, TransferAccountType transferAccountType, TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) {
        return AccountSelectionCallbacks.DefaultImpls.onAccountRowAppear(this, str, transferAccountType, transferAccountDirection, continuation);
    }

    @Override // com.robinhood.android.transfers.p271ui.max.i18n.mcw.AccountSelectionCallbacks, com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object onBottomSheetAppear(TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) {
        return AccountSelectionCallbacks.DefaultImpls.onBottomSheetAppear(this, transferAccountDirection, continuation);
    }

    @Override // com.robinhood.android.transfers.p271ui.max.i18n.mcw.AccountSelectionCallbacks, com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object sendWireTransfer(Continuation<? super Unit> continuation) {
        return AccountSelectionCallbacks.DefaultImpls.sendWireTransfer(this, continuation);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternationalTransferV2Duxo(InternationalTransferV2StateProvider stateProvider, DuxoBundle duxoBundle, MicrogramManager microgramManager, LazyMoshi moshi, Navigator navigator, Context context, TransferAccountStore transferAccountStore, TransfersBonfireApi transfersBonfireApi, TransferRequestCreator transferRequestCreator, SuggestedAmountsStore suggestedAmountsStore, IsaPromotionStore isaPromotionStore, SavedStateHandle savedStateHandle) {
        super(InternationalTransferV2DataState.INSTANCE.createInitial((InternationalTransferV2Fragment.Args) INSTANCE.getArgs(savedStateHandle)), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(transferRequestCreator, "transferRequestCreator");
        Intrinsics.checkNotNullParameter(suggestedAmountsStore, "suggestedAmountsStore");
        Intrinsics.checkNotNullParameter(isaPromotionStore, "isaPromotionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.transferAccountStore = transferAccountStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.transferRequestCreator = transferRequestCreator;
        this.suggestedAmountsStore = suggestedAmountsStore;
        this.isaPromotionStore = isaPromotionStore;
        this.savedStateHandle = savedStateHandle;
        this.inputKeyEventConsumer = new MoneyInputConsumer(new BigDecimal(10000000), true);
        this.accountSelectionService = (AccountSelectionBottomSheetService) RealMicrogramUiLaunchService2.getComponentWithUiLaunch(microgramManager, new RemoteMicrogramApplication(MicrogramConstants.PAYMENT_PREFERENCE_MICROGRAM_APP, null, 2, null), getLifecycleScope(), moshi, MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(AccountSelectionResolver.class), this), ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(TransferLimitsService.class), new TransferLimitsService() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$accountSelectionService$1
            @Override // com.robinhood.lib.transfers.contracts.TransferLimitsService
            public Object getTransferLimits(Continuation<? super List<TransferLimits>> continuation) {
                return CollectionsKt.emptyList();
            }
        }), RealMicrogramDeeplinkService.INSTANCE.getExtension(context, navigator)), new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferV2Duxo.accountSelectionService$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferV2Duxo.accountSelectionService$lambda$1(this.f$0, (DialogFragmentKey) obj);
            }
        }).getServiceLocator().getClient(AccountSelectionBottomSheetService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountSelectionService$lambda$0(FragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw new IllegalStateException("doesn't launch UI.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountSelectionService$lambda$1(InternationalTransferV2Duxo internationalTransferV2Duxo, DialogFragmentKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        internationalTransferV2Duxo.submit(new InternationalTransferV2Event.LaunchDialog(key));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.transferAccountStore.fetchIfStaleThenStream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferV2Duxo.onCreate$lambda$2(this.f$0, (List) obj);
            }
        });
        getLifecycleScope().launchWhenStarted(new C308112(null));
        Companion companion = INSTANCE;
        if (((InternationalTransferV2Fragment.Args) companion.getArgs((HasSavedState) this)).getTransferDirection() == TransferDirectionV2.DEPOSIT) {
            getLifecycleScope().launchWhenStarted(new C308123(null));
        }
        if (((InternationalTransferV2Fragment.Args) companion.getArgs((HasSavedState) this)).getEntryPoint() == MAXTransferContext.EntryPoint.ISA_CONTRIBUTION) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C308134(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(InternationalTransferV2Duxo internationalTransferV2Duxo, List accounts2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        internationalTransferV2Duxo.applyMutation(new InternationalTransferV2Duxo$onCreate$1$1(accounts2, null));
        return Unit.INSTANCE;
    }

    /* compiled from: InternationalTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$2", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {125}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$2 */
    static final class C308112 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C308112(Continuation<? super C308112> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransferV2Duxo.this.new C308112(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C308112) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<InternationalTransferV2ViewState> stateFlow = InternationalTransferV2Duxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<ApiTransferSummaryRequest>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$2$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ApiTransferSummaryRequest> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$2$invokeSuspend$$inlined$map$1$2", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                ApiTransferSummaryRequest transferSummaryRequest = ((InternationalTransferV2ViewState) obj).getTransferSummaryRequest();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(transferSummaryRequest, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }), new C30806x4c42ac8e(null, InternationalTransferV2Duxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(InternationalTransferV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: InternationalTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$2$3", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<List<? extends UIComponent<? extends GenericAction>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternationalTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(InternationalTransferV2Duxo internationalTransferV2Duxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = internationalTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends UIComponent<? extends GenericAction>> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternationalTransferV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$2$3$1", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState>, Object> {
                final /* synthetic */ List<UIComponent<GenericAction>> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(List<? extends UIComponent<? extends GenericAction>> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternationalTransferV2DataState internationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState> continuation) {
                    return ((AnonymousClass1) create(internationalTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternationalTransferV2DataState.copy$default((InternationalTransferV2DataState) this.L$0, null, null, null, null, null, null, null, null, false, this.$it, null, false, null, 7679, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: InternationalTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$3", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {136}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$3 */
    static final class C308123 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C308123(Continuation<? super C308123> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransferV2Duxo.this.new C308123(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C308123) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = SuggestedAmountsStore.get$default(InternationalTransferV2Duxo.this.suggestedAmountsStore, false, KaizenExperiment.VARIATION_CONTROL, 1, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternationalTransferV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InternationalTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/bonfire/transfer/ApiSuggestedAmountsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$3$1", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ApiSuggestedAmountsResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternationalTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternationalTransferV2Duxo internationalTransferV2Duxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internationalTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiSuggestedAmountsResponse apiSuggestedAmountsResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(apiSuggestedAmountsResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternationalTransferV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$3$1$1", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506171 extends ContinuationImpl7 implements Function2<InternationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState>, Object> {
                final /* synthetic */ ApiSuggestedAmountsResponse $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506171(ApiSuggestedAmountsResponse apiSuggestedAmountsResponse, Continuation<? super C506171> continuation) {
                    super(2, continuation);
                    this.$it = apiSuggestedAmountsResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506171 c506171 = new C506171(this.$it, continuation);
                    c506171.L$0 = obj;
                    return c506171;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternationalTransferV2DataState internationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState> continuation) {
                    return ((C506171) create(internationalTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternationalTransferV2DataState.copy$default((InternationalTransferV2DataState) this.L$0, null, null, null, null, null, null, null, null, false, null, this.$it.getSuggested_deposit_amounts(), false, null, 7167, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506171((ApiSuggestedAmountsResponse) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: InternationalTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$4", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$4 */
    static final class C308134 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C308134(Continuation<? super C308134> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransferV2Duxo.this.new C308134(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C308134) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<IsaPromotion> flowStreamPromotion = InternationalTransferV2Duxo.this.isaPromotionStore.streamPromotion();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternationalTransferV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamPromotion, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InternationalTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "promotion", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$4$1", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IsaPromotion, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternationalTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternationalTransferV2Duxo internationalTransferV2Duxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internationalTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IsaPromotion isaPromotion, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(isaPromotion, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternationalTransferV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$4$1$1", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506181 extends ContinuationImpl7 implements Function2<InternationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState>, Object> {
                final /* synthetic */ IsaPromotion $promotion;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506181(IsaPromotion isaPromotion, Continuation<? super C506181> continuation) {
                    super(2, continuation);
                    this.$promotion = isaPromotion;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506181 c506181 = new C506181(this.$promotion, continuation);
                    c506181.L$0 = obj;
                    return c506181;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternationalTransferV2DataState internationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState> continuation) {
                    return ((C506181) create(internationalTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternationalTransferV2DataState.copy$default((InternationalTransferV2DataState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, false, this.$promotion, 4095, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506181((IsaPromotion) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: InternationalTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onNumpadKeyPress$1", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onNumpadKeyPress$1 */
    static final class C308141 extends ContinuationImpl7 implements Function2<InternationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C308141(KeyEvent keyEvent, Continuation<? super C308141> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308141 c308141 = InternationalTransferV2Duxo.this.new C308141(this.$keyEvent, continuation);
            c308141.L$0 = obj;
            return c308141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferV2DataState internationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState> continuation) {
            return ((C308141) create(internationalTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                InternationalTransferV2DataState internationalTransferV2DataState = (InternationalTransferV2DataState) this.L$0;
                MoneyInputConsumer moneyInputConsumer = InternationalTransferV2Duxo.this.inputKeyEventConsumer;
                BigDecimal decimalValue = internationalTransferV2DataState.getAmount().getDecimalValue();
                char[] charArray = internationalTransferV2DataState.getAmountInput().toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                InputKeyEventConsumer.InputState<BigDecimal> inputStateConsume = moneyInputConsumer.consume(new InputKeyEventConsumer.InputState(decimalValue, charArray), this.$keyEvent);
                return InternationalTransferV2DataState.copy$default(internationalTransferV2DataState, Money.copy$default(internationalTransferV2DataState.getAmount(), null, inputStateConsume.component1(), 1, null), new String(inputStateConsume.getInput()), null, null, null, null, null, null, false, null, null, false, null, 8188, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onNumpadKeyPress(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C308141(keyEvent, null));
    }

    public final void onReviewClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferV2Duxo.onReviewClick$lambda$3(this.f$0, (InternationalTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onReviewClick$lambda$3(InternationalTransferV2Duxo internationalTransferV2Duxo, InternationalTransferV2DataState state) {
        List<TransferAccount> transferAccounts;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getTransferDirection() == TransferDirectionV2.WITHDRAW && (transferAccounts = state.getTransferAccounts()) != null && !InternationalTransferV2StateProvider2.getHasLinkedExternalAccount(transferAccounts)) {
            int i = C30065R.id.dialog_id_uk_withdrawal_no_external_account_selected;
            StringResource.Companion companion = StringResource.INSTANCE;
            internationalTransferV2Duxo.submit(new InternationalTransferV2Event.ShowAlert(i, companion.invoke(C30065R.string.uk_withdrawal_no_bank_account_selected_error_title, new Object[0]), companion.invoke(C30065R.string.uk_withdrawal_no_bank_account_selected_error_text, new Object[0])));
            return Unit.INSTANCE;
        }
        internationalTransferV2Duxo.applyMutation(new InternationalTransferV2Duxo$onReviewClick$1$1(null));
        return Unit.INSTANCE;
    }

    public final void onSubmitClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferV2Duxo.onSubmitClick$lambda$4(this.f$0, (InternationalTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSubmitClick$lambda$4(InternationalTransferV2Duxo internationalTransferV2Duxo, InternationalTransferV2DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        internationalTransferV2Duxo.applyMutation(new InternationalTransferV2Duxo$onSubmitClick$1$1(null));
        BuildersKt__Builders_commonKt.launch$default(internationalTransferV2Duxo.getLifecycleScope(), null, null, new InternationalTransferV2Duxo$onSubmitClick$1$2(internationalTransferV2Duxo, state, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void onBackClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferV2Duxo.onBackClick$lambda$5(this.f$0, (InternationalTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackClick$lambda$5(InternationalTransferV2Duxo internationalTransferV2Duxo, InternationalTransferV2DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = WhenMappings.$EnumSwitchMapping$0[state.getAmountEntryState().ordinal()];
        if (i == 1) {
            internationalTransferV2Duxo.submit(InternationalTransferV2Event.Exit.INSTANCE);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            internationalTransferV2Duxo.applyMutation(new InternationalTransferV2Duxo$onBackClick$1$1(null));
        }
        return Unit.INSTANCE;
    }

    public final void onSourceAccountClick() {
        launchAccountSelection(com.robinhood.android.transfers.contracts.TransferAccountDirection.SOURCE);
    }

    public final void onSinkAccountClick() {
        launchAccountSelection(com.robinhood.android.transfers.contracts.TransferAccountDirection.SINK);
    }

    private final void launchAccountSelection(final com.robinhood.android.transfers.contracts.TransferAccountDirection accountDirection) {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferV2Duxo.launchAccountSelection$lambda$6(this.f$0, accountDirection, (InternationalTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchAccountSelection$lambda$6(InternationalTransferV2Duxo internationalTransferV2Duxo, com.robinhood.android.transfers.contracts.TransferAccountDirection transferAccountDirection, InternationalTransferV2DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BuildersKt__Builders_commonKt.launch$default(internationalTransferV2Duxo.getLifecycleScope(), null, null, new InternationalTransferV2Duxo$launchAccountSelection$1$1(internationalTransferV2Duxo, state, transferAccountDirection, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object accountSelected(String str, TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) {
        int i = WhenMappings.$EnumSwitchMapping$1[transferAccountDirection.ordinal()];
        if (i == 1) {
            applyMutation(new C308082(str, null));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new C308093(str, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InternationalTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$accountSelected$2", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$accountSelected$2 */
    static final class C308082 extends ContinuationImpl7 implements Function2<InternationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState>, Object> {
        final /* synthetic */ String $transferAccountId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C308082(String str, Continuation<? super C308082> continuation) {
            super(2, continuation);
            this.$transferAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308082 c308082 = new C308082(this.$transferAccountId, continuation);
            c308082.L$0 = obj;
            return c308082;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferV2DataState internationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState> continuation) {
            return ((C308082) create(internationalTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternationalTransferV2DataState.copy$default((InternationalTransferV2DataState) this.L$0, null, null, null, null, null, null, this.$transferAccountId, null, false, null, null, false, null, 7871, null);
        }
    }

    /* compiled from: InternationalTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$accountSelected$3", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$accountSelected$3 */
    static final class C308093 extends ContinuationImpl7 implements Function2<InternationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState>, Object> {
        final /* synthetic */ String $transferAccountId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C308093(String str, Continuation<? super C308093> continuation) {
            super(2, continuation);
            this.$transferAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308093 c308093 = new C308093(this.$transferAccountId, continuation);
            c308093.L$0 = obj;
            return c308093;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferV2DataState internationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState> continuation) {
            return ((C308093) create(internationalTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternationalTransferV2DataState.copy$default((InternationalTransferV2DataState) this.L$0, null, null, null, null, null, null, null, this.$transferAccountId, false, null, null, false, null, 7807, null);
        }
    }

    /* compiled from: InternationalTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$addNewAccount$2", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$addNewAccount$2 */
    static final class C308102 extends ContinuationImpl7 implements Function2<InternationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C308102(Continuation<? super C308102> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308102 c308102 = new C308102(continuation);
            c308102.L$0 = obj;
            return c308102;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferV2DataState internationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState> continuation) {
            return ((C308102) create(internationalTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternationalTransferV2DataState.copy$default((InternationalTransferV2DataState) this.L$0, null, null, null, null, null, null, null, null, true, null, null, false, null, 7935, null);
        }
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object addNewAccount(Continuation<? super Unit> continuation) {
        applyMutation(new C308102(null));
        return Unit.INSTANCE;
    }

    /* compiled from: InternationalTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onSuggestedDepositAmountClick$1", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onSuggestedDepositAmountClick$1 */
    static final class C308151 extends ContinuationImpl7 implements Function2<InternationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState>, Object> {
        final /* synthetic */ Money $amount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C308151(Money money, Continuation<? super C308151> continuation) {
            super(2, continuation);
            this.$amount = money;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308151 c308151 = new C308151(this.$amount, continuation);
            c308151.L$0 = obj;
            return c308151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferV2DataState internationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState> continuation) {
            return ((C308151) create(internationalTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InternationalTransferV2DataState internationalTransferV2DataState = (InternationalTransferV2DataState) this.L$0;
            Money money = this.$amount;
            return InternationalTransferV2DataState.copy$default(internationalTransferV2DataState, money, Money.format$default(money, null, false, null, false, 0, null, false, null, true, false, 767, null), TransferAmountEntryLayout.REVIEW, null, null, null, null, null, false, null, null, false, null, 8184, null);
        }
    }

    public final void onSuggestedDepositAmountClick(Money amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new C308151(amount, null));
    }

    /* compiled from: InternationalTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Duxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Duxo;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Fragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InternationalTransferV2Duxo, InternationalTransferV2Fragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternationalTransferV2Fragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (InternationalTransferV2Fragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternationalTransferV2Fragment.Args getArgs(InternationalTransferV2Duxo internationalTransferV2Duxo) {
            return (InternationalTransferV2Fragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, internationalTransferV2Duxo);
        }
    }
}
