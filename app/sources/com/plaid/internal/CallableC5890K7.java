package com.plaid.internal;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: com.plaid.internal.K7 */
/* loaded from: classes16.dex */
public final class CallableC5890K7 implements Callable<Unit> {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f1435a;

    /* renamed from: b */
    public final /* synthetic */ C5911M7 f1436b;

    public CallableC5890K7(C5911M7 c5911m7, ArrayList arrayList) {
        this.f1436b = c5911m7;
        this.f1435a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Unit call() {
        this.f1436b.f1551a.beginTransaction();
        try {
            this.f1436b.f1552b.handleMultiple(this.f1435a);
            this.f1436b.f1551a.setTransactionSuccessful();
            return Unit.INSTANCE;
        } finally {
            this.f1436b.f1551a.endTransaction();
        }
    }
}
