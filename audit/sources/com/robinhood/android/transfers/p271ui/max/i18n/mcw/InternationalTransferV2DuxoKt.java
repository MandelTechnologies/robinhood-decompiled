package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2Event;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;

/* compiled from: InternationalTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"extractErrorEvent", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event;", "", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class InternationalTransferV2DuxoKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InternationalTransferV2Event extractErrorEvent(Throwable th) {
        String error_message;
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(th);
        if (errorResponseExtractErrorResponse instanceof GenericAlertErrorResponse) {
            return new InternationalTransferV2Event.ShowSduiAlert(((GenericAlertErrorResponse) errorResponseExtractErrorResponse).getAlert());
        }
        if (!(errorResponseExtractErrorResponse instanceof GenericErrorResponse) || (error_message = ((GenericErrorResponse) errorResponseExtractErrorResponse).getError_message()) == null) {
            return null;
        }
        int i = C11048R.id.dialog_id_generic_error;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new InternationalTransferV2Event.ShowAlert(i, companion.invoke(C11048R.string.error_title, new Object[0]), companion.invoke(error_message));
    }
}
