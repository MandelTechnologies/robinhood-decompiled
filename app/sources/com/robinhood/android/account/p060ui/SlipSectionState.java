package com.robinhood.android.account.p060ui;

import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.models.p320db.SlipHubCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AccountOverviewSlipHubCard.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/account/ui/SlipSectionState;", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "card", "Lcom/robinhood/models/db/SlipHubCard;", "<init>", "(Lcom/robinhood/models/db/SlipHubCard;)V", "getCard", "()Lcom/robinhood/models/db/SlipHubCard;", "titleLabel", "", "getTitleLabel", "()Ljava/lang/String;", "titleValue", "getTitleValue", ErrorBundle.SUMMARY_ENTRY, "getSummary", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/android/account/ui/SlipSectionState$Cta;", "getCta$feature_account_overview_externalRelease", "()Lcom/robinhood/android/account/ui/SlipSectionState$Cta;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Cta", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class SlipSectionState extends AccountOverviewSectionState {
    public static final int $stable = 8;
    private final SlipHubCard card;

    public static /* synthetic */ SlipSectionState copy$default(SlipSectionState slipSectionState, SlipHubCard slipHubCard, int i, Object obj) {
        if ((i & 1) != 0) {
            slipHubCard = slipSectionState.card;
        }
        return slipSectionState.copy(slipHubCard);
    }

    /* renamed from: component1, reason: from getter */
    public final SlipHubCard getCard() {
        return this.card;
    }

    public final SlipSectionState copy(SlipHubCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return new SlipSectionState(card);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SlipSectionState) && Intrinsics.areEqual(this.card, ((SlipSectionState) other).card);
    }

    public int hashCode() {
        return this.card.hashCode();
    }

    public String toString() {
        return "SlipSectionState(card=" + this.card + ")";
    }

    public final SlipHubCard getCard() {
        return this.card;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipSectionState(SlipHubCard card) {
        super(CardOrder.CardIdentifier.SLIP, null);
        Intrinsics.checkNotNullParameter(card, "card");
        this.card = card;
    }

    /* compiled from: AccountOverviewSlipHubCard.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/account/ui/SlipSectionState$Cta;", "", "text", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Cta {
        public static final int $stable = 0;
        private final String text;
        private final String url;

        public static /* synthetic */ Cta copy$default(Cta cta, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cta.text;
            }
            if ((i & 2) != 0) {
                str2 = cta.url;
            }
            return cta.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Cta copy(String text, String url) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(url, "url");
            return new Cta(text, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) other;
            return Intrinsics.areEqual(this.text, cta.text) && Intrinsics.areEqual(this.url, cta.url);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.url.hashCode();
        }

        public String toString() {
            return "Cta(text=" + this.text + ", url=" + this.url + ")";
        }

        public Cta(String text, String url) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(url, "url");
            this.text = text;
            this.url = url;
        }

        public final String getText() {
            return this.text;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    public final String getTitleLabel() {
        return this.card.getTitle();
    }

    public final String getTitleValue() {
        return this.card.getStatus();
    }

    public final String getSummary() {
        return this.card.getBody();
    }

    public final Cta getCta$feature_account_overview_externalRelease() {
        return new Cta(this.card.getCta(), this.card.getCtaDeeplinkUrl());
    }
}
