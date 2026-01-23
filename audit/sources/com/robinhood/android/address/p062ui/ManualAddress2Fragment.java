package com.robinhood.android.address.p062ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.address.lib.places.States;
import com.robinhood.android.address.p062ui.StateSelectBottomSheetFragment;
import com.robinhood.android.address.p062ui.databinding.FragmentManualAddress2Binding;
import com.robinhood.android.address.p062ui.extensions.ChooseAddressSources;
import com.robinhood.android.address.p062ui.extensions.InputFilter;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressUsageType;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.identi.ApiAddress;
import com.robinhood.models.api.identi.ApiAddressValidationResult;
import com.robinhood.models.p355ui.identi.GbAddress;
import com.robinhood.models.p355ui.identi.PartialAddress;
import com.robinhood.models.p355ui.identi.PartialGbAddress;
import com.robinhood.models.p355ui.identi.PartialUsAddress;
import com.robinhood.models.p355ui.identi.PostalCode;
import com.robinhood.models.p355ui.identi.PostalCodeGb;
import com.robinhood.models.p355ui.identi.PostalCodeUs;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.models.p355ui.identi.UsAddress;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.subjects.PublishSubject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: ManualAddress2Fragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020,H\u0016J\b\u00101\u001a\u00020,H\u0016J\u0010\u00102\u001a\u00020,2\u0006\u00103\u001a\u00020\"H\u0016J\b\u00104\u001a\u00020,H\u0002J\b\u00105\u001a\u00020,H\u0002J\u0010\u00106\u001a\u00020,2\u0006\u0010\u001b\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020,2\u0006\u0010\u001b\u001a\u000207H\u0002J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020%0!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001c\u0010(\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\"0\"0)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/address/ui/ManualAddress2Fragment;", "Lcom/robinhood/android/address/ui/BaseChooseAddressFragment;", "Lcom/robinhood/android/address/ui/StateSelectBottomSheetFragment$Callbacks;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "binding", "Lcom/robinhood/android/address/ui/databinding/FragmentManualAddress2Binding;", "getBinding", "()Lcom/robinhood/android/address/ui/databinding/FragmentManualAddress2Binding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "continueButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getContinueButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "source$delegate", "Lkotlin/Lazy;", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/PartialAddress;", "getAddress", "()Lcom/robinhood/models/ui/identi/PartialAddress;", "address$delegate", "identiFieldErrorNames", "", "", "[Ljava/lang/String;", "identiFieldErrorViews", "Landroid/view/View;", "getIdentiFieldErrorViews", "()[Landroid/view/View;", "stateSelectionEmitter", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "onViewCreated", "", "view", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "onStateSelected", "state", "onContinueClicked", "sendToServer", "onUpdateUserAddress", "Lcom/robinhood/models/ui/identi/UiAddress;", "onValidateAddress", "displayValidationResult", "", "result", "Lcom/robinhood/models/api/identi/ApiAddressValidationResult;", "Companion", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class ManualAddress2Fragment extends BaseChooseAddressFragment implements StateSelectBottomSheetFragment.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ManualAddress2Fragment.class, "binding", "getBinding()Lcom/robinhood/android/address/ui/databinding/FragmentManualAddress2Binding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_ADDRESS = "extraAddress";
    private static final String EXTRA_SOURCE = "source";
    private static final String STATE_INPUT_BOTTOM_SHEET_TAG = "stateSelectBottomSheetTag";

    /* renamed from: address$delegate, reason: from kotlin metadata */
    private final Lazy address;
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final String[] identiFieldErrorNames;

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source;
    private final PublishSubject<String> stateSelectionEmitter;

    /* compiled from: ManualAddress2Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChooseAddressUsageType.values().length];
            try {
                iArr[ChooseAddressUsageType.UPDATE_USER_BASIC_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChooseAddressUsageType.GET_VALIDATED_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ManualAddress2Fragment() {
        super(C8360R.layout.fragment_manual_address_2);
        this.binding = ViewBinding5.viewBinding(this, ManualAddress2Fragment2.INSTANCE);
        this.source = Fragments2.argument(this, "source");
        this.address = Fragments2.argument(this, EXTRA_ADDRESS);
        this.identiFieldErrorNames = new String[]{"locality", PlaceTypes.POSTAL_CODE};
        PublishSubject<String> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        this.stateSelectionEmitter = publishSubjectCreate;
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

    private final FragmentManualAddress2Binding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentManualAddress2Binding) value;
    }

    @Override // com.robinhood.android.address.p062ui.AbstractAddressFragment
    protected RdsButton getContinueButton() {
        RdsButton onboardingManualAddressContinueBtn = getBinding().onboardingManualAddressContinueBtn;
        Intrinsics.checkNotNullExpressionValue(onboardingManualAddressContinueBtn, "onboardingManualAddressContinueBtn");
        return onboardingManualAddressContinueBtn;
    }

    private final ChooseAddressSource getSource() {
        return (ChooseAddressSource) this.source.getValue();
    }

    private final PartialAddress getAddress() {
        return (PartialAddress) this.address.getValue();
    }

    private final View[] getIdentiFieldErrorViews() {
        return new View[]{getBinding().onboardingManualAddressCityTextinput, getBinding().onboardingManualAddressZipTextinput};
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getAppType() != AppType.RHC) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            InputFilter.applyAddressValidCharsetFilter(resources, getBinding().onboardingManualAddressCity);
        }
        getBinding().onboardingManualAddressPromptTxt.setText(ChooseAddressSources.getAddressPromptRes(getSource(), getCallback().getCountryCode()));
        RdsButton onboardingManualAddressContinueBtn = getBinding().onboardingManualAddressContinueBtn;
        Intrinsics.checkNotNullExpressionValue(onboardingManualAddressContinueBtn, "onboardingManualAddressContinueBtn");
        OnClickListeners.onClick(onboardingManualAddressContinueBtn, new Function0() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManualAddress2Fragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        final PartialAddress address = getAddress();
        if (address instanceof PartialUsAddress) {
            StateDropdown onboardingManualAddressStateDropdown = getBinding().onboardingManualAddressStateDropdown;
            Intrinsics.checkNotNullExpressionValue(onboardingManualAddressStateDropdown, "onboardingManualAddressStateDropdown");
            OnClickListeners.onClick(onboardingManualAddressStateDropdown, new Function0() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ManualAddress2Fragment.onViewCreated$lambda$1(this.f$0);
                }
            });
            StateDropdown onboardingManualAddressStateDropdown2 = getBinding().onboardingManualAddressStateDropdown;
            Intrinsics.checkNotNullExpressionValue(onboardingManualAddressStateDropdown2, "onboardingManualAddressStateDropdown");
            onboardingManualAddressStateDropdown2.setVisibility(0);
            RdsTextInputContainerView onboardingManualAddressProvinceTextinput = getBinding().onboardingManualAddressProvinceTextinput;
            Intrinsics.checkNotNullExpressionValue(onboardingManualAddressProvinceTextinput, "onboardingManualAddressProvinceTextinput");
            onboardingManualAddressProvinceTextinput.setVisibility(8);
        } else {
            if (!(address instanceof PartialGbAddress)) {
                throw new NoWhenBranchMatchedException();
            }
            StateDropdown onboardingManualAddressStateDropdown3 = getBinding().onboardingManualAddressStateDropdown;
            Intrinsics.checkNotNullExpressionValue(onboardingManualAddressStateDropdown3, "onboardingManualAddressStateDropdown");
            onboardingManualAddressStateDropdown3.setVisibility(8);
            RdsTextInputContainerView onboardingManualAddressProvinceTextinput2 = getBinding().onboardingManualAddressProvinceTextinput;
            Intrinsics.checkNotNullExpressionValue(onboardingManualAddressProvinceTextinput2, "onboardingManualAddressProvinceTextinput");
            onboardingManualAddressProvinceTextinput2.setVisibility(8);
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getBinding().onboardingManualAddressZip.focusChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManualAddress2Fragment.onViewCreated$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        getBinding().onboardingManualAddressStateDropdown.setHint(getResources().getString(C8360R.string.address_manual_state_hint));
        getBinding().onboardingManualAddressCity.setText(address.getCity());
        RdsFormattedEditText rdsFormattedEditText = getBinding().onboardingManualAddressZip;
        PostalCode postalCode = address.getPostalCode();
        rdsFormattedEditText.setText(postalCode != null ? postalCode.getNetworkValue() : null);
        getBinding().numpad.useDefaultKeyHandler();
        RdsFormattedEditText onboardingManualAddressCity = getBinding().onboardingManualAddressCity;
        Intrinsics.checkNotNullExpressionValue(onboardingManualAddressCity, "onboardingManualAddressCity");
        ObservableSource map = RxTextView.textChanges(onboardingManualAddressCity).map(new Function() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment$onViewCreated$cityValid$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.length() > 0);
            }
        });
        Observable observableStartWith = this.stateSelectionEmitter.map(new Function() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment$onViewCreated$stateValid$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.length() > 0);
            }
        }).startWith((Observable<R>) Boolean.FALSE);
        RdsFormattedEditText onboardingManualAddressZip = getBinding().onboardingManualAddressZip;
        Intrinsics.checkNotNullExpressionValue(onboardingManualAddressZip, "onboardingManualAddressZip");
        ObservableSource map2 = RxTextView.textChanges(onboardingManualAddressZip).map(new Function() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment$onViewCreated$zipValid$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.length() > 0);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            getBinding().onboardingManualAddressCity.setImportantForAutofill(1);
            getBinding().onboardingManualAddressCity.setAutofillHints(new String[]{"city", "address-level2"});
            getBinding().onboardingManualAddressZip.setImportantForAutofill(1);
            getBinding().onboardingManualAddressZip.setAutofillHints(new String[]{"postalCode", "postal-code"});
            getBinding().onboardingManualAddressZip.setHint(Intrinsics.areEqual(getCallback().getCountryCode(), CountryCode.Supported.UnitedKingdom.INSTANCE) ? C8360R.string.address_manual_postcode_hint : C8360R.string.address_manual_zip_hint);
            getBinding().onboardingManualAddressStateDropdown.setImportantForAutofill(1);
            getBinding().onboardingManualAddressStateDropdown.setAutofillHints(new String[]{"state", "address-level1"});
        }
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(map);
        Intrinsics.checkNotNull(observableStartWith);
        Intrinsics.checkNotNull(map2);
        Observable observableCombineLatest = Observable.combineLatest(map, observableStartWith, map2, new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment$onViewCreated$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return (R) Boolean.valueOf(((Boolean) t1).booleanValue() && (((Boolean) t2).booleanValue() || (address instanceof PartialGbAddress)) && ((Boolean) t3).booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        LifecycleHost.DefaultImpls.bind$default(this, observableCombineLatest, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManualAddress2Fragment.onViewCreated$lambda$4(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(ManualAddress2Fragment manualAddress2Fragment) throws Resources.NotFoundException {
        manualAddress2Fragment.onContinueClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ManualAddress2Fragment manualAddress2Fragment) {
        FragmentActivity fragmentActivityRequireActivity = manualAddress2Fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        StateSelectBottomSheetFragment stateSelectBottomSheetFragment = new StateSelectBottomSheetFragment();
        FragmentManager childFragmentManager = manualAddress2Fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        stateSelectBottomSheetFragment.show(childFragmentManager, STATE_INPUT_BOTTOM_SHEET_TAG);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(ManualAddress2Fragment manualAddress2Fragment, boolean z) {
        if (z) {
            FragmentActivity fragmentActivityRequireActivity = manualAddress2Fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
            manualAddress2Fragment.requireActivity().getWindow().setSoftInputMode(2);
        }
        RdsNumpadView numpad = manualAddress2Fragment.getBinding().numpad;
        Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
        numpad.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(ManualAddress2Fragment manualAddress2Fragment, boolean z) {
        manualAddress2Fragment.setContinueEnabled(z);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RdsFormattedEditText onboardingManualAddressCity = getBinding().onboardingManualAddressCity;
        Intrinsics.checkNotNullExpressionValue(onboardingManualAddressCity, "onboardingManualAddressCity");
        BaseFragment.keyboardFocusOn$default(this, onboardingManualAddressCity, false, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    @Override // com.robinhood.android.address.ui.StateSelectBottomSheetFragment.Callbacks
    public void onStateSelected(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().onboardingManualAddressStateDropdown.setText(state);
        this.stateSelectionEmitter.onNext(state);
        getBinding().onboardingManualAddressZip.requestFocus();
    }

    private final void onContinueClicked() throws Resources.NotFoundException {
        onLoading(true);
        sendToServer();
    }

    private final void sendToServer() throws Resources.NotFoundException {
        UiAddress gbAddress;
        String typedText = getBinding().onboardingManualAddressZip.getTypedText();
        String typedText2 = getBinding().onboardingManualAddressCity.getTypedText();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        CharSequence text = getBinding().onboardingManualAddressStateDropdown.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
        String strConvertStateNameToCode = States.convertStateNameToCode(contextRequireContext, (String) text);
        PartialAddress address = getAddress();
        if (address instanceof PartialUsAddress) {
            String line1 = getAddress().getLine1();
            if (line1 != null) {
                gbAddress = new UsAddress(line1, getAddress().getLine2(), new PostalCodeUs(typedText), typedText2, strConvertStateNameToCode);
            } else {
                throw new IllegalArgumentException(("Partial address should have line1 at this point: " + getAddress()).toString());
            }
        } else {
            if (!(address instanceof PartialGbAddress)) {
                throw new NoWhenBranchMatchedException();
            }
            String line12 = getAddress().getLine1();
            if (line12 != null) {
                gbAddress = new GbAddress(line12, getAddress().getLine2(), new PostalCodeGb(typedText), typedText2);
            } else {
                throw new IllegalArgumentException(("Partial address should have line1 at this point: " + getAddress()).toString());
            }
        }
        if (getCallback().getSource() == ChooseAddressSource.CASH_MANAGEMENT_SHIPPING) {
            getCallback().onAddressVerified(gbAddress);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[getCallback().getSource().getType().ordinal()];
        if (i == 1) {
            onUpdateUserAddress(gbAddress);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            onValidateAddress(gbAddress);
        }
    }

    private final void onUpdateUserAddress(final UiAddress address) {
        Observable observableOnErrorResumeNext = SinglesAndroid.observeOnMainThread(getAddressStore().submitResidentialAddress(address)).toObservable().onErrorResumeNext(validateOnboardingErrorResponse(this.identiFieldErrorNames, getIdentiFieldErrorViews()));
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManualAddress2Fragment.onUpdateUserAddress$lambda$7(this.f$0, address, (ApiAddress) obj);
            }
        }, null, new Function0() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManualAddress2Fragment.onUpdateUserAddress$lambda$8(this.f$0);
            }
        }, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUpdateUserAddress$lambda$7(ManualAddress2Fragment manualAddress2Fragment, UiAddress uiAddress, ApiAddress apiAddress) {
        manualAddress2Fragment.getCallback().onAddressVerified(uiAddress);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUpdateUserAddress$lambda$8(ManualAddress2Fragment manualAddress2Fragment) {
        manualAddress2Fragment.onLoading(false);
        return Unit.INSTANCE;
    }

    private final void onValidateAddress(final UiAddress address) {
        Single singleDoOnEvent = SinglesAndroid.observeOnMainThread(getAddressStore().validateAddress(address.toApiAddressValidationRequest())).doOnEvent(new BiConsumer() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment.onValidateAddress.1
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(ApiAddressValidationResult apiAddressValidationResult, Throwable th) {
                ManualAddress2Fragment.this.onLoading(false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnEvent, "doOnEvent(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnEvent, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.address.ui.ManualAddress2Fragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManualAddress2Fragment.onValidateAddress$lambda$9(this.f$0, address, (ApiAddressValidationResult) obj);
            }
        }, getActivityErrorHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onValidateAddress$lambda$9(ManualAddress2Fragment manualAddress2Fragment, UiAddress uiAddress, ApiAddressValidationResult apiAddressValidationResult) {
        Intrinsics.checkNotNull(apiAddressValidationResult);
        if (manualAddress2Fragment.displayValidationResult(apiAddressValidationResult)) {
            manualAddress2Fragment.getCallback().onAddressVerified(uiAddress);
        }
        return Unit.INSTANCE;
    }

    private final boolean displayValidationResult(ApiAddressValidationResult result) {
        getBinding().onboardingManualAddressCityTextinput.setErrorText(result.getLocality());
        getBinding().onboardingManualAddressZipTextinput.setErrorText(result.getPostal_code());
        return result.getLocality() == null && result.getPostal_code() == null;
    }

    /* compiled from: ManualAddress2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/address/ui/ManualAddress2Fragment$Companion;", "", "<init>", "()V", "EXTRA_SOURCE", "", "EXTRA_ADDRESS", "STATE_INPUT_BOTTOM_SHEET_TAG", "newInstance", "Lcom/robinhood/android/address/ui/ManualAddress2Fragment;", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/PartialAddress;", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ManualAddress2Fragment newInstance(ChooseAddressSource source, PartialAddress address) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(address, "address");
            ManualAddress2Fragment manualAddress2Fragment = new ManualAddress2Fragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("source", source);
            bundle.putParcelable(ManualAddress2Fragment.EXTRA_ADDRESS, address);
            manualAddress2Fragment.setArguments(bundle);
            return manualAddress2Fragment;
        }
    }
}
