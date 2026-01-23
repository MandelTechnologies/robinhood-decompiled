package com.stripe.android.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R$string;
import com.stripe.android.databinding.StripeBankItemBinding;
import com.stripe.android.model.BankStatuses;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddPaymentMethodListAdapter.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00101\u001a\u00020\t2\u0006\u00100\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u001d¨\u00066"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/stripe/android/view/ThemeConfig;", "themeConfig", "", "Lcom/stripe/android/view/Bank;", "items", "Lkotlin/Function1;", "", "", "itemSelectedCallback", "<init>", "(Lcom/stripe/android/view/ThemeConfig;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "", "getItemId", "(I)J", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "updateSelected$payments_core_release", "(I)V", "updateSelected", "notifyAdapterItemChanged", "Lcom/stripe/android/view/ThemeConfig;", "getThemeConfig", "()Lcom/stripe/android/view/ThemeConfig;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "getItemSelectedCallback", "()Lkotlin/jvm/functions/Function1;", "Lcom/stripe/android/model/BankStatuses;", "bankStatuses", "Lcom/stripe/android/model/BankStatuses;", "getBankStatuses$payments_core_release", "()Lcom/stripe/android/model/BankStatuses;", "setBankStatuses$payments_core_release", "(Lcom/stripe/android/model/BankStatuses;)V", "value", "selectedPosition", "I", "getSelectedPosition", "setSelectedPosition", "BankViewHolder", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AddPaymentMethodListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private BankStatuses bankStatuses;
    private final Function1<Integer, Unit> itemSelectedCallback;
    private final List<Bank> items;
    private int selectedPosition;
    private final ThemeConfig themeConfig;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddPaymentMethodListAdapter(ThemeConfig themeConfig, List<? extends Bank> items, Function1<? super Integer, Unit> itemSelectedCallback) {
        Intrinsics.checkNotNullParameter(themeConfig, "themeConfig");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemSelectedCallback, "itemSelectedCallback");
        this.themeConfig = themeConfig;
        this.items = items;
        this.itemSelectedCallback = itemSelectedCallback;
        this.selectedPosition = -1;
        setHasStableIds(true);
    }

    public final void setBankStatuses$payments_core_release(BankStatuses bankStatuses) {
        this.bankStatuses = bankStatuses;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition(int i) {
        int i2 = this.selectedPosition;
        if (i != i2) {
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
            notifyItemChanged(i);
            this.itemSelectedCallback.invoke(Integer.valueOf(i));
        }
        this.selectedPosition = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        StripeBankItemBinding stripeBankItemBindingInflate = StripeBankItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(stripeBankItemBindingInflate, "inflate(...)");
        return new BankViewHolder(stripeBankItemBindingInflate, this.themeConfig);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Bank bank = this.items.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.AddPaymentMethodListAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddPaymentMethodListAdapter.onBindViewHolder$lambda$0(this.f$0, holder, view);
            }
        });
        BankViewHolder bankViewHolder = (BankViewHolder) holder;
        bankViewHolder.setSelected$payments_core_release(position == this.selectedPosition);
        BankStatuses bankStatuses = this.bankStatuses;
        bankViewHolder.update(bank, bankStatuses != null ? bankStatuses.isOnline$payments_core_release(bank) : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AddPaymentMethodListAdapter this$0, RecyclerView.ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        this$0.setSelectedPosition(holder.getBindingAdapterPosition());
    }

    public final void updateSelected$payments_core_release(int position) {
        setSelectedPosition(position);
        notifyItemChanged(position);
    }

    public final void notifyAdapterItemChanged(int position) {
        notifyItemChanged(position);
    }

    /* compiled from: AddPaymentMethodListAdapter.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/stripe/android/databinding/StripeBankItemBinding;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "(Lcom/stripe/android/databinding/StripeBankItemBinding;Lcom/stripe/android/view/ThemeConfig;)V", "resources", "Landroid/content/res/Resources;", "setSelected", "", "isSelected", "", "setSelected$payments_core_release", "update", "bank", "Lcom/stripe/android/view/Bank;", "isOnline", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class BankViewHolder extends RecyclerView.ViewHolder {
        private final Resources resources;
        private final ThemeConfig themeConfig;
        private final StripeBankItemBinding viewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankViewHolder(StripeBankItemBinding viewBinding, ThemeConfig themeConfig) {
            super(viewBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
            Intrinsics.checkNotNullParameter(themeConfig, "themeConfig");
            this.viewBinding = viewBinding;
            this.themeConfig = themeConfig;
            Resources resources = this.itemView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            this.resources = resources;
        }

        public final void update(Bank bank, boolean isOnline) throws Resources.NotFoundException {
            String string2;
            Intrinsics.checkNotNullParameter(bank, "bank");
            AppCompatTextView appCompatTextView = this.viewBinding.name;
            if (isOnline) {
                string2 = bank.getDisplayName();
            } else {
                string2 = this.resources.getString(R$string.stripe_fpx_bank_offline, bank.getDisplayName());
            }
            appCompatTextView.setText(string2);
            Integer brandIconResId = bank.getBrandIconResId();
            if (brandIconResId != null) {
                this.viewBinding.icon.setImageResource(brandIconResId.intValue());
            }
        }

        public final void setSelected$payments_core_release(boolean isSelected) {
            this.viewBinding.name.setTextColor(this.themeConfig.getTextColor$payments_core_release(isSelected));
            ImageViewCompat.setImageTintList(this.viewBinding.checkIcon, ColorStateList.valueOf(this.themeConfig.getTintColor$payments_core_release(isSelected)));
            AppCompatImageView checkIcon = this.viewBinding.checkIcon;
            Intrinsics.checkNotNullExpressionValue(checkIcon, "checkIcon");
            checkIcon.setVisibility(isSelected ? 0 : 8);
        }
    }
}
