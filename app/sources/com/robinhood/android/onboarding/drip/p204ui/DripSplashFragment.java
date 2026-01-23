package com.robinhood.android.onboarding.drip.p204ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment;
import com.robinhood.android.common.onboarding.p085ui.SplashPage;
import com.robinhood.android.onboarding.drip.C22776R;
import com.robinhood.android.onboarding.drip.p204ui.DripSplashFragment;
import com.robinhood.librobinhood.data.store.DripEligibility;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DripSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/onboarding/drip/ui/DripSplashFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseFullscreenInfoFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/onboarding/drip/ui/DripSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/onboarding/drip/ui/DripSplashFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "splashPage", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "getSplashPage", "()Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "primaryButtonLabelRes", "", "getPrimaryButtonLabelRes", "()Ljava/lang/Integer;", "onPrimaryButtonClicked", "", "Callbacks", "Companion", "feature-drip-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DripSplashFragment extends BaseFullscreenInfoFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.onboarding.drip.ui.DripSplashFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof DripSplashFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final int primaryButtonLabelRes = C11048R.string.general_label_continue;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DripSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/onboarding/drip/ui/DripSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DripSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/drip/ui/DripSplashFragment$Callbacks;", "", "onSplashContinue", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/librobinhood/data/store/DripEligibility$Eligible;", "feature-drip-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSplashContinue(DripEligibility.Eligible data);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public SplashPage getSplashPage() throws Resources.NotFoundException {
        String string2 = getResources().getString(C22776R.string.drip_splash_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getResources().getString(C22776R.string.drip_splash_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new SplashPage(new SplashPage.Creative.Drawable(C22776R.drawable.svg_drip_announcement), null, string2, string3, null, null, 50, null);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public Integer getPrimaryButtonLabelRes() {
        return Integer.valueOf(this.primaryButtonLabelRes);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public void onPrimaryButtonClicked() {
        getCallbacks().onSplashContinue((DripEligibility.Eligible) INSTANCE.getArgs((Fragment) this));
    }

    /* compiled from: DripSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/drip/ui/DripSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/onboarding/drip/ui/DripSplashFragment;", "Lcom/robinhood/librobinhood/data/store/DripEligibility$Eligible;", "<init>", "()V", "feature-drip-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DripSplashFragment, DripEligibility.Eligible> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DripEligibility.Eligible getArgs(DripSplashFragment dripSplashFragment) {
            return (DripEligibility.Eligible) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, dripSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DripSplashFragment newInstance(DripEligibility.Eligible eligible) {
            return (DripSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, eligible);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DripSplashFragment dripSplashFragment, DripEligibility.Eligible eligible) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, dripSplashFragment, eligible);
        }
    }
}
