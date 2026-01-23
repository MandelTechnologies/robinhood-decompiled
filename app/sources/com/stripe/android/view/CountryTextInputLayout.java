package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.LocaleListCompat;
import com.google.android.material.R$attr;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R$layout;
import com.stripe.android.R$string;
import com.stripe.android.R$styleable;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import java.util.Locale;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* compiled from: CountryTextInputLayout.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002JKB%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020.H\u0002J\n\u0010/\u001a\u0004\u0018\u00010\u001cH\u0007J\b\u00100\u001a\u00020\rH\u0002J\u0012\u00101\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000103H\u0014J\n\u00104\u001a\u0004\u0018\u000103H\u0016J\u0015\u00105\u001a\u00020\u00152\u0006\u00102\u001a\u000206H\u0001¢\u0006\u0002\b7J\u001b\u00108\u001a\u00020\u00152\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H\u0000¢\u0006\u0002\b<J\u0015\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001cH\u0001¢\u0006\u0002\b?J\u0015\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020;H\u0001¢\u0006\u0002\b?J\u0010\u0010@\u001a\u00020\u00152\u0006\u0010A\u001a\u00020BH\u0016J\u0012\u0010C\u001a\u00020\u00152\b\u0010>\u001a\u0004\u0018\u00010\u001cH\u0007J\b\u0010D\u001a\u00020\u0015H\u0002J\u0010\u0010E\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001cH\u0007J\u0015\u0010F\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001cH\u0000¢\u0006\u0002\bGJ\r\u0010H\u001a\u00020\u0015H\u0000¢\u0006\u0002\bIR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R0\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u0012\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R5\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001c8@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006L"}, m3636d2 = {"Lcom/stripe/android/view/CountryTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "countryAdapter", "Lcom/stripe/android/view/CountryAdapter;", "countryAutoCompleteStyleRes", "countryAutocomplete", "Landroid/widget/AutoCompleteTextView;", "getCountryAutocomplete$annotations", "()V", "getCountryAutocomplete", "()Landroid/widget/AutoCompleteTextView;", "countryChangeCallback", "Lkotlin/Function1;", "Lcom/stripe/android/core/model/Country;", "", "getCountryChangeCallback$payments_core_release$annotations", "getCountryChangeCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setCountryChangeCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "countryCodeChangeCallback", "Lcom/stripe/android/core/model/CountryCode;", "getCountryCodeChangeCallback", "setCountryCodeChangeCallback", "itemLayoutRes", "selectedCountry", "getSelectedCountry$payments_core_release", "()Lcom/stripe/android/core/model/Country;", "<set-?>", "selectedCountryCode", "getSelectedCountryCode$payments_core_release$annotations", "getSelectedCountryCode$payments_core_release", "()Lcom/stripe/android/core/model/CountryCode;", "setSelectedCountryCode$payments_core_release", "(Lcom/stripe/android/core/model/CountryCode;)V", "selectedCountryCode$delegate", "Lkotlin/properties/ReadWriteProperty;", "clearError", "getLocale", "Ljava/util/Locale;", "getSelectedCountryCode", "initializeCountryAutoCompleteWithStyle", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "restoreSelectedCountry", "Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;", "restoreSelectedCountry$payments_core_release", "setAllowedCountryCodes", "allowedCountryCodes", "", "", "setAllowedCountryCodes$payments_core_release", "setCountrySelected", "countryCode", "setCountrySelected$payments_core_release", "setEnabled", "enabled", "", "setSelectedCountryCode", "updateInitialCountry", "updateUiForCountryEntered", "updatedSelectedCountryCode", "updatedSelectedCountryCode$payments_core_release", "validateCountry", "validateCountry$payments_core_release", "Companion", "SelectedCountryState", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CountryTextInputLayout extends TextInputLayout {
    private CountryAdapter countryAdapter;
    private int countryAutoCompleteStyleRes;
    private final AutoCompleteTextView countryAutocomplete;
    private /* synthetic */ Function1<? super Country, Unit> countryChangeCallback;
    private /* synthetic */ Function1<? super CountryCode, Unit> countryCodeChangeCallback;
    private int itemLayoutRes;

    /* renamed from: selectedCountryCode$delegate, reason: from kotlin metadata */
    private final Interfaces3 selectedCountryCode;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CountryTextInputLayout.class, "selectedCountryCode", "getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DEFAULT_ITEM_LAYOUT = R$layout.stripe_country_text_view;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountryTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getCountryAutocomplete$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getCountryChangeCallback$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getSelectedCountryCode$payments_core_release$annotations() {
    }

    public /* synthetic */ CountryTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.textInputStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountryTextInputLayout(final Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = DEFAULT_ITEM_LAYOUT;
        this.itemLayoutRes = i2;
        Delegates delegates = Delegates.INSTANCE;
        final Object obj = null;
        this.selectedCountryCode = new ObservableProperty<CountryCode>(obj) { // from class: com.stripe.android.view.CountryTextInputLayout$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, CountryCode oldValue, CountryCode newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                CountryCode countryCode = newValue;
                if (countryCode != null) {
                    this.getCountryCodeChangeCallback().invoke(countryCode);
                    Country countryByCode = CountryUtils.INSTANCE.getCountryByCode(countryCode, this.getLocale());
                    if (countryByCode != null) {
                        this.getCountryChangeCallback$payments_core_release().invoke(countryByCode);
                    }
                }
            }
        };
        this.countryChangeCallback = new Function1<Country, Unit>() { // from class: com.stripe.android.view.CountryTextInputLayout$countryChangeCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Country it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Country country) {
                invoke2(country);
                return Unit.INSTANCE;
            }
        };
        this.countryCodeChangeCallback = new Function1<CountryCode, Unit>() { // from class: com.stripe.android.view.CountryTextInputLayout$countryCodeChangeCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CountryCode it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CountryCode countryCode) {
                invoke2(countryCode);
                return Unit.INSTANCE;
            }
        };
        int[] StripeCountryAutoCompleteTextInputLayout = R$styleable.StripeCountryAutoCompleteTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(StripeCountryAutoCompleteTextInputLayout, "StripeCountryAutoCompleteTextInputLayout");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StripeCountryAutoCompleteTextInputLayout, 0, 0);
        this.countryAutoCompleteStyleRes = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f6401x9c655edc, 0);
        this.itemLayoutRes = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StripeCountryAutoCompleteTextInputLayout_countryItemLayout, i2);
        typedArrayObtainStyledAttributes.recycle();
        AutoCompleteTextView autoCompleteTextViewInitializeCountryAutoCompleteWithStyle = initializeCountryAutoCompleteWithStyle();
        this.countryAutocomplete = autoCompleteTextViewInitializeCountryAutoCompleteWithStyle;
        addView(autoCompleteTextViewInitializeCountryAutoCompleteWithStyle, new LinearLayout.LayoutParams(-1, -2));
        this.countryAdapter = new CountryAdapter(context, CountryUtils.INSTANCE.getOrderedCountries(getLocale()), this.itemLayoutRes, new Function1<ViewGroup, TextView>() { // from class: com.stripe.android.view.CountryTextInputLayout.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final TextView invoke(ViewGroup it) {
                Intrinsics.checkNotNullParameter(it, "it");
                View viewInflate = LayoutInflater.from(context).inflate(this.itemLayoutRes, it, false);
                Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                return (TextView) viewInflate;
            }
        });
        autoCompleteTextViewInitializeCountryAutoCompleteWithStyle.setThreshold(0);
        autoCompleteTextViewInitializeCountryAutoCompleteWithStyle.setAdapter(this.countryAdapter);
        autoCompleteTextViewInitializeCountryAutoCompleteWithStyle.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.CountryTextInputLayout$$ExternalSyntheticLambda0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                CountryTextInputLayout._init_$lambda$5(this.f$0, adapterView, view, i3, j);
            }
        });
        autoCompleteTextViewInitializeCountryAutoCompleteWithStyle.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CountryTextInputLayout$$ExternalSyntheticLambda1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CountryTextInputLayout._init_$lambda$8(this.f$0, view, z);
            }
        });
        setSelectedCountryCode$payments_core_release(this.countryAdapter.getFirstItem$payments_core_release().getCode());
        updateInitialCountry();
        final String string2 = getResources().getString(R$string.stripe_address_country_invalid);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        autoCompleteTextViewInitializeCountryAutoCompleteWithStyle.setValidator(new CountryAutoCompleteTextViewValidator(this.countryAdapter, new Function1<Country, Unit>() { // from class: com.stripe.android.view.CountryTextInputLayout.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Country country) {
                invoke2(country);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Country country) {
                CountryTextInputLayout.this.setSelectedCountryCode$payments_core_release(country != null ? country.getCode() : null);
                if (country != null) {
                    CountryTextInputLayout.this.clearError();
                } else {
                    CountryTextInputLayout.this.setError(string2);
                    CountryTextInputLayout.this.setErrorEnabled(true);
                }
            }
        }));
    }

    public final AutoCompleteTextView getCountryAutocomplete() {
        return this.countryAutocomplete;
    }

    public final CountryCode getSelectedCountryCode$payments_core_release() {
        return (CountryCode) this.selectedCountryCode.getValue(this, $$delegatedProperties[0]);
    }

    public final void setSelectedCountryCode$payments_core_release(CountryCode countryCode) {
        this.selectedCountryCode.setValue(this, $$delegatedProperties[0], countryCode);
    }

    public final CountryCode getSelectedCountryCode() {
        return getSelectedCountryCode$payments_core_release();
    }

    public final void setSelectedCountryCode(CountryCode countryCode) {
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final Country getSelectedCountry$payments_core_release() {
        CountryCode selectedCountryCode$payments_core_release = getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release != null) {
            return CountryUtils.INSTANCE.getCountryByCode(selectedCountryCode$payments_core_release, getLocale());
        }
        return null;
    }

    public final Function1<Country, Unit> getCountryChangeCallback$payments_core_release() {
        return this.countryChangeCallback;
    }

    public final void setCountryChangeCallback$payments_core_release(Function1<? super Country, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.countryChangeCallback = function1;
    }

    public final Function1<CountryCode, Unit> getCountryCodeChangeCallback() {
        return this.countryCodeChangeCallback;
    }

    public final void setCountryCodeChangeCallback(Function1<? super CountryCode, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.countryCodeChangeCallback = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(CountryTextInputLayout this$0, AdapterView adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updatedSelectedCountryCode$payments_core_release(this$0.countryAdapter.getItem(i).getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(CountryTextInputLayout this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.countryAutocomplete.showDropDown();
            return;
        }
        String string2 = this$0.countryAutocomplete.getText().toString();
        CountryUtils countryUtils = CountryUtils.INSTANCE;
        CountryCode countryCodeByName = countryUtils.getCountryCodeByName(string2, this$0.getLocale());
        if (countryCodeByName != null) {
            this$0.updateUiForCountryEntered(countryCodeByName);
            return;
        }
        CountryCode.Companion companion = CountryCode.INSTANCE;
        if (countryUtils.getCountryByCode(companion.create(string2), this$0.getLocale()) != null) {
            this$0.updateUiForCountryEntered(companion.create(string2));
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.CountryTextInputLayout$setEnabled$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                this.this$0.getCountryAutocomplete().setEnabled(enabled);
            }
        });
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public Parcelable onSaveInstanceState() {
        Country selectedCountry$payments_core_release = getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            return new SelectedCountryState(selectedCountry$payments_core_release.getCode(), super.onSaveInstanceState());
        }
        return super.onSaveInstanceState();
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if (state instanceof SelectedCountryState) {
            restoreSelectedCountry$payments_core_release((SelectedCountryState) state);
        } else {
            super.onRestoreInstanceState(state);
        }
    }

    public final void restoreSelectedCountry$payments_core_release(SelectedCountryState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.onRestoreInstanceState(state.getSuperState());
        CountryCode countryCode = state.getCountryCode();
        updatedSelectedCountryCode$payments_core_release(countryCode);
        updateUiForCountryEntered(countryCode);
        requestLayout();
    }

    private final AutoCompleteTextView initializeCountryAutoCompleteWithStyle() {
        if (this.countryAutoCompleteStyleRes == 0) {
            return new AutoCompleteTextView(getContext(), null, androidx.appcompat.R$attr.autoCompleteTextViewStyle);
        }
        return new AutoCompleteTextView(getContext(), null, 0, this.countryAutoCompleteStyleRes);
    }

    private final void updateInitialCountry() {
        Country firstItem$payments_core_release = this.countryAdapter.getFirstItem$payments_core_release();
        this.countryAutocomplete.setText(firstItem$payments_core_release.getName());
        setSelectedCountryCode$payments_core_release(firstItem$payments_core_release.getCode());
    }

    public final void setAllowedCountryCodes$payments_core_release(Set<String> allowedCountryCodes) {
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        if (this.countryAdapter.updateUnfilteredCountries$payments_core_release(allowedCountryCodes)) {
            updateInitialCountry();
        }
    }

    public final void setCountrySelected$payments_core_release(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        updateUiForCountryEntered(countryCode);
    }

    @Deprecated
    public final void setCountrySelected$payments_core_release(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        updateUiForCountryEntered(CountryCode.INSTANCE.create(countryCode));
    }

    public final void updateUiForCountryEntered(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        CountryUtils countryUtils = CountryUtils.INSTANCE;
        Country countryByCode = countryUtils.getCountryByCode(countryCode, getLocale());
        if (countryByCode != null) {
            updatedSelectedCountryCode$payments_core_release(countryCode);
        } else {
            countryByCode = countryUtils.getCountryByCode(getSelectedCountryCode$payments_core_release(), getLocale());
        }
        this.countryAutocomplete.setText(countryByCode != null ? countryByCode.getName() : null);
    }

    public final void updatedSelectedCountryCode$payments_core_release(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        clearError();
        if (Intrinsics.areEqual(getSelectedCountryCode$payments_core_release(), countryCode)) {
            return;
        }
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final void validateCountry$payments_core_release() {
        this.countryAutocomplete.performValidation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearError() {
        setError(null);
        setErrorEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Locale getLocale() {
        Locale locale = LocaleListCompat.getAdjustedDefault().get(0);
        Intrinsics.checkNotNull(locale);
        return locale;
    }

    /* compiled from: CountryTextInputLayout.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$Companion;", "", "<init>", "()V", "", "INVALID_COUNTRY_AUTO_COMPLETE_STYLE", "I", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: CountryTextInputLayout.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;", "Landroid/os/Parcelable;", "Lcom/stripe/android/core/model/CountryCode;", "countryCode", "superState", "<init>", "(Lcom/stripe/android/core/model/CountryCode;Landroid/os/Parcelable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/core/model/CountryCode;", "getCountryCode", "()Lcom/stripe/android/core/model/CountryCode;", "Landroid/os/Parcelable;", "getSuperState", "()Landroid/os/Parcelable;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SelectedCountryState implements Parcelable {
        public static final Parcelable.Creator<SelectedCountryState> CREATOR = new Creator();
        private final CountryCode countryCode;
        private final Parcelable superState;

        /* compiled from: CountryTextInputLayout.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectedCountryState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectedCountryState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectedCountryState((CountryCode) parcel.readParcelable(SelectedCountryState.class.getClassLoader()), parcel.readParcelable(SelectedCountryState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectedCountryState[] newArray(int i) {
                return new SelectedCountryState[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectedCountryState)) {
                return false;
            }
            SelectedCountryState selectedCountryState = (SelectedCountryState) other;
            return Intrinsics.areEqual(this.countryCode, selectedCountryState.countryCode) && Intrinsics.areEqual(this.superState, selectedCountryState.superState);
        }

        public int hashCode() {
            int iHashCode = this.countryCode.hashCode() * 31;
            Parcelable parcelable = this.superState;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public String toString() {
            return "SelectedCountryState(countryCode=" + this.countryCode + ", superState=" + this.superState + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.countryCode, flags);
            parcel.writeParcelable(this.superState, flags);
        }

        public SelectedCountryState(CountryCode countryCode, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.countryCode = countryCode;
            this.superState = parcelable;
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }
    }
}
