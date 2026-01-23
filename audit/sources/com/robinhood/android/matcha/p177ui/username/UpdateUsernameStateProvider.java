package com.robinhood.android.matcha.p177ui.username;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.matcha.p177ui.username.UpdateUsernameViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.FieldErrorListErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UpdateUsernameStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/username/UpdateUsernameStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameDataState;", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState;", "<init>", "()V", "reduce", "dataState", "extractErrorDialog", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState$ErrorDialog;", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class UpdateUsernameStateProvider implements StateProvider<UpdateUsernameDataState, UpdateUsernameViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public UpdateUsernameViewState reduce(UpdateUsernameDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getProfile() != null) {
            String username = dataState.getProfile().getUsername();
            ComposeUiEvent<Unit> updateComplete = dataState.getUpdateComplete();
            boolean zIsUpdating = dataState.isUpdating();
            Throwable error = dataState.getError();
            return new UpdateUsernameViewState.Loaded(username, updateComplete, zIsUpdating, error != null ? extractErrorDialog(error) : null);
        }
        return UpdateUsernameViewState.Loading.INSTANCE;
    }

    private final UpdateUsernameViewState.ErrorDialog extractErrorDialog(Throwable th) {
        StringResource stringResourceInvoke;
        String display_error_text;
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(th);
        if (errorResponseExtractErrorResponse instanceof FieldErrorListErrorResponse) {
            FieldErrorListErrorResponse.FieldError fieldError = (FieldErrorListErrorResponse.FieldError) CollectionsKt.firstOrNull((List) ((FieldErrorListErrorResponse) errorResponseExtractErrorResponse).getField_errors());
            if (fieldError == null || (display_error_text = fieldError.getDisplay_error_text()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(display_error_text)) == null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C11048R.string.error_description_something_went_wrong, new Object[0]);
            }
            return new UpdateUsernameViewState.ErrorDialog(null, stringResourceInvoke);
        }
        if (errorResponseExtractErrorResponse instanceof GenericAlertErrorResponse) {
            GenericAlertErrorResponse genericAlertErrorResponse = (GenericAlertErrorResponse) errorResponseExtractErrorResponse;
            return new UpdateUsernameViewState.ErrorDialog(genericAlertErrorResponse.getAlert().getTitle(), StringResource.INSTANCE.invoke(genericAlertErrorResponse.getAlert().getSubtitleMarkdown()));
        }
        return new UpdateUsernameViewState.ErrorDialog(null, StringResource.INSTANCE.invoke(C11048R.string.error_description_something_went_wrong, new Object[0]));
    }
}
