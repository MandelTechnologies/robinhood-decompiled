package com.robinhood.android.account.p060ui.documents;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.overview.databinding.FragmentRhyStatementsBinding;
import com.robinhood.android.account.p060ui.documents.RhyStatementsAdapter;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Document;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyStatementsFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0014J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u000203H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/account/ui/documents/RhyStatementsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/account/ui/documents/RhyStatementsAdapter$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/account/ui/documents/RhyStatementsDuxo;", "getDuxo", "()Lcom/robinhood/android/account/ui/documents/RhyStatementsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/account/overview/databinding/FragmentRhyStatementsBinding;", "getBinding", "()Lcom/robinhood/android/account/overview/databinding/FragmentRhyStatementsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "statementsAdapter", "Lcom/robinhood/android/account/ui/documents/RhyStatementsAdapter;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "bind", "state", "Lcom/robinhood/android/account/ui/documents/RhyStatementsViewState;", "onStatementClicked", "document", "Lcom/robinhood/models/db/Document;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "Companion", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class RhyStatementsFragment extends BaseFragment implements RhyStatementsAdapter.Callbacks {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final String screenName;
    private final RhyStatementsAdapter statementsAdapter;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyStatementsFragment.class, "binding", "getBinding()Lcom/robinhood/android/account/overview/databinding/FragmentRhyStatementsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RhyStatementsFragment() {
        super(C8159R.layout.fragment_rhy_statements);
        this.duxo = OldDuxos.oldDuxo(this, RhyStatementsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RhyStatementsFragment2.INSTANCE);
        this.statementsAdapter = new RhyStatementsAdapter(this);
        this.screenName = "SPENDING_STATEMENTS_LIST";
        this.useDesignSystemToolbar = true;
    }

    private final RhyStatementsDuxo getDuxo() {
        return (RhyStatementsDuxo) this.duxo.getValue();
    }

    private final FragmentRhyStatementsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyStatementsBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
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
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C8159R.string.spending_account_statements_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C82421(this));
    }

    /* compiled from: RhyStatementsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.ui.documents.RhyStatementsFragment$onResume$1 */
    /* synthetic */ class C82421 extends FunctionReferenceImpl implements Function1<RhyStatementsViewState, Unit> {
        C82421(Object obj) {
            super(1, obj, RhyStatementsFragment.class, "bind", "bind(Lcom/robinhood/android/account/ui/documents/RhyStatementsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhyStatementsViewState rhyStatementsViewState) throws Throwable {
            invoke2(rhyStatementsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhyStatementsViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhyStatementsFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(RhyStatementsViewState state) throws Throwable {
        Throwable thConsume;
        if (state.getShowPlaceholder()) {
            RecyclerView statementsRecyclerView = getBinding().statementsRecyclerView;
            Intrinsics.checkNotNullExpressionValue(statementsRecyclerView, "statementsRecyclerView");
            bindAdapter(statementsRecyclerView, new RhyStatementsPlaceholderAdapter());
        } else if (state.getShowEmptyState()) {
            RecyclerView statementsRecyclerView2 = getBinding().statementsRecyclerView;
            Intrinsics.checkNotNullExpressionValue(statementsRecyclerView2, "statementsRecyclerView");
            statementsRecyclerView2.setVisibility(8);
            RhTextView noStatementsMessage = getBinding().noStatementsMessage;
            Intrinsics.checkNotNullExpressionValue(noStatementsMessage, "noStatementsMessage");
            noStatementsMessage.setVisibility(0);
        } else {
            RhTextView noStatementsMessage2 = getBinding().noStatementsMessage;
            Intrinsics.checkNotNullExpressionValue(noStatementsMessage2, "noStatementsMessage");
            noStatementsMessage2.setVisibility(8);
            RecyclerView statementsRecyclerView3 = getBinding().statementsRecyclerView;
            Intrinsics.checkNotNullExpressionValue(statementsRecyclerView3, "statementsRecyclerView");
            statementsRecyclerView3.setVisibility(0);
            RecyclerView statementsRecyclerView4 = getBinding().statementsRecyclerView;
            Intrinsics.checkNotNullExpressionValue(statementsRecyclerView4, "statementsRecyclerView");
            bindAdapter(statementsRecyclerView4, this.statementsAdapter);
            this.statementsAdapter.submitList(state.getDocuments());
        }
        UiEvent<Throwable> uiError = state.getUiError();
        if (uiError == null || (thConsume = uiError.consume()) == null) {
            return;
        }
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, thConsume, true, false, 0, null, 56, null);
    }

    @Override // com.robinhood.android.account.ui.documents.RhyStatementsAdapter.Callbacks
    public void onStatementClicked(Document document) {
        Intrinsics.checkNotNullParameter(document, "document");
        Navigator.DefaultImpls.startActivity$default(getNavigator(), requireBaseActivity(), new DocumentDownloadKey(document, DocumentDownloadLaunchMode.OPEN, null, false, 12, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C11048R.menu.menu_info, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C11048R.id.action_info) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder message = companion.create(contextRequireContext).setTitle(C8159R.string.spending_account_statements_title, new Object[0]).setMessage(C8159R.string.documents_rhy_account_statement_summary, new Object[0]);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, parentFragmentManager, SduiFeatureDiscovery3.INFO_TAG, false, 4, null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* compiled from: RhyStatementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/account/ui/documents/RhyStatementsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyStatements;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.RhyStatements> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyStatements key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new RhyStatementsFragment();
        }
    }
}
