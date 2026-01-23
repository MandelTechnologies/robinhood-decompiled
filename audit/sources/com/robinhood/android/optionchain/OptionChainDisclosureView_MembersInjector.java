package com.robinhood.android.optionchain;

import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainDisclosureView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/optionchain/OptionChainDisclosureView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionchain/OptionChainDisclosureView;", "brokerageResourceManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class OptionChainDisclosureView_MembersInjector implements MembersInjector<OptionChainDisclosureView> {
    private final Provider<BrokerageResourceManager> brokerageResourceManager;
    private final Provider<Markwon> markwon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionChainDisclosureView> create(Provider<BrokerageResourceManager> provider, Provider<Markwon> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectBrokerageResourceManager(OptionChainDisclosureView optionChainDisclosureView, BrokerageResourceManager brokerageResourceManager) {
        INSTANCE.injectBrokerageResourceManager(optionChainDisclosureView, brokerageResourceManager);
    }

    @JvmStatic
    public static final void injectMarkwon(OptionChainDisclosureView optionChainDisclosureView, Markwon markwon) {
        INSTANCE.injectMarkwon(optionChainDisclosureView, markwon);
    }

    public OptionChainDisclosureView_MembersInjector(Provider<BrokerageResourceManager> brokerageResourceManager, Provider<Markwon> markwon) {
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.brokerageResourceManager = brokerageResourceManager;
        this.markwon = markwon;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionChainDisclosureView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        BrokerageResourceManager brokerageResourceManager = this.brokerageResourceManager.get();
        Intrinsics.checkNotNullExpressionValue(brokerageResourceManager, "get(...)");
        companion.injectBrokerageResourceManager(instance, brokerageResourceManager);
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion.injectMarkwon(instance, markwon);
    }

    /* compiled from: OptionChainDisclosureView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionchain/OptionChainDisclosureView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionchain/OptionChainDisclosureView;", "brokerageResourceManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "markwon", "Lio/noties/markwon/Markwon;", "injectBrokerageResourceManager", "", "instance", "injectMarkwon", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionChainDisclosureView> create(Provider<BrokerageResourceManager> brokerageResourceManager, Provider<Markwon> markwon) {
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new OptionChainDisclosureView_MembersInjector(brokerageResourceManager, markwon);
        }

        @JvmStatic
        public final void injectBrokerageResourceManager(OptionChainDisclosureView instance, BrokerageResourceManager brokerageResourceManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            instance.setBrokerageResourceManager(brokerageResourceManager);
        }

        @JvmStatic
        public final void injectMarkwon(OptionChainDisclosureView instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }
    }
}
