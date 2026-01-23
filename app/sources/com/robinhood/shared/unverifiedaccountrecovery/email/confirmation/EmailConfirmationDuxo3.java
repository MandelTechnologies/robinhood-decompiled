package com.robinhood.shared.unverifiedaccountrecovery.email.confirmation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailConfirmationDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationDuxo$sendUserInput$1$result$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class EmailConfirmationDuxo3 extends FunctionReferenceImpl implements Function1<Throwable, Boolean> {
    EmailConfirmationDuxo3(Object obj) {
        super(1, obj, EmailConfirmationDuxo.class, "handleInputError", "handleInputError$feature_unverified_account_recovery_externalDebug(Ljava/lang/Throwable;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(((EmailConfirmationDuxo) this.receiver).m2960xe95d987(p0));
    }
}
