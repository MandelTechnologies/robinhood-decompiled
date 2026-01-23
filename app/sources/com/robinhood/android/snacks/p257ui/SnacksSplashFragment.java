package com.robinhood.android.snacks.p257ui;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.onboarding.p085ui.BaseSplashFragment;
import com.robinhood.android.common.onboarding.p085ui.SplashPage;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SnacksRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.snacks.C28692R;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SnacksSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002 !B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSplashFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseSplashFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/snacks/ui/SnacksSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/snacks/ui/SnacksSplashFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "actionTextRes", "", "getActionTextRes", "()Ljava/lang/Integer;", "linkTextRes", "getLinkTextRes", "pages", "", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "getPages", "()Ljava/util/List;", "onActionButtonClicked", "", "onLinkTextClicked", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SnacksSplashFragment extends BaseSplashFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SnacksSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/snacks/ui/SnacksSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SnacksRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.snacks.ui.SnacksSplashFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    private final int actionTextRes = C28692R.string.snacks_splash_action_text;
    private final int linkTextRes = C28692R.string.snacks_disclosures;

    /* compiled from: SnacksSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSplashFragment$Callbacks;", "", "onSubscribeClicked", "", "onDisclosuresLinkClicked", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDisclosuresLinkClicked();

        void onSubscribeClicked();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseSplashFragment
    public Integer getActionTextRes() {
        return Integer.valueOf(this.actionTextRes);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseSplashFragment
    public Integer getLinkTextRes() {
        return Integer.valueOf(this.linkTextRes);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseSplashFragment
    public List<SplashPage> getPages() throws Resources.NotFoundException {
        SplashPage.Creative.Layout layout = new SplashPage.Creative.Layout(C28692R.layout.include_snacks_splash_page_1);
        String string2 = getResources().getString(C28692R.string.snacks_splash_page_1_heading);
        String string3 = getResources().getString(C28692R.string.snacks_splash_page_1_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getResources().getString(C28692R.string.snacks_splash_page_1_summary);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        SplashPage splashPage = new SplashPage(layout, string2, string3, string4, null, null, 48, null);
        SplashPage.Creative.Layout layout2 = new SplashPage.Creative.Layout(C28692R.layout.include_snacks_splash_page_2);
        String string5 = getResources().getString(C28692R.string.snacks_splash_page_2_title);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = getResources().getString(C28692R.string.snacks_splash_page_2_summary);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        SplashPage splashPage2 = new SplashPage(layout2, null, string5, string6, null, null, 50, null);
        SplashPage.Creative.Layout layout3 = new SplashPage.Creative.Layout(C28692R.layout.include_snacks_splash_page_3);
        String string7 = getResources().getString(C28692R.string.snacks_splash_page_3_title);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = getResources().getString(C28692R.string.snacks_splash_page_3_summary);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        return CollectionsKt.listOf((Object[]) new SplashPage[]{splashPage, splashPage2, new SplashPage(layout3, null, string7, string8, null, null, 50, null)});
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseSplashFragment
    protected void onActionButtonClicked() {
        getCallbacks().onSubscribeClicked();
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseSplashFragment
    protected void onLinkTextClicked() {
        getCallbacks().onDisclosuresLinkClicked();
    }

    /* compiled from: SnacksSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSplashFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/snacks/ui/SnacksSplashFragment;", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SnacksSplashFragment newInstance() {
            return new SnacksSplashFragment();
        }
    }
}
