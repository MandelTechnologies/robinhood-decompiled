package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.databinding.StripeShippingInfoPageBinding;
import com.stripe.android.databinding.StripeShippingMethodPageBinding;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* compiled from: PaymentFlowPagerAdapter.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001:\u0001NB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010-R.\u00100\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00106\u001a\u00020!2\u0006\u0010/\u001a\u00020!8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00107R7\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0=2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\n0=8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR/\u0010K\u001a\u0004\u0018\u00010\n2\b\u0010>\u001a\u0004\u0018\u00010\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001b0=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010B¨\u0006O"}, m3636d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "Landroid/content/Context;", "context", "Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionConfig", "", "", "allowedShippingCountryCodes", "Lkotlin/Function1;", "Lcom/stripe/android/model/ShippingMethod;", "", "onShippingMethodSelectedCallback", "<init>", "(Landroid/content/Context;Lcom/stripe/android/PaymentSessionConfig;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "collection", "", "position", "", "instantiateItem", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "view", "destroyItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "getCount", "()I", "Lcom/stripe/android/view/PaymentFlowPage;", "getPageAt$payments_core_release", "(I)Lcom/stripe/android/view/PaymentFlowPage;", "getPageAt", "Landroid/view/View;", "o", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "", "getPageTitle", "(I)Ljava/lang/CharSequence;", "obj", "getItemPosition", "(Ljava/lang/Object;)I", "Landroid/content/Context;", "Lcom/stripe/android/PaymentSessionConfig;", "Ljava/util/Set;", "Lkotlin/jvm/functions/Function1;", "Lcom/stripe/android/model/ShippingInformation;", "value", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation$payments_core_release", "()Lcom/stripe/android/model/ShippingInformation;", "setShippingInformation$payments_core_release", "(Lcom/stripe/android/model/ShippingInformation;)V", "isShippingInfoSubmitted", "Z", "isShippingInfoSubmitted$payments_core_release", "()Z", "setShippingInfoSubmitted$payments_core_release", "(Z)V", "shouldRecreateShippingMethodsScreen", "", "<set-?>", "shippingMethods$delegate", "Lkotlin/properties/ReadWriteProperty;", "getShippingMethods$payments_core_release", "()Ljava/util/List;", "setShippingMethods$payments_core_release", "(Ljava/util/List;)V", "shippingMethods", "selectedShippingMethod$delegate", "getSelectedShippingMethod$payments_core_release", "()Lcom/stripe/android/model/ShippingMethod;", "setSelectedShippingMethod$payments_core_release", "(Lcom/stripe/android/model/ShippingMethod;)V", "selectedShippingMethod", "getPages", "pages", "PaymentFlowViewHolder", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PaymentFlowPagerAdapter extends PagerAdapter {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PaymentFlowPagerAdapter.class, "shippingMethods", "getShippingMethods$payments_core_release()Ljava/util/List;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(PaymentFlowPagerAdapter.class, "selectedShippingMethod", "getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;", 0))};
    public static final int $stable = 8;
    private final Set<String> allowedShippingCountryCodes;
    private final Context context;
    private boolean isShippingInfoSubmitted;
    private final Function1<ShippingMethod, Unit> onShippingMethodSelectedCallback;
    private final PaymentSessionConfig paymentSessionConfig;

    /* renamed from: selectedShippingMethod$delegate, reason: from kotlin metadata */
    private final Interfaces3 selectedShippingMethod;
    private ShippingInformation shippingInformation;

    /* renamed from: shippingMethods$delegate, reason: from kotlin metadata */
    private final Interfaces3 shippingMethods;
    private boolean shouldRecreateShippingMethodsScreen;

    /* compiled from: PaymentFlowPagerAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentFlowPage.values().length];
            try {
                iArr[PaymentFlowPage.ShippingInfo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentFlowPage.ShippingMethod.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object o) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(o, "o");
        return view == o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentFlowPagerAdapter(Context context, PaymentSessionConfig paymentSessionConfig, Set<String> allowedShippingCountryCodes, Function1<? super ShippingMethod, Unit> onShippingMethodSelectedCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentSessionConfig, "paymentSessionConfig");
        Intrinsics.checkNotNullParameter(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        Intrinsics.checkNotNullParameter(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
        this.context = context;
        this.paymentSessionConfig = paymentSessionConfig;
        this.allowedShippingCountryCodes = allowedShippingCountryCodes;
        this.onShippingMethodSelectedCallback = onShippingMethodSelectedCallback;
        Delegates delegates = Delegates.INSTANCE;
        final List listEmptyList = CollectionsKt.emptyList();
        this.shippingMethods = new ObservableProperty<List<? extends ShippingMethod>>(listEmptyList) { // from class: com.stripe.android.view.PaymentFlowPagerAdapter$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, List<? extends ShippingMethod> oldValue, List<? extends ShippingMethod> newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.shouldRecreateShippingMethodsScreen = !Intrinsics.areEqual(newValue, oldValue);
            }
        };
        final Object obj = null;
        this.selectedShippingMethod = new ObservableProperty<ShippingMethod>(obj) { // from class: com.stripe.android.view.PaymentFlowPagerAdapter$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, ShippingMethod oldValue, ShippingMethod newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.shouldRecreateShippingMethodsScreen = !Intrinsics.areEqual(newValue, oldValue);
            }
        };
    }

    private final List<PaymentFlowPage> getPages() {
        PaymentFlowPage paymentFlowPage = PaymentFlowPage.ShippingInfo;
        PaymentFlowPage paymentFlowPage2 = null;
        if (!this.paymentSessionConfig.getIsShippingInfoRequired()) {
            paymentFlowPage = null;
        }
        PaymentFlowPage paymentFlowPage3 = PaymentFlowPage.ShippingMethod;
        if (this.paymentSessionConfig.getIsShippingMethodRequired() && (!this.paymentSessionConfig.getIsShippingInfoRequired() || this.isShippingInfoSubmitted)) {
            paymentFlowPage2 = paymentFlowPage3;
        }
        return CollectionsKt.listOfNotNull((Object[]) new PaymentFlowPage[]{paymentFlowPage, paymentFlowPage2});
    }

    public final void setShippingInformation$payments_core_release(ShippingInformation shippingInformation) {
        this.shippingInformation = shippingInformation;
        notifyDataSetChanged();
    }

    public final void setShippingInfoSubmitted$payments_core_release(boolean z) {
        this.isShippingInfoSubmitted = z;
        notifyDataSetChanged();
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return (List) this.shippingMethods.getValue(this, $$delegatedProperties[0]);
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.shippingMethods.setValue(this, $$delegatedProperties[0], list);
    }

    public final ShippingMethod getSelectedShippingMethod$payments_core_release() {
        return (ShippingMethod) this.selectedShippingMethod.getValue(this, $$delegatedProperties[1]);
    }

    public final void setSelectedShippingMethod$payments_core_release(ShippingMethod shippingMethod) {
        this.selectedShippingMethod.setValue(this, $$delegatedProperties[1], shippingMethod);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup collection, int position) throws Resources.NotFoundException {
        RecyclerView.ViewHolder shippingInformationViewHolder;
        Intrinsics.checkNotNullParameter(collection, "collection");
        PaymentFlowPage paymentFlowPage = getPages().get(position);
        int i = WhenMappings.$EnumSwitchMapping$0[paymentFlowPage.ordinal()];
        if (i == 1) {
            shippingInformationViewHolder = new PaymentFlowViewHolder.ShippingInformationViewHolder(collection);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            shippingInformationViewHolder = new PaymentFlowViewHolder.ShippingMethodViewHolder(collection);
        }
        if (shippingInformationViewHolder instanceof PaymentFlowViewHolder.ShippingInformationViewHolder) {
            ((PaymentFlowViewHolder.ShippingInformationViewHolder) shippingInformationViewHolder).bind(this.paymentSessionConfig, this.shippingInformation, this.allowedShippingCountryCodes);
        } else if (shippingInformationViewHolder instanceof PaymentFlowViewHolder.ShippingMethodViewHolder) {
            ((PaymentFlowViewHolder.ShippingMethodViewHolder) shippingInformationViewHolder).bind(getShippingMethods$payments_core_release(), getSelectedShippingMethod$payments_core_release(), this.onShippingMethodSelectedCallback);
        }
        collection.addView(shippingInformationViewHolder.itemView);
        shippingInformationViewHolder.itemView.setTag(paymentFlowPage);
        View itemView = shippingInformationViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return itemView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup collection, int position, Object view) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(view, "view");
        collection.removeView((View) view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return getPages().size();
    }

    public final PaymentFlowPage getPageAt$payments_core_release(int position) {
        return (PaymentFlowPage) CollectionsKt.getOrNull(getPages(), position);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int position) {
        return this.context.getString(getPages().get(position).getTitleResId());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if ((obj instanceof View) && ((View) obj).getTag() == PaymentFlowPage.ShippingMethod && this.shouldRecreateShippingMethodsScreen) {
            this.shouldRecreateShippingMethodsScreen = false;
            return -2;
        }
        return super.getItemPosition(obj);
    }

    /* compiled from: PaymentFlowPagerAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "ShippingInformationViewHolder", "ShippingMethodViewHolder", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class PaymentFlowViewHolder extends RecyclerView.ViewHolder {
        public /* synthetic */ PaymentFlowViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        private PaymentFlowViewHolder(View view) {
            super(view);
        }

        /* compiled from: PaymentFlowPagerAdapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/StripeShippingInfoPageBinding;", "(Lcom/stripe/android/databinding/StripeShippingInfoPageBinding;)V", "shippingInfoWidget", "Lcom/stripe/android/view/ShippingInfoWidget;", "bind", "", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "allowedShippingCountryCodes", "", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class ShippingInformationViewHolder extends PaymentFlowViewHolder {
            private final ShippingInfoWidget shippingInfoWidget;

            /* JADX WARN: Illegal instructions before constructor call */
            public ShippingInformationViewHolder(StripeShippingInfoPageBinding viewBinding) {
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                ScrollView root = viewBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                super(root, null);
                ShippingInfoWidget shippingInfoWidget = viewBinding.shippingInfoWidget;
                Intrinsics.checkNotNullExpressionValue(shippingInfoWidget, "shippingInfoWidget");
                this.shippingInfoWidget = shippingInfoWidget;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public ShippingInformationViewHolder(ViewGroup root) {
                Intrinsics.checkNotNullParameter(root, "root");
                StripeShippingInfoPageBinding stripeShippingInfoPageBindingInflate = StripeShippingInfoPageBinding.inflate(LayoutInflater.from(root.getContext()), root, false);
                Intrinsics.checkNotNullExpressionValue(stripeShippingInfoPageBindingInflate, "inflate(...)");
                this(stripeShippingInfoPageBindingInflate);
            }

            public final void bind(PaymentSessionConfig paymentSessionConfig, ShippingInformation shippingInformation, Set<String> allowedShippingCountryCodes) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(paymentSessionConfig, "paymentSessionConfig");
                Intrinsics.checkNotNullParameter(allowedShippingCountryCodes, "allowedShippingCountryCodes");
                this.shippingInfoWidget.setHiddenFields(paymentSessionConfig.getHiddenShippingInfoFields());
                this.shippingInfoWidget.setOptionalFields(paymentSessionConfig.getOptionalShippingInfoFields());
                this.shippingInfoWidget.setAllowedCountryCodes(allowedShippingCountryCodes);
                this.shippingInfoWidget.populateShippingInfo(shippingInformation);
            }
        }

        /* compiled from: PaymentFlowPagerAdapter.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J2\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/StripeShippingMethodPageBinding;", "(Lcom/stripe/android/databinding/StripeShippingMethodPageBinding;)V", "shippingMethodWidget", "Lcom/stripe/android/view/SelectShippingMethodWidget;", "bind", "", "shippingMethods", "", "Lcom/stripe/android/model/ShippingMethod;", "selectedShippingMethod", "onShippingMethodSelectedCallback", "Lkotlin/Function1;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class ShippingMethodViewHolder extends PaymentFlowViewHolder {
            private final SelectShippingMethodWidget shippingMethodWidget;

            /* JADX WARN: Illegal instructions before constructor call */
            public ShippingMethodViewHolder(StripeShippingMethodPageBinding viewBinding) {
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                FrameLayout root = viewBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                super(root, null);
                SelectShippingMethodWidget selectShippingMethodWidget = viewBinding.selectShippingMethodWidget;
                Intrinsics.checkNotNullExpressionValue(selectShippingMethodWidget, "selectShippingMethodWidget");
                this.shippingMethodWidget = selectShippingMethodWidget;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public ShippingMethodViewHolder(ViewGroup root) {
                Intrinsics.checkNotNullParameter(root, "root");
                StripeShippingMethodPageBinding stripeShippingMethodPageBindingInflate = StripeShippingMethodPageBinding.inflate(LayoutInflater.from(root.getContext()), root, false);
                Intrinsics.checkNotNullExpressionValue(stripeShippingMethodPageBindingInflate, "inflate(...)");
                this(stripeShippingMethodPageBindingInflate);
            }

            public final void bind(List<ShippingMethod> shippingMethods, ShippingMethod selectedShippingMethod, Function1<? super ShippingMethod, Unit> onShippingMethodSelectedCallback) {
                Intrinsics.checkNotNullParameter(shippingMethods, "shippingMethods");
                Intrinsics.checkNotNullParameter(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
                this.shippingMethodWidget.setShippingMethods(shippingMethods);
                this.shippingMethodWidget.setShippingMethodSelectedCallback(onShippingMethodSelectedCallback);
                if (selectedShippingMethod != null) {
                    this.shippingMethodWidget.setSelectedShippingMethod(selectedShippingMethod);
                }
            }
        }
    }
}
