package com.robinhood.redesign.provisions;

import com.robinhood.android.redesign.dao.HighlightImpressionDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RedesignDaoModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/redesign/provisions/RedesignDaoModule;", "", "<init>", "()V", "provideHighlightImpressionDao", "Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;", "db", "Lcom/robinhood/redesign/provisions/RedesignDatabase;", "lib-db-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RedesignDaoModule {
    public static final RedesignDaoModule INSTANCE = new RedesignDaoModule();

    private RedesignDaoModule() {
    }

    public final HighlightImpressionDao provideHighlightImpressionDao(RedesignDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.highlightImpressionDao();
    }
}
