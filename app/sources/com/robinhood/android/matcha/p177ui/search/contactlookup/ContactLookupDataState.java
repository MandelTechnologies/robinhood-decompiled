package com.robinhood.android.matcha.p177ui.search.contactlookup;

import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.store.matcha.MatchaSearchStore;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactLookupDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDataState;", "", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "searchResponse", "Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;", "selectedUserId", "", "<init>", "(Lcom/robinhood/android/matcha/models/ui/Transactor;Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;Ljava/lang/String;)V", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", "getSearchResponse", "()Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;", "getSelectedUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ContactLookupDataState {
    public static final int $stable = 8;
    private final MatchaSearchStore.SearchResponse searchResponse;
    private final String selectedUserId;
    private final Transactor transactor;

    public static /* synthetic */ ContactLookupDataState copy$default(ContactLookupDataState contactLookupDataState, Transactor transactor, MatchaSearchStore.SearchResponse searchResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            transactor = contactLookupDataState.transactor;
        }
        if ((i & 2) != 0) {
            searchResponse = contactLookupDataState.searchResponse;
        }
        if ((i & 4) != 0) {
            str = contactLookupDataState.selectedUserId;
        }
        return contactLookupDataState.copy(transactor, searchResponse, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Transactor getTransactor() {
        return this.transactor;
    }

    /* renamed from: component2, reason: from getter */
    public final MatchaSearchStore.SearchResponse getSearchResponse() {
        return this.searchResponse;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedUserId() {
        return this.selectedUserId;
    }

    public final ContactLookupDataState copy(Transactor transactor, MatchaSearchStore.SearchResponse searchResponse, String selectedUserId) {
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        return new ContactLookupDataState(transactor, searchResponse, selectedUserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactLookupDataState)) {
            return false;
        }
        ContactLookupDataState contactLookupDataState = (ContactLookupDataState) other;
        return Intrinsics.areEqual(this.transactor, contactLookupDataState.transactor) && Intrinsics.areEqual(this.searchResponse, contactLookupDataState.searchResponse) && Intrinsics.areEqual(this.selectedUserId, contactLookupDataState.selectedUserId);
    }

    public int hashCode() {
        int iHashCode = this.transactor.hashCode() * 31;
        MatchaSearchStore.SearchResponse searchResponse = this.searchResponse;
        int iHashCode2 = (iHashCode + (searchResponse == null ? 0 : searchResponse.hashCode())) * 31;
        String str = this.selectedUserId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ContactLookupDataState(transactor=" + this.transactor + ", searchResponse=" + this.searchResponse + ", selectedUserId=" + this.selectedUserId + ")";
    }

    public ContactLookupDataState(Transactor transactor, MatchaSearchStore.SearchResponse searchResponse, String str) {
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        this.transactor = transactor;
        this.searchResponse = searchResponse;
        this.selectedUserId = str;
    }

    public /* synthetic */ ContactLookupDataState(Transactor transactor, MatchaSearchStore.SearchResponse searchResponse, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transactor, (i & 2) != 0 ? null : searchResponse, (i & 4) != 0 ? null : str);
    }

    public final Transactor getTransactor() {
        return this.transactor;
    }

    public final MatchaSearchStore.SearchResponse getSearchResponse() {
        return this.searchResponse;
    }

    public final String getSelectedUserId() {
        return this.selectedUserId;
    }
}
