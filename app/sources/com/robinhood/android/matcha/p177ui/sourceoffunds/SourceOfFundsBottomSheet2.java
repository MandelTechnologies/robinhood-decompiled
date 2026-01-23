package com.robinhood.android.matcha.p177ui.sourceoffunds;

import com.robinhood.models.serverdriven.p347db.GenericAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SourceOfFundsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheet$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class SourceOfFundsBottomSheet2 extends FunctionReferenceImpl implements Function1<GenericAction, Unit> {
    SourceOfFundsBottomSheet2(Object obj) {
        super(1, obj, SourceOfFundsBottomSheet.class, "handleBannerAction", "handleBannerAction(Lcom/robinhood/models/serverdriven/db/GenericAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GenericAction genericAction) {
        invoke2(genericAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GenericAction genericAction) {
        ((SourceOfFundsBottomSheet) this.receiver).handleBannerAction(genericAction);
    }
}
