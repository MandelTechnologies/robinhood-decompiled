package co.touchlab.kermit;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Logger.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lco/touchlab/kermit/Logger;", "Lco/touchlab/kermit/BaseLogger;", "Lco/touchlab/kermit/LoggerConfig;", "config", "", "tag", "<init>", "(Lco/touchlab/kermit/LoggerConfig;Ljava/lang/String;)V", "withTag", "(Ljava/lang/String;)Lco/touchlab/kermit/Logger;", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Companion", "kermit_debug"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public class Logger extends BaseLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String tag;

    public String getTag() {
        return this.tag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logger(LoggerConfig config, String tag) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
    }

    public final Logger withTag(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new Logger(getConfig(), tag);
    }

    /* compiled from: Logger.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lco/touchlab/kermit/Logger$Companion;", "Lco/touchlab/kermit/Logger;", "<init>", "()V", "", "getTag", "()Ljava/lang/String;", "tag", "kermit_debug"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion extends Logger {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(KermitConfig.mutableLoggerConfigInit(CollectionsKt.listOf(platformLogWriter.platformLogWriter$default(null, 1, null))), "");
        }

        @Override // co.touchlab.kermit.Logger
        public String getTag() {
            return DefaultsJVM.getDefaultTag();
        }
    }
}
