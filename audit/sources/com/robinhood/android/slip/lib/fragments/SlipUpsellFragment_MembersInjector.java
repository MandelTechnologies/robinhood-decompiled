package com.robinhood.android.slip.lib.fragments;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import com.robinhood.librobinhood.data.store.prefs.LastTimePromptedForSlipUpsell;
import com.robinhood.librobinhood.data.store.prefs.SlipUpsellPromptCount;
import com.robinhood.prefs.LongPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipUpsellFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/fragments/SlipUpsellFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/slip/lib/fragments/SlipUpsellFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "lastTimePromptedForSlipUpsell", "Lcom/robinhood/prefs/LongPreference;", "slipUpsellPromptCount", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SlipUpsellFragment_MembersInjector implements MembersInjector<SlipUpsellFragment> {
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<LongPreference> lastTimePromptedForSlipUpsell;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<LongPreference> slipUpsellPromptCount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SlipUpsellFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<LongPreference> provider3, Provider<LongPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    @LastTimePromptedForSlipUpsell
    public static final void injectLastTimePromptedForSlipUpsell(SlipUpsellFragment slipUpsellFragment, LongPreference longPreference) {
        INSTANCE.injectLastTimePromptedForSlipUpsell(slipUpsellFragment, longPreference);
    }

    @JvmStatic
    @SlipUpsellPromptCount
    public static final void injectSlipUpsellPromptCount(SlipUpsellFragment slipUpsellFragment, LongPreference longPreference) {
        INSTANCE.injectSlipUpsellPromptCount(slipUpsellFragment, longPreference);
    }

    public SlipUpsellFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<LongPreference> lastTimePromptedForSlipUpsell, Provider<LongPreference> slipUpsellPromptCount) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(lastTimePromptedForSlipUpsell, "lastTimePromptedForSlipUpsell");
        Intrinsics.checkNotNullParameter(slipUpsellPromptCount, "slipUpsellPromptCount");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.lastTimePromptedForSlipUpsell = lastTimePromptedForSlipUpsell;
        this.slipUpsellPromptCount = slipUpsellPromptCount;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SlipUpsellFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        GenericComposeFragment_MembersInjector.Companion companion2 = GenericComposeFragment_MembersInjector.INSTANCE;
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons.get();
        Intrinsics.checkNotNullExpressionValue(genericComposeSingletons, "get(...)");
        companion2.injectGenericComposeSingletons(instance, genericComposeSingletons);
        Companion companion3 = INSTANCE;
        LongPreference longPreference = this.lastTimePromptedForSlipUpsell.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        companion3.injectLastTimePromptedForSlipUpsell(instance, longPreference);
        LongPreference longPreference2 = this.slipUpsellPromptCount.get();
        Intrinsics.checkNotNullExpressionValue(longPreference2, "get(...)");
        companion3.injectSlipUpsellPromptCount(instance, longPreference2);
    }

    /* compiled from: SlipUpsellFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/fragments/SlipUpsellFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/slip/lib/fragments/SlipUpsellFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "lastTimePromptedForSlipUpsell", "Lcom/robinhood/prefs/LongPreference;", "slipUpsellPromptCount", "injectLastTimePromptedForSlipUpsell", "", "instance", "injectSlipUpsellPromptCount", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SlipUpsellFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<LongPreference> lastTimePromptedForSlipUpsell, Provider<LongPreference> slipUpsellPromptCount) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(lastTimePromptedForSlipUpsell, "lastTimePromptedForSlipUpsell");
            Intrinsics.checkNotNullParameter(slipUpsellPromptCount, "slipUpsellPromptCount");
            return new SlipUpsellFragment_MembersInjector(singletons, genericComposeSingletons, lastTimePromptedForSlipUpsell, slipUpsellPromptCount);
        }

        @JvmStatic
        @LastTimePromptedForSlipUpsell
        public final void injectLastTimePromptedForSlipUpsell(SlipUpsellFragment instance, LongPreference lastTimePromptedForSlipUpsell) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(lastTimePromptedForSlipUpsell, "lastTimePromptedForSlipUpsell");
            instance.setLastTimePromptedForSlipUpsell(lastTimePromptedForSlipUpsell);
        }

        @JvmStatic
        @SlipUpsellPromptCount
        public final void injectSlipUpsellPromptCount(SlipUpsellFragment instance, LongPreference slipUpsellPromptCount) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(slipUpsellPromptCount, "slipUpsellPromptCount");
            instance.setSlipUpsellPromptCount(slipUpsellPromptCount);
        }
    }
}
