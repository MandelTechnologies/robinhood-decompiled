package com.robinhood.android.educationtour;

import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import com.robinhood.android.educationtour.interfaces.EducationTourAdapter;
import com.robinhood.android.educationtour.interfaces.EducationTourViewData;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GenericEducationTourListAdapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u0000 \u0012*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u00020\u0005:\u0001\u0012B'\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/educationtour/GenericEducationTourListAdapter;", "ViewT", "Landroid/view/View;", "ItemT", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourAdapter;", "inflater", "Lcom/robinhood/utils/ui/view/Inflater;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "<init>", "(Lcom/robinhood/utils/ui/view/Inflater;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "getAvailableElementIds", "", "", "getElementScrollPosition", "", "elementIds", "Companion", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class GenericEducationTourListAdapter<ViewT extends View, ItemT> extends GenericListAdapter<ViewT, ItemT> implements EducationTourAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericListAdapter.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected GenericEducationTourListAdapter(Inflater<? extends ViewT> inflater, DiffUtil.ItemCallback<? super ItemT> diffCallback) {
        super(inflater, diffCallback);
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourAdapter
    public List<String> getAvailableElementIds() {
        List<String> listEmptyList;
        List<ItemT> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : currentList) {
            EducationTourViewData educationTourViewData = obj instanceof EducationTourViewData ? (EducationTourViewData) obj : null;
            if (educationTourViewData == null || (listEmptyList = educationTourViewData.getElementIds()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, listEmptyList);
        }
        return arrayList;
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourAdapter
    public int getElementScrollPosition(List<String> elementIds) {
        Intrinsics.checkNotNullParameter(elementIds, "elementIds");
        for (String str : elementIds) {
            List<ItemT> currentList = getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            Iterator<ItemT> it = currentList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                ItemT next = it.next();
                if ((next instanceof EducationTourViewData) && ((EducationTourViewData) next).getElementIds().contains(str)) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                return i;
            }
        }
        return -1;
    }

    /* compiled from: GenericEducationTourListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0002\u0010\u0006*\u00020\b\"\b\b\u0003\u0010\u0007*\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\f2\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010Jc\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0002\u0010\u0006*\u00020\b\"\b\b\u0003\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00122\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\f2\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010JN\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0012\b\u0002\u0010\u0006*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\b\b\u0003\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00122\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/educationtour/GenericEducationTourListAdapter$Companion;", "", "<init>", "()V", "of", "Lcom/robinhood/android/educationtour/GenericEducationTourListAdapter;", "ViewT", "ItemT", "Landroid/view/View;", "layoutResId", "", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "bind", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "inflater", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/utils/ui/view/Bindable;", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: of */
        public final <ViewT extends View, ItemT> GenericEducationTourListAdapter<ViewT, ItemT> m1937of(int layoutResId, DiffUtil.ItemCallback<? super ItemT> diffCallback, Function2<? super ViewT, ? super ItemT, Unit> bind) {
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            Intrinsics.checkNotNullParameter(bind, "bind");
            return m1939of(Inflater.INSTANCE.include(layoutResId), diffCallback, bind);
        }

        /* renamed from: of */
        public final <ViewT extends View, ItemT> GenericEducationTourListAdapter<ViewT, ItemT> m1939of(final Inflater<? extends ViewT> inflater, final DiffUtil.ItemCallback<? super ItemT> diffCallback, final Function2<? super ViewT, ? super ItemT, Unit> bind) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            Intrinsics.checkNotNullParameter(bind, "bind");
            return (GenericEducationTourListAdapter<ViewT, ItemT>) new GenericEducationTourListAdapter<ViewT, ItemT>(inflater, diffCallback) { // from class: com.robinhood.android.educationtour.GenericEducationTourListAdapter$Companion$of$1
                @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
                protected void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, ItemT item) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    Intrinsics.checkNotNullParameter(item, "item");
                    bind.invoke(holder.getView(), item);
                }
            };
        }

        /* renamed from: of */
        public final <ViewT extends View & Bindable<? super ItemT>, ItemT> GenericEducationTourListAdapter<ViewT, ItemT> m1938of(final Inflater<? extends ViewT> inflater, final DiffUtil.ItemCallback<? super ItemT> diffCallback) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            return (GenericEducationTourListAdapter<ViewT, ItemT>) new GenericEducationTourListAdapter<ViewT, ItemT>(inflater, diffCallback) { // from class: com.robinhood.android.educationtour.GenericEducationTourListAdapter$Companion$of$2
                @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
                protected void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, ItemT item) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    Intrinsics.checkNotNullParameter(item, "item");
                    ((Bindable) holder.getView()).bind(item);
                }
            };
        }
    }
}
