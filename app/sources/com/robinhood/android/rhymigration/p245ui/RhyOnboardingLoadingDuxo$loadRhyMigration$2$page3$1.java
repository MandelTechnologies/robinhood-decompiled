package com.robinhood.android.rhymigration.p245ui;

import com.robinhood.android.rhymigration.model.UiRhyMigrationFeaturePage;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.rhymigration.RhyMigration;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationFeaturePage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhyOnboardingLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$loadRhyMigration$2$page3$1", m3645f = "RhyOnboardingLoadingDuxo.kt", m3646l = {202}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RhyOnboardingLoadingDuxo$loadRhyMigration$2$page3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiRhyMigrationFeaturePage>, Object> {
    final /* synthetic */ RhyMigration $rhyMigration;
    int label;
    final /* synthetic */ RhyOnboardingLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyOnboardingLoadingDuxo$loadRhyMigration$2$page3$1(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, RhyMigration rhyMigration, Continuation<? super RhyOnboardingLoadingDuxo$loadRhyMigration$2$page3$1> continuation) {
        super(2, continuation);
        this.this$0 = rhyOnboardingLoadingDuxo;
        this.$rhyMigration = rhyMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhyOnboardingLoadingDuxo$loadRhyMigration$2$page3$1(this.this$0, this.$rhyMigration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiRhyMigrationFeaturePage> continuation) {
        return ((RhyOnboardingLoadingDuxo$loadRhyMigration$2$page3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo = this.this$0;
        ResourceLink<EntryResource<RhyMigrationFeaturePage>> featurePage3 = this.$rhyMigration.getFeaturePage3();
        this.label = 1;
        Object objLoadRhyMigrationFeaturePage = rhyOnboardingLoadingDuxo.loadRhyMigrationFeaturePage(featurePage3, this);
        return objLoadRhyMigrationFeaturePage == coroutine_suspended ? coroutine_suspended : objLoadRhyMigrationFeaturePage;
    }
}
