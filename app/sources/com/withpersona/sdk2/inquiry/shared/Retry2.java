package com.withpersona.sdk2.inquiry.shared;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: Retry.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000321\u0010\u0004\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0086@¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "", "maxAttempts", "", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "attempt", "Lkotlin/coroutines/Continuation;", "", "", "(ILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.RetryKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class Retry2 {

    /* compiled from: Retry.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.shared.RetryKt", m3645f = "Retry.kt", m3646l = {13}, m3647m = AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.RetryKt$retry$1 */
    static final class C437501 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C437501(Continuation<? super C437501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Retry2.retry(0, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:20:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retry(int i, Function2<? super Integer, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        C437501 c437501;
        int i2;
        int i3;
        Function2<? super Integer, ? super Continuation<? super Boolean>, ? extends Object> function22;
        if (continuation instanceof C437501) {
            c437501 = (C437501) continuation;
            int i4 = c437501.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c437501.label = i4 - Integer.MIN_VALUE;
            } else {
                c437501 = new C437501(continuation);
            }
        }
        Object obj = c437501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c437501.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            i2 = i;
            i3 = 0;
            function22 = function2;
            if (i3 < i2) {
            }
            return Unit.INSTANCE;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i3 = c437501.I$1;
        i2 = c437501.I$0;
        Function2<? super Integer, ? super Continuation<? super Boolean>, ? extends Object> function23 = (Function2) c437501.L$0;
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            i3++;
            function22 = function23;
            if (i3 < i2) {
                Integer numBoxInt = boxing.boxInt(i3);
                c437501.L$0 = function22;
                c437501.I$0 = i2;
                c437501.I$1 = i3;
                c437501.label = 1;
                Object objInvoke = function22.invoke(numBoxInt, c437501);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function23 = function22;
                obj = objInvoke;
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
