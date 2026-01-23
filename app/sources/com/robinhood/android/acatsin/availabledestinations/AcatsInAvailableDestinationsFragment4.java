package com.robinhood.android.acatsin.availabledestinations;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAvailableDestinationsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment$ComposeContent$2$1$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInAvailableDestinationsFragment4 extends FunctionReferenceImpl implements Function1<GenericAction, Boolean> {
    AcatsInAvailableDestinationsFragment4(Object obj) {
        super(1, obj, AcatsInAvailableDestinationsFragment.class, "handle", "handle(Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(GenericAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(((AcatsInAvailableDestinationsFragment) this.receiver).mo15941handle(p0));
    }
}
