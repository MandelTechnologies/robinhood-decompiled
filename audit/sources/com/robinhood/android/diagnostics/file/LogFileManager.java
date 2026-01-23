package com.robinhood.android.diagnostics.file;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p479j$.time.Instant;

/* compiled from: LogFileManager.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/file/LogFileManager;", "", "j$/time/Instant", "timestamp", "Ljava/io/File;", "getLogFileForTimestamp", "(Lj$/time/Instant;)Ljava/io/File;", "Lcom/robinhood/android/diagnostics/file/LogFileListing;", "findExistingLogFiles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteStaleFiles", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface LogFileManager {
    Object deleteStaleFiles(Continuation<? super Unit> continuation);

    Object findExistingLogFiles(Continuation<? super LogFileListing> continuation);

    File getLogFileForTimestamp(Instant timestamp);
}
