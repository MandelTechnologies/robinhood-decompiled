package com.robinhood.android.teller;

import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiTellerLinkingError.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/teller/ApiTellerLinkingError;", "", "display_error_text", "", "display_error_title", "error_message", "display_error_button_title", "primary_action", "Lcom/robinhood/android/teller/TellerErrorAction;", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "secondary_action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/teller/TellerErrorAction;Ljava/lang/String;Lcom/robinhood/android/teller/TellerErrorAction;)V", "getDisplay_error_text", "()Ljava/lang/String;", "getDisplay_error_title", "getError_message", "getDisplay_error_button_title", "getPrimary_action", "()Lcom/robinhood/android/teller/TellerErrorAction;", "getSecondary_cta", "getSecondary_action", "lib-teller_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ApiTellerLinkingError {
    private final String display_error_button_title;
    private final String display_error_text;
    private final String display_error_title;
    private final String error_message;
    private final TellerErrorAction primary_action;
    private final TellerErrorAction secondary_action;
    private final String secondary_cta;

    public ApiTellerLinkingError(String display_error_text, String display_error_title, String error_message, String display_error_button_title, TellerErrorAction primary_action, String str, TellerErrorAction tellerErrorAction) {
        Intrinsics.checkNotNullParameter(display_error_text, "display_error_text");
        Intrinsics.checkNotNullParameter(display_error_title, "display_error_title");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(display_error_button_title, "display_error_button_title");
        Intrinsics.checkNotNullParameter(primary_action, "primary_action");
        this.display_error_text = display_error_text;
        this.display_error_title = display_error_title;
        this.error_message = error_message;
        this.display_error_button_title = display_error_button_title;
        this.primary_action = primary_action;
        this.secondary_cta = str;
        this.secondary_action = tellerErrorAction;
    }

    public final String getDisplay_error_text() {
        return this.display_error_text;
    }

    public final String getDisplay_error_title() {
        return this.display_error_title;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final String getDisplay_error_button_title() {
        return this.display_error_button_title;
    }

    public final TellerErrorAction getPrimary_action() {
        return this.primary_action;
    }

    public final String getSecondary_cta() {
        return this.secondary_cta;
    }

    public final TellerErrorAction getSecondary_action() {
        return this.secondary_action;
    }
}
