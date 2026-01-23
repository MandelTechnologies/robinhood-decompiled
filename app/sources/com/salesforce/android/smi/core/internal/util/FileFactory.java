package com.salesforce.android.smi.core.internal.util;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.salesforce.android.smi.common.internal.util.FileUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FileFactory.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0086@¢\u0006\u0002\u0010\u000fJ \u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/util/FileFactory;", "", "basePath", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/CoroutineDispatcher;)V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/util/logging/Logger;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ljava/io/File;", "name", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeToFile", "fileName", "inputStream", "Ljava/io/InputStream;", "(Ljava/lang/String;Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveFile", "file", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FileFactory {
    private static final String TAG;
    private final String basePath;
    private final CoroutineDispatcher ioDispatcher;
    private final Logger logger;

    public FileFactory(String basePath, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.basePath = basePath;
        this.ioDispatcher = ioDispatcher;
        this.logger = Logger.getLogger(TAG);
    }

    public /* synthetic */ FileFactory(String str, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* compiled from: FileFactory.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.util.FileFactory$create$2", m3645f = "FileFactory.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.core.internal.util.FileFactory$create$2 */
    static final class C421262 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421262(String str, Continuation<? super C421262> continuation) {
            super(2, continuation);
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FileFactory.this.new C421262(this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((C421262) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FileUtil.INSTANCE.createDirectory(FileFactory.this.basePath);
                FileFactory fileFactory = FileFactory.this;
                String str = this.$name;
                return new File(fileFactory.basePath + "/" + str);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object create(String str, Continuation<? super File> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C421262(str, null), continuation);
    }

    /* compiled from: FileFactory.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.util.FileFactory$writeToFile$2", m3645f = "FileFactory.kt", m3646l = {32}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.core.internal.util.FileFactory$writeToFile$2 */
    static final class C421282 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        final /* synthetic */ String $fileName;
        final /* synthetic */ InputStream $inputStream;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421282(String str, InputStream inputStream, Continuation<? super C421282> continuation) {
            super(2, continuation);
            this.$fileName = str;
            this.$inputStream = inputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FileFactory.this.new C421282(this.$fileName, this.$inputStream, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((C421282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FileFactory fileFactory = FileFactory.this;
                String str = this.$fileName;
                this.label = 1;
                obj = fileFactory.create(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            File file = (File) obj;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            InputStream inputStream = this.$inputStream;
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 != -1) {
                        fileOutputStream.write(bArr, 0, i2);
                    } else {
                        fileOutputStream.flush();
                        Unit unit = Unit.INSTANCE;
                        Closeable.closeFinally(fileOutputStream, null);
                        return file;
                    }
                }
            } finally {
            }
        }
    }

    public final Object writeToFile(String str, InputStream inputStream, Continuation<? super File> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C421282(str, inputStream, null), continuation);
    }

    /* compiled from: FileFactory.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.util.FileFactory$saveFile$2", m3645f = "FileFactory.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.util.FileFactory$saveFile$2 */
    static final class C421272 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        final /* synthetic */ File $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421272(File file, Continuation<? super C421272> continuation) {
            super(2, continuation);
            this.$file = file;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FileFactory.this.new C421272(this.$file, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((C421272) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FileFactory fileFactory = FileFactory.this;
                String name = this.$file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                this.label = 1;
                obj = fileFactory.create(name, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            File file = (File) obj;
            if (!file.exists()) {
                file.createNewFile();
                FileChannel channel = new FileInputStream(this.$file).getChannel();
                FileChannel channel2 = new FileOutputStream(file).getChannel();
                try {
                    try {
                        boxing.boxLong(channel.transferTo(0L, channel.size(), channel2));
                        channel.close();
                    } catch (Exception e) {
                        FileFactory.this.logger.log(Level.WARNING, "Failed to save file: " + e.getMessage());
                        Unit unit = Unit.INSTANCE;
                        if (channel != null) {
                            channel.close();
                        }
                        if (channel2 != null) {
                        }
                    }
                    if (channel2 != null) {
                        channel2.close();
                    }
                } finally {
                }
            }
            return this.$file;
        }
    }

    public final Object saveFile(File file, Continuation<? super File> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C421272(file, null), continuation);
    }

    static {
        String simpleName = FileFactory.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        TAG = simpleName;
    }
}
