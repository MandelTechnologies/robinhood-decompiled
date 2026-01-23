package com.robinhood.android.employment.p114ui;

import com.robinhood.android.employment.C14481R;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseEmployerViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001a\u001a\u00020\tJ\t\u0010!\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jg\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u001cHÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerViewState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "employerName", "", "employerDescription", "employerIndustry", "employerSubmitted", "", "shouldUpdateEmployerAddress", "isLoading", "errors", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/robinhood/udf/UiEvent;)V", "getEmployerName", "()Ljava/lang/String;", "getEmployerDescription", "getEmployerIndustry", "getEmployerSubmitted", "()Z", "getShouldUpdateEmployerAddress", "getErrors", "()Lcom/robinhood/udf/UiEvent;", "isContinueEnabled", "title", "", "getTitle", "()I", "subtitle", "getSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChooseEmployerViewState {
    public static final int $stable = 8;
    private final AppType appType;
    private final String employerDescription;
    private final String employerIndustry;
    private final String employerName;
    private final boolean employerSubmitted;
    private final UiEvent<Throwable> errors;
    private final boolean isLoading;
    private final boolean shouldUpdateEmployerAddress;

    /* compiled from: ChooseEmployerViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.TRADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    public static /* synthetic */ ChooseEmployerViewState copy$default(ChooseEmployerViewState chooseEmployerViewState, AppType appType, String str, String str2, String str3, boolean z, boolean z2, boolean z3, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = chooseEmployerViewState.appType;
        }
        if ((i & 2) != 0) {
            str = chooseEmployerViewState.employerName;
        }
        if ((i & 4) != 0) {
            str2 = chooseEmployerViewState.employerDescription;
        }
        if ((i & 8) != 0) {
            str3 = chooseEmployerViewState.employerIndustry;
        }
        if ((i & 16) != 0) {
            z = chooseEmployerViewState.employerSubmitted;
        }
        if ((i & 32) != 0) {
            z2 = chooseEmployerViewState.shouldUpdateEmployerAddress;
        }
        if ((i & 64) != 0) {
            z3 = chooseEmployerViewState.isLoading;
        }
        if ((i & 128) != 0) {
            uiEvent = chooseEmployerViewState.errors;
        }
        boolean z4 = z3;
        UiEvent uiEvent2 = uiEvent;
        boolean z5 = z;
        boolean z6 = z2;
        return chooseEmployerViewState.copy(appType, str, str2, str3, z5, z6, z4, uiEvent2);
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmployerName() {
        return this.employerName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmployerDescription() {
        return this.employerDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEmployerIndustry() {
        return this.employerIndustry;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEmployerSubmitted() {
        return this.employerSubmitted;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldUpdateEmployerAddress() {
        return this.shouldUpdateEmployerAddress;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> component8() {
        return this.errors;
    }

    public final ChooseEmployerViewState copy(AppType appType, String employerName, String employerDescription, String employerIndustry, boolean employerSubmitted, boolean shouldUpdateEmployerAddress, boolean isLoading, UiEvent<Throwable> errors) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new ChooseEmployerViewState(appType, employerName, employerDescription, employerIndustry, employerSubmitted, shouldUpdateEmployerAddress, isLoading, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChooseEmployerViewState)) {
            return false;
        }
        ChooseEmployerViewState chooseEmployerViewState = (ChooseEmployerViewState) other;
        return this.appType == chooseEmployerViewState.appType && Intrinsics.areEqual(this.employerName, chooseEmployerViewState.employerName) && Intrinsics.areEqual(this.employerDescription, chooseEmployerViewState.employerDescription) && Intrinsics.areEqual(this.employerIndustry, chooseEmployerViewState.employerIndustry) && this.employerSubmitted == chooseEmployerViewState.employerSubmitted && this.shouldUpdateEmployerAddress == chooseEmployerViewState.shouldUpdateEmployerAddress && this.isLoading == chooseEmployerViewState.isLoading && Intrinsics.areEqual(this.errors, chooseEmployerViewState.errors);
    }

    public int hashCode() {
        int iHashCode = this.appType.hashCode() * 31;
        String str = this.employerName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.employerDescription;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.employerIndustry;
        int iHashCode4 = (((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.employerSubmitted)) * 31) + Boolean.hashCode(this.shouldUpdateEmployerAddress)) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Throwable> uiEvent = this.errors;
        return iHashCode4 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "ChooseEmployerViewState(appType=" + this.appType + ", employerName=" + this.employerName + ", employerDescription=" + this.employerDescription + ", employerIndustry=" + this.employerIndustry + ", employerSubmitted=" + this.employerSubmitted + ", shouldUpdateEmployerAddress=" + this.shouldUpdateEmployerAddress + ", isLoading=" + this.isLoading + ", errors=" + this.errors + ")";
    }

    public ChooseEmployerViewState(AppType appType, String str, String str2, String str3, boolean z, boolean z2, boolean z3, UiEvent<Throwable> uiEvent) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
        this.employerName = str;
        this.employerDescription = str2;
        this.employerIndustry = str3;
        this.employerSubmitted = z;
        this.shouldUpdateEmployerAddress = z2;
        this.isLoading = z3;
        this.errors = uiEvent;
    }

    public /* synthetic */ ChooseEmployerViewState(AppType appType, String str, String str2, String str3, boolean z, boolean z2, boolean z3, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : uiEvent);
    }

    public final String getEmployerName() {
        return this.employerName;
    }

    public final String getEmployerDescription() {
        return this.employerDescription;
    }

    public final String getEmployerIndustry() {
        return this.employerIndustry;
    }

    public final boolean getEmployerSubmitted() {
        return this.employerSubmitted;
    }

    public final boolean getShouldUpdateEmployerAddress() {
        return this.shouldUpdateEmployerAddress;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> getErrors() {
        return this.errors;
    }

    public final boolean isContinueEnabled() {
        String str;
        String str2;
        String str3 = this.employerName;
        return (str3 == null || str3.length() == 0 || (str = this.employerDescription) == null || str.length() == 0 || (str2 = this.employerIndustry) == null || str2.length() == 0) ? false : true;
    }

    public final int getTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            return C14481R.string.employer_title;
        }
        if (i == 2) {
            return C14481R.string.gated_rhc_rhf_employer_title;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Not supported for NCW");
    }

    public final int getSubtitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            return C14481R.string.employer_subtitle;
        }
        if (i == 2) {
            return C14481R.string.gated_rhc_rhf_employer_subtitle;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Not supported for NCW");
    }
}
