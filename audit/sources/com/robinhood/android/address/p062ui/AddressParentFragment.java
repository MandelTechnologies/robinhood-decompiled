package com.robinhood.android.address.p062ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.address.lib.p061ui.ManualAddressReason;
import com.robinhood.android.address.p062ui.BaseChooseAddressFragment;
import com.robinhood.android.address.p062ui.extensions.ChooseAddressSources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p355ui.identi.PartialAddress;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.utils.extensions.Activity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddressParentFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0002=>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020!H\u0002J\u0018\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020+2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020!2\u0006\u0010\u001b\u001a\u000203H\u0016J\u0018\u00104\u001a\u00020!2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u001cH\u0016J\u0010\u00108\u001a\u00020!2\u0006\u00107\u001a\u00020\u001cH\u0016J\u001a\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010(H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010*\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AddressParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/address/ui/BaseChooseAddressFragment$Callback;", "<init>", "()V", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "getCardManager", "()Lcom/robinhood/android/common/util/CardManager;", "setCardManager", "(Lcom/robinhood/android/common/util/CardManager;)V", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "source$delegate", "Lkotlin/Lazy;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "countryCode$delegate", "forceManualEntry", "", "getForceManualEntry", "()Z", "forceManualEntry$delegate", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/PartialAddress;", "getAddress", "()Lcom/robinhood/models/ui/identi/PartialAddress;", "address$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setAddressEntryFragment", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "onAddressSelected", "placeId", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "onAddressVerified", "Lcom/robinhood/models/ui/identi/UiAddress;", "onManualAddressInputSelected", "reason", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason;", "partialAddress", "onManualAddressVerified", "onNegativeButtonClicked", "id", "", "passthroughArgs", "Callback", "Companion", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AddressParentFragment extends BaseFragment implements BaseChooseAddressFragment.Callback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_ADDRESS = "extraAddress";
    private static final String EXTRA_COUNTRY_CODE = "extraCountryCode";
    private static final String EXTRA_FORCE_MANUAL_ENTRY = "extraForceManualEntry";
    private static final String EXTRA_SOURCE = "extraSource";

    /* renamed from: address$delegate, reason: from kotlin metadata */
    private final Lazy address;
    public CardManager cardManager;

    /* renamed from: countryCode$delegate, reason: from kotlin metadata */
    private final Lazy countryCode;

    /* renamed from: forceManualEntry$delegate, reason: from kotlin metadata */
    private final Lazy forceManualEntry;

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source;

    /* compiled from: AddressParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AddressParentFragment$Callback;", "", "onAddressVerified", "", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callback {
        void onAddressVerified(ChooseAddressSource source, UiAddress address);
    }

    @JvmStatic
    public static final AddressParentFragment newInstance(ChooseAddressSource chooseAddressSource, CountryCode.Supported supported, boolean z, PartialAddress partialAddress) {
        return INSTANCE.newInstance(chooseAddressSource, supported, z, partialAddress);
    }

    public AddressParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.source = Fragments2.argument(this, "extraSource");
        this.countryCode = Fragments2.argument(this, EXTRA_COUNTRY_CODE);
        this.forceManualEntry = Fragments2.argument(this, EXTRA_FORCE_MANUAL_ENTRY);
        this.address = Fragments2.argument(this, EXTRA_ADDRESS);
    }

    public final CardManager getCardManager() {
        CardManager cardManager = this.cardManager;
        if (cardManager != null) {
            return cardManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardManager");
        return null;
    }

    public final void setCardManager(CardManager cardManager) {
        Intrinsics.checkNotNullParameter(cardManager, "<set-?>");
        this.cardManager = cardManager;
    }

    @Override // com.robinhood.android.address.ui.BaseChooseAddressFragment.Callback
    public ChooseAddressSource getSource() {
        return (ChooseAddressSource) this.source.getValue();
    }

    @Override // com.robinhood.android.address.ui.BaseChooseAddressFragment.Callback
    public CountryCode.Supported getCountryCode() {
        return (CountryCode.Supported) this.countryCode.getValue();
    }

    private final boolean getForceManualEntry() {
        return ((Boolean) this.forceManualEntry.getValue()).booleanValue();
    }

    private final PartialAddress getAddress() {
        return (PartialAddress) this.address.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof Callback) {
            return;
        }
        throw new IllegalArgumentException((context + " must implement " + Callback.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            setAddressEntryFragment();
        }
    }

    private final void setAddressEntryFragment() {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(requireActivity());
        if (!getForceManualEntry() && iIsGooglePlayServicesAvailable == 0) {
            setFragment(C11048R.id.fragment_container, AddressSelectionFragment.INSTANCE.newInstance(getAddress()));
        } else {
            setFragment(C11048R.id.fragment_container, ManualAddress1Fragment.INSTANCE.newInstance(getSource(), getAddress()));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return ChooseAddressSources.getTag(getSource());
    }

    @Override // com.robinhood.android.address.ui.BaseChooseAddressFragment.Callback
    public void onAddressSelected(String placeId, AutocompleteSessionToken sessionToken) {
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        Activity.hideKeyboard$default(baseActivity, false, 1, null);
        BaseActivity baseActivity2 = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity2);
        baseActivity2.showProgressBar(false);
        replaceFragment(AddressMapFragment.INSTANCE.newInstance(placeId, sessionToken));
    }

    @Override // com.robinhood.android.address.ui.BaseChooseAddressFragment.Callback
    public void onAddressVerified(UiAddress address) {
        Intrinsics.checkNotNullParameter(address, "address");
        getCardManager().invalidateCardsBestEffort();
        KeyEventDispatcher.Component activity = getActivity();
        Callback callback = activity instanceof Callback ? (Callback) activity : null;
        if (callback != null) {
            callback.onAddressVerified(getSource(), address);
        }
    }

    @Override // com.robinhood.android.address.ui.BaseChooseAddressFragment.Callback
    public void onManualAddressInputSelected(ManualAddressReason reason, PartialAddress partialAddress) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(partialAddress, "partialAddress");
        if (reason instanceof ManualAddressReason.Error) {
            popLastFragment();
            ManualAddressReason.Error error = (ManualAddressReason.Error) reason;
            if (Intrinsics.areEqual(error, ManualAddressReason.Error.Generic.INSTANCE)) {
                Toast.makeText(requireContext(), C8360R.string.address_error_verification_failed, 1).show();
            } else {
                if (!Intrinsics.areEqual(error, ManualAddressReason.Error.CashManagementShippingAddressLength.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C8360R.id.dialog_id_shipping_address_length).setMessage(C8360R.string.shipping_address_length_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setNegativeButton(C11048R.string.general_label_contact_support, new Object[0]);
                FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "onboarding-shipping-address-length", false, 4, null);
            }
        }
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        baseActivity.showProgressBar(false);
        replaceFragment(ManualAddress1Fragment.INSTANCE.newInstance(getSource(), partialAddress));
    }

    @Override // com.robinhood.android.address.ui.BaseChooseAddressFragment.Callback
    public void onManualAddressVerified(PartialAddress partialAddress) {
        Intrinsics.checkNotNullParameter(partialAddress, "partialAddress");
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        baseActivity.showProgressBar(false);
        replaceFragment(ManualAddress2Fragment.INSTANCE.newInstance(getSource(), partialAddress));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C8360R.id.dialog_id_shipping_address_length) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, "85", false, 4, null);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* compiled from: AddressParentFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AddressParentFragment$Companion;", "", "<init>", "()V", "EXTRA_SOURCE", "", "EXTRA_COUNTRY_CODE", "EXTRA_FORCE_MANUAL_ENTRY", "EXTRA_ADDRESS", "newInstance", "Lcom/robinhood/android/address/ui/AddressParentFragment;", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "forceManualEntry", "", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/PartialAddress;", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ AddressParentFragment newInstance$default(Companion companion, ChooseAddressSource chooseAddressSource, CountryCode.Supported supported, boolean z, PartialAddress partialAddress, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.newInstance(chooseAddressSource, supported, z, partialAddress);
        }

        @JvmStatic
        public final AddressParentFragment newInstance(ChooseAddressSource source, CountryCode.Supported countryCode, boolean forceManualEntry, PartialAddress address) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(address, "address");
            AddressParentFragment addressParentFragment = new AddressParentFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("extraSource", source);
            bundle.putSerializable(AddressParentFragment.EXTRA_COUNTRY_CODE, countryCode);
            bundle.putBoolean(AddressParentFragment.EXTRA_FORCE_MANUAL_ENTRY, forceManualEntry);
            bundle.putParcelable(AddressParentFragment.EXTRA_ADDRESS, address);
            addressParentFragment.setArguments(bundle);
            return addressParentFragment;
        }
    }
}
