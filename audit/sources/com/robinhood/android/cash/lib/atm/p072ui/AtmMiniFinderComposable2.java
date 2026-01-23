package com.robinhood.android.cash.lib.atm.p072ui;

import com.google.accompanist.permissions.MultiplePermissionsState;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtil2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AtmMiniFinderComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$AtmMiniFinder$1$1", m3645f = "AtmMiniFinderComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$AtmMiniFinder$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AtmMiniFinderComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MultiplePermissionsState $locationPermissionState;
    final /* synthetic */ Function1<Boolean, Unit> $onLocationPermissionStatus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AtmMiniFinderComposable2(Function1<? super Boolean, Unit> function1, MultiplePermissionsState multiplePermissionsState, Continuation<? super AtmMiniFinderComposable2> continuation) {
        super(2, continuation);
        this.$onLocationPermissionStatus = function1;
        this.$locationPermissionState = multiplePermissionsState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AtmMiniFinderComposable2(this.$onLocationPermissionStatus, this.$locationPermissionState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AtmMiniFinderComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<Boolean, Unit> function1 = this.$onLocationPermissionStatus;
        List<PermissionState> permissions = this.$locationPermissionState.getPermissions();
        boolean z = false;
        if (!(permissions instanceof Collection) || !permissions.isEmpty()) {
            Iterator<T> it = permissions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (PermissionsUtil2.isGranted(((PermissionState) it.next()).getStatus())) {
                    z = true;
                    break;
                }
            }
        }
        function1.invoke(boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }
}
