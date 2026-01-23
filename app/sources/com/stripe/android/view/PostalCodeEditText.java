package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.R$attr;
import com.google.android.material.textfield.TextInputLayout;
import com.robinhood.iso.countrycode.CountryCode;
import com.stripe.android.R$string;
import com.stripe.android.view.PostalCodeEditText;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* compiled from: PostalCodeEditText.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002!\"B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\r\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u0017H\u0014J\u0012\u0010\u001f\u001a\u00020\u00172\b\b\u0001\u0010 \u001a\u00020\u0007H\u0002R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/view/PostalCodeEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Lcom/stripe/android/view/PostalCodeEditText$Config;", "config", "getConfig$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText$Config;", "setConfig$payments_core_release", "(Lcom/stripe/android/view/PostalCodeEditText$Config;)V", "config$delegate", "Lkotlin/properties/ReadWriteProperty;", "postalCode", "", "getPostalCode$payments_core_release", "()Ljava/lang/String;", "configureForGlobal", "", "configureForUs", "getTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "hasValidPostal", "", "hasValidPostal$payments_core_release", "onFinishInflate", "updateHint", "hintRes", "Companion", "Config", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PostalCodeEditText extends StripeEditText {

    /* renamed from: config$delegate, reason: from kotlin metadata */
    private final Interfaces3 config;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PostalCodeEditText.class, "config", "getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Pattern ZIP_CODE_PATTERN = Pattern.compile("^[0-9]{5}$");

    /* compiled from: PostalCodeEditText.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Config.values().length];
            try {
                iArr[Config.Global.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Config.f6427US.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PostalCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PostalCodeEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PostalCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Delegates delegates = Delegates.INSTANCE;
        final Config config = Config.Global;
        this.config = new ObservableProperty<Config>(config) { // from class: com.stripe.android.view.PostalCodeEditText$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, PostalCodeEditText.Config oldValue, PostalCodeEditText.Config newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                int i2 = PostalCodeEditText.WhenMappings.$EnumSwitchMapping$0[newValue.ordinal()];
                if (i2 == 1) {
                    this.configureForGlobal();
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.configureForUs();
                }
            }
        };
        setErrorMessage(getResources().getString(R$string.stripe_invalid_zip));
        setMaxLines(1);
        addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.PostalCodeEditText$special$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                this.this$0.setShouldShowError(false);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"postalCode"});
        }
    }

    public final Config getConfig$payments_core_release() {
        return (Config) this.config.getValue(this, $$delegatedProperties[0]);
    }

    public final void setConfig$payments_core_release(Config config) {
        Intrinsics.checkNotNullParameter(config, "<set-?>");
        this.config.setValue(this, $$delegatedProperties[0], config);
    }

    public final String getPostalCode$payments_core_release() {
        if (getConfig$payments_core_release() == Config.f6427US) {
            String fieldText$payments_core_release = getFieldText$payments_core_release();
            if (ZIP_CODE_PATTERN.matcher(getFieldText$payments_core_release()).matches()) {
                return fieldText$payments_core_release;
            }
            return null;
        }
        return getFieldText$payments_core_release();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        configureForGlobal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureForUs() {
        updateHint(com.stripe.android.core.R$string.stripe_address_label_zip_code);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        setKeyListener(DigitsKeyListener.getInstance(false, true));
        setNumberOnlyInputType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureForGlobal() {
        updateHint(com.stripe.android.core.R$string.stripe_address_label_postal_code);
        setKeyListener(TextKeyListener.getInstance());
        setInputType(112);
        setFilters(new InputFilter[0]);
    }

    private final void updateHint(int hintRes) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            if (textInputLayout.isHintEnabled()) {
                textInputLayout.setHint(getResources().getString(hintRes));
            } else {
                setHint(hintRes);
            }
        }
    }

    private final TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostalCodeEditText.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/view/PostalCodeEditText$Config;", "", "(Ljava/lang/String;I)V", "Global", CountryCode.COUNTRY_CODE_US, "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Config {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Config[] $VALUES;
        public static final Config Global = new Config("Global", 0);

        /* renamed from: US */
        public static final Config f6427US = new Config(CountryCode.COUNTRY_CODE_US, 1);

        private static final /* synthetic */ Config[] $values() {
            return new Config[]{Global, f6427US};
        }

        public static EnumEntries<Config> getEntries() {
            return $ENTRIES;
        }

        public static Config valueOf(String str) {
            return (Config) Enum.valueOf(Config.class, str);
        }

        public static Config[] values() {
            return (Config[]) $VALUES.clone();
        }

        private Config(String str, int i) {
        }

        static {
            Config[] configArr$values = $values();
            $VALUES = configArr$values;
            $ENTRIES = EnumEntries2.enumEntries(configArr$values);
        }
    }

    public final boolean hasValidPostal$payments_core_release() {
        if (getConfig$payments_core_release() == Config.f6427US && ZIP_CODE_PATTERN.matcher(getFieldText$payments_core_release()).matches()) {
            return true;
        }
        return getConfig$payments_core_release() == Config.Global && getFieldText$payments_core_release().length() > 0;
    }

    /* compiled from: PostalCodeEditText.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/view/PostalCodeEditText$Companion;", "", "()V", "MAX_LENGTH_US", "", "ZIP_CODE_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
