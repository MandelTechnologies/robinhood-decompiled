package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", m3645f = "SentryCrashApi.kt", m3646l = {41}, m3647m = "sendCrash")
/* renamed from: com.plaid.internal.A6 */
/* loaded from: classes16.dex */
public final class C5799A6 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f1233a;

    /* renamed from: b */
    public final /* synthetic */ C5826D6 f1234b;

    /* renamed from: c */
    public int f1235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5799A6(C5826D6 c5826d6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1234b = c5826d6;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1233a = obj;
        this.f1235c |= Integer.MIN_VALUE;
        return this.f1234b.m1178a((Crash) null, this);
    }
}
