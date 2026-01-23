package com.robinhood.android.history.p153ui;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.extensions.Breadcrumbs2;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButtonContainerView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.FragmentOrderDetailBinding;
import com.robinhood.android.history.databinding.IncludeOrderDetailViewServerDrivenBinding;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.portfolio.contracts.PnlTradeDetailDialogFragmentKey;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.android.trading.contracts.CancelIpoOrderDialogKey;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.directipo.models.DirectIpoOrderSource;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.equities.history.C33130R;
import com.robinhood.equities.history.OrderDetailView;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.serverdriven.p347db.StandardRow;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: OrderDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001SB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020AH\u0016J\u001a\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0010\u0010I\u001a\u00020A2\u0006\u0010J\u001a\u00020DH\u0016J\b\u0010K\u001a\u00020AH\u0016J\u0018\u0010L\u001a\u00020A2\u0006\u0010M\u001a\u00020*2\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020A2\u0006\u0010Q\u001a\u00020RH\u0002R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002030(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002050(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OrderDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey$Callbacks;", "Lcom/robinhood/equities/history/OrderDetailView$Callbacks;", "Lcom/robinhood/android/common/util/UiCallbacks$ProgressDisplay;", "Lcom/robinhood/android/lib/breadcrumbs/AutomaticBreadcrumbProvider;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/history/ui/OrderDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/history/ui/OrderDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "bindings", "Lcom/robinhood/android/history/databinding/FragmentOrderDetailBinding;", "getBindings", "()Lcom/robinhood/android/history/databinding/FragmentOrderDetailBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "standardOrderContainerBindings", "Landroid/view/View;", "getStandardOrderContainerBindings", "()Landroid/view/View;", "ipoOrderContainerBindings", "Lcom/robinhood/android/history/databinding/IncludeOrderDetailViewServerDrivenBinding;", "getIpoOrderContainerBindings", "()Lcom/robinhood/android/history/databinding/IncludeOrderDetailViewServerDrivenBinding;", "bannerAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "", "itemsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "Lcom/robinhood/models/serverdriven/db/StandardRow;", "editOrderButtonAdapter", "Lcom/robinhood/android/designsystem/button/RdsButtonContainerView;", "Ljava/util/UUID;", "cancelOrderButtonAdapter", "Lcom/robinhood/android/history/ui/CancelOrderData;", "viewTradeConfirmationButtonAdapter", "Lcom/robinhood/models/db/Document;", "contentAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "buttonAdapter", "revealTransitionName", "getRevealTransitionName", "()Ljava/lang/String;", "breadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "getBreadcrumb", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "onStart", "", "onStop", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "Landroid/os/Bundle;", "showLoading", "loading", "onOrderCancelled", "onShowProfitAndLossDetail", "accountNumber", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "bind", "state", "Lcom/robinhood/android/history/ui/OrderDetailViewState;", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OrderDetailFragment extends BaseDetailFragment implements CancelIpoOrderDialogKey.Callbacks, OrderDetailView.Callbacks, UiCallbacks.ProgressDisplay, SupportBreadcrumbTracker2, AutoLoggableFragment {
    private final SingleItemAdapter<RdsInfoBannerView, String> bannerAdapter;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    private final CompositeAdapter buttonAdapter;
    private final SingleItemAdapter<RdsButtonContainerView, CancelOrderData> cancelOrderButtonAdapter;
    private final CompositeAdapter contentAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final SingleItemAdapter<RdsButtonContainerView, UUID> editOrderButtonAdapter;
    private final GenericListAdapter<RdsDataRowView, StandardRow> itemsAdapter;
    public Markwon markwon;
    private final SingleItemAdapter<RdsButtonContainerView, Document> viewTradeConfirmationButtonAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderDetailFragment.class, "bindings", "getBindings()Lcom/robinhood/android/history/databinding/FragmentOrderDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public OrderDetailFragment() {
        super(C18359R.layout.fragment_order_detail);
        this.duxo = OldDuxos.oldDuxo(this, OrderDetailDuxo.class);
        this.bindings = ViewBinding5.viewBinding(this, OrderDetailFragment2.INSTANCE);
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        SingleItemAdapter<RdsInfoBannerView, String> singleItemAdapterM2991of = companion.m2991of(C18359R.layout.include_order_detail_banner_view, DiffCallbacks.Single.INSTANCE, new Function2() { // from class: com.robinhood.android.history.ui.OrderDetailFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailFragment.bannerAdapter$lambda$0(this.f$0, (RdsInfoBannerView) obj, (String) obj2);
            }
        });
        this.bannerAdapter = singleItemAdapterM2991of;
        GenericListAdapter.Companion companion2 = GenericListAdapter.INSTANCE;
        RdsDataRowView.Companion companion3 = RdsDataRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        GenericListAdapter<RdsDataRowView, StandardRow> genericListAdapterM2987of = companion2.m2987of(companion3, equality, new Function2() { // from class: com.robinhood.android.history.ui.OrderDetailFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailFragment.itemsAdapter$lambda$1((RdsDataRowView) obj, (StandardRow) obj2);
            }
        });
        this.itemsAdapter = genericListAdapterM2987of;
        SingleItemAdapter<RdsButtonContainerView, UUID> singleItemAdapterM2991of2 = companion.m2991of(C13997R.layout.include_rds_button_filled_primary_in_container, equality, new Function2() { // from class: com.robinhood.android.history.ui.OrderDetailFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailFragment.editOrderButtonAdapter$lambda$3(this.f$0, (RdsButtonContainerView) obj, (UUID) obj2);
            }
        });
        this.editOrderButtonAdapter = singleItemAdapterM2991of2;
        SingleItemAdapter<RdsButtonContainerView, CancelOrderData> singleItemAdapterM2991of3 = companion.m2991of(C13997R.layout.include_rds_button_filled_primary_in_container, equality, new Function2() { // from class: com.robinhood.android.history.ui.OrderDetailFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailFragment.cancelOrderButtonAdapter$lambda$5(this.f$0, (RdsButtonContainerView) obj, (CancelOrderData) obj2);
            }
        });
        this.cancelOrderButtonAdapter = singleItemAdapterM2991of3;
        SingleItemAdapter<RdsButtonContainerView, Document> singleItemAdapterM2991of4 = companion.m2991of(C13997R.layout.include_rds_button_primary_in_container, equality, new Function2() { // from class: com.robinhood.android.history.ui.OrderDetailFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailFragment.viewTradeConfirmationButtonAdapter$lambda$7(this.f$0, (RdsButtonContainerView) obj, (Document) obj2);
            }
        });
        this.viewTradeConfirmationButtonAdapter = singleItemAdapterM2991of4;
        this.contentAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterM2991of, genericListAdapterM2987of});
        this.buttonAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterM2991of2, singleItemAdapterM2991of3, singleItemAdapterM2991of4});
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.EQUITY_ORDER_DETAIL;
        String string2 = ((OrderDetailArgs) INSTANCE.getArgs((Fragment) this)).getOrderId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    private final OrderDetailDuxo getDuxo() {
        return (OrderDetailDuxo) this.duxo.getValue();
    }

    private final FragmentOrderDetailBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOrderDetailBinding) value;
    }

    private final View getStandardOrderContainerBindings() {
        View legacyContainer = getBindings().legacyContainer;
        Intrinsics.checkNotNullExpressionValue(legacyContainer, "legacyContainer");
        return legacyContainer;
    }

    private final IncludeOrderDetailViewServerDrivenBinding getIpoOrderContainerBindings() {
        IncludeOrderDetailViewServerDrivenBinding serverDrivenContainer = getBindings().serverDrivenContainer;
        Intrinsics.checkNotNullExpressionValue(serverDrivenContainer, "serverDrivenContainer");
        return serverDrivenContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bannerAdapter$lambda$0(OrderDetailFragment orderDetailFragment, RdsInfoBannerView of, String bannerMarkdown) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(bannerMarkdown, "bannerMarkdown");
        of.setTextColorLink(new ThemedResourceReference(ResourceType.COLOR.INSTANCE, R.attr.colorPrimary));
        of.setText(orderDetailFragment.getMarkwon().toMarkdown(bannerMarkdown));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit itemsAdapter$lambda$1(RdsDataRowView of, StandardRow item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setLabelText(item.getLabel());
        of.setValueText(item.getValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit editOrderButtonAdapter$lambda$3(final OrderDetailFragment orderDetailFragment, RdsButtonContainerView of, final UUID instrumentId) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        of.getButton().setText(of.getResources().getString(C18359R.string.server_driven_order_detail_edit_button));
        OnClickListeners.onClick(of.getButton(), new Function0() { // from class: com.robinhood.android.history.ui.OrderDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.editOrderButtonAdapter$lambda$3$lambda$2(this.f$0, instrumentId);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit editOrderButtonAdapter$lambda$3$lambda$2(OrderDetailFragment orderDetailFragment, UUID uuid) {
        Navigator navigator = orderDetailFragment.getNavigator();
        android.content.Context contextRequireContext = orderDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new EquityOrderActivityIntentKey.DirectIpo(uuid, EquityOrderFlowSource.ORDER_DETAIL_IPO_EDIT, DirectIpoOrderSource.ORDER_DETAIL), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelOrderButtonAdapter$lambda$5(final OrderDetailFragment orderDetailFragment, RdsButtonContainerView of, final CancelOrderData cancelOrderData) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(cancelOrderData, "cancelOrderData");
        of.getButton().setText(of.getResources().getString(C18359R.string.server_driven_order_detail_cancel_button));
        OnClickListeners.onClick(of.getButton(), new Function0() { // from class: com.robinhood.android.history.ui.OrderDetailFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.cancelOrderButtonAdapter$lambda$5$lambda$4(this.f$0, cancelOrderData);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelOrderButtonAdapter$lambda$5$lambda$4(OrderDetailFragment orderDetailFragment, CancelOrderData cancelOrderData) {
        Navigator.DefaultImpls.createDialogFragment$default(orderDetailFragment.getNavigator(), new CancelIpoOrderDialogKey(((OrderDetailArgs) INSTANCE.getArgs((Fragment) orderDetailFragment)).getOrderId(), cancelOrderData.getBrokerageAccountType(), CancelIpoOrderDialogKey.Source.ORDER_DETAIL, cancelOrderData.getSharesQuantity(), cancelOrderData.getSymbol(), cancelOrderData.getOrderSide()), null, 2, null).show(orderDetailFragment.getChildFragmentManager(), "order-detail-cancel-order-dialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewTradeConfirmationButtonAdapter$lambda$7(final OrderDetailFragment orderDetailFragment, RdsButtonContainerView of, final Document document) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(document, "document");
        of.getButton().setText(of.getResources().getString(C18359R.string.server_driven_order_detail_trade_confirmation_button));
        OnClickListeners.onClick(of.getButton(), new Function0() { // from class: com.robinhood.android.history.ui.OrderDetailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.viewTradeConfirmationButtonAdapter$lambda$7$lambda$6(this.f$0, document);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewTradeConfirmationButtonAdapter$lambda$7$lambda$6(OrderDetailFragment orderDetailFragment, Document document) {
        Navigator navigator = orderDetailFragment.getNavigator();
        android.content.Context contextRequireContext = orderDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new DocumentDownloadKey(document, DocumentDownloadLaunchMode.OPEN, null, false, 12, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = ((OrderDetailArgs) INSTANCE.getArgs((Fragment) this)).getOrderId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2
    public SupportBreadcrumb getBreadcrumb() {
        return Breadcrumbs2.createBreadcrumb(this, SupportBreadcrumbType.INVESTING_STOCKS_ORDERS, ((OrderDetailArgs) INSTANCE.getArgs((Fragment) this)).getOrderId());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_DETAIL_LOADING_ORDER, true);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C184121(this));
        View standardOrderContainerBindings = getStandardOrderContainerBindings();
        Intrinsics.checkNotNull(standardOrderContainerBindings, "null cannot be cast to non-null type com.robinhood.equities.history.OrderDetailView");
        OrderDetailView orderDetailView = (OrderDetailView) standardOrderContainerBindings;
        orderDetailView.bindOrder(((OrderDetailArgs) INSTANCE.getArgs((Fragment) this)).getOrderId());
        orderDetailView.setProgressDisplay(this);
        orderDetailView.setCallbacks(this);
        RecyclerView recyclerView = getIpoOrderContainerBindings().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        bindAdapter(recyclerView, this.contentAdapter);
        RecyclerView buttonRecyclerView = getIpoOrderContainerBindings().buttonRecyclerView;
        Intrinsics.checkNotNullExpressionValue(buttonRecyclerView, "buttonRecyclerView");
        bindAdapter(buttonRecyclerView, this.buttonAdapter);
    }

    /* compiled from: OrderDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.ui.OrderDetailFragment$onStart$1 */
    /* synthetic */ class C184121 extends FunctionReferenceImpl implements Function1<OrderDetailViewState, Unit> {
        C184121(Object obj) {
            super(1, obj, OrderDetailFragment.class, "bind", "bind(Lcom/robinhood/android/history/ui/OrderDetailViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OrderDetailViewState orderDetailViewState) throws Resources.NotFoundException {
            invoke2(orderDetailViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OrderDetailViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OrderDetailFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        View standardOrderContainerBindings = getStandardOrderContainerBindings();
        Intrinsics.checkNotNull(standardOrderContainerBindings, "null cannot be cast to non-null type com.robinhood.equities.history.OrderDetailView");
        ((OrderDetailView) standardOrderContainerBindings).setProgressDisplay(null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C33130R.id.dialog_id_regulatory_fee) {
            String string2 = getString(C18359R.string.order_detail_regulatory_fee_disclaimer_url);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ProgressDisplay
    public void showLoading(boolean loading) {
        if (loading) {
            getBindings().loadingView.show();
        } else {
            getBindings().loadingView.hide();
        }
    }

    @Override // com.robinhood.android.trading.contracts.CancelIpoOrderDialogKey.Callbacks
    public void onOrderCancelled() {
        getDuxo().refreshOrderDetail(((OrderDetailArgs) INSTANCE.getArgs((Fragment) this)).getOrderId(), true);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Snackbars.show(fragmentActivityRequireActivity, C18359R.string.order_detail_order_canceled_confirmation_message, 0);
    }

    @Override // com.robinhood.equities.history.OrderDetailView.Callbacks
    public void onShowProfitAndLossDetail(String accountNumber, ProfitAndLossTradeItem item) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(item, "item");
        if (getChildFragmentManager().findFragmentByTag("pnl-detail") == null) {
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new PnlTradeDetailDialogFragmentKey(accountNumber, item, new Screen(Screen.Name.EQUITY_ORDER_DETAIL, null, null, null, 14, null), true, false, getDuxo().getStatesFlow().getValue().getPnlUpdatesEnabled(), 16, null), null, 2, null).show(getChildFragmentManager(), "pnl-detail");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final OrderDetailViewState state) throws Resources.NotFoundException {
        CharSequence text;
        TextView expandedToolbarTitleTxt = getExpandedToolbarTitleTxt();
        StringResource stringResource = state.toolbarTitle();
        if (stringResource != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = stringResource.getText(resources);
        } else {
            text = null;
        }
        expandedToolbarTitleTxt.setText(text);
        TextViewsKt.setVisibilityText(getExpandedToolbarSubtitleTxt(), state.getToolbarSubtitle());
        String underlyingEquity = state.getUnderlyingEquity();
        if (underlyingEquity != null) {
            setUnderlyingEquity(underlyingEquity, state.getInstrumentId());
        }
        ConstraintLayout root = getIpoOrderContainerBindings().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(state.isIpoOrderContainerVisible() ? 0 : 8);
        this.bannerAdapter.setData(state.getServerDrivenBannerText());
        this.itemsAdapter.submitList(state.getItems());
        this.editOrderButtonAdapter.setData(state.getShowEditButtonForServerDrivenContainer() ? state.getInstrumentId() : null);
        this.cancelOrderButtonAdapter.setData(state.getServerDrivenCancelOrderData());
        this.viewTradeConfirmationButtonAdapter.setData(state.getServerDrivenTradeConfirmationDocument());
        if (state.getTaxLotRow() != null) {
            View standardOrderContainerBindings = getStandardOrderContainerBindings();
            Intrinsics.checkNotNull(standardOrderContainerBindings, "null cannot be cast to non-null type com.robinhood.equities.history.OrderDetailView");
            ((OrderDetailView) standardOrderContainerBindings).setTaxLotRowData(state.getTaxLotRow().getTitle(), state.getTaxLotRow().getSubtitle(), new Function0() { // from class: com.robinhood.android.history.ui.OrderDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.bind$lambda$10(this.f$0, state);
                }
            });
        }
        getStandardOrderContainerBindings().setVisibility(state.isStandardOrderContainerVisible() ? 0 : 8);
        setAccountNumber(state.getAccountNumber());
        if (state.isOrderLoaded()) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_DETAIL_LOADING_ORDER, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$10(OrderDetailFragment orderDetailFragment, OrderDetailViewState orderDetailViewState) {
        Navigator navigator = orderDetailFragment.getNavigator();
        android.content.Context contextRequireContext = orderDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, orderDetailViewState.getTaxLotRow().getViewLotsKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* compiled from: OrderDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OrderDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/history/ui/OrderDetailFragment;", "Lcom/robinhood/android/history/ui/OrderDetailArgs;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OrderDetailFragment, OrderDetailArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OrderDetailArgs getArgs(OrderDetailFragment orderDetailFragment) {
            return (OrderDetailArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, orderDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OrderDetailFragment newInstance(OrderDetailArgs orderDetailArgs) {
            return (OrderDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, orderDetailArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OrderDetailFragment orderDetailFragment, OrderDetailArgs orderDetailArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, orderDetailFragment, orderDetailArgs);
        }
    }
}
