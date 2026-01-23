package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import com.robinhood.models.p355ui.pathfinder.contexts.DocumentRequestsListContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentRequestsListDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState;", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequestsListContext;", "submittedDocumentRequestIds", "", "", "inputState", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState$InputState;", "<init>", "(Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequestsListContext;Ljava/util/List;Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState$InputState;)V", "getContext", "()Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequestsListContext;", "getSubmittedDocumentRequestIds", "()Ljava/util/List;", "getInputState", "()Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState$InputState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "InputState", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DocumentRequestsListDataState {
    public static final int $stable = 8;
    private final DocumentRequestsListContext context;
    private final InputState inputState;
    private final List<String> submittedDocumentRequestIds;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentRequestsListDataState copy$default(DocumentRequestsListDataState documentRequestsListDataState, DocumentRequestsListContext documentRequestsListContext, List list, InputState inputState, int i, Object obj) {
        if ((i & 1) != 0) {
            documentRequestsListContext = documentRequestsListDataState.context;
        }
        if ((i & 2) != 0) {
            list = documentRequestsListDataState.submittedDocumentRequestIds;
        }
        if ((i & 4) != 0) {
            inputState = documentRequestsListDataState.inputState;
        }
        return documentRequestsListDataState.copy(documentRequestsListContext, list, inputState);
    }

    /* renamed from: component1, reason: from getter */
    public final DocumentRequestsListContext getContext() {
        return this.context;
    }

    public final List<String> component2() {
        return this.submittedDocumentRequestIds;
    }

    /* renamed from: component3, reason: from getter */
    public final InputState getInputState() {
        return this.inputState;
    }

    public final DocumentRequestsListDataState copy(DocumentRequestsListContext context, List<String> submittedDocumentRequestIds, InputState inputState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(submittedDocumentRequestIds, "submittedDocumentRequestIds");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        return new DocumentRequestsListDataState(context, submittedDocumentRequestIds, inputState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentRequestsListDataState)) {
            return false;
        }
        DocumentRequestsListDataState documentRequestsListDataState = (DocumentRequestsListDataState) other;
        return Intrinsics.areEqual(this.context, documentRequestsListDataState.context) && Intrinsics.areEqual(this.submittedDocumentRequestIds, documentRequestsListDataState.submittedDocumentRequestIds) && this.inputState == documentRequestsListDataState.inputState;
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.submittedDocumentRequestIds.hashCode()) * 31) + this.inputState.hashCode();
    }

    public String toString() {
        return "DocumentRequestsListDataState(context=" + this.context + ", submittedDocumentRequestIds=" + this.submittedDocumentRequestIds + ", inputState=" + this.inputState + ")";
    }

    public DocumentRequestsListDataState(DocumentRequestsListContext context, List<String> submittedDocumentRequestIds, InputState inputState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(submittedDocumentRequestIds, "submittedDocumentRequestIds");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        this.context = context;
        this.submittedDocumentRequestIds = submittedDocumentRequestIds;
        this.inputState = inputState;
    }

    public final DocumentRequestsListContext getContext() {
        return this.context;
    }

    public final List<String> getSubmittedDocumentRequestIds() {
        return this.submittedDocumentRequestIds;
    }

    public final InputState getInputState() {
        return this.inputState;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DocumentRequestsListDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState$InputState;", "", "<init>", "(Ljava/lang/String;I)V", "InputNotSent", "SendingInput", "SendInputSuccess", "SendInputFailed", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InputState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputState[] $VALUES;
        public static final InputState InputNotSent = new InputState("InputNotSent", 0);
        public static final InputState SendingInput = new InputState("SendingInput", 1);
        public static final InputState SendInputSuccess = new InputState("SendInputSuccess", 2);
        public static final InputState SendInputFailed = new InputState("SendInputFailed", 3);

        private static final /* synthetic */ InputState[] $values() {
            return new InputState[]{InputNotSent, SendingInput, SendInputSuccess, SendInputFailed};
        }

        public static EnumEntries<InputState> getEntries() {
            return $ENTRIES;
        }

        private InputState(String str, int i) {
        }

        static {
            InputState[] inputStateArr$values = $values();
            $VALUES = inputStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inputStateArr$values);
        }

        public static InputState valueOf(String str) {
            return (InputState) Enum.valueOf(InputState.class, str);
        }

        public static InputState[] values() {
            return (InputState[]) $VALUES.clone();
        }
    }
}
