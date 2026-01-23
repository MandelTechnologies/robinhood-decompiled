package com.salesforce.android.smi.core.internal.data.repository;

import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FileRepository.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.FileRepository$read$2$1$1", m3645f = "FileRepository.kt", m3646l = {42}, m3647m = "invokeSuspend")
/* renamed from: com.salesforce.android.smi.core.internal.data.repository.FileRepository$read$2$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FileRepository2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends File>>, Object> {
    final /* synthetic */ boolean $forceRefresh;
    final /* synthetic */ FileAsset $it;
    int label;
    final /* synthetic */ FileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileRepository2(FileRepository fileRepository, FileAsset fileAsset, boolean z, Continuation<? super FileRepository2> continuation) {
        super(2, continuation);
        this.this$0 = fileRepository;
        this.$it = fileAsset;
        this.$forceRefresh = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileRepository2(this.this$0, this.$it, this.$forceRefresh, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends File>> continuation) {
        return ((FileRepository2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        FileRepository fileRepository = this.this$0;
        FileAsset fileAsset = this.$it;
        boolean z = this.$forceRefresh;
        this.label = 1;
        Object obj2 = fileRepository.read(fileAsset, z, this);
        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
    }
}
