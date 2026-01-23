package com.robinhood.shared.security.authmanager;

import android.content.SharedPreferences;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Dispatcher;

/* compiled from: RealAuthManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$logoutLocal$3", m3645f = "RealAuthManager.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$logoutLocal$3, reason: use source file name */
/* loaded from: classes6.dex */
final class RealAuthManager4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ RealAuthManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealAuthManager4(RealAuthManager realAuthManager, Continuation<? super RealAuthManager4> continuation) {
        super(2, continuation);
        this.this$0 = realAuthManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealAuthManager4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((RealAuthManager4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.getDbHelper().get().closeAndDeleteDbs(this.this$0.getContext());
        SharedPreferences sharedPreferences = this.this$0.getUserPrefs().get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.apply();
        this.this$0.getBranchManager().get().logout();
        this.this$0.getChatCachedImageCleaner().get().cleanChatImages(this.this$0.getContext());
        Dispatcher dispatcher = this.this$0.getOkHttpDispatcher().get();
        Intrinsics.checkNotNullExpressionValue(dispatcher, "get(...)");
        Dispatcher dispatcher2 = dispatcher;
        dispatcher2.cancelAll();
        ExecutorService executorService = dispatcher2.executorService();
        executorService.shutdown();
        this.this$0.getOkHttpConnectionPool().get().evictAll();
        try {
            this.this$0.getOkHttpCache().get().delete();
        } catch (IOException unused) {
        }
        return boxing.boxBoolean(executorService.awaitTermination(10L, TimeUnit.SECONDS));
    }
}
