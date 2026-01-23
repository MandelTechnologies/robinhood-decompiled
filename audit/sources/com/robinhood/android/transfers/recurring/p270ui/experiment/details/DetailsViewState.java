package com.robinhood.android.transfers.recurring.p270ui.experiment.details;

import com.robinhood.android.transfers.recurring.p270ui.LoadableString;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00011Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003J\u0081\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState;", "", "isCancelDialogVisible", "", "isCancelConfirmationDialogVisible", "isPauseDialogVisible", "isResumeConfirmationDialogVisible", "infoBanner", "Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "subtitle", "Lcom/robinhood/android/transfers/recurring/ui/LoadableString;", "bankAccountName", "maximumBalance", Footer.f10637type, WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "<init>", "(ZZZZLcom/robinhood/models/serverdriven/experimental/api/InfoBanner;Lcom/robinhood/android/transfers/recurring/ui/LoadableString;Lcom/robinhood/android/transfers/recurring/ui/LoadableString;Lcom/robinhood/android/transfers/recurring/ui/LoadableString;Lcom/robinhood/android/transfers/recurring/ui/LoadableString;Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button;Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button;)V", "()Z", "getInfoBanner", "()Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "getSubtitle", "()Lcom/robinhood/android/transfers/recurring/ui/LoadableString;", "getBankAccountName", "getMaximumBalance", "getFooter", "getPrimaryButton", "()Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button;", "getSecondaryButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "", "Button", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DetailsViewState {
    public static final int $stable = 8;
    private final LoadableString bankAccountName;
    private final LoadableString footer;
    private final InfoBanner<GenericAction> infoBanner;
    private final boolean isCancelConfirmationDialogVisible;
    private final boolean isCancelDialogVisible;
    private final boolean isPauseDialogVisible;
    private final boolean isResumeConfirmationDialogVisible;
    private final LoadableString maximumBalance;
    private final Button primaryButton;
    private final Button secondaryButton;
    private final LoadableString subtitle;

    public static /* synthetic */ DetailsViewState copy$default(DetailsViewState detailsViewState, boolean z, boolean z2, boolean z3, boolean z4, InfoBanner infoBanner, LoadableString loadableString, LoadableString loadableString2, LoadableString loadableString3, LoadableString loadableString4, Button button, Button button2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = detailsViewState.isCancelDialogVisible;
        }
        if ((i & 2) != 0) {
            z2 = detailsViewState.isCancelConfirmationDialogVisible;
        }
        if ((i & 4) != 0) {
            z3 = detailsViewState.isPauseDialogVisible;
        }
        if ((i & 8) != 0) {
            z4 = detailsViewState.isResumeConfirmationDialogVisible;
        }
        if ((i & 16) != 0) {
            infoBanner = detailsViewState.infoBanner;
        }
        if ((i & 32) != 0) {
            loadableString = detailsViewState.subtitle;
        }
        if ((i & 64) != 0) {
            loadableString2 = detailsViewState.bankAccountName;
        }
        if ((i & 128) != 0) {
            loadableString3 = detailsViewState.maximumBalance;
        }
        if ((i & 256) != 0) {
            loadableString4 = detailsViewState.footer;
        }
        if ((i & 512) != 0) {
            button = detailsViewState.primaryButton;
        }
        if ((i & 1024) != 0) {
            button2 = detailsViewState.secondaryButton;
        }
        Button button3 = button;
        Button button4 = button2;
        LoadableString loadableString5 = loadableString3;
        LoadableString loadableString6 = loadableString4;
        LoadableString loadableString7 = loadableString;
        LoadableString loadableString8 = loadableString2;
        InfoBanner infoBanner2 = infoBanner;
        boolean z5 = z3;
        return detailsViewState.copy(z, z2, z5, z4, infoBanner2, loadableString7, loadableString8, loadableString5, loadableString6, button3, button4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCancelDialogVisible() {
        return this.isCancelDialogVisible;
    }

    /* renamed from: component10, reason: from getter */
    public final Button getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component11, reason: from getter */
    public final Button getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCancelConfirmationDialogVisible() {
        return this.isCancelConfirmationDialogVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPauseDialogVisible() {
        return this.isPauseDialogVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsResumeConfirmationDialogVisible() {
        return this.isResumeConfirmationDialogVisible;
    }

    public final InfoBanner<GenericAction> component5() {
        return this.infoBanner;
    }

    /* renamed from: component6, reason: from getter */
    public final LoadableString getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component7, reason: from getter */
    public final LoadableString getBankAccountName() {
        return this.bankAccountName;
    }

    /* renamed from: component8, reason: from getter */
    public final LoadableString getMaximumBalance() {
        return this.maximumBalance;
    }

    /* renamed from: component9, reason: from getter */
    public final LoadableString getFooter() {
        return this.footer;
    }

    public final DetailsViewState copy(boolean isCancelDialogVisible, boolean isCancelConfirmationDialogVisible, boolean isPauseDialogVisible, boolean isResumeConfirmationDialogVisible, InfoBanner<? extends GenericAction> infoBanner, LoadableString subtitle, LoadableString bankAccountName, LoadableString maximumBalance, LoadableString footer, Button primaryButton, Button secondaryButton) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(bankAccountName, "bankAccountName");
        Intrinsics.checkNotNullParameter(maximumBalance, "maximumBalance");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        return new DetailsViewState(isCancelDialogVisible, isCancelConfirmationDialogVisible, isPauseDialogVisible, isResumeConfirmationDialogVisible, infoBanner, subtitle, bankAccountName, maximumBalance, footer, primaryButton, secondaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailsViewState)) {
            return false;
        }
        DetailsViewState detailsViewState = (DetailsViewState) other;
        return this.isCancelDialogVisible == detailsViewState.isCancelDialogVisible && this.isCancelConfirmationDialogVisible == detailsViewState.isCancelConfirmationDialogVisible && this.isPauseDialogVisible == detailsViewState.isPauseDialogVisible && this.isResumeConfirmationDialogVisible == detailsViewState.isResumeConfirmationDialogVisible && Intrinsics.areEqual(this.infoBanner, detailsViewState.infoBanner) && Intrinsics.areEqual(this.subtitle, detailsViewState.subtitle) && Intrinsics.areEqual(this.bankAccountName, detailsViewState.bankAccountName) && Intrinsics.areEqual(this.maximumBalance, detailsViewState.maximumBalance) && Intrinsics.areEqual(this.footer, detailsViewState.footer) && Intrinsics.areEqual(this.primaryButton, detailsViewState.primaryButton) && Intrinsics.areEqual(this.secondaryButton, detailsViewState.secondaryButton);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isCancelDialogVisible) * 31) + Boolean.hashCode(this.isCancelConfirmationDialogVisible)) * 31) + Boolean.hashCode(this.isPauseDialogVisible)) * 31) + Boolean.hashCode(this.isResumeConfirmationDialogVisible)) * 31;
        InfoBanner<GenericAction> infoBanner = this.infoBanner;
        int iHashCode2 = (((((((iHashCode + (infoBanner == null ? 0 : infoBanner.hashCode())) * 31) + this.subtitle.hashCode()) * 31) + this.bankAccountName.hashCode()) * 31) + this.maximumBalance.hashCode()) * 31;
        LoadableString loadableString = this.footer;
        return ((((iHashCode2 + (loadableString != null ? loadableString.hashCode() : 0)) * 31) + this.primaryButton.hashCode()) * 31) + this.secondaryButton.hashCode();
    }

    public String toString() {
        return "DetailsViewState(isCancelDialogVisible=" + this.isCancelDialogVisible + ", isCancelConfirmationDialogVisible=" + this.isCancelConfirmationDialogVisible + ", isPauseDialogVisible=" + this.isPauseDialogVisible + ", isResumeConfirmationDialogVisible=" + this.isResumeConfirmationDialogVisible + ", infoBanner=" + this.infoBanner + ", subtitle=" + this.subtitle + ", bankAccountName=" + this.bankAccountName + ", maximumBalance=" + this.maximumBalance + ", footer=" + this.footer + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DetailsViewState(boolean z, boolean z2, boolean z3, boolean z4, InfoBanner<? extends GenericAction> infoBanner, LoadableString subtitle, LoadableString bankAccountName, LoadableString maximumBalance, LoadableString loadableString, Button primaryButton, Button secondaryButton) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(bankAccountName, "bankAccountName");
        Intrinsics.checkNotNullParameter(maximumBalance, "maximumBalance");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.isCancelDialogVisible = z;
        this.isCancelConfirmationDialogVisible = z2;
        this.isPauseDialogVisible = z3;
        this.isResumeConfirmationDialogVisible = z4;
        this.infoBanner = infoBanner;
        this.subtitle = subtitle;
        this.bankAccountName = bankAccountName;
        this.maximumBalance = maximumBalance;
        this.footer = loadableString;
        this.primaryButton = primaryButton;
        this.secondaryButton = secondaryButton;
    }

    public final boolean isCancelDialogVisible() {
        return this.isCancelDialogVisible;
    }

    public final boolean isCancelConfirmationDialogVisible() {
        return this.isCancelConfirmationDialogVisible;
    }

    public final boolean isPauseDialogVisible() {
        return this.isPauseDialogVisible;
    }

    public final boolean isResumeConfirmationDialogVisible() {
        return this.isResumeConfirmationDialogVisible;
    }

    public final InfoBanner<GenericAction> getInfoBanner() {
        return this.infoBanner;
    }

    public final LoadableString getSubtitle() {
        return this.subtitle;
    }

    public final LoadableString getBankAccountName() {
        return this.bankAccountName;
    }

    public final LoadableString getMaximumBalance() {
        return this.maximumBalance;
    }

    public final LoadableString getFooter() {
        return this.footer;
    }

    public final Button getPrimaryButton() {
        return this.primaryButton;
    }

    public final Button getSecondaryButton() {
        return this.secondaryButton;
    }

    /* compiled from: DetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button;", "", "isEnabled", "", "isLoading", "text", "", "action", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button$Action;", "useNegativeStyle", "<init>", "(ZZLjava/lang/String;Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button$Action;Z)V", "()Z", "getText", "()Ljava/lang/String;", "getAction", "()Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button$Action;", "getUseNegativeStyle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Action", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = 0;
        private final Action action;
        private final boolean isEnabled;
        private final boolean isLoading;
        private final String text;
        private final boolean useNegativeStyle;

        public static /* synthetic */ Button copy$default(Button button, boolean z, boolean z2, String str, Action action, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = button.isEnabled;
            }
            if ((i & 2) != 0) {
                z2 = button.isLoading;
            }
            if ((i & 4) != 0) {
                str = button.text;
            }
            if ((i & 8) != 0) {
                action = button.action;
            }
            if ((i & 16) != 0) {
                z3 = button.useNegativeStyle;
            }
            boolean z4 = z3;
            String str2 = str;
            return button.copy(z, z2, str2, action, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getUseNegativeStyle() {
            return this.useNegativeStyle;
        }

        public final Button copy(boolean isEnabled, boolean isLoading, String text, Action action, boolean useNegativeStyle) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            return new Button(isEnabled, isLoading, text, action, useNegativeStyle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return this.isEnabled == button.isEnabled && this.isLoading == button.isLoading && Intrinsics.areEqual(this.text, button.text) && this.action == button.action && this.useNegativeStyle == button.useNegativeStyle;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isEnabled) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.text.hashCode()) * 31) + this.action.hashCode()) * 31) + Boolean.hashCode(this.useNegativeStyle);
        }

        public String toString() {
            return "Button(isEnabled=" + this.isEnabled + ", isLoading=" + this.isLoading + ", text=" + this.text + ", action=" + this.action + ", useNegativeStyle=" + this.useNegativeStyle + ")";
        }

        public Button(boolean z, boolean z2, String text, Action action, boolean z3) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.isEnabled = z;
            this.isLoading = z2;
            this.text = text;
            this.action = action;
            this.useNegativeStyle = z3;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final String getText() {
            return this.text;
        }

        public final Action getAction() {
            return this.action;
        }

        public final boolean getUseNegativeStyle() {
            return this.useNegativeStyle;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DetailsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button$Action;", "", "<init>", "(Ljava/lang/String;I)V", "CANCEL", "PAUSE", "RESUME", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Action {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            public static final Action CANCEL = new Action("CANCEL", 0);
            public static final Action PAUSE = new Action("PAUSE", 1);
            public static final Action RESUME = new Action("RESUME", 2);

            private static final /* synthetic */ Action[] $values() {
                return new Action[]{CANCEL, PAUSE, RESUME};
            }

            public static EnumEntries<Action> getEntries() {
                return $ENTRIES;
            }

            private Action(String str, int i) {
            }

            static {
                Action[] actionArr$values = $values();
                $VALUES = actionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }
        }
    }
}
