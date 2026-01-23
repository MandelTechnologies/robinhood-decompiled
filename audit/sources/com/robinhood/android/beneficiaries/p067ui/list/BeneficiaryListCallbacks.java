package com.robinhood.android.beneficiaries.p067ui.list;

import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySplashViewModel;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: BeneficiaryListCallbacks.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListCallbacks;", "", "onAddBeneficiary", "", "accountNumber", "", "onBeneficiaryClicked", "beneficiaryId", "Ljava/util/UUID;", "onValuePropsClicked", "splashViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface BeneficiaryListCallbacks {
    void onAddBeneficiary(String accountNumber);

    void onBeneficiaryClicked(String accountNumber, UUID beneficiaryId);

    void onValuePropsClicked(ApiBeneficiarySplashViewModel splashViewModel);
}
