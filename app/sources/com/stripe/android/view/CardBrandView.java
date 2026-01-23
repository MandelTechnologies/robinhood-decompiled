package com.stripe.android.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import com.stripe.android.databinding.StripeCardBrandViewBinding;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.Networks;
import com.stripe.android.model.PaymentMethodCreateParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CardBrandView.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002KLB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\n\u00108\u001a\u0004\u0018\u000109H\u0002J\n\u0010:\u001a\u0004\u0018\u00010;H\u0002J\b\u0010<\u001a\u0004\u0018\u000109J\b\u0010=\u001a\u00020>H\u0002J\u0017\u0010?\u001a\u00020>2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0002\b@J\b\u0010A\u001a\u00020>H\u0002J\u0010\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020DH\u0002J\u0012\u0010E\u001a\u00020>2\b\u0010*\u001a\u0004\u0018\u00010FH\u0014J\b\u0010G\u001a\u00020FH\u0014J\b\u0010H\u001a\u0004\u0018\u00010;J\b\u0010I\u001a\u00020>H\u0002J\b\u0010J\u001a\u00020>H\u0002R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR$\u0010#\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R$\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017R$\u0010*\u001a\u00020)2\u0006\u0010\t\u001a\u00020)8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020)00X\u0082\u000e¢\u0006\u0002\n\u0000R$\u00101\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, m3636d2 = {"Lcom/stripe/android/view/CardBrandView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/stripe/android/model/CardBrand;", "brand", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "setBrand", "(Lcom/stripe/android/model/CardBrand;)V", "chevron", "Landroid/widget/ImageView;", "iconView", "", "isCbcEligible", "()Z", "setCbcEligible", "(Z)V", "listPopup", "Landroid/widget/ListPopupWindow;", "", "merchantPreferredNetworks", "getMerchantPreferredNetworks", "()Ljava/util/List;", "setMerchantPreferredNetworks", "(Ljava/util/List;)V", "possibleBrands", "getPossibleBrands", "setPossibleBrands", "shouldShowCvc", "getShouldShowCvc", "setShouldShowCvc", "shouldShowErrorIcon", "getShouldShowErrorIcon", "setShouldShowErrorIcon", "Lcom/stripe/android/view/CardBrandView$State;", "state", "getState", "()Lcom/stripe/android/view/CardBrandView$State;", "setState", "(Lcom/stripe/android/view/CardBrandView$State;)V", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "tintColorInt", "getTintColorInt$payments_core_release", "()I", "setTintColorInt$payments_core_release", "(I)V", "viewBinding", "Lcom/stripe/android/databinding/StripeCardBrandViewBinding;", "brandCardParamsNetworks", "Lcom/stripe/android/model/Networks;", "brandPaymentMethodCreateParamsNetworks", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;", "cardParamsNetworks", "determineCardBrandToDisplay", "", "handleBrandSelected", "handleBrandSelected$payments_core_release", "initListPopup", "measureContentWidth", "adapter", "Lcom/stripe/android/view/BrandAdapter;", "onRestoreInstanceState", "Landroid/os/Parcelable;", "onSaveInstanceState", "paymentMethodCreateParamsNetworks", "setCardBrandIconAndTint", "updateBrandSpinner", "SavedState", "State", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CardBrandView extends FrameLayout {
    private final ImageView chevron;
    private final ImageView iconView;
    private final ListPopupWindow listPopup;
    private StateFlow2<State> stateFlow;
    private final StripeCardBrandViewBinding viewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardBrandView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardBrandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeCardBrandViewBinding stripeCardBrandViewBindingInflate = StripeCardBrandViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeCardBrandViewBindingInflate, "inflate(...)");
        this.viewBinding = stripeCardBrandViewBindingInflate;
        ImageView icon = stripeCardBrandViewBindingInflate.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        this.iconView = icon;
        ImageView chevron = stripeCardBrandViewBindingInflate.chevron;
        Intrinsics.checkNotNullExpressionValue(chevron, "chevron");
        this.chevron = chevron;
        this.listPopup = new ListPopupWindow(context);
        this.stateFlow = StateFlow4.MutableStateFlow(new State(false, false, null, null, null, null, false, false, 0, 511, null));
        setClickable(false);
        setFocusable(false);
        determineCardBrandToDisplay();
        updateBrandSpinner();
    }

    /* compiled from: CardBrandView.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jx\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b\u0004\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b-\u0010$R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b.\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u0010\u0017¨\u00061"}, m3636d2 = {"Lcom/stripe/android/view/CardBrandView$State;", "Landroid/os/Parcelable;", "", "isCbcEligible", "isLoading", "Lcom/stripe/android/model/CardBrand;", "brand", "userSelectedBrand", "", "possibleBrands", "merchantPreferredNetworks", "shouldShowCvc", "shouldShowErrorIcon", "", "tintColor", "<init>", "(ZZLcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/CardBrand;Ljava/util/List;Ljava/util/List;ZZI)V", "copy", "(ZZLcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/CardBrand;Ljava/util/List;Ljava/util/List;ZZI)Lcom/stripe/android/view/CardBrandView$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getUserSelectedBrand", "Ljava/util/List;", "getPossibleBrands", "()Ljava/util/List;", "getMerchantPreferredNetworks", "getShouldShowCvc", "getShouldShowErrorIcon", "I", "getTintColor", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        private final CardBrand brand;
        private final boolean isCbcEligible;
        private final boolean isLoading;
        private final List<CardBrand> merchantPreferredNetworks;
        private final List<CardBrand> possibleBrands;
        private final boolean shouldShowCvc;
        private final boolean shouldShowErrorIcon;
        private final int tintColor;
        private final CardBrand userSelectedBrand;

        /* compiled from: CardBrandView.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                CardBrand cardBrandValueOf = CardBrand.valueOf(parcel.readString());
                CardBrand cardBrandValueOf2 = parcel.readInt() == 0 ? null : CardBrand.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CardBrand.valueOf(parcel.readString()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(CardBrand.valueOf(parcel.readString()));
                }
                return new State(z, z2, cardBrandValueOf, cardBrandValueOf2, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this(false, false, null, null, null, null, false, false, 0, 511, null);
        }

        public static /* synthetic */ State copy$default(State state, boolean z, boolean z2, CardBrand cardBrand, CardBrand cardBrand2, List list, List list2, boolean z3, boolean z4, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = state.isCbcEligible;
            }
            if ((i2 & 2) != 0) {
                z2 = state.isLoading;
            }
            if ((i2 & 4) != 0) {
                cardBrand = state.brand;
            }
            if ((i2 & 8) != 0) {
                cardBrand2 = state.userSelectedBrand;
            }
            if ((i2 & 16) != 0) {
                list = state.possibleBrands;
            }
            if ((i2 & 32) != 0) {
                list2 = state.merchantPreferredNetworks;
            }
            if ((i2 & 64) != 0) {
                z3 = state.shouldShowCvc;
            }
            if ((i2 & 128) != 0) {
                z4 = state.shouldShowErrorIcon;
            }
            if ((i2 & 256) != 0) {
                i = state.tintColor;
            }
            boolean z5 = z4;
            int i3 = i;
            List list3 = list2;
            boolean z6 = z3;
            List list4 = list;
            CardBrand cardBrand3 = cardBrand;
            return state.copy(z, z2, cardBrand3, cardBrand2, list4, list3, z6, z5, i3);
        }

        public final State copy(boolean isCbcEligible, boolean isLoading, CardBrand brand, CardBrand userSelectedBrand, List<? extends CardBrand> possibleBrands, List<? extends CardBrand> merchantPreferredNetworks, boolean shouldShowCvc, boolean shouldShowErrorIcon, int tintColor) {
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(possibleBrands, "possibleBrands");
            Intrinsics.checkNotNullParameter(merchantPreferredNetworks, "merchantPreferredNetworks");
            return new State(isCbcEligible, isLoading, brand, userSelectedBrand, possibleBrands, merchantPreferredNetworks, shouldShowCvc, shouldShowErrorIcon, tintColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.isCbcEligible == state.isCbcEligible && this.isLoading == state.isLoading && this.brand == state.brand && this.userSelectedBrand == state.userSelectedBrand && Intrinsics.areEqual(this.possibleBrands, state.possibleBrands) && Intrinsics.areEqual(this.merchantPreferredNetworks, state.merchantPreferredNetworks) && this.shouldShowCvc == state.shouldShowCvc && this.shouldShowErrorIcon == state.shouldShowErrorIcon && this.tintColor == state.tintColor;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isCbcEligible) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.brand.hashCode()) * 31;
            CardBrand cardBrand = this.userSelectedBrand;
            return ((((((((((iHashCode + (cardBrand == null ? 0 : cardBrand.hashCode())) * 31) + this.possibleBrands.hashCode()) * 31) + this.merchantPreferredNetworks.hashCode()) * 31) + Boolean.hashCode(this.shouldShowCvc)) * 31) + Boolean.hashCode(this.shouldShowErrorIcon)) * 31) + Integer.hashCode(this.tintColor);
        }

        public String toString() {
            return "State(isCbcEligible=" + this.isCbcEligible + ", isLoading=" + this.isLoading + ", brand=" + this.brand + ", userSelectedBrand=" + this.userSelectedBrand + ", possibleBrands=" + this.possibleBrands + ", merchantPreferredNetworks=" + this.merchantPreferredNetworks + ", shouldShowCvc=" + this.shouldShowCvc + ", shouldShowErrorIcon=" + this.shouldShowErrorIcon + ", tintColor=" + this.tintColor + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.isCbcEligible ? 1 : 0);
            parcel.writeInt(this.isLoading ? 1 : 0);
            parcel.writeString(this.brand.name());
            CardBrand cardBrand = this.userSelectedBrand;
            if (cardBrand == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(cardBrand.name());
            }
            List<CardBrand> list = this.possibleBrands;
            parcel.writeInt(list.size());
            Iterator<CardBrand> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            List<CardBrand> list2 = this.merchantPreferredNetworks;
            parcel.writeInt(list2.size());
            Iterator<CardBrand> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next().name());
            }
            parcel.writeInt(this.shouldShowCvc ? 1 : 0);
            parcel.writeInt(this.shouldShowErrorIcon ? 1 : 0);
            parcel.writeInt(this.tintColor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State(boolean z, boolean z2, CardBrand brand, CardBrand cardBrand, List<? extends CardBrand> possibleBrands, List<? extends CardBrand> merchantPreferredNetworks, boolean z3, boolean z4, int i) {
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(possibleBrands, "possibleBrands");
            Intrinsics.checkNotNullParameter(merchantPreferredNetworks, "merchantPreferredNetworks");
            this.isCbcEligible = z;
            this.isLoading = z2;
            this.brand = brand;
            this.userSelectedBrand = cardBrand;
            this.possibleBrands = possibleBrands;
            this.merchantPreferredNetworks = merchantPreferredNetworks;
            this.shouldShowCvc = z3;
            this.shouldShowErrorIcon = z4;
            this.tintColor = i;
        }

        /* renamed from: isCbcEligible, reason: from getter */
        public final boolean getIsCbcEligible() {
            return this.isCbcEligible;
        }

        public /* synthetic */ State(boolean z, boolean z2, CardBrand cardBrand, CardBrand cardBrand2, List list, List list2, boolean z3, boolean z4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? CardBrand.Unknown : cardBrand, (i2 & 8) != 0 ? null : cardBrand2, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? 0 : i);
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final CardBrand getUserSelectedBrand() {
            return this.userSelectedBrand;
        }

        public final List<CardBrand> getPossibleBrands() {
            return this.possibleBrands;
        }

        public final List<CardBrand> getMerchantPreferredNetworks() {
            return this.merchantPreferredNetworks;
        }

        public final boolean getShouldShowCvc() {
            return this.shouldShowCvc;
        }

        public final boolean getShouldShowErrorIcon() {
            return this.shouldShowErrorIcon;
        }

        public final int getTintColor() {
            return this.tintColor;
        }
    }

    private final State getState() {
        return this.stateFlow.getValue();
    }

    private final void setState(State state) {
        this.stateFlow.setValue(state);
    }

    public final boolean isCbcEligible() {
        return getState().getIsCbcEligible();
    }

    public final void setCbcEligible(boolean z) {
        StateFlow2<State> stateFlow2 = this.stateFlow;
        while (true) {
            State value = stateFlow2.getValue();
            boolean z2 = z;
            if (stateFlow2.compareAndSet(value, State.copy$default(value, z2, false, null, null, null, null, false, false, 0, 510, null))) {
                updateBrandSpinner();
                return;
            }
            z = z2;
        }
    }

    public final CardBrand getBrand() {
        return getState().getBrand();
    }

    public final void setBrand(CardBrand value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StateFlow2<State> stateFlow2 = this.stateFlow;
        while (true) {
            State value2 = stateFlow2.getValue();
            CardBrand cardBrand = value;
            if (stateFlow2.compareAndSet(value2, State.copy$default(value2, false, false, cardBrand, null, null, null, false, false, 0, 507, null))) {
                determineCardBrandToDisplay();
                updateBrandSpinner();
                return;
            }
            value = cardBrand;
        }
    }

    public final List<CardBrand> getPossibleBrands() {
        return getState().getPossibleBrands();
    }

    public final void setPossibleBrands(List<? extends CardBrand> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StateFlow2<State> stateFlow2 = this.stateFlow;
        while (true) {
            State value2 = stateFlow2.getValue();
            List<? extends CardBrand> list = value;
            if (stateFlow2.compareAndSet(value2, State.copy$default(value2, false, false, null, null, list, null, false, false, 0, 495, null))) {
                determineCardBrandToDisplay();
                updateBrandSpinner();
                return;
            }
            value = list;
        }
    }

    public final List<CardBrand> getMerchantPreferredNetworks() {
        return getState().getMerchantPreferredNetworks();
    }

    public final void setMerchantPreferredNetworks(List<? extends CardBrand> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StateFlow2<State> stateFlow2 = this.stateFlow;
        while (true) {
            State value2 = stateFlow2.getValue();
            List<? extends CardBrand> list = value;
            if (stateFlow2.compareAndSet(value2, State.copy$default(value2, false, false, null, null, null, list, false, false, 0, 479, null))) {
                determineCardBrandToDisplay();
                return;
            }
            value = list;
        }
    }

    public final boolean getShouldShowCvc() {
        return getState().getShouldShowCvc();
    }

    public final void setShouldShowCvc(boolean z) {
        StateFlow2<State> stateFlow2 = this.stateFlow;
        while (true) {
            State value = stateFlow2.getValue();
            boolean z2 = z;
            if (stateFlow2.compareAndSet(value, State.copy$default(value, false, false, null, null, null, null, z2, false, 0, 447, null))) {
                setCardBrandIconAndTint();
                return;
            }
            z = z2;
        }
    }

    public final boolean getShouldShowErrorIcon() {
        return getState().getShouldShowErrorIcon();
    }

    public final void setShouldShowErrorIcon(boolean z) {
        StateFlow2<State> stateFlow2 = this.stateFlow;
        while (true) {
            State value = stateFlow2.getValue();
            boolean z2 = z;
            if (stateFlow2.compareAndSet(value, State.copy$default(value, false, false, null, null, null, null, false, z2, 0, 383, null))) {
                setCardBrandIconAndTint();
                return;
            }
            z = z2;
        }
    }

    public final int getTintColorInt$payments_core_release() {
        return getState().getTintColor();
    }

    public final void setTintColorInt$payments_core_release(int i) {
        StateFlow2<State> stateFlow2 = this.stateFlow;
        while (true) {
            State value = stateFlow2.getValue();
            int i2 = i;
            if (stateFlow2.compareAndSet(value, State.copy$default(value, false, false, null, null, null, null, false, false, i2, 255, null))) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final PaymentMethodCreateParams.Card.Networks paymentMethodCreateParamsNetworks() {
        String code;
        PaymentMethodCreateParams.Card.Networks networksBrandPaymentMethodCreateParamsNetworks = brandPaymentMethodCreateParamsNetworks();
        if (networksBrandPaymentMethodCreateParamsNetworks != null) {
            return networksBrandPaymentMethodCreateParamsNetworks;
        }
        CardBrand cardBrand = (CardBrand) CollectionsKt.firstOrNull((List) getMerchantPreferredNetworks());
        if (cardBrand == null || (code = cardBrand.getCode()) == null) {
            return null;
        }
        return new PaymentMethodCreateParams.Card.Networks(code);
    }

    private final PaymentMethodCreateParams.Card.Networks brandPaymentMethodCreateParamsNetworks() {
        if (getBrand() == CardBrand.Unknown) {
            return null;
        }
        PaymentMethodCreateParams.Card.Networks networks = new PaymentMethodCreateParams.Card.Networks(getBrand().getCode());
        if (!isCbcEligible() || getPossibleBrands().size() <= 1) {
            return null;
        }
        return networks;
    }

    public final Networks cardParamsNetworks() {
        String code;
        Networks networksBrandCardParamsNetworks = brandCardParamsNetworks();
        if (networksBrandCardParamsNetworks != null) {
            return networksBrandCardParamsNetworks;
        }
        CardBrand cardBrand = (CardBrand) CollectionsKt.firstOrNull((List) getMerchantPreferredNetworks());
        if (cardBrand == null) {
            return null;
        }
        if (cardBrand == CardBrand.Unknown) {
            cardBrand = null;
        }
        if (cardBrand == null || (code = cardBrand.getCode()) == null) {
            return null;
        }
        return new Networks(code);
    }

    private final Networks brandCardParamsNetworks() {
        String code;
        CardBrand brand = getBrand();
        if (brand == CardBrand.Unknown) {
            brand = null;
        }
        Networks networks = (brand == null || (code = brand.getCode()) == null) ? null : new Networks(code);
        if (!isCbcEligible() || getPossibleBrands().size() <= 1) {
            return null;
        }
        return networks;
    }

    public final void handleBrandSelected$payments_core_release(CardBrand brand) {
        if (brand == null) {
            return;
        }
        StateFlow2<State> stateFlow2 = this.stateFlow;
        while (true) {
            State value = stateFlow2.getValue();
            CardBrand cardBrand = brand;
            if (stateFlow2.compareAndSet(value, State.copy$default(value, false, false, null, cardBrand, null, null, false, false, 0, 503, null))) {
                determineCardBrandToDisplay();
                return;
            }
            brand = cardBrand;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setCardBrandIconAndTint() {
        int cvcIcon;
        Integer numValueOf;
        ImageView imageView = this.iconView;
        if (getShouldShowErrorIcon()) {
            cvcIcon = getState().getBrand().getErrorIcon();
        } else {
            cvcIcon = getShouldShowCvc() ? getState().getBrand().getCvcIcon() : getState().getBrand().getIcon();
        }
        imageView.setBackgroundResource(cvcIcon);
        if (!getShouldShowErrorIcon()) {
            if (getShouldShowCvc()) {
                numValueOf = Integer.valueOf(getTintColorInt$payments_core_release());
            } else {
                numValueOf = Integer.valueOf(getTintColorInt$payments_core_release());
                if (getState().getBrand() != CardBrand.Unknown) {
                    numValueOf = null;
                }
            }
        }
        this.iconView.setColorFilter(numValueOf != null ? new PorterDuffColorFilter(numValueOf.intValue(), PorterDuff.Mode.LIGHTEN) : null);
    }

    private final void determineCardBrandToDisplay() {
        CardBrand brand;
        if (getState().getPossibleBrands().size() > 1) {
            brand = CardBrandSelector.selectCardBrandToDisplay(getState().getUserSelectedBrand(), getState().getPossibleBrands(), getState().getMerchantPreferredNetworks());
        } else {
            brand = getState().getBrand();
        }
        if (getBrand() != brand) {
            setBrand(brand);
        }
        setCardBrandIconAndTint();
    }

    private final void updateBrandSpinner() {
        if (isCbcEligible() && getPossibleBrands().size() > 1 && !getShouldShowCvc() && !getShouldShowErrorIcon()) {
            initListPopup();
            setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.CardBrandView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CardBrandView.updateBrandSpinner$lambda$18(this.f$0, view);
                }
            });
            this.chevron.setVisibility(0);
        } else {
            setOnClickListener(null);
            this.chevron.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBrandSpinner$lambda$18(CardBrandView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.listPopup.isShowing()) {
            this$0.listPopup.dismiss();
        } else {
            this$0.listPopup.show();
        }
    }

    private final void initListPopup() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CardBrandView2 cardBrandView2 = new CardBrandView2(context, getPossibleBrands(), getBrand());
        this.listPopup.setAdapter(cardBrandView2);
        this.listPopup.setModal(true);
        this.listPopup.setWidth(measureContentWidth(cardBrandView2));
        this.listPopup.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.CardBrandView$$ExternalSyntheticLambda1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                CardBrandView.initListPopup$lambda$20(this.f$0, adapterView, view, i, j);
            }
        });
        this.listPopup.setAnchorView(this.iconView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListPopup$lambda$20(CardBrandView this$0, AdapterView adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardBrand cardBrand = (CardBrand) CollectionsKt.getOrNull(this$0.getPossibleBrands(), i - 1);
        if (cardBrand != null) {
            this$0.handleBrandSelected$payments_core_release(cardBrand);
        }
        this$0.listPopup.dismiss();
    }

    private final int measureContentWidth(CardBrandView2 adapter) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = adapter.getCount();
        int iCoerceAtLeast = 0;
        for (int i = 0; i < count; i++) {
            View view = adapter.getView(i, null, this);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iCoerceAtLeast = RangesKt.coerceAtLeast(iCoerceAtLeast, view.getMeasuredWidth());
        }
        return iCoerceAtLeast;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        State state2;
        Parcelable superState;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState == null || (state2 = savedState.getState()) == null) {
            state2 = new State(false, false, null, null, null, null, false, false, 0, 511, null);
        }
        setState(state2);
        determineCardBrandToDisplay();
        updateBrandSpinner();
        if (savedState != null && (superState = savedState.getSuperState()) != null) {
            state = superState;
        }
        super.onRestoreInstanceState(state);
    }

    /* compiled from: CardBrandView.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/stripe/android/view/CardBrandView$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superSavedState", "Lcom/stripe/android/view/CardBrandView$State;", "state", "<init>", "(Landroid/os/Parcelable;Lcom/stripe/android/view/CardBrandView$State;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/os/Parcelable;", "getSuperSavedState", "()Landroid/os/Parcelable;", "Lcom/stripe/android/view/CardBrandView$State;", "getState", "()Lcom/stripe/android/view/CardBrandView$State;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SavedState extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final State state;
        private final Parcelable superSavedState;

        /* compiled from: CardBrandView.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), State.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return Intrinsics.areEqual(this.superSavedState, savedState.superSavedState) && Intrinsics.areEqual(this.state, savedState.state);
        }

        public int hashCode() {
            Parcelable parcelable = this.superSavedState;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + this.state.hashCode();
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.superSavedState + ", state=" + this.state + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.superSavedState, flags);
            this.state.writeToParcel(parcel, flags);
        }

        public final State getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable, State state) {
            super(parcelable);
            Intrinsics.checkNotNullParameter(state, "state");
            this.superSavedState = parcelable;
            this.state = state;
        }
    }
}
