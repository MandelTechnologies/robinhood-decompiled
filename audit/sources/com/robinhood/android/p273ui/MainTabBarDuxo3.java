package com.robinhood.android.p273ui;

import com.robinhood.compose.bento.component.BentoTabBarState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MainTabBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$2$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class MainTabBarDuxo3 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
    final /* synthetic */ Boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainTabBarDuxo3(Boolean bool, Continuation<? super MainTabBarDuxo3> continuation) {
        super(2, continuation);
        this.$it = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainTabBarDuxo3 mainTabBarDuxo3 = new MainTabBarDuxo3(this.$it, continuation);
        mainTabBarDuxo3.L$0 = obj;
        return mainTabBarDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
        return ((MainTabBarDuxo3) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BentoTabBarState.BadgeState badgeState;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MainTabBarDataState mainTabBarDataState = (MainTabBarDataState) this.L$0;
        if (this.$it.booleanValue()) {
            badgeState = BentoTabBarState.BadgeState.NORMAL;
        } else {
            badgeState = BentoTabBarState.BadgeState.NONE;
        }
        Map mutableMap = MapsKt.toMutableMap(mainTabBarDataState.getBadges());
        mutableMap.put(BentoTabBarState.Tab.PORTFOLIO, badgeState);
        Unit unit = Unit.INSTANCE;
        return MainTabBarDataState.copy$default(mainTabBarDataState, null, mutableMap, null, null, null, null, false, false, false, false, null, 2045, null);
    }
}
