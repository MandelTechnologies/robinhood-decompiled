package com.robinhood.android.verification.account;

import com.robinhood.android.lib.pathfinder.utils.EmailValidator;
import com.robinhood.android.lib.pathfinder.utils.PhoneNumberFormatter;
import com.robinhood.android.lib.pathfinder.utils.PhoneNumberValidator;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p355ui.PhoneNumber;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LoggedOutAccountDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/verification/account/LoggedOutAccountDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDataState;", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailViewState;", "emailValidator", "Lcom/robinhood/android/lib/pathfinder/utils/EmailValidator;", "phoneNumberValidator", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberValidator;", "phoneNumberFormatter", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "<init>", "(Lcom/robinhood/android/lib/pathfinder/utils/EmailValidator;Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberValidator;Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;)V", "reduce", "dataState", "validateEmail", "", "email", "", "validateNumber", "phoneNumber", "Lcom/robinhood/models/ui/PhoneNumber;", "calculateMaxLength", "", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class LoggedOutAccountDetailStateProvider implements StateProvider<LoggedOutAccountDetailDataState, LoggedOutAccountDetailViewState> {
    public static final int $stable = (PhoneNumberFormatter.$stable | PhoneNumberValidator.$stable) | EmailValidator.$stable;
    private final EmailValidator emailValidator;
    private final PhoneNumberFormatter phoneNumberFormatter;
    private final PhoneNumberValidator phoneNumberValidator;

    public LoggedOutAccountDetailStateProvider(EmailValidator emailValidator, PhoneNumberValidator phoneNumberValidator, PhoneNumberFormatter phoneNumberFormatter) {
        Intrinsics.checkNotNullParameter(emailValidator, "emailValidator");
        Intrinsics.checkNotNullParameter(phoneNumberValidator, "phoneNumberValidator");
        Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
        this.emailValidator = emailValidator;
        this.phoneNumberValidator = phoneNumberValidator;
        this.phoneNumberFormatter = phoneNumberFormatter;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public LoggedOutAccountDetailViewState reduce(LoggedOutAccountDetailDataState dataState) {
        boolean z;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean zValidateEmail = validateEmail(dataState.getEmail());
        boolean zValidateNumber = validateNumber(dataState.getPhoneNumber());
        UUID inquiryId = dataState.getInquiryId();
        String email = dataState.getEmail();
        PhoneNumber phoneNumber = dataState.getPhoneNumber();
        int iCalculateMaxLength = calculateMaxLength(dataState.getPhoneNumber());
        boolean z2 = false;
        boolean z3 = (StringsKt.isBlank(dataState.getEmail()) || zValidateEmail) ? false : true;
        if (StringsKt.isBlank(dataState.getPhoneNumber().getNumber()) || zValidateNumber) {
            z = false;
        } else {
            z = false;
            z2 = true;
        }
        boolean zIsRefreshingInquiry = dataState.isRefreshingInquiry();
        if (zValidateEmail && zValidateNumber) {
            z = true;
        }
        return new LoggedOutAccountDetailViewState(inquiryId, email, phoneNumber, iCalculateMaxLength, z3, z2, zIsRefreshingInquiry, z);
    }

    private final boolean validateEmail(String email) {
        if (email == null) {
            return false;
        }
        return this.emailValidator.validate(email);
    }

    private final boolean validateNumber(PhoneNumber phoneNumber) {
        if (phoneNumber == null) {
            return false;
        }
        return this.phoneNumberValidator.validate(phoneNumber);
    }

    private final int calculateMaxLength(PhoneNumber phoneNumber) {
        return this.phoneNumberFormatter.getNumberLengthMinMax(phoneNumber.getCountryCode()).getMax();
    }
}
