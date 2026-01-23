package com.robinhood.android.taxcenter.previousdocuments;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.NavigationRow;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreviousTaxDocumentsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState;", "", "<init>", "()V", "Loading", "Empty", "DocumentList", "Companion", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState$DocumentList;", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState$Empty;", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState$Loading;", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class PreviousTaxDocumentsViewState {
    public static final int $stable = 0;
    private static final DocumentList loadingMock = new DocumentList(StringResource.INSTANCE.invoke("--- ----- ----"), "----", CollectionsKt.listOf("----"), CollectionsKt.listOf(new NavigationRow("--------- ------- ------------ -----------", "----- ------ -- ----- -- ----", null, false, null, 28, null)));

    public /* synthetic */ PreviousTaxDocumentsViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PreviousTaxDocumentsViewState() {
    }

    /* compiled from: PreviousTaxDocumentsViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState$Loading;", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState;", "mock", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState$DocumentList;", "<init>", "(Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState$DocumentList;)V", "getMock", "()Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState$DocumentList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends PreviousTaxDocumentsViewState {
        public static final int $stable = 8;
        private final DocumentList mock;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, DocumentList documentList, int i, Object obj) {
            if ((i & 1) != 0) {
                documentList = loading.mock;
            }
            return loading.copy(documentList);
        }

        /* renamed from: component1, reason: from getter */
        public final DocumentList getMock() {
            return this.mock;
        }

        public final Loading copy(DocumentList mock) {
            Intrinsics.checkNotNullParameter(mock, "mock");
            return new Loading(mock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.mock, ((Loading) other).mock);
        }

        public int hashCode() {
            return this.mock.hashCode();
        }

        public String toString() {
            return "Loading(mock=" + this.mock + ")";
        }

        public /* synthetic */ Loading(DocumentList documentList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PreviousTaxDocumentsViewState.loadingMock : documentList);
        }

        public final DocumentList getMock() {
            return this.mock;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(DocumentList mock) {
            super(null);
            Intrinsics.checkNotNullParameter(mock, "mock");
            this.mock = mock;
        }
    }

    /* compiled from: PreviousTaxDocumentsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState$Empty;", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty extends PreviousTaxDocumentsViewState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return 1898918072;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
            super(null);
        }
    }

    /* compiled from: PreviousTaxDocumentsViewState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState$DocumentList;", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState;", "displayYear", "Lcom/robinhood/utils/resource/StringResource;", "activeYear", "", "yearList", "", "content", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getDisplayYear", "()Lcom/robinhood/utils/resource/StringResource;", "getActiveYear", "()Ljava/lang/String;", "getYearList", "()Ljava/util/List;", "getContent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DocumentList extends PreviousTaxDocumentsViewState {
        public static final int $stable = 8;
        private final String activeYear;
        private final List<UIComponent<GenericAction>> content;
        private final StringResource displayYear;
        private final List<String> yearList;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DocumentList copy$default(DocumentList documentList, StringResource stringResource, String str, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = documentList.displayYear;
            }
            if ((i & 2) != 0) {
                str = documentList.activeYear;
            }
            if ((i & 4) != 0) {
                list = documentList.yearList;
            }
            if ((i & 8) != 0) {
                list2 = documentList.content;
            }
            return documentList.copy(stringResource, str, list, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getDisplayYear() {
            return this.displayYear;
        }

        /* renamed from: component2, reason: from getter */
        public final String getActiveYear() {
            return this.activeYear;
        }

        public final List<String> component3() {
            return this.yearList;
        }

        public final List<UIComponent<GenericAction>> component4() {
            return this.content;
        }

        public final DocumentList copy(StringResource displayYear, String activeYear, List<String> yearList, List<? extends UIComponent<? extends GenericAction>> content) {
            Intrinsics.checkNotNullParameter(displayYear, "displayYear");
            Intrinsics.checkNotNullParameter(activeYear, "activeYear");
            Intrinsics.checkNotNullParameter(yearList, "yearList");
            Intrinsics.checkNotNullParameter(content, "content");
            return new DocumentList(displayYear, activeYear, yearList, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentList)) {
                return false;
            }
            DocumentList documentList = (DocumentList) other;
            return Intrinsics.areEqual(this.displayYear, documentList.displayYear) && Intrinsics.areEqual(this.activeYear, documentList.activeYear) && Intrinsics.areEqual(this.yearList, documentList.yearList) && Intrinsics.areEqual(this.content, documentList.content);
        }

        public int hashCode() {
            return (((((this.displayYear.hashCode() * 31) + this.activeYear.hashCode()) * 31) + this.yearList.hashCode()) * 31) + this.content.hashCode();
        }

        public String toString() {
            return "DocumentList(displayYear=" + this.displayYear + ", activeYear=" + this.activeYear + ", yearList=" + this.yearList + ", content=" + this.content + ")";
        }

        public final StringResource getDisplayYear() {
            return this.displayYear;
        }

        public final String getActiveYear() {
            return this.activeYear;
        }

        public final List<String> getYearList() {
            return this.yearList;
        }

        public final List<UIComponent<GenericAction>> getContent() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DocumentList(StringResource displayYear, String activeYear, List<String> yearList, List<? extends UIComponent<? extends GenericAction>> content) {
            super(null);
            Intrinsics.checkNotNullParameter(displayYear, "displayYear");
            Intrinsics.checkNotNullParameter(activeYear, "activeYear");
            Intrinsics.checkNotNullParameter(yearList, "yearList");
            Intrinsics.checkNotNullParameter(content, "content");
            this.displayYear = displayYear;
            this.activeYear = activeYear;
            this.yearList = yearList;
            this.content = content;
        }
    }
}
