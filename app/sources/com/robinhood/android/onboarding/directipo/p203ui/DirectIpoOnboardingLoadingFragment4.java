package com.robinhood.android.onboarding.directipo.p203ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboardingLearnMoreAction;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.directipo.DirectIpoOnboardingLearnMoreAction;
import com.robinhood.staticcontent.model.directipo.MultipleDensityImageAsset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DirectIpoOnboardingLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingLearnMoreAction;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$onStart$1$actionsDeferred$1$1", m3645f = "DirectIpoOnboardingLoadingFragment.kt", m3646l = {131, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$onStart$1$actionsDeferred$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class DirectIpoOnboardingLoadingFragment4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiDirectIpoOnboardingLearnMoreAction>, Object> {
    final /* synthetic */ ResourceLink<EntryResource<DirectIpoOnboardingLearnMoreAction>> $actionLink;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DirectIpoOnboardingLoadingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectIpoOnboardingLoadingFragment4(DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment, ResourceLink<EntryResource<DirectIpoOnboardingLearnMoreAction>> resourceLink, Continuation<? super DirectIpoOnboardingLoadingFragment4> continuation) {
        super(2, continuation);
        this.this$0 = directIpoOnboardingLoadingFragment;
        this.$actionLink = resourceLink;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DirectIpoOnboardingLoadingFragment4(this.this$0, this.$actionLink, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiDirectIpoOnboardingLearnMoreAction> continuation) {
        return ((DirectIpoOnboardingLoadingFragment4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DirectIpoOnboardingLoadingFragment4 directIpoOnboardingLoadingFragment4;
        DirectIpoOnboardingLearnMoreAction directIpoOnboardingLearnMoreAction;
        DirectIpoOnboardingLearnMoreAction directIpoOnboardingLearnMoreAction2;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StaticContentStore staticContentStore = this.this$0.getStaticContentStore();
            ResourceLink<EntryResource<DirectIpoOnboardingLearnMoreAction>> resourceLink = this.$actionLink;
            this.label = 1;
            obj = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, this, 2, null);
            directIpoOnboardingLoadingFragment4 = this;
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) this.L$1;
                DirectIpoOnboardingLearnMoreAction directIpoOnboardingLearnMoreAction3 = (DirectIpoOnboardingLearnMoreAction) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str2;
                directIpoOnboardingLearnMoreAction2 = directIpoOnboardingLearnMoreAction3;
                return new UiDirectIpoOnboardingLearnMoreAction(str, ((AssetResource) obj).getContent().getFile().getUrl(), directIpoOnboardingLearnMoreAction2.getTitle(), directIpoOnboardingLearnMoreAction2.getDescription(), directIpoOnboardingLearnMoreAction2.getActionUrl());
            }
            directIpoOnboardingLearnMoreAction = (DirectIpoOnboardingLearnMoreAction) this.L$0;
            ResultKt.throwOnFailure(obj);
            directIpoOnboardingLoadingFragment4 = this;
            MultipleDensityImageAsset multipleDensityImageAsset = (MultipleDensityImageAsset) ((EntryResource) obj).getValue();
            String identifier = directIpoOnboardingLearnMoreAction.getIdentifier();
            StaticContentStore staticContentStore2 = directIpoOnboardingLoadingFragment4.this$0.getStaticContentStore();
            ResourceLink<AssetResource<?>> image = directIpoOnboardingLoadingFragment4.this$0.getImage(multipleDensityImageAsset);
            directIpoOnboardingLoadingFragment4.L$0 = directIpoOnboardingLearnMoreAction;
            directIpoOnboardingLoadingFragment4.L$1 = identifier;
            directIpoOnboardingLoadingFragment4.label = 3;
            obj = ContentRepository.DefaultImpls.load$default(staticContentStore2, image, null, directIpoOnboardingLoadingFragment4, 2, null);
            if (obj != coroutine_suspended) {
                directIpoOnboardingLearnMoreAction2 = directIpoOnboardingLearnMoreAction;
                str = identifier;
                return new UiDirectIpoOnboardingLearnMoreAction(str, ((AssetResource) obj).getContent().getFile().getUrl(), directIpoOnboardingLearnMoreAction2.getTitle(), directIpoOnboardingLearnMoreAction2.getDescription(), directIpoOnboardingLearnMoreAction2.getActionUrl());
            }
            return coroutine_suspended;
        }
        ResultKt.throwOnFailure(obj);
        directIpoOnboardingLoadingFragment4 = this;
        DirectIpoOnboardingLearnMoreAction directIpoOnboardingLearnMoreAction4 = (DirectIpoOnboardingLearnMoreAction) ((EntryResource) obj).getValue();
        StaticContentStore staticContentStore3 = directIpoOnboardingLoadingFragment4.this$0.getStaticContentStore();
        ResourceLink<EntryResource<MultipleDensityImageAsset>> icon = directIpoOnboardingLearnMoreAction4.getIcon();
        directIpoOnboardingLoadingFragment4.L$0 = directIpoOnboardingLearnMoreAction4;
        directIpoOnboardingLoadingFragment4.label = 2;
        Object objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore3, icon, null, directIpoOnboardingLoadingFragment4, 2, null);
        if (objLoad$default != coroutine_suspended) {
            directIpoOnboardingLearnMoreAction = directIpoOnboardingLearnMoreAction4;
            obj = objLoad$default;
            MultipleDensityImageAsset multipleDensityImageAsset2 = (MultipleDensityImageAsset) ((EntryResource) obj).getValue();
            String identifier2 = directIpoOnboardingLearnMoreAction.getIdentifier();
            StaticContentStore staticContentStore22 = directIpoOnboardingLoadingFragment4.this$0.getStaticContentStore();
            ResourceLink<AssetResource<?>> image2 = directIpoOnboardingLoadingFragment4.this$0.getImage(multipleDensityImageAsset2);
            directIpoOnboardingLoadingFragment4.L$0 = directIpoOnboardingLearnMoreAction;
            directIpoOnboardingLoadingFragment4.L$1 = identifier2;
            directIpoOnboardingLoadingFragment4.label = 3;
            obj = ContentRepository.DefaultImpls.load$default(staticContentStore22, image2, null, directIpoOnboardingLoadingFragment4, 2, null);
            if (obj != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
