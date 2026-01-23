package com.robinhood.android.transfers.p271ui.p272v2;

import android.net.Uri;
import bff_money_movement.service.p019v1.TransferValidationErrorDetailsDto;
import com.robinhood.android.engagement.depositincentive.model.DepositIncentiveCancellationDialogData;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetFragmentKey;
import com.robinhood.android.transfers.lib.validation.ValidationFailure;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment;
import com.robinhood.models.api.bonfire.transfer.AssetRetentionUpsellContent;
import com.robinhood.models.api.bonfire.transfer.ClawbackGracePeriodContent;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.DisplayRTPUpsellAction;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferV2Event.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0082\u0001\u0017\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "", "CreateTransferError", "Deeplink", "EditIraDistributionType", "EditIraDistributionTaxWithholding", "Finish", "FrequencySelection", "IraContributionQuestionnaire", "IraDistributionQuestionnaire", "Precreate", "PrecreateAssetRetention", "Success", "ValidationError", "VerificationWorkflow", "LaunchDialog", "ShowActivity", "StartActivityForResult", "ShowFragment", "ShowValidationAlert", "ShowDepositIncentiveCancellationAlert", "ThreeDSVerification", "ShowClawbackGracePeriodContent", "AddNewAccount", "SendWireTransfer", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$AddNewAccount;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$CreateTransferError;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$Deeplink;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$EditIraDistributionTaxWithholding;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$EditIraDistributionType;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$Finish;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$FrequencySelection;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$IraContributionQuestionnaire;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$IraDistributionQuestionnaire;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$LaunchDialog;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$Precreate;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$PrecreateAssetRetention;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$SendWireTransfer;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ShowActivity;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ShowClawbackGracePeriodContent;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ShowDepositIncentiveCancellationAlert;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ShowFragment;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ShowValidationAlert;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$StartActivityForResult;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$Success;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ThreeDSVerification;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ValidationError;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$VerificationWorkflow;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface CreateTransferV2Event {

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$CreateTransferError;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CreateTransferError implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ CreateTransferError copy$default(CreateTransferError createTransferError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = createTransferError.throwable;
            }
            return createTransferError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final CreateTransferError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new CreateTransferError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateTransferError) && Intrinsics.areEqual(this.throwable, ((CreateTransferError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "CreateTransferError(throwable=" + this.throwable + ")";
        }

        public CreateTransferError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$Deeplink;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Deeplink implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final Uri uri;

        public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = deeplink.uri;
            }
            return deeplink.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final Deeplink copy(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new Deeplink(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Deeplink) && Intrinsics.areEqual(this.uri, ((Deeplink) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "Deeplink(uri=" + this.uri + ")";
        }

        public Deeplink(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$EditIraDistributionType;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "launchMode", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode$EditDistributionType;", "<init>", "(Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode$EditDistributionType;)V", "getLaunchMode", "()Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode$EditDistributionType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EditIraDistributionType implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final IraDistributionQuestionnaireLaunchMode.EditDistributionType launchMode;

        public static /* synthetic */ EditIraDistributionType copy$default(EditIraDistributionType editIraDistributionType, IraDistributionQuestionnaireLaunchMode.EditDistributionType editDistributionType, int i, Object obj) {
            if ((i & 1) != 0) {
                editDistributionType = editIraDistributionType.launchMode;
            }
            return editIraDistributionType.copy(editDistributionType);
        }

        /* renamed from: component1, reason: from getter */
        public final IraDistributionQuestionnaireLaunchMode.EditDistributionType getLaunchMode() {
            return this.launchMode;
        }

        public final EditIraDistributionType copy(IraDistributionQuestionnaireLaunchMode.EditDistributionType launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            return new EditIraDistributionType(launchMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditIraDistributionType) && Intrinsics.areEqual(this.launchMode, ((EditIraDistributionType) other).launchMode);
        }

        public int hashCode() {
            return this.launchMode.hashCode();
        }

        public String toString() {
            return "EditIraDistributionType(launchMode=" + this.launchMode + ")";
        }

        public EditIraDistributionType(IraDistributionQuestionnaireLaunchMode.EditDistributionType launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            this.launchMode = launchMode;
        }

        public final IraDistributionQuestionnaireLaunchMode.EditDistributionType getLaunchMode() {
            return this.launchMode;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$EditIraDistributionTaxWithholding;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "args", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Args;", "<init>", "(Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Args;)V", "getArgs", "()Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EditIraDistributionTaxWithholding implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final IraDistributionTaxWithholdingBottomSheetFragment.Args args;

        public static /* synthetic */ EditIraDistributionTaxWithholding copy$default(EditIraDistributionTaxWithholding editIraDistributionTaxWithholding, IraDistributionTaxWithholdingBottomSheetFragment.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = editIraDistributionTaxWithholding.args;
            }
            return editIraDistributionTaxWithholding.copy(args);
        }

        /* renamed from: component1, reason: from getter */
        public final IraDistributionTaxWithholdingBottomSheetFragment.Args getArgs() {
            return this.args;
        }

        public final EditIraDistributionTaxWithholding copy(IraDistributionTaxWithholdingBottomSheetFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new EditIraDistributionTaxWithholding(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditIraDistributionTaxWithholding) && Intrinsics.areEqual(this.args, ((EditIraDistributionTaxWithholding) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "EditIraDistributionTaxWithholding(args=" + this.args + ")";
        }

        public EditIraDistributionTaxWithholding(IraDistributionTaxWithholdingBottomSheetFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        public final IraDistributionTaxWithholdingBottomSheetFragment.Args getArgs() {
            return this.args;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$Finish;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Finish implements CreateTransferV2Event {
        public static final int $stable = 0;
        public static final Finish INSTANCE = new Finish();

        public boolean equals(Object other) {
            return this == other || (other instanceof Finish);
        }

        public int hashCode() {
            return -1335348452;
        }

        public String toString() {
            return "Finish";
        }

        private Finish() {
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$FrequencySelection;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "key", "Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetFragmentKey;", "<init>", "(Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetFragmentKey;)V", "getKey", "()Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FrequencySelection implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final TransferFrequencyBottomSheetFragmentKey key;

        public static /* synthetic */ FrequencySelection copy$default(FrequencySelection frequencySelection, TransferFrequencyBottomSheetFragmentKey transferFrequencyBottomSheetFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                transferFrequencyBottomSheetFragmentKey = frequencySelection.key;
            }
            return frequencySelection.copy(transferFrequencyBottomSheetFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferFrequencyBottomSheetFragmentKey getKey() {
            return this.key;
        }

        public final FrequencySelection copy(TransferFrequencyBottomSheetFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new FrequencySelection(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FrequencySelection) && Intrinsics.areEqual(this.key, ((FrequencySelection) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "FrequencySelection(key=" + this.key + ")";
        }

        public FrequencySelection(TransferFrequencyBottomSheetFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final TransferFrequencyBottomSheetFragmentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$IraContributionQuestionnaire;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "launchMode", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode;", "<init>", "(Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode;)V", "getLaunchMode", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IraContributionQuestionnaire implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final IraContributionQuestionnaireLaunchMode launchMode;

        public static /* synthetic */ IraContributionQuestionnaire copy$default(IraContributionQuestionnaire iraContributionQuestionnaire, IraContributionQuestionnaireLaunchMode iraContributionQuestionnaireLaunchMode, int i, Object obj) {
            if ((i & 1) != 0) {
                iraContributionQuestionnaireLaunchMode = iraContributionQuestionnaire.launchMode;
            }
            return iraContributionQuestionnaire.copy(iraContributionQuestionnaireLaunchMode);
        }

        /* renamed from: component1, reason: from getter */
        public final IraContributionQuestionnaireLaunchMode getLaunchMode() {
            return this.launchMode;
        }

        public final IraContributionQuestionnaire copy(IraContributionQuestionnaireLaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            return new IraContributionQuestionnaire(launchMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IraContributionQuestionnaire) && Intrinsics.areEqual(this.launchMode, ((IraContributionQuestionnaire) other).launchMode);
        }

        public int hashCode() {
            return this.launchMode.hashCode();
        }

        public String toString() {
            return "IraContributionQuestionnaire(launchMode=" + this.launchMode + ")";
        }

        public IraContributionQuestionnaire(IraContributionQuestionnaireLaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            this.launchMode = launchMode;
        }

        public final IraContributionQuestionnaireLaunchMode getLaunchMode() {
            return this.launchMode;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$IraDistributionQuestionnaire;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "launchMode", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode;", "<init>", "(Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode;)V", "getLaunchMode", "()Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IraDistributionQuestionnaire implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final IraDistributionQuestionnaireLaunchMode launchMode;

        public static /* synthetic */ IraDistributionQuestionnaire copy$default(IraDistributionQuestionnaire iraDistributionQuestionnaire, IraDistributionQuestionnaireLaunchMode iraDistributionQuestionnaireLaunchMode, int i, Object obj) {
            if ((i & 1) != 0) {
                iraDistributionQuestionnaireLaunchMode = iraDistributionQuestionnaire.launchMode;
            }
            return iraDistributionQuestionnaire.copy(iraDistributionQuestionnaireLaunchMode);
        }

        /* renamed from: component1, reason: from getter */
        public final IraDistributionQuestionnaireLaunchMode getLaunchMode() {
            return this.launchMode;
        }

        public final IraDistributionQuestionnaire copy(IraDistributionQuestionnaireLaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            return new IraDistributionQuestionnaire(launchMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IraDistributionQuestionnaire) && Intrinsics.areEqual(this.launchMode, ((IraDistributionQuestionnaire) other).launchMode);
        }

        public int hashCode() {
            return this.launchMode.hashCode();
        }

        public String toString() {
            return "IraDistributionQuestionnaire(launchMode=" + this.launchMode + ")";
        }

        public IraDistributionQuestionnaire(IraDistributionQuestionnaireLaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            this.launchMode = launchMode;
        }

        public final IraDistributionQuestionnaireLaunchMode getLaunchMode() {
            return this.launchMode;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$Precreate;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "alertAction", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplayRTPUpsellAction;", "type", "Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;)V", "getAlertAction", "()Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "getType", "()Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Precreate implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final AlertAction<DisplayRTPUpsellAction> alertAction;
        private final PreCreatePopupType type;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Precreate copy$default(Precreate precreate, AlertAction alertAction, PreCreatePopupType preCreatePopupType, int i, Object obj) {
            if ((i & 1) != 0) {
                alertAction = precreate.alertAction;
            }
            if ((i & 2) != 0) {
                preCreatePopupType = precreate.type;
            }
            return precreate.copy(alertAction, preCreatePopupType);
        }

        public final AlertAction<DisplayRTPUpsellAction> component1() {
            return this.alertAction;
        }

        /* renamed from: component2, reason: from getter */
        public final PreCreatePopupType getType() {
            return this.type;
        }

        public final Precreate copy(AlertAction<? extends DisplayRTPUpsellAction> alertAction, PreCreatePopupType type2) {
            Intrinsics.checkNotNullParameter(alertAction, "alertAction");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Precreate(alertAction, type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Precreate)) {
                return false;
            }
            Precreate precreate = (Precreate) other;
            return Intrinsics.areEqual(this.alertAction, precreate.alertAction) && this.type == precreate.type;
        }

        public int hashCode() {
            return (this.alertAction.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Precreate(alertAction=" + this.alertAction + ", type=" + this.type + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Precreate(AlertAction<? extends DisplayRTPUpsellAction> alertAction, PreCreatePopupType type2) {
            Intrinsics.checkNotNullParameter(alertAction, "alertAction");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.alertAction = alertAction;
            this.type = type2;
        }

        public final AlertAction<DisplayRTPUpsellAction> getAlertAction() {
            return this.alertAction;
        }

        public final PreCreatePopupType getType() {
            return this.type;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$PrecreateAssetRetention;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "assetRetentionContent", "Lcom/robinhood/models/api/bonfire/transfer/AssetRetentionUpsellContent;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/AssetRetentionUpsellContent;)V", "getAssetRetentionContent", "()Lcom/robinhood/models/api/bonfire/transfer/AssetRetentionUpsellContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PrecreateAssetRetention implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final AssetRetentionUpsellContent assetRetentionContent;

        public static /* synthetic */ PrecreateAssetRetention copy$default(PrecreateAssetRetention precreateAssetRetention, AssetRetentionUpsellContent assetRetentionUpsellContent, int i, Object obj) {
            if ((i & 1) != 0) {
                assetRetentionUpsellContent = precreateAssetRetention.assetRetentionContent;
            }
            return precreateAssetRetention.copy(assetRetentionUpsellContent);
        }

        /* renamed from: component1, reason: from getter */
        public final AssetRetentionUpsellContent getAssetRetentionContent() {
            return this.assetRetentionContent;
        }

        public final PrecreateAssetRetention copy(AssetRetentionUpsellContent assetRetentionContent) {
            Intrinsics.checkNotNullParameter(assetRetentionContent, "assetRetentionContent");
            return new PrecreateAssetRetention(assetRetentionContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PrecreateAssetRetention) && Intrinsics.areEqual(this.assetRetentionContent, ((PrecreateAssetRetention) other).assetRetentionContent);
        }

        public int hashCode() {
            return this.assetRetentionContent.hashCode();
        }

        public String toString() {
            return "PrecreateAssetRetention(assetRetentionContent=" + this.assetRetentionContent + ")";
        }

        public PrecreateAssetRetention(AssetRetentionUpsellContent assetRetentionContent) {
            Intrinsics.checkNotNullParameter(assetRetentionContent, "assetRetentionContent");
            this.assetRetentionContent = assetRetentionContent;
        }

        public final AssetRetentionUpsellContent getAssetRetentionContent() {
            return this.assetRetentionContent;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$Success;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "<init>", "(Lcom/robinhood/models/ui/bonfire/PostTransferFlow;)V", "getPostTransferFlow", "()Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final PostTransferFlow postTransferFlow;

        public static /* synthetic */ Success copy$default(Success success, PostTransferFlow postTransferFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                postTransferFlow = success.postTransferFlow;
            }
            return success.copy(postTransferFlow);
        }

        /* renamed from: component1, reason: from getter */
        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }

        public final Success copy(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            return new Success(postTransferFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.postTransferFlow, ((Success) other).postTransferFlow);
        }

        public int hashCode() {
            return this.postTransferFlow.hashCode();
        }

        public String toString() {
            return "Success(postTransferFlow=" + this.postTransferFlow + ")";
        }

        public Success(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            this.postTransferFlow = postTransferFlow;
        }

        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ValidationError;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "validationFailure", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "<init>", "(Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;)V", "getValidationFailure", "()Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationError implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final ValidationFailure validationFailure;

        public static /* synthetic */ ValidationError copy$default(ValidationError validationError, ValidationFailure validationFailure, int i, Object obj) {
            if ((i & 1) != 0) {
                validationFailure = validationError.validationFailure;
            }
            return validationError.copy(validationFailure);
        }

        /* renamed from: component1, reason: from getter */
        public final ValidationFailure getValidationFailure() {
            return this.validationFailure;
        }

        public final ValidationError copy(ValidationFailure validationFailure) {
            Intrinsics.checkNotNullParameter(validationFailure, "validationFailure");
            return new ValidationError(validationFailure);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidationError) && Intrinsics.areEqual(this.validationFailure, ((ValidationError) other).validationFailure);
        }

        public int hashCode() {
            return this.validationFailure.hashCode();
        }

        public String toString() {
            return "ValidationError(validationFailure=" + this.validationFailure + ")";
        }

        public ValidationError(ValidationFailure validationFailure) {
            Intrinsics.checkNotNullParameter(validationFailure, "validationFailure");
            this.validationFailure = validationFailure;
        }

        public final ValidationFailure getValidationFailure() {
            return this.validationFailure;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$VerificationWorkflow;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/util/UUID;Z)V", "getWorkflowId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerificationWorkflow implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final boolean isMigrated;
        private final UUID workflowId;

        public static /* synthetic */ VerificationWorkflow copy$default(VerificationWorkflow verificationWorkflow, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = verificationWorkflow.workflowId;
            }
            if ((i & 2) != 0) {
                z = verificationWorkflow.isMigrated;
            }
            return verificationWorkflow.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMigrated() {
            return this.isMigrated;
        }

        public final VerificationWorkflow copy(UUID workflowId, boolean isMigrated) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            return new VerificationWorkflow(workflowId, isMigrated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerificationWorkflow)) {
                return false;
            }
            VerificationWorkflow verificationWorkflow = (VerificationWorkflow) other;
            return Intrinsics.areEqual(this.workflowId, verificationWorkflow.workflowId) && this.isMigrated == verificationWorkflow.isMigrated;
        }

        public int hashCode() {
            return (this.workflowId.hashCode() * 31) + Boolean.hashCode(this.isMigrated);
        }

        public String toString() {
            return "VerificationWorkflow(workflowId=" + this.workflowId + ", isMigrated=" + this.isMigrated + ")";
        }

        public VerificationWorkflow(UUID workflowId, boolean z) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.workflowId = workflowId;
            this.isMigrated = z;
        }

        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        public final boolean isMigrated() {
            return this.isMigrated;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$LaunchDialog;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "key", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchDialog implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final DialogFragmentKey key;

        public static /* synthetic */ LaunchDialog copy$default(LaunchDialog launchDialog, DialogFragmentKey dialogFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogFragmentKey = launchDialog.key;
            }
            return launchDialog.copy(dialogFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final DialogFragmentKey getKey() {
            return this.key;
        }

        public final LaunchDialog copy(DialogFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new LaunchDialog(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchDialog) && Intrinsics.areEqual(this.key, ((LaunchDialog) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "LaunchDialog(key=" + this.key + ")";
        }

        public LaunchDialog(DialogFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final DialogFragmentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ShowActivity;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "key", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowActivity implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final IntentKey key;

        public static /* synthetic */ ShowActivity copy$default(ShowActivity showActivity, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = showActivity.key;
            }
            return showActivity.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getKey() {
            return this.key;
        }

        public final ShowActivity copy(IntentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new ShowActivity(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowActivity) && Intrinsics.areEqual(this.key, ((ShowActivity) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "ShowActivity(key=" + this.key + ")";
        }

        public ShowActivity(IntentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final IntentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$StartActivityForResult;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "key", "Lcom/robinhood/android/navigation/keys/IntentKey;", "requestCode", "", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;I)V", "getKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "getRequestCode", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartActivityForResult implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final IntentKey key;
        private final int requestCode;

        public static /* synthetic */ StartActivityForResult copy$default(StartActivityForResult startActivityForResult, IntentKey intentKey, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                intentKey = startActivityForResult.key;
            }
            if ((i2 & 2) != 0) {
                i = startActivityForResult.requestCode;
            }
            return startActivityForResult.copy(intentKey, i);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRequestCode() {
            return this.requestCode;
        }

        public final StartActivityForResult copy(IntentKey key, int requestCode) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new StartActivityForResult(key, requestCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartActivityForResult)) {
                return false;
            }
            StartActivityForResult startActivityForResult = (StartActivityForResult) other;
            return Intrinsics.areEqual(this.key, startActivityForResult.key) && this.requestCode == startActivityForResult.requestCode;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + Integer.hashCode(this.requestCode);
        }

        public String toString() {
            return "StartActivityForResult(key=" + this.key + ", requestCode=" + this.requestCode + ")";
        }

        public StartActivityForResult(IntentKey key, int i) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.requestCode = i;
        }

        public final IntentKey getKey() {
            return this.key;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ShowFragment;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFragment implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final FragmentKey key;

        public static /* synthetic */ ShowFragment copy$default(ShowFragment showFragment, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = showFragment.key;
            }
            return showFragment.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getKey() {
            return this.key;
        }

        public final ShowFragment copy(FragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new ShowFragment(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowFragment) && Intrinsics.areEqual(this.key, ((ShowFragment) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "ShowFragment(key=" + this.key + ")";
        }

        public ShowFragment(FragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final FragmentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ShowValidationAlert;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "leavingEditMode", "", "alertContent", "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "<init>", "(ZLbff_money_movement/service/v1/TransferValidationErrorDetailsDto;)V", "getLeavingEditMode", "()Z", "getAlertContent", "()Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowValidationAlert implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final TransferValidationErrorDetailsDto alertContent;
        private final boolean leavingEditMode;

        public static /* synthetic */ ShowValidationAlert copy$default(ShowValidationAlert showValidationAlert, boolean z, TransferValidationErrorDetailsDto transferValidationErrorDetailsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                z = showValidationAlert.leavingEditMode;
            }
            if ((i & 2) != 0) {
                transferValidationErrorDetailsDto = showValidationAlert.alertContent;
            }
            return showValidationAlert.copy(z, transferValidationErrorDetailsDto);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getLeavingEditMode() {
            return this.leavingEditMode;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferValidationErrorDetailsDto getAlertContent() {
            return this.alertContent;
        }

        public final ShowValidationAlert copy(boolean leavingEditMode, TransferValidationErrorDetailsDto alertContent) {
            Intrinsics.checkNotNullParameter(alertContent, "alertContent");
            return new ShowValidationAlert(leavingEditMode, alertContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowValidationAlert)) {
                return false;
            }
            ShowValidationAlert showValidationAlert = (ShowValidationAlert) other;
            return this.leavingEditMode == showValidationAlert.leavingEditMode && Intrinsics.areEqual(this.alertContent, showValidationAlert.alertContent);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.leavingEditMode) * 31) + this.alertContent.hashCode();
        }

        public String toString() {
            return "ShowValidationAlert(leavingEditMode=" + this.leavingEditMode + ", alertContent=" + this.alertContent + ")";
        }

        public ShowValidationAlert(boolean z, TransferValidationErrorDetailsDto alertContent) {
            Intrinsics.checkNotNullParameter(alertContent, "alertContent");
            this.leavingEditMode = z;
            this.alertContent = alertContent;
        }

        public final boolean getLeavingEditMode() {
            return this.leavingEditMode;
        }

        public final TransferValidationErrorDetailsDto getAlertContent() {
            return this.alertContent;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ShowDepositIncentiveCancellationAlert;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentiveCancellationDialogData;", "<init>", "(Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentiveCancellationDialogData;)V", "getData", "()Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentiveCancellationDialogData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDepositIncentiveCancellationAlert implements CreateTransferV2Event {
        public static final int $stable = DepositIncentiveCancellationDialogData.$stable;
        private final DepositIncentiveCancellationDialogData data;

        public static /* synthetic */ ShowDepositIncentiveCancellationAlert copy$default(ShowDepositIncentiveCancellationAlert showDepositIncentiveCancellationAlert, DepositIncentiveCancellationDialogData depositIncentiveCancellationDialogData, int i, Object obj) {
            if ((i & 1) != 0) {
                depositIncentiveCancellationDialogData = showDepositIncentiveCancellationAlert.data;
            }
            return showDepositIncentiveCancellationAlert.copy(depositIncentiveCancellationDialogData);
        }

        /* renamed from: component1, reason: from getter */
        public final DepositIncentiveCancellationDialogData getData() {
            return this.data;
        }

        public final ShowDepositIncentiveCancellationAlert copy(DepositIncentiveCancellationDialogData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new ShowDepositIncentiveCancellationAlert(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowDepositIncentiveCancellationAlert) && Intrinsics.areEqual(this.data, ((ShowDepositIncentiveCancellationAlert) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ShowDepositIncentiveCancellationAlert(data=" + this.data + ")";
        }

        public ShowDepositIncentiveCancellationAlert(DepositIncentiveCancellationDialogData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final DepositIncentiveCancellationDialogData getData() {
            return this.data;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ThreeDSVerification;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "threeDSRedirectUrl", "", "<init>", "(Ljava/lang/String;)V", "getThreeDSRedirectUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ThreeDSVerification implements CreateTransferV2Event {
        public static final int $stable = 0;
        private final String threeDSRedirectUrl;

        public static /* synthetic */ ThreeDSVerification copy$default(ThreeDSVerification threeDSVerification, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = threeDSVerification.threeDSRedirectUrl;
            }
            return threeDSVerification.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getThreeDSRedirectUrl() {
            return this.threeDSRedirectUrl;
        }

        public final ThreeDSVerification copy(String threeDSRedirectUrl) {
            Intrinsics.checkNotNullParameter(threeDSRedirectUrl, "threeDSRedirectUrl");
            return new ThreeDSVerification(threeDSRedirectUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ThreeDSVerification) && Intrinsics.areEqual(this.threeDSRedirectUrl, ((ThreeDSVerification) other).threeDSRedirectUrl);
        }

        public int hashCode() {
            return this.threeDSRedirectUrl.hashCode();
        }

        public String toString() {
            return "ThreeDSVerification(threeDSRedirectUrl=" + this.threeDSRedirectUrl + ")";
        }

        public ThreeDSVerification(String threeDSRedirectUrl) {
            Intrinsics.checkNotNullParameter(threeDSRedirectUrl, "threeDSRedirectUrl");
            this.threeDSRedirectUrl = threeDSRedirectUrl;
        }

        public final String getThreeDSRedirectUrl() {
            return this.threeDSRedirectUrl;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ShowClawbackGracePeriodContent;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "content", "Lcom/robinhood/models/api/bonfire/transfer/ClawbackGracePeriodContent;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/ClawbackGracePeriodContent;)V", "getContent", "()Lcom/robinhood/models/api/bonfire/transfer/ClawbackGracePeriodContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowClawbackGracePeriodContent implements CreateTransferV2Event {
        public static final int $stable = 8;
        private final ClawbackGracePeriodContent content;

        public static /* synthetic */ ShowClawbackGracePeriodContent copy$default(ShowClawbackGracePeriodContent showClawbackGracePeriodContent, ClawbackGracePeriodContent clawbackGracePeriodContent, int i, Object obj) {
            if ((i & 1) != 0) {
                clawbackGracePeriodContent = showClawbackGracePeriodContent.content;
            }
            return showClawbackGracePeriodContent.copy(clawbackGracePeriodContent);
        }

        /* renamed from: component1, reason: from getter */
        public final ClawbackGracePeriodContent getContent() {
            return this.content;
        }

        public final ShowClawbackGracePeriodContent copy(ClawbackGracePeriodContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new ShowClawbackGracePeriodContent(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowClawbackGracePeriodContent) && Intrinsics.areEqual(this.content, ((ShowClawbackGracePeriodContent) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "ShowClawbackGracePeriodContent(content=" + this.content + ")";
        }

        public ShowClawbackGracePeriodContent(ClawbackGracePeriodContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final ClawbackGracePeriodContent getContent() {
            return this.content;
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$AddNewAccount;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AddNewAccount implements CreateTransferV2Event {
        public static final int $stable = 0;
        public static final AddNewAccount INSTANCE = new AddNewAccount();

        public boolean equals(Object other) {
            return this == other || (other instanceof AddNewAccount);
        }

        public int hashCode() {
            return 1995686213;
        }

        public String toString() {
            return "AddNewAccount";
        }

        private AddNewAccount() {
        }
    }

    /* compiled from: CreateTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$SendWireTransfer;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SendWireTransfer implements CreateTransferV2Event {
        public static final int $stable = 0;
        public static final SendWireTransfer INSTANCE = new SendWireTransfer();

        public boolean equals(Object other) {
            return this == other || (other instanceof SendWireTransfer);
        }

        public int hashCode() {
            return -523149695;
        }

        public String toString() {
            return "SendWireTransfer";
        }

        private SendWireTransfer() {
        }
    }
}
