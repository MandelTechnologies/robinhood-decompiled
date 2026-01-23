package com.robinhood.android.crypto.tab.p093ui.walletTrending;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeWalletTrendingDataState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/walletTrending/WalletTrendingHeaderState;", "", "title", "", "description", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getDisclosure", "displayInfoIcon", "", "getDisplayInfoIcon", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WalletTrendingHeaderState {
    public static final int $stable = 0;
    private final String description;
    private final String disclosure;
    private final String title;

    public static /* synthetic */ WalletTrendingHeaderState copy$default(WalletTrendingHeaderState walletTrendingHeaderState, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletTrendingHeaderState.title;
        }
        if ((i & 2) != 0) {
            str2 = walletTrendingHeaderState.description;
        }
        if ((i & 4) != 0) {
            str3 = walletTrendingHeaderState.disclosure;
        }
        return walletTrendingHeaderState.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    public final WalletTrendingHeaderState copy(String title, String description, String disclosure) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new WalletTrendingHeaderState(title, description, disclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletTrendingHeaderState)) {
            return false;
        }
        WalletTrendingHeaderState walletTrendingHeaderState = (WalletTrendingHeaderState) other;
        return Intrinsics.areEqual(this.title, walletTrendingHeaderState.title) && Intrinsics.areEqual(this.description, walletTrendingHeaderState.description) && Intrinsics.areEqual(this.disclosure, walletTrendingHeaderState.disclosure);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.disclosure;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "WalletTrendingHeaderState(title=" + this.title + ", description=" + this.description + ", disclosure=" + this.disclosure + ")";
    }

    public WalletTrendingHeaderState(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.description = str;
        this.disclosure = str2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final boolean getDisplayInfoIcon() {
        String str = this.description;
        return str != null && str.length() > 0;
    }
}
