package com.robinhood.android.resumeapplication;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.resumeapplication.ResumeApplicationSplashFragment;
import com.robinhood.android.resumeapplication.databinding.FragmentResumeApplicationSplashBinding;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedCompletable;
import com.robinhood.models.serverdriven.experimental.api.ImageSource;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.ThemedImageSource;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Completable;
import java.util.concurrent.TimeUnit;
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
import kotlin.reflect.KProperty;

/* compiled from: ResumeApplicationSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0003#$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u000bH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationSplashFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "onAttach", "", "context", "Landroid/content/Context;", "toolbarVisible", "", "getToolbarVisible", "()Z", "binding", "Lcom/robinhood/android/resumeapplication/databinding/FragmentResumeApplicationSplashBinding;", "getBinding", "()Lcom/robinhood/android/resumeapplication/databinding/FragmentResumeApplicationSplashBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/resumeapplication/ResumeApplicationSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/resumeapplication/ResumeApplicationSplashFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupAnimationListener", "Callbacks", "Args", "Companion", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ResumeApplicationSplashFragment extends BaseFragment {
    private static final int ANIMATION_END_DELAY_MILLIS = 1000;
    private static final long INITIAL_DELAY_MILLIS = 600;
    private static final long SCREEN_SHOWN_DURATION_MILLIS = 350;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public ImageLoader imageLoader;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ResumeApplicationSplashFragment.class, "binding", "getBinding()Lcom/robinhood/android/resumeapplication/databinding/FragmentResumeApplicationSplashBinding;", 0)), Reflection.property1(new PropertyReference1Impl(ResumeApplicationSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/resumeapplication/ResumeApplicationSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ResumeApplicationSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationSplashFragment$Callbacks;", "", "onResumeApplicationSplashComplete", "", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onResumeApplicationSplashComplete();
    }

    public ResumeApplicationSplashFragment() {
        super(C26935R.layout.fragment_resume_application_splash);
        this.binding = ViewBinding5.viewBinding(this, ResumeApplicationSplashFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.resumeapplication.ResumeApplicationSplashFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), ResumeApplicationOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentResumeApplicationSplashBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentResumeApplicationSplashBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ImageSource dark;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Companion companion = INSTANCE;
        ThemedColor backgroundColor = ((Args) companion.getArgs((Fragment) this)).getBackgroundColor();
        if (backgroundColor != null) {
            MotionLayout root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ScarletManager2.overrideAttribute(root, android.R.attr.backgroundTint, SduiColors2.toColorResource(backgroundColor));
        }
        ThemedImageSource imageSource = ((Args) companion.getArgs((Fragment) this)).getImageSource();
        if (imageSource != null) {
            if (DayNightChanges.isDay(getScarletManager())) {
                dark = imageSource.getLight();
            } else {
                dark = imageSource.getDark();
            }
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(UtilKt.toImageUrl(dark, context));
            ImageView resumeApplicationHand = getBinding().resumeApplicationHand;
            Intrinsics.checkNotNullExpressionValue(resumeApplicationHand, "resumeApplicationHand");
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, resumeApplicationHand, null, null, 6, null);
        }
        getBinding().resumeApplicationSplashTitle.setText(getString(C26935R.string.resume_application_splash_title, ((Args) companion.getArgs((Fragment) this)).getName()));
        setupAnimationListener();
        Completable completableTimer = Completable.timer(600L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(completableTimer, "timer(...)");
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(completableTimer), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.resumeapplication.ResumeApplicationSplashFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ResumeApplicationSplashFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(ResumeApplicationSplashFragment resumeApplicationSplashFragment) {
        resumeApplicationSplashFragment.getBinding().getRoot().transitionToState(C26935R.id.resume_application_splash_animation_shown);
        return Unit.INSTANCE;
    }

    /* compiled from: ResumeApplicationSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J*\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, m3636d2 = {"com/robinhood/android/resumeapplication/ResumeApplicationSplashFragment$setupAnimationListener$1", "Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionListener;", "onTransitionStarted", "", "p0", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "p1", "", "p2", "onTransitionChange", "p3", "", "onTransitionCompleted", "onTransitionTrigger", "", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.resumeapplication.ResumeApplicationSplashFragment$setupAnimationListener$1 */
    public static final class C269421 implements MotionLayout.TransitionListener {
        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionChange(MotionLayout p0, int p1, int p2, float p3) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionStarted(MotionLayout p0, int p1, int p2) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionTrigger(MotionLayout p0, int p1, boolean p2, float p3) {
        }

        C269421() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionCompleted(MotionLayout p0, int p1) {
            int currentState = ResumeApplicationSplashFragment.this.getBinding().getRoot().getCurrentState();
            if (currentState == C26935R.id.resume_application_splash_animation_shown) {
                ResumeApplicationSplashFragment resumeApplicationSplashFragment = ResumeApplicationSplashFragment.this;
                Completable completableTimer = Completable.timer(350L, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(completableTimer, "timer(...)");
                ScopedCompletable scopedCompletableBind$default = LifecycleHost.DefaultImpls.bind$default(resumeApplicationSplashFragment, CompletablesAndroid.observeOnMainThread(completableTimer), (LifecycleEvent) null, 1, (Object) null);
                final ResumeApplicationSplashFragment resumeApplicationSplashFragment2 = ResumeApplicationSplashFragment.this;
                scopedCompletableBind$default.subscribeKotlin(new Function0() { // from class: com.robinhood.android.resumeapplication.ResumeApplicationSplashFragment$setupAnimationListener$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ResumeApplicationSplashFragment.C269421.onTransitionCompleted$lambda$0(resumeApplicationSplashFragment2);
                    }
                });
                return;
            }
            if (currentState == C26935R.id.resume_application_splash_animation_end) {
                ResumeApplicationSplashFragment.this.getCallbacks().onResumeApplicationSplashComplete();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onTransitionCompleted$lambda$0(ResumeApplicationSplashFragment resumeApplicationSplashFragment) {
            if (!((Args) ResumeApplicationSplashFragment.INSTANCE.getArgs((Fragment) resumeApplicationSplashFragment)).getShowAnimationEndingDelay()) {
                resumeApplicationSplashFragment.getBinding().getRoot().transitionToState(C26935R.id.resume_application_splash_animation_end);
            } else {
                resumeApplicationSplashFragment.getBinding().getRoot().transitionToState(C26935R.id.resume_application_splash_animation_end, 1000);
            }
            return Unit.INSTANCE;
        }
    }

    private final void setupAnimationListener() {
        getBinding().getRoot().setTransitionListener(new C269421());
    }

    /* compiled from: ResumeApplicationSplashFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationSplashFragment$Args;", "Landroid/os/Parcelable;", "name", "", "showAnimationEndingDelay", "", "backgroundColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "imageSource", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;)V", "getName", "()Ljava/lang/String;", "getShowAnimationEndingDelay", "()Z", "getBackgroundColor", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "getImageSource", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ThemedColor backgroundColor;
        private final ThemedImageSource imageSource;
        private final String name;
        private final boolean showAnimationEndingDelay;

        /* compiled from: ResumeApplicationSplashFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() != 0, (ThemedColor) parcel.readParcelable(Args.class.getClassLoader()), (ThemedImageSource) parcel.readParcelable(Args.class.getClassLoader()));
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
            dest.writeString(this.name);
            dest.writeInt(this.showAnimationEndingDelay ? 1 : 0);
            dest.writeParcelable(this.backgroundColor, flags);
            dest.writeParcelable(this.imageSource, flags);
        }

        public Args(String name, boolean z, ThemedColor themedColor, ThemedImageSource themedImageSource) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.showAnimationEndingDelay = z;
            this.backgroundColor = themedColor;
            this.imageSource = themedImageSource;
        }

        public /* synthetic */ Args(String str, boolean z, ThemedColor themedColor, ThemedImageSource themedImageSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, (i & 4) != 0 ? null : themedColor, (i & 8) != 0 ? null : themedImageSource);
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getShowAnimationEndingDelay() {
            return this.showAnimationEndingDelay;
        }

        public final ThemedColor getBackgroundColor() {
            return this.backgroundColor;
        }

        public final ThemedImageSource getImageSource() {
            return this.imageSource;
        }
    }

    /* compiled from: ResumeApplicationSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/resumeapplication/ResumeApplicationSplashFragment;", "Lcom/robinhood/android/resumeapplication/ResumeApplicationSplashFragment$Args;", "<init>", "()V", "SCREEN_SHOWN_DURATION_MILLIS", "", "INITIAL_DELAY_MILLIS", "ANIMATION_END_DELAY_MILLIS", "", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ResumeApplicationSplashFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ResumeApplicationSplashFragment resumeApplicationSplashFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, resumeApplicationSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ResumeApplicationSplashFragment newInstance(Args args) {
            return (ResumeApplicationSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ResumeApplicationSplashFragment resumeApplicationSplashFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, resumeApplicationSplashFragment, args);
        }
    }
}
