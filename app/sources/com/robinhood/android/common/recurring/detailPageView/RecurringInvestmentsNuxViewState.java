package com.robinhood.android.common.recurring.detailPageView;

import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringInvestmentsNuxViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxViewState;", "", "launchRecurringButtonText", "Lcom/robinhood/utils/resource/StringResource;", "descriptionText", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "refId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/rosetta/eventlogging/Screen$Name;Ljava/util/UUID;)V", "getLaunchRecurringButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "getDescriptionText", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getRefId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringInvestmentsNuxViewState {
    public static final int $stable = 8;
    private final StringResource descriptionText;
    private final StringResource launchRecurringButtonText;
    private final UUID refId;
    private final Screen.Name screenName;

    public static /* synthetic */ RecurringInvestmentsNuxViewState copy$default(RecurringInvestmentsNuxViewState recurringInvestmentsNuxViewState, StringResource stringResource, StringResource stringResource2, Screen.Name name, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = recurringInvestmentsNuxViewState.launchRecurringButtonText;
        }
        if ((i & 2) != 0) {
            stringResource2 = recurringInvestmentsNuxViewState.descriptionText;
        }
        if ((i & 4) != 0) {
            name = recurringInvestmentsNuxViewState.screenName;
        }
        if ((i & 8) != 0) {
            uuid = recurringInvestmentsNuxViewState.refId;
        }
        return recurringInvestmentsNuxViewState.copy(stringResource, stringResource2, name, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getLaunchRecurringButtonText() {
        return this.launchRecurringButtonText;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getDescriptionText() {
        return this.descriptionText;
    }

    /* renamed from: component3, reason: from getter */
    public final Screen.Name getScreenName() {
        return this.screenName;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    public final RecurringInvestmentsNuxViewState copy(StringResource launchRecurringButtonText, StringResource descriptionText, Screen.Name screenName, UUID refId) {
        Intrinsics.checkNotNullParameter(launchRecurringButtonText, "launchRecurringButtonText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(refId, "refId");
        return new RecurringInvestmentsNuxViewState(launchRecurringButtonText, descriptionText, screenName, refId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringInvestmentsNuxViewState)) {
            return false;
        }
        RecurringInvestmentsNuxViewState recurringInvestmentsNuxViewState = (RecurringInvestmentsNuxViewState) other;
        return Intrinsics.areEqual(this.launchRecurringButtonText, recurringInvestmentsNuxViewState.launchRecurringButtonText) && Intrinsics.areEqual(this.descriptionText, recurringInvestmentsNuxViewState.descriptionText) && this.screenName == recurringInvestmentsNuxViewState.screenName && Intrinsics.areEqual(this.refId, recurringInvestmentsNuxViewState.refId);
    }

    public int hashCode() {
        return (((((this.launchRecurringButtonText.hashCode() * 31) + this.descriptionText.hashCode()) * 31) + this.screenName.hashCode()) * 31) + this.refId.hashCode();
    }

    public String toString() {
        return "RecurringInvestmentsNuxViewState(launchRecurringButtonText=" + this.launchRecurringButtonText + ", descriptionText=" + this.descriptionText + ", screenName=" + this.screenName + ", refId=" + this.refId + ")";
    }

    public RecurringInvestmentsNuxViewState(StringResource launchRecurringButtonText, StringResource descriptionText, Screen.Name screenName, UUID refId) {
        Intrinsics.checkNotNullParameter(launchRecurringButtonText, "launchRecurringButtonText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(refId, "refId");
        this.launchRecurringButtonText = launchRecurringButtonText;
        this.descriptionText = descriptionText;
        this.screenName = screenName;
        this.refId = refId;
    }

    public final StringResource getLaunchRecurringButtonText() {
        return this.launchRecurringButtonText;
    }

    public final StringResource getDescriptionText() {
        return this.descriptionText;
    }

    public final Screen.Name getScreenName() {
        return this.screenName;
    }

    public /* synthetic */ RecurringInvestmentsNuxViewState(StringResource stringResource, StringResource stringResource2, Screen.Name name, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, stringResource2, name, (i & 8) != 0 ? UUID.randomUUID() : uuid);
    }

    public final UUID getRefId() {
        return this.refId;
    }
}
