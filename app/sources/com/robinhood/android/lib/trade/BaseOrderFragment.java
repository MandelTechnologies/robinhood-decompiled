package com.robinhood.android.lib.trade;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.view.SwipeToConfirmTouchListener;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.lib.trade.OrderState;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager2;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager3;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.accessibility.RhAccessibilityManager;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.animation.TransitionListenerAdapter;
import com.robinhood.utils.p409ui.view.BlockableNestedScrollView;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: BaseOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\u00020\u0004:\u0003yz{B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010N\u001a\u0004\u0018\u00010\u00162\u0006\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010 2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u001a\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u00162\b\u0010R\u001a\u0004\u0018\u00010SH\u0017J\u0010\u0010[\u001a\u00020Y2\u0006\u0010\\\u001a\u00020=H\u0003J\b\u0010]\u001a\u00020YH\u0014J\u000e\u0010^\u001a\u00020Y2\u0006\u0010_\u001a\u00020=J\b\u0010`\u001a\u00020YH\u0016J\b\u0010a\u001a\u00020=H\u0016J\b\u0010b\u001a\u00020YH&J\u0013\u0010c\u001a\u00020Y2\u0006\u0010d\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007J\u000e\u0010e\u001a\u00020Y2\u0006\u0010f\u001a\u00020=J\b\u0010g\u001a\u00020YH\u0017J\u0010\u0010h\u001a\u00020Y2\u0006\u0010i\u001a\u00020=H\u0016J'\u0010j\u001a\u00020Y2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00028\u00002\b\u0010@\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0002\u0010nJ\u0018\u0010o\u001a\u00020Y2\u0006\u0010p\u001a\u0002022\u0006\u0010q\u001a\u000202H\u0016J\b\u0010r\u001a\u00020YH\u0016J\u0017\u0010s\u001a\u0004\u0018\u00010l2\u0006\u00109\u001a\u00028\u0000H&¢\u0006\u0002\u0010tJ\b\u0010u\u001a\u00020YH&J\b\u0010v\u001a\u00020YH\u0016J\u0015\u0010w\u001a\u00020Y2\u0006\u00109\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007J\u0015\u0010x\u001a\u00020Y2\u0006\u00109\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007R\u0010\u0010\u0005\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u001b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0014\u001a\u0004\b%\u0010\u0018R\u001b\u0010'\u001a\u00020(8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0014\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0014\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0014\u001a\u0004\b3\u00104R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R \u00109\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u0000@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020G8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020G8gX¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0014\u0010L\u001a\u00020G8gX¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010IR\u0014\u0010T\u001a\u00020=8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bU\u0010?R\u0014\u0010V\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010?¨\u0006|"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "StateT", "Lcom/robinhood/android/lib/trade/OrderState;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/view/SwipeToConfirmTouchListener$Callbacks;", "initialState", "<init>", "(Lcom/robinhood/android/lib/trade/OrderState;)V", "Lcom/robinhood/android/lib/trade/OrderState;", "rhAccessibilityManager", "Lcom/robinhood/shared/accessibility/RhAccessibilityManager;", "getRhAccessibilityManager", "()Lcom/robinhood/shared/accessibility/RhAccessibilityManager;", "rhAccessibilityManager$delegate", "Lkotlin/Lazy;", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "root$delegate", "Lkotlin/properties/ReadOnlyProperty;", "cardView", "Landroid/view/View;", "getCardView", "()Landroid/view/View;", "cardView$delegate", "contentScrollView", "Lcom/robinhood/utils/ui/view/BlockableNestedScrollView;", "getContentScrollView", "()Lcom/robinhood/utils/ui/view/BlockableNestedScrollView;", "contentScrollView$delegate", "snackbarShim", "Landroid/view/ViewGroup;", "getSnackbarShim", "()Landroid/view/ViewGroup;", "snackbarShim$delegate", "swipeHintView", "getSwipeHintView", "swipeHintView$delegate", "numpad", "Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", "getNumpad", "()Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", "numpad$delegate", "reviewOrderBtn", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getReviewOrderBtn", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "reviewOrderBtn$delegate", "flingThreshold", "", "getFlingThreshold", "()F", "flingThreshold$delegate", "swipeToConfirmListener", "Lcom/robinhood/android/common/view/SwipeToConfirmTouchListener;", "value", "formState", "getFormState", "()Lcom/robinhood/android/lib/trade/OrderState;", "reviewing", "", "getReviewing", "()Z", "backgroundUpdater", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$BackgroundUpdater;", "getBackgroundUpdater", "()Lcom/robinhood/android/lib/trade/BaseOrderFragment$BackgroundUpdater;", "setBackgroundUpdater", "(Lcom/robinhood/android/lib/trade/BaseOrderFragment$BackgroundUpdater;)V", "reviewButtonHeight", "", "getReviewButtonHeight", "()I", "contentRes", "getContentRes", "initialLayoutRes", "getInitialLayoutRes", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "usePrimaryColorBackground", "getUsePrimaryColorBackground", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "onViewCreated", "", "view", "onTouchExplorationEnabled", "enabled", "initializeNumpad", "setDelimiterEnabled", "delimiterEnabled", "onDestroyView", "onBackPressed", "validateAndReviewOrder", "setFormState", "newFormState", "setLoading", "loading", "onFormStateUpdated", "updateToolbarTheme", "isReviewing", "animateConstraintChange", "constraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "currentState", "(Landroidx/constraintlayout/widget/ConstraintSet;Lcom/robinhood/android/lib/trade/OrderState;Lcom/robinhood/android/lib/trade/BaseOrderFragment$BackgroundUpdater;)V", "onAnimationStep", "ratio", "maxDragDistance", "onSubmit", "getConstraintsForState", "(Lcom/robinhood/android/lib/trade/OrderState;)Landroidx/constraintlayout/widget/ConstraintSet;", "performSubmitOrder", "onOrderSubmitted", "onFormStateChanged", "onFormStateAnimationEnd", "EntryPoint", "Callbacks", "BackgroundUpdater", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class BaseOrderFragment<StateT extends OrderState<StateT>> extends BaseFragment implements SwipeToConfirmTouchListener.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseOrderFragment.class, BentoCurrencyPicker.ROOT_TEST_TAG, "getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), Reflection.property1(new PropertyReference1Impl(BaseOrderFragment.class, "cardView", "getCardView()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(BaseOrderFragment.class, "contentScrollView", "getContentScrollView()Lcom/robinhood/utils/ui/view/BlockableNestedScrollView;", 0)), Reflection.property1(new PropertyReference1Impl(BaseOrderFragment.class, "snackbarShim", "getSnackbarShim()Landroid/view/ViewGroup;", 0)), Reflection.property1(new PropertyReference1Impl(BaseOrderFragment.class, "swipeHintView", "getSwipeHintView()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(BaseOrderFragment.class, "numpad", "getNumpad()Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", 0)), Reflection.property1(new PropertyReference1Impl(BaseOrderFragment.class, "reviewOrderBtn", "getReviewOrderBtn()Lcom/robinhood/android/designsystem/button/RdsButton;", 0)), Reflection.property1(new PropertyReference1Impl(BaseOrderFragment.class, "flingThreshold", "getFlingThreshold()F", 0))};
    public static final int $stable = 8;
    private BackgroundUpdater backgroundUpdater;

    /* renamed from: cardView$delegate, reason: from kotlin metadata */
    private final Interfaces2 cardView;

    /* renamed from: contentScrollView$delegate, reason: from kotlin metadata */
    private final Interfaces2 contentScrollView;

    /* renamed from: flingThreshold$delegate, reason: from kotlin metadata */
    private final Interfaces2 flingThreshold;
    private StateT formState;
    private final StateT initialState;

    /* renamed from: numpad$delegate, reason: from kotlin metadata */
    private final Interfaces2 numpad;

    /* renamed from: reviewOrderBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 reviewOrderBtn;

    /* renamed from: rhAccessibilityManager$delegate, reason: from kotlin metadata */
    private final Lazy rhAccessibilityManager;

    /* renamed from: root$delegate, reason: from kotlin metadata */
    private final Interfaces2 root;

    /* renamed from: snackbarShim$delegate, reason: from kotlin metadata */
    private final Interfaces2 snackbarShim;

    /* renamed from: swipeHintView$delegate, reason: from kotlin metadata */
    private final Interfaces2 swipeHintView;
    private SwipeToConfirmTouchListener swipeToConfirmListener;

    /* compiled from: BaseOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "", "orderUuid", "Ljava/util/UUID;", "getOrderUuid", "()Ljava/util/UUID;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        UUID getOrderUuid();
    }

    /* compiled from: BaseOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderFragment$EntryPoint;", "", "rhAccessibilityManager", "Lcom/robinhood/shared/accessibility/RhAccessibilityManager;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface EntryPoint {
        RhAccessibilityManager rhAccessibilityManager();
    }

    public abstract ConstraintSet getConstraintsForState(StateT formState);

    public abstract int getContentRes();

    public abstract int getInitialLayoutRes();

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    protected boolean getUsePrimaryColorBackground() {
        return true;
    }

    public void onFormStateAnimationEnd(StateT formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
    }

    public void onFormStateChanged(StateT formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
    }

    public void onOrderSubmitted() {
    }

    public abstract void performSubmitOrder();

    public abstract void validateAndReviewOrder();

    @Override // com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public boolean getSubmitBeforeAnimation() {
        return SwipeToConfirmTouchListener.Callbacks.DefaultImpls.getSubmitBeforeAnimation(this);
    }

    @Override // com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onSwipeToSubmitAnimationComplete() {
        SwipeToConfirmTouchListener.Callbacks.DefaultImpls.onSwipeToSubmitAnimationComplete(this);
    }

    @Override // com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onSwipeToSubmitAnimationStart(long j) {
        SwipeToConfirmTouchListener.Callbacks.DefaultImpls.onSwipeToSubmitAnimationStart(this, j);
    }

    @Override // com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void setSubmitBeforeAnimation(boolean z) {
        SwipeToConfirmTouchListener.Callbacks.DefaultImpls.setSubmitBeforeAnimation(this, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOrderFragment(StateT initialState) {
        super(0);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.initialState = initialState;
        this.rhAccessibilityManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.lib.trade.BaseOrderFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseOrderFragment.rhAccessibilityManager_delegate$lambda$0(this.f$0);
            }
        });
        this.root = bindView(C20649R.id.constraint_layout);
        this.cardView = bindView(C20649R.id.cardview);
        this.contentScrollView = bindView(C20649R.id.content_scrollview);
        this.snackbarShim = bindView(C20649R.id.snackbar_shim);
        this.swipeHintView = bindView(C20649R.id.swipe_hint);
        this.numpad = bindView(C20649R.id.numpad);
        this.reviewOrderBtn = bindView(C20649R.id.review_btn);
        this.flingThreshold = BindResourcesKt.bindDimen(this, C20649R.dimen.order_fling_threshold);
        this.formState = initialState;
    }

    public final RhAccessibilityManager getRhAccessibilityManager() {
        return (RhAccessibilityManager) this.rhAccessibilityManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhAccessibilityManager rhAccessibilityManager_delegate$lambda$0(BaseOrderFragment baseOrderFragment) {
        ComponentCallbacks2 componentCallbacks2;
        Context applicationContext = baseOrderFragment.requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (applicationContext instanceof Application) {
            componentCallbacks2 = (Application) applicationContext;
        } else {
            Context applicationContext2 = applicationContext.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext2;
        }
        return ((EntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).rhAccessibilityManager();
    }

    protected final ConstraintLayout getRoot() {
        return (ConstraintLayout) this.root.getValue(this, $$delegatedProperties[0]);
    }

    protected final View getCardView() {
        return (View) this.cardView.getValue(this, $$delegatedProperties[1]);
    }

    protected final BlockableNestedScrollView getContentScrollView() {
        return (BlockableNestedScrollView) this.contentScrollView.getValue(this, $$delegatedProperties[2]);
    }

    protected final ViewGroup getSnackbarShim() {
        return (ViewGroup) this.snackbarShim.getValue(this, $$delegatedProperties[3]);
    }

    protected final View getSwipeHintView() {
        return (View) this.swipeHintView.getValue(this, $$delegatedProperties[4]);
    }

    protected final RdsNumpadView getNumpad() {
        return (RdsNumpadView) this.numpad.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final RdsButton getReviewOrderBtn() {
        return (RdsButton) this.reviewOrderBtn.getValue(this, $$delegatedProperties[6]);
    }

    private final float getFlingThreshold() {
        return ((Number) this.flingThreshold.getValue(this, $$delegatedProperties[7])).floatValue();
    }

    public final StateT getFormState() {
        return this.formState;
    }

    public final boolean getReviewing() {
        return this.formState.getIsReviewingState();
    }

    public final BackgroundUpdater getBackgroundUpdater() {
        return this.backgroundUpdater;
    }

    public final void setBackgroundUpdater(BackgroundUpdater backgroundUpdater) {
        this.backgroundUpdater = backgroundUpdater;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getReviewButtonHeight() {
        return getReviewOrderBtn().getHeight();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getInitialLayoutRes(), container, false);
        inflater.inflate(getContentRes(), (ViewGroup) viewInflate.findViewById(C20649R.id.content));
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initializeNumpad();
        SwipeToConfirmTouchListener swipeToConfirmTouchListener = new SwipeToConfirmTouchListener(getRoot(), getFlingThreshold());
        swipeToConfirmTouchListener.setCallbacks(this);
        this.swipeToConfirmListener = swipeToConfirmTouchListener;
        this.formState = this.initialState;
        getRoot().setOnTouchListener(this.formState.getIsReviewingState() ? this.swipeToConfirmListener : null);
        getLifecycleScope().launchWhenResumed(new C206402(this, null));
    }

    /* compiled from: BaseOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderFragment$onViewCreated$2", m3645f = "BaseOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.trade.BaseOrderFragment$onViewCreated$2 */
    static final class C206402 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseOrderFragment<StateT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C206402(BaseOrderFragment<StateT> baseOrderFragment, Continuation<? super C206402> continuation) {
            super(2, continuation);
            this.this$0 = baseOrderFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C206402(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C206402) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BaseOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lib.trade.BaseOrderFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<Boolean, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass1(Object obj) {
                super(2, obj, BaseOrderFragment.class, "onTouchExplorationEnabled", "onTouchExplorationEnabled(Z)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return C206402.invokeSuspend$onTouchExplorationEnabled((BaseOrderFragment) this.receiver, z, continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamKeyInputAccessibilityEnabled = this.this$0.getRhAccessibilityManager().streamKeyInputAccessibilityEnabled();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamKeyInputAccessibilityEnabled, anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$onTouchExplorationEnabled(BaseOrderFragment baseOrderFragment, boolean z, Continuation continuation) {
            baseOrderFragment.onTouchExplorationEnabled(z);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void onTouchExplorationEnabled(boolean enabled) {
        View swipeHintView = getSwipeHintView();
        TextView textView = swipeHintView instanceof TextView ? (TextView) swipeHintView : null;
        if (textView == null) {
            return;
        }
        if (enabled) {
            textView.setText(getString(C20649R.string.order_review_click_to_submit_prompt));
            OnClickListeners.onClick(textView, new Function0() { // from class: com.robinhood.android.lib.trade.BaseOrderFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseOrderFragment.onTouchExplorationEnabled$lambda$2(this.f$0);
                }
            });
        } else {
            textView.setText(getString(C20649R.string.order_review_swipe_to_submit_prompt));
            textView.setOnTouchListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTouchExplorationEnabled$lambda$2(BaseOrderFragment baseOrderFragment) {
        baseOrderFragment.onSubmit();
        return Unit.INSTANCE;
    }

    protected void initializeNumpad() {
        getNumpad().setVisibility(0);
        getReviewOrderBtn().setVisibility(0);
        getNumpad().useDefaultKeyHandler();
        OnClickListeners.onClick(getReviewOrderBtn(), new C206391(this));
    }

    /* compiled from: BaseOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.trade.BaseOrderFragment$initializeNumpad$1 */
    /* synthetic */ class C206391 extends FunctionReferenceImpl implements Function0<Unit> {
        C206391(Object obj) {
            super(0, obj, BaseOrderFragment.class, "validateAndReviewOrder", "validateAndReviewOrder()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((BaseOrderFragment) this.receiver).validateAndReviewOrder();
        }
    }

    public final void setDelimiterEnabled(boolean delimiterEnabled) {
        getNumpad().setDelimiterEnabled(delimiterEnabled);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SwipeToConfirmTouchListener swipeToConfirmTouchListener = this.swipeToConfirmListener;
        Intrinsics.checkNotNull(swipeToConfirmTouchListener);
        swipeToConfirmTouchListener.setCallbacks(null);
        this.swipeToConfirmListener = null;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        OrderState previousState = this.formState.getPreviousState();
        if (previousState != null) {
            setFormState(previousState);
            return true;
        }
        return super.onBackPressed();
    }

    public final void setFormState(StateT newFormState) {
        Intrinsics.checkNotNullParameter(newFormState, "newFormState");
        if (Intrinsics.areEqual(this.formState, newFormState)) {
            return;
        }
        this.formState = newFormState;
        onFormStateUpdated();
    }

    public final void setLoading(boolean loading) {
        getReviewOrderBtn().setLoading(loading);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onFormStateUpdated() {
        StateT statet = this.formState;
        getRoot().setOnTouchListener(statet.getIsReviewingState() ? this.swipeToConfirmListener : null);
        ConstraintSet constraintsForState = getConstraintsForState(statet);
        if (constraintsForState != null) {
            animateConstraintChange(constraintsForState, statet, this.backgroundUpdater);
        }
        updateToolbarTheme(statet.getIsReviewingState());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.invalidateOptionsMenu();
        onFormStateChanged(statet);
    }

    public void updateToolbarTheme(boolean isReviewing) {
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setUseDesignSystemTheme(getUseDesignSystemToolbar() && !isReviewing);
    }

    private final void animateConstraintChange(ConstraintSet constraintSet, final StateT currentState, BackgroundUpdater backgroundUpdater) {
        ConstraintLayout root = getRoot();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.lib.trade.BaseOrderFragment$animateConstraintChange$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.lib.trade.BaseOrderFragment$animateConstraintChange$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.lib.trade.BaseOrderFragment$animateConstraintChange$lambda$9$$inlined$doOnStart$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.RECURRING_ORDER_NUMPAD_ANIMATION, true);
                View view = this.this$0.getView();
                if (view != null) {
                    final BaseOrderFragment baseOrderFragment = this.this$0;
                    final OrderState orderState = currentState;
                    view.post(new Runnable() { // from class: com.robinhood.android.lib.trade.BaseOrderFragment$animateConstraintChange$1$1$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            BlockableNestedScrollView contentScrollView = baseOrderFragment.getContentScrollView();
                            if (contentScrollView != null) {
                                contentScrollView.setScrollable(!orderState.getIsReviewingState());
                            }
                        }
                    });
                }
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.lib.trade.BaseOrderFragment$animateConstraintChange$lambda$9$$inlined$doOnCancel$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.RECURRING_ORDER_NUMPAD_ANIMATION, false);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.lib.trade.BaseOrderFragment$animateConstraintChange$lambda$9$$inlined$doOnEnd$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                View view = this.this$0.getView();
                if (view != null) {
                    final BaseOrderFragment baseOrderFragment = this.this$0;
                    final OrderState orderState = currentState;
                    view.post(new Runnable() { // from class: com.robinhood.android.lib.trade.BaseOrderFragment$animateConstraintChange$1$3$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            BlockableNestedScrollView contentScrollView = baseOrderFragment.getContentScrollView();
                            if (contentScrollView != null) {
                                OrderState orderState2 = orderState;
                                boolean z = true;
                                contentScrollView.setScrollable(true);
                                if (orderState2.getIsReviewingState()) {
                                    contentScrollView.scrollTo(0, 0);
                                    if (!contentScrollView.canScrollVertically(1) && !contentScrollView.canScrollVertically(-1)) {
                                        z = false;
                                    }
                                }
                                contentScrollView.setScrollable(z);
                            }
                        }
                    });
                }
                IdlingResourceCounters2.setBusy(IdlingResourceType.RECURRING_ORDER_NUMPAD_ANIMATION, false);
                this.this$0.onFormStateAnimationEnd(currentState);
            }
        });
        Fade fade = new Fade();
        Interpolators interpolators = Interpolators.INSTANCE;
        fade.setInterpolator(interpolators.getFastOutSlowIn());
        transitionSet.addTransition(fade);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(interpolators.getFastOutSlowIn());
        transitionSet.addTransition(changeBounds);
        transitionSet.setOrdering(0);
        if (backgroundUpdater != null) {
            transitionSet.addListener((Transition.TransitionListener) backgroundUpdater);
        } else if (getUsePrimaryColorBackground()) {
            View viewRequireView = requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
            transitionSet.addListener((Transition.TransitionListener) new BackgroundUpdater(viewRequireView, getReviewing()));
        }
        TransitionManager.beginDelayedTransition(root, transitionSet);
        constraintSet.applyTo(getRoot());
    }

    @Override // com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onAnimationStep(float ratio, float maxDragDistance) {
        float f = maxDragDistance * ratio * (-1);
        getCardView().setTranslationY(f);
        getSwipeHintView().setTranslationY(f);
        getSwipeHintView().setAlpha(1.0f - ratio);
    }

    @Override // com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onSubmit() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        try {
            Timber.INSTANCE.mo3356i("Submitting order...", new Object[0]);
            performSubmitOrder();
        } catch (OrderSubmissionManager2 e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            Toast.makeText(activity, C20649R.string.order_create_already_placing_order, 1).show();
            onBackPressed();
            SwipeToConfirmTouchListener swipeToConfirmTouchListener = this.swipeToConfirmListener;
            if (swipeToConfirmTouchListener != null) {
                swipeToConfirmTouchListener.animateReset();
                return;
            }
            return;
        } catch (OrderSubmissionManager3 e2) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e2, false, null, 6, null);
        }
        onOrderSubmitted();
    }

    /* compiled from: BaseOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderFragment$BackgroundUpdater;", "Lcom/robinhood/utils/ui/animation/TransitionListenerAdapter;", "view", "Landroid/view/View;", "reviewing", "", "<init>", "(Landroid/view/View;Z)V", "transitionWasCancelled", "getTransitionWasCancelled", "()Z", "setTransitionWasCancelled", "(Z)V", "onTransitionStart", "", NavTransition2.KEY_TRANSITION, "Landroid/transition/Transition;", "onTransitionCancel", "onTransitionEnd", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static class BackgroundUpdater implements TransitionListenerAdapter {
        public static final int $stable = 8;
        private final boolean reviewing;
        private boolean transitionWasCancelled;
        private final View view;

        public BackgroundUpdater(View view, boolean z) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.reviewing = z;
        }

        @Override // com.robinhood.utils.p409ui.animation.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            TransitionListenerAdapter.DefaultImpls.onTransitionPause(this, transition);
        }

        @Override // com.robinhood.utils.p409ui.animation.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            TransitionListenerAdapter.DefaultImpls.onTransitionResume(this, transition);
        }

        protected final boolean getTransitionWasCancelled() {
            return this.transitionWasCancelled;
        }

        protected final void setTransitionWasCancelled(boolean z) {
            this.transitionWasCancelled = z;
        }

        @Override // com.robinhood.utils.p409ui.animation.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            if (this.reviewing) {
                ScarletManager2.overrideAttribute(this.view, android.R.attr.backgroundTint, ThemeAttributes.INSTANCE.getCOLOR_BACKGROUND_PRIMARY());
            }
            this.transitionWasCancelled = false;
        }

        @Override // com.robinhood.utils.p409ui.animation.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.transitionWasCancelled = true;
        }

        @Override // com.robinhood.utils.p409ui.animation.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            if (!this.reviewing && !this.transitionWasCancelled) {
                ScarletManager2.overrideAttribute(this.view, android.R.attr.backgroundTint, ThemeAttributes.INSTANCE.getCOLOR_BACKGROUND_1());
            }
            this.transitionWasCancelled = false;
        }
    }
}
