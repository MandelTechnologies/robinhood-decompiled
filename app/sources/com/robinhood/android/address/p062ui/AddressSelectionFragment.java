package com.robinhood.android.address.p062ui;

import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.ApiException;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.address.lib.p061ui.ManualAddressReason;
import com.robinhood.android.address.p062ui.AddressSelectionViewState2;
import com.robinhood.android.address.p062ui.BaseChooseAddressFragment;
import com.robinhood.android.address.p062ui.databinding.FragmentAddressSelectorBinding;
import com.robinhood.android.address.p062ui.extensions.ChooseAddressSources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.Compat;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.identi.PartialAddress;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.AlwaysScrollToTopLayoutEnforcer;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
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
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import timber.log.Timber;

/* compiled from: AddressSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\f\u0010,\u001a\u00020&*\u00020\u0005H\u0002J\b\u0010-\u001a\u00020&H\u0016J\b\u0010.\u001a\u00020&H\u0016J\b\u0010/\u001a\u00020&H\u0016J+\u00100\u001a\u00020&2\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00106\u001a\u000207H\u0016¢\u0006\u0002\u00108J\b\u00109\u001a\u00020&H\u0002J\b\u0010:\u001a\u00020&H\u0002J\u0010\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020=H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AddressSelectionFragment;", "Lcom/robinhood/android/address/ui/BaseChooseAddressFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/address/ui/databinding/FragmentAddressSelectorBinding;", "getBinding", "()Lcom/robinhood/android/address/ui/databinding/FragmentAddressSelectorBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "continueButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getContinueButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/PartialAddress;", "getAddress", "()Lcom/robinhood/models/ui/identi/PartialAddress;", "address$delegate", "Lkotlin/Lazy;", "duxo", "Lcom/robinhood/android/address/ui/AddressSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/address/ui/AddressSelectionDuxo;", "duxo$delegate", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "getSessionToken", "()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "sessionToken$delegate", "Lkotlin/properties/ReadWriteProperty;", "layoutEnforcer", "Lcom/robinhood/utils/ui/view/recyclerview/AlwaysScrollToTopLayoutEnforcer;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/address/ui/ViewType;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "bindViews", "onResume", "onPause", "onDestroyView", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "checkLocationPermissionThenSetBounds", "setLastKnownLocationBounds", "handleException", "throwable", "", "Companion", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AddressSelectionFragment extends BaseChooseAddressFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AddressSelectionFragment.class, "binding", "getBinding()Lcom/robinhood/android/address/ui/databinding/FragmentAddressSelectorBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AddressSelectionFragment.class, "sessionToken", "getSessionToken()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_ADDRESS = "extraAddress";
    private static final int PERMISSION_REQUEST_CODE = 300;
    private final GenericListAdapter<RdsRowView, AddressSelectionViewState2> adapter;

    /* renamed from: address$delegate, reason: from kotlin metadata */
    private final Lazy address;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final RdsButton continueButton;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final AlwaysScrollToTopLayoutEnforcer layoutEnforcer;

    /* renamed from: sessionToken$delegate, reason: from kotlin metadata */
    private final Interfaces3 sessionToken;

    public AddressSelectionFragment() {
        super(C8360R.layout.fragment_address_selector);
        this.binding = ViewBinding5.viewBinding(this, AddressSelectionFragment2.INSTANCE);
        this.address = Fragments2.argument(this, EXTRA_ADDRESS);
        this.duxo = OldDuxos.oldDuxo(this, AddressSelectionDuxo.class);
        AutocompleteSessionToken autocompleteSessionTokenNewInstance = AutocompleteSessionToken.newInstance();
        Intrinsics.checkNotNullExpressionValue(autocompleteSessionTokenNewInstance, "newInstance(...)");
        this.sessionToken = (Interfaces3) BindSavedState2.savedParcelable(this, autocompleteSessionTokenNewInstance).provideDelegate(this, $$delegatedProperties[1]);
        AlwaysScrollToTopLayoutEnforcer alwaysScrollToTopLayoutEnforcer = new AlwaysScrollToTopLayoutEnforcer();
        this.layoutEnforcer = alwaysScrollToTopLayoutEnforcer;
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        int i = C11048R.layout.row_list_item_container;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        GenericListAdapter<RdsRowView, AddressSelectionViewState2> genericListAdapterM2985of = companion.m2985of(i, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.address.ui.AddressSelectionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AddressSelectionFragment.adapter$lambda$2(this.f$0, (RdsRowView) obj, (AddressSelectionViewState2) obj2);
            }
        });
        genericListAdapterM2985of.registerAdapterDataObserver(alwaysScrollToTopLayoutEnforcer);
        this.adapter = genericListAdapterM2985of;
    }

    private final FragmentAddressSelectorBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAddressSelectorBinding) value;
    }

    @Override // com.robinhood.android.address.p062ui.AbstractAddressFragment
    protected RdsButton getContinueButton() {
        return this.continueButton;
    }

    private final PartialAddress getAddress() {
        return (PartialAddress) this.address.getValue();
    }

    private final AddressSelectionDuxo getDuxo() {
        return (AddressSelectionDuxo) this.duxo.getValue();
    }

    private final AutocompleteSessionToken getSessionToken() {
        Object value = this.sessionToken.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AutocompleteSessionToken) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2(final AddressSelectionFragment addressSelectionFragment, RdsRowView of, AddressSelectionViewState2 item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof AddressSelectionViewState2.Prediction) {
            final AutocompletePrediction data = ((AddressSelectionViewState2.Prediction) item).getData();
            SpannableString primaryText = data.getPrimaryText(null);
            Intrinsics.checkNotNullExpressionValue(primaryText, "getPrimaryText(...)");
            RdsRowView.bind$default(of, primaryText, data.getSecondaryText(null), null, null, null, 28, null);
            OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.address.ui.AddressSelectionFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddressSelectionFragment.adapter$lambda$2$lambda$0(this.f$0, data);
                }
            });
        } else {
            if (!(item instanceof AddressSelectionViewState2.ManualInput)) {
                throw new NoWhenBranchMatchedException();
            }
            CharSequence text = addressSelectionFragment.getText(ChooseAddressSources.getFallbackRes(addressSelectionFragment.getCallback().getSource()));
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            RdsRowView.bind$default(of, text, null, null, null, null, 28, null);
            OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.address.ui.AddressSelectionFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddressSelectionFragment.adapter$lambda$2$lambda$1(this.f$0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2$lambda$0(AddressSelectionFragment addressSelectionFragment, AutocompletePrediction autocompletePrediction) {
        BaseChooseAddressFragment.Callback callback = addressSelectionFragment.getCallback();
        String placeId = autocompletePrediction.getPlaceId();
        Intrinsics.checkNotNullExpressionValue(placeId, "getPlaceId(...)");
        callback.onAddressSelected(placeId, addressSelectionFragment.getSessionToken());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2$lambda$1(AddressSelectionFragment addressSelectionFragment) {
        addressSelectionFragment.getCallback().onManualAddressInputSelected(ManualAddressReason.UserAction.INSTANCE, addressSelectionFragment.getAddress());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().setSource(getCallback().getSource());
        getDuxo().setCountryCode(getCallback().getCountryCode());
        getDuxo().setSessionToken(getSessionToken());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        checkLocationPermissionThenSetBounds();
        bindViews(getBinding());
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.address.ui.AddressSelectionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSelectionFragment.onViewCreated$lambda$6(this.f$0, (OnboardingAddressSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(AddressSelectionFragment addressSelectionFragment, OnboardingAddressSelectionViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        UiEvent<Throwable> error = state.getError();
        Throwable thConsume = error != null ? error.consume() : null;
        if (thConsume != null) {
            addressSelectionFragment.handleException(thConsume);
            return Unit.INSTANCE;
        }
        FragmentAddressSelectorBinding binding = addressSelectionFragment.getBinding();
        if (!state.isInInitialState()) {
            RhTextView onboardingAddressRequiredInfoDisclaimer = binding.onboardingAddressRequiredInfoDisclaimer;
            Intrinsics.checkNotNullExpressionValue(onboardingAddressRequiredInfoDisclaimer, "onboardingAddressRequiredInfoDisclaimer");
            onboardingAddressRequiredInfoDisclaimer.setVisibility(8);
            Space extraSpace1 = binding.extraSpace1;
            Intrinsics.checkNotNullExpressionValue(extraSpace1, "extraSpace1");
            extraSpace1.setVisibility(8);
            Space extraSpace2 = binding.extraSpace2;
            Intrinsics.checkNotNullExpressionValue(extraSpace2, "extraSpace2");
            extraSpace2.setVisibility(8);
            RecyclerView onboardingAddressSelectorList = addressSelectionFragment.getBinding().onboardingAddressSelectorList;
            Intrinsics.checkNotNullExpressionValue(onboardingAddressSelectorList, "onboardingAddressSelectorList");
            onboardingAddressSelectorList.setVisibility(0);
            RhTextView onboardingAddressDisclaimer = binding.onboardingAddressDisclaimer;
            Intrinsics.checkNotNullExpressionValue(onboardingAddressDisclaimer, "onboardingAddressDisclaimer");
            onboardingAddressDisclaimer.setVisibility(8);
        }
        RdsProgressBar onboardingAddressProgressBar = addressSelectionFragment.getBinding().onboardingAddressProgressBar;
        Intrinsics.checkNotNullExpressionValue(onboardingAddressProgressBar, "onboardingAddressProgressBar");
        onboardingAddressProgressBar.setVisibility(state.getShowProgressBar() ? 0 : 8);
        Integer addressPromptRes = state.getAddressPromptRes();
        if (addressPromptRes != null) {
            binding.onboardingAddressRequiredInfoDisclaimer.setText(addressPromptRes.intValue());
        }
        addressSelectionFragment.adapter.submitList(state.getViewTypes());
        return Unit.INSTANCE;
    }

    private final void bindViews(FragmentAddressSelectorBinding fragmentAddressSelectorBinding) {
        RecyclerView recyclerView = fragmentAddressSelectorBinding.onboardingAddressSelectorList;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, this.adapter);
        recyclerView.setHasFixedSize(true);
        this.layoutEnforcer.setRecyclerView(fragmentAddressSelectorBinding.onboardingAddressSelectorList);
        ChooseAddressSource source = getCallback().getSource();
        fragmentAddressSelectorBinding.onboardingAddressDisclaimer.setText(ChooseAddressSources.getDisclaimerRes(source));
        if (Build.VERSION.SDK_INT >= 26) {
            fragmentAddressSelectorBinding.onboardingAddressEdt.setImportantForAutofill(1);
            fragmentAddressSelectorBinding.onboardingAddressEdt.setAutofillHints(new String[]{"street-address", "address-line1", "postalAddress"});
        }
        fragmentAddressSelectorBinding.onboardingAddressEdt.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.robinhood.android.address.ui.AddressSelectionFragment.bindViews.2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return true;
            }
        });
        fragmentAddressSelectorBinding.onboardingAddressEdt.setHint(ChooseAddressSources.getHintRes(source));
        RdsTextInputEditText onboardingAddressEdt = fragmentAddressSelectorBinding.onboardingAddressEdt;
        Intrinsics.checkNotNullExpressionValue(onboardingAddressEdt, "onboardingAddressEdt");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(onboardingAddressEdt), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C83543(getDuxo()));
    }

    /* compiled from: AddressSelectionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.address.ui.AddressSelectionFragment$bindViews$3 */
    /* synthetic */ class C83543 extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        C83543(Object obj) {
            super(1, obj, AddressSelectionDuxo.class, "onQueryChanges", "onQueryChanges(Ljava/lang/CharSequence;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AddressSelectionDuxo) this.receiver).onQueryChanges(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RdsTextInputEditText onboardingAddressEdt = getBinding().onboardingAddressEdt;
        Intrinsics.checkNotNullExpressionValue(onboardingAddressEdt, "onboardingAddressEdt");
        BaseFragment.keyboardFocusOn$default(this, onboardingAddressEdt, false, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        super.onPause();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.layoutEnforcer.setRecyclerView(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 300) {
            if ((grantResults.length == 0) || grantResults[0] != 0) {
                return;
            }
            setLastKnownLocationBounds();
        }
    }

    private final void checkLocationPermissionThenSetBounds() {
        Compat compat = Compat.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (compat.checkSelfPermission(fragmentActivityRequireActivity, "android.permission.ACCESS_COARSE_LOCATION")) {
            setLastKnownLocationBounds();
        } else {
            requestPermissionsCompat(300, "android.permission.ACCESS_COARSE_LOCATION");
        }
    }

    private final void setLastKnownLocationBounds() {
        Object systemService = requireActivity().getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        try {
            getDuxo().setLocation(((LocationManager) systemService).getLastKnownLocation("network"));
        } catch (SecurityException unused) {
            Timber.INSTANCE.mo3353e("Caught SecurityException when trying to access last known location", new Object[0]);
        }
    }

    private final void handleException(Throwable throwable) {
        ApiException apiException = (ApiException) Throwables.findCause(throwable, ApiException.class);
        if (apiException != null) {
            int statusCode = apiException.getStatusCode();
            if (statusCode == 7 || statusCode == 15) {
                return;
            }
            getAnalytics().logError(AnalyticsStrings.ERROR_GOOGLE_MAPS_API, String.valueOf(statusCode));
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, apiException, false, null, 4, null);
            return;
        }
        if (!AbsErrorHandler.handleError$default(getActivityErrorHandler(), throwable, false, 2, null)) {
            throw new RuntimeException(throwable);
        }
    }

    /* compiled from: AddressSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AddressSelectionFragment$Companion;", "", "<init>", "()V", "PERMISSION_REQUEST_CODE", "", "EXTRA_ADDRESS", "", "newInstance", "Lcom/robinhood/android/address/ui/AddressSelectionFragment;", "partialAddress", "Lcom/robinhood/models/ui/identi/PartialAddress;", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AddressSelectionFragment newInstance(PartialAddress partialAddress) {
            Intrinsics.checkNotNullParameter(partialAddress, "partialAddress");
            AddressSelectionFragment addressSelectionFragment = new AddressSelectionFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(AddressSelectionFragment.EXTRA_ADDRESS, partialAddress);
            addressSelectionFragment.setArguments(bundle);
            return addressSelectionFragment;
        }
    }
}
