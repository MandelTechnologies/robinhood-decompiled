package com.robinhood.android.diagnostics.file;

import com.robinhood.time.format.DateTimeFormatters;
import dispatch.core.Suspend;
import java.io.File;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;
import p479j$.time.ZoneOffset;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalQuery;

/* compiled from: LogFileManager.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/file/HourlyLogFileManager;", "Lcom/robinhood/android/diagnostics/file/LogFileManager;", "Ljava/io/File;", "directory", "", "extension", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "j$/time/Instant", "timestamp", "getLogFileForTimestamp", "(Lj$/time/Instant;)Ljava/io/File;", "Lcom/robinhood/android/diagnostics/file/LogFileListing;", "findExistingLogFiles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteStaleFiles", "Ljava/io/File;", "Ljava/lang/String;", "Companion", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.diagnostics.file.HourlyLogFileManager, reason: use source file name */
/* loaded from: classes17.dex */
public final class LogFileManager2 implements LogFileManager {
    private static final DateTimeFormatter FORMATTER;
    private static final int LIMIT_BYTES = 26214400;
    private final File directory;
    private final String extension;

    public LogFileManager2(File directory, String extension) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.directory = directory;
        this.extension = extension;
        directory.mkdirs();
        if (!directory.exists()) {
            throw new IllegalStateException("Check failed.");
        }
        if (!directory.isDirectory()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // com.robinhood.android.diagnostics.file.LogFileManager
    public File getLogFileForTimestamp(Instant timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new File(this.directory, FORMATTER.format(timestamp) + "." + this.extension);
    }

    /* compiled from: LogFileManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/diagnostics/file/LogFileListing;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.diagnostics.file.HourlyLogFileManager$findExistingLogFiles$2", m3645f = "LogFileManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.diagnostics.file.HourlyLogFileManager$findExistingLogFiles$2 */
    static final class C140392 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super LogFileListing>, Object> {
        int label;

        C140392(Continuation<? super C140392> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LogFileManager2.this.new C140392(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LogFileListing> continuation) {
            return ((C140392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TreeMap treeMap = new TreeMap();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            File[] fileArrListFiles = LogFileManager2.this.directory.listFiles();
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            for (File file : fileArrListFiles) {
                Intrinsics.checkNotNull(file);
                if (Intrinsics.areEqual(FilesKt.getExtension(file), LogFileManager2.this.extension)) {
                    Instant instant = (Instant) DateTimeFormatters.parseOrNull(LogFileManager2.FORMATTER, FilesKt.getNameWithoutExtension(file), new TemporalQuery() { // from class: com.robinhood.android.diagnostics.file.HourlyLogFileManager$findExistingLogFiles$2$timestamp$1
                        @Override // p479j$.time.temporal.TemporalQuery
                        public final Instant queryFrom(TemporalAccessor temporalAccessor) {
                            return Instant.from(temporalAccessor);
                        }
                    });
                    if (instant == null) {
                        linkedHashSet.add(file);
                    } else {
                        treeMap.put(instant, file);
                    }
                } else {
                    linkedHashSet.add(file);
                }
            }
            return new LogFileListing(treeMap, linkedHashSet);
        }
    }

    @Override // com.robinhood.android.diagnostics.file.LogFileManager
    public Object findExistingLogFiles(Continuation<? super LogFileListing> continuation) {
        return Suspend.withIO$default(null, new C140392(null), continuation, 1, null);
    }

    /* compiled from: LogFileManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.diagnostics.file.HourlyLogFileManager$deleteStaleFiles$2", m3645f = "LogFileManager.kt", m3646l = {102}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.diagnostics.file.HourlyLogFileManager$deleteStaleFiles$2 */
    static final class C140382 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C140382(Continuation<? super C140382> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C140382 c140382 = LogFileManager2.this.new C140382(continuation);
            c140382.L$0 = obj;
            return c140382;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C140382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                LogFileManager2 logFileManager2 = LogFileManager2.this;
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objFindExistingLogFiles = logFileManager2.findExistingLogFiles(this);
                if (objFindExistingLogFiles == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                obj = objFindExistingLogFiles;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            LogFileListing logFileListing = (LogFileListing) obj;
            Iterator<File> it = logFileListing.getUnknownFiles().iterator();
            while (it.hasNext()) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(it.next(), null), 3, null);
            }
            List listSortedWith = CollectionsKt.sortedWith(logFileListing.getLogFiles().entrySet(), new Comparator() { // from class: com.robinhood.android.diagnostics.file.HourlyLogFileManager$deleteStaleFiles$2$invokeSuspend$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Instant) ((Map.Entry) t2).getKey(), (Instant) ((Map.Entry) t).getKey());
                }
            });
            long length = 0;
            int i2 = 0;
            while (i2 <= CollectionsKt.getLastIndex(listSortedWith)) {
                length += ((File) ((Map.Entry) listSortedWith.get(i2)).getValue()).length();
                if (length > 26214400) {
                    break;
                }
                i2++;
            }
            int lastIndex = CollectionsKt.getLastIndex(listSortedWith);
            if (i2 <= lastIndex) {
                int i3 = i2;
                while (true) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(listSortedWith, i3, null), 3, null);
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: LogFileManager.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.diagnostics.file.HourlyLogFileManager$deleteStaleFiles$2$1", m3645f = "LogFileManager.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.diagnostics.file.HourlyLogFileManager$deleteStaleFiles$2$1, reason: invalid class name */
        /* loaded from: classes16.dex */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ File $file;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(File file, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$file = file;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$file, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$file.isFile()) {
                    this.$file.delete();
                } else {
                    FilesKt.deleteRecursively(this.$file);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: LogFileManager.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.diagnostics.file.HourlyLogFileManager$deleteStaleFiles$2$2", m3645f = "LogFileManager.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.diagnostics.file.HourlyLogFileManager$deleteStaleFiles$2$2, reason: invalid class name */
        /* loaded from: classes16.dex */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<Map.Entry<Instant, File>> $entries;

            /* renamed from: $i */
            final /* synthetic */ int f4108$i;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(List<? extends Map.Entry<Instant, ? extends File>> list, int i, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$entries = list;
                this.f4108$i = i;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$entries, this.f4108$i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$entries.get(this.f4108$i).getValue().delete();
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.diagnostics.file.LogFileManager
    public Object deleteStaleFiles(Continuation<? super Unit> continuation) {
        return Suspend.withIO$default(null, new C140382(null), continuation, 1, null);
    }

    static {
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH", Locale.US).withZone(ZoneOffset.UTC);
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatterWithZone, "withZone(...)");
        FORMATTER = dateTimeFormatterWithZone;
    }
}
