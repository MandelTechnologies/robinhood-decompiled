package com.robinhood.android.retirement.taxbenefits.p238ui;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;

/* compiled from: RetirementTaxBenefitsScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onTaxBenefitsComplete", "", "onTaxBenefitsError", "throwable", "", "feature-retirement-tax-benefits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.taxbenefits.ui.RetirementTaxBenefitsCallbacks, reason: use source file name */
/* loaded from: classes5.dex */
public interface RetirementTaxBenefitsScreen4 extends SduiActionHandler<GenericAction> {
    void onTaxBenefitsComplete();

    void onTaxBenefitsError(Throwable throwable);
}
