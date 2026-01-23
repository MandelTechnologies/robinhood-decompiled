package com.robinhood.android.investorprofile.p162ui.questionnaire;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContextualQuestionInfo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "Landroid/os/Parcelable;", "Index", "Answers", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo$Answers;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo$Index;", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface ContextualQuestionInfo extends Parcelable {

    /* compiled from: ContextualQuestionInfo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u0003J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo$Index;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "value", "", "<init>", "(I)V", "getValue", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Index implements ContextualQuestionInfo {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Index> CREATOR = new Creator();
        private final int value;

        /* compiled from: ContextualQuestionInfo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Index> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Index createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Index(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Index[] newArray(int i) {
                return new Index[i];
            }
        }

        public static /* synthetic */ Index copy$default(Index index, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = index.value;
            }
            return index.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final Index copy(int value) {
            return new Index(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Index) && this.value == ((Index) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return "Index(value=" + this.value + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.value);
        }

        public Index(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: ContextualQuestionInfo.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo$Answers;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "answers", "", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "<init>", "(Ljava/util/List;)V", "getAnswers", "()Ljava/util/List;", "reduce", "answer", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Answers implements ContextualQuestionInfo {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Answers> CREATOR = new Creator();
        private final List<QuestionnaireAnswer> answers;

        /* compiled from: ContextualQuestionInfo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Answers> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Answers createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Answers.class.getClassLoader()));
                }
                return new Answers(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Answers[] newArray(int i) {
                return new Answers[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Answers copy$default(Answers answers, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = answers.answers;
            }
            return answers.copy(list);
        }

        public final List<QuestionnaireAnswer> component1() {
            return this.answers;
        }

        public final Answers copy(List<? extends QuestionnaireAnswer> answers) {
            Intrinsics.checkNotNullParameter(answers, "answers");
            return new Answers(answers);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Answers) && Intrinsics.areEqual(this.answers, ((Answers) other).answers);
        }

        public int hashCode() {
            return this.answers.hashCode();
        }

        public String toString() {
            return "Answers(answers=" + this.answers + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<QuestionnaireAnswer> list = this.answers;
            dest.writeInt(list.size());
            Iterator<QuestionnaireAnswer> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Answers(List<? extends QuestionnaireAnswer> answers) {
            Intrinsics.checkNotNullParameter(answers, "answers");
            this.answers = answers;
        }

        public final List<QuestionnaireAnswer> getAnswers() {
            return this.answers;
        }

        public final Answers reduce(QuestionnaireAnswer answer) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            return new Answers(CollectionsKt.plus((Collection) this.answers, (Iterable) CollectionsKt.listOf(answer)));
        }
    }
}
