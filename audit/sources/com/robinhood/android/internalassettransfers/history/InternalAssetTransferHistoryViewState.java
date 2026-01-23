package com.robinhood.android.internalassettransfers.history;

import android.content.res.Resources;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.history.models.UiAssetTransferDetailsStatus;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferHistoryViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState;", "", "Loading", "Error", "Loaded", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState$Error;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState$Loaded;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState$Loading;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface InternalAssetTransferHistoryViewState {

    /* compiled from: InternalAssetTransferHistoryViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState$Loading;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements InternalAssetTransferHistoryViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 2066568037;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: InternalAssetTransferHistoryViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState$Error;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements InternalAssetTransferHistoryViewState {
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

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: InternalAssetTransferHistoryViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003Jq\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u00106\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\"\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0017\u0010'\u001a\u00020\b8G¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b*\u0010$¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState$Loaded;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState;", "status", "Lcom/robinhood/android/internalassettransfers/history/models/UiAssetTransferDetailsStatus;", "sourceBrokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "sinkBrokerageAccountType", "submissionDate", "", "completed", "showDialog", "", "assetListLoading", "sourceAccountName", "Lcom/robinhood/utils/resource/StringResource;", "sinkAccountName", "acatsMatchMovementAmount", "<init>", "(Lcom/robinhood/android/internalassettransfers/history/models/UiAssetTransferDetailsStatus;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getStatus", "()Lcom/robinhood/android/internalassettransfers/history/models/UiAssetTransferDetailsStatus;", "getSourceBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSinkBrokerageAccountType", "getSubmissionDate", "()Ljava/lang/String;", "getCompleted", "getShowDialog", "()Z", "getAssetListLoading", "getSourceAccountName", "()Lcom/robinhood/utils/resource/StringResource;", "getSinkAccountName", "getAcatsMatchMovementAmount", "dialogNegativeButtonText", "getDialogNegativeButtonText", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "dialogPositiveButtonText", "getDialogPositiveButtonText", "dialogTitleText", "getDialogTitleText$annotations", "()V", "getDialogTitleText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements InternalAssetTransferHistoryViewState {
        public static final int $stable = StringResource.$stable;
        private final String acatsMatchMovementAmount;
        private final boolean assetListLoading;
        private final String completed;
        private final boolean showDialog;
        private final StringResource sinkAccountName;
        private final BrokerageAccountType sinkBrokerageAccountType;
        private final StringResource sourceAccountName;
        private final BrokerageAccountType sourceBrokerageAccountType;
        private final UiAssetTransferDetailsStatus status;
        private final String submissionDate;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, UiAssetTransferDetailsStatus uiAssetTransferDetailsStatus, BrokerageAccountType brokerageAccountType, BrokerageAccountType brokerageAccountType2, String str, String str2, boolean z, boolean z2, StringResource stringResource, StringResource stringResource2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                uiAssetTransferDetailsStatus = loaded.status;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = loaded.sourceBrokerageAccountType;
            }
            if ((i & 4) != 0) {
                brokerageAccountType2 = loaded.sinkBrokerageAccountType;
            }
            if ((i & 8) != 0) {
                str = loaded.submissionDate;
            }
            if ((i & 16) != 0) {
                str2 = loaded.completed;
            }
            if ((i & 32) != 0) {
                z = loaded.showDialog;
            }
            if ((i & 64) != 0) {
                z2 = loaded.assetListLoading;
            }
            if ((i & 128) != 0) {
                stringResource = loaded.sourceAccountName;
            }
            if ((i & 256) != 0) {
                stringResource2 = loaded.sinkAccountName;
            }
            if ((i & 512) != 0) {
                str3 = loaded.acatsMatchMovementAmount;
            }
            StringResource stringResource3 = stringResource2;
            String str4 = str3;
            boolean z3 = z2;
            StringResource stringResource4 = stringResource;
            String str5 = str2;
            boolean z4 = z;
            return loaded.copy(uiAssetTransferDetailsStatus, brokerageAccountType, brokerageAccountType2, str, str5, z4, z3, stringResource4, stringResource3, str4);
        }

        public static /* synthetic */ void getDialogTitleText$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UiAssetTransferDetailsStatus getStatus() {
            return this.status;
        }

        /* renamed from: component10, reason: from getter */
        public final String getAcatsMatchMovementAmount() {
            return this.acatsMatchMovementAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getSourceBrokerageAccountType() {
            return this.sourceBrokerageAccountType;
        }

        /* renamed from: component3, reason: from getter */
        public final BrokerageAccountType getSinkBrokerageAccountType() {
            return this.sinkBrokerageAccountType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubmissionDate() {
            return this.submissionDate;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCompleted() {
            return this.completed;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowDialog() {
            return this.showDialog;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getAssetListLoading() {
            return this.assetListLoading;
        }

        /* renamed from: component8, reason: from getter */
        public final StringResource getSourceAccountName() {
            return this.sourceAccountName;
        }

        /* renamed from: component9, reason: from getter */
        public final StringResource getSinkAccountName() {
            return this.sinkAccountName;
        }

        public final Loaded copy(UiAssetTransferDetailsStatus status, BrokerageAccountType sourceBrokerageAccountType, BrokerageAccountType sinkBrokerageAccountType, String submissionDate, String completed, boolean showDialog, boolean assetListLoading, StringResource sourceAccountName, StringResource sinkAccountName, String acatsMatchMovementAmount) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(sourceBrokerageAccountType, "sourceBrokerageAccountType");
            Intrinsics.checkNotNullParameter(sinkBrokerageAccountType, "sinkBrokerageAccountType");
            Intrinsics.checkNotNullParameter(submissionDate, "submissionDate");
            Intrinsics.checkNotNullParameter(sourceAccountName, "sourceAccountName");
            Intrinsics.checkNotNullParameter(sinkAccountName, "sinkAccountName");
            return new Loaded(status, sourceBrokerageAccountType, sinkBrokerageAccountType, submissionDate, completed, showDialog, assetListLoading, sourceAccountName, sinkAccountName, acatsMatchMovementAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.status, loaded.status) && this.sourceBrokerageAccountType == loaded.sourceBrokerageAccountType && this.sinkBrokerageAccountType == loaded.sinkBrokerageAccountType && Intrinsics.areEqual(this.submissionDate, loaded.submissionDate) && Intrinsics.areEqual(this.completed, loaded.completed) && this.showDialog == loaded.showDialog && this.assetListLoading == loaded.assetListLoading && Intrinsics.areEqual(this.sourceAccountName, loaded.sourceAccountName) && Intrinsics.areEqual(this.sinkAccountName, loaded.sinkAccountName) && Intrinsics.areEqual(this.acatsMatchMovementAmount, loaded.acatsMatchMovementAmount);
        }

        public int hashCode() {
            int iHashCode = ((((((this.status.hashCode() * 31) + this.sourceBrokerageAccountType.hashCode()) * 31) + this.sinkBrokerageAccountType.hashCode()) * 31) + this.submissionDate.hashCode()) * 31;
            String str = this.completed;
            int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showDialog)) * 31) + Boolean.hashCode(this.assetListLoading)) * 31) + this.sourceAccountName.hashCode()) * 31) + this.sinkAccountName.hashCode()) * 31;
            String str2 = this.acatsMatchMovementAmount;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(status=" + this.status + ", sourceBrokerageAccountType=" + this.sourceBrokerageAccountType + ", sinkBrokerageAccountType=" + this.sinkBrokerageAccountType + ", submissionDate=" + this.submissionDate + ", completed=" + this.completed + ", showDialog=" + this.showDialog + ", assetListLoading=" + this.assetListLoading + ", sourceAccountName=" + this.sourceAccountName + ", sinkAccountName=" + this.sinkAccountName + ", acatsMatchMovementAmount=" + this.acatsMatchMovementAmount + ")";
        }

        public Loaded(UiAssetTransferDetailsStatus status, BrokerageAccountType sourceBrokerageAccountType, BrokerageAccountType sinkBrokerageAccountType, String submissionDate, String str, boolean z, boolean z2, StringResource sourceAccountName, StringResource sinkAccountName, String str2) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(sourceBrokerageAccountType, "sourceBrokerageAccountType");
            Intrinsics.checkNotNullParameter(sinkBrokerageAccountType, "sinkBrokerageAccountType");
            Intrinsics.checkNotNullParameter(submissionDate, "submissionDate");
            Intrinsics.checkNotNullParameter(sourceAccountName, "sourceAccountName");
            Intrinsics.checkNotNullParameter(sinkAccountName, "sinkAccountName");
            this.status = status;
            this.sourceBrokerageAccountType = sourceBrokerageAccountType;
            this.sinkBrokerageAccountType = sinkBrokerageAccountType;
            this.submissionDate = submissionDate;
            this.completed = str;
            this.showDialog = z;
            this.assetListLoading = z2;
            this.sourceAccountName = sourceAccountName;
            this.sinkAccountName = sinkAccountName;
            this.acatsMatchMovementAmount = str2;
        }

        public final UiAssetTransferDetailsStatus getStatus() {
            return this.status;
        }

        public final BrokerageAccountType getSourceBrokerageAccountType() {
            return this.sourceBrokerageAccountType;
        }

        public final BrokerageAccountType getSinkBrokerageAccountType() {
            return this.sinkBrokerageAccountType;
        }

        public final String getSubmissionDate() {
            return this.submissionDate;
        }

        public final String getCompleted() {
            return this.completed;
        }

        public final boolean getShowDialog() {
            return this.showDialog;
        }

        public final boolean getAssetListLoading() {
            return this.assetListLoading;
        }

        public final StringResource getSourceAccountName() {
            return this.sourceAccountName;
        }

        public final StringResource getSinkAccountName() {
            return this.sinkAccountName;
        }

        public final String getAcatsMatchMovementAmount() {
            return this.acatsMatchMovementAmount;
        }

        @JvmName
        public final String getDialogNegativeButtonText(Composer composer, int i) {
            composer.startReplaceGroup(1894974666);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1894974666, i, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryViewState.Loaded.<get-dialogNegativeButtonText> (InternalAssetTransferHistoryViewState.kt:30)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_dialog_negative_text, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strStringResource;
        }

        @JvmName
        public final String getDialogPositiveButtonText(Composer composer, int i) {
            composer.startReplaceGroup(639992146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(639992146, i, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryViewState.Loaded.<get-dialogPositiveButtonText> (InternalAssetTransferHistoryViewState.kt:33)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_dialog_positive_text, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strStringResource;
        }

        @JvmName
        public final String getDialogTitleText(Composer composer, int i) throws Resources.NotFoundException {
            composer.startReplaceGroup(1787820470);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1787820470, i, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryViewState.Loaded.<get-dialogTitleText> (InternalAssetTransferHistoryViewState.kt:36)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_history_dialog_description_text, new Object[]{StringResources_androidKt.stringResource(BrokerageAccountTypes2.getDisplayNameRes(this.sourceBrokerageAccountType), composer, 0)}, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strStringResource;
        }
    }
}
