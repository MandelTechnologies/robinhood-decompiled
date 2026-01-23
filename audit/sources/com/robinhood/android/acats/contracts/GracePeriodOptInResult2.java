package com.robinhood.android.acats.contracts;

import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GracePeriodOptInResult.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/acats/contracts/GracePeriodOptInContract;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract;", "Lcom/robinhood/android/acats/contracts/ClawbackGracePeriod;", "Lcom/robinhood/android/acats/contracts/GracePeriodOptInResult;", "navigatorDelegate", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.contracts.GracePeriodOptInContract, reason: use source file name */
/* loaded from: classes24.dex */
public final class GracePeriodOptInResult2 extends NavigationActivityResultContract<ClawbackGracePeriod, GracePeriodOptInResult> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GracePeriodOptInResult2(Function0<? extends Navigator> navigatorDelegate) {
        super(navigatorDelegate);
        Intrinsics.checkNotNullParameter(navigatorDelegate, "navigatorDelegate");
    }
}
