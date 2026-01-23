package com.robinhood.android.futures.sharedfuturesui;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.platform.TextToolbar;
import androidx.compose.p011ui.platform.TextToolbarStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransparentSelectionColors.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016JP\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/EmptyTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "<init>", "()V", "status", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "hide", "", "showMenu", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "Lkotlin/Function0;", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.sharedfuturesui.EmptyTextToolbar, reason: use source file name */
/* loaded from: classes3.dex */
public final class TransparentSelectionColors implements TextToolbar {
    public static final int $stable = 0;
    public static final TransparentSelectionColors INSTANCE = new TransparentSelectionColors();
    private static final TextToolbarStatus status = TextToolbarStatus.Hidden;

    @Override // androidx.compose.p011ui.platform.TextToolbar
    public void hide() {
    }

    @Override // androidx.compose.p011ui.platform.TextToolbar
    public void showMenu(Rect rect, Function0<Unit> onCopyRequested, Function0<Unit> onPasteRequested, Function0<Unit> onCutRequested, Function0<Unit> onSelectAllRequested) {
        Intrinsics.checkNotNullParameter(rect, "rect");
    }

    @Override // androidx.compose.p011ui.platform.TextToolbar
    public /* bridge */ /* synthetic */ void showMenu(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        super.showMenu(rect, function0, function02, function03, function04, function05);
    }

    private TransparentSelectionColors() {
    }

    @Override // androidx.compose.p011ui.platform.TextToolbar
    public TextToolbarStatus getStatus() {
        return status;
    }
}
