package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SduiScreen.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0005R(\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ScreenRootState;", "Landroid/os/Parcelable;", "ActionT", "", "<init>", "()V", "", "dismissDialog", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "bottomSheetToPresent", "Landroidx/compose/runtime/MutableState;", "getBottomSheetToPresent$lib_sdui_externalRelease", "()Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "dialogToPresent", "getDialogToPresent$lib_sdui_externalRelease", "", "bottomSheetIsActive", "getBottomSheetIsActive$lib_sdui_externalRelease", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ScreenRootState, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiScreen<ActionT extends Parcelable> {
    public static final int $stable = 0;
    private final SnapshotState<GenericAlertContent<ActionT>> bottomSheetToPresent = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    private final SnapshotState<Function2<Composer, Integer, Unit>> dialogToPresent = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    private final SnapshotState<Boolean> bottomSheetIsActive = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public final SnapshotState<GenericAlertContent<ActionT>> getBottomSheetToPresent$lib_sdui_externalRelease() {
        return this.bottomSheetToPresent;
    }

    public final SnapshotState<Function2<Composer, Integer, Unit>> getDialogToPresent$lib_sdui_externalRelease() {
        return this.dialogToPresent;
    }

    public final SnapshotState<Boolean> getBottomSheetIsActive$lib_sdui_externalRelease() {
        return this.bottomSheetIsActive;
    }

    public final void dismissDialog() {
        this.dialogToPresent.setValue(null);
    }
}
