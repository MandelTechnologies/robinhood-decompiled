package com.robinhood.android.waitlist.spot;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.FragmentActivity;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.android.waitlist.C31444R;
import com.robinhood.android.waitlist.databinding.FragmentWaitlistSpotBinding;
import com.robinhood.android.waitlist.util.QuaternionExtensions;
import com.robinhood.android.waitlist.util.RichTextExtensions2;
import com.robinhood.disposer.DisposerKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.api.bonfire.waitlist.WaitlistStatus;
import com.robinhood.models.p355ui.bonfire.waitlist.WaitlistSpot;
import com.robinhood.models.p355ui.bonfire.waitlist.WaitlistSpotData;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.math.Quaternion;
import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.sensor.SensorManager;
import com.robinhood.utils.sensor.SensorManagers;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: WaitlistSpotFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u000256B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010#\u001a\u00020$H\u0016J\u0014\u0010%\u001a\u00020$*\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u0014\u0010)\u001a\u00020$*\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020$H\u0016J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-H\u0002J \u0010.\u001a\u00020$2\u0006\u0010,\u001a\u00020-2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020$\u0018\u000100H\u0002J\u0012\u00101\u001a\u00020$2\b\b\u0002\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020$H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/waitlist/spot/WaitlistSpotFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "sensorManager", "Lcom/robinhood/utils/sensor/SensorManager;", "getSensorManager", "()Lcom/robinhood/utils/sensor/SensorManager;", "setSensorManager", "(Lcom/robinhood/utils/sensor/SensorManager;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "sensorsDisposable", "Lio/reactivex/disposables/Disposable;", "binding", "Lcom/robinhood/android/waitlist/databinding/FragmentWaitlistSpotBinding;", "getBinding", "()Lcom/robinhood/android/waitlist/databinding/FragmentWaitlistSpotBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/waitlist/spot/WaitlistSpotDuxo;", "getDuxo", "()Lcom/robinhood/android/waitlist/spot/WaitlistSpotDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onResume", "", "bindPrimaryButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "spot", "Lcom/robinhood/models/ui/bonfire/waitlist/WaitlistSpot;", "bindSecondaryButton", "onPause", "onUserCanJoin", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/ui/bonfire/waitlist/WaitlistSpotData;", "onUserInWaitlist", "justJoined", "Lcom/robinhood/udf/UiEvent;", "transitScreenToInWaitlist", "startFrame", "", "startYawTracking", "Args", "Companion", "feature-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WaitlistSpotFragment extends BaseFragment implements AutoLoggableFragment {
    private static final long ANIMATION_LOOP_DURATION_MS = 100;
    private static final float MAX_PIVOT = 0.6f;
    private static final long SCREEN_CHANGE_ANIMATION_DURATION_MS = 500;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    public SensorManager sensorManager;
    private Disposable sensorsDisposable;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WaitlistSpotFragment.class, "binding", "getBinding()Lcom/robinhood/android/waitlist/databinding/FragmentWaitlistSpotBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WaitlistSpotFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WaitlistStatus.values().length];
            try {
                iArr[WaitlistStatus.CAN_JOIN_WAITLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WaitlistStatus.IN_WAITLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
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

    public WaitlistSpotFragment() {
        super(C31444R.layout.fragment_waitlist_spot);
        this.eventScreen = new Screen(Screen.Name.WAITLIST, getScreenName(), null, null, 12, null);
        this.binding = ViewBinding5.viewBinding(this, WaitlistSpotFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, WaitlistSpotDuxo.class);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
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

    private final FragmentWaitlistSpotBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentWaitlistSpotBinding) value;
    }

    private final WaitlistSpotDuxo getDuxo() {
        return (WaitlistSpotDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WaitlistSpotFragment.onResume$lambda$2(this.f$0, (WaitlistSpotViewState) obj);
            }
        });
        if (this.sensorsDisposable != null) {
            startYawTracking();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onResume$lambda$2(WaitlistSpotFragment waitlistSpotFragment, WaitlistSpotViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        FragmentWaitlistSpotBinding binding = waitlistSpotFragment.getBinding();
        WaitlistSpot waitlistSpotConsume = viewState.getSpot().consume();
        if (waitlistSpotConsume != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[waitlistSpotConsume.getStatus().ordinal()];
            if (i == 1) {
                binding.animationView.setFrame(0);
                waitlistSpotFragment.onUserCanJoin(waitlistSpotConsume.getData());
            } else if (i == 2) {
                waitlistSpotFragment.onUserInWaitlist(waitlistSpotConsume.getData(), viewState.getJustJoined());
            } else {
                throw new IllegalStateException("We should never be able to reach this state within the waitlist flow");
            }
            Object[] objArr = 0 == true ? 1 : 0;
            EventLogger.DefaultImpls.logAppear$default(waitlistSpotFragment.getEventLogger(), UserInteractionEventData.Action.DISMISS, waitlistSpotFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, new Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, waitlistSpotConsume.getStatus().getServerValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, -1, -1, -1, -1, -1, 16383, null), 8, null);
            RdsButton primaryActionBtn = binding.primaryActionBtn;
            Intrinsics.checkNotNullExpressionValue(primaryActionBtn, "primaryActionBtn");
            waitlistSpotFragment.bindPrimaryButton(primaryActionBtn, waitlistSpotConsume);
            RdsButton secondaryActionBtn = binding.secondaryActionBtn;
            Intrinsics.checkNotNullExpressionValue(secondaryActionBtn, "secondaryActionBtn");
            waitlistSpotFragment.bindSecondaryButton(secondaryActionBtn, waitlistSpotConsume);
        }
        binding.primaryActionBtn.setLoading(viewState.isLoading());
        return Unit.INSTANCE;
    }

    private final void bindPrimaryButton(RdsButton rdsButton, final WaitlistSpot waitlistSpot) {
        ViewsKt.setLoggingConfig(rdsButton, new AutoLoggingConfig(false, false));
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WaitlistSpotFragment.bindPrimaryButton$lambda$3(waitlistSpot);
            }
        }, 1, null);
        rdsButton.setText(waitlistSpot.getData().getPrimaryCtaText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindPrimaryButton$lambda$3(WaitlistSpot waitlistSpot) {
        UserInteractionEventData.Action action;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        if (waitlistSpot.getStatus() == WaitlistStatus.CAN_JOIN_WAITLIST) {
            action = UserInteractionEventData.Action.GET_ACCESS;
        } else {
            action = UserInteractionEventData.Action.INVITE_CONTACTS;
        }
        return new UserInteractionEventDescriptor(null, null, action, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, waitlistSpot.getStatus().getServerValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null);
    }

    private final void bindSecondaryButton(RdsButton rdsButton, final WaitlistSpot waitlistSpot) {
        ViewsKt.setLoggingConfig(rdsButton, new AutoLoggingConfig(false, false));
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WaitlistSpotFragment.bindSecondaryButton$lambda$4(waitlistSpot);
            }
        }, 1, null);
        rdsButton.setText(waitlistSpot.getData().getSecondaryCtaText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindSecondaryButton$lambda$4(WaitlistSpot waitlistSpot) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DISMISS, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, waitlistSpot.getStatus().getServerValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 35, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Disposable disposable = this.sensorsDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    private final void onUserCanJoin(WaitlistSpotData data) {
        FragmentWaitlistSpotBinding binding = getBinding();
        binding.inWaitlistTitle.setVisibility(4);
        binding.inWaitlistSubtitle.setVisibility(4);
        RhTextView joinWaitlistTitle = binding.joinWaitlistTitle;
        Intrinsics.checkNotNullExpressionValue(joinWaitlistTitle, "joinWaitlistTitle");
        RichTextExtensions2.showRichText(joinWaitlistTitle, data.getTitle());
        RhTextView joinWaitlistSubtitle = binding.joinWaitlistSubtitle;
        Intrinsics.checkNotNullExpressionValue(joinWaitlistSubtitle, "joinWaitlistSubtitle");
        RichTextExtensions2.showRichText(joinWaitlistSubtitle, data.getSubtitle());
        LottieAnimationView lottieAnimationView = binding.animationView;
        lottieAnimationView.setMaxFrame(239);
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewsKt.addEndingInfiniteLoop(lottieAnimationView, 120, 239);
        lottieAnimationView.playAnimation();
        RdsButton primaryActionBtn = binding.primaryActionBtn;
        Intrinsics.checkNotNullExpressionValue(primaryActionBtn, "primaryActionBtn");
        OnClickListeners.onClick(primaryActionBtn, new WaitlistSpotFragment3(getDuxo()));
    }

    private final void onUserInWaitlist(final WaitlistSpotData data, UiEvent<Unit> justJoined) {
        final FragmentWaitlistSpotBinding binding = getBinding();
        binding.joinWaitlistTitle.setVisibility(4);
        binding.joinWaitlistSubtitle.setVisibility(4);
        RdsButton primaryActionBtn = binding.primaryActionBtn;
        Intrinsics.checkNotNullExpressionValue(primaryActionBtn, "primaryActionBtn");
        OnClickListeners.onClick(primaryActionBtn, new Function0() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WaitlistSpotFragment.onUserInWaitlist$lambda$12$lambda$7(this.f$0, binding, data);
            }
        });
        RdsButton secondaryActionBtn = binding.secondaryActionBtn;
        Intrinsics.checkNotNullExpressionValue(secondaryActionBtn, "secondaryActionBtn");
        OnClickListeners.onClick(secondaryActionBtn, new Function0() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WaitlistSpotFragment.onUserInWaitlist$lambda$12$lambda$8(this.f$0);
            }
        });
        binding.secondaryActionBtn.setVisibility(data.getSecondaryCtaText() == null ? 8 : 0);
        if ((justJoined != null ? justJoined.consume() : null) != null) {
            binding.animationView.removeAllAnimatorListeners();
            binding.animationView.pauseAnimation();
            binding.animationView.setRepeatCount(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(binding.animationView.getProgress(), 239.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$onUserInWaitlist$1$3$1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animator");
                    LottieAnimationView lottieAnimationView = binding.animationView;
                    Object animatedValue = animator.getAnimatedValue();
                    Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    lottieAnimationView.setProgress(((Float) animatedValue).floatValue());
                }
            });
            Intrinsics.checkNotNull(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$onUserInWaitlist$lambda$12$lambda$11$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
                    RhTextView inWaitlistTitle = binding.inWaitlistTitle;
                    Intrinsics.checkNotNullExpressionValue(inWaitlistTitle, "inWaitlistTitle");
                    RichTextExtensions2.setRichText(inWaitlistTitle, data.getTitle());
                    RhTextView inWaitlistSubtitle = binding.inWaitlistSubtitle;
                    Intrinsics.checkNotNullExpressionValue(inWaitlistSubtitle, "inWaitlistSubtitle");
                    RichTextExtensions2.setRichText(inWaitlistSubtitle, data.getSubtitle());
                    ConstraintLayout root = binding.getRoot();
                    ChangeBounds changeBounds = new ChangeBounds();
                    changeBounds.excludeChildren(RhTextView.class, true);
                    changeBounds.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.0f, 1.0f));
                    changeBounds.setDuration(500L);
                    TransitionManager.beginDelayedTransition(root, changeBounds);
                    final FragmentWaitlistSpotBinding fragmentWaitlistSpotBinding = binding;
                    fragmentWaitlistSpotBinding.animationView.postDelayed(new Runnable() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$onUserInWaitlist$1$3$2$2
                        @Override // java.lang.Runnable
                        public final void run() {
                            fragmentWaitlistSpotBinding.inWaitlistTitle.setVisibility(0);
                            fragmentWaitlistSpotBinding.inWaitlistSubtitle.setVisibility(0);
                        }
                    }, 500L);
                    WaitlistSpotFragment.transitScreenToInWaitlist$default(this, 0, 1, null);
                }
            });
            valueAnimatorOfFloat.setDuration((((long) binding.animationView.getProgress()) * 100) / 120);
            valueAnimatorOfFloat.start();
            return;
        }
        RhTextView inWaitlistTitle = binding.inWaitlistTitle;
        Intrinsics.checkNotNullExpressionValue(inWaitlistTitle, "inWaitlistTitle");
        RichTextExtensions2.showRichText(inWaitlistTitle, data.getTitle());
        RhTextView inWaitlistSubtitle = binding.inWaitlistSubtitle;
        Intrinsics.checkNotNullExpressionValue(inWaitlistSubtitle, "inWaitlistSubtitle");
        RichTextExtensions2.showRichText(inWaitlistSubtitle, data.getSubtitle());
        transitScreenToInWaitlist(280);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUserInWaitlist$lambda$12$lambda$7(WaitlistSpotFragment waitlistSpotFragment, FragmentWaitlistSpotBinding fragmentWaitlistSpotBinding, WaitlistSpotData waitlistSpotData) {
        Navigator navigator = waitlistSpotFragment.getNavigator();
        android.content.Context context = fragmentWaitlistSpotBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, waitlistSpotData.getShareUrl(), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUserInWaitlist$lambda$12$lambda$8(WaitlistSpotFragment waitlistSpotFragment) {
        FragmentActivity activity = waitlistSpotFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void transitScreenToInWaitlist$default(WaitlistSpotFragment waitlistSpotFragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 239;
        }
        waitlistSpotFragment.transitScreenToInWaitlist(i);
    }

    private final void transitScreenToInWaitlist(int startFrame) {
        final FragmentWaitlistSpotBinding binding = getBinding();
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(binding.getRoot());
        constraintSet.connect(binding.animationView.getId(), 3, binding.inWaitlistSubtitle.getId(), 4);
        constraintSet.connect(binding.animationView.getId(), 4, binding.primaryActionBtn.getId(), 3);
        constraintSet.applyTo(binding.getRoot());
        binding.animationView.setMinAndMaxFrame(startFrame, WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END);
        binding.animationView.playAnimation();
        binding.animationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$transitScreenToInWaitlist$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                binding.animationView.removeAllAnimatorListeners();
                this.startYawTracking();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void startYawTracking() {
        getBinding().animationView.setMinAndMaxFrame(WaitlistAnimationConstants.LEFT_YAW_START, WaitlistAnimationConstants.RIGHT_YAW_END);
        getBinding().animationView.setFrame(WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = Float.NaN;
        Disposable disposable = this.sensorsDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable observableDistinctUntilChanged = asObservable(SensorManagers.rotationVector$default(getSensorManager(), 0, 1, null)).map(new Function() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotFragment.startYawTracking.1
            @Override // io.reactivex.functions.Function
            public final Float apply(Quaternion it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(QuaternionExtensions.normalizedYaw(it));
            }
        }).onErrorReturnItem(Float.valueOf(floatRef.element)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        this.sensorsDisposable = ScopedObservable.subscribeKotlin$default(DisposerKt.bindTo$default(observableDistinctUntilChanged, getLifecycleEvents(), (LifecycleEvent) null, 2, (Object) null), new Function1() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WaitlistSpotFragment.startYawTracking$lambda$15(floatRef, this, (Float) obj);
            }
        }, new RxErrorCheckpoint(null, 1, 0 == true ? 1 : 0), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startYawTracking$lambda$15(Ref.FloatRef floatRef, WaitlistSpotFragment waitlistSpotFragment, Float f) {
        if (Float.isNaN(floatRef.element)) {
            Intrinsics.checkNotNull(f);
            floatRef.element = f.floatValue();
        } else {
            float f2 = floatRef.element;
            Intrinsics.checkNotNull(f);
            float fMin = (Math.min(Math.abs(f2 - f.floatValue()), MAX_PIVOT) * 59) / MAX_PIVOT;
            waitlistSpotFragment.getBinding().animationView.setFrame((int) (f.floatValue() < floatRef.element ? WaitlistAnimationConstants.MIDDLE_YAW_FRAME - fMin : WaitlistAnimationConstants.MIDDLE_YAW_FRAME + fMin));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: WaitlistSpotFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/waitlist/spot/WaitlistSpotFragment$Args;", "Landroid/os/Parcelable;", "waitlistName", "", "spot", "Lcom/robinhood/models/ui/bonfire/waitlist/WaitlistSpot;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/bonfire/waitlist/WaitlistSpot;)V", "getWaitlistName", "()Ljava/lang/String;", "getSpot", "()Lcom/robinhood/models/ui/bonfire/waitlist/WaitlistSpot;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final WaitlistSpot spot;
        private final String waitlistName;

        /* compiled from: WaitlistSpotFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (WaitlistSpot) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, WaitlistSpot waitlistSpot, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.waitlistName;
            }
            if ((i & 2) != 0) {
                waitlistSpot = args.spot;
            }
            return args.copy(str, waitlistSpot);
        }

        /* renamed from: component1, reason: from getter */
        public final String getWaitlistName() {
            return this.waitlistName;
        }

        /* renamed from: component2, reason: from getter */
        public final WaitlistSpot getSpot() {
            return this.spot;
        }

        public final Args copy(String waitlistName, WaitlistSpot spot) {
            Intrinsics.checkNotNullParameter(waitlistName, "waitlistName");
            Intrinsics.checkNotNullParameter(spot, "spot");
            return new Args(waitlistName, spot);
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
            return Intrinsics.areEqual(this.waitlistName, args.waitlistName) && Intrinsics.areEqual(this.spot, args.spot);
        }

        public int hashCode() {
            return (this.waitlistName.hashCode() * 31) + this.spot.hashCode();
        }

        public String toString() {
            return "Args(waitlistName=" + this.waitlistName + ", spot=" + this.spot + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.waitlistName);
            dest.writeParcelable(this.spot, flags);
        }

        public Args(String waitlistName, WaitlistSpot spot) {
            Intrinsics.checkNotNullParameter(waitlistName, "waitlistName");
            Intrinsics.checkNotNullParameter(spot, "spot");
            this.waitlistName = waitlistName;
            this.spot = spot;
        }

        public final String getWaitlistName() {
            return this.waitlistName;
        }

        public final WaitlistSpot getSpot() {
            return this.spot;
        }
    }

    /* compiled from: WaitlistSpotFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/waitlist/spot/WaitlistSpotFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/waitlist/spot/WaitlistSpotFragment;", "Lcom/robinhood/android/waitlist/spot/WaitlistSpotFragment$Args;", "<init>", "()V", "SCREEN_CHANGE_ANIMATION_DURATION_MS", "", "ANIMATION_LOOP_DURATION_MS", "MAX_PIVOT", "", "feature-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<WaitlistSpotFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(WaitlistSpotFragment waitlistSpotFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, waitlistSpotFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WaitlistSpotFragment newInstance(Args args) {
            return (WaitlistSpotFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WaitlistSpotFragment waitlistSpotFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, waitlistSpotFragment, args);
        }
    }
}
