package com.robinhood.android.deeplink.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: Targets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/StocksDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class StocksDeeplinkTarget extends DeeplinkTarget4 {
    public static final StocksDeeplinkTarget INSTANCE = new StocksDeeplinkTarget();
    public static final int $stable = 8;

    private StocksDeeplinkTarget() {
        super(DeepLinkPath.STOCKS.getPath(), false, true, false, true, false, null, 98, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        String strQueryParameter;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String lastPathSegment = deeplinkContext.getUri().getLastPathSegment();
        Intrinsics.checkNotNull(lastPathSegment);
        UUID uuid = null;
        if (StringsKt.contains$default((CharSequence) lastPathSegment, '(', false, 2, (Object) null)) {
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) lastPathSegment, '(', 0, false, 6, (Object) null) + 1;
            int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) lastPathSegment, ')', 0, false, 6, (Object) null);
            if (iIndexOf$default2 > iIndexOf$default) {
                String strSubstring = lastPathSegment.substring(iIndexOf$default, iIndexOf$default2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new LegacyFragmentKey.EquityInstrumentDetail(com.robinhood.utils.extensions.StringsKt.toUuid(strSubstring), null, null, InstrumentDetailSource.DEEPLINK_STOCKS, false, 22, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null)};
            }
            return deeplinkContext.handleMalformedUri(deeplinkContext.getUri());
        }
        Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new LegacyFragmentKey.EquityInstrumentDetail(lastPathSegment, InstrumentDetailSource.DEEPLINK_STOCKS, (String) null, 4, (DefaultConstructorMarker) null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
        String queryParameter = deeplinkContext.getUri().getQueryParameter("applink");
        if (queryParameter != null) {
            HttpUrl httpUrl = HttpUrl.INSTANCE.parse("http://" + queryParameter);
            if (httpUrl != null && (strQueryParameter = httpUrl.queryParameter("id")) != null) {
                try {
                    uuid = com.robinhood.utils.extensions.StringsKt.toUuid(strQueryParameter);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        if (uuid != null) {
            return new Intent[]{intentCreateIntentForFragment$default, Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new LegacyIntentKey.DirectIpoAllocation.SharedOrder(uuid), null, false, 12, null)};
        }
        return new Intent[]{intentCreateIntentForFragment$default};
    }
}
