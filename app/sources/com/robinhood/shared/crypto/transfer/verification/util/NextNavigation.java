package com.robinhood.shared.crypto.transfer.verification.util;

import android.content.res.Resources;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.shared.crypto.transfer.verification.VerificationNavigationDestinations2;
import com.robinhood.shared.crypto.transfer.verification.VerificationNavigationDestinations3;
import com.robinhood.shared.crypto.transfer.verification.VerificationNavigationDestinations4;
import com.robinhood.shared.crypto.transfer.verification.VerificationNavigationDestinations5;
import com.robinhood.shared.crypto.transfer.verification.VerificationNavigationDestinations6;
import com.robinhood.shared.crypto.transfer.verification.VerificationNavigationDestinations8;
import com.robinhood.shared.crypto.transfer.verification.VerificationNavigationDestinations9;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NextNavigation.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¨\u0006\b"}, m3636d2 = {"handleNext", "", "navigator", "Lcom/robinhood/android/navigation/compose/LifecycleAwareNavigator;", "next", "Lcom/robinhood/models/api/transfer/verification/ApiCryptoVerificationResponse;", "onVerificationCompleted", "Lkotlin/Function0;", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.verification.util.NextNavigationKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class NextNavigation {
    public static final void handleNext(LifecycleAwareNavigator navigator, ApiCryptoVerificationResponse next, Function0<Unit> onVerificationCompleted) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(onVerificationCompleted, "onVerificationCompleted");
        if (next instanceof ApiCryptoVerificationResponse.CheckIfHosted) {
            LifecycleAwareNavigator.navigate$default(navigator, VerificationNavigationDestinations8.INSTANCE, ((ApiCryptoVerificationResponse.CheckIfHosted) next).getNextStepData(), null, null, false, null, 60, null);
            return;
        }
        if (next instanceof ApiCryptoVerificationResponse.BeneficiaryDetails) {
            LifecycleAwareNavigator.navigate$default(navigator, VerificationNavigationDestinations2.INSTANCE, null, null, false, null, 30, null);
            return;
        }
        if (next instanceof ApiCryptoVerificationResponse.ExchangeSelection) {
            LifecycleAwareNavigator.navigate$default(navigator, VerificationNavigationDestinations6.INSTANCE, null, null, false, null, 30, null);
            return;
        }
        if (next instanceof ApiCryptoVerificationResponse.VerificationCompleted) {
            onVerificationCompleted.invoke();
            return;
        }
        if (next instanceof ApiCryptoVerificationResponse.WalletVerification) {
            LifecycleAwareNavigator.navigate$default(navigator, VerificationNavigationDestinations9.INSTANCE, null, null, false, null, 30, null);
            return;
        }
        if (next instanceof ApiCryptoVerificationResponse.DepositResultPending) {
            LifecycleAwareNavigator.navigate$default(navigator, VerificationNavigationDestinations5.INSTANCE, ((ApiCryptoVerificationResponse.DepositResultPending) next).getNext(), null, null, false, null, 60, null);
        } else if (next instanceof ApiCryptoVerificationResponse.DepositResultBlockAndRefund) {
            LifecycleAwareNavigator.navigate$default(navigator, VerificationNavigationDestinations3.INSTANCE, ((ApiCryptoVerificationResponse.DepositResultBlockAndRefund) next).getNext(), null, null, false, null, 60, null);
        } else {
            if (!(next instanceof ApiCryptoVerificationResponse.DepositResultContactSupport)) {
                throw new NoWhenBranchMatchedException();
            }
            LifecycleAwareNavigator.navigate$default(navigator, VerificationNavigationDestinations4.INSTANCE, ((ApiCryptoVerificationResponse.DepositResultContactSupport) next).getNext(), null, null, false, null, 60, null);
        }
    }
}
