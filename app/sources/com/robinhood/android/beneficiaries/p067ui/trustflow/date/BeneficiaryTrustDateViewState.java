package com.robinhood.android.beneficiaries.p067ui.trustflow.date;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustDateViewModel;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.LocalDate;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: BeneficiaryTrustDateViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0016R\u0011\u0010*\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010-\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/date/BeneficiaryTrustDateViewState;", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "trustDateViewModel", "", "trustDateInputString", "Lcom/robinhood/utils/resource/StringResource;", "bottomButtonText", "j$/time/LocalDate", "currentDate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lj$/time/LocalDate;)V", "j$/time/Clock", Card.Icon.CLOCK, "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lj$/time/Clock;)V", "component1", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/robinhood/utils/resource/StringResource;", "component4", "()Lj$/time/LocalDate;", "copy", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lj$/time/LocalDate;)Lcom/robinhood/android/beneficiaries/ui/trustflow/date/BeneficiaryTrustDateViewState;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "getTrustDateViewModel", "Ljava/lang/String;", "getTrustDateInputString", "Lcom/robinhood/utils/resource/StringResource;", "getBottomButtonText", "Lj$/time/LocalDate;", "getCurrentDate", "getTrustDateInputLocalDate", "trustDateInputLocalDate", "getBottomButtonEnabled", "()Z", "bottomButtonEnabled", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryTrustDateViewState {
    public static final int $stable = 8;
    private final StringResource bottomButtonText;
    private final LocalDate currentDate;
    private final String trustDateInputString;
    private final BeneficiaryFlowTrustDateViewModel trustDateViewModel;

    public static /* synthetic */ BeneficiaryTrustDateViewState copy$default(BeneficiaryTrustDateViewState beneficiaryTrustDateViewState, BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel, String str, StringResource stringResource, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0) {
            beneficiaryFlowTrustDateViewModel = beneficiaryTrustDateViewState.trustDateViewModel;
        }
        if ((i & 2) != 0) {
            str = beneficiaryTrustDateViewState.trustDateInputString;
        }
        if ((i & 4) != 0) {
            stringResource = beneficiaryTrustDateViewState.bottomButtonText;
        }
        if ((i & 8) != 0) {
            localDate = beneficiaryTrustDateViewState.currentDate;
        }
        return beneficiaryTrustDateViewState.copy(beneficiaryFlowTrustDateViewModel, str, stringResource, localDate);
    }

    /* renamed from: component1, reason: from getter */
    public final BeneficiaryFlowTrustDateViewModel getTrustDateViewModel() {
        return this.trustDateViewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTrustDateInputString() {
        return this.trustDateInputString;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getBottomButtonText() {
        return this.bottomButtonText;
    }

    /* renamed from: component4, reason: from getter */
    public final LocalDate getCurrentDate() {
        return this.currentDate;
    }

    public final BeneficiaryTrustDateViewState copy(BeneficiaryFlowTrustDateViewModel trustDateViewModel, String trustDateInputString, StringResource bottomButtonText, LocalDate currentDate) {
        Intrinsics.checkNotNullParameter(trustDateViewModel, "trustDateViewModel");
        Intrinsics.checkNotNullParameter(trustDateInputString, "trustDateInputString");
        Intrinsics.checkNotNullParameter(bottomButtonText, "bottomButtonText");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        return new BeneficiaryTrustDateViewState(trustDateViewModel, trustDateInputString, bottomButtonText, currentDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryTrustDateViewState)) {
            return false;
        }
        BeneficiaryTrustDateViewState beneficiaryTrustDateViewState = (BeneficiaryTrustDateViewState) other;
        return Intrinsics.areEqual(this.trustDateViewModel, beneficiaryTrustDateViewState.trustDateViewModel) && Intrinsics.areEqual(this.trustDateInputString, beneficiaryTrustDateViewState.trustDateInputString) && Intrinsics.areEqual(this.bottomButtonText, beneficiaryTrustDateViewState.bottomButtonText) && Intrinsics.areEqual(this.currentDate, beneficiaryTrustDateViewState.currentDate);
    }

    public int hashCode() {
        return (((((this.trustDateViewModel.hashCode() * 31) + this.trustDateInputString.hashCode()) * 31) + this.bottomButtonText.hashCode()) * 31) + this.currentDate.hashCode();
    }

    public String toString() {
        return "BeneficiaryTrustDateViewState(trustDateViewModel=" + this.trustDateViewModel + ", trustDateInputString=" + this.trustDateInputString + ", bottomButtonText=" + this.bottomButtonText + ", currentDate=" + this.currentDate + ")";
    }

    public BeneficiaryTrustDateViewState(BeneficiaryFlowTrustDateViewModel trustDateViewModel, String trustDateInputString, StringResource bottomButtonText, LocalDate currentDate) {
        Intrinsics.checkNotNullParameter(trustDateViewModel, "trustDateViewModel");
        Intrinsics.checkNotNullParameter(trustDateInputString, "trustDateInputString");
        Intrinsics.checkNotNullParameter(bottomButtonText, "bottomButtonText");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.trustDateViewModel = trustDateViewModel;
        this.trustDateInputString = trustDateInputString;
        this.bottomButtonText = bottomButtonText;
        this.currentDate = currentDate;
    }

    public final BeneficiaryFlowTrustDateViewModel getTrustDateViewModel() {
        return this.trustDateViewModel;
    }

    public final String getTrustDateInputString() {
        return this.trustDateInputString;
    }

    public final StringResource getBottomButtonText() {
        return this.bottomButtonText;
    }

    public final LocalDate getCurrentDate() {
        return this.currentDate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeneficiaryTrustDateViewState(BeneficiaryFlowTrustDateViewModel trustDateViewModel, String trustDateInputString, StringResource bottomButtonText, Clock clock) {
        Intrinsics.checkNotNullParameter(trustDateViewModel, "trustDateViewModel");
        Intrinsics.checkNotNullParameter(trustDateInputString, "trustDateInputString");
        Intrinsics.checkNotNullParameter(bottomButtonText, "bottomButtonText");
        Intrinsics.checkNotNullParameter(clock, "clock");
        LocalDate localDateNow = LocalDate.now(clock);
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        this(trustDateViewModel, trustDateInputString, bottomButtonText, localDateNow);
    }

    public final LocalDate getTrustDateInputLocalDate() {
        LocalDate localDate = LocalDate.parse(this.trustDateInputString, DateTimeFormatter.ofPattern(this.trustDateViewModel.getAndroid_format_template()));
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return localDate;
    }

    public final boolean getBottomButtonEnabled() {
        try {
            if (this.trustDateInputString.length() != this.trustDateViewModel.getAndroid_format_template().length()) {
                return false;
            }
            return !getTrustDateInputLocalDate().isAfter(this.currentDate);
        } catch (Exception unused) {
            return false;
        }
    }
}
