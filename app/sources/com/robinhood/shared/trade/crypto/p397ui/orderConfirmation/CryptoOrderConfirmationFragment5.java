package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import android.content.Context;
import android.net.Uri;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: CryptoOrderConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$handleEvent$1$1", m3645f = "CryptoOrderConfirmationFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$handleEvent$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderConfirmationFragment5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoOrderConfirmationEvent.Close $data;
    final /* synthetic */ CryptoOrderConfirmationEvent.Close $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoOrderConfirmationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderConfirmationFragment5(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, CryptoOrderConfirmationEvent.Close close, CryptoOrderConfirmationEvent.Close close2, Continuation<? super CryptoOrderConfirmationFragment5> continuation) {
        super(2, continuation);
        this.this$0 = cryptoOrderConfirmationFragment;
        this.$data = close;
        this.$it = close2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderConfirmationFragment5 cryptoOrderConfirmationFragment5 = new CryptoOrderConfirmationFragment5(this.this$0, this.$data, this.$it, continuation);
        cryptoOrderConfirmationFragment5.L$0 = obj;
        return cryptoOrderConfirmationFragment5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoOrderConfirmationFragment5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CryptoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$handleEvent$1$1$1", m3645f = "CryptoOrderConfirmationFragment.kt", m3646l = {363}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$handleEvent$1$1$1 */
    static final class C403651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CryptoOrderConfirmationEvent.Close $data;
        final /* synthetic */ CryptoOrderConfirmationEvent.Close $it;
        int label;
        final /* synthetic */ CryptoOrderConfirmationFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C403651(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, CryptoOrderConfirmationEvent.Close close, CryptoOrderConfirmationEvent.Close close2, Continuation<? super C403651> continuation) {
            super(2, continuation);
            this.this$0 = cryptoOrderConfirmationFragment;
            this.$data = close;
            this.$it = close2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C403651(this.this$0, this.$data, this.$it, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C403651 c403651;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Uri uri = Uri.parse(((CryptoOrderConfirmationEvent.Close.Deeplink) this.$data).getDeeplinkUri());
                this.label = 1;
                c403651 = this;
                if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, contextRequireContext, uri, false, false, null, c403651, 28, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c403651 = this;
            }
            c403651.this$0.getCallbacks().onOrderFlowFinished(((CryptoOrderConfirmationEvent.Close.Deeplink) c403651.$it).getIsOrderFilled());
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C403651(this.this$0, this.$data, this.$it, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C403662(this.this$0, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: CryptoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$handleEvent$1$1$2", m3645f = "CryptoOrderConfirmationFragment.kt", m3646l = {367}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$handleEvent$1$1$2 */
    static final class C403662 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CryptoOrderConfirmationFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C403662(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, Continuation<? super C403662> continuation) {
            super(2, continuation);
            this.this$0 = cryptoOrderConfirmationFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C403662(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403662) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.getDuxo().setPrimaryButtonLoading();
            return Unit.INSTANCE;
        }
    }
}
