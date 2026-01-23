package com.robinhood.android.trade.options.targets;

import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.utils.extensions.StringsKt;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionOrderTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/options/targets/OptionOpenPositionDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.targets.OptionOpenPositionDeeplinkTarget, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderTargets3 extends DeeplinkTarget4 {
    public static final OptionOrderTargets3 INSTANCE = new OptionOrderTargets3();
    public static final int $stable = 8;

    private OptionOrderTargets3() {
        super("option_position_open", false, false, false, false, false, null, 118, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        UUID uuid2;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Uri uri = deeplinkContext.getUri();
        String queryParameter = uri.getQueryParameter("id");
        OptionOrderFormSource optionOrderFormSourceValueOf = null;
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            uuid2 = uuid;
        } else {
            uuid2 = null;
        }
        String queryParameter2 = uri.getQueryParameter("account_number");
        String queryParameter3 = uri.getQueryParameter("source");
        if (queryParameter3 != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = queryParameter3.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase != null) {
                optionOrderFormSourceValueOf = OptionOrderFormSource.valueOf(upperCase);
            }
        }
        OptionOrderFormSource optionOrderFormSource = optionOrderFormSourceValueOf;
        if (queryParameter2 == null || uuid2 == null) {
            return new Intent[]{deeplinkContext.getMainIntent()};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new OptionOrderIntentKey.FromAggregatePosition(uuid2, queryParameter2, OrderPositionEffect.OPEN, optionOrderFormSource, OptionOrderIntentKey.TRANSITION_REASON_SWIPE_TO_TRADE), null, false, 12, null)};
    }
}
