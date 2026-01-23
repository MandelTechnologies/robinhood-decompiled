package com.robinhood.android.acatsin;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AcatsInDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"D\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012*\u00020\u00152\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00128B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"SAVED_INTRO_SHOWN", "", "SAVED_BROKERAGE", "SAVED_DTCC_NUMBER", "SAVED_AVAILABLE_DESTINATIONS", "SAVED_SELECTED_RHS_ACCOUNT", "SAVED_PLAID_LINK_PENDING", "SAVED_CONTRA_ACCOUNT_NUMBER", "SAVED_PLAID_ACCESS_TOKEN_ID", "SAVED_ACCOUNT_NAMES", "SAVED_ACCOUNT_CONTENTS", "SAVED_SUPPORTED_CONTENT_TYPES", "SAVED_OPTIONS_DECLINED", "SAVED_BUILD_PARTIAL_BANNER_CONTENTFUL_ID", "SAVED_ASSETS", "SAVED_TRANSFER_ID", "SAVED_MATCH_RATE_SELECTED", "either", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "brokerageOrDtccNumber", "Landroidx/lifecycle/SavedStateHandle;", "getBrokerageOrDtccNumber", "(Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/utils/Either;", "setBrokerageOrDtccNumber", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/utils/Either;)V", "feature-acats-in_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInDuxoKt {
    private static final String SAVED_ACCOUNT_CONTENTS = "account_contents";
    private static final String SAVED_ACCOUNT_NAMES = "account_names";
    private static final String SAVED_ASSETS = "assets";
    private static final String SAVED_AVAILABLE_DESTINATIONS = "available_destinations";
    private static final String SAVED_BROKERAGE = "brokerage";
    private static final String SAVED_BUILD_PARTIAL_BANNER_CONTENTFUL_ID = "build_partial_banner_contentful_id";
    private static final String SAVED_CONTRA_ACCOUNT_NUMBER = "contra_account_number";
    private static final String SAVED_DTCC_NUMBER = "dtcc_number";
    private static final String SAVED_INTRO_SHOWN = "intro_shown";
    private static final String SAVED_MATCH_RATE_SELECTED = "match_rate_selected";
    private static final String SAVED_OPTIONS_DECLINED = "options_declined";
    private static final String SAVED_PLAID_ACCESS_TOKEN_ID = "plaid_access_token_id";
    private static final String SAVED_PLAID_LINK_PENDING = "plaid_link_pending";
    private static final String SAVED_SELECTED_RHS_ACCOUNT = "selected_rhs_account";
    private static final String SAVED_SUPPORTED_CONTENT_TYPES = "supported_content_types";
    private static final String SAVED_TRANSFER_ID = "transfer_id";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Either<ApiBrokerage, String> getBrokerageOrDtccNumber(SavedStateHandle savedStateHandle) {
        Either.Left leftAsLeft;
        ApiBrokerage apiBrokerage = (ApiBrokerage) savedStateHandle.get(SAVED_BROKERAGE);
        if (apiBrokerage != null && (leftAsLeft = Either2.asLeft(apiBrokerage)) != null) {
            return leftAsLeft;
        }
        String str = (String) savedStateHandle.get(SAVED_DTCC_NUMBER);
        if (str != null) {
            return Either2.asRight(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBrokerageOrDtccNumber(SavedStateHandle savedStateHandle, Either<ApiBrokerage, String> either) {
        if (either instanceof Either.Left) {
            savedStateHandle.set(SAVED_BROKERAGE, ((Either.Left) either).getValue());
            savedStateHandle.remove(SAVED_DTCC_NUMBER);
        } else if (either instanceof Either.Right) {
            savedStateHandle.set(SAVED_DTCC_NUMBER, ((Either.Right) either).getValue());
            savedStateHandle.remove(SAVED_BROKERAGE);
        } else {
            if (either != null) {
                throw new NoWhenBranchMatchedException();
            }
            savedStateHandle.remove(SAVED_BROKERAGE);
            savedStateHandle.remove(SAVED_DTCC_NUMBER);
        }
    }
}
