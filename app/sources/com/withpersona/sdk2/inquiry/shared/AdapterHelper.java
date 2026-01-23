package com.withpersona.sdk2.inquiry.shared;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: AdapterHelper.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001NBµ\u0001\u00126\u0010\t\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00128\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u0012:\b\u0002\u0010\u000b\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JÏ\u0001\u0010%\u001a\u00020!\"\b\b\u0001\u0010\u0013*\u00028\u0000\"\b\b\u0002\u0010\u0015*\u00020\u00142\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u00162\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u00192K\u0010\"\u001aG\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u00192%\b\u0002\u0010$\u001a\u001f\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020!\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u000e¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020!2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b.\u0010/J9\u00106\u001a\u00020!2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\n\u00103\u001a\u0006\u0012\u0002\b\u0003022\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020!\u0018\u000104¢\u0006\u0004\b6\u00107RD\u0010\t\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108RD\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00108RF\u0010\u000b\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R\u001c\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00109R\"\u0010<\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00018\u00008\u00000:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R*\u0010B\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR&\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00028\u0000008F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010M\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006O"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/AdapterHelper;", "", "T", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "areItemsTheSame", "areContentsTheSame", "getChangePayload", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "", "position", "Lcom/withpersona/sdk2/inquiry/shared/AdapterHelper$ItemInfo;", "getItemInfoFromPosition", "(I)Lcom/withpersona/sdk2/inquiry/shared/AdapterHelper$ItemInfo;", "R", "Landroidx/viewbinding/ViewBinding;", "VB", "Lkotlin/reflect/KClass;", "clazz", "viewBindingClass", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "inflateFn", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "b", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "h", "", "bindViewHolder", "Lkotlin/Function1;", "onViewCreated", "addItemTypeInternal", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "(I)I", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "", "newItems", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "Lkotlin/Function0;", "cb", "setItems", "(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView$Adapter;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/jvm/functions/Function2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "", "itemInfos", "Ljava/util/List;", "", "itemInfoByItemType", "Ljava/util/Map;", "itemInfoByViewType", "Lcom/withpersona/sdk2/inquiry/shared/ViewTypeGenerator;", "viewTypeGenerator", "Lcom/withpersona/sdk2/inquiry/shared/ViewTypeGenerator;", "getItems", "()Ljava/util/List;", "items", "getItemCount", "()I", "itemCount", "ItemInfo", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class AdapterHelper<T> {
    private RecyclerView.Adapter<?> adapter;
    private final Function2<T, T, Boolean> areContentsTheSame;
    private final Function2<T, T, Boolean> areItemsTheSame;
    private final AsyncListDiffer<T> differ;
    private final Function2<T, T, Object> getChangePayload;
    private final Map<KClass<?>, ItemInfo<T>> itemInfoByItemType;
    private final Map<Integer, ItemInfo<T>> itemInfoByViewType;
    private final List<ItemInfo<T>> itemInfos;
    private final AdapterHelper4 viewTypeGenerator;

    /* JADX WARN: Multi-variable type inference failed */
    public AdapterHelper(Function2<? super T, ? super T, Boolean> areItemsTheSame, Function2<? super T, ? super T, Boolean> areContentsTheSame, Function2<? super T, ? super T, ? extends Object> getChangePayload) {
        Intrinsics.checkNotNullParameter(areItemsTheSame, "areItemsTheSame");
        Intrinsics.checkNotNullParameter(areContentsTheSame, "areContentsTheSame");
        Intrinsics.checkNotNullParameter(getChangePayload, "getChangePayload");
        this.areItemsTheSame = areItemsTheSame;
        this.areContentsTheSame = areContentsTheSame;
        this.getChangePayload = getChangePayload;
        this.differ = new AsyncListDiffer<>(new ListUpdateCallback(this) { // from class: com.withpersona.sdk2.inquiry.shared.AdapterHelper$differ$1
            final /* synthetic */ AdapterHelper<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onInserted(int position, int count) {
                RecyclerView.Adapter adapter = ((AdapterHelper) this.this$0).adapter;
                if (adapter != null) {
                    adapter.notifyItemRangeInserted(position, count);
                }
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onRemoved(int position, int count) {
                RecyclerView.Adapter adapter = ((AdapterHelper) this.this$0).adapter;
                if (adapter != null) {
                    adapter.notifyItemRangeRemoved(position, count);
                }
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onMoved(int fromPosition, int toPosition) {
                RecyclerView.Adapter adapter = ((AdapterHelper) this.this$0).adapter;
                if (adapter != null) {
                    adapter.notifyItemMoved(fromPosition, toPosition);
                }
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onChanged(int position, int count, Object payload) {
                RecyclerView.Adapter adapter = ((AdapterHelper) this.this$0).adapter;
                if (adapter != null) {
                    adapter.notifyItemRangeChanged(position, count, payload);
                }
            }
        }, new AsyncDifferConfig.Builder(new DiffUtil.ItemCallback<T>(this) { // from class: com.withpersona.sdk2.inquiry.shared.AdapterHelper$differ$2
            final /* synthetic */ AdapterHelper<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(T oldItem, T newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return ((Boolean) ((AdapterHelper) this.this$0).areItemsTheSame.invoke(oldItem, newItem)).booleanValue();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areContentsTheSame(T oldItem, T newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return ((Boolean) ((AdapterHelper) this.this$0).areContentsTheSame.invoke(oldItem, newItem)).booleanValue();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public Object getChangePayload(T oldItem, T newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return ((AdapterHelper) this.this$0).getChangePayload.invoke(oldItem, newItem);
            }
        }).build());
        this.itemInfos = new ArrayList();
        this.itemInfoByItemType = new LinkedHashMap();
        this.itemInfoByViewType = new LinkedHashMap();
        this.viewTypeGenerator = AdapterHelper5.INSTANCE.create();
    }

    public /* synthetic */ AdapterHelper(Function2 function2, Function2 function22, Function2 function23, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i & 2) != 0 ? new Function2() { // from class: com.withpersona.sdk2.inquiry.shared.AdapterHelper$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(AdapterHelper._init_$lambda$0(obj, obj2));
            }
        } : function22, (i & 4) != 0 ? new Function2() { // from class: com.withpersona.sdk2.inquiry.shared.AdapterHelper.2
            @Override // kotlin.jvm.functions.Function2
            public final Void invoke(T old, T t) {
                Intrinsics.checkNotNullParameter(old, "old");
                Intrinsics.checkNotNullParameter(t, "new");
                return null;
            }
        } : function23);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Object oldItem, Object newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    /* compiled from: AdapterHelper.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B±\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b\u0012K\u0010\u0014\u001aG\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\b\u0012#\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R/\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\\\u0010\u0014\u001aG\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b)\u0010(R4\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/AdapterHelper$ItemInfo;", "T", "", "", "viewType", "Lkotlin/reflect/KClass;", "Landroidx/viewbinding/ViewBinding;", "viewBindingClass", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "inflateFn", "Lkotlin/ParameterName;", "name", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "b", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "h", "", "bindViewHolder", "Lkotlin/Function1;", "onViewCreated", "<init>", "(ILkotlin/reflect/KClass;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getViewType", "Lkotlin/reflect/KClass;", "getViewBindingClass", "()Lkotlin/reflect/KClass;", "Lkotlin/jvm/functions/Function3;", "getInflateFn", "()Lkotlin/jvm/functions/Function3;", "getBindViewHolder", "Lkotlin/jvm/functions/Function1;", "getOnViewCreated", "()Lkotlin/jvm/functions/Function1;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ItemInfo<T> {
        private final Function3<T, ViewBinding, RecyclerView.ViewHolder, Unit> bindViewHolder;
        private final Function3<LayoutInflater, ViewGroup, Boolean, ViewBinding> inflateFn;
        private final Function1<ViewBinding, Unit> onViewCreated;
        private final KClass<? extends ViewBinding> viewBindingClass;
        private final int viewType;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemInfo)) {
                return false;
            }
            ItemInfo itemInfo = (ItemInfo) other;
            return this.viewType == itemInfo.viewType && Intrinsics.areEqual(this.viewBindingClass, itemInfo.viewBindingClass) && Intrinsics.areEqual(this.inflateFn, itemInfo.inflateFn) && Intrinsics.areEqual(this.bindViewHolder, itemInfo.bindViewHolder) && Intrinsics.areEqual(this.onViewCreated, itemInfo.onViewCreated);
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.viewType) * 31) + this.viewBindingClass.hashCode()) * 31) + this.inflateFn.hashCode()) * 31) + this.bindViewHolder.hashCode()) * 31;
            Function1<ViewBinding, Unit> function1 = this.onViewCreated;
            return iHashCode + (function1 == null ? 0 : function1.hashCode());
        }

        public String toString() {
            return "ItemInfo(viewType=" + this.viewType + ", viewBindingClass=" + this.viewBindingClass + ", inflateFn=" + this.inflateFn + ", bindViewHolder=" + this.bindViewHolder + ", onViewCreated=" + this.onViewCreated + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ItemInfo(int i, KClass<? extends ViewBinding> viewBindingClass, Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends ViewBinding> inflateFn, Function3<? super T, ? super ViewBinding, ? super RecyclerView.ViewHolder, Unit> bindViewHolder, Function1<? super ViewBinding, Unit> function1) {
            Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
            Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
            Intrinsics.checkNotNullParameter(bindViewHolder, "bindViewHolder");
            this.viewType = i;
            this.viewBindingClass = viewBindingClass;
            this.inflateFn = inflateFn;
            this.bindViewHolder = bindViewHolder;
            this.onViewCreated = function1;
        }

        public final int getViewType() {
            return this.viewType;
        }

        public final Function3<LayoutInflater, ViewGroup, Boolean, ViewBinding> getInflateFn() {
            return this.inflateFn;
        }

        public final Function3<T, ViewBinding, RecyclerView.ViewHolder, Unit> getBindViewHolder() {
            return this.bindViewHolder;
        }

        public final Function1<ViewBinding, Unit> getOnViewCreated() {
            return this.onViewCreated;
        }
    }

    public final List<T> getItems() {
        List<T> currentList = this.differ.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        return currentList;
    }

    public final <R extends T, VB extends ViewBinding> void addItemTypeInternal(KClass<?> clazz, KClass<VB> viewBindingClass, Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends ViewBinding> inflateFn, final Function3<? super R, ? super VB, ? super RecyclerView.ViewHolder, Unit> bindViewHolder, final Function1<? super VB, Unit> onViewCreated) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
        Intrinsics.checkNotNullParameter(bindViewHolder, "bindViewHolder");
        if (this.itemInfoByItemType.get(clazz) != null) {
            throw new IllegalArgumentException(("Item type " + clazz + " has already been added.").toString());
        }
        ItemInfo<T> itemInfo = new ItemInfo<>(this.viewTypeGenerator.generateType(), viewBindingClass, inflateFn, new Function3() { // from class: com.withpersona.sdk2.inquiry.shared.AdapterHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AdapterHelper.addItemTypeInternal$lambda$2(bindViewHolder, obj, (ViewBinding) obj2, (RecyclerView.ViewHolder) obj3);
            }
        }, onViewCreated != null ? new Function1() { // from class: com.withpersona.sdk2.inquiry.shared.AdapterHelper$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdapterHelper.addItemTypeInternal$lambda$3(onViewCreated, (ViewBinding) obj);
            }
        } : null);
        this.itemInfos.add(itemInfo);
        this.itemInfoByItemType.put(clazz, itemInfo);
        this.itemInfoByViewType.put(Integer.valueOf(itemInfo.getViewType()), itemInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addItemTypeInternal$lambda$2(Function3 function3, Object item, ViewBinding b, RecyclerView.ViewHolder h) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(h, "h");
        function3.invoke(item, b, h);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <VB extends ViewBinding> Unit addItemTypeInternal$lambda$3(Function1<? super VB, Unit> function1, ViewBinding viewBinding) {
        Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type VB of com.withpersona.sdk2.inquiry.shared.AdapterHelper.addItemTypeInternal");
        function1.invoke(viewBinding);
        return Unit.INSTANCE;
    }

    private final ItemInfo<T> getItemInfoFromPosition(int position) {
        T t = getItems().get(position);
        ItemInfo<T> itemInfo = this.itemInfoByItemType.get(Reflection.getOrCreateKotlinClass(t.getClass()));
        if (itemInfo != null) {
            return itemInfo;
        }
        throw new IllegalArgumentException(("No item info for type '" + t.getClass() + "'. Ensure this type is added.").toString());
    }

    public final int getItemViewType(int position) {
        return getItemInfoFromPosition(position).getViewType();
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemInfo<T> itemInfo;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.itemInfos.size() == 1) {
            itemInfo = (ItemInfo) CollectionsKt.first((List) this.itemInfos);
        } else {
            ItemInfo<T> itemInfo2 = this.itemInfoByViewType.get(Integer.valueOf(viewType));
            if (itemInfo2 == null) {
                throw new IllegalArgumentException(("No item for layout id '" + viewType + "'. Ensure this item is added. Maybe you forgot 'override fun getItemViewType(position: Int): Int = ...'?").toString());
            }
            itemInfo = itemInfo2;
        }
        Function3<LayoutInflater, ViewGroup, Boolean, ViewBinding> inflateFn = itemInfo.getInflateFn();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        ViewBindingViewHolder viewBindingViewHolder = new ViewBindingViewHolder(inflateFn.invoke(layoutInflaterFrom, parent, Boolean.FALSE));
        Function1<ViewBinding, Unit> onViewCreated = itemInfo.getOnViewCreated();
        if (onViewCreated != null) {
            onViewCreated.invoke(viewBindingViewHolder.getBinding());
        }
        return viewBindingViewHolder;
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemInfo<T> itemInfoFromPosition = getItemInfoFromPosition(position);
        itemInfoFromPosition.getBindViewHolder().invoke(getItems().get(position), ViewBindingViewHolder2.getBinding(holder), holder);
    }

    public final int getItemCount() {
        return this.differ.getCurrentList().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setItems$default(AdapterHelper adapterHelper, List list, RecyclerView.Adapter adapter, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        adapterHelper.setItems(list, adapter, function0);
    }

    public final void setItems(List<? extends T> newItems, RecyclerView.Adapter<?> adapter, final Function0<Unit> cb) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.adapter = adapter;
        this.differ.submitList(newItems, cb != null ? new Runnable() { // from class: com.withpersona.sdk2.inquiry.shared.AdapterHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                cb.invoke();
            }
        } : null);
    }
}
