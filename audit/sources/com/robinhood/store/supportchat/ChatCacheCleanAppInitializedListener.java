package com.robinhood.store.supportchat;

import android.app.Application;
import com.robinhood.utils.AppInitializedListener;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import dispatch.core.Launch;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatCacheCleanAppInitializedListener.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/supportchat/ChatCacheCleanAppInitializedListener;", "Lcom/robinhood/utils/AppInitializedListener;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "chatCachedImageCleaner", "Lcom/robinhood/store/supportchat/ChatCachedImageCleaner;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/store/supportchat/ChatCachedImageCleaner;)V", "onAppInitialized", "", "app", "Landroid/app/Application;", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ChatCacheCleanAppInitializedListener implements AppInitializedListener {
    private final ChatCachedImageCleaner chatCachedImageCleaner;
    private final CoroutineScope coroutineScope;

    public ChatCacheCleanAppInitializedListener(@RootCoroutineScope CoroutineScope coroutineScope, ChatCachedImageCleaner chatCachedImageCleaner) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(chatCachedImageCleaner, "chatCachedImageCleaner");
        this.coroutineScope = coroutineScope;
        this.chatCachedImageCleaner = chatCachedImageCleaner;
    }

    /* compiled from: ChatCacheCleanAppInitializedListener.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.ChatCacheCleanAppInitializedListener$onAppInitialized$1", m3645f = "ChatCacheCleanAppInitializedListener.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.supportchat.ChatCacheCleanAppInitializedListener$onAppInitialized$1 */
    static final class C415761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Application $app;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C415761(Application application, Continuation<? super C415761> continuation) {
            super(2, continuation);
            this.$app = application;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatCacheCleanAppInitializedListener.this.new C415761(this.$app, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C415761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ChatCacheCleanAppInitializedListener.this.chatCachedImageCleaner.cleanChatImages(this.$app);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.utils.AppInitializedListener
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        Launch.launchIO$default(this.coroutineScope, null, null, new C415761(app, null), 3, null);
    }
}
