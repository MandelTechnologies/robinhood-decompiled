package com.robinhood.android.psp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.psp.HoldToActionButtonView;
import com.robinhood.android.psp.ProgramDetailSectionAdapter;
import com.robinhood.android.psp.ProgramDetailViewState;
import com.robinhood.android.psp.databinding.FragmentProgramDetailBinding;
import com.robinhood.android.regiongate.PspRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.bonfire.ProgramDetail;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.ImageSource;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.sensor.SensorManager;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: ProgramDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002abB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016J\u001a\u0010@\u001a\u00020=2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\b\u0010E\u001a\u00020=H\u0016J\u0010\u0010F\u001a\u00020=2\u0006\u0010G\u001a\u00020HH\u0002J\u0012\u0010I\u001a\u00020=2\b\b\u0001\u0010J\u001a\u00020KH\u0002J\u0010\u0010L\u001a\u00020=2\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020=2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SH\u0016J$\u0010T\u001a\u00020=2\n\u0010U\u001a\u00060Vj\u0002`W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\"H\u0002J\t\u0010[\u001a\u00020QH\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b(\u0010$R\u000e\u0010*\u001a\u00020+X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b5\u00106R\u001a\u00109\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020;0:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006c"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "sensorManager", "Lcom/robinhood/utils/sensor/SensorManager;", "getSensorManager", "()Lcom/robinhood/utils/sensor/SensorManager;", "setSensorManager", "(Lcom/robinhood/utils/sensor/SensorManager;)V", "enrollPspButton", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "programDetailScreen", "getProgramDetailScreen", "programDetailScreen$delegate", "sectionAdapter", "Lcom/robinhood/android/psp/ProgramDetailSectionAdapter;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "duxo", "Lcom/robinhood/android/psp/ProgramDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/psp/ProgramDetailDuxo;", "duxo$delegate", "binding", "Lcom/robinhood/android/psp/databinding/FragmentProgramDetailBinding;", "getBinding", "()Lcom/robinhood/android/psp/databinding/FragmentProgramDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "buttonAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/psp/ButtonWithColor;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "initializeCubes", "state", "Lcom/robinhood/android/psp/ProgramDetailViewState;", "updateBackgroundColor", "backgroundColor", "", "onFirstLoad", "success", "Lcom/robinhood/android/psp/ProgramDetailViewState$Result$Success;", "bind", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "logTap", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "loggingIdentifier", "", "screen", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProgramDetailFragment extends BaseFragment implements RegionGated, ClientComponentButtonView.Callbacks, AutoLoggableFragment {
    public static final int CUBES_TILT_MULTIPLIER = 2;
    public static final long DEFAULT_DURATION = 1000;
    public static final long FOOTER_FADE_IN_DURATION = 250;
    public static final float LOTTIE_OFFSET_FROM_TOP_RATIO = 0.4f;
    public static final float LOTTIE_TRANSLATION_RATIO = 0.4f;
    public static final float MIN_SCALE_SCROLL_ANIMATION_SIZE = 0.4f;
    public static final int SIXTY_FPS_SAMPLING = 16667;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<ClientComponentButtonView, ButtonWithColor> buttonAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private ClientComponentButtonView enrollPspButton;
    public EventLogger eventLogger;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen;
    private GradientDrawable gradientDrawable;
    public ImageLoader imageLoader;
    public Markwon markwon;

    /* renamed from: programDetailScreen$delegate, reason: from kotlin metadata */
    private final Lazy programDetailScreen;
    private ProgramDetailSectionAdapter sectionAdapter;
    public SensorManager sensorManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ProgramDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/psp/databinding/FragmentProgramDetailBinding;", 0))};

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

    public ProgramDetailFragment() {
        super(C25966R.layout.fragment_program_detail);
        this.$$delegate_0 = new RegionGated2(PspRegionGate.INSTANCE);
        this.eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.psp.ProgramDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProgramDetailFragment.eventScreen_delegate$lambda$0(this.f$0);
            }
        });
        this.programDetailScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.psp.ProgramDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProgramDetailFragment.programDetailScreen_delegate$lambda$1(this.f$0);
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, ProgramDetailDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, ProgramDetailFragment2.INSTANCE);
        this.buttonAdapter = GenericListAdapter.INSTANCE.m2987of(ClientComponentButtonView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.psp.ProgramDetailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProgramDetailFragment.buttonAdapter$lambda$2(this.f$0, (ClientComponentButtonView) obj, (ButtonWithColor) obj2);
            }
        });
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

    public final SensorManager getSensorManager() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            return sensorManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sensorManager");
        return null;
    }

    public final void setSensorManager(SensorManager sensorManager) {
        Intrinsics.checkNotNullParameter(sensorManager, "<set-?>");
        this.sensorManager = sensorManager;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0(ProgramDetailFragment programDetailFragment) {
        Screen.Name name = Screen.Name.PSP_INTRO;
        String string2 = ((Args) INSTANCE.getArgs((Fragment) programDetailFragment)).getProgramId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen getProgramDetailScreen() {
        return (Screen) this.programDetailScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen programDetailScreen_delegate$lambda$1(ProgramDetailFragment programDetailFragment) {
        Screen.Name name = Screen.Name.PSP_DETAIL;
        String string2 = ((Args) INSTANCE.getArgs((Fragment) programDetailFragment)).getProgramId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgramDetailDuxo getDuxo() {
        return (ProgramDetailDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentProgramDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentProgramDetailBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonAdapter$lambda$2(ProgramDetailFragment programDetailFragment, ClientComponentButtonView of, ButtonWithColor buttonWithColor) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(buttonWithColor, "<destruct>");
        GenericButton button = buttonWithColor.getButton();
        int backgroundColor = buttonWithColor.getBackgroundColor();
        ServerDrivenButton serverDrivenButtonFrom = ServerDrivenButton.INSTANCE.from(button);
        of.setCallbacks(programDetailFragment);
        of.bind(serverDrivenButtonFrom);
        RdsButton button2 = of.getViewBinding().button;
        Intrinsics.checkNotNullExpressionValue(button2, "button");
        RdsButtons.styleCustomPspColor(button2, button, backgroundColor);
        if (serverDrivenButtonFrom.getTypedAction() instanceof GenericAction.ClaimPspAction) {
            programDetailFragment.enrollPspButton = of;
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), ProgramDetailOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        this.sectionAdapter = new ProgramDetailSectionAdapter();
        final RecyclerView recyclerView = getBinding().sectionRecyclerView;
        ProgramDetailSectionAdapter programDetailSectionAdapter = this.sectionAdapter;
        if (programDetailSectionAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sectionAdapter");
            programDetailSectionAdapter = null;
        }
        recyclerView.setAdapter(programDetailSectionAdapter);
        Intrinsics.checkNotNull(recyclerView);
        OneShotPreDrawListener.add(recyclerView, new Runnable() { // from class: com.robinhood.android.psp.ProgramDetailFragment$onViewCreated$lambda$4$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                recyclerView.setTranslationY(this.requireView().getHeight());
            }
        });
        getBinding().sectionRecyclerView.scrollToPosition(0);
        getBinding().buttonRecyclerView.setAdapter(this.buttonAdapter);
        getBinding().buttonRecyclerView.setItemAnimator(null);
        getBinding().sectionRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.robinhood.android.psp.ProgramDetailFragment.onViewCreated.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                int paddingTop = ProgramDetailFragment.this.getBinding().sectionRecyclerView.getPaddingTop();
                int iComputeVerticalScrollOffset = recyclerView2.computeVerticalScrollOffset();
                float fCoerceAtLeast = RangesKt.coerceAtLeast(paddingTop - iComputeVerticalScrollOffset, 0) / paddingTop;
                ProgramDetailFragment.this.getBinding().lottieAnimationView.setAlpha(fCoerceAtLeast);
                ProgramDetailFragment.this.getBinding().lottieCubesAnimationView.setAlpha(fCoerceAtLeast);
                float f = ProgramDetailFragment.this.getResources().getDisplayMetrics().heightPixels;
                float fCoerceAtLeast2 = ((RangesKt.coerceAtLeast(f - iComputeVerticalScrollOffset, 0.0f) / f) * 0.6f) + 0.4f;
                ProgramDetailFragment.this.getBinding().lottieAnimationView.setScaleX(fCoerceAtLeast2);
                ProgramDetailFragment.this.getBinding().lottieAnimationView.setScaleY(fCoerceAtLeast2);
                ProgramDetailFragment.this.getBinding().lottieCubesAnimationView.setScaleX(fCoerceAtLeast2);
                ProgramDetailFragment.this.getBinding().lottieCubesAnimationView.setScaleY(fCoerceAtLeast2);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getBinding().holdToActionButtonView.bind();
        Observable<ProgramDetailViewState> observableDistinctUntilChanged = getDuxo().getStates().filter(new Predicate() { // from class: com.robinhood.android.psp.ProgramDetailFragment.onStart.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(ProgramDetailViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getAnimationSegment() != null;
            }
        }).distinctUntilChanged((Function<? super ProgramDetailViewState, K>) new Function() { // from class: com.robinhood.android.psp.ProgramDetailFragment.onStart.2
            @Override // io.reactivex.functions.Function
            public final Class<ProgramDetailViewState.AnimationSegment> apply(ProgramDetailViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                ProgramDetailViewState.AnimationSegment animationSegment = state.getAnimationSegment();
                if (animationSegment != null) {
                    return animationSegment.getClass();
                }
                return null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailFragment.onStart$lambda$6(this.f$0, (ProgramDetailViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C259584(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(final ProgramDetailFragment programDetailFragment, ProgramDetailViewState programDetailViewState) {
        ProgramDetailViewState.AnimationSegment animationSegment = programDetailViewState.getAnimationSegment();
        Intrinsics.checkNotNull(animationSegment);
        LottieAnimationView lottieAnimationView = programDetailFragment.getBinding().lottieAnimationView;
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.removeAllUpdateListeners();
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setMinAndMaxFrame(animationSegment.getStart(), animationSegment.getEnd());
        if (animationSegment.getLoop()) {
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setRepeatMode(1);
        } else {
            lottieAnimationView.setRepeatCount(0);
            lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.psp.ProgramDetailFragment$onStart$3$1$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    this.this$0.getDuxo().advanceAnimation();
                }
            });
        }
        if (animationSegment instanceof ProgramDetailViewState.AnimationSegment.Exit) {
            EventLogger eventLogger = programDetailFragment.getEventLogger();
            Screen.Name name = Screen.Name.PSP_DETAIL;
            String string2 = ((Args) INSTANCE.getArgs((Fragment) programDetailFragment)).getProgramId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, new Screen(name, null, string2, null, 10, null), null, null, null, 29, null);
            programDetailFragment.getBinding().sectionRecyclerView.setTranslationY(programDetailFragment.requireView().getHeight());
            ViewPropertyAnimator duration = programDetailFragment.getBinding().sectionRecyclerView.animate().translationY(0.0f).setDuration(1000L);
            Interpolators interpolators = Interpolators.INSTANCE;
            duration.setInterpolator(interpolators.getExpandCurveInterpolator()).start();
            programDetailFragment.getBinding().holdToActionButtonView.animate().alpha(0.0f).setDuration(1000L).setInterpolator(interpolators.getExpandCurveInterpolator()).start();
            programDetailFragment.getBinding().headerContainer.animate().alpha(0.0f).setDuration(1000L).setInterpolator(interpolators.getExpandCurveInterpolator()).start();
            Intrinsics.checkNotNull(programDetailViewState);
            programDetailFragment.initializeCubes(programDetailViewState);
        } else if ((animationSegment instanceof ProgramDetailViewState.AnimationSegment.ExitLoop) && !programDetailViewState.getButtonFadeInShown()) {
            programDetailFragment.getBinding().footer.setAlpha(0.0f);
            programDetailFragment.getBinding().footer.animate().alpha(1.0f).setDuration(250L).setInterpolator(Interpolators.INSTANCE.getExpandCurveInterpolator()).start();
            programDetailFragment.getDuxo().markFooterAnimationShown();
        }
        if (animationSegment.getAutoplay()) {
            lottieAnimationView.playAnimation();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ProgramDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.psp.ProgramDetailFragment$onStart$4 */
    /* synthetic */ class C259584 extends FunctionReferenceImpl implements Function1<ProgramDetailViewState, Unit> {
        C259584(Object obj) {
            super(1, obj, ProgramDetailFragment.class, "bind", "bind(Lcom/robinhood/android/psp/ProgramDetailViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProgramDetailViewState programDetailViewState) {
            invoke2(programDetailViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ProgramDetailViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ProgramDetailFragment) this.receiver).bind(p0);
        }
    }

    private final void initializeCubes(ProgramDetailViewState state) {
        LottieAnimationView lottieAnimationView = getBinding().lottieCubesAnimationView;
        Intrinsics.checkNotNull(lottieAnimationView);
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.removeAllUpdateListeners();
        ProgramDetailViewState.AnimationSegment cubesExitSegment = state.getCubesExitSegment();
        if (cubesExitSegment != null) {
            lottieAnimationView.setMinAndMaxFrame(cubesExitSegment.getStart(), cubesExitSegment.getEnd());
        }
        lottieAnimationView.addAnimatorListener(new ProgramDetailFragment3(lottieAnimationView, state, this));
        lottieAnimationView.playAnimation();
    }

    private final void updateBackgroundColor(int backgroundColor) {
        requireActivity().getWindow().setStatusBarColor(backgroundColor);
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            ScarletManager2.overrideAttribute(rhToolbar, android.R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorTransparent));
        }
        ConstraintLayout contentContainer = getBinding().contentContainer;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        ScarletManager2.overrideAttribute(contentContainer, android.R.attr.backgroundTint, new ResourceValue(color, Integer.valueOf(backgroundColor)));
        FrameLayout holdToActionContainer = getBinding().holdToActionContainer;
        Intrinsics.checkNotNullExpressionValue(holdToActionContainer, "holdToActionContainer");
        ScarletManager2.overrideAttribute(holdToActionContainer, android.R.attr.backgroundTint, new ResourceValue(color, Integer.valueOf(backgroundColor)));
        if (this.gradientDrawable == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{0, backgroundColor});
            this.gradientDrawable = gradientDrawable;
            getBinding().alphaGradientView.setBackground(this.gradientDrawable);
        }
        LinearLayout footer = getBinding().footer;
        Intrinsics.checkNotNullExpressionValue(footer, "footer");
        ScarletManager2.overrideAttribute(footer, android.R.attr.backgroundTint, new ResourceValue(color, Integer.valueOf(backgroundColor)));
    }

    private final void onFirstLoad(final ProgramDetailViewState.Result.Success success) {
        updateBackgroundColor(success.getBackgroundColor());
        ImageLoader imageLoader = getImageLoader();
        ImageSource light = success.getViewModel().getIntroHeaderImg().getLight();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ImageLoader.ImageRequest imageRequestLoad = imageLoader.load(light.toImageUrl(contextRequireContext));
        ImageView introHeaderImg = getBinding().introHeaderImg;
        Intrinsics.checkNotNullExpressionValue(introHeaderImg, "introHeaderImg");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, introHeaderImg, null, null, 6, null);
        getBinding().lottieAnimationView.setAnimationFromUrl(success.getViewModel().getAnimation().getWithoutCubesLottieUrl());
        getBinding().lottieCubesAnimationView.setAnimationFromUrl(success.getViewModel().getAnimation().getCubesLottieUrl());
        getBinding().lottieAnimationView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: com.robinhood.android.psp.ProgramDetailFragment.onFirstLoad.1
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                final LottieAnimationView lottieAnimationView = ProgramDetailFragment.this.getBinding().lottieAnimationView;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "lottieAnimationView");
                final ProgramDetailFragment programDetailFragment = ProgramDetailFragment.this;
                OneShotPreDrawListener.add(lottieAnimationView, new Runnable() { // from class: com.robinhood.android.psp.ProgramDetailFragment$onFirstLoad$1$onCompositionLoaded$$inlined$doOnPreDraw$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        programDetailFragment.getDuxo().setAnimationLoaded();
                        float f = (-programDetailFragment.getBinding().lottieAnimationView.getHeight()) * 0.4f;
                        programDetailFragment.getBinding().lottieAnimationView.setTranslationY(f);
                        programDetailFragment.getBinding().textContainer.setTranslationY(f);
                        float f2 = 2;
                        float f3 = (-f) / f2;
                        programDetailFragment.getBinding().lottieAnimationView.setPivotY(f3);
                        programDetailFragment.getBinding().lottieAnimationView.setPivotX(programDetailFragment.getBinding().lottieAnimationView.getWidth() / f2);
                        programDetailFragment.getBinding().lottieCubesAnimationView.setPivotY(f3);
                        programDetailFragment.getBinding().lottieCubesAnimationView.setPivotX(programDetailFragment.getBinding().lottieAnimationView.getWidth() / f2);
                        programDetailFragment.getDuxo().advanceAnimation();
                    }
                });
            }
        });
        getBinding().holdToActionButtonView.setCallbacks(new HoldToActionButtonView.Callbacks() { // from class: com.robinhood.android.psp.ProgramDetailFragment.onFirstLoad.2
            @Override // com.robinhood.android.psp.HoldToActionButtonView.Callbacks
            public void onProgress(float progress, boolean isDown) {
                ProgramDetailFragment.this.getDuxo().setHoldDownProgress(progress, isDown);
            }

            @Override // com.robinhood.android.psp.HoldToActionButtonView.Callbacks
            public void onThreshold() {
                ProgramDetailFragment.this.logTap(Component.ComponentType.BUTTON, success.getViewModel().getRevealButtonSuccessLoggingIdentifier(), ProgramDetailFragment.this.getEventScreen());
                ProgramDetailFragment.this.getDuxo().advanceAnimation();
            }

            @Override // com.robinhood.android.psp.HoldToActionButtonView.Callbacks
            public void onDown() {
                ProgramDetailFragment.this.logTap(Component.ComponentType.BUTTON, success.getViewModel().getRevealButtonDownLoggingIdentifier(), ProgramDetailFragment.this.getEventScreen());
            }

            @Override // com.robinhood.android.psp.HoldToActionButtonView.Callbacks
            public void onUp() {
                ProgramDetailFragment.this.logTap(Component.ComponentType.BUTTON, success.getViewModel().getRevealButtonUpLoggingIdentifier(), ProgramDetailFragment.this.getEventScreen());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(ProgramDetailViewState state) {
        Toolbar toolbar;
        ProgramDetailViewState.EnrollmentResult enrollmentResultConsume;
        ShimmerLoadingView loadingView = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.getShowLoading() ? 0 : 8);
        ProgramDetailViewState.Result result = state.getResult();
        if ((result instanceof ProgramDetailViewState.Result.Error) || Intrinsics.areEqual(result, ProgramDetailViewState.Result.Loading.INSTANCE)) {
            return;
        }
        if (!(result instanceof ProgramDetailViewState.Result.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        UiEvent<Unit> onFirstLoadEvent = state.getOnFirstLoadEvent();
        ProgramDetailSectionAdapter programDetailSectionAdapter = null;
        if ((onFirstLoadEvent != null ? onFirstLoadEvent.consume() : null) != null) {
            onFirstLoad((ProgramDetailViewState.Result.Success) result);
        }
        UiEvent<ProgramDetailViewState.EnrollmentResult> enrollmentEvent = state.getEnrollmentEvent();
        if (enrollmentEvent != null && (enrollmentResultConsume = enrollmentEvent.consume()) != null) {
            if (enrollmentResultConsume instanceof ProgramDetailViewState.EnrollmentResult.Loading) {
                ClientComponentButtonView clientComponentButtonView = this.enrollPspButton;
                if (clientComponentButtonView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("enrollPspButton");
                    clientComponentButtonView = null;
                }
                clientComponentButtonView.setLoading(true);
            } else if (enrollmentResultConsume instanceof ProgramDetailViewState.EnrollmentResult.Error) {
                ClientComponentButtonView clientComponentButtonView2 = this.enrollPspButton;
                if (clientComponentButtonView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("enrollPspButton");
                    clientComponentButtonView2 = null;
                }
                clientComponentButtonView2.setLoading(false);
                AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((ProgramDetailViewState.EnrollmentResult.Error) enrollmentResultConsume).getThrowable(), false, 2, null);
            } else {
                if (!(enrollmentResultConsume instanceof ProgramDetailViewState.EnrollmentResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                requireActivity().finish();
                Navigator navigator = getNavigator();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new LegacyFragmentKey.ProgramEnrollmentCelebration(((ProgramDetailViewState.Result.Success) result).getBackgroundColor(), ((ProgramDetailViewState.EnrollmentResult.Success) enrollmentResultConsume).getEnrollmentResponse()), false, false, true, false, false, false, 118, null), null, false, null, null, 60, null);
            }
        }
        final ProgramDetail.ProgramDetailViewModel viewModel = ((ProgramDetailViewState.Result.Success) result).getViewModel();
        RhTextView expirationTxt = getBinding().expirationTxt;
        Intrinsics.checkNotNullExpressionValue(expirationTxt, "expirationTxt");
        expirationTxt.setVisibility(!viewModel.isProgramClaimed() ? 0 : 8);
        getBinding().introTitle.setText(viewModel.getIntroTitle());
        getBinding().introSubtitle.setText(viewModel.getIntroSubtitle());
        getBinding().introDescription.setText(viewModel.getIntroDescription());
        getBinding().introHeaderTxt.setText(getMarkwon().toMarkdown(viewModel.getIntroHeaderMarkdown()));
        float f = (-getBinding().lottieAnimationView.getHeight()) * 0.4f;
        float f2 = -f;
        getBinding().textContainer.setTranslationY((state.getTranslationProgress() * f2) + f);
        getBinding().textContainer.setAlpha(state.getIntroTextAlpha());
        LottieAnimationView lottieAnimationView = getBinding().lottieAnimationView;
        Integer overrideFrame = state.getOverrideFrame();
        if (overrideFrame != null) {
            lottieAnimationView.setFrame(overrideFrame.intValue());
        }
        lottieAnimationView.setTranslationY((f2 * state.getTranslationProgress()) + f);
        final RecyclerView recyclerView = getBinding().sectionRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        ViewsKt.setTopPadding(recyclerView, (int) (getBinding().lottieAnimationView.getHeight() * 0.4f));
        recyclerView.setVisibility(state.getProgramDetailVisible() ? 0 : 8);
        final View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        OneShotPreDrawListener.add(viewRequireView, new Runnable() { // from class: com.robinhood.android.psp.ProgramDetailFragment$bind$lambda$14$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                Intrinsics.checkNotNull(recyclerView);
                ViewsKt.setBottomPadding(recyclerView, this.getBinding().footer.getHeight());
            }
        });
        ProgramDetailSectionAdapter programDetailSectionAdapter2 = this.sectionAdapter;
        if (programDetailSectionAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sectionAdapter");
            programDetailSectionAdapter2 = null;
        }
        programDetailSectionAdapter2.setCallbacks(new ProgramDetailSectionAdapter.Callbacks() { // from class: com.robinhood.android.psp.ProgramDetailFragment.bind.4
            @Override // com.robinhood.android.psp.ProgramDetailDisclosureView.Callbacks
            public void onDisclosureLinkClicked(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                ProgramDetailFragment.this.logTap(Component.ComponentType.LINK_BUTTON, url + "-disclosure-link", ProgramDetailFragment.this.getProgramDetailScreen());
            }

            @Override // com.robinhood.android.psp.ProgramDetailValuePropsView.Callbacks
            public void onLearnMoreClicked(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                ProgramDetailFragment.this.logTap(Component.ComponentType.LINK_BUTTON, url + "-learn-more", ProgramDetailFragment.this.getProgramDetailScreen());
            }
        });
        ProgramDetailSectionAdapter programDetailSectionAdapter3 = this.sectionAdapter;
        if (programDetailSectionAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sectionAdapter");
        } else {
            programDetailSectionAdapter = programDetailSectionAdapter3;
        }
        programDetailSectionAdapter.submitList(viewModel.getGiftDetailSections());
        LinearLayout footer = getBinding().footer;
        Intrinsics.checkNotNullExpressionValue(footer, "footer");
        footer.setVisibility(state.isFooterVisible() ? 0 : 8);
        RhTextView rhTextView = getBinding().expirationTxt;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(state.footerText(resources));
        this.buttonAdapter.submitList(state.getFooterButtons());
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar == null || (toolbar = rhToolbar.getToolbar()) == null) {
            return;
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.psp.ProgramDetailFragment.bind.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProgramDetailFragment.this.logTap(Component.ComponentType.BUTTON, viewModel.getXButtonLoggingIdentifier(), ProgramDetailFragment.this.getProgramDetailScreen());
                ProgramDetailFragment.this.requireActivity().finish();
            }
        });
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        GenericAction typedAction = button.getTypedAction();
        if (Intrinsics.areEqual(typedAction, GenericAction.DismissAction.INSTANCE)) {
            logTap(Component.ComponentType.BUTTON, button.getLoggingIdentifier(), getProgramDetailScreen());
            requireActivity().finish();
            return true;
        }
        if (!(typedAction instanceof GenericAction.ClaimPspAction)) {
            return false;
        }
        logTap(Component.ComponentType.BUTTON, button.getLoggingIdentifier(), getProgramDetailScreen());
        getDuxo().enrollProgram(((GenericAction.ClaimPspAction) typedAction).getProgramId());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logTap(Component.ComponentType componentType, String loggingIdentifier, Screen screen) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, screen, new Component(componentType, loggingIdentifier, null, 4, null), null, null, false, 57, null);
    }

    /* compiled from: ProgramDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailFragment$Args;", "Landroid/os/Parcelable;", "programId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getProgramId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID programId;

        /* compiled from: ProgramDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.programId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getProgramId() {
            return this.programId;
        }

        public final Args copy(UUID programId) {
            Intrinsics.checkNotNullParameter(programId, "programId");
            return new Args(programId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.programId, ((Args) other).programId);
        }

        public int hashCode() {
            return this.programId.hashCode();
        }

        public String toString() {
            return "Args(programId=" + this.programId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.programId);
        }

        public Args(UUID programId) {
            Intrinsics.checkNotNullParameter(programId, "programId");
            this.programId = programId;
        }

        public final UUID getProgramId() {
            return this.programId;
        }
    }

    /* compiled from: ProgramDetailFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0005H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/psp/ProgramDetailFragment;", "Lcom/robinhood/android/psp/ProgramDetailFragment$Args;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProgramDetail;", "<init>", "()V", "LOTTIE_TRANSLATION_RATIO", "", "LOTTIE_OFFSET_FROM_TOP_RATIO", "DEFAULT_DURATION", "", "FOOTER_FADE_IN_DURATION", "MIN_SCALE_SCROLL_ANIMATION_SIZE", "SIXTY_FPS_SAMPLING", "", "CUBES_TILT_MULTIPLIER", "createFragment", "key", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ProgramDetailFragment, Args>, FragmentResolver<LegacyFragmentKey.ProgramDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ProgramDetailFragment programDetailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, programDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ProgramDetailFragment newInstance(Args args) {
            return (ProgramDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ProgramDetailFragment programDetailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, programDetailFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public ProgramDetailFragment createFragment(LegacyFragmentKey.ProgramDetail key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (ProgramDetailFragment) newInstance((Parcelable) new Args(key.getProgramId()));
        }
    }
}
