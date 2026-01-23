package com.robinhood.android.rhymigration.p245ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCardPage;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationCardPage;
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
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$loadRhyMigration$2$cardPage$1", m3645f = "RhyOnboardingLoadingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RhyOnboardingLoadingDuxo$loadRhyMigration$2$cardPage$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiRhyMigrationCardPage>, Object> {
    final /* synthetic */ ResourceLink<EntryResource<RhyMigrationCardPage>> $cardPageResource;
    int label;
    final /* synthetic */ RhyOnboardingLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyOnboardingLoadingDuxo$loadRhyMigration$2$cardPage$1(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, ResourceLink<EntryResource<RhyMigrationCardPage>> resourceLink, Continuation<? super RhyOnboardingLoadingDuxo$loadRhyMigration$2$cardPage$1> continuation) {
        super(2, continuation);
        this.this$0 = rhyOnboardingLoadingDuxo;
        this.$cardPageResource = resourceLink;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhyOnboardingLoadingDuxo$loadRhyMigration$2$cardPage$1(this.this$0, this.$cardPageResource, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiRhyMigrationCardPage> continuation) {
        return ((RhyOnboardingLoadingDuxo$loadRhyMigration$2$cardPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ResourceLink<EntryResource<RhyMigrationCardPage>> resourceLink = this.$cardPageResource;
        this.label = 1;
        Object objLoadRhyMigrationCardPage = rhyOnboardingLoadingDuxo.loadRhyMigrationCardPage(resourceLink, this);
        return objLoadRhyMigrationCardPage == coroutine_suspended ? coroutine_suspended : objLoadRhyMigrationCardPage;
    }
}
