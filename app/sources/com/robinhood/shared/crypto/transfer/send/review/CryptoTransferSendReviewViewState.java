package com.robinhood.shared.crypto.transfer.send.review;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendReviewViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00102\u001a\u00020\u0014HÆ\u0003J{\u00103\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u00104\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewViewState;", "", "disclosureUrl", "", "helperText", "Lcom/robinhood/utils/resource/StringResource;", "isLoading", "", "isSubmitButtonEnabled", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "reviewDetailsState", "Lcom/robinhood/shared/crypto/transfer/send/review/ReviewDetailsState;", "submitButtonText", "warningSheetBody", "", "warningSheetTitle", "withdrawalId", "Ljava/util/UUID;", "<init>", "(ILcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/shared/crypto/transfer/send/review/ReviewDetailsState;ILjava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getDisclosureUrl", "()I", "getHelperText", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getReviewDetailsState", "()Lcom/robinhood/shared/crypto/transfer/send/review/ReviewDetailsState;", "getSubmitButtonText", "getWarningSheetBody", "()Ljava/lang/String;", "getWarningSheetTitle", "getWithdrawalId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSendReviewViewState {
    public static final int $stable = 8;
    private final int disclosureUrl;
    private final StringResource helperText;
    private final boolean isLoading;
    private final boolean isSubmitButtonEnabled;
    private final Context loggingContext;
    private final Screen loggingScreen;
    private final ReviewDetailsState reviewDetailsState;
    private final int submitButtonText;
    private final String warningSheetBody;
    private final String warningSheetTitle;
    private final UUID withdrawalId;

    public static /* synthetic */ CryptoTransferSendReviewViewState copy$default(CryptoTransferSendReviewViewState cryptoTransferSendReviewViewState, int i, StringResource stringResource, boolean z, boolean z2, Context context, Screen screen, ReviewDetailsState cryptoTransferSendReviewComposable5, int i2, String str, String str2, UUID uuid, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cryptoTransferSendReviewViewState.disclosureUrl;
        }
        if ((i3 & 2) != 0) {
            stringResource = cryptoTransferSendReviewViewState.helperText;
        }
        if ((i3 & 4) != 0) {
            z = cryptoTransferSendReviewViewState.isLoading;
        }
        if ((i3 & 8) != 0) {
            z2 = cryptoTransferSendReviewViewState.isSubmitButtonEnabled;
        }
        if ((i3 & 16) != 0) {
            context = cryptoTransferSendReviewViewState.loggingContext;
        }
        if ((i3 & 32) != 0) {
            screen = cryptoTransferSendReviewViewState.loggingScreen;
        }
        if ((i3 & 64) != 0) {
            cryptoTransferSendReviewComposable5 = cryptoTransferSendReviewViewState.reviewDetailsState;
        }
        if ((i3 & 128) != 0) {
            i2 = cryptoTransferSendReviewViewState.submitButtonText;
        }
        if ((i3 & 256) != 0) {
            str = cryptoTransferSendReviewViewState.warningSheetBody;
        }
        if ((i3 & 512) != 0) {
            str2 = cryptoTransferSendReviewViewState.warningSheetTitle;
        }
        if ((i3 & 1024) != 0) {
            uuid = cryptoTransferSendReviewViewState.withdrawalId;
        }
        String str3 = str2;
        UUID uuid2 = uuid;
        int i4 = i2;
        String str4 = str;
        Screen screen2 = screen;
        ReviewDetailsState cryptoTransferSendReviewComposable52 = cryptoTransferSendReviewComposable5;
        Context context2 = context;
        boolean z3 = z;
        return cryptoTransferSendReviewViewState.copy(i, stringResource, z3, z2, context2, screen2, cryptoTransferSendReviewComposable52, i4, str4, str3, uuid2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDisclosureUrl() {
        return this.disclosureUrl;
    }

    /* renamed from: component10, reason: from getter */
    public final String getWarningSheetTitle() {
        return this.warningSheetTitle;
    }

    /* renamed from: component11, reason: from getter */
    public final UUID getWithdrawalId() {
        return this.withdrawalId;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getHelperText() {
        return this.helperText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSubmitButtonEnabled() {
        return this.isSubmitButtonEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final Context getLoggingContext() {
        return this.loggingContext;
    }

    /* renamed from: component6, reason: from getter */
    public final Screen getLoggingScreen() {
        return this.loggingScreen;
    }

    /* renamed from: component7, reason: from getter */
    public final ReviewDetailsState getReviewDetailsState() {
        return this.reviewDetailsState;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSubmitButtonText() {
        return this.submitButtonText;
    }

    /* renamed from: component9, reason: from getter */
    public final String getWarningSheetBody() {
        return this.warningSheetBody;
    }

    public final CryptoTransferSendReviewViewState copy(int disclosureUrl, StringResource helperText, boolean isLoading, boolean isSubmitButtonEnabled, Context loggingContext, Screen loggingScreen, ReviewDetailsState reviewDetailsState, int submitButtonText, String warningSheetBody, String warningSheetTitle, UUID withdrawalId) {
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(loggingScreen, "loggingScreen");
        Intrinsics.checkNotNullParameter(reviewDetailsState, "reviewDetailsState");
        Intrinsics.checkNotNullParameter(withdrawalId, "withdrawalId");
        return new CryptoTransferSendReviewViewState(disclosureUrl, helperText, isLoading, isSubmitButtonEnabled, loggingContext, loggingScreen, reviewDetailsState, submitButtonText, warningSheetBody, warningSheetTitle, withdrawalId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSendReviewViewState)) {
            return false;
        }
        CryptoTransferSendReviewViewState cryptoTransferSendReviewViewState = (CryptoTransferSendReviewViewState) other;
        return this.disclosureUrl == cryptoTransferSendReviewViewState.disclosureUrl && Intrinsics.areEqual(this.helperText, cryptoTransferSendReviewViewState.helperText) && this.isLoading == cryptoTransferSendReviewViewState.isLoading && this.isSubmitButtonEnabled == cryptoTransferSendReviewViewState.isSubmitButtonEnabled && Intrinsics.areEqual(this.loggingContext, cryptoTransferSendReviewViewState.loggingContext) && Intrinsics.areEqual(this.loggingScreen, cryptoTransferSendReviewViewState.loggingScreen) && Intrinsics.areEqual(this.reviewDetailsState, cryptoTransferSendReviewViewState.reviewDetailsState) && this.submitButtonText == cryptoTransferSendReviewViewState.submitButtonText && Intrinsics.areEqual(this.warningSheetBody, cryptoTransferSendReviewViewState.warningSheetBody) && Intrinsics.areEqual(this.warningSheetTitle, cryptoTransferSendReviewViewState.warningSheetTitle) && Intrinsics.areEqual(this.withdrawalId, cryptoTransferSendReviewViewState.withdrawalId);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((Integer.hashCode(this.disclosureUrl) * 31) + this.helperText.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isSubmitButtonEnabled)) * 31) + this.loggingContext.hashCode()) * 31) + this.loggingScreen.hashCode()) * 31) + this.reviewDetailsState.hashCode()) * 31) + Integer.hashCode(this.submitButtonText)) * 31;
        String str = this.warningSheetBody;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.warningSheetTitle;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.withdrawalId.hashCode();
    }

    public String toString() {
        return "CryptoTransferSendReviewViewState(disclosureUrl=" + this.disclosureUrl + ", helperText=" + this.helperText + ", isLoading=" + this.isLoading + ", isSubmitButtonEnabled=" + this.isSubmitButtonEnabled + ", loggingContext=" + this.loggingContext + ", loggingScreen=" + this.loggingScreen + ", reviewDetailsState=" + this.reviewDetailsState + ", submitButtonText=" + this.submitButtonText + ", warningSheetBody=" + this.warningSheetBody + ", warningSheetTitle=" + this.warningSheetTitle + ", withdrawalId=" + this.withdrawalId + ")";
    }

    public CryptoTransferSendReviewViewState(int i, StringResource helperText, boolean z, boolean z2, Context loggingContext, Screen loggingScreen, ReviewDetailsState reviewDetailsState, int i2, String str, String str2, UUID withdrawalId) {
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(loggingScreen, "loggingScreen");
        Intrinsics.checkNotNullParameter(reviewDetailsState, "reviewDetailsState");
        Intrinsics.checkNotNullParameter(withdrawalId, "withdrawalId");
        this.disclosureUrl = i;
        this.helperText = helperText;
        this.isLoading = z;
        this.isSubmitButtonEnabled = z2;
        this.loggingContext = loggingContext;
        this.loggingScreen = loggingScreen;
        this.reviewDetailsState = reviewDetailsState;
        this.submitButtonText = i2;
        this.warningSheetBody = str;
        this.warningSheetTitle = str2;
        this.withdrawalId = withdrawalId;
    }

    public final int getDisclosureUrl() {
        return this.disclosureUrl;
    }

    public final StringResource getHelperText() {
        return this.helperText;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSubmitButtonEnabled() {
        return this.isSubmitButtonEnabled;
    }

    public final Context getLoggingContext() {
        return this.loggingContext;
    }

    public final Screen getLoggingScreen() {
        return this.loggingScreen;
    }

    public final ReviewDetailsState getReviewDetailsState() {
        return this.reviewDetailsState;
    }

    public final int getSubmitButtonText() {
        return this.submitButtonText;
    }

    public final String getWarningSheetBody() {
        return this.warningSheetBody;
    }

    public final String getWarningSheetTitle() {
        return this.warningSheetTitle;
    }

    public final UUID getWithdrawalId() {
        return this.withdrawalId;
    }
}
