package com.robinhood.staticcontent.model.margin;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginInterestRateComparison.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparison;", "", "title", "", "description", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "brokerageInterestRate", "", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparison$BrokerageInterestRateItem;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/util/List;Lcom/robinhood/contentful/markdown/MarkdownContent;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getBrokerageInterestRate", "()Ljava/util/List;", "getDisclosure", "BrokerageInterestRateItem", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MarginInterestRateComparison {
    private final List<ResourceLink<EntryResource<BrokerageInterestRateItem>>> brokerageInterestRate;
    private final MarkdownContent description;
    private final MarkdownContent disclosure;
    private final String title;

    public MarginInterestRateComparison(String str, MarkdownContent markdownContent, List<ResourceLink<EntryResource<BrokerageInterestRateItem>>> brokerageInterestRate, MarkdownContent markdownContent2) {
        Intrinsics.checkNotNullParameter(brokerageInterestRate, "brokerageInterestRate");
        this.title = str;
        this.description = markdownContent;
        this.brokerageInterestRate = brokerageInterestRate;
        this.disclosure = markdownContent2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getDescription() {
        return this.description;
    }

    public final List<ResourceLink<EntryResource<BrokerageInterestRateItem>>> getBrokerageInterestRate() {
        return this.brokerageInterestRate;
    }

    public final MarkdownContent getDisclosure() {
        return this.disclosure;
    }

    /* compiled from: MarginInterestRateComparison.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparison$BrokerageInterestRateItem;", "", "title", "", "interestRate", "", "isBold", "", "<init>", "(Ljava/lang/String;FZ)V", "getTitle", "()Ljava/lang/String;", "getInterestRate", "()F", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BrokerageInterestRateItem {
        private final float interestRate;
        private final boolean isBold;
        private final String title;

        public static /* synthetic */ BrokerageInterestRateItem copy$default(BrokerageInterestRateItem brokerageInterestRateItem, String str, float f, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = brokerageInterestRateItem.title;
            }
            if ((i & 2) != 0) {
                f = brokerageInterestRateItem.interestRate;
            }
            if ((i & 4) != 0) {
                z = brokerageInterestRateItem.isBold;
            }
            return brokerageInterestRateItem.copy(str, f, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final float getInterestRate() {
            return this.interestRate;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsBold() {
            return this.isBold;
        }

        public final BrokerageInterestRateItem copy(String title, float interestRate, boolean isBold) {
            return new BrokerageInterestRateItem(title, interestRate, isBold);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BrokerageInterestRateItem)) {
                return false;
            }
            BrokerageInterestRateItem brokerageInterestRateItem = (BrokerageInterestRateItem) other;
            return Intrinsics.areEqual(this.title, brokerageInterestRateItem.title) && Float.compare(this.interestRate, brokerageInterestRateItem.interestRate) == 0 && this.isBold == brokerageInterestRateItem.isBold;
        }

        public int hashCode() {
            String str = this.title;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Float.hashCode(this.interestRate)) * 31) + Boolean.hashCode(this.isBold);
        }

        public String toString() {
            return "BrokerageInterestRateItem(title=" + this.title + ", interestRate=" + this.interestRate + ", isBold=" + this.isBold + ")";
        }

        public BrokerageInterestRateItem(String str, float f, boolean z) {
            this.title = str;
            this.interestRate = f;
            this.isBold = z;
        }

        public final String getTitle() {
            return this.title;
        }

        public final float getInterestRate() {
            return this.interestRate;
        }

        public final boolean isBold() {
            return this.isBold;
        }
    }
}
