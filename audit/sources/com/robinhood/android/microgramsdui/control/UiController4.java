package com.robinhood.android.microgramsdui.control;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.p507ui.core.screen.CustomScreenEventCoordinator;

/* compiled from: UiController.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a.\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0002H\u0086H¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"notifyCustomScreenEvent", "", "T", "Lmicrogram/ui/core/screen/CustomScreenEvent;", "Lcom/robinhood/android/microgramsdui/control/UiController;", "identifier", "", "event", "(Lcom/robinhood/android/microgramsdui/control/UiController;Ljava/lang/String;Lmicrogram/ui/core/screen/CustomScreenEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-sdui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.control.UiControllerKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class UiController4 {
    public static final /* synthetic */ <T extends CustomScreenEventCoordinator> Object notifyCustomScreenEvent(UiController uiController, String str, T t, Continuation<? super Unit> continuation) {
        Intrinsics.reifiedOperationMarker(6, "T");
        InlineMarker.mark(0);
        uiController.notifyCustomScreenEvent(null, str, t, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
