package com.robinhood.shared.remote.assets;

import com.robinhood.targetbackend.Endpoint;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import okhttp3.HttpUrl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SvgUrl.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/remote/assets/SvgUrl;", "", "pathSegments", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ALERT", "CHECKMARK_SUCCESS_DARK", "CROSS_ERROR_DARK", "MORE_DOCUMENTATION", "HOURGLASS", "PHONE", "UNSUPPORTED_REGION", "url", "Lokhttp3/HttpUrl;", "getUrl", "()Lokhttp3/HttpUrl;", "lib-remote-assets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SvgUrl {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SvgUrl[] $VALUES;
    private final HttpUrl url;
    public static final SvgUrl ALERT = new SvgUrl("ALERT", 0, "common/alert.svg");
    public static final SvgUrl CHECKMARK_SUCCESS_DARK = new SvgUrl("CHECKMARK_SUCCESS_DARK", 1, "common/checkmark_success_dark.svg");
    public static final SvgUrl CROSS_ERROR_DARK = new SvgUrl("CROSS_ERROR_DARK", 2, "common/cross_error_dark.svg");
    public static final SvgUrl MORE_DOCUMENTATION = new SvgUrl("MORE_DOCUMENTATION", 3, "crypto/more_documentation.svg");
    public static final SvgUrl HOURGLASS = new SvgUrl("HOURGLASS", 4, "crypto/hourglass.svg");
    public static final SvgUrl PHONE = new SvgUrl("PHONE", 5, "security/phone.svg");
    public static final SvgUrl UNSUPPORTED_REGION = new SvgUrl("UNSUPPORTED_REGION", 6, "onboarding/region_selector/unsupported_region.svg");

    private static final /* synthetic */ SvgUrl[] $values() {
        return new SvgUrl[]{ALERT, CHECKMARK_SUCCESS_DARK, CROSS_ERROR_DARK, MORE_DOCUMENTATION, HOURGLASS, PHONE, UNSUPPORTED_REGION};
    }

    public static EnumEntries<SvgUrl> getEntries() {
        return $ENTRIES;
    }

    private SvgUrl(String str, int i, String str2) {
        this.url = Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegments(str2).build();
    }

    static {
        SvgUrl[] svgUrlArr$values = $values();
        $VALUES = svgUrlArr$values;
        $ENTRIES = EnumEntries2.enumEntries(svgUrlArr$values);
    }

    public final HttpUrl getUrl() {
        return this.url;
    }

    public static SvgUrl valueOf(String str) {
        return (SvgUrl) Enum.valueOf(SvgUrl.class, str);
    }

    public static SvgUrl[] values() {
        return (SvgUrl[]) $VALUES.clone();
    }
}
