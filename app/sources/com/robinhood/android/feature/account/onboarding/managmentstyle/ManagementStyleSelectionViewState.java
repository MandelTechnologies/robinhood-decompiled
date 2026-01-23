package com.robinhood.android.feature.account.onboarding.managmentstyle;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ManagementStyleSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState$Loaded;", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState$Loading;", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface ManagementStyleSelectionViewState {

    /* compiled from: ManagementStyleSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState$Loading;", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements ManagementStyleSelectionViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -965795609;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: ManagementStyleSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState$Loaded;", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState;", "title", "", "subtitle", "footerDisclosureMarkdown", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow;", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getFooterDisclosureMarkdown", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements ManagementStyleSelectionViewState {
        public static final int $stable = 0;
        private final BrokerageAccountType brokerageAccountType;
        private final String footerDisclosureMarkdown;
        private final ImmutableList<ManagementTypeSelectionRow> rows;
        private final String source;
        private final String subtitle;
        private final String title;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, String str3, BrokerageAccountType brokerageAccountType, ImmutableList immutableList, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                str2 = loaded.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = loaded.footerDisclosureMarkdown;
            }
            if ((i & 8) != 0) {
                brokerageAccountType = loaded.brokerageAccountType;
            }
            if ((i & 16) != 0) {
                immutableList = loaded.rows;
            }
            if ((i & 32) != 0) {
                str4 = loaded.source;
            }
            ImmutableList immutableList2 = immutableList;
            String str5 = str4;
            return loaded.copy(str, str2, str3, brokerageAccountType, immutableList2, str5);
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
        public final String getFooterDisclosureMarkdown() {
            return this.footerDisclosureMarkdown;
        }

        /* renamed from: component4, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final ImmutableList<ManagementTypeSelectionRow> component5() {
            return this.rows;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Loaded copy(String title, String subtitle, String footerDisclosureMarkdown, BrokerageAccountType brokerageAccountType, ImmutableList<ManagementTypeSelectionRow> rows, String source) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(footerDisclosureMarkdown, "footerDisclosureMarkdown");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(rows, "rows");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Loaded(title, subtitle, footerDisclosureMarkdown, brokerageAccountType, rows, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.footerDisclosureMarkdown, loaded.footerDisclosureMarkdown) && this.brokerageAccountType == loaded.brokerageAccountType && Intrinsics.areEqual(this.rows, loaded.rows) && Intrinsics.areEqual(this.source, loaded.source);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.footerDisclosureMarkdown.hashCode()) * 31) + this.brokerageAccountType.hashCode()) * 31) + this.rows.hashCode()) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", subtitle=" + this.subtitle + ", footerDisclosureMarkdown=" + this.footerDisclosureMarkdown + ", brokerageAccountType=" + this.brokerageAccountType + ", rows=" + this.rows + ", source=" + this.source + ")";
        }

        public Loaded(String title, String str, String footerDisclosureMarkdown, BrokerageAccountType brokerageAccountType, ImmutableList<ManagementTypeSelectionRow> rows, String source) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(footerDisclosureMarkdown, "footerDisclosureMarkdown");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(rows, "rows");
            Intrinsics.checkNotNullParameter(source, "source");
            this.title = title;
            this.subtitle = str;
            this.footerDisclosureMarkdown = footerDisclosureMarkdown;
            this.brokerageAccountType = brokerageAccountType;
            this.rows = rows;
            this.source = source;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getFooterDisclosureMarkdown() {
            return this.footerDisclosureMarkdown;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final ImmutableList<ManagementTypeSelectionRow> getRows() {
            return this.rows;
        }

        public final String getSource() {
            return this.source;
        }
    }
}
