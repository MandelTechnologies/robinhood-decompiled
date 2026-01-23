package com.robinhood.android.rhymigration.p245ui.intro;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.databinding.FragmentRhyFeatureIntroBinding;
import com.robinhood.android.rhymigration.model.UiRhyMigrationFeaturePage;
import com.robinhood.android.rhymigration.p245ui.PageDataCallbacks;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoggingUtils;
import com.robinhood.android.rhymigration.p245ui.intro.RhyFeatureDisclosureActivity;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.p403ui.NoUnderlineMarkwon;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: RhyFeatureIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002:;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0016J\b\u0010-\u001a\u00020&H\u0002J\u001c\u0010.\u001a\u00020&2\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020100H\u0002J\t\u00103\u001a\u000204H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0018\u00105\u001a\b\u0012\u0004\u0012\u00020706X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureIntroFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/rhymigration/databinding/FragmentRhyFeatureIntroBinding;", "getBinding", "()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyFeatureIntroBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "pageCallbacks", "Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "getPageCallbacks", "()Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "pageCallbacks$delegate", "page", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;", "getPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;", "page$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "resizeAnimationHeight", "displayDisclosureDialog", "disclosureLink", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyFeatureIntroFragment extends BaseFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    @NoUnderlineMarkwon
    public Markwon markwon;

    /* renamed from: page$delegate, reason: from kotlin metadata */
    private final Lazy page;

    /* renamed from: pageCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 pageCallbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyFeatureIntroFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyFeatureIntroBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RhyFeatureIntroFragment.class, "pageCallbacks", "getPageCallbacks()Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", 0))};

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

    public RhyFeatureIntroFragment() {
        super(C27577R.layout.fragment_rhy_feature_intro);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, RhyFeatureIntroFragment2.INSTANCE);
        this.pageCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(PageDataCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureIntroFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof PageDataCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.page = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureIntroFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyFeatureIntroFragment.page_delegate$lambda$0(this.f$0);
            }
        });
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

    private final FragmentRhyFeatureIntroBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyFeatureIntroBinding) value;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreen();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return getEventScreen().getName().name();
    }

    private final PageDataCallbacks getPageCallbacks() {
        return (PageDataCallbacks) this.pageCallbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final UiRhyMigrationFeaturePage getPage() {
        return (UiRhyMigrationFeaturePage) this.page.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiRhyMigrationFeaturePage page_delegate$lambda$0(RhyFeatureIntroFragment rhyFeatureIntroFragment) {
        return rhyFeatureIntroFragment.getPageCallbacks().getFeaturePage(((Args) INSTANCE.getArgs((Fragment) rhyFeatureIntroFragment)).getPageIndex());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().rhyFeatureIntroAnimation.setAnimationFromUrl(getPage().getAnimationAsset());
        getBinding().rhyFeatureIntroTitle.setText(getPage().getTitle());
        getBinding().rhyFeatureIntroSubtitle.setText(Markwons.toSpanned$default(getMarkwon(), getPage().getSubtitle(), null, 2, null));
        if (((Args) INSTANCE.getArgs((Fragment) this)).getFromCmSunset()) {
            getBinding().rhyFeaturePrimaryBtn.setVisibility(0);
            RdsButton rhyFeaturePrimaryBtn = getBinding().rhyFeaturePrimaryBtn;
            Intrinsics.checkNotNullExpressionValue(rhyFeaturePrimaryBtn, "rhyFeaturePrimaryBtn");
            OnClickListeners.onClick(rhyFeaturePrimaryBtn, new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureIntroFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyFeatureIntroFragment.onViewCreated$lambda$1(this.f$0);
                }
            });
        } else {
            getBinding().rhyFeaturePrimaryBtn.setVisibility(8);
        }
        if (getPage().getLoopAnimation()) {
            LottieAnimationView lottieAnimationView = getBinding().rhyFeatureIntroAnimation;
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.setRepeatCount(-1);
        }
        RhTextView rhyFeatureIntroDisclosure = getBinding().rhyFeatureIntroDisclosure;
        Intrinsics.checkNotNullExpressionValue(rhyFeatureIntroDisclosure, "rhyFeatureIntroDisclosure");
        rhyFeatureIntroDisclosure.setVisibility(getPage().getDisclosure() != null ? 0 : 8);
        String disclosure = getPage().getDisclosure();
        if (disclosure != null) {
            getBinding().rhyFeatureIntroDisclosure.setText(disclosure);
        }
        RhTextView rhTextView = getBinding().rhyFeatureIntroDisclosure;
        Intrinsics.checkNotNull(rhTextView);
        ViewsKt.eventData$default(rhTextView, false, new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureIntroFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyFeatureIntroFragment.onViewCreated$lambda$6$lambda$4(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureIntroFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyFeatureIntroFragment.onViewCreated$lambda$6$lambda$5(this.f$0);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxView.layoutChanges(requireToolbar()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureIntroFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyFeatureIntroFragment.onViewCreated$lambda$7(this.f$0, (Unit) obj);
            }
        });
        RhTextView rhyFeatureIntroSubtitle = getBinding().rhyFeatureIntroSubtitle;
        Intrinsics.checkNotNullExpressionValue(rhyFeatureIntroSubtitle, "rhyFeatureIntroSubtitle");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(RxView.layoutChanges(rhyFeatureIntroSubtitle)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureIntroFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyFeatureIntroFragment.onViewCreated$lambda$8(this.f$0, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RhyFeatureIntroFragment rhyFeatureIntroFragment) {
        rhyFeatureIntroFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$6$lambda$4(RhyFeatureIntroFragment rhyFeatureIntroFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LEARN_MORE, RhyOnboardingLoggingUtils.getEventContext$default(rhyFeatureIntroFragment, (AgreementContext) null, (String) null, 3, (Object) null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5(RhyFeatureIntroFragment rhyFeatureIntroFragment) {
        ResourceLink<EntryResource<Disclosure>> disclosureDialog = rhyFeatureIntroFragment.getPage().getDisclosureDialog();
        if (disclosureDialog != null) {
            rhyFeatureIntroFragment.displayDisclosureDialog(disclosureDialog);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(RhyFeatureIntroFragment rhyFeatureIntroFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhTextView rhyFeatureIntroTitle = rhyFeatureIntroFragment.getBinding().rhyFeatureIntroTitle;
        Intrinsics.checkNotNullExpressionValue(rhyFeatureIntroTitle, "rhyFeatureIntroTitle");
        RhToolbar rhToolbar = rhyFeatureIntroFragment.getRhToolbar();
        com.robinhood.utils.extensions.ViewsKt.setMarginTop(rhyFeatureIntroTitle, rhToolbar != null ? rhToolbar.getBottom() : 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(RhyFeatureIntroFragment rhyFeatureIntroFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyFeatureIntroFragment.resizeAnimationHeight();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LottieAnimationView lottieAnimationView = getBinding().rhyFeatureIntroAnimation;
        if (lottieAnimationView.isAnimating()) {
            return;
        }
        lottieAnimationView.playAnimation();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LottieAnimationView lottieAnimationView = getBinding().rhyFeatureIntroAnimation;
        lottieAnimationView.setProgress(0.0f);
        lottieAnimationView.cancelAnimation();
    }

    private final void resizeAnimationHeight() {
        RhTextView rhyFeatureIntroTitle = getBinding().rhyFeatureIntroTitle;
        Intrinsics.checkNotNullExpressionValue(rhyFeatureIntroTitle, "rhyFeatureIntroTitle");
        RhTextView rhyFeatureIntroSubtitle = getBinding().rhyFeatureIntroSubtitle;
        Intrinsics.checkNotNullExpressionValue(rhyFeatureIntroSubtitle, "rhyFeatureIntroSubtitle");
        RhTextView rhyFeatureIntroDisclosure = getBinding().rhyFeatureIntroDisclosure;
        Intrinsics.checkNotNullExpressionValue(rhyFeatureIntroDisclosure, "rhyFeatureIntroDisclosure");
        int top = (rhyFeatureIntroDisclosure.getVisibility() == 0 ? rhyFeatureIntroDisclosure.getTop() : getBinding().getRoot().getBottom()) - rhyFeatureIntroSubtitle.getBottom();
        getBinding().rhyFeatureAnimationTopGuideline.setGuidelineBegin(RangesKt.coerceAtLeast(rhyFeatureIntroSubtitle.getBottom() - (((int) (top / getPage().getAnimationPortionUnderSubtitle())) - top), com.robinhood.utils.extensions.ViewsKt.getMarginTop(rhyFeatureIntroTitle)));
    }

    private final void displayDisclosureDialog(ResourceLink<EntryResource<Disclosure>> disclosureLink) {
        RhyFeatureDisclosureActivity.Companion companion = RhyFeatureDisclosureActivity.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivity(companion.getIntentWithExtras(contextRequireContext, (Parcelable) disclosureLink));
    }

    /* compiled from: RhyFeatureIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureIntroFragment$Args;", "Landroid/os/Parcelable;", "pageIndex", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "fromCmSunset", "", "<init>", "(ILcom/robinhood/rosetta/eventlogging/Screen;Z)V", "getPageIndex", "()I", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getFromCmSunset", "()Z", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean fromCmSunset;
        private final int pageIndex;
        private final Screen screen;

        /* compiled from: RhyFeatureIntroFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt(), (Screen) parcel.readSerializable(), parcel.readInt() != 0);
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
            dest.writeInt(this.pageIndex);
            dest.writeSerializable(this.screen);
            dest.writeInt(this.fromCmSunset ? 1 : 0);
        }

        public Args(int i, Screen screen, boolean z) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.pageIndex = i;
            this.screen = screen;
            this.fromCmSunset = z;
        }

        public /* synthetic */ Args(int i, Screen screen, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, screen, (i2 & 4) != 0 ? false : z);
        }

        public final int getPageIndex() {
            return this.pageIndex;
        }

        public final Screen getScreen() {
            return this.screen;
        }

        public final boolean getFromCmSunset() {
            return this.fromCmSunset;
        }
    }

    /* compiled from: RhyFeatureIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureIntroFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureIntroFragment;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureIntroFragment$Args;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhyFeatureIntroFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhyFeatureIntroFragment rhyFeatureIntroFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyFeatureIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyFeatureIntroFragment newInstance(Args args) {
            return (RhyFeatureIntroFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyFeatureIntroFragment rhyFeatureIntroFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyFeatureIntroFragment, args);
        }
    }
}
