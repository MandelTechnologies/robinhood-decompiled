package com.robinhood.android.advisory.portfolio.update.results;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: UpdatePortfolioResultsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState;", "", "Loading", "Error", "Change", "NoChange", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$Change;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$Error;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$Loading;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$NoChange;", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface UpdatePortfolioResultsViewState {

    /* compiled from: UpdatePortfolioResultsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$Loading;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements UpdatePortfolioResultsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -567562931;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: UpdatePortfolioResultsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$Error;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements UpdatePortfolioResultsViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -2120913319;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: UpdatePortfolioResultsViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$Change;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState;", "title", "", "subtitle", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/portfolio/update/results/ModelPortfolioChangeRow;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDisclosure", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Change implements UpdatePortfolioResultsViewState {
        public static final int $stable = 8;
        private final String disclosure;
        private final ImmutableList<ModelPortfolioChangeRow> rows;
        private final String subtitle;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Change copy$default(Change change, String str, String str2, String str3, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                str = change.title;
            }
            if ((i & 2) != 0) {
                str2 = change.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = change.disclosure;
            }
            if ((i & 8) != 0) {
                immutableList = change.rows;
            }
            return change.copy(str, str2, str3, immutableList);
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
        public final String getDisclosure() {
            return this.disclosure;
        }

        public final ImmutableList<ModelPortfolioChangeRow> component4() {
            return this.rows;
        }

        public final Change copy(String title, String subtitle, String disclosure, ImmutableList<ModelPortfolioChangeRow> rows) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new Change(title, subtitle, disclosure, rows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Change)) {
                return false;
            }
            Change change = (Change) other;
            return Intrinsics.areEqual(this.title, change.title) && Intrinsics.areEqual(this.subtitle, change.subtitle) && Intrinsics.areEqual(this.disclosure, change.disclosure) && Intrinsics.areEqual(this.rows, change.rows);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.disclosure.hashCode()) * 31) + this.rows.hashCode();
        }

        public String toString() {
            return "Change(title=" + this.title + ", subtitle=" + this.subtitle + ", disclosure=" + this.disclosure + ", rows=" + this.rows + ")";
        }

        public Change(String title, String subtitle, String disclosure, ImmutableList<ModelPortfolioChangeRow> rows) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.title = title;
            this.subtitle = subtitle;
            this.disclosure = disclosure;
            this.rows = rows;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getDisclosure() {
            return this.disclosure;
        }

        public final ImmutableList<ModelPortfolioChangeRow> getRows() {
            return this.rows;
        }
    }

    /* compiled from: UpdatePortfolioResultsViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$NoChange;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState;", "title", "", "subtitle", "lottieUrlDark", "lottieUrlLight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getLottieUrlDark", "getLottieUrlLight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NoChange implements UpdatePortfolioResultsViewState {
        public static final int $stable = 0;
        private final String lottieUrlDark;
        private final String lottieUrlLight;
        private final String subtitle;
        private final String title;

        public static /* synthetic */ NoChange copy$default(NoChange noChange, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noChange.title;
            }
            if ((i & 2) != 0) {
                str2 = noChange.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = noChange.lottieUrlDark;
            }
            if ((i & 8) != 0) {
                str4 = noChange.lottieUrlLight;
            }
            return noChange.copy(str, str2, str3, str4);
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
        public final String getLottieUrlDark() {
            return this.lottieUrlDark;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLottieUrlLight() {
            return this.lottieUrlLight;
        }

        public final NoChange copy(String title, String subtitle, String lottieUrlDark, String lottieUrlLight) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(lottieUrlDark, "lottieUrlDark");
            Intrinsics.checkNotNullParameter(lottieUrlLight, "lottieUrlLight");
            return new NoChange(title, subtitle, lottieUrlDark, lottieUrlLight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoChange)) {
                return false;
            }
            NoChange noChange = (NoChange) other;
            return Intrinsics.areEqual(this.title, noChange.title) && Intrinsics.areEqual(this.subtitle, noChange.subtitle) && Intrinsics.areEqual(this.lottieUrlDark, noChange.lottieUrlDark) && Intrinsics.areEqual(this.lottieUrlLight, noChange.lottieUrlLight);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.lottieUrlDark.hashCode()) * 31) + this.lottieUrlLight.hashCode();
        }

        public String toString() {
            return "NoChange(title=" + this.title + ", subtitle=" + this.subtitle + ", lottieUrlDark=" + this.lottieUrlDark + ", lottieUrlLight=" + this.lottieUrlLight + ")";
        }

        public NoChange(String title, String subtitle, String lottieUrlDark, String lottieUrlLight) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(lottieUrlDark, "lottieUrlDark");
            Intrinsics.checkNotNullParameter(lottieUrlLight, "lottieUrlLight");
            this.title = title;
            this.subtitle = subtitle;
            this.lottieUrlDark = lottieUrlDark;
            this.lottieUrlLight = lottieUrlLight;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getLottieUrlDark() {
            return this.lottieUrlDark;
        }

        public final String getLottieUrlLight() {
            return this.lottieUrlLight;
        }
    }
}
