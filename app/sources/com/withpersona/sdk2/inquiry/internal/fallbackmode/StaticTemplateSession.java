package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.network.Conversions4;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StaticTemplateSession.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001fB+\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004J\r\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession;", "", "steps", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "sessionToken", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljava/util/List;Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;)V", "inquiryId", "getInquiryId", "()Ljava/lang/String;", "authorization", "getAuthorization", "value", "", "currentStepIndex", "getCurrentStepIndex", "()I", "setCurrentStepIndex", "(I)V", "currentStep", "getCurrentStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "next", "previous", "currentStepAsInquiryState", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "currentStepAsInquiryState$inquiry_internal_release", "Factory", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StaticTemplateSession {
    private final String authorization;
    private final String inquiryId;
    private final SavedStateHandle savedStateHandle;
    private final List<NextStep> steps;

    /* compiled from: StaticTemplateSession.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession;", "steps", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "sessionToken", "", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        StaticTemplateSession create(List<? extends NextStep> steps, String sessionToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StaticTemplateSession(List<? extends NextStep> steps, String sessionToken, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.steps = steps;
        this.savedStateHandle = savedStateHandle;
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.inquiryId = string2;
        this.authorization = "Bearer " + sessionToken;
    }

    public final String getInquiryId() {
        return this.inquiryId;
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final int getCurrentStepIndex() {
        Integer num = (Integer) this.savedStateHandle.get("current_fallback_mode_step_index");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void setCurrentStepIndex(int i) {
        this.savedStateHandle.set("current_fallback_mode_step_index", Integer.valueOf(i));
    }

    public final NextStep getCurrentStep() {
        return this.steps.get(getCurrentStepIndex());
    }

    public final NextStep next() {
        if (getCurrentStepIndex() == CollectionsKt.getLastIndex(this.steps)) {
            return null;
        }
        setCurrentStepIndex(getCurrentStepIndex() + 1);
        return this.steps.get(getCurrentStepIndex());
    }

    public final NextStep previous() {
        if (getCurrentStepIndex() == 0) {
            return null;
        }
        setCurrentStepIndex(getCurrentStepIndex() - 1);
        return this.steps.get(getCurrentStepIndex());
    }

    public final InquiryState currentStepAsInquiryState$inquiry_internal_release() {
        NextStep currentStep = getCurrentStep();
        if (currentStep instanceof NextStep.C43686Ui) {
            return Conversions4.toInquiryState((NextStep.C43686Ui) currentStep, this.authorization, this.inquiryId, "fake_status", null, InquirySessionConfig.INSTANCE.getDefault());
        }
        if (currentStep instanceof NextStep.GovernmentId) {
            return Conversions4.toInquiryState((NextStep.GovernmentId) currentStep, this.authorization, this.inquiryId, null);
        }
        if (currentStep instanceof NextStep.Selfie) {
            return Conversions4.toInquiryState((NextStep.Selfie) currentStep, this.authorization, this.inquiryId);
        }
        if (currentStep instanceof NextStep.Document) {
            return Conversions4.toInquiryState((NextStep.Document) currentStep, this.authorization, this.inquiryId);
        }
        if (currentStep instanceof NextStep.Complete) {
            return Conversions4.toInquiryState((NextStep.Complete) currentStep, this.authorization, this.inquiryId, "fake_status", null);
        }
        if (!Intrinsics.areEqual(currentStep, NextStep.Unknown.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Unknown type for step " + currentStep.getName());
    }
}
