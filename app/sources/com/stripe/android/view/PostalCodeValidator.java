package com.stripe.android.view;

import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.view.ShippingInfoWidget;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PostalCodeValidator.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/view/PostalCodeValidator;", "", "<init>", "()V", "", "postalCode", "countryCode", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "optionalShippingInfoFields", "hiddenShippingInfoFields", "", "isValid$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Z", "isValid", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PostalCodeValidator {
    private static final Companion Companion = new Companion(null);
    private static final Map<String, Pattern> POSTAL_CODE_PATTERNS = MapsKt.mapOf(Tuples4.m3642to(Locale.US.getCountry(), Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$")));

    public final boolean isValid$payments_core_release(String postalCode, String countryCode, List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields) {
        Matcher matcher;
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(optionalShippingInfoFields, "optionalShippingInfoFields");
        Intrinsics.checkNotNullParameter(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        if (countryCode == null) {
            return false;
        }
        if (StringsKt.isBlank(postalCode) && Companion.isPostalCodeNotRequired(optionalShippingInfoFields, hiddenShippingInfoFields)) {
            return true;
        }
        Pattern pattern = POSTAL_CODE_PATTERNS.get(countryCode);
        return (pattern == null || (matcher = pattern.matcher(postalCode)) == null) ? (CountryUtils.INSTANCE.doesCountryUsePostalCode(countryCode) && StringsKt.isBlank(postalCode)) ? false : true : matcher.matches();
    }

    /* compiled from: PostalCodeValidator.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R*\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/view/PostalCodeValidator$Companion;", "", "()V", "POSTAL_CODE_PATTERNS", "", "", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "isPostalCodeNotRequired", "", "optionalShippingInfoFields", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenShippingInfoFields", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPostalCodeNotRequired(List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields) {
            ShippingInfoWidget.CustomizableShippingField customizableShippingField = ShippingInfoWidget.CustomizableShippingField.PostalCode;
            return optionalShippingInfoFields.contains(customizableShippingField) || hiddenShippingInfoFields.contains(customizableShippingField);
        }
    }
}
