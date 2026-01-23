package com.robinhood.android.employment.p114ui;

import com.robinhood.models.api.identi.ApiEmploymentInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ChooseEmploymentStatusDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusViewState;", "", "options", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;", "isLoading", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Z)V", "getOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChooseEmploymentStatusViewState {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final ImmutableList<ApiEmploymentInfo.EmploymentStatus> options;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChooseEmploymentStatusViewState copy$default(ChooseEmploymentStatusViewState chooseEmploymentStatusViewState, ImmutableList immutableList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = chooseEmploymentStatusViewState.options;
        }
        if ((i & 2) != 0) {
            z = chooseEmploymentStatusViewState.isLoading;
        }
        return chooseEmploymentStatusViewState.copy(immutableList, z);
    }

    public final ImmutableList<ApiEmploymentInfo.EmploymentStatus> component1() {
        return this.options;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ChooseEmploymentStatusViewState copy(ImmutableList<? extends ApiEmploymentInfo.EmploymentStatus> options, boolean isLoading) {
        Intrinsics.checkNotNullParameter(options, "options");
        return new ChooseEmploymentStatusViewState(options, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChooseEmploymentStatusViewState)) {
            return false;
        }
        ChooseEmploymentStatusViewState chooseEmploymentStatusViewState = (ChooseEmploymentStatusViewState) other;
        return Intrinsics.areEqual(this.options, chooseEmploymentStatusViewState.options) && this.isLoading == chooseEmploymentStatusViewState.isLoading;
    }

    public int hashCode() {
        return (this.options.hashCode() * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "ChooseEmploymentStatusViewState(options=" + this.options + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChooseEmploymentStatusViewState(ImmutableList<? extends ApiEmploymentInfo.EmploymentStatus> options, boolean z) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        this.isLoading = z;
    }

    public /* synthetic */ ChooseEmploymentStatusViewState(ImmutableList immutableList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, (i & 2) != 0 ? false : z);
    }

    public final ImmutableList<ApiEmploymentInfo.EmploymentStatus> getOptions() {
        return this.options;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
