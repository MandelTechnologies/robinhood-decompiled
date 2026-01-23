package com.robinhood.android.equityscreener.crud.save;

import com.robinhood.android.equities.contracts.screeners.SaveScreenerContract;
import com.robinhood.equityscreener.models.SaveScreenerResult;
import com.robinhood.equityscreener.models.p294db.Screener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SaveScreenerBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetDataState;", "", "saveType", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "isSaving", "", "saveError", "Lcom/robinhood/equityscreener/models/SaveScreenerResult$Error;", "updatedDisplayName", "", "updatedEmoji", "savedScreenerId", "<init>", "(Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;Lcom/robinhood/equityscreener/models/db/Screener;ZLcom/robinhood/equityscreener/models/SaveScreenerResult$Error;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSaveType", "()Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;", "getScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "()Z", "getSaveError", "()Lcom/robinhood/equityscreener/models/SaveScreenerResult$Error;", "getUpdatedDisplayName", "()Ljava/lang/String;", "getUpdatedEmoji", "getSavedScreenerId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveScreenerBottomSheetDataState {
    public static final int $stable = 8;
    private final boolean isSaving;
    private final SaveScreenerResult.Error saveError;
    private final SaveScreenerContract.SaveType saveType;
    private final String savedScreenerId;
    private final Screener screener;
    private final String updatedDisplayName;
    private final String updatedEmoji;

    public static /* synthetic */ SaveScreenerBottomSheetDataState copy$default(SaveScreenerBottomSheetDataState saveScreenerBottomSheetDataState, SaveScreenerContract.SaveType saveType, Screener screener, boolean z, SaveScreenerResult.Error error, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            saveType = saveScreenerBottomSheetDataState.saveType;
        }
        if ((i & 2) != 0) {
            screener = saveScreenerBottomSheetDataState.screener;
        }
        if ((i & 4) != 0) {
            z = saveScreenerBottomSheetDataState.isSaving;
        }
        if ((i & 8) != 0) {
            error = saveScreenerBottomSheetDataState.saveError;
        }
        if ((i & 16) != 0) {
            str = saveScreenerBottomSheetDataState.updatedDisplayName;
        }
        if ((i & 32) != 0) {
            str2 = saveScreenerBottomSheetDataState.updatedEmoji;
        }
        if ((i & 64) != 0) {
            str3 = saveScreenerBottomSheetDataState.savedScreenerId;
        }
        String str4 = str2;
        String str5 = str3;
        String str6 = str;
        boolean z2 = z;
        return saveScreenerBottomSheetDataState.copy(saveType, screener, z2, error, str6, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final SaveScreenerContract.SaveType getSaveType() {
        return this.saveType;
    }

    /* renamed from: component2, reason: from getter */
    public final Screener getScreener() {
        return this.screener;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSaving() {
        return this.isSaving;
    }

    /* renamed from: component4, reason: from getter */
    public final SaveScreenerResult.Error getSaveError() {
        return this.saveError;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUpdatedDisplayName() {
        return this.updatedDisplayName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUpdatedEmoji() {
        return this.updatedEmoji;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSavedScreenerId() {
        return this.savedScreenerId;
    }

    public final SaveScreenerBottomSheetDataState copy(SaveScreenerContract.SaveType saveType, Screener screener, boolean isSaving, SaveScreenerResult.Error saveError, String updatedDisplayName, String updatedEmoji, String savedScreenerId) {
        Intrinsics.checkNotNullParameter(saveType, "saveType");
        return new SaveScreenerBottomSheetDataState(saveType, screener, isSaving, saveError, updatedDisplayName, updatedEmoji, savedScreenerId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveScreenerBottomSheetDataState)) {
            return false;
        }
        SaveScreenerBottomSheetDataState saveScreenerBottomSheetDataState = (SaveScreenerBottomSheetDataState) other;
        return Intrinsics.areEqual(this.saveType, saveScreenerBottomSheetDataState.saveType) && Intrinsics.areEqual(this.screener, saveScreenerBottomSheetDataState.screener) && this.isSaving == saveScreenerBottomSheetDataState.isSaving && Intrinsics.areEqual(this.saveError, saveScreenerBottomSheetDataState.saveError) && Intrinsics.areEqual(this.updatedDisplayName, saveScreenerBottomSheetDataState.updatedDisplayName) && Intrinsics.areEqual(this.updatedEmoji, saveScreenerBottomSheetDataState.updatedEmoji) && Intrinsics.areEqual(this.savedScreenerId, saveScreenerBottomSheetDataState.savedScreenerId);
    }

    public int hashCode() {
        int iHashCode = this.saveType.hashCode() * 31;
        Screener screener = this.screener;
        int iHashCode2 = (((iHashCode + (screener == null ? 0 : screener.hashCode())) * 31) + Boolean.hashCode(this.isSaving)) * 31;
        SaveScreenerResult.Error error = this.saveError;
        int iHashCode3 = (iHashCode2 + (error == null ? 0 : error.hashCode())) * 31;
        String str = this.updatedDisplayName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updatedEmoji;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.savedScreenerId;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SaveScreenerBottomSheetDataState(saveType=" + this.saveType + ", screener=" + this.screener + ", isSaving=" + this.isSaving + ", saveError=" + this.saveError + ", updatedDisplayName=" + this.updatedDisplayName + ", updatedEmoji=" + this.updatedEmoji + ", savedScreenerId=" + this.savedScreenerId + ")";
    }

    public SaveScreenerBottomSheetDataState(SaveScreenerContract.SaveType saveType, Screener screener, boolean z, SaveScreenerResult.Error error, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(saveType, "saveType");
        this.saveType = saveType;
        this.screener = screener;
        this.isSaving = z;
        this.saveError = error;
        this.updatedDisplayName = str;
        this.updatedEmoji = str2;
        this.savedScreenerId = str3;
    }

    public /* synthetic */ SaveScreenerBottomSheetDataState(SaveScreenerContract.SaveType saveType, Screener screener, boolean z, SaveScreenerResult.Error error, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(saveType, (i & 2) != 0 ? null : screener, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : error, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
    }

    public final SaveScreenerContract.SaveType getSaveType() {
        return this.saveType;
    }

    public final Screener getScreener() {
        return this.screener;
    }

    public final boolean isSaving() {
        return this.isSaving;
    }

    public final SaveScreenerResult.Error getSaveError() {
        return this.saveError;
    }

    public final String getUpdatedDisplayName() {
        return this.updatedDisplayName;
    }

    public final String getUpdatedEmoji() {
        return this.updatedEmoji;
    }

    public final String getSavedScreenerId() {
        return this.savedScreenerId;
    }
}
