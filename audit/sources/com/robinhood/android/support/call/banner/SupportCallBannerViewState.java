package com.robinhood.android.support.call.banner;

import com.robinhood.models.api.PhoneChannelStatus;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportCallBannerViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/support/call/banner/SupportCallBannerViewState;", "", "cancelFailedEvent", "Lcom/robinhood/udf/UiEvent;", "", "isCanceling", "", "issue", "Lcom/robinhood/models/ui/Issue$Phone;", "isLoggedIn", "<init>", "(Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/models/ui/Issue$Phone;Z)V", "getCancelFailedEvent", "()Lcom/robinhood/udf/UiEvent;", "()Z", "getIssue", "()Lcom/robinhood/models/ui/Issue$Phone;", "showCancel", "getShowCancel", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SupportCallBannerViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> cancelFailedEvent;
    private final boolean isCanceling;
    private final boolean isLoggedIn;
    private final Issue.Phone issue;
    private final boolean showCancel;

    public SupportCallBannerViewState() {
        this(null, false, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportCallBannerViewState copy$default(SupportCallBannerViewState supportCallBannerViewState, UiEvent uiEvent, boolean z, Issue.Phone phone, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = supportCallBannerViewState.cancelFailedEvent;
        }
        if ((i & 2) != 0) {
            z = supportCallBannerViewState.isCanceling;
        }
        if ((i & 4) != 0) {
            phone = supportCallBannerViewState.issue;
        }
        if ((i & 8) != 0) {
            z2 = supportCallBannerViewState.isLoggedIn;
        }
        return supportCallBannerViewState.copy(uiEvent, z, phone, z2);
    }

    public final UiEvent<Throwable> component1() {
        return this.cancelFailedEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCanceling() {
        return this.isCanceling;
    }

    /* renamed from: component3, reason: from getter */
    public final Issue.Phone getIssue() {
        return this.issue;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    public final SupportCallBannerViewState copy(UiEvent<Throwable> cancelFailedEvent, boolean isCanceling, Issue.Phone issue, boolean isLoggedIn) {
        return new SupportCallBannerViewState(cancelFailedEvent, isCanceling, issue, isLoggedIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportCallBannerViewState)) {
            return false;
        }
        SupportCallBannerViewState supportCallBannerViewState = (SupportCallBannerViewState) other;
        return Intrinsics.areEqual(this.cancelFailedEvent, supportCallBannerViewState.cancelFailedEvent) && this.isCanceling == supportCallBannerViewState.isCanceling && Intrinsics.areEqual(this.issue, supportCallBannerViewState.issue) && this.isLoggedIn == supportCallBannerViewState.isLoggedIn;
    }

    public int hashCode() {
        UiEvent<Throwable> uiEvent = this.cancelFailedEvent;
        int iHashCode = (((uiEvent == null ? 0 : uiEvent.hashCode()) * 31) + Boolean.hashCode(this.isCanceling)) * 31;
        Issue.Phone phone = this.issue;
        return ((iHashCode + (phone != null ? phone.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoggedIn);
    }

    public String toString() {
        return "SupportCallBannerViewState(cancelFailedEvent=" + this.cancelFailedEvent + ", isCanceling=" + this.isCanceling + ", issue=" + this.issue + ", isLoggedIn=" + this.isLoggedIn + ")";
    }

    public SupportCallBannerViewState(UiEvent<Throwable> uiEvent, boolean z, Issue.Phone phone, boolean z2) {
        this.cancelFailedEvent = uiEvent;
        this.isCanceling = z;
        this.issue = phone;
        this.isLoggedIn = z2;
        this.showCancel = phone != null && phone.getChannelStatus() == PhoneChannelStatus.MISSED && phone.isCancellable() && !z;
    }

    public /* synthetic */ SupportCallBannerViewState(UiEvent uiEvent, boolean z, Issue.Phone phone, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : phone, (i & 8) != 0 ? false : z2);
    }

    public final UiEvent<Throwable> getCancelFailedEvent() {
        return this.cancelFailedEvent;
    }

    public final boolean isCanceling() {
        return this.isCanceling;
    }

    public final Issue.Phone getIssue() {
        return this.issue;
    }

    public final boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public final boolean getShowCancel() {
        return this.showCancel;
    }
}
