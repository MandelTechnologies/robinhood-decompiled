package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.history.contracts.LegacyDetailType;
import com.robinhood.android.history.contracts.McDucklingTransactionFragmentKey;
import com.robinhood.android.history.p153ui.AchTransferDetailFragment;
import com.robinhood.android.history.p153ui.DividendDetailFragment;
import com.robinhood.android.history.p153ui.InstrumentSplitPaymentDetailFragment;
import com.robinhood.android.history.p153ui.LegacyAcatsTransferDetailFragment;
import com.robinhood.android.history.p153ui.LegacyStockLoanPaymentDetailFragment;
import com.robinhood.android.history.p153ui.MarginInterestChargeFragment;
import com.robinhood.android.history.p153ui.MarginSubscriptionFeeFragment;
import com.robinhood.android.history.p153ui.MarginSubscriptionFeeRefundFragment;
import com.robinhood.android.history.p153ui.MerchantRewardDetailFragment;
import com.robinhood.android.history.p153ui.NonOriginatedAchTransferDetailFragment;
import com.robinhood.android.history.p153ui.OptionsCorporateActionDetailFragment;
import com.robinhood.android.history.p153ui.OrderDetailFragment;
import com.robinhood.android.history.p153ui.RhyAchTransferDetailFragment;
import com.robinhood.android.history.p153ui.RoundupDetailFragment;
import com.robinhood.android.history.p153ui.SweepPaymentDetailFragment;
import com.robinhood.android.history.p153ui.acats.AcatsDetailFragment;
import com.robinhood.android.history.p153ui.check.CheckPaymentDetailFragment;
import com.robinhood.android.history.p153ui.detail.shim.DetailShimFragment;
import com.robinhood.android.history.p153ui.transaction.TransactionDetailFragment;
import com.robinhood.android.history.p153ui.transfer.InstantTransferDetailFragment;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.history.animation.Activitys2;
import com.robinhood.shared.history.compose.Underlying;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 W2\u00020\u0001:\u0001WB\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\u0012\u0010<\u001a\u0002092\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010?\u001a\u0002092\u0006\u0010@\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010A\u001a\u000209H\u0016J\b\u0010B\u001a\u000209H\u0016J\u0010\u0010C\u001a\u0002092\u0006\u0010D\u001a\u00020EH\u0016J\u0018\u0010F\u001a\u0002092\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0014J\u0010\u0010K\u001a\u0002092\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020NH\u0016J\u001c\u0010O\u001a\u0002092\u0006\u0010P\u001a\u00020\u001a2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010RH\u0004J\u0018\u0010S\u001a\u0002092\u0006\u0010P\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020RH\u0004J\u0018\u0010U\u001a\u0002092\u0006\u0010P\u001a\u00020\u001a2\u0006\u0010V\u001a\u00020RH\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R(\u0010-\u001a\u0004\u0018\u00010,2\b\u0010+\u001a\u0004\u0018\u00010,@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00103\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u000102@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006X"}, m3636d2 = {"Lcom/robinhood/android/history/ui/BaseDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "layoutRes", "", "<init>", "(I)V", "expandedToolbar", "Landroid/view/View;", "expandedToolbarTitleTxt", "Landroid/widget/TextView;", "getExpandedToolbarTitleTxt", "()Landroid/widget/TextView;", "setExpandedToolbarTitleTxt", "(Landroid/widget/TextView;)V", "expandedToolbarSubtitleTxt", "getExpandedToolbarSubtitleTxt", "setExpandedToolbarSubtitleTxt", "expandedToolbarIcon", "Landroid/widget/ImageView;", "getExpandedToolbarIcon", "()Landroid/widget/ImageView;", "setExpandedToolbarIcon", "(Landroid/widget/ImageView;)V", "underlying", "Lcom/robinhood/shared/history/compose/Underlying;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "revealTransitionName", "getRevealTransitionName", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "Lkotlin/Lazy;", "value", "Landroidx/core/widget/NestedScrollView;", "scrollViewForToolbarScrollAnimator", "getScrollViewForToolbarScrollAnimator", "()Landroidx/core/widget/NestedScrollView;", "setScrollViewForToolbarScrollAnimator", "(Landroidx/core/widget/NestedScrollView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerviewForToolbarScrollAnimator", "getRecyclerviewForToolbarScrollAnimator", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerviewForToolbarScrollAnimator", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onResume", "onDestroyView", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onPrepareOptionsMenu", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "setUnderlyingEquity", "symbol", "instrumentId", "Ljava/util/UUID;", "setUnderlyingCrypto", "currencyPairId", "setUnderlyingIndex", "indexId", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class BaseDetailFragment extends BaseFragment {
    private String accountNumber;
    private View expandedToolbar;
    protected ImageView expandedToolbarIcon;
    protected TextView expandedToolbarSubtitleTxt;
    protected TextView expandedToolbarTitleTxt;
    private RecyclerView recyclerviewForToolbarScrollAnimator;
    private NestedScrollView scrollViewForToolbarScrollAnimator;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private Underlying underlying;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public abstract String getRevealTransitionName();

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    public BaseDetailFragment(int i) {
        super(i);
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.history.ui.BaseDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDetailFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
    }

    protected final TextView getExpandedToolbarTitleTxt() {
        TextView textView = this.expandedToolbarTitleTxt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandedToolbarTitleTxt");
        return null;
    }

    protected final void setExpandedToolbarTitleTxt(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.expandedToolbarTitleTxt = textView;
    }

    protected final TextView getExpandedToolbarSubtitleTxt() {
        TextView textView = this.expandedToolbarSubtitleTxt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandedToolbarSubtitleTxt");
        return null;
    }

    protected final void setExpandedToolbarSubtitleTxt(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.expandedToolbarSubtitleTxt = textView;
    }

    protected final ImageView getExpandedToolbarIcon() {
        ImageView imageView = this.expandedToolbarIcon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandedToolbarIcon");
        return null;
    }

    protected final void setExpandedToolbarIcon(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.expandedToolbarIcon = imageView;
    }

    protected final String getAccountNumber() {
        return this.accountNumber;
    }

    protected final void setAccountNumber(String str) {
        this.accountNumber = str;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(BaseDetailFragment baseDetailFragment) {
        RhToolbar rhToolbar = baseDetailFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, baseDetailFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), true, false, false, (Float) null, 56, (DefaultConstructorMarker) null);
    }

    public final NestedScrollView getScrollViewForToolbarScrollAnimator() {
        return this.scrollViewForToolbarScrollAnimator;
    }

    public final void setScrollViewForToolbarScrollAnimator(NestedScrollView nestedScrollView) {
        this.scrollViewForToolbarScrollAnimator = nestedScrollView;
        if (nestedScrollView != null) {
            getToolbarScrollAnimator().subscribe(nestedScrollView, this);
        }
    }

    public final RecyclerView getRecyclerviewForToolbarScrollAnimator() {
        return this.recyclerviewForToolbarScrollAnimator;
    }

    public final void setRecyclerviewForToolbarScrollAnimator(RecyclerView recyclerView) {
        this.recyclerviewForToolbarScrollAnimator = recyclerView;
        if (recyclerView != null) {
            ToolbarScrollAnimator.subscribe$default(getToolbarScrollAnimator(), recyclerView, this, null, 4, null);
        }
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        if (getUseDesignSystemToolbar()) {
            i = C11048R.layout.include_detail_expanded_design_system_toolbar;
        } else {
            i = C11048R.layout.include_detail_expanded_toolbar;
        }
        View viewInflate = ViewGroups.inflate(rhToolbar, i, false);
        this.expandedToolbar = viewInflate;
        View view2 = null;
        if (viewInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandedToolbar");
            viewInflate = null;
        }
        rhToolbar.addView(viewInflate);
        View view3 = this.expandedToolbar;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandedToolbar");
            view3 = null;
        }
        setExpandedToolbarTitleTxt((TextView) view3.findViewById(C11048R.id.expanded_toolbar_title_txt));
        View view4 = this.expandedToolbar;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandedToolbar");
            view4 = null;
        }
        setExpandedToolbarSubtitleTxt((TextView) view4.findViewById(C11048R.id.expanded_toolbar_subtitle_txt));
        View view5 = this.expandedToolbar;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandedToolbar");
        } else {
            view2 = view5;
        }
        setExpandedToolbarIcon((ImageView) view2.findViewById(C11048R.id.expanded_toolbar_icon));
        Object parent = rhToolbar.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        Activitys2.setListItemToDetailViewTransition(baseActivity, (View) parent, getRevealTransitionName(), rhToolbar.getId(), ThemeColors.getThemeColor(baseActivity, C20690R.attr.colorPrimary));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        NestedScrollView nestedScrollView = this.scrollViewForToolbarScrollAnimator;
        if (nestedScrollView != null) {
            getToolbarScrollAnimator().dispatchScroll(nestedScrollView);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        View view = this.expandedToolbar;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandedToolbar");
            view = null;
        }
        rhToolbar.removeView(view);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C18359R.menu.menu_history_detail, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(C18359R.id.action_history_detail_view_symbol);
        Underlying underlying = this.underlying;
        if ((underlying != null ? underlying.getSymbol() : null) == null) {
            menuItemFindItem.setVisible(false);
        } else {
            menuItemFindItem.setVisible(true);
            menuItemFindItem.setTitle(getString(C18359R.string.history_detail_menu_item_title_view_symbol, underlying.getSymbol()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C18359R.id.action_history_detail_view_symbol) {
            Underlying underlying = this.underlying;
            FragmentKey fragmentKey = underlying != null ? underlying.toFragmentKey(this.accountNumber) : null;
            if (fragmentKey == null) {
                return true;
            }
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static /* synthetic */ void setUnderlyingEquity$default(BaseDetailFragment baseDetailFragment, String str, UUID uuid, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUnderlyingEquity");
        }
        if ((i & 2) != 0) {
            uuid = null;
        }
        baseDetailFragment.setUnderlyingEquity(str, uuid);
    }

    protected final void setUnderlyingEquity(String symbol, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.underlying = new Underlying.Equity(symbol, instrumentId);
        requireActivity().invalidateOptionsMenu();
    }

    protected final void setUnderlyingCrypto(String symbol, UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        this.underlying = new Underlying.Crypto(symbol, currencyPairId);
        requireActivity().invalidateOptionsMenu();
    }

    protected final void setUnderlyingIndex(String symbol, UUID indexId) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        this.underlying = new Underlying.Index(symbol, indexId);
        requireActivity().invalidateOptionsMenu();
    }

    /* compiled from: BaseDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/history/ui/BaseDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/history/contracts/LegacyDetailFragmentKey;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyDetailFragmentKey> {

        /* compiled from: BaseDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LegacyDetailType.values().length];
                try {
                    iArr[LegacyDetailType.ACH_TRANSFER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LegacyDetailType.DIVIDEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LegacyDetailType.CHECK_PAYMENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LegacyDetailType.MARGIN_INTEREST_CHARGE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[LegacyDetailType.MARGIN_SUBSCRIPTION_FEE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[LegacyDetailType.MARGIN_SUBSCRIPTION_FEE_REFUND.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[LegacyDetailType.NON_ORIGINATED_ACH_TRANSFER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[LegacyDetailType.ORDER.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[LegacyDetailType.INTEREST.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[LegacyDetailType.ACATS_TRANSFER.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[LegacyDetailType.LEGACY_ACATS_TRANSFER.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[LegacyDetailType.OPTION_CORPORATE_ACTION.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[LegacyDetailType.SWEEP_PAYMENT.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[LegacyDetailType.INSTRUMENT_SPLIT_PAYMENT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[LegacyDetailType.ROUNDUP_REWARD.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[LegacyDetailType.MERCHANT_REWARD.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[LegacyDetailType.RHY_ACH_TRANSFER.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[LegacyDetailType.DEBIT_CARD_TRANSFER.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[LegacyDetailType.INSTANT_BANK_TRANSFER.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[LegacyDetailType.PAYMENT_HUB.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[LegacyDetailType.CHECK_TRANSFER.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[LegacyDetailType.WIRE_TRANSFER.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[LegacyDetailType.OUTGOING_WIRE_TRANSFER.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[LegacyDetailType.INTERNAL.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[LegacyDetailType.UK_OPEN_BANKING_TRANSFER.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyDetailFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            switch (WhenMappings.$EnumSwitchMapping$0[key.getType().ordinal()]) {
                case 1:
                    AchTransferDetailFragment.Companion companion = AchTransferDetailFragment.INSTANCE;
                    UUID uuid = key.getUuid();
                    Intrinsics.checkNotNull(uuid);
                    return companion.newInstance((Parcelable) new AchTransferDetailFragment.Args(uuid));
                case 2:
                    DividendDetailFragment.Companion companion2 = DividendDetailFragment.INSTANCE;
                    UUID uuid2 = key.getUuid();
                    Intrinsics.checkNotNull(uuid2);
                    return companion2.newInstance((Parcelable) new DividendDetailFragment.Args(uuid2));
                case 3:
                    CheckPaymentDetailFragment.Companion companion3 = CheckPaymentDetailFragment.INSTANCE;
                    UUID uuid3 = key.getUuid();
                    Intrinsics.checkNotNull(uuid3);
                    return companion3.newInstance((Parcelable) new LegacyFragmentKey.CheckPaymentDetail(uuid3));
                case 4:
                    MarginInterestChargeFragment.Companion companion4 = MarginInterestChargeFragment.INSTANCE;
                    UUID uuid4 = key.getUuid();
                    Intrinsics.checkNotNull(uuid4);
                    return companion4.newInstance(uuid4);
                case 5:
                    MarginSubscriptionFeeFragment.Companion companion5 = MarginSubscriptionFeeFragment.INSTANCE;
                    UUID uuid5 = key.getUuid();
                    Intrinsics.checkNotNull(uuid5);
                    return companion5.newInstance(uuid5);
                case 6:
                    MarginSubscriptionFeeRefundFragment.Companion companion6 = MarginSubscriptionFeeRefundFragment.INSTANCE;
                    UUID uuid6 = key.getUuid();
                    Intrinsics.checkNotNull(uuid6);
                    return companion6.newInstance(uuid6);
                case 7:
                    NonOriginatedAchTransferDetailFragment.Companion companion7 = NonOriginatedAchTransferDetailFragment.INSTANCE;
                    UUID uuid7 = key.getUuid();
                    Intrinsics.checkNotNull(uuid7);
                    return companion7.newInstance((Parcelable) new NonOriginatedAchTransferDetailFragment.Args(uuid7));
                case 8:
                    OrderDetailFragment.Companion companion8 = OrderDetailFragment.INSTANCE;
                    UUID uuid8 = key.getUuid();
                    Intrinsics.checkNotNull(uuid8);
                    return companion8.newInstance((Parcelable) new OrderDetailArgs(uuid8));
                case 9:
                    LegacyStockLoanPaymentDetailFragment.Companion companion9 = LegacyStockLoanPaymentDetailFragment.INSTANCE;
                    UUID uuid9 = key.getUuid();
                    Intrinsics.checkNotNull(uuid9);
                    return companion9.newInstance(uuid9);
                case 10:
                    AcatsDetailFragment.Companion companion10 = AcatsDetailFragment.INSTANCE;
                    UUID uuid10 = key.getUuid();
                    Intrinsics.checkNotNull(uuid10);
                    return companion10.newInstance((Parcelable) new AcatsDetailFragment.Args.AcatsIn(uuid10));
                case 11:
                    LegacyAcatsTransferDetailFragment.Companion companion11 = LegacyAcatsTransferDetailFragment.INSTANCE;
                    UUID uuid11 = key.getUuid();
                    Intrinsics.checkNotNull(uuid11);
                    return companion11.newInstance(uuid11);
                case 12:
                    OptionsCorporateActionDetailFragment.Companion companion12 = OptionsCorporateActionDetailFragment.INSTANCE;
                    UUID uuid12 = key.getUuid();
                    Intrinsics.checkNotNull(uuid12);
                    return companion12.newInstance(uuid12);
                case 13:
                    SweepPaymentDetailFragment.Companion companion13 = SweepPaymentDetailFragment.INSTANCE;
                    UUID uuid13 = key.getUuid();
                    Intrinsics.checkNotNull(uuid13);
                    return companion13.newInstance(uuid13);
                case 14:
                    InstrumentSplitPaymentDetailFragment.Companion companion14 = InstrumentSplitPaymentDetailFragment.INSTANCE;
                    UUID uuid14 = key.getUuid();
                    Intrinsics.checkNotNull(uuid14);
                    return companion14.newInstance((Parcelable) new InstrumentSplitPaymentDetailFragment.Args(uuid14));
                case 15:
                    RoundupDetailFragment.Companion companion15 = RoundupDetailFragment.INSTANCE;
                    UUID uuid15 = key.getUuid();
                    Intrinsics.checkNotNull(uuid15);
                    return companion15.newInstance((Parcelable) new RoundupDetailFragment.Args(uuid15));
                case 16:
                    MerchantRewardDetailFragment.Companion companion16 = MerchantRewardDetailFragment.INSTANCE;
                    UUID uuid16 = key.getUuid();
                    Intrinsics.checkNotNull(uuid16);
                    return companion16.newInstance((Parcelable) new MerchantRewardDetailFragment.Args(uuid16));
                case 17:
                    RhyAchTransferDetailFragment.Companion companion17 = RhyAchTransferDetailFragment.INSTANCE;
                    UUID uuid17 = key.getUuid();
                    Intrinsics.checkNotNull(uuid17);
                    return companion17.newInstance((Parcelable) new RhyAchTransferDetailFragment.Args(uuid17));
                case 18:
                case 19:
                    InstantTransferDetailFragment.Companion companion18 = InstantTransferDetailFragment.INSTANCE;
                    UUID uuid18 = key.getUuid();
                    Intrinsics.checkNotNull(uuid18);
                    return companion18.newInstance((Parcelable) new InstantTransferDetailFragment.Args(uuid18));
                case 20:
                    DetailShimFragment.Companion companion19 = DetailShimFragment.INSTANCE;
                    UUID uuid19 = key.getUuid();
                    Intrinsics.checkNotNull(uuid19);
                    return companion19.newInstance((Parcelable) new DetailShimFragment.Args(uuid19, key.getFromDeepLink()));
                case 21:
                    TransactionDetailFragment.Companion companion20 = TransactionDetailFragment.INSTANCE;
                    UUID uuid20 = key.getUuid();
                    Intrinsics.checkNotNull(uuid20);
                    return companion20.newInstance((Parcelable) new McDucklingTransactionFragmentKey(new TransactionReference(uuid20, HistoryTransactionType.CHECK_TRANSFER, null, null, false, 28, null)));
                case 22:
                    TransactionDetailFragment.Companion companion21 = TransactionDetailFragment.INSTANCE;
                    UUID uuid21 = key.getUuid();
                    Intrinsics.checkNotNull(uuid21);
                    return companion21.newInstance((Parcelable) new McDucklingTransactionFragmentKey(new TransactionReference(uuid21, HistoryTransactionType.INCOMING_WIRE, null, null, false, 28, null)));
                case 23:
                    TransactionDetailFragment.Companion companion22 = TransactionDetailFragment.INSTANCE;
                    UUID uuid22 = key.getUuid();
                    Intrinsics.checkNotNull(uuid22);
                    return companion22.newInstance((Parcelable) new McDucklingTransactionFragmentKey(new TransactionReference(uuid22, HistoryTransactionType.OUTGOING_WIRE, null, null, false, 28, null)));
                case 24:
                    TransactionDetailFragment.Companion companion23 = TransactionDetailFragment.INSTANCE;
                    UUID uuid23 = key.getUuid();
                    Intrinsics.checkNotNull(uuid23);
                    return companion23.newInstance((Parcelable) new McDucklingTransactionFragmentKey(new TransactionReference(uuid23, HistoryTransactionType.INTERNAL_TRANSFER, null, null, false, 28, null)));
                case 25:
                    TransactionDetailFragment.Companion companion24 = TransactionDetailFragment.INSTANCE;
                    UUID uuid24 = key.getUuid();
                    Intrinsics.checkNotNull(uuid24);
                    return companion24.newInstance((Parcelable) new McDucklingTransactionFragmentKey(new TransactionReference(uuid24, HistoryTransactionType.UK_OPEN_BANKING_TRANSFER, null, null, false, 28, null)));
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
}
