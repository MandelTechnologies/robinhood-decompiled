package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.net.Uri;
import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Deprecated;
import kotlin.Metadata;

/* compiled from: SduiActionHandler.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;", "ActionT", "Landroid/os/Parcelable;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "presentBottomSheet", "", "sheet", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "presentDialog", "dialog", "dismissDialog", "onBottomSheetDismissed", "launchHttpLink", "uri", "Landroid/net/Uri;", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiCallbacks, reason: use source file name */
/* loaded from: classes8.dex */
public interface SduiActionHandler6<ActionT extends Parcelable> extends SduiActionHandler<ActionT> {
    void dismissDialog();

    void launchHttpLink(Uri uri);

    void onBottomSheetDismissed();

    void presentBottomSheet(GenericAlertContent<? extends ActionT> sheet);

    void presentDialog(GenericAlertContent<? extends ActionT> dialog);
}
