package com.robinhood.android.cash.disputes.p070ui.reason;

import com.robinhood.models.p355ui.DisputeQuestionnaire;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisputeReasonSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState$Error;", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState$Loaded;", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState$Loading;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class DisputeReasonSelectionViewState {
    public static final int $stable = 0;

    public /* synthetic */ DisputeReasonSelectionViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DisputeReasonSelectionViewState() {
    }

    /* compiled from: DisputeReasonSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState$Loading;", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends DisputeReasonSelectionViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: DisputeReasonSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState$Loaded;", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState;", "displayTitle", "", "questionnaires", "", "Lcom/robinhood/models/ui/DisputeQuestionnaire;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDisplayTitle", "()Ljava/lang/String;", "getQuestionnaires", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends DisputeReasonSelectionViewState {
        public static final int $stable = 8;
        private final String displayTitle;
        private final List<DisputeQuestionnaire> questionnaires;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.displayTitle;
            }
            if ((i & 2) != 0) {
                list = loaded.questionnaires;
            }
            return loaded.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        public final List<DisputeQuestionnaire> component2() {
            return this.questionnaires;
        }

        public final Loaded copy(String displayTitle, List<DisputeQuestionnaire> questionnaires) {
            Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
            Intrinsics.checkNotNullParameter(questionnaires, "questionnaires");
            return new Loaded(displayTitle, questionnaires);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.displayTitle, loaded.displayTitle) && Intrinsics.areEqual(this.questionnaires, loaded.questionnaires);
        }

        public int hashCode() {
            return (this.displayTitle.hashCode() * 31) + this.questionnaires.hashCode();
        }

        public String toString() {
            return "Loaded(displayTitle=" + this.displayTitle + ", questionnaires=" + this.questionnaires + ")";
        }

        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        public final List<DisputeQuestionnaire> getQuestionnaires() {
            return this.questionnaires;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(String displayTitle, List<DisputeQuestionnaire> questionnaires) {
            super(null);
            Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
            Intrinsics.checkNotNullParameter(questionnaires, "questionnaires");
            this.displayTitle = displayTitle;
            this.questionnaires = questionnaires;
        }
    }

    /* compiled from: DisputeReasonSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState$Error;", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends DisputeReasonSelectionViewState {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
