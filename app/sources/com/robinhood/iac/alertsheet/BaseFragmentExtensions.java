package com.robinhood.iac.alertsheet;

import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFragmentExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"displayIacAlertSheet", "", "Lcom/robinhood/android/common/ui/BaseFragment;", "iacAlertSheetData", "Lcom/robinhood/models/ui/IacAlertSheet;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "lib-iac-alert-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.iac.alertsheet.BaseFragmentExtensionsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BaseFragmentExtensions {
    public static final void displayIacAlertSheet(BaseFragment baseFragment, IacAlertSheet iacAlertSheetData, Screen eventScreen) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(iacAlertSheetData, "iacAlertSheetData");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        if (baseFragment.getChildFragmentManager().findFragmentByTag("iac_bottom_sheet") == null) {
            Navigator.DefaultImpls.createDialogFragment$default(baseFragment.getNavigator(), new LegacyDialogFragmentKey.IacAlertSheet(iacAlertSheetData, eventScreen.getName().getValue(), eventScreen.getIdentifier(), iacAlertSheetData.getLoggingIdentifier(), null, 16, null), null, 2, null).show(baseFragment.getChildFragmentManager(), "iac_bottom_sheet");
        }
    }
}
