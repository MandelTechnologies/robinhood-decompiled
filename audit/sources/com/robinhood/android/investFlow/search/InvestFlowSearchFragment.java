package com.robinhood.android.investFlow.search;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.cart.CartAccordionView;
import com.robinhood.android.cart.CartChipsViewData;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.search.RhSearchAdapter;
import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.investFlow.core.InvestFlowBasketItem;
import com.robinhood.android.investFlow.core.InvestFlowCoreData;
import com.robinhood.android.investFlow.core.InvestFlowCoreDataProvider;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowSearchBinding;
import com.robinhood.android.investFlow.logging.InvestFlowActivityLoggingHelpers;
import com.robinhood.android.investFlow.search.InvestFlowSearchFragment;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.EtpDocuments;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.store.search.SearchStore3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: InvestFlowSearchFragment.kt */
@Metadata(m3635d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001!\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002MNB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010*\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0016J\b\u0010+\u001a\u00020$H\u0016J\u0010\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020(H\u0016J\u0012\u00100\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001a\u00103\u001a\u00020$2\u0006\u00104\u001a\u0002052\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00106\u001a\u00020$H\u0016J\b\u00107\u001a\u00020$H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u00108\u001a\u000209H\u0016J\u0006\u0010:\u001a\u00020$J\u0016\u0010;\u001a\u00020$2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002J\u0010\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020AH\u0002J\u001c\u0010B\u001a\u00020$2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010DH\u0002J\b\u0010F\u001a\u00020$H\u0002J\t\u0010G\u001a\u00020(H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IX\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/InvestFlowSearchFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/search/RhSearchAdapter$Callbacks;", "Lcom/robinhood/android/investFlow/search/DiscoveryCallbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "activityCallbacks", "Lcom/robinhood/android/investFlow/search/InvestFlowSearchFragment$Callbacks;", "getActivityCallbacks", "()Lcom/robinhood/android/investFlow/search/InvestFlowSearchFragment$Callbacks;", "activityCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowSearchBinding;", "getBinding", "()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowSearchBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/investFlow/search/InvestFlowSearchDuxo;", "getDuxo", "()Lcom/robinhood/android/investFlow/search/InvestFlowSearchDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "searchAdapter", "Lcom/robinhood/android/common/search/RhSearchAdapter;", "cartCallbacks", "com/robinhood/android/investFlow/search/InvestFlowSearchFragment$cartCallbacks$1", "Lcom/robinhood/android/investFlow/search/InvestFlowSearchFragment$cartCallbacks$1;", "onItemClicked", "", "assetId", "Ljava/util/UUID;", "isItemChecked", "", "listId", "onItemDoubleClicked", "onRetryClicked", "handle", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onResume", "onPause", "searchItem", "Lcom/robinhood/android/common/search/SearchItem;", "toggleFadeLayer", "updateCartView", "selectedItems", "", "Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem;", "setViewState", "state", "Lcom/robinhood/android/investFlow/search/InvestFlowSearchViewState;", "showDisabledDialog", "title", "", "message", "showGenericDisabledDialog", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowSearchFragment extends BaseFragment implements RegionGated, RhSearchAdapter.Callbacks, DiscoveryScreen3 {
    private static final int VIEW_PROSPECTUS_SNACKBAR_LEN_LONG_MS = 5000;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: activityCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 activityCallbacks;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final InvestFlowSearchFragment3 cartCallbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final RhSearchAdapter searchAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestFlowSearchFragment.class, "activityCallbacks", "getActivityCallbacks()Lcom/robinhood/android/investFlow/search/InvestFlowSearchFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowSearchFragment.class, "binding", "getBinding()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowSearchBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InvestFlowSearchFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J4\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u000fH&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/InvestFlowSearchFragment$Callbacks;", "Lcom/robinhood/android/investFlow/core/InvestFlowCoreDataProvider;", "completeSearch", "", "selectedItems", "", "Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem;", "showEmbeddedDetail", "apiAssetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "id", "Ljava/util/UUID;", "inBasket", "", "onPrimaryButtonClicked", "Lkotlin/Function1;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends InvestFlowCoreDataProvider {
        void completeSearch(List<? extends InvestFlowBasketItem> selectedItems);

        void showEmbeddedDetail(ApiAssetType apiAssetType, UUID id, boolean inBasket, Function1<? super UUID, Unit> onPrimaryButtonClicked);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.robinhood.android.investFlow.search.InvestFlowSearchFragment$cartCallbacks$1] */
    public InvestFlowSearchFragment() {
        super(C19349R.layout.fragment_invest_flow_search);
        this.$$delegate_0 = new RegionGated2(InvestFlowRegionGate.INSTANCE);
        this.activityCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof InvestFlowSearchFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, InvestFlowSearchFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, InvestFlowSearchDuxo.class);
        this.searchAdapter = new RhSearchAdapter(this);
        this.cartCallbacks = new CartAccordionView.Callbacks() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$cartCallbacks$1
            @Override // com.robinhood.android.cart.CartAccordionView.Callbacks
            public void onChipClick(UUID id) {
                Intrinsics.checkNotNullParameter(id, "id");
                this.this$0.getDuxo().deleteItem(id);
                InvestFlowActivityLoggingHelpers.INSTANCE.logCartRemove(this.this$0.getEventLogger(), id);
            }

            @Override // com.robinhood.android.cart.CartAccordionView.Callbacks
            public void toggleExpanded(boolean isExpanded) {
                UserInteractionEventData.Action action;
                this.this$0.toggleFadeLayer();
                EventLogger eventLogger = this.this$0.getEventLogger();
                Screen screen = new Screen(Screen.Name.INVEST_FLOW_DISCOVER, null, null, null, 14, null);
                Component component = new Component(Component.ComponentType.INVESTMENT_BASKET_TOGGLE, null, null, 6, null);
                if (isExpanded) {
                    action = UserInteractionEventData.Action.COLLAPSE;
                } else {
                    action = UserInteractionEventData.Action.EXPAND;
                }
                EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, null, false, 56, null);
            }
        };
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final Callbacks getActivityCallbacks() {
        return (Callbacks) this.activityCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentInvestFlowSearchBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInvestFlowSearchBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InvestFlowSearchDuxo getDuxo() {
        return (InvestFlowSearchDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.investFlow.search.item.DiscoveryItems
    public void onItemClicked(UUID assetId, boolean isItemChecked, final UUID listId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        getActivityCallbacks().showEmbeddedDetail(ApiAssetType.EQUITY, assetId, isItemChecked, new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchFragment.onItemClicked$lambda$0(this.f$0, listId, (UUID) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClicked$lambda$0(InvestFlowSearchFragment investFlowSearchFragment, UUID uuid, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        InvestFlowSearchDuxo.onItemClicked$default(investFlowSearchFragment.getDuxo(), id, uuid, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.investFlow.search.item.DiscoveryItems
    public void onItemDoubleClicked(UUID assetId, UUID listId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(listId, "listId");
        getDuxo().onItemClicked(assetId, listId, true);
    }

    @Override // com.robinhood.android.investFlow.search.DiscoveryScreen3
    public void onRetryClicked() {
        getDuxo().refreshDiscovery();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Deeplink) {
            return ActionHandlingFragment2.handleDeeplink$default(this, ((GenericAction.Deeplink) action).getValue2(), null, 2, null);
        }
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getDuxo().getStates().blockingFirst().getSearchFocused()) {
            Editable text = getBinding().searchInputEdt.getText();
            if (text != null) {
                text.clear();
            }
            getDuxo().focusOnSearch(false);
            getBinding().searchInputEdt.clearFocus();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, getActivityCallbacks().getCoreDataObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchFragment.onCreate$lambda$1(this.f$0, (InvestFlowCoreData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(InvestFlowSearchFragment investFlowSearchFragment, InvestFlowCoreData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        investFlowSearchFragment.getDuxo().setSelectedItems(it.getSelectedItems());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        int color;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView recyclerView = getBinding().searchViewSuggestionRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, this.searchAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        if (DayNightChanges.isDay(getScarletManager())) {
            color = getResources().getColor(C11048R.color.background_color_primary_day, requireBaseActivity().getTheme());
        } else {
            color = getResources().getColor(C11048R.color.background_color_primary_night, requireBaseActivity().getTheme());
        }
        CartAccordionView cartAccordionView = getBinding().cart;
        cartAccordionView.setBackgroundColor(color);
        cartAccordionView.setCallbacks(this.cartCallbacks);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Editable text = getBinding().searchInputEdt.getText();
        if (text != null) {
            text.clear();
        }
        getDuxo().focusOnSearch(false);
        getBinding().searchInputEdt.clearFocus();
        RdsTextInputEditText searchInputEdt = getBinding().searchInputEdt;
        Intrinsics.checkNotNullExpressionValue(searchInputEdt, "searchInputEdt");
        Observable<R> map = RxTextView.textChanges(searchInputEdt).map(new Function() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment.onResume.1
            @Override // io.reactivex.functions.Function
            public final String apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt.trim(it.toString()).toString();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C194012(getDuxo()));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getBinding().searchInputEdt.focusChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSearchFragment.onResume$lambda$4(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C194024(this));
    }

    /* compiled from: InvestFlowSearchFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$onResume$2 */
    /* synthetic */ class C194012 extends FunctionReferenceImpl implements Function1<String, Unit> {
        C194012(Object obj) {
            super(1, obj, InvestFlowSearchDuxo.class, "search", "search(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestFlowSearchDuxo) this.receiver).search(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(InvestFlowSearchFragment investFlowSearchFragment, boolean z) {
        investFlowSearchFragment.getDuxo().focusOnSearch(z);
        return Unit.INSTANCE;
    }

    /* compiled from: InvestFlowSearchFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$onResume$4 */
    /* synthetic */ class C194024 extends FunctionReferenceImpl implements Function1<InvestFlowSearchViewState, Unit> {
        C194024(Object obj) {
            super(1, obj, InvestFlowSearchFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/investFlow/search/InvestFlowSearchViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvestFlowSearchViewState investFlowSearchViewState) throws Throwable {
            invoke2(investFlowSearchViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InvestFlowSearchViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestFlowSearchFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    @Override // com.robinhood.android.common.search.RhSearchAdapter.Callbacks
    public void onItemClicked(SearchItem searchItem) {
        Intrinsics.checkNotNullParameter(searchItem, "searchItem");
        if ((searchItem instanceof SearchItem.InstrumentResult) || (searchItem instanceof SearchItem.InstrumentPositionResult)) {
            getDuxo().searchItemTap(searchItem);
            return;
        }
        throw new IllegalStateException("SearchItem type not supported");
    }

    public final void toggleFadeLayer() {
        final View view = getBinding().fadeBackground;
        if (getBinding().cart.getIsExpanded()) {
            Intrinsics.checkNotNull(view);
            view.setVisibility(0);
            view.animate().alpha(0.9f);
            OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestFlowSearchFragment.toggleFadeLayer$lambda$6$lambda$5(this.f$0, view);
                }
            });
        } else {
            Intrinsics.checkNotNull(view);
            view.setVisibility(8);
        }
        getDuxo().enableSearchItems(!getBinding().cart.getIsExpanded());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleFadeLayer$lambda$6$lambda$5(InvestFlowSearchFragment investFlowSearchFragment, View view) {
        investFlowSearchFragment.getBinding().cart.setExpanded(false);
        Intrinsics.checkNotNull(view);
        view.setVisibility(8);
        return Unit.INSTANCE;
    }

    private final void updateCartView(List<? extends InvestFlowBasketItem> selectedItems) throws Resources.NotFoundException {
        CartAccordionView cartAccordionView = getBinding().cart;
        String quantityString = cartAccordionView.getResources().getQuantityString(C19349R.plurals.cart_primary_text, selectedItems.size(), String.valueOf(selectedItems.size()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (selectedItems.isEmpty()) {
            cartAccordionView.setCaretVisible(false);
            cartAccordionView.setPrimaryText(quantityString);
            cartAccordionView.setSecondaryTextCollapsed(cartAccordionView.getResources().getText(C19349R.string.cart_secondary_text_empty));
            cartAccordionView.setSecondaryTextExpanded(cartAccordionView.getResources().getText(C19349R.string.cart_secondary_text_empty));
        } else {
            cartAccordionView.setCaretVisible(true);
            cartAccordionView.setPrimaryText(cartAccordionView.getResources().getText(C19349R.string.cart_review_text));
            cartAccordionView.setSecondaryTextExpanded(quantityString);
            cartAccordionView.setSecondaryTextCollapsed(quantityString);
        }
        if (selectedItems.isEmpty() && getBinding().cart.getIsExpanded()) {
            getBinding().cart.setExpanded(false);
            toggleFadeLayer();
        }
        getBinding().cart.setContinueEnabled(!selectedItems.isEmpty());
        String string2 = getString(C19349R.string.cart_chips_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        List<? extends InvestFlowBasketItem> list = selectedItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestFlowBasketItem) it.next()).toCuratedListChipItem(true));
        }
        getBinding().cart.bind(new CartChipsViewData(string2, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final InvestFlowSearchViewState state) throws Throwable {
        Boolean boolConsume;
        Tuples2<String, EtpDetails> tuples2Consume;
        final InvestFlowBasketItem investFlowBasketItemConsume;
        StringResource stringResourceConsume;
        ScarletManager scarletManager;
        Tuples2<SearchItem, InstrumentRecurringTradability> tuples2Consume2;
        UUID id;
        boolean zIsChecked;
        SpannableString spannableString$default;
        updateCartView(state.getSelectedItems());
        RdsTextInputEditText rdsTextInputEditText = getBinding().searchInputEdt;
        StringResource searchInputEditHint = state.getSearchInputEditHint();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsTextInputEditText.setHint(searchInputEditHint.getText(resources));
        RecyclerView searchViewSuggestionRecyclerView = getBinding().searchViewSuggestionRecyclerView;
        Intrinsics.checkNotNullExpressionValue(searchViewSuggestionRecyclerView, "searchViewSuggestionRecyclerView");
        searchViewSuggestionRecyclerView.setVisibility(state.getSearchFocused() ? 0 : 8);
        ComposeView composeView = getBinding().composeView;
        Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
        composeView.setVisibility(!state.getSearchFocused() ? 0 : 8);
        UiEvent<Tuples2<SearchItem, InstrumentRecurringTradability>> searchItemTapEvent = state.getSearchItemTapEvent();
        if (searchItemTapEvent != null && (tuples2Consume2 = searchItemTapEvent.consume()) != null) {
            SearchItem searchItemComponent1 = tuples2Consume2.component1();
            InstrumentRecurringTradability instrumentRecurringTradabilityComponent2 = tuples2Consume2.component2();
            if (searchItemComponent1 instanceof SearchItem.InstrumentResult) {
                SearchItem.InstrumentResult instrumentResult = (SearchItem.InstrumentResult) searchItemComponent1;
                id = instrumentResult.getInstrument().getId();
                zIsChecked = instrumentResult.isChecked();
            } else if (searchItemComponent1 instanceof SearchItem.InstrumentPositionResult) {
                SearchItem.InstrumentPositionResult instrumentPositionResult = (SearchItem.InstrumentPositionResult) searchItemComponent1;
                id = instrumentPositionResult.getInstrument().getId();
                zIsChecked = instrumentPositionResult.isChecked();
            } else {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(searchItemComponent1);
                throw new ExceptionsH();
            }
            if (instrumentRecurringTradabilityComponent2.isRecurringTradable()) {
                Callbacks activityCallbacks = getActivityCallbacks();
                ApiAssetType apiAssetType = ApiAssetType.EQUITY;
                if (id == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("id");
                    id = null;
                }
                activityCallbacks.showEmbeddedDetail(apiAssetType, id, zIsChecked, new Function1() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestFlowSearchFragment.setViewState$lambda$11$lambda$9(this.f$0, (UUID) obj);
                    }
                });
            } else {
                InstrumentRecurringTradability.RecurringTradableReason reason = instrumentRecurringTradabilityComponent2.getReason();
                if (reason != null) {
                    String title = reason.getTitle();
                    RichText description = reason.getDescription();
                    if (description != null) {
                        Context contextRequireContext = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        spannableString$default = RichTexts.toSpannableString$default(description, contextRequireContext, null, false, null, 14, null);
                    } else {
                        spannableString$default = null;
                    }
                    showDisabledDialog(title, spannableString$default);
                } else {
                    showGenericDisabledDialog();
                }
            }
        }
        SearchStore3 searchResult = state.getSearchResult();
        if (searchResult instanceof SearchStore3.Loading) {
            requireBaseActivity().showProgressBar(true);
        } else if (searchResult instanceof SearchStore3.Error) {
            requireBaseActivity().showProgressBar(false);
            getActivityErrorHandler().invoke2(((SearchStore3.Error) state.getSearchResult()).getThrowable());
        } else if (searchResult instanceof SearchStore3.Success) {
            requireBaseActivity().showProgressBar(false);
            List<Instrument> supportedInstruments = SearchExtensions.getSupportedInstruments((SearchStore3.Success) state.getSearchResult(), state.getBrokerageAccountType());
            UiEvent<Boolean> enableSearchItemsEvent = state.getEnableSearchItemsEvent();
            if (enableSearchItemsEvent != null && (boolConsume = enableSearchItemsEvent.consume()) != null) {
                this.searchAdapter.submitList(state.instrumentSearchItemsWithCheck(supportedInstruments, state.getSelectedIds(), boolConsume.booleanValue()));
                return;
            }
            this.searchAdapter.submitList(state.instrumentSearchItemsWithCheck(supportedInstruments, state.getSelectedIds(), true));
        } else {
            if (searchResult != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (state.getSearchFocused()) {
                RhSearchAdapter rhSearchAdapter = this.searchAdapter;
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                rhSearchAdapter.submitList(state.instrumentPositionsItemsWithCheck(resources2, state.getSelectedIds()));
                ComposeView composeView2 = getBinding().composeView;
                Intrinsics.checkNotNullExpressionValue(composeView2, "composeView");
                composeView2.setVisibility(8);
                getDuxo().logSearchAppear();
            } else {
                requireBaseActivity().showProgressBar(false);
                this.searchAdapter.submitList(null);
            }
        }
        if (!state.getSearchFocused()) {
            ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
            if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
                scarletManager = getScarletManager();
            }
            final Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager);
            getBinding().composeView.setContent(ComposableLambda3.composableLambdaInstance(1629989383, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment.setViewState.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1629989383, i, -1, "com.robinhood.android.investFlow.search.InvestFlowSearchFragment.setViewState.<anonymous> (InvestFlowSearchFragment.kt:371)");
                    }
                    Observable<ThemesFromScarlet> observable = observableThemeChangesForCompose;
                    final InvestFlowSearchViewState investFlowSearchViewState = state;
                    final InvestFlowSearchFragment investFlowSearchFragment = this;
                    BentoTheme2.BentoTheme(observable, null, ComposableLambda3.rememberComposableLambda(-1705042119, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment.setViewState.3.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1705042119, i2, -1, "com.robinhood.android.investFlow.search.InvestFlowSearchFragment.setViewState.<anonymous>.<anonymous> (InvestFlowSearchFragment.kt:372)");
                            }
                            DiscoveryScreen4.DiscoveryScreen(investFlowSearchViewState.getDiscoveryState(), investFlowSearchFragment, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, InvestFlowConstants.INSTANCE.m2112xf5ebf6ab(), 7, null), composer2, 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        UiEvent<StringResource> errorToastEvent = state.getErrorToastEvent();
        if (errorToastEvent != null && (stringResourceConsume = errorToastEvent.consume()) != null) {
            InvestFlowActivityLoggingHelpers.INSTANCE.logMaxToast(getEventLogger());
            RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
            CoordinatorLayout investFlowSnackbarContainer = getBinding().investFlowSnackbarContainer;
            Intrinsics.checkNotNullExpressionValue(investFlowSnackbarContainer, "investFlowSnackbarContainer");
            Resources resources3 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            RdsSnackbar rdsSnackbarMake = companion.make(investFlowSnackbarContainer, stringResourceConsume.getText(resources3), 0);
            rdsSnackbarMake.setAnchorView(getBinding().investFlowSnackbarContainer);
            rdsSnackbarMake.setGestureInsetBottomIgnored(true);
            rdsSnackbarMake.show();
        }
        UiEvent<InvestFlowBasketItem> addedToastEvent = state.getAddedToastEvent();
        if (addedToastEvent != null && (investFlowBasketItemConsume = addedToastEvent.consume()) != null) {
            RdsSnackbar.Companion companion2 = RdsSnackbar.INSTANCE;
            CoordinatorLayout investFlowSnackbarContainer2 = getBinding().investFlowSnackbarContainer;
            Intrinsics.checkNotNullExpressionValue(investFlowSnackbarContainer2, "investFlowSnackbarContainer");
            String string2 = getString(C19349R.string.invest_flow_added_to_cart, investFlowBasketItemConsume.getSymbol());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            RdsSnackbar rdsSnackbarMake2 = companion2.make(investFlowSnackbarContainer2, string2, 0);
            rdsSnackbarMake2.setAnchorView(getBinding().investFlowSnackbarContainer);
            rdsSnackbarMake2.setGestureInsetBottomIgnored(true);
            rdsSnackbarMake2.setLeadingIcon(C20690R.drawable.ic_rds_checkmark_24dp);
            RdsSnackbar.setAction$default(rdsSnackbarMake2, C19349R.string.invest_flow_undo, false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestFlowSearchFragment.setViewState$lambda$17$lambda$16$lambda$15(investFlowBasketItemConsume, this);
                }
            }, 14, (Object) null);
            rdsSnackbarMake2.show();
        }
        UiEvent<Tuples2<String, EtpDetails>> viewProspectusEvent = state.getViewProspectusEvent();
        if (viewProspectusEvent != null && (tuples2Consume = viewProspectusEvent.consume()) != null) {
            String first = tuples2Consume.getFirst();
            final EtpDetails second = tuples2Consume.getSecond();
            EtpDocuments documents = second.getDocuments();
            final HttpUrl prospectus = documents != null ? documents.getProspectus() : null;
            Intrinsics.checkNotNull(prospectus);
            RdsSnackbar.Companion companion3 = RdsSnackbar.INSTANCE;
            CoordinatorLayout investFlowSnackbarContainer3 = getBinding().investFlowSnackbarContainer;
            Intrinsics.checkNotNullExpressionValue(investFlowSnackbarContainer3, "investFlowSnackbarContainer");
            String string3 = getString(C19349R.string.invest_flow_added_to_cart, first);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            RdsSnackbar rdsSnackbarMake3 = companion3.make(investFlowSnackbarContainer3, string3, 5000);
            rdsSnackbarMake3.setAnchorView(getBinding().investFlowSnackbarContainer);
            rdsSnackbarMake3.setGestureInsetBottomIgnored(true);
            rdsSnackbarMake3.setLeadingIcon(C20690R.drawable.ic_rds_checkmark_24dp);
            RdsSnackbar.setAction$default(rdsSnackbarMake3, C19349R.string.invest_flow_view_prospectus, false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestFlowSearchFragment.setViewState$lambda$21$lambda$20$lambda$19(this.f$0, second, prospectus);
                }
            }, 14, (Object) null);
            rdsSnackbarMake3.show();
        }
        getBinding().cart.setContinueOnClick(new Function0() { // from class: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowSearchFragment.setViewState$lambda$22(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$11$lambda$9(InvestFlowSearchFragment investFlowSearchFragment, UUID assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        InvestFlowSearchDuxo.onItemClicked$default(investFlowSearchFragment.getDuxo(), assetId, null, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$17$lambda$16$lambda$15(InvestFlowBasketItem investFlowBasketItem, InvestFlowSearchFragment investFlowSearchFragment) {
        UUID id = investFlowBasketItem.getId();
        investFlowSearchFragment.getDuxo().deleteItem(id);
        InvestFlowActivityLoggingHelpers.INSTANCE.logUndo(investFlowSearchFragment.getEventLogger(), id);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$21$lambda$20$lambda$19(InvestFlowSearchFragment investFlowSearchFragment, EtpDetails etpDetails, HttpUrl httpUrl) {
        InvestFlowActivityLoggingHelpers.INSTANCE.logProspectusToastTap(investFlowSearchFragment.getEventLogger(), etpDetails);
        investFlowSearchFragment.startActivity(new Intent("android.intent.action.VIEW", HttpUrl2.toAndroidUri(httpUrl)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$22(InvestFlowSearchFragment investFlowSearchFragment, InvestFlowSearchViewState investFlowSearchViewState) {
        investFlowSearchFragment.getActivityCallbacks().completeSearch(investFlowSearchViewState.getSelectedItems());
        return Unit.INSTANCE;
    }

    private final void showDisabledDialog(CharSequence title, CharSequence message) {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, title, null, message, null, getResources().getString(C11048R.string.general_label_dismiss), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null));
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        rhBottomSheetDialogFragment.show(parentFragmentManager, "recurringDisabled");
    }

    private final void showGenericDisabledDialog() {
        showDisabledDialog(getResources().getString(C19349R.string.search_disabled_dialog_title), getResources().getString(C19349R.string.search_disabled_dialog_description));
    }

    /* compiled from: InvestFlowSearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/InvestFlowSearchFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investFlow/search/InvestFlowSearchFragment;", "Lcom/robinhood/android/investFlow/search/InvestFlowSearchArgs;", "<init>", "()V", "newInstance", "VIEW_PROSPECTUS_SNACKBAR_LEN_LONG_MS", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestFlowSearchFragment, InvestFlowSearchArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestFlowSearchArgs getArgs(InvestFlowSearchFragment investFlowSearchFragment) {
            return (InvestFlowSearchArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investFlowSearchFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestFlowSearchFragment newInstance(InvestFlowSearchArgs investFlowSearchArgs) {
            return (InvestFlowSearchFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investFlowSearchArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestFlowSearchFragment investFlowSearchFragment, InvestFlowSearchArgs investFlowSearchArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investFlowSearchFragment, investFlowSearchArgs);
        }

        public final InvestFlowSearchFragment newInstance() {
            return new InvestFlowSearchFragment();
        }
    }
}
