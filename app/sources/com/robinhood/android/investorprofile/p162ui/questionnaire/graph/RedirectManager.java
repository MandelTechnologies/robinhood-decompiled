package com.robinhood.android.investorprofile.p162ui.questionnaire.graph;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RedirectManager.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/RedirectManager;", "Landroid/os/Parcelable;", "pendingRedirects", "", "Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/QuestionnaireRedirect;", "processedRedirects", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getPendingRedirects", "()Ljava/util/List;", "getProcessedRedirects", "getNextQuestion", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "graph", "", "", "answer", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "shouldAnswerEntireQuestionnaire", "", "onBack", "", "describeContents", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class RedirectManager implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RedirectManager> CREATOR = new Creator();
    private final List<QuestionnaireRedirect> pendingRedirects;
    private final List<QuestionnaireRedirect> processedRedirects;

    /* compiled from: RedirectManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RedirectManager> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedirectManager createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(QuestionnaireRedirect.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(QuestionnaireRedirect.CREATOR.createFromParcel(parcel));
            }
            return new RedirectManager(arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedirectManager[] newArray(int i) {
            return new RedirectManager[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RedirectManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<QuestionnaireRedirect> list = this.pendingRedirects;
        dest.writeInt(list.size());
        Iterator<QuestionnaireRedirect> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        List<QuestionnaireRedirect> list2 = this.processedRedirects;
        dest.writeInt(list2.size());
        Iterator<QuestionnaireRedirect> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    public RedirectManager(List<QuestionnaireRedirect> pendingRedirects, List<QuestionnaireRedirect> processedRedirects) {
        Intrinsics.checkNotNullParameter(pendingRedirects, "pendingRedirects");
        Intrinsics.checkNotNullParameter(processedRedirects, "processedRedirects");
        this.pendingRedirects = pendingRedirects;
        this.processedRedirects = processedRedirects;
    }

    public /* synthetic */ RedirectManager(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }

    public final List<QuestionnaireRedirect> getPendingRedirects() {
        return this.pendingRedirects;
    }

    public final List<QuestionnaireRedirect> getProcessedRedirects() {
        return this.processedRedirects;
    }

    public final UiQuestionnaireQuestion.Supported getNextQuestion(Map<String, ? extends UiQuestionnaireQuestion.Supported> graph, QuestionnaireAnswer answer, boolean shouldAnswerEntireQuestionnaire) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(answer, "answer");
        return UtilKt.getNextQuestion(graph, this.pendingRedirects, this.processedRedirects, answer, shouldAnswerEntireQuestionnaire);
    }

    public final void onBack() {
        QuestionnaireRedirect questionnaireRedirect = (QuestionnaireRedirect) CollectionsKt.removeFirstOrNull(this.processedRedirects);
        if (questionnaireRedirect != null) {
            this.pendingRedirects.add(0, questionnaireRedirect);
        }
    }
}
