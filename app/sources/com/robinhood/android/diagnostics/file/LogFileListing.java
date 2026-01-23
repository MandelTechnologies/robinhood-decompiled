package com.robinhood.android.diagnostics.file;

import java.io.File;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: LogFileManager.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/file/LogFileListing;", "", "", "j$/time/Instant", "Ljava/io/File;", "logFiles", "", "unknownFiles", "<init>", "(Ljava/util/Map;Ljava/util/Set;)V", "component1", "()Ljava/util/Map;", "component2", "()Ljava/util/Set;", "copy", "(Ljava/util/Map;Ljava/util/Set;)Lcom/robinhood/android/diagnostics/file/LogFileListing;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getLogFiles", "Ljava/util/Set;", "getUnknownFiles", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LogFileListing {
    private final Map<Instant, File> logFiles;
    private final Set<File> unknownFiles;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogFileListing copy$default(LogFileListing logFileListing, Map map, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            map = logFileListing.logFiles;
        }
        if ((i & 2) != 0) {
            set = logFileListing.unknownFiles;
        }
        return logFileListing.copy(map, set);
    }

    public final Map<Instant, File> component1() {
        return this.logFiles;
    }

    public final Set<File> component2() {
        return this.unknownFiles;
    }

    public final LogFileListing copy(Map<Instant, ? extends File> logFiles, Set<? extends File> unknownFiles) {
        Intrinsics.checkNotNullParameter(logFiles, "logFiles");
        Intrinsics.checkNotNullParameter(unknownFiles, "unknownFiles");
        return new LogFileListing(logFiles, unknownFiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogFileListing)) {
            return false;
        }
        LogFileListing logFileListing = (LogFileListing) other;
        return Intrinsics.areEqual(this.logFiles, logFileListing.logFiles) && Intrinsics.areEqual(this.unknownFiles, logFileListing.unknownFiles);
    }

    public int hashCode() {
        return (this.logFiles.hashCode() * 31) + this.unknownFiles.hashCode();
    }

    public String toString() {
        return "LogFileListing(logFiles=" + this.logFiles + ", unknownFiles=" + this.unknownFiles + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LogFileListing(Map<Instant, ? extends File> logFiles, Set<? extends File> unknownFiles) {
        Intrinsics.checkNotNullParameter(logFiles, "logFiles");
        Intrinsics.checkNotNullParameter(unknownFiles, "unknownFiles");
        this.logFiles = logFiles;
        this.unknownFiles = unknownFiles;
    }

    public final Map<Instant, File> getLogFiles() {
        return this.logFiles;
    }

    public final Set<File> getUnknownFiles() {
        return this.unknownFiles;
    }
}
