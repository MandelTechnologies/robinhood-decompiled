package com.robinhood.android.matcha.p177ui.p178qr;

import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.models.p320db.matcha.EncryptedUserId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaQrCodeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"profileDeepLink", "", "Lcom/robinhood/models/db/matcha/EncryptedUserId;", "getProfileDeepLink", "(Lcom/robinhood/models/db/matcha/EncryptedUserId;)Ljava/lang/String;", "USER_ID_KEY", "APPLINK_SCHEME", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxoKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaQrCodeDuxo6 {
    public static final String APPLINK_SCHEME = "https://applink.robinhood.com/u/";
    public static final String USER_ID_KEY = "user_id";

    public static final String getProfileDeepLink(EncryptedUserId encryptedUserId) {
        Intrinsics.checkNotNullParameter(encryptedUserId, "<this>");
        return APPLINK_SCHEME + DeepLinkPath.MATCHA_PROFILE.getPath() + "?user_id=" + encryptedUserId.getValue();
    }
}
