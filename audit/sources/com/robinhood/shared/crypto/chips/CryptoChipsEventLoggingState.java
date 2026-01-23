package com.robinhood.shared.crypto.chips;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoChipsComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/chips/CryptoChipsEventLoggingState;", "", "componentIdPrefix", "", "<init>", "(Ljava/lang/String;)V", "getComponentIdPrefix", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib-crypto-chips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoChipsEventLoggingState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String componentIdPrefix;

    public static /* synthetic */ CryptoChipsEventLoggingState copy$default(CryptoChipsEventLoggingState cryptoChipsEventLoggingState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoChipsEventLoggingState.componentIdPrefix;
        }
        return cryptoChipsEventLoggingState.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getComponentIdPrefix() {
        return this.componentIdPrefix;
    }

    public final CryptoChipsEventLoggingState copy(String componentIdPrefix) {
        Intrinsics.checkNotNullParameter(componentIdPrefix, "componentIdPrefix");
        return new CryptoChipsEventLoggingState(componentIdPrefix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoChipsEventLoggingState) && Intrinsics.areEqual(this.componentIdPrefix, ((CryptoChipsEventLoggingState) other).componentIdPrefix);
    }

    public int hashCode() {
        return this.componentIdPrefix.hashCode();
    }

    public String toString() {
        return "CryptoChipsEventLoggingState(componentIdPrefix=" + this.componentIdPrefix + ")";
    }

    public CryptoChipsEventLoggingState(String componentIdPrefix) {
        Intrinsics.checkNotNullParameter(componentIdPrefix, "componentIdPrefix");
        this.componentIdPrefix = componentIdPrefix;
    }

    public final String getComponentIdPrefix() {
        return this.componentIdPrefix;
    }

    /* compiled from: CryptoChipsComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/chips/CryptoChipsEventLoggingState$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/shared/crypto/chips/CryptoChipsEventLoggingState;", "getDefault", "()Lcom/robinhood/shared/crypto/chips/CryptoChipsEventLoggingState;", "lib-crypto-chips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CryptoChipsEventLoggingState getDefault() {
            return new CryptoChipsEventLoggingState("discover-chips-");
        }
    }
}
