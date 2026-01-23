package com.robinhood.android.rhy.waitlist.p244ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.airbnb.lottie.LottieAnimationView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.rhy.contracts.RhyWaitlistSignUpContract;
import com.robinhood.android.rhy.waitlist.C27560R;
import com.robinhood.android.rhy.waitlist.databinding.FragmentRhyWaitlistSignUpBinding;
import com.robinhood.android.rhy.waitlist.lib.prefs.RhyWaitlistFullscreenAnimationSeenPref;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.waitlist.ApiWaitlistSpot;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.NoSuchElementException;
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
import kotlin.ranges.PrimitiveRanges2;
import kotlin.reflect.KProperty;

/* compiled from: RhyWaitlistSignUpFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\"H\u0016J\b\u0010/\u001a\u00020&H\u0002J\b\u00100\u001a\u00020&H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistSignUpFragment;", "Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistFragment;", "<init>", "()V", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "getBonfireApi", "()Lcom/robinhood/api/retrofit/BonfireApi;", "setBonfireApi", "(Lcom/robinhood/api/retrofit/BonfireApi;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhyWaitlistFullscreenAnimationSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "getRhyWaitlistFullscreenAnimationSeenPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setRhyWaitlistFullscreenAnimationSeenPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "callbacks", "Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistSignUpBinding;", "getBinding", "()Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistSignUpBinding;", "binding$delegate", "hasBottomBar", "", "getHasBottomBar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "playFullscreenThenLoopingAnimation", "playLoopingAnimation", "Companion", "feature-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyWaitlistSignUpFragment extends RhyWaitlistFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public BonfireApi bonfireApi;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;

    @RhyWaitlistFullscreenAnimationSeenPref
    public BooleanPreference rhyWaitlistFullscreenAnimationSeenPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyWaitlistSignUpFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpContract$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RhyWaitlistSignUpFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistSignUpBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final LottieUrl RHY_WAITLIST_JOIN_LOTTIE_URL = LottieUrl.RHY_WAITLIST_JOIN;
    private static final PrimitiveRanges2 FIRST_FRAME_RANGE = new PrimitiveRanges2(0, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
    private static final PrimitiveRanges2 SECOND_FRAME_RANGE = new PrimitiveRanges2(EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 362);
    private static final PrimitiveRanges2 THIRD_FRAME_RANGE = new PrimitiveRanges2(362, 592);

    public RhyWaitlistSignUpFragment() {
        super(C27560R.layout.fragment_rhy_waitlist_sign_up);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(RhyWaitlistSignUpContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof RhyWaitlistSignUpContract.Callbacks)) {
                    parentFragment = null;
                }
                RhyWaitlistSignUpContract.Callbacks callbacks = (RhyWaitlistSignUpContract.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RhyWaitlistSignUpContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, RhyWaitlistSignUpFragment2.INSTANCE);
    }

    public final BonfireApi getBonfireApi() {
        BonfireApi bonfireApi = this.bonfireApi;
        if (bonfireApi != null) {
            return bonfireApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bonfireApi");
        return null;
    }

    public final void setBonfireApi(BonfireApi bonfireApi) {
        Intrinsics.checkNotNullParameter(bonfireApi, "<set-?>");
        this.bonfireApi = bonfireApi;
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

    public final BooleanPreference getRhyWaitlistFullscreenAnimationSeenPref() {
        BooleanPreference booleanPreference = this.rhyWaitlistFullscreenAnimationSeenPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyWaitlistFullscreenAnimationSeenPref");
        return null;
    }

    public final void setRhyWaitlistFullscreenAnimationSeenPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.rhyWaitlistFullscreenAnimationSeenPref = booleanPreference;
    }

    private final RhyWaitlistSignUpContract.Callbacks getCallbacks() {
        return (RhyWaitlistSignUpContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentRhyWaitlistSignUpBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyWaitlistSignUpBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return getParentFragment() != null;
    }

    @Override // com.robinhood.android.rhy.waitlist.p244ui.RhyWaitlistFragment, com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        RHY_WAITLIST_JOIN_LOTTIE_URL.prefetch(context);
    }

    @Override // com.robinhood.android.rhy.waitlist.p244ui.RhyWaitlistFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LottieAnimationView rhyWaitlistSignUpLottie = getBinding().rhyWaitlistSignUpLottie;
        Intrinsics.checkNotNullExpressionValue(rhyWaitlistSignUpLottie, "rhyWaitlistSignUpLottie");
        LottieAnimationViewsKt.setRemoteUrl(rhyWaitlistSignUpLottie, RHY_WAITLIST_JOIN_LOTTIE_URL);
        if (!getRhyWaitlistFullscreenAnimationSeenPref().get()) {
            getRhyWaitlistFullscreenAnimationSeenPref().set(true);
            playFullscreenThenLoopingAnimation();
        } else {
            playLoopingAnimation();
        }
        if (!isInTabFragment()) {
            MotionLayout rhyWaitlistSignUpButtonMotion = getBinding().rhyWaitlistSignUpButtonMotion;
            Intrinsics.checkNotNullExpressionValue(rhyWaitlistSignUpButtonMotion, "rhyWaitlistSignUpButtonMotion");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(rhyWaitlistSignUpButtonMotion, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        getBinding().rhyWaitlistSignUpButtonBar.onPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyWaitlistSignUpFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        final ScrollView scrollView = getBinding().rhyWaitlistSignUpScrollView;
        scrollView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpFragment$onViewCreated$2$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.this$0.getBinding().rhyWaitlistSignUpButtonBar.setRuleLineInvisible(!scrollView.canScrollVertically(1));
            }
        });
        scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpFragment$onViewCreated$2$2
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                ScrollView scrollView2 = scrollView;
                this.getBinding().rhyWaitlistSignUpButtonBar.setRuleLineInvisible(scrollView2.getChildAt(scrollView2.getChildCount() - 1).getBottom() - (scrollView.getHeight() + i2) == 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(final RhyWaitlistSignUpFragment rhyWaitlistSignUpFragment) {
        Single singleDoFinally = SinglesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxSingle$default(rhyWaitlistSignUpFragment, null, new RhyWaitlistSignUpFragment3(rhyWaitlistSignUpFragment, null), 1, null)).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpFragment$onViewCreated$1$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                this.this$0.getBinding().rhyWaitlistSignUpButtonBar.setPrimaryButtonLoading(true);
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpFragment$onViewCreated$1$3
            @Override // io.reactivex.functions.Action
            public final void run() {
                this.this$0.getBinding().rhyWaitlistSignUpButtonBar.setPrimaryButtonLoading(false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(rhyWaitlistSignUpFragment, singleDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyWaitlistSignUpFragment.onViewCreated$lambda$2$lambda$0(this.f$0, (ApiWaitlistSpot) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyWaitlistSignUpFragment.onViewCreated$lambda$2$lambda$1(this.f$0, (Throwable) obj);
            }
        });
        EventLogger.DefaultImpls.logTap$default(rhyWaitlistSignUpFragment.getEventLogger(), null, rhyWaitlistSignUpFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, rhyWaitlistSignUpFragment.getEventContext(), false, 41, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$0(RhyWaitlistSignUpFragment rhyWaitlistSignUpFragment, ApiWaitlistSpot apiWaitlistSpot) {
        rhyWaitlistSignUpFragment.getCallbacks().onWaitlistJoined();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(RhyWaitlistSignUpFragment rhyWaitlistSignUpFragment, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AbsErrorHandler.handleError$default(rhyWaitlistSignUpFragment.getActivityErrorHandler(), it, false, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (isInTabFragment()) {
            return super.onBackPressed();
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.setResult(-1);
        fragmentActivityRequireActivity.finish();
        return true;
    }

    private final void playFullscreenThenLoopingAnimation() {
        final LottieAnimationView lottieAnimationView = getBinding().rhyWaitlistSignUpLottie;
        lottieAnimationView.removeAllAnimatorListeners();
        PrimitiveRanges2 primitiveRanges2 = FIRST_FRAME_RANGE;
        lottieAnimationView.setMinAndMaxFrame(primitiveRanges2.getFirst(), primitiveRanges2.getLast());
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpFragment$playFullscreenThenLoopingAnimation$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                lottieAnimationView.removeAllAnimatorListeners();
                lottieAnimationView.setMinAndMaxFrame(RhyWaitlistSignUpFragment.SECOND_FRAME_RANGE.getFirst(), RhyWaitlistSignUpFragment.SECOND_FRAME_RANGE.getLast());
                LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                Intrinsics.checkNotNull(lottieAnimationView2);
                LottieAnimationViewsKt.addEndingInfiniteLoop(lottieAnimationView2, Integer.valueOf(RhyWaitlistSignUpFragment.THIRD_FRAME_RANGE.getFirst()), Integer.valueOf(RhyWaitlistSignUpFragment.THIRD_FRAME_RANGE.getLast()));
                lottieAnimationView.playAnimation();
                this.getBinding().rhyWaitlistSignUpButtonMotion.transitionToEnd();
                this.getBinding().rhyWaitlistSignUpLottieMotion.transitionToEnd();
                EventLogger.DefaultImpls.logAppear$default(this.getEventLogger(), null, this.getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, this.getEventContext(), 9, null);
            }
        });
        lottieAnimationView.playAnimation();
    }

    private final void playLoopingAnimation() {
        LottieAnimationView lottieAnimationView = getBinding().rhyWaitlistSignUpLottie;
        PrimitiveRanges2 primitiveRanges2 = THIRD_FRAME_RANGE;
        lottieAnimationView.setMinAndMaxFrame(primitiveRanges2.getFirst(), primitiveRanges2.getLast());
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.playAnimation();
        getBinding().rhyWaitlistSignUpButtonMotion.setProgress(1.0f);
        getBinding().rhyWaitlistSignUpLottieMotion.setProgress(1.0f);
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, getEventContext(), 9, null);
    }

    /* compiled from: RhyWaitlistSignUpFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistSignUpFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpContract$Key;", "<init>", "()V", "RHY_WAITLIST_JOIN_LOTTIE_URL", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "FIRST_FRAME_RANGE", "Lkotlin/ranges/IntRange;", "SECOND_FRAME_RANGE", "THIRD_FRAME_RANGE", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<RhyWaitlistSignUpContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RhyWaitlistSignUpContract.Key key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new RhyWaitlistSignUpFragment();
        }
    }
}
