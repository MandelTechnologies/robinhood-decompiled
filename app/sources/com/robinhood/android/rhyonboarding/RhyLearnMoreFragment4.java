package com.robinhood.android.rhyonboarding;

import android.content.Context;
import android.net.Uri;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyLearnMoreFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0016\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/FooterSduiCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/GenericActionSduiCallbacks;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "onDismissCallback", "Lkotlin/Function0;", "", "<init>", "(Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "getContext", "()Landroid/content/Context;", "presentBottomSheet", "sheet", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "presentDialog", "dialog", "dismissDialog", "onBottomSheetDismissed", "launchHttpLink", "uri", "Landroid/net/Uri;", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhyonboarding.FooterSduiCallbacks, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyLearnMoreFragment4 implements SduiActionHandler2 {
    private final Context context;
    private final Navigator navigator;
    private final Function0<Unit> onDismissCallback;

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void launchHttpLink(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
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

    public RhyLearnMoreFragment4(Navigator navigator, Context context, Function0<Unit> onDismissCallback) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onDismissCallback, "onDismissCallback");
        this.navigator = navigator;
        this.context = context;
        this.onDismissCallback = onDismissCallback;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2
    public Navigator getNavigator() {
        return this.navigator;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2
    public Context getContext() {
        return this.context;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void presentBottomSheet(GenericAlertContent<? extends GenericAction> sheet) {
        Intrinsics.checkNotNullParameter(sheet, "sheet");
        throw new IllegalStateException("We don't expect actions in footer present a bottom sheet here");
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void presentDialog(GenericAlertContent<? extends GenericAction> dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        throw new IllegalStateException("We don't expect actions in footer present a dialog here");
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void dismissDialog() {
        this.onDismissCallback.invoke();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void onBottomSheetDismissed() {
        this.onDismissCallback.invoke();
    }
}
