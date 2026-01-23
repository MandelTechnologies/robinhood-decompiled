package com.robinhood.android.common.recurring.trade.confirmation;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.trade.RecurringOrderManager;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationViewState;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.RebrandBackgroundOverlay;
import com.robinhood.android.designsystem.style.RebrandPrimaryToolbarOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowItem;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowView;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecurringOrderConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 [2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002Z[B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0016J\u001a\u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020IH\u0016J\b\u0010R\u001a\u00020IH\u0016J\b\u0010S\u001a\u000205H\u0016J\u0010\u0010T\u001a\u00020I2\u0006\u0010U\u001a\u00020\u0002H\u0016J\b\u0010V\u001a\u00020IH\u0002J\u0010\u0010W\u001a\u00020I2\u0006\u0010X\u001a\u00020YH\u0002R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b'\u0010$R\u001b\u0010)\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b*\u0010$R\u001b\u0010,\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b-\u0010$R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b1\u00102R\u0014\u00104\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00106R\u001b\u00107\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001a\u001a\u0004\b7\u00106R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u001a\u001a\u0004\b9\u00106R\u0014\u0010;\u001a\u00020<X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00106R'\u0010A\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D0B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u001a\u001a\u0004\bE\u0010F¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;", "<init>", "()V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "orderManager", "getOrderManager", "()Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;", "setOrderManager", "(Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "duxo", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "descriptionTxt", "getDescriptionTxt", "descriptionTxt$delegate", WiresInvalidAccountContentComposable.PrimaryButtonTag, "getPrimaryButton", "primaryButton$delegate", "secondaryBtn", "getSecondaryBtn", "secondaryBtn$delegate", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "isCrypto", "", "()Z", "isCryptoOrder", "isCryptoOrder$delegate", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "isBrokerageCashTransfer$delegate", "confirmationLayoutId", "", "getConfirmationLayoutId", "()I", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRowView;", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRowItem;", "getAdapter", "()Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "adapter$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStop", "onBackPressed", "onOrderReceived", Card.Icon.ORDER, "updateViewForRebrand", "setViewState", "state", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState;", "Callbacks", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderConfirmationFragment extends BaseOrderConfirmationFragment<InvestmentSchedule, RecurringOrderManager> {
    public static final String ARG_IS_BROKERAGE_CASH_TRANSFER = "isBrokerageCashTransfer";
    public static final String ARG_IS_CRYPTO = "isCrypto";
    public RecurringOrderManager orderManager;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringOrderConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderConfirmationFragment.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderConfirmationFragment.class, "descriptionTxt", "getDescriptionTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderConfirmationFragment.class, WiresInvalidAccountContentComposable.PrimaryButtonTag, "getPrimaryButton()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderConfirmationFragment.class, "secondaryBtn", "getSecondaryBtn()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderConfirmationFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, RecurringOrderConfirmationDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt = bindView(C11595R.id.order_title_txt);

    /* renamed from: descriptionTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 descriptionTxt = bindView(C11595R.id.order_description_txt);

    /* renamed from: primaryButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 primaryButton = bindView(C11595R.id.primary_btn);

    /* renamed from: secondaryBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 secondaryBtn = bindView(C11595R.id.secondary_btn);

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView = bindView(C11595R.id.recycler_view);

    /* renamed from: isCryptoOrder$delegate, reason: from kotlin metadata */
    private final Lazy isCryptoOrder = Fragments2.argument(this, "isCrypto");

    /* renamed from: isBrokerageCashTransfer$delegate, reason: from kotlin metadata */
    private final Lazy isBrokerageCashTransfer = Fragments2.argument(this, ARG_IS_BROKERAGE_CASH_TRANSFER);
    private final int confirmationLayoutId = C11595R.layout.include_recurring_order_confirmation_layout;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecurringOrderConfirmationFragment.adapter_delegate$lambda$0();
        }
    });

    /* compiled from: RecurringOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationFragment$Callbacks;", "", "onOrderCompleted", "", "onSecondaryButtonClicked", "secondaryButtonState", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOrderCompleted();

        void onSecondaryButtonClicked(RecurringOrderConfirmationViewState.SecondaryButtonState secondaryButtonState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return Screen.Name.EQUITY_ORDER_RECEIPT.toString();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public RecurringOrderManager getOrderManager() {
        RecurringOrderManager recurringOrderManager = this.orderManager;
        if (recurringOrderManager != null) {
            return recurringOrderManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(RecurringOrderManager recurringOrderManager) {
        Intrinsics.checkNotNullParameter(recurringOrderManager, "<set-?>");
        this.orderManager = recurringOrderManager;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final RecurringOrderConfirmationDuxo getDuxo() {
        return (RecurringOrderConfirmationDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getDescriptionTxt() {
        return (TextView) this.descriptionTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getPrimaryButton() {
        return (TextView) this.primaryButton.getValue(this, $$delegatedProperties[3]);
    }

    private final TextView getSecondaryBtn() {
        return (TextView) this.secondaryBtn.getValue(this, $$delegatedProperties[4]);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[5]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        return isCryptoOrder();
    }

    private final boolean isCryptoOrder() {
        return ((Boolean) this.isCryptoOrder.getValue()).booleanValue();
    }

    private final boolean isBrokerageCashTransfer() {
        return ((Boolean) this.isBrokerageCashTransfer.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public int getConfirmationLayoutId() {
        return this.confirmationLayoutId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericListAdapter adapter_delegate$lambda$0() {
        return GenericListAdapter.INSTANCE.m2986of(OrderConfirmationRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE);
    }

    private final GenericListAdapter<OrderConfirmationRowView, OrderConfirmationRowItem> getAdapter() {
        return (GenericListAdapter) this.adapter.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        if (isBrokerageCashTransfer()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        } else {
            putAchromaticOverlay(scarletContextWrapper);
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), RebrandBackgroundOverlay.INSTANCE, null, 2, null);
        }
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        bindAdapter(getRecyclerView(), getAdapter());
        updateViewForRebrand();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getUserLeapManager().presentSurveyIfNecessary(this, Survey.RECURRING_INVESTMENTS_CREATE);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C117871(this));
    }

    /* compiled from: RecurringOrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment$onResume$1 */
    /* synthetic */ class C117871 extends FunctionReferenceImpl implements Function1<RecurringOrderConfirmationViewState, Unit> {
        C117871(Object obj) {
            super(1, obj, RecurringOrderConfirmationFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringOrderConfirmationViewState recurringOrderConfirmationViewState) {
            invoke2(recurringOrderConfirmationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringOrderConfirmationViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringOrderConfirmationFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireBaseActivity().resetSystemBarsStyleOverride();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getConfirmedOrder() == null) {
            return true;
        }
        getCallbacks().onOrderCompleted();
        return true;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public void onOrderReceived(InvestmentSchedule order) {
        Intrinsics.checkNotNullParameter(order, "order");
        getDuxo().onOrderReceived(order);
        OnClickListeners.onClick(getPrimaryButton(), new Function0() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderConfirmationFragment.onOrderReceived$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReceived$lambda$2(RecurringOrderConfirmationFragment recurringOrderConfirmationFragment) {
        recurringOrderConfirmationFragment.getCallbacks().onOrderCompleted();
        return Unit.INSTANCE;
    }

    private final void updateViewForRebrand() {
        Toolbar toolbar;
        ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
        ThemedResourceReference<Integer> color_background_primary = themeAttributes.getCOLOR_BACKGROUND_PRIMARY();
        ThemedResourceReference<Integer> color_on_background_primary = themeAttributes.getCOLOR_ON_BACKGROUND_PRIMARY();
        requireBaseActivity().overrideSystemBarsStyle(false);
        ScarletManager2.overrideAttribute(getRoot(), R.attr.backgroundTint, color_background_primary);
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null && (toolbar = rhToolbar.getToolbar()) != null) {
            ScarletManager2.overrideAttribute(toolbar, R$attr.colorControlNormal, color_on_background_primary);
        }
        ScarletManager.putOverlay$default(getScarletManager(), RebrandPrimaryToolbarOverlay.INSTANCE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(RecurringOrderConfirmationViewState state) {
        TextView titleTxt = getTitleTxt();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        titleTxt.setText(state.getOrderTitle(resources));
        getSecondaryBtn().setText(state.getViewOrderRes());
        TextView descriptionTxt = getDescriptionTxt();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        descriptionTxt.setText(state.getOrderDescription(resources2));
        GenericListAdapter<OrderConfirmationRowView, OrderConfirmationRowItem> adapter = getAdapter();
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        adapter.submitList(state.getOrderConfirmationRowItems(resources3));
        TextView secondaryBtn = getSecondaryBtn();
        final RecurringOrderConfirmationViewState.SecondaryButtonState secondaryButtonState = state.getSecondaryButtonState();
        TextViewsKt.setVisibilityText(secondaryBtn, secondaryButtonState != null ? getString(secondaryButtonState.getTextResource()) : null);
        OnClickListeners.onClick(secondaryBtn, new Function0() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderConfirmationFragment.setViewState$lambda$5$lambda$4(this.f$0, secondaryButtonState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$5$lambda$4(RecurringOrderConfirmationFragment recurringOrderConfirmationFragment, RecurringOrderConfirmationViewState.SecondaryButtonState secondaryButtonState) {
        Callbacks callbacks = recurringOrderConfirmationFragment.getCallbacks();
        if (secondaryButtonState == null) {
            throw new IllegalStateException("Secondary button is not supposed to be clickable without a button state!");
        }
        callbacks.onSecondaryButtonClicked(secondaryButtonState);
        return Unit.INSTANCE;
    }

    /* compiled from: RecurringOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationFragment$Companion;", "", "<init>", "()V", "ARG_IS_CRYPTO", "", "ARG_IS_BROKERAGE_CASH_TRANSFER", "newInstance", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationFragment;", "isCrypto", "", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RecurringOrderConfirmationFragment newInstance(boolean isCrypto, boolean isBrokerageCashTransfer) {
            RecurringOrderConfirmationFragment recurringOrderConfirmationFragment = new RecurringOrderConfirmationFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isCrypto", isCrypto);
            bundle.putBoolean(RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, isBrokerageCashTransfer);
            recurringOrderConfirmationFragment.setArguments(bundle);
            return recurringOrderConfirmationFragment;
        }
    }
}
