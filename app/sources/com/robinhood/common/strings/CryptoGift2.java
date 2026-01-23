package com.robinhood.common.strings;

import com.robinhood.models.api.bonfire.cryptogifting.CryptoGiftStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoGift.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/models/api/bonfire/cryptogifting/CryptoGiftStatus;", "getLabelResId", "(Lcom/robinhood/models/api/bonfire/cryptogifting/CryptoGiftStatus;)I", "lib-common-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.common.strings.CryptoGiftKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class CryptoGift2 {

    /* compiled from: CryptoGift.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.common.strings.CryptoGiftKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoGiftStatus.values().length];
            try {
                iArr[CryptoGiftStatus.CLAIMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoGiftStatus.CLAIMABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoGiftStatus.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoGiftStatus.CANCELED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CryptoGiftStatus.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CryptoGiftStatus.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getLabelResId(CryptoGiftStatus cryptoGiftStatus) {
        Intrinsics.checkNotNullParameter(cryptoGiftStatus, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[cryptoGiftStatus.ordinal()]) {
            case 1:
                return C32428R.string.crypto_gift_state_claimed;
            case 2:
                return C32428R.string.crypto_gift_state_claimable;
            case 3:
                return C32428R.string.crypto_gift_state_expired;
            case 4:
                return C32428R.string.crypto_gift_state_canceled;
            case 5:
                return C32428R.string.crypto_gift_state_failed;
            case 6:
                return C32428R.string.crypto_gift_state_canceled;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
