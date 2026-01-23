package com.robinhood.android.crypto.tab.p093ui.lists;

import com.robinhood.android.crypto.tab.p093ui.lists.CryptoHomeWatchlistTitleViewState;
import com.robinhood.staticcontent.model.MobileContentPage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeWatchlistTitleDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleDataState;", "", "content", "Lcom/robinhood/staticcontent/model/MobileContentPage;", "<init>", "(Lcom/robinhood/staticcontent/model/MobileContentPage;)V", "bottomSheetContent", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleViewState$BottomSheetContent;", "getBottomSheetContent", "()Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleViewState$BottomSheetContent;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeWatchlistTitleDataState {
    public static final int $stable = 8;
    private final MobileContentPage content;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeWatchlistTitleDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final MobileContentPage getContent() {
        return this.content;
    }

    public static /* synthetic */ CryptoHomeWatchlistTitleDataState copy$default(CryptoHomeWatchlistTitleDataState cryptoHomeWatchlistTitleDataState, MobileContentPage mobileContentPage, int i, Object obj) {
        if ((i & 1) != 0) {
            mobileContentPage = cryptoHomeWatchlistTitleDataState.content;
        }
        return cryptoHomeWatchlistTitleDataState.copy(mobileContentPage);
    }

    public final CryptoHomeWatchlistTitleDataState copy(MobileContentPage content) {
        return new CryptoHomeWatchlistTitleDataState(content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoHomeWatchlistTitleDataState) && Intrinsics.areEqual(this.content, ((CryptoHomeWatchlistTitleDataState) other).content);
    }

    public int hashCode() {
        MobileContentPage mobileContentPage = this.content;
        if (mobileContentPage == null) {
            return 0;
        }
        return mobileContentPage.hashCode();
    }

    public String toString() {
        return "CryptoHomeWatchlistTitleDataState(content=" + this.content + ")";
    }

    public CryptoHomeWatchlistTitleDataState(MobileContentPage mobileContentPage) {
        this.content = mobileContentPage;
    }

    public /* synthetic */ CryptoHomeWatchlistTitleDataState(MobileContentPage mobileContentPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mobileContentPage);
    }

    public final CryptoHomeWatchlistTitleViewState.BottomSheetContent getBottomSheetContent() {
        if (this.content != null) {
            return new CryptoHomeWatchlistTitleViewState.BottomSheetContent(this.content.getBody(), this.content.getPrimaryCta(), this.content.getTitle());
        }
        return null;
    }
}
