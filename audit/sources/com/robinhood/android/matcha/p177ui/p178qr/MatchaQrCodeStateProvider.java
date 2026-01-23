package com.robinhood.android.matcha.p177ui.p178qr;

import android.graphics.Bitmap;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.identi.OptOutConsentType;
import com.robinhood.models.p320db.matcha.EncryptedUserId;
import com.robinhood.models.p320db.sheriff.User;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaQrCodeStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeDataState;", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeViewState;", "<init>", "()V", "reduce", "dataState", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaQrCodeStateProvider implements StateProvider<MatchaQrCodeDataState, MatchaQrCodeViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public MatchaQrCodeViewState reduce(MatchaQrCodeDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        User user = dataState.getUser();
        EncryptedUserId encryptedUserId = dataState.getEncryptedUserId();
        String profileDeepLink = encryptedUserId != null ? MatchaQrCodeDuxo6.getProfileDeepLink(encryptedUserId) : null;
        Bitmap qrCodeBitmap = dataState.getQrCodeBitmap();
        Map<OptOutConsentType, Boolean> discoverability = dataState.getDiscoverability();
        OptOutConsentType optOutConsentType = OptOutConsentType.STICKER_DISCOVERABILITY_CONSENT;
        Boolean bool = Boolean.FALSE;
        return new MatchaQrCodeViewState(user, profileDeepLink, qrCodeBitmap, discoverability.getOrDefault(optOutConsentType, bool).booleanValue() && dataState.getDiscoverability().getOrDefault(OptOutConsentType.PHONE_DISCOVERABILITY_CONSENT, bool).booleanValue() && dataState.getDiscoverability().getOrDefault(OptOutConsentType.EMAIL_DISCOVERABILITY_CONSENT, bool).booleanValue());
    }
}
