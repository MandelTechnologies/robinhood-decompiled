package com.robinhood.android.navigation.deeplink;

import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.DeepLinkResolver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BaseDeeplinkResolverActivity.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Landroid/content/Intent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity$onCreate$2$intents$1", m3645f = "BaseDeeplinkResolverActivity.kt", m3646l = {144, 144}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity$onCreate$2$intents$1, reason: use source file name */
/* loaded from: classes8.dex */
final class BaseDeeplinkResolverActivity2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Intent[]>, Object> {
    final /* synthetic */ Uri $data;
    final /* synthetic */ DeepLink $deepLink;
    Object L$0;
    int label;
    final /* synthetic */ BaseDeeplinkResolverActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseDeeplinkResolverActivity2(BaseDeeplinkResolverActivity baseDeeplinkResolverActivity, DeepLink deepLink, Uri uri, Continuation<? super BaseDeeplinkResolverActivity2> continuation) {
        super(2, continuation);
        this.this$0 = baseDeeplinkResolverActivity;
        this.$deepLink = deepLink;
        this.$data = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseDeeplinkResolverActivity2(this.this$0, this.$deepLink, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Intent[]> continuation) {
        return ((BaseDeeplinkResolverActivity2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DeepLinkResolver deepLinkResolver;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.loadTimeTrace.start();
            deepLinkResolver = this.this$0.getDeepLinkResolver();
            DeepLinkResolver deepLinkResolver2 = this.this$0.getDeepLinkResolver();
            DeepLink deepLink = this.$deepLink;
            this.L$0 = deepLinkResolver;
            this.label = 1;
            obj = deepLinkResolver2.rerouteExperiment(deepLink, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.loadTimeTrace.stop();
            return ((DeepLink) obj).getGetIntents().invoke(this.this$0, this.$data);
        }
        deepLinkResolver = (DeepLinkResolver) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = null;
        this.label = 2;
        obj = deepLinkResolver.rerouteRegionGate((DeepLink) obj, this);
    }
}
