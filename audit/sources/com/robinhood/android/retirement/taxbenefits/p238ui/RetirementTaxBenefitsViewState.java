package com.robinhood.android.retirement.taxbenefits.p238ui;

import com.robinhood.android.models.retirement.api.taxbenefits.ApiRetirementTaxBenefitsViewModel;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithIcon;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RetirementTaxBenefitsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00052\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState;", "", "Loading", "Loaded", "Error", "Companion", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState$Error;", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState$Loaded;", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState$Loading;", "feature-retirement-tax-benefits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementTaxBenefitsViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: RetirementTaxBenefitsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState$Loading;", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tax-benefits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements RetirementTaxBenefitsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -2054226690;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: RetirementTaxBenefitsViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState$Loaded;", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState;", "taxBenefitsViewModel", "Lcom/robinhood/android/models/retirement/api/taxbenefits/ApiRetirementTaxBenefitsViewModel;", "<init>", "(Lcom/robinhood/android/models/retirement/api/taxbenefits/ApiRetirementTaxBenefitsViewModel;)V", "getTaxBenefitsViewModel", "()Lcom/robinhood/android/models/retirement/api/taxbenefits/ApiRetirementTaxBenefitsViewModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tax-benefits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RetirementTaxBenefitsViewState {
        public static final int $stable = 8;
        private final ApiRetirementTaxBenefitsViewModel taxBenefitsViewModel;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiRetirementTaxBenefitsViewModel apiRetirementTaxBenefitsViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                apiRetirementTaxBenefitsViewModel = loaded.taxBenefitsViewModel;
            }
            return loaded.copy(apiRetirementTaxBenefitsViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementTaxBenefitsViewModel getTaxBenefitsViewModel() {
            return this.taxBenefitsViewModel;
        }

        public final Loaded copy(ApiRetirementTaxBenefitsViewModel taxBenefitsViewModel) {
            Intrinsics.checkNotNullParameter(taxBenefitsViewModel, "taxBenefitsViewModel");
            return new Loaded(taxBenefitsViewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.taxBenefitsViewModel, ((Loaded) other).taxBenefitsViewModel);
        }

        public int hashCode() {
            return this.taxBenefitsViewModel.hashCode();
        }

        public String toString() {
            return "Loaded(taxBenefitsViewModel=" + this.taxBenefitsViewModel + ")";
        }

        public Loaded(ApiRetirementTaxBenefitsViewModel taxBenefitsViewModel) {
            Intrinsics.checkNotNullParameter(taxBenefitsViewModel, "taxBenefitsViewModel");
            this.taxBenefitsViewModel = taxBenefitsViewModel;
        }

        public final ApiRetirementTaxBenefitsViewModel getTaxBenefitsViewModel() {
            return this.taxBenefitsViewModel;
        }
    }

    /* compiled from: RetirementTaxBenefitsViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState$Error;", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState;", "errorEvent", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "", "<init>", "(Lcom/robinhood/compose/duxo/ComposeUiEvent;)V", "getErrorEvent", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tax-benefits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements RetirementTaxBenefitsViewState {
        public static final int $stable = ComposeUiEvent.$stable;
        private final ComposeUiEvent<Throwable> errorEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, ComposeUiEvent composeUiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                composeUiEvent = error.errorEvent;
            }
            return error.copy(composeUiEvent);
        }

        public final ComposeUiEvent<Throwable> component1() {
            return this.errorEvent;
        }

        public final Error copy(ComposeUiEvent<Throwable> errorEvent) {
            Intrinsics.checkNotNullParameter(errorEvent, "errorEvent");
            return new Error(errorEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.errorEvent, ((Error) other).errorEvent);
        }

        public int hashCode() {
            return this.errorEvent.hashCode();
        }

        public String toString() {
            return "Error(errorEvent=" + this.errorEvent + ")";
        }

        public Error(ComposeUiEvent<Throwable> errorEvent) {
            Intrinsics.checkNotNullParameter(errorEvent, "errorEvent");
            this.errorEvent = errorEvent;
        }

        public final ComposeUiEvent<Throwable> getErrorEvent() {
            return this.errorEvent;
        }
    }

    /* compiled from: RetirementTaxBenefitsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState$Loaded;", "getLoadingMock", "()Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState$Loaded;", "feature-retirement-tax-benefits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Loaded loadingMock;

        private Companion() {
        }

        public final Loaded getLoadingMock() {
            return loadingMock;
        }

        static {
            String strRepeat = StringsKt.repeat("^^^^^ ", 10);
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(new ValuePropWithIcon(Icon.RETIREMENT_16, "-------- -- - ---- ---", StringsKt.repeat("^^^^^^ ", 10), null, null, null, null, null, null, 504, null));
            }
            loadingMock = new Loaded(new ApiRetirementTaxBenefitsViewModel("", "--- -------- -- -- ---", strRepeat, arrayList, "---- ----------- -- --- --- -- ---------- -------", new Button("------- --------- ---", null, new GenericAction.Deeplink(new DeeplinkAction("")), false, null, null, null, null, null, null, 1018, null)));
        }
    }
}
