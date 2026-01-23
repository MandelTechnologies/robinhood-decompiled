package com.robinhood.android.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Bitmaps4;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.vault.Vault;
import dispatch.core.Launch;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: BitmapStore.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u00018B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u001cJ&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\"J\u0018\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010#\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010$J\u001f\u0010%\u001a\u00020&2\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0(\"\u00020\u000e¢\u0006\u0002\u0010)J\u001f\u0010%\u001a\u00020&2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0(\"\u00020\u001e¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u000eJ\u0010\u0010.\u001a\u0004\u0018\u00010\u00162\u0006\u0010/\u001a\u00020\u000eJ\b\u00100\u001a\u00020\u000eH\u0002J\u0010\u00101\u001a\u0002022\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u00103\u001a\u0004\u0018\u00010\u00182\u0006\u00104\u001a\u000202H\u0002J\u0018\u00105\u001a\u00020&2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u0016H\u0002J\b\u00107\u001a\u00020&H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00110\u00110\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/bitmap/BitmapStore;", "Lcom/robinhood/store/Store;", "context", "Landroid/content/Context;", "vault", "Lcom/robinhood/vault/Vault;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Landroid/content/Context;Lcom/robinhood/vault/Vault;Lcom/robinhood/store/StoreBundle;)V", "nameSeeder", "Ljava/util/concurrent/atomic/AtomicInteger;", "nameSeeds", "", "", "cacheMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/robinhood/android/bitmap/BitmapStore$CacheEntity;", "lruMap", "Ljava/util/concurrent/PriorityBlockingQueue;", "kotlin.jvm.PlatformType", "saveBitmapToDisk", "Ljava/io/File;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fileName", "(Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "encryptBitmapAndSaveToDisk", "Landroid/net/Uri;", "directoryName", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readBitmapFromDisk", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uri", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBitmapsFromDisk", "", "fileNames", "", "([Ljava/lang/String;)V", "uris", "([Landroid/net/Uri;)V", "getCanonicalFile", "name", "getCacheFileByKey", "key", "getNextCacheFileName", "encrypt", "Lokio/ByteString;", "decrypt", "encryptedByteString", "addToCache", "file", "sanitizeCache", "CacheEntity", "lib-store-bitmap_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BitmapStore extends Store {
    private final ConcurrentHashMap<String, CacheEntity> cacheMap;
    private final Context context;
    private final PriorityBlockingQueue<CacheEntity> lruMap;
    private final AtomicInteger nameSeeder;
    private final List<String> nameSeeds;
    private final Vault vault;

    /* compiled from: BitmapStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.bitmap.BitmapStore", m3645f = "BitmapStore.kt", m3646l = {61}, m3647m = "saveBitmapToDisk")
    /* renamed from: com.robinhood.android.bitmap.BitmapStore$saveBitmapToDisk$1 */
    static final class C98561 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C98561(Continuation<? super C98561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BitmapStore.this.saveBitmapToDisk(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapStore(Context context, Vault vault, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.context = context;
        this.vault = vault;
        this.nameSeeder = new AtomicInteger(0);
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(1, 10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2, 10));
        Iterator<Integer> it = primitiveRanges2.iterator();
        while (it.hasNext()) {
            arrayList.add("image_" + ((PrimitiveIterators6) it).nextInt() + ".png");
        }
        this.nameSeeds = arrayList;
        this.cacheMap = new ConcurrentHashMap<>();
        int size = arrayList.size();
        final BitmapStore2 bitmapStore2 = new PropertyReference1Impl() { // from class: com.robinhood.android.bitmap.BitmapStore$lruMap$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((BitmapStore.CacheEntity) obj).getUpdatedAt();
            }
        };
        this.lruMap = new PriorityBlockingQueue<>(size, Comparator.comparing(new Function(bitmapStore2) { // from class: com.robinhood.android.bitmap.BitmapStore$sam$java_util_function_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(bitmapStore2, "function");
                this.function = bitmapStore2;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveBitmapToDisk(Bitmap bitmap, Continuation<? super File> continuation) {
        C98561 c98561;
        String str;
        if (continuation instanceof C98561) {
            c98561 = (C98561) continuation;
            int i = c98561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c98561.label = i - Integer.MIN_VALUE;
            } else {
                c98561 = new C98561(continuation);
            }
        }
        Object obj = c98561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c98561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String nextCacheFileName = getNextCacheFileName();
            c98561.L$0 = nextCacheFileName;
            c98561.label = 1;
            Object objSaveBitmapToDisk = saveBitmapToDisk(bitmap, nextCacheFileName, c98561);
            if (objSaveBitmapToDisk == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objSaveBitmapToDisk;
            str = nextCacheFileName;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c98561.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return getCacheFileByKey(str);
        }
        return null;
    }

    /* compiled from: BitmapStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.bitmap.BitmapStore$saveBitmapToDisk$3", m3645f = "BitmapStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.bitmap.BitmapStore$saveBitmapToDisk$3 */
    static final class C98573 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ String $fileName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98573(String str, Bitmap bitmap, Continuation<? super C98573> continuation) {
            super(2, continuation);
            this.$fileName = str;
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BitmapStore.this.new C98573(this.$fileName, this.$bitmap, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C98573) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            FileNotFoundException fileNotFoundException;
            Throwable th;
            OutputStream outputStream;
            OutputStream bufferedOutputStream;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = false;
                OutputStream outputStream2 = null;
                OutputStream outputStream3 = null;
                try {
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = BitmapStore.this.context.openFileOutput(this.$fileName, 0);
                        Intrinsics.checkNotNullExpressionValue(fileOutputStreamOpenFileOutput, "openFileOutput(...)");
                        bufferedOutputStream = new BufferedOutputStream(fileOutputStreamOpenFileOutput, 8192);
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = outputStream2;
                    }
                } catch (FileNotFoundException e) {
                    fileNotFoundException = e;
                }
                try {
                    Bitmap bitmap = this.$bitmap;
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    boolean zCompress = bitmap.compress(compressFormat, 100, bufferedOutputStream);
                    BufferedOutputStream bufferedOutputStream2 = compressFormat;
                    if (zCompress) {
                        BitmapStore bitmapStore = BitmapStore.this;
                        String str = this.$fileName;
                        File fileStreamPath = bitmapStore.context.getFileStreamPath(this.$fileName);
                        Intrinsics.checkNotNullExpressionValue(fileStreamPath, "getFileStreamPath(...)");
                        bitmapStore.addToCache(str, fileStreamPath);
                        z = true;
                        bufferedOutputStream2 = str;
                    }
                    try {
                        bufferedOutputStream.close();
                        outputStream2 = bufferedOutputStream2;
                    } catch (IOException e2) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e2, false, null, 4, null);
                        outputStream2 = bufferedOutputStream2;
                    }
                } catch (FileNotFoundException e3) {
                    fileNotFoundException = e3;
                    outputStream3 = bufferedOutputStream;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, fileNotFoundException, false, null, 4, null);
                    outputStream2 = outputStream3;
                    if (outputStream3 != null) {
                        try {
                            outputStream3.close();
                            outputStream2 = outputStream3;
                        } catch (IOException e4) {
                            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e4, false, null, 4, null);
                            outputStream2 = outputStream3;
                        }
                    }
                    return boxing.boxBoolean(z);
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = bufferedOutputStream;
                    if (outputStream == null) {
                        throw th;
                    }
                    try {
                        outputStream.close();
                        throw th;
                    } catch (IOException e5) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e5, false, null, 4, null);
                        throw th;
                    }
                }
                return boxing.boxBoolean(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object saveBitmapToDisk(Bitmap bitmap, String str, Continuation<? super Boolean> continuation) {
        return BuildersKt__Builders_commonKt.async$default(getStoreScope(), null, null, new C98573(str, bitmap, null), 3, null).await(continuation);
    }

    /* compiled from: BitmapStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroid/net/Uri;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.bitmap.BitmapStore$encryptBitmapAndSaveToDisk$2", m3645f = "BitmapStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.bitmap.BitmapStore$encryptBitmapAndSaveToDisk$2 */
    static final class C98532 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ String $directoryName;
        final /* synthetic */ String $fileName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98532(Bitmap bitmap, String str, String str2, Continuation<? super C98532> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
            this.$directoryName = str;
            this.$fileName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BitmapStore.this.new C98532(this.$bitmap, this.$directoryName, this.$fileName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
            return ((C98532) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws ImageProcessingFailedException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ByteString byteStringEncrypt = BitmapStore.this.encrypt(this.$bitmap);
                try {
                    File file = new File(BitmapStore.this.context.getCacheDir(), this.$directoryName);
                    file.mkdirs();
                    File file2 = new File(file, this.$fileName);
                    FilesKt.writeBytes(file2, byteStringEncrypt.toByteArray());
                    return Uri.fromFile(file2);
                } catch (Exception e) {
                    throw new ImageProcessingFailedException(e);
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object encryptBitmapAndSaveToDisk(Bitmap bitmap, String str, String str2, Continuation<? super Uri> continuation) {
        return BuildersKt__Builders_commonKt.async$default(getStoreScope(), null, null, new C98532(bitmap, str, str2, null), 3, null).await(continuation);
    }

    /* compiled from: BitmapStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.bitmap.BitmapStore$readBitmapFromDisk$2", m3645f = "BitmapStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.bitmap.BitmapStore$readBitmapFromDisk$2 */
    static final class C98542 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ String $fileName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98542(String str, Continuation<? super C98542> continuation) {
            super(2, continuation);
            this.$fileName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BitmapStore.this.new C98542(this.$fileName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C98542) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FileInputStream fileInputStreamOpenFileInput = null;
                try {
                    try {
                        fileInputStreamOpenFileInput = BitmapStore.this.context.openFileInput(this.$fileName);
                        return BitmapFactory.decodeStream(fileInputStreamOpenFileInput);
                    } catch (FileNotFoundException e) {
                        throw e;
                    }
                } finally {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object readBitmapFromDisk(String str, Continuation<? super Bitmap> continuation) {
        return BuildersKt__Builders_commonKt.async$default(getStoreScope(), null, null, new C98542(str, null), 3, null).await(continuation);
    }

    public final Object readBitmapFromDisk(Uri uri, Continuation<? super Bitmap> continuation) {
        if (Intrinsics.areEqual(uri.getScheme(), "file") || Intrinsics.areEqual(uri.getScheme(), "file")) {
            return BuildersKt__Builders_commonKt.async$default(getStoreScope(), null, null, new C98555(uri, this, null), 3, null).await(continuation);
        }
        throw new IllegalArgumentException("Only file URI is supported!");
    }

    /* compiled from: BitmapStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.bitmap.BitmapStore$readBitmapFromDisk$5", m3645f = "BitmapStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.bitmap.BitmapStore$readBitmapFromDisk$5 */
    static final class C98555 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ BitmapStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98555(Uri uri, BitmapStore bitmapStore, Continuation<? super C98555> continuation) {
            super(2, continuation);
            this.$uri = uri;
            this.this$0 = bitmapStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C98555(this.$uri, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C98555) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws ImageProcessingFailedException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                String path = this.$uri.getPath();
                Intrinsics.checkNotNull(path);
                byte[] bytes = FilesKt.readBytes(new File(path));
                try {
                    return this.this$0.decrypt(ByteString.Companion.of$default(ByteString.INSTANCE, bytes, 0, 0, 3, null));
                } catch (Exception unused) {
                    return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                }
            } catch (Exception e) {
                throw new ImageProcessingFailedException(e);
            }
        }
    }

    /* compiled from: BitmapStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.bitmap.BitmapStore$deleteBitmapsFromDisk$1", m3645f = "BitmapStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.bitmap.BitmapStore$deleteBitmapsFromDisk$1 */
    static final class C98511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String[] $fileNames;
        int label;
        final /* synthetic */ BitmapStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98511(String[] strArr, BitmapStore bitmapStore, Continuation<? super C98511> continuation) {
            super(2, continuation);
            this.$fileNames = strArr;
            this.this$0 = bitmapStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C98511(this.$fileNames, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C98511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (String str : this.$fileNames) {
                this.this$0.context.deleteFile(str);
            }
            this.this$0.sanitizeCache();
            return Unit.INSTANCE;
        }
    }

    public final void deleteBitmapsFromDisk(String... fileNames) {
        Intrinsics.checkNotNullParameter(fileNames, "fileNames");
        Launch.launchIO$default(getStoreScope(), null, null, new C98511(fileNames, this, null), 3, null);
    }

    /* compiled from: BitmapStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.bitmap.BitmapStore$deleteBitmapsFromDisk$2", m3645f = "BitmapStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.bitmap.BitmapStore$deleteBitmapsFromDisk$2 */
    static final class C98522 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Uri[] $uris;
        int label;
        final /* synthetic */ BitmapStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98522(Uri[] uriArr, BitmapStore bitmapStore, Continuation<? super C98522> continuation) {
            super(2, continuation);
            this.$uris = uriArr;
            this.this$0 = bitmapStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C98522(this.$uris, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C98522) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (Uri uri : this.$uris) {
                String path = uri.getPath();
                if (path != null) {
                    new File(path).delete();
                    this.this$0.sanitizeCache();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteBitmapsFromDisk(Uri... uris) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Launch.launchIO$default(getStoreScope(), null, null, new C98522(uris, this, null), 3, null);
    }

    public final File getCanonicalFile(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        File fileStreamPath = this.context.getFileStreamPath(name);
        Intrinsics.checkNotNullExpressionValue(fileStreamPath, "getFileStreamPath(...)");
        return fileStreamPath;
    }

    public final File getCacheFileByKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        sanitizeCache();
        CacheEntity cacheEntity = this.cacheMap.get(key);
        if (cacheEntity != null) {
            return cacheEntity.getFile();
        }
        return null;
    }

    private final String getNextCacheFileName() {
        if (this.nameSeeder.get() < 0) {
            this.nameSeeder.set(0);
        }
        return this.nameSeeds.get(this.nameSeeder.getAndIncrement() % this.nameSeeds.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ByteString encrypt(Bitmap bitmap) {
        return this.vault.encrypt(ByteString.Companion.of$default(ByteString.INSTANCE, Bitmaps4.getAsByteArray(bitmap), 0, 0, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap decrypt(ByteString encryptedByteString) {
        return Bitmaps4.getToBitmap(this.vault.decrypt(encryptedByteString).toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addToCache(String key, File file) {
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        CacheEntity cacheEntity = new CacheEntity(key, instantNow, file);
        this.cacheMap.put(key, cacheEntity);
        this.lruMap.add(cacheEntity);
        sanitizeCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sanitizeCache() {
        while (this.lruMap.size() > this.nameSeeds.size()) {
            CacheEntity cacheEntityPoll = this.lruMap.poll();
            if (cacheEntityPoll != null) {
                this.cacheMap.remove(cacheEntityPoll.getFile().getName());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, CacheEntity> entry : this.cacheMap.entrySet()) {
            String key = entry.getKey();
            if (!entry.getValue().getFile().exists()) {
                arrayList.add(key);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.cacheMap.remove((String) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BitmapStore.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/bitmap/BitmapStore$CacheEntity;", "", "", "key", "j$/time/Instant", "updatedAt", "Ljava/io/File;", "file", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/io/File;)V", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/io/File;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/io/File;)Lcom/robinhood/android/bitmap/BitmapStore$CacheEntity;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Lj$/time/Instant;", "getUpdatedAt", "Ljava/io/File;", "getFile", "lib-store-bitmap_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class CacheEntity {
        private final File file;
        private final String key;
        private final Instant updatedAt;

        public static /* synthetic */ CacheEntity copy$default(CacheEntity cacheEntity, String str, Instant instant, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cacheEntity.key;
            }
            if ((i & 2) != 0) {
                instant = cacheEntity.updatedAt;
            }
            if ((i & 4) != 0) {
                file = cacheEntity.file;
            }
            return cacheEntity.copy(str, instant, file);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getUpdatedAt() {
            return this.updatedAt;
        }

        /* renamed from: component3, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        public final CacheEntity copy(String key, Instant updatedAt, File file) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
            Intrinsics.checkNotNullParameter(file, "file");
            return new CacheEntity(key, updatedAt, file);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheEntity)) {
                return false;
            }
            CacheEntity cacheEntity = (CacheEntity) other;
            return Intrinsics.areEqual(this.key, cacheEntity.key) && Intrinsics.areEqual(this.updatedAt, cacheEntity.updatedAt) && Intrinsics.areEqual(this.file, cacheEntity.file);
        }

        public int hashCode() {
            return (((this.key.hashCode() * 31) + this.updatedAt.hashCode()) * 31) + this.file.hashCode();
        }

        public String toString() {
            return "CacheEntity(key=" + this.key + ", updatedAt=" + this.updatedAt + ", file=" + this.file + ")";
        }

        public CacheEntity(String key, Instant updatedAt, File file) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
            Intrinsics.checkNotNullParameter(file, "file");
            this.key = key;
            this.updatedAt = updatedAt;
            this.file = file;
        }

        public final String getKey() {
            return this.key;
        }

        public final Instant getUpdatedAt() {
            return this.updatedAt;
        }

        public final File getFile() {
            return this.file;
        }
    }
}
