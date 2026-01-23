package com.withpersona.sdk2.inquiry.steps.p423ui.inputSelect;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiListItemBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InputSelectListAdapter.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000e¢\u0006\u0004\b \u0010!R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R.\u0010*\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00102\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u0006048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u00108\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00060\u0006078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/inputSelect/InputSelectListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "context", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "canSelectMultipleValues", "initialSelectedOptions", "Lkotlin/Function1;", "", "onClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;ZLjava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "position", "selectItem", "(I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "updateItems", "()V", "Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "Z", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "", "value", "query", "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "", "_selectedValues", "Ljava/util/Set;", "Landroidx/recyclerview/widget/AsyncListDiffer;", "asyncListDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "getSelectedOptions", "()Ljava/util/List;", "selectedOptions", "SearchBarDiffUtilCallback", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class InputSelectListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Set<Option> _selectedValues;
    private final AsyncListDiffer<Option> asyncListDiffer;
    private final boolean canSelectMultipleValues;
    private final LayoutInflater inflater;
    private final Function1<Option, Unit> onClick;
    private final List<Option> options;
    private String query;
    private final InputSelectBoxComponentStyle styles;

    /* JADX WARN: Multi-variable type inference failed */
    public InputSelectListAdapter(Context context, List<Option> options, InputSelectBoxComponentStyle inputSelectBoxComponentStyle, boolean z, List<Option> initialSelectedOptions, Function1<? super Option, Unit> onClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(initialSelectedOptions, "initialSelectedOptions");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.options = options;
        this.styles = inputSelectBoxComponentStyle;
        this.canSelectMultipleValues = z;
        this.onClick = onClick;
        this.inflater = LayoutInflater.from(context);
        this.asyncListDiffer = new AsyncListDiffer<>(this, new SearchBarDiffUtilCallback());
        List<Option> list = options;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Option) it.next()).getValue());
        }
        Set set = CollectionsKt.toSet(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : initialSelectedOptions) {
            if (set.contains(((Option) obj).getValue())) {
                arrayList2.add(obj);
            }
        }
        this._selectedValues = CollectionsKt.toMutableSet(arrayList2);
        updateItems();
    }

    public final List<Option> getSelectedOptions() {
        return CollectionsKt.toList(this._selectedValues);
    }

    public final void setQuery(String str) {
        this.query = str;
        updateItems();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Pi2UiListItemBinding pi2UiListItemBindingInflate = Pi2UiListItemBinding.inflate(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(pi2UiListItemBindingInflate, "inflate(...)");
        ViewBindingViewHolder viewBindingViewHolder = new ViewBindingViewHolder(pi2UiListItemBindingInflate);
        ViewBinding binding = viewBindingViewHolder.getBinding();
        Intrinsics.checkNotNullExpressionValue(binding, "<get-binding>(...)");
        Pi2UiListItemBinding pi2UiListItemBinding = (Pi2UiListItemBinding) binding;
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
        if (inputSelectBoxComponentStyle != null) {
            TextView label = pi2UiListItemBinding.label;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            TextStyling2.style$default(label, inputSelectBoxComponentStyle.getTextBasedStyle(), null, 2, null);
        }
        if (this.canSelectMultipleValues) {
            pi2UiListItemBinding.checkbox.setVisibility(0);
            pi2UiListItemBinding.checkbox.setButtonTintList(ColorStateList.valueOf(pi2UiListItemBinding.label.getCurrentTextColor()));
            return viewBindingViewHolder;
        }
        pi2UiListItemBinding.checkbox.setVisibility(8);
        return viewBindingViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.asyncListDiffer.getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        Integer focusedBackgroundColorValue;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Option option = this.asyncListDiffer.getCurrentList().get(position);
        Pi2UiListItemBinding pi2UiListItemBinding = (Pi2UiListItemBinding) ViewBindingViewHolder2.getBinding(holder);
        pi2UiListItemBinding.label.setText(option.getText());
        pi2UiListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectListAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InputSelectListAdapter.onBindViewHolder$lambda$3(this.f$0, holder, view);
            }
        });
        pi2UiListItemBinding.checkbox.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectListAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InputSelectListAdapter.onBindViewHolder$lambda$4(this.f$0, holder, view);
            }
        });
        boolean zContains = this._selectedValues.contains(option);
        pi2UiListItemBinding.checkbox.setChecked(zContains);
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
        if (inputSelectBoxComponentStyle == null || (focusedBackgroundColorValue = inputSelectBoxComponentStyle.getFocusedBackgroundColorValue()) == null) {
            return;
        }
        int iIntValue = focusedBackgroundColorValue.intValue();
        if (this.canSelectMultipleValues) {
            return;
        }
        if (zContains) {
            pi2UiListItemBinding.getRoot().setBackgroundColor(iIntValue);
            return;
        }
        TypedValue typedValue = new TypedValue();
        pi2UiListItemBinding.getRoot().getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        pi2UiListItemBinding.getRoot().setBackgroundResource(typedValue.resourceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(InputSelectListAdapter inputSelectListAdapter, RecyclerView.ViewHolder viewHolder, View view) {
        inputSelectListAdapter.selectItem(viewHolder.getAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(InputSelectListAdapter inputSelectListAdapter, RecyclerView.ViewHolder viewHolder, View view) {
        inputSelectListAdapter.selectItem(viewHolder.getAdapterPosition());
    }

    private final void selectItem(int position) {
        if (!this.canSelectMultipleValues) {
            this._selectedValues.clear();
        }
        Option option = this.asyncListDiffer.getCurrentList().get(position);
        if (this._selectedValues.contains(option)) {
            this._selectedValues.remove(option);
        } else {
            Set<Option> set = this._selectedValues;
            Intrinsics.checkNotNull(option);
            set.add(option);
        }
        notifyItemChanged(position);
        Function1<Option, Unit> function1 = this.onClick;
        Intrinsics.checkNotNull(option);
        function1.invoke(option);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateItems() {
        Collection arrayList;
        String str = this.query;
        if (str == null || StringsKt.isBlank(str)) {
            arrayList = this.options;
        } else {
            List<Option> list = this.options;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.contains((CharSequence) ((Option) obj).getText(), (CharSequence) str, true)) {
                    arrayList.add(obj);
                }
            }
        }
        this.asyncListDiffer.submitList(arrayList);
    }

    /* compiled from: InputSelectListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/inputSelect/InputSelectListAdapter$SearchBarDiffUtilCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    private static final class SearchBarDiffUtilCallback extends DiffUtil.ItemCallback<Option> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Option oldItem, Option newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Option oldItem, Option newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
