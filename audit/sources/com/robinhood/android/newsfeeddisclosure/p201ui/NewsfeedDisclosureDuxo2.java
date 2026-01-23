package com.robinhood.android.newsfeeddisclosure.p201ui;

import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.models.p355ui.UiExpandableContentSection;
import com.robinhood.staticcontent.model.expandablecontent.ApiExpandableContentSection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: NewsfeedDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/UiExpandableContentSection;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureDuxo$retrieveDisclosureContent$1$itemList$1$1", m3645f = "NewsfeedDisclosureDuxo.kt", m3646l = {52, 55, 57}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureDuxo$retrieveDisclosureContent$1$itemList$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class NewsfeedDisclosureDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiExpandableContentSection>, Object> {
    final /* synthetic */ ResourceLink<EntryResource<ApiExpandableContentSection>> $itemLink;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ NewsfeedDisclosureDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsfeedDisclosureDuxo2(NewsfeedDisclosureDuxo newsfeedDisclosureDuxo, ResourceLink<EntryResource<ApiExpandableContentSection>> resourceLink, Continuation<? super NewsfeedDisclosureDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = newsfeedDisclosureDuxo;
        this.$itemLink = resourceLink;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewsfeedDisclosureDuxo2(this.this$0, this.$itemLink, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiExpandableContentSection> continuation) {
        return ((NewsfeedDisclosureDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r0 == r6) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objLoad$default;
        ApiExpandableContentSection apiExpandableContentSection;
        HttpUrl url;
        Object objLoad$default2;
        HttpUrl httpUrl;
        ResourceLink<AssetResource<?>> darkModeAsset;
        Object objLoad$default3;
        ApiExpandableContentSection apiExpandableContentSection2;
        HttpUrl httpUrl2;
        HttpUrl httpUrl3;
        HttpUrl url2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StaticContentStore staticContentStore = this.this$0.staticContentStore;
            ResourceLink<EntryResource<ApiExpandableContentSection>> resourceLink = this.$itemLink;
            this.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, this, 2, null);
            if (objLoad$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                HttpUrl httpUrl4 = (HttpUrl) this.L$1;
                apiExpandableContentSection2 = (ApiExpandableContentSection) this.L$0;
                ResultKt.throwOnFailure(obj);
                httpUrl = httpUrl4;
                objLoad$default3 = obj;
                url2 = ((AssetResource) objLoad$default3).getContent().getFile().getUrl();
                if (url2 != null) {
                    apiExpandableContentSection = apiExpandableContentSection2;
                    httpUrl3 = httpUrl;
                    httpUrl2 = httpUrl3;
                    apiExpandableContentSection2 = apiExpandableContentSection;
                    return new UiExpandableContentSection(new MarkdownContent(apiExpandableContentSection2.getHeader()), null, apiExpandableContentSection2.getBody(), httpUrl3, httpUrl2, apiExpandableContentSection2.getDisclosure(), this.$itemLink.getSys().getId(), 2, null);
                }
                httpUrl2 = url2;
                httpUrl3 = httpUrl;
                return new UiExpandableContentSection(new MarkdownContent(apiExpandableContentSection2.getHeader()), null, apiExpandableContentSection2.getBody(), httpUrl3, httpUrl2, apiExpandableContentSection2.getDisclosure(), this.$itemLink.getSys().getId(), 2, null);
            }
            ApiExpandableContentSection apiExpandableContentSection3 = (ApiExpandableContentSection) this.L$0;
            ResultKt.throwOnFailure(obj);
            apiExpandableContentSection = apiExpandableContentSection3;
            objLoad$default2 = obj;
            url = ((AssetResource) objLoad$default2).getContent().getFile().getUrl();
            httpUrl = url;
            darkModeAsset = apiExpandableContentSection.getDarkModeAsset();
            if (darkModeAsset != null) {
                StaticContentStore staticContentStore2 = this.this$0.staticContentStore;
                this.L$0 = apiExpandableContentSection;
                this.L$1 = httpUrl;
                this.label = 3;
                objLoad$default3 = ContentRepository.DefaultImpls.load$default(staticContentStore2, darkModeAsset, null, this, 2, null);
                if (objLoad$default3 != coroutine_suspended) {
                    apiExpandableContentSection2 = apiExpandableContentSection;
                    url2 = ((AssetResource) objLoad$default3).getContent().getFile().getUrl();
                    if (url2 != null) {
                    }
                }
                return coroutine_suspended;
            }
            httpUrl3 = httpUrl;
            httpUrl2 = httpUrl3;
            apiExpandableContentSection2 = apiExpandableContentSection;
            return new UiExpandableContentSection(new MarkdownContent(apiExpandableContentSection2.getHeader()), null, apiExpandableContentSection2.getBody(), httpUrl3, httpUrl2, apiExpandableContentSection2.getDisclosure(), this.$itemLink.getSys().getId(), 2, null);
        }
        ResultKt.throwOnFailure(obj);
        objLoad$default = obj;
        apiExpandableContentSection = (ApiExpandableContentSection) ((EntryResource) objLoad$default).getValue();
        ResourceLink<AssetResource<?>> lightModeAsset = apiExpandableContentSection.getLightModeAsset();
        if (lightModeAsset != null) {
            StaticContentStore staticContentStore3 = this.this$0.staticContentStore;
            this.L$0 = apiExpandableContentSection;
            this.label = 2;
            objLoad$default2 = ContentRepository.DefaultImpls.load$default(staticContentStore3, lightModeAsset, null, this, 2, null);
        } else {
            url = null;
            httpUrl = url;
            darkModeAsset = apiExpandableContentSection.getDarkModeAsset();
            if (darkModeAsset != null) {
            }
            httpUrl3 = httpUrl;
            httpUrl2 = httpUrl3;
            apiExpandableContentSection2 = apiExpandableContentSection;
            return new UiExpandableContentSection(new MarkdownContent(apiExpandableContentSection2.getHeader()), null, apiExpandableContentSection2.getBody(), httpUrl3, httpUrl2, apiExpandableContentSection2.getDisclosure(), this.$itemLink.getSys().getId(), 2, null);
        }
    }
}
