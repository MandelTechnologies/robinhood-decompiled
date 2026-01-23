package com.robinhood.android.margin.p174ui.instant;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstantUpgradeRetirementSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class InstantUpgradeRetirementSplashFragment2<ActionT> implements SduiActionHandler {
    final /* synthetic */ InstantUpgradeRetirementSplashFragment this$0;

    InstantUpgradeRetirementSplashFragment2(InstantUpgradeRetirementSplashFragment instantUpgradeRetirementSplashFragment) {
        this.this$0 = instantUpgradeRetirementSplashFragment;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
    public final boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.InfoAlert) {
            InstantUpgradeRetirementSplashFragment instantUpgradeRetirementSplashFragment = this.this$0;
            SduiAlert sduiAlert = SduiAlert.INSTANCE;
            FragmentManager childFragmentManager = instantUpgradeRetirementSplashFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            instantUpgradeRetirementSplashFragment.setSheetListener(sduiAlert.sheetListener(childFragmentManager, this.this$0.getMarkwon(), ((GenericAction.InfoAlert) action).getValue2().getAlert(), new SduiActionHandler() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment$ComposeContent$1$1.1
                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                public final boolean mo15941handle(GenericAction it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
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
            } : null), (2016 & 128) != 0 ? false : false, (2016 & 256) != 0 ? false : true, (2016 & 512) != 0, (2016 & 1024) != 0 ? null : null));
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
