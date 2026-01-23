package com.robinhood.android.beneficiaries.extension;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fragments.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"showSduiAlertSheet", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "Lcom/robinhood/android/common/ui/BaseFragment;", "alertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "markwon", "Lio/noties/markwon/Markwon;", "feature-beneficiaries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.extension.FragmentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Fragments {
    public static final RhBottomSheetDialogFragmentHost.SheetListener showSduiAlertSheet(final BaseFragment baseFragment, GenericAlertContent<? extends GenericAction> alertContent, Markwon markwon) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(alertContent, "alertContent");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        SduiAlert sduiAlert = SduiAlert.INSTANCE;
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        return sduiAlert.sheetListener(childFragmentManager, markwon, alertContent, new SduiActionHandler2() { // from class: com.robinhood.android.beneficiaries.extension.FragmentsKt.showSduiAlertSheet.1
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
                return baseFragment.getNavigator();
            }

            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2
            public Context getContext() {
                Context contextRequireContext = baseFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                return contextRequireContext;
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.beneficiaries.extension.FragmentsKt$$ExternalSyntheticLambda0
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
        } : null), (2016 & 128) != 0 ? false : false, (2016 & 256) != 0 ? false : false, (2016 & 512) != 0, (2016 & 1024) != 0 ? null : null);
    }
}
