package com.robinhood.android.margin.p174ui.instant;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantUpgradeRetirementAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState;", "", "<init>", "()V", "Loading", "ShowInstantAgreement", "Error", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState$Error;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState$Loading;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState$ShowInstantAgreement;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class InstantUpgradeRetirementAgreementDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ InstantUpgradeRetirementAgreementDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: InstantUpgradeRetirementAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState$Loading;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementState$Loading */
    public static final class Loading extends InstantUpgradeRetirementAgreementDuxo2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private InstantUpgradeRetirementAgreementDuxo2() {
    }

    /* compiled from: InstantUpgradeRetirementAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState$ShowInstantAgreement;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState;", "viewModel", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementAgreementViewModel;", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementAgreementViewModel;)V", "getViewModel", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementAgreementViewModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementState$ShowInstantAgreement, reason: from toString */
    public static final /* data */ class ShowInstantAgreement extends InstantUpgradeRetirementAgreementDuxo2 {
        public static final int $stable = 8;
        private final ApiRetirementSignUpFlow.RetirementAgreementViewModel viewModel;

        public static /* synthetic */ ShowInstantAgreement copy$default(ShowInstantAgreement showInstantAgreement, ApiRetirementSignUpFlow.RetirementAgreementViewModel retirementAgreementViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                retirementAgreementViewModel = showInstantAgreement.viewModel;
            }
            return showInstantAgreement.copy(retirementAgreementViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementSignUpFlow.RetirementAgreementViewModel getViewModel() {
            return this.viewModel;
        }

        public final ShowInstantAgreement copy(ApiRetirementSignUpFlow.RetirementAgreementViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            return new ShowInstantAgreement(viewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowInstantAgreement) && Intrinsics.areEqual(this.viewModel, ((ShowInstantAgreement) other).viewModel);
        }

        public int hashCode() {
            return this.viewModel.hashCode();
        }

        public String toString() {
            return "ShowInstantAgreement(viewModel=" + this.viewModel + ")";
        }

        public final ApiRetirementSignUpFlow.RetirementAgreementViewModel getViewModel() {
            return this.viewModel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowInstantAgreement(ApiRetirementSignUpFlow.RetirementAgreementViewModel viewModel) {
            super(null);
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            this.viewModel = viewModel;
        }
    }

    /* compiled from: InstantUpgradeRetirementAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState$Error;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementState$Error, reason: from toString */
    public static final /* data */ class Error extends InstantUpgradeRetirementAgreementDuxo2 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }
}
