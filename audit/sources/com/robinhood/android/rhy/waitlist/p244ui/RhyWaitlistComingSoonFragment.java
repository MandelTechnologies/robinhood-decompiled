package com.robinhood.android.rhy.waitlist.p244ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.rhy.waitlist.C27560R;
import com.robinhood.android.rhy.waitlist.databinding.FragmentRhyWaitlistComingSoonBinding;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.reflect.KProperty;

/* compiled from: RhyWaitlistComingSoonFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistComingSoonFragment;", "Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistComingSoonBinding;", "getBinding", "()Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistComingSoonBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "Companion", "feature-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyWaitlistComingSoonFragment extends RhyWaitlistFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyWaitlistComingSoonFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistComingSoonBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final LottieUrl RHY_WAITLIST_JOIN_LOTTIE_URL = LottieUrl.RHY_WAITLIST_JOIN;
    private static final PrimitiveRanges2 RHY_WAITLIST_JOIN_LOTTIE_LOOP_RANGE = new PrimitiveRanges2(362, 592);

    public RhyWaitlistComingSoonFragment() {
        super(C27560R.layout.fragment_rhy_waitlist_coming_soon);
        this.binding = ViewBinding5.viewBinding(this, RhyWaitlistComingSoonFragment2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentRhyWaitlistComingSoonBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyWaitlistComingSoonBinding) value;
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
        LottieAnimationView lottieAnimationView = getBinding().rhyWaitlistComingSoonLottie;
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, RHY_WAITLIST_JOIN_LOTTIE_URL);
        PrimitiveRanges2 primitiveRanges2 = RHY_WAITLIST_JOIN_LOTTIE_LOOP_RANGE;
        lottieAnimationView.setMinAndMaxFrame(primitiveRanges2.getFirst(), primitiveRanges2.getLast());
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.playAnimation();
        if (!isInTabFragment()) {
            ScrollView rhyWaitlistComingSoonScrollView = getBinding().rhyWaitlistComingSoonScrollView;
            Intrinsics.checkNotNullExpressionValue(rhyWaitlistComingSoonScrollView, "rhyWaitlistComingSoonScrollView");
            InsetSides.Companion companion = InsetSides.INSTANCE;
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(rhyWaitlistComingSoonScrollView, companion.m26679getBottomXedK2Rk());
            RdsButtonBarView rhyWaitlistComingSoonButtonBar = getBinding().rhyWaitlistComingSoonButtonBar;
            Intrinsics.checkNotNullExpressionValue(rhyWaitlistComingSoonButtonBar, "rhyWaitlistComingSoonButtonBar");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(rhyWaitlistComingSoonButtonBar, companion.m26679getBottomXedK2Rk());
        }
        getBinding().rhyWaitlistComingSoonButtonBar.onPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistComingSoonFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyWaitlistComingSoonFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        final ScrollView scrollView = getBinding().rhyWaitlistComingSoonScrollView;
        scrollView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistComingSoonFragment$onViewCreated$3$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.this$0.getBinding().rhyWaitlistComingSoonButtonBar.setRuleLineInvisible(!scrollView.canScrollVertically(1));
            }
        });
        scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistComingSoonFragment$onViewCreated$3$2
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                ScrollView scrollView2 = scrollView;
                this.getBinding().rhyWaitlistComingSoonButtonBar.setRuleLineInvisible(scrollView2.getChildAt(scrollView2.getChildCount() - 1).getBottom() - (scrollView.getHeight() + i2) == 0);
            }
        });
        RdsButtonBarView rhyWaitlistComingSoonButtonBar2 = getBinding().rhyWaitlistComingSoonButtonBar;
        Intrinsics.checkNotNullExpressionValue(rhyWaitlistComingSoonButtonBar2, "rhyWaitlistComingSoonButtonBar");
        rhyWaitlistComingSoonButtonBar2.setVisibility(!isInTabFragment() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RhyWaitlistComingSoonFragment rhyWaitlistComingSoonFragment) {
        rhyWaitlistComingSoonFragment.onBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (isInTabFragment()) {
            return super.onBackPressed();
        }
        requireActivity().finish();
        return true;
    }

    /* compiled from: RhyWaitlistComingSoonFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistComingSoonFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyWaitlistComingSoon;", "<init>", "()V", "RHY_WAITLIST_JOIN_LOTTIE_URL", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "RHY_WAITLIST_JOIN_LOTTIE_LOOP_RANGE", "Lkotlin/ranges/IntRange;", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.RhyWaitlistComingSoon> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyWaitlistComingSoon key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new RhyWaitlistComingSoonFragment();
        }
    }
}
