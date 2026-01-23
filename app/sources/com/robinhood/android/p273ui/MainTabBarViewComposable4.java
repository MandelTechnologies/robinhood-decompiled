package com.robinhood.android.p273ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.compose.bento.component.BentoTabBarState;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainTabBarViewComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarViewComposableKt$MainTabBarComposable$2$1", m3645f = "MainTabBarViewComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.ui.MainTabBarViewComposableKt$MainTabBarComposable$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class MainTabBarViewComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ ImmutableList<BentoTabBarState.Tab> $tabs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MainTabBarViewComposable4(ImmutableList<? extends BentoTabBarState.Tab> immutableList, EventLogger eventLogger, Continuation<? super MainTabBarViewComposable4> continuation) {
        super(2, continuation);
        this.$tabs = immutableList;
        this.$eventLogger = eventLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainTabBarViewComposable4(this.$tabs, this.$eventLogger, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainTabBarViewComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ImmutableList<BentoTabBarState.Tab> immutableList = this.$tabs;
        EventLogger eventLogger = this.$eventLogger;
        Iterator<BentoTabBarState.Tab> it = immutableList.iterator();
        while (it.hasNext()) {
            EventLogger.DefaultImpls.logAppear$default(eventLogger, null, null, new Component(Component.ComponentType.TAB, it.next().getAnalyticsTabName(), null, 4, null), null, null, 27, null);
        }
        return Unit.INSTANCE;
    }
}
