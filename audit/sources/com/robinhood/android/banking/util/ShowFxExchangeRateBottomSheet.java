package com.robinhood.android.banking.util;

import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShowFxExchangeRateBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"showFxExchangeRateBottomSheet", "", "Lcom/robinhood/android/common/ui/BaseFragment;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "componentLoggingIdentifier", "", "fxInfoSheetId", "feature-lib-banking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.banking.util.ShowFxExchangeRateBottomSheetKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ShowFxExchangeRateBottomSheet {
    private static final String componentLoggingIdentifier = "fx_rate_notification";
    private static final String fxInfoSheetId = "foreign_currency_conversion_rate_details";

    public static /* synthetic */ void showFxExchangeRateBottomSheet$default(BaseFragment baseFragment, Screen screen, int i, Object obj) {
        if ((i & 1) != 0) {
            screen = new Screen(null, null, null, null, 15, null);
        }
        showFxExchangeRateBottomSheet(baseFragment, screen);
    }

    public static final void showFxExchangeRateBottomSheet(BaseFragment baseFragment, Screen screen) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Navigator.DefaultImpls.createDialogFragment$default(baseFragment.getNavigator(), new SduiInfoSheetKey(componentLoggingIdentifier, fxInfoSheetId, null, screen, 4, null), null, 2, null).show(baseFragment.getChildFragmentManager(), fxInfoSheetId);
    }
}
