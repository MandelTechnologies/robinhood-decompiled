package com.robinhood.android.listsoptions.optionwatchlist;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.listsoptions.C20943R;
import com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionWatchlistHubFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0014J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "getOptionsWatchlistStore", "()Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "setOptionsWatchlistStore", "(Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "Companion", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OptionWatchlistHubFragment extends BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean childFragmentsShouldNotConfigureToolbar;
    public EventLogger eventLogger;
    public OptionsWatchlistStore optionsWatchlistStore;
    private final boolean useDesignSystemToolbar;

    public OptionWatchlistHubFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
        this.childFragmentsShouldNotConfigureToolbar = true;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final OptionsWatchlistStore getOptionsWatchlistStore() {
        OptionsWatchlistStore optionsWatchlistStore = this.optionsWatchlistStore;
        if (optionsWatchlistStore != null) {
            return optionsWatchlistStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionsWatchlistStore");
        return null;
    }

    public final void setOptionsWatchlistStore(OptionsWatchlistStore optionsWatchlistStore) {
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "<set-?>");
        this.optionsWatchlistStore = optionsWatchlistStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(C20943R.string.option_watchlist_title));
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(getOptionsWatchlistStore().streamList()).map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubFragment.onStart.1
            @Override // io.reactivex.functions.Function
            public final UUID apply(CuratedList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubFragment.onStart.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<UUID, Boolean>> apply(final UUID optionsWatchlistId) {
                Intrinsics.checkNotNullParameter(optionsWatchlistId, "optionsWatchlistId");
                return OptionWatchlistHubFragment.this.getOptionsWatchlistStore().streamItemCounts(optionsWatchlistId).map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubFragment.onStart.2.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<UUID, Boolean> apply(Integer it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Tuples4.m3642to(optionsWatchlistId, Boolean.valueOf(it.intValue() > 0));
                    }
                });
            }
        }).distinctUntilChanged(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubFragment.onStart.3
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Tuples2<UUID, Boolean> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Boolean boolComponent2 = tuples2.component2();
                boolComponent2.booleanValue();
                return boolComponent2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubFragment.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getOptionsWatchlistStore().getOptionWatchlistIdAndItemCounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubFragment.onStart$lambda$2(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(OptionWatchlistHubFragment optionWatchlistHubFragment, Tuples2 tuples2) {
        Fragment fragmentNewInstance;
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        UUID uuid = (UUID) objComponent1;
        boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
        if (zBooleanValue) {
            fragmentNewInstance = (BaseFragment) OptionWatchlistHubContentFragment.INSTANCE.newInstance((Parcelable) new OptionWatchlistHubContentFragment.Args(uuid));
        } else {
            fragmentNewInstance = OptionWatchlistHubEmptyFragment.INSTANCE.newInstance();
        }
        optionWatchlistHubFragment.setMenuVisibility(zBooleanValue);
        new ReplaceFragmentBuilder(fragmentNewInstance).setAddToBackstack(false).setUseDefaultAnimation(false).buildAndExecute(optionWatchlistHubFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(OptionWatchlistHubFragment optionWatchlistHubFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        UUID uuid = (UUID) tuples2.component1();
        Tuples2 tuples22 = (Tuples2) tuples2.component2();
        EventLoggers3.logOptionWatchlistHubAppear(optionWatchlistHubFragment.getEventLogger(), uuid, ((Number) tuples22.component1()).intValue(), ((Number) tuples22.component2()).intValue());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        LifecycleHost.DefaultImpls.bind$default(this, getOptionsWatchlistStore().getOptionWatchlistIdAndItemCounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubFragment.onStop$lambda$3(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$3(OptionWatchlistHubFragment optionWatchlistHubFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        UUID uuid = (UUID) tuples2.component1();
        Tuples2 tuples22 = (Tuples2) tuples2.component2();
        EventLoggers3.logOptionWatchlistHubDisappear(optionWatchlistHubFragment.getEventLogger(), uuid, ((Number) tuples22.component1()).intValue(), ((Number) tuples22.component2()).intValue());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        inflater.inflate(C20943R.menu.menu_option_watchlist_hub, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C20943R.id.action_search_option) {
            Navigator navigator = getNavigator();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, fragmentActivityRequireActivity, new SearchSelector(new SearchSelectorLaunchMode.Options.Watchlist(null, OptionChainLaunchMode.WatchlistSearch.INSTANCE, false, 5, null), null, null, 6, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* compiled from: OptionWatchlistHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OptionsWatchlistHub;", "<init>", "()V", "createFragment", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubFragment;", "key", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.OptionsWatchlistHub> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public OptionWatchlistHubFragment createFragment(LegacyFragmentKey.OptionsWatchlistHub key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new OptionWatchlistHubFragment();
        }
    }
}
