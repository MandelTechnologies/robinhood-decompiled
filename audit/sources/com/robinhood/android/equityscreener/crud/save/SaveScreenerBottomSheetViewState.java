package com.robinhood.android.equityscreener.crud.save;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.contracts.screeners.SaveScreenerContract;
import com.robinhood.equityscreener.models.SaveScreenerResult;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SaveScreenerBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetViewState;", "", "Loading", "Ready", "Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetViewState$Loading;", "Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetViewState$Ready;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface SaveScreenerBottomSheetViewState {

    /* compiled from: SaveScreenerBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetViewState$Loading;", "Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetViewState;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements SaveScreenerBottomSheetViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: SaveScreenerBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003Jg\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetViewState$Ready;", "Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetViewState;", "titleResId", "", "isSaving", "", "saveError", "Lcom/robinhood/equityscreener/models/SaveScreenerResult$Error;", "displayName", "", AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI, "isEditEmojiEnabled", "isSaveEnabled", "savedScreenerId", "saveType", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;", "<init>", "(IZLcom/robinhood/equityscreener/models/SaveScreenerResult$Error;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;)V", "getTitleResId", "()I", "()Z", "getSaveError", "()Lcom/robinhood/equityscreener/models/SaveScreenerResult$Error;", "getDisplayName", "()Ljava/lang/String;", "getEmoji", "getSavedScreenerId", "getSaveType", "()Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements SaveScreenerBottomSheetViewState {
        public static final int $stable = 8;
        private final String displayName;
        private final String emoji;
        private final boolean isEditEmojiEnabled;
        private final boolean isSaveEnabled;
        private final boolean isSaving;
        private final SaveScreenerResult.Error saveError;
        private final SaveScreenerContract.SaveType saveType;
        private final String savedScreenerId;
        private final int titleResId;

        public static /* synthetic */ Ready copy$default(Ready ready, int i, boolean z, SaveScreenerResult.Error error, String str, String str2, boolean z2, boolean z3, String str3, SaveScreenerContract.SaveType saveType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = ready.titleResId;
            }
            if ((i2 & 2) != 0) {
                z = ready.isSaving;
            }
            if ((i2 & 4) != 0) {
                error = ready.saveError;
            }
            if ((i2 & 8) != 0) {
                str = ready.displayName;
            }
            if ((i2 & 16) != 0) {
                str2 = ready.emoji;
            }
            if ((i2 & 32) != 0) {
                z2 = ready.isEditEmojiEnabled;
            }
            if ((i2 & 64) != 0) {
                z3 = ready.isSaveEnabled;
            }
            if ((i2 & 128) != 0) {
                str3 = ready.savedScreenerId;
            }
            if ((i2 & 256) != 0) {
                saveType = ready.saveType;
            }
            String str4 = str3;
            SaveScreenerContract.SaveType saveType2 = saveType;
            boolean z4 = z2;
            boolean z5 = z3;
            String str5 = str2;
            SaveScreenerResult.Error error2 = error;
            return ready.copy(i, z, error2, str, str5, z4, z5, str4, saveType2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleResId() {
            return this.titleResId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSaving() {
            return this.isSaving;
        }

        /* renamed from: component3, reason: from getter */
        public final SaveScreenerResult.Error getSaveError() {
            return this.saveError;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEmoji() {
            return this.emoji;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsEditEmojiEnabled() {
            return this.isEditEmojiEnabled;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsSaveEnabled() {
            return this.isSaveEnabled;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSavedScreenerId() {
            return this.savedScreenerId;
        }

        /* renamed from: component9, reason: from getter */
        public final SaveScreenerContract.SaveType getSaveType() {
            return this.saveType;
        }

        public final Ready copy(int titleResId, boolean isSaving, SaveScreenerResult.Error saveError, String displayName, String emoji, boolean isEditEmojiEnabled, boolean isSaveEnabled, String savedScreenerId, SaveScreenerContract.SaveType saveType) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            Intrinsics.checkNotNullParameter(saveType, "saveType");
            return new Ready(titleResId, isSaving, saveError, displayName, emoji, isEditEmojiEnabled, isSaveEnabled, savedScreenerId, saveType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return this.titleResId == ready.titleResId && this.isSaving == ready.isSaving && Intrinsics.areEqual(this.saveError, ready.saveError) && Intrinsics.areEqual(this.displayName, ready.displayName) && Intrinsics.areEqual(this.emoji, ready.emoji) && this.isEditEmojiEnabled == ready.isEditEmojiEnabled && this.isSaveEnabled == ready.isSaveEnabled && Intrinsics.areEqual(this.savedScreenerId, ready.savedScreenerId) && Intrinsics.areEqual(this.saveType, ready.saveType);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.titleResId) * 31) + Boolean.hashCode(this.isSaving)) * 31;
            SaveScreenerResult.Error error = this.saveError;
            int iHashCode2 = (((((((((iHashCode + (error == null ? 0 : error.hashCode())) * 31) + this.displayName.hashCode()) * 31) + this.emoji.hashCode()) * 31) + Boolean.hashCode(this.isEditEmojiEnabled)) * 31) + Boolean.hashCode(this.isSaveEnabled)) * 31;
            String str = this.savedScreenerId;
            return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.saveType.hashCode();
        }

        public String toString() {
            return "Ready(titleResId=" + this.titleResId + ", isSaving=" + this.isSaving + ", saveError=" + this.saveError + ", displayName=" + this.displayName + ", emoji=" + this.emoji + ", isEditEmojiEnabled=" + this.isEditEmojiEnabled + ", isSaveEnabled=" + this.isSaveEnabled + ", savedScreenerId=" + this.savedScreenerId + ", saveType=" + this.saveType + ")";
        }

        public Ready(int i, boolean z, SaveScreenerResult.Error error, String displayName, String emoji, boolean z2, boolean z3, String str, SaveScreenerContract.SaveType saveType) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            Intrinsics.checkNotNullParameter(saveType, "saveType");
            this.titleResId = i;
            this.isSaving = z;
            this.saveError = error;
            this.displayName = displayName;
            this.emoji = emoji;
            this.isEditEmojiEnabled = z2;
            this.isSaveEnabled = z3;
            this.savedScreenerId = str;
            this.saveType = saveType;
        }

        public final int getTitleResId() {
            return this.titleResId;
        }

        public final boolean isSaving() {
            return this.isSaving;
        }

        public final SaveScreenerResult.Error getSaveError() {
            return this.saveError;
        }

        public /* synthetic */ Ready(int i, boolean z, SaveScreenerResult.Error error, String str, String str2, boolean z2, boolean z3, String str3, SaveScreenerContract.SaveType saveType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z, error, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? ScreenersStore.DefaultEmoji : str2, z2, z3, (i2 & 128) != 0 ? null : str3, saveType);
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getEmoji() {
            return this.emoji;
        }

        public final boolean isEditEmojiEnabled() {
            return this.isEditEmojiEnabled;
        }

        public final boolean isSaveEnabled() {
            return this.isSaveEnabled;
        }

        public final String getSavedScreenerId() {
            return this.savedScreenerId;
        }

        public final SaveScreenerContract.SaveType getSaveType() {
            return this.saveType;
        }
    }
}
