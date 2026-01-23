package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.trade.equity.p261ui.configuration.selection.OrderConfigurationSelectionFragment;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderConfigurationSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, m3636d2 = {"com/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionFragment$sduiCallbacks$1", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "presentBottomSheet", "", "sheet", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "presentDialog", "dialog", "dismissDialog", "onBottomSheetDismissed", "launchHttpLink", "uri", "Landroid/net/Uri;", "handle", "", "action", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$sduiCallbacks$1, reason: use source file name */
/* loaded from: classes9.dex */
public final class OrderConfigurationSelectionFragment3 implements SduiActionHandler6<GenericAction> {
    final /* synthetic */ OrderConfigurationSelectionFragment this$0;

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void dismissDialog() {
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void launchHttpLink(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void onBottomSheetDismissed() {
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void presentBottomSheet(GenericAlertContent<? extends GenericAction> sheet) {
        Intrinsics.checkNotNullParameter(sheet, "sheet");
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6
    public void presentDialog(GenericAlertContent<? extends GenericAction> dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
    }

    OrderConfigurationSelectionFragment3(OrderConfigurationSelectionFragment orderConfigurationSelectionFragment) {
        this.this$0 = orderConfigurationSelectionFragment;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.InfoAlert) {
            OrderConfigurationSelectionFragment.Callbacks callbacks = this.this$0.getCallbacks();
            SduiAlert sduiAlert = SduiAlert.INSTANCE;
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            callbacks.onSduiBottomSheetPresented(sduiAlert.sheetListener(childFragmentManager, this.this$0.getMarkwon(), ((GenericAction.InfoAlert) action).getValue2().getAlert(), this, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$sduiCallbacks$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, (Function1<? super String, Unit>) ((2016 & 32) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SduiAlert.sheetListener$lambda$16((String) obj2);
                }
            } : null), (Function1<? super String, Unit>) ((2016 & 64) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SduiAlert.sheetListener$lambda$17((String) obj2);
                }
            } : null), (2016 & 128) != 0 ? false : false, (2016 & 256) != 0 ? false : this.this$0.bottomSheetAchromatic, (2016 & 512) != 0, (2016 & 1024) != 0 ? null : null));
            return true;
        }
        if (action instanceof GenericAction.Deeplink) {
            Navigator navigator = this.this$0.getNavigator();
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
            return true;
        }
        if (action instanceof GenericAction.Dismiss) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
