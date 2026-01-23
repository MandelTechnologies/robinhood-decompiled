package com.robinhood.android.support.call;

import com.robinhood.android.lib.pathfinder.utils.PhoneNumberFormatter;
import com.robinhood.android.support.call.ReviewCallDetailsDataState;
import com.robinhood.android.support.call.ReviewCallDetailsViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ReviewCallDetailsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J0\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\f\u0010\u0013\u001a\u00020\u000e*\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState;", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState;", "numberFormatter", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "<init>", "(Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;)V", "reduce", "dataState", "toViewState", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState$Loaded;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState$Success;", "isLoggedIn", "", "overriddenNumber", "", "loggedOutNumber", "isRequestingSupport", "toIsRequestingSupport", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$RequestSupportState;", "toErrorMessage", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState$Error;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ReviewCallDetailsStateProvider implements StateProvider<ReviewCallDetailsDataState, ReviewCallDetailsViewState> {
    public static final int $stable = PhoneNumberFormatter.$stable;
    private final PhoneNumberFormatter numberFormatter;

    public ReviewCallDetailsStateProvider(PhoneNumberFormatter numberFormatter) {
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        this.numberFormatter = numberFormatter;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public ReviewCallDetailsViewState reduce(ReviewCallDetailsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ReviewCallDetailsDataState.IssueDetailLoadState issueDetailLoadState = dataState.getIssueDetailLoadState();
        if (issueDetailLoadState instanceof ReviewCallDetailsDataState.IssueDetailLoadState.Loading) {
            return ReviewCallDetailsViewState.Loading.INSTANCE;
        }
        if (issueDetailLoadState instanceof ReviewCallDetailsDataState.IssueDetailLoadState.Success) {
            return toViewState((ReviewCallDetailsDataState.IssueDetailLoadState.Success) dataState.getIssueDetailLoadState(), dataState.isLoggedIn(), this.numberFormatter.trimNonDigitBits(dataState.getOverriddenPhoneNumber()), this.numberFormatter.trimNonDigitBits(dataState.getInitialLoggedOutPhoneNumber()), toIsRequestingSupport(dataState.getRequestSupportState()));
        }
        if (!(issueDetailLoadState instanceof ReviewCallDetailsDataState.IssueDetailLoadState.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ReviewCallDetailsViewState.Failed(toErrorMessage((ReviewCallDetailsDataState.IssueDetailLoadState.Error) dataState.getIssueDetailLoadState()));
    }

    private final ReviewCallDetailsViewState.Loaded toViewState(ReviewCallDetailsDataState.IssueDetailLoadState.Success success, boolean z, String str, String str2, boolean z2) {
        String reviewCallDetailsTitleNumberTime;
        if (str == null) {
            str = z ? success.getIssueDetail().getChannel().getPhoneNumber() : str2;
        }
        String displayNumber$default = null;
        if (str != null && (displayNumber$default = PhoneNumberFormatter.formatDisplayNumber$default(this.numberFormatter, str, false, 2, null)) == null) {
            displayNumber$default = str;
        }
        String str3 = displayNumber$default;
        if (success.getIssueDetail().getPhoneNumberEditable()) {
            reviewCallDetailsTitleNumberTime = success.getCxVoiceContent().getReviewCallDetailsTitleNumberOnly();
        } else {
            reviewCallDetailsTitleNumberTime = success.getCxVoiceContent().getReviewCallDetailsTitleNumberTime();
        }
        return new ReviewCallDetailsViewState.Loaded(reviewCallDetailsTitleNumberTime, success.getIssueDetail().getDisclosure(), success.getIssueDetail().getDisplayDescription(), str3, z, z2, success.getIssueDetail().getPhoneNumberEditable(), !(str == null || StringsKt.isBlank(str)));
    }

    private final boolean toIsRequestingSupport(ReviewCallDetailsDataState.RequestSupportState requestSupportState) {
        return Intrinsics.areEqual(requestSupportState, ReviewCallDetailsDataState.RequestSupportState.Requesting.INSTANCE);
    }

    private final String toErrorMessage(ReviewCallDetailsDataState.IssueDetailLoadState.Error error) {
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(error.getError());
        GenericErrorResponse genericErrorResponse = errorResponseExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse : null;
        if (genericErrorResponse != null) {
            return genericErrorResponse.getErrorMessage();
        }
        return null;
    }
}
