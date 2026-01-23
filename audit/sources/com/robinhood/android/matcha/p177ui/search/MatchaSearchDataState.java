package com.robinhood.android.matcha.p177ui.search;

import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.store.matcha.MatchaSearchStore;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.p320db.matcha.MatchaSearchUser;
import com.robinhood.models.util.Money;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaSearchDataState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00160\rHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010>\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010/J®\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0018HÖ\u0001J\t\u0010D\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001cR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u00100\u001a\u0004\b1\u0010/¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;", "", "isMultiuserUi", "", "amount", "Lcom/robinhood/models/util/Money;", "direction", "Lcom/robinhood/android/matcha/ui/models/Direction;", "query", "", "searchResponse", "Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;", "emptyStateConnections", "", "Lcom/robinhood/models/db/matcha/MatchaSearchUser;", "contactSearchResults", "Lcom/robinhood/models/contacts/ReferralContact;", "contactsEnabled", "incentivesSummary", "Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "isMatchaIncentivesExperimentMember", "transactors", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "selectedTransactorIndex", "", "contactLookupId", "<init>", "(ZLcom/robinhood/models/util/Money;Lcom/robinhood/android/matcha/ui/models/Direction;Ljava/lang/String;Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;ZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "()Z", "getAmount", "()Lcom/robinhood/models/util/Money;", "getDirection", "()Lcom/robinhood/android/matcha/ui/models/Direction;", "getQuery", "()Ljava/lang/String;", "getSearchResponse", "()Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;", "getEmptyStateConnections", "()Ljava/util/List;", "getContactSearchResults", "getContactsEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIncentivesSummary", "()Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "getTransactors", "getSelectedTransactorIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContactLookupId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(ZLcom/robinhood/models/util/Money;Lcom/robinhood/android/matcha/ui/models/Direction;Ljava/lang/String;Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;ZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;", "equals", "other", "hashCode", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaSearchDataState {
    public static final int $stable = 8;
    private final Money amount;
    private final Integer contactLookupId;
    private final List<ReferralContact> contactSearchResults;
    private final Boolean contactsEnabled;
    private final Direction direction;
    private final List<MatchaSearchUser> emptyStateConnections;
    private final MatchaIncentivesSummary incentivesSummary;
    private final boolean isMatchaIncentivesExperimentMember;
    private final boolean isMultiuserUi;
    private final String query;
    private final MatchaSearchStore.SearchResponse searchResponse;
    private final Integer selectedTransactorIndex;
    private final List<Transactor> transactors;

    public static /* synthetic */ MatchaSearchDataState copy$default(MatchaSearchDataState matchaSearchDataState, boolean z, Money money, Direction direction, String str, MatchaSearchStore.SearchResponse searchResponse, List list, List list2, Boolean bool, MatchaIncentivesSummary matchaIncentivesSummary, boolean z2, List list3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = matchaSearchDataState.isMultiuserUi;
        }
        return matchaSearchDataState.copy(z, (i & 2) != 0 ? matchaSearchDataState.amount : money, (i & 4) != 0 ? matchaSearchDataState.direction : direction, (i & 8) != 0 ? matchaSearchDataState.query : str, (i & 16) != 0 ? matchaSearchDataState.searchResponse : searchResponse, (i & 32) != 0 ? matchaSearchDataState.emptyStateConnections : list, (i & 64) != 0 ? matchaSearchDataState.contactSearchResults : list2, (i & 128) != 0 ? matchaSearchDataState.contactsEnabled : bool, (i & 256) != 0 ? matchaSearchDataState.incentivesSummary : matchaIncentivesSummary, (i & 512) != 0 ? matchaSearchDataState.isMatchaIncentivesExperimentMember : z2, (i & 1024) != 0 ? matchaSearchDataState.transactors : list3, (i & 2048) != 0 ? matchaSearchDataState.selectedTransactorIndex : num, (i & 4096) != 0 ? matchaSearchDataState.contactLookupId : num2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsMultiuserUi() {
        return this.isMultiuserUi;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsMatchaIncentivesExperimentMember() {
        return this.isMatchaIncentivesExperimentMember;
    }

    public final List<Transactor> component11() {
        return this.transactors;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getSelectedTransactorIndex() {
        return this.selectedTransactorIndex;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getContactLookupId() {
        return this.contactLookupId;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    /* renamed from: component4, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component5, reason: from getter */
    public final MatchaSearchStore.SearchResponse getSearchResponse() {
        return this.searchResponse;
    }

    public final List<MatchaSearchUser> component6() {
        return this.emptyStateConnections;
    }

    public final List<ReferralContact> component7() {
        return this.contactSearchResults;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getContactsEnabled() {
        return this.contactsEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final MatchaIncentivesSummary getIncentivesSummary() {
        return this.incentivesSummary;
    }

    public final MatchaSearchDataState copy(boolean isMultiuserUi, Money amount, Direction direction, String query, MatchaSearchStore.SearchResponse searchResponse, List<MatchaSearchUser> emptyStateConnections, List<ReferralContact> contactSearchResults, Boolean contactsEnabled, MatchaIncentivesSummary incentivesSummary, boolean isMatchaIncentivesExperimentMember, List<? extends Transactor> transactors, Integer selectedTransactorIndex, Integer contactLookupId) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(emptyStateConnections, "emptyStateConnections");
        Intrinsics.checkNotNullParameter(contactSearchResults, "contactSearchResults");
        Intrinsics.checkNotNullParameter(transactors, "transactors");
        return new MatchaSearchDataState(isMultiuserUi, amount, direction, query, searchResponse, emptyStateConnections, contactSearchResults, contactsEnabled, incentivesSummary, isMatchaIncentivesExperimentMember, transactors, selectedTransactorIndex, contactLookupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaSearchDataState)) {
            return false;
        }
        MatchaSearchDataState matchaSearchDataState = (MatchaSearchDataState) other;
        return this.isMultiuserUi == matchaSearchDataState.isMultiuserUi && Intrinsics.areEqual(this.amount, matchaSearchDataState.amount) && this.direction == matchaSearchDataState.direction && Intrinsics.areEqual(this.query, matchaSearchDataState.query) && Intrinsics.areEqual(this.searchResponse, matchaSearchDataState.searchResponse) && Intrinsics.areEqual(this.emptyStateConnections, matchaSearchDataState.emptyStateConnections) && Intrinsics.areEqual(this.contactSearchResults, matchaSearchDataState.contactSearchResults) && Intrinsics.areEqual(this.contactsEnabled, matchaSearchDataState.contactsEnabled) && Intrinsics.areEqual(this.incentivesSummary, matchaSearchDataState.incentivesSummary) && this.isMatchaIncentivesExperimentMember == matchaSearchDataState.isMatchaIncentivesExperimentMember && Intrinsics.areEqual(this.transactors, matchaSearchDataState.transactors) && Intrinsics.areEqual(this.selectedTransactorIndex, matchaSearchDataState.selectedTransactorIndex) && Intrinsics.areEqual(this.contactLookupId, matchaSearchDataState.contactLookupId);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isMultiuserUi) * 31;
        Money money = this.amount;
        int iHashCode2 = (((((iHashCode + (money == null ? 0 : money.hashCode())) * 31) + this.direction.hashCode()) * 31) + this.query.hashCode()) * 31;
        MatchaSearchStore.SearchResponse searchResponse = this.searchResponse;
        int iHashCode3 = (((((iHashCode2 + (searchResponse == null ? 0 : searchResponse.hashCode())) * 31) + this.emptyStateConnections.hashCode()) * 31) + this.contactSearchResults.hashCode()) * 31;
        Boolean bool = this.contactsEnabled;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        MatchaIncentivesSummary matchaIncentivesSummary = this.incentivesSummary;
        int iHashCode5 = (((((iHashCode4 + (matchaIncentivesSummary == null ? 0 : matchaIncentivesSummary.hashCode())) * 31) + Boolean.hashCode(this.isMatchaIncentivesExperimentMember)) * 31) + this.transactors.hashCode()) * 31;
        Integer num = this.selectedTransactorIndex;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.contactLookupId;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "MatchaSearchDataState(isMultiuserUi=" + this.isMultiuserUi + ", amount=" + this.amount + ", direction=" + this.direction + ", query=" + this.query + ", searchResponse=" + this.searchResponse + ", emptyStateConnections=" + this.emptyStateConnections + ", contactSearchResults=" + this.contactSearchResults + ", contactsEnabled=" + this.contactsEnabled + ", incentivesSummary=" + this.incentivesSummary + ", isMatchaIncentivesExperimentMember=" + this.isMatchaIncentivesExperimentMember + ", transactors=" + this.transactors + ", selectedTransactorIndex=" + this.selectedTransactorIndex + ", contactLookupId=" + this.contactLookupId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchaSearchDataState(boolean z, Money money, Direction direction, String query, MatchaSearchStore.SearchResponse searchResponse, List<MatchaSearchUser> emptyStateConnections, List<ReferralContact> contactSearchResults, Boolean bool, MatchaIncentivesSummary matchaIncentivesSummary, boolean z2, List<? extends Transactor> transactors, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(emptyStateConnections, "emptyStateConnections");
        Intrinsics.checkNotNullParameter(contactSearchResults, "contactSearchResults");
        Intrinsics.checkNotNullParameter(transactors, "transactors");
        this.isMultiuserUi = z;
        this.amount = money;
        this.direction = direction;
        this.query = query;
        this.searchResponse = searchResponse;
        this.emptyStateConnections = emptyStateConnections;
        this.contactSearchResults = contactSearchResults;
        this.contactsEnabled = bool;
        this.incentivesSummary = matchaIncentivesSummary;
        this.isMatchaIncentivesExperimentMember = z2;
        this.transactors = transactors;
        this.selectedTransactorIndex = num;
        this.contactLookupId = num2;
    }

    public final boolean isMultiuserUi() {
        return this.isMultiuserUi;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public /* synthetic */ MatchaSearchDataState(boolean z, Money money, Direction direction, String str, MatchaSearchStore.SearchResponse searchResponse, List list, List list2, Boolean bool, MatchaIncentivesSummary matchaIncentivesSummary, boolean z2, List list3, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : money, direction, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : searchResponse, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : matchaIncentivesSummary, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? CollectionsKt.emptyList() : list3, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : num2);
    }

    public final String getQuery() {
        return this.query;
    }

    public final MatchaSearchStore.SearchResponse getSearchResponse() {
        return this.searchResponse;
    }

    public final List<MatchaSearchUser> getEmptyStateConnections() {
        return this.emptyStateConnections;
    }

    public final List<ReferralContact> getContactSearchResults() {
        return this.contactSearchResults;
    }

    public final Boolean getContactsEnabled() {
        return this.contactsEnabled;
    }

    public final MatchaIncentivesSummary getIncentivesSummary() {
        return this.incentivesSummary;
    }

    public final boolean isMatchaIncentivesExperimentMember() {
        return this.isMatchaIncentivesExperimentMember;
    }

    public final List<Transactor> getTransactors() {
        return this.transactors;
    }

    public final Integer getSelectedTransactorIndex() {
        return this.selectedTransactorIndex;
    }

    public final Integer getContactLookupId() {
        return this.contactLookupId;
    }
}
