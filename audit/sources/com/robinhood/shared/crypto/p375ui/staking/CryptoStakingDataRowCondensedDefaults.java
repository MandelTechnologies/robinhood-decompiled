package com.robinhood.shared.crypto.p375ui.staking;

import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiCryptoStakingDataRowCondensed.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/staking/CryptoStakingDataRowCondensedDefaults;", "", "<init>", "()V", "condensedMinHeight", "Landroidx/compose/ui/unit/Dp;", "getCondensedMinHeight-D9Ej5fM", "()F", "F", "condensedVerticalPadding", "getCondensedVerticalPadding-D9Ej5fM", "fallbackThemedColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "getFallbackThemedColor", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "fallbackStyle", "Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;", "getFallbackStyle", "()Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoStakingDataRowCondensedDefaults {
    public static final int $stable;
    public static final CryptoStakingDataRowCondensedDefaults INSTANCE = new CryptoStakingDataRowCondensedDefaults();
    private static final float condensedMinHeight = C2002Dp.m7995constructorimpl(56);
    private static final float condensedVerticalPadding = C2002Dp.m7995constructorimpl(16);
    private static final TextStyle fallbackStyle;
    private static final ThemedColor fallbackThemedColor;

    static {
        Color color = Color.f5853FG;
        fallbackThemedColor = new ThemedColor(color, color);
        fallbackStyle = TextStyle.TEXT_MEDIUM;
        $stable = 8;
    }

    private CryptoStakingDataRowCondensedDefaults() {
    }

    /* renamed from: getCondensedMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m25236getCondensedMinHeightD9Ej5fM() {
        return condensedMinHeight;
    }

    /* renamed from: getCondensedVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m25237getCondensedVerticalPaddingD9Ej5fM() {
        return condensedVerticalPadding;
    }

    public final ThemedColor getFallbackThemedColor() {
        return fallbackThemedColor;
    }

    public final TextStyle getFallbackStyle() {
        return fallbackStyle;
    }
}
