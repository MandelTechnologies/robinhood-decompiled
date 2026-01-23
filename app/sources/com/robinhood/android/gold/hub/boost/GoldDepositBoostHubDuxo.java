package com.robinhood.android.gold.hub.boost;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState;
import com.robinhood.android.gold.lib.hub.api.ApiDepositBoostHub;
import com.robinhood.android.gold.lib.hub.api.GoldSegmentedControl;
import com.robinhood.android.gold.lib.hub.store.GoldHubStore;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferAmountPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferIdPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferTimestampPref;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;

/* compiled from: GoldDepositBoostHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "goldHubStore", "Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "goldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "currentTab", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostTab;", "onStart", "", "updateStateWithHistoryPager", "goldDepositBoost", "Lcom/robinhood/android/gold/lib/hub/api/ApiDepositBoostHub;", "showSegmentedControl", "", "tab", "setInitialTab", "switchTab", "newTabIndex", "", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldDepositBoostHubDuxo extends BaseDuxo4<GoldDepositBoostHubViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private GoldDepositBoostTab currentTab;
    private final StringPreference goldDepositBoostTransferAmountPref;
    private final StringPreference goldDepositBoostTransferIdPref;
    private final StringPreference goldDepositBoostTransferTimestampPref;
    private final GoldHubStore goldHubStore;
    private final HistoryStore historyStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldDepositBoostHubDuxo(AccountProvider accountProvider, GoldHubStore goldHubStore, HistoryStore historyStore, @GoldDepositBoostTransferIdPref StringPreference goldDepositBoostTransferIdPref, @GoldDepositBoostTransferAmountPref StringPreference goldDepositBoostTransferAmountPref, @GoldDepositBoostTransferTimestampPref StringPreference goldDepositBoostTransferTimestampPref, DuxoBundle duxoBundle) {
        super(GoldDepositBoostHubViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.goldHubStore = goldHubStore;
        this.historyStore = historyStore;
        this.goldDepositBoostTransferIdPref = goldDepositBoostTransferIdPref;
        this.goldDepositBoostTransferAmountPref = goldDepositBoostTransferAmountPref;
        this.goldDepositBoostTransferTimestampPref = goldDepositBoostTransferTimestampPref;
        this.currentTab = GoldDepositBoostTab.INDIVIDUAL;
    }

    /* compiled from: GoldDepositBoostHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo$onStart$1", m3645f = "GoldDepositBoostHubDuxo.kt", m3646l = {51, 56}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo$onStart$1 */
    static final class C177991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C177991(Continuation<? super C177991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldDepositBoostHubDuxo.this.new C177991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C177991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        
            if (r0 == r6) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objFetchGoldDepositBoostHub$default;
            Object objFetchGoldDepositBoostHub;
            ApiDepositBoostHub apiDepositBoostHub;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = GoldDepositBoostHubDuxo.this.goldDepositBoostTransferTimestampPref.get();
                    Instant instant = str != null ? Instant.parse(str) : null;
                    if (instant == null || !instant.plusSeconds(3600L).isAfter(Instant.now())) {
                        GoldHubStore goldHubStore = GoldDepositBoostHubDuxo.this.goldHubStore;
                        this.label = 2;
                        objFetchGoldDepositBoostHub$default = GoldHubStore.fetchGoldDepositBoostHub$default(goldHubStore, null, null, this, 3, null);
                    } else {
                        String str2 = GoldDepositBoostHubDuxo.this.goldDepositBoostTransferIdPref.get();
                        String str3 = GoldDepositBoostHubDuxo.this.goldDepositBoostTransferAmountPref.get();
                        GoldHubStore goldHubStore2 = GoldDepositBoostHubDuxo.this.goldHubStore;
                        this.label = 1;
                        objFetchGoldDepositBoostHub = goldHubStore2.fetchGoldDepositBoostHub(str2, str3, this);
                        if (objFetchGoldDepositBoostHub == coroutine_suspended) {
                        }
                        apiDepositBoostHub = (ApiDepositBoostHub) objFetchGoldDepositBoostHub;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    objFetchGoldDepositBoostHub = obj;
                    apiDepositBoostHub = (ApiDepositBoostHub) objFetchGoldDepositBoostHub;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objFetchGoldDepositBoostHub$default = obj;
                    apiDepositBoostHub = (ApiDepositBoostHub) objFetchGoldDepositBoostHub$default;
                }
                ApiDepositBoostHub apiDepositBoostHub2 = apiDepositBoostHub;
                GoldDepositBoostHubViewState.Loaded loaded = new GoldDepositBoostHubViewState.Loaded(apiDepositBoostHub2, null, GoldDepositBoostHubDuxo.this.currentTab, 2, null);
                GoldDepositBoostHubDuxo.this.applyMutation(new AnonymousClass1(loaded, null));
                GoldDepositBoostHubDuxo.this.updateStateWithHistoryPager(apiDepositBoostHub2, loaded.getShowSegmentedControl(), loaded.getCurrentTab());
            } catch (Throwable th) {
                GoldDepositBoostHubDuxo.this.applyMutation(new AnonymousClass2(th, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: GoldDepositBoostHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo$onStart$1$1", m3645f = "GoldDepositBoostHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldDepositBoostHubViewState, Continuation<? super GoldDepositBoostHubViewState>, Object> {
            final /* synthetic */ GoldDepositBoostHubViewState.Loaded $viewState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GoldDepositBoostHubViewState.Loaded loaded, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$viewState = loaded;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$viewState, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldDepositBoostHubViewState goldDepositBoostHubViewState, Continuation<? super GoldDepositBoostHubViewState> continuation) {
                return ((AnonymousClass1) create(goldDepositBoostHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.$viewState;
            }
        }

        /* compiled from: GoldDepositBoostHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo$onStart$1$2", m3645f = "GoldDepositBoostHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GoldDepositBoostHubViewState, Continuation<? super GoldDepositBoostHubViewState>, Object> {

            /* renamed from: $t */
            final /* synthetic */ Throwable f4170$t;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f4170$t = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.f4170$t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldDepositBoostHubViewState goldDepositBoostHubViewState, Continuation<? super GoldDepositBoostHubViewState> continuation) {
                return ((AnonymousClass2) create(goldDepositBoostHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new GoldDepositBoostHubViewState.Error(this.f4170$t);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C177991(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateStateWithHistoryPager(ApiDepositBoostHub goldDepositBoost, boolean showSegmentedControl, GoldDepositBoostTab tab) {
        GoldDepositBoostTab goldDepositBoostTab;
        List<GoldSegmentedControl> segmentedControl;
        GoldSegmentedControl goldSegmentedControl;
        String rhsAccountNumber;
        final HistoryStaticFilter.RhsAccountContext rhsAccountContext;
        GoldDepositBoostTab goldDepositBoostTab2;
        GoldSegmentedControl goldSegmentedControl2;
        String rhsAccountNumber2;
        if (showSegmentedControl && tab == (goldDepositBoostTab2 = GoldDepositBoostTab.INDIVIDUAL)) {
            List<GoldSegmentedControl> segmentedControl2 = goldDepositBoost.getSegmentedControl();
            if (segmentedControl2 != null && (goldSegmentedControl2 = segmentedControl2.get(goldDepositBoostTab2.getIndex())) != null && (rhsAccountNumber2 = goldSegmentedControl2.getRhsAccountNumber()) != null) {
                rhsAccountContext = new HistoryStaticFilter.RhsAccountContext(rhsAccountNumber2, BrokerageAccountType.INDIVIDUAL);
            }
        } else {
            rhsAccountContext = (!showSegmentedControl || tab != (goldDepositBoostTab = GoldDepositBoostTab.JOINT) || (segmentedControl = goldDepositBoost.getSegmentedControl()) == null || (goldSegmentedControl = segmentedControl.get(goldDepositBoostTab.getIndex())) == null || (rhsAccountNumber = goldSegmentedControl.getRhsAccountNumber()) == null) ? null : new HistoryStaticFilter.RhsAccountContext(rhsAccountNumber, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
        }
        Observable<R> map = this.accountProvider.streamAllSelfDirectedAccounts().distinctUntilChanged().map(new Function() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo.updateStateWithHistoryPager.1
            @Override // io.reactivex.functions.Function
            public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> apply(List<Account> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                HistoryStore historyStore = GoldDepositBoostHubDuxo.this.historyStore;
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                Observable observableJust2 = Observable.just(HistoryFilter.GOLD_DEPOSIT_BOOST.getTransactionTypes());
                Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
                HistoryStaticFilter.RhsAccountContext rhsAccountContext2 = rhsAccountContext;
                Boolean bool = Boolean.TRUE;
                return HistoryStore.buildPager$default(historyStore, observableJust, observableJust2, null, null, new HistoryStaticFilter(null, rhsAccountContext2, null, null, null, null, null, null, bool, bool, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null), new PagingConfig(2, 0, false, 0, 0, 0, 62, null), 12, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldDepositBoostHubDuxo.updateStateWithHistoryPager$lambda$2(this.f$0, (Pager) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateStateWithHistoryPager$lambda$2(GoldDepositBoostHubDuxo goldDepositBoostHubDuxo, Pager pager) {
        goldDepositBoostHubDuxo.applyMutation(new GoldDepositBoostHubDuxo3(pager, null));
        return Unit.INSTANCE;
    }

    public final void setInitialTab(GoldDepositBoostTab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.currentTab = tab;
    }

    public final void switchTab(int newTabIndex) {
        GoldDepositBoostTab goldDepositBoostTabFromInt = GoldDepositBoostTab.INSTANCE.fromInt(newTabIndex);
        this.currentTab = goldDepositBoostTabFromInt;
        GoldDepositBoostHubViewState value = getStateFlow().getValue();
        if (value instanceof GoldDepositBoostHubViewState.Loaded) {
            applyMutation(new GoldDepositBoostHubDuxo2(value, goldDepositBoostTabFromInt, null));
            updateStateWithHistoryPager(((GoldDepositBoostHubViewState.Loaded) value).getGoldDepositBoost(), true, goldDepositBoostTabFromInt);
        }
    }
}
