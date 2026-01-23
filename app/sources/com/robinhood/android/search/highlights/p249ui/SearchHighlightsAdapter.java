package com.robinhood.android.search.highlights.p249ui;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.highlights.duxo.SearchHighlightsViewState;
import com.robinhood.android.search.highlights.p249ui.SearchHighlightsAdapter;
import com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow;
import com.robinhood.android.search.highlights.p249ui.chips.SearchHighlightsChipCarousel;
import com.robinhood.android.search.highlights.p249ui.earnings.SearchHighlightsEarningSection;
import com.robinhood.android.search.highlights.p249ui.earnings.SearchHighlightsEarningsShowMoreButton;
import com.robinhood.android.search.highlights.p249ui.market.SearchHighlightsMarketSection;
import com.robinhood.android.search.highlights.p249ui.multicontractshero.SearchHighlightsMultiContractHeroSection;
import com.robinhood.android.search.highlights.p249ui.quicklinks.SearchHighlightsQuickLinks;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.SearchHighlightSportsHeroSection;
import com.robinhood.android.search.highlights.p249ui.sports.SearchHighlightsSportsSection;
import com.robinhood.android.search.highlights.p249ui.subpages.SearchHighlightSubpageData;
import com.robinhood.android.search.highlights.p249ui.subpages.SearchHighlightSubpageHeader;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import search_coprocessor.p542v1.HighlightItemDto;

/* compiled from: SearchHighlightsAdapter.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\"#B_\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n\u0012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\u001e\u0010\u001f\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0016\u0010!\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsBaseRow;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "accountNumber", "", "onToggleShowMoreEarnings", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "showMore", "", "onSubpageSelected", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "subpage", "<init>", "(Lcom/robinhood/android/navigation/Navigator;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bind", "viewState", "Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsViewState;", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "onViewRecycled", "ViewType", "DiffCallback", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SearchHighlightsAdapter extends ListAdapter<SearchHighlightsRow2, GenericViewHolder<? extends ComposeView>> {
    public static final int $stable = 8;
    private final String accountNumber;
    private final Navigator navigator;
    private final Function1<SearchHighlightSubpageData, Unit> onSubpageSelected;
    private final Function1<Boolean, Unit> onToggleShowMoreEarnings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchHighlightsAdapter(Navigator navigator, String str, Function1<? super Boolean, Unit> onToggleShowMoreEarnings, Function1<? super SearchHighlightSubpageData, Unit> onSubpageSelected) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(onToggleShowMoreEarnings, "onToggleShowMoreEarnings");
        Intrinsics.checkNotNullParameter(onSubpageSelected, "onSubpageSelected");
        this.navigator = navigator;
        this.accountNumber = str;
        this.onToggleShowMoreEarnings = onToggleShowMoreEarnings;
        this.onSubpageSelected = onSubpageSelected;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchHighlightsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "SUBPAGE_TABS", "SECTION_TITLE", "MARKET_CARDS", "CHIP_CAROUSEL", "QUICK_LINKS", "EARNINGS_ROW", "EARNINGS_SHOW_MORE_BUTTON", "SPORT_CAROUSEL", "SPORT_HERO_CAROUSEL", "MULTI_CONTRACT_HERO_CAROUSEL", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType SUBPAGE_TABS = new ViewType("SUBPAGE_TABS", 0);
        public static final ViewType SECTION_TITLE = new ViewType("SECTION_TITLE", 1);
        public static final ViewType MARKET_CARDS = new ViewType("MARKET_CARDS", 2);
        public static final ViewType CHIP_CAROUSEL = new ViewType("CHIP_CAROUSEL", 3);
        public static final ViewType QUICK_LINKS = new ViewType("QUICK_LINKS", 4);
        public static final ViewType EARNINGS_ROW = new ViewType("EARNINGS_ROW", 5);
        public static final ViewType EARNINGS_SHOW_MORE_BUTTON = new ViewType("EARNINGS_SHOW_MORE_BUTTON", 6);
        public static final ViewType SPORT_CAROUSEL = new ViewType("SPORT_CAROUSEL", 7);
        public static final ViewType SPORT_HERO_CAROUSEL = new ViewType("SPORT_HERO_CAROUSEL", 8);
        public static final ViewType MULTI_CONTRACT_HERO_CAROUSEL = new ViewType("MULTI_CONTRACT_HERO_CAROUSEL", 9);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{SUBPAGE_TABS, SECTION_TITLE, MARKET_CARDS, CHIP_CAROUSEL, QUICK_LINKS, EARNINGS_ROW, EARNINGS_SHOW_MORE_BUTTON, SPORT_CAROUSEL, SPORT_HERO_CAROUSEL, MULTI_CONTRACT_HERO_CAROUSEL};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewTypeArr$values);
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    public final void bind(SearchHighlightsViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        submitList(SearchHighlightsRow3.toSearchHighlightRows(viewState.getHighlights(), viewState.getSubpages(), viewState.getSubpageContents(), this.accountNumber, viewState.getShowMoreEarnings(), viewState.getSelectedSubpage()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ViewType viewType;
        SearchHighlightsRow2 item = getItem(position);
        if (item instanceof SubpageTabs) {
            viewType = ViewType.SUBPAGE_TABS;
        } else if (item instanceof SearchHighlightsRow.SectionTitle) {
            viewType = ViewType.SECTION_TITLE;
        } else if (item instanceof SearchHighlightsRow.MarketCards) {
            viewType = ViewType.MARKET_CARDS;
        } else if (item instanceof SearchHighlightsRow.ChipCarousel) {
            viewType = ViewType.CHIP_CAROUSEL;
        } else if (item instanceof SearchHighlightsRow.QuickLinks) {
            viewType = ViewType.QUICK_LINKS;
        } else if (item instanceof SearchHighlightsRow.EarningsRow) {
            viewType = ViewType.EARNINGS_ROW;
        } else if (item instanceof SearchHighlightsRow.EarningsShowMoreButton) {
            viewType = ViewType.EARNINGS_SHOW_MORE_BUTTON;
        } else if (item instanceof SearchHighlightsRow.SportCarousel) {
            viewType = ViewType.SPORT_CAROUSEL;
        } else if (item instanceof SearchHighlightsRow.SportHeroCarousel) {
            viewType = ViewType.SPORT_HERO_CAROUSEL;
        } else {
            if (!(item instanceof SearchHighlightsRow.MultiContractHeroCarousel)) {
                throw new NoWhenBranchMatchedException();
            }
            viewType = ViewType.MULTI_CONTRACT_HERO_CAROUSEL;
        }
        return viewType.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<ComposeView> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.INSTANCE);
        return new GenericViewHolder<>(composeView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<ComposeView> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final SearchHighlightsRow2 item = getItem(position);
        ((ComposeView) holder.getView()).setContent(ComposableLambda3.composableLambdaInstance(467705947, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.SearchHighlightsAdapter.onBindViewHolder.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(467705947, i, -1, "com.robinhood.android.search.highlights.ui.SearchHighlightsAdapter.onBindViewHolder.<anonymous> (SearchHighlightsAdapter.kt:93)");
                }
                ProvidedValue<Navigator> providedValueProvides = LocalNavigator.getLocalNavigator().provides(SearchHighlightsAdapter.this.navigator);
                final SearchHighlightsRow2 searchHighlightsRow2 = item;
                final SearchHighlightsAdapter searchHighlightsAdapter = SearchHighlightsAdapter.this;
                CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-329935973, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.SearchHighlightsAdapter.onBindViewHolder.1.1

                    /* compiled from: SearchHighlightsAdapter.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.search.highlights.ui.SearchHighlightsAdapter$onBindViewHolder$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C505271 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SearchHighlightsRow2 $row;
                        final /* synthetic */ SearchHighlightsAdapter this$0;

                        C505271(SearchHighlightsRow2 searchHighlightsRow2, SearchHighlightsAdapter searchHighlightsAdapter) {
                            this.$row = searchHighlightsRow2;
                            this.this$0 = searchHighlightsAdapter;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-308480285, i, -1, "com.robinhood.android.search.highlights.ui.SearchHighlightsAdapter.onBindViewHolder.<anonymous>.<anonymous>.<anonymous> (SearchHighlightsAdapter.kt:95)");
                            }
                            SearchHighlightsRow2 searchHighlightsRow2 = this.$row;
                            if (searchHighlightsRow2 instanceof SubpageTabs) {
                                composer.startReplaceGroup(1293933465);
                                ImmutableList<SearchHighlightSubpageData> subpages = ((SubpageTabs) this.$row).getSubpages();
                                SearchHighlightSubpageData selectedSubpage = ((SubpageTabs) this.$row).getSelectedSubpage();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final SearchHighlightsAdapter searchHighlightsAdapter = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.search.highlights.ui.SearchHighlightsAdapter$onBindViewHolder$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SearchHighlightsAdapter.C279391.AnonymousClass1.C505271.invoke$lambda$1$lambda$0(searchHighlightsAdapter, (SearchHighlightSubpageData) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                SearchHighlightSubpageHeader.SearchHighlightSubpageHeader(subpages, selectedSubpage, (Function1) objRememberedValue, null, composer, 0, 8);
                                composer.endReplaceGroup();
                            } else if (searchHighlightsRow2 instanceof SearchHighlightsRow.SectionTitle) {
                                composer.startReplaceGroup(1294441028);
                                HighlightItemDto.ContentDto content = ((SearchHighlightsRow.SectionTitle) this.$row).getHighlightItem().getContent();
                                Intrinsics.checkNotNull(content, "null cannot be cast to non-null type search_coprocessor.v1.HighlightItemDto.ContentDto.SectionTitle");
                                SearchHighlightsTitle.SearchHighlightsTitle(((HighlightItemDto.ContentDto.SectionTitle) content).getValue(), composer, 0);
                                composer.endReplaceGroup();
                            } else if (searchHighlightsRow2 instanceof SearchHighlightsRow.MarketCards) {
                                composer.startReplaceGroup(1294726135);
                                HighlightItemDto.ContentDto content2 = ((SearchHighlightsRow.MarketCards) this.$row).getHighlightItem().getContent();
                                Intrinsics.checkNotNull(content2, "null cannot be cast to non-null type search_coprocessor.v1.HighlightItemDto.ContentDto.CompactIndicies");
                                SearchHighlightsMarketSection.SearchHighlightsMarketSection(((HighlightItemDto.ContentDto.CompactIndicies) content2).getValue(), ((SearchHighlightsRow.MarketCards) this.$row).getAccountNumber(), null, composer, 0, 4);
                                composer.endReplaceGroup();
                            } else if (searchHighlightsRow2 instanceof SearchHighlightsRow.ChipCarousel) {
                                composer.startReplaceGroup(1295147642);
                                HighlightItemDto.ContentDto content3 = ((SearchHighlightsRow.ChipCarousel) this.$row).getHighlightItem().getContent();
                                Intrinsics.checkNotNull(content3, "null cannot be cast to non-null type search_coprocessor.v1.HighlightItemDto.ContentDto.AssetChipGrid");
                                SearchHighlightsChipCarousel.SearchHighlightsChipCarousel(((HighlightItemDto.ContentDto.AssetChipGrid) content3).getValue(), ((SearchHighlightsRow.ChipCarousel) this.$row).getAccountNumber(), null, null, composer, 0, 12);
                                composer.endReplaceGroup();
                            } else if (searchHighlightsRow2 instanceof SearchHighlightsRow.QuickLinks) {
                                composer.startReplaceGroup(1295564034);
                                HighlightItemDto.ContentDto content4 = ((SearchHighlightsRow.QuickLinks) this.$row).getHighlightItem().getContent();
                                Intrinsics.checkNotNull(content4, "null cannot be cast to non-null type search_coprocessor.v1.HighlightItemDto.ContentDto.QuickLinks");
                                SearchHighlightsQuickLinks.SearchHighlightsQuickLinks(((HighlightItemDto.ContentDto.QuickLinks) content4).getValue(), ((SearchHighlightsRow.QuickLinks) this.$row).getAccountNumber(), null, composer, 0, 4);
                                composer.endReplaceGroup();
                            } else if (searchHighlightsRow2 instanceof SearchHighlightsRow.EarningsRow) {
                                composer.startReplaceGroup(1295971436);
                                SearchHighlightsEarningSection.SearchHighlightsEarningRow(((SearchHighlightsRow.EarningsRow) this.$row).getId(), ((SearchHighlightsRow.EarningsRow) this.$row).getAsset(), ((SearchHighlightsRow.EarningsRow) this.$row).getAccountNumber(), null, null, composer, 0, 24);
                                composer.endReplaceGroup();
                            } else if (searchHighlightsRow2 instanceof SearchHighlightsRow.EarningsShowMoreButton) {
                                composer.startReplaceGroup(1296320527);
                                boolean showMore = ((SearchHighlightsRow.EarningsShowMoreButton) this.$row).getShowMore();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer.changedInstance(this.this$0) | composer.changed(this.$row);
                                final SearchHighlightsAdapter searchHighlightsAdapter2 = this.this$0;
                                final SearchHighlightsRow2 searchHighlightsRow22 = this.$row;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.search.highlights.ui.SearchHighlightsAdapter$onBindViewHolder$1$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return SearchHighlightsAdapter.C279391.AnonymousClass1.C505271.invoke$lambda$3$lambda$2(searchHighlightsAdapter2, searchHighlightsRow22);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                SearchHighlightsEarningsShowMoreButton.SearchHighlightsEarningsShowMoreButton(showMore, (Function0) objRememberedValue2, null, composer, 0, 4);
                                composer.endReplaceGroup();
                            } else if (searchHighlightsRow2 instanceof SearchHighlightsRow.SportCarousel) {
                                composer.startReplaceGroup(1296717947);
                                HighlightItemDto.ContentDto content5 = ((SearchHighlightsRow.SportCarousel) this.$row).getHighlightItem().getContent();
                                Intrinsics.checkNotNull(content5, "null cannot be cast to non-null type search_coprocessor.v1.HighlightItemDto.ContentDto.SportCarousel");
                                SearchHighlightsSportsSection.SearchHighlightsSportsSection(((HighlightItemDto.ContentDto.SportCarousel) content5).getValue(), null, composer, 0, 2);
                                composer.endReplaceGroup();
                            } else if (searchHighlightsRow2 instanceof SearchHighlightsRow.SportHeroCarousel) {
                                composer.startReplaceGroup(1297077454);
                                HighlightItemDto.ContentDto content6 = ((SearchHighlightsRow.SportHeroCarousel) this.$row).getHighlightItem().getContent();
                                Intrinsics.checkNotNull(content6, "null cannot be cast to non-null type search_coprocessor.v1.HighlightItemDto.ContentDto.SportsHeroCarousel");
                                SearchHighlightSportsHeroSection.SearchHighlightSportsHeroSection(((HighlightItemDto.ContentDto.SportsHeroCarousel) content6).getValue(), null, composer, 0, 2);
                                composer.endReplaceGroup();
                            } else {
                                if (!(searchHighlightsRow2 instanceof SearchHighlightsRow.MultiContractHeroCarousel)) {
                                    composer.startReplaceGroup(-96805763);
                                    composer.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer.startReplaceGroup(1297459095);
                                HighlightItemDto.ContentDto content7 = ((SearchHighlightsRow.MultiContractHeroCarousel) this.$row).getHighlightItem().getContent();
                                Intrinsics.checkNotNull(content7, "null cannot be cast to non-null type search_coprocessor.v1.HighlightItemDto.ContentDto.MultiContractsHeroCarousel");
                                SearchHighlightsMultiContractHeroSection.SearchHighlightsMultiContractHeroSection(((HighlightItemDto.ContentDto.MultiContractsHeroCarousel) content7).getValue(), null, composer, 0, 2);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SearchHighlightsAdapter searchHighlightsAdapter, SearchHighlightSubpageData subpage) {
                            Intrinsics.checkNotNullParameter(subpage, "subpage");
                            searchHighlightsAdapter.onSubpageSelected.invoke(subpage);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(SearchHighlightsAdapter searchHighlightsAdapter, SearchHighlightsRow2 searchHighlightsRow2) {
                            searchHighlightsAdapter.onToggleShowMoreEarnings.invoke(Boolean.valueOf(((SearchHighlightsRow.EarningsShowMoreButton) searchHighlightsRow2).getShowMore()));
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-329935973, i2, -1, "com.robinhood.android.search.highlights.ui.SearchHighlightsAdapter.onBindViewHolder.<anonymous>.<anonymous> (SearchHighlightsAdapter.kt:94)");
                        }
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-308480285, true, new C505271(searchHighlightsRow2, searchHighlightsAdapter), composer2, 54), composer2, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(GenericViewHolder<ComposeView> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((ComposeView) holder.getView()).disposeComposition();
    }

    /* compiled from: SearchHighlightsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsBaseRow;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DiffCallback extends DiffUtil.ItemCallback<SearchHighlightsRow2> {
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(SearchHighlightsRow2 oldItem, SearchHighlightsRow2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof SubpageTabs) && (newItem instanceof SubpageTabs)) {
                return Intrinsics.areEqual(((SubpageTabs) oldItem).getId(), ((SubpageTabs) newItem).getId());
            }
            if ((oldItem instanceof SearchHighlightsRow.EarningsRow) && (newItem instanceof SearchHighlightsRow.EarningsRow)) {
                SearchHighlightsRow.EarningsRow earningsRow = (SearchHighlightsRow.EarningsRow) oldItem;
                SearchHighlightsRow.EarningsRow earningsRow2 = (SearchHighlightsRow.EarningsRow) newItem;
                return Intrinsics.areEqual(earningsRow.getId(), earningsRow2.getId()) && Intrinsics.areEqual(earningsRow.getAsset().getId(), earningsRow2.getAsset().getId());
            }
            if ((oldItem instanceof SearchHighlightsRow.EarningsShowMoreButton) && (newItem instanceof SearchHighlightsRow.EarningsShowMoreButton)) {
                return Intrinsics.areEqual(((SearchHighlightsRow.EarningsShowMoreButton) oldItem).getSectionId(), ((SearchHighlightsRow.EarningsShowMoreButton) newItem).getSectionId());
            }
            return oldItem.getClass() == newItem.getClass() && Intrinsics.areEqual(oldItem.getId(), newItem.getId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(SearchHighlightsRow2 oldItem, SearchHighlightsRow2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
