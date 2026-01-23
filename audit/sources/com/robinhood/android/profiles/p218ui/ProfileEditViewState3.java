package com.robinhood.android.profiles.p218ui;

import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.FieldErrorListErrorResponse;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.udf.UiEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProfileEditViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/SaveProfileStatus;", "", "<init>", "()V", "Saving", "Success", "Error", "LegacyError", "Lcom/robinhood/android/profiles/ui/SaveProfileStatus$Error;", "Lcom/robinhood/android/profiles/ui/SaveProfileStatus$LegacyError;", "Lcom/robinhood/android/profiles/ui/SaveProfileStatus$Saving;", "Lcom/robinhood/android/profiles/ui/SaveProfileStatus$Success;", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.profiles.ui.SaveProfileStatus, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class ProfileEditViewState3 {
    public /* synthetic */ ProfileEditViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProfileEditViewState3() {
    }

    /* compiled from: ProfileEditViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/SaveProfileStatus$Saving;", "Lcom/robinhood/android/profiles/ui/SaveProfileStatus;", "<init>", "()V", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.profiles.ui.SaveProfileStatus$Saving */
    public static final class Saving extends ProfileEditViewState3 {
        public static final Saving INSTANCE = new Saving();

        private Saving() {
            super(null);
        }
    }

    /* compiled from: ProfileEditViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/SaveProfileStatus$Success;", "Lcom/robinhood/android/profiles/ui/SaveProfileStatus;", "event", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.profiles.ui.SaveProfileStatus$Success */
    public static final class Success extends ProfileEditViewState3 {
        private final UiEvent<Unit> event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UiEvent<Unit> event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public final UiEvent<Unit> getEvent() {
            return this.event;
        }
    }

    /* compiled from: ProfileEditViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/SaveProfileStatus$Error;", "Lcom/robinhood/android/profiles/ui/SaveProfileStatus;", "alertEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getAlertEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.profiles.ui.SaveProfileStatus$Error */
    public static final class Error extends ProfileEditViewState3 {
        private final UiEvent<GenericAlert> alertEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(UiEvent<GenericAlert> alertEvent) {
            super(null);
            Intrinsics.checkNotNullParameter(alertEvent, "alertEvent");
            this.alertEvent = alertEvent;
        }

        public final UiEvent<GenericAlert> getAlertEvent() {
            return this.alertEvent;
        }
    }

    /* compiled from: ProfileEditViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/SaveProfileStatus$LegacyError;", "Lcom/robinhood/android/profiles/ui/SaveProfileStatus;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "genericErrorEvent", "Lcom/robinhood/udf/UiEvent;", "", "getGenericErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "errorResponse", "Lcom/robinhood/models/api/FieldErrorListErrorResponse;", "saveUsernameErrorMessage", "getSaveUsernameErrorMessage", "()Ljava/lang/String;", "getDisplayErrorText", "key", "Companion", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.profiles.ui.SaveProfileStatus$LegacyError */
    public static final class LegacyError extends ProfileEditViewState3 {
        private static final String KEY_ERROR_USERNAME = "username";
        private final FieldErrorListErrorResponse errorResponse;
        private final UiEvent<String> genericErrorEvent;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r0v5 */
        public LegacyError(Throwable throwable) {
            List<FieldErrorListErrorResponse.FieldError> field_errors;
            FieldErrorListErrorResponse.FieldError fieldError;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            UiEvent<String> uiEvent = 0;
            display_error_text = null;
            display_error_text = null;
            String display_error_text = null;
            super(uiEvent);
            ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
            FieldErrorListErrorResponse fieldErrorListErrorResponse = errorResponseExtractErrorResponse instanceof FieldErrorListErrorResponse ? (FieldErrorListErrorResponse) errorResponseExtractErrorResponse : null;
            this.errorResponse = fieldErrorListErrorResponse;
            if (getSaveUsernameErrorMessage() == null) {
                if (fieldErrorListErrorResponse != null && (field_errors = fieldErrorListErrorResponse.getField_errors()) != null && (fieldError = (FieldErrorListErrorResponse.FieldError) CollectionsKt.getOrNull(field_errors, 0)) != null) {
                    display_error_text = fieldError.getDisplay_error_text();
                }
                uiEvent = new UiEvent(display_error_text == null ? "" : display_error_text);
            }
            this.genericErrorEvent = uiEvent;
        }

        public final UiEvent<String> getGenericErrorEvent() {
            return this.genericErrorEvent;
        }

        public final String getSaveUsernameErrorMessage() {
            return getDisplayErrorText(KEY_ERROR_USERNAME);
        }

        private final String getDisplayErrorText(String key) {
            List<FieldErrorListErrorResponse.FieldError> field_errors;
            Object next;
            FieldErrorListErrorResponse fieldErrorListErrorResponse = this.errorResponse;
            if (fieldErrorListErrorResponse != null && (field_errors = fieldErrorListErrorResponse.getField_errors()) != null) {
                Iterator<T> it = field_errors.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((FieldErrorListErrorResponse.FieldError) next).getId(), key)) {
                        break;
                    }
                }
                FieldErrorListErrorResponse.FieldError fieldError = (FieldErrorListErrorResponse.FieldError) next;
                if (fieldError != null) {
                    return fieldError.getDisplay_error_text();
                }
            }
            return null;
        }
    }
}
