package com.robinhood.android.earlypay.enrollment.p110ui;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.earlypay.C14433R;
import com.robinhood.android.earlypay.lib.C14449R;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyPayEnrollmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u00045678Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÂ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\t\u0010-\u001a\u00020\u0003HÂ\u0003J{\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState;", "", "isLoading", "", "content", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent;", "contentError", "", "enrollmentUpdated", "", "enrollmentError", "hideEnrollmentButtons", "enrollment", "Lcom/robinhood/models/db/EarlyPayEnrollment;", "hasRhyDirectDepositRelationships", "<init>", "(ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/models/db/EarlyPayEnrollment;Z)V", "()Z", "getContent", "()Lcom/robinhood/udf/UiEvent;", "getContentError", "getEnrollmentError", "getHideEnrollmentButtons", "showEnrollmentButtons", "getShowEnrollmentButtons", "primaryButtonState", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PrimaryButtonState;", "getPrimaryButtonState", "()Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PrimaryButtonState;", "secondaryButtonState", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$SecondaryButtonState;", "getSecondaryButtonState", "()Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$SecondaryButtonState;", "postEnrollmentAction", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PostEnrollmentAction;", "getPostEnrollmentAction", "()Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PostEnrollmentAction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "EarlyPayEnrollmentContent", "PostEnrollmentAction", "PrimaryButtonState", "SecondaryButtonState", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EarlyPayEnrollmentViewState {
    public static final int $stable = 8;
    private final UiEvent<EarlyPayEnrollmentContent> content;
    private final UiEvent<Throwable> contentError;
    private final EarlyPayEnrollment enrollment;
    private final UiEvent<Throwable> enrollmentError;
    private final UiEvent<Unit> enrollmentUpdated;
    private final boolean hasRhyDirectDepositRelationships;
    private final boolean hideEnrollmentButtons;
    private final boolean isLoading;
    private final boolean showEnrollmentButtons;

    private final UiEvent<Unit> component4() {
        return this.enrollmentUpdated;
    }

    /* renamed from: component7, reason: from getter */
    private final EarlyPayEnrollment getEnrollment() {
        return this.enrollment;
    }

    /* renamed from: component8, reason: from getter */
    private final boolean getHasRhyDirectDepositRelationships() {
        return this.hasRhyDirectDepositRelationships;
    }

    public static /* synthetic */ EarlyPayEnrollmentViewState copy$default(EarlyPayEnrollmentViewState earlyPayEnrollmentViewState, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, boolean z2, EarlyPayEnrollment earlyPayEnrollment, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = earlyPayEnrollmentViewState.isLoading;
        }
        if ((i & 2) != 0) {
            uiEvent = earlyPayEnrollmentViewState.content;
        }
        if ((i & 4) != 0) {
            uiEvent2 = earlyPayEnrollmentViewState.contentError;
        }
        if ((i & 8) != 0) {
            uiEvent3 = earlyPayEnrollmentViewState.enrollmentUpdated;
        }
        if ((i & 16) != 0) {
            uiEvent4 = earlyPayEnrollmentViewState.enrollmentError;
        }
        if ((i & 32) != 0) {
            z2 = earlyPayEnrollmentViewState.hideEnrollmentButtons;
        }
        if ((i & 64) != 0) {
            earlyPayEnrollment = earlyPayEnrollmentViewState.enrollment;
        }
        if ((i & 128) != 0) {
            z3 = earlyPayEnrollmentViewState.hasRhyDirectDepositRelationships;
        }
        EarlyPayEnrollment earlyPayEnrollment2 = earlyPayEnrollment;
        boolean z4 = z3;
        UiEvent uiEvent5 = uiEvent4;
        boolean z5 = z2;
        return earlyPayEnrollmentViewState.copy(z, uiEvent, uiEvent2, uiEvent3, uiEvent5, z5, earlyPayEnrollment2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<EarlyPayEnrollmentContent> component2() {
        return this.content;
    }

    public final UiEvent<Throwable> component3() {
        return this.contentError;
    }

    public final UiEvent<Throwable> component5() {
        return this.enrollmentError;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHideEnrollmentButtons() {
        return this.hideEnrollmentButtons;
    }

    public final EarlyPayEnrollmentViewState copy(boolean isLoading, UiEvent<EarlyPayEnrollmentContent> content, UiEvent<Throwable> contentError, UiEvent<Unit> enrollmentUpdated, UiEvent<Throwable> enrollmentError, boolean hideEnrollmentButtons, EarlyPayEnrollment enrollment, boolean hasRhyDirectDepositRelationships) {
        return new EarlyPayEnrollmentViewState(isLoading, content, contentError, enrollmentUpdated, enrollmentError, hideEnrollmentButtons, enrollment, hasRhyDirectDepositRelationships);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyPayEnrollmentViewState)) {
            return false;
        }
        EarlyPayEnrollmentViewState earlyPayEnrollmentViewState = (EarlyPayEnrollmentViewState) other;
        return this.isLoading == earlyPayEnrollmentViewState.isLoading && Intrinsics.areEqual(this.content, earlyPayEnrollmentViewState.content) && Intrinsics.areEqual(this.contentError, earlyPayEnrollmentViewState.contentError) && Intrinsics.areEqual(this.enrollmentUpdated, earlyPayEnrollmentViewState.enrollmentUpdated) && Intrinsics.areEqual(this.enrollmentError, earlyPayEnrollmentViewState.enrollmentError) && this.hideEnrollmentButtons == earlyPayEnrollmentViewState.hideEnrollmentButtons && Intrinsics.areEqual(this.enrollment, earlyPayEnrollmentViewState.enrollment) && this.hasRhyDirectDepositRelationships == earlyPayEnrollmentViewState.hasRhyDirectDepositRelationships;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        UiEvent<EarlyPayEnrollmentContent> uiEvent = this.content;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.contentError;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.enrollmentUpdated;
        int iHashCode4 = (iHashCode3 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Throwable> uiEvent4 = this.enrollmentError;
        int iHashCode5 = (((iHashCode4 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31) + Boolean.hashCode(this.hideEnrollmentButtons)) * 31;
        EarlyPayEnrollment earlyPayEnrollment = this.enrollment;
        return ((iHashCode5 + (earlyPayEnrollment != null ? earlyPayEnrollment.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasRhyDirectDepositRelationships);
    }

    public String toString() {
        return "EarlyPayEnrollmentViewState(isLoading=" + this.isLoading + ", content=" + this.content + ", contentError=" + this.contentError + ", enrollmentUpdated=" + this.enrollmentUpdated + ", enrollmentError=" + this.enrollmentError + ", hideEnrollmentButtons=" + this.hideEnrollmentButtons + ", enrollment=" + this.enrollment + ", hasRhyDirectDepositRelationships=" + this.hasRhyDirectDepositRelationships + ")";
    }

    public EarlyPayEnrollmentViewState(boolean z, UiEvent<EarlyPayEnrollmentContent> uiEvent, UiEvent<Throwable> uiEvent2, UiEvent<Unit> uiEvent3, UiEvent<Throwable> uiEvent4, boolean z2, EarlyPayEnrollment earlyPayEnrollment, boolean z3) {
        this.isLoading = z;
        this.content = uiEvent;
        this.contentError = uiEvent2;
        this.enrollmentUpdated = uiEvent3;
        this.enrollmentError = uiEvent4;
        this.hideEnrollmentButtons = z2;
        this.enrollment = earlyPayEnrollment;
        this.hasRhyDirectDepositRelationships = z3;
        this.showEnrollmentButtons = !z2;
    }

    public /* synthetic */ EarlyPayEnrollmentViewState(boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, boolean z2, EarlyPayEnrollment earlyPayEnrollment, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : uiEvent2, (i & 8) != 0 ? null : uiEvent3, (i & 16) != 0 ? null : uiEvent4, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : earlyPayEnrollment, (i & 128) != 0 ? false : z3);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<EarlyPayEnrollmentContent> getContent() {
        return this.content;
    }

    public final UiEvent<Throwable> getContentError() {
        return this.contentError;
    }

    public final UiEvent<Throwable> getEnrollmentError() {
        return this.enrollmentError;
    }

    public final boolean getHideEnrollmentButtons() {
        return this.hideEnrollmentButtons;
    }

    public final boolean getShowEnrollmentButtons() {
        return this.showEnrollmentButtons;
    }

    public final PrimaryButtonState getPrimaryButtonState() {
        if (!this.showEnrollmentButtons) {
            return null;
        }
        if (this.hasRhyDirectDepositRelationships) {
            return PrimaryButtonState.SIGN_UP_NOW;
        }
        return PrimaryButtonState.SET_UP_DIRECT_DEPOSIT;
    }

    public final SecondaryButtonState getSecondaryButtonState() {
        if (!this.showEnrollmentButtons) {
            return null;
        }
        if (this.hasRhyDirectDepositRelationships) {
            return SecondaryButtonState.DISMISS;
        }
        return SecondaryButtonState.ALREADY_SET_UP_RHY_DD;
    }

    public final PostEnrollmentAction getPostEnrollmentAction() {
        UiEvent<Unit> uiEvent = this.enrollmentUpdated;
        if ((uiEvent != null ? uiEvent.consume() : null) == null || !this.showEnrollmentButtons) {
            return null;
        }
        if (this.hasRhyDirectDepositRelationships) {
            return PostEnrollmentAction.Finish.INSTANCE;
        }
        return PostEnrollmentAction.DirectDeposit.INSTANCE;
    }

    /* compiled from: EarlyPayEnrollmentDuxo.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent;", "", "valueProps", "", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$ValueProp;", "faqs", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$Faq;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$Disclosure;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$Disclosure;)V", "getValueProps", "()Ljava/util/List;", "getFaqs", "getDisclosure", "()Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$Disclosure;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ValueProp", "Faq", "Disclosure", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EarlyPayEnrollmentContent {
        public static final int $stable = 8;
        private final Disclosure disclosure;
        private final List<Faq> faqs;
        private final List<ValueProp> valueProps;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EarlyPayEnrollmentContent copy$default(EarlyPayEnrollmentContent earlyPayEnrollmentContent, List list, List list2, Disclosure disclosure, int i, Object obj) {
            if ((i & 1) != 0) {
                list = earlyPayEnrollmentContent.valueProps;
            }
            if ((i & 2) != 0) {
                list2 = earlyPayEnrollmentContent.faqs;
            }
            if ((i & 4) != 0) {
                disclosure = earlyPayEnrollmentContent.disclosure;
            }
            return earlyPayEnrollmentContent.copy(list, list2, disclosure);
        }

        public final List<ValueProp> component1() {
            return this.valueProps;
        }

        public final List<Faq> component2() {
            return this.faqs;
        }

        /* renamed from: component3, reason: from getter */
        public final Disclosure getDisclosure() {
            return this.disclosure;
        }

        public final EarlyPayEnrollmentContent copy(List<ValueProp> valueProps, List<Faq> faqs, Disclosure disclosure) {
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(faqs, "faqs");
            return new EarlyPayEnrollmentContent(valueProps, faqs, disclosure);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EarlyPayEnrollmentContent)) {
                return false;
            }
            EarlyPayEnrollmentContent earlyPayEnrollmentContent = (EarlyPayEnrollmentContent) other;
            return Intrinsics.areEqual(this.valueProps, earlyPayEnrollmentContent.valueProps) && Intrinsics.areEqual(this.faqs, earlyPayEnrollmentContent.faqs) && Intrinsics.areEqual(this.disclosure, earlyPayEnrollmentContent.disclosure);
        }

        public int hashCode() {
            int iHashCode = ((this.valueProps.hashCode() * 31) + this.faqs.hashCode()) * 31;
            Disclosure disclosure = this.disclosure;
            return iHashCode + (disclosure == null ? 0 : disclosure.hashCode());
        }

        public String toString() {
            return "EarlyPayEnrollmentContent(valueProps=" + this.valueProps + ", faqs=" + this.faqs + ", disclosure=" + this.disclosure + ")";
        }

        public EarlyPayEnrollmentContent(List<ValueProp> valueProps, List<Faq> faqs, Disclosure disclosure) {
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(faqs, "faqs");
            this.valueProps = valueProps;
            this.faqs = faqs;
            this.disclosure = disclosure;
        }

        public final List<ValueProp> getValueProps() {
            return this.valueProps;
        }

        public final List<Faq> getFaqs() {
            return this.faqs;
        }

        public final Disclosure getDisclosure() {
            return this.disclosure;
        }

        /* compiled from: EarlyPayEnrollmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$ValueProp;", "", "title", "", ErrorResponse.DETAIL, "", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "getTitle", "()Ljava/lang/String;", "getDetail", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ValueProp {
            public static final int $stable = 8;
            private final CharSequence detail;
            private final String title;

            public static /* synthetic */ ValueProp copy$default(ValueProp valueProp, String str, CharSequence charSequence, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = valueProp.title;
                }
                if ((i & 2) != 0) {
                    charSequence = valueProp.detail;
                }
                return valueProp.copy(str, charSequence);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final CharSequence getDetail() {
                return this.detail;
            }

            public final ValueProp copy(String title, CharSequence detail) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(detail, "detail");
                return new ValueProp(title, detail);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValueProp)) {
                    return false;
                }
                ValueProp valueProp = (ValueProp) other;
                return Intrinsics.areEqual(this.title, valueProp.title) && Intrinsics.areEqual(this.detail, valueProp.detail);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.detail.hashCode();
            }

            public String toString() {
                return "ValueProp(title=" + this.title + ", detail=" + ((Object) this.detail) + ")";
            }

            public ValueProp(String title, CharSequence detail) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(detail, "detail");
                this.title = title;
                this.detail = detail;
            }

            public final String getTitle() {
                return this.title;
            }

            public final CharSequence getDetail() {
                return this.detail;
            }
        }

        /* compiled from: EarlyPayEnrollmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$Faq;", "", "question", "", "answer", "", "expanded", "", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Z)V", "getQuestion", "()Ljava/lang/String;", "getAnswer", "()Ljava/lang/CharSequence;", "getExpanded", "()Z", "setExpanded", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Faq {
            public static final int $stable = 8;
            private final CharSequence answer;
            private boolean expanded;
            private final String question;

            public static /* synthetic */ Faq copy$default(Faq faq, String str, CharSequence charSequence, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = faq.question;
                }
                if ((i & 2) != 0) {
                    charSequence = faq.answer;
                }
                if ((i & 4) != 0) {
                    z = faq.expanded;
                }
                return faq.copy(str, charSequence, z);
            }

            /* renamed from: component1, reason: from getter */
            public final String getQuestion() {
                return this.question;
            }

            /* renamed from: component2, reason: from getter */
            public final CharSequence getAnswer() {
                return this.answer;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getExpanded() {
                return this.expanded;
            }

            public final Faq copy(String question, CharSequence answer, boolean expanded) {
                Intrinsics.checkNotNullParameter(question, "question");
                Intrinsics.checkNotNullParameter(answer, "answer");
                return new Faq(question, answer, expanded);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Faq)) {
                    return false;
                }
                Faq faq = (Faq) other;
                return Intrinsics.areEqual(this.question, faq.question) && Intrinsics.areEqual(this.answer, faq.answer) && this.expanded == faq.expanded;
            }

            public int hashCode() {
                return (((this.question.hashCode() * 31) + this.answer.hashCode()) * 31) + Boolean.hashCode(this.expanded);
            }

            public String toString() {
                String str = this.question;
                CharSequence charSequence = this.answer;
                return "Faq(question=" + str + ", answer=" + ((Object) charSequence) + ", expanded=" + this.expanded + ")";
            }

            public Faq(String question, CharSequence answer, boolean z) {
                Intrinsics.checkNotNullParameter(question, "question");
                Intrinsics.checkNotNullParameter(answer, "answer");
                this.question = question;
                this.answer = answer;
                this.expanded = z;
            }

            public /* synthetic */ Faq(String str, CharSequence charSequence, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, charSequence, (i & 4) != 0 ? false : z);
            }

            public final String getQuestion() {
                return this.question;
            }

            public final CharSequence getAnswer() {
                return this.answer;
            }

            public final boolean getExpanded() {
                return this.expanded;
            }

            public final void setExpanded(boolean z) {
                this.expanded = z;
            }
        }

        /* compiled from: EarlyPayEnrollmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$Disclosure;", "", "title", "", "content", "", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "getTitle", "()Ljava/lang/String;", "getContent", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Disclosure {
            public static final int $stable = 8;
            private final CharSequence content;
            private final String title;

            public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, String str, CharSequence charSequence, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = disclosure.title;
                }
                if ((i & 2) != 0) {
                    charSequence = disclosure.content;
                }
                return disclosure.copy(str, charSequence);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final CharSequence getContent() {
                return this.content;
            }

            public final Disclosure copy(String title, CharSequence content) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(content, "content");
                return new Disclosure(title, content);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Disclosure)) {
                    return false;
                }
                Disclosure disclosure = (Disclosure) other;
                return Intrinsics.areEqual(this.title, disclosure.title) && Intrinsics.areEqual(this.content, disclosure.content);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.content.hashCode();
            }

            public String toString() {
                return "Disclosure(title=" + this.title + ", content=" + ((Object) this.content) + ")";
            }

            public Disclosure(String title, CharSequence content) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(content, "content");
                this.title = title;
                this.content = content;
            }

            public final String getTitle() {
                return this.title;
            }

            public final CharSequence getContent() {
                return this.content;
            }
        }
    }

    /* compiled from: EarlyPayEnrollmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PostEnrollmentAction;", "", "<init>", "()V", "DirectDeposit", "Finish", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PostEnrollmentAction$DirectDeposit;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PostEnrollmentAction$Finish;", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class PostEnrollmentAction {
        public static final int $stable = 0;

        public /* synthetic */ PostEnrollmentAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PostEnrollmentAction() {
        }

        /* compiled from: EarlyPayEnrollmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PostEnrollmentAction$DirectDeposit;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PostEnrollmentAction;", "<init>", "()V", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DirectDeposit extends PostEnrollmentAction {
            public static final int $stable = 0;
            public static final DirectDeposit INSTANCE = new DirectDeposit();

            private DirectDeposit() {
                super(null);
            }
        }

        /* compiled from: EarlyPayEnrollmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PostEnrollmentAction$Finish;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PostEnrollmentAction;", "<init>", "()V", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Finish extends PostEnrollmentAction {
            public static final int $stable = 0;
            public static final Finish INSTANCE = new Finish();

            private Finish() {
                super(null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EarlyPayEnrollmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$PrimaryButtonState;", "", "text", "", "loggingAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "<init>", "(Ljava/lang/String;IILcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;)V", "getText", "()I", "getLoggingAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "SIGN_UP_NOW", "SET_UP_DIRECT_DEPOSIT", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PrimaryButtonState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PrimaryButtonState[] $VALUES;
        private final UserInteractionEventData.Action loggingAction;
        private final int text;
        public static final PrimaryButtonState SIGN_UP_NOW = new PrimaryButtonState("SIGN_UP_NOW", 0, C11048R.string.general_label_sign_up, UserInteractionEventData.Action.SUBMIT);
        public static final PrimaryButtonState SET_UP_DIRECT_DEPOSIT = new PrimaryButtonState("SET_UP_DIRECT_DEPOSIT", 1, C14449R.string.early_pay_enroll_in_dd, UserInteractionEventData.Action.SET_UP_DIRECT_DEPOSIT);

        private static final /* synthetic */ PrimaryButtonState[] $values() {
            return new PrimaryButtonState[]{SIGN_UP_NOW, SET_UP_DIRECT_DEPOSIT};
        }

        public static EnumEntries<PrimaryButtonState> getEntries() {
            return $ENTRIES;
        }

        private PrimaryButtonState(String str, int i, int i2, UserInteractionEventData.Action action) {
            this.text = i2;
            this.loggingAction = action;
        }

        public final int getText() {
            return this.text;
        }

        public final UserInteractionEventData.Action getLoggingAction() {
            return this.loggingAction;
        }

        static {
            PrimaryButtonState[] primaryButtonStateArr$values = $values();
            $VALUES = primaryButtonStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(primaryButtonStateArr$values);
        }

        public static PrimaryButtonState valueOf(String str) {
            return (PrimaryButtonState) Enum.valueOf(PrimaryButtonState.class, str);
        }

        public static PrimaryButtonState[] values() {
            return (PrimaryButtonState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EarlyPayEnrollmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$SecondaryButtonState;", "", "text", "", "loggingAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "<init>", "(Ljava/lang/String;IILcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;)V", "getText", "()I", "getLoggingAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "ALREADY_SET_UP_RHY_DD", "DISMISS", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SecondaryButtonState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SecondaryButtonState[] $VALUES;
        public static final SecondaryButtonState ALREADY_SET_UP_RHY_DD = new SecondaryButtonState("ALREADY_SET_UP_RHY_DD", 0, C14433R.string.early_pay_already_set_up_dd, UserInteractionEventData.Action.ALREADY_SET_UP_DIRECT_DEPOSIT);
        public static final SecondaryButtonState DISMISS = new SecondaryButtonState("DISMISS", 1, C11048R.string.general_label_maybe_later, UserInteractionEventData.Action.DISMISS);
        private final UserInteractionEventData.Action loggingAction;
        private final int text;

        private static final /* synthetic */ SecondaryButtonState[] $values() {
            return new SecondaryButtonState[]{ALREADY_SET_UP_RHY_DD, DISMISS};
        }

        public static EnumEntries<SecondaryButtonState> getEntries() {
            return $ENTRIES;
        }

        private SecondaryButtonState(String str, int i, int i2, UserInteractionEventData.Action action) {
            this.text = i2;
            this.loggingAction = action;
        }

        public final int getText() {
            return this.text;
        }

        public final UserInteractionEventData.Action getLoggingAction() {
            return this.loggingAction;
        }

        static {
            SecondaryButtonState[] secondaryButtonStateArr$values = $values();
            $VALUES = secondaryButtonStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(secondaryButtonStateArr$values);
        }

        public static SecondaryButtonState valueOf(String str) {
            return (SecondaryButtonState) Enum.valueOf(SecondaryButtonState.class, str);
        }

        public static SecondaryButtonState[] values() {
            return (SecondaryButtonState[]) $VALUES.clone();
        }
    }
}
