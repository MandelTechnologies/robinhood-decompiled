package com.withpersona.sdk2.inquiry.inline_inquiry;

import com.withpersona.sdk2.inquiry.ExperimentalInlineApi;
import kotlin.Metadata;

/* compiled from: InlineInquiryScreen.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/inline_inquiry/ScreenState;", "", "", "shouldShowBackButton", "shouldShowCancelButton", "isNavigationEnabled", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldShowBackButton", "()Z", "getShouldShowCancelButton", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@ExperimentalInlineApi
/* loaded from: classes18.dex */
public final /* data */ class ScreenState {
    private final boolean isNavigationEnabled;
    private final boolean shouldShowBackButton;
    private final boolean shouldShowCancelButton;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenState)) {
            return false;
        }
        ScreenState screenState = (ScreenState) other;
        return this.shouldShowBackButton == screenState.shouldShowBackButton && this.shouldShowCancelButton == screenState.shouldShowCancelButton && this.isNavigationEnabled == screenState.isNavigationEnabled;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.shouldShowBackButton) * 31) + Boolean.hashCode(this.shouldShowCancelButton)) * 31) + Boolean.hashCode(this.isNavigationEnabled);
    }

    public String toString() {
        return "ScreenState(shouldShowBackButton=" + this.shouldShowBackButton + ", shouldShowCancelButton=" + this.shouldShowCancelButton + ", isNavigationEnabled=" + this.isNavigationEnabled + ")";
    }

    public ScreenState(boolean z, boolean z2, boolean z3) {
        this.shouldShowBackButton = z;
        this.shouldShowCancelButton = z2;
        this.isNavigationEnabled = z3;
    }
}
