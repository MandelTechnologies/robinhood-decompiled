package com.robinhood.android.welcome.p276gb;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.swipeycontent.SwipeyContent;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.welcome.C31456R;
import com.robinhood.android.welcome.WelcomeAnimationViewState;
import com.robinhood.android.welcome.databinding.FragmentWelcomeGbBinding;
import com.robinhood.android.welcome.p276gb.WelcomeFragmentGb;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: WelcomeFragmentGb.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u0003/01B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0017J\b\u0010*\u001a\u00020%H\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020%H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/welcome/gb/WelcomeFragmentGb;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/welcome/gb/WelcomeFragmentGb$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/welcome/gb/WelcomeFragmentGb$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "viewPagerAdapter", "Lcom/robinhood/android/welcome/gb/WelcomeFragmentAdapterGb;", "binding", "Lcom/robinhood/android/welcome/databinding/FragmentWelcomeGbBinding;", "getBinding", "()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeGbBinding;", "binding$delegate", "toolbarVisible", "", "getToolbarVisible", "()Z", "screenTag", "", "getScreenTag", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "pageToScreenId", "position", "", "configViewPager", "Callbacks", "Args", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WelcomeFragmentGb extends BaseFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WelcomeFragmentGb.class, "callbacks", "getCallbacks()Lcom/robinhood/android/welcome/gb/WelcomeFragmentGb$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(WelcomeFragmentGb.class, "binding", "getBinding()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeGbBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    private final String screenTag;
    private final boolean toolbarVisible;
    private WelcomeFragmentAdapterGb viewPagerAdapter;

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

    public WelcomeFragmentGb() {
        super(C31456R.layout.fragment_welcome_gb);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.welcome.gb.WelcomeFragmentGb$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof WelcomeFragmentGb.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, WelcomeFragmentGb2.INSTANCE);
        this.screenTag = AnalyticsStrings.MAX_WELCOME_TAG;
    }

    /* compiled from: WelcomeFragmentGb.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/welcome/gb/WelcomeFragmentGb$Callbacks;", "", "onSignInClicked", "", "loggingTag", "", "onSignUpClicked", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes20.dex */
    public interface Callbacks {
        void onSignInClicked(String loggingTag);

        void onSignUpClicked(String loggingTag);

        /* compiled from: WelcomeFragmentGb.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes9.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void onSignInClicked$default(Callbacks callbacks, String str, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSignInClicked");
                }
                if ((i & 1) != 0) {
                    str = "";
                }
                callbacks.onSignInClicked(str);
            }

            public static /* synthetic */ void onSignUpClicked$default(Callbacks callbacks, String str, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSignUpClicked");
                }
                if ((i & 1) != 0) {
                    str = "";
                }
                callbacks.onSignUpClicked(str);
            }
        }
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentWelcomeGbBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentWelcomeGbBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return this.screenTag;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        int currentItem;
        try {
            currentItem = getBinding().welcomeViewPager.getCurrentItem();
        } catch (Exception unused) {
            currentItem = 0;
        }
        return new Screen(Screen.Name.WELCOME_MAIN, null, pageToScreenId(currentItem), null, 10, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int num_welcome_max_pages;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        configViewPager();
        DotIndicators dotIndicators = getBinding().welcomeDotIndicators;
        if (((Args) INSTANCE.getArgs((Fragment) this)).getSwipeyContent() == null) {
            num_welcome_max_pages = WelcomeAnimationViewState.INSTANCE.getNUM_WELCOME_MAX_PAGES() - 1;
        } else {
            num_welcome_max_pages = WelcomeAnimationViewState.INSTANCE.getNUM_WELCOME_MAX_PAGES();
        }
        dotIndicators.setNumDots(num_welcome_max_pages);
        ConstraintLayout buttonContainer = getBinding().buttonContainer;
        Intrinsics.checkNotNullExpressionValue(buttonContainer, "buttonContainer");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(buttonContainer, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsButton rdsButton = getBinding().welcomeLoginBtn;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.welcome.gb.WelcomeFragmentGb$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeFragmentGb.onViewCreated$lambda$2$lambda$0();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.welcome.gb.WelcomeFragmentGb$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeFragmentGb.onViewCreated$lambda$2$lambda$1(this.f$0);
            }
        });
        getBinding().welcomeViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.robinhood.android.welcome.gb.WelcomeFragmentGb.onViewCreated.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                WelcomeFragmentGb.this.getBinding().welcomeDotIndicators.setNumActivated(position);
            }
        });
        getBinding().welcomeViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.robinhood.android.welcome.gb.WelcomeFragmentGb.onViewCreated.3
            private int currentPosition = -1;

            public final int getCurrentPosition() {
                return this.currentPosition;
            }

            public final void setCurrentPosition(int i) {
                this.currentPosition = i;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                int i = this.currentPosition;
                if (i != position && i != -1) {
                    EventLogger.DefaultImpls.logSwipe$default(WelcomeFragmentGb.this.getEventLogger(), null, new Screen(Screen.Name.WELCOME_MAIN, null, WelcomeFragmentGb.this.pageToScreenId(this.currentPosition), null, 10, null), new Component(Component.ComponentType.CAROUSEL, null, null, 6, null), null, null, false, 57, null);
                }
                this.currentPosition = position;
            }
        });
        RdsButton rdsButton2 = getBinding().welcomeSignupBtn;
        Intrinsics.checkNotNull(rdsButton2);
        ViewsKt.eventData$default(rdsButton2, false, new Function0() { // from class: com.robinhood.android.welcome.gb.WelcomeFragmentGb$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeFragmentGb.onViewCreated$lambda$5$lambda$3();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.welcome.gb.WelcomeFragmentGb$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeFragmentGb.onViewCreated$lambda$5$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$2$lambda$0() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LOGIN, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(WelcomeFragmentGb welcomeFragmentGb) {
        Callbacks.DefaultImpls.onSignInClicked$default(welcomeFragmentGb.getCallbacks(), null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$5$lambda$3() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SIGN_UP, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(WelcomeFragmentGb welcomeFragmentGb) {
        Callbacks.DefaultImpls.onSignUpClicked$default(welcomeFragmentGb.getCallbacks(), null, 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        requireBaseActivity().hideToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String pageToScreenId(int position) {
        List mutableList = ArraysKt.toMutableList(WelcomePageGb.values());
        if (((Args) INSTANCE.getArgs((Fragment) this)).getSwipeyContent() == null) {
            mutableList.remove(WelcomePageGb.PAGE_THREE);
        }
        if (position == 0) {
            return WelcomePageGb2.TAB_GB_WELCOME;
        }
        return ((WelcomePageGb) mutableList.get(position - 1)).getScreenIdentifier();
    }

    private final void configViewPager() {
        ViewPager2 viewPager2 = getBinding().welcomeViewPager;
        List mutableList = ArraysKt.toMutableList(WelcomePageGb.values());
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getSwipeyContent() == null) {
            mutableList.remove(WelcomePageGb.PAGE_THREE);
        }
        this.viewPagerAdapter = new WelcomeFragmentAdapterGb(this, mutableList, ((Args) companion.getArgs((Fragment) this)).getSwipeyContent());
        Intrinsics.checkNotNull(viewPager2);
        WelcomeFragmentAdapterGb welcomeFragmentAdapterGb = this.viewPagerAdapter;
        if (welcomeFragmentAdapterGb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            welcomeFragmentAdapterGb = null;
        }
        bindAdapter(viewPager2, welcomeFragmentAdapterGb);
        viewPager2.setOffscreenPageLimit(1);
    }

    /* compiled from: WelcomeFragmentGb.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/welcome/gb/WelcomeFragmentGb$Args;", "Landroid/os/Parcelable;", "swipeyContent", "Lcom/robinhood/android/api/swipeycontent/SwipeyContent;", "<init>", "(Lcom/robinhood/android/api/swipeycontent/SwipeyContent;)V", "getSwipeyContent", "()Lcom/robinhood/android/api/swipeycontent/SwipeyContent;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final SwipeyContent swipeyContent;

        /* compiled from: WelcomeFragmentGb.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((SwipeyContent) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, SwipeyContent swipeyContent, int i, Object obj) {
            if ((i & 1) != 0) {
                swipeyContent = args.swipeyContent;
            }
            return args.copy(swipeyContent);
        }

        /* renamed from: component1, reason: from getter */
        public final SwipeyContent getSwipeyContent() {
            return this.swipeyContent;
        }

        public final Args copy(SwipeyContent swipeyContent) {
            return new Args(swipeyContent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.swipeyContent, ((Args) other).swipeyContent);
        }

        public int hashCode() {
            SwipeyContent swipeyContent = this.swipeyContent;
            if (swipeyContent == null) {
                return 0;
            }
            return swipeyContent.hashCode();
        }

        public String toString() {
            return "Args(swipeyContent=" + this.swipeyContent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.swipeyContent, flags);
        }

        public Args(SwipeyContent swipeyContent) {
            this.swipeyContent = swipeyContent;
        }

        public final SwipeyContent getSwipeyContent() {
            return this.swipeyContent;
        }
    }

    /* compiled from: WelcomeFragmentGb.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/welcome/gb/WelcomeFragmentGb$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/welcome/gb/WelcomeFragmentGb;", "Lcom/robinhood/android/welcome/gb/WelcomeFragmentGb$Args;", "<init>", "()V", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<WelcomeFragmentGb, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(WelcomeFragmentGb welcomeFragmentGb) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, welcomeFragmentGb);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WelcomeFragmentGb newInstance(Args args) {
            return (WelcomeFragmentGb) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WelcomeFragmentGb welcomeFragmentGb, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, welcomeFragmentGb, args);
        }
    }
}
