package com.robinhood.android.crypto.tab.p093ui.walletTrending;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoHomeWalletTrendingViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingViewState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingViewState$Loaded;", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingViewState$Loading;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CryptoHomeWalletTrendingViewState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoHomeWalletTrendingViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoHomeWalletTrendingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingViewState$Loading;", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoHomeWalletTrendingViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 800754100;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private CryptoHomeWalletTrendingViewState() {
    }

    /* compiled from: CryptoHomeWalletTrendingViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingViewState$Loaded;", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingViewState;", "tokens", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/chips/CryptoChip;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "headerState", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/WalletTrendingHeaderState;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/navigation/keys/FragmentKey;Lcom/robinhood/android/crypto/tab/ui/walletTrending/WalletTrendingHeaderState;)V", "getTokens", "()Lkotlinx/collections/immutable/ImmutableList;", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getHeaderState", "()Lcom/robinhood/android/crypto/tab/ui/walletTrending/WalletTrendingHeaderState;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends CryptoHomeWalletTrendingViewState {
        public static final int $stable = 8;
        private final FragmentKey fragmentKey;
        private final WalletTrendingHeaderState headerState;
        private final ImmutableList<CryptoChipsComposable> tokens;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, ImmutableList immutableList, FragmentKey fragmentKey, WalletTrendingHeaderState walletTrendingHeaderState, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = loaded.tokens;
            }
            if ((i & 2) != 0) {
                fragmentKey = loaded.fragmentKey;
            }
            if ((i & 4) != 0) {
                walletTrendingHeaderState = loaded.headerState;
            }
            return loaded.copy(immutableList, fragmentKey, walletTrendingHeaderState);
        }

        public final ImmutableList<CryptoChipsComposable> component1() {
            return this.tokens;
        }

        /* renamed from: component2, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        /* renamed from: component3, reason: from getter */
        public final WalletTrendingHeaderState getHeaderState() {
            return this.headerState;
        }

        public final Loaded copy(ImmutableList<? extends CryptoChipsComposable> tokens, FragmentKey fragmentKey, WalletTrendingHeaderState headerState) {
            Intrinsics.checkNotNullParameter(tokens, "tokens");
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            Intrinsics.checkNotNullParameter(headerState, "headerState");
            return new Loaded(tokens, fragmentKey, headerState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.tokens, loaded.tokens) && Intrinsics.areEqual(this.fragmentKey, loaded.fragmentKey) && Intrinsics.areEqual(this.headerState, loaded.headerState);
        }

        public int hashCode() {
            return (((this.tokens.hashCode() * 31) + this.fragmentKey.hashCode()) * 31) + this.headerState.hashCode();
        }

        public String toString() {
            return "Loaded(tokens=" + this.tokens + ", fragmentKey=" + this.fragmentKey + ", headerState=" + this.headerState + ")";
        }

        public final ImmutableList<CryptoChipsComposable> getTokens() {
            return this.tokens;
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final WalletTrendingHeaderState getHeaderState() {
            return this.headerState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(ImmutableList<? extends CryptoChipsComposable> tokens, FragmentKey fragmentKey, WalletTrendingHeaderState headerState) {
            super(null);
            Intrinsics.checkNotNullParameter(tokens, "tokens");
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            Intrinsics.checkNotNullParameter(headerState, "headerState");
            this.tokens = tokens;
            this.fragmentKey = fragmentKey;
            this.headerState = headerState;
        }
    }
}
