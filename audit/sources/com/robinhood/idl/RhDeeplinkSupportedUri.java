package com.robinhood.idl;

import android.net.Uri;
import com.robinhood.libtradingtrends.contracts.TradingTrendsType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RhDeeplinkSupportedUri.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "", "uriString", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", TradingTrendsType.ROBINHOOD, "ROBINHOOD_GLOBAL", "ROBINHOOD_WALLET", "HTTPS_ROBINHOOD_APPLINK", "HTTPS_WWW_ROBINHOOD_APPLINK", "HTTPS_APPLINK_ROBINHOOD", "HTTPS_WALLET_ROBINHOOD_NCW", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class RhDeeplinkSupportedUri {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RhDeeplinkSupportedUri[] $VALUES;
    private final Uri uri;
    public static final RhDeeplinkSupportedUri ROBINHOOD = new RhDeeplinkSupportedUri(TradingTrendsType.ROBINHOOD, 0, "robinhood://");
    public static final RhDeeplinkSupportedUri ROBINHOOD_GLOBAL = new RhDeeplinkSupportedUri("ROBINHOOD_GLOBAL", 1, "robinhood-global://");
    public static final RhDeeplinkSupportedUri ROBINHOOD_WALLET = new RhDeeplinkSupportedUri("ROBINHOOD_WALLET", 2, "robinhood-wallet://");
    public static final RhDeeplinkSupportedUri HTTPS_ROBINHOOD_APPLINK = new RhDeeplinkSupportedUri("HTTPS_ROBINHOOD_APPLINK", 3, "https://robinhood.com/applink/");
    public static final RhDeeplinkSupportedUri HTTPS_WWW_ROBINHOOD_APPLINK = new RhDeeplinkSupportedUri("HTTPS_WWW_ROBINHOOD_APPLINK", 4, "https://www.robinhood.com/applink/");
    public static final RhDeeplinkSupportedUri HTTPS_APPLINK_ROBINHOOD = new RhDeeplinkSupportedUri("HTTPS_APPLINK_ROBINHOOD", 5, "https://applink.robinhood.com/");
    public static final RhDeeplinkSupportedUri HTTPS_WALLET_ROBINHOOD_NCW = new RhDeeplinkSupportedUri("HTTPS_WALLET_ROBINHOOD_NCW", 6, "https://wallet.robinhood.com/ncw/");

    private static final /* synthetic */ RhDeeplinkSupportedUri[] $values() {
        return new RhDeeplinkSupportedUri[]{ROBINHOOD, ROBINHOOD_GLOBAL, ROBINHOOD_WALLET, HTTPS_ROBINHOOD_APPLINK, HTTPS_WWW_ROBINHOOD_APPLINK, HTTPS_APPLINK_ROBINHOOD, HTTPS_WALLET_ROBINHOOD_NCW};
    }

    public static EnumEntries<RhDeeplinkSupportedUri> getEntries() {
        return $ENTRIES;
    }

    private RhDeeplinkSupportedUri(String str, int i, String str2) {
        this.uri = Uri.parse(str2);
    }

    static {
        RhDeeplinkSupportedUri[] rhDeeplinkSupportedUriArr$values = $values();
        $VALUES = rhDeeplinkSupportedUriArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rhDeeplinkSupportedUriArr$values);
    }

    public final Uri getUri() {
        return this.uri;
    }

    public static RhDeeplinkSupportedUri valueOf(String str) {
        return (RhDeeplinkSupportedUri) Enum.valueOf(RhDeeplinkSupportedUri.class, str);
    }

    public static RhDeeplinkSupportedUri[] values() {
        return (RhDeeplinkSupportedUri[]) $VALUES.clone();
    }
}
