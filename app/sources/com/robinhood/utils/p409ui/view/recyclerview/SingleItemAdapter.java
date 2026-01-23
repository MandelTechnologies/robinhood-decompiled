package com.robinhood.utils.p409ui.view.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SingleItemAdapter.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000  *\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00060\u0005:\u0001 B'\b\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0015J\u001c\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u001d\u001a\u00020\u0015J#\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u001e\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010\u001fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u0004\u0018\u00018\u00012\b\u0010\r\u001a\u0004\u0018\u00018\u0001@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "ViewT", "Landroid/view/View;", "ItemT", "", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "inflater", "Lcom/robinhood/utils/ui/view/Inflater;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "<init>", "(Lcom/robinhood/utils/ui/view/Inflater;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "value", WebsocketGatewayConstants.DATA_KEY, "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;Ljava/lang/Object;)V", "Companion", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public class SingleItemAdapter<ViewT extends View, ItemT> extends RecyclerView.Adapter<GenericViewHolder<? extends ViewT>> {
    private ItemT data;
    private final DiffUtil.ItemCallback<? super ItemT> diffCallback;
    private final Inflater<ViewT> inflater;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    protected void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, ItemT item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected SingleItemAdapter(Inflater<? extends ViewT> inflater, DiffUtil.ItemCallback<? super ItemT> diffCallback) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.inflater = inflater;
        this.diffCallback = diffCallback;
    }

    public final ItemT getData() {
        return this.data;
    }

    public final void setData(ItemT itemt) {
        ItemT itemt2 = this.data;
        if (itemt != null && itemt2 == null) {
            this.data = itemt;
            notifyItemInserted(0);
            return;
        }
        if (itemt == null && itemt2 != null) {
            this.data = null;
            notifyItemRemoved(0);
            return;
        }
        if (itemt == null || itemt2 == null) {
            return;
        }
        this.data = itemt;
        if (this.diffCallback.areItemsTheSame(itemt2, itemt)) {
            if (this.diffCallback.areContentsTheSame(itemt2, itemt)) {
                return;
            }
            notifyItemChanged(0);
        } else {
            notifyItemRemoved(0);
            notifyItemInserted(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public final int getSize() {
        return this.data == null ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final GenericViewHolder<ViewT> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new GenericViewHolder<>(this.inflater.inflate(parent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemT itemt = this.data;
        Intrinsics.checkNotNull(itemt);
        onBindViewHolder(holder, (GenericViewHolder<? extends ViewT>) itemt);
    }

    /* compiled from: SingleItemAdapter.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0002\u0010\u0006*\u00020\b\"\b\b\u0003\u0010\u0007*\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\f2\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010Je\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0002\u0010\u0006*\u00020\b\"\b\b\u0003\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00122\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\f2\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010JP\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0012\b\u0002\u0010\u0006*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\b\b\u0003\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00122\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\fJn\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00150\u0005\"\u0012\b\u0002\u0010\u0006*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\b\b\u0003\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00122\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00150\f2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0015JS\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u000f0\u0005\"\b\b\u0002\u0010\u0006*\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u000f0\f2\u0019\b\u0002\u0010\r\u001a\u0013\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u000f0\u0018¢\u0006\u0002\b\u0010JW\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u000f0\u0005\"\b\b\u0002\u0010\u0006*\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00122\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u000f0\f2\u0019\b\u0002\u0010\r\u001a\u0013\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u000f0\u0018¢\u0006\u0002\b\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter$Companion;", "", "<init>", "()V", "of", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "ViewT", "ItemT", "Landroid/view/View;", "layoutResId", "", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "bind", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "inflater", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/utils/ui/view/Bindable;", "ofOptional", "Lcom/robinhood/utils/Optional;", "initialData", "ofUnit", "Lkotlin/Function1;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SingleItemAdapter of$default(Companion companion, int i, DiffUtil.ItemCallback itemCallback, Function2 function2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                itemCallback = DiffCallbacks.Single.INSTANCE;
            }
            return companion.m2991of(i, itemCallback, function2);
        }

        /* renamed from: of */
        public final <ViewT extends View, ItemT> SingleItemAdapter<ViewT, ItemT> m2991of(int layoutResId, DiffUtil.ItemCallback<? super ItemT> diffCallback, Function2<? super ViewT, ? super ItemT, Unit> bind) {
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            Intrinsics.checkNotNullParameter(bind, "bind");
            return m2993of(Inflater.INSTANCE.include(layoutResId), diffCallback, bind);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SingleItemAdapter of$default(Companion companion, Inflater inflater, DiffUtil.ItemCallback itemCallback, Function2 function2, int i, Object obj) {
            if ((i & 2) != 0) {
                itemCallback = DiffCallbacks.Single.INSTANCE;
            }
            return companion.m2993of(inflater, itemCallback, function2);
        }

        /* renamed from: of */
        public final <ViewT extends View, ItemT> SingleItemAdapter<ViewT, ItemT> m2993of(final Inflater<? extends ViewT> inflater, final DiffUtil.ItemCallback<? super ItemT> diffCallback, final Function2<? super ViewT, ? super ItemT, Unit> bind) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            Intrinsics.checkNotNullParameter(bind, "bind");
            return (SingleItemAdapter<ViewT, ItemT>) new SingleItemAdapter<ViewT, ItemT>(inflater, diffCallback) { // from class: com.robinhood.utils.ui.view.recyclerview.SingleItemAdapter$Companion$of$1
                @Override // com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter
                protected void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, ItemT item) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    Intrinsics.checkNotNullParameter(item, "item");
                    bind.invoke(holder.getView(), item);
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SingleItemAdapter of$default(Companion companion, Inflater inflater, DiffUtil.ItemCallback itemCallback, int i, Object obj) {
            if ((i & 2) != 0) {
                itemCallback = DiffCallbacks.Single.INSTANCE;
            }
            return companion.m2992of(inflater, itemCallback);
        }

        /* renamed from: of */
        public final <ViewT extends View & Bindable<? super ItemT>, ItemT> SingleItemAdapter<ViewT, ItemT> m2992of(final Inflater<? extends ViewT> inflater, final DiffUtil.ItemCallback<? super ItemT> diffCallback) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            return (SingleItemAdapter<ViewT, ItemT>) new SingleItemAdapter<ViewT, ItemT>(inflater, diffCallback) { // from class: com.robinhood.utils.ui.view.recyclerview.SingleItemAdapter$Companion$of$2
                @Override // com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter
                protected void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, ItemT item) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    Intrinsics.checkNotNullParameter(item, "item");
                    ((Bindable) holder.getView()).bind(item);
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SingleItemAdapter ofOptional$default(Companion companion, Inflater inflater, DiffUtil.ItemCallback itemCallback, Optional optional, int i, Object obj) {
            if ((i & 2) != 0) {
                itemCallback = DiffCallbacks.Single.INSTANCE;
            }
            if ((i & 4) != 0) {
                optional = Optional2.INSTANCE;
            }
            return companion.ofOptional(inflater, itemCallback, optional);
        }

        public final <ViewT extends View & Bindable<? super ItemT>, ItemT> SingleItemAdapter<ViewT, Optional<ItemT>> ofOptional(final Inflater<? extends ViewT> inflater, final DiffUtil.ItemCallback<? super Optional<? extends ItemT>> diffCallback, final Optional<? extends ItemT> initialData) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            return (SingleItemAdapter<ViewT, Optional<ItemT>>) new SingleItemAdapter<ViewT, Optional<? extends ItemT>>(initialData, inflater, diffCallback) { // from class: com.robinhood.utils.ui.view.recyclerview.SingleItemAdapter$Companion$ofOptional$1
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(inflater, diffCallback);
                    setData(initialData);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter
                public void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, Optional<? extends ItemT> item) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    Intrinsics.checkNotNullParameter(item, "item");
                    ItemT orNull = item.getOrNull();
                    if (orNull != null) {
                        ((Bindable) holder.getView()).bind(orNull);
                    }
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SingleItemAdapter ofUnit$default(Companion companion, int i, DiffUtil.ItemCallback itemCallback, Function1 function1, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                itemCallback = DiffCallbacks.Single.INSTANCE;
            }
            if ((i2 & 4) != 0) {
                function1 = new Function1() { // from class: com.robinhood.utils.ui.view.recyclerview.SingleItemAdapter$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SingleItemAdapter.Companion.ofUnit$lambda$0((View) obj2);
                    }
                };
            }
            return companion.ofUnit(i, (DiffUtil.ItemCallback<? super Unit>) itemCallback, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ofUnit$lambda$0(View view) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            return Unit.INSTANCE;
        }

        public final <ViewT extends View> SingleItemAdapter<ViewT, Unit> ofUnit(int layoutResId, DiffUtil.ItemCallback<? super Unit> diffCallback, Function1<? super ViewT, Unit> bind) {
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            Intrinsics.checkNotNullParameter(bind, "bind");
            return ofUnit(Inflater.INSTANCE.include(layoutResId), diffCallback, bind);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SingleItemAdapter ofUnit$default(Companion companion, Inflater inflater, DiffUtil.ItemCallback itemCallback, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                itemCallback = DiffCallbacks.Single.INSTANCE;
            }
            if ((i & 4) != 0) {
                function1 = new Function1() { // from class: com.robinhood.utils.ui.view.recyclerview.SingleItemAdapter$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SingleItemAdapter.Companion.ofUnit$lambda$1((View) obj2);
                    }
                };
            }
            return companion.ofUnit(inflater, (DiffUtil.ItemCallback<? super Unit>) itemCallback, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ofUnit$lambda$1(View view) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            return Unit.INSTANCE;
        }

        public final <ViewT extends View> SingleItemAdapter<ViewT, Unit> ofUnit(Inflater<? extends ViewT> inflater, DiffUtil.ItemCallback<? super Unit> diffCallback, final Function1<? super ViewT, Unit> bind) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            Intrinsics.checkNotNullParameter(bind, "bind");
            SingleItemAdapter<ViewT, Unit> singleItemAdapterM2993of = m2993of(inflater, diffCallback, new Function2() { // from class: com.robinhood.utils.ui.view.recyclerview.SingleItemAdapter$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SingleItemAdapter.Companion.ofUnit$lambda$2(bind, (View) obj, (Unit) obj2);
                }
            });
            singleItemAdapterM2993of.setData(Unit.INSTANCE);
            return singleItemAdapterM2993of;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ofUnit$lambda$2(Function1 function1, View of, Unit it) {
            Intrinsics.checkNotNullParameter(of, "$this$of");
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(of);
            return Unit.INSTANCE;
        }
    }
}
