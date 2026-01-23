package com.robinhood.android.investorprofile.p162ui.questionnaire.load;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadQuestionnaireArgs.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireArgs;", "Landroid/os/Parcelable;", "context", "", "accountNumber", "includeQuestionsAlreadyAnswered", "", "questionKey", "questionId", "questionGraph", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getContext", "()Ljava/lang/String;", "getAccountNumber", "getIncludeQuestionsAlreadyAnswered", "()Z", "getQuestionKey", "getQuestionId", "getQuestionGraph", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LoadQuestionnaireArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LoadQuestionnaireArgs> CREATOR = new Creator();
    private final String accountNumber;
    private final String context;
    private final boolean includeQuestionsAlreadyAnswered;
    private final Map<String, UiQuestionnaireQuestion.Supported> questionGraph;
    private final String questionId;
    private final String questionKey;

    /* compiled from: LoadQuestionnaireArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<LoadQuestionnaireArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoadQuestionnaireArgs createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(LoadQuestionnaireArgs.class.getClassLoader()));
                }
            }
            return new LoadQuestionnaireArgs(string2, string3, z, string4, string5, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoadQuestionnaireArgs[] newArray(int i) {
            return new LoadQuestionnaireArgs[i];
        }
    }

    public static /* synthetic */ LoadQuestionnaireArgs copy$default(LoadQuestionnaireArgs loadQuestionnaireArgs, String str, String str2, boolean z, String str3, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loadQuestionnaireArgs.context;
        }
        if ((i & 2) != 0) {
            str2 = loadQuestionnaireArgs.accountNumber;
        }
        if ((i & 4) != 0) {
            z = loadQuestionnaireArgs.includeQuestionsAlreadyAnswered;
        }
        if ((i & 8) != 0) {
            str3 = loadQuestionnaireArgs.questionKey;
        }
        if ((i & 16) != 0) {
            str4 = loadQuestionnaireArgs.questionId;
        }
        if ((i & 32) != 0) {
            map = loadQuestionnaireArgs.questionGraph;
        }
        String str5 = str4;
        Map map2 = map;
        return loadQuestionnaireArgs.copy(str, str2, z, str3, str5, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludeQuestionsAlreadyAnswered() {
        return this.includeQuestionsAlreadyAnswered;
    }

    /* renamed from: component4, reason: from getter */
    public final String getQuestionKey() {
        return this.questionKey;
    }

    /* renamed from: component5, reason: from getter */
    public final String getQuestionId() {
        return this.questionId;
    }

    public final Map<String, UiQuestionnaireQuestion.Supported> component6() {
        return this.questionGraph;
    }

    public final LoadQuestionnaireArgs copy(String context, String accountNumber, boolean includeQuestionsAlreadyAnswered, String questionKey, String questionId, Map<String, ? extends UiQuestionnaireQuestion.Supported> questionGraph) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new LoadQuestionnaireArgs(context, accountNumber, includeQuestionsAlreadyAnswered, questionKey, questionId, questionGraph);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadQuestionnaireArgs)) {
            return false;
        }
        LoadQuestionnaireArgs loadQuestionnaireArgs = (LoadQuestionnaireArgs) other;
        return Intrinsics.areEqual(this.context, loadQuestionnaireArgs.context) && Intrinsics.areEqual(this.accountNumber, loadQuestionnaireArgs.accountNumber) && this.includeQuestionsAlreadyAnswered == loadQuestionnaireArgs.includeQuestionsAlreadyAnswered && Intrinsics.areEqual(this.questionKey, loadQuestionnaireArgs.questionKey) && Intrinsics.areEqual(this.questionId, loadQuestionnaireArgs.questionId) && Intrinsics.areEqual(this.questionGraph, loadQuestionnaireArgs.questionGraph);
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        String str = this.accountNumber;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.includeQuestionsAlreadyAnswered)) * 31;
        String str2 = this.questionKey;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.questionId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, UiQuestionnaireQuestion.Supported> map = this.questionGraph;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "LoadQuestionnaireArgs(context=" + this.context + ", accountNumber=" + this.accountNumber + ", includeQuestionsAlreadyAnswered=" + this.includeQuestionsAlreadyAnswered + ", questionKey=" + this.questionKey + ", questionId=" + this.questionId + ", questionGraph=" + this.questionGraph + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.context);
        dest.writeString(this.accountNumber);
        dest.writeInt(this.includeQuestionsAlreadyAnswered ? 1 : 0);
        dest.writeString(this.questionKey);
        dest.writeString(this.questionId);
        Map<String, UiQuestionnaireQuestion.Supported> map = this.questionGraph;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, UiQuestionnaireQuestion.Supported> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeParcelable(entry.getValue(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoadQuestionnaireArgs(String context, String str, boolean z, String str2, String str3, Map<String, ? extends UiQuestionnaireQuestion.Supported> map) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.accountNumber = str;
        this.includeQuestionsAlreadyAnswered = z;
        this.questionKey = str2;
        this.questionId = str3;
        this.questionGraph = map;
    }

    public /* synthetic */ LoadQuestionnaireArgs(String str, String str2, boolean z, String str3, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : map);
    }

    public final String getContext() {
        return this.context;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getIncludeQuestionsAlreadyAnswered() {
        return this.includeQuestionsAlreadyAnswered;
    }

    public final String getQuestionKey() {
        return this.questionKey;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final Map<String, UiQuestionnaireQuestion.Supported> getQuestionGraph() {
        return this.questionGraph;
    }
}
