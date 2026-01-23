package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ImageRepository.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.views.ImageRepository$getImage$2", m3645f = "ImageRepository.kt", m3646l = {33}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.stripe.android.stripe3ds2.views.ImageRepository$getImage$2, reason: use source file name */
/* loaded from: classes26.dex */
final class ImageRepository3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ String $imageUrl;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImageRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageRepository3(String str, ImageRepository imageRepository, Continuation<? super ImageRepository3> continuation) {
        super(2, continuation);
        this.$imageUrl = str;
        this.this$0 = imageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageRepository3(this.$imageUrl, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((ImageRepository3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ImageRepository imageRepository;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = this.$imageUrl;
            if (str2 == null) {
                return null;
            }
            imageRepository = this.this$0;
            Bitmap localImage = imageRepository.getLocalImage(str2);
            if (localImage != null) {
                return localImage;
            }
            this.L$0 = imageRepository;
            this.L$1 = str2;
            this.label = 1;
            Object remoteImage = imageRepository.getRemoteImage(str2, this);
            if (remoteImage == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
            obj = remoteImage;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            imageRepository = (ImageRepository) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        imageRepository.cacheImage(str, bitmap);
        return bitmap;
    }
}
