package com.robinhood.android.history.p153ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.common.OptionInstruments;
import com.robinhood.common.strings.UiOptionCorporateActions;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionCorporateActionStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionCorporateAction;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.UiOptionCorporateAction;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.LocalDate;

/* compiled from: OptionsCorporateActionDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 82\u00020\u0001:\u00045678B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020/H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0012\u0010(\u001a\u00060)R\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "optionCorporateActionStore", "Lcom/robinhood/librobinhood/data/store/OptionCorporateActionStore;", "getOptionCorporateActionStore", "()Lcom/robinhood/librobinhood/data/store/OptionCorporateActionStore;", "setOptionCorporateActionStore", "(Lcom/robinhood/librobinhood/data/store/OptionCorporateActionStore;)V", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "getOptionChainStore", "()Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "setOptionChainStore", "(Lcom/robinhood/librobinhood/data/store/OptionChainStore;)V", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "getOptionInstrumentStore", "()Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "setOptionInstrumentStore", "(Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "corporateActionId", "Ljava/util/UUID;", "getCorporateActionId", "()Ljava/util/UUID;", "corporateActionId$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$Adapter;", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Adapter", "ViewHolder", "RowItem", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class OptionsCorporateActionDetailFragment extends BaseDetailFragment {
    private static final String EXTRA_CORPORATE_ACTION_ID = "extraCorporateActionId";
    private static final int VIEW_TYPE_DELTA = 2;
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_HEADER_TOP = 3;
    private static final int VIEW_TYPE_ITEM = 1;
    public AccountProvider accountProvider;
    private Adapter adapter;

    /* renamed from: corporateActionId$delegate, reason: from kotlin metadata */
    private final Lazy corporateActionId;
    public OptionChainStore optionChainStore;
    public OptionCorporateActionStore optionCorporateActionStore;
    public OptionInstrumentStore optionInstrumentStore;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionsCorporateActionDetailFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionsCorporateActionDetailFragment newInstance(UUID uuid) {
        return INSTANCE.newInstance(uuid);
    }

    public OptionsCorporateActionDetailFragment() {
        super(C18359R.layout.fragment_options_corporate_action);
        this.recyclerView = bindView(C18359R.id.recycler_view);
        this.corporateActionId = Fragments2.argument(this, EXTRA_CORPORATE_ACTION_ID);
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final OptionCorporateActionStore getOptionCorporateActionStore() {
        OptionCorporateActionStore optionCorporateActionStore = this.optionCorporateActionStore;
        if (optionCorporateActionStore != null) {
            return optionCorporateActionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionCorporateActionStore");
        return null;
    }

    public final void setOptionCorporateActionStore(OptionCorporateActionStore optionCorporateActionStore) {
        Intrinsics.checkNotNullParameter(optionCorporateActionStore, "<set-?>");
        this.optionCorporateActionStore = optionCorporateActionStore;
    }

    public final OptionChainStore getOptionChainStore() {
        OptionChainStore optionChainStore = this.optionChainStore;
        if (optionChainStore != null) {
            return optionChainStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionChainStore");
        return null;
    }

    public final void setOptionChainStore(OptionChainStore optionChainStore) {
        Intrinsics.checkNotNullParameter(optionChainStore, "<set-?>");
        this.optionChainStore = optionChainStore;
    }

    public final OptionInstrumentStore getOptionInstrumentStore() {
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore;
        if (optionInstrumentStore != null) {
            return optionInstrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionInstrumentStore");
        return null;
    }

    public final void setOptionInstrumentStore(OptionInstrumentStore optionInstrumentStore) {
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "<set-?>");
        this.optionInstrumentStore = optionInstrumentStore;
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[0]);
    }

    private final UUID getCorporateActionId() {
        return (UUID) this.corporateActionId.getValue();
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = getCorporateActionId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.adapter = new Adapter(this, resources);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getContext()));
        getRecyclerView().setHasFixedSize(true);
        RecyclerView recyclerView = getRecyclerView();
        Adapter adapter = this.adapter;
        if (adapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            adapter = null;
        }
        bindAdapter(recyclerView, adapter);
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<UiOptionCorporateAction> observableRefCount = getOptionCorporateActionStore().streamOptionCorporateAction(getCorporateActionId()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableSwitchMap = observableRefCount.map(new Function() { // from class: com.robinhood.android.history.ui.OptionsCorporateActionDetailFragment$onResume$accountObs$1
            @Override // io.reactivex.functions.Function
            public final String apply(UiOptionCorporateAction corpAction) {
                Intrinsics.checkNotNullParameter(corpAction, "corpAction");
                return corpAction.getOptionCorporateAction().getAccountNumber();
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.history.ui.OptionsCorporateActionDetailFragment$onResume$accountObs$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return this.this$0.getAccountProvider().streamAccount(accountNumber);
            }
        });
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableSwitchMap);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observables.combineLatest(observableRefCount, observableSwitchMap)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.OptionsCorporateActionDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsCorporateActionDetailFragment.onResume$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableSwitchMap2 = observableRefCount.map(new Function() { // from class: com.robinhood.android.history.ui.OptionsCorporateActionDetailFragment.onResume.2
            @Override // io.reactivex.functions.Function
            public final UUID apply(UiOptionCorporateAction it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionCorporateAction().getChainId();
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.history.ui.OptionsCorporateActionDetailFragment.onResume.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends String> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionsCorporateActionDetailFragment.this.getOptionChainStore().getStreamChainSymbol().asObservable(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.OptionsCorporateActionDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsCorporateActionDetailFragment.onResume$lambda$1(this.f$0, (String) obj);
            }
        });
        Observable observableSwitchMap3 = observableRefCount.map(new Function() { // from class: com.robinhood.android.history.ui.OptionsCorporateActionDetailFragment.onResume.5
            @Override // io.reactivex.functions.Function
            public final List<UUID> apply(UiOptionCorporateAction corpAction) {
                Intrinsics.checkNotNullParameter(corpAction, "corpAction");
                List<OptionCorporateAction.AffectedPosition> affectedPositions = corpAction.getAffectedPositions();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(affectedPositions, 10));
                Iterator<T> it = affectedPositions.iterator();
                while (it.hasNext()) {
                    arrayList.add(((OptionCorporateAction.AffectedPosition) it.next()).getOption());
                }
                return arrayList;
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.history.ui.OptionsCorporateActionDetailFragment.onResume.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<OptionInstrument>> apply(List<UUID> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                List<UUID> list = it;
                OptionInstrumentStore.pingOptionInstruments$default(OptionsCorporateActionDetailFragment.this.getOptionInstrumentStore(), list, false, 2, null);
                return OptionsCorporateActionDetailFragment.this.getOptionInstrumentStore().getOptionInstruments(list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.OptionsCorporateActionDetailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsCorporateActionDetailFragment.onResume$lambda$2(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(OptionsCorporateActionDetailFragment optionsCorporateActionDetailFragment, Tuples2 tuples2) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        UiOptionCorporateAction uiOptionCorporateAction = (UiOptionCorporateAction) tuples2.component1();
        Account account = (Account) tuples2.component2();
        Adapter adapter = optionsCorporateActionDetailFragment.adapter;
        if (adapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            adapter = null;
        }
        Intrinsics.checkNotNull(uiOptionCorporateAction);
        Intrinsics.checkNotNull(account);
        adapter.bind(uiOptionCorporateAction, account);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(OptionsCorporateActionDetailFragment optionsCorporateActionDetailFragment, String str) {
        optionsCorporateActionDetailFragment.getExpandedToolbarTitleTxt().setText(optionsCorporateActionDetailFragment.getString(C18359R.string.options_corporate_action_detail_title, str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(OptionsCorporateActionDetailFragment optionsCorporateActionDetailFragment, List list) {
        Adapter adapter = optionsCorporateActionDetailFragment.adapter;
        if (adapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            adapter = null;
        }
        Intrinsics.checkNotNull(list);
        adapter.bindInstruments(list);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionsCorporateActionDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0014\u0010'\u001a\u00020\"2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020 0\u001bJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*H\u0016J\u0018\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\b\u00102\u001a\u00020*H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$ViewHolder;", "res", "Landroid/content/res/Resources;", "<init>", "(Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment;Landroid/content/res/Resources;)V", "accountUsedLabel", "", "dateLabel", "stateLabel", "numContractsLabel", "numContractsLabelOld", "numContractsLabelNew", "strikePriceLabel", "strikePriceLabelOld", "strikePriceLabelNew", "expirationDateLabel", "expirationDateLabelOld", "expirationDateLabelNew", "cashComponentLabel", "cashComponentLabelOld", "cashComponentLabelNew", "multiplierLabel", "multiplierLabelOld", "multiplierLabelNew", "items", "", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem;", "instrumentsMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrument;", "bind", "", "optionCorporateAction", "Lcom/robinhood/models/ui/UiOptionCorporateAction;", "account", "Lcom/robinhood/models/db/Account;", "bindInstruments", "instruments", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "getItemCount", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public final class Adapter extends RecyclerView.Adapter<ViewHolder> {
        private final String accountUsedLabel;
        private final String cashComponentLabel;
        private final String cashComponentLabelNew;
        private final String cashComponentLabelOld;
        private final String dateLabel;
        private final String expirationDateLabel;
        private final String expirationDateLabelNew;
        private final String expirationDateLabelOld;
        private final Map<UUID, OptionInstrument> instrumentsMap;
        private List<? extends RowItem> items;
        private final String multiplierLabel;
        private final String multiplierLabelNew;
        private final String multiplierLabelOld;
        private final String numContractsLabel;
        private final String numContractsLabelNew;
        private final String numContractsLabelOld;
        private final String stateLabel;
        private final String strikePriceLabel;
        private final String strikePriceLabelNew;
        private final String strikePriceLabelOld;
        final /* synthetic */ OptionsCorporateActionDetailFragment this$0;

        public Adapter(OptionsCorporateActionDetailFragment optionsCorporateActionDetailFragment, Resources res) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(res, "res");
            this.this$0 = optionsCorporateActionDetailFragment;
            String string2 = res.getString(C18359R.string.history_account_used_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.accountUsedLabel = string2;
            String string3 = res.getString(C18359R.string.options_corporate_action_date_label);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            this.dateLabel = string3;
            String string4 = res.getString(C18359R.string.options_corporate_action_state_label);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            this.stateLabel = string4;
            String string5 = res.getString(C18359R.string.options_corporate_action_num_contracts_label);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            this.numContractsLabel = string5;
            String string6 = res.getString(C18359R.string.options_corporate_action_num_contracts_label_old);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            this.numContractsLabelOld = string6;
            String string7 = res.getString(C18359R.string.options_corporate_action_num_contracts_label_new);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            this.numContractsLabelNew = string7;
            String string8 = res.getString(C18359R.string.options_corporate_action_strike_price_label);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            this.strikePriceLabel = string8;
            String string9 = res.getString(C18359R.string.options_corporate_action_strike_price_label_old);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            this.strikePriceLabelOld = string9;
            String string10 = res.getString(C18359R.string.options_corporate_action_strike_price_label_new);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            this.strikePriceLabelNew = string10;
            String string11 = res.getString(C18359R.string.options_corporate_action_expiration_label);
            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
            this.expirationDateLabel = string11;
            String string12 = res.getString(C18359R.string.options_corporate_action_expiration_label_old);
            Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
            this.expirationDateLabelOld = string12;
            String string13 = res.getString(C18359R.string.options_corporate_action_expiration_label_new);
            Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
            this.expirationDateLabelNew = string13;
            String string14 = res.getString(C18359R.string.options_corporate_action_cash_component_label);
            Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
            this.cashComponentLabel = string14;
            String string15 = res.getString(C18359R.string.options_corporate_action_cash_component_label_old);
            Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
            this.cashComponentLabelOld = string15;
            String string16 = res.getString(C18359R.string.options_corporate_action_cash_component_label_new);
            Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
            this.cashComponentLabelNew = string16;
            String string17 = res.getString(C18359R.string.options_corporate_action_multiplier_label);
            Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
            this.multiplierLabel = string17;
            String string18 = res.getString(C18359R.string.options_corporate_action_multiplier_label_old);
            Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
            this.multiplierLabelOld = string18;
            String string19 = res.getString(C18359R.string.options_corporate_action_multiplier_label_new);
            Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
            this.multiplierLabelNew = string19;
            this.items = CollectionsKt.emptyList();
            this.instrumentsMap = new LinkedHashMap();
        }

        public final void bind(UiOptionCorporateAction optionCorporateAction, Account account) throws Resources.NotFoundException {
            Resources resources;
            Intrinsics.checkNotNullParameter(optionCorporateAction, "optionCorporateAction");
            Intrinsics.checkNotNullParameter(account, "account");
            FragmentActivity activity = this.this$0.getActivity();
            if (activity == null || (resources = activity.getResources()) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            OptionCorporateAction optionCorporateAction2 = optionCorporateAction.getOptionCorporateAction();
            String str = this.accountUsedLabel;
            StringResource title = AccountDisplayNames.getDisplayName(account).getWithAccount().getTitle();
            Resources resources2 = this.this$0.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            arrayList.add(new RowItem.Item(str, title.getText(resources2).toString()));
            arrayList.add(new RowItem.Header(UiOptionCorporateActions.getTypeString(optionCorporateAction2, resources)));
            arrayList.add(new RowItem.Item(this.dateLabel, LocalDateFormatter.MEDIUM.format((LocalDateFormatter) optionCorporateAction2.getEffectiveDate())));
            arrayList.add(new RowItem.Item(this.stateLabel, UiOptionCorporateActions.getStateString(optionCorporateAction2, resources)));
            List<OptionCorporateAction.Underlier> underliers = optionCorporateAction.getUnderliers();
            ArrayList<OptionCorporateAction.Underlier> arrayList2 = new ArrayList();
            for (Object obj : underliers) {
                OptionCorporateAction.Underlier underlier = (OptionCorporateAction.Underlier) obj;
                if (!BigDecimals7.m2977eq(underlier.getOldQuantity(), underlier.getNewQuantity())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (OptionCorporateAction.Underlier underlier2 : arrayList2) {
                String string2 = resources.getString(C18359R.string.options_corporate_action_underlier_label, underlier2.getSymbol());
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = resources.getString(C18359R.string.options_corporate_action_underlier_label_old, underlier2.getSymbol());
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String str2 = Formats.getIntegerFormat().format(underlier2.getOldQuantity());
                String string4 = resources.getString(C18359R.string.options_corporate_action_underlier_label_new, underlier2.getSymbol());
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                arrayList3.add(new RowItem.DeltaItem(string2, string3, str2, string4, Formats.getIntegerFormat().format(underlier2.getNewQuantity())));
            }
            RowItem.DeltaItem deltaItem = !BigDecimals7.m2977eq(optionCorporateAction2.getOldCashComponent(), optionCorporateAction2.getNewCashComponent()) ? new RowItem.DeltaItem(this.cashComponentLabel, this.cashComponentLabelOld, Formats.getCurrencyFormat().format(BigDecimals7.orZero(optionCorporateAction2.getOldCashComponent())), this.cashComponentLabelNew, Formats.getCurrencyFormat().format(BigDecimals7.orZero(optionCorporateAction2.getNewCashComponent()))) : null;
            RowItem.DeltaItem deltaItem2 = BigDecimals7.m2977eq(optionCorporateAction2.getOldTradeValueMultiplier(), optionCorporateAction2.getNewTradeValueMultiplier()) ? null : new RowItem.DeltaItem(this.multiplierLabel, this.multiplierLabelOld, Formats.getIntegerFormat().format(optionCorporateAction2.getOldTradeValueMultiplier()), this.multiplierLabelNew, Formats.getIntegerFormat().format(optionCorporateAction2.getNewTradeValueMultiplier()));
            for (OptionCorporateAction.AffectedPosition affectedPosition : optionCorporateAction.getAffectedPositions()) {
                arrayList.add(new RowItem.InstrumentHeader(affectedPosition.getOption()));
                if (!BigDecimals7.m2977eq(affectedPosition.getOldQuantity(), affectedPosition.getNewQuantity())) {
                    arrayList.add(new RowItem.DeltaItem(this.numContractsLabel, this.numContractsLabelOld, Formats.getIntegerFormat().format(affectedPosition.getOldQuantity()), this.numContractsLabelNew, Formats.getIntegerFormat().format(affectedPosition.getNewQuantity())));
                }
                if (!BigDecimals7.m2977eq(affectedPosition.getOldStrikePrice(), affectedPosition.getNewStrikePrice())) {
                    arrayList.add(new RowItem.DeltaItem(this.strikePriceLabel, this.strikePriceLabelOld, Formats.getIntegerFormat().format(affectedPosition.getOldStrikePrice()), this.strikePriceLabelNew, Formats.getIntegerFormat().format(affectedPosition.getNewStrikePrice())));
                }
                if (!Intrinsics.areEqual(affectedPosition.getOldExpirationDate(), affectedPosition.getNewExpirationDate())) {
                    String str3 = this.expirationDateLabel;
                    String str4 = this.expirationDateLabelOld;
                    LocalDate oldExpirationDate = affectedPosition.getOldExpirationDate();
                    LocalDateFormatter localDateFormatter = LocalDateFormatter.MEDIUM;
                    arrayList.add(new RowItem.DeltaItem(str3, str4, localDateFormatter.format((LocalDateFormatter) oldExpirationDate), this.expirationDateLabelNew, localDateFormatter.format((LocalDateFormatter) affectedPosition.getNewExpirationDate())));
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList.add((RowItem.DeltaItem) it.next());
                }
                if (deltaItem != null) {
                    arrayList.add(deltaItem);
                }
                if (deltaItem2 != null) {
                    arrayList.add(deltaItem2);
                }
            }
            this.items = arrayList;
            notifyDataSetChanged();
        }

        public final void bindInstruments(List<OptionInstrument> instruments) {
            Intrinsics.checkNotNullParameter(instruments, "instruments");
            for (OptionInstrument optionInstrument : instruments) {
                this.instrumentsMap.put(optionInstrument.getId(), optionInstrument);
            }
            int i = 0;
            for (Object obj : this.items) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((RowItem) obj) instanceof RowItem.InstrumentHeader) {
                    notifyItemChanged(i);
                }
                i = i2;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            RowItem rowItem = this.items.get(position);
            if ((rowItem instanceof RowItem.Header) || (rowItem instanceof RowItem.InstrumentHeader)) {
                return position == 0 ? 3 : 0;
            }
            if (rowItem instanceof RowItem.Item) {
                return 1;
            }
            if (rowItem instanceof RowItem.DeltaItem) {
                return 2;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            if (viewType == 0) {
                View viewInflate = layoutInflaterFrom.inflate(C13997R.layout.include_rds_section_header, parent, false);
                Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                return new ViewHolder.HeaderViewHolder((TextView) viewInflate);
            }
            if (viewType == 1) {
                View viewInflate2 = layoutInflaterFrom.inflate(C18359R.layout.row_options_corporate_action_item, parent, false);
                Intrinsics.checkNotNull(viewInflate2, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsDataRowView");
                return new ViewHolder.ItemViewHolder((RdsDataRowView) viewInflate2);
            }
            if (viewType == 2) {
                View viewInflate3 = layoutInflaterFrom.inflate(C18359R.layout.row_options_corporate_action_delta, parent, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
                return new ViewHolder.DeltaViewHolder(viewInflate3);
            }
            if (viewType == 3) {
                View viewInflate4 = layoutInflaterFrom.inflate(C13997R.layout.include_rds_section_header_top, parent, false);
                Intrinsics.checkNotNull(viewInflate4, "null cannot be cast to non-null type android.widget.TextView");
                return new ViewHolder.HeaderViewHolder((TextView) viewInflate4);
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
            throw new ExceptionsH();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(ViewHolder holder, int position) throws Resources.NotFoundException {
            String instrumentTitleString;
            Intrinsics.checkNotNullParameter(holder, "holder");
            RowItem rowItem = this.items.get(position);
            if (holder instanceof ViewHolder.HeaderViewHolder) {
                if (rowItem instanceof RowItem.Header) {
                    ((ViewHolder.HeaderViewHolder) holder).getView().setText(((RowItem.Header) rowItem).getTitle());
                    return;
                }
                if (rowItem instanceof RowItem.InstrumentHeader) {
                    ViewHolder.HeaderViewHolder headerViewHolder = (ViewHolder.HeaderViewHolder) holder;
                    TextView view = headerViewHolder.getView();
                    OptionInstrument optionInstrument = this.instrumentsMap.get(((RowItem.InstrumentHeader) rowItem).getId());
                    if (optionInstrument != null) {
                        Resources resources = headerViewHolder.getView().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        instrumentTitleString = OptionInstruments.getInstrumentTitleString(optionInstrument, resources);
                    } else {
                        instrumentTitleString = null;
                    }
                    view.setText(instrumentTitleString);
                    return;
                }
                if (!(rowItem instanceof RowItem.DeltaItem) && !(rowItem instanceof RowItem.Item)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            if (holder instanceof ViewHolder.ItemViewHolder) {
                Intrinsics.checkNotNull(rowItem, "null cannot be cast to non-null type com.robinhood.android.history.ui.OptionsCorporateActionDetailFragment.RowItem.Item");
                RowItem.Item item = (RowItem.Item) rowItem;
                ViewHolder.ItemViewHolder itemViewHolder = (ViewHolder.ItemViewHolder) holder;
                itemViewHolder.getView().setLabelText(item.getTitle());
                itemViewHolder.getView().setValueText(item.getValue());
                return;
            }
            if (!(holder instanceof ViewHolder.DeltaViewHolder)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(rowItem, "null cannot be cast to non-null type com.robinhood.android.history.ui.OptionsCorporateActionDetailFragment.RowItem.DeltaItem");
            RowItem.DeltaItem deltaItem = (RowItem.DeltaItem) rowItem;
            ViewHolder.DeltaViewHolder deltaViewHolder = (ViewHolder.DeltaViewHolder) holder;
            deltaViewHolder.getOldItem().setLabelText(deltaItem.getOldTitle());
            deltaViewHolder.getOldItem().setValueText(deltaItem.getOldValue());
            deltaViewHolder.getNewItem().setLabelText(deltaItem.getNewTitle());
            deltaViewHolder.getNewItem().setValueText(deltaItem.getNewValue());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: getItemCount */
        public int getSize() {
            return this.items.size();
        }
    }

    /* compiled from: OptionsCorporateActionDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "HeaderViewHolder", "ItemViewHolder", "DeltaViewHolder", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$ViewHolder$DeltaViewHolder;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$ViewHolder$HeaderViewHolder;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$ViewHolder$ItemViewHolder;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        public /* synthetic */ ViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        private ViewHolder(View view) {
            super(view);
        }

        /* compiled from: OptionsCorporateActionDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$ViewHolder$HeaderViewHolder;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$ViewHolder;", "view", "Landroid/widget/TextView;", "<init>", "(Landroid/widget/TextView;)V", "getView", "()Landroid/widget/TextView;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class HeaderViewHolder extends ViewHolder {
            public static final int $stable = 8;
            private final TextView view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HeaderViewHolder(TextView view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            public final TextView getView() {
                return this.view;
            }
        }

        /* compiled from: OptionsCorporateActionDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$ViewHolder$ItemViewHolder;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$ViewHolder;", "view", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "<init>", "(Lcom/robinhood/android/designsystem/row/RdsDataRowView;)V", "getView", "()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ItemViewHolder extends ViewHolder {
            public static final int $stable = 8;
            private final RdsDataRowView view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemViewHolder(RdsDataRowView view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            public final RdsDataRowView getView() {
                return this.view;
            }
        }

        /* compiled from: OptionsCorporateActionDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$ViewHolder$DeltaViewHolder;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "oldItem", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "getOldItem", "()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "newItem", "getNewItem", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DeltaViewHolder extends ViewHolder {
            public static final int $stable = 8;
            private final RdsDataRowView newItem;
            private final RdsDataRowView oldItem;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeltaViewHolder(View view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                View viewFindViewById = view.findViewById(C18359R.id.old_values);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.oldItem = (RdsDataRowView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(C18359R.id.new_values);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.newItem = (RdsDataRowView) viewFindViewById2;
            }

            public final RdsDataRowView getOldItem() {
                return this.oldItem;
            }

            public final RdsDataRowView getNewItem() {
                return this.newItem;
            }
        }
    }

    /* compiled from: OptionsCorporateActionDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem;", "", "<init>", "()V", "Header", "InstrumentHeader", "Item", "DeltaItem", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem$DeltaItem;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem$Header;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem$InstrumentHeader;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem$Item;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class RowItem {
        public static final int $stable = 0;

        public /* synthetic */ RowItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private RowItem() {
        }

        /* compiled from: OptionsCorporateActionDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem$Header;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Header extends RowItem {
            public static final int $stable = 0;
            private final String title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Header(String title) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
            }

            public final String getTitle() {
                return this.title;
            }
        }

        /* compiled from: OptionsCorporateActionDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem$InstrumentHeader;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem;", "id", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getId", "()Ljava/util/UUID;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class InstrumentHeader extends RowItem {
            public static final int $stable = 8;
            private final UUID id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InstrumentHeader(UUID id) {
                super(null);
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
            }

            public final UUID getId() {
                return this.id;
            }
        }

        /* compiled from: OptionsCorporateActionDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem$Item;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem;", "title", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getValue", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Item extends RowItem {
            public static final int $stable = 0;
            private final String title;
            private final String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Item(String title, String value) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(value, "value");
                this.title = title;
                this.value = value;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: OptionsCorporateActionDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem$DeltaItem;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$RowItem;", "legacyTitle", "", "oldTitle", "oldValue", "newTitle", "newValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLegacyTitle", "()Ljava/lang/String;", "getOldTitle", "getOldValue", "getNewTitle", "getNewValue", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DeltaItem extends RowItem {
            public static final int $stable = 0;
            private final String legacyTitle;
            private final String newTitle;
            private final String newValue;
            private final String oldTitle;
            private final String oldValue;

            public final String getLegacyTitle() {
                return this.legacyTitle;
            }

            public final String getOldTitle() {
                return this.oldTitle;
            }

            public final String getOldValue() {
                return this.oldValue;
            }

            public final String getNewTitle() {
                return this.newTitle;
            }

            public final String getNewValue() {
                return this.newValue;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeltaItem(String legacyTitle, String oldTitle, String oldValue, String newTitle, String newValue) {
                super(null);
                Intrinsics.checkNotNullParameter(legacyTitle, "legacyTitle");
                Intrinsics.checkNotNullParameter(oldTitle, "oldTitle");
                Intrinsics.checkNotNullParameter(oldValue, "oldValue");
                Intrinsics.checkNotNullParameter(newTitle, "newTitle");
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                this.legacyTitle = legacyTitle;
                this.oldTitle = oldTitle;
                this.oldValue = oldValue;
                this.newTitle = newTitle;
                this.newValue = newValue;
            }
        }
    }

    /* compiled from: OptionsCorporateActionDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment$Companion;", "", "<init>", "()V", "EXTRA_CORPORATE_ACTION_ID", "", "VIEW_TYPE_HEADER", "", "VIEW_TYPE_ITEM", "VIEW_TYPE_DELTA", "VIEW_TYPE_HEADER_TOP", "newInstance", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment;", "corpActionId", "Ljava/util/UUID;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsCorporateActionDetailFragment newInstance(UUID corpActionId) {
            Intrinsics.checkNotNullParameter(corpActionId, "corpActionId");
            OptionsCorporateActionDetailFragment optionsCorporateActionDetailFragment = new OptionsCorporateActionDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(OptionsCorporateActionDetailFragment.EXTRA_CORPORATE_ACTION_ID, corpActionId);
            optionsCorporateActionDetailFragment.setArguments(bundle);
            return optionsCorporateActionDetailFragment;
        }
    }
}
