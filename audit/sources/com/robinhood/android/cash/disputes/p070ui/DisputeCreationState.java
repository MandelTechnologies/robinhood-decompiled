package com.robinhood.android.cash.disputes.p070ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cash.disputes.extensions.DisputeQuestionnaires;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DisputeCreationState.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001:BS\u0012$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0018J\u0010\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u001eJ\u0010\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u0004J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u0004J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u0006\u0010&\u001a\u00020\u0018J\r\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0002\u0010)J%\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006HÂ\u0003J\t\u0010+\u001a\u00020\bHÂ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\fHÆ\u0003JU\u0010.\u001a\u00020\u00002$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fHÆ\u0001J\u0006\u0010/\u001a\u00020(J\u0013\u00100\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020(HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001J\u0016\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020(R*\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState;", "Landroid/os/Parcelable;", "questionResponses", "Ljava/util/HashMap;", "Ljava/util/UUID;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "Lkotlin/collections/HashMap;", "editingState", "Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState$EditingState;", "selectedQuestionnaire", "Lcom/robinhood/models/ui/DisputeQuestionnaire;", "selectedTransactionIds", "", "<init>", "(Ljava/util/HashMap;Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState$EditingState;Lcom/robinhood/models/ui/DisputeQuestionnaire;Ljava/util/List;)V", "getSelectedQuestionnaire", "()Lcom/robinhood/models/ui/DisputeQuestionnaire;", "setSelectedQuestionnaire", "(Lcom/robinhood/models/ui/DisputeQuestionnaire;)V", "getSelectedTransactionIds", "()Ljava/util/List;", "setSelectedTransactionIds", "(Ljava/util/List;)V", "saveQuestionResponse", "", "response", "resetQuestionResponses", "resetSelectedTransactions", "preselectedTransactionId", "shouldSkipTransactionSelection", "", "isMultiSelectQuestionnaire", "getPreviousQuestionResponse", "questionId", "getNextQuestion", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "nextQuestionId", "getCurrentQuestionResponses", "enterEditMode", "exitEditMode", "", "()Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "EditingState", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class DisputeCreationState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DisputeCreationState> CREATOR = new Creator();
    private EditingState editingState;
    private final HashMap<UUID, DisputeQuestionResponse> questionResponses;
    private DisputeQuestionnaire selectedQuestionnaire;
    private List<UUID> selectedTransactionIds;

    /* compiled from: DisputeCreationState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DisputeCreationState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisputeCreationState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            HashMap map = new HashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                map.put(parcel.readSerializable(), parcel.readParcelable(DisputeCreationState.class.getClassLoader()));
            }
            EditingState editingState = (EditingState) parcel.readParcelable(DisputeCreationState.class.getClassLoader());
            DisputeQuestionnaire disputeQuestionnaire = (DisputeQuestionnaire) parcel.readParcelable(DisputeCreationState.class.getClassLoader());
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(parcel.readSerializable());
            }
            return new DisputeCreationState(map, editingState, disputeQuestionnaire, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisputeCreationState[] newArray(int i) {
            return new DisputeCreationState[i];
        }
    }

    public DisputeCreationState() {
        this(null, null, null, null, 15, null);
    }

    private final HashMap<UUID, DisputeQuestionResponse> component1() {
        return this.questionResponses;
    }

    /* renamed from: component2, reason: from getter */
    private final EditingState getEditingState() {
        return this.editingState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisputeCreationState copy$default(DisputeCreationState disputeCreationState, HashMap map, EditingState editingState, DisputeQuestionnaire disputeQuestionnaire, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = disputeCreationState.questionResponses;
        }
        if ((i & 2) != 0) {
            editingState = disputeCreationState.editingState;
        }
        if ((i & 4) != 0) {
            disputeQuestionnaire = disputeCreationState.selectedQuestionnaire;
        }
        if ((i & 8) != 0) {
            list = disputeCreationState.selectedTransactionIds;
        }
        return disputeCreationState.copy(map, editingState, disputeQuestionnaire, list);
    }

    /* renamed from: component3, reason: from getter */
    public final DisputeQuestionnaire getSelectedQuestionnaire() {
        return this.selectedQuestionnaire;
    }

    public final List<UUID> component4() {
        return this.selectedTransactionIds;
    }

    public final DisputeCreationState copy(HashMap<UUID, DisputeQuestionResponse> questionResponses, EditingState editingState, DisputeQuestionnaire selectedQuestionnaire, List<UUID> selectedTransactionIds) {
        Intrinsics.checkNotNullParameter(questionResponses, "questionResponses");
        Intrinsics.checkNotNullParameter(editingState, "editingState");
        Intrinsics.checkNotNullParameter(selectedTransactionIds, "selectedTransactionIds");
        return new DisputeCreationState(questionResponses, editingState, selectedQuestionnaire, selectedTransactionIds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisputeCreationState)) {
            return false;
        }
        DisputeCreationState disputeCreationState = (DisputeCreationState) other;
        return Intrinsics.areEqual(this.questionResponses, disputeCreationState.questionResponses) && Intrinsics.areEqual(this.editingState, disputeCreationState.editingState) && Intrinsics.areEqual(this.selectedQuestionnaire, disputeCreationState.selectedQuestionnaire) && Intrinsics.areEqual(this.selectedTransactionIds, disputeCreationState.selectedTransactionIds);
    }

    public int hashCode() {
        int iHashCode = ((this.questionResponses.hashCode() * 31) + this.editingState.hashCode()) * 31;
        DisputeQuestionnaire disputeQuestionnaire = this.selectedQuestionnaire;
        return ((iHashCode + (disputeQuestionnaire == null ? 0 : disputeQuestionnaire.hashCode())) * 31) + this.selectedTransactionIds.hashCode();
    }

    public String toString() {
        return "DisputeCreationState(questionResponses=" + this.questionResponses + ", editingState=" + this.editingState + ", selectedQuestionnaire=" + this.selectedQuestionnaire + ", selectedTransactionIds=" + this.selectedTransactionIds + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        HashMap<UUID, DisputeQuestionResponse> map = this.questionResponses;
        dest.writeInt(map.size());
        for (Map.Entry<UUID, DisputeQuestionResponse> entry : map.entrySet()) {
            dest.writeSerializable(entry.getKey());
            dest.writeParcelable(entry.getValue(), flags);
        }
        dest.writeParcelable(this.editingState, flags);
        dest.writeParcelable(this.selectedQuestionnaire, flags);
        List<UUID> list = this.selectedTransactionIds;
        dest.writeInt(list.size());
        Iterator<UUID> it = list.iterator();
        while (it.hasNext()) {
            dest.writeSerializable(it.next());
        }
    }

    public DisputeCreationState(HashMap<UUID, DisputeQuestionResponse> questionResponses, EditingState editingState, DisputeQuestionnaire disputeQuestionnaire, List<UUID> selectedTransactionIds) {
        Intrinsics.checkNotNullParameter(questionResponses, "questionResponses");
        Intrinsics.checkNotNullParameter(editingState, "editingState");
        Intrinsics.checkNotNullParameter(selectedTransactionIds, "selectedTransactionIds");
        this.questionResponses = questionResponses;
        this.editingState = editingState;
        this.selectedQuestionnaire = disputeQuestionnaire;
        this.selectedTransactionIds = selectedTransactionIds;
    }

    public /* synthetic */ DisputeCreationState(HashMap map, EditingState editingState, DisputeQuestionnaire disputeQuestionnaire, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HashMap() : map, (i & 2) != 0 ? EditingState.NotEditing.INSTANCE : editingState, (i & 4) != 0 ? null : disputeQuestionnaire, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final DisputeQuestionnaire getSelectedQuestionnaire() {
        return this.selectedQuestionnaire;
    }

    public final void setSelectedQuestionnaire(DisputeQuestionnaire disputeQuestionnaire) {
        this.selectedQuestionnaire = disputeQuestionnaire;
    }

    public final List<UUID> getSelectedTransactionIds() {
        return this.selectedTransactionIds;
    }

    public final void setSelectedTransactionIds(List<UUID> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.selectedTransactionIds = list;
    }

    public final void saveQuestionResponse(DisputeQuestionResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.questionResponses.put(response.getQuestion().getId(), response);
        EditingState editingState = this.editingState;
        if (editingState instanceof EditingState.InEditMode) {
            EditingState.InEditMode inEditMode = (EditingState.InEditMode) editingState;
            inEditMode.setNumberOfEditedResponses(inEditMode.getNumberOfEditedResponses() + 1);
        }
    }

    public final void resetQuestionResponses() {
        this.questionResponses.clear();
    }

    public final void resetSelectedTransactions(UUID preselectedTransactionId) {
        List<UUID> listListOf;
        if (preselectedTransactionId == null) {
            listListOf = CollectionsKt.emptyList();
        } else {
            listListOf = CollectionsKt.listOf(preselectedTransactionId);
        }
        this.selectedTransactionIds = listListOf;
    }

    public final boolean shouldSkipTransactionSelection(UUID preselectedTransactionId, boolean isMultiSelectQuestionnaire) {
        return !isMultiSelectQuestionnaire && this.selectedTransactionIds.size() == 1 && CollectionsKt.contains(this.selectedTransactionIds, preselectedTransactionId);
    }

    public final DisputeQuestionResponse getPreviousQuestionResponse(UUID questionId) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        return this.questionResponses.get(questionId);
    }

    public final DisputeQuestionnaire.Question getNextQuestion(UUID nextQuestionId) {
        DisputeQuestionnaire disputeQuestionnaire;
        if (nextQuestionId == null) {
            return null;
        }
        EditingState editingState = this.editingState;
        if (editingState instanceof EditingState.InEditMode) {
            if (getPreviousQuestionResponse(nextQuestionId) != null || (disputeQuestionnaire = this.selectedQuestionnaire) == null) {
                return null;
            }
            return DisputeQuestionnaires.getNextQuestion(disputeQuestionnaire, nextQuestionId);
        }
        if (!Intrinsics.areEqual(editingState, EditingState.NotEditing.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        DisputeQuestionnaire disputeQuestionnaire2 = this.selectedQuestionnaire;
        if (disputeQuestionnaire2 != null) {
            return DisputeQuestionnaires.getNextQuestion(disputeQuestionnaire2, nextQuestionId);
        }
        return null;
    }

    public final List<DisputeQuestionResponse> getCurrentQuestionResponses() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Collection<DisputeQuestionResponse> collectionValues = this.questionResponses.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int index = ((DisputeQuestionResponse) next).getQuestion().getIndex();
                do {
                    Object next2 = it.next();
                    int index2 = ((DisputeQuestionResponse) next2).getQuestion().getIndex();
                    if (index > index2) {
                        next = next2;
                        index = index2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        DisputeQuestionResponse disputeQuestionResponse = (DisputeQuestionResponse) obj;
        while (disputeQuestionResponse != null) {
            arrayList.add(disputeQuestionResponse);
            disputeQuestionResponse = this.questionResponses.get(disputeQuestionResponse.getNextQuestionId());
        }
        return arrayList;
    }

    public final void enterEditMode() {
        this.editingState = new EditingState.InEditMode(0, 1, null);
    }

    public final Integer exitEditMode() {
        EditingState editingState = this.editingState;
        if (!(editingState instanceof EditingState.InEditMode)) {
            return null;
        }
        int numberOfEditedResponses = ((EditingState.InEditMode) editingState).getNumberOfEditedResponses();
        this.editingState = EditingState.NotEditing.INSTANCE;
        return Integer.valueOf(numberOfEditedResponses);
    }

    /* compiled from: DisputeCreationState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState$EditingState;", "Landroid/os/Parcelable;", "<init>", "()V", "NotEditing", "InEditMode", "Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState$EditingState$InEditMode;", "Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState$EditingState$NotEditing;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class EditingState implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ EditingState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private EditingState() {
        }

        /* compiled from: DisputeCreationState.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState$EditingState$NotEditing;", "Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState$EditingState;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NotEditing extends EditingState {
            public static final int $stable = 0;
            public static final NotEditing INSTANCE = new NotEditing();
            public static final Parcelable.Creator<NotEditing> CREATOR = new Creator();

            /* compiled from: DisputeCreationState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<NotEditing> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NotEditing createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NotEditing.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NotEditing[] newArray(int i) {
                    return new NotEditing[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private NotEditing() {
                super(null);
            }
        }

        /* compiled from: DisputeCreationState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState$EditingState$InEditMode;", "Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState$EditingState;", "numberOfEditedResponses", "", "<init>", "(I)V", "getNumberOfEditedResponses", "()I", "setNumberOfEditedResponses", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InEditMode extends EditingState {
            public static final int $stable = 8;
            public static final Parcelable.Creator<InEditMode> CREATOR = new Creator();
            private int numberOfEditedResponses;

            /* compiled from: DisputeCreationState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<InEditMode> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InEditMode createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InEditMode(parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InEditMode[] newArray(int i) {
                    return new InEditMode[i];
                }
            }

            public InEditMode() {
                this(0, 1, null);
            }

            public static /* synthetic */ InEditMode copy$default(InEditMode inEditMode, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = inEditMode.numberOfEditedResponses;
                }
                return inEditMode.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getNumberOfEditedResponses() {
                return this.numberOfEditedResponses;
            }

            public final InEditMode copy(int numberOfEditedResponses) {
                return new InEditMode(numberOfEditedResponses);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InEditMode) && this.numberOfEditedResponses == ((InEditMode) other).numberOfEditedResponses;
            }

            public int hashCode() {
                return Integer.hashCode(this.numberOfEditedResponses);
            }

            public String toString() {
                return "InEditMode(numberOfEditedResponses=" + this.numberOfEditedResponses + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.numberOfEditedResponses);
            }

            public InEditMode(int i) {
                super(null);
                this.numberOfEditedResponses = i;
            }

            public /* synthetic */ InEditMode(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0 : i);
            }

            public final int getNumberOfEditedResponses() {
                return this.numberOfEditedResponses;
            }

            public final void setNumberOfEditedResponses(int i) {
                this.numberOfEditedResponses = i;
            }
        }
    }
}
