package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferV2Event.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event;", "", "Exit", "LaunchDialog", "TransferCreated", "ShowSduiAlert", "ShowAlert", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event$Exit;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event$LaunchDialog;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event$ShowAlert;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event$ShowSduiAlert;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event$TransferCreated;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface InternationalTransferV2Event {

    /* compiled from: InternationalTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event$Exit;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Exit implements InternationalTransferV2Event {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        public boolean equals(Object other) {
            return this == other || (other instanceof Exit);
        }

        public int hashCode() {
            return -2102556684;
        }

        public String toString() {
            return "Exit";
        }

        private Exit() {
        }
    }

    /* compiled from: InternationalTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event$LaunchDialog;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event;", "key", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchDialog implements InternationalTransferV2Event {
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

    /* compiled from: InternationalTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event$TransferCreated;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event;", "response", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;)V", "getResponse", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransferCreated implements InternationalTransferV2Event {
        public static final int $stable = 8;
        private final ApiCreateTransferResponse response;

        public static /* synthetic */ TransferCreated copy$default(TransferCreated transferCreated, ApiCreateTransferResponse apiCreateTransferResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCreateTransferResponse = transferCreated.response;
            }
            return transferCreated.copy(apiCreateTransferResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCreateTransferResponse getResponse() {
            return this.response;
        }

        public final TransferCreated copy(ApiCreateTransferResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new TransferCreated(response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TransferCreated) && Intrinsics.areEqual(this.response, ((TransferCreated) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "TransferCreated(response=" + this.response + ")";
        }

        public TransferCreated(ApiCreateTransferResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
        }

        public final ApiCreateTransferResponse getResponse() {
            return this.response;
        }
    }

    /* compiled from: InternationalTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event$ShowSduiAlert;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event;", "alert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "<init>", "(Lcom/robinhood/models/serverdriven/db/GenericAlert;)V", "getAlert", "()Lcom/robinhood/models/serverdriven/db/GenericAlert;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSduiAlert implements InternationalTransferV2Event {
        public static final int $stable = 8;
        private final GenericAlert alert;

        public static /* synthetic */ ShowSduiAlert copy$default(ShowSduiAlert showSduiAlert, GenericAlert genericAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlert = showSduiAlert.alert;
            }
            return showSduiAlert.copy(genericAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final GenericAlert getAlert() {
            return this.alert;
        }

        public final ShowSduiAlert copy(GenericAlert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new ShowSduiAlert(alert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowSduiAlert) && Intrinsics.areEqual(this.alert, ((ShowSduiAlert) other).alert);
        }

        public int hashCode() {
            return this.alert.hashCode();
        }

        public String toString() {
            return "ShowSduiAlert(alert=" + this.alert + ")";
        }

        public ShowSduiAlert(GenericAlert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final GenericAlert getAlert() {
            return this.alert;
        }
    }

    /* compiled from: InternationalTransferV2Event.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event$ShowAlert;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event;", "id", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "message", "<init>", "(ILcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getId", "()I", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAlert implements InternationalTransferV2Event {
        public static final int $stable = StringResource.$stable;
        private final int id;
        private final StringResource message;
        private final StringResource title;

        public static /* synthetic */ ShowAlert copy$default(ShowAlert showAlert, int i, StringResource stringResource, StringResource stringResource2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showAlert.id;
            }
            if ((i2 & 2) != 0) {
                stringResource = showAlert.title;
            }
            if ((i2 & 4) != 0) {
                stringResource2 = showAlert.message;
            }
            return showAlert.copy(i, stringResource, stringResource2);
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
        public final StringResource getMessage() {
            return this.message;
        }

        public final ShowAlert copy(int id, StringResource title, StringResource message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            return new ShowAlert(id, title, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowAlert)) {
                return false;
            }
            ShowAlert showAlert = (ShowAlert) other;
            return this.id == showAlert.id && Intrinsics.areEqual(this.title, showAlert.title) && Intrinsics.areEqual(this.message, showAlert.message);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.message.hashCode();
        }

        public String toString() {
            return "ShowAlert(id=" + this.id + ", title=" + this.title + ", message=" + this.message + ")";
        }

        public ShowAlert(int i, StringResource title, StringResource message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.id = i;
            this.title = title;
            this.message = message;
        }

        public final int getId() {
            return this.id;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getMessage() {
            return this.message;
        }
    }
}
