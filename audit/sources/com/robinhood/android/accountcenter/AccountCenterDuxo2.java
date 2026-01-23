package com.robinhood.android.accountcenter;

import android.graphics.Bitmap;
import com.robinhood.models.api.media.ApiMediaMetadata;
import com.robinhood.shared.common.store.media.MediaStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountCenterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/media/ApiMediaMetadata;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.accountcenter.AccountCenterDuxo$updatePictureToMediaStore$uploadImageSingle$1", m3645f = "AccountCenterDuxo.kt", m3646l = {188}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.accountcenter.AccountCenterDuxo$updatePictureToMediaStore$uploadImageSingle$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountCenterDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMediaMetadata>, Object> {
    final /* synthetic */ Bitmap $profilePictureLocal;
    int label;
    final /* synthetic */ AccountCenterDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountCenterDuxo2(AccountCenterDuxo accountCenterDuxo, Bitmap bitmap, Continuation<? super AccountCenterDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = accountCenterDuxo;
        this.$profilePictureLocal = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountCenterDuxo2(this.this$0, this.$profilePictureLocal, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMediaMetadata> continuation) {
        return ((AccountCenterDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        MediaStore mediaStore = this.this$0.mediaStore;
        Bitmap bitmap = this.$profilePictureLocal;
        this.label = 1;
        Object objUploadImage = mediaStore.uploadImage(bitmap, this);
        return objUploadImage == coroutine_suspended ? coroutine_suspended : objUploadImage;
    }
}
