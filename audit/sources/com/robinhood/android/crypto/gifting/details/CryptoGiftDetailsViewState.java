package com.robinhood.android.crypto.gifting.details;

import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoGiftDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsViewState;", "", "screenHeader", "", "listItems", "", "footerDisclaimer", "Lcom/robinhood/models/serverdriven/db/RichText;", "primaryCta", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "dismissCtaText", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/serverdriven/db/GenericButton;Ljava/lang/String;)V", "getScreenHeader", "()Ljava/lang/String;", "getListItems", "()Ljava/util/List;", "getFooterDisclaimer", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getPrimaryCta", "()Lcom/robinhood/models/serverdriven/db/GenericButton;", "getDismissCtaText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoGiftDetailsViewState {
    public static final int $stable = 8;
    private final String dismissCtaText;
    private final RichText footerDisclaimer;
    private final List<Object> listItems;
    private final GenericButton primaryCta;
    private final String screenHeader;

    public static /* synthetic */ CryptoGiftDetailsViewState copy$default(CryptoGiftDetailsViewState cryptoGiftDetailsViewState, String str, List list, RichText richText, GenericButton genericButton, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoGiftDetailsViewState.screenHeader;
        }
        if ((i & 2) != 0) {
            list = cryptoGiftDetailsViewState.listItems;
        }
        if ((i & 4) != 0) {
            richText = cryptoGiftDetailsViewState.footerDisclaimer;
        }
        if ((i & 8) != 0) {
            genericButton = cryptoGiftDetailsViewState.primaryCta;
        }
        if ((i & 16) != 0) {
            str2 = cryptoGiftDetailsViewState.dismissCtaText;
        }
        String str3 = str2;
        RichText richText2 = richText;
        return cryptoGiftDetailsViewState.copy(str, list, richText2, genericButton, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScreenHeader() {
        return this.screenHeader;
    }

    public final List<Object> component2() {
        return this.listItems;
    }

    /* renamed from: component3, reason: from getter */
    public final RichText getFooterDisclaimer() {
        return this.footerDisclaimer;
    }

    /* renamed from: component4, reason: from getter */
    public final GenericButton getPrimaryCta() {
        return this.primaryCta;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDismissCtaText() {
        return this.dismissCtaText;
    }

    public final CryptoGiftDetailsViewState copy(String screenHeader, List<? extends Object> listItems, RichText footerDisclaimer, GenericButton primaryCta, String dismissCtaText) {
        Intrinsics.checkNotNullParameter(screenHeader, "screenHeader");
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        return new CryptoGiftDetailsViewState(screenHeader, listItems, footerDisclaimer, primaryCta, dismissCtaText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoGiftDetailsViewState)) {
            return false;
        }
        CryptoGiftDetailsViewState cryptoGiftDetailsViewState = (CryptoGiftDetailsViewState) other;
        return Intrinsics.areEqual(this.screenHeader, cryptoGiftDetailsViewState.screenHeader) && Intrinsics.areEqual(this.listItems, cryptoGiftDetailsViewState.listItems) && Intrinsics.areEqual(this.footerDisclaimer, cryptoGiftDetailsViewState.footerDisclaimer) && Intrinsics.areEqual(this.primaryCta, cryptoGiftDetailsViewState.primaryCta) && Intrinsics.areEqual(this.dismissCtaText, cryptoGiftDetailsViewState.dismissCtaText);
    }

    public int hashCode() {
        int iHashCode = ((this.screenHeader.hashCode() * 31) + this.listItems.hashCode()) * 31;
        RichText richText = this.footerDisclaimer;
        int iHashCode2 = (iHashCode + (richText == null ? 0 : richText.hashCode())) * 31;
        GenericButton genericButton = this.primaryCta;
        int iHashCode3 = (iHashCode2 + (genericButton == null ? 0 : genericButton.hashCode())) * 31;
        String str = this.dismissCtaText;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CryptoGiftDetailsViewState(screenHeader=" + this.screenHeader + ", listItems=" + this.listItems + ", footerDisclaimer=" + this.footerDisclaimer + ", primaryCta=" + this.primaryCta + ", dismissCtaText=" + this.dismissCtaText + ")";
    }

    public CryptoGiftDetailsViewState(String screenHeader, List<? extends Object> listItems, RichText richText, GenericButton genericButton, String str) {
        Intrinsics.checkNotNullParameter(screenHeader, "screenHeader");
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.screenHeader = screenHeader;
        this.listItems = listItems;
        this.footerDisclaimer = richText;
        this.primaryCta = genericButton;
        this.dismissCtaText = str;
    }

    public final String getScreenHeader() {
        return this.screenHeader;
    }

    public final List<Object> getListItems() {
        return this.listItems;
    }

    public final RichText getFooterDisclaimer() {
        return this.footerDisclaimer;
    }

    public final GenericButton getPrimaryCta() {
        return this.primaryCta;
    }

    public final String getDismissCtaText() {
        return this.dismissCtaText;
    }
}
