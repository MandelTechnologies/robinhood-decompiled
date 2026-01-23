package com.robinhood.android.matcha.p177ui.username;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPdfFragment;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateUsernameViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState;", "", "Loading", "Loaded", "ErrorDialog", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface UpdateUsernameViewState {

    /* compiled from: UpdateUsernameViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState$Loading;", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements UpdateUsernameViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: UpdateUsernameViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState$Loaded;", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState;", "username", "", "updateComplete", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "", "isSaveButtonLoading", "", DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState$ErrorDialog;", "<init>", "(Ljava/lang/String;Lcom/robinhood/compose/duxo/ComposeUiEvent;ZLcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState$ErrorDialog;)V", "getUsername", "()Ljava/lang/String;", "getUpdateComplete", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "()Z", "getErrorDialog", "()Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState$ErrorDialog;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements UpdateUsernameViewState {
        public static final int $stable = StringResource.$stable | ComposeUiEvent.$stable;
        private final ErrorDialog errorDialog;
        private final boolean isSaveButtonLoading;
        private final ComposeUiEvent<Unit> updateComplete;
        private final String username;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, ComposeUiEvent composeUiEvent, boolean z, ErrorDialog errorDialog, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.username;
            }
            if ((i & 2) != 0) {
                composeUiEvent = loaded.updateComplete;
            }
            if ((i & 4) != 0) {
                z = loaded.isSaveButtonLoading;
            }
            if ((i & 8) != 0) {
                errorDialog = loaded.errorDialog;
            }
            return loaded.copy(str, composeUiEvent, z, errorDialog);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        public final ComposeUiEvent<Unit> component2() {
            return this.updateComplete;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSaveButtonLoading() {
            return this.isSaveButtonLoading;
        }

        /* renamed from: component4, reason: from getter */
        public final ErrorDialog getErrorDialog() {
            return this.errorDialog;
        }

        public final Loaded copy(String username, ComposeUiEvent<Unit> updateComplete, boolean isSaveButtonLoading, ErrorDialog errorDialog) {
            return new Loaded(username, updateComplete, isSaveButtonLoading, errorDialog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.username, loaded.username) && Intrinsics.areEqual(this.updateComplete, loaded.updateComplete) && this.isSaveButtonLoading == loaded.isSaveButtonLoading && Intrinsics.areEqual(this.errorDialog, loaded.errorDialog);
        }

        public int hashCode() {
            String str = this.username;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ComposeUiEvent<Unit> composeUiEvent = this.updateComplete;
            int iHashCode2 = (((iHashCode + (composeUiEvent == null ? 0 : composeUiEvent.hashCode())) * 31) + Boolean.hashCode(this.isSaveButtonLoading)) * 31;
            ErrorDialog errorDialog = this.errorDialog;
            return iHashCode2 + (errorDialog != null ? errorDialog.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(username=" + this.username + ", updateComplete=" + this.updateComplete + ", isSaveButtonLoading=" + this.isSaveButtonLoading + ", errorDialog=" + this.errorDialog + ")";
        }

        public Loaded(String str, ComposeUiEvent<Unit> composeUiEvent, boolean z, ErrorDialog errorDialog) {
            this.username = str;
            this.updateComplete = composeUiEvent;
            this.isSaveButtonLoading = z;
            this.errorDialog = errorDialog;
        }

        public final String getUsername() {
            return this.username;
        }

        public final ComposeUiEvent<Unit> getUpdateComplete() {
            return this.updateComplete;
        }

        public final boolean isSaveButtonLoading() {
            return this.isSaveButtonLoading;
        }

        public final ErrorDialog getErrorDialog() {
            return this.errorDialog;
        }
    }

    /* compiled from: UpdateUsernameViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState$ErrorDialog;", "", "title", "", CarResultComposable2.BODY, "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Ljava/lang/String;", "getBody", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ErrorDialog {
        public static final int $stable = StringResource.$stable;
        private final StringResource body;
        private final String title;

        public static /* synthetic */ ErrorDialog copy$default(ErrorDialog errorDialog, String str, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorDialog.title;
            }
            if ((i & 2) != 0) {
                stringResource = errorDialog.body;
            }
            return errorDialog.copy(str, stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getBody() {
            return this.body;
        }

        public final ErrorDialog copy(String title, StringResource body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return new ErrorDialog(title, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorDialog)) {
                return false;
            }
            ErrorDialog errorDialog = (ErrorDialog) other;
            return Intrinsics.areEqual(this.title, errorDialog.title) && Intrinsics.areEqual(this.body, errorDialog.body);
        }

        public int hashCode() {
            String str = this.title;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.body.hashCode();
        }

        public String toString() {
            return "ErrorDialog(title=" + this.title + ", body=" + this.body + ")";
        }

        public ErrorDialog(String str, StringResource body) {
            Intrinsics.checkNotNullParameter(body, "body");
            this.title = str;
            this.body = body;
        }

        public final String getTitle() {
            return this.title;
        }

        public final StringResource getBody() {
            return this.body;
        }
    }
}
