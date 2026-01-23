package com.robinhood.shared.crypto.chips;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoChipsComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/chips/CryptoChipsStyle;", "", "logoStartPadding", "Landroidx/compose/ui/unit/Dp;", "logoSize", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLogoStartPadding-D9Ej5fM", "()F", "F", "getLogoSize-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/robinhood/shared/crypto/chips/CryptoChipsStyle;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-crypto-chips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoChipsStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float logoSize;
    private final float logoStartPadding;

    public /* synthetic */ CryptoChipsStyle(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ CryptoChipsStyle m24907copyYgX7TsA$default(CryptoChipsStyle cryptoChipsStyle, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = cryptoChipsStyle.logoStartPadding;
        }
        if ((i & 2) != 0) {
            f2 = cryptoChipsStyle.logoSize;
        }
        return cryptoChipsStyle.m24910copyYgX7TsA(f, f2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLogoStartPadding() {
        return this.logoStartPadding;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLogoSize() {
        return this.logoSize;
    }

    /* renamed from: copy-YgX7TsA, reason: not valid java name */
    public final CryptoChipsStyle m24910copyYgX7TsA(float logoStartPadding, float logoSize) {
        return new CryptoChipsStyle(logoStartPadding, logoSize, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoChipsStyle)) {
            return false;
        }
        CryptoChipsStyle cryptoChipsStyle = (CryptoChipsStyle) other;
        return C2002Dp.m7997equalsimpl0(this.logoStartPadding, cryptoChipsStyle.logoStartPadding) && C2002Dp.m7997equalsimpl0(this.logoSize, cryptoChipsStyle.logoSize);
    }

    public int hashCode() {
        return (C2002Dp.m7998hashCodeimpl(this.logoStartPadding) * 31) + C2002Dp.m7998hashCodeimpl(this.logoSize);
    }

    public String toString() {
        return "CryptoChipsStyle(logoStartPadding=" + C2002Dp.m7999toStringimpl(this.logoStartPadding) + ", logoSize=" + C2002Dp.m7999toStringimpl(this.logoSize) + ")";
    }

    private CryptoChipsStyle(float f, float f2) {
        this.logoStartPadding = f;
        this.logoSize = f2;
    }

    /* renamed from: getLogoStartPadding-D9Ej5fM, reason: not valid java name */
    public final float m24912getLogoStartPaddingD9Ej5fM() {
        return this.logoStartPadding;
    }

    /* renamed from: getLogoSize-D9Ej5fM, reason: not valid java name */
    public final float m24911getLogoSizeD9Ej5fM() {
        return this.logoSize;
    }

    /* compiled from: CryptoChipsComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/chips/CryptoChipsStyle$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/shared/crypto/chips/CryptoChipsStyle;", "getDefault", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/shared/crypto/chips/CryptoChipsStyle;", "lib-crypto-chips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmName
        public final CryptoChipsStyle getDefault(Composer composer, int i) {
            composer.startReplaceGroup(1838647650);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1838647650, i, -1, "com.robinhood.shared.crypto.chips.CryptoChipsStyle.Companion.<get-default> (CryptoChipsComposable.kt:92)");
            }
            CryptoChipsStyle cryptoChipsStyle = new CryptoChipsStyle(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(16), null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return cryptoChipsStyle;
        }
    }
}
