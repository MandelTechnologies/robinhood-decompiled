package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.views.ImageRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ImageRepository.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default", m3645f = "ImageRepository.kt", m3646l = {60}, m3647m = "getBitmap")
/* renamed from: com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default$getBitmap$1, reason: use source file name */
/* loaded from: classes26.dex */
final class ImageRepository2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageRepository.ImageSupplier.Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageRepository2(ImageRepository.ImageSupplier.Default r1, Continuation<? super ImageRepository2> continuation) {
        super(continuation);
        this.this$0 = r1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getBitmap(null, this);
    }
}
