package com.robinhood.android.creditcard.p091ui.creditapplication.address;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.error.AddressErrorFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry.ManualAddressEntryFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.search.SearchAddressFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.suggested.SuggestedAddressFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.navigation.NavigationUtils;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.AddressType2;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOption;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AddressFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003+,-B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J \u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\"\u0010 \u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010$\u001a\u00020\u0014H\u0016J\t\u0010%\u001a\u00020\nH\u0096\u0001R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/AddressFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualAddressEntryFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/error/AddressErrorFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/suggested/SuggestedAddressFragment$Callbacks;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/AddressFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/creditcard/ui/creditapplication/address/AddressFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "toManualEntry", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "toError", "error", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressErrorType;", "isSkippable", "toSuggestion", "suggestedAddress", "submit", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "sigRequired", "onEditAddress", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AddressFragment extends BaseFragment implements RegionGated, SearchAddressFragment.Callbacks, ManualAddressEntryFragment.Callbacks, AddressErrorFragment.Callbacks, SuggestedAddressFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AddressFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/creditcard/ui/creditapplication/address/AddressFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AddressFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/AddressFragment$Callbacks;", "", "onSaveAddress", "", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSaveAddress(AddressType address);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public AddressFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.AddressFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, SearchAddressFragment.INSTANCE.newInstance((Parcelable) new SearchAddressFragment.Args(((Args) INSTANCE.getArgs((Fragment) this)).isShipping())));
        }
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressFragment.Callbacks
    public void toManualEntry(AddressType address) {
        Intrinsics.checkNotNullParameter(address, "address");
        NavigationUtils.appReplaceFragment(this, ManualAddressEntryFragment.INSTANCE.newInstance((Parcelable) new ManualAddressEntryFragment.Args(address, ((Args) INSTANCE.getArgs((Fragment) this)).isShipping())));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryFragment.Callbacks
    public void toError(AddressType address, AddressType2 error, boolean isSkippable) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(error, "error");
        NavigationUtils.appReplaceFragment(this, AddressErrorFragment.INSTANCE.newInstance((Parcelable) new AddressErrorFragment.Args(address, error, isSkippable, ((Args) INSTANCE.getArgs((Fragment) this)).isShipping(), null, false, 48, null)));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryFragment.Callbacks
    public void toSuggestion(AddressType suggestedAddress, AddressType address) {
        Intrinsics.checkNotNullParameter(suggestedAddress, "suggestedAddress");
        Intrinsics.checkNotNullParameter(address, "address");
        NavigationUtils.appReplaceFragment(this, SuggestedAddressFragment.INSTANCE.newInstance((Parcelable) new SuggestedAddressFragment.Args(address, suggestedAddress, ((Args) INSTANCE.getArgs((Fragment) this)).isShipping())));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorFragment.Callbacks
    public void submit(AddressType address, ShipmentOption option, boolean sigRequired) {
        Intrinsics.checkNotNullParameter(address, "address");
        getCallbacks().onSaveAddress(address);
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddressFragment.Callbacks
    public void submit(AddressType address) {
        Intrinsics.checkNotNullParameter(address, "address");
        getCallbacks().onSaveAddress(address);
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorFragment.Callbacks
    public void onEditAddress() {
        requireBaseActivity().onBackPressed();
    }

    /* compiled from: AddressFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/AddressFragment$Args;", "Landroid/os/Parcelable;", "isShipping", "", "<init>", "(Z)V", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isShipping;

        /* compiled from: AddressFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args() {
            this(false, 1, null);
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.isShipping;
            }
            return args.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsShipping() {
            return this.isShipping;
        }

        public final Args copy(boolean isShipping) {
            return new Args(isShipping);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.isShipping == ((Args) other).isShipping;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isShipping);
        }

        public String toString() {
            return "Args(isShipping=" + this.isShipping + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isShipping ? 1 : 0);
        }

        public Args(boolean z) {
            this.isShipping = z;
        }

        public /* synthetic */ Args(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public final boolean isShipping() {
            return this.isShipping;
        }
    }

    /* compiled from: AddressFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/AddressFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/AddressFragment;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/AddressFragment$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AddressFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AddressFragment addressFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, addressFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AddressFragment newInstance(Args args) {
            return (AddressFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AddressFragment addressFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, addressFragment, args);
        }
    }
}
