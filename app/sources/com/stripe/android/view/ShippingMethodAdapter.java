package com.stripe.android.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.singular.sdk.internal.Constants;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShippingMethodAdapter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0011\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R.\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R6\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150!8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010)\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00058\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010-R\u0013\u00100\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, m3636d2 = {"Lcom/stripe/android/view/ShippingMethodAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "<init>", "()V", "", "getItemCount", "()I", "position", "", "getItemId", "(I)J", "Landroid/view/ViewGroup;", "viewGroup", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "holder", "", "onBindViewHolder", "(Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;I)V", "Lcom/stripe/android/model/ShippingMethod;", "shippingMethod", "setSelected$payments_core_release", "(Lcom/stripe/android/model/ShippingMethod;)V", "setSelected", "Lkotlin/Function1;", "onShippingMethodSelectedCallback", "Lkotlin/jvm/functions/Function1;", "getOnShippingMethodSelectedCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setOnShippingMethodSelectedCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "", "value", "shippingMethods", "Ljava/util/List;", "getShippingMethods$payments_core_release", "()Ljava/util/List;", "setShippingMethods$payments_core_release", "(Ljava/util/List;)V", "selectedIndex", "I", "getSelectedIndex$payments_core_release", "setSelectedIndex$payments_core_release", "(I)V", "getSelectedShippingMethod", "()Lcom/stripe/android/model/ShippingMethod;", "selectedShippingMethod", "ShippingMethodViewHolder", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ShippingMethodAdapter extends RecyclerView.Adapter<ShippingMethodViewHolder> {
    private /* synthetic */ int selectedIndex;
    private Function1<? super ShippingMethod, Unit> onShippingMethodSelectedCallback = new Function1<ShippingMethod, Unit>() { // from class: com.stripe.android.view.ShippingMethodAdapter$onShippingMethodSelectedCallback$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ShippingMethod it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ShippingMethod shippingMethod) {
            invoke2(shippingMethod);
            return Unit.INSTANCE;
        }
    };
    private List<ShippingMethod> shippingMethods = CollectionsKt.emptyList();

    public ShippingMethodAdapter() {
        setHasStableIds(true);
    }

    public final void setOnShippingMethodSelectedCallback$payments_core_release(Function1<? super ShippingMethod, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onShippingMethodSelectedCallback = function1;
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setSelectedIndex$payments_core_release(0);
        this.shippingMethods = value;
        notifyDataSetChanged();
    }

    public final void setSelectedIndex$payments_core_release(int i) {
        int i2 = this.selectedIndex;
        if (i2 != i) {
            notifyItemChanged(i2);
            notifyItemChanged(i);
            this.selectedIndex = i;
            this.onShippingMethodSelectedCallback.invoke(this.shippingMethods.get(i));
        }
    }

    public final ShippingMethod getSelectedShippingMethod() {
        return (ShippingMethod) CollectionsKt.getOrNull(this.shippingMethods, this.selectedIndex);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.shippingMethods.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return this.shippingMethods.get(position).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ShippingMethodViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ShippingMethodViewHolder(new ShippingMethodView(context, null, 0, 6, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ShippingMethodViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setShippingMethod(this.shippingMethods.get(i));
        holder.setSelected(i == this.selectedIndex);
        holder.getShippingMethodView().setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.ShippingMethodAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShippingMethodAdapter.onBindViewHolder$lambda$0(this.f$0, holder, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(ShippingMethodAdapter this$0, ShippingMethodViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        this$0.setSelectedIndex$payments_core_release(holder.getBindingAdapterPosition());
    }

    public final void setSelected$payments_core_release(ShippingMethod shippingMethod) {
        Intrinsics.checkNotNullParameter(shippingMethod, "shippingMethod");
        setSelectedIndex$payments_core_release(this.shippingMethods.indexOf(shippingMethod));
    }

    /* compiled from: ShippingMethodAdapter.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "shippingMethodView", "Lcom/stripe/android/view/ShippingMethodView;", "(Lcom/stripe/android/view/ShippingMethodView;)V", "getShippingMethodView$payments_core_release", "()Lcom/stripe/android/view/ShippingMethodView;", "setSelected", "", "selected", "", "setShippingMethod", "shippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ShippingMethodViewHolder extends RecyclerView.ViewHolder {
        private final ShippingMethodView shippingMethodView;

        /* renamed from: getShippingMethodView$payments_core_release, reason: from getter */
        public final ShippingMethodView getShippingMethodView() {
            return this.shippingMethodView;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShippingMethodViewHolder(ShippingMethodView shippingMethodView) {
            super(shippingMethodView);
            Intrinsics.checkNotNullParameter(shippingMethodView, "shippingMethodView");
            this.shippingMethodView = shippingMethodView;
        }

        public final void setShippingMethod(ShippingMethod shippingMethod) {
            Intrinsics.checkNotNullParameter(shippingMethod, "shippingMethod");
            this.shippingMethodView.setShippingMethod(shippingMethod);
        }

        public final void setSelected(boolean selected) {
            this.shippingMethodView.setSelected(selected);
        }
    }
}
