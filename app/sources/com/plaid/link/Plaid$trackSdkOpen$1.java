package com.plaid.link;

import com.plaid.internal.AbstractC5894L2;
import com.plaid.internal.C7165o0;
import com.plaid.internal.C7177p3;
import com.plaid.internal.C7195r3;
import com.plaid.internal.C7248x1;
import com.plaid.internal.EnumC7081g;
import com.plaid.internal.InterfaceC5944Q4;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;

@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.plaid.link.Plaid$trackSdkOpen$1", m3645f = "Plaid.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
public final class Plaid$trackSdkOpen$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C7195r3 $workflowAnalytics;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$trackSdkOpen$1(C7195r3 c7195r3, Continuation<? super Plaid$trackSdkOpen$1> continuation) {
        super(2, continuation);
        this.$workflowAnalytics = c7195r3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Plaid$trackSdkOpen$1(this.$workflowAnalytics, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC5944Q4 interfaceC5944Q4 = Plaid.component;
            if (interfaceC5944Q4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("component");
                interfaceC5944Q4 = null;
            }
            C7248x1 c7248x1 = ((C7165o0) interfaceC5944Q4).f3042f.get();
            this.label = 1;
            obj = c7248x1.mo1351a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC5894L2 abstractC5894L2 = (AbstractC5894L2) obj;
        if (abstractC5894L2 instanceof AbstractC5894L2.k) {
            C7195r3 c7195r3 = this.$workflowAnalytics;
            AbstractC5894L2.k kVar = (AbstractC5894L2.k) abstractC5894L2;
            String linkOpenId = kVar.f1496b;
            String webviewFallbackId = kVar.f1501g;
            c7195r3.getClass();
            Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
            Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
            ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEventBuild = C7195r3.m1590a().m1402a(ClientEventOuterClass$ClientEvent.LinkSdkOpen.newBuilder().m1395a(linkOpenId)).build();
            Intrinsics.checkNotNull(clientEventOuterClass$ClientEventBuild);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C7177p3(c7195r3, webviewFallbackId, clientEventOuterClass$ClientEventBuild, null), 3, null);
        } else {
            C7195r3 c7195r32 = this.$workflowAnalytics;
            String linkOpenId2 = abstractC5894L2.mo1234g();
            c7195r32.getClass();
            Intrinsics.checkNotNullParameter(linkOpenId2, "linkOpenId");
            Intrinsics.checkNotNullParameter("", "webviewFallbackId");
            ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEventBuild2 = C7195r3.m1590a().m1402a(ClientEventOuterClass$ClientEvent.LinkSdkOpen.newBuilder().m1395a(linkOpenId2)).build();
            Intrinsics.checkNotNull(clientEventOuterClass$ClientEventBuild2);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C7177p3(c7195r32, "", clientEventOuterClass$ClientEventBuild2, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Plaid$trackSdkOpen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
