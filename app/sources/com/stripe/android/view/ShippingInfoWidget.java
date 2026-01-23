package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R$string;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.databinding.StripeAddressWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.ShippingInformation;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ShippingInfoWidget.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001OB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0015H\u0002J\u0010\u0010:\u001a\u0002082\u0006\u00109\u001a\u00020\u0015H\u0002J\u0010\u0010;\u001a\u0002082\u0006\u00109\u001a\u00020\u0015H\u0002J\u0010\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u0002052\b\u0010*\u001a\u0004\u0018\u00010'J\b\u0010@\u001a\u000205H\u0002J\b\u0010A\u001a\u000205H\u0002J\b\u0010B\u001a\u000205H\u0002J\b\u0010C\u001a\u000205H\u0002J\b\u0010D\u001a\u000205H\u0002J\u0014\u0010E\u001a\u0002052\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GJ\b\u0010I\u001a\u000205H\u0002J\u0010\u0010J\u001a\u0002052\u0006\u0010K\u001a\u00020LH\u0002J\u0010\u0010M\u001a\u0002052\u0006\u0010K\u001a\u00020LH\u0002J\u0006\u0010N\u001a\u000208R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u000e\u0010 \u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u000e\u0010,\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b0\u00101¨\u0006P"}, m3636d2 = {"Lcom/stripe/android/view/ShippingInfoWidget;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "addressEditText", "Lcom/stripe/android/view/StripeEditText;", "addressEditText2", "addressLine1TextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "addressLine2TextInputLayout", "cityEditText", "cityTextInputLayout", "countryAutoCompleteTextView", "Lcom/stripe/android/view/CountryTextInputLayout;", "value", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenFields", "getHiddenFields", "()Ljava/util/List;", "setHiddenFields", "(Ljava/util/List;)V", "nameEditText", "nameTextInputLayout", "optionalFields", "getOptionalFields", "setOptionalFields", "phoneNumberEditText", "phoneNumberTextInputLayout", "postalCodeEditText", "postalCodeTextInputLayout", "postalCodeValidator", "Lcom/stripe/android/view/PostalCodeValidator;", "rawShippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "getRawShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "getShippingInformation", "stateEditText", "stateTextInputLayout", "viewBinding", "Lcom/stripe/android/databinding/StripeAddressWidgetBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/StripeAddressWidgetBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "hideHiddenFields", "", "initView", "isFieldHidden", "", "field", "isFieldOptional", "isFieldRequired", "populateAddressFields", PlaceTypes.ADDRESS, "Lcom/stripe/android/model/Address;", "populateShippingInfo", "renderCanadianForm", "renderGreatBritainForm", "renderInternationalForm", "renderLabels", "renderUSForm", "setAllowedCountryCodes", "allowedCountryCodes", "", "", "setupErrorHandling", "updateConfigForCountry", PlaceTypes.COUNTRY, "Lcom/stripe/android/core/model/Country;", "updatePostalCodeInputFilter", "validateAllFields", "CustomizableShippingField", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class ShippingInfoWidget extends LinearLayout {
    private final StripeEditText addressEditText;
    private final StripeEditText addressEditText2;
    private final TextInputLayout addressLine1TextInputLayout;
    private final TextInputLayout addressLine2TextInputLayout;
    private final StripeEditText cityEditText;
    private final TextInputLayout cityTextInputLayout;
    private final CountryTextInputLayout countryAutoCompleteTextView;
    private List<? extends CustomizableShippingField> hiddenFields;
    private final StripeEditText nameEditText;
    private final TextInputLayout nameTextInputLayout;
    private List<? extends CustomizableShippingField> optionalFields;
    private final StripeEditText phoneNumberEditText;
    private final TextInputLayout phoneNumberTextInputLayout;
    private final StripeEditText postalCodeEditText;
    private final TextInputLayout postalCodeTextInputLayout;
    private final PostalCodeValidator postalCodeValidator;
    private final StripeEditText stateEditText;
    private final TextInputLayout stateTextInputLayout;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShippingInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ShippingInfoWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShippingInfoWidget(final Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewBinding = LazyKt.lazy(new Function0<StripeAddressWidgetBinding>() { // from class: com.stripe.android.view.ShippingInfoWidget$viewBinding$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final StripeAddressWidgetBinding invoke() {
                StripeAddressWidgetBinding stripeAddressWidgetBindingInflate = StripeAddressWidgetBinding.inflate(LayoutInflater.from(context), this);
                Intrinsics.checkNotNullExpressionValue(stripeAddressWidgetBindingInflate, "inflate(...)");
                return stripeAddressWidgetBindingInflate;
            }
        });
        this.postalCodeValidator = new PostalCodeValidator();
        this.optionalFields = CollectionsKt.emptyList();
        this.hiddenFields = CollectionsKt.emptyList();
        CountryTextInputLayout countryAutocompleteAaw = getViewBinding().countryAutocompleteAaw;
        Intrinsics.checkNotNullExpressionValue(countryAutocompleteAaw, "countryAutocompleteAaw");
        this.countryAutoCompleteTextView = countryAutocompleteAaw;
        TextInputLayout tlAddressLine1Aaw = getViewBinding().tlAddressLine1Aaw;
        Intrinsics.checkNotNullExpressionValue(tlAddressLine1Aaw, "tlAddressLine1Aaw");
        this.addressLine1TextInputLayout = tlAddressLine1Aaw;
        TextInputLayout tlAddressLine2Aaw = getViewBinding().tlAddressLine2Aaw;
        Intrinsics.checkNotNullExpressionValue(tlAddressLine2Aaw, "tlAddressLine2Aaw");
        this.addressLine2TextInputLayout = tlAddressLine2Aaw;
        TextInputLayout tlCityAaw = getViewBinding().tlCityAaw;
        Intrinsics.checkNotNullExpressionValue(tlCityAaw, "tlCityAaw");
        this.cityTextInputLayout = tlCityAaw;
        TextInputLayout tlNameAaw = getViewBinding().tlNameAaw;
        Intrinsics.checkNotNullExpressionValue(tlNameAaw, "tlNameAaw");
        this.nameTextInputLayout = tlNameAaw;
        TextInputLayout tlPostalCodeAaw = getViewBinding().tlPostalCodeAaw;
        Intrinsics.checkNotNullExpressionValue(tlPostalCodeAaw, "tlPostalCodeAaw");
        this.postalCodeTextInputLayout = tlPostalCodeAaw;
        TextInputLayout tlStateAaw = getViewBinding().tlStateAaw;
        Intrinsics.checkNotNullExpressionValue(tlStateAaw, "tlStateAaw");
        this.stateTextInputLayout = tlStateAaw;
        TextInputLayout tlPhoneNumberAaw = getViewBinding().tlPhoneNumberAaw;
        Intrinsics.checkNotNullExpressionValue(tlPhoneNumberAaw, "tlPhoneNumberAaw");
        this.phoneNumberTextInputLayout = tlPhoneNumberAaw;
        StripeEditText etAddressLineOneAaw = getViewBinding().etAddressLineOneAaw;
        Intrinsics.checkNotNullExpressionValue(etAddressLineOneAaw, "etAddressLineOneAaw");
        this.addressEditText = etAddressLineOneAaw;
        StripeEditText etAddressLineTwoAaw = getViewBinding().etAddressLineTwoAaw;
        Intrinsics.checkNotNullExpressionValue(etAddressLineTwoAaw, "etAddressLineTwoAaw");
        this.addressEditText2 = etAddressLineTwoAaw;
        StripeEditText etCityAaw = getViewBinding().etCityAaw;
        Intrinsics.checkNotNullExpressionValue(etCityAaw, "etCityAaw");
        this.cityEditText = etCityAaw;
        StripeEditText etNameAaw = getViewBinding().etNameAaw;
        Intrinsics.checkNotNullExpressionValue(etNameAaw, "etNameAaw");
        this.nameEditText = etNameAaw;
        StripeEditText etPostalCodeAaw = getViewBinding().etPostalCodeAaw;
        Intrinsics.checkNotNullExpressionValue(etPostalCodeAaw, "etPostalCodeAaw");
        this.postalCodeEditText = etPostalCodeAaw;
        StripeEditText etStateAaw = getViewBinding().etStateAaw;
        Intrinsics.checkNotNullExpressionValue(etStateAaw, "etStateAaw");
        this.stateEditText = etStateAaw;
        StripeEditText etPhoneNumberAaw = getViewBinding().etPhoneNumberAaw;
        Intrinsics.checkNotNullExpressionValue(etPhoneNumberAaw, "etPhoneNumberAaw");
        this.phoneNumberEditText = etPhoneNumberAaw;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 26) {
            etNameAaw.setAutofillHints(new String[]{"name"});
            tlAddressLine1Aaw.setAutofillHints(new String[]{"postalAddress"});
            etPostalCodeAaw.setAutofillHints(new String[]{"postalCode"});
            etPhoneNumberAaw.setAutofillHints(new String[]{"phone"});
        }
        initView();
    }

    private final StripeAddressWidgetBinding getViewBinding() {
        return (StripeAddressWidgetBinding) this.viewBinding.getValue();
    }

    public final List<CustomizableShippingField> getOptionalFields() {
        return this.optionalFields;
    }

    public final void setOptionalFields(List<? extends CustomizableShippingField> value) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(value, "value");
        this.optionalFields = value;
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            updateConfigForCountry(selectedCountry$payments_core_release);
        }
    }

    public final List<CustomizableShippingField> getHiddenFields() {
        return this.hiddenFields;
    }

    public final void setHiddenFields(List<? extends CustomizableShippingField> value) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(value, "value");
        this.hiddenFields = value;
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            updateConfigForCountry(selectedCountry$payments_core_release);
        }
    }

    public final ShippingInformation getShippingInformation() {
        if (validateAllFields()) {
            return getRawShippingInformation();
        }
        return null;
    }

    private final ShippingInformation getRawShippingInformation() {
        Address.Builder city = new Address.Builder().setCity(this.cityEditText.getFieldText$payments_core_release());
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        return new ShippingInformation(city.setCountryCode(selectedCountry$payments_core_release != null ? selectedCountry$payments_core_release.getCode() : null).setLine1(this.addressEditText.getFieldText$payments_core_release()).setLine2(this.addressEditText2.getFieldText$payments_core_release()).setPostalCode(this.postalCodeEditText.getFieldText$payments_core_release()).setState(this.stateEditText.getFieldText$payments_core_release()).build(), this.nameEditText.getFieldText$payments_core_release(), this.phoneNumberEditText.getFieldText$payments_core_release());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShippingInfoWidget.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "", "(Ljava/lang/String;I)V", "Line1", "Line2", "City", "PostalCode", "State", "Phone", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class CustomizableShippingField {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CustomizableShippingField[] $VALUES;
        public static final CustomizableShippingField Line1 = new CustomizableShippingField("Line1", 0);
        public static final CustomizableShippingField Line2 = new CustomizableShippingField("Line2", 1);
        public static final CustomizableShippingField City = new CustomizableShippingField("City", 2);
        public static final CustomizableShippingField PostalCode = new CustomizableShippingField("PostalCode", 3);
        public static final CustomizableShippingField State = new CustomizableShippingField("State", 4);
        public static final CustomizableShippingField Phone = new CustomizableShippingField("Phone", 5);

        private static final /* synthetic */ CustomizableShippingField[] $values() {
            return new CustomizableShippingField[]{Line1, Line2, City, PostalCode, State, Phone};
        }

        public static EnumEntries<CustomizableShippingField> getEntries() {
            return $ENTRIES;
        }

        public static CustomizableShippingField valueOf(String str) {
            return (CustomizableShippingField) Enum.valueOf(CustomizableShippingField.class, str);
        }

        public static CustomizableShippingField[] values() {
            return (CustomizableShippingField[]) $VALUES.clone();
        }

        private CustomizableShippingField(String str, int i) {
        }

        static {
            CustomizableShippingField[] customizableShippingFieldArr$values = $values();
            $VALUES = customizableShippingFieldArr$values;
            $ENTRIES = EnumEntries2.enumEntries(customizableShippingFieldArr$values);
        }
    }

    public final void populateShippingInfo(ShippingInformation shippingInformation) {
        if (shippingInformation == null) {
            return;
        }
        Address address = shippingInformation.getAddress();
        if (address != null) {
            populateAddressFields(address);
        }
        this.nameEditText.setText(shippingInformation.getName());
        this.phoneNumberEditText.setText(shippingInformation.getPhone());
    }

    private final void populateAddressFields(Address address) {
        this.cityEditText.setText(address.getCity());
        String country = address.getCountry();
        if (country != null && country.length() > 0) {
            this.countryAutoCompleteTextView.setCountrySelected$payments_core_release(country);
        }
        this.addressEditText.setText(address.getLine1());
        this.addressEditText2.setText(address.getLine2());
        this.postalCodeEditText.setText(address.getPostalCode());
        this.stateEditText.setText(address.getState());
    }

    public final void setAllowedCountryCodes(Set<String> allowedCountryCodes) {
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        this.countryAutoCompleteTextView.setAllowedCountryCodes$payments_core_release(allowedCountryCodes);
    }

    public final boolean validateAllFields() {
        String string2;
        Editable text;
        String string3;
        Editable text2;
        String string4;
        Editable text3;
        String string5;
        Editable text4;
        String string6;
        Editable text5;
        String string7;
        CountryCode code;
        Editable text6 = this.addressEditText.getText();
        if (text6 != null && (string2 = text6.toString()) != null && (text = this.nameEditText.getText()) != null && (string3 = text.toString()) != null && (text2 = this.cityEditText.getText()) != null && (string4 = text2.toString()) != null && (text3 = this.stateEditText.getText()) != null && (string5 = text3.toString()) != null && (text4 = this.postalCodeEditText.getText()) != null && (string6 = text4.toString()) != null && (text5 = this.phoneNumberEditText.getText()) != null && (string7 = text5.toString()) != null) {
            this.countryAutoCompleteTextView.validateCountry$payments_core_release();
            Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
            boolean zIsValid$payments_core_release = this.postalCodeValidator.isValid$payments_core_release(string6, (selectedCountry$payments_core_release == null || (code = selectedCountry$payments_core_release.getCode()) == null) ? null : code.getValue(), this.optionalFields, this.hiddenFields);
            this.postalCodeEditText.setShouldShowError(!zIsValid$payments_core_release);
            boolean z = StringsKt.isBlank(string2) && isFieldRequired(CustomizableShippingField.Line1);
            this.addressEditText.setShouldShowError(z);
            boolean z2 = StringsKt.isBlank(string4) && isFieldRequired(CustomizableShippingField.City);
            this.cityEditText.setShouldShowError(z2);
            boolean zIsBlank = StringsKt.isBlank(string3);
            this.nameEditText.setShouldShowError(zIsBlank);
            boolean z3 = StringsKt.isBlank(string5) && isFieldRequired(CustomizableShippingField.State);
            this.stateEditText.setShouldShowError(z3);
            boolean z4 = StringsKt.isBlank(string7) && isFieldRequired(CustomizableShippingField.Phone);
            this.phoneNumberEditText.setShouldShowError(z4);
            if (zIsValid$payments_core_release && !z && !z2 && !z3 && !zIsBlank && !z4 && selectedCountry$payments_core_release != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean isFieldRequired(CustomizableShippingField field) {
        return (isFieldOptional(field) || isFieldHidden(field)) ? false : true;
    }

    private final boolean isFieldOptional(CustomizableShippingField field) {
        return this.optionalFields.contains(field);
    }

    private final boolean isFieldHidden(CustomizableShippingField field) {
        return this.hiddenFields.contains(field);
    }

    /* compiled from: ShippingInfoWidget.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.view.ShippingInfoWidget$initView$1 */
    /* synthetic */ class C426941 extends FunctionReferenceImpl implements Function1<Country, Unit> {
        C426941(Object obj) {
            super(1, obj, ShippingInfoWidget.class, "updateConfigForCountry", "updateConfigForCountry(Lcom/stripe/android/core/model/Country;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Country country) throws Resources.NotFoundException {
            invoke2(country);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Country p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ShippingInfoWidget) this.receiver).updateConfigForCountry(p0);
        }
    }

    private final void initView() throws Resources.NotFoundException {
        this.countryAutoCompleteTextView.setCountryChangeCallback$payments_core_release(new C426941(this));
        this.phoneNumberEditText.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        setupErrorHandling();
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            updateConfigForCountry(selectedCountry$payments_core_release);
        }
    }

    private final void setupErrorHandling() {
        this.addressEditText.setErrorMessageListener(new ErrorListener(this.addressLine1TextInputLayout));
        this.cityEditText.setErrorMessageListener(new ErrorListener(this.cityTextInputLayout));
        this.nameEditText.setErrorMessageListener(new ErrorListener(this.nameTextInputLayout));
        this.postalCodeEditText.setErrorMessageListener(new ErrorListener(this.postalCodeTextInputLayout));
        this.stateEditText.setErrorMessageListener(new ErrorListener(this.stateTextInputLayout));
        this.phoneNumberEditText.setErrorMessageListener(new ErrorListener(this.phoneNumberTextInputLayout));
        this.addressEditText.setErrorMessage(getResources().getString(R$string.stripe_address_required));
        this.cityEditText.setErrorMessage(getResources().getString(R$string.stripe_address_city_required));
        this.nameEditText.setErrorMessage(getResources().getString(R$string.stripe_address_name_required));
        this.phoneNumberEditText.setErrorMessage(getResources().getString(R$string.stripe_address_phone_number_required));
    }

    private final void renderLabels() throws Resources.NotFoundException {
        String string2;
        String string3;
        this.nameTextInputLayout.setHint(getResources().getString(com.stripe.android.core.R$string.stripe_address_label_full_name));
        TextInputLayout textInputLayout = this.cityTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.City)) {
            string2 = getResources().getString(R$string.stripe_address_label_city_optional);
        } else {
            string2 = getResources().getString(com.stripe.android.core.R$string.stripe_address_label_city);
        }
        textInputLayout.setHint(string2);
        TextInputLayout textInputLayout2 = this.phoneNumberTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Phone)) {
            string3 = getResources().getString(R$string.stripe_address_label_phone_number_optional);
        } else {
            string3 = getResources().getString(com.stripe.android.core.R$string.stripe_address_label_phone_number);
        }
        textInputLayout2.setHint(string3);
        hideHiddenFields();
    }

    private final void hideHiddenFields() {
        if (isFieldHidden(CustomizableShippingField.Line1)) {
            this.addressLine1TextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.Line2)) {
            this.addressLine2TextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.State)) {
            this.stateTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.City)) {
            this.cityTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.PostalCode)) {
            this.postalCodeTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.Phone)) {
            this.phoneNumberTextInputLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConfigForCountry(Country country) throws Resources.NotFoundException {
        String value = country.getCode().getValue();
        if (Intrinsics.areEqual(value, Locale.US.getCountry())) {
            renderUSForm();
        } else if (Intrinsics.areEqual(value, Locale.UK.getCountry())) {
            renderGreatBritainForm();
        } else if (Intrinsics.areEqual(value, Locale.CANADA.getCountry())) {
            renderCanadianForm();
        } else {
            renderInternationalForm();
        }
        updatePostalCodeInputFilter(country);
        this.postalCodeTextInputLayout.setVisibility((!CountryUtils.INSTANCE.doesCountryUsePostalCode(country.getCode()) || isFieldHidden(CustomizableShippingField.PostalCode)) ? 8 : 0);
    }

    private final void updatePostalCodeInputFilter(Country country) {
        this.postalCodeEditText.setFilters(Intrinsics.areEqual(country.getCode().getValue(), Locale.CANADA.getCountry()) ? new InputFilter[]{new InputFilter.AllCaps()} : new InputFilter[0]);
    }

    private final void renderUSForm() throws Resources.NotFoundException {
        String string2;
        String string3;
        String string4;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string2 = getResources().getString(R$string.stripe_address_label_address_optional);
        } else {
            string2 = getResources().getString(com.stripe.android.uicore.R$string.stripe_address_label_address);
        }
        textInputLayout.setHint(string2);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R$string.stripe_address_label_apt_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string3 = getResources().getString(R$string.stripe_address_label_zip_code_optional);
        } else {
            string3 = getResources().getString(com.stripe.android.core.R$string.stripe_address_label_zip_code);
        }
        textInputLayout2.setHint(string3);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string4 = getResources().getString(R$string.stripe_address_label_state_optional);
        } else {
            string4 = getResources().getString(com.stripe.android.core.R$string.stripe_address_label_state);
        }
        textInputLayout3.setHint(string4);
        this.postalCodeEditText.setErrorMessage(getResources().getString(com.stripe.android.uicore.R$string.stripe_address_zip_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R$string.stripe_address_state_required));
    }

    private final void renderGreatBritainForm() throws Resources.NotFoundException {
        String string2;
        String string3;
        String string4;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string2 = getResources().getString(R$string.stripe_address_label_address_line1_optional);
        } else {
            string2 = getResources().getString(com.stripe.android.core.R$string.stripe_address_label_address_line1);
        }
        textInputLayout.setHint(string2);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R$string.stripe_address_label_address_line2_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string3 = getResources().getString(R$string.stripe_address_label_postcode_optional);
        } else {
            string3 = getResources().getString(R$string.stripe_address_label_postcode);
        }
        textInputLayout2.setHint(string3);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string4 = getResources().getString(R$string.stripe_address_label_county_optional);
        } else {
            string4 = getResources().getString(com.stripe.android.core.R$string.stripe_address_label_county);
        }
        textInputLayout3.setHint(string4);
        this.postalCodeEditText.setErrorMessage(getResources().getString(R$string.stripe_address_postcode_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R$string.stripe_address_county_required));
    }

    private final void renderCanadianForm() throws Resources.NotFoundException {
        String string2;
        String string3;
        String string4;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string2 = getResources().getString(R$string.stripe_address_label_address_optional);
        } else {
            string2 = getResources().getString(com.stripe.android.uicore.R$string.stripe_address_label_address);
        }
        textInputLayout.setHint(string2);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R$string.stripe_address_label_apt_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string3 = getResources().getString(R$string.stripe_address_label_postal_code_optional);
        } else {
            string3 = getResources().getString(com.stripe.android.core.R$string.stripe_address_label_postal_code);
        }
        textInputLayout2.setHint(string3);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string4 = getResources().getString(R$string.stripe_address_label_province_optional);
        } else {
            string4 = getResources().getString(com.stripe.android.core.R$string.stripe_address_label_province);
        }
        textInputLayout3.setHint(string4);
        this.postalCodeEditText.setErrorMessage(getResources().getString(R$string.stripe_address_postal_code_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R$string.stripe_address_province_required));
    }

    private final void renderInternationalForm() throws Resources.NotFoundException {
        String string2;
        String string3;
        String string4;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string2 = getResources().getString(R$string.stripe_address_label_address_line1_optional);
        } else {
            string2 = getResources().getString(com.stripe.android.core.R$string.stripe_address_label_address_line1);
        }
        textInputLayout.setHint(string2);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R$string.stripe_address_label_address_line2_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string3 = getResources().getString(R$string.stripe_address_label_zip_postal_code_optional);
        } else {
            string3 = getResources().getString(R$string.stripe_address_label_zip_postal_code);
        }
        textInputLayout2.setHint(string3);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string4 = getResources().getString(R$string.stripe_address_label_region_generic_optional);
        } else {
            string4 = getResources().getString(R$string.stripe_address_label_region_generic);
        }
        textInputLayout3.setHint(string4);
        this.postalCodeEditText.setErrorMessage(getResources().getString(com.stripe.android.uicore.R$string.stripe_address_zip_postal_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R$string.stripe_address_region_generic_required));
    }
}
