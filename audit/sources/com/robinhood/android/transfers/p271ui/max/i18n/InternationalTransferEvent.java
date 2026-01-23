package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent;", "", "ShowPopup", "Exit", "SelectAccount", "NavigateAfterTransferCreation", "ShowTransferCreationAlertError", "ShowTransferCreationGenericError", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$Exit;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$NavigateAfterTransferCreation;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$SelectAccount;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$ShowPopup;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$ShowTransferCreationAlertError;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$ShowTransferCreationGenericError;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface InternationalTransferEvent {

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$ShowPopup;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowPopup implements InternationalTransferEvent {
        public static final int $stable = 0;
        public static final ShowPopup INSTANCE = new ShowPopup();

        private ShowPopup() {
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$Exit;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Exit implements InternationalTransferEvent {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        private Exit() {
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$SelectAccount;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent;", "key", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "<init>", "(Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;)V", "getKey", "()Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectAccount implements InternationalTransferEvent {
        public static final int $stable = 8;
        private final TransferAccountSelectionKey key;

        public static /* synthetic */ SelectAccount copy$default(SelectAccount selectAccount, TransferAccountSelectionKey transferAccountSelectionKey, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccountSelectionKey = selectAccount.key;
            }
            return selectAccount.copy(transferAccountSelectionKey);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccountSelectionKey getKey() {
            return this.key;
        }

        public final SelectAccount copy(TransferAccountSelectionKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new SelectAccount(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectAccount) && Intrinsics.areEqual(this.key, ((SelectAccount) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "SelectAccount(key=" + this.key + ")";
        }

        public SelectAccount(TransferAccountSelectionKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final TransferAccountSelectionKey getKey() {
            return this.key;
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$NavigateAfterTransferCreation;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent;", "response", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;)V", "getResponse", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateAfterTransferCreation implements InternationalTransferEvent {
        public static final int $stable = 8;
        private final ApiCreateTransferResponse response;

        public static /* synthetic */ NavigateAfterTransferCreation copy$default(NavigateAfterTransferCreation navigateAfterTransferCreation, ApiCreateTransferResponse apiCreateTransferResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCreateTransferResponse = navigateAfterTransferCreation.response;
            }
            return navigateAfterTransferCreation.copy(apiCreateTransferResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCreateTransferResponse getResponse() {
            return this.response;
        }

        public final NavigateAfterTransferCreation copy(ApiCreateTransferResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new NavigateAfterTransferCreation(response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateAfterTransferCreation) && Intrinsics.areEqual(this.response, ((NavigateAfterTransferCreation) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "NavigateAfterTransferCreation(response=" + this.response + ")";
        }

        public NavigateAfterTransferCreation(ApiCreateTransferResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
        }

        public final ApiCreateTransferResponse getResponse() {
            return this.response;
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\r\u0010\u0013\u001a\u00060\u0007j\u0002`\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$ShowTransferCreationAlertError;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent;", "alert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "errorCode", "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lcom/robinhood/models/serverdriven/db/GenericAlert;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getAlert", "()Lcom/robinhood/models/serverdriven/db/GenericAlert;", "getErrorCode", "()Ljava/lang/String;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTransferCreationAlertError implements InternationalTransferEvent {
        public static final int $stable = 8;
        private final GenericAlert alert;
        private final String errorCode;
        private final Context eventContext;

        public static /* synthetic */ ShowTransferCreationAlertError copy$default(ShowTransferCreationAlertError showTransferCreationAlertError, GenericAlert genericAlert, String str, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlert = showTransferCreationAlertError.alert;
            }
            if ((i & 2) != 0) {
                str = showTransferCreationAlertError.errorCode;
            }
            if ((i & 4) != 0) {
                context = showTransferCreationAlertError.eventContext;
            }
            return showTransferCreationAlertError.copy(genericAlert, str, context);
        }

        /* renamed from: component1, reason: from getter */
        public final GenericAlert getAlert() {
            return this.alert;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component3, reason: from getter */
        public final Context getEventContext() {
            return this.eventContext;
        }

        public final ShowTransferCreationAlertError copy(GenericAlert alert, String errorCode, Context eventContext) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            return new ShowTransferCreationAlertError(alert, errorCode, eventContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowTransferCreationAlertError)) {
                return false;
            }
            ShowTransferCreationAlertError showTransferCreationAlertError = (ShowTransferCreationAlertError) other;
            return Intrinsics.areEqual(this.alert, showTransferCreationAlertError.alert) && Intrinsics.areEqual(this.errorCode, showTransferCreationAlertError.errorCode) && Intrinsics.areEqual(this.eventContext, showTransferCreationAlertError.eventContext);
        }

        public int hashCode() {
            int iHashCode = this.alert.hashCode() * 31;
            String str = this.errorCode;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.eventContext.hashCode();
        }

        public String toString() {
            return "ShowTransferCreationAlertError(alert=" + this.alert + ", errorCode=" + this.errorCode + ", eventContext=" + this.eventContext + ")";
        }

        public ShowTransferCreationAlertError(GenericAlert alert, String str, Context eventContext) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            this.alert = alert;
            this.errorCode = str;
            this.eventContext = eventContext;
        }

        public final GenericAlert getAlert() {
            return this.alert;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final Context getEventContext() {
            return this.eventContext;
        }
    }

    /* compiled from: InternationalTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent$ShowTransferCreationGenericError;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent;", "id", "", "title", "Lcom/robinhood/utils/resource/StringResource;", ErrorResponse.DETAIL, "positiveButton", "negativeButton", "<init>", "(ILcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getId", "()I", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDetail", "getPositiveButton", "getNegativeButton", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTransferCreationGenericError implements InternationalTransferEvent {
        public static final int $stable = StringResource.$stable;
        private final StringResource detail;
        private final int id;
        private final StringResource negativeButton;
        private final StringResource positiveButton;
        private final StringResource title;

        public static /* synthetic */ ShowTransferCreationGenericError copy$default(ShowTransferCreationGenericError showTransferCreationGenericError, int i, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showTransferCreationGenericError.id;
            }
            if ((i2 & 2) != 0) {
                stringResource = showTransferCreationGenericError.title;
            }
            if ((i2 & 4) != 0) {
                stringResource2 = showTransferCreationGenericError.detail;
            }
            if ((i2 & 8) != 0) {
                stringResource3 = showTransferCreationGenericError.positiveButton;
            }
            if ((i2 & 16) != 0) {
                stringResource4 = showTransferCreationGenericError.negativeButton;
            }
            StringResource stringResource5 = stringResource4;
            StringResource stringResource6 = stringResource2;
            return showTransferCreationGenericError.copy(i, stringResource, stringResource6, stringResource3, stringResource5);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getDetail() {
            return this.detail;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getPositiveButton() {
            return this.positiveButton;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getNegativeButton() {
            return this.negativeButton;
        }

        public final ShowTransferCreationGenericError copy(int id, StringResource title, StringResource detail, StringResource positiveButton, StringResource negativeButton) {
            Intrinsics.checkNotNullParameter(detail, "detail");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            return new ShowTransferCreationGenericError(id, title, detail, positiveButton, negativeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowTransferCreationGenericError)) {
                return false;
            }
            ShowTransferCreationGenericError showTransferCreationGenericError = (ShowTransferCreationGenericError) other;
            return this.id == showTransferCreationGenericError.id && Intrinsics.areEqual(this.title, showTransferCreationGenericError.title) && Intrinsics.areEqual(this.detail, showTransferCreationGenericError.detail) && Intrinsics.areEqual(this.positiveButton, showTransferCreationGenericError.positiveButton) && Intrinsics.areEqual(this.negativeButton, showTransferCreationGenericError.negativeButton);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.id) * 31;
            StringResource stringResource = this.title;
            int iHashCode2 = (((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.detail.hashCode()) * 31) + this.positiveButton.hashCode()) * 31;
            StringResource stringResource2 = this.negativeButton;
            return iHashCode2 + (stringResource2 != null ? stringResource2.hashCode() : 0);
        }

        public String toString() {
            return "ShowTransferCreationGenericError(id=" + this.id + ", title=" + this.title + ", detail=" + this.detail + ", positiveButton=" + this.positiveButton + ", negativeButton=" + this.negativeButton + ")";
        }

        public ShowTransferCreationGenericError(int i, StringResource stringResource, StringResource detail, StringResource positiveButton, StringResource stringResource2) {
            Intrinsics.checkNotNullParameter(detail, "detail");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            this.id = i;
            this.title = stringResource;
            this.detail = detail;
            this.positiveButton = positiveButton;
            this.negativeButton = stringResource2;
        }

        public /* synthetic */ ShowTransferCreationGenericError(int i, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? C11048R.id.dialog_id_generic_error : i, stringResource, stringResource2, (i2 & 8) != 0 ? StringResource.INSTANCE.invoke(C11048R.string.general_label_done, new Object[0]) : stringResource3, (i2 & 16) != 0 ? null : stringResource4);
        }

        public final int getId() {
            return this.id;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getDetail() {
            return this.detail;
        }

        public final StringResource getPositiveButton() {
            return this.positiveButton;
        }

        public final StringResource getNegativeButton() {
            return this.negativeButton;
        }
    }
}
