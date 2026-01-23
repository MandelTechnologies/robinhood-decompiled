package com.withpersona.sdk2.inquiry.logger;

import android.content.Context;
import com.withpersona.sdk2.inquiry.logger.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import kotlin.p481io.FilesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job6;

/* compiled from: Logger.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011J \u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0018J&\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/logger/Logger;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "logFile", "Ljava/io/File;", "dateFormat", "Ljava/text/SimpleDateFormat;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "loggerContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "log", "", "subsystem", "", "level", "Lcom/withpersona/sdk2/inquiry/logger/LogLevel;", "message", "readCsvLogsWith", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/logger/LogLevel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLogFile", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_log", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/logger/LogLevel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "logger_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class Logger {
    private final CoroutineScope coroutineScope;
    private final SimpleDateFormat dateFormat;
    private final File logFile;
    private final CoroutineDispatcher loggerContext;

    public Logger(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.logFile = new File(context.getCacheDir(), "persona_log.csv");
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        this.coroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault().plus(Job6.Job$default(null, 1, null)));
        this.loggerContext = CoroutineDispatcher.limitedParallelism$default(Dispatchers.getIO(), 1, null, 2, null);
    }

    /* compiled from: Logger.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.logger.Logger$log$1", m3645f = "Logger.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.logger.Logger$log$1 */
    static final class C436621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Logger7 $level;
        final /* synthetic */ String $message;
        final /* synthetic */ String $subsystem;
        int label;
        final /* synthetic */ Logger this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436621(String str, Logger logger, String str2, Logger7 logger7, Continuation<? super C436621> continuation) {
            super(2, continuation);
            this.$message = str;
            this.this$0 = logger;
            this.$subsystem = str2;
            this.$level = logger7;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C436621(this.$message, this.this$0, this.$subsystem, this.$level, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strReplace$default = StringsKt.replace$default(this.$message, "\n", "\\n", false, 4, (Object) null);
                Logger logger = this.this$0;
                String str = this.$subsystem;
                Logger7 logger7 = this.$level;
                this.label = 1;
                if (logger._log(str, logger7, strReplace$default, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void log(String subsystem, Logger7 level, String message) {
        Intrinsics.checkNotNullParameter(subsystem, "subsystem");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C436621(message, this, subsystem, level, null), 3, null);
    }

    /* compiled from: Logger.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.logger.Logger$readCsvLogsWith$2", m3645f = "Logger.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.logger.Logger$readCsvLogsWith$2 */
    static final class C436632 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ Logger7 $level;
        final /* synthetic */ String $subsystem;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436632(String str, Logger7 logger7, Continuation<? super C436632> continuation) {
            super(2, continuation);
            this.$subsystem = str;
            this.$level = logger7;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Logger.this.new C436632(this.$subsystem, this.$level, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C436632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    if (!Logger.this.logFile.exists()) {
                        return null;
                    }
                    final StringBuilder sb = new StringBuilder();
                    File file = Logger.this.logFile;
                    final String str = this.$subsystem;
                    final Logger7 logger7 = this.$level;
                    FilesKt.forEachLine$default(file, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.logger.Logger$readCsvLogsWith$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Logger.C436632.invokeSuspend$lambda$0(str, logger7, sb, (String) obj2);
                        }
                    }, 1, null);
                    return sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(String str, Logger7 logger7, StringBuilder sb, String str2) {
            List listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null);
            String str3 = (String) listSplit$default.get(0);
            if (Intrinsics.areEqual((String) listSplit$default.get(2), str) && Intrinsics.areEqual(str3, logger7.name())) {
                sb.append(str2);
                sb.append("\n");
            }
            return Unit.INSTANCE;
        }
    }

    public final Object readCsvLogsWith(String str, Logger7 logger7, Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.loggerContext, new C436632(str, logger7, null), continuation);
    }

    /* compiled from: Logger.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.logger.Logger$deleteLogFile$2", m3645f = "Logger.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.logger.Logger$deleteLogFile$2 */
    static final class C436612 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        int label;

        C436612(Continuation<? super C436612> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Logger.this.new C436612(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((C436612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    return boxing.boxBoolean(Logger.this.logFile.delete());
                } catch (Exception unused) {
                    return Unit.INSTANCE;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object deleteLogFile(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.loggerContext, new C436612(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* compiled from: Logger.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.logger.Logger$_log$2", m3645f = "Logger.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.logger.Logger$_log$2 */
    static final class C436602 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        final /* synthetic */ Logger7 $level;
        final /* synthetic */ String $message;
        final /* synthetic */ String $subsystem;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436602(Logger7 logger7, String str, String str2, Continuation<? super C436602> continuation) {
            super(2, continuation);
            this.$level = logger7;
            this.$subsystem = str;
            this.$message = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Logger.this.new C436602(this.$level, this.$subsystem, this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((C436602) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    File parentFile = Logger.this.logFile.getParentFile();
                    if (parentFile != null) {
                        boxing.boxBoolean(parentFile.mkdirs());
                    }
                    String str = this.$level.name() + "," + Logger.this.dateFormat.format(new Date()) + "," + this.$subsystem + "," + this.$message;
                    FileWriter fileWriter = new FileWriter(Logger.this.logFile, true);
                    try {
                        Writer writerAppend = fileWriter.append((CharSequence) str);
                        Closeable.closeFinally(fileWriter, null);
                        return writerAppend;
                    } finally {
                    }
                } catch (Exception unused) {
                    return Unit.INSTANCE;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object _log(String str, Logger7 logger7, String str2, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.loggerContext, new C436602(logger7, str, str2, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
