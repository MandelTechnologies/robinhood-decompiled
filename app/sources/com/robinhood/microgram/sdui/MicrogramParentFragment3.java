package com.robinhood.microgram.sdui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.microgramsdui.control.UiInitializer;
import com.robinhood.android.shared.serverui.utils.UiObject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import microgram.p507ui.p508v1.InitialScreenDataDto;

/* compiled from: MicrogramParentFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u0004*\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/InitialScreenData;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "Lcom/robinhood/microgram/sdui/AnyInitialScreenData;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramAppUtilsViewModel$initialScreenDataAsync$1", m3645f = "MicrogramParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.microgram.sdui.MicrogramAppUtilsViewModel$initialScreenDataAsync$1, reason: use source file name */
/* loaded from: classes13.dex */
final class MicrogramParentFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiObject<? extends InitialScreenData, ? extends InitialScreenDataDto>>, Object> {
    int label;
    final /* synthetic */ MicrogramParentFragment2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MicrogramParentFragment3(MicrogramParentFragment2 microgramParentFragment2, Continuation<? super MicrogramParentFragment3> continuation) {
        super(2, continuation);
        this.this$0 = microgramParentFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MicrogramParentFragment3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super UiObject<? extends InitialScreenData, ? extends InitialScreenDataDto>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super UiObject<InitialScreenData, InitialScreenDataDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super UiObject<InitialScreenData, InitialScreenDataDto>> continuation) {
        return ((MicrogramParentFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UiInitializer uiInitializer = UiInitializer.INSTANCE.getUiInitializer(this.this$0.getInstance().getComponent());
        String deeplink = this.this$0.key.getDeeplink();
        this.label = 1;
        Object objStartRouter = uiInitializer.startRouter(deeplink, this);
        return objStartRouter == coroutine_suspended ? coroutine_suspended : objStartRouter;
    }
}
