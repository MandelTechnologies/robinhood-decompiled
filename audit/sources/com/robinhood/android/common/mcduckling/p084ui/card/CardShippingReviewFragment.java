package com.robinhood.android.common.mcduckling.p084ui.card;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.common.mcduckling.address.CardShippingAddress;
import com.robinhood.android.common.mcduckling.databinding.FragmentCardShippingReviewBinding;
import com.robinhood.android.common.mcduckling.p084ui.card.CardShippingReviewFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.api.minerva.ApiCardColorOption;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CardShippingReviewFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0003\u001d\u001e\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0017H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "binding", "Lcom/robinhood/android/common/mcduckling/databinding/FragmentCardShippingReviewBinding;", "getBinding", "()Lcom/robinhood/android/common/mcduckling/databinding/FragmentCardShippingReviewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CardShippingReviewFragment extends BaseFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardShippingReviewFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/mcduckling/databinding/FragmentCardShippingReviewBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CardShippingReviewFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* compiled from: CardShippingReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment$Callbacks;", "", "onCardOrderReviewed", "", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCardOrderReviewed();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CardShippingReviewFragment() {
        super(C11257R.layout.fragment_card_shipping_review);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, CardShippingReviewFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.mcduckling.ui.card.CardShippingReviewFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof CardShippingReviewFragment.Callbacks)) {
                    parentFragment = null;
                }
                CardShippingReviewFragment.Callbacks callbacks = (CardShippingReviewFragment.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof CardShippingReviewFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final FragmentCardShippingReviewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCardShippingReviewBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().cardShippingReviewTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getTitleStringRes());
        getBinding().cardShippingReviewCard.setValueText(CardShippingReviewFragment3.getCardColorText(((Args) companion.getArgs((Fragment) this)).getCardColorOption()));
        getBinding().cardShippingReviewAddress.setValueText(((Args) companion.getArgs((Fragment) this)).getCardShippingAddress().getMailingAddress().format(true, true));
        getBinding().cardShippingReviewEstimatedArrival.setValueText(((Args) companion.getArgs((Fragment) this)).getCardColorOption().getEstimated_shipping_time());
        RdsButton continueBtn = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        OnClickListeners.onClick(continueBtn, new Function0() { // from class: com.robinhood.android.common.mcduckling.ui.card.CardShippingReviewFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardShippingReviewFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton continueBtn2 = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn2, "continueBtn");
        ScarletManager2.overrideStyle$default(continueBtn2, ((Args) companion.getArgs((Fragment) this)).getButtonStyle(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(CardShippingReviewFragment cardShippingReviewFragment) {
        cardShippingReviewFragment.getCallbacks().onCardOrderReviewed();
        return Unit.INSTANCE;
    }

    /* compiled from: CardShippingReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÂ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u0007J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment$Args;", "Landroid/os/Parcelable;", "cardColorOption", "Lcom/robinhood/models/api/minerva/ApiCardColorOption;", "cardShippingAddress", "Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "titleStringRes", "", "isMonochromeButton", "", "<init>", "(Lcom/robinhood/models/api/minerva/ApiCardColorOption;Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;IZ)V", "getCardColorOption", "()Lcom/robinhood/models/api/minerva/ApiCardColorOption;", "getCardShippingAddress", "()Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "getTitleStringRes", "()I", "buttonStyle", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getButtonStyle", "()Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiCardColorOption cardColorOption;
        private final CardShippingAddress cardShippingAddress;
        private final boolean isMonochromeButton;
        private final int titleStringRes;

        /* compiled from: CardShippingReviewFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiCardColorOption) parcel.readParcelable(Args.class.getClassLoader()), CardShippingAddress.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* renamed from: component4, reason: from getter */
        private final boolean getIsMonochromeButton() {
            return this.isMonochromeButton;
        }

        public static /* synthetic */ Args copy$default(Args args, ApiCardColorOption apiCardColorOption, CardShippingAddress cardShippingAddress, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                apiCardColorOption = args.cardColorOption;
            }
            if ((i2 & 2) != 0) {
                cardShippingAddress = args.cardShippingAddress;
            }
            if ((i2 & 4) != 0) {
                i = args.titleStringRes;
            }
            if ((i2 & 8) != 0) {
                z = args.isMonochromeButton;
            }
            return args.copy(apiCardColorOption, cardShippingAddress, i, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCardColorOption getCardColorOption() {
            return this.cardColorOption;
        }

        /* renamed from: component2, reason: from getter */
        public final CardShippingAddress getCardShippingAddress() {
            return this.cardShippingAddress;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTitleStringRes() {
            return this.titleStringRes;
        }

        public final Args copy(ApiCardColorOption cardColorOption, CardShippingAddress cardShippingAddress, int titleStringRes, boolean isMonochromeButton) {
            Intrinsics.checkNotNullParameter(cardColorOption, "cardColorOption");
            Intrinsics.checkNotNullParameter(cardShippingAddress, "cardShippingAddress");
            return new Args(cardColorOption, cardShippingAddress, titleStringRes, isMonochromeButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.cardColorOption, args.cardColorOption) && Intrinsics.areEqual(this.cardShippingAddress, args.cardShippingAddress) && this.titleStringRes == args.titleStringRes && this.isMonochromeButton == args.isMonochromeButton;
        }

        public int hashCode() {
            return (((((this.cardColorOption.hashCode() * 31) + this.cardShippingAddress.hashCode()) * 31) + Integer.hashCode(this.titleStringRes)) * 31) + Boolean.hashCode(this.isMonochromeButton);
        }

        public String toString() {
            return "Args(cardColorOption=" + this.cardColorOption + ", cardShippingAddress=" + this.cardShippingAddress + ", titleStringRes=" + this.titleStringRes + ", isMonochromeButton=" + this.isMonochromeButton + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.cardColorOption, flags);
            this.cardShippingAddress.writeToParcel(dest, flags);
            dest.writeInt(this.titleStringRes);
            dest.writeInt(this.isMonochromeButton ? 1 : 0);
        }

        public Args(ApiCardColorOption cardColorOption, CardShippingAddress cardShippingAddress, int i, boolean z) {
            Intrinsics.checkNotNullParameter(cardColorOption, "cardColorOption");
            Intrinsics.checkNotNullParameter(cardShippingAddress, "cardShippingAddress");
            this.cardColorOption = cardColorOption;
            this.cardShippingAddress = cardShippingAddress;
            this.titleStringRes = i;
            this.isMonochromeButton = z;
        }

        public final ApiCardColorOption getCardColorOption() {
            return this.cardColorOption;
        }

        public final CardShippingAddress getCardShippingAddress() {
            return this.cardShippingAddress;
        }

        public final int getTitleStringRes() {
            return this.titleStringRes;
        }

        public final ThemedResourceReference<StyleResource> getButtonStyle() {
            int i;
            ResourceType.STYLE style = ResourceType.STYLE.INSTANCE;
            if (this.isMonochromeButton) {
                i = C20690R.attr.primaryMonochromeButtonStyle;
            } else {
                i = C20690R.attr.primaryButtonStyle;
            }
            return new ThemedResourceReference<>(style, i);
        }
    }

    /* compiled from: CardShippingReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment;", "Lcom/robinhood/android/common/mcduckling/ui/card/CardShippingReviewFragment$Args;", "<init>", "()V", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CardShippingReviewFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CardShippingReviewFragment cardShippingReviewFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardShippingReviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardShippingReviewFragment newInstance(Args args) {
            return (CardShippingReviewFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardShippingReviewFragment cardShippingReviewFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardShippingReviewFragment, args);
        }
    }
}
