package com.robinhood.android.common.views;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.views.BaseInstrumentRowView_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.lists.prefs.OptionsWatchlistViewModePref;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyRowView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/views/OptionStrategyRowView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/views/OptionStrategyRowView;", "viewModePreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionsWatchlistViewModePref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionStrategyRowView_MembersInjector implements MembersInjector<OptionStrategyRowView> {
    private final Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<StringPreference> optionsWatchlistViewModePref;
    private final Provider<RxFactory> rxFactory;
    private final Provider<StringPreference> viewModePreference;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionStrategyRowView> create(Provider<StringPreference> provider, Provider<RxFactory> provider2, Provider<AggregateOptionStrategyQuoteStore> provider3, Provider<ExperimentsStore> provider4, Provider<OptionMarketHoursStore> provider5, Provider<StringPreference> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAggregateOptionStrategyQuoteStore(OptionStrategyRowView optionStrategyRowView, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore) {
        INSTANCE.injectAggregateOptionStrategyQuoteStore(optionStrategyRowView, aggregateOptionStrategyQuoteStore);
    }

    @JvmStatic
    public static final void injectExperimentsStore(OptionStrategyRowView optionStrategyRowView, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(optionStrategyRowView, experimentsStore);
    }

    @JvmStatic
    public static final void injectOptionMarketHoursStore(OptionStrategyRowView optionStrategyRowView, OptionMarketHoursStore optionMarketHoursStore) {
        INSTANCE.injectOptionMarketHoursStore(optionStrategyRowView, optionMarketHoursStore);
    }

    @JvmStatic
    @OptionsWatchlistViewModePref
    public static final void injectOptionsWatchlistViewModePref(OptionStrategyRowView optionStrategyRowView, StringPreference stringPreference) {
        INSTANCE.injectOptionsWatchlistViewModePref(optionStrategyRowView, stringPreference);
    }

    @JvmStatic
    public static final void injectRxFactory(OptionStrategyRowView optionStrategyRowView, RxFactory rxFactory) {
        INSTANCE.injectRxFactory(optionStrategyRowView, rxFactory);
    }

    public OptionStrategyRowView_MembersInjector(Provider<StringPreference> viewModePreference, Provider<RxFactory> rxFactory, Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<ExperimentsStore> experimentsStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<StringPreference> optionsWatchlistViewModePref) {
        Intrinsics.checkNotNullParameter(viewModePreference, "viewModePreference");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistViewModePref, "optionsWatchlistViewModePref");
        this.viewModePreference = viewModePreference;
        this.rxFactory = rxFactory;
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
        this.experimentsStore = experimentsStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionsWatchlistViewModePref = optionsWatchlistViewModePref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionStrategyRowView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseInstrumentRowView_MembersInjector.Companion companion = BaseInstrumentRowView_MembersInjector.INSTANCE;
        StringPreference stringPreference = this.viewModePreference.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion.injectViewModePreference(instance, stringPreference);
        Companion companion2 = INSTANCE;
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(instance, rxFactory);
        AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore = this.aggregateOptionStrategyQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionStrategyQuoteStore, "get(...)");
        companion2.injectAggregateOptionStrategyQuoteStore(instance, aggregateOptionStrategyQuoteStore);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        companion2.injectOptionMarketHoursStore(instance, optionMarketHoursStore);
        StringPreference stringPreference2 = this.optionsWatchlistViewModePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        companion2.injectOptionsWatchlistViewModePref(instance, stringPreference2);
    }

    /* compiled from: OptionStrategyRowView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\tH\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/views/OptionStrategyRowView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/views/OptionStrategyRowView;", "viewModePreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionsWatchlistViewModePref", "injectRxFactory", "", "instance", "injectAggregateOptionStrategyQuoteStore", "injectExperimentsStore", "injectOptionMarketHoursStore", "injectOptionsWatchlistViewModePref", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionStrategyRowView> create(Provider<StringPreference> viewModePreference, Provider<RxFactory> rxFactory, Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<ExperimentsStore> experimentsStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<StringPreference> optionsWatchlistViewModePref) {
            Intrinsics.checkNotNullParameter(viewModePreference, "viewModePreference");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionsWatchlistViewModePref, "optionsWatchlistViewModePref");
            return new OptionStrategyRowView_MembersInjector(viewModePreference, rxFactory, aggregateOptionStrategyQuoteStore, experimentsStore, optionMarketHoursStore, optionsWatchlistViewModePref);
        }

        @JvmStatic
        public final void injectRxFactory(OptionStrategyRowView instance, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            instance.setRxFactory(rxFactory);
        }

        @JvmStatic
        public final void injectAggregateOptionStrategyQuoteStore(OptionStrategyRowView instance, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            instance.setAggregateOptionStrategyQuoteStore(aggregateOptionStrategyQuoteStore);
        }

        @JvmStatic
        public final void injectExperimentsStore(OptionStrategyRowView instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectOptionMarketHoursStore(OptionStrategyRowView instance, OptionMarketHoursStore optionMarketHoursStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            instance.setOptionMarketHoursStore(optionMarketHoursStore);
        }

        @JvmStatic
        @OptionsWatchlistViewModePref
        public final void injectOptionsWatchlistViewModePref(OptionStrategyRowView instance, StringPreference optionsWatchlistViewModePref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionsWatchlistViewModePref, "optionsWatchlistViewModePref");
            instance.setOptionsWatchlistViewModePref(optionsWatchlistViewModePref);
        }
    }
}
