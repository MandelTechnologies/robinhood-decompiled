package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.common.p088ui.RhButtonType;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiAlert.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u009e\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¨\u0006\u0017"}, m3636d2 = {"presentSduiAlertSheet", "", "ActionT", "Landroid/os/Parcelable;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost;", "markwon", "Lio/noties/markwon/Markwon;", "alert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "onPrimaryButtonClick", "Lkotlin/Function1;", "", "onSecondaryButtonClick", "onDismiss", "Lkotlin/Function0;", "forCrypto", "", "forAchromatic", "isCancelable", "overridePrimaryButtonType", "Lcom/robinhood/android/common/ui/RhButtonType;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class SduiAlertKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit presentSduiAlertSheet$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit presentSduiAlertSheet$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void presentSduiAlertSheet(RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, Markwon markwon, GenericAlertContent<? extends ActionT> alert, SduiActionHandler<? super ActionT> actionHandler, Function1<? super String, Unit> onPrimaryButtonClick, Function1<? super String, Unit> onSecondaryButtonClick, Function0<Unit> onDismiss, boolean z, boolean z2, boolean z3, RhButtonType rhButtonType) {
        Intrinsics.checkNotNullParameter(rhBottomSheetDialogFragmentHost, "<this>");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        rhBottomSheetDialogFragmentHost.setSheetListener(SduiAlert.INSTANCE.sheetListener(rhBottomSheetDialogFragmentHost.getChildFragmentManager(), markwon, alert, actionHandler, onDismiss, onPrimaryButtonClick, onSecondaryButtonClick, z, z2, z3, rhButtonType));
    }
}
