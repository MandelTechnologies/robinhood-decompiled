package com.robinhood.android.gdpr.manager;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: GdprManager.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Landroid/app/Activity;", "<unused var>", "", "activity"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprManager$handleShowConsentBottomSheet$3", m3645f = "GdprManager.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gdpr.manager.GdprManager$handleShowConsentBottomSheet$3, reason: use source file name */
/* loaded from: classes17.dex */
final class GdprManager3 extends ContinuationImpl7 implements Function3<Unit, Activity, Continuation<? super Activity>, Object> {
    /* synthetic */ Object L$0;
    int label;

    GdprManager3(Continuation<? super GdprManager3> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Unit unit, Activity activity, Continuation<? super Activity> continuation) {
        GdprManager3 gdprManager3 = new GdprManager3(continuation);
        gdprManager3.L$0 = activity;
        return gdprManager3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return (Activity) this.L$0;
    }
}
