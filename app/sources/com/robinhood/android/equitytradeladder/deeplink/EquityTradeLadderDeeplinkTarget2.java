package com.robinhood.android.equitytradeladder.deeplink;

import com.robinhood.android.navigation.DeepLinkOrigin;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"DEFAULT_INSTRUMENT", "", "DEFAULT_SOURCE", "toSourceString", "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.deeplink.EquityTradeLadderDeeplinkTargetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityTradeLadderDeeplinkTarget2 {
    private static final String DEFAULT_INSTRUMENT = "8f92e76f-1e0e-4478-8580-16a6ffcfaef5";
    private static final String DEFAULT_SOURCE = "deeplink";

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toSourceString(DeepLinkOrigin deepLinkOrigin) {
        if (Intrinsics.areEqual(deepLinkOrigin, DeepLinkOrigin.AppLink.INSTANCE)) {
            return "Applink";
        }
        if (Intrinsics.areEqual(deepLinkOrigin, DeepLinkOrigin.External.INSTANCE)) {
            return "External";
        }
        if (Intrinsics.areEqual(deepLinkOrigin, DeepLinkOrigin.Internal.INSTANCE)) {
            return "Internal";
        }
        if (deepLinkOrigin instanceof DeepLinkOrigin.Notification) {
            return "Notification";
        }
        throw new NoWhenBranchMatchedException();
    }
}
