package com.robinhood.android.fundingmethods;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.models.retirement.api.RetirementFundingMethod;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;

/* compiled from: RetirementFundingMethodsScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsScreenCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onFundingMethodSelected", "", "selectedMethod", "Lcom/robinhood/android/models/retirement/api/RetirementFundingMethod;", "feature-retirement-funding-methods_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.fundingmethods.RetirementFundingMethodsScreenCallbacks, reason: use source file name */
/* loaded from: classes3.dex */
public interface RetirementFundingMethodsScreen3 extends SduiActionHandler<GenericAction> {
    void onFundingMethodSelected(RetirementFundingMethod selectedMethod);
}
