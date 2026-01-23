package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.content.Context;
import android.net.Uri;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiActionHandler.kt */
@Deprecated
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/GenericActionSduiCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "launchDeeplink", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "handle", "", "Companion", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.GenericActionSduiCallbacks, reason: use source file name */
/* loaded from: classes8.dex */
public interface SduiActionHandler2 extends SduiActionHandler6<GenericAction> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: SduiActionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.GenericActionSduiCallbacks$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
            try {
                iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    Context getContext();

    Navigator getNavigator();

    /* renamed from: handle */
    boolean mo15941handle(GenericAction action);

    void launchDeeplink(Context context, DeeplinkAction action);

    /* compiled from: SduiActionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.GenericActionSduiCallbacks$DefaultImpls */
    public static final class DefaultImpls {
        public static void launchDeeplink(SduiActionHandler2 sduiActionHandler2, Context context, DeeplinkAction action) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            Uri uri = Uri.parse(action.getUri());
            Navigator navigator = sduiActionHandler2.getNavigator();
            Intrinsics.checkNotNull(uri);
            if (navigator.isDeepLinkSupported(uri)) {
                Navigator.DefaultImpls.handleDeepLink$default(sduiActionHandler2.getNavigator(), context, uri, null, null, false, null, 60, null);
            } else {
                sduiActionHandler2.launchHttpLink(uri);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean handle(SduiActionHandler2 sduiActionHandler2, GenericAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof GenericAction.Deeplink) {
                sduiActionHandler2.launchDeeplink(sduiActionHandler2.getContext(), ((GenericAction.Deeplink) action).getValue2());
            } else if (action instanceof GenericAction.Dismiss) {
                sduiActionHandler2.onBottomSheetDismissed();
                sduiActionHandler2.dismissDialog();
            } else {
                if (!(action instanceof GenericAction.InfoAlert)) {
                    throw new NoWhenBranchMatchedException();
                }
                AlertAction value2 = ((GenericAction.InfoAlert) action).getValue2();
                int i = WhenMappings.$EnumSwitchMapping$0[value2.getMobile_presentation_style().ordinal()];
                if (i == 1) {
                    sduiActionHandler2.presentBottomSheet(value2.getAlert());
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sduiActionHandler2.presentDialog(value2.getAlert());
                }
                return true;
            }
            return true;
        }
    }

    /* compiled from: SduiActionHandler.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/GenericActionSduiCallbacks$Companion;", "", "<init>", "()V", "launchHttpLinkInInternalBrowser", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.GenericActionSduiCallbacks$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final void launchHttpLinkInInternalBrowser(Context context, Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            WebUtils.viewUrl$default(context, uri.toString(), 0, 4, (Object) null);
        }
    }
}
