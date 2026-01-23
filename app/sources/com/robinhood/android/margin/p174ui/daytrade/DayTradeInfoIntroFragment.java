package com.robinhood.android.margin.p174ui.daytrade;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.margin.C20999R;
import com.robinhood.android.margin.databinding.FragmentDayTradeInfoIntroBinding;
import com.robinhood.android.margin.model.UiDayTradeInfo;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
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

/* compiled from: DayTradeInfoIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002-.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\"X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoIntroFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "callbacks", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoIntroFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoIntroFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/margin/databinding/FragmentDayTradeInfoIntroBinding;", "getBinding", "()Lcom/robinhood/android/margin/databinding/FragmentDayTradeInfoIntroBinding;", "binding$delegate", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DayTradeInfoIntroFragment extends BaseFragment {
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public ImageLoader imageLoader;
    public Markwon markwon;
    private final String screenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DayTradeInfoIntroFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoIntroFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(DayTradeInfoIntroFragment.class, "binding", "getBinding()Lcom/robinhood/android/margin/databinding/FragmentDayTradeInfoIntroBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DayTradeInfoIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoIntroFragment$Callbacks;", "", "onStartTutorial", "", "onSkipPressed", "stage", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStage;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSkipPressed(DayTradeInfoStage stage);

        void onStartTutorial();
    }

    public DayTradeInfoIntroFragment() {
        super(C20999R.layout.fragment_day_trade_info_intro);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoIntroFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, DayTradeInfoIntroFragment2.INSTANCE);
        this.screenName = "PDT_EDUCATION";
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentDayTradeInfoIntroBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDayTradeInfoIntroBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return ((UiDayTradeInfo) INSTANCE.getArgs((Fragment) this)).getTitle();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoIntroFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoIntroFragment.onViewCreated$lambda$0(this.f$0, (DayNightOverlay) obj);
            }
        });
        RhTextView rhTextView = getBinding().dayTradeInfoV2IntroTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((UiDayTradeInfo) companion.getArgs((Fragment) this)).getTitle());
        getBinding().dayTradeInfoV2IntroDescription.setText(Markwons.toSpanned$default(getMarkwon(), ((UiDayTradeInfo) companion.getArgs((Fragment) this)).getDescription(), null, 2, null));
        RdsButton dayTradeInfoV2IntroContinue = getBinding().dayTradeInfoV2IntroContinue;
        Intrinsics.checkNotNullExpressionValue(dayTradeInfoV2IntroContinue, "dayTradeInfoV2IntroContinue");
        OnClickListeners.onClick(dayTradeInfoV2IntroContinue, new C210172(getCallbacks()));
        RdsButton dayTradeInfoV2IntroExit = getBinding().dayTradeInfoV2IntroExit;
        Intrinsics.checkNotNullExpressionValue(dayTradeInfoV2IntroExit, "dayTradeInfoV2IntroExit");
        OnClickListeners.onClick(dayTradeInfoV2IntroExit, new Function0() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoIntroFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DayTradeInfoIntroFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(DayTradeInfoIntroFragment dayTradeInfoIntroFragment, DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        ImageLoader.ImageRequest imageRequestLoad = dayTradeInfoIntroFragment.getImageLoader().load(((UiDayTradeInfo) INSTANCE.getArgs((Fragment) dayTradeInfoIntroFragment)).imageUrlForDayNightOverlay(overlay));
        ImageView dayTradeInfoV2IntroImage = dayTradeInfoIntroFragment.getBinding().dayTradeInfoV2IntroImage;
        Intrinsics.checkNotNullExpressionValue(dayTradeInfoV2IntroImage, "dayTradeInfoV2IntroImage");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, dayTradeInfoV2IntroImage, null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* compiled from: DayTradeInfoIntroFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.daytrade.DayTradeInfoIntroFragment$onViewCreated$2 */
    /* synthetic */ class C210172 extends FunctionReferenceImpl implements Function0<Unit> {
        C210172(Object obj) {
            super(0, obj, Callbacks.class, "onStartTutorial", "onStartTutorial()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Callbacks) this.receiver).onStartTutorial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(DayTradeInfoIntroFragment dayTradeInfoIntroFragment) {
        dayTradeInfoIntroFragment.getCallbacks().onSkipPressed(DayTradeInfoStage.INTRO);
        return Unit.INSTANCE;
    }

    /* compiled from: DayTradeInfoIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoIntroFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoIntroFragment;", "Lcom/robinhood/android/margin/model/UiDayTradeInfo;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DayTradeInfoIntroFragment, UiDayTradeInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiDayTradeInfo getArgs(DayTradeInfoIntroFragment dayTradeInfoIntroFragment) {
            return (UiDayTradeInfo) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, dayTradeInfoIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DayTradeInfoIntroFragment newInstance(UiDayTradeInfo uiDayTradeInfo) {
            return (DayTradeInfoIntroFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, uiDayTradeInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DayTradeInfoIntroFragment dayTradeInfoIntroFragment, UiDayTradeInfo uiDayTradeInfo) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, dayTradeInfoIntroFragment, uiDayTradeInfo);
        }
    }
}
