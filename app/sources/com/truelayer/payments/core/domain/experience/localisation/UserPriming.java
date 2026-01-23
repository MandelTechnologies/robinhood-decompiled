package com.truelayer.payments.core.domain.experience.localisation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserPriming.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming;", "", "()V", "Data", "None", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data;", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$None;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class UserPriming {
    public /* synthetic */ UserPriming(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UserPriming() {
    }

    /* compiled from: UserPriming.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$None;", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming;", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class None extends UserPriming {
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    /* compiled from: UserPriming.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001e\u001f B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data;", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming;", "title", "", "headline", "steps", "", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data$Step;", "bankLink", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data$BankLink;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data$BankLink;)V", "getBankLink", "()Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data$BankLink;", "getHeadline", "()Ljava/lang/String;", "getSteps", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "BankLink", "Companion", "Step", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Data extends UserPriming {
        private final BankLink bankLink;
        private final String headline;
        private final List<Step> steps;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, String str, String str2, List list, BankLink bankLink, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.title;
            }
            if ((i & 2) != 0) {
                str2 = data.headline;
            }
            if ((i & 4) != 0) {
                list = data.steps;
            }
            if ((i & 8) != 0) {
                bankLink = data.bankLink;
            }
            return data.copy(str, str2, list, bankLink);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        public final List<Step> component3() {
            return this.steps;
        }

        /* renamed from: component4, reason: from getter */
        public final BankLink getBankLink() {
            return this.bankLink;
        }

        public final Data copy(String title, String headline, List<Step> steps, BankLink bankLink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(steps, "steps");
            Intrinsics.checkNotNullParameter(bankLink, "bankLink");
            return new Data(title, headline, steps, bankLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.title, data.title) && Intrinsics.areEqual(this.headline, data.headline) && Intrinsics.areEqual(this.steps, data.steps) && Intrinsics.areEqual(this.bankLink, data.bankLink);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.headline.hashCode()) * 31) + this.steps.hashCode()) * 31) + this.bankLink.hashCode();
        }

        public String toString() {
            return "Data(title=" + this.title + ", headline=" + this.headline + ", steps=" + this.steps + ", bankLink=" + this.bankLink + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final List<Step> getSteps() {
            return this.steps;
        }

        public final BankLink getBankLink() {
            return this.bankLink;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(String title, String headline, List<Step> steps, BankLink bankLink) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(steps, "steps");
            Intrinsics.checkNotNullParameter(bankLink, "bankLink");
            this.title = title;
            this.headline = headline;
            this.steps = steps;
            this.bankLink = bankLink;
        }

        /* compiled from: UserPriming.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data$BankLink;", "", "text", "", "link", "(Ljava/lang/String;Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class BankLink {
            private final String link;
            private final String text;

            public static /* synthetic */ BankLink copy$default(BankLink bankLink, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bankLink.text;
                }
                if ((i & 2) != 0) {
                    str2 = bankLink.link;
                }
                return bankLink.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            public final BankLink copy(String text, String link) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(link, "link");
                return new BankLink(text, link);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BankLink)) {
                    return false;
                }
                BankLink bankLink = (BankLink) other;
                return Intrinsics.areEqual(this.text, bankLink.text) && Intrinsics.areEqual(this.link, bankLink.link);
            }

            public int hashCode() {
                return (this.text.hashCode() * 31) + this.link.hashCode();
            }

            public String toString() {
                return "BankLink(text=" + this.text + ", link=" + this.link + ")";
            }

            public BankLink(String text, String link) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(link, "link");
                this.text = text;
                this.link = link;
            }

            public final String getText() {
                return this.text;
            }

            public final String getLink() {
                return this.link;
            }
        }

        /* compiled from: UserPriming.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data$Step;", "", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Step {
            private final String text;

            public static /* synthetic */ Step copy$default(Step step, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = step.text;
                }
                return step.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Step copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Step(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Step) && Intrinsics.areEqual(this.text, ((Step) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "Step(text=" + this.text + ")";
            }

            public Step(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }
    }
}
