package com.robinhood.android.transfers.recurring.p270ui.experiment;

import android.content.res.Resources;
import androidx.compose.runtime.SnapshotState;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavHostController;
import com.robinhood.android.navigation.compose.NavControllers;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.transfers.recurring.p270ui.experiment.RecurringDepositHubFragment;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashDestinations8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecurringDepositHubFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment$NavHostComposeContent$1$1$2$4$1", m3645f = "RecurringDepositHubFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment$NavHostComposeContent$1$1$2$4$1, reason: use source file name */
/* loaded from: classes9.dex */
final class RecurringDepositHubFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $didLaunchExtraCashOnStart$delegate;
    final /* synthetic */ NavHostController $navController;
    int label;
    final /* synthetic */ RecurringDepositHubFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecurringDepositHubFragment2(RecurringDepositHubFragment recurringDepositHubFragment, NavHostController navHostController, SnapshotState<Boolean> snapshotState, Continuation<? super RecurringDepositHubFragment2> continuation) {
        super(2, continuation);
        this.this$0 = recurringDepositHubFragment;
        this.$navController = navHostController;
        this.$didLaunchExtraCashOnStart$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringDepositHubFragment2(this.this$0, this.$navController, this.$didLaunchExtraCashOnStart$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringDepositHubFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (((RecurringDepositHubFragment.Args) RecurringDepositHubFragment.INSTANCE.getArgs((Fragment) this.this$0)).getLaunchRecurringExtraCashOnStart() && !RecurringDepositHubFragment.C304671.AnonymousClass1.AnonymousClass2.invoke$lambda$8(this.$didLaunchExtraCashOnStart$delegate)) {
            RecurringDepositHubFragment.C304671.AnonymousClass1.AnonymousClass2.invoke$lambda$9(this.$didLaunchExtraCashOnStart$delegate, true);
            NavControllers.navigate$default(this.$navController, ComposableDestination.composeNav$default(RecurringDepositExtraCashDestinations8.INSTANCE, null, null, 3, null), (Function1) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
