package com.robinhood.android.account.p060ui.documents;

import com.robinhood.models.p320db.Document;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyStatementsViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/account/ui/documents/RhyStatementsViewState;", "", "documents", "", "Lcom/robinhood/models/db/Document;", "uiError", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Ljava/util/List;Lcom/robinhood/udf/UiEvent;)V", "getDocuments", "()Ljava/util/List;", "getUiError", "()Lcom/robinhood/udf/UiEvent;", "showPlaceholder", "", "getShowPlaceholder", "()Z", "showEmptyState", "getShowEmptyState", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class RhyStatementsViewState {
    public static final int $stable = 8;
    private final List<Document> documents;
    private final UiEvent<Throwable> uiError;

    /* JADX WARN: Multi-variable type inference failed */
    public RhyStatementsViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RhyStatementsViewState copy$default(RhyStatementsViewState rhyStatementsViewState, List list, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rhyStatementsViewState.documents;
        }
        if ((i & 2) != 0) {
            uiEvent = rhyStatementsViewState.uiError;
        }
        return rhyStatementsViewState.copy(list, uiEvent);
    }

    public final List<Document> component1() {
        return this.documents;
    }

    public final UiEvent<Throwable> component2() {
        return this.uiError;
    }

    public final RhyStatementsViewState copy(List<Document> documents, UiEvent<Throwable> uiError) {
        return new RhyStatementsViewState(documents, uiError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyStatementsViewState)) {
            return false;
        }
        RhyStatementsViewState rhyStatementsViewState = (RhyStatementsViewState) other;
        return Intrinsics.areEqual(this.documents, rhyStatementsViewState.documents) && Intrinsics.areEqual(this.uiError, rhyStatementsViewState.uiError);
    }

    public int hashCode() {
        List<Document> list = this.documents;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        UiEvent<Throwable> uiEvent = this.uiError;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "RhyStatementsViewState(documents=" + this.documents + ", uiError=" + this.uiError + ")";
    }

    public RhyStatementsViewState(List<Document> list, UiEvent<Throwable> uiEvent) {
        this.documents = list;
        this.uiError = uiEvent;
    }

    public /* synthetic */ RhyStatementsViewState(List list, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : uiEvent);
    }

    public final List<Document> getDocuments() {
        return this.documents;
    }

    public final UiEvent<Throwable> getUiError() {
        return this.uiError;
    }

    public final boolean getShowPlaceholder() {
        return this.documents == null;
    }

    public final boolean getShowEmptyState() {
        List<Document> list = this.documents;
        return list != null && list.isEmpty();
    }
}
