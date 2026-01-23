package com.robinhood.android.settings.p254ui.recurring.detail;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: InvestmentScheduleSettingsRows.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b\n\u0010\u0015¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/SypHeaderState;", "", "", "totalInvestedText", "priceChangeText", "j$/time/LocalDate", "firstInvestmentDate", "Lcom/robinhood/utils/resource/StringResource;", "dialogDescription", "", "isActive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Lcom/robinhood/utils/resource/StringResource;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lj$/time/LocalDate;", "component4", "()Lcom/robinhood/utils/resource/StringResource;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Lcom/robinhood/utils/resource/StringResource;Z)Lcom/robinhood/android/settings/ui/recurring/detail/SypHeaderState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTotalInvestedText", "getPriceChangeText", "Lj$/time/LocalDate;", "getFirstInvestmentDate", "Lcom/robinhood/utils/resource/StringResource;", "getDialogDescription", "Z", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SypHeaderState {
    public static final int $stable = 8;
    private final StringResource dialogDescription;
    private final LocalDate firstInvestmentDate;
    private final boolean isActive;
    private final String priceChangeText;
    private final String totalInvestedText;

    public static /* synthetic */ SypHeaderState copy$default(SypHeaderState sypHeaderState, String str, String str2, LocalDate localDate, StringResource stringResource, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sypHeaderState.totalInvestedText;
        }
        if ((i & 2) != 0) {
            str2 = sypHeaderState.priceChangeText;
        }
        if ((i & 4) != 0) {
            localDate = sypHeaderState.firstInvestmentDate;
        }
        if ((i & 8) != 0) {
            stringResource = sypHeaderState.dialogDescription;
        }
        if ((i & 16) != 0) {
            z = sypHeaderState.isActive;
        }
        boolean z2 = z;
        LocalDate localDate2 = localDate;
        return sypHeaderState.copy(str, str2, localDate2, stringResource, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTotalInvestedText() {
        return this.totalInvestedText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPriceChangeText() {
        return this.priceChangeText;
    }

    /* renamed from: component3, reason: from getter */
    public final LocalDate getFirstInvestmentDate() {
        return this.firstInvestmentDate;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getDialogDescription() {
        return this.dialogDescription;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final SypHeaderState copy(String totalInvestedText, String priceChangeText, LocalDate firstInvestmentDate, StringResource dialogDescription, boolean isActive) {
        Intrinsics.checkNotNullParameter(totalInvestedText, "totalInvestedText");
        Intrinsics.checkNotNullParameter(dialogDescription, "dialogDescription");
        return new SypHeaderState(totalInvestedText, priceChangeText, firstInvestmentDate, dialogDescription, isActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SypHeaderState)) {
            return false;
        }
        SypHeaderState sypHeaderState = (SypHeaderState) other;
        return Intrinsics.areEqual(this.totalInvestedText, sypHeaderState.totalInvestedText) && Intrinsics.areEqual(this.priceChangeText, sypHeaderState.priceChangeText) && Intrinsics.areEqual(this.firstInvestmentDate, sypHeaderState.firstInvestmentDate) && Intrinsics.areEqual(this.dialogDescription, sypHeaderState.dialogDescription) && this.isActive == sypHeaderState.isActive;
    }

    public int hashCode() {
        int iHashCode = this.totalInvestedText.hashCode() * 31;
        String str = this.priceChangeText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.firstInvestmentDate;
        return ((((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31) + this.dialogDescription.hashCode()) * 31) + Boolean.hashCode(this.isActive);
    }

    public String toString() {
        return "SypHeaderState(totalInvestedText=" + this.totalInvestedText + ", priceChangeText=" + this.priceChangeText + ", firstInvestmentDate=" + this.firstInvestmentDate + ", dialogDescription=" + this.dialogDescription + ", isActive=" + this.isActive + ")";
    }

    public SypHeaderState(String totalInvestedText, String str, LocalDate localDate, StringResource dialogDescription, boolean z) {
        Intrinsics.checkNotNullParameter(totalInvestedText, "totalInvestedText");
        Intrinsics.checkNotNullParameter(dialogDescription, "dialogDescription");
        this.totalInvestedText = totalInvestedText;
        this.priceChangeText = str;
        this.firstInvestmentDate = localDate;
        this.dialogDescription = dialogDescription;
        this.isActive = z;
    }

    public final String getTotalInvestedText() {
        return this.totalInvestedText;
    }

    public final String getPriceChangeText() {
        return this.priceChangeText;
    }

    public final LocalDate getFirstInvestmentDate() {
        return this.firstInvestmentDate;
    }

    public final StringResource getDialogDescription() {
        return this.dialogDescription;
    }

    public final boolean isActive() {
        return this.isActive;
    }
}
