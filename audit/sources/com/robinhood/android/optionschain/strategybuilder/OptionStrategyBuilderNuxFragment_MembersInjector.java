package com.robinhood.android.optionschain.strategybuilder;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore;
import com.robinhood.userleap.SurveyManager3;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderNuxFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderNuxFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderNuxFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "markwon", "Lio/noties/markwon/Markwon;", "optionsStrategyBuilderStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionStrategyBuilderNuxFragment_MembersInjector implements MembersInjector<OptionStrategyBuilderNuxFragment> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<ImageLoader> imageLoader;
    private final Provider<Markwon> markwon;
    private final Provider<OptionStrategyBuilderStore> optionsStrategyBuilderStore;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionStrategyBuilderNuxFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AccountProvider> provider2, Provider<EventLogger> provider3, Provider<ExperimentsStore> provider4, Provider<ImageLoader> provider5, Provider<Markwon> provider6, Provider<OptionStrategyBuilderStore> provider7, Provider<SurveyManager3> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final void injectAccountProvider(OptionStrategyBuilderNuxFragment optionStrategyBuilderNuxFragment, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(optionStrategyBuilderNuxFragment, accountProvider);
    }

    @JvmStatic
    public static final void injectEventLogger(OptionStrategyBuilderNuxFragment optionStrategyBuilderNuxFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(optionStrategyBuilderNuxFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(OptionStrategyBuilderNuxFragment optionStrategyBuilderNuxFragment, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(optionStrategyBuilderNuxFragment, experimentsStore);
    }

    @JvmStatic
    public static final void injectImageLoader(OptionStrategyBuilderNuxFragment optionStrategyBuilderNuxFragment, ImageLoader imageLoader) {
        INSTANCE.injectImageLoader(optionStrategyBuilderNuxFragment, imageLoader);
    }

    @JvmStatic
    public static final void injectMarkwon(OptionStrategyBuilderNuxFragment optionStrategyBuilderNuxFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(optionStrategyBuilderNuxFragment, markwon);
    }

    @JvmStatic
    public static final void injectOptionsStrategyBuilderStore(OptionStrategyBuilderNuxFragment optionStrategyBuilderNuxFragment, OptionStrategyBuilderStore optionStrategyBuilderStore) {
        INSTANCE.injectOptionsStrategyBuilderStore(optionStrategyBuilderNuxFragment, optionStrategyBuilderStore);
    }

    @JvmStatic
    public static final void injectUserLeapManager(OptionStrategyBuilderNuxFragment optionStrategyBuilderNuxFragment, SurveyManager3 surveyManager3) {
        INSTANCE.injectUserLeapManager(optionStrategyBuilderNuxFragment, surveyManager3);
    }

    public OptionStrategyBuilderNuxFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AccountProvider> accountProvider, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<ImageLoader> imageLoader, Provider<Markwon> markwon, Provider<OptionStrategyBuilderStore> optionsStrategyBuilderStore, Provider<SurveyManager3> userLeapManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(optionsStrategyBuilderStore, "optionsStrategyBuilderStore");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        this.singletons = singletons;
        this.accountProvider = accountProvider;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.imageLoader = imageLoader;
        this.markwon = markwon;
        this.optionsStrategyBuilderStore = optionsStrategyBuilderStore;
        this.userLeapManager = userLeapManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionStrategyBuilderNuxFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion2.injectAccountProvider(instance, accountProvider);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        ImageLoader imageLoader = this.imageLoader.get();
        Intrinsics.checkNotNullExpressionValue(imageLoader, "get(...)");
        companion2.injectImageLoader(instance, imageLoader);
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion2.injectMarkwon(instance, markwon);
        OptionStrategyBuilderStore optionStrategyBuilderStore = this.optionsStrategyBuilderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyBuilderStore, "get(...)");
        companion2.injectOptionsStrategyBuilderStore(instance, optionStrategyBuilderStore);
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        companion2.injectUserLeapManager(instance, surveyManager3);
    }

    /* compiled from: OptionStrategyBuilderNuxFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J~\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bH\u0007J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderNuxFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderNuxFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "markwon", "Lio/noties/markwon/Markwon;", "optionsStrategyBuilderStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "injectAccountProvider", "", "instance", "injectEventLogger", "injectExperimentsStore", "injectImageLoader", "injectMarkwon", "injectOptionsStrategyBuilderStore", "injectUserLeapManager", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionStrategyBuilderNuxFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AccountProvider> accountProvider, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<ImageLoader> imageLoader, Provider<Markwon> markwon, Provider<OptionStrategyBuilderStore> optionsStrategyBuilderStore, Provider<SurveyManager3> userLeapManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(optionsStrategyBuilderStore, "optionsStrategyBuilderStore");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            return new OptionStrategyBuilderNuxFragment_MembersInjector(singletons, accountProvider, eventLogger, experimentsStore, imageLoader, markwon, optionsStrategyBuilderStore, userLeapManager);
        }

        @JvmStatic
        public final void injectAccountProvider(OptionStrategyBuilderNuxFragment instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectEventLogger(OptionStrategyBuilderNuxFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectExperimentsStore(OptionStrategyBuilderNuxFragment instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectImageLoader(OptionStrategyBuilderNuxFragment instance, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            instance.setImageLoader(imageLoader);
        }

        @JvmStatic
        public final void injectMarkwon(OptionStrategyBuilderNuxFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectOptionsStrategyBuilderStore(OptionStrategyBuilderNuxFragment instance, OptionStrategyBuilderStore optionsStrategyBuilderStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionsStrategyBuilderStore, "optionsStrategyBuilderStore");
            instance.setOptionsStrategyBuilderStore(optionsStrategyBuilderStore);
        }

        @JvmStatic
        public final void injectUserLeapManager(OptionStrategyBuilderNuxFragment instance, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            instance.setUserLeapManager(userLeapManager);
        }
    }
}
