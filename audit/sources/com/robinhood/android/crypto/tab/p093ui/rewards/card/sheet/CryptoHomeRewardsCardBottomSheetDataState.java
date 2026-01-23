package com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeRewardsCardBottomSheetDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetDataState;", "", "content", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "<init>", "(Lcom/robinhood/staticcontent/model/disclosure/Disclosure;)V", "getContent", "()Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "title", "", "getTitle", "()Ljava/lang/String;", CarResultComposable2.BODY, "Lcom/robinhood/contentful/markdown/MarkdownContent;", "getBody", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", AccountOverviewOptionsSettingCard4.CTA, "getCta", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeRewardsCardBottomSheetDataState {
    public static final int $stable = 8;
    private final Disclosure content;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeRewardsCardBottomSheetDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CryptoHomeRewardsCardBottomSheetDataState copy$default(CryptoHomeRewardsCardBottomSheetDataState cryptoHomeRewardsCardBottomSheetDataState, Disclosure disclosure, int i, Object obj) {
        if ((i & 1) != 0) {
            disclosure = cryptoHomeRewardsCardBottomSheetDataState.content;
        }
        return cryptoHomeRewardsCardBottomSheetDataState.copy(disclosure);
    }

    /* renamed from: component1, reason: from getter */
    public final Disclosure getContent() {
        return this.content;
    }

    public final CryptoHomeRewardsCardBottomSheetDataState copy(Disclosure content) {
        return new CryptoHomeRewardsCardBottomSheetDataState(content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoHomeRewardsCardBottomSheetDataState) && Intrinsics.areEqual(this.content, ((CryptoHomeRewardsCardBottomSheetDataState) other).content);
    }

    public int hashCode() {
        Disclosure disclosure = this.content;
        if (disclosure == null) {
            return 0;
        }
        return disclosure.hashCode();
    }

    public String toString() {
        return "CryptoHomeRewardsCardBottomSheetDataState(content=" + this.content + ")";
    }

    public CryptoHomeRewardsCardBottomSheetDataState(Disclosure disclosure) {
        this.content = disclosure;
    }

    public /* synthetic */ CryptoHomeRewardsCardBottomSheetDataState(Disclosure disclosure, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : disclosure);
    }

    public final Disclosure getContent() {
        return this.content;
    }

    public final String getTitle() {
        Disclosure disclosure = this.content;
        if (disclosure != null) {
            return disclosure.getTitle();
        }
        return null;
    }

    public final MarkdownContent getBody() {
        Disclosure disclosure = this.content;
        if (disclosure != null) {
            return disclosure.getContent();
        }
        return null;
    }

    public final String getCta() {
        Disclosure disclosure = this.content;
        if (disclosure != null) {
            return disclosure.getButton();
        }
        return null;
    }
}
