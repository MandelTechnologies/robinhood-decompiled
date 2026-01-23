package com.robinhood.android.advisory.portfolio.restrictstocks;

import android.content.Context;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RestrictStocksScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$4$1", m3645f = "RestrictStocksScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
final class RestrictStocksScreenKt$RestrictStocksScreen$4$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RestrictStocksDuxo $duxo;
    final /* synthetic */ SnapshotState4<Event<RestrictStocksEvent>> $event$delegate;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RestrictStocksScreenKt$RestrictStocksScreen$4$1(SnapshotState4<Event<RestrictStocksEvent>> snapshotState4, Context context, SnackbarHostState snackbarHostState, RestrictStocksDuxo restrictStocksDuxo, Continuation<? super RestrictStocksScreenKt$RestrictStocksScreen$4$1> continuation) {
        super(2, continuation);
        this.$event$delegate = snapshotState4;
        this.$context = context;
        this.$snackbarHostState = snackbarHostState;
        this.$duxo = restrictStocksDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RestrictStocksScreenKt$RestrictStocksScreen$4$1 restrictStocksScreenKt$RestrictStocksScreen$4$1 = new RestrictStocksScreenKt$RestrictStocksScreen$4$1(this.$event$delegate, this.$context, this.$snackbarHostState, this.$duxo, continuation);
        restrictStocksScreenKt$RestrictStocksScreen$4$1.L$0 = obj;
        return restrictStocksScreenKt$RestrictStocksScreen$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RestrictStocksScreenKt$RestrictStocksScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EventConsumer eventConsumer;
        EventConsumer eventConsumer2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final Event eventRestrictStocksScreen$lambda$1 = RestrictStocksScreenKt.RestrictStocksScreen$lambda$1(this.$event$delegate);
            if (eventRestrictStocksScreen$lambda$1 != null) {
                final Context context = this.$context;
                final SnackbarHostState snackbarHostState = this.$snackbarHostState;
                final RestrictStocksDuxo restrictStocksDuxo = this.$duxo;
                if ((eventRestrictStocksScreen$lambda$1.getData() instanceof RestrictStocksEvent.RestrictionError) && (eventConsumer2 = (EventConsumer) eventRestrictStocksScreen$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumer2.consume(eventRestrictStocksScreen$lambda$1, new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$4$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m11173invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m11173invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RestrictStocksScreenKt$RestrictStocksScreen$4$1$1$1(context, (RestrictStocksEvent.RestrictionError) eventRestrictStocksScreen$lambda$1.getData(), snackbarHostState, restrictStocksDuxo, null), 3, null);
                        }
                    });
                }
            }
            final Event eventRestrictStocksScreen$lambda$12 = RestrictStocksScreenKt.RestrictStocksScreen$lambda$1(this.$event$delegate);
            if (eventRestrictStocksScreen$lambda$12 != null) {
                final Context context2 = this.$context;
                final SnackbarHostState snackbarHostState2 = this.$snackbarHostState;
                if ((eventRestrictStocksScreen$lambda$12.getData() instanceof RestrictStocksEvent.RestrictionSuccess) && (eventConsumer = (EventConsumer) eventRestrictStocksScreen$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(eventRestrictStocksScreen$lambda$12, new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$4$1$invokeSuspend$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m11174invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m11174invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RestrictStocksScreenKt$RestrictStocksScreen$4$1$2$1((RestrictStocksEvent.RestrictionSuccess) eventRestrictStocksScreen$lambda$12.getData(), context2, snackbarHostState2, null), 3, null);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
