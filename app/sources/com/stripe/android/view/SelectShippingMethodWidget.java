package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.databinding.StripeShippingMethodWidgetBinding;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectShippingMethodWidget.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u001a\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u0014J\u0014\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/stripe/android/view/SelectShippingMethodWidget;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "selectedShippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "getSelectedShippingMethod", "()Lcom/stripe/android/model/ShippingMethod;", "shippingMethodAdapter", "Lcom/stripe/android/view/ShippingMethodAdapter;", "setSelectedShippingMethod", "", "shippingMethod", "setShippingMethodSelectedCallback", "callback", "Lkotlin/Function1;", "setShippingMethods", "shippingMethods", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SelectShippingMethodWidget extends FrameLayout {
    private final ShippingMethodAdapter shippingMethodAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ShippingMethodAdapter shippingMethodAdapter = new ShippingMethodAdapter();
        this.shippingMethodAdapter = shippingMethodAdapter;
        StripeShippingMethodWidgetBinding stripeShippingMethodWidgetBindingInflate = StripeShippingMethodWidgetBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeShippingMethodWidgetBindingInflate, "inflate(...)");
        RecyclerView recyclerView = stripeShippingMethodWidgetBindingInflate.shippingMethods;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(shippingMethodAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }

    public final ShippingMethod getSelectedShippingMethod() {
        return this.shippingMethodAdapter.getSelectedShippingMethod();
    }

    public final void setShippingMethodSelectedCallback(Function1<? super ShippingMethod, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.shippingMethodAdapter.setOnShippingMethodSelectedCallback$payments_core_release(callback);
    }

    public final void setShippingMethods(List<ShippingMethod> shippingMethods) {
        Intrinsics.checkNotNullParameter(shippingMethods, "shippingMethods");
        this.shippingMethodAdapter.setShippingMethods$payments_core_release(shippingMethods);
    }

    public final void setSelectedShippingMethod(ShippingMethod shippingMethod) {
        Intrinsics.checkNotNullParameter(shippingMethod, "shippingMethod");
        this.shippingMethodAdapter.setSelected$payments_core_release(shippingMethod);
    }
}
