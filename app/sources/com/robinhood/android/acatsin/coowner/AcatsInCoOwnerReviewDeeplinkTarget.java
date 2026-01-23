package com.robinhood.android.acatsin.coowner;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.AcatsRegionGate;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInCoOwnerReviewDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerReviewDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "SOURCE_UNKNOWN", "", "SOURCE_TRANSFER_DETAIL", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInCoOwnerReviewDeeplinkTarget extends DeeplinkTarget4 {
    private static final String SOURCE_TRANSFER_DETAIL = "transfer_detail";
    private static final String SOURCE_UNKNOWN = "unknown";
    public static final AcatsInCoOwnerReviewDeeplinkTarget INSTANCE = new AcatsInCoOwnerReviewDeeplinkTarget();
    public static final int $stable = 8;

    private AcatsInCoOwnerReviewDeeplinkTarget() {
        super("acats_co_owner_confirmation", SetsKt.setOf((Object[]) new RegionGate[]{JointAccountsRegionGate.INSTANCE, AcatsRegionGate.INSTANCE}), null, false, 12, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("acats_id");
        UUID uuid = null;
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
            }
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter2 == null) {
            queryParameter2 = "unknown";
        }
        boolean zAreEqual = Intrinsics.areEqual(queryParameter2, SOURCE_TRANSFER_DETAIL);
        if (uuid != null) {
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new AcatsInCoOwnerIntentKey(uuid, queryParameter2, zAreEqual), null, false, 12, null)};
        }
        return new Intent[]{deeplinkContext.getMainIntent()};
    }
}
