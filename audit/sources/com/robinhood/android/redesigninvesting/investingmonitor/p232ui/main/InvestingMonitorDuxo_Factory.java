package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.robinhood.android.common.data.CuratedListEligibleItemsFetcher;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.redesigninvesting.investingmonitor.modes.InvestingMonitorViewMode;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.lists.store.ListsOrderStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingMonitorDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bt\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDuxo;", "curatedListStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "listOrderStore", "Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "curatedListEligibleItemsFetcher", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "pref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InvestingMonitorDuxo_Factory implements Factory<InvestingMonitorDuxo> {
    private final Provider<CuratedListEligibleItemsFetcher> curatedListEligibleItemsFetcher;
    private final Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore;
    private final Provider<CuratedListItemsStore> curatedListItemsStore;
    private final Provider<CuratedListStore> curatedListStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ListsOrderStore> listOrderStore;
    private final Provider<EnumPreference<InvestingMonitorViewMode>> pref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InvestingMonitorDuxo_Factory create(Provider<CuratedListStore> provider, Provider<CuratedListItemsStore> provider2, Provider<ListsOrderStore> provider3, Provider<CuratedListEligibleItemsFetcher> provider4, Provider<CuratedListItemViewModeStore> provider5, Provider<EnumPreference<InvestingMonitorViewMode>> provider6, Provider<DuxoBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final InvestingMonitorDuxo newInstance(CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, ListsOrderStore listsOrderStore, CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher, CuratedListItemViewModeStore curatedListItemViewModeStore, EnumPreference<InvestingMonitorViewMode> enumPreference, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(curatedListStore, curatedListItemsStore, listsOrderStore, curatedListEligibleItemsFetcher, curatedListItemViewModeStore, enumPreference, duxoBundle);
    }

    public InvestingMonitorDuxo_Factory(Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<ListsOrderStore> listOrderStore, Provider<CuratedListEligibleItemsFetcher> curatedListEligibleItemsFetcher, Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore, Provider<EnumPreference<InvestingMonitorViewMode>> pref, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(listOrderStore, "listOrderStore");
        Intrinsics.checkNotNullParameter(curatedListEligibleItemsFetcher, "curatedListEligibleItemsFetcher");
        Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.curatedListStore = curatedListStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.listOrderStore = listOrderStore;
        this.curatedListEligibleItemsFetcher = curatedListEligibleItemsFetcher;
        this.curatedListItemViewModeStore = curatedListItemViewModeStore;
        this.pref = pref;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public InvestingMonitorDuxo get() {
        Companion companion = INSTANCE;
        CuratedListStore curatedListStore = this.curatedListStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListStore, "get(...)");
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemsStore, "get(...)");
        ListsOrderStore listsOrderStore = this.listOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(listsOrderStore, "get(...)");
        CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher = this.curatedListEligibleItemsFetcher.get();
        Intrinsics.checkNotNullExpressionValue(curatedListEligibleItemsFetcher, "get(...)");
        CuratedListItemViewModeStore curatedListItemViewModeStore = this.curatedListItemViewModeStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemViewModeStore, "get(...)");
        EnumPreference<InvestingMonitorViewMode> enumPreference = this.pref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(curatedListStore, curatedListItemsStore, listsOrderStore, curatedListEligibleItemsFetcher, curatedListItemViewModeStore, enumPreference, duxoBundle);
    }

    /* compiled from: InvestingMonitorDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ju\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0017\u0010\u0011\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JK\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDuxo_Factory;", "curatedListStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "listOrderStore", "Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "curatedListEligibleItemsFetcher", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "pref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDuxo;", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestingMonitorDuxo_Factory create(Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<ListsOrderStore> listOrderStore, Provider<CuratedListEligibleItemsFetcher> curatedListEligibleItemsFetcher, Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore, Provider<EnumPreference<InvestingMonitorViewMode>> pref, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(listOrderStore, "listOrderStore");
            Intrinsics.checkNotNullParameter(curatedListEligibleItemsFetcher, "curatedListEligibleItemsFetcher");
            Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
            Intrinsics.checkNotNullParameter(pref, "pref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new InvestingMonitorDuxo_Factory(curatedListStore, curatedListItemsStore, listOrderStore, curatedListEligibleItemsFetcher, curatedListItemViewModeStore, pref, duxoBundle);
        }

        @JvmStatic
        public final InvestingMonitorDuxo newInstance(CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, ListsOrderStore listOrderStore, CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher, CuratedListItemViewModeStore curatedListItemViewModeStore, EnumPreference<InvestingMonitorViewMode> pref, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(listOrderStore, "listOrderStore");
            Intrinsics.checkNotNullParameter(curatedListEligibleItemsFetcher, "curatedListEligibleItemsFetcher");
            Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
            Intrinsics.checkNotNullParameter(pref, "pref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new InvestingMonitorDuxo(curatedListStore, curatedListItemsStore, listOrderStore, curatedListEligibleItemsFetcher, curatedListItemViewModeStore, pref, duxoBundle);
        }
    }
}
