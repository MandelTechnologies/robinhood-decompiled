package com.robinhood.android.employment.p114ui;

import com.robinhood.models.p355ui.bonfire.UiEmployerType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseEmploymentLoadingViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentLoadingViewState;", "", "employmentTypes", "Lcom/robinhood/models/ui/bonfire/UiEmployerType;", "<init>", "(Lcom/robinhood/models/ui/bonfire/UiEmployerType;)V", "getEmploymentTypes", "()Lcom/robinhood/models/ui/bonfire/UiEmployerType;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChooseEmploymentLoadingViewState {
    public static final int $stable = 8;
    private final UiEmployerType employmentTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public ChooseEmploymentLoadingViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChooseEmploymentLoadingViewState copy$default(ChooseEmploymentLoadingViewState chooseEmploymentLoadingViewState, UiEmployerType uiEmployerType, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEmployerType = chooseEmploymentLoadingViewState.employmentTypes;
        }
        return chooseEmploymentLoadingViewState.copy(uiEmployerType);
    }

    /* renamed from: component1, reason: from getter */
    public final UiEmployerType getEmploymentTypes() {
        return this.employmentTypes;
    }

    public final ChooseEmploymentLoadingViewState copy(UiEmployerType employmentTypes) {
        return new ChooseEmploymentLoadingViewState(employmentTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChooseEmploymentLoadingViewState) && Intrinsics.areEqual(this.employmentTypes, ((ChooseEmploymentLoadingViewState) other).employmentTypes);
    }

    public int hashCode() {
        UiEmployerType uiEmployerType = this.employmentTypes;
        if (uiEmployerType == null) {
            return 0;
        }
        return uiEmployerType.hashCode();
    }

    public String toString() {
        return "ChooseEmploymentLoadingViewState(employmentTypes=" + this.employmentTypes + ")";
    }

    public ChooseEmploymentLoadingViewState(UiEmployerType uiEmployerType) {
        this.employmentTypes = uiEmployerType;
    }

    public /* synthetic */ ChooseEmploymentLoadingViewState(UiEmployerType uiEmployerType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEmployerType);
    }

    public final UiEmployerType getEmploymentTypes() {
        return this.employmentTypes;
    }
}
