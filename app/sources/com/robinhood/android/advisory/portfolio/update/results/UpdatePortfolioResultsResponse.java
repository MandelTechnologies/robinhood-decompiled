package com.robinhood.android.advisory.portfolio.update.results;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: UpdatePortfolioResultsResponse.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse;", "", "title", "", "subtitle", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse$Details;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse$Details;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDetails", "()Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse$Details;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Details", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdatePortfolioResultsResponse {
    public static final int $stable = 8;
    private final Details details;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ UpdatePortfolioResultsResponse copy$default(UpdatePortfolioResultsResponse updatePortfolioResultsResponse, String str, String str2, Details details, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updatePortfolioResultsResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = updatePortfolioResultsResponse.subtitle;
        }
        if ((i & 4) != 0) {
            details = updatePortfolioResultsResponse.details;
        }
        return updatePortfolioResultsResponse.copy(str, str2, details);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Details getDetails() {
        return this.details;
    }

    public final UpdatePortfolioResultsResponse copy(String title, String subtitle, Details details) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(details, "details");
        return new UpdatePortfolioResultsResponse(title, subtitle, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePortfolioResultsResponse)) {
            return false;
        }
        UpdatePortfolioResultsResponse updatePortfolioResultsResponse = (UpdatePortfolioResultsResponse) other;
        return Intrinsics.areEqual(this.title, updatePortfolioResultsResponse.title) && Intrinsics.areEqual(this.subtitle, updatePortfolioResultsResponse.subtitle) && Intrinsics.areEqual(this.details, updatePortfolioResultsResponse.details);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.details.hashCode();
    }

    public String toString() {
        return "UpdatePortfolioResultsResponse(title=" + this.title + ", subtitle=" + this.subtitle + ", details=" + this.details + ")";
    }

    public UpdatePortfolioResultsResponse(String title, String subtitle, Details details) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(details, "details");
        this.title = title;
        this.subtitle = subtitle;
        this.details = details;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Details getDetails() {
        return this.details;
    }

    /* compiled from: UpdatePortfolioResultsResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse$Details;", "", "Change", "NoChange", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse$Details$Change;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse$Details$NoChange;", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Details {

        /* compiled from: UpdatePortfolioResultsResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse$Details$Change;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse$Details;", "rows", "", "Lcom/robinhood/android/advisory/portfolio/update/results/ModelPortfolioChangeRow;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getRows", "()Ljava/util/List;", "getDisclosure", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Change implements Details {
            public static final int $stable = 8;
            private final String disclosure;
            private final List<ModelPortfolioChangeRow> rows;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Change copy$default(Change change, List list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = change.rows;
                }
                if ((i & 2) != 0) {
                    str = change.disclosure;
                }
                return change.copy(list, str);
            }

            public final List<ModelPortfolioChangeRow> component1() {
                return this.rows;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDisclosure() {
                return this.disclosure;
            }

            public final Change copy(List<ModelPortfolioChangeRow> rows, String disclosure) {
                Intrinsics.checkNotNullParameter(rows, "rows");
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                return new Change(rows, disclosure);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Change)) {
                    return false;
                }
                Change change = (Change) other;
                return Intrinsics.areEqual(this.rows, change.rows) && Intrinsics.areEqual(this.disclosure, change.disclosure);
            }

            public int hashCode() {
                return (this.rows.hashCode() * 31) + this.disclosure.hashCode();
            }

            public String toString() {
                return "Change(rows=" + this.rows + ", disclosure=" + this.disclosure + ")";
            }

            public Change(List<ModelPortfolioChangeRow> rows, String disclosure) {
                Intrinsics.checkNotNullParameter(rows, "rows");
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                this.rows = rows;
                this.disclosure = disclosure;
            }

            public final List<ModelPortfolioChangeRow> getRows() {
                return this.rows;
            }

            public final String getDisclosure() {
                return this.disclosure;
            }
        }

        /* compiled from: UpdatePortfolioResultsResponse.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse$Details$NoChange;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse$Details;", "lottieUrlDark", "", "lottieUrlLight", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLottieUrlDark", "()Ljava/lang/String;", "getLottieUrlLight", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoChange implements Details {
            public static final int $stable = 0;
            private final String lottieUrlDark;
            private final String lottieUrlLight;

            public static /* synthetic */ NoChange copy$default(NoChange noChange, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = noChange.lottieUrlDark;
                }
                if ((i & 2) != 0) {
                    str2 = noChange.lottieUrlLight;
                }
                return noChange.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getLottieUrlDark() {
                return this.lottieUrlDark;
            }

            /* renamed from: component2, reason: from getter */
            public final String getLottieUrlLight() {
                return this.lottieUrlLight;
            }

            public final NoChange copy(String lottieUrlDark, String lottieUrlLight) {
                Intrinsics.checkNotNullParameter(lottieUrlDark, "lottieUrlDark");
                Intrinsics.checkNotNullParameter(lottieUrlLight, "lottieUrlLight");
                return new NoChange(lottieUrlDark, lottieUrlLight);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoChange)) {
                    return false;
                }
                NoChange noChange = (NoChange) other;
                return Intrinsics.areEqual(this.lottieUrlDark, noChange.lottieUrlDark) && Intrinsics.areEqual(this.lottieUrlLight, noChange.lottieUrlLight);
            }

            public int hashCode() {
                return (this.lottieUrlDark.hashCode() * 31) + this.lottieUrlLight.hashCode();
            }

            public String toString() {
                return "NoChange(lottieUrlDark=" + this.lottieUrlDark + ", lottieUrlLight=" + this.lottieUrlLight + ")";
            }

            public NoChange(String lottieUrlDark, String lottieUrlLight) {
                Intrinsics.checkNotNullParameter(lottieUrlDark, "lottieUrlDark");
                Intrinsics.checkNotNullParameter(lottieUrlLight, "lottieUrlLight");
                this.lottieUrlDark = lottieUrlDark;
                this.lottieUrlLight = lottieUrlLight;
            }

            public final String getLottieUrlDark() {
                return this.lottieUrlDark;
            }

            public final String getLottieUrlLight() {
                return this.lottieUrlLight;
            }
        }
    }
}
