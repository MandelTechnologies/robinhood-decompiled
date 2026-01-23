package com.robinhood.shared.crypto.perpetuals.api;

import com.robinhood.android.common.C11048R;
import com.robinhood.crypto.models.perpetuals.p289ui.PerpetualErrorDetails;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PerpetualsErrorParser.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/crypto/perpetuals/api/PerpetualsErrorParser;", "", "<init>", "()V", "parseError", "Lcom/robinhood/crypto/models/perpetuals/ui/PerpetualErrorDetails;", "throwable", "", "getFallbackError", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PerpetualsErrorParser {
    public static final PerpetualsErrorParser INSTANCE = new PerpetualsErrorParser();

    private PerpetualsErrorParser() {
    }

    public final PerpetualErrorDetails parseError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        PerpetualErrorDetails perpetualErrorDetailsExtractPerpetualErrorDetails = PerpetualsErrorParser3.extractPerpetualErrorDetails(throwable);
        return perpetualErrorDetailsExtractPerpetualErrorDetails == null ? getFallbackError() : perpetualErrorDetailsExtractPerpetualErrorDetails;
    }

    private final PerpetualErrorDetails getFallbackError() {
        StringResource.Companion companion = StringResource.INSTANCE;
        return new PerpetualErrorDetails(companion.invoke(C11048R.string.general_error_title, new Object[0]), companion.invoke(C11048R.string.general_error_summary, new Object[0]), extensions2.persistentListOf());
    }
}
