package com.robinhood.android.questionnaire.api;

import com.robinhood.android.questionnaire.p220ui.UiGraphRedirect;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGraphRedirect.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "", "redirect", "", "redirect_required", "", "<init>", "(Ljava/lang/String;Z)V", "getRedirect", "()Ljava/lang/String;", "getRedirect_required", "()Z", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ApiGraphRedirect {
    private final String redirect;
    private final boolean redirect_required;

    public ApiGraphRedirect(String redirect, boolean z) {
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        this.redirect = redirect;
        this.redirect_required = z;
    }

    public final String getRedirect() {
        return this.redirect;
    }

    public final boolean getRedirect_required() {
        return this.redirect_required;
    }

    public final UiGraphRedirect toUiModel() {
        return new UiGraphRedirect(this.redirect, this.redirect_required);
    }
}
