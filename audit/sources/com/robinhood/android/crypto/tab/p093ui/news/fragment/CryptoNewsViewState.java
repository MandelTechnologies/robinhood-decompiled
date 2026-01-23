package com.robinhood.android.crypto.tab.p093ui.news.fragment;

import com.robinhood.android.crypto.tab.util.CryptoNewsArticle;
import com.robinhood.android.newsfeed.model.Element;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoNewsViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsViewState;", "", "educationCarousel", "Lcom/robinhood/android/newsfeed/model/Element$EducationCarousel;", "cryptoArticles", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/tab/util/CryptoNewsArticle;", "<init>", "(Lcom/robinhood/android/newsfeed/model/Element$EducationCarousel;Lkotlinx/collections/immutable/ImmutableList;)V", "getEducationCarousel", "()Lcom/robinhood/android/newsfeed/model/Element$EducationCarousel;", "getCryptoArticles", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoNewsViewState {
    public static final int $stable = 8;
    private final ImmutableList<CryptoNewsArticle> cryptoArticles;
    private final Element.EducationCarousel educationCarousel;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoNewsViewState copy$default(CryptoNewsViewState cryptoNewsViewState, Element.EducationCarousel educationCarousel, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            educationCarousel = cryptoNewsViewState.educationCarousel;
        }
        if ((i & 2) != 0) {
            immutableList = cryptoNewsViewState.cryptoArticles;
        }
        return cryptoNewsViewState.copy(educationCarousel, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final Element.EducationCarousel getEducationCarousel() {
        return this.educationCarousel;
    }

    public final ImmutableList<CryptoNewsArticle> component2() {
        return this.cryptoArticles;
    }

    public final CryptoNewsViewState copy(Element.EducationCarousel educationCarousel, ImmutableList<CryptoNewsArticle> cryptoArticles) {
        Intrinsics.checkNotNullParameter(cryptoArticles, "cryptoArticles");
        return new CryptoNewsViewState(educationCarousel, cryptoArticles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoNewsViewState)) {
            return false;
        }
        CryptoNewsViewState cryptoNewsViewState = (CryptoNewsViewState) other;
        return Intrinsics.areEqual(this.educationCarousel, cryptoNewsViewState.educationCarousel) && Intrinsics.areEqual(this.cryptoArticles, cryptoNewsViewState.cryptoArticles);
    }

    public int hashCode() {
        Element.EducationCarousel educationCarousel = this.educationCarousel;
        return ((educationCarousel == null ? 0 : educationCarousel.hashCode()) * 31) + this.cryptoArticles.hashCode();
    }

    public String toString() {
        return "CryptoNewsViewState(educationCarousel=" + this.educationCarousel + ", cryptoArticles=" + this.cryptoArticles + ")";
    }

    public CryptoNewsViewState(Element.EducationCarousel educationCarousel, ImmutableList<CryptoNewsArticle> cryptoArticles) {
        Intrinsics.checkNotNullParameter(cryptoArticles, "cryptoArticles");
        this.educationCarousel = educationCarousel;
        this.cryptoArticles = cryptoArticles;
    }

    public final Element.EducationCarousel getEducationCarousel() {
        return this.educationCarousel;
    }

    public final ImmutableList<CryptoNewsArticle> getCryptoArticles() {
        return this.cryptoArticles;
    }
}
