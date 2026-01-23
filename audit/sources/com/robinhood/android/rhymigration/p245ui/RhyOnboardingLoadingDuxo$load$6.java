package com.robinhood.android.rhymigration.p245ui;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RhyOnboardingLoadingDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo", m3645f = "RhyOnboardingLoadingDuxo.kt", m3646l = {339, 340, 341, 342, 343}, m3647m = "loadRhyMigrationContrastPage")
/* loaded from: classes5.dex */
final class RhyOnboardingLoadingDuxo$load$6 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RhyOnboardingLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyOnboardingLoadingDuxo$load$6(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, Continuation<? super RhyOnboardingLoadingDuxo$load$6> continuation) {
        super(continuation);
        this.this$0 = rhyOnboardingLoadingDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadRhyMigrationContrastPage(null, this);
    }
}
