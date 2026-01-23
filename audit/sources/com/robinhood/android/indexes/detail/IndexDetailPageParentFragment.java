package com.robinhood.android.indexes.detail;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.charts.BentoExtensions;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.detail.IndexDetailPageFragment;
import com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment;
import com.robinhood.android.indexes.models.api.ApiIndexRequest;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: IndexDetailPageParentFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00018B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020&2\u0006\u00100\u001a\u000201H\u0016J\t\u00102\u001a\u00020\u001aH\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/IndexDetailPageParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarFragment$Callbacks;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "getIndexStore", "()Lcom/robinhood/android/indexes/store/IndexStore;", "setIndexStore", "(Lcom/robinhood/android/indexes/store/IndexStore;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "bodyFragment", "Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment;", "getBodyFragment", "()Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPageDirectionUpdated", "pageDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "onTradeBarHeightUpdated", "newHeight", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageParentFragment extends BaseFragment implements IndexDetailPageTradeBarFragment.Callbacks, IndexDetailPageFragment.Callbacks, RegionGated {
    public static final String TAG_IDP_BODY = "TAG_IDP_BODY";
    public static final String TAG_IDP_TRADE_BAR = "TAG_IDP_TRADE_BAR";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AccountProvider accountProvider;
    private final boolean excludeFromAnalyticsLogging;
    public ExperimentsStore experimentsStore;
    private final boolean hasBottomBar;
    public IndexStore indexStore;
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public IndexDetailPageParentFragment() {
        super(C18813R.layout.fragment_index_detail_page_parent);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.hasBottomBar = true;
        this.excludeFromAnalyticsLogging = true;
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

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final IndexStore getIndexStore() {
        IndexStore indexStore = this.indexStore;
        if (indexStore != null) {
            return indexStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("indexStore");
        return null;
    }

    public final void setIndexStore(IndexStore indexStore) {
        Intrinsics.checkNotNullParameter(indexStore, "<set-?>");
        this.indexStore = indexStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    private final IndexDetailPageFragment getBodyFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(TAG_IDP_BODY);
        Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.robinhood.android.indexes.detail.IndexDetailPageFragment");
        return (IndexDetailPageFragment) fragmentFindFragmentByTag;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C188121(null), 3, null);
        }
    }

    /* compiled from: IndexDetailPageParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.IndexDetailPageParentFragment$onCreate$1", m3645f = "IndexDetailPageParentFragment.kt", m3646l = {107, 62}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageParentFragment$onCreate$1 */
    static final class C188121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C188121(Continuation<? super C188121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageParentFragment.this.new C188121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (r6 == r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String initialAccountNumber;
            UUID indexId;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                initialAccountNumber = ((IndexDetailPageFragmentKey) IndexDetailPageParentFragment.INSTANCE.getArgs((Fragment) IndexDetailPageParentFragment.this)).getInitialAccountNumber();
                if (initialAccountNumber == null) {
                    Single<Optional<String>> individualAccountNumber = IndexDetailPageParentFragment.this.getAccountProvider().getIndividualAccountNumber();
                    this.label = 1;
                    obj = RxAwait3.await(individualAccountNumber, this);
                } else {
                    Companion companion = IndexDetailPageParentFragment.INSTANCE;
                    indexId = ((IndexDetailPageFragmentKey) companion.getArgs((Fragment) IndexDetailPageParentFragment.this)).getIndexId();
                    if (indexId == null) {
                        String symbol = ((IndexDetailPageFragmentKey) companion.getArgs((Fragment) IndexDetailPageParentFragment.this)).getSymbol();
                        if (symbol == null) {
                            throw new IllegalStateException("One of indexId or symbol must be provided.");
                        }
                        IndexStore indexStore = IndexDetailPageParentFragment.this.getIndexStore();
                        ApiIndexRequest.BySymbol bySymbol = new ApiIndexRequest.BySymbol(symbol);
                        this.L$0 = initialAccountNumber;
                        this.label = 2;
                        Object index = indexStore.getIndex(bySymbol, this);
                        if (index != coroutine_suspended) {
                            str = initialAccountNumber;
                            obj = index;
                            indexId = ((Index) obj).getId();
                            initialAccountNumber = str;
                        }
                    }
                    if (initialAccountNumber != null) {
                    }
                    IndexDetailPageParentFragment.this.getChildFragmentManager().beginTransaction().add(C18813R.id.body_fragment, (IndexDetailPageFragment) IndexDetailPageFragment.INSTANCE.newInstance((Parcelable) new IndexDetailPageFragment.Args(indexId, ((IndexDetailPageFragmentKey) IndexDetailPageParentFragment.INSTANCE.getArgs((Fragment) IndexDetailPageParentFragment.this)).getSource())), IndexDetailPageParentFragment.TAG_IDP_BODY).commit();
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                indexId = ((Index) obj).getId();
                initialAccountNumber = str;
                if (initialAccountNumber != null) {
                    IndexDetailPageParentFragment.this.getChildFragmentManager().beginTransaction().add(C18813R.id.trade_bar_fragment, (IndexDetailPageTradeBarFragment) IndexDetailPageTradeBarFragment.INSTANCE.newInstance((Parcelable) new IndexDetailPageTradeBarFragment.Args(indexId, ((IndexDetailPageFragmentKey) IndexDetailPageParentFragment.INSTANCE.getArgs((Fragment) IndexDetailPageParentFragment.this)).getSource(), initialAccountNumber)), IndexDetailPageParentFragment.TAG_IDP_TRADE_BAR).commit();
                }
                IndexDetailPageParentFragment.this.getChildFragmentManager().beginTransaction().add(C18813R.id.body_fragment, (IndexDetailPageFragment) IndexDetailPageFragment.INSTANCE.newInstance((Parcelable) new IndexDetailPageFragment.Args(indexId, ((IndexDetailPageFragmentKey) IndexDetailPageParentFragment.INSTANCE.getArgs((Fragment) IndexDetailPageParentFragment.this)).getSource())), IndexDetailPageParentFragment.TAG_IDP_BODY).commit();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            initialAccountNumber = (String) ((Optional) obj).getOrNull();
            Companion companion2 = IndexDetailPageParentFragment.INSTANCE;
            indexId = ((IndexDetailPageFragmentKey) companion2.getArgs((Fragment) IndexDetailPageParentFragment.this)).getIndexId();
            if (indexId == null) {
            }
            if (initialAccountNumber != null) {
            }
            IndexDetailPageParentFragment.this.getChildFragmentManager().beginTransaction().add(C18813R.id.body_fragment, (IndexDetailPageFragment) IndexDetailPageFragment.INSTANCE.newInstance((Parcelable) new IndexDetailPageFragment.Args(indexId, ((IndexDetailPageFragmentKey) IndexDetailPageParentFragment.INSTANCE.getArgs((Fragment) IndexDetailPageParentFragment.this)).getSource())), IndexDetailPageParentFragment.TAG_IDP_BODY).commit();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.indexes.detail.IndexDetailPageFragment.Callbacks
    public void onPageDirectionUpdated(Direction pageDirection) {
        Intrinsics.checkNotNullParameter(pageDirection, "pageDirection");
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(viewRequireView), BentoExtensions.getOverlay(pageDirection), null, 2, null);
    }

    @Override // com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment.Callbacks
    public void onTradeBarHeightUpdated(int newHeight) {
        getBodyFragment().onTradeBarHeightUpdated(newHeight);
    }

    /* compiled from: IndexDetailPageParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/IndexDetailPageParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageParentFragment;", "Lcom/robinhood/android/indexes/contracts/IndexDetailPageFragmentKey;", "<init>", "()V", IndexDetailPageParentFragment.TAG_IDP_BODY, "", IndexDetailPageParentFragment.TAG_IDP_TRADE_BAR, "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<IndexDetailPageParentFragment, IndexDetailPageFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(IndexDetailPageFragmentKey indexDetailPageFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, indexDetailPageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public IndexDetailPageFragmentKey getArgs(IndexDetailPageParentFragment indexDetailPageParentFragment) {
            return (IndexDetailPageFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, indexDetailPageParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IndexDetailPageParentFragment newInstance(IndexDetailPageFragmentKey indexDetailPageFragmentKey) {
            return (IndexDetailPageParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, indexDetailPageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IndexDetailPageParentFragment indexDetailPageParentFragment, IndexDetailPageFragmentKey indexDetailPageFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, indexDetailPageParentFragment, indexDetailPageFragmentKey);
        }
    }
}
