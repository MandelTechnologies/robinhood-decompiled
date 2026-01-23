package com.robinhood.android.cash.disputes.extensions;

import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.util.DisputeFileData;
import com.robinhood.models.api.minerva.ApiDisputeQuestionnaireAnswer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DisputeQuestionResponses.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u0004\u0018\u00010\u0002H\u0086\b¢\u0006\u0002\u0010\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002H\u0002\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0002H\u0002\u001a\u0014\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020\u0002H\u0002¨\u0006\f"}, m3636d2 = {"toResponseTypeOrNull", "T", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "(Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;)Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "toApiDisputeQuestionnaireAnswer", "Lcom/robinhood/models/api/minerva/ApiDisputeQuestionnaireAnswer;", "formatTextForApi", "", "formatDateForApi", "formatFileIdsForApi", "", "Ljava/util/UUID;", "feature-cash-disputes_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.disputes.extensions.DisputeQuestionResponsesKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DisputeQuestionResponses {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends DisputeQuestionResponse> T toResponseTypeOrNull(DisputeQuestionResponse disputeQuestionResponse) {
        Intrinsics.reifiedOperationMarker(2, "T");
        return disputeQuestionResponse;
    }

    public static final ApiDisputeQuestionnaireAnswer toApiDisputeQuestionnaireAnswer(DisputeQuestionResponse disputeQuestionResponse) {
        Intrinsics.checkNotNullParameter(disputeQuestionResponse, "<this>");
        return new ApiDisputeQuestionnaireAnswer(disputeQuestionResponse.getQuestion().getId(), formatTextForApi(disputeQuestionResponse), formatDateForApi(disputeQuestionResponse), formatFileIdsForApi(disputeQuestionResponse));
    }

    private static final String formatTextForApi(DisputeQuestionResponse disputeQuestionResponse) {
        if (disputeQuestionResponse instanceof DisputeQuestionResponse.Date) {
            return ((DisputeQuestionResponse.Date) disputeQuestionResponse).getAnswerText();
        }
        if (disputeQuestionResponse instanceof DisputeQuestionResponse.Decimal) {
            String plainString = ((DisputeQuestionResponse.Decimal) disputeQuestionResponse).getMoneyAmount().getDecimalValue().toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            return plainString;
        }
        if (disputeQuestionResponse instanceof DisputeQuestionResponse.DuplicateAuthorizedTransaction) {
            String string2 = ((DisputeQuestionResponse.DuplicateAuthorizedTransaction) disputeQuestionResponse).getAuthorizedTransaction().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
        if (disputeQuestionResponse instanceof DisputeQuestionResponse.Media) {
            String answerText = ((DisputeQuestionResponse.Media) disputeQuestionResponse).getAnswerText();
            return answerText == null ? "" : answerText;
        }
        if (disputeQuestionResponse instanceof DisputeQuestionResponse.MultipleChoice) {
            return ((DisputeQuestionResponse.MultipleChoice) disputeQuestionResponse).getAnswerText();
        }
        if (disputeQuestionResponse instanceof DisputeQuestionResponse.Skip) {
            return "";
        }
        if (disputeQuestionResponse instanceof DisputeQuestionResponse.Text) {
            return ((DisputeQuestionResponse.Text) disputeQuestionResponse).getAnswerText();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final String formatDateForApi(DisputeQuestionResponse disputeQuestionResponse) {
        if (disputeQuestionResponse instanceof DisputeQuestionResponse.Date) {
            return LocalDates2.toDisputeResponseFormat(((DisputeQuestionResponse.Date) disputeQuestionResponse).getAnswerDate());
        }
        return null;
    }

    private static final List<UUID> formatFileIdsForApi(DisputeQuestionResponse disputeQuestionResponse) {
        if (!(disputeQuestionResponse instanceof DisputeQuestionResponse.Media)) {
            return null;
        }
        List<DisputeFileData> files = ((DisputeQuestionResponse.Media) disputeQuestionResponse).getFiles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(files, 10));
        Iterator<T> it = files.iterator();
        while (it.hasNext()) {
            arrayList.add(((DisputeFileData) it.next()).getId());
        }
        return arrayList;
    }
}
