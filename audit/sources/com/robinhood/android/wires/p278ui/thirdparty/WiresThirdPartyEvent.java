package com.robinhood.android.wires.p278ui.thirdparty;

import android.net.Uri;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormInputDto;

/* compiled from: WiresThirdPartyEvent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;", "", "ShowScamPrevention", "StartFormEntry", "MoveToReviewScreen", "NavigateToTransfer", "ReportScam", "StartDocumentRequest", "ShowError", "CloseFlow", "TellerError", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface WiresThirdPartyEvent {

    /* compiled from: WiresThirdPartyEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent$ShowScamPrevention;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowScamPrevention implements WiresThirdPartyEvent {
        public static final int $stable = 0;
        public static final ShowScamPrevention INSTANCE = new ShowScamPrevention();

        private ShowScamPrevention() {
        }
    }

    /* compiled from: WiresThirdPartyEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent$StartFormEntry;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StartFormEntry implements WiresThirdPartyEvent {
        public static final int $stable = 0;
        public static final StartFormEntry INSTANCE = new StartFormEntry();

        private StartFormEntry() {
        }
    }

    /* compiled from: WiresThirdPartyEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent$MoveToReviewScreen;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MoveToReviewScreen implements WiresThirdPartyEvent {
        public static final int $stable = 0;
        public static final MoveToReviewScreen INSTANCE = new MoveToReviewScreen();

        private MoveToReviewScreen() {
        }
    }

    /* compiled from: WiresThirdPartyEvent.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent$NavigateToTransfer;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;", "from", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "to", "id", "", "bankName", "fields", "", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFrom", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getTo", "getId", "()Ljava/lang/String;", "getBankName", "getFields", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToTransfer implements WiresThirdPartyEvent {
        public static final int $stable = 8;
        private final String bankName;
        private final List<FormInputDto> fields;
        private final ApiTransferAccount.TransferAccountType from;
        private final String id;
        private final ApiTransferAccount.TransferAccountType to;

        public static /* synthetic */ NavigateToTransfer copy$default(NavigateToTransfer navigateToTransfer, ApiTransferAccount.TransferAccountType transferAccountType, ApiTransferAccount.TransferAccountType transferAccountType2, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccountType = navigateToTransfer.from;
            }
            if ((i & 2) != 0) {
                transferAccountType2 = navigateToTransfer.to;
            }
            if ((i & 4) != 0) {
                str = navigateToTransfer.id;
            }
            if ((i & 8) != 0) {
                str2 = navigateToTransfer.bankName;
            }
            if ((i & 16) != 0) {
                list = navigateToTransfer.fields;
            }
            List list2 = list;
            String str3 = str;
            return navigateToTransfer.copy(transferAccountType, transferAccountType2, str3, str2, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiTransferAccount.TransferAccountType getFrom() {
            return this.from;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiTransferAccount.TransferAccountType getTo() {
            return this.to;
        }

        /* renamed from: component3, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        public final List<FormInputDto> component5() {
            return this.fields;
        }

        public final NavigateToTransfer copy(ApiTransferAccount.TransferAccountType from, ApiTransferAccount.TransferAccountType to, String id, String bankName, List<FormInputDto> fields) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            Intrinsics.checkNotNullParameter(fields, "fields");
            return new NavigateToTransfer(from, to, id, bankName, fields);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToTransfer)) {
                return false;
            }
            NavigateToTransfer navigateToTransfer = (NavigateToTransfer) other;
            return this.from == navigateToTransfer.from && this.to == navigateToTransfer.to && Intrinsics.areEqual(this.id, navigateToTransfer.id) && Intrinsics.areEqual(this.bankName, navigateToTransfer.bankName) && Intrinsics.areEqual(this.fields, navigateToTransfer.fields);
        }

        public int hashCode() {
            return (((((((this.from.hashCode() * 31) + this.to.hashCode()) * 31) + this.id.hashCode()) * 31) + this.bankName.hashCode()) * 31) + this.fields.hashCode();
        }

        public String toString() {
            return "NavigateToTransfer(from=" + this.from + ", to=" + this.to + ", id=" + this.id + ", bankName=" + this.bankName + ", fields=" + this.fields + ")";
        }

        public NavigateToTransfer(ApiTransferAccount.TransferAccountType from, ApiTransferAccount.TransferAccountType to, String id, String bankName, List<FormInputDto> fields) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.from = from;
            this.to = to;
            this.id = id;
            this.bankName = bankName;
            this.fields = fields;
        }

        public final ApiTransferAccount.TransferAccountType getFrom() {
            return this.from;
        }

        public final ApiTransferAccount.TransferAccountType getTo() {
            return this.to;
        }

        public final String getId() {
            return this.id;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final List<FormInputDto> getFields() {
            return this.fields;
        }
    }

    /* compiled from: WiresThirdPartyEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent$ReportScam;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReportScam implements WiresThirdPartyEvent {
        public static final int $stable = 8;
        private final Uri uri;

        public static /* synthetic */ ReportScam copy$default(ReportScam reportScam, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = reportScam.uri;
            }
            return reportScam.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final ReportScam copy(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new ReportScam(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReportScam) && Intrinsics.areEqual(this.uri, ((ReportScam) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "ReportScam(uri=" + this.uri + ")";
        }

        public ReportScam(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }

    /* compiled from: WiresThirdPartyEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent$StartDocumentRequest;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;", "documentRequestId", "", "<init>", "(Ljava/lang/String;)V", "getDocumentRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartDocumentRequest implements WiresThirdPartyEvent {
        public static final int $stable = 0;
        private final String documentRequestId;

        public static /* synthetic */ StartDocumentRequest copy$default(StartDocumentRequest startDocumentRequest, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startDocumentRequest.documentRequestId;
            }
            return startDocumentRequest.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDocumentRequestId() {
            return this.documentRequestId;
        }

        public final StartDocumentRequest copy(String documentRequestId) {
            Intrinsics.checkNotNullParameter(documentRequestId, "documentRequestId");
            return new StartDocumentRequest(documentRequestId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartDocumentRequest) && Intrinsics.areEqual(this.documentRequestId, ((StartDocumentRequest) other).documentRequestId);
        }

        public int hashCode() {
            return this.documentRequestId.hashCode();
        }

        public String toString() {
            return "StartDocumentRequest(documentRequestId=" + this.documentRequestId + ")";
        }

        public StartDocumentRequest(String documentRequestId) {
            Intrinsics.checkNotNullParameter(documentRequestId, "documentRequestId");
            this.documentRequestId = documentRequestId;
        }

        public final String getDocumentRequestId() {
            return this.documentRequestId;
        }
    }

    /* compiled from: WiresThirdPartyEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent$ShowError;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowError implements WiresThirdPartyEvent {
        public static final int $stable = 0;
        public static final ShowError INSTANCE = new ShowError();

        private ShowError() {
        }
    }

    /* compiled from: WiresThirdPartyEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent$CloseFlow;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CloseFlow implements WiresThirdPartyEvent {
        public static final int $stable = 0;
        public static final CloseFlow INSTANCE = new CloseFlow();

        private CloseFlow() {
        }
    }

    /* compiled from: WiresThirdPartyEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent$TellerError;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TellerError implements WiresThirdPartyEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ TellerError copy$default(TellerError tellerError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = tellerError.throwable;
            }
            return tellerError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final TellerError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new TellerError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TellerError) && Intrinsics.areEqual(this.throwable, ((TellerError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "TellerError(throwable=" + this.throwable + ")";
        }

        public TellerError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
