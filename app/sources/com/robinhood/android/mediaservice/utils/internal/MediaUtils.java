package com.robinhood.android.mediaservice.utils.internal;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.Intents;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxSingle2;

/* compiled from: MediaUtils.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\rJ;\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0016J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J\u0015\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010%\u001a\u00020!J$\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0006\u0010'\u001a\u00020$J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001c0)2\u0006\u0010\u0014\u001a\u00020\tJ\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110)2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190)0\u000f2\u0006\u0010\u0014\u001a\u00020\tJ6\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190)0\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J \u0010-\u001a\b\u0012\u0004\u0012\u00020!0)2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J#\u0010.\u001a\u00020\u001f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110)2\u0006\u00100\u001a\u00020\tH\u0000¢\u0006\u0002\b1R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;", "", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lcom/robinhood/android/bitmap/BitmapStore;Lcom/robinhood/coroutines/rx/RxFactory;)V", "getImagePickerIntent", "Landroid/content/Intent;", "allowMultiple", "", "supportHeic", "getImagePickerIntent$lib_media_service_externalDebug", "saveImagesToDisk", "Lio/reactivex/Single;", "", "", "context", "Landroid/content/Context;", WebsocketGatewayConstants.DATA_KEY, "applyExifRotation", "saveImagesToDisk$lib_media_service_externalDebug", "saveImageToDisk", "image", "Landroid/graphics/Bitmap;", "saveImageToDisk$lib_media_service_externalDebug", "saveBitmapSingle", "Ljava/io/File;", "bitmap", "deleteImageFromDisk", "", "uri", "Landroid/net/Uri;", "deleteImageFromDisk$lib_media_service_externalDebug", "getFileSizeFromContentUri", "", "fileUri", "checkFileSize", "sizeLimit", "extractCanonicalFilesFromData", "", "extractImageFileNamesFromData", "extractAndDeleteImagesFromResultIntent", "extractImageBitmapsFromData", "extractImageUrisFromData", "putImageFileNamesToIntent", "imageFileNames", "intent", "putImageFileNamesToIntent$lib_media_service_externalDebug", "Companion", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MediaUtils {
    private static final String EXTRA_FILE_NAMES = "processedImageFileNames";
    private final BitmapStore bitmapStore;
    private final RxFactory rxFactory;
    public static final int $stable = 8;

    public MediaUtils(BitmapStore bitmapStore, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.bitmapStore = bitmapStore;
        this.rxFactory = rxFactory;
    }

    public final Intent getImagePickerIntent$lib_media_service_externalDebug(boolean allowMultiple, boolean supportHeic) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        List listMutableListOf = CollectionsKt.mutableListOf("image/jpeg", "image/png");
        if (supportHeic) {
            listMutableListOf.add("image/heic");
        }
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) listMutableListOf.toArray(new String[0]));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", allowMultiple);
        intent.setType("image/*");
        return intent;
    }

    public static /* synthetic */ Single saveImagesToDisk$lib_media_service_externalDebug$default(MediaUtils mediaUtils, Context context, Intent intent, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        return mediaUtils.saveImagesToDisk$lib_media_service_externalDebug(context, intent, z, z2);
    }

    public final Single<List<String>> saveImagesToDisk$lib_media_service_externalDebug(Context context, Intent data, boolean allowMultiple, boolean applyExifRotation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Single singleFlatMap = extractImageBitmapsFromData(context, data, allowMultiple, applyExifRotation).subscribeOn(Schedulers.m3346io()).flatMap(new Function() { // from class: com.robinhood.android.mediaservice.utils.internal.MediaUtils$saveImagesToDisk$1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends List<String>> apply(List<Bitmap> bitmaps) {
                Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
                Observable observableFromIterable = Observable.fromIterable(bitmaps);
                final MediaUtils mediaUtils = this.this$0;
                return observableFromIterable.concatMapSingle(new Function() { // from class: com.robinhood.android.mediaservice.utils.internal.MediaUtils$saveImagesToDisk$1.1
                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends String> apply(Bitmap bitmap) {
                        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                        return mediaUtils.saveBitmapSingle(bitmap).map(new Function() { // from class: com.robinhood.android.mediaservice.utils.internal.MediaUtils.saveImagesToDisk.1.1.1
                            @Override // io.reactivex.functions.Function
                            public final String apply(File it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return it.getName();
                            }
                        });
                    }
                }).toList();
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final Single<String> saveImageToDisk$lib_media_service_externalDebug(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Single map = saveBitmapSingle(image).map(new Function() { // from class: com.robinhood.android.mediaservice.utils.internal.MediaUtils$saveImageToDisk$1
            @Override // io.reactivex.functions.Function
            public final String apply(File it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getName();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: MediaUtils.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mediaservice.utils.internal.MediaUtils$saveBitmapSingle$1", m3645f = "MediaUtils.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mediaservice.utils.internal.MediaUtils$saveBitmapSingle$1 */
    static final class C218021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218021(Bitmap bitmap, Continuation<? super C218021> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MediaUtils.this.new C218021(this.$bitmap, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((C218021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BitmapStore bitmapStore = MediaUtils.this.bitmapStore;
                Bitmap bitmap = this.$bitmap;
                this.label = 1;
                obj = bitmapStore.saveBitmapToDisk(bitmap, this);
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
            if (file != null) {
                return file;
            }
            throw new IOException("Failed to save bitmap to disk");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<File> saveBitmapSingle(Bitmap bitmap) {
        return RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new C218021(bitmap, null), 1, null);
    }

    public final void deleteImageFromDisk$lib_media_service_externalDebug(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.bitmapStore.deleteBitmapsFromDisk(uri);
    }

    public final Single<Long> getFileSizeFromContentUri(final Context context, final Uri fileUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        Single<Long> singleFromCallable = Single.fromCallable(new Callable() { // from class: com.robinhood.android.mediaservice.utils.internal.MediaUtils.getFileSizeFromContentUri.1
            @Override // java.util.concurrent.Callable
            public final Long call() {
                Cursor cursorQuery = context.getContentResolver().query(fileUri, null, null, null, null);
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    Long lValueOf = Long.valueOf(cursorQuery.moveToFirst() ? cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size")) : 0L);
                    Closeable.closeFinally(cursorQuery, null);
                    return lValueOf;
                } finally {
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFromCallable, "fromCallable(...)");
        return singleFromCallable;
    }

    public final Single<Boolean> checkFileSize(Context context, Uri uri, final long sizeLimit) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Single<Boolean> singleSubscribeOn = getFileSizeFromContentUri(context, uri).map(new Function() { // from class: com.robinhood.android.mediaservice.utils.internal.MediaUtils.checkFileSize.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.longValue() < sizeLimit);
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    public final List<File> extractCanonicalFilesFromData(Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList<String> stringArrayListExtra = data.getStringArrayListExtra(EXTRA_FILE_NAMES);
        if (stringArrayListExtra == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stringArrayListExtra, 10));
        for (String str : stringArrayListExtra) {
            BitmapStore bitmapStore = this.bitmapStore;
            Intrinsics.checkNotNull(str);
            arrayList.add(bitmapStore.getCanonicalFile(str));
        }
        return arrayList;
    }

    private final List<String> extractImageFileNamesFromData(Intent data) {
        ArrayList<String> stringArrayListExtra = data.getStringArrayListExtra(EXTRA_FILE_NAMES);
        return stringArrayListExtra != null ? stringArrayListExtra : CollectionsKt.emptyList();
    }

    public final Single<List<Bitmap>> extractAndDeleteImagesFromResultIntent(Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final List<String> listExtractImageFileNamesFromData = extractImageFileNamesFromData(data);
        Single<List<Bitmap>> singleDoOnSuccess = Observable.fromIterable(listExtractImageFileNamesFromData).subscribeOn(Schedulers.m3346io()).concatMapSingle(new Function() { // from class: com.robinhood.android.mediaservice.utils.internal.MediaUtils.extractAndDeleteImagesFromResultIntent.1

            /* compiled from: MediaUtils.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mediaservice.utils.internal.MediaUtils$extractAndDeleteImagesFromResultIntent$1$1", m3645f = "MediaUtils.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mediaservice.utils.internal.MediaUtils$extractAndDeleteImagesFromResultIntent$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
                final /* synthetic */ String $fileName;
                int label;
                final /* synthetic */ MediaUtils this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MediaUtils mediaUtils, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = mediaUtils;
                    this.$fileName = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$fileName, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        BitmapStore bitmapStore = this.this$0.bitmapStore;
                        String str = this.$fileName;
                        Intrinsics.checkNotNull(str);
                        this.label = 1;
                        obj = bitmapStore.readBitmapFromDisk(str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        return bitmap;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Bitmap> apply(String fileName) {
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                return RxSingle2.rxSingle$default(null, new AnonymousClass1(MediaUtils.this, fileName, null), 1, null).map(new Function() { // from class: com.robinhood.android.mediaservice.utils.internal.MediaUtils.extractAndDeleteImagesFromResultIntent.1.2
                    @Override // io.reactivex.functions.Function
                    public final Bitmap apply(Bitmap bitmap) {
                        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                        return bitmap;
                    }
                });
            }
        }).toList().doOnSuccess(new Consumer() { // from class: com.robinhood.android.mediaservice.utils.internal.MediaUtils.extractAndDeleteImagesFromResultIntent.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(List<Bitmap> list) {
                BitmapStore bitmapStore = MediaUtils.this.bitmapStore;
                String[] strArr = (String[]) listExtractImageFileNamesFromData.toArray(new String[0]);
                bitmapStore.deleteBitmapsFromDisk((String[]) Arrays.copyOf(strArr, strArr.length));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
        return singleDoOnSuccess;
    }

    private final Single<List<Bitmap>> extractImageBitmapsFromData(final Context context, Intent data, boolean allowMultiple, final boolean applyExifRotation) {
        final List<Uri> listExtractImageUrisFromData = extractImageUrisFromData(data, allowMultiple);
        Single<List<Bitmap>> singleFromCallable = Single.fromCallable(new Callable() { // from class: com.robinhood.android.mediaservice.utils.internal.MediaUtils.extractImageBitmapsFromData.1
            @Override // java.util.concurrent.Callable
            public final List<Bitmap> call() {
                Integer numValueOf;
                InputStream inputStreamOpenInputStream;
                List<Uri> list = listExtractImageUrisFromData;
                boolean z = applyExifRotation;
                Context context2 = context;
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list) {
                    if (!z || (inputStreamOpenInputStream = context2.getContentResolver().openInputStream(uri)) == null) {
                        numValueOf = null;
                    } else {
                        try {
                            int attributeInt = new ExifInterface(inputStreamOpenInputStream).getAttributeInt("Orientation", 1);
                            numValueOf = Integer.valueOf(attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE : 90 : EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
                            Closeable.closeFinally(inputStreamOpenInputStream, null);
                        } finally {
                        }
                    }
                    Bitmap bitmapFromContentUri$default = ContextsUiExtensions.getBitmapFromContentUri$default(context2, uri, 0L, numValueOf, 2, null);
                    if (bitmapFromContentUri$default != null) {
                        arrayList.add(bitmapFromContentUri$default);
                    }
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFromCallable, "fromCallable(...)");
        return singleFromCallable;
    }

    private final List<Uri> extractImageUrisFromData(Intent data, boolean allowMultiple) {
        if (allowMultiple) {
            ArrayList arrayList = new ArrayList();
            ClipData clipData = data != null ? data.getClipData() : null;
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    Uri uri = clipData.getItemAt(i).getUri();
                    Intrinsics.checkNotNullExpressionValue(uri, "getUri(...)");
                    arrayList.add(uri);
                }
            }
            return arrayList;
        }
        if ((data != null ? data.getData() : null) == null) {
            return CollectionsKt.emptyList();
        }
        Uri data2 = data.getData();
        Intrinsics.checkNotNull(data2);
        return CollectionsKt.listOf(data2);
    }

    public final void putImageFileNamesToIntent$lib_media_service_externalDebug(List<String> imageFileNames, Intent intent) {
        Intrinsics.checkNotNullParameter(imageFileNames, "imageFileNames");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intents.putStringListExtra(intent, EXTRA_FILE_NAMES, imageFileNames);
    }
}
