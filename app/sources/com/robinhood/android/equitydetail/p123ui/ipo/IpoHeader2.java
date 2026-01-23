package com.robinhood.android.equitydetail.p123ui.ipo;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.bonfire.LottieLoop;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IpoHeader.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.ipo.IpoHeaderKt$Animation$1$1$1", m3645f = "IpoHeader.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitydetail.ui.ipo.IpoHeaderKt$Animation$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class IpoHeader2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LottieAnimatable $animatable;
    final /* synthetic */ LottieCompositionResult $composition$delegate;
    final /* synthetic */ LottieLoop $lottieLoop;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IpoHeader2(LottieCompositionResult lottieCompositionResult, LottieAnimatable lottieAnimatable, LottieLoop lottieLoop, Continuation<? super IpoHeader2> continuation) {
        super(2, continuation);
        this.$composition$delegate = lottieCompositionResult;
        this.$animatable = lottieAnimatable;
        this.$lottieLoop = lottieLoop;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IpoHeader2(this.$composition$delegate, this.$animatable, this.$lottieLoop, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IpoHeader2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.animate$default(r0, r1, 0, Integer.MAX_VALUE, false, 0.0f, r6, 0.0f, false, null, false, false, r18, 2010, null) != r15) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LottieComposition lottieComposition;
        LottieAnimatable lottieAnimatable;
        LottieLoop lottieLoop;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LottieComposition lottieCompositionAnimation$lambda$11$lambda$7 = IpoHeader.Animation$lambda$11$lambda$7(this.$composition$delegate);
            if (lottieCompositionAnimation$lambda$11$lambda$7 != null) {
                LottieAnimatable lottieAnimatable2 = this.$animatable;
                LottieLoop lottieLoop2 = this.$lottieLoop;
                this.L$0 = lottieAnimatable2;
                this.L$1 = lottieLoop2;
                this.L$2 = lottieCompositionAnimation$lambda$11$lambda$7;
                this.label = 1;
                lottieComposition = lottieCompositionAnimation$lambda$11$lambda$7;
                lottieAnimatable = lottieAnimatable2;
                if (LottieAnimatable.DefaultImpls.animate$default(lottieAnimatable, lottieComposition, 0, 0, false, 0.0f, null, 0.0f, false, null, false, false, this, 2046, null) != coroutine_suspended) {
                    lottieLoop = lottieLoop2;
                    if (lottieLoop == null) {
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        LottieComposition lottieComposition2 = (LottieComposition) this.L$2;
        lottieLoop = (LottieLoop) this.L$1;
        LottieAnimatable lottieAnimatable3 = (LottieAnimatable) this.L$0;
        ResultKt.throwOnFailure(obj);
        lottieComposition = lottieComposition2;
        lottieAnimatable = lottieAnimatable3;
        LottieClipSpec.Frame frame = lottieLoop == null ? new LottieClipSpec.Frame(boxing.boxInt(lottieLoop.getBeginFrame()), boxing.boxInt(lottieLoop.getEndFrame()), false, 4, null) : null;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
