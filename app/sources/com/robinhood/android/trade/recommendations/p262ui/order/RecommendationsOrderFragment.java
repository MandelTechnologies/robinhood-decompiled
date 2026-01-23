package com.robinhood.android.trade.recommendations.p262ui.order;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.AnimationUtils;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.contracts.retirement.ContributionContract;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.trade.recommendations.C29895R;
import com.robinhood.android.trade.recommendations.databinding.FragmentRecommendationsOrderBinding;
import com.robinhood.android.trade.recommendations.databinding.MergeRecommendationsOrderBinding;
import com.robinhood.android.trade.recommendations.p262ui.disclosures.RecommendationsDisclosuresActivity;
import com.robinhood.android.trade.recommendations.p262ui.order.RecommendationsNbboRowView;
import com.robinhood.android.trade.recommendations.p262ui.order.RecommendationsOrderViewState;
import com.robinhood.android.transfers.contracts.CreateRetirementContribution;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferContract;
import com.robinhood.android.transfers.contracts.TransferResult;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.util.Money;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsCheckoutAmount;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsCheckoutReview;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsOrderSummary;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: RecommendationsOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 w2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003uvwB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020DH\u0016J\u0010\u0010F\u001a\u00020D2\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020JH\u0016J\u001a\u0010K\u001a\u00020D2\u0006\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010P\u001a\u00020D2\u0006\u0010Q\u001a\u00020RH\u0002J\u0010\u0010S\u001a\u00020D2\u0006\u0010T\u001a\u00020JH\u0002J\u0010\u0010U\u001a\u00020D2\u0006\u0010Q\u001a\u00020RH\u0002J\u0010\u0010V\u001a\u00020D2\u0006\u0010W\u001a\u00020\u0002H\u0016J\u0010\u0010X\u001a\u00020D2\u0006\u0010Q\u001a\u00020RH\u0002J\u0010\u0010Y\u001a\u00020'2\u0006\u0010W\u001a\u00020\u0002H\u0016J\u0010\u0010Z\u001a\u00020D2\u0006\u0010Q\u001a\u00020RH\u0002J\u0018\u0010[\u001a\u00020D2\u000e\u0010\\\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010]H\u0002J1\u0010_\u001a\u0004\u0018\u00010D2\u0016\u0010`\u001a\u0012\u0012\u0004\u0012\u00020b\u0012\u0006\u0012\u0004\u0018\u00010c\u0018\u00010a2\b\b\u0002\u0010d\u001a\u00020JH\u0002¢\u0006\u0002\u0010eJ\b\u0010f\u001a\u00020DH\u0002J\b\u0010g\u001a\u00020DH\u0002J\u0010\u0010h\u001a\u00020D2\u0006\u0010Q\u001a\u00020RH\u0002J\u0010\u0010i\u001a\u00020D2\u0006\u0010Q\u001a\u00020RH\u0002J\u0010\u0010j\u001a\u00020D2\u0006\u0010k\u001a\u00020JH\u0002J\"\u0010l\u001a\u00020D2\u0006\u0010m\u001a\u00020\u00072\u0006\u0010n\u001a\u00020\u00072\b\u0010o\u001a\u0004\u0018\u00010BH\u0016J\u001a\u0010p\u001a\u00020J2\u0006\u0010q\u001a\u00020\u00072\b\u0010r\u001a\u0004\u0018\u00010OH\u0016J\b\u0010s\u001a\u00020DH\u0016J\b\u0010t\u001a\u00020DH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0011\u001a\u0004\b7\u00108R(\u0010:\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020= >*\n\u0012\u0004\u0012\u00020=\u0018\u00010<0<0;X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010?\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020@ >*\n\u0012\u0004\u0012\u00020@\u0018\u00010<0<0;X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010A\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010B0B0;X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006x"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderState;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "contentRes", "", "getContentRes", "()I", "initialLayoutRes", "getInitialLayoutRes", "duxo", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "layoutBinding", "Lcom/robinhood/android/trade/recommendations/databinding/FragmentRecommendationsOrderBinding;", "getLayoutBinding", "()Lcom/robinhood/android/trade/recommendations/databinding/FragmentRecommendationsOrderBinding;", "layoutBinding$delegate", "mergeBindings", "Lcom/robinhood/android/trade/recommendations/databinding/MergeRecommendationsOrderBinding;", "getMergeBindings", "()Lcom/robinhood/android/trade/recommendations/databinding/MergeRecommendationsOrderBinding;", "mergeBindings$delegate", "toolbarEditText", "Landroid/widget/TextView;", "getToolbarEditText", "()Landroid/widget/TextView;", "initialConstraints", "Landroidx/constraintlayout/widget/ConstraintSet;", "breakdownReviewConstraints", "swipeUpConstraints", "breakdownReviewLayoutRes", "swipeUpLayoutRes", "nbboAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsNbboRowView;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutReview$OrderEntryRow;", "totalAdapter", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsTotalRowView;", "Lcom/robinhood/models/util/Money;", "breakdownReviewAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "nbboLoadingDrawable", "Landroid/graphics/drawable/Drawable;", "getNbboLoadingDrawable", "()Landroid/graphics/drawable/Drawable;", "nbboLoadingDrawable$delegate", "transferLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/transfers/contracts/Transfer;", "kotlin.jvm.PlatformType", "contributionLauncher", "Lcom/robinhood/android/transfers/contracts/CreateRetirementContribution;", "recsDisclosureLauncher", "Landroid/content/Intent;", "onStart", "", "onStop", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setViewState", "state", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState;", "toggleQuickTrade", "showReviewButton", "onReviewButtonClicked", "onFormStateChanged", "formState", "animatePageChange", "getConstraintsForState", "setBreakdownReviewViewState", "showNbboExplanationDialog", "instrumentIds", "", "Ljava/util/UUID;", "showAlert", "tagToAlert", "Lkotlin/Pair;", "", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "dialog", "(Lkotlin/Pair;Z)Lkotlin/Unit;", "showRhsMarginAgreementDialog", "launchDisclosuresFragment", "launchContributionsOrTransfersFlow", "launchTransferFlow", "setToolbarIconVisibility", "visibility", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "onPositiveButtonClicked", "id", "passthroughArgs", "validateAndReviewOrder", "performSubmitOrder", "Callbacks", "Args", "Companion", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class RecommendationsOrderFragment extends BaseOrderFragment<RecommendationsOrderState> implements RhDialogFragment.OnClickListener {
    private static final long ERROR_ANIMATION_DURATION_MS = 500;
    private static final long ERROR_ANIMATION_START_DELAY_MS = 2000;
    private static final int RHS_MARGIN_AGREEMENT_REQUEST_CODE = 485279;
    private final CompositeAdapter breakdownReviewAdapter;
    private final ConstraintSet breakdownReviewConstraints;
    private final int breakdownReviewLayoutRes;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final int contentRes;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<CreateRetirementContribution>> contributionLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ConstraintSet initialConstraints;
    private final int initialLayoutRes;

    /* renamed from: layoutBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 layoutBinding;

    /* renamed from: mergeBindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 mergeBindings;
    private final GenericListAdapter<RecommendationsNbboRowView, UiRecommendationsCheckoutReview.OrderEntryRow> nbboAdapter;

    /* renamed from: nbboLoadingDrawable$delegate, reason: from kotlin metadata */
    private final Lazy nbboLoadingDrawable;
    private final ActivityResultLauncher<Intent> recsDisclosureLauncher;
    private final ConstraintSet swipeUpConstraints;
    private final int swipeUpLayoutRes;
    private final GenericListAdapter<RecommendationsTotalRowView, Money> totalAdapter;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Transfer>> transferLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsOrderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsOrderFragment.class, "layoutBinding", "getLayoutBinding()Lcom/robinhood/android/trade/recommendations/databinding/FragmentRecommendationsOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsOrderFragment.class, "mergeBindings", "getMergeBindings()Lcom/robinhood/android/trade/recommendations/databinding/MergeRecommendationsOrderBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecommendationsOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderFragment$Callbacks;", "", "onTransferSubmitted", "", "transferId", "", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTransferSubmitted(String transferId);
    }

    /* compiled from: RecommendationsOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RecommendationsOrderViewState.ReviewButtonAction.values().length];
            try {
                iArr[RecommendationsOrderViewState.ReviewButtonAction.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendationsOrderViewState.ReviewButtonAction.INSUFFICIENT_BP_PLUS_INSTANT_ALERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecommendationsOrderViewState.ReviewButtonAction.SIGN_RHS_MARGIN_AGREEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecommendationsOrderViewState.ReviewButtonAction.SIGN_DISCLOSURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RecommendationsOrderViewState.ReviewButtonAction.DEPOSIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RecommendationsOrderViewState.ReviewButtonAction.LINK_BANK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecommendationsOrderState.values().length];
            try {
                iArr2[RecommendationsOrderState.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RecommendationsOrderState.BREAKDOWN_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[RecommendationsOrderState.SWIPE_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void validateAndReviewOrder() {
    }

    public RecommendationsOrderFragment() {
        super(RecommendationsOrderState.INPUT);
        this.contentRes = C29895R.layout.merge_recommendations_order;
        this.initialLayoutRes = C29895R.layout.fragment_recommendations_order;
        this.duxo = OldDuxos.oldDuxo(this, RecommendationsOrderDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.layoutBinding = ViewBinding5.viewBinding(this, RecommendationsOrderFragment3.INSTANCE);
        this.mergeBindings = ViewBinding5.viewBinding(this, RecommendationsOrderFragment4.INSTANCE);
        this.initialConstraints = new ConstraintSet();
        this.breakdownReviewConstraints = new ConstraintSet();
        this.swipeUpConstraints = new ConstraintSet();
        this.breakdownReviewLayoutRes = C29895R.layout.fragment_recommendations_order_breakdown_review;
        this.swipeUpLayoutRes = C29895R.layout.fragment_recommendations_order_reviewing;
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RecommendationsNbboRowView.Companion companion2 = RecommendationsNbboRowView.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        GenericListAdapter<RecommendationsNbboRowView, UiRecommendationsCheckoutReview.OrderEntryRow> genericListAdapterM2987of = companion.m2987of(companion2, equality, RecommendationsOrderFragment5.INSTANCE);
        this.nbboAdapter = genericListAdapterM2987of;
        GenericListAdapter<RecommendationsTotalRowView, Money> genericListAdapterM2987of2 = companion.m2987of(RecommendationsTotalRowView.INSTANCE, equality, RecommendationsOrderFragment8.INSTANCE);
        this.totalAdapter = genericListAdapterM2987of2;
        this.breakdownReviewAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{genericListAdapterM2987of, genericListAdapterM2987of2});
        this.nbboLoadingDrawable = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsOrderFragment.nbboLoadingDrawable_delegate$lambda$0(this.f$0);
            }
        });
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Transfer>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new TransferContract(new Function0() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$transferLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(TransferResult transferResult) {
                if (transferResult instanceof TransferResult.Completed) {
                    this.this$0.getCallbacks().onTransferSubmitted(((TransferResult.Completed) transferResult).getTransferId());
                }
                this.this$0.getDuxo().refreshBuyingPowerIfNeeded();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.transferLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<CreateRetirementContribution>> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ContributionContract(new Function0() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$contributionLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ContributionContract.Result result) {
                if (result instanceof ContributionContract.Result.Completed) {
                    this.this$0.getCallbacks().onTransferSubmitted(((ContributionContract.Result.Completed) result).getTransferId());
                }
                this.this$0.getDuxo().refreshBuyingPowerIfNeeded();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.contributionLauncher = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$recsDisclosureLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.getDuxo().onDisclosureSigned();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.recsDisclosureLauncher = activityResultLauncherRegisterForActivityResult3;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getContentRes() {
        return this.contentRes;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getInitialLayoutRes() {
        return this.initialLayoutRes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecommendationsOrderDuxo getDuxo() {
        return (RecommendationsOrderDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentRecommendationsOrderBinding getLayoutBinding() {
        Object value = this.layoutBinding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsOrderBinding) value;
    }

    private final MergeRecommendationsOrderBinding getMergeBindings() {
        Object value = this.mergeBindings.getValue(this, $$delegatedProperties[2]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRecommendationsOrderBinding) value;
    }

    private final TextView getToolbarEditText() {
        return (TextView) requireToolbar().findViewById(C29895R.id.edit_txt);
    }

    private final Drawable getNbboLoadingDrawable() {
        return (Drawable) this.nbboLoadingDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimatedVectorDrawable nbboLoadingDrawable_delegate$lambda$0(RecommendationsOrderFragment recommendationsOrderFragment) {
        Drawable drawable = ContextCompat.getDrawable(recommendationsOrderFragment.requireContext(), C13997R.drawable.button_spinner);
        Intrinsics.checkNotNull(drawable);
        Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNull(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawableMutate;
        int dimension = (int) recommendationsOrderFragment.getResources().getDimension(C29895R.dimen.order_summary_nbbo_loading_indicator_size);
        Context contextRequireContext = recommendationsOrderFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        animatedVectorDrawable.setTint(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorPositive));
        animatedVectorDrawable.setBounds(0, 0, dimension, dimension);
        animatedVectorDrawable.start();
        return animatedVectorDrawable;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        IdlingResourceCounters2.setBusy(IdlingResourceType.RECOMMENDATIONS_CHECKOUT, true);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C299341(this));
        Observable<RecommendationsOrderViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged((Function<? super RecommendationsOrderViewState, K>) new Function() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment.onStart.2
            @Override // io.reactivex.functions.Function
            public final RecommendationsOrderState apply(RecommendationsOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getCurrentState();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C299363(this));
    }

    /* compiled from: RecommendationsOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$onStart$1 */
    /* synthetic */ class C299341 extends FunctionReferenceImpl implements Function1<RecommendationsOrderViewState, Unit> {
        C299341(Object obj) {
            super(1, obj, RecommendationsOrderFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecommendationsOrderViewState recommendationsOrderViewState) throws Throwable {
            invoke2(recommendationsOrderViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecommendationsOrderViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecommendationsOrderFragment) this.receiver).setViewState(p0);
        }
    }

    /* compiled from: RecommendationsOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$onStart$3 */
    /* synthetic */ class C299363 extends FunctionReferenceImpl implements Function1<RecommendationsOrderViewState, Unit> {
        C299363(Object obj) {
            super(1, obj, RecommendationsOrderFragment.class, "animatePageChange", "animatePageChange(Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecommendationsOrderViewState recommendationsOrderViewState) {
            invoke2(recommendationsOrderViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecommendationsOrderViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecommendationsOrderFragment) this.receiver).animatePageChange(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        IdlingResourceCounters2.setBusy(IdlingResourceType.RECOMMENDATIONS_CHECKOUT, false);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (getToolbarEditText() == null) {
            RhToolbar.addCustomView$default(toolbar, C29895R.layout.include_edit_order_toolbar_content, true, 0, 4, null);
            TextView toolbarEditText = getToolbarEditText();
            if (toolbarEditText != null) {
                OnClickListeners.onClick(toolbarEditText, new C299311(getDuxo()));
            }
        }
    }

    /* compiled from: RecommendationsOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$configureToolbar$1 */
    /* synthetic */ class C299311 extends FunctionReferenceImpl implements Function0<Unit> {
        C299311(Object obj) {
            super(0, obj, RecommendationsOrderDuxo.class, "onEditClicked", "onEditClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((RecommendationsOrderDuxo) this.receiver).onEditClicked();
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getDuxo().previousPage();
        return true;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        this.initialConstraints.clone(getRoot());
        this.breakdownReviewConstraints.clone(requireContext(), this.breakdownReviewLayoutRes);
        this.swipeUpConstraints.clone(requireContext(), this.swipeUpLayoutRes);
        LifecycleHost.DefaultImpls.bind$default(this, getNumpad().getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C299371(getDuxo()));
        TickerInputView tickerInputView = getMergeBindings().amountView;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        tickerInputView.setTypeface(ContextsUiExtensions.getFont(contextRequireContext, C16915R.font.capsule_sans_medium));
    }

    /* compiled from: RecommendationsOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$onViewCreated$1 */
    /* synthetic */ class C299371 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
        C299371(Object obj) {
            super(1, obj, RecommendationsOrderDuxo.class, "consumeKeyEvent", "consumeKeyEvent(Landroid/view/KeyEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
            invoke2(keyEvent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(KeyEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecommendationsOrderDuxo) this.receiver).consumeKeyEvent(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final RecommendationsOrderViewState state) throws Throwable {
        CharSequence text;
        Throwable thConsume;
        RdsButton reviewOrderBtn = getReviewOrderBtn();
        StringResource ctaStringResource = state.getCtaStringResource();
        if (ctaStringResource != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = ctaStringResource.getText(resources);
        } else {
            text = null;
        }
        reviewOrderBtn.setText(text);
        OnClickListeners.onClick(getReviewOrderBtn(), new Function0() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsOrderFragment.setViewState$lambda$4(this.f$0, state);
            }
        });
        getReviewOrderBtn().setEnabled(state.isReviewButtonEnabled());
        LinearLayout linearLayout = getLayoutBinding().quickTradeAmountsContainer;
        linearLayout.removeAllViews();
        Iterator<T> it = state.getQuickTradeAmounts().iterator();
        while (it.hasNext()) {
            final int iIntValue = ((Number) it.next()).intValue();
            LinearLayout quickTradeAmountsContainer = getLayoutBinding().quickTradeAmountsContainer;
            Intrinsics.checkNotNullExpressionValue(quickTradeAmountsContainer, "quickTradeAmountsContainer");
            View viewInflate$default = ViewGroups.inflate$default(quickTradeAmountsContainer, C29895R.layout.include_quick_trade_amount_btn, false, 2, null);
            Intrinsics.checkNotNull(viewInflate$default, "null cannot be cast to non-null type android.widget.Button");
            Button button = (Button) viewInflate$default;
            button.setText(linearLayout.getResources().getString(C29895R.string.recommendations_order_quick_trade_amount, Integer.valueOf(iIntValue)));
            OnClickListeners.onClick(button, new Function0() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecommendationsOrderFragment.setViewState$lambda$7$lambda$6$lambda$5(this.f$0, iIntValue);
                }
            });
            getDuxo().logQuickTradeAmountButtonAppear(iIntValue, state.getLoggingContext());
            linearLayout.addView(button);
        }
        toggleQuickTrade(!state.getShowQuickTradeBtns());
        MergeRecommendationsOrderBinding mergeBindings = getMergeBindings();
        getReviewOrderBtn().setLoading(state.isLoading());
        if (state.getCheckoutReview() != null && state.getCurrentState() == RecommendationsOrderState.BREAKDOWN_REVIEW) {
            setBreakdownReviewViewState(state);
        }
        mergeBindings.amountView.transitionTo(state.getAmountCharArray());
        RhTextView rhTextView = mergeBindings.orderSummaryTitle;
        UiRecommendationsOrderSummary orderSummary = state.getOrderSummary();
        rhTextView.setText(orderSummary != null ? orderSummary.getTitle() : null);
        RhTextView rhTextView2 = mergeBindings.orderSummaryDescription;
        UiRecommendationsOrderSummary orderSummary2 = state.getOrderSummary();
        rhTextView2.setText(orderSummary2 != null ? orderSummary2.getDescription() : null);
        mergeBindings.orderSummarySubtitle.setText(state.getOrderSummarySubtitle());
        RhTextView orderSummaryTitle = mergeBindings.orderSummaryTitle;
        Intrinsics.checkNotNullExpressionValue(orderSummaryTitle, "orderSummaryTitle");
        orderSummaryTitle.setVisibility(state.isOrderSummaryVisible() ? 0 : 8);
        RhTextView orderSummaryDescription = mergeBindings.orderSummaryDescription;
        Intrinsics.checkNotNullExpressionValue(orderSummaryDescription, "orderSummaryDescription");
        orderSummaryDescription.setVisibility(state.isOrderSummaryVisible() ? 0 : 8);
        RhTextView orderSummarySubtitle = mergeBindings.orderSummarySubtitle;
        Intrinsics.checkNotNullExpressionValue(orderSummarySubtitle, "orderSummarySubtitle");
        orderSummarySubtitle.setVisibility(state.isOrderSummaryVisible() ? 0 : 8);
        RhTextView buyingPowerAvailable = mergeBindings.buyingPowerAvailable;
        Intrinsics.checkNotNullExpressionValue(buyingPowerAvailable, "buyingPowerAvailable");
        buyingPowerAvailable.setVisibility(state.isBuyingPowerVisible() ? 0 : 8);
        RhTextView rhTextView3 = mergeBindings.buyingPowerAvailable;
        UiRecommendationsCheckoutAmount checkoutAmount = state.getCheckoutAmount();
        rhTextView3.setText(checkoutAmount != null ? checkoutAmount.getAmountDescription() : null);
        RhTextView rhTextView4 = mergeBindings.dollarInputInfoTxt;
        Intrinsics.checkNotNull(rhTextView4);
        rhTextView4.setVisibility(state.isAmountInfoTextVisible() ? 0 : 8);
        rhTextView4.setText(state.getAmountInfoString());
        OnClickListeners.onClick(rhTextView4, new Function0() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsOrderFragment.setViewState$lambda$11$lambda$9$lambda$8(this.f$0, state);
            }
        });
        UiEvent<RecommendationsOrderViewState.Error> amountError = state.getAmountError();
        RecommendationsOrderViewState.Error errorConsume = amountError != null ? amountError.consume() : null;
        if (errorConsume != null) {
            AnimationUtils animationUtils = AnimationUtils.INSTANCE;
            TickerInputView amountView = mergeBindings.amountView;
            Intrinsics.checkNotNullExpressionValue(amountView, "amountView");
            AnimationUtils.animateErrorShake$default(animationUtils, amountView, 0L, 0.05f, 1, null);
            final RhTextView rhTextView5 = mergeBindings.dollarInputErrorTxt;
            Resources resources2 = rhTextView5.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            rhTextView5.setText(state.getErrorString(resources2, errorConsume));
            rhTextView5.setAlpha(1.0f);
            Intrinsics.checkNotNull(rhTextView5);
            rhTextView5.setVisibility(0);
            rhTextView5.animate().withEndAction(new Runnable() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$setViewState$3$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    RhTextView rhTextView6 = rhTextView5;
                    Intrinsics.checkNotNull(rhTextView6);
                    rhTextView6.setVisibility(8);
                }
            }).setStartDelay(2000L).setDuration(500L).alpha(0.0f).start();
            rhTextView5.announceForAccessibility(rhTextView5.getText());
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.RECOMMENDATIONS_CHECKOUT, state.isLoading());
        UiEvent<Unit> exitFlowEvent = state.getExitFlowEvent();
        if ((exitFlowEvent != null ? exitFlowEvent.consume() : null) != null) {
            requireActivity().finish();
        }
        UiEvent<Throwable> errorEvent = state.getErrorEvent();
        if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, thConsume, true, false, 0, null, 56, null);
        }
        UiEvent<Unit> launchTransferFlowEvent = state.getLaunchTransferFlowEvent();
        if ((launchTransferFlowEvent != null ? launchTransferFlowEvent.consume() : null) != null) {
            launchTransferFlow(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$4(RecommendationsOrderFragment recommendationsOrderFragment, RecommendationsOrderViewState recommendationsOrderViewState) {
        recommendationsOrderFragment.onReviewButtonClicked(recommendationsOrderViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$7$lambda$6$lambda$5(RecommendationsOrderFragment recommendationsOrderFragment, int i) {
        recommendationsOrderFragment.getDuxo().onQuickTradeAmountTap(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$11$lambda$9$lambda$8(RecommendationsOrderFragment recommendationsOrderFragment, RecommendationsOrderViewState recommendationsOrderViewState) {
        showAlert$default(recommendationsOrderFragment, recommendationsOrderViewState.getAmountInfoAlert(), false, 2, null);
        return Unit.INSTANCE;
    }

    private final void toggleQuickTrade(final boolean showReviewButton) {
        final FragmentRecommendationsOrderBinding layoutBinding = getLayoutBinding();
        final LinearLayout quickTradeAmountsContainer = layoutBinding.quickTradeAmountsContainer;
        Intrinsics.checkNotNullExpressionValue(quickTradeAmountsContainer, "quickTradeAmountsContainer");
        OneShotPreDrawListener.add(quickTradeAmountsContainer, new Runnable() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$toggleQuickTrade$lambda$15$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                float f = showReviewButton ? -layoutBinding.designSystemReviewContainer.getHeight() : 0.0f;
                boolean z = showReviewButton;
                float f2 = z ? 0.0f : 1.0f;
                float height = z ? 0.0f : layoutBinding.designSystemReviewContainer.getHeight() * 1.6f;
                float f3 = showReviewButton ? 1.0f : 0.0f;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new FastOutSlowInInterpolator());
                LinearLayout linearLayout = layoutBinding.quickTradeAmountsContainer;
                Property property = View.Y;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, f);
                LinearLayout linearLayout2 = layoutBinding.quickTradeAmountsContainer;
                Property property2 = View.ALPHA;
                animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property2, f2), ObjectAnimator.ofFloat(this.getReviewOrderBtn(), (Property<RdsButton, Float>) property, height), ObjectAnimator.ofFloat(this.getReviewOrderBtn(), (Property<RdsButton, Float>) property2, f3));
                animatorSet.start();
            }
        });
    }

    private final void onReviewButtonClicked(RecommendationsOrderViewState state) {
        switch (WhenMappings.$EnumSwitchMapping$0[state.getReviewButtonAction().ordinal()]) {
            case 1:
                getDuxo().nextPage();
                break;
            case 2:
                showAlert(state.getMaxInvestmentAlertAndTag(), true);
                break;
            case 3:
                showRhsMarginAgreementDialog();
                break;
            case 4:
                launchDisclosuresFragment();
                break;
            case 5:
                launchContributionsOrTransfersFlow(state);
                break;
            case 6:
                launchTransferFlow(state);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        getDuxo().logReviewButtonClicked(state.getCurrentState(), state.getReviewButtonAction(), state.getLoggingContext());
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateChanged(RecommendationsOrderState formState) {
        Drawable colorDrawable;
        Intrinsics.checkNotNullParameter(formState, "formState");
        super.onFormStateChanged((RecommendationsOrderFragment) formState);
        if (getReviewing()) {
            colorDrawable = requireContext().getDrawable(C29895R.drawable.bottom_rounded_corner_background);
        } else {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            colorDrawable = new ColorDrawable(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorBackground1));
        }
        getCardView().setBackground(colorDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animatePageChange(RecommendationsOrderViewState state) {
        MergeRecommendationsOrderBinding mergeBindings = getMergeBindings();
        RecyclerView list = mergeBindings.list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        list.setVisibility(state.isListVisible() ? 0 : 8);
        TickerInputView amountView = mergeBindings.amountView;
        Intrinsics.checkNotNullExpressionValue(amountView, "amountView");
        amountView.setVisibility(state.isAmountVisible() ? 0 : 8);
        RhTextView titleTxt = mergeBindings.titleTxt;
        Intrinsics.checkNotNullExpressionValue(titleTxt, "titleTxt");
        titleTxt.setVisibility(state.isBreakdownReviewVisible() ? 0 : 8);
        RecyclerView list2 = mergeBindings.list;
        Intrinsics.checkNotNullExpressionValue(list2, "list");
        ViewGroup.LayoutParams layoutParams = list2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.verticalBias = state.getListBias();
        list2.setLayoutParams(layoutParams2);
        LinearLayout nbboInfoContainer = mergeBindings.nbboInfoContainer;
        Intrinsics.checkNotNullExpressionValue(nbboInfoContainer, "nbboInfoContainer");
        nbboInfoContainer.setVisibility(state.isBreakdownReviewVisible() ? 0 : 8);
        TextView toolbarEditText = getToolbarEditText();
        if (toolbarEditText != null) {
            toolbarEditText.setVisibility(state.isToolbarEditTextVisible() ? 0 : 8);
        }
        setToolbarIconVisibility(state.isToolbarIconVisible());
        setFormState(state.getCurrentState());
        IdlingResourceCounters2.setBusy(IdlingResourceType.RECOMMENDATIONS_CHECKOUT_DISCLOSURE, false);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public ConstraintSet getConstraintsForState(RecommendationsOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        int i = WhenMappings.$EnumSwitchMapping$1[formState.ordinal()];
        if (i == 1) {
            return this.initialConstraints;
        }
        if (i == 2) {
            return this.breakdownReviewConstraints;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return this.swipeUpConstraints;
    }

    private final void setBreakdownReviewViewState(final RecommendationsOrderViewState state) throws Resources.NotFoundException {
        CharSequence text;
        UiRecommendationsCheckoutReview checkoutReview = state.getCheckoutReview();
        if (checkoutReview == null) {
            return;
        }
        final Money amount = state.getAmount();
        MergeRecommendationsOrderBinding mergeBindings = getMergeBindings();
        RecyclerView list = mergeBindings.list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        bindAdapter(list, this.breakdownReviewAdapter);
        mergeBindings.titleTxt.setText(checkoutReview.getTitle());
        RdsButton reviewOrderBtn = getReviewOrderBtn();
        StringResource ctaStringResource = state.getCtaStringResource();
        if (ctaStringResource != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = ctaStringResource.getText(resources);
        } else {
            text = null;
        }
        reviewOrderBtn.setText(text);
        mergeBindings.nbboInfoTxt.setText(checkoutReview.getNbboRefreshCopy());
        RhTextView nbboInfoTxt = mergeBindings.nbboInfoTxt;
        Intrinsics.checkNotNullExpressionValue(nbboInfoTxt, "nbboInfoTxt");
        OnClickListeners.onClick(nbboInfoTxt, new Function0() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsOrderFragment.setBreakdownReviewViewState$lambda$20$lambda$18(this.f$0, state);
            }
        });
        mergeBindings.nbboRefreshTxt.setText(state.getNbboRefreshText(getNbboLoadingDrawable()));
        RhTextView nbboRefreshTxt = mergeBindings.nbboRefreshTxt;
        Intrinsics.checkNotNullExpressionValue(nbboRefreshTxt, "nbboRefreshTxt");
        OnClickListeners.onClick(nbboRefreshTxt, new Function0() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsOrderFragment.setBreakdownReviewViewState$lambda$20$lambda$19(this.f$0, amount);
            }
        });
        this.nbboAdapter.submitList(checkoutReview.getOrderEntryRows());
        this.totalAdapter.submitList(CollectionsKt.listOf(amount));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setBreakdownReviewViewState$lambda$20$lambda$18(RecommendationsOrderFragment recommendationsOrderFragment, RecommendationsOrderViewState recommendationsOrderViewState) {
        recommendationsOrderFragment.showNbboExplanationDialog(recommendationsOrderViewState.getCheckoutReviewInstrumentIds());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setBreakdownReviewViewState$lambda$20$lambda$19(RecommendationsOrderFragment recommendationsOrderFragment, Money money) {
        recommendationsOrderFragment.getDuxo().refreshCheckoutReview(money);
        return Unit.INSTANCE;
    }

    private final void showNbboExplanationDialog(List<UUID> instrumentIds) {
        if (instrumentIds != null) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.OrderSummaryExplanation(instrumentIds, false, null, null, 8, null), false, false, false, false, null, false, null, null, 1020, null);
        }
    }

    static /* synthetic */ Unit showAlert$default(RecommendationsOrderFragment recommendationsOrderFragment, Tuples2 tuples2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return recommendationsOrderFragment.showAlert(tuples2, z);
    }

    private final Unit showAlert(Tuples2<String, GenericAlert> tagToAlert, boolean dialog) {
        GenericAlert second;
        DialogFragmentKey clientComponentAlertSheet;
        if (tagToAlert == null || (second = tagToAlert.getSecond()) == null) {
            return null;
        }
        if (dialog) {
            clientComponentAlertSheet = new LegacyDialogFragmentKey.ClientComponentAlert(GenericAlert.copy$default(second, null, null, null, null, 14, null), false, false, 0, 14, (DefaultConstructorMarker) null);
        } else {
            clientComponentAlertSheet = new LegacyDialogFragmentKey.ClientComponentAlertSheet(second, false, false, 0, 14, (DefaultConstructorMarker) null);
        }
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), clientComponentAlertSheet, null, 2, null).show(getChildFragmentManager(), tagToAlert.getFirst());
        return Unit.INSTANCE;
    }

    private final void showRhsMarginAgreementDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(null).setMessage(getResources().getString(C20649R.string.order_create_error_rhs_conversion)).setId(C29895R.id.dialog_id_recommendations_order_rhs_conversion).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "recs-order-rhs-margin-agreement", false, 4, null);
    }

    private final void launchDisclosuresFragment() {
        RecommendationsDisclosuresActivity.Companion companion = RecommendationsDisclosuresActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Companion companion2 = INSTANCE;
        this.recsDisclosureLauncher.launch(companion.getIntentWithExtras(contextRequireContext, (Parcelable) new RecommendationsDisclosuresActivity.Extras(((Args) companion2.getArgs((Fragment) this)).getRecommendationId(), ((Args) companion2.getArgs((Fragment) this)).getAccountNumber())));
    }

    private final void launchContributionsOrTransfersFlow(RecommendationsOrderViewState state) {
        if (state.getShouldLaunchContributionFlow()) {
            CreateRetirementContribution contributionsIntentKey = state.getContributionsIntentKey();
            if (contributionsIntentKey != null) {
                NavigationActivityResultContract3.launch$default(this.contributionLauncher, contributionsIntentKey, null, false, 6, null);
                return;
            }
            return;
        }
        Transfer transfersIntentKey = state.getTransfersIntentKey();
        if (transfersIntentKey != null) {
            NavigationActivityResultContract3.launch$default(this.transferLauncher, transfersIntentKey, null, false, 6, null);
        }
    }

    private final void launchTransferFlow(RecommendationsOrderViewState state) {
        Transfer transfersIntentKey = state.getTransfersIntentKey();
        if (transfersIntentKey != null) {
            NavigationActivityResultContract3.launch$default(this.transferLauncher, transfersIntentKey, null, false, 6, null);
        }
    }

    private final void setToolbarIconVisibility(boolean visibility) {
        ActionBar supportActionBar = requireBaseActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(visibility);
        }
        ActionBar supportActionBar2 = requireBaseActivity().getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setHomeButtonEnabled(visibility);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RHS_MARGIN_AGREEMENT_REQUEST_CODE && resultCode == -1) {
            Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment.onActivityResult.1
                @Override // io.reactivex.functions.Function
                public final Money apply(RecommendationsOrderViewState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getAmount();
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C299332(getDuxo()));
        }
    }

    /* compiled from: RecommendationsOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$onActivityResult$2 */
    /* synthetic */ class C299332 extends FunctionReferenceImpl implements Function1<Money, Unit> {
        C299332(Object obj) {
            super(1, obj, RecommendationsOrderDuxo.class, "refreshCheckoutReview", "refreshCheckoutReview(Lcom/robinhood/models/util/Money;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Money money) {
            invoke2(money);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Money p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecommendationsOrderDuxo) this.receiver).refreshCheckoutReview(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C29895R.id.dialog_id_recommendations_order_rhs_conversion) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new LegacyIntentKey.RhsConversion(true), RHS_MARGIN_AGREEMENT_REQUEST_CODE, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void performSubmitOrder() {
        IdlingResourceCounters2.setBusy(IdlingResourceType.RECOMMENDATIONS_CHECKOUT_ORDER_SUBMISSION, true);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderActivity");
        ((RecommendationsOrderActivity) fragmentActivityRequireActivity).setupSubmitToolbar();
        Observable<RecommendationsOrderViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderFragment.performSubmitOrder$lambda$26(this.f$0, (RecommendationsOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performSubmitOrder$lambda$26(RecommendationsOrderFragment recommendationsOrderFragment, RecommendationsOrderViewState recommendationsOrderViewState) {
        RecommendationsOrderDuxo duxo = recommendationsOrderFragment.getDuxo();
        Money amount = recommendationsOrderViewState.getAmount();
        com.robinhood.rosetta.eventlogging.Context loggingContext = recommendationsOrderViewState.getLoggingContext();
        RecommendationsOrderViewState.RequiredState requiredState = recommendationsOrderViewState.getRequiredState();
        duxo.submitOrder(amount, loggingContext, requiredState != null ? requiredState.getBrokerageAccountType() : null);
        return Unit.INSTANCE;
    }

    /* compiled from: RecommendationsOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderFragment$Args;", "Landroid/os/Parcelable;", "source", "", "refId", "Ljava/util/UUID;", "recommendationId", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getRefId", "()Ljava/util/UUID;", "getRecommendationId", "getAccountNumber", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID recommendationId;
        private final UUID refId;
        private final String source;

        /* compiled from: RecommendationsOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeSerializable(this.refId);
            dest.writeSerializable(this.recommendationId);
            dest.writeString(this.accountNumber);
        }

        public Args(String source, UUID refId, UUID recommendationId, String str) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
            this.source = source;
            this.refId = refId;
            this.recommendationId = recommendationId;
            this.accountNumber = str;
        }

        public final String getSource() {
            return this.source;
        }

        public final UUID getRefId() {
            return this.refId;
        }

        public final UUID getRecommendationId() {
            return this.recommendationId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: RecommendationsOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderFragment;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderFragment$Args;", "<init>", "()V", "RHS_MARGIN_AGREEMENT_REQUEST_CODE", "", "ERROR_ANIMATION_START_DELAY_MS", "", "ERROR_ANIMATION_DURATION_MS", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsOrderFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsOrderFragment recommendationsOrderFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsOrderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsOrderFragment newInstance(Args args) {
            return (RecommendationsOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsOrderFragment recommendationsOrderFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsOrderFragment, args);
        }
    }
}
