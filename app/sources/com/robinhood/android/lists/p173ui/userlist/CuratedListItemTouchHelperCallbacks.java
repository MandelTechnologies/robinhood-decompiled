package com.robinhood.android.lists.p173ui.userlist;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks;
import com.robinhood.android.common.views.BaseInstrumentRowView;
import com.robinhood.android.common.views.InstrumentRowView;
import com.robinhood.android.common.views.crypto.CryptoRowView;
import com.robinhood.android.common.views.futures.FuturesRowView;
import com.robinhood.android.lists.p173ui.CuratedListAdapter;
import com.robinhood.android.lists.p173ui.EditFuturesRowView;
import com.robinhood.android.lists.p173ui.RemoveCryptoRowView;
import com.robinhood.android.lists.p173ui.RemoveInstrumentRowView;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.utils.Preconditions;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: CuratedListItemTouchHelperCallbacks.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010BÑ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00126\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\b\u00126\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000f0\b\u0012#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0014\u0012#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\rH\u0016J\u0010\u0010*\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020(H\u0014J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010'\u001a\u00020(H\u0016J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%2\u0006\u0010/\u001a\u00020\u0019H\u0016R>\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001d¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListItemTouchHelperCallbacks;", "Lcom/robinhood/android/common/ui/BaseCuratedListItemTouchHelperCallbacks;", "Lcom/robinhood/models/ui/CuratedListEligible;", "context", "Landroid/content/Context;", "curatedListAdapter", "Lcom/robinhood/android/lists/ui/CuratedListAdapter;", "onItemDropped", "Lkotlin/Function2;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "itemId", "", "position", "", "onItemRemoved", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "assetType", "onItemBuy", "Lkotlin/Function1;", "onItemBuySwipeStarted", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/lists/ui/CuratedListAdapter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "enableLongPress", "", "getEnableLongPress", "()Z", "setEnableLongPress", "(Z)V", "isEmptyList", "setEmptyList", "enableSwipeToBuy", "getEnableSwipeToBuy", "setEnableSwipeToBuy", "getMovementFlags", "view", "Landroid/view/View;", "onSwiped", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "direction", "onRightSwipeStarted", "clearView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "showDivider", "show", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CuratedListItemTouchHelperCallbacks extends BaseCuratedListItemTouchHelperCallbacks<CuratedListEligible> {
    private boolean enableLongPress;
    private boolean enableSwipeToBuy;
    private boolean isEmptyList;
    private final Function1<UUID, Unit> onItemBuy;
    private final Function1<UUID, Unit> onItemBuySwipeStarted;
    private final Function2<UUID, Integer, Unit> onItemDropped;
    private final Function2<UUID, Asset.AssetType, Unit> onItemRemoved;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Set<KClass<? extends ConstraintLayout>> SUPPORTED_VIEWS = SetsKt.setOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(InstrumentRowView.class), Reflection.getOrCreateKotlinClass(CryptoRowView.class), Reflection.getOrCreateKotlinClass(FuturesRowView.class), Reflection.getOrCreateKotlinClass(RemoveInstrumentRowView.class), Reflection.getOrCreateKotlinClass(RemoveCryptoRowView.class), Reflection.getOrCreateKotlinClass(EditFuturesRowView.class)});

    public /* synthetic */ CuratedListItemTouchHelperCallbacks(Context context, CuratedListAdapter curatedListAdapter, Function2 function2, Function2 function22, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, curatedListAdapter, function2, function22, (i & 16) != 0 ? new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListItemTouchHelperCallbacks$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemTouchHelperCallbacks._init_$lambda$0((UUID) obj);
            }
        } : function1, (i & 32) != 0 ? new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListItemTouchHelperCallbacks$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemTouchHelperCallbacks._init_$lambda$1((UUID) obj);
            }
        } : function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CuratedListItemTouchHelperCallbacks(Context context, CuratedListAdapter curatedListAdapter, Function2<? super UUID, ? super Integer, Unit> onItemDropped, Function2<? super UUID, ? super Asset.AssetType, Unit> onItemRemoved, Function1<? super UUID, Unit> onItemBuy, Function1<? super UUID, Unit> onItemBuySwipeStarted) {
        super(context, curatedListAdapter);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(curatedListAdapter, "curatedListAdapter");
        Intrinsics.checkNotNullParameter(onItemDropped, "onItemDropped");
        Intrinsics.checkNotNullParameter(onItemRemoved, "onItemRemoved");
        Intrinsics.checkNotNullParameter(onItemBuy, "onItemBuy");
        Intrinsics.checkNotNullParameter(onItemBuySwipeStarted, "onItemBuySwipeStarted");
        this.onItemDropped = onItemDropped;
        this.onItemRemoved = onItemRemoved;
        this.onItemBuy = onItemBuy;
        this.onItemBuySwipeStarted = onItemBuySwipeStarted;
        this.enableLongPress = true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    public boolean getEnableLongPress() {
        return this.enableLongPress;
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    public void setEnableLongPress(boolean z) {
        this.enableLongPress = z;
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    /* renamed from: isEmptyList, reason: from getter */
    public boolean getIsEmptyList() {
        return this.isEmptyList;
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    public void setEmptyList(boolean z) {
        this.isEmptyList = z;
    }

    public final boolean getEnableSwipeToBuy() {
        return this.enableSwipeToBuy;
    }

    public final void setEnableSwipeToBuy(boolean z) {
        this.enableSwipeToBuy = z;
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    public int getMovementFlags(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z = view instanceof InstrumentRowView;
        if (z || (view instanceof CryptoRowView) || (view instanceof FuturesRowView)) {
            return ItemTouchHelper.Callback.makeMovementFlags(3, (z && this.enableSwipeToBuy) ? 48 : 16);
        }
        if ((view instanceof RemoveInstrumentRowView) || (view instanceof RemoveCryptoRowView) || (view instanceof EditFuturesRowView)) {
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }
        return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (!(itemView instanceof InstrumentRowView)) {
            if (itemView instanceof CryptoRowView) {
                this.onItemRemoved.invoke(((CryptoRowView) itemView).getData().getCurrencyPairId(), Asset.AssetType.CURRENCY_PAIR);
                return;
            } else {
                if (itemView instanceof FuturesRowView) {
                    this.onItemRemoved.invoke(((FuturesRowView) itemView).getContractId(), Asset.AssetType.FUTURES);
                    return;
                }
                return;
            }
        }
        if (direction == 32) {
            this.onItemBuy.invoke(((InstrumentRowView) itemView).getInstrumentId());
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = viewHolder.getBindingAdapter();
            if (bindingAdapter != null) {
                bindingAdapter.notifyItemChanged(viewHolder.getBindingAdapterPosition());
                return;
            }
            return;
        }
        this.onItemRemoved.invoke(((InstrumentRowView) itemView).getInstrumentId(), Asset.AssetType.INSTRUMENT);
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    protected void onRightSwipeStarted(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View view = viewHolder.itemView;
        InstrumentRowView instrumentRowView = view instanceof InstrumentRowView ? (InstrumentRowView) view : null;
        if (instrumentRowView == null) {
            return;
        }
        this.onItemBuySwipeStarted.invoke(instrumentRowView.getInstrumentId());
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        UUID contractId;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (itemView instanceof InstrumentRowView) {
            contractId = ((InstrumentRowView) itemView).getInstrumentId();
        } else if (itemView instanceof CryptoRowView) {
            contractId = ((CryptoRowView) itemView).getData().getCurrencyPairId();
        } else if (itemView instanceof FuturesRowView) {
            contractId = ((FuturesRowView) itemView).getContractId();
        } else if (itemView instanceof RemoveInstrumentRowView) {
            contractId = ((RemoveInstrumentRowView) itemView).getInstrumentId();
        } else if (itemView instanceof RemoveCryptoRowView) {
            contractId = ((RemoveCryptoRowView) itemView).getCurrencyPairId();
        } else {
            if (!(itemView instanceof EditFuturesRowView)) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(itemView.getClass());
                throw new ExceptionsH();
            }
            contractId = ((EditFuturesRowView) itemView).getContractId();
        }
        if (INSTANCE.isSupported(itemView)) {
            clearBackground(itemView);
        }
        Function2<UUID, Integer, Unit> function2 = this.onItemDropped;
        Intrinsics.checkNotNull(contractId);
        function2.invoke(contractId, Integer.valueOf(viewHolder.getAdapterPosition()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    public void showDivider(View view, boolean show) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof BaseInstrumentRowView) {
            ((BaseInstrumentRowView) view).showDivider(show);
            return;
        }
        if (view instanceof RemoveInstrumentRowView) {
            ((RemoveInstrumentRowView) view).showDivider(show);
        } else if (view instanceof RemoveCryptoRowView) {
            ((RemoveCryptoRowView) view).showDivider(show);
        } else if (view instanceof EditFuturesRowView) {
            ((EditFuturesRowView) view).showDivider(show);
        }
    }

    /* compiled from: CuratedListItemTouchHelperCallbacks.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u00020\t*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListItemTouchHelperCallbacks$Companion;", "", "<init>", "()V", "SUPPORTED_VIEWS", "", "Lkotlin/reflect/KClass;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "isSupported", "", "Landroid/view/View;", "(Landroid/view/View;)Z", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSupported(View view) {
            return CollectionsKt.contains(CuratedListItemTouchHelperCallbacks.SUPPORTED_VIEWS, Reflection.getOrCreateKotlinClass(view.getClass()));
        }
    }
}
