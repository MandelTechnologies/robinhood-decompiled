package com.robinhood.android.banking.p065ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.models.api.bonfire.paymentinstruments.UserStatusWithExternalProviders;
import com.robinhood.rosetta.converters.cash.PaymentInstruments2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.DcfKycContext;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardUserStatusBannerViewLogging.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"logBannerAppearance", "", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView;", "userStatusWithExternalProviders", "Lcom/robinhood/models/api/bonfire/paymentinstruments/UserStatusWithExternalProviders;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "feature-lib-banking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.banking.ui.DebitCardUserStatusBannerViewLoggingKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DebitCardUserStatusBannerViewLogging {
    public static final void logBannerAppearance(DebitCardUserStatusBannerView debitCardUserStatusBannerView, UserStatusWithExternalProviders userStatusWithExternalProviders, Screen.Name screenName) {
        Intrinsics.checkNotNullParameter(debitCardUserStatusBannerView, "<this>");
        Intrinsics.checkNotNullParameter(userStatusWithExternalProviders, "userStatusWithExternalProviders");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        if (debitCardUserStatusBannerView.isShown()) {
            EventLogger.DefaultImpls.logAppear$default(debitCardUserStatusBannerView.getEventLogger(), null, new Screen(screenName, null, null, null, 14, null), new Component(Component.ComponentType.DEBIT_CARD_KYC_BANNER, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new DcfKycContext(PaymentInstruments2.toProtobuf(userStatusWithExternalProviders), null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -8388609, -1, -1, -1, 16383, null), 9, null);
        }
    }
}
