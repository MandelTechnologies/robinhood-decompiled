package com.robinhood.android.lib.pathfinder.utils;

import android.util.Patterns;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.pathfinder.utils.PhoneNumberFormatter;
import com.robinhood.models.p355ui.PhoneNumber;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PhoneNumberValidator.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberValidator;", "", "formatter", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "<init>", "(Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;)V", "validate", "", "phoneNumber", "Lcom/robinhood/models/ui/PhoneNumber;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PhoneNumberValidator {
    public static final int $stable = 0;
    private final PhoneNumberFormatter formatter;

    public PhoneNumberValidator(PhoneNumberFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.formatter = formatter;
    }

    public final boolean validate(PhoneNumber phoneNumber) {
        Object next;
        String countryCallingCode;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Iterator<T> it = InternationalInfo.INSTANCE.getInternationalInfos().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((InternationalInfo) next).getCountryCode().getIso3166CountryCode(), phoneNumber.getCountryCode().getCountry())) {
                break;
            }
        }
        InternationalInfo internationalInfo = (InternationalInfo) next;
        if (internationalInfo != null && (countryCallingCode = internationalInfo.getCountryCallingCode()) != null) {
            String str = "+" + countryCallingCode + PlaceholderUtils.XXShortPlaceholderText + phoneNumber.getNumber();
            PhoneNumberFormatter.MinMax numberLengthMinMax = this.formatter.getNumberLengthMinMax(phoneNumber.getCountryCode());
            int min = numberLengthMinMax.getMin();
            int max = numberLengthMinMax.getMax();
            if (Patterns.PHONE.matcher(str).matches() && phoneNumber.getNumber().length() >= min && phoneNumber.getNumber().length() <= max) {
                return true;
            }
        }
        return false;
    }
}
