package com.robinhood.contentful.render;

import android.net.Uri;
import com.robinhood.android.markdown.elements.MeasuredImage;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ImageDetail;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.utils.extensions.HttpUrl2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okio.Source;

/* compiled from: ImageAssetRenderer.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/contentful/render/ImageAssetRenderer;", "Lcom/robinhood/contentful/render/AssetRenderer;", "Lcom/robinhood/contentful/model/ImageDetail;", "repository", "Lcom/robinhood/contentful/repository/ContentRepository;", "<init>", "(Lcom/robinhood/contentful/repository/ContentRepository;)V", "matches", "", "mediaType", "Lokhttp3/MediaType;", "render", "Lcom/robinhood/android/markdown/elements/MeasuredImage;", "asset", "Lcom/robinhood/contentful/model/AssetResource;", "source", "Lokio/Source;", "(Lcom/robinhood/contentful/model/AssetResource;Lokio/Source;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ImageAssetRenderer implements AssetRenderer<ImageDetail> {
    private final ContentRepository repository;

    /* compiled from: ImageAssetRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.render.ImageAssetRenderer", m3645f = "ImageAssetRenderer.kt", m3646l = {26}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.render.ImageAssetRenderer$render$1 */
    static final class C327521 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C327521(Continuation<? super C327521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImageAssetRenderer.this.render(null, null, this);
        }
    }

    public ImageAssetRenderer(ContentRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    @Override // com.robinhood.utils.http.MediaTypeMatcher
    public boolean matches(MediaType mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return Intrinsics.areEqual(mediaType.getType(), "image");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.contentful.render.AssetRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object render(AssetResource<ImageDetail> assetResource, Source source, Continuation<? super MeasuredImage> continuation) {
        C327521 c327521;
        AssetResource.Content content;
        AssetResource.File file;
        ImageDetail imageDetail;
        if (continuation instanceof C327521) {
            c327521 = (C327521) continuation;
            int i = c327521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327521.label = i - Integer.MIN_VALUE;
            } else {
                c327521 = new C327521(continuation);
            }
        }
        C327521 c3275212 = c327521;
        Object uri$default = c3275212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3275212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(uri$default);
            AssetResource.Content content2 = assetResource.getContent();
            AssetResource.File file2 = content2.getFile();
            ImageDetail imageDetail2 = (ImageDetail) file2.getDetails();
            ContentRepository contentRepository = this.repository;
            c3275212.L$0 = content2;
            c3275212.L$1 = file2;
            c3275212.L$2 = imageDetail2;
            c3275212.label = 1;
            uri$default = ContentRepository.DefaultImpls.getUri$default(contentRepository, file2, null, c3275212, 2, null);
            if (uri$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            content = content2;
            file = file2;
            imageDetail = imageDetail2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            imageDetail = (ImageDetail) c3275212.L$2;
            file = (AssetResource.File) c3275212.L$1;
            content = (AssetResource.Content) c3275212.L$0;
            ResultKt.throwOnFailure(uri$default);
        }
        Uri androidUri = (Uri) uri$default;
        if (androidUri == null) {
            androidUri = HttpUrl2.toAndroidUri(file.getUrl());
        }
        return new MeasuredImage(imageDetail.getDimensions(), content.getTitle(), androidUri);
    }

    public String toString() {
        return ImageAssetRenderer.class.getSimpleName() + "(image/*)";
    }
}
