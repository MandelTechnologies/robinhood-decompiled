package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.transfers.contracts.CryptoCheckoutPaymentMethodSelectionKey;
import com.stripe.android.R$id;
import com.stripe.android.R$string;
import com.stripe.android.databinding.StripeAddPaymentMethodRowBinding;
import com.stripe.android.databinding.StripeGooglePayRowBinding;
import com.stripe.android.databinding.StripeMaskedCardRowBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.Args;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: PaymentMethodsAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004fghiBI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010'J\u001d\u0010-\u001a\u00020\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0005H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010'J\u0017\u00102\u001a\u0002012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b7\u0010\u0017J\u001f\u0010:\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u0010H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010?\u001a\u00020\u00152\u0006\u0010<\u001a\u00020)H\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00152\u0006\u0010<\u001a\u00020)H\u0000¢\u0006\u0004\b@\u0010>J\u0017\u0010D\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bB\u0010CJ\u0019\u0010G\u001a\u0004\u0018\u00010\u00102\u0006\u0010<\u001a\u00020)H\u0000¢\u0006\u0004\bE\u0010FR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010HR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010IR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010IR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010IR \u0010*\u001a\b\u0012\u0004\u0012\u00020)0J8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010H\u001a\u0004\bK\u0010LR$\u0010M\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010]\u001a\u00020\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010a\u001a\u00020\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010^\u001a\u0004\bb\u0010`R\u0016\u0010e\u001a\u0004\u0018\u00010)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006j"}, m3636d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "intentArgs", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "addableTypes", "", "initiallySelectedPaymentMethodId", "", "shouldShowGooglePay", "useGooglePay", "canDeletePaymentMethods", "<init>", "(Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;Ljava/util/List;Ljava/lang/String;ZZZ)V", "", "position", "isGooglePayPosition", "(I)Z", "isPaymentMethodsPosition", "", "updateSelectedPaymentMethod", "(I)V", "Landroid/view/ViewGroup;", "parent", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;", "createAddCardPaymentMethodViewHolder", "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;", "createAddFpxPaymentMethodViewHolder", "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "createPaymentMethodViewHolder", "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;", "createGooglePayViewHolder", "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;", "getPaymentMethodIndex", "(I)I", "getAddableTypesPosition", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "setPaymentMethods$payments_core_release", "(Ljava/util/List;)V", "setPaymentMethods", "getItemCount", "()I", "getItemViewType", "", "getItemId", "(I)J", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "onPositionClicked$payments_core_release", "onPositionClicked", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "paymentMethod", "deletePaymentMethod$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)V", "deletePaymentMethod", "resetPaymentMethod$payments_core_release", "resetPaymentMethod", "getPaymentMethodAtPosition$payments_core_release", "(I)Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethodAtPosition", "getPosition$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;", "getPosition", "Ljava/util/List;", "Z", "", "getPaymentMethods$payments_core_release", "()Ljava/util/List;", "selectedPaymentMethodId", "Ljava/lang/String;", "getSelectedPaymentMethodId$payments_core_release", "()Ljava/lang/String;", "setSelectedPaymentMethodId$payments_core_release", "(Ljava/lang/String;)V", "Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "listener", "Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "getListener$payments_core_release", "()Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "setListener$payments_core_release", "(Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;)V", "googlePayCount", "I", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "addCardArgs", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "getAddCardArgs$payments_core_release", "()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "addFpxArgs", "getAddFpxArgs$payments_core_release", "getSelectedPaymentMethod$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod;", CryptoCheckoutPaymentMethodSelectionKey.RESULT_KEY, "Companion", "Listener", "ViewHolder", "ViewType", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PaymentMethodsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Args addCardArgs;
    private final Args addFpxArgs;
    private final List<PaymentMethod.Type> addableTypes;
    private final boolean canDeletePaymentMethods;
    private final int googlePayCount;
    private Listener listener;
    private final List<PaymentMethod> paymentMethods;
    private String selectedPaymentMethodId;
    private final boolean shouldShowGooglePay;
    private final boolean useGooglePay;
    public static final int $stable = 8;
    private static final long GOOGLE_PAY_ITEM_ID = -2057760476;

    /* compiled from: PaymentMethodsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "", "onAddPaymentMethodClick", "", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "onDeletePaymentMethodAction", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "onGooglePayClick", "onPaymentMethodClick", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Listener {
        void onAddPaymentMethodClick(Args args);

        void onDeletePaymentMethodAction(PaymentMethod paymentMethod);

        void onGooglePayClick();

        void onPaymentMethodClick(PaymentMethod paymentMethod);
    }

    /* compiled from: PaymentMethodsAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.Fpx.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ViewType.values().length];
            try {
                iArr2[ViewType.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ViewType.AddCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ViewType.AddFpx.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ViewType.GooglePay.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsAdapter(Args intentArgs, List<? extends PaymentMethod.Type> addableTypes, String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(intentArgs, "intentArgs");
        Intrinsics.checkNotNullParameter(addableTypes, "addableTypes");
        this.addableTypes = addableTypes;
        this.shouldShowGooglePay = z;
        this.useGooglePay = z2;
        this.canDeletePaymentMethods = z3;
        this.paymentMethods = new ArrayList();
        this.selectedPaymentMethodId = str;
        Integer num = z ? 1 : null;
        this.googlePayCount = num != null ? num.intValue() : 0;
        this.addCardArgs = new Args.Builder().setBillingAddressFields(intentArgs.getBillingAddressFields()).setShouldAttachToCustomer(true).setIsPaymentSessionActive$payments_core_release(intentArgs.getIsPaymentSessionActive()).setPaymentMethodType(PaymentMethod.Type.Card).setAddPaymentMethodFooter(intentArgs.getAddPaymentMethodFooterLayoutId()).setPaymentConfiguration(intentArgs.getPaymentConfiguration()).setWindowFlags(intentArgs.getWindowFlags()).build();
        this.addFpxArgs = new Args.Builder().setIsPaymentSessionActive$payments_core_release(intentArgs.getIsPaymentSessionActive()).setPaymentMethodType(PaymentMethod.Type.Fpx).setPaymentConfiguration(intentArgs.getPaymentConfiguration()).build();
        setHasStableIds(true);
    }

    public final PaymentMethod getSelectedPaymentMethod$payments_core_release() {
        String str = this.selectedPaymentMethodId;
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator<T> it = this.paymentMethods.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((PaymentMethod) next).id, str)) {
                obj = next;
                break;
            }
        }
        return (PaymentMethod) obj;
    }

    public final void setListener$payments_core_release(Listener listener) {
        this.listener = listener;
    }

    public final /* synthetic */ void setPaymentMethods$payments_core_release(List paymentMethods) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.paymentMethods.clear();
        this.paymentMethods.addAll(paymentMethods);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.paymentMethods.size() + this.addableTypes.size() + this.googlePayCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (isGooglePayPosition(position)) {
            return ViewType.GooglePay.ordinal();
        }
        if (isPaymentMethodsPosition(position)) {
            if (PaymentMethod.Type.Card == getPaymentMethodAtPosition$payments_core_release(position).type) {
                return ViewType.Card.ordinal();
            }
            return super.getItemViewType(position);
        }
        PaymentMethod.Type type2 = this.addableTypes.get(getAddableTypesPosition(position));
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            return ViewType.AddCard.ordinal();
        }
        if (i == 2) {
            return ViewType.AddFpx.ordinal();
        }
        throw new IllegalArgumentException("Unsupported PaymentMethod type: " + type2.code);
    }

    private final boolean isGooglePayPosition(int position) {
        return this.shouldShowGooglePay && position == 0;
    }

    private final boolean isPaymentMethodsPosition(int position) {
        PrimitiveRanges2 primitiveRanges2Until;
        if (this.shouldShowGooglePay) {
            primitiveRanges2Until = new PrimitiveRanges2(1, this.paymentMethods.size());
        } else {
            primitiveRanges2Until = RangesKt.until(0, this.paymentMethods.size());
        }
        return position <= primitiveRanges2Until.getLast() && primitiveRanges2Until.getFirst() <= position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        int iHashCode;
        if (isGooglePayPosition(position)) {
            return GOOGLE_PAY_ITEM_ID;
        }
        if (isPaymentMethodsPosition(position)) {
            iHashCode = getPaymentMethodAtPosition$payments_core_release(position).hashCode();
        } else {
            iHashCode = this.addableTypes.get(getAddableTypesPosition(position)).code.hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ViewHolder.PaymentMethodViewHolder) {
            PaymentMethod paymentMethodAtPosition$payments_core_release = getPaymentMethodAtPosition$payments_core_release(position);
            ViewHolder.PaymentMethodViewHolder paymentMethodViewHolder = (ViewHolder.PaymentMethodViewHolder) holder;
            paymentMethodViewHolder.setPaymentMethod(paymentMethodAtPosition$payments_core_release);
            paymentMethodViewHolder.setSelected(Intrinsics.areEqual(paymentMethodAtPosition$payments_core_release.id, this.selectedPaymentMethodId));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.PaymentMethodsAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.onBindViewHolder$lambda$3(this.f$0, holder, view);
                }
            });
            return;
        }
        if (holder instanceof ViewHolder.GooglePayViewHolder) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.PaymentMethodsAdapter$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.onBindViewHolder$lambda$4(this.f$0, view);
                }
            });
            ((ViewHolder.GooglePayViewHolder) holder).bind(this.useGooglePay);
        } else if (holder instanceof ViewHolder.AddCardPaymentMethodViewHolder) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.PaymentMethodsAdapter$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.onBindViewHolder$lambda$5(this.f$0, view);
                }
            });
        } else if (holder instanceof ViewHolder.AddFpxPaymentMethodViewHolder) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.PaymentMethodsAdapter$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.onBindViewHolder$lambda$6(this.f$0, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(PaymentMethodsAdapter this$0, RecyclerView.ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        this$0.onPositionClicked$payments_core_release(((ViewHolder.PaymentMethodViewHolder) holder).getBindingAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(PaymentMethodsAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedPaymentMethodId = null;
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onGooglePayClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$5(PaymentMethodsAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onAddPaymentMethodClick(this$0.addCardArgs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$6(PaymentMethodsAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onAddPaymentMethodClick(this$0.addFpxArgs);
        }
    }

    public final /* synthetic */ void onPositionClicked$payments_core_release(int position) {
        updateSelectedPaymentMethod(position);
        Listener listener = this.listener;
        if (listener != null) {
            listener.onPaymentMethodClick(getPaymentMethodAtPosition$payments_core_release(position));
        }
    }

    private final void updateSelectedPaymentMethod(int position) {
        Iterator<PaymentMethod> it = this.paymentMethods.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().id, this.selectedPaymentMethodId)) {
                break;
            } else {
                i++;
            }
        }
        if (i != position) {
            notifyItemChanged(i);
            PaymentMethod paymentMethod = (PaymentMethod) CollectionsKt.getOrNull(this.paymentMethods, position);
            this.selectedPaymentMethodId = paymentMethod != null ? paymentMethod.id : null;
        }
        notifyItemChanged(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = WhenMappings.$EnumSwitchMapping$1[ViewType.getEntries().get(viewType).ordinal()];
        if (i == 1) {
            return createPaymentMethodViewHolder(parent);
        }
        if (i == 2) {
            return createAddCardPaymentMethodViewHolder(parent);
        }
        if (i == 3) {
            return createAddFpxPaymentMethodViewHolder(parent);
        }
        if (i == 4) {
            return createGooglePayViewHolder(parent);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final ViewHolder.AddCardPaymentMethodViewHolder createAddCardPaymentMethodViewHolder(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ViewHolder.AddCardPaymentMethodViewHolder(context, parent);
    }

    private final ViewHolder.AddFpxPaymentMethodViewHolder createAddFpxPaymentMethodViewHolder(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ViewHolder.AddFpxPaymentMethodViewHolder(context, parent);
    }

    private final ViewHolder.PaymentMethodViewHolder createPaymentMethodViewHolder(ViewGroup parent) {
        final ViewHolder.PaymentMethodViewHolder paymentMethodViewHolder = new ViewHolder.PaymentMethodViewHolder(parent);
        if (this.canDeletePaymentMethods) {
            ViewCompat.addAccessibilityAction(paymentMethodViewHolder.itemView, parent.getContext().getString(R$string.stripe_delete_payment_method), new AccessibilityViewCommand() { // from class: com.stripe.android.view.PaymentMethodsAdapter$$ExternalSyntheticLambda4
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                    return PaymentMethodsAdapter.createPaymentMethodViewHolder$lambda$8(this.f$0, paymentMethodViewHolder, view, commandArguments);
                }
            });
        }
        return paymentMethodViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createPaymentMethodViewHolder$lambda$8(PaymentMethodsAdapter this$0, ViewHolder.PaymentMethodViewHolder viewHolder, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Listener listener = this$0.listener;
        if (listener == null) {
            return true;
        }
        listener.onDeletePaymentMethodAction(this$0.getPaymentMethodAtPosition$payments_core_release(viewHolder.getBindingAdapterPosition()));
        return true;
    }

    private final ViewHolder.GooglePayViewHolder createGooglePayViewHolder(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ViewHolder.GooglePayViewHolder(context, parent);
    }

    public final /* synthetic */ void deletePaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Integer position$payments_core_release = getPosition$payments_core_release(paymentMethod);
        if (position$payments_core_release != null) {
            int iIntValue = position$payments_core_release.intValue();
            this.paymentMethods.remove(paymentMethod);
            notifyItemRemoved(iIntValue);
        }
    }

    public final /* synthetic */ void resetPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Integer position$payments_core_release = getPosition$payments_core_release(paymentMethod);
        if (position$payments_core_release != null) {
            notifyItemChanged(position$payments_core_release.intValue());
        }
    }

    public final /* synthetic */ PaymentMethod getPaymentMethodAtPosition$payments_core_release(int position) {
        return this.paymentMethods.get(getPaymentMethodIndex(position));
    }

    private final int getPaymentMethodIndex(int position) {
        return position - this.googlePayCount;
    }

    public final Integer getPosition$payments_core_release(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Integer numValueOf = Integer.valueOf(this.paymentMethods.indexOf(paymentMethod));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return Integer.valueOf(numValueOf.intValue() + this.googlePayCount);
        }
        return null;
    }

    private final int getAddableTypesPosition(int position) {
        return (position - this.paymentMethods.size()) - this.googlePayCount;
    }

    /* compiled from: PaymentMethodsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0001\t¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "AddCardPaymentMethodViewHolder", "AddFpxPaymentMethodViewHolder", "GooglePayViewHolder", "PaymentMethodViewHolder", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public /* synthetic */ ViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        private ViewHolder(View view) {
            super(view);
        }

        /* compiled from: PaymentMethodsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/StripeAddPaymentMethodRowBinding;", "(Lcom/stripe/android/databinding/StripeAddPaymentMethodRowBinding;)V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class AddCardPaymentMethodViewHolder extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddCardPaymentMethodViewHolder(StripeAddPaymentMethodRowBinding viewBinding) {
                super(viewBinding.getRoot());
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                this.itemView.setId(R$id.stripe_payment_methods_add_card);
                View view = this.itemView;
                view.setContentDescription(view.getResources().getString(R$string.stripe_payment_method_add_new_card));
                viewBinding.label.setText(this.itemView.getResources().getString(R$string.stripe_payment_method_add_new_card));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public AddCardPaymentMethodViewHolder(Context context, ViewGroup parent) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(parent, "parent");
                StripeAddPaymentMethodRowBinding stripeAddPaymentMethodRowBindingInflate = StripeAddPaymentMethodRowBinding.inflate(LayoutInflater.from(context), parent, false);
                Intrinsics.checkNotNullExpressionValue(stripeAddPaymentMethodRowBindingInflate, "inflate(...)");
                this(stripeAddPaymentMethodRowBindingInflate);
            }
        }

        /* compiled from: PaymentMethodsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/StripeAddPaymentMethodRowBinding;", "(Lcom/stripe/android/databinding/StripeAddPaymentMethodRowBinding;)V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class AddFpxPaymentMethodViewHolder extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddFpxPaymentMethodViewHolder(StripeAddPaymentMethodRowBinding viewBinding) {
                super(viewBinding.getRoot());
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                this.itemView.setId(R$id.stripe_payment_methods_add_fpx);
                View view = this.itemView;
                view.setContentDescription(view.getResources().getString(R$string.stripe_payment_method_add_new_fpx));
                viewBinding.label.setText(this.itemView.getResources().getString(R$string.stripe_payment_method_add_new_fpx));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public AddFpxPaymentMethodViewHolder(Context context, ViewGroup parent) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(parent, "parent");
                StripeAddPaymentMethodRowBinding stripeAddPaymentMethodRowBindingInflate = StripeAddPaymentMethodRowBinding.inflate(LayoutInflater.from(context), parent, false);
                Intrinsics.checkNotNullExpressionValue(stripeAddPaymentMethodRowBindingInflate, "inflate(...)");
                this(stripeAddPaymentMethodRowBindingInflate);
            }
        }

        /* compiled from: PaymentMethodsAdapter.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/StripeGooglePayRowBinding;", "(Lcom/stripe/android/databinding/StripeGooglePayRowBinding;)V", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "bind", "", "isSelected", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class GooglePayViewHolder extends RecyclerView.ViewHolder {
            private final ThemeConfig themeConfig;
            private final StripeGooglePayRowBinding viewBinding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GooglePayViewHolder(StripeGooglePayRowBinding viewBinding) {
                super(viewBinding.getRoot());
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                this.viewBinding = viewBinding;
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ThemeConfig themeConfig = new ThemeConfig(context);
                this.themeConfig = themeConfig;
                ImageViewCompat.setImageTintList(viewBinding.checkIcon, ColorStateList.valueOf(themeConfig.getTintColor$payments_core_release(true)));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public GooglePayViewHolder(Context context, ViewGroup parent) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(parent, "parent");
                StripeGooglePayRowBinding stripeGooglePayRowBindingInflate = StripeGooglePayRowBinding.inflate(LayoutInflater.from(context), parent, false);
                Intrinsics.checkNotNullExpressionValue(stripeGooglePayRowBindingInflate, "inflate(...)");
                this(stripeGooglePayRowBindingInflate);
            }

            public final void bind(boolean isSelected) {
                this.viewBinding.label.setTextColor(ColorStateList.valueOf(this.themeConfig.getTextColor$payments_core_release(isSelected)));
                this.viewBinding.checkIcon.setVisibility(isSelected ? 0 : 4);
                this.itemView.setSelected(isSelected);
            }
        }

        /* compiled from: PaymentMethodsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/StripeMaskedCardRowBinding;", "(Lcom/stripe/android/databinding/StripeMaskedCardRowBinding;)V", "setPaymentMethod", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "setSelected", "selected", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class PaymentMethodViewHolder extends ViewHolder {
            private final StripeMaskedCardRowBinding viewBinding;

            /* JADX WARN: Illegal instructions before constructor call */
            public PaymentMethodViewHolder(StripeMaskedCardRowBinding viewBinding) {
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                FrameLayout root = viewBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                super(root, null);
                this.viewBinding = viewBinding;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public PaymentMethodViewHolder(ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                StripeMaskedCardRowBinding stripeMaskedCardRowBindingInflate = StripeMaskedCardRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(stripeMaskedCardRowBindingInflate, "inflate(...)");
                this(stripeMaskedCardRowBindingInflate);
            }

            public final void setPaymentMethod(PaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                this.viewBinding.maskedCardItem.setPaymentMethod(paymentMethod);
            }

            public final void setSelected(boolean selected) {
                this.viewBinding.maskedCardItem.setSelected(selected);
                this.itemView.setSelected(selected);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentMethodsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;", "", "(Ljava/lang/String;I)V", "Card", "AddCard", "AddFpx", "GooglePay", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType Card = new ViewType("Card", 0);
        public static final ViewType AddCard = new ViewType("AddCard", 1);
        public static final ViewType AddFpx = new ViewType("AddFpx", 2);
        public static final ViewType GooglePay = new ViewType("GooglePay", 3);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{Card, AddCard, AddFpx, GooglePay};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewTypeArr$values);
        }
    }
}
