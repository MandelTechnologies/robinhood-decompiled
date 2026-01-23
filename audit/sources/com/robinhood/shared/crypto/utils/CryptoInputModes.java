package com.robinhood.shared.crypto.utils;

import com.robinhood.shared.formats.crypto.CryptoInputMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.nummus.order.InputModeDto;

/* compiled from: CryptoInputModes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"dto", "Lrosetta/nummus/order/InputModeDto;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getDto", "(Lcom/robinhood/shared/formats/crypto/CryptoInputMode;)Lrosetta/nummus/order/InputModeDto;", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.utils.CryptoInputModesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoInputModes {

    /* compiled from: CryptoInputModes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.utils.CryptoInputModesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoInputMode.values().length];
            try {
                iArr[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final InputModeDto getDto(CryptoInputMode cryptoInputMode) {
        Intrinsics.checkNotNullParameter(cryptoInputMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoInputMode.ordinal()];
        if (i == 1) {
            return InputModeDto.INPUT_MODE_QUOTE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return InputModeDto.INPUT_MODE_ASSET;
    }
}
