package com.robinhood.android.cash.transaction.p079ui;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.appbar.AppBarLayout;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.view.ViewLayoutChangeEvent;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.address.lib.p061ui.MapViews;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.cash.transaction.databinding.FragmentCardTransactionDetailBinding;
import com.robinhood.android.cash.transaction.p079ui.CardTransactionDetailViewState2;
import com.robinhood.android.cash.transaction.p079ui.CardTransactionDetailViewState3;
import com.robinhood.android.cash.transaction.p079ui.FraudPromptView;
import com.robinhood.android.cash.transaction.p079ui.category.MerchantCategory;
import com.robinhood.android.cash.transaction.p079ui.dispute.DisputeRowView;
import com.robinhood.android.cash.transaction.p079ui.dispute.TransactionDisputesView;
import com.robinhood.android.cash.transaction.p079ui.reward.CardTransactionRewardsBottomSheetFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.view.StyleableMapView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.history.contracts.CashManagementCardTransactionDetailV2FragmentKey;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.mcduckling.res.C21654R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.MerchantReward;
import com.robinhood.models.p320db.mcduckling.Dispute;
import com.robinhood.models.p320db.mcduckling.Merchant;
import com.robinhood.models.p320db.mcduckling.MerchantCardReward;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p320db.mcduckling.p321ui.UiMerchant;
import com.robinhood.models.util.gis.LatLng;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples3;
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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: CardTransactionDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002opB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J\u001a\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020<H\u0016J\b\u0010H\u001a\u00020<H\u0016J\u0010\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020KH\u0002J\b\u0010L\u001a\u00020<H\u0016J\b\u0010M\u001a\u00020<H\u0016J\u0010\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020PH\u0016J\b\u0010Q\u001a\u00020<H\u0002J\u0010\u0010R\u001a\u00020<2\u0006\u0010S\u001a\u00020TH\u0002J\u0018\u0010U\u001a\u00020<2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020WH\u0002J\b\u0010Y\u001a\u00020<H\u0002J\u0010\u0010Z\u001a\u00020<2\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010[\u001a\u00020<H\u0002J\u001a\u0010\\\u001a\u0002062\u0006\u0010]\u001a\u00020(2\b\u0010^\u001a\u0004\u0018\u00010CH\u0016J\u001a\u0010_\u001a\u0002062\u0006\u0010]\u001a\u00020(2\b\u0010^\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010`\u001a\u00020<2\u0006\u0010a\u001a\u00020bH\u0016J\u0010\u0010c\u001a\u00020<2\u0006\u0010d\u001a\u00020PH\u0002J\u0016\u0010e\u001a\u00020<2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020h0gH\u0002J\t\u0010i\u001a\u000206H\u0096\u0001R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020402X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010j\u001a\b\u0012\u0004\u0012\u00020l0kX\u0096\u0005¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006q"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/cash/transaction/ui/FraudPromptView$Callbacks;", "Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView$Callbacks;", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetFragment$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "setEventScreen", "(Lcom/robinhood/rosetta/eventlogging/Screen;)V", "duxo", "Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/cash/transaction/databinding/FragmentCardTransactionDetailBinding;", "getBinding", "()Lcom/robinhood/android/cash/transaction/databinding/FragmentCardTransactionDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "negativeColor", "", "getNegativeColor", "()I", "negativeColor$delegate", "boldTypeface", "Landroid/graphics/Typeface;", "getBoldTypeface", "()Landroid/graphics/Typeface;", "boldTypeface$delegate", "lineItemAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "mapPulldownAnimator", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "onDestroyView", "bind", "state", "Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailViewState;", "onConfirmTransaction", "onDenyTransaction", "onCancelDispute", "disputeId", "Ljava/util/UUID;", "showCardLockedDialog", "showPurchaseEnabledDialog", "result", "Lcom/robinhood/android/cash/transaction/ui/FraudActionResult$PurchaseEnabled;", "showDescriptionDialog", "title", "", "message", "showDisputeTransactionPendingDialog", "showDisputeCancelConfirmationDialog", "showDisputeCancelErrorDialog", "onPositiveButtonClicked", "id", "passthroughArgs", "onNegativeButtonClicked", "onSelectReward", "reward", "Lcom/robinhood/models/db/MerchantReward;", "showMerchantReward", "merchantRewardId", "showMerchantRewards", "merchantRewards", "", "Lcom/robinhood/models/db/mcduckling/MerchantCardReward;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CardTransactionDetailFragment extends BaseFragment implements RegionGated, AutoLoggableFragment, FraudPromptView.Callbacks, DisputeRowView.Callbacks, CardTransactionRewardsBottomSheetFragment.Callbacks {
    private static final String CANCEL_DISPUTE_DIALOG_PASSTHROUGH_ID = "cancelDisputeDialogPassthroughId";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: boldTypeface$delegate, reason: from kotlin metadata */
    private final Lazy boldTypeface;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private Screen eventScreen;
    public HistoryNavigator historyNavigator;
    private final GenericListAdapter<RdsDataRowView, TransactionLineItem> lineItemAdapter;
    private final AppBarLayout.OnOffsetChangedListener mapPulldownAnimator;

    /* renamed from: negativeColor$delegate, reason: from kotlin metadata */
    private final Lazy negativeColor;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardTransactionDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/transaction/databinding/FragmentCardTransactionDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

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

    public CardTransactionDetailFragment() {
        super(C10421R.layout.fragment_card_transaction_detail);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.eventScreen = new Screen(Screen.Name.TRANSACTION_DETAIL_PAGE, null, null, null, 14, null);
        this.duxo = OldDuxos.oldDuxo(this, CardTransactionDetailDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, CardTransactionDetailFragment2.INSTANCE);
        this.negativeColor = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(CardTransactionDetailFragment.negativeColor_delegate$lambda$0(this.f$0));
            }
        });
        this.boldTypeface = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardTransactionDetailFragment.boldTypeface_delegate$lambda$1(this.f$0);
            }
        });
        this.lineItemAdapter = GenericListAdapter.INSTANCE.m2987of(RdsDataRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$lineItemAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((TransactionLineItem) obj).getTitle();
            }
        }), new Function2() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CardTransactionDetailFragment.lineItemAdapter$lambda$6(this.f$0, (RdsDataRowView) obj, (TransactionLineItem) obj2);
            }
        });
        this.mapPulldownAnimator = new AppBarLayout.OnOffsetChangedListener() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$mapPulldownAnimator$1
            @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                if (appBarLayout.getTotalScrollRange() == 0) {
                    return;
                }
                float fFloatValue = ((Number) RangesKt.coerceIn(Float.valueOf((i / appBarLayout.getTotalScrollRange()) + 1.0f), RangesKt.rangeTo(0.0f, 1.0f))).floatValue();
                FragmentCardTransactionDetailBinding binding = this.this$0.getBinding();
                float fFloatValue2 = ((Number) RangesKt.coerceIn(Float.valueOf(1.0f - ((fFloatValue - 0.5f) * 4.0f)), RangesKt.rangeTo(0.0f, 1.0f))).floatValue();
                LinearLayout linearLayout = binding.transactionDetailContent;
                linearLayout.setAlpha(fFloatValue2);
                linearLayout.setVisibility(fFloatValue2 == 0.0f ? 4 : 0);
                float fFloatValue3 = ((Number) RangesKt.coerceIn(Float.valueOf((fFloatValue - 0.75f) * 4.0f), RangesKt.rangeTo(0.0f, 1.0f))).floatValue();
                LinearLayout linearLayout2 = binding.transactionDetailPulldownContent;
                linearLayout2.setAlpha(fFloatValue3);
                linearLayout2.setVisibility(fFloatValue3 == 0.0f ? 4 : 0);
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

    public final HistoryNavigator getHistoryNavigator() {
        HistoryNavigator historyNavigator = this.historyNavigator;
        if (historyNavigator != null) {
            return historyNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
        return null;
    }

    public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
        Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
        this.historyNavigator = historyNavigator;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    public void setEventScreen(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<set-?>");
        this.eventScreen = screen;
    }

    private final CardTransactionDetailDuxo getDuxo() {
        return (CardTransactionDetailDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentCardTransactionDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCardTransactionDetailBinding) value;
    }

    private final int getNegativeColor() {
        return ((Number) this.negativeColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int negativeColor_delegate$lambda$0(CardTransactionDetailFragment cardTransactionDetailFragment) {
        android.content.Context contextRequireContext = cardTransactionDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorNegative);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface boldTypeface_delegate$lambda$1(CardTransactionDetailFragment cardTransactionDetailFragment) {
        RhTypeface rhTypeface = RhTypeface.BOLD;
        android.content.Context contextRequireContext = cardTransactionDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return rhTypeface.load(contextRequireContext);
    }

    private final Typeface getBoldTypeface() {
        return (Typeface) this.boldTypeface.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lineItemAdapter$lambda$6(final CardTransactionDetailFragment cardTransactionDetailFragment, RdsDataRowView of, final TransactionLineItem lineItem) {
        CharSequence detail;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(lineItem, "lineItem");
        of.setLabelText(lineItem.getTitle());
        if (lineItem.isNegativeItem()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Object[] objArr = {new CustomTypefaceSpan(cardTransactionDetailFragment.getBoldTypeface()), new ForegroundColorSpan(cardTransactionDetailFragment.getNegativeColor())};
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(lineItem.getDetail());
            for (int i = 0; i < 2; i++) {
                spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
            }
            detail = new SpannedString(spannableStringBuilder);
        } else {
            detail = lineItem.getDetail();
        }
        of.setValueText(detail);
        of.setDescriptionText(lineItem.getDescription());
        if (lineItem.getDialogContent() != null) {
            of.setClickable(true);
            OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CardTransactionDetailFragment.lineItemAdapter$lambda$6$lambda$4(this.f$0, lineItem);
                }
            });
        } else {
            of.setClickable(false);
            of.setOnClickListener(null);
        }
        Integer iconResId = lineItem.getIconResId();
        if (iconResId != null) {
            of.setLabelIconDrawable(ViewsKt.getDrawable(of, iconResId.intValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lineItemAdapter$lambda$6$lambda$4(CardTransactionDetailFragment cardTransactionDetailFragment, TransactionLineItem transactionLineItem) {
        TransactionLineItem.DialogContent dialogContent = transactionLineItem.getDialogContent();
        Intrinsics.checkNotNull(dialogContent);
        String title = dialogContent.getTitle();
        TransactionLineItem.DialogContent dialogContent2 = transactionLineItem.getDialogContent();
        Intrinsics.checkNotNull(dialogContent2);
        cardTransactionDetailFragment.showDescriptionDialog(title, dialogContent2.getMessage());
        TransactionLineItem.DialogContent dialogContent3 = transactionLineItem.getDialogContent();
        Intrinsics.checkNotNull(dialogContent3);
        if (dialogContent3.getLoggingAction() != null) {
            EventLogger eventLogger = cardTransactionDetailFragment.getEventLogger();
            TransactionLineItem.DialogContent dialogContent4 = transactionLineItem.getDialogContent();
            Intrinsics.checkNotNull(dialogContent4);
            UserInteractionEventData.Action loggingAction = dialogContent4.getLoggingAction();
            Intrinsics.checkNotNull(loggingAction);
            EventLogger.DefaultImpls.logTap$default(eventLogger, loggingAction, cardTransactionDetailFragment.getEventScreen(), null, null, null, false, 60, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().transactionDetailFraudPrompt.setCallbacks(this);
        getBinding().transactionDetailDisputesView.setCallbacks(this);
        getBinding().transactionDetailRecyclerView.setAdapter(this.lineItemAdapter);
        getBinding().loadingView.show();
        getBinding().transactionDetailHeaderAppbar.addOnOffsetChangedListener(this.mapPulldownAnimator);
        Lifecycle lifecycle = getLifecycle();
        StyleableMapView transactionDetailMap = getBinding().transactionDetailMap;
        Intrinsics.checkNotNullExpressionValue(transactionDetailMap, "transactionDetailMap");
        lifecycle.addObserver(transactionDetailMap);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
        toolbar.setBackgroundAlpha(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FraudPromptView transactionDetailFraudPrompt = getBinding().transactionDetailFraudPrompt;
        Intrinsics.checkNotNullExpressionValue(transactionDetailFraudPrompt, "transactionDetailFraudPrompt");
        Observable<Unit> observableStartWith = RxView.layoutChanges(transactionDetailFraudPrompt).startWith((Observable<Unit>) Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableStartWith, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailFragment.onStart$lambda$9(this.f$0, (Unit) obj);
            }
        });
        Observables observables = Observables.INSTANCE;
        CoordinatorLayout transactionDetailContainer = getBinding().transactionDetailContainer;
        Intrinsics.checkNotNullExpressionValue(transactionDetailContainer, "transactionDetailContainer");
        ObservableSource map = RxView.layoutChangeEvents(transactionDetailContainer).map(new Function() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment.onStart.2
            @Override // io.reactivex.functions.Function
            public final Integer apply(ViewLayoutChangeEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getBottom() - it.getTop());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LinearLayout transactionDetailPulldownContent = getBinding().transactionDetailPulldownContent;
        Intrinsics.checkNotNullExpressionValue(transactionDetailPulldownContent, "transactionDetailPulldownContent");
        ObservableSource map2 = RxView.layoutChangeEvents(transactionDetailPulldownContent).map(new Function() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment.onStart.3
            @Override // io.reactivex.functions.Function
            public final Integer apply(ViewLayoutChangeEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getBottom() - it.getTop());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        ObservableSource map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment.onStart.4
            @Override // io.reactivex.functions.Function
            public final Boolean apply(CardTransactionDetailViewState it) {
                UiMerchant merchant;
                Merchant merchant2;
                Intrinsics.checkNotNullParameter(it, "it");
                MinervaTransaction.FromCard transaction = it.getTransaction();
                return Boolean.valueOf(((transaction == null || (merchant = transaction.getMerchant()) == null || (merchant2 = merchant.getMerchant()) == null) ? null : merchant2.getLocation()) != null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableDistinctUntilChanged = observables.combineLatest(map, map2, map3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailFragment.onStart$lambda$12(this.f$0, (Tuples3) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C104416(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(CardTransactionDetailFragment cardTransactionDetailFragment, Unit unit) {
        Space space = cardTransactionDetailFragment.getBinding().transactionDetailBottomSpace;
        ViewGroup.LayoutParams layoutParams = cardTransactionDetailFragment.getBinding().transactionDetailBottomSpace.getLayoutParams();
        FraudPromptView transactionDetailFraudPrompt = cardTransactionDetailFragment.getBinding().transactionDetailFraudPrompt;
        Intrinsics.checkNotNullExpressionValue(transactionDetailFraudPrompt, "transactionDetailFraudPrompt");
        layoutParams.height = transactionDetailFraudPrompt.getVisibility() == 0 ? cardTransactionDetailFragment.getBinding().transactionDetailFraudPrompt.getHeight() : 0;
        space.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$12(CardTransactionDetailFragment cardTransactionDetailFragment, Tuples3 tuples3) {
        int height;
        Integer num = (Integer) tuples3.component1();
        Integer num2 = (Integer) tuples3.component2();
        Boolean bool = (Boolean) tuples3.component3();
        AppBarLayout appBarLayout = cardTransactionDetailFragment.getBinding().transactionDetailHeaderAppbar;
        Intrinsics.checkNotNull(appBarLayout);
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        if (layoutParams != null) {
            if (bool.booleanValue()) {
                int iIntValue = num.intValue();
                Intrinsics.checkNotNull(num2);
                height = iIntValue - num2.intValue();
            } else {
                height = cardTransactionDetailFragment.requireToolbar().getHeight();
            }
            layoutParams.height = height;
            appBarLayout.setLayoutParams(layoutParams);
            appBarLayout.setExpanded(false, false);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* compiled from: CardTransactionDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$onStart$6 */
    /* synthetic */ class C104416 extends FunctionReferenceImpl implements Function1<CardTransactionDetailViewState, Unit> {
        C104416(Object obj) {
            super(1, obj, CardTransactionDetailFragment.class, "bind", "bind(Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardTransactionDetailViewState cardTransactionDetailViewState) throws Throwable {
            invoke2(cardTransactionDetailViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CardTransactionDetailViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CardTransactionDetailFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Lifecycle lifecycle = getLifecycle();
        StyleableMapView transactionDetailMap = getBinding().transactionDetailMap;
        Intrinsics.checkNotNullExpressionValue(transactionDetailMap, "transactionDetailMap");
        lifecycle.removeObserver(transactionDetailMap);
        getBinding().transactionDetailHeaderAppbar.removeOnOffsetChangedListener(this.mapPulldownAnimator);
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final CardTransactionDetailViewState state) throws Throwable {
        Throwable thConsume;
        Either<CardTransactionDetailViewState3, Throwable> eitherConsume;
        String userCategory;
        Merchant merchant;
        Merchant merchant2;
        Merchant.Address address;
        Merchant merchant3;
        final UUID id;
        Merchant merchant4;
        UUID merchantId;
        TransactionOverview overview = state.getOverview();
        if (overview != null) {
            getBinding().transactionDetailAmount.setText(overview.getAmountText());
            getBinding().transactionDetailSubtitle.setText(overview.getTitleText());
            this.lineItemAdapter.submitList(overview.getLineItems());
            getBinding().transactionDetailPulldownTitle.setText(overview.getTitleText());
        }
        RhTextView rhTextView = getBinding().transactionDetailFooter;
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(state.getDetail() != null ? 0 : 8);
        rhTextView.setText(state.getDetail());
        SettledCardTransaction settledCardTransaction = state.getSettledCardTransaction();
        List<Dispute> disputes = settledCardTransaction != null ? settledCardTransaction.getDisputes() : null;
        List<Dispute> list = disputes;
        if (list == null || list.isEmpty()) {
            TransactionDisputesView transactionDetailDisputesView = getBinding().transactionDetailDisputesView;
            Intrinsics.checkNotNullExpressionValue(transactionDetailDisputesView, "transactionDetailDisputesView");
            transactionDetailDisputesView.setVisibility(8);
        } else {
            getBinding().transactionDetailDisputesView.bind2(disputes);
            TransactionDisputesView transactionDetailDisputesView2 = getBinding().transactionDetailDisputesView;
            Intrinsics.checkNotNullExpressionValue(transactionDetailDisputesView2, "transactionDetailDisputesView");
            transactionDetailDisputesView2.setVisibility(0);
        }
        RdsButton rdsButton = getBinding().transactionDetailDisputeTransaction;
        android.content.Context context = rdsButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rdsButton.setTextColor(ThemeColors.getThemeColor(context, state.getDisputeTransactionButtonColor()));
        Intrinsics.checkNotNull(rdsButton);
        rdsButton.setVisibility(state.isDisputeTransactionButtonVisible() ? 0 : 8);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardTransactionDetailFragment.bind$lambda$16$lambda$15(state, this);
            }
        });
        FraudPromptView transactionDetailFraudPrompt = getBinding().transactionDetailFraudPrompt;
        Intrinsics.checkNotNullExpressionValue(transactionDetailFraudPrompt, "transactionDetailFraudPrompt");
        transactionDetailFraudPrompt.setVisibility(state.getShowFraudPrompt() ? 0 : 8);
        ShimmerLoadingView shimmerLoadingView = getBinding().loadingView;
        if (state.isLoading()) {
            shimmerLoadingView.show();
        } else {
            shimmerLoadingView.hide();
        }
        SettledCardTransaction settledCardTransaction2 = state.getSettledCardTransaction();
        if (settledCardTransaction2 != null && (merchantId = settledCardTransaction2.getMerchantId()) != null) {
            Screen eventScreen = getEventScreen();
            String string2 = merchantId.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            setEventScreen(Screen.copy$default(eventScreen, null, null, string2, null, 11, null));
        }
        MinervaTransaction.FromCard transaction = state.getTransaction();
        if (transaction != null) {
            RdsChip rdsChip = getBinding().transactionDetailCategoryChip;
            Intrinsics.checkNotNull(rdsChip);
            rdsChip.setVisibility(transaction.getShowTransactionCategory() ? 0 : 8);
            UiMerchant merchant5 = transaction.getMerchant();
            if (merchant5 == null || (merchant4 = merchant5.getMerchant()) == null) {
                userCategory = null;
            } else {
                userCategory = merchant4.getUserCategory();
                if (userCategory == null) {
                    userCategory = merchant4.getCategory();
                }
            }
            final MerchantCategory merchantCategory = (MerchantCategory) MerchantCategory.INSTANCE.fromServerValue(userCategory);
            if (merchantCategory == null) {
                merchantCategory = MerchantCategory.OTHER;
            }
            Resources resources = rdsChip.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rdsChip.setText(merchantCategory.formatted(resources));
            UiMerchant merchant6 = transaction.getMerchant();
            if (merchant6 != null && (merchant3 = merchant6.getMerchant()) != null && (id = merchant3.getId()) != null) {
                OnClickListeners.onClick(rdsChip, new Function0() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CardTransactionDetailFragment.bind$lambda$24$lambda$22$lambda$21$lambda$20(this.f$0, id, merchantCategory);
                    }
                });
            }
            UiMerchant merchant7 = transaction.getMerchant();
            if (merchant7 != null && (merchant2 = merchant7.getMerchant()) != null && (address = merchant2.getAddress()) != null) {
                getBinding().transactionDetailPulldownSubtitle.setText(address.getFormatted());
            }
            UiMerchant merchant8 = transaction.getMerchant();
            LatLng location = (merchant8 == null || (merchant = merchant8.getMerchant()) == null) ? null : merchant.getLocation();
            StyleableMapView transactionDetailMap = getBinding().transactionDetailMap;
            Intrinsics.checkNotNullExpressionValue(transactionDetailMap, "transactionDetailMap");
            transactionDetailMap.setVisibility(location != null ? 0 : 8);
            if (location != null) {
                StyleableMapView transactionDetailMap2 = getBinding().transactionDetailMap;
                Intrinsics.checkNotNullExpressionValue(transactionDetailMap2, "transactionDetailMap");
                MapViews.loadMapImage$default(transactionDetailMap2, location.getLatitude(), location.getLongitude(), null, null, 12, null);
            }
        }
        UiEvent<Either<CardTransactionDetailViewState3, Throwable>> fraudActionResult = state.getFraudActionResult();
        if (fraudActionResult != null && (eitherConsume = fraudActionResult.consume()) != null) {
            if (eitherConsume instanceof Either.Left) {
                CardTransactionDetailViewState3 cardTransactionDetailViewState3 = (CardTransactionDetailViewState3) ((Either.Left) eitherConsume).getValue();
                if (cardTransactionDetailViewState3 instanceof CardTransactionDetailViewState3.CardLocked) {
                    showCardLockedDialog();
                } else {
                    if (!(cardTransactionDetailViewState3 instanceof CardTransactionDetailViewState3.PurchaseEnabled)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    showPurchaseEnabledDialog((CardTransactionDetailViewState3.PurchaseEnabled) cardTransactionDetailViewState3);
                }
            } else {
                if (!(eitherConsume instanceof Either.Right)) {
                    throw new NoWhenBranchMatchedException();
                }
                Either.Right right = (Either.Right) eitherConsume;
                if (!AbsErrorHandler.handleError$default(getActivityErrorHandler(), (Throwable) right.getValue(), false, 2, null)) {
                    throw ((Throwable) right.getValue());
                }
            }
        }
        UiEvent<Throwable> errorUiEvent = state.getErrorUiEvent();
        if (errorUiEvent != null && (thConsume = errorUiEvent.consume()) != null) {
            if (Throwables.isHttpException(thConsume)) {
                showDisputeCancelErrorDialog();
            } else if (!AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
                throw thConsume;
            }
        }
        UiEvent<CardTransactionDetailViewState2> showPromptEvent = state.getShowPromptEvent();
        if (showPromptEvent != null) {
            showPromptEvent.consumeWith(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardTransactionDetailFragment.bind$lambda$27(this.f$0, (CardTransactionDetailViewState2) obj);
                }
            });
        }
        RdsButtonBarView rdsButtonBarView = getBinding().transactionDetailViewReward;
        rdsButtonBarView.setSecondaryButtonText(getText(state.getViewRewardTextRes()));
        Intrinsics.checkNotNull(rdsButtonBarView);
        rdsButtonBarView.setVisibility(state.getMerchantRewards().isEmpty() ? 8 : 0);
        if (state.getMerchantRewards().isEmpty()) {
            return;
        }
        rdsButtonBarView.onSecondaryButtonClick(new Function0() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardTransactionDetailFragment.bind$lambda$29$lambda$28(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$16$lambda$15(CardTransactionDetailViewState cardTransactionDetailViewState, CardTransactionDetailFragment cardTransactionDetailFragment) {
        if (cardTransactionDetailViewState.isDisputeTransactionButtonEnabled()) {
            Navigator navigator = cardTransactionDetailFragment.getNavigator();
            android.content.Context contextRequireContext = cardTransactionDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            SettledCardTransaction settledCardTransaction = cardTransactionDetailViewState.getSettledCardTransaction();
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.DisputeCreation(settledCardTransaction != null ? settledCardTransaction.getId() : null), null, false, null, null, 60, null);
        } else {
            cardTransactionDetailFragment.showDisputeTransactionPendingDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$24$lambda$22$lambda$21$lambda$20(CardTransactionDetailFragment cardTransactionDetailFragment, UUID uuid, MerchantCategory merchantCategory) {
        Navigator.DefaultImpls.createDialogFragment$default(cardTransactionDetailFragment.getNavigator(), new LegacyDialogFragmentKey.MerchantChangeCategory(uuid, merchantCategory.getServerValue()), null, 2, null).show(cardTransactionDetailFragment.getChildFragmentManager(), "change-category");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$27(CardTransactionDetailFragment cardTransactionDetailFragment, CardTransactionDetailViewState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof CardTransactionDetailViewState2.AddFundsPromptEvent) {
            Navigator.DefaultImpls.createDialogFragment$default(cardTransactionDetailFragment.getNavigator(), new LegacyDialogFragmentKey.TransferFundsBottomSheet(true, "decline_upsell"), null, 2, null).show(cardTransactionDetailFragment.getChildFragmentManager(), "fund_bottom_sheet");
        } else {
            if (!(it instanceof CardTransactionDetailViewState2.ForcePostPromptEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator.DefaultImpls.createDialogFragment$default(cardTransactionDetailFragment.getNavigator(), new LegacyDialogFragmentKey.ForcePostBottomSheet(((CardTransactionDetailViewState2.ForcePostPromptEvent) it).getCardTransaction().getTransactionReference()), null, 2, null).show(cardTransactionDetailFragment.getChildFragmentManager(), "force_post_bottom_sheet");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$29$lambda$28(CardTransactionDetailFragment cardTransactionDetailFragment, CardTransactionDetailViewState cardTransactionDetailViewState) {
        cardTransactionDetailFragment.showMerchantRewards(cardTransactionDetailViewState.getMerchantRewards());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.cash.transaction.ui.FraudPromptView.Callbacks
    public void onConfirmTransaction() {
        getDuxo().onConfirmTransaction();
    }

    @Override // com.robinhood.android.cash.transaction.ui.FraudPromptView.Callbacks
    public void onDenyTransaction() {
        getDuxo().onDenyTransaction();
    }

    @Override // com.robinhood.android.cash.transaction.ui.dispute.DisputeRowView.Callbacks
    public void onCancelDispute(UUID disputeId) {
        Intrinsics.checkNotNullParameter(disputeId, "disputeId");
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CANCEL_DISPUTE;
        Screen eventScreen = getEventScreen();
        Component.ComponentType componentType = Component.ComponentType.CANCEL_BUTTON;
        String string2 = disputeId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
        showDisputeCancelConfirmationDialog(disputeId);
    }

    private final void showCardLockedDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setImage(C11183R.drawable.ic_card_locked).setTitle(C10421R.string.card_transaction_fraud_action_result_card_locked_dialog_title, new Object[0]).setMessage(C10421R.string.card_transaction_fraud_action_result_card_locked_dialog_message, new Object[0]).setPositiveButton(C10421R.string.f3942x26ff31d3, new Object[0]).setNegativeButton(C11048R.string.general_label_done, new Object[0]).setId(C11183R.id.dialog_id_card_transaction_fraud_action_result_card_locked);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, childFragmentManager, "cardLockedDialog", false, 4, null);
    }

    private final void showPurchaseEnabledDialog(CardTransactionDetailViewState3.PurchaseEnabled result) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setImage(C21654R.drawable.ic_purchase_enabled).setTitle(C10421R.string.f3945x7426abb9, new Object[0]).setMessage(C10421R.string.f3944x8c00b528, result.getMerchantName()).setPositiveButton(C11048R.string.general_label_done, new Object[0]).setNegativeButton(C10421R.string.f3943x5644c541, new Object[0]).setId(C11183R.id.dialog_id_card_transaction_fraud_action_result_purchase_enabled);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, childFragmentManager, "purchaseEnabledDialog", false, 4, null);
    }

    private final void showDescriptionDialog(CharSequence title, CharSequence message) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(title).setMessage(message).setPositiveButton(C11048R.string.general_label_close, new Object[0]).setId(C10421R.id.dialog_id_transaction_item_description);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, childFragmentManager, "transactionLineItemDescriptionDialog", false, 4, null);
    }

    private final void showDisputeTransactionPendingDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(C10421R.string.card_transaction_detail_dispute_transaction_pending, new Object[0]).setMessage(C10421R.string.card_transaction_detail_dispute_transaction_pending_desc, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setId(C11183R.id.dialog_id_card_transaction_dispute_pending);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, childFragmentManager, "disputeTransactionPendingDialog", false, 4, null);
    }

    private final void showDisputeCancelConfirmationDialog(UUID disputeId) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(CANCEL_DISPUTE_DIALOG_PASSTHROUGH_ID, disputeId);
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder passthroughArgs = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(C10421R.string.card_transaction_detail_dispute_cancel, new Object[0]).setMessage(C10421R.string.card_transaction_detail_dispute_cancel_confirmation, new Object[0]).setPositiveButton(C10421R.string.card_transaction_detail_dispute_cancel, new Object[0]).setNegativeButton(C11048R.string.general_label_no, new Object[0]).setId(C11183R.id.dialog_id_card_transaction_dispute_cancel_confirmation).setPassthroughArgs(bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(passthroughArgs, childFragmentManager, "disputeCancelConfirmationDialog", false, 4, null);
    }

    private final void showDisputeCancelErrorDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(C10421R.string.card_transaction_detail_dispute_cancel_error, new Object[0]).setMessage(C10421R.string.card_transaction_detail_dispute_cancel_error_desc, new Object[0]).setPositiveButton(C11048R.string.general_label_contact_support, new Object[0]).setNegativeButton(C11048R.string.general_label_close, new Object[0]).setId(C11183R.id.dialog_id_card_transaction_dispute_cancel_error);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, childFragmentManager, "disputeCancelErrorDialog", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11183R.id.dialog_id_card_transaction_fraud_action_result_card_locked) {
            Observable<CardTransactionDetailViewState> observableTake = getDuxo().getStates().take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardTransactionDetailFragment.onPositiveButtonClicked$lambda$31(this.f$0, (CardTransactionDetailViewState) obj);
                }
            });
            return true;
        }
        if (id == C11183R.id.dialog_id_card_transaction_fraud_action_result_purchase_enabled) {
            return true;
        }
        if (id == C11183R.id.dialog_id_card_transaction_dispute_cancel_confirmation) {
            Serializable serializable = passthroughArgs != null ? passthroughArgs.getSerializable(CANCEL_DISPUTE_DIALOG_PASSTHROUGH_ID) : null;
            UUID uuid = serializable instanceof UUID ? (UUID) serializable : null;
            if (uuid != null) {
                getDuxo().onCancelDispute(uuid);
            }
            return true;
        }
        if (id == C11183R.id.dialog_id_card_transaction_dispute_cancel_error) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, "120", false, 4, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPositiveButtonClicked$lambda$31(CardTransactionDetailFragment cardTransactionDetailFragment, CardTransactionDetailViewState cardTransactionDetailViewState) {
        UUID cardId = cardTransactionDetailViewState.getCardId();
        if (cardId != null) {
            Navigator navigator = cardTransactionDetailFragment.getNavigator();
            android.content.Context contextRequireContext = cardTransactionDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.CardHelp(cardId, LegacyIntentKey.CardHelp.LaunchMode.REPORT_STOLEN, null, 4, null), null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11183R.id.dialog_id_card_transaction_fraud_action_result_card_locked) {
            return true;
        }
        if (id == C11183R.id.dialog_id_card_transaction_fraud_action_result_purchase_enabled) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_CASH_MANAGEMENT_SETTINGS, false, false, false, null, null, null, null, false, 510, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetFragment.Callbacks
    public void onSelectReward(MerchantReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        showMerchantReward(reward.getId());
    }

    private final void showMerchantReward(UUID merchantRewardId) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, HistoryNavigator.resolve$default(getHistoryNavigator(), new TransactionReference(merchantRewardId, HistoryTransactionType.MERCHANT_REWARD, null, null, false, 28, null), false, false, 6, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void showMerchantRewards(List<MerchantCardReward> merchantRewards) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = merchantRewards.iterator();
        while (it.hasNext()) {
            UUID merchantRewardId = ((MerchantCardReward) it.next()).getMerchantRewardId();
            if (merchantRewardId != null) {
                arrayList.add(merchantRewardId);
            }
        }
        if (merchantRewards.size() == 1 && arrayList.size() == 1) {
            showMerchantReward((UUID) CollectionsKt.first((List) arrayList));
            return;
        }
        CardTransactionRewardsBottomSheetFragment cardTransactionRewardsBottomSheetFragment = (CardTransactionRewardsBottomSheetFragment) CardTransactionRewardsBottomSheetFragment.INSTANCE.newInstance((Parcelable) new CardTransactionRewardsBottomSheetFragment.Args(merchantRewards));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        cardTransactionRewardsBottomSheetFragment.show(childFragmentManager, "CardTransactionRewardsBottomSheetFragment");
    }

    /* compiled from: CardTransactionDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailFragment$Args;", "Landroid/os/Parcelable;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "fromDeepLink", "", "<init>", "(Lcom/robinhood/shared/models/history/shared/TransactionReference;Z)V", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "getFromDeepLink", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean fromDeepLink;
        private final TransactionReference transactionReference;

        /* compiled from: CardTransactionDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((TransactionReference) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, TransactionReference transactionReference, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                transactionReference = args.transactionReference;
            }
            if ((i & 2) != 0) {
                z = args.fromDeepLink;
            }
            return args.copy(transactionReference, z);
        }

        /* renamed from: component1, reason: from getter */
        public final TransactionReference getTransactionReference() {
            return this.transactionReference;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFromDeepLink() {
            return this.fromDeepLink;
        }

        public final Args copy(TransactionReference transactionReference, boolean fromDeepLink) {
            Intrinsics.checkNotNullParameter(transactionReference, "transactionReference");
            return new Args(transactionReference, fromDeepLink);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.transactionReference, args.transactionReference) && this.fromDeepLink == args.fromDeepLink;
        }

        public int hashCode() {
            return (this.transactionReference.hashCode() * 31) + Boolean.hashCode(this.fromDeepLink);
        }

        public String toString() {
            return "Args(transactionReference=" + this.transactionReference + ", fromDeepLink=" + this.fromDeepLink + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transactionReference, flags);
            dest.writeInt(this.fromDeepLink ? 1 : 0);
        }

        public Args(TransactionReference transactionReference, boolean z) {
            Intrinsics.checkNotNullParameter(transactionReference, "transactionReference");
            this.transactionReference = transactionReference;
            this.fromDeepLink = z;
        }

        public final TransactionReference getTransactionReference() {
            return this.transactionReference;
        }

        public final boolean getFromDeepLink() {
            return this.fromDeepLink;
        }
    }

    /* compiled from: CardTransactionDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/history/contracts/CashManagementCardTransactionDetailV2FragmentKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailFragment;", "Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailFragment$Args;", "<init>", "()V", "CANCEL_DISPUTE_DIALOG_PASSTHROUGH_ID", "", "createFragment", "key", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<CashManagementCardTransactionDetailV2FragmentKey>, FragmentWithArgsCompanion<CardTransactionDetailFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CardTransactionDetailFragment cardTransactionDetailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardTransactionDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardTransactionDetailFragment newInstance(Args args) {
            return (CardTransactionDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardTransactionDetailFragment cardTransactionDetailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardTransactionDetailFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public CardTransactionDetailFragment createFragment(CashManagementCardTransactionDetailV2FragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (CardTransactionDetailFragment) newInstance((Parcelable) new Args(key.getTransactionReference(), key.getFromDeepLink()));
        }
    }
}
