package com.robinhood.android.creditcard.p091ui.creditapplication.terms;

import com.robinhood.android.models.creditcard.api.graphql.CreateCreditApplicationResponse2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TermsDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsViewState;", "", "isLoading", "", "fullPageLoad", "error", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationError;", "<init>", "(ZZLcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationError;)V", "()Z", "getFullPageLoad", "getError", "()Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationError;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TermsViewState {
    public static final int $stable = 0;
    private final CreateCreditApplicationResponse2 error;
    private final boolean fullPageLoad;
    private final boolean isLoading;

    public TermsViewState() {
        this(false, false, null, 7, null);
    }

    public static /* synthetic */ TermsViewState copy$default(TermsViewState termsViewState, boolean z, boolean z2, CreateCreditApplicationResponse2 createCreditApplicationResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = termsViewState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = termsViewState.fullPageLoad;
        }
        if ((i & 4) != 0) {
            createCreditApplicationResponse2 = termsViewState.error;
        }
        return termsViewState.copy(z, z2, createCreditApplicationResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFullPageLoad() {
        return this.fullPageLoad;
    }

    /* renamed from: component3, reason: from getter */
    public final CreateCreditApplicationResponse2 getError() {
        return this.error;
    }

    public final TermsViewState copy(boolean isLoading, boolean fullPageLoad, CreateCreditApplicationResponse2 error) {
        return new TermsViewState(isLoading, fullPageLoad, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TermsViewState)) {
            return false;
        }
        TermsViewState termsViewState = (TermsViewState) other;
        return this.isLoading == termsViewState.isLoading && this.fullPageLoad == termsViewState.fullPageLoad && this.error == termsViewState.error;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.fullPageLoad)) * 31;
        CreateCreditApplicationResponse2 createCreditApplicationResponse2 = this.error;
        return iHashCode + (createCreditApplicationResponse2 == null ? 0 : createCreditApplicationResponse2.hashCode());
    }

    public String toString() {
        return "TermsViewState(isLoading=" + this.isLoading + ", fullPageLoad=" + this.fullPageLoad + ", error=" + this.error + ")";
    }

    public TermsViewState(boolean z, boolean z2, CreateCreditApplicationResponse2 createCreditApplicationResponse2) {
        this.isLoading = z;
        this.fullPageLoad = z2;
        this.error = createCreditApplicationResponse2;
    }

    public /* synthetic */ TermsViewState(boolean z, boolean z2, CreateCreditApplicationResponse2 createCreditApplicationResponse2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : createCreditApplicationResponse2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getFullPageLoad() {
        return this.fullPageLoad;
    }

    public final CreateCreditApplicationResponse2 getError() {
        return this.error;
    }
}
