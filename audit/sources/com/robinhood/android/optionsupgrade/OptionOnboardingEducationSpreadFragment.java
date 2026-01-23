package com.robinhood.android.optionsupgrade;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.optionsupgrade.OptionOnboardingEducationSpreadFragment;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.optionsupgrade.databinding.FragmentOptionsUpgradeComparisonBinding;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.test.idler.TrackedListAdapter;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionOnboardingEducationSpreadFragment.kt */
@Metadata(m3635d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u001f\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u000267B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\"H\u0016J\u001a\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\"H\u0016J\t\u00100\u001a\u00020\u001aH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@CX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010 R\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationSpreadFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseScrollableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "primaryButtonStringRes", "", "getPrimaryButtonStringRes", "()Ljava/lang/Integer;", "binding", "Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionsUpgradeComparisonBinding;", "getBinding", "()Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionsUpgradeComparisonBinding;", "binding$delegate", "value", "", "useNightLotties", "setUseNightLotties", "(Z)V", "adapter", "com/robinhood/android/optionsupgrade/OptionOnboardingEducationSpreadFragment$adapter$1", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationSpreadFragment$adapter$1;", "setLoading", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "onAttach", "context", "Landroid/content/Context;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPrimaryBtnClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "SpreadViewHolder", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingEducationSpreadFragment extends BaseScrollableFragment implements RegionGated, OptionOnboardingScreens {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final OptionOnboardingEducationSpreadFragment2 adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final int primaryButtonStringRes;
    private boolean useNightLotties;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingEducationSpreadFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOnboardingEducationSpreadFragment.class, "binding", "getBinding()Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionsUpgradeComparisonBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return OptionOnboardingScreens.DefaultImpls.getEventScreen(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventData(this);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.robinhood.android.optionsupgrade.OptionOnboardingEducationSpreadFragment$adapter$1] */
    public OptionOnboardingEducationSpreadFragment() {
        super(C25121R.layout.fragment_options_upgrade_comparison);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingEducationSpreadFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof OptionOnboardingScreens2) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.primaryButtonStringRes = C11048R.string.general_label_continue;
        this.binding = ViewBinding5.viewBinding(this, OptionOnboardingEducationSpreadFragment3.INSTANCE);
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        final DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        this.adapter = new TrackedListAdapter<OptionOnboardingEducationSpreadFragment4, SpreadViewHolder>(equality) { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingEducationSpreadFragment$adapter$1
            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public OptionOnboardingEducationSpreadFragment.SpreadViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                return new OptionOnboardingEducationSpreadFragment.SpreadViewHolder(this.this$0, ViewGroups.inflate$default(parent, C25121R.layout.include_spread_comparison_page, false, 2, null));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public void onBindViewHolder(OptionOnboardingEducationSpreadFragment.SpreadViewHolder holder, int position) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                OptionOnboardingEducationSpreadFragment4 item = getItem(position);
                Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
                holder.bind(item);
            }
        };
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return (ScreenArgs) INSTANCE.getArgs((Fragment) this);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public Integer getPrimaryButtonStringRes() {
        return Integer.valueOf(this.primaryButtonStringRes);
    }

    private final FragmentOptionsUpgradeComparisonBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionsUpgradeComparisonBinding) value;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void setUseNightLotties(boolean z) {
        if (this.useNightLotties != z) {
            this.useNightLotties = z;
            notifyDataSetChanged();
        }
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        getPrimaryBtn().setLoading(isLoading);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        setScarletContextWrapper(null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, requireBaseActivity().getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingEducationSpreadFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOnboardingEducationSpreadFragment.onStart$lambda$0(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(OptionOnboardingEducationSpreadFragment optionOnboardingEducationSpreadFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        optionOnboardingEducationSpreadFragment.setUseNightLotties(it == DayNightOverlay.NIGHT);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().optionsUpgradeChipTabs.setOnPositionChanged(new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingEducationSpreadFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOnboardingEducationSpreadFragment.onViewCreated$lambda$1(this.f$0, ((Integer) obj).intValue());
            }
        });
        ViewPager2 viewPager2 = getBinding().optionsUpgradeSpreadsPager;
        OptionOnboardingEducationSpreadFragment2 optionOnboardingEducationSpreadFragment2 = this.adapter;
        optionOnboardingEducationSpreadFragment2.submitList(CollectionsKt.toList(OptionOnboardingEducationSpreadFragment4.getEntries()));
        viewPager2.setAdapter(optionOnboardingEducationSpreadFragment2);
        getBinding().optionsUpgradeSpreadsPager.registerOnPageChangeCallback(getBinding().optionsUpgradeChipTabs.getPageChangeCallback());
        ScarletManager2.overrideStyle$default(getPrimaryBtn(), new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.primaryMonochromeButtonStyle), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionOnboardingEducationSpreadFragment optionOnboardingEducationSpreadFragment, int i) {
        optionOnboardingEducationSpreadFragment.getBinding().optionsUpgradeSpreadsPager.setCurrentItem(i, true);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public void onPrimaryBtnClicked() {
        OptionOnboardingScreens2 callbacks = getCallbacks();
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.EducationSpread(((ScreenArgs.EducationSpread) companion.getArgs((Fragment) this)).getScreenId()), (ScreenArgs) companion.getArgs((Fragment) this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OptionOnboardingEducationSpreadFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationSpreadFragment$SpreadViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationSpreadFragment;Landroid/view/View;)V", "lottieAnimationView", "Lcom/airbnb/lottie/LottieAnimationView;", "kotlin.jvm.PlatformType", "descriptionTxt", "Landroid/widget/TextView;", "bind", "", "spreadResource", "Lcom/robinhood/android/optionsupgrade/SpreadResource;", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    final class SpreadViewHolder extends RecyclerView.ViewHolder {
        private final TextView descriptionTxt;
        private final LottieAnimationView lottieAnimationView;
        final /* synthetic */ OptionOnboardingEducationSpreadFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpreadViewHolder(OptionOnboardingEducationSpreadFragment optionOnboardingEducationSpreadFragment, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = optionOnboardingEducationSpreadFragment;
            this.lottieAnimationView = (LottieAnimationView) itemView.findViewById(C25121R.id.spread_comparison_page_lottie);
            this.descriptionTxt = (TextView) itemView.findViewById(C25121R.id.spread_comparison_page_description);
            itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingEducationSpreadFragment.SpreadViewHolder.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    if (SpreadViewHolder.this.lottieAnimationView.isAnimating()) {
                        return;
                    }
                    SpreadViewHolder.this.lottieAnimationView.setProgress(0.0f);
                    SpreadViewHolder.this.lottieAnimationView.playAnimation();
                }
            });
        }

        public final void bind(OptionOnboardingEducationSpreadFragment4 spreadResource) {
            Intrinsics.checkNotNullParameter(spreadResource, "spreadResource");
            TextView textView = this.descriptionTxt;
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            textView.setText(ViewsKt.getString(itemView, spreadResource.getDescriptionResId()));
            LottieAnimationView lottieAnimationView = this.lottieAnimationView;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "lottieAnimationView");
            LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, this.this$0.useNightLotties ? spreadResource.getNightLottieUrl() : spreadResource.getDayLottieUrl());
        }
    }

    /* compiled from: OptionOnboardingEducationSpreadFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationSpreadFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationSpreadFragment;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$EducationSpread;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOnboardingEducationSpreadFragment, ScreenArgs.EducationSpread> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ScreenArgs.EducationSpread getArgs(OptionOnboardingEducationSpreadFragment optionOnboardingEducationSpreadFragment) {
            return (ScreenArgs.EducationSpread) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingEducationSpreadFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingEducationSpreadFragment newInstance(ScreenArgs.EducationSpread educationSpread) {
            return (OptionOnboardingEducationSpreadFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, educationSpread);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingEducationSpreadFragment optionOnboardingEducationSpreadFragment, ScreenArgs.EducationSpread educationSpread) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingEducationSpreadFragment, educationSpread);
        }
    }
}
