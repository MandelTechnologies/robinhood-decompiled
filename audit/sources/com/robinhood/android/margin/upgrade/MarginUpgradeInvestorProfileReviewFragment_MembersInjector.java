package com.robinhood.android.margin.upgrade;

import com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment_MembersInjector;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeEventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeInvestorProfileReviewFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeInvestorProfileReviewFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeInvestorProfileReviewFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "marginUpgradeEventLogger", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "localityStringResources", "Lcom/robinhood/android/margin/upgrade/LocalityStringResources;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginUpgradeInvestorProfileReviewFragment_MembersInjector implements MembersInjector<MarginUpgradeInvestorProfileReviewFragment> {
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<LocalityStringResources> localityStringResources;
    private final Provider<MarginUpgradeEventLogger> marginUpgradeEventLogger;
    private final Provider<Markwon> markwon;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<MarginUpgradeInvestorProfileReviewFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<Markwon> provider3, Provider<MarginUpgradeEventLogger> provider4, Provider<LocalityStringResources> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectLocalityStringResources(MarginUpgradeInvestorProfileReviewFragment marginUpgradeInvestorProfileReviewFragment, LocalityStringResources localityStringResources) {
        INSTANCE.injectLocalityStringResources(marginUpgradeInvestorProfileReviewFragment, localityStringResources);
    }

    public MarginUpgradeInvestorProfileReviewFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<Markwon> markwon, Provider<MarginUpgradeEventLogger> marginUpgradeEventLogger, Provider<LocalityStringResources> localityStringResources) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(marginUpgradeEventLogger, "marginUpgradeEventLogger");
        Intrinsics.checkNotNullParameter(localityStringResources, "localityStringResources");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.markwon = markwon;
        this.marginUpgradeEventLogger = marginUpgradeEventLogger;
        this.localityStringResources = localityStringResources;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MarginUpgradeInvestorProfileReviewFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        GenericComposeFragment_MembersInjector.Companion companion2 = GenericComposeFragment_MembersInjector.INSTANCE;
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons.get();
        Intrinsics.checkNotNullExpressionValue(genericComposeSingletons, "get(...)");
        companion2.injectGenericComposeSingletons(instance, genericComposeSingletons);
        GenericActionHandlingFragment_MembersInjector.Companion companion3 = GenericActionHandlingFragment_MembersInjector.INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion3.injectMarkwon(instance, markwon);
        BaseMarginUpgradeStepComposeFragment_MembersInjector.Companion companion4 = BaseMarginUpgradeStepComposeFragment_MembersInjector.INSTANCE;
        MarginUpgradeEventLogger marginUpgradeEventLogger = this.marginUpgradeEventLogger.get();
        Intrinsics.checkNotNullExpressionValue(marginUpgradeEventLogger, "get(...)");
        companion4.injectMarginUpgradeEventLogger(instance, marginUpgradeEventLogger);
        Companion companion5 = INSTANCE;
        LocalityStringResources localityStringResources = this.localityStringResources.get();
        Intrinsics.checkNotNullExpressionValue(localityStringResources, "get(...)");
        companion5.injectLocalityStringResources(instance, localityStringResources);
    }

    /* compiled from: MarginUpgradeInvestorProfileReviewFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeInvestorProfileReviewFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeInvestorProfileReviewFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "marginUpgradeEventLogger", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "localityStringResources", "Lcom/robinhood/android/margin/upgrade/LocalityStringResources;", "injectLocalityStringResources", "", "instance", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<MarginUpgradeInvestorProfileReviewFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<Markwon> markwon, Provider<MarginUpgradeEventLogger> marginUpgradeEventLogger, Provider<LocalityStringResources> localityStringResources) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(marginUpgradeEventLogger, "marginUpgradeEventLogger");
            Intrinsics.checkNotNullParameter(localityStringResources, "localityStringResources");
            return new MarginUpgradeInvestorProfileReviewFragment_MembersInjector(singletons, genericComposeSingletons, markwon, marginUpgradeEventLogger, localityStringResources);
        }

        @JvmStatic
        public final void injectLocalityStringResources(MarginUpgradeInvestorProfileReviewFragment instance, LocalityStringResources localityStringResources) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(localityStringResources, "localityStringResources");
            instance.setLocalityStringResources(localityStringResources);
        }
    }
}
