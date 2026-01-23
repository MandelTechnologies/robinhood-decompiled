package com.robinhood.android.crypto.tab.p093ui.lists;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.contentful.markdown.MarkdownContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeWatchlistTitleDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleViewState;", "", "bottomSheetContent", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleViewState$BottomSheetContent;", "<init>", "(Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleViewState$BottomSheetContent;)V", "getBottomSheetContent", "()Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleViewState$BottomSheetContent;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BottomSheetContent", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeWatchlistTitleViewState {
    public static final int $stable = 8;
    private final BottomSheetContent bottomSheetContent;

    public static /* synthetic */ CryptoHomeWatchlistTitleViewState copy$default(CryptoHomeWatchlistTitleViewState cryptoHomeWatchlistTitleViewState, BottomSheetContent bottomSheetContent, int i, Object obj) {
        if ((i & 1) != 0) {
            bottomSheetContent = cryptoHomeWatchlistTitleViewState.bottomSheetContent;
        }
        return cryptoHomeWatchlistTitleViewState.copy(bottomSheetContent);
    }

    /* renamed from: component1, reason: from getter */
    public final BottomSheetContent getBottomSheetContent() {
        return this.bottomSheetContent;
    }

    public final CryptoHomeWatchlistTitleViewState copy(BottomSheetContent bottomSheetContent) {
        return new CryptoHomeWatchlistTitleViewState(bottomSheetContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoHomeWatchlistTitleViewState) && Intrinsics.areEqual(this.bottomSheetContent, ((CryptoHomeWatchlistTitleViewState) other).bottomSheetContent);
    }

    public int hashCode() {
        BottomSheetContent bottomSheetContent = this.bottomSheetContent;
        if (bottomSheetContent == null) {
            return 0;
        }
        return bottomSheetContent.hashCode();
    }

    public String toString() {
        return "CryptoHomeWatchlistTitleViewState(bottomSheetContent=" + this.bottomSheetContent + ")";
    }

    public CryptoHomeWatchlistTitleViewState(BottomSheetContent bottomSheetContent) {
        this.bottomSheetContent = bottomSheetContent;
    }

    public final BottomSheetContent getBottomSheetContent() {
        return this.bottomSheetContent;
    }

    /* compiled from: CryptoHomeWatchlistTitleDuxo.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleViewState$BottomSheetContent;", "", CarResultComposable2.BODY, "Lcom/robinhood/contentful/markdown/MarkdownContent;", AccountOverviewOptionsSettingCard4.CTA, "", "title", "<init>", "(Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getCta", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BottomSheetContent {
        public static final int $stable = 8;
        private final MarkdownContent body;
        private final String cta;
        private final String title;

        public static /* synthetic */ BottomSheetContent copy$default(BottomSheetContent bottomSheetContent, MarkdownContent markdownContent, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                markdownContent = bottomSheetContent.body;
            }
            if ((i & 2) != 0) {
                str = bottomSheetContent.cta;
            }
            if ((i & 4) != 0) {
                str2 = bottomSheetContent.title;
            }
            return bottomSheetContent.copy(markdownContent, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final MarkdownContent getBody() {
            return this.body;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCta() {
            return this.cta;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final BottomSheetContent copy(MarkdownContent body, String cta, String title) {
            Intrinsics.checkNotNullParameter(cta, "cta");
            Intrinsics.checkNotNullParameter(title, "title");
            return new BottomSheetContent(body, cta, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomSheetContent)) {
                return false;
            }
            BottomSheetContent bottomSheetContent = (BottomSheetContent) other;
            return Intrinsics.areEqual(this.body, bottomSheetContent.body) && Intrinsics.areEqual(this.cta, bottomSheetContent.cta) && Intrinsics.areEqual(this.title, bottomSheetContent.title);
        }

        public int hashCode() {
            MarkdownContent markdownContent = this.body;
            return ((((markdownContent == null ? 0 : markdownContent.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.title.hashCode();
        }

        public String toString() {
            return "BottomSheetContent(body=" + this.body + ", cta=" + this.cta + ", title=" + this.title + ")";
        }

        public BottomSheetContent(MarkdownContent markdownContent, String cta, String title) {
            Intrinsics.checkNotNullParameter(cta, "cta");
            Intrinsics.checkNotNullParameter(title, "title");
            this.body = markdownContent;
            this.cta = cta;
            this.title = title;
        }

        public final MarkdownContent getBody() {
            return this.body;
        }

        public final String getCta() {
            return this.cta;
        }

        public final String getTitle() {
            return this.title;
        }
    }
}
