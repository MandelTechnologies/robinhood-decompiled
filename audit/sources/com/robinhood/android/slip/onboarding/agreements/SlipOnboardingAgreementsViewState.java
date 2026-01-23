package com.robinhood.android.slip.onboarding.agreements;

import com.robinhood.android.common.C11048R;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: SlipOnboardingAgreementsViewState.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0001RBí\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0015¢\u0006\u0004\b \u0010!J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120\fHÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fHÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\t\u0010I\u001a\u00020\u0019HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0015HÆ\u0003Jï\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0015HÆ\u0001J\u0013\u0010N\u001a\u00020\u00052\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u000209HÖ\u0001J\t\u0010Q\u001a\u00020\u0007HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u0010/R\u0011\u00107\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b7\u0010\"R\u0011\u00108\u001a\u0002098G¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b<\u0010\"¨\u0006S"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsViewState;", "", "user", "Lcom/robinhood/models/db/sheriff/User;", "isLoading", "", "title", "", "subtitleMarkdown", "acknowledgeContent", "summaryTitle", "summaryItems", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "crsLink", "Lcom/robinhood/models/ui/UiSlipAgreements$TextLink;", "expandableAgreements", "Lcom/robinhood/android/slip/onboarding/agreements/ExpandableAgreement;", "additionalCheckboxes", "agreementsAcceptedEvent", "Lcom/robinhood/udf/UiEvent;", "", "scrollToBottomEvent", "reviewState", "Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsViewState$ReviewState;", "allCheckboxesChecked", "agreementsV2", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiSlipAgreements$AgreementV2;", "errorEvent", "", "<init>", "(Lcom/robinhood/models/db/sheriff/User;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/ui/UiSlipAgreements$TextLink;Ljava/util/List;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsViewState$ReviewState;ZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/udf/UiEvent;)V", "()Z", "getTitle", "()Ljava/lang/String;", "getSubtitleMarkdown", "getAcknowledgeContent", "getSummaryTitle", "getSummaryItems", "()Ljava/util/List;", "getCrsLink", "()Lcom/robinhood/models/ui/UiSlipAgreements$TextLink;", "getExpandableAgreements", "getAdditionalCheckboxes", "getAgreementsAcceptedEvent", "()Lcom/robinhood/udf/UiEvent;", "getScrollToBottomEvent", "getReviewState", "()Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsViewState$ReviewState;", "getAllCheckboxesChecked", "getAgreementsV2", "()Lkotlinx/collections/immutable/ImmutableList;", "getErrorEvent", "isAcknowledgeContentLightTextColor", "ctaTextStringRes", "", "getCtaTextStringRes", "()I", "isCtaEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "ReviewState", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlipOnboardingAgreementsViewState {
    public static final int $stable = 8;
    private final String acknowledgeContent;
    private final List<String> additionalCheckboxes;
    private final UiEvent<Unit> agreementsAcceptedEvent;
    private final ImmutableList<UiSlipAgreements.AgreementV2> agreementsV2;
    private final boolean allCheckboxesChecked;
    private final UiSlipAgreements.TextLink crsLink;
    private final UiEvent<Throwable> errorEvent;
    private final List<ExpandableAgreement> expandableAgreements;
    private final boolean isLoading;
    private final ReviewState reviewState;
    private final UiEvent<Unit> scrollToBottomEvent;
    private final String subtitleMarkdown;
    private final List<UIComponent<GenericAction>> summaryItems;
    private final String summaryTitle;
    private final String title;
    private final User user;

    /* compiled from: SlipOnboardingAgreementsViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReviewState.values().length];
            try {
                iArr[ReviewState.REVIEWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReviewState.ACCEPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SlipOnboardingAgreementsViewState() {
        this(null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    /* renamed from: component1, reason: from getter */
    private final User getUser() {
        return this.user;
    }

    public final List<String> component10() {
        return this.additionalCheckboxes;
    }

    public final UiEvent<Unit> component11() {
        return this.agreementsAcceptedEvent;
    }

    public final UiEvent<Unit> component12() {
        return this.scrollToBottomEvent;
    }

    /* renamed from: component13, reason: from getter */
    public final ReviewState getReviewState() {
        return this.reviewState;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getAllCheckboxesChecked() {
        return this.allCheckboxesChecked;
    }

    public final ImmutableList<UiSlipAgreements.AgreementV2> component15() {
        return this.agreementsV2;
    }

    public final UiEvent<Throwable> component16() {
        return this.errorEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAcknowledgeContent() {
        return this.acknowledgeContent;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSummaryTitle() {
        return this.summaryTitle;
    }

    public final List<UIComponent<GenericAction>> component7() {
        return this.summaryItems;
    }

    /* renamed from: component8, reason: from getter */
    public final UiSlipAgreements.TextLink getCrsLink() {
        return this.crsLink;
    }

    public final List<ExpandableAgreement> component9() {
        return this.expandableAgreements;
    }

    public final SlipOnboardingAgreementsViewState copy(User user, boolean isLoading, String title, String subtitleMarkdown, String acknowledgeContent, String summaryTitle, List<? extends UIComponent<? extends GenericAction>> summaryItems, UiSlipAgreements.TextLink crsLink, List<ExpandableAgreement> expandableAgreements, List<String> additionalCheckboxes, UiEvent<Unit> agreementsAcceptedEvent, UiEvent<Unit> scrollToBottomEvent, ReviewState reviewState, boolean allCheckboxesChecked, ImmutableList<UiSlipAgreements.AgreementV2> agreementsV2, UiEvent<Throwable> errorEvent) {
        Intrinsics.checkNotNullParameter(summaryItems, "summaryItems");
        Intrinsics.checkNotNullParameter(expandableAgreements, "expandableAgreements");
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        return new SlipOnboardingAgreementsViewState(user, isLoading, title, subtitleMarkdown, acknowledgeContent, summaryTitle, summaryItems, crsLink, expandableAgreements, additionalCheckboxes, agreementsAcceptedEvent, scrollToBottomEvent, reviewState, allCheckboxesChecked, agreementsV2, errorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlipOnboardingAgreementsViewState)) {
            return false;
        }
        SlipOnboardingAgreementsViewState slipOnboardingAgreementsViewState = (SlipOnboardingAgreementsViewState) other;
        return Intrinsics.areEqual(this.user, slipOnboardingAgreementsViewState.user) && this.isLoading == slipOnboardingAgreementsViewState.isLoading && Intrinsics.areEqual(this.title, slipOnboardingAgreementsViewState.title) && Intrinsics.areEqual(this.subtitleMarkdown, slipOnboardingAgreementsViewState.subtitleMarkdown) && Intrinsics.areEqual(this.acknowledgeContent, slipOnboardingAgreementsViewState.acknowledgeContent) && Intrinsics.areEqual(this.summaryTitle, slipOnboardingAgreementsViewState.summaryTitle) && Intrinsics.areEqual(this.summaryItems, slipOnboardingAgreementsViewState.summaryItems) && Intrinsics.areEqual(this.crsLink, slipOnboardingAgreementsViewState.crsLink) && Intrinsics.areEqual(this.expandableAgreements, slipOnboardingAgreementsViewState.expandableAgreements) && Intrinsics.areEqual(this.additionalCheckboxes, slipOnboardingAgreementsViewState.additionalCheckboxes) && Intrinsics.areEqual(this.agreementsAcceptedEvent, slipOnboardingAgreementsViewState.agreementsAcceptedEvent) && Intrinsics.areEqual(this.scrollToBottomEvent, slipOnboardingAgreementsViewState.scrollToBottomEvent) && this.reviewState == slipOnboardingAgreementsViewState.reviewState && this.allCheckboxesChecked == slipOnboardingAgreementsViewState.allCheckboxesChecked && Intrinsics.areEqual(this.agreementsV2, slipOnboardingAgreementsViewState.agreementsV2) && Intrinsics.areEqual(this.errorEvent, slipOnboardingAgreementsViewState.errorEvent);
    }

    public int hashCode() {
        User user = this.user;
        int iHashCode = (((user == null ? 0 : user.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitleMarkdown;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acknowledgeContent;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.summaryTitle;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.summaryItems.hashCode()) * 31;
        UiSlipAgreements.TextLink textLink = this.crsLink;
        int iHashCode6 = (((iHashCode5 + (textLink == null ? 0 : textLink.hashCode())) * 31) + this.expandableAgreements.hashCode()) * 31;
        List<String> list = this.additionalCheckboxes;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.agreementsAcceptedEvent;
        int iHashCode8 = (iHashCode7 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.scrollToBottomEvent;
        int iHashCode9 = (((((iHashCode8 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + this.reviewState.hashCode()) * 31) + Boolean.hashCode(this.allCheckboxesChecked)) * 31;
        ImmutableList<UiSlipAgreements.AgreementV2> immutableList = this.agreementsV2;
        int iHashCode10 = (iHashCode9 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        UiEvent<Throwable> uiEvent3 = this.errorEvent;
        return iHashCode10 + (uiEvent3 != null ? uiEvent3.hashCode() : 0);
    }

    public String toString() {
        return "SlipOnboardingAgreementsViewState(user=" + this.user + ", isLoading=" + this.isLoading + ", title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", acknowledgeContent=" + this.acknowledgeContent + ", summaryTitle=" + this.summaryTitle + ", summaryItems=" + this.summaryItems + ", crsLink=" + this.crsLink + ", expandableAgreements=" + this.expandableAgreements + ", additionalCheckboxes=" + this.additionalCheckboxes + ", agreementsAcceptedEvent=" + this.agreementsAcceptedEvent + ", scrollToBottomEvent=" + this.scrollToBottomEvent + ", reviewState=" + this.reviewState + ", allCheckboxesChecked=" + this.allCheckboxesChecked + ", agreementsV2=" + this.agreementsV2 + ", errorEvent=" + this.errorEvent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SlipOnboardingAgreementsViewState(User user, boolean z, String str, String str2, String str3, String str4, List<? extends UIComponent<? extends GenericAction>> summaryItems, UiSlipAgreements.TextLink textLink, List<ExpandableAgreement> expandableAgreements, List<String> list, UiEvent<Unit> uiEvent, UiEvent<Unit> uiEvent2, ReviewState reviewState, boolean z2, ImmutableList<UiSlipAgreements.AgreementV2> immutableList, UiEvent<Throwable> uiEvent3) {
        Intrinsics.checkNotNullParameter(summaryItems, "summaryItems");
        Intrinsics.checkNotNullParameter(expandableAgreements, "expandableAgreements");
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        this.user = user;
        this.isLoading = z;
        this.title = str;
        this.subtitleMarkdown = str2;
        this.acknowledgeContent = str3;
        this.summaryTitle = str4;
        this.summaryItems = summaryItems;
        this.crsLink = textLink;
        this.expandableAgreements = expandableAgreements;
        this.additionalCheckboxes = list;
        this.agreementsAcceptedEvent = uiEvent;
        this.scrollToBottomEvent = uiEvent2;
        this.reviewState = reviewState;
        this.allCheckboxesChecked = z2;
        this.agreementsV2 = immutableList;
        this.errorEvent = uiEvent3;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final String getAcknowledgeContent() {
        return this.acknowledgeContent;
    }

    public final String getSummaryTitle() {
        return this.summaryTitle;
    }

    public /* synthetic */ SlipOnboardingAgreementsViewState(User user, boolean z, String str, String str2, String str3, String str4, List list, UiSlipAgreements.TextLink textLink, List list2, List list3, UiEvent uiEvent, UiEvent uiEvent2, ReviewState reviewState, boolean z2, ImmutableList immutableList, UiEvent uiEvent3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : textLink, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : uiEvent, (i & 2048) != 0 ? null : uiEvent2, (i & 4096) != 0 ? ReviewState.REVIEWING : reviewState, (i & 8192) != 0 ? true : z2, (i & 16384) != 0 ? null : immutableList, (i & 32768) != 0 ? null : uiEvent3);
    }

    public final List<UIComponent<GenericAction>> getSummaryItems() {
        return this.summaryItems;
    }

    public final UiSlipAgreements.TextLink getCrsLink() {
        return this.crsLink;
    }

    public final List<ExpandableAgreement> getExpandableAgreements() {
        return this.expandableAgreements;
    }

    public final List<String> getAdditionalCheckboxes() {
        return this.additionalCheckboxes;
    }

    public final UiEvent<Unit> getAgreementsAcceptedEvent() {
        return this.agreementsAcceptedEvent;
    }

    public final UiEvent<Unit> getScrollToBottomEvent() {
        return this.scrollToBottomEvent;
    }

    public final ReviewState getReviewState() {
        return this.reviewState;
    }

    public final boolean getAllCheckboxesChecked() {
        return this.allCheckboxesChecked;
    }

    public final ImmutableList<UiSlipAgreements.AgreementV2> getAgreementsV2() {
        return this.agreementsV2;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final boolean isAcknowledgeContentLightTextColor() {
        User.Origin origin;
        User user = this.user;
        return !Intrinsics.areEqual((user == null || (origin = user.getOrigin()) == null) ? null : origin.getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE);
    }

    public final int getCtaTextStringRes() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.reviewState.ordinal()];
        if (i == 1) {
            return C11048R.string.general_action_review;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C11048R.string.general_action_agree;
    }

    public final boolean isCtaEnabled() {
        return this.allCheckboxesChecked && !this.isLoading;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SlipOnboardingAgreementsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsViewState$ReviewState;", "", "<init>", "(Ljava/lang/String;I)V", "REVIEWING", "ACCEPT", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReviewState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReviewState[] $VALUES;
        public static final ReviewState REVIEWING = new ReviewState("REVIEWING", 0);
        public static final ReviewState ACCEPT = new ReviewState("ACCEPT", 1);

        private static final /* synthetic */ ReviewState[] $values() {
            return new ReviewState[]{REVIEWING, ACCEPT};
        }

        public static EnumEntries<ReviewState> getEntries() {
            return $ENTRIES;
        }

        private ReviewState(String str, int i) {
        }

        static {
            ReviewState[] reviewStateArr$values = $values();
            $VALUES = reviewStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(reviewStateArr$values);
        }

        public static ReviewState valueOf(String str) {
            return (ReviewState) Enum.valueOf(ReviewState.class, str);
        }

        public static ReviewState[] values() {
            return (ReviewState[]) $VALUES.clone();
        }
    }
}
