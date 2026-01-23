package com.robinhood.android.rhy.backorder.p242ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.mcduckling.address.CardShippingAddress;
import com.robinhood.android.common.mcduckling.p084ui.address.AddressSelectionFragment;
import com.robinhood.android.common.mcduckling.p084ui.card.CardShippingReviewFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.backorder.C27347R;
import com.robinhood.android.rhy.backorder.p242ui.CardBackorderIntroFragment;
import com.robinhood.android.rhy.backorder.p242ui.CardBackorderSubmissionFragment;
import com.robinhood.android.rhy.contracts.CardBackorder;
import com.robinhood.models.api.mcduckling.CardColor;
import com.robinhood.models.api.minerva.ApiCardColorOption;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: CardBackorderParentFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002()B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020!H\u0096\u0001R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroFragment$Callbacks;", "Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionFragment$Callbacks;", "Lcom/robinhood/android/rhy/backorder/ui/CardBackorderSubmissionFragment$Callbacks;", "Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment$Callbacks;", "<init>", "()V", "<set-?>", "Lcom/robinhood/android/rhy/backorder/ui/CardBackorderParentFragment$State;", "state", "getState", "()Lcom/robinhood/android/rhy/backorder/ui/CardBackorderParentFragment$State;", "setState", "(Lcom/robinhood/android/rhy/backorder/ui/CardBackorderParentFragment$State;)V", "state$delegate", "Lkotlin/properties/ReadWriteProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onChangeMailingAddressSelected", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "onCardShippingAddressSelected", "shippingAddress", "Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "onCardBackorderAddressUpdated", "onCardOrderReviewed", "onBackPressed", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "State", "Companion", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class CardBackorderParentFragment extends BaseFragment implements RegionGated, CardBackorderIntroFragment.Callbacks, AddressSelectionFragment.Callbacks, CardBackorderSubmissionFragment.Callbacks, CardShippingReviewFragment.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardBackorderParentFragment.class, "state", "getState()Lcom/robinhood/android/rhy/backorder/ui/CardBackorderParentFragment$State;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final Interfaces3 state;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardBackorderParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.state = (Interfaces3) BindSavedState2.savedParcelable(this, new State(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0)).provideDelegate(this, $$delegatedProperties[0]);
    }

    private final State getState() {
        return (State) this.state.getValue(this, $$delegatedProperties[0]);
    }

    private final void setState(State state) {
        this.state.setValue(this, $$delegatedProperties[0], state);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            CardBackorderIntroFragment.Companion companion = CardBackorderIntroFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new CardBackorderIntroFragment.Args(((CardBackorder) companion2.getArgs((Fragment) this)).getPaymentCard(), ((CardBackorder) companion2.getArgs((Fragment) this)).getIsFromRhy())));
        }
    }

    @Override // com.robinhood.android.rhy.backorder.ui.CardBackorderIntroFragment.Callbacks
    public void onChangeMailingAddressSelected(PaymentCard paymentCard) {
        setState(State.copy$default(getState(), paymentCard, null, 2, null));
        replaceFragment(AddressSelectionFragment.INSTANCE.newInstance((Parcelable) new AddressSelectionFragment.Args(false)));
    }

    @Override // com.robinhood.android.common.mcduckling.ui.address.AddressSelectionFragment.Callbacks
    public void onCardShippingAddressSelected(CardShippingAddress shippingAddress) {
        Intrinsics.checkNotNullParameter(shippingAddress, "shippingAddress");
        setState(State.copy$default(getState(), null, shippingAddress, 1, null));
        CardBackorderSubmissionFragment.Companion companion = CardBackorderSubmissionFragment.INSTANCE;
        PaymentCard paymentCard = getState().getPaymentCard();
        Intrinsics.checkNotNull(paymentCard);
        CardShippingAddress newShippingAddress = getState().getNewShippingAddress();
        Intrinsics.checkNotNull(newShippingAddress);
        replaceFragment(companion.newInstance((Parcelable) new CardBackorderSubmissionFragment.Args(paymentCard, newShippingAddress)));
    }

    @Override // com.robinhood.android.rhy.backorder.ui.CardBackorderSubmissionFragment.Callbacks
    public void onCardBackorderAddressUpdated() {
        replaceFragmentWithoutAnimation(CardShippingReviewFragment.INSTANCE.newInstance((Parcelable) getState().getCardShippingReviewArgs()));
    }

    @Override // com.robinhood.android.common.mcduckling.ui.card.CardShippingReviewFragment.Callbacks
    public void onCardOrderReviewed() {
        requireActivity().finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C11048R.id.fragment_container);
        if (fragmentFindFragmentById instanceof CardBackorderSubmissionFragment) {
            return true;
        }
        if (fragmentFindFragmentById instanceof CardShippingReviewFragment) {
            requireActivity().finish();
            return true;
        }
        return super.onBackPressed();
    }

    /* compiled from: CardBackorderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderParentFragment$State;", "Landroid/os/Parcelable;", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "newShippingAddress", "Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;)V", "getPaymentCard", "()Lcom/robinhood/models/db/mcduckling/PaymentCard;", "getNewShippingAddress", "()Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "cardShippingReviewArgs", "Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment$Args;", "getCardShippingReviewArgs", "()Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment$Args;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        private final CardShippingAddress newShippingAddress;
        private final PaymentCard paymentCard;

        /* compiled from: CardBackorderParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State((PaymentCard) parcel.readParcelable(State.class.getClassLoader()), (CardShippingAddress) parcel.readParcelable(State.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ State copy$default(State state, PaymentCard paymentCard, CardShippingAddress cardShippingAddress, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentCard = state.paymentCard;
            }
            if ((i & 2) != 0) {
                cardShippingAddress = state.newShippingAddress;
            }
            return state.copy(paymentCard, cardShippingAddress);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentCard getPaymentCard() {
            return this.paymentCard;
        }

        /* renamed from: component2, reason: from getter */
        public final CardShippingAddress getNewShippingAddress() {
            return this.newShippingAddress;
        }

        public final State copy(PaymentCard paymentCard, CardShippingAddress newShippingAddress) {
            return new State(paymentCard, newShippingAddress);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
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
            return Intrinsics.areEqual(this.paymentCard, state.paymentCard) && Intrinsics.areEqual(this.newShippingAddress, state.newShippingAddress);
        }

        public int hashCode() {
            PaymentCard paymentCard = this.paymentCard;
            int iHashCode = (paymentCard == null ? 0 : paymentCard.hashCode()) * 31;
            CardShippingAddress cardShippingAddress = this.newShippingAddress;
            return iHashCode + (cardShippingAddress != null ? cardShippingAddress.hashCode() : 0);
        }

        public String toString() {
            return "State(paymentCard=" + this.paymentCard + ", newShippingAddress=" + this.newShippingAddress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.paymentCard, flags);
            dest.writeParcelable(this.newShippingAddress, flags);
        }

        public State(PaymentCard paymentCard, CardShippingAddress cardShippingAddress) {
            this.paymentCard = paymentCard;
            this.newShippingAddress = cardShippingAddress;
        }

        public /* synthetic */ State(PaymentCard paymentCard, CardShippingAddress cardShippingAddress, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : paymentCard, (i & 2) != 0 ? null : cardShippingAddress);
        }

        public final PaymentCard getPaymentCard() {
            return this.paymentCard;
        }

        public final CardShippingAddress getNewShippingAddress() {
            return this.newShippingAddress;
        }

        public final CardShippingReviewFragment.Args getCardShippingReviewArgs() {
            PaymentCard paymentCard = this.paymentCard;
            Intrinsics.checkNotNull(paymentCard);
            CardColor color = paymentCard.getColor();
            String estimatedShippingTime = this.paymentCard.getEstimatedShippingTime();
            Intrinsics.checkNotNull(estimatedShippingTime);
            ApiCardColorOption apiCardColorOption = new ApiCardColorOption(color, estimatedShippingTime, this.paymentCard.isBackordered(), 0);
            CardShippingAddress cardShippingAddress = this.newShippingAddress;
            Intrinsics.checkNotNull(cardShippingAddress);
            return new CardShippingReviewFragment.Args(apiCardColorOption, cardShippingAddress, C27347R.string.cash_management_card_review_backordered_title, false);
        }
    }

    /* compiled from: CardBackorderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/rhy/contracts/CardBackorder;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhy/backorder/ui/CardBackorderParentFragment;", "<init>", "()V", "createFragment", "key", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<CardBackorder>, FragmentWithArgsCompanion<CardBackorderParentFragment, CardBackorder> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CardBackorder getArgs(CardBackorderParentFragment cardBackorderParentFragment) {
            return (CardBackorder) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardBackorderParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardBackorderParentFragment newInstance(CardBackorder cardBackorder) {
            return (CardBackorderParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, cardBackorder);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardBackorderParentFragment cardBackorderParentFragment, CardBackorder cardBackorder) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardBackorderParentFragment, cardBackorder);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public CardBackorderParentFragment createFragment(CardBackorder key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (CardBackorderParentFragment) newInstance((Parcelable) key);
        }
    }
}
