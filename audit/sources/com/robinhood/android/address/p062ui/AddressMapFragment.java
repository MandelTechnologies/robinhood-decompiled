package com.robinhood.android.address.p062ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.address.lib.p061ui.ManualAddressReason;
import com.robinhood.android.address.lib.p061ui.MapViews;
import com.robinhood.android.address.lib.places.FetchPlaceOnSubscribe;
import com.robinhood.android.address.lib.places.Places2;
import com.robinhood.android.address.lib.places.States;
import com.robinhood.android.address.p062ui.databinding.FragmentAddressMapBinding;
import com.robinhood.android.address.p062ui.extensions.InputFilter;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.view.StyleableMapView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressUsageType;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.identi.ApiAddress;
import com.robinhood.models.api.identi.ApiAddressValidationResult;
import com.robinhood.models.p355ui.identi.GbAddress;
import com.robinhood.models.p355ui.identi.PartialAddress;
import com.robinhood.models.p355ui.identi.PartialUsAddress;
import com.robinhood.models.p355ui.identi.PostalCodeGb;
import com.robinhood.models.p355ui.identi.PostalCodeUs;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.models.p355ui.identi.UiAddressKt;
import com.robinhood.models.p355ui.identi.UsAddress;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.singular.sdk.internal.Constants;
import io.reactivex.Single;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import timber.log.Timber;

/* compiled from: AddressMapFragment.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0016J\b\u0010-\u001a\u00020&H\u0016J\u0010\u0010.\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010/\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020&H\u0002J\u0010\u00104\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00109\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002J\u0018\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020<2\u0006\u00106\u001a\u00020=H\u0002J\f\u0010>\u001a\u000207*\u00020 H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AddressMapFragment;", "Lcom/robinhood/android/address/ui/BaseChooseAddressFragment;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "placeId", "", "getPlaceId", "()Ljava/lang/String;", "placeId$delegate", "Lkotlin/Lazy;", AddressMapFragment.EXTRA_SESSION_TOKEN, "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "getSessionToken", "()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "sessionToken$delegate", "binding", "Lcom/robinhood/android/address/ui/databinding/FragmentAddressMapBinding;", "getBinding", "()Lcom/robinhood/android/address/ui/databinding/FragmentAddressMapBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "continueButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getContinueButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "place", "Lcom/google/android/libraries/places/api/model/Place;", "shouldSubmit", "", "previousSoftInputMode", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onPause", "onCompleteDetailsLoaded", "onPartialDetailsLoaded", "onErrorDetailsLoaded", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Lcom/google/android/gms/common/api/ApiException;", "onContinueClicked", "submitAddress", "onValidateAddress", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "onUpdateUserAddress", "onAddressError", "takeUserToManualSetup", "reason", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason$Error;", "Lcom/robinhood/models/ui/identi/PartialAddress;", "toAddress", "Companion", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AddressMapFragment extends BaseChooseAddressFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AddressMapFragment.class, "binding", "getBinding()Lcom/robinhood/android/address/ui/databinding/FragmentAddressMapBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_PLACE_ID = "extraPlaceId";
    private static final String EXTRA_SESSION_TOKEN = "sessionToken";
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Place place;

    /* renamed from: placeId$delegate, reason: from kotlin metadata */
    private final Lazy placeId;
    private int previousSoftInputMode;

    /* renamed from: sessionToken$delegate, reason: from kotlin metadata */
    private final Lazy sessionToken;
    private boolean shouldSubmit;

    /* compiled from: AddressMapFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChooseAddressUsageType.values().length];
            try {
                iArr[ChooseAddressUsageType.GET_VALIDATED_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChooseAddressUsageType.UPDATE_USER_BASIC_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(AddressMapFragment addressMapFragment, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        ApiException apiException = (ApiException) Throwables.findCause(t, ApiException.class);
        if (apiException != null) {
            addressMapFragment.onErrorDetailsLoaded(apiException);
        } else if (!AbsErrorHandler.handleError$default(addressMapFragment.getActivityErrorHandler(), t, false, 2, null)) {
            throw t;
        }
        return Unit.INSTANCE;
    }

    public AddressMapFragment() {
        super(C8360R.layout.fragment_address_map);
        this.placeId = Fragments2.argument(this, EXTRA_PLACE_ID);
        this.sessionToken = Fragments2.argument(this, EXTRA_SESSION_TOKEN);
        this.binding = ViewBinding5.viewBinding(this, AddressMapFragment2.INSTANCE);
        this.previousSoftInputMode = 21;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    private final String getPlaceId() {
        return (String) this.placeId.getValue();
    }

    private final AutocompleteSessionToken getSessionToken() {
        return (AutocompleteSessionToken) this.sessionToken.getValue();
    }

    private final FragmentAddressMapBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAddressMapBinding) value;
    }

    @Override // com.robinhood.android.address.p062ui.AbstractAddressFragment
    protected RdsButton getContinueButton() {
        RdsButton continueBtn = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        return continueBtn;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getAppType() != AppType.RHC) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            InputFilter.applyAddressValidCharsetFilter(resources, getBinding().onboardingAptNumberEdt);
        }
        getBinding().onboardingAptNumberEdt.setSingleLine();
        Lifecycle lifecycle = getLifecycle();
        StyleableMapView mapview = getBinding().mapview;
        Intrinsics.checkNotNullExpressionValue(mapview, "mapview");
        lifecycle.addObserver(mapview);
        OnClickListeners.onClick(getContinueButton(), new C83431(this));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Single singleCreate = Single.create(new FetchPlaceOnSubscribe(contextRequireContext, getPlaceId(), getSessionToken(), new Locale("", getCallback().getCountryCode().getIso3166CountryCode())));
        Intrinsics.checkNotNullExpressionValue(singleCreate, "create(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleCreate), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.address.ui.AddressMapFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressMapFragment.onViewCreated$lambda$0(this.f$0, (FetchPlaceResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.address.ui.AddressMapFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressMapFragment.onViewCreated$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: AddressMapFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.address.ui.AddressMapFragment$onViewCreated$1 */
    /* synthetic */ class C83431 extends FunctionReferenceImpl implements Function0<Unit> {
        C83431(Object obj) {
            super(0, obj, AddressMapFragment.class, "onContinueClicked", "onContinueClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AddressMapFragment) this.receiver).onContinueClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(AddressMapFragment addressMapFragment, FetchPlaceResponse fetchPlaceResponse) throws Resources.NotFoundException {
        Place place = fetchPlaceResponse.getPlace();
        Intrinsics.checkNotNull(place);
        if (Places2.hasCompleteAddress(place)) {
            addressMapFragment.onCompleteDetailsLoaded(place);
        } else {
            addressMapFragment.onPartialDetailsLoaded(place);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Lifecycle lifecycle = getLifecycle();
        StyleableMapView mapview = getBinding().mapview;
        Intrinsics.checkNotNullExpressionValue(mapview, "mapview");
        lifecycle.removeObserver(mapview);
        super.onDestroyView();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.previousSoftInputMode = requireActivity().getWindow().getAttributes().softInputMode;
        requireActivity().getWindow().setSoftInputMode(48);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        requireActivity().getWindow().setSoftInputMode(this.previousSoftInputMode);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        super.onPause();
    }

    private final void onCompleteDetailsLoaded(Place place) throws Resources.NotFoundException {
        this.place = place;
        StyleableMapView mapview = getBinding().mapview;
        Intrinsics.checkNotNullExpressionValue(mapview, "mapview");
        LatLng latLng = place.getLatLng();
        Intrinsics.checkNotNull(latLng);
        double d = latLng.latitude;
        LatLng latLng2 = place.getLatLng();
        Intrinsics.checkNotNull(latLng2);
        double d2 = latLng2.longitude;
        float[] fArr = new float[3];
        Color.colorToHSV(requireContext().getColor(C20690R.color.mobius_prime), fArr);
        MapViews.loadMapImage$default(mapview, d, d2, Float.valueOf(ArraysKt.first(fArr)), null, 8, null);
        String address = place.getAddress();
        Intrinsics.checkNotNull(address);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) address, ',', 0, false, 6, (Object) null);
        if (iIndexOf$default > 0) {
            getBinding().onboardingAddressRowMain.setText(Places2.getStreetAddress(place));
            RhTextView rhTextView = getBinding().onboardingAddressRowSecondary;
            String strSubstring = address.substring(iIndexOf$default + 1, address.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            int length = strSubstring.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) strSubstring.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            rhTextView.setText(strSubstring.subSequence(i, length + 1).toString());
        } else {
            getBinding().onboardingAddressRowSecondary.setVisibility(8);
            getBinding().onboardingAddressRowMain.setText(address);
        }
        if (this.shouldSubmit) {
            submitAddress(place);
        }
    }

    private final void onPartialDetailsLoaded(Place place) {
        ManualAddressReason.Error.Generic generic = ManualAddressReason.Error.Generic.INSTANCE;
        String address = place.getAddress();
        String zipcode = Places2.getZipcode(place);
        takeUserToManualSetup(generic, new PartialUsAddress(address, null, zipcode != null ? new PostalCodeUs(zipcode) : null, Places2.getCity(place), Places2.getState(place)));
    }

    private final void onErrorDetailsLoaded(ApiException e) {
        int statusCode = e.getStatusCode();
        getAnalytics().logError(AnalyticsStrings.ERROR_GOOGLE_MAPS_API, String.valueOf(statusCode));
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Unknown Google Maps status: " + statusCode), false, null, 4, null);
        takeUserToManualSetup(ManualAddressReason.Error.Generic.INSTANCE, new PartialUsAddress(null, null, null, null, null, 31, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onContinueClicked() {
        try {
            onLoading(true);
            Place place = this.place;
            if (place != null) {
                submitAddress(place);
            } else {
                Toast.makeText(getActivity(), C8360R.string.address_verifying, 1).show();
                this.shouldSubmit = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if ((r0 != null ? r0.length() : 0) > 30) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void submitAddress(Place place) throws Resources.NotFoundException {
        UiAddress address = toAddress(place);
        if (getCallback().getSource() == ChooseAddressSource.CASH_MANAGEMENT_SHIPPING) {
            if (address.getLine1().length() <= 30) {
                String line2 = address.getLine2();
            }
            takeUserToManualSetup(ManualAddressReason.Error.CashManagementShippingAddressLength.INSTANCE, UiAddressKt.asPartialAddress(address));
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[getCallback().getSource().getType().ordinal()];
        if (i == 1) {
            onValidateAddress(address);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            onUpdateUserAddress(address);
        }
    }

    private final void onValidateAddress(final UiAddress address) {
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(getAddressStore().validateAddress(address.toApiAddressValidationRequest())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.address.ui.AddressMapFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressMapFragment.onValidateAddress$lambda$4(this.f$0, address, (ApiAddressValidationResult) obj);
            }
        }, getActivityErrorHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onValidateAddress$lambda$4(AddressMapFragment addressMapFragment, UiAddress uiAddress, ApiAddressValidationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getNoFieldError()) {
            addressMapFragment.getCallback().onAddressVerified(uiAddress);
        } else {
            addressMapFragment.onAddressError(uiAddress);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AddressMapFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.address.ui.AddressMapFragment$onUpdateUserAddress$1", m3645f = "AddressMapFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.address.ui.AddressMapFragment$onUpdateUserAddress$1 */
    static final class C83421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiAddress $address;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C83421(UiAddress uiAddress, Continuation<? super C83421> continuation) {
            super(2, continuation);
            this.$address = uiAddress;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AddressMapFragment.this.new C83421(this.$address, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C83421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Single<ApiAddress> singleSubmitResidentialAddress = AddressMapFragment.this.getAddressStore().submitResidentialAddress(this.$address);
                this.label = 1;
                if (RxAwait3.await(singleSubmitResidentialAddress, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onUpdateUserAddress(final UiAddress address) {
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxCompletable$default(this, null, new C83421(address, null), 1, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.address.ui.AddressMapFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddressMapFragment.onUpdateUserAddress$lambda$5(this.f$0, address);
            }
        }, new Function1() { // from class: com.robinhood.android.address.ui.AddressMapFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressMapFragment.onUpdateUserAddress$lambda$6(this.f$0, address, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUpdateUserAddress$lambda$5(AddressMapFragment addressMapFragment, UiAddress uiAddress) {
        addressMapFragment.onLoading(false);
        addressMapFragment.getCallback().onAddressVerified(uiAddress);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUpdateUserAddress$lambda$6(AddressMapFragment addressMapFragment, UiAddress uiAddress, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        addressMapFragment.onAddressError(uiAddress);
        return Unit.INSTANCE;
    }

    private final void onAddressError(UiAddress address) {
        Timber.Companion companion = Timber.INSTANCE;
        String line1 = address.getLine1();
        String line2 = address.getLine2();
        String city = address.getCity();
        UsAddress usAddress = address instanceof UsAddress ? (UsAddress) address : null;
        companion.mo3350d("Error in retrieved address: %s %s %s %s %s", line1, line2, city, usAddress != null ? usAddress.getState() : null, address.getPostalCode());
        onLoading(false);
        takeUserToManualSetup(ManualAddressReason.Error.Generic.INSTANCE, UiAddressKt.asPartialAddress(address));
    }

    private final void takeUserToManualSetup(ManualAddressReason.Error reason, PartialAddress address) {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        getCallback().onManualAddressInputSelected(reason, address);
    }

    private final UiAddress toAddress(Place place) throws Resources.NotFoundException {
        String streetAddress = Places2.getStreetAddress(place);
        Intrinsics.checkNotNull(streetAddress);
        String typedText = getBinding().onboardingAptNumberEdt.getTypedText();
        int length = typedText.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) typedText.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string2 = typedText.subSequence(i, length + 1).toString();
        String city = Places2.getCity(place);
        Intrinsics.checkNotNull(city);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String state = Places2.getState(place);
        Intrinsics.checkNotNull(state);
        String strConvertStateNameToCode = States.convertStateNameToCode(contextRequireContext, state);
        String zipcode = Places2.getZipcode(place);
        Intrinsics.checkNotNull(zipcode);
        if (Places2.isUk(place)) {
            return new GbAddress(streetAddress, string2, new PostalCodeGb(zipcode), city);
        }
        return new UsAddress(streetAddress, string2, new PostalCodeUs(zipcode), city, strConvertStateNameToCode);
    }

    /* compiled from: AddressMapFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AddressMapFragment$Companion;", "", "<init>", "()V", "EXTRA_PLACE_ID", "", "EXTRA_SESSION_TOKEN", "newInstance", "Lcom/robinhood/android/address/ui/AddressMapFragment;", "placeId", AddressMapFragment.EXTRA_SESSION_TOKEN, "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AddressMapFragment newInstance(String placeId, AutocompleteSessionToken sessionToken) {
            Intrinsics.checkNotNullParameter(placeId, "placeId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            AddressMapFragment addressMapFragment = new AddressMapFragment();
            Bundle bundle = new Bundle();
            bundle.putString(AddressMapFragment.EXTRA_PLACE_ID, placeId);
            bundle.putParcelable(AddressMapFragment.EXTRA_SESSION_TOKEN, sessionToken);
            addressMapFragment.setArguments(bundle);
            return addressMapFragment;
        }
    }
}
