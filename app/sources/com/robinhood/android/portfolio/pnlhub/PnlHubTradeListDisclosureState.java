package com.robinhood.android.portfolio.pnlhub;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PnlHubTradeListDisclosureState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState;", "", "textId", "", "<init>", "(I)V", "getTextId", "()I", "Disclosure", "DisclosureWithUrlLink", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState$Disclosure;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState$DisclosureWithUrlLink;", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class PnlHubTradeListDisclosureState {
    public static final int $stable = 0;
    private final int textId;

    public /* synthetic */ PnlHubTradeListDisclosureState(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    private PnlHubTradeListDisclosureState(int i) {
        this.textId = i;
    }

    public int getTextId() {
        return this.textId;
    }

    /* compiled from: PnlHubTradeListDisclosureState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState$Disclosure;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState;", "textId", "", "<init>", "(I)V", "getTextId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Disclosure extends PnlHubTradeListDisclosureState {
        public static final int $stable = 0;
        private final int textId;

        public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = disclosure.textId;
            }
            return disclosure.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTextId() {
            return this.textId;
        }

        public final Disclosure copy(int textId) {
            return new Disclosure(textId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disclosure) && this.textId == ((Disclosure) other).textId;
        }

        public int hashCode() {
            return Integer.hashCode(this.textId);
        }

        public String toString() {
            return "Disclosure(textId=" + this.textId + ")";
        }

        @Override // com.robinhood.android.portfolio.pnlhub.PnlHubTradeListDisclosureState
        public int getTextId() {
            return this.textId;
        }

        public Disclosure(int i) {
            super(i, null);
            this.textId = i;
        }
    }

    /* compiled from: PnlHubTradeListDisclosureState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState$DisclosureWithUrlLink;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState;", "textId", "", "substringLinkTextId", "urlLinkId", "<init>", "(III)V", "getTextId", "()I", "getSubstringLinkTextId", "getUrlLinkId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisclosureWithUrlLink extends PnlHubTradeListDisclosureState {
        public static final int $stable = 0;
        private final int substringLinkTextId;
        private final int textId;
        private final int urlLinkId;

        public static /* synthetic */ DisclosureWithUrlLink copy$default(DisclosureWithUrlLink disclosureWithUrlLink, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = disclosureWithUrlLink.textId;
            }
            if ((i4 & 2) != 0) {
                i2 = disclosureWithUrlLink.substringLinkTextId;
            }
            if ((i4 & 4) != 0) {
                i3 = disclosureWithUrlLink.urlLinkId;
            }
            return disclosureWithUrlLink.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTextId() {
            return this.textId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSubstringLinkTextId() {
            return this.substringLinkTextId;
        }

        /* renamed from: component3, reason: from getter */
        public final int getUrlLinkId() {
            return this.urlLinkId;
        }

        public final DisclosureWithUrlLink copy(int textId, int substringLinkTextId, int urlLinkId) {
            return new DisclosureWithUrlLink(textId, substringLinkTextId, urlLinkId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisclosureWithUrlLink)) {
                return false;
            }
            DisclosureWithUrlLink disclosureWithUrlLink = (DisclosureWithUrlLink) other;
            return this.textId == disclosureWithUrlLink.textId && this.substringLinkTextId == disclosureWithUrlLink.substringLinkTextId && this.urlLinkId == disclosureWithUrlLink.urlLinkId;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.textId) * 31) + Integer.hashCode(this.substringLinkTextId)) * 31) + Integer.hashCode(this.urlLinkId);
        }

        public String toString() {
            return "DisclosureWithUrlLink(textId=" + this.textId + ", substringLinkTextId=" + this.substringLinkTextId + ", urlLinkId=" + this.urlLinkId + ")";
        }

        @Override // com.robinhood.android.portfolio.pnlhub.PnlHubTradeListDisclosureState
        public int getTextId() {
            return this.textId;
        }

        public final int getSubstringLinkTextId() {
            return this.substringLinkTextId;
        }

        public final int getUrlLinkId() {
            return this.urlLinkId;
        }

        public DisclosureWithUrlLink(int i, int i2, int i3) {
            super(i, null);
            this.textId = i;
            this.substringLinkTextId = i2;
            this.urlLinkId = i3;
        }
    }
}
