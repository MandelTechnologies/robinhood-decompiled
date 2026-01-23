package com.robinhood.userleap.util;

import com.userleap.EventPayload;
import com.userleap.SurveyState;
import com.userleap.UserLeap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserLeapCoroutines.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"trackEvent", "Lcom/userleap/SurveyState;", "Lcom/userleap/UserLeap;", "event", "", "callback", "Lkotlin/Function0;", "", "(Lcom/userleap/UserLeap;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-userleap_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.userleap.util.UserLeapCoroutinesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class UserLeapCoroutines {
    public static /* synthetic */ Object trackEvent$default(UserLeap userLeap, String str, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.robinhood.userleap.util.UserLeapCoroutinesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return trackEvent(userLeap, str, function0, continuation);
    }

    public static final Object trackEvent(UserLeap userLeap, String str, final Function0<Unit> function0, Continuation<? super SurveyState> continuation) {
        final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(continuation));
        userLeap.track(new EventPayload(str, null, null, null, new Function1<SurveyState, Unit>() { // from class: com.robinhood.userleap.util.UserLeapCoroutinesKt$trackEvent$3$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SurveyState surveyState) {
                invoke2(surveyState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SurveyState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                function0.invoke();
                safeContinuationJvm.resumeWith(Result.m28550constructorimpl(it));
            }
        }, null, 46, null));
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
