package com.robinhood.android.equityscreener.crud.save;

import com.robinhood.android.equities.contracts.screeners.SaveScreenerContract;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.equityscreener.models.SaveScreenerResult;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SaveScreenerBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetDataState;", "Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetViewState;", "<init>", "()V", "reduce", "dataState", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class SaveScreenerBottomSheetViewState3 implements StateProvider<SaveScreenerBottomSheetDataState, SaveScreenerBottomSheetViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SaveScreenerBottomSheetViewState reduce(SaveScreenerBottomSheetDataState dataState) {
        int i;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getScreener() == null) {
            return SaveScreenerBottomSheetViewState.Loading.INSTANCE;
        }
        String updatedDisplayName = dataState.getUpdatedDisplayName();
        if (updatedDisplayName == null) {
            updatedDisplayName = dataState.getScreener().getDisplayName() + "*";
            if (!(dataState.getSaveType() instanceof SaveScreenerContract.SaveType.SaveAs)) {
                updatedDisplayName = null;
            }
            if (updatedDisplayName == null) {
                updatedDisplayName = dataState.getScreener().getDisplayName();
            }
        }
        String str = updatedDisplayName;
        SaveScreenerContract.SaveType saveType = dataState.getSaveType();
        if (saveType instanceof SaveScreenerContract.SaveType.Save) {
            i = C15652R.string.save_sheet_title_save;
        } else if (saveType instanceof SaveScreenerContract.SaveType.SaveAs) {
            i = C15652R.string.save_sheet_title_save_as;
        } else {
            if (!(saveType instanceof SaveScreenerContract.SaveType.EditName)) {
                throw new NoWhenBranchMatchedException();
            }
            i = C15652R.string.save_sheet_title_edit_name;
        }
        int i2 = i;
        boolean zIsSaving = dataState.isSaving();
        SaveScreenerResult.Error saveError = dataState.getSaveError();
        String updatedEmoji = dataState.getUpdatedEmoji();
        if (updatedEmoji == null && (updatedEmoji = dataState.getScreener().getIconEmoji()) == null) {
            updatedEmoji = ScreenersStore.DefaultEmoji;
        }
        return new SaveScreenerBottomSheetViewState.Ready(i2, zIsSaving, saveError, str, updatedEmoji, !dataState.isSaving(), (dataState.isSaving() || StringsKt.isBlank(str)) ? false : true, dataState.getSavedScreenerId(), dataState.getSaveType());
    }
}
