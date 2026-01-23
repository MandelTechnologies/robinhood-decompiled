package com.robinhood.android.directipo.allocation.clarity.p103ui.announcement;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.databinding.FragmentDirectIpoNewAnnouncementBinding;
import com.robinhood.android.directipo.p106ui.allocation.DirectIpoAllocationClarityCardHookView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.directipo.models.p292db.IpoAnnouncementAllocationStat;
import com.robinhood.directipo.models.p292db.IpoAnnouncementCardHook;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.ImageSource;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
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

/* compiled from: DirectIpoNewAnnouncementFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001>B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020(2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020(2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00105\u001a\u00020 2\u0006\u00106\u001a\u000207H\u0016J\t\u00108\u001a\u00020 H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020 X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "<init>", "()V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "duxo", "Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementDuxo;", "getDuxo", "()Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/directipo/allocation/clarity/databinding/FragmentDirectIpoNewAnnouncementBinding;", "getBinding", "()Lcom/robinhood/android/directipo/allocation/clarity/databinding/FragmentDirectIpoNewAnnouncementBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "setViewState", "viewState", "Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementViewState;", "bindSubtitle", "onActionClicked", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoNewAnnouncementFragment extends BaseFragment implements RegionGated, AutoLoggableFragment, ClientComponentButtonView.Callbacks {
    private static final int SUBTITLE_MAX_LINES = 2;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public ImageLoader imageLoader;
    public Markwon markwon;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoNewAnnouncementFragment.class, "binding", "getBinding()Lcom/robinhood/android/directipo/allocation/clarity/databinding/FragmentDirectIpoNewAnnouncementBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoNewAnnouncementFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

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

    public DirectIpoNewAnnouncementFragment() {
        super(C14172R.layout.fragment_direct_ipo_new_announcement);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, DirectIpoNewAnnouncementDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DirectIpoNewAnnouncementFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
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

    private final DirectIpoNewAnnouncementDuxo getDuxo() {
        return (DirectIpoNewAnnouncementDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentDirectIpoNewAnnouncementBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoNewAnnouncementBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.IPOA_ANNOUNCEMENT;
        String string2 = ((LegacyFragmentKey.IpoAnnouncement) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(contextRequireContext).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141751(getDuxo()));
        Observable<DirectIpoNewAnnouncementViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141762(this));
    }

    /* compiled from: DirectIpoNewAnnouncementFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementFragment$onStart$1 */
    /* synthetic */ class C141751 extends FunctionReferenceImpl implements Function1<DayNightOverlay, Unit> {
        C141751(Object obj) {
            super(1, obj, DirectIpoNewAnnouncementDuxo.class, "updateDayNightOverlay", "updateDayNightOverlay(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DayNightOverlay dayNightOverlay) {
            invoke2(dayNightOverlay);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DayNightOverlay p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoNewAnnouncementDuxo) this.receiver).updateDayNightOverlay(p0);
        }
    }

    /* compiled from: DirectIpoNewAnnouncementFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementFragment$onStart$2 */
    /* synthetic */ class C141762 extends FunctionReferenceImpl implements Function1<DirectIpoNewAnnouncementViewState, Unit> {
        C141762(Object obj) {
            super(1, obj, DirectIpoNewAnnouncementFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectIpoNewAnnouncementViewState directIpoNewAnnouncementViewState) throws Throwable {
            invoke2(directIpoNewAnnouncementViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectIpoNewAnnouncementViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoNewAnnouncementFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton ipoAnnouncementSubtitleSeeMoreBtn = getBinding().ipoAnnouncementSubtitleSeeMoreBtn;
        Intrinsics.checkNotNullExpressionValue(ipoAnnouncementSubtitleSeeMoreBtn, "ipoAnnouncementSubtitleSeeMoreBtn");
        OnClickListeners.onClick(ipoAnnouncementSubtitleSeeMoreBtn, new Function0() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoNewAnnouncementFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        requireBaseActivity().showCloseIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(DirectIpoNewAnnouncementFragment directIpoNewAnnouncementFragment) {
        directIpoNewAnnouncementFragment.getDuxo().toggleSubtitleExpandedState();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final DirectIpoNewAnnouncementViewState viewState) throws Throwable {
        Throwable thConsume;
        UiEvent<Throwable> error = viewState.getError();
        if (error != null && (thConsume = error.consume()) != null) {
            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, requireBaseActivity(), thConsume, true, false, 0, null, 56, null);
        }
        ShimmerLoadingView ipoAnnouncementLoadingView = getBinding().ipoAnnouncementLoadingView;
        Intrinsics.checkNotNullExpressionValue(ipoAnnouncementLoadingView, "ipoAnnouncementLoadingView");
        ipoAnnouncementLoadingView.setVisibility(viewState.isLoading() ? 0 : 8);
        getBinding().ipoAnnouncementTitle.setText(viewState.getTitle());
        ThemedImageSource logoImages = viewState.getLogoImages();
        if (logoImages != null) {
            if (WhenMappings.$EnumSwitchMapping$0[viewState.getDayNightOverlay().ordinal()] == 1) {
                ImageLoader imageLoader = getImageLoader();
                ImageSource light = logoImages.getLight();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                ImageLoader.ImageRequest imageRequestLoad = imageLoader.load(light.toImageUrl(contextRequireContext));
                ImageView ipoAnnouncementImage = getBinding().ipoAnnouncementImage;
                Intrinsics.checkNotNullExpressionValue(ipoAnnouncementImage, "ipoAnnouncementImage");
                ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, ipoAnnouncementImage, null, null, 6, null);
            } else {
                ImageLoader imageLoader2 = getImageLoader();
                ImageSource dark = logoImages.getDark();
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                ImageLoader.ImageRequest imageRequestLoad2 = imageLoader2.load(dark.toImageUrl(contextRequireContext2));
                ImageView ipoAnnouncementImage2 = getBinding().ipoAnnouncementImage;
                Intrinsics.checkNotNullExpressionValue(ipoAnnouncementImage2, "ipoAnnouncementImage");
                ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad2, ipoAnnouncementImage2, null, null, 6, null);
            }
        }
        List<IpoAnnouncementAllocationStat> allocationStats = viewState.getAllocationStats();
        if (allocationStats != null) {
            getBinding().ipoAnnouncementStatsView.bind(allocationStats);
        }
        final GenericButton footerButton = viewState.getFooterButton();
        if (footerButton != null) {
            getBinding().ipoAnnouncementFooterBtn.bind(ServerDrivenButton.INSTANCE.from(footerButton));
            ClientComponentButtonView clientComponentButtonView = getBinding().ipoAnnouncementFooterBtn;
            Intrinsics.checkNotNull(clientComponentButtonView);
            ViewsKt.eventData$default(clientComponentButtonView, false, new Function0() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectIpoNewAnnouncementFragment.setViewState$lambda$6$lambda$5$lambda$4(footerButton, viewState);
                }
            }, 1, null);
            clientComponentButtonView.setCallbacks(this);
            ClientComponentButtonView ipoAnnouncementFooterBtn = getBinding().ipoAnnouncementFooterBtn;
            Intrinsics.checkNotNullExpressionValue(ipoAnnouncementFooterBtn, "ipoAnnouncementFooterBtn");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(ipoAnnouncementFooterBtn, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        IpoAnnouncementCardHook cardHook = viewState.getCardHook();
        if (cardHook != null) {
            DirectIpoAllocationClarityCardHookView ipoAnnouncementCardHookView = getBinding().ipoAnnouncementCardHookView;
            Intrinsics.checkNotNullExpressionValue(ipoAnnouncementCardHookView, "ipoAnnouncementCardHookView");
            ipoAnnouncementCardHookView.setVisibility(0);
            getBinding().ipoAnnouncementCardHookView.bind(cardHook, viewState.getLoggingContext());
        }
        bindSubtitle(viewState);
        MarkdownContent disclosureText = viewState.getDisclosureText();
        if (disclosureText != null) {
            getBinding().ipoAnnouncementDisclosure.setText(Markwons.toSpanned$default(getMarkwon(), disclosureText, null, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor setViewState$lambda$6$lambda$5$lambda$4(GenericButton genericButton, DirectIpoNewAnnouncementViewState directIpoNewAnnouncementViewState) {
        return new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, directIpoNewAnnouncementViewState.getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -3, -1, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, genericButton.getLoggingIdentifier(), null, 4, null), null, 39, null);
    }

    private final void bindSubtitle(DirectIpoNewAnnouncementViewState viewState) {
        int i;
        getBinding().ipoAnnouncementSubtitle.setText(viewState.getSubtitleMarkdown());
        if (!viewState.getSubtitleExpanded()) {
            getBinding().ipoAnnouncementSubtitle.post(new Runnable() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementFragment.bindSubtitle.1
                @Override // java.lang.Runnable
                public final void run() {
                    RdsButton rdsButton = DirectIpoNewAnnouncementFragment.this.getBinding().ipoAnnouncementSubtitleSeeMoreBtn;
                    RhTextView ipoAnnouncementSubtitle = DirectIpoNewAnnouncementFragment.this.getBinding().ipoAnnouncementSubtitle;
                    Intrinsics.checkNotNullExpressionValue(ipoAnnouncementSubtitle, "ipoAnnouncementSubtitle");
                    rdsButton.setVisibility(TextViewsKt.isTruncated(ipoAnnouncementSubtitle) ? 0 : 8);
                }
            });
        }
        int i2 = viewState.getSubtitleExpanded() ? Integer.MAX_VALUE : 2;
        if (viewState.getSubtitleExpanded()) {
            i = C14172R.string.ipo_announcement_subtitle_see_less;
        } else {
            i = C14172R.string.ipo_announcement_subtitle_see_more;
        }
        getBinding().ipoAnnouncementSubtitle.setMaxLines(i2);
        getBinding().ipoAnnouncementSubtitleSeeMoreBtn.setText(i);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        ClientComponentButtonView ipoAnnouncementFooterBtn = getBinding().ipoAnnouncementFooterBtn;
        Intrinsics.checkNotNullExpressionValue(ipoAnnouncementFooterBtn, "ipoAnnouncementFooterBtn");
        ViewsKt.logTap(ipoAnnouncementFooterBtn);
        return false;
    }

    /* compiled from: DirectIpoNewAnnouncementFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$IpoAnnouncement;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "SUBTITLE_MAX_LINES", "", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoNewAnnouncementFragment, LegacyFragmentKey.IpoAnnouncement>, FragmentResolver<LegacyFragmentKey.IpoAnnouncement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.IpoAnnouncement getArgs(DirectIpoNewAnnouncementFragment directIpoNewAnnouncementFragment) {
            return (LegacyFragmentKey.IpoAnnouncement) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoNewAnnouncementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoNewAnnouncementFragment newInstance(LegacyFragmentKey.IpoAnnouncement ipoAnnouncement) {
            return (DirectIpoNewAnnouncementFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, ipoAnnouncement);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoNewAnnouncementFragment directIpoNewAnnouncementFragment, LegacyFragmentKey.IpoAnnouncement ipoAnnouncement) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoNewAnnouncementFragment, ipoAnnouncement);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.IpoAnnouncement key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }
}
