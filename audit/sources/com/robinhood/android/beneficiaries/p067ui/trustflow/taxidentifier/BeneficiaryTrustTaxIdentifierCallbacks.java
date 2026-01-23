package com.robinhood.android.beneficiaries.p067ui.trustflow.taxidentifier;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: BeneficiaryTrustTaxIdentifierCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierCallbacks;", "", "onTrustTaxIdentifierConfirmed", "", "onTrustTaxIdentifierInput", "keyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "string", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface BeneficiaryTrustTaxIdentifierCallbacks {
    void onTrustTaxIdentifierConfirmed();

    void onTrustTaxIdentifierInput(KeyEvent keyEvent);

    void onTrustTaxIdentifierInput(String string2);
}
