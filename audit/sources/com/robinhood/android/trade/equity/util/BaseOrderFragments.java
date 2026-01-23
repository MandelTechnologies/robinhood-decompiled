package com.robinhood.android.trade.equity.util;

import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.sduiinfosheet.SduiInfoSheetFragment;
import com.robinhood.models.serverdriven.experimental.api.InfoSheetAction;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseOrderFragments.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¨\u0006\t"}, m3636d2 = {"consumeAdtOnboardingEvent", "", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "sheetId", "", "convertToLimitOrder", "Lkotlin/Function0;", "onDismiss", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.util.BaseOrderFragmentsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class BaseOrderFragments {
    public static final void consumeAdtOnboardingEvent(BaseOrderFragment<DefaultOrderState> baseOrderFragment, String sheetId, final Function0<Unit> convertToLimitOrder, final Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(baseOrderFragment, "<this>");
        Intrinsics.checkNotNullParameter(sheetId, "sheetId");
        Intrinsics.checkNotNullParameter(convertToLimitOrder, "convertToLimitOrder");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        SduiInfoSheetFragment onDismissAction = ((SduiInfoSheetFragment) SduiInfoSheetFragment.INSTANCE.newInstance((Parcelable) new SduiInfoSheetKey("", sheetId, null, new Screen(Screen.Name.EQUITY_24H_MARKET_REMINDER, null, null, null, 14, null), 4, null))).setActionHandler(new SduiActionHandler() { // from class: com.robinhood.android.trade.equity.util.BaseOrderFragmentsKt.consumeAdtOnboardingEvent.1
            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
            public final boolean mo15941handle(InfoSheetAction it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof InfoSheetAction.ConvertToLimitOrder)) {
                    return false;
                }
                convertToLimitOrder.invoke();
                return true;
            }
        }).setOnDismissAction(new Function0() { // from class: com.robinhood.android.trade.equity.util.BaseOrderFragmentsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseOrderFragments.consumeAdtOnboardingEvent$lambda$0(onDismiss);
            }
        });
        FragmentManager childFragmentManager = baseOrderFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        onDismissAction.show(childFragmentManager, "adtOnboardingBottomSheet-" + sheetId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit consumeAdtOnboardingEvent$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
