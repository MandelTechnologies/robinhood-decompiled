package com.robinhood.android.futures.detail;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesDetailDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/FuturesDetailDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesDetailDeeplinkTarget extends DeeplinkTarget4 {
    public static final FuturesDetailDeeplinkTarget INSTANCE = new FuturesDetailDeeplinkTarget();
    public static final int $stable = 8;

    private FuturesDetailDeeplinkTarget() {
        super("futures", (RegionGate) FuturesTradingRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        UUID uuid2 = null;
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
            }
        } else {
            uuid = null;
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("product_id");
        if (queryParameter2 != null) {
            try {
                uuid2 = StringsKt.toUuid(queryParameter2);
            } catch (IllegalArgumentException unused2) {
            }
        }
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("entry_point");
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("show_in_tab");
        boolean z = queryParameter4 != null ? Boolean.parseBoolean(queryParameter4) : true;
        if (uuid != null) {
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new FuturesDetailFragmentKey.ByContractId(uuid, new Screen(Screen.Name.NAME_UNSPECIFIED, null, queryParameter3 == null ? "" : queryParameter3, null, 10, null), queryParameter3), false, z, false, null, false, false, false, false, false, null, false, 8180, null)};
        }
        if (uuid2 != null) {
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new FuturesDetailFragmentKey.ByProductId(uuid2, new Screen(Screen.Name.NAME_UNSPECIFIED, null, queryParameter3 == null ? "" : queryParameter3, null, 10, null), queryParameter3), false, z, false, null, false, false, false, false, false, null, false, 8180, null)};
        }
        return new Intent[0];
    }
}
