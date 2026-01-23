package com.plaid.internal;

import androidx.sqlite.p015db.SupportSQLiteStatement;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: com.plaid.internal.y4 */
/* loaded from: classes16.dex */
public final class CallableC7260y4 implements Callable<Unit> {

    /* renamed from: a */
    public final /* synthetic */ String f3323a;

    /* renamed from: b */
    public final /* synthetic */ String f3324b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f3325c;

    /* renamed from: d */
    public final /* synthetic */ C5797A4 f3326d;

    public CallableC7260y4(C5797A4 c5797a4, String str, String str2, byte[] bArr) {
        this.f3326d = c5797a4;
        this.f3323a = str;
        this.f3324b = str2;
        this.f3325c = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final Unit call() {
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f3326d.f1230b.acquire();
        supportSQLiteStatementAcquire.bindString(1, this.f3323a);
        supportSQLiteStatementAcquire.bindString(2, this.f3324b);
        supportSQLiteStatementAcquire.bindBlob(3, this.f3325c);
        try {
            this.f3326d.f1229a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeInsert();
                this.f3326d.f1229a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                this.f3326d.f1229a.endTransaction();
            }
        } finally {
            this.f3326d.f1230b.release(supportSQLiteStatementAcquire);
        }
    }
}
