package com.robinhood.android.cash.disputes.p070ui.review;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: DisputeReviewViewState.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0003345B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&J\t\u0010'\u001a\u00020\u0003HÂ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\t\u0010)\u001a\u00020\bHÂ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÂ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Je\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\bHÖ\u0001J\t\u00102\u001a\u00020\u0017HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00058F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState;", "", "questionnaire", "Lcom/robinhood/models/ui/DisputeQuestionnaire;", "questionResponses", "", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "selectedTransactionCount", "", "selectedTransactions", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "isTransactionListVisible", "", "isDisputeSubmitLoading", "disputeSubmitResult", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$DisputeSubmitResult;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire;Ljava/util/List;ILjava/util/List;ZZLcom/robinhood/udf/UiEvent;)V", "()Z", "getDisputeSubmitResult", "()Lcom/robinhood/udf/UiEvent;", "disputeReason", "", "getDisputeReason", "()Ljava/lang/String;", "isSingleTransactionRowVisible", "isMultiTransactionHeaderRowVisible", "selectedTransactionState", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$SelectedTransactionState;", "getSelectedTransactionState", "()Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$SelectedTransactionState;", "reviewResponses", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$ReviewQuestionResponse;", "getReviewResponses", "()Ljava/util/List;", "getTitleText", "resources", "Landroid/content/res/Resources;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "ReviewQuestionResponse", "SelectedTransactionState", "DisputeSubmitResult", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class DisputeReviewViewState {
    public static final int $stable = 8;
    private final UiEvent<DisputeSubmitResult> disputeSubmitResult;
    private final boolean isDisputeSubmitLoading;
    private final boolean isTransactionListVisible;
    private final List<DisputeQuestionResponse> questionResponses;
    private final DisputeQuestionnaire questionnaire;
    private final int selectedTransactionCount;
    private final List<SettledCardTransaction> selectedTransactions;

    /* renamed from: component1, reason: from getter */
    private final DisputeQuestionnaire getQuestionnaire() {
        return this.questionnaire;
    }

    private final List<DisputeQuestionResponse> component2() {
        return this.questionResponses;
    }

    /* renamed from: component3, reason: from getter */
    private final int getSelectedTransactionCount() {
        return this.selectedTransactionCount;
    }

    private final List<SettledCardTransaction> component4() {
        return this.selectedTransactions;
    }

    public static /* synthetic */ DisputeReviewViewState copy$default(DisputeReviewViewState disputeReviewViewState, DisputeQuestionnaire disputeQuestionnaire, List list, int i, List list2, boolean z, boolean z2, UiEvent uiEvent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            disputeQuestionnaire = disputeReviewViewState.questionnaire;
        }
        if ((i2 & 2) != 0) {
            list = disputeReviewViewState.questionResponses;
        }
        if ((i2 & 4) != 0) {
            i = disputeReviewViewState.selectedTransactionCount;
        }
        if ((i2 & 8) != 0) {
            list2 = disputeReviewViewState.selectedTransactions;
        }
        if ((i2 & 16) != 0) {
            z = disputeReviewViewState.isTransactionListVisible;
        }
        if ((i2 & 32) != 0) {
            z2 = disputeReviewViewState.isDisputeSubmitLoading;
        }
        if ((i2 & 64) != 0) {
            uiEvent = disputeReviewViewState.disputeSubmitResult;
        }
        boolean z3 = z2;
        UiEvent uiEvent2 = uiEvent;
        boolean z4 = z;
        int i3 = i;
        return disputeReviewViewState.copy(disputeQuestionnaire, list, i3, list2, z4, z3, uiEvent2);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsTransactionListVisible() {
        return this.isTransactionListVisible;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsDisputeSubmitLoading() {
        return this.isDisputeSubmitLoading;
    }

    public final UiEvent<DisputeSubmitResult> component7() {
        return this.disputeSubmitResult;
    }

    public final DisputeReviewViewState copy(DisputeQuestionnaire questionnaire, List<? extends DisputeQuestionResponse> questionResponses, int selectedTransactionCount, List<SettledCardTransaction> selectedTransactions, boolean isTransactionListVisible, boolean isDisputeSubmitLoading, UiEvent<DisputeSubmitResult> disputeSubmitResult) {
        Intrinsics.checkNotNullParameter(questionnaire, "questionnaire");
        Intrinsics.checkNotNullParameter(questionResponses, "questionResponses");
        return new DisputeReviewViewState(questionnaire, questionResponses, selectedTransactionCount, selectedTransactions, isTransactionListVisible, isDisputeSubmitLoading, disputeSubmitResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisputeReviewViewState)) {
            return false;
        }
        DisputeReviewViewState disputeReviewViewState = (DisputeReviewViewState) other;
        return Intrinsics.areEqual(this.questionnaire, disputeReviewViewState.questionnaire) && Intrinsics.areEqual(this.questionResponses, disputeReviewViewState.questionResponses) && this.selectedTransactionCount == disputeReviewViewState.selectedTransactionCount && Intrinsics.areEqual(this.selectedTransactions, disputeReviewViewState.selectedTransactions) && this.isTransactionListVisible == disputeReviewViewState.isTransactionListVisible && this.isDisputeSubmitLoading == disputeReviewViewState.isDisputeSubmitLoading && Intrinsics.areEqual(this.disputeSubmitResult, disputeReviewViewState.disputeSubmitResult);
    }

    public int hashCode() {
        int iHashCode = ((((this.questionnaire.hashCode() * 31) + this.questionResponses.hashCode()) * 31) + Integer.hashCode(this.selectedTransactionCount)) * 31;
        List<SettledCardTransaction> list = this.selectedTransactions;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isTransactionListVisible)) * 31) + Boolean.hashCode(this.isDisputeSubmitLoading)) * 31;
        UiEvent<DisputeSubmitResult> uiEvent = this.disputeSubmitResult;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "DisputeReviewViewState(questionnaire=" + this.questionnaire + ", questionResponses=" + this.questionResponses + ", selectedTransactionCount=" + this.selectedTransactionCount + ", selectedTransactions=" + this.selectedTransactions + ", isTransactionListVisible=" + this.isTransactionListVisible + ", isDisputeSubmitLoading=" + this.isDisputeSubmitLoading + ", disputeSubmitResult=" + this.disputeSubmitResult + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DisputeReviewViewState(DisputeQuestionnaire questionnaire, List<? extends DisputeQuestionResponse> questionResponses, int i, List<SettledCardTransaction> list, boolean z, boolean z2, UiEvent<DisputeSubmitResult> uiEvent) {
        Intrinsics.checkNotNullParameter(questionnaire, "questionnaire");
        Intrinsics.checkNotNullParameter(questionResponses, "questionResponses");
        this.questionnaire = questionnaire;
        this.questionResponses = questionResponses;
        this.selectedTransactionCount = i;
        this.selectedTransactions = list;
        this.isTransactionListVisible = z;
        this.isDisputeSubmitLoading = z2;
        this.disputeSubmitResult = uiEvent;
    }

    public /* synthetic */ DisputeReviewViewState(DisputeQuestionnaire disputeQuestionnaire, List list, int i, List list2, boolean z, boolean z2, UiEvent uiEvent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(disputeQuestionnaire, list, i, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? null : uiEvent);
    }

    public final boolean isTransactionListVisible() {
        return this.isTransactionListVisible;
    }

    public final boolean isDisputeSubmitLoading() {
        return this.isDisputeSubmitLoading;
    }

    public final UiEvent<DisputeSubmitResult> getDisputeSubmitResult() {
        return this.disputeSubmitResult;
    }

    public final String getDisputeReason() {
        return this.questionnaire.getDisplayReason();
    }

    public final boolean isSingleTransactionRowVisible() {
        return getSelectedTransactionState() instanceof SelectedTransactionState.SingleTransaction;
    }

    public final boolean isMultiTransactionHeaderRowVisible() {
        return getSelectedTransactionState() instanceof SelectedTransactionState.MultipleTransactions;
    }

    public final SelectedTransactionState getSelectedTransactionState() {
        if (this.selectedTransactionCount == 1) {
            List<SettledCardTransaction> list = this.selectedTransactions;
            return new SelectedTransactionState.SingleTransaction(list != null ? (SettledCardTransaction) CollectionsKt.firstOrNull((List) list) : null);
        }
        return new SelectedTransactionState.MultipleTransactions(this.isTransactionListVisible, this.selectedTransactions);
    }

    public final List<ReviewQuestionResponse> getReviewResponses() {
        List<DisputeQuestionResponse> list = this.questionResponses;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReviewQuestionResponse((DisputeQuestionResponse) it.next()));
        }
        return arrayList;
    }

    public final String getTitleText(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String quantityString = resources.getQuantityString(C10007R.plurals.dispute_review_title, this.selectedTransactionCount);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    /* compiled from: DisputeReviewViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0011HÖ\u0001J\t\u0010\u001d\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$ReviewQuestionResponse;", "", "response", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "<init>", "(Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;)V", "getResponse", "()Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "questionId", "Ljava/util/UUID;", "getQuestionId", "()Ljava/util/UUID;", "primaryDisplayText", "", "getPrimaryDisplayText", "()Ljava/lang/String;", "mediaCount", "", "getMediaCount", "()I", "getSecondaryDisplayText", "context", "Landroid/content/Context;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class ReviewQuestionResponse {
        public static final int $stable = 0;
        private final DisputeQuestionResponse response;

        public static /* synthetic */ ReviewQuestionResponse copy$default(ReviewQuestionResponse reviewQuestionResponse, DisputeQuestionResponse disputeQuestionResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                disputeQuestionResponse = reviewQuestionResponse.response;
            }
            return reviewQuestionResponse.copy(disputeQuestionResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionResponse getResponse() {
            return this.response;
        }

        public final ReviewQuestionResponse copy(DisputeQuestionResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new ReviewQuestionResponse(response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReviewQuestionResponse) && Intrinsics.areEqual(this.response, ((ReviewQuestionResponse) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "ReviewQuestionResponse(response=" + this.response + ")";
        }

        public ReviewQuestionResponse(DisputeQuestionResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
        }

        public final DisputeQuestionResponse getResponse() {
            return this.response;
        }

        public final UUID getQuestionId() {
            return this.response.getQuestion().getId();
        }

        public final String getPrimaryDisplayText() {
            return this.response.getQuestion().getDisplayTitle();
        }

        public final int getMediaCount() {
            DisputeQuestionResponse disputeQuestionResponse = this.response;
            if (disputeQuestionResponse instanceof DisputeQuestionResponse.Media) {
                return ((DisputeQuestionResponse.Media) disputeQuestionResponse).getFiles().size();
            }
            return 0;
        }

        public final String getSecondaryDisplayText(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            DisputeQuestionResponse disputeQuestionResponse = this.response;
            if (disputeQuestionResponse instanceof DisputeQuestionResponse.Text) {
                return ((DisputeQuestionResponse.Text) disputeQuestionResponse).getAnswerText();
            }
            if (disputeQuestionResponse instanceof DisputeQuestionResponse.Decimal) {
                return Money.format$default(((DisputeQuestionResponse.Decimal) disputeQuestionResponse).getMoneyAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            }
            if (disputeQuestionResponse instanceof DisputeQuestionResponse.Date) {
                return context.getString(C10007R.string.dispute_review_date_question_response, LocalDateFormatter.MEDIUM.format((LocalDateFormatter) ((DisputeQuestionResponse.Date) disputeQuestionResponse).getAnswerDate()), ((DisputeQuestionResponse.Date) this.response).getAnswerText());
            }
            if (disputeQuestionResponse instanceof DisputeQuestionResponse.DuplicateAuthorizedTransaction) {
                return context.getString(C10007R.string.f3934xaf7e1af5, Money.Adjustment.format$default(((DisputeQuestionResponse.DuplicateAuthorizedTransaction) disputeQuestionResponse).getAuthorizedTransaction().getAdjustment(), false, null, 3, null), InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) ((DisputeQuestionResponse.DuplicateAuthorizedTransaction) this.response).getAuthorizedTransaction().getInitiatedAt()));
            }
            if (disputeQuestionResponse instanceof DisputeQuestionResponse.Media) {
                return ((DisputeQuestionResponse.Media) disputeQuestionResponse).getAnswerText();
            }
            if (disputeQuestionResponse instanceof DisputeQuestionResponse.MultipleChoice) {
                return ((DisputeQuestionResponse.MultipleChoice) disputeQuestionResponse).getAnswerText();
            }
            if (disputeQuestionResponse instanceof DisputeQuestionResponse.Skip) {
                return context.getString(C10007R.string.dispute_review_no_response);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: DisputeReviewViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$SelectedTransactionState;", "", "<init>", "()V", "SingleTransaction", "MultipleTransactions", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$SelectedTransactionState$MultipleTransactions;", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$SelectedTransactionState$SingleTransaction;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class SelectedTransactionState {
        public static final int $stable = 0;

        public /* synthetic */ SelectedTransactionState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private SelectedTransactionState() {
        }

        /* compiled from: DisputeReviewViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$SelectedTransactionState$SingleTransaction;", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$SelectedTransactionState;", "transaction", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "<init>", "(Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;)V", "getTransaction", "()Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SingleTransaction extends SelectedTransactionState {
            public static final int $stable = 8;
            private final SettledCardTransaction transaction;

            public static /* synthetic */ SingleTransaction copy$default(SingleTransaction singleTransaction, SettledCardTransaction settledCardTransaction, int i, Object obj) {
                if ((i & 1) != 0) {
                    settledCardTransaction = singleTransaction.transaction;
                }
                return singleTransaction.copy(settledCardTransaction);
            }

            /* renamed from: component1, reason: from getter */
            public final SettledCardTransaction getTransaction() {
                return this.transaction;
            }

            public final SingleTransaction copy(SettledCardTransaction transaction) {
                return new SingleTransaction(transaction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleTransaction) && Intrinsics.areEqual(this.transaction, ((SingleTransaction) other).transaction);
            }

            public int hashCode() {
                SettledCardTransaction settledCardTransaction = this.transaction;
                if (settledCardTransaction == null) {
                    return 0;
                }
                return settledCardTransaction.hashCode();
            }

            public String toString() {
                return "SingleTransaction(transaction=" + this.transaction + ")";
            }

            public final SettledCardTransaction getTransaction() {
                return this.transaction;
            }

            public SingleTransaction(SettledCardTransaction settledCardTransaction) {
                super(null);
                this.transaction = settledCardTransaction;
            }
        }

        /* compiled from: DisputeReviewViewState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\fHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$SelectedTransactionState$MultipleTransactions;", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$SelectedTransactionState;", "isTransactionListVisible", "", "transactions", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "<init>", "(ZLjava/util/List;)V", "getTransactions", "()Ljava/util/List;", "headerDrawableRes", "", "getHeaderDrawableRes", "()I", "getHeaderPrimaryText", "", "context", "Landroid/content/Context;", "getHeaderSecondaryText", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class MultipleTransactions extends SelectedTransactionState {
            public static final int $stable = 8;
            private final boolean isTransactionListVisible;
            private final List<SettledCardTransaction> transactions;

            /* renamed from: component1, reason: from getter */
            private final boolean getIsTransactionListVisible() {
                return this.isTransactionListVisible;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MultipleTransactions copy$default(MultipleTransactions multipleTransactions, boolean z, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = multipleTransactions.isTransactionListVisible;
                }
                if ((i & 2) != 0) {
                    list = multipleTransactions.transactions;
                }
                return multipleTransactions.copy(z, list);
            }

            public final List<SettledCardTransaction> component2() {
                return this.transactions;
            }

            public final MultipleTransactions copy(boolean isTransactionListVisible, List<SettledCardTransaction> transactions) {
                return new MultipleTransactions(isTransactionListVisible, transactions);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MultipleTransactions)) {
                    return false;
                }
                MultipleTransactions multipleTransactions = (MultipleTransactions) other;
                return this.isTransactionListVisible == multipleTransactions.isTransactionListVisible && Intrinsics.areEqual(this.transactions, multipleTransactions.transactions);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.isTransactionListVisible) * 31;
                List<SettledCardTransaction> list = this.transactions;
                return iHashCode + (list == null ? 0 : list.hashCode());
            }

            public String toString() {
                return "MultipleTransactions(isTransactionListVisible=" + this.isTransactionListVisible + ", transactions=" + this.transactions + ")";
            }

            public final List<SettledCardTransaction> getTransactions() {
                return this.transactions;
            }

            public MultipleTransactions(boolean z, List<SettledCardTransaction> list) {
                super(null);
                this.isTransactionListVisible = z;
                this.transactions = list;
            }

            public final int getHeaderDrawableRes() {
                if (this.isTransactionListVisible) {
                    return C11183R.drawable.inset_caret_up_16dp;
                }
                return C11183R.drawable.inset_caret_down_16dp;
            }

            public final String getHeaderPrimaryText(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                List<SettledCardTransaction> list = this.transactions;
                if (list != null) {
                    return context.getString(C10007R.string.dispute_review_multi_transaction_header, Integer.valueOf(list.size()));
                }
                return null;
            }

            public final String getHeaderSecondaryText(Context context) {
                SettledCardTransaction settledCardTransaction;
                Instant initiatedAt;
                SettledCardTransaction settledCardTransaction2;
                Instant initiatedAt2;
                Intrinsics.checkNotNullParameter(context, "context");
                List<SettledCardTransaction> list = this.transactions;
                List listSortedWith = list != null ? CollectionsKt.sortedWith(list, new Comparator() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewViewState$SelectedTransactionState$MultipleTransactions$getHeaderSecondaryText$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((SettledCardTransaction) t).getInitiatedAt(), ((SettledCardTransaction) t2).getInitiatedAt());
                    }
                }) : null;
                LocalDate localDate$default = (listSortedWith == null || (settledCardTransaction2 = (SettledCardTransaction) CollectionsKt.firstOrNull(listSortedWith)) == null || (initiatedAt2 = settledCardTransaction2.getInitiatedAt()) == null) ? null : Instants.toLocalDate$default(initiatedAt2, null, 1, null);
                LocalDate localDate$default2 = (listSortedWith == null || (settledCardTransaction = (SettledCardTransaction) CollectionsKt.lastOrNull(listSortedWith)) == null || (initiatedAt = settledCardTransaction.getInitiatedAt()) == null) ? null : Instants.toLocalDate$default(initiatedAt, null, 1, null);
                if (localDate$default == null || localDate$default2 == null) {
                    return null;
                }
                if (!Intrinsics.areEqual(localDate$default, localDate$default2)) {
                    int i = C10007R.string.date_selection_view_range;
                    LocalDateFormatter localDateFormatter = LocalDateFormatter.MEDIUM;
                    return context.getString(i, localDateFormatter.format((LocalDateFormatter) localDate$default), localDateFormatter.format((LocalDateFormatter) localDate$default2));
                }
                return LocalDateFormatter.MEDIUM.format((LocalDateFormatter) localDate$default);
            }
        }
    }

    /* compiled from: DisputeReviewViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$DisputeSubmitResult;", "", "<init>", "()V", "Success", "Error", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$DisputeSubmitResult$Error;", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$DisputeSubmitResult$Success;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class DisputeSubmitResult {
        public static final int $stable = 0;

        public /* synthetic */ DisputeSubmitResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DisputeSubmitResult() {
        }

        /* compiled from: DisputeReviewViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$DisputeSubmitResult$Success;", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$DisputeSubmitResult;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Success extends DisputeSubmitResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }
        }

        /* compiled from: DisputeReviewViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$DisputeSubmitResult$Error;", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState$DisputeSubmitResult;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error extends DisputeSubmitResult {
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
}
