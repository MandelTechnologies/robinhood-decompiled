package com.plaid.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", m3645f = "SentryCrashApi.kt", m3646l = {55}, m3647m = "sendCrashes")
/* renamed from: com.plaid.internal.B6 */
/* loaded from: classes16.dex */
public final class C5808B6 extends ContinuationImpl {

    /* renamed from: a */
    public ArrayList f1280a;

    /* renamed from: b */
    public /* synthetic */ Object f1281b;

    /* renamed from: c */
    public final /* synthetic */ C5826D6 f1282c;

    /* renamed from: d */
    public int f1283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5808B6(C5826D6 c5826d6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1282c = c5826d6;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1281b = obj;
        this.f1283d |= Integer.MIN_VALUE;
        return this.f1282c.m1179a((List) null, this);
    }
}
