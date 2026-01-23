package com.robinhood.android.common.mcduckling.p084ui.address;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.common.mcduckling.address.CardShippingAddress;
import com.robinhood.android.common.mcduckling.p084ui.address.AddressAdapter;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddressAdapter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0016\u0010\u0017\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/address/AddressAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/android/common/mcduckling/ui/address/AddressAdapter$AddressViewHolder;", "callbacks", "Lcom/robinhood/android/common/mcduckling/ui/address/AddressAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/common/mcduckling/ui/address/AddressAdapter$Callbacks;)V", "getCallbacks", "()Lcom/robinhood/android/common/mcduckling/ui/address/AddressAdapter$Callbacks;", "addresses", "", "Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "checkedPosition", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "", "holder", "position", "updateAddresses", "updatedAddresses", "", "setStartingSelection", "startingAddressId", "Ljava/util/UUID;", "AddressViewHolder", "Callbacks", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AddressAdapter extends RecyclerView.Adapter<AddressViewHolder> {
    private final List<CardShippingAddress> addresses;
    private final Callbacks callbacks;
    private int checkedPosition;

    /* compiled from: AddressAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/address/AddressAdapter$Callbacks;", "", "onAddressSelected", "", "shippingAddress", "Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAddressSelected(CardShippingAddress shippingAddress);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public AddressAdapter(Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        this.addresses = new ArrayList();
        this.checkedPosition = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public AddressViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new AddressViewHolder(this, ViewGroups.inflate$default(parent, C11257R.layout.row_address, false, 2, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.addresses.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(AddressViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CardShippingAddress cardShippingAddress = this.addresses.get(position);
        Context context = holder.itemView.getContext();
        holder.setSelected(position == this.checkedPosition);
        if (cardShippingAddress.isBillingAddress()) {
            holder.getPrimaryText().setText(context.getString(C11257R.string.cash_management_address_selection_same_as_residential));
            holder.getSecondaryText().setVisibility(8);
        } else {
            holder.getPrimaryText().setText(cardShippingAddress.getMailingAddress().formatPrimary());
            TextView secondaryText = holder.getSecondaryText();
            secondaryText.setText(cardShippingAddress.getMailingAddress().formatSecondary());
            secondaryText.setVisibility(0);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateAddresses(List<CardShippingAddress> updatedAddresses) {
        Intrinsics.checkNotNullParameter(updatedAddresses, "updatedAddresses");
        this.addresses.clear();
        this.addresses.addAll(updatedAddresses);
        CardShippingAddress cardShippingAddress = (CardShippingAddress) CollectionsKt.firstOrNull((List) this.addresses);
        if (cardShippingAddress != null) {
            this.checkedPosition = this.addresses.indexOf(cardShippingAddress);
            this.callbacks.onAddressSelected(cardShippingAddress);
        }
        notifyDataSetChanged();
    }

    public final void setStartingSelection(UUID startingAddressId) {
        if (startingAddressId == null) {
            return;
        }
        Iterator<CardShippingAddress> it = this.addresses.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getId(), startingAddressId)) {
                break;
            } else {
                i++;
            }
        }
        if (i > -1) {
            this.checkedPosition = i;
            notifyItemChanged(i);
            this.callbacks.onAddressSelected(this.addresses.get(i));
        }
    }

    /* compiled from: AddressAdapter.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/address/AddressAdapter$AddressViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Lcom/robinhood/android/common/mcduckling/ui/address/AddressAdapter;Landroid/view/View;)V", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroid/view/ViewGroup;", "selectedIcon", "Landroid/widget/ImageView;", "primaryText", "Landroid/widget/TextView;", "getPrimaryText", "()Landroid/widget/TextView;", "secondaryText", "getSecondaryText", "value", "", "isSelected", "()Z", "setSelected", "(Z)V", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public final class AddressViewHolder extends RecyclerView.ViewHolder {
        private final TextView primaryText;
        private final ViewGroup root;
        private final TextView secondaryText;
        private final ImageView selectedIcon;
        final /* synthetic */ AddressAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressViewHolder(final AddressAdapter addressAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = addressAdapter;
            View viewFindViewById = view.findViewById(C11257R.id.address_row_root);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ViewGroup viewGroup = (ViewGroup) viewFindViewById;
            this.root = viewGroup;
            View viewFindViewById2 = view.findViewById(C11257R.id.address_row_selected_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.selectedIcon = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(C11257R.id.address_row_primary_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.primaryText = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(C11257R.id.address_row_secondary_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.secondaryText = (TextView) viewFindViewById4;
            OnClickListeners.onClick(viewGroup, new Function0() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressAdapter$AddressViewHolder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddressAdapter.AddressViewHolder._init_$lambda$1(addressAdapter, this);
                }
            });
        }

        public final TextView getPrimaryText() {
            return this.primaryText;
        }

        public final TextView getSecondaryText() {
            return this.secondaryText;
        }

        public final boolean isSelected() {
            return this.selectedIcon.getVisibility() == 0;
        }

        public final void setSelected(boolean z) {
            String string2;
            ImageView imageView = this.selectedIcon;
            imageView.setVisibility(z ? 0 : 8);
            if (z) {
                string2 = imageView.getContext().getString(C11257R.string.cash_management_address_selected_content_description);
            } else {
                string2 = imageView.getContext().getString(C11257R.string.cash_management_address_not_selected_content_description);
            }
            imageView.setContentDescription(string2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$1(final AddressAdapter addressAdapter, AddressViewHolder addressViewHolder) {
            if (addressAdapter.checkedPosition != addressViewHolder.getLayoutPosition()) {
                final int i = addressAdapter.checkedPosition;
                addressAdapter.checkedPosition = addressViewHolder.getLayoutPosition();
                addressViewHolder.root.post(new Runnable() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressAdapter$AddressViewHolder$1$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AddressAdapter addressAdapter2 = addressAdapter;
                        int i2 = i;
                        addressAdapter2.notifyItemChanged(i2, Integer.valueOf(i2));
                    }
                });
                addressViewHolder.root.post(new Runnable() { // from class: com.robinhood.android.common.mcduckling.ui.address.AddressAdapter$AddressViewHolder$1$2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AddressAdapter addressAdapter2 = addressAdapter;
                        addressAdapter2.notifyItemChanged(addressAdapter2.checkedPosition, Integer.valueOf(addressAdapter.checkedPosition));
                    }
                });
                addressAdapter.getCallbacks().onAddressSelected((CardShippingAddress) addressAdapter.addresses.get(addressViewHolder.getLayoutPosition()));
            }
            return Unit.INSTANCE;
        }
    }
}
