package com.robinhood.staticcontent.store.productmarketing;

import android.text.Spanned;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.util.text.MessageFormatting;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingPictogram;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.staticcontent.util.Markwons;
import io.noties.markwon.Markwon;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RealProductMarketingContentFeatureStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0096@¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingContentFeatureStore;", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "disclosureStore", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Lcom/robinhood/staticcontent/store/ContentStore;Lcom/robinhood/contentful/StaticContentStore;Lio/noties/markwon/Markwon;)V", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "contentfulId", "", "formatArguments", "", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPictogram", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;", "iconKey", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RealProductMarketingContentFeatureStore implements ContentStore<ProductMarketingContent.Feature> {
    private final ContentStore<DisclosureContent> disclosureStore;
    private final Markwon markwon;
    private final StaticContentStore staticContentStore;

    /* compiled from: RealProductMarketingContentFeatureStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.staticcontent.store.productmarketing.RealProductMarketingContentFeatureStore", m3645f = "RealProductMarketingContentFeatureStore.kt", m3646l = {27, 32}, m3647m = AnalyticsStrings.NOTIF_STACK_EVENT_LOAD)
    /* renamed from: com.robinhood.staticcontent.store.productmarketing.RealProductMarketingContentFeatureStore$load$1 */
    static final class C412751 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C412751(Continuation<? super C412751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealProductMarketingContentFeatureStore.this.load(null, null, this);
        }
    }

    public RealProductMarketingContentFeatureStore(ContentStore<DisclosureContent> disclosureStore, StaticContentStore staticContentStore, Markwon markwon) {
        Intrinsics.checkNotNullParameter(disclosureStore, "disclosureStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.disclosureStore = disclosureStore;
        this.staticContentStore = staticContentStore;
        this.markwon = markwon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.CharSequence] */
    @Override // com.robinhood.staticcontent.store.ContentStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(String str, Map<String, ? extends Object> map, Continuation<? super ProductMarketingContent.Feature> continuation) {
        C412751 c412751;
        ProductMarketing.Feature feature;
        DisclosureContent disclosureContent;
        String str2;
        String str3;
        Spanned spanned;
        String str4;
        String str5;
        Spanned spanned2;
        if (continuation instanceof C412751) {
            c412751 = (C412751) continuation;
            int i = c412751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c412751.label = i - Integer.MIN_VALUE;
            } else {
                c412751 = new C412751(continuation);
            }
        }
        C412751 c4127512 = c412751;
        Object objLoadEntry$default = c4127512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4127512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadEntry$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            c4127512.L$0 = map;
            c4127512.label = 1;
            objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, str, null, c4127512, 2, null);
            if (objLoadEntry$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r13 = (CharSequence) c4127512.L$3;
            str4 = (String) c4127512.L$2;
            str5 = (String) c4127512.L$1;
            feature = (ProductMarketing.Feature) c4127512.L$0;
            ResultKt.throwOnFailure(objLoadEntry$default);
            spanned2 = r13;
            disclosureContent = (DisclosureContent) objLoadEntry$default;
            spanned = spanned2;
            str3 = str4;
            str2 = str5;
            return new ProductMarketingContent.Feature(str2, str3, spanned, disclosureContent, getPictogram(feature.getIconKey()));
        }
        map = (Map) c4127512.L$0;
        ResultKt.throwOnFailure(objLoadEntry$default);
        feature = (ProductMarketing.Feature) ((EntryResource) objLoadEntry$default).getValue();
        String identifier = feature.getIdentifier();
        String messageWith = MessageFormatting.formatMessageWith(feature.getTitle(), map);
        disclosureContent = null;
        Spanned spanned$default = Markwons.toSpanned$default(this.markwon, feature.getContent().formatWith(map), null, 2, null);
        ResourceLink<EntryResource<Disclosure>> disclosure = feature.getDisclosure();
        if (disclosure == null) {
            str2 = identifier;
            str3 = messageWith;
            spanned = spanned$default;
            return new ProductMarketingContent.Feature(str2, str3, spanned, disclosureContent, getPictogram(feature.getIconKey()));
        }
        ContentStore<DisclosureContent> contentStore = this.disclosureStore;
        String id = disclosure.getSys().getId();
        c4127512.L$0 = feature;
        c4127512.L$1 = identifier;
        c4127512.L$2 = messageWith;
        c4127512.L$3 = spanned$default;
        c4127512.label = 2;
        Object objLoad = contentStore.load(id, map, c4127512);
        if (objLoad != coroutine_suspended) {
            objLoadEntry$default = objLoad;
            str4 = messageWith;
            str5 = identifier;
            spanned2 = spanned$default;
            disclosureContent = (DisclosureContent) objLoadEntry$default;
            spanned = spanned2;
            str3 = str4;
            str2 = str5;
            return new ProductMarketingContent.Feature(str2, str3, spanned, disclosureContent, getPictogram(feature.getIconKey()));
        }
        return coroutine_suspended;
    }

    private final ProductMarketingPictogram getPictogram(String iconKey) {
        ProductMarketingPictogram.Remote remoteFromIconKey = ProductMarketingPictogram.Remote.INSTANCE.fromIconKey(iconKey);
        if (remoteFromIconKey != null) {
            return remoteFromIconKey;
        }
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(iconKey);
        if (serverToBentoAssetMapper3FromServerValue == null) {
            return null;
        }
        if (serverToBentoAssetMapper3FromServerValue == ServerToBentoAssetMapper3.UNKNOWN) {
            serverToBentoAssetMapper3FromServerValue = null;
        }
        if (serverToBentoAssetMapper3FromServerValue != null) {
            return new ProductMarketingPictogram.Pog(serverToBentoAssetMapper3FromServerValue.getResourceId());
        }
        return null;
    }
}
