package com.robinhood.android.directdeposit.p101ui.prefilled.employer;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.models.api.identi.ApiEmploymentInfo;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PreFilledFormEmployerViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003Js\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u001f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerViewState;", "", "employerInput", "", "userEmployment", "Lcom/robinhood/models/ui/identi/UiEmploymentInfo;", "isLoading", "", "employmentUpdated", "Lcom/robinhood/udf/UiEvent;", "", "employmentUpdateError", "", "employmentConfirmed", "showUpdateDialog", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/identi/UiEmploymentInfo;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getEmployerInput", "()Ljava/lang/String;", "getUserEmployment", "()Lcom/robinhood/models/ui/identi/UiEmploymentInfo;", "()Z", "getEmploymentUpdated", "()Lcom/robinhood/udf/UiEvent;", "getEmploymentUpdateError", "getEmploymentConfirmed", "getShowUpdateDialog", "employerInputHint", "getEmployerInputHint", "employerInputEnabled", "getEmployerInputEnabled", "continueButtonEnabled", "getContinueButtonEnabled", "getUpdateDialogBundle", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerViewState$UpdateDialogContent;", "resources", "Landroid/content/res/Resources;", "handleEmployerInput", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "UpdateDialogContent", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class PreFilledFormEmployerViewState {
    public static final int $stable = 8;
    private final boolean continueButtonEnabled;
    private final String employerInput;
    private final boolean employerInputEnabled;
    private final String employerInputHint;
    private final UiEvent<Unit> employmentConfirmed;
    private final UiEvent<Throwable> employmentUpdateError;
    private final UiEvent<Unit> employmentUpdated;
    private final boolean isLoading;
    private final UiEvent<Unit> showUpdateDialog;
    private final UiEmploymentInfo userEmployment;

    public PreFilledFormEmployerViewState() {
        this(null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ PreFilledFormEmployerViewState copy$default(PreFilledFormEmployerViewState preFilledFormEmployerViewState, String str, UiEmploymentInfo uiEmploymentInfo, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preFilledFormEmployerViewState.employerInput;
        }
        if ((i & 2) != 0) {
            uiEmploymentInfo = preFilledFormEmployerViewState.userEmployment;
        }
        if ((i & 4) != 0) {
            z = preFilledFormEmployerViewState.isLoading;
        }
        if ((i & 8) != 0) {
            uiEvent = preFilledFormEmployerViewState.employmentUpdated;
        }
        if ((i & 16) != 0) {
            uiEvent2 = preFilledFormEmployerViewState.employmentUpdateError;
        }
        if ((i & 32) != 0) {
            uiEvent3 = preFilledFormEmployerViewState.employmentConfirmed;
        }
        if ((i & 64) != 0) {
            uiEvent4 = preFilledFormEmployerViewState.showUpdateDialog;
        }
        UiEvent uiEvent5 = uiEvent3;
        UiEvent uiEvent6 = uiEvent4;
        UiEvent uiEvent7 = uiEvent2;
        boolean z2 = z;
        return preFilledFormEmployerViewState.copy(str, uiEmploymentInfo, z2, uiEvent, uiEvent7, uiEvent5, uiEvent6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmployerInput() {
        return this.employerInput;
    }

    /* renamed from: component2, reason: from getter */
    public final UiEmploymentInfo getUserEmployment() {
        return this.userEmployment;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Unit> component4() {
        return this.employmentUpdated;
    }

    public final UiEvent<Throwable> component5() {
        return this.employmentUpdateError;
    }

    public final UiEvent<Unit> component6() {
        return this.employmentConfirmed;
    }

    public final UiEvent<Unit> component7() {
        return this.showUpdateDialog;
    }

    public final PreFilledFormEmployerViewState copy(String employerInput, UiEmploymentInfo userEmployment, boolean isLoading, UiEvent<Unit> employmentUpdated, UiEvent<Throwable> employmentUpdateError, UiEvent<Unit> employmentConfirmed, UiEvent<Unit> showUpdateDialog) {
        return new PreFilledFormEmployerViewState(employerInput, userEmployment, isLoading, employmentUpdated, employmentUpdateError, employmentConfirmed, showUpdateDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreFilledFormEmployerViewState)) {
            return false;
        }
        PreFilledFormEmployerViewState preFilledFormEmployerViewState = (PreFilledFormEmployerViewState) other;
        return Intrinsics.areEqual(this.employerInput, preFilledFormEmployerViewState.employerInput) && Intrinsics.areEqual(this.userEmployment, preFilledFormEmployerViewState.userEmployment) && this.isLoading == preFilledFormEmployerViewState.isLoading && Intrinsics.areEqual(this.employmentUpdated, preFilledFormEmployerViewState.employmentUpdated) && Intrinsics.areEqual(this.employmentUpdateError, preFilledFormEmployerViewState.employmentUpdateError) && Intrinsics.areEqual(this.employmentConfirmed, preFilledFormEmployerViewState.employmentConfirmed) && Intrinsics.areEqual(this.showUpdateDialog, preFilledFormEmployerViewState.showUpdateDialog);
    }

    public int hashCode() {
        String str = this.employerInput;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UiEmploymentInfo uiEmploymentInfo = this.userEmployment;
        int iHashCode2 = (((iHashCode + (uiEmploymentInfo == null ? 0 : uiEmploymentInfo.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Unit> uiEvent = this.employmentUpdated;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.employmentUpdateError;
        int iHashCode4 = (iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.employmentConfirmed;
        int iHashCode5 = (iHashCode4 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Unit> uiEvent4 = this.showUpdateDialog;
        return iHashCode5 + (uiEvent4 != null ? uiEvent4.hashCode() : 0);
    }

    public String toString() {
        return "PreFilledFormEmployerViewState(employerInput=" + this.employerInput + ", userEmployment=" + this.userEmployment + ", isLoading=" + this.isLoading + ", employmentUpdated=" + this.employmentUpdated + ", employmentUpdateError=" + this.employmentUpdateError + ", employmentConfirmed=" + this.employmentConfirmed + ", showUpdateDialog=" + this.showUpdateDialog + ")";
    }

    public PreFilledFormEmployerViewState(String str, UiEmploymentInfo uiEmploymentInfo, boolean z, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2, UiEvent<Unit> uiEvent3, UiEvent<Unit> uiEvent4) {
        this.employerInput = str;
        this.userEmployment = uiEmploymentInfo;
        this.isLoading = z;
        this.employmentUpdated = uiEvent;
        this.employmentUpdateError = uiEvent2;
        this.employmentConfirmed = uiEvent3;
        this.showUpdateDialog = uiEvent4;
        this.employerInputHint = (uiEmploymentInfo != null ? uiEmploymentInfo.getEmploymentStatus() : null) == ApiEmploymentInfo.EmploymentStatus.EMPLOYED ? uiEmploymentInfo.getEmployerName() : null;
        this.employerInputEnabled = !z;
        boolean z2 = false;
        if (!z) {
            if (str != null ? !StringsKt.isBlank(str) : false) {
                z2 = true;
            }
        }
        this.continueButtonEnabled = z2;
    }

    public /* synthetic */ PreFilledFormEmployerViewState(String str, UiEmploymentInfo uiEmploymentInfo, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : uiEmploymentInfo, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? null : uiEvent3, (i & 64) != 0 ? null : uiEvent4);
    }

    public final String getEmployerInput() {
        return this.employerInput;
    }

    public final UiEmploymentInfo getUserEmployment() {
        return this.userEmployment;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Unit> getEmploymentUpdated() {
        return this.employmentUpdated;
    }

    public final UiEvent<Throwable> getEmploymentUpdateError() {
        return this.employmentUpdateError;
    }

    public final UiEvent<Unit> getEmploymentConfirmed() {
        return this.employmentConfirmed;
    }

    public final UiEvent<Unit> getShowUpdateDialog() {
        return this.showUpdateDialog;
    }

    public final String getEmployerInputHint() {
        return this.employerInputHint;
    }

    public final boolean getEmployerInputEnabled() {
        return this.employerInputEnabled;
    }

    public final boolean getContinueButtonEnabled() {
        return this.continueButtonEnabled;
    }

    public final UpdateDialogContent getUpdateDialogBundle(Resources resources, String employerInput) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(employerInput, "employerInput");
        UiEvent<Unit> uiEvent = this.showUpdateDialog;
        if (uiEvent == null || uiEvent.consume() == null) {
            return null;
        }
        int i = C14044R.id.dialog_direct_deposit_update_employment_experiment;
        String string2 = resources.getString(C14044R.string.pre_filled_form_update_employment_message, employerInput);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new UpdateDialogContent(i, C14044R.string.pre_filled_form_update_employment_title, C14044R.string.pre_filled_form_update_employment_positive, C14044R.string.pre_filled_form_update_employment_negative, string2);
    }

    public final PreFilledFormEmployerViewState handleEmployerInput(String employerInput) {
        Intrinsics.checkNotNullParameter(employerInput, "employerInput");
        UiEmploymentInfo uiEmploymentInfo = this.userEmployment;
        boolean zAreEqual = Intrinsics.areEqual(uiEmploymentInfo != null ? uiEmploymentInfo.getEmployerName() : null, employerInput);
        UiEmploymentInfo uiEmploymentInfo2 = this.userEmployment;
        boolean z = (uiEmploymentInfo2 != null ? uiEmploymentInfo2.getEmploymentStatus() : null) == ApiEmploymentInfo.EmploymentStatus.EMPLOYED;
        if (zAreEqual && z) {
            return copy$default(this, null, null, false, null, null, new UiEvent(Unit.INSTANCE), null, 95, null);
        }
        return copy$default(this, null, null, false, null, null, null, new UiEvent(Unit.INSTANCE), 63, null);
    }

    /* compiled from: PreFilledFormEmployerViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerViewState$UpdateDialogContent;", "", "id", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "positiveButtonRes", "negativeButtonRes", "message", "", "<init>", "(IIIILjava/lang/String;)V", "getId", "()I", "getTitleRes", "getPositiveButtonRes", "getNegativeButtonRes", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateDialogContent {
        public static final int $stable = 0;
        private final int id;
        private final String message;
        private final int negativeButtonRes;
        private final int positiveButtonRes;
        private final int titleRes;

        public static /* synthetic */ UpdateDialogContent copy$default(UpdateDialogContent updateDialogContent, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = updateDialogContent.id;
            }
            if ((i5 & 2) != 0) {
                i2 = updateDialogContent.titleRes;
            }
            if ((i5 & 4) != 0) {
                i3 = updateDialogContent.positiveButtonRes;
            }
            if ((i5 & 8) != 0) {
                i4 = updateDialogContent.negativeButtonRes;
            }
            if ((i5 & 16) != 0) {
                str = updateDialogContent.message;
            }
            String str2 = str;
            int i6 = i3;
            return updateDialogContent.copy(i, i2, i6, i4, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPositiveButtonRes() {
            return this.positiveButtonRes;
        }

        /* renamed from: component4, reason: from getter */
        public final int getNegativeButtonRes() {
            return this.negativeButtonRes;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final UpdateDialogContent copy(int id, int titleRes, int positiveButtonRes, int negativeButtonRes, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new UpdateDialogContent(id, titleRes, positiveButtonRes, negativeButtonRes, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateDialogContent)) {
                return false;
            }
            UpdateDialogContent updateDialogContent = (UpdateDialogContent) other;
            return this.id == updateDialogContent.id && this.titleRes == updateDialogContent.titleRes && this.positiveButtonRes == updateDialogContent.positiveButtonRes && this.negativeButtonRes == updateDialogContent.negativeButtonRes && Intrinsics.areEqual(this.message, updateDialogContent.message);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.titleRes)) * 31) + Integer.hashCode(this.positiveButtonRes)) * 31) + Integer.hashCode(this.negativeButtonRes)) * 31) + this.message.hashCode();
        }

        public String toString() {
            return "UpdateDialogContent(id=" + this.id + ", titleRes=" + this.titleRes + ", positiveButtonRes=" + this.positiveButtonRes + ", negativeButtonRes=" + this.negativeButtonRes + ", message=" + this.message + ")";
        }

        public UpdateDialogContent(int i, int i2, int i3, int i4, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.id = i;
            this.titleRes = i2;
            this.positiveButtonRes = i3;
            this.negativeButtonRes = i4;
            this.message = message;
        }

        public final int getId() {
            return this.id;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final int getPositiveButtonRes() {
            return this.positiveButtonRes;
        }

        public final int getNegativeButtonRes() {
            return this.negativeButtonRes;
        }

        public final String getMessage() {
            return this.message;
        }
    }
}
