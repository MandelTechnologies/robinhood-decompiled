package com.robinhood.android.address.p062ui;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.jakewharton.rxbinding3.widget.TextViewEditorActionEvent;
import com.robinhood.android.address.p062ui.databinding.FragmentManualAddress1Binding;
import com.robinhood.android.address.p062ui.extensions.ChooseAddressSources;
import com.robinhood.android.address.p062ui.extensions.InputFilter;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.identi.ApiAddressValidationResult;
import com.robinhood.models.p355ui.identi.PartialAddress;
import com.robinhood.models.p355ui.identi.PartialGbAddress;
import com.robinhood.models.p355ui.identi.PartialUsAddress;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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

/* compiled from: ManualAddress1Fragment.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010$\u001a\u00020\u001e\"\u0004\b\u0000\u0010%*\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020\u001e0&H\u0002J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020(H\u0002J\u0010\u0010/\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u000202H\u0002J*\u00103\u001a\u00020(2\u0006\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u000208H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cj\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e`\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/address/ui/ManualAddress1Fragment;", "Lcom/robinhood/android/address/ui/BaseChooseAddressFragment;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "binding", "Lcom/robinhood/android/address/ui/databinding/FragmentManualAddress1Binding;", "getBinding", "()Lcom/robinhood/android/address/ui/databinding/FragmentManualAddress1Binding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "source$delegate", "Lkotlin/Lazy;", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/PartialAddress;", "getAddress", "()Lcom/robinhood/models/ui/identi/PartialAddress;", "address$delegate", "addressValidationMap", "Ljava/util/HashMap;", "Landroid/widget/TextView;", "", "Lkotlin/collections/HashMap;", "continueButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getContinueButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "allValid", "T", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onContinueClicked", "validateAddress", "displayAddressValidationResult", "result", "Lcom/robinhood/models/api/identi/ApiAddressValidationResult;", "enableInputLimit", "textField", "textInputContainer", "Lcom/robinhood/android/designsystem/textinput/RdsTextInputContainerView;", "minimum", "", "limit", "Companion", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class ManualAddress1Fragment extends BaseChooseAddressFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ManualAddress1Fragment.class, "binding", "getBinding()Lcom/robinhood/android/address/ui/databinding/FragmentManualAddress1Binding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_ADDRESS = "extraAddress";
    private static final String EXTRA_SOURCE = "source";

    /* renamed from: address$delegate, reason: from kotlin metadata */
    private final Lazy address;
    private final HashMap<TextView, Boolean> addressValidationMap;
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source;

    /* compiled from: ManualAddress1Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChooseAddressSource.values().length];
            try {
                iArr[ChooseAddressSource.CASH_MANAGEMENT_PAY_BY_CHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChooseAddressSource.CASH_MANAGEMENT_SHIPPING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ManualAddress1Fragment() {
        super(C8360R.layout.fragment_manual_address_1);
        this.binding = ViewBinding5.viewBinding(this, ManualAddress1Fragment2.INSTANCE);
        this.source = Fragments2.argument(this, "source");
        this.address = Fragments2.argument(this, EXTRA_ADDRESS);
        this.addressValidationMap = new HashMap<>();
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

    private final FragmentManualAddress1Binding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentManualAddress1Binding) value;
    }

    private final ChooseAddressSource getSource() {
        return (ChooseAddressSource) this.source.getValue();
    }

    private final PartialAddress getAddress() {
        return (PartialAddress) this.address.getValue();
    }

    @Override // com.robinhood.android.address.p062ui.AbstractAddressFragment
    protected RdsButton getContinueButton() {
        RdsButton continueBtn = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        return continueBtn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> boolean allValid(Map<T, Boolean> map) {
        Collection<Boolean> collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return true;
        }
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().onboardingManualAddressPromptTxt.setText(ChooseAddressSources.getAddressPromptRes(getSource(), getCallback().getCountryCode()));
        if (getAppType() != AppType.RHC) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            InputFilter.applyAddressValidCharsetFilter(resources, getBinding().onboardingManualAddressLine1, getBinding().onboardingManualAddressLine2);
        }
        RdsButton continueBtn = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        OnClickListeners.onClick(continueBtn, new Function0() { // from class: com.robinhood.android.address.ui.ManualAddress1Fragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManualAddress1Fragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        Observable<TextViewEditorActionEvent> observableFilter = getBinding().onboardingManualAddressLine2.onEnterOrDonePressed().filter(new Predicate() { // from class: com.robinhood.android.address.ui.ManualAddress1Fragment.onViewCreated.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(TextViewEditorActionEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ManualAddress1Fragment manualAddress1Fragment = ManualAddress1Fragment.this;
                return manualAddress1Fragment.allValid(manualAddress1Fragment.addressValidationMap);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.address.ui.ManualAddress1Fragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManualAddress1Fragment.onViewCreated$lambda$2(this.f$0, (TextViewEditorActionEvent) obj);
            }
        });
        getBinding().onboardingManualAddressLine1.setSingleLine();
        getBinding().onboardingManualAddressLine2.setSingleLine();
        this.addressValidationMap.clear();
        if (getSource() == ChooseAddressSource.CASH_MANAGEMENT_SHIPPING) {
            RdsFormattedEditText onboardingManualAddressLine1 = getBinding().onboardingManualAddressLine1;
            Intrinsics.checkNotNullExpressionValue(onboardingManualAddressLine1, "onboardingManualAddressLine1");
            RdsTextInputContainerView onboardingManualAddressLine1Textinput = getBinding().onboardingManualAddressLine1Textinput;
            Intrinsics.checkNotNullExpressionValue(onboardingManualAddressLine1Textinput, "onboardingManualAddressLine1Textinput");
            enableInputLimit$default(this, onboardingManualAddressLine1, onboardingManualAddressLine1Textinput, 1, 0, 8, null);
            RdsFormattedEditText onboardingManualAddressLine2 = getBinding().onboardingManualAddressLine2;
            Intrinsics.checkNotNullExpressionValue(onboardingManualAddressLine2, "onboardingManualAddressLine2");
            RdsTextInputContainerView onboardingManualAddressLine2Textinput = getBinding().onboardingManualAddressLine2Textinput;
            Intrinsics.checkNotNullExpressionValue(onboardingManualAddressLine2Textinput, "onboardingManualAddressLine2Textinput");
            enableInputLimit$default(this, onboardingManualAddressLine2, onboardingManualAddressLine2Textinput, 0, 0, 8, null);
        } else {
            RdsFormattedEditText onboardingManualAddressLine12 = getBinding().onboardingManualAddressLine1;
            Intrinsics.checkNotNullExpressionValue(onboardingManualAddressLine12, "onboardingManualAddressLine1");
            Observable<R> map = RxTextView.textChanges(onboardingManualAddressLine12).map(new Function() { // from class: com.robinhood.android.address.ui.ManualAddress1Fragment.onViewCreated.4
                @Override // io.reactivex.functions.Function
                public final Boolean apply(CharSequence text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return Boolean.valueOf(text.length() > 0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.address.ui.ManualAddress1Fragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManualAddress1Fragment.onViewCreated$lambda$3(this.f$0, (Boolean) obj);
                }
            });
        }
        if (savedInstanceState == null) {
            getBinding().onboardingManualAddressLine1.setText(getAddress().getLine1());
            getBinding().onboardingManualAddressLine2.setText(getAddress().getLine2());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            getBinding().onboardingManualAddressLine1.setImportantForAutofill(1);
            getBinding().onboardingManualAddressLine1.setAutofillHints(new String[]{"address-line1"});
            getBinding().onboardingManualAddressLine2.setImportantForAutofill(1);
            getBinding().onboardingManualAddressLine2.setAutofillHints(new String[]{"address-line2"});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ManualAddress1Fragment manualAddress1Fragment) {
        manualAddress1Fragment.onContinueClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(ManualAddress1Fragment manualAddress1Fragment, TextViewEditorActionEvent textViewEditorActionEvent) {
        manualAddress1Fragment.onContinueClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(ManualAddress1Fragment manualAddress1Fragment, Boolean bool) {
        manualAddress1Fragment.addressValidationMap.put(manualAddress1Fragment.getBinding().onboardingManualAddressLine1, bool);
        manualAddress1Fragment.setContinueEnabled(manualAddress1Fragment.allValid(manualAddress1Fragment.addressValidationMap));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RdsFormattedEditText onboardingManualAddressLine1 = getBinding().onboardingManualAddressLine1;
        Intrinsics.checkNotNullExpressionValue(onboardingManualAddressLine1, "onboardingManualAddressLine1");
        BaseFragment.keyboardFocusOn$default(this, onboardingManualAddressLine1, false, 2, null);
    }

    private final void onContinueClicked() {
        PartialAddress partialAddressCopy$default;
        onLoading(true);
        String strValueOf = String.valueOf(getBinding().onboardingManualAddressLine1.getText());
        String strValueOf2 = String.valueOf(getBinding().onboardingManualAddressLine2.getText());
        PartialAddress address = getAddress();
        if (address instanceof PartialUsAddress) {
            partialAddressCopy$default = PartialUsAddress.copy$default((PartialUsAddress) address, strValueOf, strValueOf2, null, null, null, 28, null);
        } else {
            if (!(address instanceof PartialGbAddress)) {
                throw new NoWhenBranchMatchedException();
            }
            partialAddressCopy$default = PartialGbAddress.copy$default((PartialGbAddress) address, strValueOf, strValueOf2, null, null, 12, null);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[getCallback().getSource().ordinal()];
        if (i == 1 || i == 2) {
            getCallback().onManualAddressVerified(partialAddressCopy$default);
        } else {
            validateAddress(partialAddressCopy$default);
        }
    }

    private final void validateAddress(final PartialAddress address) {
        Single singleDoOnEvent = SinglesAndroid.observeOnMainThread(getAddressStore().validateAddress(address.toApiAddressValidationRequest())).doOnEvent(new BiConsumer() { // from class: com.robinhood.android.address.ui.ManualAddress1Fragment.validateAddress.1
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(ApiAddressValidationResult apiAddressValidationResult, Throwable th) {
                ManualAddress1Fragment.this.onLoading(false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnEvent, "doOnEvent(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnEvent, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.address.ui.ManualAddress1Fragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManualAddress1Fragment.validateAddress$lambda$4(this.f$0, address, (ApiAddressValidationResult) obj);
            }
        }, getActivityErrorHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateAddress$lambda$4(ManualAddress1Fragment manualAddress1Fragment, PartialAddress partialAddress, ApiAddressValidationResult apiAddressValidationResult) {
        Intrinsics.checkNotNull(apiAddressValidationResult);
        if (manualAddress1Fragment.displayAddressValidationResult(apiAddressValidationResult)) {
            manualAddress1Fragment.getCallback().onManualAddressVerified(partialAddress);
        }
        return Unit.INSTANCE;
    }

    private final boolean displayAddressValidationResult(ApiAddressValidationResult result) {
        getBinding().onboardingManualAddressLine1Textinput.setErrorText(result.getLine1());
        getBinding().onboardingManualAddressLine2Textinput.setErrorText(result.getLine2());
        return result.getLine1() == null && result.getLine2() == null;
    }

    static /* synthetic */ void enableInputLimit$default(ManualAddress1Fragment manualAddress1Fragment, TextView textView, RdsTextInputContainerView rdsTextInputContainerView, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 30;
        }
        manualAddress1Fragment.enableInputLimit(textView, rdsTextInputContainerView, i, i2);
    }

    private final void enableInputLimit(final TextView textField, RdsTextInputContainerView textInputContainer, final int minimum, final int limit) {
        textInputContainer.setCounterMaxLength(limit);
        textInputContainer.setCounterEnabled(true);
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(textField), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.address.ui.ManualAddress1Fragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManualAddress1Fragment.enableInputLimit$lambda$6$lambda$5(minimum, limit, this, textField, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enableInputLimit$lambda$6$lambda$5(int i, int i2, ManualAddress1Fragment manualAddress1Fragment, TextView textView, CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        manualAddress1Fragment.addressValidationMap.put(textView, Boolean.valueOf(text.length() >= i && text.length() <= i2));
        manualAddress1Fragment.setContinueEnabled(manualAddress1Fragment.allValid(manualAddress1Fragment.addressValidationMap));
        return Unit.INSTANCE;
    }

    /* compiled from: ManualAddress1Fragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/address/ui/ManualAddress1Fragment$Companion;", "", "<init>", "()V", "EXTRA_SOURCE", "", "EXTRA_ADDRESS", "newInstance", "Lcom/robinhood/android/address/ui/ManualAddress1Fragment;", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/PartialAddress;", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ManualAddress1Fragment newInstance(ChooseAddressSource source, PartialAddress address) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(address, "address");
            ManualAddress1Fragment manualAddress1Fragment = new ManualAddress1Fragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("source", source);
            bundle.putParcelable(ManualAddress1Fragment.EXTRA_ADDRESS, address);
            manualAddress1Fragment.setArguments(bundle);
            return manualAddress1Fragment;
        }
    }
}
