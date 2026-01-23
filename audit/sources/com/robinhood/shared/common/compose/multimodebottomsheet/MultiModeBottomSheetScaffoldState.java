package com.robinhood.shared.common.compose.multimodebottomsheet;

import androidx.compose.material3.SnackbarHostState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiModeBottomSheetScaffold.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeBottomSheetScaffoldState;", "", "bottomSheetState", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "<init>", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;Landroidx/compose/material3/SnackbarHostState;)V", "getBottomSheetState", "()Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "getSnackbarHostState", "()Landroidx/compose/material3/SnackbarHostState;", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class MultiModeBottomSheetScaffoldState {
    public static final int $stable = 0;
    private final MultiModeSheetState bottomSheetState;
    private final SnackbarHostState snackbarHostState;

    public MultiModeBottomSheetScaffoldState(MultiModeSheetState bottomSheetState, SnackbarHostState snackbarHostState) {
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.bottomSheetState = bottomSheetState;
        this.snackbarHostState = snackbarHostState;
    }

    public final MultiModeSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
