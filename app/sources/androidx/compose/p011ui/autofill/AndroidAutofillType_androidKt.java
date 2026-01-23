package androidx.compose.p011ui.autofill;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidAutofillType.android.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0080\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Ljava/util/HashMap;", "Landroidx/compose/ui/autofill/AutofillType;", "", "Lkotlin/collections/HashMap;", "androidAutofillTypes", "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "getAndroidType", "(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;", "getAndroidType$annotations", "(Landroidx/compose/ui/autofill/AutofillType;)V", "androidType", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AndroidAutofillType_androidKt {
    private static final HashMap<AutofillType, String> androidAutofillTypes = MapsKt.hashMapOf(Tuples4.m3642to(AutofillType.EmailAddress, "emailAddress"), Tuples4.m3642to(AutofillType.Username, "username"), Tuples4.m3642to(AutofillType.Password, "password"), Tuples4.m3642to(AutofillType.NewUsername, "newUsername"), Tuples4.m3642to(AutofillType.NewPassword, "newPassword"), Tuples4.m3642to(AutofillType.PostalAddress, "postalAddress"), Tuples4.m3642to(AutofillType.PostalCode, "postalCode"), Tuples4.m3642to(AutofillType.CreditCardNumber, "creditCardNumber"), Tuples4.m3642to(AutofillType.CreditCardSecurityCode, "creditCardSecurityCode"), Tuples4.m3642to(AutofillType.CreditCardExpirationDate, "creditCardExpirationDate"), Tuples4.m3642to(AutofillType.CreditCardExpirationMonth, "creditCardExpirationMonth"), Tuples4.m3642to(AutofillType.CreditCardExpirationYear, "creditCardExpirationYear"), Tuples4.m3642to(AutofillType.CreditCardExpirationDay, "creditCardExpirationDay"), Tuples4.m3642to(AutofillType.AddressCountry, "addressCountry"), Tuples4.m3642to(AutofillType.AddressRegion, "addressRegion"), Tuples4.m3642to(AutofillType.AddressLocality, "addressLocality"), Tuples4.m3642to(AutofillType.AddressStreet, "streetAddress"), Tuples4.m3642to(AutofillType.AddressAuxiliaryDetails, "extendedAddress"), Tuples4.m3642to(AutofillType.PostalCodeExtended, "extendedPostalCode"), Tuples4.m3642to(AutofillType.PersonFullName, "personName"), Tuples4.m3642to(AutofillType.PersonFirstName, "personGivenName"), Tuples4.m3642to(AutofillType.PersonLastName, "personFamilyName"), Tuples4.m3642to(AutofillType.PersonMiddleName, "personMiddleName"), Tuples4.m3642to(AutofillType.PersonMiddleInitial, "personMiddleInitial"), Tuples4.m3642to(AutofillType.PersonNamePrefix, "personNamePrefix"), Tuples4.m3642to(AutofillType.PersonNameSuffix, "personNameSuffix"), Tuples4.m3642to(AutofillType.PhoneNumber, "phoneNumber"), Tuples4.m3642to(AutofillType.PhoneNumberDevice, "phoneNumberDevice"), Tuples4.m3642to(AutofillType.PhoneCountryCode, "phoneCountryCode"), Tuples4.m3642to(AutofillType.PhoneNumberNational, "phoneNational"), Tuples4.m3642to(AutofillType.Gender, "gender"), Tuples4.m3642to(AutofillType.BirthDateFull, "birthDateFull"), Tuples4.m3642to(AutofillType.BirthDateDay, "birthDateDay"), Tuples4.m3642to(AutofillType.BirthDateMonth, "birthDateMonth"), Tuples4.m3642to(AutofillType.BirthDateYear, "birthDateYear"), Tuples4.m3642to(AutofillType.SmsOtpCode, "smsOTPCode"));

    public static final String getAndroidType(AutofillType autofillType) {
        String str = androidAutofillTypes.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
