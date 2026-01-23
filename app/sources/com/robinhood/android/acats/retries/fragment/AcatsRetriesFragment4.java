package com.robinhood.android.acats.retries.fragment;

import com.robinhood.android.acats.retries.fragment.AcatsRetriesFragmentContract;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AcatsRetriesFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.retries.fragment.AcatsRetriesFragment$ComposeContent$1$1$3$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsRetriesFragment4 extends FunctionReferenceImpl implements Function1<ApiAcatsTransfer.AcatRetryStep, Unit> {
    AcatsRetriesFragment4(Object obj) {
        super(1, obj, AcatsRetriesFragmentContract.Callbacks.class, "rowClicked", "rowClicked(Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$AcatRetryStep;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ApiAcatsTransfer.AcatRetryStep acatRetryStep) {
        invoke2(acatRetryStep);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ApiAcatsTransfer.AcatRetryStep acatRetryStep) {
        ((AcatsRetriesFragmentContract.Callbacks) this.receiver).rowClicked(acatRetryStep);
    }
}
