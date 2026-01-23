package com.truelayer.payments.p419ui.screens.providerselection;

import androidx.lifecycle.ViewModel2;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.payments.Beneficiary;
import com.truelayer.payments.core.domain.payments.Branch;
import com.truelayer.payments.core.domain.payments.PaymentMethod;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.ProviderScheme;
import com.truelayer.payments.core.domain.payments.ProviderScheme3;
import com.truelayer.payments.core.domain.payments.ProviderSelection;
import com.truelayer.payments.core.logger.Logger6;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.store.CountryStore;
import com.truelayer.payments.core.store.Store;
import com.truelayer.payments.p419ui.FeatureFlags;
import com.truelayer.payments.p419ui.FeatureFlags2;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.models.Country;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ProviderSelectionViewModel.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\u0006\u0010\u0015\u001a\u00020\u0011J\u0014\u0010\u0016\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000fH\u0010¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fJ \u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020\u000fJ\u0015\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u001cH\u0010¢\u0006\u0002\b%J\r\u0010&\u001a\u00020\u0011H\u0010¢\u0006\u0002\b'J\b\u0010(\u001a\u00020\u0011H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewModel;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewModelBase;", WebsocketGatewayConstants.DATA_KEY, "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewData;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "api", "Lcom/truelayer/payments/core/network/Network;", "featureFlags", "Lcom/truelayer/payments/ui/FeatureFlags;", "(Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewData;Lcom/truelayer/payments/core/store/Store;Lcom/truelayer/payments/core/network/Network;Lcom/truelayer/payments/ui/FeatureFlags;)V", "screensStack", "Lkotlin/collections/ArrayDeque;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "canOfferSavingAccount", "", "onBack", "", "onAbort", "Lkotlin/Function0;", "onClearNavigationStack", "onConsent", "onRetry", "onSaveUserAccount", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "onSaveUserAccount$payments_ui_release", "onSelectBranch", "branchId", "", "onSelectCountry", PlaceTypes.COUNTRY, "Lcom/truelayer/payments/ui/models/Country;", "onSelectProvider", "providerId", "isRecommended", "onSelectSchemeId", "schemeId", "onSelectSchemeId$payments_ui_release", "onUserPrimingConfirmation", "onUserPrimingConfirmation$payments_ui_release", "process", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public class ProviderSelectionViewModel extends ProviderSelectionViewModelBase {
    public static final int $stable = 8;
    private final FeatureFlags featureFlags;
    private ArrayDeque<ProviderSelectionScreen> screensStack;
    private final Store store;

    public /* synthetic */ ProviderSelectionViewModel(ProviderSelectionViewData providerSelectionViewData, Store store, Network network, FeatureFlags featureFlags, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(providerSelectionViewData, store, (i & 4) != 0 ? TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork() : network, (i & 8) != 0 ? FeatureFlags2.INSTANCE : featureFlags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProviderSelectionViewModel(ProviderSelectionViewData data, Store store, Network api, FeatureFlags featureFlags) {
        super(data, store, api, null, 8, null);
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(featureFlags, "featureFlags");
        this.store = store;
        this.featureFlags = featureFlags;
        this.screensStack = new ArrayDeque<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), getDispatcher(), null, new C431411(null), 2, null);
    }

    /* compiled from: ProviderSelectionViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModel$1", m3645f = "ProviderSelectionViewModel.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModel$1 */
    static final class C431411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C431411(Continuation<? super C431411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProviderSelectionViewModel.this.new C431411(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C431411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ProviderSelectionScreen> screen = ProviderSelectionViewModel.this.getScreen();
                final ProviderSelectionViewModel providerSelectionViewModel = ProviderSelectionViewModel.this;
                FlowCollector<? super ProviderSelectionScreen> flowCollector = new FlowCollector() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ProviderSelectionScreen) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ProviderSelectionScreen providerSelectionScreen, Continuation<? super Unit> continuation) {
                        if (providerSelectionScreen instanceof ProviderSelectionScreen.Init) {
                            return Unit.INSTANCE;
                        }
                        ProviderSelectionScreen providerSelectionScreen2 = (ProviderSelectionScreen) providerSelectionViewModel.screensStack.lastOrNull();
                        if (providerSelectionScreen2 != null) {
                            ProviderSelectionViewModel providerSelectionViewModel2 = providerSelectionViewModel;
                            if (Intrinsics.areEqual(providerSelectionScreen2.getClass().getName(), providerSelectionScreen.getClass().getName())) {
                                Logger6.w$default(Logger6.INSTANCE, "Attempting to add a screen that is already presented. Replacing.", null, null, 6, null);
                                providerSelectionViewModel2.screensStack.removeLast();
                            }
                        }
                        providerSelectionViewModel.screensStack.addLast(providerSelectionScreen);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (screen.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionViewModelBase
    protected void process() {
        List<ProviderScheme> list;
        PaymentProvider currentProvider = getCurrentProvider();
        if (currentProvider == null) {
            prepareDataForDisplay();
            return;
        }
        Boolean isRecommendedProvider = getIsRecommendedProvider();
        boolean zBooleanValue = isRecommendedProvider != null ? isRecommendedProvider.booleanValue() : false;
        if (getWasConfirmed()) {
            Branch branch = getBranch();
            boolean zBooleanValue2 = false;
            String selectedSchemeId = getSelectedSchemeId();
            Boolean saveUserAccount = getSaveUserAccount();
            if (saveUserAccount != null) {
                zBooleanValue2 = saveUserAccount.booleanValue();
            }
            emitScreen(new ProviderSelectionScreen.Result(new ProviderSelectionResult(currentProvider, branch, zBooleanValue, selectedSchemeId, true, zBooleanValue2)));
            return;
        }
        if (getBranch() == null && !currentProvider.getBranches().isEmpty()) {
            showBranchSelection(currentProvider);
            return;
        }
        if (currentProvider.getHasUserPriming() && !Intrinsics.areEqual(getWasUserPrimed(), Boolean.TRUE)) {
            showProviderPriming(currentProvider, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModel.process.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ProviderSelectionViewModel.this.onUserPrimingConfirmation$payments_ui_release();
                }
            });
            return;
        }
        List<ProviderScheme> availableSchemes = getData().getAvailableSchemes();
        if (availableSchemes == null) {
            availableSchemes = currentProvider.getSchemes();
        }
        if (getSelectedSchemeId() == null && getData().getAllowUserSelectedScheme() && (list = availableSchemes) != null && !list.isEmpty()) {
            showSchemeSelection(ProviderScheme3.toSchemeIdList(availableSchemes), new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModel.process.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ProviderSelectionViewModel.this.onSelectSchemeId$payments_ui_release(it);
                }
            });
        } else {
            showConfirmation();
        }
    }

    public final void onBack(Function0<Unit> onAbort) {
        Intrinsics.checkNotNullParameter(onAbort, "onAbort");
        if (this.screensStack.size() <= 1) {
            onAbort.invoke();
        } else {
            clearScreenData(this.screensStack.removeLast());
            emitScreen(clearScreenData(this.screensStack.removeLast()));
        }
    }

    public final void onSelectProvider(String providerId, String branchId, boolean isRecommended) {
        Object next;
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        Iterator<T> it = getData().getProviders().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((PaymentProvider) next).getId(), providerId)) {
                    break;
                }
            }
        }
        setCurrentProvider((PaymentProvider) next);
        setRecommendedProvider(Boolean.valueOf(isRecommended));
        PaymentProvider currentProvider = getCurrentProvider();
        if (currentProvider == null) {
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.WTF(null, "Selected provider id not present in viewModel.providers", ArraysKt.contentDeepToString(new Throwable().getStackTrace()), null, null, null, 57, null));
        }
        if (getSaveUserAccount() == null && canOfferSavingAccount() && currentProvider != null) {
            showSaveUserAccountDialog(currentProvider);
        } else if (branchId != null) {
            onSelectBranch(branchId);
        } else {
            process();
        }
    }

    private final boolean canOfferSavingAccount() {
        boolean z = getData().getPayment().getPaymentMethod().getProviderSelection() instanceof ProviderSelection.UserSelected;
        PaymentMethod paymentMethod = getData().getPayment().getPaymentMethod();
        PaymentMethod.BankTransfer bankTransfer = paymentMethod instanceof PaymentMethod.BankTransfer ? (PaymentMethod.BankTransfer) paymentMethod : null;
        return this.featureFlags.getSaveUserAccount() && z && ((bankTransfer != null ? bankTransfer.getBeneficiary() : null) instanceof Beneficiary.MerchantAccount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSelectBranch(String branchId) {
        List<Branch> branches;
        Intrinsics.checkNotNullParameter(branchId, "branchId");
        PaymentProvider currentProvider = getCurrentProvider();
        Branch branch = null;
        if (currentProvider != null && (branches = currentProvider.getBranches()) != null) {
            Iterator<T> it = branches.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((Branch) next).getId(), branchId)) {
                    branch = next;
                    break;
                }
            }
            branch = branch;
        }
        setBranch(branch);
        if (getBranch() == null) {
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.WTF(null, "Selected branch id not present in viewModel for currently selected provider.", ArraysKt.contentDeepToString(new Throwable().getStackTrace()), null, null, null, 57, null));
        }
        PaymentProvider currentProvider2 = getCurrentProvider();
        if (getSaveUserAccount() == null && this.featureFlags.getSaveUserAccount() && currentProvider2 != null) {
            showSaveUserAccountDialog(currentProvider2);
        } else {
            process();
        }
    }

    @Override // com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionViewModelBase
    public void onUserPrimingConfirmation$payments_ui_release() {
        setWasUserPrimed(Boolean.TRUE);
        process();
    }

    @Override // com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionViewModelBase
    public void onSelectSchemeId$payments_ui_release(String schemeId) {
        Intrinsics.checkNotNullParameter(schemeId, "schemeId");
        setSelectedSchemeId(schemeId);
        process();
    }

    @Override // com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionViewModelBase
    public void onSaveUserAccount$payments_ui_release(boolean save) {
        setSaveUserAccount(Boolean.valueOf(save));
        removeSaveUserAccountDialog();
        process();
    }

    @Override // com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionViewModelBase
    protected void onClearNavigationStack() {
        this.screensStack.clear();
    }

    public final void onSelectCountry(Country country) {
        Intrinsics.checkNotNullParameter(country, "country");
        setCurrentCountry(country);
        setCurrentProvider(null);
        this.screensStack.clear();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C431421(country, null), 3, null);
        process();
    }

    /* compiled from: ProviderSelectionViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModel$onSelectCountry$1", m3645f = "ProviderSelectionViewModel.kt", m3646l = {201}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModel$onSelectCountry$1 */
    static final class C431421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Country $country;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C431421(Country country, Continuation<? super C431421> continuation) {
            super(2, continuation);
            this.$country = country;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProviderSelectionViewModel.this.new C431421(this.$country, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C431421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CountryStore country = ProviderSelectionViewModel.this.store.getCountry();
                String countryCode = this.$country.getCountryCode();
                this.label = 1;
                if (country.saveLastUsed(countryCode, this) == coroutine_suspended) {
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

    public final void onConsent() {
        setWasConfirmed(true);
        process();
    }

    public final void onRetry(Function0<Unit> onAbort) {
        Intrinsics.checkNotNullParameter(onAbort, "onAbort");
        onBack(onAbort);
    }
}
