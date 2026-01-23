package com.robinhood.android.deeplink.resolver.restricted;

import com.robinhood.android.deeplink.BaseDeepLinkPath;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RestrictedDeepLinkPath.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/restricted/RestrictedDeepLinkPath;", "Lcom/robinhood/android/deeplink/BaseDeepLinkPath;", "", "path", "", "deprecated", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getPath", "()Ljava/lang/String;", "getDeprecated", "()Z", "ROOT", "CRYPTO_TRANSFER", "AUTHORIZE_WALLET", "Companion", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RestrictedDeepLinkPath implements BaseDeepLinkPath {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RestrictedDeepLinkPath[] $VALUES;
    public static final String SCHEME_ROBINHOOD_RESTRICTED = "robinhood-restricted";
    private final boolean deprecated;
    private final String path;
    public static final RestrictedDeepLinkPath ROOT = new RestrictedDeepLinkPath("ROOT", 0, "", false, 2, null);
    public static final RestrictedDeepLinkPath CRYPTO_TRANSFER = new RestrictedDeepLinkPath("CRYPTO_TRANSFER", 1, "crypto_transfer", false, 2, null);
    public static final RestrictedDeepLinkPath AUTHORIZE_WALLET = new RestrictedDeepLinkPath("AUTHORIZE_WALLET", 2, "authorize_wallet", false, 2, null);

    private static final /* synthetic */ RestrictedDeepLinkPath[] $values() {
        return new RestrictedDeepLinkPath[]{ROOT, CRYPTO_TRANSFER, AUTHORIZE_WALLET};
    }

    public static EnumEntries<RestrictedDeepLinkPath> getEntries() {
        return $ENTRIES;
    }

    private RestrictedDeepLinkPath(String str, int i, String str2, boolean z) {
        this.path = str2;
        this.deprecated = z;
    }

    /* synthetic */ RestrictedDeepLinkPath(String str, int i, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? false : z);
    }

    @Override // com.robinhood.android.deeplink.BaseDeepLinkPath
    public String getPath() {
        return this.path;
    }

    public final boolean getDeprecated() {
        return this.deprecated;
    }

    static {
        RestrictedDeepLinkPath[] restrictedDeepLinkPathArr$values = $values();
        $VALUES = restrictedDeepLinkPathArr$values;
        $ENTRIES = EnumEntries2.enumEntries(restrictedDeepLinkPathArr$values);
        INSTANCE = new Companion(null);
    }

    public static RestrictedDeepLinkPath valueOf(String str) {
        return (RestrictedDeepLinkPath) Enum.valueOf(RestrictedDeepLinkPath.class, str);
    }

    public static RestrictedDeepLinkPath[] values() {
        return (RestrictedDeepLinkPath[]) $VALUES.clone();
    }
}
