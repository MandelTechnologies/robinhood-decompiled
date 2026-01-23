package com.plaid.internal;

import androidx.sqlite.p015db.SupportSQLiteStatement;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: com.plaid.internal.H3 */
/* loaded from: classes16.dex */
public final class CallableC5859H3 implements Callable<Unit> {

    /* renamed from: a */
    public final /* synthetic */ String f1363a;

    /* renamed from: b */
    public final /* synthetic */ C5877J3 f1364b;

    public CallableC5859H3(C5877J3 c5877j3, String str) {
        this.f1364b = c5877j3;
        this.f1363a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Unit call() {
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f1364b.f1403c.acquire();
        supportSQLiteStatementAcquire.bindString(1, this.f1363a);
        try {
            this.f1364b.f1401a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f1364b.f1401a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                this.f1364b.f1401a.endTransaction();
            }
        } finally {
            this.f1364b.f1403c.release(supportSQLiteStatementAcquire);
        }
    }
}
