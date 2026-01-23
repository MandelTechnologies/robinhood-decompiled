package com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.contentful.markdown.MarkdownContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeRewardsCardBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState;", "", "Loaded", "Loading", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState$Loaded;", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState$Loading;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface CryptoHomeRewardsCardBottomSheetViewState {

    /* compiled from: CryptoHomeRewardsCardBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState$Loaded;", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState;", "title", "", CarResultComposable2.BODY, "Lcom/robinhood/contentful/markdown/MarkdownContent;", AccountOverviewOptionsSettingCard4.CTA, "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getCta", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements CryptoHomeRewardsCardBottomSheetViewState {
        public static final int $stable = 8;
        private final MarkdownContent body;
        private final String cta;
        private final String title;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, MarkdownContent markdownContent, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                markdownContent = loaded.body;
            }
            if ((i & 4) != 0) {
                str2 = loaded.cta;
            }
            return loaded.copy(str, markdownContent, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final MarkdownContent getBody() {
            return this.body;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCta() {
            return this.cta;
        }

        public final Loaded copy(String title, MarkdownContent body, String cta) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(cta, "cta");
            return new Loaded(title, body, cta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.body, loaded.body) && Intrinsics.areEqual(this.cta, loaded.cta);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.cta.hashCode();
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", body=" + this.body + ", cta=" + this.cta + ")";
        }

        public Loaded(String title, MarkdownContent body, String cta) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(cta, "cta");
            this.title = title;
            this.body = body;
            this.cta = cta;
        }

        public final String getTitle() {
            return this.title;
        }

        public final MarkdownContent getBody() {
            return this.body;
        }

        public final String getCta() {
            return this.cta;
        }
    }

    /* compiled from: CryptoHomeRewardsCardBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState$Loading;", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements CryptoHomeRewardsCardBottomSheetViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 404152767;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }
}
