package com.robinhood.android.acatsin.availabledestinations;

import com.robinhood.android.options.comboorders.detail.TestTags;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.api.bonfire.ApiAvailableAccountOther;
import com.robinhood.models.api.bonfire.ApiAvailableAccountSignup;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAvailableDestinationsDataState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0005\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0015\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0005HÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0087\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00052\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\u0015¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDataState;", "", "isAcatsRetry", "", "accountSelections", "", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "signupSelections", "Lcom/robinhood/models/api/bonfire/ApiAvailableAccountSignup;", "otherSelections", "Lcom/robinhood/models/api/bonfire/ApiAvailableAccountOther;", "selectedOption", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "headerContents", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "stickyFooterContents", "error", "", "<init>", "(ZLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;Ljava/util/List;Ljava/util/List;Ljava/lang/Throwable;)V", "()Z", "getAccountSelections", "()Ljava/util/List;", "getSignupSelections", "getOtherSelections", "getSelectedOption", "()Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "getHeaderContents", "getStickyFooterContents", "getError", "()Ljava/lang/Throwable;", TestTags.LOADED, "getLoaded", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInAvailableDestinationsDataState {
    public static final int $stable = 8;
    private final List<AvailableAccount> accountSelections;
    private final Throwable error;
    private final List<UIComponent<GenericAction>> headerContents;
    private final boolean isAcatsRetry;
    private final List<ApiAvailableAccountOther> otherSelections;
    private final AcatsDestination selectedOption;
    private final List<ApiAvailableAccountSignup> signupSelections;
    private final List<UIComponent<GenericAction>> stickyFooterContents;

    public static /* synthetic */ AcatsInAvailableDestinationsDataState copy$default(AcatsInAvailableDestinationsDataState acatsInAvailableDestinationsDataState, boolean z, List list, List list2, List list3, AcatsDestination acatsDestination, List list4, List list5, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            z = acatsInAvailableDestinationsDataState.isAcatsRetry;
        }
        if ((i & 2) != 0) {
            list = acatsInAvailableDestinationsDataState.accountSelections;
        }
        if ((i & 4) != 0) {
            list2 = acatsInAvailableDestinationsDataState.signupSelections;
        }
        if ((i & 8) != 0) {
            list3 = acatsInAvailableDestinationsDataState.otherSelections;
        }
        if ((i & 16) != 0) {
            acatsDestination = acatsInAvailableDestinationsDataState.selectedOption;
        }
        if ((i & 32) != 0) {
            list4 = acatsInAvailableDestinationsDataState.headerContents;
        }
        if ((i & 64) != 0) {
            list5 = acatsInAvailableDestinationsDataState.stickyFooterContents;
        }
        if ((i & 128) != 0) {
            th = acatsInAvailableDestinationsDataState.error;
        }
        List list6 = list5;
        Throwable th2 = th;
        AcatsDestination acatsDestination2 = acatsDestination;
        List list7 = list4;
        return acatsInAvailableDestinationsDataState.copy(z, list, list2, list3, acatsDestination2, list7, list6, th2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAcatsRetry() {
        return this.isAcatsRetry;
    }

    public final List<AvailableAccount> component2() {
        return this.accountSelections;
    }

    public final List<ApiAvailableAccountSignup> component3() {
        return this.signupSelections;
    }

    public final List<ApiAvailableAccountOther> component4() {
        return this.otherSelections;
    }

    /* renamed from: component5, reason: from getter */
    public final AcatsDestination getSelectedOption() {
        return this.selectedOption;
    }

    public final List<UIComponent<GenericAction>> component6() {
        return this.headerContents;
    }

    public final List<UIComponent<GenericAction>> component7() {
        return this.stickyFooterContents;
    }

    /* renamed from: component8, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final AcatsInAvailableDestinationsDataState copy(boolean isAcatsRetry, List<AvailableAccount> accountSelections, List<ApiAvailableAccountSignup> signupSelections, List<ApiAvailableAccountOther> otherSelections, AcatsDestination selectedOption, List<? extends UIComponent<? extends GenericAction>> headerContents, List<? extends UIComponent<? extends GenericAction>> stickyFooterContents, Throwable error) {
        Intrinsics.checkNotNullParameter(accountSelections, "accountSelections");
        Intrinsics.checkNotNullParameter(signupSelections, "signupSelections");
        Intrinsics.checkNotNullParameter(otherSelections, "otherSelections");
        Intrinsics.checkNotNullParameter(headerContents, "headerContents");
        Intrinsics.checkNotNullParameter(stickyFooterContents, "stickyFooterContents");
        return new AcatsInAvailableDestinationsDataState(isAcatsRetry, accountSelections, signupSelections, otherSelections, selectedOption, headerContents, stickyFooterContents, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInAvailableDestinationsDataState)) {
            return false;
        }
        AcatsInAvailableDestinationsDataState acatsInAvailableDestinationsDataState = (AcatsInAvailableDestinationsDataState) other;
        return this.isAcatsRetry == acatsInAvailableDestinationsDataState.isAcatsRetry && Intrinsics.areEqual(this.accountSelections, acatsInAvailableDestinationsDataState.accountSelections) && Intrinsics.areEqual(this.signupSelections, acatsInAvailableDestinationsDataState.signupSelections) && Intrinsics.areEqual(this.otherSelections, acatsInAvailableDestinationsDataState.otherSelections) && Intrinsics.areEqual(this.selectedOption, acatsInAvailableDestinationsDataState.selectedOption) && Intrinsics.areEqual(this.headerContents, acatsInAvailableDestinationsDataState.headerContents) && Intrinsics.areEqual(this.stickyFooterContents, acatsInAvailableDestinationsDataState.stickyFooterContents) && Intrinsics.areEqual(this.error, acatsInAvailableDestinationsDataState.error);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isAcatsRetry) * 31) + this.accountSelections.hashCode()) * 31) + this.signupSelections.hashCode()) * 31) + this.otherSelections.hashCode()) * 31;
        AcatsDestination acatsDestination = this.selectedOption;
        int iHashCode2 = (((((iHashCode + (acatsDestination == null ? 0 : acatsDestination.hashCode())) * 31) + this.headerContents.hashCode()) * 31) + this.stickyFooterContents.hashCode()) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "AcatsInAvailableDestinationsDataState(isAcatsRetry=" + this.isAcatsRetry + ", accountSelections=" + this.accountSelections + ", signupSelections=" + this.signupSelections + ", otherSelections=" + this.otherSelections + ", selectedOption=" + this.selectedOption + ", headerContents=" + this.headerContents + ", stickyFooterContents=" + this.stickyFooterContents + ", error=" + this.error + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInAvailableDestinationsDataState(boolean z, List<AvailableAccount> accountSelections, List<ApiAvailableAccountSignup> signupSelections, List<ApiAvailableAccountOther> otherSelections, AcatsDestination acatsDestination, List<? extends UIComponent<? extends GenericAction>> headerContents, List<? extends UIComponent<? extends GenericAction>> stickyFooterContents, Throwable th) {
        Intrinsics.checkNotNullParameter(accountSelections, "accountSelections");
        Intrinsics.checkNotNullParameter(signupSelections, "signupSelections");
        Intrinsics.checkNotNullParameter(otherSelections, "otherSelections");
        Intrinsics.checkNotNullParameter(headerContents, "headerContents");
        Intrinsics.checkNotNullParameter(stickyFooterContents, "stickyFooterContents");
        this.isAcatsRetry = z;
        this.accountSelections = accountSelections;
        this.signupSelections = signupSelections;
        this.otherSelections = otherSelections;
        this.selectedOption = acatsDestination;
        this.headerContents = headerContents;
        this.stickyFooterContents = stickyFooterContents;
        this.error = th;
    }

    public final boolean isAcatsRetry() {
        return this.isAcatsRetry;
    }

    public /* synthetic */ AcatsInAvailableDestinationsDataState(boolean z, List list, List list2, List list3, AcatsDestination acatsDestination, List list4, List list5, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? null : acatsDestination, (i & 32) != 0 ? CollectionsKt.emptyList() : list4, (i & 64) != 0 ? CollectionsKt.emptyList() : list5, (i & 128) != 0 ? null : th);
    }

    public final List<AvailableAccount> getAccountSelections() {
        return this.accountSelections;
    }

    public final List<ApiAvailableAccountSignup> getSignupSelections() {
        return this.signupSelections;
    }

    public final List<ApiAvailableAccountOther> getOtherSelections() {
        return this.otherSelections;
    }

    public final AcatsDestination getSelectedOption() {
        return this.selectedOption;
    }

    public final List<UIComponent<GenericAction>> getHeaderContents() {
        return this.headerContents;
    }

    public final List<UIComponent<GenericAction>> getStickyFooterContents() {
        return this.stickyFooterContents;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final boolean getLoaded() {
        return (this.accountSelections.isEmpty() && this.headerContents.isEmpty() && this.stickyFooterContents.isEmpty()) ? false : true;
    }
}
