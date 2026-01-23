package com.robinhood.shared.questionnaire.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract2;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireContract.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult;", "Lcom/robinhood/android/navigation/contracts/ActivityResult;", "Landroid/os/Parcelable;", "<init>", "()V", "Completed", "Canceled", "Error", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult$Canceled;", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult$Completed;", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult$Error;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.questionnaire.contracts.QuestionnaireResult, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class QuestionnaireContract2 implements NavigationActivityResultContract2, Parcelable {
    public /* synthetic */ QuestionnaireContract2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private QuestionnaireContract2() {
    }

    /* compiled from: QuestionnaireContract.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u000eHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult$Completed;", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult;", "productContext", "", "questionAnswers", "", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getProductContext", "()Ljava/lang/String;", "getQuestionAnswers", "()Ljava/util/List;", "resultCode", "", "getResultCode", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.questionnaire.contracts.QuestionnaireResult$Completed, reason: from toString */
    public static final /* data */ class Completed extends QuestionnaireContract2 {
        public static final Parcelable.Creator<Completed> CREATOR = new Creator();
        private final String productContext;
        private final List<QuestionnaireAnswer> questionAnswers;

        /* compiled from: QuestionnaireContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.questionnaire.contracts.QuestionnaireResult$Completed$Creator */
        public static final class Creator implements Parcelable.Creator<Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Completed.class.getClassLoader()));
                }
                return new Completed(string2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed[] newArray(int i) {
                return new Completed[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Completed copy$default(Completed completed, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = completed.productContext;
            }
            if ((i & 2) != 0) {
                list = completed.questionAnswers;
            }
            return completed.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProductContext() {
            return this.productContext;
        }

        public final List<QuestionnaireAnswer> component2() {
            return this.questionAnswers;
        }

        public final Completed copy(String productContext, List<? extends QuestionnaireAnswer> questionAnswers) {
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(questionAnswers, "questionAnswers");
            return new Completed(productContext, questionAnswers);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) other;
            return Intrinsics.areEqual(this.productContext, completed.productContext) && Intrinsics.areEqual(this.questionAnswers, completed.questionAnswers);
        }

        @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
        public int getResultCode() {
            return -1;
        }

        public int hashCode() {
            return (this.productContext.hashCode() * 31) + this.questionAnswers.hashCode();
        }

        public String toString() {
            return "Completed(productContext=" + this.productContext + ", questionAnswers=" + this.questionAnswers + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.productContext);
            List<QuestionnaireAnswer> list = this.questionAnswers;
            dest.writeInt(list.size());
            Iterator<QuestionnaireAnswer> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public final String getProductContext() {
            return this.productContext;
        }

        public final List<QuestionnaireAnswer> getQuestionAnswers() {
            return this.questionAnswers;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Completed(String productContext, List<? extends QuestionnaireAnswer> questionAnswers) {
            super(null);
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(questionAnswers, "questionAnswers");
            this.productContext = productContext;
            this.questionAnswers = questionAnswers;
        }
    }

    /* compiled from: QuestionnaireContract.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\tJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult$Canceled;", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult;", "productContext", "", "<init>", "(Ljava/lang/String;)V", "getProductContext", "()Ljava/lang/String;", "resultCode", "", "getResultCode", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.questionnaire.contracts.QuestionnaireResult$Canceled, reason: from toString */
    public static final /* data */ class Canceled extends QuestionnaireContract2 {
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        private final String productContext;

        /* compiled from: QuestionnaireContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.questionnaire.contracts.QuestionnaireResult$Canceled$Creator */
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Canceled(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        public static /* synthetic */ Canceled copy$default(Canceled canceled, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = canceled.productContext;
            }
            return canceled.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProductContext() {
            return this.productContext;
        }

        public final Canceled copy(String productContext) {
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            return new Canceled(productContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Canceled) && Intrinsics.areEqual(this.productContext, ((Canceled) other).productContext);
        }

        @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
        public int getResultCode() {
            return 0;
        }

        public int hashCode() {
            return this.productContext.hashCode();
        }

        public String toString() {
            return "Canceled(productContext=" + this.productContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.productContext);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Canceled(String productContext) {
            super(null);
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            this.productContext = productContext;
        }

        public final String getProductContext() {
            return this.productContext;
        }
    }

    /* compiled from: QuestionnaireContract.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\tJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult$Error;", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "resultCode", "", "getResultCode", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.questionnaire.contracts.QuestionnaireResult$Error, reason: from toString */
    public static final /* data */ class Error extends QuestionnaireContract2 {
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        private final Throwable error;

        /* compiled from: QuestionnaireContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.questionnaire.contracts.QuestionnaireResult$Error$Creator */
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error((Throwable) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
        public int getResultCode() {
            return 0;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.error);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
