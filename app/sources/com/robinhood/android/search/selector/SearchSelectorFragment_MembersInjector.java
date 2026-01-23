package com.robinhood.android.search.selector;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.alert.ShownIndicatorAlertChartTooltipPref;
import com.robinhood.prefs.BooleanPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchSelectorFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchSelectorFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/search/selector/SearchSelectorFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "shownIndicatorAlertChartTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SearchSelectorFragment_MembersInjector implements MembersInjector<SearchSelectorFragment> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BooleanPreference> shownIndicatorAlertChartTooltipPref;
    private final Provider<BaseFragmentSingletons> singletons;

    @JvmStatic
    public static final MembersInjector<SearchSelectorFragment> create(Provider<BaseFragmentSingletons> provider, Provider<BooleanPreference> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    @ShownIndicatorAlertChartTooltipPref
    public static final void injectShownIndicatorAlertChartTooltipPref(SearchSelectorFragment searchSelectorFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectShownIndicatorAlertChartTooltipPref(searchSelectorFragment, booleanPreference);
    }

    public SearchSelectorFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<BooleanPreference> shownIndicatorAlertChartTooltipPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(shownIndicatorAlertChartTooltipPref, "shownIndicatorAlertChartTooltipPref");
        this.singletons = singletons;
        this.shownIndicatorAlertChartTooltipPref = shownIndicatorAlertChartTooltipPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SearchSelectorFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        BooleanPreference booleanPreference = this.shownIndicatorAlertChartTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectShownIndicatorAlertChartTooltipPref(instance, booleanPreference);
    }

    /* compiled from: SearchSelectorFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchSelectorFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/search/selector/SearchSelectorFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "shownIndicatorAlertChartTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "injectShownIndicatorAlertChartTooltipPref", "", "instance", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SearchSelectorFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<BooleanPreference> shownIndicatorAlertChartTooltipPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(shownIndicatorAlertChartTooltipPref, "shownIndicatorAlertChartTooltipPref");
            return new SearchSelectorFragment_MembersInjector(singletons, shownIndicatorAlertChartTooltipPref);
        }

        @JvmStatic
        @ShownIndicatorAlertChartTooltipPref
        public final void injectShownIndicatorAlertChartTooltipPref(SearchSelectorFragment instance, BooleanPreference shownIndicatorAlertChartTooltipPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(shownIndicatorAlertChartTooltipPref, "shownIndicatorAlertChartTooltipPref");
            instance.setShownIndicatorAlertChartTooltipPref(shownIndicatorAlertChartTooltipPref);
        }
    }
}
