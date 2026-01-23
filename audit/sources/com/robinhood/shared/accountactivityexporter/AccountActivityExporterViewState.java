package com.robinhood.shared.accountactivityexporter;

import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountActivityExporterViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterViewState;", "", "response", "Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporter;", "shouldShowLongTermSurvey", "", "<init>", "(Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporter;Z)V", "getResponse", "()Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporter;", "getShouldShowLongTermSurvey", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AccountActivityExporterViewState {
    public static final int $stable = 8;
    private final ApiAccountActivityExporter response;
    private final boolean shouldShowLongTermSurvey;

    public static /* synthetic */ AccountActivityExporterViewState copy$default(AccountActivityExporterViewState accountActivityExporterViewState, ApiAccountActivityExporter apiAccountActivityExporter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAccountActivityExporter = accountActivityExporterViewState.response;
        }
        if ((i & 2) != 0) {
            z = accountActivityExporterViewState.shouldShowLongTermSurvey;
        }
        return accountActivityExporterViewState.copy(apiAccountActivityExporter, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAccountActivityExporter getResponse() {
        return this.response;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowLongTermSurvey() {
        return this.shouldShowLongTermSurvey;
    }

    public final AccountActivityExporterViewState copy(ApiAccountActivityExporter response, boolean shouldShowLongTermSurvey) {
        return new AccountActivityExporterViewState(response, shouldShowLongTermSurvey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountActivityExporterViewState)) {
            return false;
        }
        AccountActivityExporterViewState accountActivityExporterViewState = (AccountActivityExporterViewState) other;
        return Intrinsics.areEqual(this.response, accountActivityExporterViewState.response) && this.shouldShowLongTermSurvey == accountActivityExporterViewState.shouldShowLongTermSurvey;
    }

    public int hashCode() {
        ApiAccountActivityExporter apiAccountActivityExporter = this.response;
        return ((apiAccountActivityExporter == null ? 0 : apiAccountActivityExporter.hashCode()) * 31) + Boolean.hashCode(this.shouldShowLongTermSurvey);
    }

    public String toString() {
        return "AccountActivityExporterViewState(response=" + this.response + ", shouldShowLongTermSurvey=" + this.shouldShowLongTermSurvey + ")";
    }

    public AccountActivityExporterViewState(ApiAccountActivityExporter apiAccountActivityExporter, boolean z) {
        this.response = apiAccountActivityExporter;
        this.shouldShowLongTermSurvey = z;
    }

    public final ApiAccountActivityExporter getResponse() {
        return this.response;
    }

    public final boolean getShouldShowLongTermSurvey() {
        return this.shouldShowLongTermSurvey;
    }
}
