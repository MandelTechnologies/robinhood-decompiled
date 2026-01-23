package com.robinhood.android.cash.merchantrewards.p073ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.cash.merchantrewards.C10127R;
import com.robinhood.android.cash.merchantrewards.databinding.FragmentMerchantrewardsOfferTermsBinding;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.noties.markwon.Markwon;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MerchantRewardsOfferTermsFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0002J\t\u0010'\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "duxo", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/cash/merchantrewards/databinding/FragmentMerchantrewardsOfferTermsBinding;", "getBinding", "()Lcom/robinhood/android/cash/merchantrewards/databinding/FragmentMerchantrewardsOfferTermsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindState", "state", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MerchantRewardsOfferTermsFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public Markwon markwon;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MerchantRewardsOfferTermsFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/merchantrewards/databinding/FragmentMerchantrewardsOfferTermsBinding;", 0))};

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

    public MerchantRewardsOfferTermsFragment() {
        super(C10127R.layout.fragment_merchantrewards_offer_terms);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.duxo = OldDuxos.oldDuxo(this, MerchantRewardsOfferTermsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, MerchantRewardsOfferTermsFragment2.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final MerchantRewardsOfferTermsDuxo getDuxo() {
        return (MerchantRewardsOfferTermsDuxo) this.duxo.getValue();
    }

    private final FragmentMerchantrewardsOfferTermsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMerchantrewardsOfferTermsBinding) value;
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C101421(this));
    }

    /* compiled from: MerchantRewardsOfferTermsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOfferTermsFragment$onViewCreated$1 */
    /* synthetic */ class C101421 extends FunctionReferenceImpl implements Function1<MerchantRewardsOfferTermsViewState, Unit> {
        C101421(Object obj) {
            super(1, obj, MerchantRewardsOfferTermsFragment.class, "bindState", "bindState(Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MerchantRewardsOfferTermsViewState merchantRewardsOfferTermsViewState) {
            invoke2(merchantRewardsOfferTermsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MerchantRewardsOfferTermsViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MerchantRewardsOfferTermsFragment) this.receiver).bindState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(MerchantRewardsOfferTermsViewState state) {
        FragmentMerchantrewardsOfferTermsBinding binding = getBinding();
        if (state.getMerchantOfferTerms() != null) {
            binding.merchantrewardsOfferTermsTitle.setText(state.getMerchantOfferTerms().getOfferTermsTitle());
        }
        if (state.getMerchantOfferTerms() != null) {
            binding.merchantrewardsOfferTermsContent.setText(getMarkwon().render(getMarkwon().mo17577parse(state.getMerchantOfferTerms().getOfferTermsMessage())));
        }
    }

    /* compiled from: MerchantRewardsOfferTermsFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyMerchantRewardsOfferTerms;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsFragment;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.RhyMerchantRewardsOfferTerms>, FragmentWithArgsCompanion<MerchantRewardsOfferTermsFragment, LegacyFragmentKey.RhyMerchantRewardsOfferTerms> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.RhyMerchantRewardsOfferTerms getArgs(MerchantRewardsOfferTermsFragment merchantRewardsOfferTermsFragment) {
            return (LegacyFragmentKey.RhyMerchantRewardsOfferTerms) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, merchantRewardsOfferTermsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MerchantRewardsOfferTermsFragment newInstance(LegacyFragmentKey.RhyMerchantRewardsOfferTerms rhyMerchantRewardsOfferTerms) {
            return (MerchantRewardsOfferTermsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, rhyMerchantRewardsOfferTerms);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MerchantRewardsOfferTermsFragment merchantRewardsOfferTermsFragment, LegacyFragmentKey.RhyMerchantRewardsOfferTerms rhyMerchantRewardsOfferTerms) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, merchantRewardsOfferTermsFragment, rhyMerchantRewardsOfferTerms);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyMerchantRewardsOfferTerms key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return MerchantRewardsOfferTermsFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
