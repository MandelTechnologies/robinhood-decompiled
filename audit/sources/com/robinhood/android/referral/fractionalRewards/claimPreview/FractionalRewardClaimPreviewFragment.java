package com.robinhood.android.referral.fractionalRewards.claimPreview;

import android.R;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.view.SwipeToConfirmTouchListener;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.databinding.FragmentFractionalRewardClaimPreviewBinding;
import com.robinhood.android.referral.fractionalRewards.claimPreview.FractionalRewardClaimPreviewFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: FractionalRewardClaimPreviewFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u000245B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0017J\b\u0010,\u001a\u00020$H\u0016J\u0018\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020$H\u0016J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020$H\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b \u0010!¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimPreviewFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/view/SwipeToConfirmTouchListener$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "binding", "Lcom/robinhood/android/referral/databinding/FragmentFractionalRewardClaimPreviewBinding;", "getBinding", "()Lcom/robinhood/android/referral/databinding/FragmentFractionalRewardClaimPreviewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "flingThreshold", "", "getFlingThreshold", "()F", "flingThreshold$delegate", "swipeToConfirmListener", "Lcom/robinhood/android/common/view/SwipeToConfirmTouchListener;", "duxo", "Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimPreviewDuxo;", "getDuxo", "()Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimPreviewDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimPreviewFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimPreviewFragment$Callbacks;", "callbacks$delegate", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onAnimationStep", "ratio", "maxDragDistance", "onSubmit", "onBackPressed", "", "onDestroyView", "Callbacks", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class FractionalRewardClaimPreviewFragment extends BaseFragment implements SwipeToConfirmTouchListener.Callbacks, RhDialogFragment.OnDismissListener, AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: flingThreshold$delegate, reason: from kotlin metadata */
    private final Interfaces2 flingThreshold;
    private SwipeToConfirmTouchListener swipeToConfirmListener;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FractionalRewardClaimPreviewFragment.class, "binding", "getBinding()Lcom/robinhood/android/referral/databinding/FragmentFractionalRewardClaimPreviewBinding;", 0)), Reflection.property1(new PropertyReference1Impl(FractionalRewardClaimPreviewFragment.class, "flingThreshold", "getFlingThreshold()F", 0)), Reflection.property1(new PropertyReference1Impl(FractionalRewardClaimPreviewFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimPreviewFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FractionalRewardClaimPreviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimPreviewFragment$Callbacks;", "", "onClaimPreviewCompleted", "", "claimInfo", "Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimInfo;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onClaimPreviewCompleted(FractionalRewardClaimInfo claimInfo);
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

    public FractionalRewardClaimPreviewFragment() {
        super(C26659R.layout.fragment_fractional_reward_claim_preview);
        this.binding = ViewBinding5.viewBinding(this, FractionalRewardClaimPreviewFragment2.INSTANCE);
        this.flingThreshold = BindResourcesKt.bindDimen(this, C26659R.dimen.fractional_reward_claim_fling_threshold);
        this.duxo = OldDuxos.oldDuxo(this, FractionalRewardClaimPreviewDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.referral.fractionalRewards.claimPreview.FractionalRewardClaimPreviewFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof FractionalRewardClaimPreviewFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.SWIPE_TO_CLAIM_SCREEN, null, ((FractionalRewardClaimInfo) INSTANCE.getArgs((Fragment) this)).getInstrumentName(), null, 10, null);
    }

    private final FragmentFractionalRewardClaimPreviewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentFractionalRewardClaimPreviewBinding) value;
    }

    private final float getFlingThreshold() {
        return ((Number) this.flingThreshold.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    private final FractionalRewardClaimPreviewDuxo getDuxo() {
        return (FractionalRewardClaimPreviewDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Window window = requireActivity().getWindow();
        android.content.Context context = toolbar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        window.setStatusBarColor(ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary));
        ScarletManager2.overrideAttribute(toolbar, R.attr.backgroundTint, ThemeAttributes.INSTANCE.getCOLOR_PRIMARY());
        toolbar.setColorControlNormalOverride(new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, C20690R.attr.colorWhite));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LinearLayout root = getBinding().getRoot();
        Intrinsics.checkNotNull(root);
        SwipeToConfirmTouchListener swipeToConfirmTouchListener = new SwipeToConfirmTouchListener(root, getFlingThreshold());
        swipeToConfirmTouchListener.setCallbacks(this);
        this.swipeToConfirmListener = swipeToConfirmTouchListener;
        root.setOnTouchListener(swipeToConfirmTouchListener);
        RhTextView swipeHint = getBinding().swipeHint;
        Intrinsics.checkNotNullExpressionValue(swipeHint, "swipeHint");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(swipeHint, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.referral.fractionalRewards.claimPreview.FractionalRewardClaimPreviewFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FractionalRewardClaimPreviewFragment.onResume$lambda$3(this.f$0, (FractionalRewardClaimPreviewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(FractionalRewardClaimPreviewFragment fractionalRewardClaimPreviewFragment, FractionalRewardClaimPreviewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        FragmentFractionalRewardClaimPreviewBinding binding = fractionalRewardClaimPreviewFragment.getBinding();
        binding.rewardAmountTxt.setText(state.getRewardAmountText());
        RhTextView rhTextView = binding.sharesAmountTxt;
        Resources resources = fractionalRewardClaimPreviewFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(state.getSharesAmountText(resources));
        RhTextView rhTextView2 = binding.companyTxt;
        Resources resources2 = fractionalRewardClaimPreviewFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(state.getCompanyNameText(resources2));
        RhTextView rhTextView3 = binding.claimSummaryDescriptionTxt;
        Resources resources3 = fractionalRewardClaimPreviewFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rhTextView3.setText(state.getSummaryDescriptionText(resources3));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onAnimationStep(float ratio, float maxDragDistance) {
        float f = maxDragDistance * ratio * (-1);
        float f2 = 1.0f - ratio;
        FragmentFractionalRewardClaimPreviewBinding binding = getBinding();
        binding.cardview.setTranslationY(f);
        binding.swipeHint.setTranslationY(f);
        binding.swipeHint.setAlpha(f2);
    }

    @Override // com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onSubmit() {
        getDuxo().onClaimPreviewCompleted(getScreenName());
        getCallbacks().onClaimPreviewCompleted((FractionalRewardClaimInfo) INSTANCE.getArgs((Fragment) this));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            Window window = requireActivity().getWindow();
            android.content.Context context = rhToolbar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            window.setStatusBarColor(ThemeColors.getThemeColor(context, C20690R.attr.colorBackground1));
            ScarletManager2.overrideAttribute(rhToolbar, R.attr.backgroundTint, ThemeAttributes.INSTANCE.getCOLOR_BACKGROUND_1());
            rhToolbar.setColorControlNormalOverride(new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, C20690R.attr.colorForeground1));
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SwipeToConfirmTouchListener swipeToConfirmTouchListener = this.swipeToConfirmListener;
        if (swipeToConfirmTouchListener != null) {
            swipeToConfirmTouchListener.setCallbacks(null);
        }
        this.swipeToConfirmListener = null;
    }

    /* compiled from: FractionalRewardClaimPreviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimPreviewFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimPreviewFragment;", "Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimInfo;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<FractionalRewardClaimPreviewFragment, FractionalRewardClaimInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public FractionalRewardClaimInfo getArgs(FractionalRewardClaimPreviewFragment fractionalRewardClaimPreviewFragment) {
            return (FractionalRewardClaimInfo) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, fractionalRewardClaimPreviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FractionalRewardClaimPreviewFragment newInstance(FractionalRewardClaimInfo fractionalRewardClaimInfo) {
            return (FractionalRewardClaimPreviewFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, fractionalRewardClaimInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FractionalRewardClaimPreviewFragment fractionalRewardClaimPreviewFragment, FractionalRewardClaimInfo fractionalRewardClaimInfo) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, fractionalRewardClaimPreviewFragment, fractionalRewardClaimInfo);
        }
    }
}
