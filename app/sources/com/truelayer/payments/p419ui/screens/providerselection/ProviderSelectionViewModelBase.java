package com.truelayer.payments.p419ui.screens.providerselection;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import com.truelayer.payments.core.domain.experience.scheme.SchemeAutoSubmit;
import com.truelayer.payments.core.domain.experience.scheme.SchemeSelection;
import com.truelayer.payments.core.domain.experience.scheme.SchemeSelectionSelect;
import com.truelayer.payments.core.domain.payments.Branch;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.logger.Logger6;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.network.experience.TranslationProvider;
import com.truelayer.payments.core.store.Store;
import com.truelayer.payments.core.utils.ErrorUtils2;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.models.Country;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionScreen;
import com.truelayer.payments.p419ui.screens.providerselection.components.SaveAccountDetailsDialogViewData;
import com.truelayer.payments.p419ui.utils.FlagIconUtils;
import com.truelayer.payments.p419ui.utils.StringExtensions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: ProviderSelectionViewModelBase.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000 \u0086\u00012\u00020\u0001:\u0002\u0086\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u0019072\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@07H\u0002J\u0010\u0010Z\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u000fH\u0004J\u0010\u0010[\u001a\u00020\\2\u0006\u0010E\u001a\u00020\u000fH\u0004J\u0019\u0010]\u001a\u00020\\2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0002\b^J\r\u0010_\u001a\u00020\\H\u0000¢\u0006\u0002\b`J\b\u0010a\u001a\u00020\\H$J\u0015\u0010b\u001a\u00020\\2\u0006\u0010c\u001a\u00020\rH ¢\u0006\u0002\bdJ\u0015\u0010e\u001a\u00020\\2\u0006\u0010f\u001a\u00020IH ¢\u0006\u0002\bgJ\r\u0010h\u001a\u00020\\H ¢\u0006\u0002\biJ\b\u0010j\u001a\u00020\\H\u0004J\b\u0010k\u001a\u00020\\H$J\u0006\u0010l\u001a\u00020\\J\"\u0010m\u001a\u0004\u0018\u00010\u00192\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u0019072\b\b\u0002\u0010o\u001a\u00020pH\u0002J\u001b\u0010q\u001a\u00020\\2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001f07H\u0000¢\u0006\u0002\brJ\u0010\u0010s\u001a\u00020\\2\u0006\u0010t\u001a\u00020\u001fH\u0004J\b\u0010u\u001a\u00020\\H\u0004J\u0006\u0010v\u001a\u00020\\J\u001e\u0010w\u001a\u00020\\2\u0006\u0010t\u001a\u00020\u001f2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\\0yH\u0004J\u0010\u0010z\u001a\u00020\\2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\r\u0010{\u001a\u00020\\H\u0000¢\u0006\u0002\b|J\u000e\u0010N\u001a\u00020\\2\u0006\u0010t\u001a\u00020\u001fJ<\u0010}\u001a\u00020\\2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020I072$\u0010\u007f\u001a \u0012\u0015\u0012\u00130I¢\u0006\u000e\b\u0081\u0001\u0012\t\b\u0082\u0001\u0012\u0004\b\b(f\u0012\u0004\u0012\u00020\\0\u0080\u0001H\u0004J\u0013\u0010\u0083\u0001\u001a\u00020\\2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010,\u001a\b\u0012\u0004\u0012\u00020\r0-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u001907X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00108\u001a\u0004\u0018\u000109X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001f07X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020@07X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020@07X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010B\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\bC\u00102\"\u0004\bD\u00104R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u000f0-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010.\"\u0004\bG\u00100R\u001c\u0010H\u001a\u0004\u0018\u00010IX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010.\"\u0004\bP\u00100R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u00020\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001e\u0010V\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\bW\u00102\"\u0004\bX\u00104¨\u0006\u0087\u0001"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewModelBase;", "Landroidx/lifecycle/ViewModel;", WebsocketGatewayConstants.DATA_KEY, "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewData;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "api", "Lcom/truelayer/payments/core/network/Network;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewData;Lcom/truelayer/payments/core/store/Store;Lcom/truelayer/payments/core/network/Network;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_screen", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "_showSaveUserAccountDialog", "Lcom/truelayer/payments/ui/screens/providerselection/components/SaveAccountDetailsDialogViewData;", "branch", "Lcom/truelayer/payments/core/domain/payments/Branch;", "getBranch", "()Lcom/truelayer/payments/core/domain/payments/Branch;", "setBranch", "(Lcom/truelayer/payments/core/domain/payments/Branch;)V", "currentCountry", "Lcom/truelayer/payments/ui/models/Country;", "getCurrentCountry", "()Lcom/truelayer/payments/ui/models/Country;", "setCurrentCountry", "(Lcom/truelayer/payments/ui/models/Country;)V", "value", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "currentProvider", "getCurrentProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "setCurrentProvider", "(Lcom/truelayer/payments/core/domain/payments/PaymentProvider;)V", "getData", "()Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewData;", "setData", "(Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewData;)V", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "isInitialized", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "setLoading", "(Lkotlinx/coroutines/flow/StateFlow;)V", "isRecommendedProvider", "()Ljava/lang/Boolean;", "setRecommendedProvider", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "listOfCountries", "", "priming", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data;", "getPriming", "()Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data;", "setPriming", "(Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data;)V", "providers", "providersViewData", "Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "recommendedProviders", "saveUserAccount", "getSaveUserAccount", "setSaveUserAccount", "screen", "getScreen", "setScreen", "selectedSchemeId", "", "getSelectedSchemeId", "()Ljava/lang/String;", "setSelectedSchemeId", "(Ljava/lang/String;)V", "showSaveUserAccountDialog", "getShowSaveUserAccountDialog", "setShowSaveUserAccountDialog", "wasConfirmed", "getWasConfirmed", "()Z", "setWasConfirmed", "(Z)V", "wasUserPrimed", "getWasUserPrimed", "setWasUserPrimed", "buildListOfCountries", "clearScreenData", "emitScreen", "", "initialize", "initialize$payments_ui_release", "notifyChange", "notifyChange$payments_ui_release", "onClearNavigationStack", "onSaveUserAccount", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "onSaveUserAccount$payments_ui_release", "onSelectSchemeId", "schemeId", "onSelectSchemeId$payments_ui_release", "onUserPrimingConfirmation", "onUserPrimingConfirmation$payments_ui_release", "prepareDataForDisplay", "process", "removeSaveUserAccountDialog", "selectDefaultCountry", "countries", "locale", "Ljava/util/Locale;", "setProviders", "setProviders$payments_ui_release", "showBranchSelection", "provider", "showConfirmation", "showCountrySelection", "showProviderPriming", "confirmUserPrimed", "Lkotlin/Function0;", "showProviderSelection", "showProviderSelectionWithCurrentCountry", "showProviderSelectionWithCurrentCountry$payments_ui_release", "showSchemeSelection", "schemeIds", "confirmSelection", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "showSchemeSelectionScreen", "selection", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelectionSelect;", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public abstract class ProviderSelectionViewModelBase extends ViewModel {
    private StateFlow2<Boolean> _isLoading;
    private StateFlow2<ProviderSelectionScreen> _screen;
    private StateFlow2<SaveAccountDetailsDialogViewData> _showSaveUserAccountDialog;
    private final Network api;
    private Branch branch;
    private Country currentCountry;
    private PaymentProvider currentProvider;
    private ProviderSelectionViewData data;
    private final CoroutineDispatcher dispatcher;
    private boolean isInitialized;
    private StateFlow<Boolean> isLoading;
    private Boolean isRecommendedProvider;
    private List<Country> listOfCountries;
    private UserPriming.Data priming;
    private List<PaymentProvider> providers;
    private List<PaymentProviderViewData> providersViewData;
    private List<PaymentProviderViewData> recommendedProviders;
    private Boolean saveUserAccount;
    private StateFlow<? extends ProviderSelectionScreen> screen;
    private String selectedSchemeId;
    private StateFlow<SaveAccountDetailsDialogViewData> showSaveUserAccountDialog;
    private final Store store;
    private boolean wasConfirmed;
    private Boolean wasUserPrimed;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    protected abstract void onClearNavigationStack();

    public abstract void onSaveUserAccount$payments_ui_release(boolean save);

    public abstract void onSelectSchemeId$payments_ui_release(String schemeId);

    public abstract void onUserPrimingConfirmation$payments_ui_release();

    protected abstract void process();

    protected final ProviderSelectionViewData getData() {
        return this.data;
    }

    protected final void setData(ProviderSelectionViewData providerSelectionViewData) {
        Intrinsics.checkNotNullParameter(providerSelectionViewData, "<set-?>");
        this.data = providerSelectionViewData;
    }

    public /* synthetic */ ProviderSelectionViewModelBase(ProviderSelectionViewData providerSelectionViewData, Store store, Network network, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(providerSelectionViewData, store, (i & 4) != 0 ? TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork() : network, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    protected final CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public ProviderSelectionViewModelBase(ProviderSelectionViewData data, Store store, Network api, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.data = data;
        this.store = store;
        this.api = api;
        this.dispatcher = dispatcher;
        this.providersViewData = CollectionsKt.emptyList();
        this.providers = CollectionsKt.toList(this.data.getProviders());
        List<PaymentProvider> recommendedProviders = this.data.getRecommendedProviders();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(recommendedProviders, 10));
        Iterator<T> it = recommendedProviders.iterator();
        while (it.hasNext()) {
            arrayList.add(PaymentProviderViewData3.intoViewData((PaymentProvider) it.next(), true));
        }
        this.recommendedProviders = arrayList;
        this.listOfCountries = CollectionsKt.emptyList();
        this._screen = StateFlow4.MutableStateFlow(ProviderSelectionScreen.Init.INSTANCE);
        this._isLoading = StateFlow4.MutableStateFlow(Boolean.FALSE);
        StateFlow2<SaveAccountDetailsDialogViewData> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
        this._showSaveUserAccountDialog = stateFlow2MutableStateFlow;
        this.screen = this._screen;
        this.isLoading = this._isLoading;
        this.showSaveUserAccountDialog = stateFlow2MutableStateFlow;
    }

    public final StateFlow<ProviderSelectionScreen> getScreen() {
        return this.screen;
    }

    public final void setScreen(StateFlow<? extends ProviderSelectionScreen> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "<set-?>");
        this.screen = stateFlow;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final void setLoading(StateFlow<Boolean> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "<set-?>");
        this.isLoading = stateFlow;
    }

    public final StateFlow<SaveAccountDetailsDialogViewData> getShowSaveUserAccountDialog() {
        return this.showSaveUserAccountDialog;
    }

    public final void setShowSaveUserAccountDialog(StateFlow<SaveAccountDetailsDialogViewData> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "<set-?>");
        this.showSaveUserAccountDialog = stateFlow;
    }

    protected final UserPriming.Data getPriming() {
        return this.priming;
    }

    protected final void setPriming(UserPriming.Data data) {
        this.priming = data;
    }

    protected final PaymentProvider getCurrentProvider() {
        return this.currentProvider;
    }

    protected final void setCurrentProvider(PaymentProvider paymentProvider) {
        TrueLayerAnalytics.Companion companion = TrueLayerAnalytics.INSTANCE;
        TrueLayerAnalytics.AnalyticsContext analyticsContext = companion.getAnalyticsContext();
        if (analyticsContext != null) {
            analyticsContext.setProviderId(paymentProvider != null ? paymentProvider.getId() : null);
        }
        TrueLayerAnalytics.AnalyticsContext analyticsContext2 = companion.getAnalyticsContext();
        if (analyticsContext2 != null) {
            analyticsContext2.setProviderCountryCode(paymentProvider != null ? paymentProvider.getCountryCode() : null);
        }
        this.currentProvider = paymentProvider;
    }

    protected final Country getCurrentCountry() {
        return this.currentCountry;
    }

    protected final void setCurrentCountry(Country country) {
        this.currentCountry = country;
    }

    protected final Branch getBranch() {
        return this.branch;
    }

    protected final void setBranch(Branch branch) {
        this.branch = branch;
    }

    protected final String getSelectedSchemeId() {
        return this.selectedSchemeId;
    }

    protected final void setSelectedSchemeId(String str) {
        this.selectedSchemeId = str;
    }

    /* renamed from: isRecommendedProvider, reason: from getter */
    protected final Boolean getIsRecommendedProvider() {
        return this.isRecommendedProvider;
    }

    protected final void setRecommendedProvider(Boolean bool) {
        this.isRecommendedProvider = bool;
    }

    protected final Boolean getWasUserPrimed() {
        return this.wasUserPrimed;
    }

    protected final void setWasUserPrimed(Boolean bool) {
        this.wasUserPrimed = bool;
    }

    protected final boolean getWasConfirmed() {
        return this.wasConfirmed;
    }

    protected final void setWasConfirmed(boolean z) {
        this.wasConfirmed = z;
    }

    protected final Boolean getSaveUserAccount() {
        return this.saveUserAccount;
    }

    protected final void setSaveUserAccount(Boolean bool) {
        this.saveUserAccount = bool;
    }

    protected final void emitScreen(ProviderSelectionScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this._screen.tryEmit(screen);
    }

    protected final ProviderSelectionScreen clearScreenData(ProviderSelectionScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (!(screen instanceof ProviderSelectionScreen.CountrySelection ? true : screen instanceof ProviderSelectionScreen.Error ? true : screen instanceof ProviderSelectionScreen.Result ? true : Intrinsics.areEqual(screen, ProviderSelectionScreen.Init.INSTANCE))) {
            if (screen instanceof ProviderSelectionScreen.ProviderSelection) {
                setCurrentProvider(null);
                this.branch = null;
                this.wasUserPrimed = Boolean.FALSE;
                this.selectedSchemeId = null;
                this.wasConfirmed = false;
                this.saveUserAccount = null;
                return screen;
            }
            if (screen instanceof ProviderSelectionScreen.BranchSelection) {
                this.branch = null;
                this.wasUserPrimed = Boolean.FALSE;
                this.selectedSchemeId = null;
                this.wasConfirmed = false;
                return screen;
            }
            if (screen instanceof ProviderSelectionScreen.Priming) {
                this.wasUserPrimed = Boolean.FALSE;
                this.selectedSchemeId = null;
                this.wasConfirmed = false;
                return screen;
            }
            if (screen instanceof ProviderSelectionScreen.SchemeSelection) {
                this.selectedSchemeId = null;
                this.wasConfirmed = false;
                return screen;
            }
            if (screen instanceof ProviderSelectionScreen.Confirmation) {
                this.wasConfirmed = false;
            }
        }
        return screen;
    }

    public static /* synthetic */ void initialize$payments_ui_release$default(ProviderSelectionViewModelBase providerSelectionViewModelBase, ProviderSelectionViewData providerSelectionViewData, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
        }
        if ((i & 1) != 0) {
            providerSelectionViewData = null;
        }
        providerSelectionViewModelBase.initialize$payments_ui_release(providerSelectionViewData);
    }

    public final void initialize$payments_ui_release(ProviderSelectionViewData data) {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new ProviderSelectionViewModelBase2(this, data, null), 2, null);
    }

    public final void setProviders$payments_ui_release(List<PaymentProvider> providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.providers = providers;
        ArrayList arrayList = new ArrayList();
        for (PaymentProvider paymentProvider : providers) {
            PaymentProviderViewData paymentProviderViewDataIntoViewData = PaymentProviderViewData3.intoViewData(paymentProvider, false);
            List<Branch> branches = paymentProvider.getBranches();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(branches, 10));
            Iterator<T> it = branches.iterator();
            while (it.hasNext()) {
                arrayList2.add(PaymentProviderViewData3.intoViewData((Branch) it.next(), false, paymentProvider));
            }
            CollectionsKt.addAll(arrayList, CollectionsKt.plus((Collection) CollectionsKt.listOf(paymentProviderViewDataIntoViewData), (Iterable) arrayList2));
        }
        this.providersViewData = arrayList;
        List<Country> listBuildListOfCountries = buildListOfCountries(arrayList);
        this.listOfCountries = listBuildListOfCountries;
        this.currentCountry = selectDefaultCountry$default(this, listBuildListOfCountries, null, 2, null);
        prepareDataForDisplay();
    }

    public final void notifyChange$payments_ui_release() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new ProviderSelectionViewModelBase3(this, null), 2, null);
    }

    /* compiled from: ProviderSelectionViewModelBase.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$prepareDataForDisplay$1", m3645f = "ProviderSelectionViewModelBase.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$prepareDataForDisplay$1 */
    static final class C431531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C431531(Continuation<? super C431531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProviderSelectionViewModelBase.this.new C431531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C431531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (ProviderSelectionViewModelBase.this.providers.size() == 1 && !((PaymentProvider) CollectionsKt.first(ProviderSelectionViewModelBase.this.providers)).getBranches().isEmpty()) {
                    ProviderSelectionViewModelBase providerSelectionViewModelBase = ProviderSelectionViewModelBase.this;
                    providerSelectionViewModelBase.showBranchSelection((PaymentProvider) CollectionsKt.first(providerSelectionViewModelBase.providers));
                } else {
                    ProviderSelectionViewModelBase.this.showProviderSelectionWithCurrentCountry$payments_ui_release();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    protected final void prepareDataForDisplay() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new C431531(null), 2, null);
    }

    /* compiled from: ProviderSelectionViewModelBase.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$showConfirmation$1", m3645f = "ProviderSelectionViewModelBase.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$showConfirmation$1 */
    static final class C431561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C431561(Continuation<? super C431561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProviderSelectionViewModelBase.this.new C431561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C431561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            PaymentProvider paymentProvider;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentProvider currentProvider = ProviderSelectionViewModelBase.this.getCurrentProvider();
                if (currentProvider != null) {
                    ProviderSelectionViewModelBase.this._isLoading.tryEmit(boxing.boxBoolean(true));
                    TranslationProvider translationProvider = ProviderSelectionViewModelBase.this.api.getTranslationProvider();
                    PaymentContext paymentContextIntoDomain$payments_ui_release = ProviderSelectionViewModelBase.this.getData().getPaymentContext().intoDomain$payments_ui_release();
                    String countryCode = currentProvider.getCountryCode();
                    boolean zIsSignupPlus = ProviderSelectionViewModelBase.this.getData().getPayment().isSignupPlus();
                    this.L$0 = currentProvider;
                    this.label = 1;
                    Object objUpdateLegalsSync = translationProvider.updateLegalsSync(paymentContextIntoDomain$payments_ui_release, countryCode, zIsSignupPlus, this);
                    if (objUpdateLegalsSync == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    paymentProvider = currentProvider;
                    obj = objUpdateLegalsSync;
                } else {
                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.WTF(null, "showConfirmation without provider selected", null, null, null, null, 61, null));
                    ProviderSelectionViewModelBase.this.emitScreen(new ProviderSelectionScreen.Error(CoreError.INSTANCE.mo27021default()));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paymentProvider = (PaymentProvider) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Outcome outcome = (Outcome) obj;
            ProviderSelectionViewModelBase providerSelectionViewModelBase = ProviderSelectionViewModelBase.this;
            boolean z = outcome instanceof Ok;
            if (z) {
                Legals legals = (Legals) ((Ok) outcome).getValue();
                providerSelectionViewModelBase._isLoading.tryEmit(boxing.boxBoolean(false));
                providerSelectionViewModelBase.emitScreen(ProviderSelectionScreen.Confirmation.INSTANCE.create(paymentProvider, providerSelectionViewModelBase.getData().getMerchantConfig(), legals, providerSelectionViewModelBase.getData().getPayment()));
            } else if (!(outcome instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            ProviderSelectionViewModelBase providerSelectionViewModelBase2 = ProviderSelectionViewModelBase.this;
            if (!z) {
                if (outcome instanceof Fail) {
                    CoreError coreError = (CoreError) ((Fail) outcome).getError();
                    providerSelectionViewModelBase2._isLoading.tryEmit(boxing.boxBoolean(false));
                    providerSelectionViewModelBase2.emitScreen(new ProviderSelectionScreen.Error(coreError));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    protected final void showConfirmation() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new C431561(null), 2, null);
    }

    /* compiled from: ProviderSelectionViewModelBase.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$showProviderPriming$1", m3645f = "ProviderSelectionViewModelBase.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$showProviderPriming$1 */
    static final class C431581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $confirmUserPrimed;
        final /* synthetic */ PaymentProvider $provider;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C431581(PaymentProvider paymentProvider, Function0<Unit> function0, Continuation<? super C431581> continuation) {
            super(2, continuation);
            this.$provider = paymentProvider;
            this.$confirmUserPrimed = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProviderSelectionViewModelBase.this.new C431581(this.$provider, this.$confirmUserPrimed, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C431581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Outcome outcome;
            ProviderSelectionViewModelBase providerSelectionViewModelBase;
            PaymentProvider paymentProvider;
            UserPriming userPriming;
            Function0<Unit> function0;
            Function0<Unit> function02;
            CoreError coreError;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = ProviderSelectionViewModelBase.this._isLoading;
                Boolean boolBoxBoolean = boxing.boxBoolean(true);
                this.label = 1;
                if (stateFlow2.emit(boolBoxBoolean, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    outcome = (Outcome) obj;
                    providerSelectionViewModelBase = ProviderSelectionViewModelBase.this;
                    paymentProvider = this.$provider;
                    Function0<Unit> function03 = this.$confirmUserPrimed;
                    if (!(outcome instanceof Ok)) {
                        userPriming = (UserPriming) ((Ok) outcome).getValue();
                        StateFlow2 stateFlow22 = providerSelectionViewModelBase._isLoading;
                        Boolean boolBoxBoolean2 = boxing.boxBoolean(false);
                        this.L$0 = outcome;
                        this.L$1 = providerSelectionViewModelBase;
                        this.L$2 = paymentProvider;
                        this.L$3 = function03;
                        this.L$4 = userPriming;
                        this.label = 3;
                        if (stateFlow22.emit(boolBoxBoolean2, this) != coroutine_suspended) {
                            function0 = function03;
                            if (!(userPriming instanceof UserPriming.Data)) {
                            }
                            ProviderSelectionViewModelBase providerSelectionViewModelBase2 = ProviderSelectionViewModelBase.this;
                            function02 = this.$confirmUserPrimed;
                            if (!(outcome instanceof Ok)) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    if (!(outcome instanceof Fail)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ProviderSelectionViewModelBase providerSelectionViewModelBase22 = ProviderSelectionViewModelBase.this;
                    function02 = this.$confirmUserPrimed;
                    if (!(outcome instanceof Ok)) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coreError = (CoreError) this.L$2;
                    function02 = (Function0) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    String str = "Fetching priming failed: " + coreError;
                    Logger6.d$default(Logger6.INSTANCE, str, null, null, 6, null);
                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.BackgroundError(null, str, ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, null));
                    function02.invoke();
                    return Unit.INSTANCE;
                }
                userPriming = (UserPriming) this.L$4;
                function0 = (Function0) this.L$3;
                paymentProvider = (PaymentProvider) this.L$2;
                providerSelectionViewModelBase = (ProviderSelectionViewModelBase) this.L$1;
                outcome = (Outcome) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!(userPriming instanceof UserPriming.Data)) {
                    UserPriming.Data data = (UserPriming.Data) userPriming;
                    providerSelectionViewModelBase.setPriming(data);
                    providerSelectionViewModelBase.emitScreen(new ProviderSelectionScreen.Priming(paymentProvider, data));
                } else if (Intrinsics.areEqual(userPriming, UserPriming.None.INSTANCE)) {
                    function0.invoke();
                }
                ProviderSelectionViewModelBase providerSelectionViewModelBase222 = ProviderSelectionViewModelBase.this;
                function02 = this.$confirmUserPrimed;
                if (!(outcome instanceof Ok)) {
                    if (outcome instanceof Fail) {
                        CoreError coreError2 = (CoreError) ((Fail) outcome).getError();
                        StateFlow2 stateFlow23 = providerSelectionViewModelBase222._isLoading;
                        Boolean boolBoxBoolean3 = boxing.boxBoolean(false);
                        this.L$0 = outcome;
                        this.L$1 = function02;
                        this.L$2 = coreError2;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        if (stateFlow23.emit(boolBoxBoolean3, this) != coroutine_suspended) {
                            coreError = coreError2;
                            String str2 = "Fetching priming failed: " + coreError;
                            Logger6.d$default(Logger6.INSTANCE, str2, null, null, 6, null);
                            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.BackgroundError(null, str2, ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, null));
                            function02.invoke();
                        }
                        return coroutine_suspended;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            TranslationProvider translationProvider = ProviderSelectionViewModelBase.this.api.getTranslationProvider();
            PaymentContext paymentContextIntoDomain$payments_ui_release = ProviderSelectionViewModelBase.this.getData().getPaymentContext().intoDomain$payments_ui_release();
            String id = this.$provider.getId();
            this.label = 2;
            obj = translationProvider.updatePrimingSync(paymentContextIntoDomain$payments_ui_release, id, this);
            if (obj != coroutine_suspended) {
                outcome = (Outcome) obj;
                providerSelectionViewModelBase = ProviderSelectionViewModelBase.this;
                paymentProvider = this.$provider;
                Function0<Unit> function032 = this.$confirmUserPrimed;
                if (!(outcome instanceof Ok)) {
                }
            }
            return coroutine_suspended;
        }
    }

    protected final void showProviderPriming(PaymentProvider provider, Function0<Unit> confirmUserPrimed) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(confirmUserPrimed, "confirmUserPrimed");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new C431581(provider, confirmUserPrimed, null), 2, null);
    }

    /* compiled from: ProviderSelectionViewModelBase.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$showSchemeSelection$1", m3645f = "ProviderSelectionViewModelBase.kt", m3646l = {EnumC7081g.f2774x74902ae0, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE, EnumC7081g.f2781x2ba65ba3, EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$showSchemeSelection$1 */
    static final class C431601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $confirmSelection;
        final /* synthetic */ List<String> $schemeIds;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C431601(List<String> list, Function1<? super String, Unit> function1, Continuation<? super C431601> continuation) {
            super(2, continuation);
            this.$schemeIds = list;
            this.$confirmSelection = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProviderSelectionViewModelBase.this.new C431601(this.$schemeIds, this.$confirmSelection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C431601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Outcome outcome;
            ProviderSelectionViewModelBase providerSelectionViewModelBase;
            SchemeSelection schemeSelection;
            Function1<String, Unit> function1;
            ProviderSelectionViewModelBase providerSelectionViewModelBase2;
            CoreError coreError;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = ProviderSelectionViewModelBase.this._isLoading;
                Boolean boolBoxBoolean = boxing.boxBoolean(true);
                this.label = 1;
                if (stateFlow2.emit(boolBoxBoolean, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    outcome = (Outcome) obj;
                    providerSelectionViewModelBase = ProviderSelectionViewModelBase.this;
                    Function1<String, Unit> function12 = this.$confirmSelection;
                    if (!(outcome instanceof Ok)) {
                        schemeSelection = (SchemeSelection) ((Ok) outcome).getValue();
                        StateFlow2 stateFlow22 = providerSelectionViewModelBase._isLoading;
                        Boolean boolBoxBoolean2 = boxing.boxBoolean(false);
                        this.L$0 = outcome;
                        this.L$1 = providerSelectionViewModelBase;
                        this.L$2 = function12;
                        this.L$3 = schemeSelection;
                        this.label = 3;
                        if (stateFlow22.emit(boolBoxBoolean2, this) != coroutine_suspended) {
                            function1 = function12;
                            if (!(schemeSelection instanceof SchemeAutoSubmit)) {
                            }
                            providerSelectionViewModelBase2 = ProviderSelectionViewModelBase.this;
                            if (!(outcome instanceof Ok)) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    if (!(outcome instanceof Fail)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    providerSelectionViewModelBase2 = ProviderSelectionViewModelBase.this;
                    if (!(outcome instanceof Ok)) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coreError = (CoreError) this.L$2;
                    providerSelectionViewModelBase2 = (ProviderSelectionViewModelBase) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    providerSelectionViewModelBase2.emitScreen(new ProviderSelectionScreen.Error(coreError));
                    Logger6.d$default(Logger6.INSTANCE, "Fetching scheme selection failed: " + coreError, null, null, 6, null);
                    return Unit.INSTANCE;
                }
                schemeSelection = (SchemeSelection) this.L$3;
                function1 = (Function1) this.L$2;
                providerSelectionViewModelBase = (ProviderSelectionViewModelBase) this.L$1;
                outcome = (Outcome) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!(schemeSelection instanceof SchemeAutoSubmit)) {
                    function1.invoke(((SchemeAutoSubmit) schemeSelection).getAutoSubmitSchemeId());
                } else if (schemeSelection instanceof SchemeSelectionSelect) {
                    providerSelectionViewModelBase.showSchemeSelectionScreen((SchemeSelectionSelect) schemeSelection);
                }
                providerSelectionViewModelBase2 = ProviderSelectionViewModelBase.this;
                if (!(outcome instanceof Ok)) {
                    if (outcome instanceof Fail) {
                        CoreError coreError2 = (CoreError) ((Fail) outcome).getError();
                        StateFlow2 stateFlow23 = providerSelectionViewModelBase2._isLoading;
                        Boolean boolBoxBoolean3 = boxing.boxBoolean(false);
                        this.L$0 = outcome;
                        this.L$1 = providerSelectionViewModelBase2;
                        this.L$2 = coreError2;
                        this.L$3 = null;
                        this.label = 4;
                        if (stateFlow23.emit(boolBoxBoolean3, this) != coroutine_suspended) {
                            coreError = coreError2;
                            providerSelectionViewModelBase2.emitScreen(new ProviderSelectionScreen.Error(coreError));
                            Logger6.d$default(Logger6.INSTANCE, "Fetching scheme selection failed: " + coreError, null, null, 6, null);
                        }
                        return coroutine_suspended;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Network network = ProviderSelectionViewModelBase.this.api;
            PaymentContext paymentContextCopy$default = PaymentContext.copy$default(ProviderSelectionViewModelBase.this.getData().getPaymentContext().intoDomain$payments_ui_release(), null, "invalid", null, null, null, 29, null);
            String currencyCode = ProviderSelectionViewModelBase.this.getData().getPayment().getCurrency().getCurrencyCode();
            List<String> list = this.$schemeIds;
            this.label = 2;
            obj = network.getSchemeSelection(paymentContextCopy$default, currencyCode, list, this);
            if (obj != coroutine_suspended) {
                outcome = (Outcome) obj;
                providerSelectionViewModelBase = ProviderSelectionViewModelBase.this;
                Function1<String, Unit> function122 = this.$confirmSelection;
                if (!(outcome instanceof Ok)) {
                }
            }
            return coroutine_suspended;
        }
    }

    protected final void showSchemeSelection(List<String> schemeIds, Function1<? super String, Unit> confirmSelection) {
        Intrinsics.checkNotNullParameter(schemeIds, "schemeIds");
        Intrinsics.checkNotNullParameter(confirmSelection, "confirmSelection");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new C431601(schemeIds, confirmSelection, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSchemeSelectionScreen(SchemeSelectionSelect selection) {
        emitScreen(new ProviderSelectionScreen.SchemeSelection(selection));
    }

    /* compiled from: ProviderSelectionViewModelBase.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$showBranchSelection$2 */
    /* synthetic */ class C431552 extends FunctionReferenceImpl implements Function4<List<? extends PaymentProviderViewData>, Country, String, Boolean, List<? extends PaymentProviderViewData>> {
        C431552(Object obj) {
            super(4, obj, Companion.class, "sortAndFilterPaymentProviders", "sortAndFilterPaymentProviders$payments_ui_release(Ljava/util/List;Lcom/truelayer/payments/ui/models/Country;Ljava/lang/String;Z)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ List<? extends PaymentProviderViewData> invoke(List<? extends PaymentProviderViewData> list, Country country, String str, Boolean bool) {
            return invoke((List<PaymentProviderViewData>) list, country, str, bool.booleanValue());
        }

        public final List<PaymentProviderViewData> invoke(List<PaymentProviderViewData> p0, Country p1, String p2, boolean z) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return ((Companion) this.receiver).sortAndFilterPaymentProviders$payments_ui_release(p0, p1, p2, z);
        }
    }

    protected final void showBranchSelection(PaymentProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        List<Branch> branches = provider.getBranches();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(branches, 10));
        Iterator<T> it = branches.iterator();
        while (it.hasNext()) {
            arrayList.add(PaymentProviderViewData3.intoViewData((Branch) it.next(), false, provider));
        }
        emitScreen(new ProviderSelectionScreen.BranchSelection(arrayList, new C431552(INSTANCE)));
    }

    public final void showProviderSelectionWithCurrentCountry$payments_ui_release() {
        Unit unit;
        Country country = this.currentCountry;
        if (country != null) {
            showProviderSelection(country);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            showCountrySelection();
        }
    }

    private final void showProviderSelection(Country currentCountry) {
        emitScreen(new ProviderSelectionScreen.ProviderSelection(this.providersViewData, this.recommendedProviders, currentCountry, this.listOfCountries.size() > 1, new C431591(INSTANCE), 0, false, 96, null));
    }

    /* compiled from: ProviderSelectionViewModelBase.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$showProviderSelection$1 */
    /* synthetic */ class C431591 extends FunctionReferenceImpl implements Function4<List<? extends PaymentProviderViewData>, Country, String, Boolean, List<? extends PaymentProviderViewData>> {
        C431591(Object obj) {
            super(4, obj, Companion.class, "sortAndFilterPaymentProviders", "sortAndFilterPaymentProviders$payments_ui_release(Ljava/util/List;Lcom/truelayer/payments/ui/models/Country;Ljava/lang/String;Z)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ List<? extends PaymentProviderViewData> invoke(List<? extends PaymentProviderViewData> list, Country country, String str, Boolean bool) {
            return invoke((List<PaymentProviderViewData>) list, country, str, bool.booleanValue());
        }

        public final List<PaymentProviderViewData> invoke(List<PaymentProviderViewData> p0, Country p1, String p2, boolean z) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return ((Companion) this.receiver).sortAndFilterPaymentProviders$payments_ui_release(p0, p1, p2, z);
        }
    }

    public final void showCountrySelection() {
        emitScreen(new ProviderSelectionScreen.CountrySelection(this.listOfCountries, this.currentCountry, new C431571(INSTANCE)));
    }

    /* compiled from: ProviderSelectionViewModelBase.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$showCountrySelection$1 */
    /* synthetic */ class C431571 extends FunctionReferenceImpl implements Function2<List<? extends Country>, String, List<? extends Country>> {
        C431571(Object obj) {
            super(2, obj, Companion.class, "sortAndFilterCountries", "sortAndFilterCountries$payments_ui_release(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends Country> invoke(List<? extends Country> list, String str) {
            return invoke2((List<Country>) list, str);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<Country> invoke2(List<Country> p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((Companion) this.receiver).sortAndFilterCountries$payments_ui_release(p0, p1);
        }
    }

    public final void showSaveUserAccountDialog(PaymentProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this._showSaveUserAccountDialog.tryEmit(new SaveAccountDetailsDialogViewData(provider.getIconUri(), provider.getExtendedIcon(), this.data.getPayment().getCurrency()));
    }

    public final void removeSaveUserAccountDialog() {
        this._showSaveUserAccountDialog.tryEmit(null);
    }

    static /* synthetic */ Country selectDefaultCountry$default(ProviderSelectionViewModelBase providerSelectionViewModelBase, List list, Locale locale, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectDefaultCountry");
        }
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        }
        return providerSelectionViewModelBase.selectDefaultCountry(list, locale);
    }

    private final Country selectDefaultCountry(List<Country> countries, Locale locale) {
        Country country;
        Object next;
        Object next2;
        if (countries.size() == 1) {
            return (Country) CollectionsKt.first((List) countries);
        }
        String preferredCountryCode = this.data.getPreferredCountryCode();
        Object obj = null;
        if (preferredCountryCode != null) {
            Iterator<T> it = countries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (StringsKt.equals(((Country) next2).getCountryCode(), preferredCountryCode, true)) {
                    break;
                }
            }
            Country country2 = (Country) next2;
            if (country2 != null) {
                return country2;
            }
        }
        String str = (String) BuildersKt__BuildersKt.runBlocking$default(null, new ProviderSelectionViewModelBase5(this, null), 1, null);
        if (str != null) {
            Iterator<T> it2 = countries.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (StringsKt.equals(((Country) next).getCountryCode(), str, true)) {
                    break;
                }
            }
            country = (Country) next;
        } else {
            country = null;
        }
        if (country != null) {
            return country;
        }
        Iterator<T> it3 = countries.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (StringsKt.equals(((Country) next3).getCountryCode(), locale.getCountry(), true)) {
                obj = next3;
                break;
            }
        }
        return (Country) obj;
    }

    private final List<Country> buildListOfCountries(List<PaymentProviderViewData> providers) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((PaymentProviderViewData) it.next()).getCountryCode());
        }
        List<String> list = CollectionsKt.toList(linkedHashSet);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            arrayList.add(new Country(str, FlagIconUtils.INSTANCE.getFlagUri(str)));
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$buildListOfCountries$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((Country) t).getDisplayName(), ((Country) t2).getDisplayName());
            }
        });
    }

    /* compiled from: ProviderSelectionViewModelBase.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ;\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewModelBase$Companion;", "", "()V", "sortAndFilterCountries", "", "Lcom/truelayer/payments/ui/models/Country;", "countries", "query", "", "sortAndFilterCountries$payments_ui_release", "sortAndFilterPaymentProviders", "Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "providers", "currentCountry", "hideBranches", "", "sortAndFilterPaymentProviders$payments_ui_release", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Country> sortAndFilterCountries$payments_ui_release(List<Country> countries, String query) {
            Intrinsics.checkNotNullParameter(countries, "countries");
            Intrinsics.checkNotNullParameter(query, "query");
            ArrayList arrayList = new ArrayList();
            for (Object obj : countries) {
                Country country = (Country) obj;
                String displayName = country.getDisplayName();
                Locale locale = Locale.ROOT;
                String lowerCase = displayName.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String lowerCase2 = query.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                    String lowerCase3 = country.getCountryCode().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                    String lowerCase4 = query.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                    if (!StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) lowerCase4, false, 2, (Object) null)) {
                        String lowerCase5 = country.getIso3CountryCode().toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                        String lowerCase6 = query.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
                        if (StringsKt.contains$default((CharSequence) lowerCase5, (CharSequence) lowerCase6, false, 2, (Object) null)) {
                        }
                    }
                }
                arrayList.add(obj);
            }
            return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$Companion$sortAndFilterCountries$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((Country) t).getDisplayName(), ((Country) t2).getDisplayName());
                }
            });
        }

        public static /* synthetic */ List sortAndFilterPaymentProviders$payments_ui_release$default(Companion companion, List list, Country country, String str, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = StringsKt.isBlank(str);
            }
            return companion.sortAndFilterPaymentProviders$payments_ui_release(list, country, str, z);
        }

        public final List<PaymentProviderViewData> sortAndFilterPaymentProviders$payments_ui_release(List<PaymentProviderViewData> providers, Country currentCountry, String query, boolean hideBranches) {
            Comparator comparatorThenComparing;
            String parentId;
            String str;
            String str2;
            Iterator it;
            double d;
            double d2;
            Intrinsics.checkNotNullParameter(providers, "providers");
            Intrinsics.checkNotNullParameter(currentCountry, "currentCountry");
            Intrinsics.checkNotNullParameter(query, "query");
            String string2 = StringsKt.trim(StringExtensions.searchNormalizeLowercase(query)).toString();
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.addAll(StringsKt.split$default((CharSequence) string2, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null));
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listBuild) {
                if (!StringsKt.isBlank((String) obj)) {
                    arrayList.add(obj);
                }
            }
            List<PaymentProviderViewData> list = providers;
            for (PaymentProviderViewData paymentProviderViewData : list) {
                List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                List<String> listSplit$default = StringsKt.split$default((CharSequence) paymentProviderViewData.getNormalizedName(), new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                for (String str3 : listSplit$default) {
                    Iterator<T> it2 = paymentProviderViewData.getNormalizedSearchAliases().iterator();
                    String strReplace$default = str3;
                    while (it2.hasNext()) {
                        strReplace$default = StringsKt.replace$default(strReplace$default, (String) it2.next(), "", false, 4, (Object) null);
                    }
                    arrayList2.add(strReplace$default);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (!StringsKt.isBlank((String) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                listCreateListBuilder2.addAll(arrayList3);
                List listCreateListBuilder3 = CollectionsKt.createListBuilder();
                Iterator<T> it3 = paymentProviderViewData.getNormalizedSearchAliases().iterator();
                while (it3.hasNext()) {
                    List listSplit$default2 = StringsKt.split$default((CharSequence) it3.next(), new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : listSplit$default2) {
                        if (!StringsKt.isBlank((String) obj3)) {
                            arrayList4.add(obj3);
                        }
                    }
                    listCreateListBuilder3.addAll(arrayList4);
                }
                listCreateListBuilder2.addAll(CollectionsKt.build(listCreateListBuilder3));
                List listBuild2 = CollectionsKt.build(listCreateListBuilder2);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : listBuild2) {
                    if (!StringsKt.isBlank((String) obj4)) {
                        arrayList5.add(obj4);
                    }
                }
                List listDistinct = CollectionsKt.distinct(arrayList5);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it4 = listDistinct.iterator();
                while (true) {
                    Object obj5 = null;
                    int i = 2;
                    boolean z = false;
                    if (!it4.hasNext()) {
                        break;
                    }
                    String str4 = (String) it4.next();
                    Iterator it5 = arrayList.iterator();
                    int i2 = 0;
                    while (it5.hasNext()) {
                        Object next = it5.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        List<PaymentProviderViewData> list2 = list;
                        String str5 = (String) next;
                        if (!StringsKt.contains$default(str4, str5, z, i, obj5)) {
                            str = str5;
                            str2 = str4;
                            it = it5;
                            d = 0.0d;
                        } else if (Intrinsics.areEqual(str4, str5)) {
                            str = str5;
                            str2 = str4;
                            it = it5;
                            d = 1.1d;
                        } else if (StringsKt.startsWith$default(str4, str5, z, i, obj5) && i2 == 0) {
                            str = str5;
                            it = it5;
                            d = 1.05d;
                            str2 = str4;
                        } else {
                            str2 = str4;
                            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, str5, 0, false, 6, (Object) null);
                            str = str5;
                            if (iIndexOf$default > 0) {
                                it = it5;
                                d2 = 0.0d - (iIndexOf$default * 0.01d);
                            } else {
                                it = it5;
                                d2 = 0.0d;
                            }
                            d = d2 + 1.0d;
                        }
                        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) paymentProviderViewData.getNormalizedName(), str, 0, false, 6, (Object) null);
                        String str6 = str;
                        if (iIndexOf$default2 > 0) {
                            d -= iIndexOf$default2 * 0.1d;
                        }
                        Double d3 = (Double) linkedHashMap2.get(str6);
                        if ((d3 != null ? d3.doubleValue() : 0.0d) < d) {
                            linkedHashMap2.put(str6, Double.valueOf(d));
                        }
                        list = list2;
                        str4 = str2;
                        it5 = it;
                        i2 = i3;
                        z = false;
                        obj5 = null;
                        i = 2;
                    }
                }
                List<PaymentProviderViewData> list3 = list;
                double dSumOfDouble = CollectionsKt.sumOfDouble(linkedHashMap2.values());
                if (dSumOfDouble > 0.0d && paymentProviderViewData.getParentId() == null && StringsKt.contains$default((CharSequence) paymentProviderViewData.getNormalizedName(), (CharSequence) string2, false, 2, (Object) null)) {
                    dSumOfDouble += 1.1d;
                }
                linkedHashMap.put(paymentProviderViewData.getId(), Double.valueOf(dSumOfDouble));
                list = list3;
            }
            List<PaymentProviderViewData> list4 = list;
            if (StringsKt.isBlank(query)) {
                comparatorThenComparing = new Comparator() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$Companion$sortAndFilterPaymentProviders$$inlined$compareByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Boolean.valueOf(((PaymentProviderViewData) t2).getAvailable()), Boolean.valueOf(((PaymentProviderViewData) t).getAvailable()));
                    }
                }.thenComparing(new Comparator() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$Companion$sortAndFilterPaymentProviders$$inlined$compareByDescending$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Float.valueOf(((PaymentProviderViewData) t2).getOrder()), Float.valueOf(((PaymentProviderViewData) t).getOrder()));
                    }
                }).thenComparing(new Comparator() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$Companion$sortAndFilterPaymentProviders$$inlined$compareBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((PaymentProviderViewData) t).getDisplayName(), ((PaymentProviderViewData) t2).getDisplayName());
                    }
                });
                Intrinsics.checkNotNull(comparatorThenComparing);
            } else {
                comparatorThenComparing = new Comparator() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$Companion$sortAndFilterPaymentProviders$$inlined$compareByDescending$3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues((Comparable) linkedHashMap.get(((PaymentProviderViewData) t2).getId()), (Comparable) linkedHashMap.get(((PaymentProviderViewData) t).getId()));
                    }
                }.thenComparing(new Comparator() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$Companion$sortAndFilterPaymentProviders$$inlined$compareByDescending$4
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Boolean.valueOf(((PaymentProviderViewData) t2).getAvailable()), Boolean.valueOf(((PaymentProviderViewData) t).getAvailable()));
                    }
                }).thenComparing(new Comparator() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$Companion$sortAndFilterPaymentProviders$$inlined$compareBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((PaymentProviderViewData) t).getDisplayName(), ((PaymentProviderViewData) t2).getDisplayName());
                    }
                });
                Intrinsics.checkNotNull(comparatorThenComparing);
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj6 : list4) {
                if (StringsKt.equals(((PaymentProviderViewData) obj6).getCountryCode(), currentCountry.getCountryCode(), true)) {
                    arrayList6.add(obj6);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            for (Object obj7 : arrayList6) {
                PaymentProviderViewData paymentProviderViewData2 = (PaymentProviderViewData) obj7;
                if (!hideBranches || (parentId = paymentProviderViewData2.getParentId()) == null || StringsKt.isBlank(parentId)) {
                    arrayList7.add(obj7);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj8 : arrayList7) {
                PaymentProviderViewData paymentProviderViewData3 = (PaymentProviderViewData) obj8;
                if (!StringsKt.isBlank(query)) {
                    Double d4 = (Double) linkedHashMap.get(paymentProviderViewData3.getId());
                    if ((d4 != null ? d4.doubleValue() : 0.0d) > 0.0d) {
                    }
                }
                arrayList8.add(obj8);
            }
            return CollectionsKt.sortedWith(arrayList8, comparatorThenComparing);
        }
    }
}
