package com.robinhood.android.onboarding.directipo.p203ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.directipo.DirectIpoOnboarding;
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
import okhttp3.HttpUrl;

/* compiled from: DirectIpoOnboardingLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lokhttp3/HttpUrl;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$onStart$1$introImageUrl$1", m3645f = "DirectIpoOnboardingLoadingFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 147}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$onStart$1$introImageUrl$1, reason: use source file name */
/* loaded from: classes10.dex */
final class DirectIpoOnboardingLoadingFragment5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super HttpUrl>, Object> {
    final /* synthetic */ DirectIpoOnboarding $onboarding;
    int label;
    final /* synthetic */ DirectIpoOnboardingLoadingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectIpoOnboardingLoadingFragment5(DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment, DirectIpoOnboarding directIpoOnboarding, Continuation<? super DirectIpoOnboardingLoadingFragment5> continuation) {
        super(2, continuation);
        this.this$0 = directIpoOnboardingLoadingFragment;
        this.$onboarding = directIpoOnboarding;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DirectIpoOnboardingLoadingFragment5(this.this$0, this.$onboarding, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpUrl> continuation) {
        return ((DirectIpoOnboardingLoadingFragment5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r11 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DirectIpoOnboardingLoadingFragment5 directIpoOnboardingLoadingFragment5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StaticContentStore staticContentStore = this.this$0.getStaticContentStore();
            ResourceLink<EntryResource<MultipleDensityImageAsset>> mobileIntroImageAsset = this.$onboarding.getMobileIntroImageAsset();
            this.label = 1;
            obj = ContentRepository.DefaultImpls.load$default(staticContentStore, mobileIntroImageAsset, null, this, 2, null);
            directIpoOnboardingLoadingFragment5 = this;
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((AssetResource) obj).getContent().getFile().getUrl();
        }
        ResultKt.throwOnFailure(obj);
        directIpoOnboardingLoadingFragment5 = this;
        MultipleDensityImageAsset multipleDensityImageAsset = (MultipleDensityImageAsset) ((EntryResource) obj).getValue();
        StaticContentStore staticContentStore2 = directIpoOnboardingLoadingFragment5.this$0.getStaticContentStore();
        ResourceLink<AssetResource<?>> image = directIpoOnboardingLoadingFragment5.this$0.getImage(multipleDensityImageAsset);
        directIpoOnboardingLoadingFragment5.label = 2;
        obj = ContentRepository.DefaultImpls.load$default(staticContentStore2, image, null, directIpoOnboardingLoadingFragment5, 2, null);
    }
}
