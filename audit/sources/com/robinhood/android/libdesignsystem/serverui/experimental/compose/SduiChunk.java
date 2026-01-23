package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.content.Context;
import android.net.Uri;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiChunk.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B¨\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0004\u0012\u00020\n0\u0007\u0012L\u0010\u000b\u001aH\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\fj\b\u0012\u0004\u0012\u00020\t`\u0012\u0012%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u001e\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010 \u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR%\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dRT\u0010\u000b\u001aH\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\fj\b\u0012\u0004\u0012\u00020\t`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiChunkGenericActionCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/GenericActionSduiCallbacks;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "dialogSetter", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "", "presentBottomSheetFn", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "alert", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;", "callbacks", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/BottomSheetPresenterFn;", "onLaunchHttpLink", "Landroid/net/Uri;", "uri", "<init>", "(Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "getContext", "()Landroid/content/Context;", "getDialogSetter", "()Lkotlin/jvm/functions/Function1;", "presentBottomSheet", "sheet", "presentDialog", "dialog", "dismissDialog", "onBottomSheetDismissed", "launchHttpLink", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChunkGenericActionCallbacks, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiChunk implements SduiActionHandler2 {
    public static final int $stable = 8;
    private final Context context;
    private final Function1<GenericAlertContent<? extends GenericAction>, Unit> dialogSetter;
    private final Navigator navigator;
    private final Function1<Uri, Unit> onLaunchHttpLink;
    private final Function2<GenericAlertContent<? extends GenericAction>, SduiActionHandler6<GenericAction>, Unit> presentBottomSheetFn;

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void onBottomSheetDismissed() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SduiChunk(Navigator navigator, Context context, Function1<? super GenericAlertContent<? extends GenericAction>, Unit> dialogSetter, Function2<? super GenericAlertContent<? extends GenericAction>, ? super SduiActionHandler6<GenericAction>, Unit> presentBottomSheetFn, Function1<? super Uri, Unit> function1) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dialogSetter, "dialogSetter");
        Intrinsics.checkNotNullParameter(presentBottomSheetFn, "presentBottomSheetFn");
        this.navigator = navigator;
        this.context = context;
        this.dialogSetter = dialogSetter;
        this.presentBottomSheetFn = presentBottomSheetFn;
        this.onLaunchHttpLink = function1;
    }

    public /* synthetic */ SduiChunk(Navigator navigator, Context context, Function1 function1, Function2 function2, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navigator, context, function1, function2, (i & 16) != 0 ? null : function12);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle */
    public boolean mo15941handle(GenericAction genericAction) {
        return SduiActionHandler2.DefaultImpls.handle(this, genericAction);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2
    public void launchDeeplink(Context context, DeeplinkAction deeplinkAction) {
        SduiActionHandler2.DefaultImpls.launchDeeplink(this, context, deeplinkAction);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2
    public Navigator getNavigator() {
        return this.navigator;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2
    public Context getContext() {
        return this.context;
    }

    public final Function1<GenericAlertContent<? extends GenericAction>, Unit> getDialogSetter() {
        return this.dialogSetter;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void presentBottomSheet(GenericAlertContent<? extends GenericAction> sheet) {
        Intrinsics.checkNotNullParameter(sheet, "sheet");
        this.presentBottomSheetFn.invoke(sheet, this);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void presentDialog(GenericAlertContent<? extends GenericAction> dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.dialogSetter.invoke(dialog);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void dismissDialog() {
        this.dialogSetter.invoke(null);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void launchHttpLink(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Function1<Uri, Unit> function1 = this.onLaunchHttpLink;
        if (function1 != null) {
            function1.invoke(uri);
        }
    }
}
