package com.robinhood.android.optionschain;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.optionchain.OptionChainDisclosureView;
import com.robinhood.android.optionchain.OptionDisclosureRowModel;
import com.robinhood.android.optionchain.views.UnderlyingQuoteRowViewHolder;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.optionschain.OptionContractRowView;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionBundles;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.test.idler.TrackedListAdapter;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainAdapter.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002RSB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ{\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u0001012\f\u00102\u001a\b\u0012\u0004\u0012\u000204032\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\f\u00108\u001a\b\u0012\u0004\u0012\u000209062\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?¢\u0006\u0002\u0010@J\u001a\u0010A\u001a\u00020+2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015J\u001a\u0010C\u001a\u00020+2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u0015J\u000e\u0010D\u001a\u00020&2\u0006\u0010E\u001a\u00020\u0016J\u000e\u0010F\u001a\u00020&2\u0006\u0010G\u001a\u00020HJ\u0010\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020&H\u0016J\u0018\u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020&H\u0016J\u0018\u0010O\u001a\u00020+2\u0006\u0010P\u001a\u00020\u00032\u0006\u0010J\u001a\u00020&H\u0016J\b\u0010Q\u001a\u00020+H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020 @FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010'\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020&@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainAdapter;", "Lcom/robinhood/test/idler/TrackedListAdapter;", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callbacks", "Lcom/robinhood/android/optionschain/OptionContractRowView$Callbacks;", "listViewCallbacks", "Lcom/robinhood/android/optionschain/OptionContractRowView$OptionChainListViewCallbacks;", "<init>", "(Lcom/robinhood/android/optionschain/OptionContractRowView$Callbacks;Lcom/robinhood/android/optionschain/OptionContractRowView$OptionChainListViewCallbacks;)V", "getCallbacks", "()Lcom/robinhood/android/optionschain/OptionContractRowView$Callbacks;", "getListViewCallbacks", "()Lcom/robinhood/android/optionschain/OptionContractRowView$OptionChainListViewCallbacks;", "loadingSentinel", "value", "Lcom/robinhood/models/ui/OptionConfigurationBundle;", "optionConfigurationBundle", "getOptionConfigurationBundle", "()Lcom/robinhood/models/ui/OptionConfigurationBundle;", "optionQuoteMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "optionPositionCountMap", "Lcom/robinhood/models/ui/UiOptionPositionCounts;", "Lcom/robinhood/android/optionschain/OptionChainAdapter$State;", "state", "getState", "()Lcom/robinhood/android/optionschain/OptionChainAdapter$State;", "setState", "(Lcom/robinhood/android/optionschain/OptionChainAdapter$State;)V", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "tradeOnExpirationState", "getTradeOnExpirationState", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "setTradeOnExpirationState", "(Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;)V", "", "quotePosition", "getQuotePosition", "()I", "setData", "", "accountIsMargin", "", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "defaultPricingType", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "featureSet", "", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Feature;", "sortedOptionInstruments", "", "Lcom/robinhood/models/db/OptionInstrument;", "sortedWatchlistStates", "Lcom/robinhood/models/ui/OptionWatchlistItemState;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "callback", "Ljava/lang/Runnable;", "(Ljava/lang/Boolean;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/ui/UnderlyingQuote;Lcom/robinhood/models/ui/OptionConfigurationBundle;Lcom/robinhood/models/ui/UiOptionChain;Ljava/lang/Runnable;)V", "setOptionQuotes", "quoteMap", "setOptionPositionCounts", "findOptionInstrumentPosition", "optionInstrumentId", "findPositionForStrike", "strikePrice", "Ljava/math/BigDecimal;", "getItemViewType", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "submitViewModelChanges", "State", "DiffCallback", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainAdapter extends TrackedListAdapter<Object, RecyclerView.ViewHolder> {
    public static final int $stable = 8;
    private final OptionContractRowView.Callbacks callbacks;
    private final OptionContractRowView.OptionChainListViewCallbacks listViewCallbacks;
    private final Object loadingSentinel;
    private OptionConfigurationBundle optionConfigurationBundle;
    private Map<UUID, UiOptionPositionCounts> optionPositionCountMap;
    private Map<UUID, OptionInstrumentQuote> optionQuoteMap;
    private int quotePosition;
    private State state;
    private OptionSettings.TradingOnExpirationState tradeOnExpirationState;

    public final OptionContractRowView.Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final OptionContractRowView.OptionChainListViewCallbacks getListViewCallbacks() {
        return this.listViewCallbacks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainAdapter(OptionContractRowView.Callbacks callbacks, OptionContractRowView.OptionChainListViewCallbacks listViewCallbacks) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(listViewCallbacks, "listViewCallbacks");
        this.callbacks = callbacks;
        this.listViewCallbacks = listViewCallbacks;
        Object obj = new Object();
        this.loadingSentinel = obj;
        this.optionQuoteMap = MapsKt.emptyMap();
        this.optionPositionCountMap = MapsKt.emptyMap();
        this.state = new State(false, false, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        this.tradeOnExpirationState = OptionSettings.TradingOnExpirationState.INELIGIBLE;
        this.quotePosition = -1;
        submitList(CollectionsKt.listOf(obj));
    }

    public final OptionConfigurationBundle getOptionConfigurationBundle() {
        return this.optionConfigurationBundle;
    }

    public final State getState() {
        return this.state;
    }

    public final void setState(State value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.state, value)) {
            return;
        }
        this.state = value;
        submitViewModelChanges();
    }

    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationState() {
        return this.tradeOnExpirationState;
    }

    public final void setTradeOnExpirationState(OptionSettings.TradingOnExpirationState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.tradeOnExpirationState == value) {
            return;
        }
        this.tradeOnExpirationState = value;
        submitViewModelChanges();
    }

    public final int getQuotePosition() {
        return this.quotePosition;
    }

    public final void setData(Boolean accountIsMargin, OptionCurrentOrNextMarketDates currentOrNextMarketDates, OptionSettings.DefaultPricingSetting defaultPricingType, Set<? extends OptionChainLaunchMode.Feature> featureSet, List<OptionInstrument> sortedOptionInstruments, List<? extends OptionWatchlistItemState> sortedWatchlistStates, UnderlyingQuote underlyingQuote, OptionConfigurationBundle optionConfigurationBundle, UiOptionChain uiOptionChain, Runnable callback) {
        OptionChainAdapter optionChainAdapter = this;
        List<? extends OptionWatchlistItemState> sortedWatchlistStates2 = sortedWatchlistStates;
        OptionConfigurationBundle optionConfigurationBundle2 = optionConfigurationBundle;
        Intrinsics.checkNotNullParameter(featureSet, "featureSet");
        Intrinsics.checkNotNullParameter(sortedOptionInstruments, "sortedOptionInstruments");
        Intrinsics.checkNotNullParameter(sortedWatchlistStates2, "sortedWatchlistStates");
        Intrinsics.checkNotNullParameter(optionConfigurationBundle2, "optionConfigurationBundle");
        if (sortedOptionInstruments.size() != sortedWatchlistStates2.size()) {
            throw new IllegalStateException("Check failed.");
        }
        optionChainAdapter.optionConfigurationBundle = optionConfigurationBundle2;
        optionChainAdapter.quotePosition = -1;
        if (sortedOptionInstruments.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : sortedOptionInstruments) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            OptionInstrument optionInstrument = (OptionInstrument) obj;
            BigDecimal strikePrice = optionInstrument.getStrikePrice();
            if (underlyingQuote != null && optionChainAdapter.quotePosition < 0 && BigDecimals7.lte(strikePrice, underlyingQuote.getCurrentValue())) {
                arrayList.add(underlyingQuote);
                optionChainAdapter.quotePosition = CollectionsKt.getLastIndex(arrayList);
            }
            OptionLegBundle optionLegBundle = new OptionLegBundle(optionConfigurationBundle2, optionInstrument, 0, 4, null);
            ArrayList arrayList2 = arrayList;
            optionConfigurationBundle2 = optionConfigurationBundle;
            arrayList2.add(new OptionInstrumentRowModel(accountIsMargin, currentOrNextMarketDates, defaultPricingType, featureSet, optionInstrument, optionChainAdapter.state.getOptionInstrumentToRollId(), optionConfigurationBundle2, optionChainAdapter.optionQuoteMap.get(optionInstrument.getId()), optionChainAdapter.optionPositionCountMap.get(optionInstrument.getId()), underlyingQuote, optionChainAdapter.state.getMultilegAvailable(), optionChainAdapter.state.getPositionOpeningOnly(), OptionBundles.getMultipleChainsSelectedSymbols(CollectionsKt.plus((Collection<? extends OptionLegBundle>) optionChainAdapter.state.getSelectedLegs(), optionLegBundle)), optionChainAdapter.state.getSelectedLegs().contains(optionLegBundle), OptionBundles.isBuyingOrSellingSameContract(optionChainAdapter.state.getSelectedLegs(), optionLegBundle), optionChainAdapter.tradeOnExpirationState, uiOptionChain, sortedWatchlistStates2.get(i), optionChainAdapter.state.getBuySelectedMetrics(), optionChainAdapter.state.getSellSelectedMetrics()));
            sortedWatchlistStates2 = sortedWatchlistStates;
            arrayList = arrayList2;
            i = i2;
            optionChainAdapter = this;
        }
        ArrayList arrayList3 = arrayList;
        if (underlyingQuote != null && this.quotePosition < 0) {
            arrayList3.add(underlyingQuote);
            this.quotePosition = CollectionsKt.getLastIndex(arrayList3);
        }
        if (this.state.getShowDisclosure()) {
            arrayList3.add(new OptionDisclosureRowModel(featureSet.contains(OptionChainLaunchMode.Feature.ONBOARDING_DISCLOSURE)));
        }
        submitList(arrayList3, callback);
    }

    public final void setOptionQuotes(Map<UUID, OptionInstrumentQuote> quoteMap) {
        Intrinsics.checkNotNullParameter(quoteMap, "quoteMap");
        if (Intrinsics.areEqual(this.optionQuoteMap, quoteMap)) {
            return;
        }
        this.optionQuoteMap = quoteMap;
        submitViewModelChanges();
    }

    public final void setOptionPositionCounts(Map<UUID, UiOptionPositionCounts> optionPositionCountMap) {
        Intrinsics.checkNotNullParameter(optionPositionCountMap, "optionPositionCountMap");
        if (Intrinsics.areEqual(this.optionPositionCountMap, optionPositionCountMap)) {
            return;
        }
        this.optionPositionCountMap = optionPositionCountMap;
        submitViewModelChanges();
    }

    public final int findOptionInstrumentPosition(UUID optionInstrumentId) {
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        int size = getSize();
        for (int i = 0; i < size; i++) {
            Object item = getItem(i);
            if ((item instanceof OptionInstrumentRowModel) && Intrinsics.areEqual(((OptionInstrumentRowModel) item).getOptionInstrument().getId(), optionInstrumentId)) {
                return i;
            }
        }
        return -1;
    }

    public final int findPositionForStrike(BigDecimal strikePrice) {
        OptionInstrumentRowModel optionInstrumentRowModel;
        Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
        if (getSize() == 0) {
            return -1;
        }
        int size = getSize();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                optionInstrumentRowModel = null;
                break;
            }
            Object item = getItem(i2);
            if (item instanceof OptionInstrumentRowModel) {
                optionInstrumentRowModel = (OptionInstrumentRowModel) item;
                i = i2;
                break;
            }
            i2++;
        }
        if (optionInstrumentRowModel == null) {
            return -1;
        }
        if (optionInstrumentRowModel.getOptionInstrument().getStrikePrice().compareTo(strikePrice) <= 0) {
            return i;
        }
        int size2 = getSize();
        for (int i3 = i + 1; i3 < size2; i3++) {
            Object item2 = getItem(i3);
            if (item2 instanceof OptionInstrumentRowModel) {
                if (optionInstrumentRowModel.getOptionInstrument().getStrikePrice().compareTo(strikePrice) > 0 && ((OptionInstrumentRowModel) item2).getOptionInstrument().getStrikePrice().compareTo(strikePrice) <= 0) {
                    return i3;
                }
                i = i3;
                optionInstrumentRowModel = (OptionInstrumentRowModel) item2;
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        Object item = getItem(position);
        if (Intrinsics.areEqual(item, this.loadingSentinel)) {
            return 99;
        }
        if (item instanceof OptionDisclosureRowModel) {
            return 2;
        }
        return item instanceof UnderlyingQuote ? 1 : 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            return new UnderlyingQuoteRowViewHolder(ViewGroups.inflate$default(parent, C11303R.layout.include_equity_quote_divider, false, 2, null));
        }
        if (viewType == 2) {
            return new GenericViewHolder(OptionChainDisclosureView.INSTANCE.inflate(parent));
        }
        if (viewType == 3) {
            return new GenericViewHolder(OptionContractRowView.INSTANCE.inflate(parent));
        }
        if (viewType == 99) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new GenericViewHolder(new ComposeView(context, null, 0, 6, null));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int itemViewType = getItemViewType(position);
        if (itemViewType == 1) {
            if (!(holder instanceof UnderlyingQuoteRowViewHolder)) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(holder);
                throw new ExceptionsH();
            }
            Object item = getItem(position);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.robinhood.models.ui.UnderlyingQuote");
            ((UnderlyingQuoteRowViewHolder) holder).setUnderlyingQuote((UnderlyingQuote) item);
            return;
        }
        if (itemViewType == 2) {
            View view = holder.itemView;
            OptionChainDisclosureView optionChainDisclosureView = view instanceof OptionChainDisclosureView ? (OptionChainDisclosureView) view : null;
            Object item2 = getItem(position);
            OptionDisclosureRowModel optionDisclosureRowModel = item2 instanceof OptionDisclosureRowModel ? (OptionDisclosureRowModel) item2 : null;
            if (optionChainDisclosureView == null || optionDisclosureRowModel == null) {
                return;
            }
            optionChainDisclosureView.bind(optionDisclosureRowModel);
            return;
        }
        if (itemViewType != 3) {
            if (itemViewType == 99) {
                View view2 = holder.itemView;
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                ((ComposeView) view2).setContent(OptionChainAdapter2.INSTANCE.m17078getLambda$1111614870$feature_options_chain_externalDebug());
                return;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(getItemViewType(position)));
            throw new ExceptionsH();
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (!(itemView instanceof OptionContractRowView)) {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(itemView);
            throw new ExceptionsH();
        }
        int i = position + 1;
        OptionContractRowView optionContractRowView = (OptionContractRowView) itemView;
        optionContractRowView.setBottomDividerVisible(!(i < getSize() && getItemViewType(i) == 1));
        Object item3 = getItem(position);
        Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type com.robinhood.android.optionschain.OptionInstrumentRowModel");
        optionContractRowView.bind((OptionInstrumentRowModel) item3, this.callbacks, this.listViewCallbacks);
    }

    private final void submitViewModelChanges() {
        List<Object> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        if (Intrinsics.areEqual(CollectionsKt.singleOrNull((List) currentList), this.loadingSentinel)) {
            return;
        }
        List<Object> list = currentList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object objCopy$default : list) {
            if (objCopy$default instanceof OptionInstrumentRowModel) {
                OptionInstrumentRowModel optionInstrumentRowModel = (OptionInstrumentRowModel) objCopy$default;
                OptionLegBundle optionLegBundle = new OptionLegBundle(optionInstrumentRowModel.getOptionConfigurationBundle(), optionInstrumentRowModel.getOptionInstrument(), 0, 4, null);
                objCopy$default = OptionInstrumentRowModel.copy$default(optionInstrumentRowModel, null, null, null, null, null, null, null, this.optionQuoteMap.get(optionInstrumentRowModel.getOptionInstrument().getId()), this.optionPositionCountMap.get(optionInstrumentRowModel.getOptionInstrument().getId()), null, false, false, null, this.state.getSelectedLegs().contains(optionLegBundle), OptionBundles.isBuyingOrSellingSameContract(this.state.getSelectedLegs(), optionLegBundle), null, null, null, null, null, 1023615, null);
            }
            arrayList.add(objCopy$default);
        }
        submitList(arrayList);
    }

    /* compiled from: OptionChainAdapter.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainAdapter$State;", "", "multilegAvailable", "", "positionOpeningOnly", "selectedLegs", "", "Lcom/robinhood/models/ui/OptionLegBundle;", "optionInstrumentToRollId", "Ljava/util/UUID;", "showDisclosure", "buySelectedMetrics", "Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "sellSelectedMetrics", "<init>", "(ZZLjava/util/List;Ljava/util/UUID;ZLcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/models/db/OptionChainSelectedMetrics;)V", "getMultilegAvailable", "()Z", "getPositionOpeningOnly", "getSelectedLegs", "()Ljava/util/List;", "getOptionInstrumentToRollId", "()Ljava/util/UUID;", "getShowDisclosure", "getBuySelectedMetrics", "()Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "getSellSelectedMetrics", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final OptionChainSelectedMetrics buySelectedMetrics;
        private final boolean multilegAvailable;
        private final UUID optionInstrumentToRollId;
        private final boolean positionOpeningOnly;
        private final List<OptionLegBundle> selectedLegs;
        private final OptionChainSelectedMetrics sellSelectedMetrics;
        private final boolean showDisclosure;

        public State() {
            this(false, false, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }

        public static /* synthetic */ State copy$default(State state, boolean z, boolean z2, List list, UUID uuid, boolean z3, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainSelectedMetrics optionChainSelectedMetrics2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = state.multilegAvailable;
            }
            if ((i & 2) != 0) {
                z2 = state.positionOpeningOnly;
            }
            if ((i & 4) != 0) {
                list = state.selectedLegs;
            }
            if ((i & 8) != 0) {
                uuid = state.optionInstrumentToRollId;
            }
            if ((i & 16) != 0) {
                z3 = state.showDisclosure;
            }
            if ((i & 32) != 0) {
                optionChainSelectedMetrics = state.buySelectedMetrics;
            }
            if ((i & 64) != 0) {
                optionChainSelectedMetrics2 = state.sellSelectedMetrics;
            }
            OptionChainSelectedMetrics optionChainSelectedMetrics3 = optionChainSelectedMetrics;
            OptionChainSelectedMetrics optionChainSelectedMetrics4 = optionChainSelectedMetrics2;
            boolean z4 = z3;
            List list2 = list;
            return state.copy(z, z2, list2, uuid, z4, optionChainSelectedMetrics3, optionChainSelectedMetrics4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getMultilegAvailable() {
            return this.multilegAvailable;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getPositionOpeningOnly() {
            return this.positionOpeningOnly;
        }

        public final List<OptionLegBundle> component3() {
            return this.selectedLegs;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getOptionInstrumentToRollId() {
            return this.optionInstrumentToRollId;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowDisclosure() {
            return this.showDisclosure;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionChainSelectedMetrics getBuySelectedMetrics() {
            return this.buySelectedMetrics;
        }

        /* renamed from: component7, reason: from getter */
        public final OptionChainSelectedMetrics getSellSelectedMetrics() {
            return this.sellSelectedMetrics;
        }

        public final State copy(boolean multilegAvailable, boolean positionOpeningOnly, List<OptionLegBundle> selectedLegs, UUID optionInstrumentToRollId, boolean showDisclosure, OptionChainSelectedMetrics buySelectedMetrics, OptionChainSelectedMetrics sellSelectedMetrics) {
            Intrinsics.checkNotNullParameter(selectedLegs, "selectedLegs");
            return new State(multilegAvailable, positionOpeningOnly, selectedLegs, optionInstrumentToRollId, showDisclosure, buySelectedMetrics, sellSelectedMetrics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.multilegAvailable == state.multilegAvailable && this.positionOpeningOnly == state.positionOpeningOnly && Intrinsics.areEqual(this.selectedLegs, state.selectedLegs) && Intrinsics.areEqual(this.optionInstrumentToRollId, state.optionInstrumentToRollId) && this.showDisclosure == state.showDisclosure && Intrinsics.areEqual(this.buySelectedMetrics, state.buySelectedMetrics) && Intrinsics.areEqual(this.sellSelectedMetrics, state.sellSelectedMetrics);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.multilegAvailable) * 31) + Boolean.hashCode(this.positionOpeningOnly)) * 31) + this.selectedLegs.hashCode()) * 31;
            UUID uuid = this.optionInstrumentToRollId;
            int iHashCode2 = (((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + Boolean.hashCode(this.showDisclosure)) * 31;
            OptionChainSelectedMetrics optionChainSelectedMetrics = this.buySelectedMetrics;
            int iHashCode3 = (iHashCode2 + (optionChainSelectedMetrics == null ? 0 : optionChainSelectedMetrics.hashCode())) * 31;
            OptionChainSelectedMetrics optionChainSelectedMetrics2 = this.sellSelectedMetrics;
            return iHashCode3 + (optionChainSelectedMetrics2 != null ? optionChainSelectedMetrics2.hashCode() : 0);
        }

        public String toString() {
            return "State(multilegAvailable=" + this.multilegAvailable + ", positionOpeningOnly=" + this.positionOpeningOnly + ", selectedLegs=" + this.selectedLegs + ", optionInstrumentToRollId=" + this.optionInstrumentToRollId + ", showDisclosure=" + this.showDisclosure + ", buySelectedMetrics=" + this.buySelectedMetrics + ", sellSelectedMetrics=" + this.sellSelectedMetrics + ")";
        }

        public State(boolean z, boolean z2, List<OptionLegBundle> selectedLegs, UUID uuid, boolean z3, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainSelectedMetrics optionChainSelectedMetrics2) {
            Intrinsics.checkNotNullParameter(selectedLegs, "selectedLegs");
            this.multilegAvailable = z;
            this.positionOpeningOnly = z2;
            this.selectedLegs = selectedLegs;
            this.optionInstrumentToRollId = uuid;
            this.showDisclosure = z3;
            this.buySelectedMetrics = optionChainSelectedMetrics;
            this.sellSelectedMetrics = optionChainSelectedMetrics2;
        }

        public final boolean getMultilegAvailable() {
            return this.multilegAvailable;
        }

        public final boolean getPositionOpeningOnly() {
            return this.positionOpeningOnly;
        }

        public /* synthetic */ State(boolean z, boolean z2, List list, UUID uuid, boolean z3, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainSelectedMetrics optionChainSelectedMetrics2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : uuid, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : optionChainSelectedMetrics, (i & 64) != 0 ? null : optionChainSelectedMetrics2);
        }

        public final List<OptionLegBundle> getSelectedLegs() {
            return this.selectedLegs;
        }

        public final UUID getOptionInstrumentToRollId() {
            return this.optionInstrumentToRollId;
        }

        public final boolean getShowDisclosure() {
            return this.showDisclosure;
        }

        public final OptionChainSelectedMetrics getBuySelectedMetrics() {
            return this.buySelectedMetrics;
        }

        public final OptionChainSelectedMetrics getSellSelectedMetrics() {
            return this.sellSelectedMetrics;
        }
    }

    /* compiled from: OptionChainAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DiffCallback extends DiffUtil.ItemCallback<Object> {
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof OptionInstrumentRowModel) && (newItem instanceof OptionInstrumentRowModel)) {
                return Intrinsics.areEqual(((OptionInstrumentRowModel) oldItem).getOptionInstrument().getId(), ((OptionInstrumentRowModel) newItem).getOptionInstrument().getId());
            }
            if ((oldItem instanceof UnderlyingQuote.EquityQuote) && (newItem instanceof UnderlyingQuote.EquityQuote)) {
                return true;
            }
            if ((oldItem instanceof UnderlyingQuote.IndexQuote) && (newItem instanceof UnderlyingQuote.IndexQuote)) {
                return true;
            }
            return ((oldItem instanceof OptionDisclosureRowModel) && (newItem instanceof OptionDisclosureRowModel)) || oldItem == newItem;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof UnderlyingQuote.EquityQuote) && (newItem instanceof UnderlyingQuote.EquityQuote)) {
                return Intrinsics.areEqual(((UnderlyingQuote.EquityQuote) oldItem).getCurrentValue(), ((UnderlyingQuote.EquityQuote) newItem).getCurrentValue());
            }
            if ((oldItem instanceof UnderlyingQuote.IndexQuote) && (newItem instanceof UnderlyingQuote.IndexQuote)) {
                return Intrinsics.areEqual(((UnderlyingQuote.IndexQuote) oldItem).getCurrentValue(), ((UnderlyingQuote.IndexQuote) newItem).getCurrentValue());
            }
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
