package com.robinhood.android.equityscreener.crud.saveOptions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SaveScreenerOptionsDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsDataState;", "", "isSaving", "", "isSaved", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveScreenerOptionsDataState {
    public static final int $stable = 0;
    private final boolean isSaved;
    private final boolean isSaving;

    /* JADX WARN: Illegal instructions before constructor call */
    public SaveScreenerOptionsDataState() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ SaveScreenerOptionsDataState copy$default(SaveScreenerOptionsDataState saveScreenerOptionsDataState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = saveScreenerOptionsDataState.isSaving;
        }
        if ((i & 2) != 0) {
            z2 = saveScreenerOptionsDataState.isSaved;
        }
        return saveScreenerOptionsDataState.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSaving() {
        return this.isSaving;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSaved() {
        return this.isSaved;
    }

    public final SaveScreenerOptionsDataState copy(boolean isSaving, boolean isSaved) {
        return new SaveScreenerOptionsDataState(isSaving, isSaved);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveScreenerOptionsDataState)) {
            return false;
        }
        SaveScreenerOptionsDataState saveScreenerOptionsDataState = (SaveScreenerOptionsDataState) other;
        return this.isSaving == saveScreenerOptionsDataState.isSaving && this.isSaved == saveScreenerOptionsDataState.isSaved;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isSaving) * 31) + Boolean.hashCode(this.isSaved);
    }

    public String toString() {
        return "SaveScreenerOptionsDataState(isSaving=" + this.isSaving + ", isSaved=" + this.isSaved + ")";
    }

    public SaveScreenerOptionsDataState(boolean z, boolean z2) {
        this.isSaving = z;
        this.isSaved = z2;
    }

    public /* synthetic */ SaveScreenerOptionsDataState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean isSaving() {
        return this.isSaving;
    }

    public final boolean isSaved() {
        return this.isSaved;
    }
}
