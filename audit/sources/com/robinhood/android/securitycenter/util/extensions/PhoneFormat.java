package com.robinhood.android.securitycenter.util.extensions;

import android.telephony.PhoneNumberUtils;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.utils.extensions.StringsKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneFormat.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"formatPhoneForMfa", "", "phoneNumber", "user", "Lcom/robinhood/models/db/sheriff/User;", "feature-security-center_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.util.extensions.PhoneFormatKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class PhoneFormat {
    public static final String formatPhoneForMfa(String phoneNumber, User user) {
        String country;
        String strFromE164ToNanpPhoneNumber;
        User.Origin origin;
        CountryCode.Supported locality;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        if (user == null || (origin = user.getOrigin()) == null || (locality = origin.getLocality()) == null || (country = locality.getIso3166CountryCode()) == null) {
            country = Locale.US.getCountry();
        }
        String numberToE164 = PhoneNumberUtils.formatNumberToE164(phoneNumber, country);
        if (Intrinsics.areEqual(country, Locale.US.getCountry())) {
            strFromE164ToNanpPhoneNumber = numberToE164 != null ? StringsKt.fromE164ToNanpPhoneNumber(numberToE164) : null;
        } else {
            strFromE164ToNanpPhoneNumber = phoneNumber;
        }
        return strFromE164ToNanpPhoneNumber == null ? phoneNumber : strFromE164ToNanpPhoneNumber;
    }
}
