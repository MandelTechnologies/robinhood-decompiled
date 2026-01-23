package com.robinhood.android.equityscreener.crud.saveOptions;

import kotlin.Metadata;

/* compiled from: SaveScreenerOptionsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsViewState;", "", "isSaving", "", "isSaved", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveScreenerOptionsViewState {
    public static final int $stable = 0;
    private final boolean isSaved;
    private final boolean isSaving;

    public static /* synthetic */ SaveScreenerOptionsViewState copy$default(SaveScreenerOptionsViewState saveScreenerOptionsViewState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = saveScreenerOptionsViewState.isSaving;
        }
        if ((i & 2) != 0) {
            z2 = saveScreenerOptionsViewState.isSaved;
        }
        return saveScreenerOptionsViewState.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSaving() {
        return this.isSaving;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSaved() {
        return this.isSaved;
    }

    public final SaveScreenerOptionsViewState copy(boolean isSaving, boolean isSaved) {
        return new SaveScreenerOptionsViewState(isSaving, isSaved);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveScreenerOptionsViewState)) {
            return false;
        }
        SaveScreenerOptionsViewState saveScreenerOptionsViewState = (SaveScreenerOptionsViewState) other;
        return this.isSaving == saveScreenerOptionsViewState.isSaving && this.isSaved == saveScreenerOptionsViewState.isSaved;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isSaving) * 31) + Boolean.hashCode(this.isSaved);
    }

    public String toString() {
        return "SaveScreenerOptionsViewState(isSaving=" + this.isSaving + ", isSaved=" + this.isSaved + ")";
    }

    public SaveScreenerOptionsViewState(boolean z, boolean z2) {
        this.isSaving = z;
        this.isSaved = z2;
    }

    public final boolean isSaving() {
        return this.isSaving;
    }

    public final boolean isSaved() {
        return this.isSaved;
    }
}
