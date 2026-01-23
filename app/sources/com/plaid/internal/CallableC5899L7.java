package com.plaid.internal;

import androidx.sqlite.p015db.SupportSQLiteStatement;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: com.plaid.internal.L7 */
/* loaded from: classes16.dex */
public final class CallableC5899L7 implements Callable<Unit> {

    /* renamed from: a */
    public final /* synthetic */ String f1530a;

    /* renamed from: b */
    public final /* synthetic */ String f1531b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f1532c;

    /* renamed from: d */
    public final /* synthetic */ C5911M7 f1533d;

    public CallableC5899L7(C5911M7 c5911m7, String str, String str2, byte[] bArr) {
        this.f1533d = c5911m7;
        this.f1530a = str;
        this.f1531b = str2;
        this.f1532c = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final Unit call() {
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f1533d.f1553c.acquire();
        supportSQLiteStatementAcquire.bindString(1, this.f1530a);
        supportSQLiteStatementAcquire.bindString(2, this.f1531b);
        supportSQLiteStatementAcquire.bindBlob(3, this.f1532c);
        try {
            this.f1533d.f1551a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeInsert();
                this.f1533d.f1551a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                this.f1533d.f1551a.endTransaction();
            }
        } finally {
            this.f1533d.f1553c.release(supportSQLiteStatementAcquire);
        }
    }
}
