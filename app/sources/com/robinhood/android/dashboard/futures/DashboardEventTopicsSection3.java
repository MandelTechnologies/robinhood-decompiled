package com.robinhood.android.dashboard.futures;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.contracts.HubNavigateUtils2;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DashboardEventTopicsSection.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.DashboardEventTopicsSectionKt$EventTopicCountRow$1$1$1", m3645f = "DashboardEventTopicsSection.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.futures.DashboardEventTopicsSectionKt$EventTopicCountRow$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DashboardEventTopicsSection3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $entryPoint;
    final /* synthetic */ Navigator $navigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardEventTopicsSection3(Navigator navigator, Context context, String str, Continuation<? super DashboardEventTopicsSection3> continuation) {
        super(2, continuation);
        this.$navigator = navigator;
        this.$context = context;
        this.$entryPoint = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardEventTopicsSection3(this.$navigator, this.$context, this.$entryPoint, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DashboardEventTopicsSection3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Navigator navigator = this.$navigator;
            Context context = this.$context;
            String str = this.$entryPoint;
            this.label = 1;
            if (HubNavigateUtils2.navigateToEcHub(navigator, context, str, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
