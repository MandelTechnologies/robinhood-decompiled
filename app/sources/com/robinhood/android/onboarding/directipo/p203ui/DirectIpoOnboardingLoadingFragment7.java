package com.robinhood.android.onboarding.directipo.p203ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboardingStep;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.directipo.DirectIpoOnboardingStep;
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
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingStep;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$onStart$1$stepsDeferred$1$1", m3645f = "DirectIpoOnboardingLoadingFragment.kt", m3646l = {116, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$onStart$1$stepsDeferred$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class DirectIpoOnboardingLoadingFragment7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiDirectIpoOnboardingStep>, Object> {
    final /* synthetic */ ResourceLink<EntryResource<DirectIpoOnboardingStep>> $stepLink;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DirectIpoOnboardingLoadingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectIpoOnboardingLoadingFragment7(DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment, ResourceLink<EntryResource<DirectIpoOnboardingStep>> resourceLink, Continuation<? super DirectIpoOnboardingLoadingFragment7> continuation) {
        super(2, continuation);
        this.this$0 = directIpoOnboardingLoadingFragment;
        this.$stepLink = resourceLink;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DirectIpoOnboardingLoadingFragment7(this.this$0, this.$stepLink, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiDirectIpoOnboardingStep> continuation) {
        return ((DirectIpoOnboardingLoadingFragment7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        DirectIpoOnboardingLoadingFragment7 directIpoOnboardingLoadingFragment7;
        String str;
        String str2;
        MarkdownContent markdownContent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StaticContentStore staticContentStore = this.this$0.getStaticContentStore();
            ResourceLink<EntryResource<DirectIpoOnboardingStep>> resourceLink = this.$stepLink;
            this.label = 1;
            obj = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, this, 2, null);
            directIpoOnboardingLoadingFragment7 = this;
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            markdownContent = (MarkdownContent) this.L$2;
            str2 = (String) this.L$1;
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            return new UiDirectIpoOnboardingStep(str, str2, markdownContent, ((AssetResource) obj).getContent().getFile().getUrl());
        }
        ResultKt.throwOnFailure(obj);
        directIpoOnboardingLoadingFragment7 = this;
        DirectIpoOnboardingStep directIpoOnboardingStep = (DirectIpoOnboardingStep) ((EntryResource) obj).getValue();
        String identifier = directIpoOnboardingStep.getIdentifier();
        String title = directIpoOnboardingStep.getTitle();
        MarkdownContent descriptionMarkdown = directIpoOnboardingStep.getDescriptionMarkdown();
        StaticContentStore staticContentStore2 = directIpoOnboardingLoadingFragment7.this$0.getStaticContentStore();
        ResourceLink<AssetResource<?>> animation = directIpoOnboardingStep.getAnimation();
        directIpoOnboardingLoadingFragment7.L$0 = identifier;
        directIpoOnboardingLoadingFragment7.L$1 = title;
        directIpoOnboardingLoadingFragment7.L$2 = descriptionMarkdown;
        directIpoOnboardingLoadingFragment7.label = 2;
        obj = ContentRepository.DefaultImpls.load$default(staticContentStore2, animation, null, directIpoOnboardingLoadingFragment7, 2, null);
        if (obj != coroutine_suspended) {
            str = identifier;
            str2 = title;
            markdownContent = descriptionMarkdown;
            return new UiDirectIpoOnboardingStep(str, str2, markdownContent, ((AssetResource) obj).getContent().getFile().getUrl());
        }
        return coroutine_suspended;
    }
}
