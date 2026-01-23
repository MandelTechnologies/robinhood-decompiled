package com.robinhood.android.wallet.upsell;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.hammer.android.EntryPoints;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.LongPreference;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import p479j$.time.Clock;

/* compiled from: WalletUpsellUtil.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/wallet/upsell/WalletUpsellUtil;", "", "<init>", "()V", "resolveWalletDeeplink", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "WalletUpsellDeeplinkEntryPoint", "feature-wallet-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WalletUpsellUtil {
    public static final WalletUpsellUtil INSTANCE = new WalletUpsellUtil();

    /* compiled from: WalletUpsellUtil.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/wallet/upsell/WalletUpsellUtil$WalletUpsellDeeplinkEntryPoint;", "", "j$/time/Clock", "getClock", "()Lj$/time/Clock;", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "getLastSeenWalletUpsellTimePref", "()Lcom/robinhood/prefs/LongPreference;", "lastSeenWalletUpsellTimePref", "feature-wallet-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface WalletUpsellDeeplinkEntryPoint {
        Clock getClock();

        @LastSeenWalletUpsellTimePref
        LongPreference getLastSeenWalletUpsellTimePref();
    }

    private WalletUpsellUtil() {
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public final Intent[] resolveWalletDeeplink(DeeplinkTarget2 deeplinkContext) throws UnsupportedEncodingException {
        Long longOrNull;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("url");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("touchpoint");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("upsellTimeInterval");
        long jLongValue = (queryParameter3 == null || (longOrNull = StringsKt.toLongOrNull(queryParameter3)) == null) ? 2592000L : longOrNull.longValue();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(queryParameter));
        boolean z = intent.resolveActivity(deeplinkContext.getContext().getPackageManager()) != null;
        WalletUpsellDeeplinkEntryPoint walletUpsellDeeplinkEntryPoint = (WalletUpsellDeeplinkEntryPoint) EntryPoints.applicationEntryPoint(deeplinkContext.getContext());
        LongPreference lastSeenWalletUpsellTimePref = walletUpsellDeeplinkEntryPoint.getLastSeenWalletUpsellTimePref();
        Long orNull = lastSeenWalletUpsellTimePref.getOrNull();
        long jLongValue2 = orNull != null ? orNull.longValue() : 0L;
        long epochSecond = walletUpsellDeeplinkEntryPoint.getClock().instant().getEpochSecond();
        boolean z2 = epochSecond - jLongValue2 > jLongValue;
        if (!z || z2) {
            lastSeenWalletUpsellTimePref.set(epochSecond);
            Charset charset = Charsets.UTF_8;
            String strEncode = URLEncoder.encode("robinhood://app_crypto_explainers?type=rhw_upsell&touchpoint=" + queryParameter2 + "&has_rhw=" + z + "&rhw_deeplink=" + URLEncoder.encode(queryParameter, charset.name()), charset.name());
            intent = new Intent("android.intent.action.VIEW");
            StringBuilder sb = new StringBuilder();
            sb.append("robinhood://microgram_launch?id=app-crypto-explainers&deeplink=");
            sb.append(strEncode);
            sb.append("&theme=crypto");
            intent.setData(Uri.parse(sb.toString()));
            Unit unit = Unit.INSTANCE;
        }
        return new Intent[]{intent};
    }
}
