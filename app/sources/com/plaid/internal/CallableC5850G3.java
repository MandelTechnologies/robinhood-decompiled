package com.plaid.internal;

import androidx.sqlite.p015db.SupportSQLiteStatement;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: com.plaid.internal.G3 */
/* loaded from: classes16.dex */
public final class CallableC5850G3 implements Callable<Unit> {

    /* renamed from: a */
    public final /* synthetic */ String f1352a;

    /* renamed from: b */
    public final /* synthetic */ String f1353b;

    /* renamed from: c */
    public final /* synthetic */ String f1354c;

    /* renamed from: d */
    public final /* synthetic */ C5877J3 f1355d;

    public CallableC5850G3(C5877J3 c5877j3, String str, String str2, String str3) {
        this.f1355d = c5877j3;
        this.f1352a = str;
        this.f1353b = str2;
        this.f1354c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Unit call() {
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f1355d.f1402b.acquire();
        supportSQLiteStatementAcquire.bindString(1, this.f1352a);
        supportSQLiteStatementAcquire.bindString(2, this.f1353b);
        supportSQLiteStatementAcquire.bindString(3, this.f1354c);
        try {
            this.f1355d.f1401a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeInsert();
                this.f1355d.f1401a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                this.f1355d.f1401a.endTransaction();
            }
        } finally {
            this.f1355d.f1402b.release(supportSQLiteStatementAcquire);
        }
    }
}
