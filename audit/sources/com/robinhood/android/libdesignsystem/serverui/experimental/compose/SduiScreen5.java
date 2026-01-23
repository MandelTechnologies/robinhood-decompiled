package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
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

/* compiled from: SduiScreen.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BL\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0016J\u0016\u0010\u0019\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R+\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiScreenRootGenericActionCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/GenericActionSduiCallbacks;", "state", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ScreenRootState;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "onLaunchHttpLink", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "uri", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ScreenRootState;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "getContext", "()Landroid/content/Context;", "presentBottomSheet", "sheet", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "presentDialog", "dialog", "dismissDialog", "onBottomSheetDismissed", "launchHttpLink", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenRootGenericActionCallbacks, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiScreen5 implements SduiActionHandler2 {
    public static final int $stable = 8;
    private final Context context;
    private final Navigator navigator;
    private final Function1<Uri, Unit> onLaunchHttpLink;
    private final SduiScreen<GenericAction> state;

    /* JADX WARN: Multi-variable type inference failed */
    public SduiScreen5(SduiScreen<GenericAction> state, Navigator navigator, Context context, Function1<? super Uri, Unit> function1) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = state;
        this.navigator = navigator;
        this.context = context;
        this.onLaunchHttpLink = function1;
    }

    public /* synthetic */ SduiScreen5(SduiScreen sduiScreen, Navigator navigator, Context context, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sduiScreen, navigator, context, (i & 8) != 0 ? null : function1);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
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

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void presentBottomSheet(GenericAlertContent<? extends GenericAction> sheet) {
        Intrinsics.checkNotNullParameter(sheet, "sheet");
        this.state.getBottomSheetToPresent$lib_sdui_externalRelease().setValue(sheet);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void presentDialog(final GenericAlertContent<? extends GenericAction> dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.state.getDialogToPresent$lib_sdui_externalRelease().setValue(ComposableLambda3.composableLambdaInstance(1687637091, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenRootGenericActionCallbacks$presentDialog$factory$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1687637091, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenRootGenericActionCallbacks.presentDialog.<anonymous> (SduiScreen.kt:173)");
                }
                SduiAlert.INSTANCE.Dialog(dialog, this, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void dismissDialog() {
        this.state.dismissDialog();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void onBottomSheetDismissed() {
        this.state.getBottomSheetToPresent$lib_sdui_externalRelease().setValue(null);
        this.state.getBottomSheetIsActive$lib_sdui_externalRelease().setValue(Boolean.FALSE);
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
