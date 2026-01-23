package com.robinhood.shared.common.store.media;

import android.graphics.Bitmap;
import com.robinhood.api.retrofit.MediaApi;
import com.robinhood.models.api.media.ApiMediaMetadata;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Bitmaps4;
import com.robinhood.utils.http.MediaTypes;
import dispatch.core.Suspend;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: MediaStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ&\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/common/store/media/MediaStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "mediaApi", "Lcom/robinhood/api/retrofit/MediaApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/retrofit/MediaApi;)V", "uploadImage", "Lcom/robinhood/models/api/media/ApiMediaMetadata;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filename", "", "bytes", "", "mediaType", "Lokhttp3/MediaType;", "(Ljava/lang/String;[BLokhttp3/MediaType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-store-media_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class MediaStore extends Store {
    private static final String FILE_NAME = "file.png";
    private final MediaApi mediaApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStore(StoreBundle storeBundle, MediaApi mediaApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(mediaApi, "mediaApi");
        this.mediaApi = mediaApi;
    }

    /* compiled from: MediaStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/media/ApiMediaMetadata;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.store.media.MediaStore$uploadImage$2", m3645f = "MediaStore.kt", m3646l = {24}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.store.media.MediaStore$uploadImage$2 */
    static final class C374922 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMediaMetadata>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374922(Bitmap bitmap, Continuation<? super C374922> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MediaStore.this.new C374922(this.$bitmap, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMediaMetadata> continuation) {
            return ((C374922) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            MediaStore mediaStore = MediaStore.this;
            byte[] asByteArray = Bitmaps4.getAsByteArray(this.$bitmap);
            MediaType png = MediaTypes.INSTANCE.getPNG();
            this.label = 1;
            Object objUploadImage = mediaStore.uploadImage(MediaStore.FILE_NAME, asByteArray, png, this);
            return objUploadImage == coroutine_suspended ? coroutine_suspended : objUploadImage;
        }
    }

    public final Object uploadImage(Bitmap bitmap, Continuation<? super ApiMediaMetadata> continuation) {
        return Suspend.withIO$default(null, new C374922(bitmap, null), continuation, 1, null);
    }

    /* compiled from: MediaStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/media/ApiMediaMetadata;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.store.media.MediaStore$uploadImage$4", m3645f = "MediaStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.store.media.MediaStore$uploadImage$4 */
    static final class C374934 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMediaMetadata>, Object> {
        final /* synthetic */ byte[] $bytes;
        final /* synthetic */ String $filename;
        final /* synthetic */ MediaType $mediaType;
        int label;
        final /* synthetic */ MediaStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374934(MediaType mediaType, String str, byte[] bArr, MediaStore mediaStore, Continuation<? super C374934> continuation) {
            super(2, continuation);
            this.$mediaType = mediaType;
            this.$filename = str;
            this.$bytes = bArr;
            this.this$0 = mediaStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C374934(this.$mediaType, this.$filename, this.$bytes, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMediaMetadata> continuation) {
            return ((C374934) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            MediaType mediaType = this.$mediaType;
            MediaTypes mediaTypes = MediaTypes.INSTANCE;
            if (!Intrinsics.areEqual(mediaType, mediaTypes.getJPEG()) && !Intrinsics.areEqual(this.$mediaType, mediaTypes.getPNG())) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (Intrinsics.areEqual(this.$mediaType, mediaTypes.getJPEG())) {
                if (!StringsKt.endsWith$default(this.$filename, ".jpg", false, 2, (Object) null)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else if (Intrinsics.areEqual(this.$mediaType, mediaTypes.getPNG()) && !StringsKt.endsWith$default(this.$filename, ".png", false, 2, (Object) null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", this.$filename, RequestBody.Companion.create$default(RequestBody.INSTANCE, this.$bytes, this.$mediaType, 0, 0, 6, (Object) null));
            MediaApi mediaApi = this.this$0.mediaApi;
            this.label = 1;
            Object objUploadMedia = mediaApi.uploadMedia(partCreateFormData, this);
            return objUploadMedia == coroutine_suspended ? coroutine_suspended : objUploadMedia;
        }
    }

    public final Object uploadImage(String str, byte[] bArr, MediaType mediaType, Continuation<? super ApiMediaMetadata> continuation) {
        return Suspend.withIO$default(null, new C374934(mediaType, str, bArr, this, null), continuation, 1, null);
    }
}
