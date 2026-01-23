package com.robinhood.android.acats.acatsdb;

import com.robinhood.models.acats.p299db.dao.AcatsReimbursementDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsDaoModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acats/acatsdb/AcatsDaoModule;", "", "<init>", "()V", "provideAcatsReimbursementDao", "Lcom/robinhood/models/acats/db/dao/AcatsReimbursementDao;", "acatsDatabase", "Lcom/robinhood/android/acats/acatsdb/AcatsDatabase;", "lib-acats-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsDaoModule {
    public static final AcatsDaoModule INSTANCE = new AcatsDaoModule();

    private AcatsDaoModule() {
    }

    public final AcatsReimbursementDao provideAcatsReimbursementDao(AcatsDatabase acatsDatabase) {
        Intrinsics.checkNotNullParameter(acatsDatabase, "acatsDatabase");
        return acatsDatabase.reimbursementDao();
    }
}
