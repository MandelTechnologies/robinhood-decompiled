package com.robinhood.android.lists.p173ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.extensions.CuratedListViewModes;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.common.views.InstrumentRowView;
import com.robinhood.android.common.views.InstrumentRowViewHolder;
import com.robinhood.android.common.views.OptionStrategyRowView;
import com.robinhood.android.common.views.OptionStrategyRowViewHolder;
import com.robinhood.android.common.views.crypto.CryptoRowView;
import com.robinhood.android.common.views.crypto.CryptoRowViewHolder;
import com.robinhood.android.common.views.futures.FuturesRowView;
import com.robinhood.android.common.views.index.IndexRowView;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.extensions.InstrumentCuratedListEligibles;
import com.robinhood.android.lists.p173ui.EditFuturesRowView;
import com.robinhood.android.lists.p173ui.RemoveCryptoRowView;
import com.robinhood.android.lists.p173ui.RemoveInstrumentRowView;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p355ui.CryptoCuratedListEligible;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.p355ui.FuturesCuratedListEligible;
import com.robinhood.models.p355ui.IndexCuratedListEligible;
import com.robinhood.models.p355ui.InstrumentCuratedListEligible;
import com.robinhood.models.p355ui.OptionStrategyCuratedListEligible;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListAdapter.kt */
@Metadata(m3635d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0003\u0011\u0014\u0017\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007%&'()*+B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u000e\u0010$\u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0010\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/CuratedListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/models/ui/CuratedListEligible;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callbacks", "Lcom/robinhood/android/lists/ui/CuratedListAdapter$Callbacks;", "isRhList", "", "<init>", "(Lcom/robinhood/android/lists/ui/CuratedListAdapter$Callbacks;Z)V", "viewMode", "Lcom/robinhood/models/db/CuratedListViewMode;", "isInEditMode", "()Z", "setInEditMode", "(Z)V", "editInstrumentCallbacks", "com/robinhood/android/lists/ui/CuratedListAdapter$editInstrumentCallbacks$1", "Lcom/robinhood/android/lists/ui/CuratedListAdapter$editInstrumentCallbacks$1;", "editCryptoCallbacks", "com/robinhood/android/lists/ui/CuratedListAdapter$editCryptoCallbacks$1", "Lcom/robinhood/android/lists/ui/CuratedListAdapter$editCryptoCallbacks$1;", "editFuturesCallbacks", "com/robinhood/android/lists/ui/CuratedListAdapter$editFuturesCallbacks$1", "Lcom/robinhood/android/lists/ui/CuratedListAdapter$editFuturesCallbacks$1;", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "getItem", "setViewMode", "Callbacks", "DiffCallback", "Companion", "RhListInstrument", "RhListCrypto", "RhListFutures", "RhListIndex", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CuratedListAdapter extends ListAdapter<CuratedListEligible, RecyclerView.ViewHolder> {
    private static final int VIEW_TYPE_CURRENCY_PAIR = 0;
    private static final int VIEW_TYPE_EDIT_FUTURES_CONTRACT = 6;
    private static final int VIEW_TYPE_FUTURES_CONTRACT = 5;
    private static final int VIEW_TYPE_INDEX = 7;
    private static final int VIEW_TYPE_INSTRUMENT = 1;
    private static final int VIEW_TYPE_OPTION_STRATEGY = 4;
    private static final int VIEW_TYPE_REMOVE_CURRENCY_PAIR = 2;
    private static final int VIEW_TYPE_REMOVE_INSTRUMENT = 3;
    private final Callbacks callbacks;
    private final CuratedListAdapter2 editCryptoCallbacks;
    private final CuratedListAdapter3 editFuturesCallbacks;
    private final CuratedListAdapter4 editInstrumentCallbacks;
    private boolean isInEditMode;
    private final boolean isRhList;
    private CuratedListViewMode viewMode;
    public static final int $stable = 8;

    /* compiled from: CuratedListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/CuratedListAdapter$Callbacks;", "", "onInstrumentRowClicked", "", "instrumentId", "Ljava/util/UUID;", "onCurrencyRowClicked", "currencyPairId", "onFuturesRowClicked", "contractId", "onIndexRowClicked", "indexId", "onQuoteClicked", "onFuturesQuoteClicked", "onInstrumentRowRemoved", "onCryptoRowRemoved", "onFuturesRowRemoved", "onReorderPressed", "itemView", "Landroid/view/View;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCryptoRowRemoved(UUID currencyPairId);

        void onCurrencyRowClicked(UUID currencyPairId);

        void onFuturesQuoteClicked();

        void onFuturesRowClicked(UUID contractId);

        void onFuturesRowRemoved(UUID contractId);

        void onIndexRowClicked(UUID indexId);

        void onInstrumentRowClicked(UUID instrumentId);

        void onInstrumentRowRemoved(UUID instrumentId);

        void onQuoteClicked();

        void onReorderPressed(View itemView);
    }

    public /* synthetic */ CuratedListAdapter(Callbacks callbacks, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(callbacks, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.robinhood.android.lists.ui.CuratedListAdapter$editInstrumentCallbacks$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.robinhood.android.lists.ui.CuratedListAdapter$editCryptoCallbacks$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.robinhood.android.lists.ui.CuratedListAdapter$editFuturesCallbacks$1] */
    public CuratedListAdapter(Callbacks callbacks, boolean z) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        this.isRhList = z;
        this.editInstrumentCallbacks = new RemoveInstrumentRowView.Callbacks() { // from class: com.robinhood.android.lists.ui.CuratedListAdapter$editInstrumentCallbacks$1
            @Override // com.robinhood.android.lists.ui.RemoveInstrumentRowView.Callbacks
            public void onRemoveClicked(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                this.this$0.callbacks.onInstrumentRowRemoved(instrumentId);
            }

            @Override // com.robinhood.android.lists.ui.RemoveInstrumentRowView.Callbacks
            public void onReorderPressed(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0.callbacks.onReorderPressed(view);
            }
        };
        this.editCryptoCallbacks = new RemoveCryptoRowView.Callbacks() { // from class: com.robinhood.android.lists.ui.CuratedListAdapter$editCryptoCallbacks$1
            @Override // com.robinhood.android.lists.ui.RemoveCryptoRowView.Callbacks
            public void onRemoveClicked(UUID currencyPairId) {
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                this.this$0.callbacks.onCryptoRowRemoved(currencyPairId);
            }

            @Override // com.robinhood.android.lists.ui.RemoveCryptoRowView.Callbacks
            public void onReorderPressed(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0.callbacks.onReorderPressed(view);
            }
        };
        this.editFuturesCallbacks = new EditFuturesRowView.Callbacks() { // from class: com.robinhood.android.lists.ui.CuratedListAdapter$editFuturesCallbacks$1
            @Override // com.robinhood.android.lists.ui.EditFuturesRowView.Callbacks
            public void onRemoveClicked(UUID contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                this.this$0.callbacks.onFuturesRowRemoved(contractId);
            }

            @Override // com.robinhood.android.lists.ui.EditFuturesRowView.Callbacks
            public void onReorderPressed(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0.callbacks.onReorderPressed(view);
            }
        };
    }

    /* renamed from: isInEditMode, reason: from getter */
    public final boolean getIsInEditMode() {
        return this.isInEditMode;
    }

    public final void setInEditMode(boolean z) {
        this.isInEditMode = z;
    }

    /* compiled from: CuratedListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/CuratedListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/models/ui/CuratedListEligible;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "getItemId", "Ljava/util/UUID;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallback extends DiffUtil.ItemCallback<CuratedListEligible> {
        public static final DiffCallback INSTANCE = new DiffCallback();
        public static final int $stable = 8;

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(CuratedListEligible oldItem, CuratedListEligible newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(getItemId(oldItem), getItemId(newItem));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(CuratedListEligible oldItem, CuratedListEligible newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem instanceof InstrumentCuratedListEligible) {
                Position position = ((InstrumentCuratedListEligible) oldItem).getPosition();
                Position position2 = ((InstrumentCuratedListEligible) newItem).getPosition();
                if (Intrinsics.areEqual(position != null ? position.getQuantity() : null, position2 != null ? position2.getQuantity() : null)) {
                    if (Intrinsics.areEqual(position != null ? position.getSharesPendingFromBuys() : null, position2 != null ? position2.getSharesPendingFromBuys() : null)) {
                        if (Intrinsics.areEqual(position != null ? position.getSharesHeldForSells() : null, position2 != null ? position2.getSharesHeldForSells() : null)) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (oldItem instanceof CryptoCuratedListEligible) {
                CryptoCuratedListEligible cryptoCuratedListEligible = (CryptoCuratedListEligible) newItem;
                CryptoCuratedListEligible cryptoCuratedListEligible2 = (CryptoCuratedListEligible) oldItem;
                return Intrinsics.areEqual(cryptoCuratedListEligible2.getCuratedListItem().getDisplayName(), cryptoCuratedListEligible.getCuratedListItem().getDisplayName()) && Intrinsics.areEqual(cryptoCuratedListEligible2.getCuratedListItem().getDisplaySymbol(), cryptoCuratedListEligible.getCuratedListItem().getDisplaySymbol()) && Intrinsics.areEqual(cryptoCuratedListEligible2.getCryptoHolding(), cryptoCuratedListEligible.getCryptoHolding());
            }
            if (oldItem instanceof OptionStrategyCuratedListEligible) {
                OptionStrategyCuratedListEligible optionStrategyCuratedListEligible = (OptionStrategyCuratedListEligible) newItem;
                OptionStrategyCuratedListEligible optionStrategyCuratedListEligible2 = (OptionStrategyCuratedListEligible) oldItem;
                return Intrinsics.areEqual(optionStrategyCuratedListEligible2.getCuratedListItem().getDisplayName(), optionStrategyCuratedListEligible.getCuratedListItem().getDisplayName()) && Intrinsics.areEqual(optionStrategyCuratedListEligible2.getStrategyCode(), optionStrategyCuratedListEligible.getStrategyCode());
            }
            if (oldItem instanceof FuturesCuratedListEligible) {
                FuturesCuratedListEligible futuresCuratedListEligible = (FuturesCuratedListEligible) newItem;
                FuturesCuratedListEligible futuresCuratedListEligible2 = (FuturesCuratedListEligible) oldItem;
                return Intrinsics.areEqual(futuresCuratedListEligible2.getCuratedListItem().getDisplayName(), futuresCuratedListEligible.getCuratedListItem().getDisplayName()) && Intrinsics.areEqual(futuresCuratedListEligible2.getPosition(), futuresCuratedListEligible.getPosition());
            }
            if (!(oldItem instanceof IndexCuratedListEligible)) {
                throw new NoWhenBranchMatchedException();
            }
            return Intrinsics.areEqual(((IndexCuratedListEligible) oldItem).getCuratedListItem().getId(), newItem.getCuratedListItem().getId());
        }

        private final UUID getItemId(CuratedListEligible item) {
            return item.getCuratedListItem().getId();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        CuratedListEligible item = getItem(position);
        if (item instanceof InstrumentCuratedListEligible) {
            return this.isInEditMode ? 3 : 1;
        }
        if (item instanceof CryptoCuratedListEligible) {
            return this.isInEditMode ? 2 : 0;
        }
        if (item instanceof OptionStrategyCuratedListEligible) {
            return 4;
        }
        if (item instanceof FuturesCuratedListEligible) {
            return this.isInEditMode ? 6 : 5;
        }
        if (item instanceof IndexCuratedListEligible) {
            return 7;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateViewHolder$lambda$0(CuratedListAdapter curatedListAdapter) {
        curatedListAdapter.callbacks.onQuoteClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateViewHolder$lambda$1(CuratedListAdapter curatedListAdapter) {
        curatedListAdapter.callbacks.onQuoteClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateViewHolder$lambda$2(CuratedListAdapter curatedListAdapter) {
        curatedListAdapter.callbacks.onFuturesQuoteClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateViewHolder$lambda$3(CuratedListAdapter curatedListAdapter) {
        curatedListAdapter.callbacks.onQuoteClicked();
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CryptoRowViewHolder cryptoRowViewHolder;
        InstrumentRowViewHolder instrumentRowViewHolder;
        FuturesRowView futuresRowViewInflate;
        IndexRowView indexRowViewInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 0:
                if (this.isRhList) {
                    cryptoRowViewHolder = new CryptoRowViewHolder(RhListCrypto.INSTANCE.inflate(parent));
                } else {
                    cryptoRowViewHolder = new CryptoRowViewHolder(CryptoRowView.INSTANCE.inflate(parent));
                }
                View view = cryptoRowViewHolder.itemView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.common.views.crypto.CryptoRowView");
                ((CryptoRowView) view).setOnQuoteClick(new Function0() { // from class: com.robinhood.android.lists.ui.CuratedListAdapter$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CuratedListAdapter.onCreateViewHolder$lambda$1(this.f$0);
                    }
                });
                return cryptoRowViewHolder;
            case 1:
                if (this.isRhList) {
                    instrumentRowViewHolder = new InstrumentRowViewHolder(RhListInstrument.INSTANCE.inflate(parent));
                } else {
                    instrumentRowViewHolder = new InstrumentRowViewHolder(InstrumentRowView.INSTANCE.inflate(parent));
                }
                instrumentRowViewHolder.getRowView().setOnQuoteClick(new Function0() { // from class: com.robinhood.android.lists.ui.CuratedListAdapter$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CuratedListAdapter.onCreateViewHolder$lambda$0(this.f$0);
                    }
                });
                instrumentRowViewHolder.getRowView().setPollHistorical(!this.isRhList);
                return instrumentRowViewHolder;
            case 2:
                return new SimpleViewHolder(RemoveCryptoRowView.INSTANCE.inflate(parent));
            case 3:
                return new SimpleViewHolder(RemoveInstrumentRowView.INSTANCE.inflate(parent));
            case 4:
                if (this.isRhList) {
                    throw new IllegalStateException("there are no robinhood options lists");
                }
                return new OptionStrategyRowViewHolder(OptionStrategyRowView.INSTANCE.inflate(parent));
            case 5:
                if (this.isRhList) {
                    futuresRowViewInflate = RhListFutures.INSTANCE.inflate(parent);
                } else {
                    futuresRowViewInflate = FuturesRowView.INSTANCE.inflate(parent);
                }
                SimpleViewHolder simpleViewHolder = new SimpleViewHolder(futuresRowViewInflate);
                View view2 = simpleViewHolder.itemView;
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.common.views.futures.FuturesRowView");
                ((FuturesRowView) view2).setOnQuoteClick(new Function0() { // from class: com.robinhood.android.lists.ui.CuratedListAdapter$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CuratedListAdapter.onCreateViewHolder$lambda$2(this.f$0);
                    }
                });
                return simpleViewHolder;
            case 6:
                return new SimpleViewHolder(EditFuturesRowView.INSTANCE.inflate(parent));
            case 7:
                if (this.isRhList) {
                    indexRowViewInflate = RhListIndex.INSTANCE.inflate(parent);
                } else {
                    indexRowViewInflate = IndexRowView.INSTANCE.inflate(parent);
                }
                SimpleViewHolder simpleViewHolder2 = new SimpleViewHolder(indexRowViewInflate);
                View view3 = simpleViewHolder2.itemView;
                Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.common.views.index.IndexRowView");
                ((IndexRowView) view3).setOnQuoteClick(new Function0() { // from class: com.robinhood.android.lists.ui.CuratedListAdapter$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CuratedListAdapter.onCreateViewHolder$lambda$3(this.f$0);
                    }
                });
                return simpleViewHolder2;
            default:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
                throw new ExceptionsH();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        switch (getItemViewType(position)) {
            case 0:
                CuratedListEligible item = getItem(position);
                Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.robinhood.models.ui.CryptoCuratedListEligible");
                CryptoCuratedListEligible cryptoCuratedListEligible = (CryptoCuratedListEligible) item;
                View view = holder.itemView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.common.views.crypto.CryptoRowView");
                CryptoRowView cryptoRowView = (CryptoRowView) view;
                CuratedListViewMode curatedListViewMode = this.viewMode;
                cryptoRowView.setCustomViewMode(curatedListViewMode != null ? CuratedListViewModes.toSecurityViewMode(curatedListViewMode) : null);
                final CuratedListItem curatedListItem = cryptoCuratedListEligible.getCuratedListItem();
                cryptoRowView.bind(new CryptoRowView.Data(curatedListItem.getId(), curatedListItem.getDisplayName(), curatedListItem.getDisplaySymbol(), cryptoCuratedListEligible.getCryptoHolding()), null);
                OnClickListeners.onClick(cryptoRowView, new Function0() { // from class: com.robinhood.android.lists.ui.CuratedListAdapter$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CuratedListAdapter.onBindViewHolder$lambda$5(this.f$0, curatedListItem);
                    }
                });
                break;
            case 1:
                CuratedListEligible item2 = getItem(position);
                Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.robinhood.models.ui.InstrumentCuratedListEligible");
                final InstrumentCuratedListEligible instrumentCuratedListEligible = (InstrumentCuratedListEligible) item2;
                InstrumentRowView rowView = ((InstrumentRowViewHolder) holder).getRowView();
                CuratedListViewMode curatedListViewMode2 = this.viewMode;
                rowView.setCustomViewMode(curatedListViewMode2 != null ? CuratedListViewModes.toSecurityViewMode(curatedListViewMode2) : null);
                rowView.clearGraphView();
                rowView.bind(InstrumentCuratedListEligibles.toInstrumentRowViewData(instrumentCuratedListEligible));
                OnClickListeners.onClick(rowView, new Function0() { // from class: com.robinhood.android.lists.ui.CuratedListAdapter$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CuratedListAdapter.onBindViewHolder$lambda$4(this.f$0, instrumentCuratedListEligible);
                    }
                });
                break;
            case 2:
                CuratedListEligible item3 = getItem(position);
                Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type com.robinhood.models.ui.CryptoCuratedListEligible");
                CryptoCuratedListEligible cryptoCuratedListEligible2 = (CryptoCuratedListEligible) item3;
                CuratedListItem curatedListItem2 = cryptoCuratedListEligible2.getCuratedListItem();
                CryptoRowView.Data data = new CryptoRowView.Data(curatedListItem2.getId(), curatedListItem2.getDisplayName(), curatedListItem2.getDisplaySymbol(), cryptoCuratedListEligible2.getCryptoHolding());
                View view2 = holder.itemView;
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.lists.ui.RemoveCryptoRowView");
                ((RemoveCryptoRowView) view2).bind(data, this.editCryptoCallbacks);
                break;
            case 3:
                CuratedListEligible item4 = getItem(position);
                Intrinsics.checkNotNull(item4, "null cannot be cast to non-null type com.robinhood.models.ui.InstrumentCuratedListEligible");
                InstrumentRowView.Data instrumentRowViewData = InstrumentCuratedListEligibles.toInstrumentRowViewData((InstrumentCuratedListEligible) item4);
                View view3 = holder.itemView;
                Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.lists.ui.RemoveInstrumentRowView");
                ((RemoveInstrumentRowView) view3).bind(instrumentRowViewData, this.editInstrumentCallbacks);
                break;
            case 4:
                CuratedListEligible item5 = getItem(position);
                Intrinsics.checkNotNull(item5, "null cannot be cast to non-null type com.robinhood.models.ui.OptionStrategyCuratedListEligible");
                OptionStrategyCuratedListEligible optionStrategyCuratedListEligible = (OptionStrategyCuratedListEligible) item5;
                OptionStrategyRowView rowView2 = ((OptionStrategyRowViewHolder) holder).getRowView();
                CuratedListItem curatedListItem3 = optionStrategyCuratedListEligible.getCuratedListItem();
                UiOptionStrategyInfo optionStrategyInfo = optionStrategyCuratedListEligible.getOptionStrategyInfo();
                rowView2.bind(new OptionStrategyRowView.Data(curatedListItem3, false, optionStrategyInfo != null ? optionStrategyInfo.getOptionChain() : null, optionStrategyCuratedListEligible.getStrategyCode(), optionStrategyCuratedListEligible.getOptionStrategyInfo(), 2, null));
                break;
            case 5:
                CuratedListEligible item6 = getItem(position);
                Intrinsics.checkNotNull(item6, "null cannot be cast to non-null type com.robinhood.models.ui.FuturesCuratedListEligible");
                final FuturesCuratedListEligible futuresCuratedListEligible = (FuturesCuratedListEligible) item6;
                View view4 = holder.itemView;
                Intrinsics.checkNotNull(view4, "null cannot be cast to non-null type com.robinhood.android.common.views.futures.FuturesRowView");
                FuturesRowView futuresRowView = (FuturesRowView) view4;
                CuratedListViewMode curatedListViewMode3 = this.viewMode;
                futuresRowView.setViewMode(curatedListViewMode3 != null ? CuratedListViewModes.toSecurityViewMode(curatedListViewMode3) : null);
                futuresRowView.bind(futuresCuratedListEligible.getId(), futuresCuratedListEligible.getCuratedListItem().getDisplayName(), futuresCuratedListEligible.getCuratedListItem().getDisplaySymbol(), futuresCuratedListEligible.getPosition(), this.isRhList);
                OnClickListeners.onClick(futuresRowView, new Function0() { // from class: com.robinhood.android.lists.ui.CuratedListAdapter$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CuratedListAdapter.onBindViewHolder$lambda$6(this.f$0, futuresCuratedListEligible);
                    }
                });
                break;
            case 6:
                CuratedListEligible item7 = getItem(position);
                Intrinsics.checkNotNull(item7, "null cannot be cast to non-null type com.robinhood.models.ui.FuturesCuratedListEligible");
                FuturesCuratedListEligible futuresCuratedListEligible2 = (FuturesCuratedListEligible) item7;
                View view5 = holder.itemView;
                Intrinsics.checkNotNull(view5, "null cannot be cast to non-null type com.robinhood.android.lists.ui.EditFuturesRowView");
                EditFuturesRowView editFuturesRowView = (EditFuturesRowView) view5;
                UUID id = futuresCuratedListEligible2.getId();
                String displayName = futuresCuratedListEligible2.getCuratedListItem().getDisplayName();
                String displaySymbol = futuresCuratedListEligible2.getCuratedListItem().getDisplaySymbol();
                UiFuturesPosition position2 = futuresCuratedListEligible2.getPosition();
                CuratedListViewMode curatedListViewMode4 = this.viewMode;
                editFuturesRowView.bind(id, displayName, displaySymbol, position2, curatedListViewMode4 != null ? CuratedListViewModes.toSecurityViewMode(curatedListViewMode4) : null, this.editFuturesCallbacks, this.isRhList);
                break;
            case 7:
                CuratedListEligible item8 = getItem(position);
                Intrinsics.checkNotNull(item8, "null cannot be cast to non-null type com.robinhood.models.ui.IndexCuratedListEligible");
                IndexCuratedListEligible indexCuratedListEligible = (IndexCuratedListEligible) item8;
                View view6 = holder.itemView;
                Intrinsics.checkNotNull(view6, "null cannot be cast to non-null type com.robinhood.android.common.views.index.IndexRowView");
                IndexRowView indexRowView = (IndexRowView) view6;
                CuratedListViewMode curatedListViewMode5 = this.viewMode;
                indexRowView.setViewMode(curatedListViewMode5 != null ? CuratedListViewModes.toSecurityViewMode(curatedListViewMode5) : null);
                final CuratedListItem curatedListItem4 = indexCuratedListEligible.getCuratedListItem();
                indexRowView.bind(curatedListItem4.getId(), curatedListItem4.getDisplayName(), curatedListItem4.getDisplaySymbol());
                OnClickListeners.onClick(indexRowView, new Function0() { // from class: com.robinhood.android.lists.ui.CuratedListAdapter$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CuratedListAdapter.onBindViewHolder$lambda$8$lambda$7(this.f$0, curatedListItem4);
                    }
                });
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4(CuratedListAdapter curatedListAdapter, InstrumentCuratedListEligible instrumentCuratedListEligible) {
        curatedListAdapter.callbacks.onInstrumentRowClicked(instrumentCuratedListEligible.getCuratedListItem().getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$5(CuratedListAdapter curatedListAdapter, CuratedListItem curatedListItem) {
        curatedListAdapter.callbacks.onCurrencyRowClicked(curatedListItem.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6(CuratedListAdapter curatedListAdapter, FuturesCuratedListEligible futuresCuratedListEligible) {
        curatedListAdapter.callbacks.onFuturesRowClicked(futuresCuratedListEligible.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$8$lambda$7(CuratedListAdapter curatedListAdapter, CuratedListItem curatedListItem) {
        curatedListAdapter.callbacks.onIndexRowClicked(curatedListItem.getId());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.ListAdapter
    public CuratedListEligible getItem(int position) {
        Object item = super.getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        return (CuratedListEligible) item;
    }

    public final void setViewMode(CuratedListViewMode viewMode) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        this.viewMode = viewMode;
        notifyDataSetChanged();
    }

    /* compiled from: CuratedListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/CuratedListAdapter$RhListInstrument;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/views/InstrumentRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhListInstrument implements Inflater<InstrumentRowView> {
        private final /* synthetic */ Inflater<InstrumentRowView> $$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_row_rh_list_equity);
        public static final RhListInstrument INSTANCE = new RhListInstrument();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public InstrumentRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (InstrumentRowView) this.$$delegate_0.inflate(parent);
        }

        private RhListInstrument() {
        }
    }

    /* compiled from: CuratedListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/CuratedListAdapter$RhListCrypto;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/views/crypto/CryptoRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhListCrypto implements Inflater<CryptoRowView> {
        private final /* synthetic */ Inflater<CryptoRowView> $$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_row_rh_list_crypto);
        public static final RhListCrypto INSTANCE = new RhListCrypto();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CryptoRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CryptoRowView) this.$$delegate_0.inflate(parent);
        }

        private RhListCrypto() {
        }
    }

    /* compiled from: CuratedListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/CuratedListAdapter$RhListFutures;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/views/futures/FuturesRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhListFutures implements Inflater<FuturesRowView> {
        private final /* synthetic */ Inflater<FuturesRowView> $$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_row_rh_list_futures);
        public static final RhListFutures INSTANCE = new RhListFutures();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public FuturesRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (FuturesRowView) this.$$delegate_0.inflate(parent);
        }

        private RhListFutures() {
        }
    }

    /* compiled from: CuratedListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/CuratedListAdapter$RhListIndex;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/views/index/IndexRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhListIndex implements Inflater<IndexRowView> {
        private final /* synthetic */ Inflater<IndexRowView> $$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_row_rh_list_index);
        public static final RhListIndex INSTANCE = new RhListIndex();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public IndexRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (IndexRowView) this.$$delegate_0.inflate(parent);
        }

        private RhListIndex() {
        }
    }
}
